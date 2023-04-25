// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.PARTNER.Models;

namespace AntChain.SDK.PARTNER
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
                        {"sdk_version", "1.0.20"},
                        {"_prod_code", "PARTNER"},
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
                        {"sdk_version", "1.0.20"},
                        {"_prod_code", "PARTNER"},
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
         * Description: 获取合作伙伴销售商品对应的政策ID
         * Summary: 获取合作伙伴销售商品对应的政策ID
         */
        public QueryEcoCommodityResponse QueryEcoCommodity(QueryEcoCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEcoCommodityEx(request, headers, runtime);
        }

        /**
         * Description: 获取合作伙伴销售商品对应的政策ID
         * Summary: 获取合作伙伴销售商品对应的政策ID
         */
        public async Task<QueryEcoCommodityResponse> QueryEcoCommodityAsync(QueryEcoCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEcoCommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取合作伙伴销售商品对应的政策ID
         * Summary: 获取合作伙伴销售商品对应的政策ID
         */
        public QueryEcoCommodityResponse QueryEcoCommodityEx(QueryEcoCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcoCommodityResponse>(DoRequest("1.0", "antcloud.partner.eco.commodity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合作伙伴销售商品对应的政策ID
         * Summary: 获取合作伙伴销售商品对应的政策ID
         */
        public async Task<QueryEcoCommodityResponse> QueryEcoCommodityExAsync(QueryEcoCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcoCommodityResponse>(await DoRequestAsync("1.0", "antcloud.partner.eco.commodity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请
         * Summary: 合作方（伙伴、商家等）入驻申请
         */
        public ApplyPartnerSettleinResponse ApplyPartnerSettlein(ApplyPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPartnerSettleinEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请
         * Summary: 合作方（伙伴、商家等）入驻申请
         */
        public async Task<ApplyPartnerSettleinResponse> ApplyPartnerSettleinAsync(ApplyPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPartnerSettleinExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请
         * Summary: 合作方（伙伴、商家等）入驻申请
         */
        public ApplyPartnerSettleinResponse ApplyPartnerSettleinEx(ApplyPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPartnerSettleinResponse>(DoRequest("1.0", "antcloud.partner.partner.settlein.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请
         * Summary: 合作方（伙伴、商家等）入驻申请
         */
        public async Task<ApplyPartnerSettleinResponse> ApplyPartnerSettleinExAsync(ApplyPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPartnerSettleinResponse>(await DoRequestAsync("1.0", "antcloud.partner.partner.settlein.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻撤销
         * Summary: 合作方（伙伴、商家等）入驻撤销
         */
        public CancelPartnerSettleinResponse CancelPartnerSettlein(CancelPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelPartnerSettleinEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻撤销
         * Summary: 合作方（伙伴、商家等）入驻撤销
         */
        public async Task<CancelPartnerSettleinResponse> CancelPartnerSettleinAsync(CancelPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelPartnerSettleinExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻撤销
         * Summary: 合作方（伙伴、商家等）入驻撤销
         */
        public CancelPartnerSettleinResponse CancelPartnerSettleinEx(CancelPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPartnerSettleinResponse>(DoRequest("1.0", "antcloud.partner.partner.settlein.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻撤销
         * Summary: 合作方（伙伴、商家等）入驻撤销
         */
        public async Task<CancelPartnerSettleinResponse> CancelPartnerSettleinExAsync(CancelPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPartnerSettleinResponse>(await DoRequestAsync("1.0", "antcloud.partner.partner.settlein.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请结果查询
         * Summary: 合作方（伙伴、商家等）入驻申请结果查询
         */
        public QueryPartnerSettleinResponse QueryPartnerSettlein(QueryPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPartnerSettleinEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请结果查询
         * Summary: 合作方（伙伴、商家等）入驻申请结果查询
         */
        public async Task<QueryPartnerSettleinResponse> QueryPartnerSettleinAsync(QueryPartnerSettleinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPartnerSettleinExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请结果查询
         * Summary: 合作方（伙伴、商家等）入驻申请结果查询
         */
        public QueryPartnerSettleinResponse QueryPartnerSettleinEx(QueryPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnerSettleinResponse>(DoRequest("1.0", "antcloud.partner.partner.settlein.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻申请结果查询
         * Summary: 合作方（伙伴、商家等）入驻申请结果查询
         */
        public async Task<QueryPartnerSettleinResponse> QueryPartnerSettleinExAsync(QueryPartnerSettleinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnerSettleinResponse>(await DoRequestAsync("1.0", "antcloud.partner.partner.settlein.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻标准合同查询
         * Summary: 合作方（伙伴、商家等）入驻标准合同查询
         */
        public QuerySettleinContractResponse QuerySettleinContract(QuerySettleinContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySettleinContractEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻标准合同查询
         * Summary: 合作方（伙伴、商家等）入驻标准合同查询
         */
        public async Task<QuerySettleinContractResponse> QuerySettleinContractAsync(QuerySettleinContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySettleinContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻标准合同查询
         * Summary: 合作方（伙伴、商家等）入驻标准合同查询
         */
        public QuerySettleinContractResponse QuerySettleinContractEx(QuerySettleinContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySettleinContractResponse>(DoRequest("1.0", "antcloud.partner.settlein.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻标准合同查询
         * Summary: 合作方（伙伴、商家等）入驻标准合同查询
         */
        public async Task<QuerySettleinContractResponse> QuerySettleinContractExAsync(QuerySettleinContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySettleinContractResponse>(await DoRequestAsync("1.0", "antcloud.partner.settlein.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目创建接口
         * Summary: 合作方（伙伴、商家等）支出项目创建接口
         */
        public CreateExpenditureProjectResponse CreateExpenditureProject(CreateExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateExpenditureProjectEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目创建接口
         * Summary: 合作方（伙伴、商家等）支出项目创建接口
         */
        public async Task<CreateExpenditureProjectResponse> CreateExpenditureProjectAsync(CreateExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateExpenditureProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目创建接口
         * Summary: 合作方（伙伴、商家等）支出项目创建接口
         */
        public CreateExpenditureProjectResponse CreateExpenditureProjectEx(CreateExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExpenditureProjectResponse>(DoRequest("1.0", "antcloud.partner.expenditure.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目创建接口
         * Summary: 合作方（伙伴、商家等）支出项目创建接口
         */
        public async Task<CreateExpenditureProjectResponse> CreateExpenditureProjectExAsync(CreateExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExpenditureProjectResponse>(await DoRequestAsync("1.0", "antcloud.partner.expenditure.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目查询接口
         * Summary: 合作方（伙伴、商家等）支出项目查询接口
         */
        public QueryExpenditureProjectResponse QueryExpenditureProject(QueryExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryExpenditureProjectEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目查询接口
         * Summary: 合作方（伙伴、商家等）支出项目查询接口
         */
        public async Task<QueryExpenditureProjectResponse> QueryExpenditureProjectAsync(QueryExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryExpenditureProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目查询接口
         * Summary: 合作方（伙伴、商家等）支出项目查询接口
         */
        public QueryExpenditureProjectResponse QueryExpenditureProjectEx(QueryExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryExpenditureProjectResponse>(DoRequest("1.0", "antcloud.partner.expenditure.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目查询接口
         * Summary: 合作方（伙伴、商家等）支出项目查询接口
         */
        public async Task<QueryExpenditureProjectResponse> QueryExpenditureProjectExAsync(QueryExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryExpenditureProjectResponse>(await DoRequestAsync("1.0", "antcloud.partner.expenditure.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目撤销接口
         * Summary: 合作方（伙伴、商家等）支出项目撤销接口
         */
        public CancelExpenditureProjectResponse CancelExpenditureProject(CancelExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelExpenditureProjectEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目撤销接口
         * Summary: 合作方（伙伴、商家等）支出项目撤销接口
         */
        public async Task<CancelExpenditureProjectResponse> CancelExpenditureProjectAsync(CancelExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelExpenditureProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目撤销接口
         * Summary: 合作方（伙伴、商家等）支出项目撤销接口
         */
        public CancelExpenditureProjectResponse CancelExpenditureProjectEx(CancelExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelExpenditureProjectResponse>(DoRequest("1.0", "antcloud.partner.expenditure.project.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）支出项目撤销接口
         * Summary: 合作方（伙伴、商家等）支出项目撤销接口
         */
        public async Task<CancelExpenditureProjectResponse> CancelExpenditureProjectExAsync(CancelExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelExpenditureProjectResponse>(await DoRequestAsync("1.0", "antcloud.partner.expenditure.project.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支出项目合同确认接口
         * Summary: 支出项目合同确认接口
         */
        public ConfirmExpenditureProjectResponse ConfirmExpenditureProject(ConfirmExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmExpenditureProjectEx(request, headers, runtime);
        }

        /**
         * Description: 支出项目合同确认接口
         * Summary: 支出项目合同确认接口
         */
        public async Task<ConfirmExpenditureProjectResponse> ConfirmExpenditureProjectAsync(ConfirmExpenditureProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmExpenditureProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 支出项目合同确认接口
         * Summary: 支出项目合同确认接口
         */
        public ConfirmExpenditureProjectResponse ConfirmExpenditureProjectEx(ConfirmExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExpenditureProjectResponse>(DoRequest("1.0", "antcloud.partner.expenditure.project.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支出项目合同确认接口
         * Summary: 支出项目合同确认接口
         */
        public async Task<ConfirmExpenditureProjectResponse> ConfirmExpenditureProjectExAsync(ConfirmExpenditureProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExpenditureProjectResponse>(await DoRequestAsync("1.0", "antcloud.partner.expenditure.project.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）标准额合同查询接口
         * Summary: 合作方（伙伴、商家等）标准额合同查询接口
         */
        public QueryStandardAgreementResponse QueryStandardAgreement(QueryStandardAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStandardAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）标准额合同查询接口
         * Summary: 合作方（伙伴、商家等）标准额合同查询接口
         */
        public async Task<QueryStandardAgreementResponse> QueryStandardAgreementAsync(QueryStandardAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStandardAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）标准额合同查询接口
         * Summary: 合作方（伙伴、商家等）标准额合同查询接口
         */
        public QueryStandardAgreementResponse QueryStandardAgreementEx(QueryStandardAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStandardAgreementResponse>(DoRequest("1.0", "antcloud.partner.standard.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）标准额合同查询接口
         * Summary: 合作方（伙伴、商家等）标准额合同查询接口
         */
        public async Task<QueryStandardAgreementResponse> QueryStandardAgreementExAsync(QueryStandardAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStandardAgreementResponse>(await DoRequestAsync("1.0", "antcloud.partner.standard.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生态伙伴区域省份查询接口
         * Summary: 生态伙伴区域省份查询接口
         */
        public QueryAreaProvinceResponse QueryAreaProvince(QueryAreaProvinceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAreaProvinceEx(request, headers, runtime);
        }

        /**
         * Description: 生态伙伴区域省份查询接口
         * Summary: 生态伙伴区域省份查询接口
         */
        public async Task<QueryAreaProvinceResponse> QueryAreaProvinceAsync(QueryAreaProvinceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAreaProvinceExAsync(request, headers, runtime);
        }

        /**
         * Description: 生态伙伴区域省份查询接口
         * Summary: 生态伙伴区域省份查询接口
         */
        public QueryAreaProvinceResponse QueryAreaProvinceEx(QueryAreaProvinceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAreaProvinceResponse>(DoRequest("1.0", "antcloud.partner.area.province.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生态伙伴区域省份查询接口
         * Summary: 生态伙伴区域省份查询接口
         */
        public async Task<QueryAreaProvinceResponse> QueryAreaProvinceExAsync(QueryAreaProvinceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAreaProvinceResponse>(await DoRequestAsync("1.0", "antcloud.partner.area.province.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
         * Summary: 合作方（伙伴、商家等）区域信息查询
         */
        public QueryAreaCityResponse QueryAreaCity(QueryAreaCityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAreaCityEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
         * Summary: 合作方（伙伴、商家等）区域信息查询
         */
        public async Task<QueryAreaCityResponse> QueryAreaCityAsync(QueryAreaCityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAreaCityExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
         * Summary: 合作方（伙伴、商家等）区域信息查询
         */
        public QueryAreaCityResponse QueryAreaCityEx(QueryAreaCityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAreaCityResponse>(DoRequest("1.0", "antcloud.partner.area.city.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
         * Summary: 合作方（伙伴、商家等）区域信息查询
         */
        public async Task<QueryAreaCityResponse> QueryAreaCityExAsync(QueryAreaCityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAreaCityResponse>(await DoRequestAsync("1.0", "antcloud.partner.area.city.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联行号关联银行机构信息查询
         * Summary: 联行号关联银行机构信息查询
         */
        public QueryPbcInstitutionResponse QueryPbcInstitution(QueryPbcInstitutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPbcInstitutionEx(request, headers, runtime);
        }

        /**
         * Description: 联行号关联银行机构信息查询
         * Summary: 联行号关联银行机构信息查询
         */
        public async Task<QueryPbcInstitutionResponse> QueryPbcInstitutionAsync(QueryPbcInstitutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPbcInstitutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 联行号关联银行机构信息查询
         * Summary: 联行号关联银行机构信息查询
         */
        public QueryPbcInstitutionResponse QueryPbcInstitutionEx(QueryPbcInstitutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPbcInstitutionResponse>(DoRequest("1.0", "antcloud.partner.pbc.institution.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联行号关联银行机构信息查询
         * Summary: 联行号关联银行机构信息查询
         */
        public async Task<QueryPbcInstitutionResponse> QueryPbcInstitutionExAsync(QueryPbcInstitutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPbcInstitutionResponse>(await DoRequestAsync("1.0", "antcloud.partner.pbc.institution.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
         * Summary: 合作方（伙伴、商家等）支行信息查询
         */
        public QueryPbcNameResponse QueryPbcName(QueryPbcNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPbcNameEx(request, headers, runtime);
        }

        /**
         * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
         * Summary: 合作方（伙伴、商家等）支行信息查询
         */
        public async Task<QueryPbcNameResponse> QueryPbcNameAsync(QueryPbcNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPbcNameExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
         * Summary: 合作方（伙伴、商家等）支行信息查询
         */
        public QueryPbcNameResponse QueryPbcNameEx(QueryPbcNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPbcNameResponse>(DoRequest("1.0", "antcloud.partner.pbc.name.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
         * Summary: 合作方（伙伴、商家等）支行信息查询
         */
        public async Task<QueryPbcNameResponse> QueryPbcNameExAsync(QueryPbcNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPbcNameResponse>(await DoRequestAsync("1.0", "antcloud.partner.pbc.name.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
