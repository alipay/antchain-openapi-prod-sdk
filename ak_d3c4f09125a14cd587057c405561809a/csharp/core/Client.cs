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
                        {"sdk_version", "1.0.1"},
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
                        {"sdk_version", "1.0.1"},
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
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationlogResponse ListAntdigitalWebtrwatradeIssuerOperationlog(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> ListAntdigitalWebtrwatradeIssuerOperationlogAsync(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeIssuerOperationlogResponse ListAntdigitalWebtrwatradeIssuerOperationlogEx(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> ListAntdigitalWebtrwatradeIssuerOperationlogExAsync(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationlogResponse ListAntdigitalWebtrwatradeDistributorOperationlog(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> ListAntdigitalWebtrwatradeDistributorOperationlogAsync(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListAntdigitalWebtrwatradeDistributorOperationlogResponse ListAntdigitalWebtrwatradeDistributorOperationlogEx(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> ListAntdigitalWebtrwatradeDistributorOperationlogExAsync(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeIssuerResponse QueryAntdigitalWebtrwatradeIssuer(QueryAntdigitalWebtrwatradeIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeIssuerEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerResponse> QueryAntdigitalWebtrwatradeIssuerAsync(QueryAntdigitalWebtrwatradeIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeIssuerExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeIssuerResponse QueryAntdigitalWebtrwatradeIssuerEx(QueryAntdigitalWebtrwatradeIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeIssuerResponse> QueryAntdigitalWebtrwatradeIssuerExAsync(QueryAntdigitalWebtrwatradeIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeIssuerResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeDistributorResponse QueryAntdigitalWebtrwatradeDistributor(QueryAntdigitalWebtrwatradeDistributorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntdigitalWebtrwatradeDistributorEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorResponse> QueryAntdigitalWebtrwatradeDistributorAsync(QueryAntdigitalWebtrwatradeDistributorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntdigitalWebtrwatradeDistributorExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryAntdigitalWebtrwatradeDistributorResponse QueryAntdigitalWebtrwatradeDistributorEx(QueryAntdigitalWebtrwatradeDistributorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryAntdigitalWebtrwatradeDistributorResponse> QueryAntdigitalWebtrwatradeDistributorExAsync(QueryAntdigitalWebtrwatradeDistributorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntdigitalWebtrwatradeDistributorResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeIssuerCrossaccountResponse ListAntdigitalWebtrwatradeIssuerCrossaccount(ListAntdigitalWebtrwatradeIssuerCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeIssuerCrossaccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse> ListAntdigitalWebtrwatradeIssuerCrossaccountAsync(ListAntdigitalWebtrwatradeIssuerCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeIssuerCrossaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeIssuerCrossaccountResponse ListAntdigitalWebtrwatradeIssuerCrossaccountEx(ListAntdigitalWebtrwatradeIssuerCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse> ListAntdigitalWebtrwatradeIssuerCrossaccountExAsync(ListAntdigitalWebtrwatradeIssuerCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse ListAntdigitalWebtrwatradeDistributorCrossaccount(ListAntdigitalWebtrwatradeDistributorCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntdigitalWebtrwatradeDistributorCrossaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse> ListAntdigitalWebtrwatradeDistributorCrossaccountAsync(ListAntdigitalWebtrwatradeDistributorCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntdigitalWebtrwatradeDistributorCrossaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse ListAntdigitalWebtrwatradeDistributorCrossaccountEx(ListAntdigitalWebtrwatradeDistributorCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse> ListAntdigitalWebtrwatradeDistributorCrossaccountExAsync(ListAntdigitalWebtrwatradeDistributorCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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

    }
}
