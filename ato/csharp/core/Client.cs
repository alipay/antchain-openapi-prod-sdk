// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ATO.Models;

namespace AntChain.SDK.ATO
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
                        {"sdk_version", "1.7.14"},
                        {"_prod_code", "ATO"},
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
                        {"sdk_version", "1.7.14"},
                        {"_prod_code", "ATO"},
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
         * Description: 分账流水同步
         * Summary: 【仅测试环境生效】分账流水同步
         */
        public SyncFundSplittingResponse SyncFundSplitting(SyncFundSplittingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundSplittingEx(request, headers, runtime);
        }

        /**
         * Description: 分账流水同步
         * Summary: 【仅测试环境生效】分账流水同步
         */
        public async Task<SyncFundSplittingResponse> SyncFundSplittingAsync(SyncFundSplittingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundSplittingExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账流水同步
         * Summary: 【仅测试环境生效】分账流水同步
         */
        public SyncFundSplittingResponse SyncFundSplittingEx(SyncFundSplittingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundSplittingResponse>(DoRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账流水同步
         * Summary: 【仅测试环境生效】分账流水同步
         */
        public async Task<SyncFundSplittingResponse> SyncFundSplittingExAsync(SyncFundSplittingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundSplittingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 【废弃】订单融资结果同步
         */
        public SyncFundOrderfinancialResponse SyncFundOrderfinancial(SyncFundOrderfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundOrderfinancialEx(request, headers, runtime);
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 【废弃】订单融资结果同步
         */
        public async Task<SyncFundOrderfinancialResponse> SyncFundOrderfinancialAsync(SyncFundOrderfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundOrderfinancialExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 【废弃】订单融资结果同步
         */
        public SyncFundOrderfinancialResponse SyncFundOrderfinancialEx(SyncFundOrderfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundOrderfinancialResponse>(DoRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 【废弃】订单融资结果同步
         */
        public async Task<SyncFundOrderfinancialResponse> SyncFundOrderfinancialExAsync(SyncFundOrderfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundOrderfinancialResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
         */
        public SyncFundWithholdingcontractResponse SyncFundWithholdingcontract(SyncFundWithholdingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundWithholdingcontractEx(request, headers, runtime);
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
         */
        public async Task<SyncFundWithholdingcontractResponse> SyncFundWithholdingcontractAsync(SyncFundWithholdingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundWithholdingcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
         */
        public SyncFundWithholdingcontractResponse SyncFundWithholdingcontractEx(SyncFundWithholdingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundWithholdingcontractResponse>(DoRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
         */
        public async Task<SyncFundWithholdingcontractResponse> SyncFundWithholdingcontractExAsync(SyncFundWithholdingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundWithholdingcontractResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 【仅测试环境生效】同步订单还款履约信息
         */
        public SyncFundOrderfulfillmentResponse SyncFundOrderfulfillment(SyncFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundOrderfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 【仅测试环境生效】同步订单还款履约信息
         */
        public async Task<SyncFundOrderfulfillmentResponse> SyncFundOrderfulfillmentAsync(SyncFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundOrderfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 【仅测试环境生效】同步订单还款履约信息
         */
        public SyncFundOrderfulfillmentResponse SyncFundOrderfulfillmentEx(SyncFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundOrderfulfillmentResponse>(DoRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 【仅测试环境生效】同步订单还款履约信息
         */
        public async Task<SyncFundOrderfulfillmentResponse> SyncFundOrderfulfillmentExAsync(SyncFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundOrderfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 【仅测试环境生效】获取订单的履约信息
         */
        public GetFundOrderfulfillmentResponse GetFundOrderfulfillment(GetFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundOrderfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 【仅测试环境生效】获取订单的履约信息
         */
        public async Task<GetFundOrderfulfillmentResponse> GetFundOrderfulfillmentAsync(GetFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundOrderfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 【仅测试环境生效】获取订单的履约信息
         */
        public GetFundOrderfulfillmentResponse GetFundOrderfulfillmentEx(GetFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfulfillmentResponse>(DoRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 【仅测试环境生效】获取订单的履约信息
         */
        public async Task<GetFundOrderfulfillmentResponse> GetFundOrderfulfillmentExAsync(GetFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public UploadFundFlowResponse UploadFundFlow(UploadFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public async Task<UploadFundFlowResponse> UploadFundFlowAsync(UploadFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public UploadFundFlowResponse UploadFundFlowEx(UploadFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.fund.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadFundFlowResponse uploadFundFlowResponse = new UploadFundFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadFundFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public async Task<UploadFundFlowResponse> UploadFundFlowExAsync(UploadFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.fund.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadFundFlowResponse uploadFundFlowResponse = new UploadFundFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadFundFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public GetFundFlowResponse GetFundFlow(GetFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public async Task<GetFundFlowResponse> GetFundFlowAsync(GetFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public GetFundFlowResponse GetFundFlowEx(GetFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public async Task<GetFundFlowResponse> GetFundFlowExAsync(GetFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public RefuseFundFlowResponse RefuseFundFlow(RefuseFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public async Task<RefuseFundFlowResponse> RefuseFundFlowAsync(RefuseFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public RefuseFundFlowResponse RefuseFundFlowEx(RefuseFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public async Task<RefuseFundFlowResponse> RefuseFundFlowExAsync(RefuseFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public AuthFundFlowResponse AuthFundFlow(AuthFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public async Task<AuthFundFlowResponse> AuthFundFlowAsync(AuthFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public AuthFundFlowResponse AuthFundFlowEx(AuthFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public async Task<AuthFundFlowResponse> AuthFundFlowExAsync(AuthFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public CancelFundPlanResponse CancelFundPlan(CancelFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelFundPlanEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public async Task<CancelFundPlanResponse> CancelFundPlanAsync(CancelFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelFundPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public CancelFundPlanResponse CancelFundPlanEx(CancelFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFundPlanResponse>(DoRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public async Task<CancelFundPlanResponse> CancelFundPlanExAsync(CancelFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFundPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public CallbackFundNotifyResponse CallbackFundNotify(CallbackFundNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackFundNotifyEx(request, headers, runtime);
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public async Task<CallbackFundNotifyResponse> CallbackFundNotifyAsync(CallbackFundNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackFundNotifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public CallbackFundNotifyResponse CallbackFundNotifyEx(CallbackFundNotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackFundNotifyResponse>(DoRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public async Task<CallbackFundNotifyResponse> CallbackFundNotifyExAsync(CallbackFundNotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackFundNotifyResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public SyncFundMerchantpromiseResponse SyncFundMerchantpromise(SyncFundMerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundMerchantpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public async Task<SyncFundMerchantpromiseResponse> SyncFundMerchantpromiseAsync(SyncFundMerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundMerchantpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public SyncFundMerchantpromiseResponse SyncFundMerchantpromiseEx(SyncFundMerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundMerchantpromiseResponse>(DoRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public async Task<SyncFundMerchantpromiseResponse> SyncFundMerchantpromiseExAsync(SyncFundMerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundMerchantpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public SyncFundFinanceloanresultsResponse SyncFundFinanceloanresults(SyncFundFinanceloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundFinanceloanresultsEx(request, headers, runtime);
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public async Task<SyncFundFinanceloanresultsResponse> SyncFundFinanceloanresultsAsync(SyncFundFinanceloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundFinanceloanresultsExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public SyncFundFinanceloanresultsResponse SyncFundFinanceloanresultsEx(SyncFundFinanceloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFinanceloanresultsResponse>(DoRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public async Task<SyncFundFinanceloanresultsResponse> SyncFundFinanceloanresultsExAsync(SyncFundFinanceloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFinanceloanresultsResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public GetFundUserpromiseResponse GetFundUserpromise(GetFundUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public async Task<GetFundUserpromiseResponse> GetFundUserpromiseAsync(GetFundUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public GetFundUserpromiseResponse GetFundUserpromiseEx(GetFundUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundUserpromiseResponse>(DoRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public async Task<GetFundUserpromiseResponse> GetFundUserpromiseExAsync(GetFundUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public GetFundUserperformanceResponse GetFundUserperformance(GetFundUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundUserperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetFundUserperformanceResponse> GetFundUserperformanceAsync(GetFundUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundUserperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public GetFundUserperformanceResponse GetFundUserperformanceEx(GetFundUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundUserperformanceResponse>(DoRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetFundUserperformanceResponse> GetFundUserperformanceExAsync(GetFundUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundUserperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetFundMerchantperformanceResponse GetFundMerchantperformance(GetFundMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundMerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetFundMerchantperformanceResponse> GetFundMerchantperformanceAsync(GetFundMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundMerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetFundMerchantperformanceResponse GetFundMerchantperformanceEx(GetFundMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundMerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetFundMerchantperformanceResponse> GetFundMerchantperformanceExAsync(GetFundMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundMerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public GetFundOrderfullinfoResponse GetFundOrderfullinfo(GetFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public async Task<GetFundOrderfullinfoResponse> GetFundOrderfullinfoAsync(GetFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public GetFundOrderfullinfoResponse GetFundOrderfullinfoEx(GetFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public async Task<GetFundOrderfullinfoResponse> GetFundOrderfullinfoExAsync(GetFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public CreateRealpersonFacevrfResponse CreateRealpersonFacevrf(CreateRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRealpersonFacevrfEx(request, headers, runtime);
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public async Task<CreateRealpersonFacevrfResponse> CreateRealpersonFacevrfAsync(CreateRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRealpersonFacevrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public CreateRealpersonFacevrfResponse CreateRealpersonFacevrfEx(CreateRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealpersonFacevrfResponse>(DoRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public async Task<CreateRealpersonFacevrfResponse> CreateRealpersonFacevrfExAsync(CreateRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealpersonFacevrfResponse>(await DoRequestAsync("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public QueryRealpersonFacevrfResponse QueryRealpersonFacevrf(QueryRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRealpersonFacevrfEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public async Task<QueryRealpersonFacevrfResponse> QueryRealpersonFacevrfAsync(QueryRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRealpersonFacevrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public QueryRealpersonFacevrfResponse QueryRealpersonFacevrfEx(QueryRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRealpersonFacevrfResponse>(DoRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public async Task<QueryRealpersonFacevrfResponse> QueryRealpersonFacevrfExAsync(QueryRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRealpersonFacevrfResponse>(await DoRequestAsync("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public AllSignTemplateResponse AllSignTemplate(AllSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllSignTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public async Task<AllSignTemplateResponse> AllSignTemplateAsync(AllSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllSignTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public AllSignTemplateResponse AllSignTemplateEx(AllSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSignTemplateResponse>(DoRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public async Task<AllSignTemplateResponse> AllSignTemplateExAsync(AllSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSignTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public SubmitSignFlowResponse SubmitSignFlow(SubmitSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public async Task<SubmitSignFlowResponse> SubmitSignFlowAsync(SubmitSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public SubmitSignFlowResponse SubmitSignFlowEx(SubmitSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public async Task<SubmitSignFlowResponse> SubmitSignFlowExAsync(SubmitSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public GetSignFlowResponse GetSignFlow(GetSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public async Task<GetSignFlowResponse> GetSignFlowAsync(GetSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public GetSignFlowResponse GetSignFlowEx(GetSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public async Task<GetSignFlowResponse> GetSignFlowExAsync(GetSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public AuthSignFlowResponse AuthSignFlow(AuthSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public async Task<AuthSignFlowResponse> AuthSignFlowAsync(AuthSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public AuthSignFlowResponse AuthSignFlowEx(AuthSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public async Task<AuthSignFlowResponse> AuthSignFlowExAsync(AuthSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public SubmitFrontSignResponse SubmitFrontSign(SubmitFrontSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitFrontSignEx(request, headers, runtime);
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public async Task<SubmitFrontSignResponse> SubmitFrontSignAsync(SubmitFrontSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitFrontSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public SubmitFrontSignResponse SubmitFrontSignEx(SubmitFrontSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitFrontSignResponse>(DoRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public async Task<SubmitFrontSignResponse> SubmitFrontSignExAsync(SubmitFrontSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitFrontSignResponse>(await DoRequestAsync("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public UploadSignFlowResponse UploadSignFlow(UploadSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public async Task<UploadSignFlowResponse> UploadSignFlowAsync(UploadSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public UploadSignFlowResponse UploadSignFlowEx(UploadSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSignFlowResponse uploadSignFlowResponse = new UploadSignFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSignFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public async Task<UploadSignFlowResponse> UploadSignFlowExAsync(UploadSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSignFlowResponse uploadSignFlowResponse = new UploadSignFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSignFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public SyncTradeResponse SyncTrade(SyncTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeEx(request, headers, runtime);
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public async Task<SyncTradeResponse> SyncTradeAsync(SyncTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public SyncTradeResponse SyncTradeEx(SyncTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeResponse>(DoRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public async Task<SyncTradeResponse> SyncTradeExAsync(SyncTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public GetTradeResponse GetTrade(GetTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeEx(request, headers, runtime);
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public async Task<GetTradeResponse> GetTradeAsync(GetTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public GetTradeResponse GetTradeEx(GetTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeResponse>(DoRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public async Task<GetTradeResponse> GetTradeExAsync(GetTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public SyncFrontTradeResponse SyncFrontTrade(SyncFrontTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFrontTradeEx(request, headers, runtime);
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public async Task<SyncFrontTradeResponse> SyncFrontTradeAsync(SyncFrontTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFrontTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public SyncFrontTradeResponse SyncFrontTradeEx(SyncFrontTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFrontTradeResponse>(DoRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public async Task<SyncFrontTradeResponse> SyncFrontTradeExAsync(SyncFrontTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFrontTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public SyncTradeFinanceloanapplyResponse SyncTradeFinanceloanapply(SyncTradeFinanceloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeFinanceloanapplyEx(request, headers, runtime);
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public async Task<SyncTradeFinanceloanapplyResponse> SyncTradeFinanceloanapplyAsync(SyncTradeFinanceloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeFinanceloanapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public SyncTradeFinanceloanapplyResponse SyncTradeFinanceloanapplyEx(SyncTradeFinanceloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeFinanceloanapplyResponse>(DoRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public async Task<SyncTradeFinanceloanapplyResponse> SyncTradeFinanceloanapplyExAsync(SyncTradeFinanceloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeFinanceloanapplyResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public GetTradeMerchantfulfillmentResponse GetTradeMerchantfulfillment(GetTradeMerchantfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeMerchantfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public async Task<GetTradeMerchantfulfillmentResponse> GetTradeMerchantfulfillmentAsync(GetTradeMerchantfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeMerchantfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public GetTradeMerchantfulfillmentResponse GetTradeMerchantfulfillmentEx(GetTradeMerchantfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeMerchantfulfillmentResponse>(DoRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public async Task<GetTradeMerchantfulfillmentResponse> GetTradeMerchantfulfillmentExAsync(GetTradeMerchantfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeMerchantfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public GetTradeUserperformanceResponse GetTradeUserperformance(GetTradeUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeUserperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public async Task<GetTradeUserperformanceResponse> GetTradeUserperformanceAsync(GetTradeUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeUserperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public GetTradeUserperformanceResponse GetTradeUserperformanceEx(GetTradeUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeUserperformanceResponse>(DoRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public async Task<GetTradeUserperformanceResponse> GetTradeUserperformanceExAsync(GetTradeUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeUserperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetTradeMerchantperformanceResponse GetTradeMerchantperformance(GetTradeMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeMerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetTradeMerchantperformanceResponse> GetTradeMerchantperformanceAsync(GetTradeMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeMerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetTradeMerchantperformanceResponse GetTradeMerchantperformanceEx(GetTradeMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeMerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetTradeMerchantperformanceResponse> GetTradeMerchantperformanceExAsync(GetTradeMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeMerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public CreateWithholdSignResponse CreateWithholdSign(CreateWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public async Task<CreateWithholdSignResponse> CreateWithholdSignAsync(CreateWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public CreateWithholdSignResponse CreateWithholdSignEx(CreateWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public async Task<CreateWithholdSignResponse> CreateWithholdSignExAsync(CreateWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryWithholdSignResponse QueryWithholdSign(QueryWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryWithholdSignResponse> QueryWithholdSignAsync(QueryWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryWithholdSignResponse QueryWithholdSignEx(QueryWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryWithholdSignResponse> QueryWithholdSignExAsync(QueryWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public UnbindWithholdSignResponse UnbindWithholdSign(UnbindWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public async Task<UnbindWithholdSignResponse> UnbindWithholdSignAsync(UnbindWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public UnbindWithholdSignResponse UnbindWithholdSignEx(UnbindWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public async Task<UnbindWithholdSignResponse> UnbindWithholdSignExAsync(UnbindWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public CancelWithholdPlanResponse CancelWithholdPlan(CancelWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public async Task<CancelWithholdPlanResponse> CancelWithholdPlanAsync(CancelWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public CancelWithholdPlanResponse CancelWithholdPlanEx(CancelWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public async Task<CancelWithholdPlanResponse> CancelWithholdPlanExAsync(CancelWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public RepayWithholdPlanResponse RepayWithholdPlan(RepayWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public async Task<RepayWithholdPlanResponse> RepayWithholdPlanAsync(RepayWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public RepayWithholdPlanResponse RepayWithholdPlanEx(RepayWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public async Task<RepayWithholdPlanResponse> RepayWithholdPlanExAsync(RepayWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public RetryWithholdPlanResponse RetryWithholdPlan(RetryWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public async Task<RetryWithholdPlanResponse> RetryWithholdPlanAsync(RetryWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public RetryWithholdPlanResponse RetryWithholdPlanEx(RetryWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public async Task<RetryWithholdPlanResponse> RetryWithholdPlanExAsync(RetryWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public ConfirmWithholdSignasyncunsignResponse ConfirmWithholdSignasyncunsign(ConfirmWithholdSignasyncunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmWithholdSignasyncunsignEx(request, headers, runtime);
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public async Task<ConfirmWithholdSignasyncunsignResponse> ConfirmWithholdSignasyncunsignAsync(ConfirmWithholdSignasyncunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmWithholdSignasyncunsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public ConfirmWithholdSignasyncunsignResponse ConfirmWithholdSignasyncunsignEx(ConfirmWithholdSignasyncunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmWithholdSignasyncunsignResponse>(DoRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public async Task<ConfirmWithholdSignasyncunsignResponse> ConfirmWithholdSignasyncunsignExAsync(ConfirmWithholdSignasyncunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmWithholdSignasyncunsignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public CreateWithholdActivepayResponse CreateWithholdActivepay(CreateWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public async Task<CreateWithholdActivepayResponse> CreateWithholdActivepayAsync(CreateWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public CreateWithholdActivepayResponse CreateWithholdActivepayEx(CreateWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public async Task<CreateWithholdActivepayResponse> CreateWithholdActivepayExAsync(CreateWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public QueryWithholdActivepayResponse QueryWithholdActivepay(QueryWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public async Task<QueryWithholdActivepayResponse> QueryWithholdActivepayAsync(QueryWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public QueryWithholdActivepayResponse QueryWithholdActivepayEx(QueryWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public async Task<QueryWithholdActivepayResponse> QueryWithholdActivepayExAsync(QueryWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public CancelWithholdActivepayResponse CancelWithholdActivepay(CancelWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public async Task<CancelWithholdActivepayResponse> CancelWithholdActivepayAsync(CancelWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public CancelWithholdActivepayResponse CancelWithholdActivepayEx(CancelWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public async Task<CancelWithholdActivepayResponse> CancelWithholdActivepayExAsync(CancelWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public CreateWithholdRefundResponse CreateWithholdRefund(CreateWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdRefundEx(request, headers, runtime);
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public async Task<CreateWithholdRefundResponse> CreateWithholdRefundAsync(CreateWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public CreateWithholdRefundResponse CreateWithholdRefundEx(CreateWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdRefundResponse>(DoRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public async Task<CreateWithholdRefundResponse> CreateWithholdRefundExAsync(CreateWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdRefundResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public QueryWithholdRefundResponse QueryWithholdRefund(QueryWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdRefundEx(request, headers, runtime);
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public async Task<QueryWithholdRefundResponse> QueryWithholdRefundAsync(QueryWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public QueryWithholdRefundResponse QueryWithholdRefundEx(QueryWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdRefundResponse>(DoRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public async Task<QueryWithholdRefundResponse> QueryWithholdRefundExAsync(QueryWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdRefundResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
