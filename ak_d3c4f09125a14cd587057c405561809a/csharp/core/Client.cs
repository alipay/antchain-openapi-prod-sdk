// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a
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
                        {"sdk_version", "1.1.3"},
                        {"_prod_code", "ak_d3c4f09125a14cd587057c405561809a"},
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
                        {"sdk_version", "1.1.3"},
                        {"_prod_code", "ak_d3c4f09125a14cd587057c405561809a"},
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
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public UpdateAntdigitalWebtrwatradeIssuerPriceResponse UpdateAntdigitalWebtrwatradeIssuerPrice(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntdigitalWebtrwatradeIssuerPriceEx(request, headers, runtime);
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public async Task<UpdateAntdigitalWebtrwatradeIssuerPriceResponse> UpdateAntdigitalWebtrwatradeIssuerPriceAsync(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntdigitalWebtrwatradeIssuerPriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public UpdateAntdigitalWebtrwatradeIssuerPriceResponse UpdateAntdigitalWebtrwatradeIssuerPriceEx(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntdigitalWebtrwatradeIssuerPriceResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.price.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public async Task<UpdateAntdigitalWebtrwatradeIssuerPriceResponse> UpdateAntdigitalWebtrwatradeIssuerPriceExAsync(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntdigitalWebtrwatradeIssuerPriceResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.price.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public UpdateAntdigitalWebtrwatradeDistributorSubuserResponse UpdateAntdigitalWebtrwatradeDistributorSubuser(UpdateAntdigitalWebtrwatradeDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public async Task<UpdateAntdigitalWebtrwatradeDistributorSubuserResponse> UpdateAntdigitalWebtrwatradeDistributorSubuserAsync(UpdateAntdigitalWebtrwatradeDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntdigitalWebtrwatradeDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public UpdateAntdigitalWebtrwatradeDistributorSubuserResponse UpdateAntdigitalWebtrwatradeDistributorSubuserEx(UpdateAntdigitalWebtrwatradeDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntdigitalWebtrwatradeDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public async Task<UpdateAntdigitalWebtrwatradeDistributorSubuserResponse> UpdateAntdigitalWebtrwatradeDistributorSubuserExAsync(UpdateAntdigitalWebtrwatradeDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntdigitalWebtrwatradeDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse ListAntdigitalWebtrwatradeIssuerOperationloglogininfo(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse> ListAntdigitalWebtrwatradeIssuerOperationloglogininfoAsync(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerOperationloglogininfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse ListAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse> ListAntdigitalWebtrwatradeIssuerOperationloglogininfoExAsync(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse ListAntdigitalWebtrwatradeDistributorOperationloglogininfo(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse> ListAntdigitalWebtrwatradeDistributorOperationloglogininfoAsync(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorOperationloglogininfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse ListAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse> ListAntdigitalWebtrwatradeDistributorOperationloglogininfoExAsync(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse QueryAntdigitalWebtrwatradeIssuerSubuserdetail(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeIssuerSubuserdetailEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse> QueryAntdigitalWebtrwatradeIssuerSubuserdetailAsync(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeIssuerSubuserdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse QueryAntdigitalWebtrwatradeIssuerSubuserdetailEx(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuserdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse> QueryAntdigitalWebtrwatradeIssuerSubuserdetailExAsync(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuserdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse QueryAntdigitalWebtrwatradeDistributorSubuserdetail(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeDistributorSubuserdetailEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse> QueryAntdigitalWebtrwatradeDistributorSubuserdetailAsync(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeDistributorSubuserdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse QueryAntdigitalWebtrwatradeDistributorSubuserdetailEx(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuserdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse> QueryAntdigitalWebtrwatradeDistributorSubuserdetailExAsync(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuserdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse ListAntdigitalWebtrwatradeIssuerCrosschainaccount(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerCrosschainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse> ListAntdigitalWebtrwatradeIssuerCrosschainaccountAsync(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerCrosschainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse ListAntdigitalWebtrwatradeIssuerCrosschainaccountEx(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse> ListAntdigitalWebtrwatradeIssuerCrosschainaccountExAsync(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse ListAntdigitalWebtrwatradeDistributorCrosschainaccount(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorCrosschainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse> ListAntdigitalWebtrwatradeDistributorCrosschainaccountAsync(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorCrosschainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse ListAntdigitalWebtrwatradeDistributorCrosschainaccountEx(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse> ListAntdigitalWebtrwatradeDistributorCrosschainaccountExAsync(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse DetailAntdigitalWebtrwatradeIssuerProjectwithrole(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public async Task<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse> DetailAntdigitalWebtrwatradeIssuerProjectwithroleAsync(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAntdigitalWebtrwatradeIssuerProjectwithroleExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse DetailAntdigitalWebtrwatradeIssuerProjectwithroleEx(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public async Task<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse> DetailAntdigitalWebtrwatradeIssuerProjectwithroleExAsync(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询所有操作员的操作日志
         * Summary: 发行机构查询所有操作员的操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationlogResponse ListAntdigitalWebtrwatradeIssuerOperationlog(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询所有操作员的操作日志
         * Summary: 发行机构查询所有操作员的操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> ListAntdigitalWebtrwatradeIssuerOperationlogAsync(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询所有操作员的操作日志
         * Summary: 发行机构查询所有操作员的操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationlogResponse ListAntdigitalWebtrwatradeIssuerOperationlogEx(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询所有操作员的操作日志
         * Summary: 发行机构查询所有操作员的操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> ListAntdigitalWebtrwatradeIssuerOperationlogExAsync(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询所有操作员的操作日志
         * Summary: 代销机构查询所有操作员的操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationlogResponse ListAntdigitalWebtrwatradeDistributorOperationlog(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询所有操作员的操作日志
         * Summary: 代销机构查询所有操作员的操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> ListAntdigitalWebtrwatradeDistributorOperationlogAsync(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询所有操作员的操作日志
         * Summary: 代销机构查询所有操作员的操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationlogResponse ListAntdigitalWebtrwatradeDistributorOperationlogEx(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询所有操作员的操作日志
         * Summary: 代销机构查询所有操作员的操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> ListAntdigitalWebtrwatradeDistributorOperationlogExAsync(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发行机构下所有的项目
         * Summary: 查询发行机构下所有的项目
         */
        public ListAntdigitalWebtrwatradeIssuerProjectResponse ListAntdigitalWebtrwatradeIssuerProject(ListAntdigitalWebtrwatradeIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询发行机构下所有的项目
         * Summary: 查询发行机构下所有的项目
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerProjectResponse> ListAntdigitalWebtrwatradeIssuerProjectAsync(ListAntdigitalWebtrwatradeIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发行机构下所有的项目
         * Summary: 查询发行机构下所有的项目
         */
        public ListAntdigitalWebtrwatradeIssuerProjectResponse ListAntdigitalWebtrwatradeIssuerProjectEx(ListAntdigitalWebtrwatradeIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发行机构下所有的项目
         * Summary: 查询发行机构下所有的项目
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerProjectResponse> ListAntdigitalWebtrwatradeIssuerProjectExAsync(ListAntdigitalWebtrwatradeIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构下所有的项目
         * Summary: 查询代销机构下所有的项目
         */
        public ListAntdigitalWebtrwatradeDistributorProjectResponse ListAntdigitalWebtrwatradeDistributorProject(ListAntdigitalWebtrwatradeDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构下所有的项目
         * Summary: 查询代销机构下所有的项目
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorProjectResponse> ListAntdigitalWebtrwatradeDistributorProjectAsync(ListAntdigitalWebtrwatradeDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构下所有的项目
         * Summary: 查询代销机构下所有的项目
         */
        public ListAntdigitalWebtrwatradeDistributorProjectResponse ListAntdigitalWebtrwatradeDistributorProjectEx(ListAntdigitalWebtrwatradeDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构下所有的项目
         * Summary: 查询代销机构下所有的项目
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorProjectResponse> ListAntdigitalWebtrwatradeDistributorProjectExAsync(ListAntdigitalWebtrwatradeDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发行机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public ListAntdigitalWebtrwatradeIssuerSubuserResponse ListAntdigitalWebtrwatradeIssuerSubuser(ListAntdigitalWebtrwatradeIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 查询发行机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerSubuserResponse> ListAntdigitalWebtrwatradeIssuerSubuserAsync(ListAntdigitalWebtrwatradeIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发行机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public ListAntdigitalWebtrwatradeIssuerSubuserResponse ListAntdigitalWebtrwatradeIssuerSubuserEx(ListAntdigitalWebtrwatradeIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发行机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerSubuserResponse> ListAntdigitalWebtrwatradeIssuerSubuserExAsync(ListAntdigitalWebtrwatradeIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public ListAntdigitalWebtrwatradeDistributorSubuserResponse ListAntdigitalWebtrwatradeDistributorSubuser(ListAntdigitalWebtrwatradeDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorSubuserResponse> ListAntdigitalWebtrwatradeDistributorSubuserAsync(ListAntdigitalWebtrwatradeDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public ListAntdigitalWebtrwatradeDistributorSubuserResponse ListAntdigitalWebtrwatradeDistributorSubuserEx(ListAntdigitalWebtrwatradeDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构和项目下所有关联的二级用户信息
         * Summary: 查询机构和项目下所有关联的二级用户信息
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorSubuserResponse> ListAntdigitalWebtrwatradeDistributorSubuserExAsync(ListAntdigitalWebtrwatradeDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构本侧链持仓情况
         * Summary: 代销机构本侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse QueryAntdigitalWebtrwatradeDistributorSubuseraccount(QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeDistributorSubuseraccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构本侧链持仓情况
         * Summary: 代销机构本侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse> QueryAntdigitalWebtrwatradeDistributorSubuseraccountAsync(QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeDistributorSubuseraccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构本侧链持仓情况
         * Summary: 代销机构本侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse QueryAntdigitalWebtrwatradeDistributorSubuseraccountEx(QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuseraccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构本侧链持仓情况
         * Summary: 代销机构本侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse> QueryAntdigitalWebtrwatradeDistributorSubuseraccountExAsync(QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorSubuseraccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuseraccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构本侧链持仓情况
         * Summary: 发行机构本侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse QueryAntdigitalWebtrwatradeIssuerSubuseraccount(QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeIssuerSubuseraccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构本侧链持仓情况
         * Summary: 发行机构本侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse> QueryAntdigitalWebtrwatradeIssuerSubuseraccountAsync(QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeIssuerSubuseraccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构本侧链持仓情况
         * Summary: 发行机构本侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse QueryAntdigitalWebtrwatradeIssuerSubuseraccountEx(QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuseraccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构本侧链持仓情况
         * Summary: 发行机构本侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse> QueryAntdigitalWebtrwatradeIssuerSubuseraccountExAsync(QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerSubuseraccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuseraccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构对侧链持仓情况
         * Summary: 代销机构对侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse QueryAntdigitalWebtrwatradeDistributorCrosschainaccount(QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeDistributorCrosschainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构对侧链持仓情况
         * Summary: 代销机构对侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse> QueryAntdigitalWebtrwatradeDistributorCrosschainaccountAsync(QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeDistributorCrosschainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构对侧链持仓情况
         * Summary: 代销机构对侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse QueryAntdigitalWebtrwatradeDistributorCrosschainaccountEx(QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.crosschainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构对侧链持仓情况
         * Summary: 代销机构对侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse> QueryAntdigitalWebtrwatradeDistributorCrosschainaccountExAsync(QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorCrosschainaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.crosschainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构对侧链持仓情况
         * Summary: 发行机构对侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse QueryAntdigitalWebtrwatradeIssuerCrosschainaccount(QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeIssuerCrosschainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构对侧链持仓情况
         * Summary: 发行机构对侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse> QueryAntdigitalWebtrwatradeIssuerCrosschainaccountAsync(QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeIssuerCrosschainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构对侧链持仓情况
         * Summary: 发行机构对侧链持仓情况
         */
        public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse QueryAntdigitalWebtrwatradeIssuerCrosschainaccountEx(QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.crosschainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构对侧链持仓情况
         * Summary: 发行机构对侧链持仓情况
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse> QueryAntdigitalWebtrwatradeIssuerCrosschainaccountExAsync(QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerCrosschainaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.crosschainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构虚拟子账号明细
         * Summary: 代销机构虚拟子账号明细
         */
        public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccount(DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构虚拟子账号明细
         * Summary: 代销机构虚拟子账号明细
         */
        public async Task<DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse> DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountAsync(DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构虚拟子账号明细
         * Summary: 代销机构虚拟子账号明细
         */
        public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountEx(DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuservirtualaccount.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构虚拟子账号明细
         * Summary: 代销机构虚拟子账号明细
         */
        public async Task<DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse> DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountExAsync(DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuservirtualaccount.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构虚拟子账号明细
         * Summary: 发行机构虚拟子账号明细
         */
        public DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccount(DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构虚拟子账号明细
         * Summary: 发行机构虚拟子账号明细
         */
        public async Task<DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse> DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountAsync(DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构虚拟子账号明细
         * Summary: 发行机构虚拟子账号明细
         */
        public DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountEx(DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuservirtualaccount.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构虚拟子账号明细
         * Summary: 发行机构虚拟子账号明细
         */
        public async Task<DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse> DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountExAsync(DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntdigitalWebtrwatradeIssuerSubuservirtualaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuservirtualaccount.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
