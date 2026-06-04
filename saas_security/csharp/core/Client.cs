// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SAAS_SECURITY.Models;

namespace AntChain.SDK.SAAS_SECURITY
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
                        {"sdk_version", "1.0.28"},
                        {"_prod_code", "SAAS_SECURITY"},
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
                        {"sdk_version", "1.0.28"},
                        {"_prod_code", "SAAS_SECURITY"},
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
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckInfosecHoloxcontentcheckserviceResponse CheckInfosecHoloxcontentcheckservice(CheckInfosecHoloxcontentcheckserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckInfosecHoloxcontentcheckserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckInfosecHoloxcontentcheckserviceResponse> CheckInfosecHoloxcontentcheckserviceAsync(CheckInfosecHoloxcontentcheckserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckInfosecHoloxcontentcheckserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckInfosecHoloxcontentcheckserviceResponse CheckInfosecHoloxcontentcheckserviceEx(CheckInfosecHoloxcontentcheckserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckInfosecHoloxcontentcheckserviceResponse>(DoRequest("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckInfosecHoloxcontentcheckserviceResponse> CheckInfosecHoloxcontentcheckserviceExAsync(CheckInfosecHoloxcontentcheckserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckInfosecHoloxcontentcheckserviceResponse>(await DoRequestAsync("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySecuritycoreSecurityuniformserviceResponse QuerySecuritycoreSecurityuniformservice(QuerySecuritycoreSecurityuniformserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySecuritycoreSecurityuniformserviceResponse> QuerySecuritycoreSecurityuniformserviceAsync(QuerySecuritycoreSecurityuniformserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySecuritycoreSecurityuniformserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySecuritycoreSecurityuniformserviceResponse QuerySecuritycoreSecurityuniformserviceEx(QuerySecuritycoreSecurityuniformserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritycoreSecurityuniformserviceResponse>(DoRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySecuritycoreSecurityuniformserviceResponse> QuerySecuritycoreSecurityuniformserviceExAsync(QuerySecuritycoreSecurityuniformserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritycoreSecurityuniformserviceResponse>(await DoRequestAsync("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckRdsRdsserviceResponse CheckRdsRdsservice(CheckRdsRdsserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckRdsRdsserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckRdsRdsserviceResponse> CheckRdsRdsserviceAsync(CheckRdsRdsserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckRdsRdsserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckRdsRdsserviceResponse CheckRdsRdsserviceEx(CheckRdsRdsserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRdsRdsserviceResponse>(DoRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckRdsRdsserviceResponse> CheckRdsRdsserviceExAsync(CheckRdsRdsserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRdsRdsserviceResponse>(await DoRequestAsync("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 大安全内容风控接口
         */
        public QueryInfosecHoloxcontentcheckqueryserviceResponse QueryInfosecHoloxcontentcheckqueryservice(QueryInfosecHoloxcontentcheckqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 大安全内容风控接口
         */
        public async Task<QueryInfosecHoloxcontentcheckqueryserviceResponse> QueryInfosecHoloxcontentcheckqueryserviceAsync(QueryInfosecHoloxcontentcheckqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInfosecHoloxcontentcheckqueryserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 大安全内容风控接口
         */
        public QueryInfosecHoloxcontentcheckqueryserviceResponse QueryInfosecHoloxcontentcheckqueryserviceEx(QueryInfosecHoloxcontentcheckqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInfosecHoloxcontentcheckqueryserviceResponse>(DoRequest("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 大安全内容风控接口
         */
        public async Task<QueryInfosecHoloxcontentcheckqueryserviceResponse> QueryInfosecHoloxcontentcheckqueryserviceExAsync(QueryInfosecHoloxcontentcheckqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInfosecHoloxcontentcheckqueryserviceResponse>(await DoRequestAsync("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public VerifyRdslibAntcaptchaserviceResponse VerifyRdslibAntcaptchaservice(VerifyRdslibAntcaptchaserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyRdslibAntcaptchaserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<VerifyRdslibAntcaptchaserviceResponse> VerifyRdslibAntcaptchaserviceAsync(VerifyRdslibAntcaptchaserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyRdslibAntcaptchaserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public VerifyRdslibAntcaptchaserviceResponse VerifyRdslibAntcaptchaserviceEx(VerifyRdslibAntcaptchaserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRdslibAntcaptchaserviceResponse>(DoRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<VerifyRdslibAntcaptchaserviceResponse> VerifyRdslibAntcaptchaserviceExAsync(VerifyRdslibAntcaptchaserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRdslibAntcaptchaserviceResponse>(await DoRequestAsync("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QueryTscenterUmidqueryserviceResponse QueryTscenterUmidqueryservice(QueryTscenterUmidqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTscenterUmidqueryserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QueryTscenterUmidqueryserviceResponse> QueryTscenterUmidqueryserviceAsync(QueryTscenterUmidqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTscenterUmidqueryserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QueryTscenterUmidqueryserviceResponse QueryTscenterUmidqueryserviceEx(QueryTscenterUmidqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTscenterUmidqueryserviceResponse>(DoRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QueryTscenterUmidqueryserviceResponse> QueryTscenterUmidqueryserviceExAsync(QueryTscenterUmidqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTscenterUmidqueryserviceResponse>(await DoRequestAsync("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public CheckInfosecOpencheckservicecheckResponse CheckInfosecOpencheckservicecheck(CheckInfosecOpencheckservicecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckInfosecOpencheckservicecheckEx(request, headers, runtime);
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public async Task<CheckInfosecOpencheckservicecheckResponse> CheckInfosecOpencheckservicecheckAsync(CheckInfosecOpencheckservicecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckInfosecOpencheckservicecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public CheckInfosecOpencheckservicecheckResponse CheckInfosecOpencheckservicecheckEx(CheckInfosecOpencheckservicecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckInfosecOpencheckservicecheckResponse>(DoRequest("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public async Task<CheckInfosecOpencheckservicecheckResponse> CheckInfosecOpencheckservicecheckExAsync(CheckInfosecOpencheckservicecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckInfosecOpencheckservicecheckResponse>(await DoRequestAsync("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public QueryInfosecOpencheckservicequeryResponse QueryInfosecOpencheckservicequery(QueryInfosecOpencheckservicequeryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInfosecOpencheckservicequeryEx(request, headers, runtime);
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public async Task<QueryInfosecOpencheckservicequeryResponse> QueryInfosecOpencheckservicequeryAsync(QueryInfosecOpencheckservicequeryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInfosecOpencheckservicequeryExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public QueryInfosecOpencheckservicequeryResponse QueryInfosecOpencheckservicequeryEx(QueryInfosecOpencheckservicequeryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInfosecOpencheckservicequeryResponse>(DoRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public async Task<QueryInfosecOpencheckservicequeryResponse> QueryInfosecOpencheckservicequeryExAsync(QueryInfosecOpencheckservicequeryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInfosecOpencheckservicequeryResponse>(await DoRequestAsync("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试接口
         * Summary: 测试接口
         */
        public QueryDemoResponse QueryDemo(QueryDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoEx(request, headers, runtime);
        }

        /**
         * Description: 测试接口
         * Summary: 测试接口
         */
        public async Task<QueryDemoResponse> QueryDemoAsync(QueryDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试接口
         * Summary: 测试接口
         */
        public QueryDemoResponse QueryDemoEx(QueryDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoResponse>(DoRequest("1.0", "saas.security.demo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试接口
         * Summary: 测试接口
         */
        public async Task<QueryDemoResponse> QueryDemoExAsync(QueryDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoResponse>(await DoRequestAsync("1.0", "saas.security.demo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public QueryGuardAskResponse QueryGuardAsk(QueryGuardAskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardAskEx(request, headers, runtime);
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public async Task<QueryGuardAskResponse> QueryGuardAskAsync(QueryGuardAskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardAskExAsync(request, headers, runtime);
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public QueryGuardAskResponse QueryGuardAskEx(QueryGuardAskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAskResponse>(DoRequest("1.0", "saas.security.guard.ask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public async Task<QueryGuardAskResponse> QueryGuardAskExAsync(QueryGuardAskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAskResponse>(await DoRequestAsync("1.0", "saas.security.guard.ask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
