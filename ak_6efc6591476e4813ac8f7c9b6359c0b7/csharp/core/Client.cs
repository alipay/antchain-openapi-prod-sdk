// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7
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
                        {"sdk_version", "1.0.10"},
                        {"_prod_code", "ak_6efc6591476e4813ac8f7c9b6359c0b7"},
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
                        {"sdk_version", "1.0.10"},
                        {"_prod_code", "ak_6efc6591476e4813ac8f7c9b6359c0b7"},
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
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public RunAntchainSaasMarketServiceResponse RunAntchainSaasMarketService(RunAntchainSaasMarketServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunAntchainSaasMarketServiceEx(request, headers, runtime);
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public async Task<RunAntchainSaasMarketServiceResponse> RunAntchainSaasMarketServiceAsync(RunAntchainSaasMarketServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunAntchainSaasMarketServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public RunAntchainSaasMarketServiceResponse RunAntchainSaasMarketServiceEx(RunAntchainSaasMarketServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunAntchainSaasMarketServiceResponse>(DoRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public async Task<RunAntchainSaasMarketServiceResponse> RunAntchainSaasMarketServiceExAsync(RunAntchainSaasMarketServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunAntchainSaasMarketServiceResponse>(await DoRequestAsync("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public CheckSaasSecurityInfosecOpencheckservicecheckResponse CheckSaasSecurityInfosecOpencheckservicecheck(CheckSaasSecurityInfosecOpencheckservicecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSaasSecurityInfosecOpencheckservicecheckEx(request, headers, runtime);
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public async Task<CheckSaasSecurityInfosecOpencheckservicecheckResponse> CheckSaasSecurityInfosecOpencheckservicecheckAsync(CheckSaasSecurityInfosecOpencheckservicecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSaasSecurityInfosecOpencheckservicecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public CheckSaasSecurityInfosecOpencheckservicecheckResponse CheckSaasSecurityInfosecOpencheckservicecheckEx(CheckSaasSecurityInfosecOpencheckservicecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSaasSecurityInfosecOpencheckservicecheckResponse>(DoRequest("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全检验内容安全接口
         * Summary: 大安全检验内容安全接口
         */
        public async Task<CheckSaasSecurityInfosecOpencheckservicecheckResponse> CheckSaasSecurityInfosecOpencheckservicecheckExAsync(CheckSaasSecurityInfosecOpencheckservicecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSaasSecurityInfosecOpencheckservicecheckResponse>(await DoRequestAsync("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public QuerySaasSecurityInfosecOpencheckservicequeryResponse QuerySaasSecurityInfosecOpencheckservicequery(QuerySaasSecurityInfosecOpencheckservicequeryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySaasSecurityInfosecOpencheckservicequeryEx(request, headers, runtime);
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public async Task<QuerySaasSecurityInfosecOpencheckservicequeryResponse> QuerySaasSecurityInfosecOpencheckservicequeryAsync(QuerySaasSecurityInfosecOpencheckservicequeryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySaasSecurityInfosecOpencheckservicequeryExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public QuerySaasSecurityInfosecOpencheckservicequeryResponse QuerySaasSecurityInfosecOpencheckservicequeryEx(QuerySaasSecurityInfosecOpencheckservicequeryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecurityInfosecOpencheckservicequeryResponse>(DoRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全内容检测结果查询接口
         * Summary: 大安全内容检测结果查询接口
         */
        public async Task<QuerySaasSecurityInfosecOpencheckservicequeryResponse> QuerySaasSecurityInfosecOpencheckservicequeryExAsync(QuerySaasSecurityInfosecOpencheckservicequeryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecurityInfosecOpencheckservicequeryResponse>(await DoRequestAsync("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckSaasSecurityRdsRdsserviceResponse CheckSaasSecurityRdsRdsservice(CheckSaasSecurityRdsRdsserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSaasSecurityRdsRdsserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckSaasSecurityRdsRdsserviceResponse> CheckSaasSecurityRdsRdsserviceAsync(CheckSaasSecurityRdsRdsserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSaasSecurityRdsRdsserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public CheckSaasSecurityRdsRdsserviceResponse CheckSaasSecurityRdsRdsserviceEx(CheckSaasSecurityRdsRdsserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSaasSecurityRdsRdsserviceResponse>(DoRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<CheckSaasSecurityRdsRdsserviceResponse> CheckSaasSecurityRdsRdsserviceExAsync(CheckSaasSecurityRdsRdsserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSaasSecurityRdsRdsserviceResponse>(await DoRequestAsync("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public VerifySaasSecurityRdslibAntcaptchaserviceResponse VerifySaasSecurityRdslibAntcaptchaservice(VerifySaasSecurityRdslibAntcaptchaserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifySaasSecurityRdslibAntcaptchaserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<VerifySaasSecurityRdslibAntcaptchaserviceResponse> VerifySaasSecurityRdslibAntcaptchaserviceAsync(VerifySaasSecurityRdslibAntcaptchaserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifySaasSecurityRdslibAntcaptchaserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public VerifySaasSecurityRdslibAntcaptchaserviceResponse VerifySaasSecurityRdslibAntcaptchaserviceEx(VerifySaasSecurityRdslibAntcaptchaserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySaasSecurityRdslibAntcaptchaserviceResponse>(DoRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<VerifySaasSecurityRdslibAntcaptchaserviceResponse> VerifySaasSecurityRdslibAntcaptchaserviceExAsync(VerifySaasSecurityRdslibAntcaptchaserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySaasSecurityRdslibAntcaptchaserviceResponse>(await DoRequestAsync("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse QuerySaasSecuritySecuritycoreSecurityuniformservice(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySaasSecuritySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> QuerySaasSecuritySecuritycoreSecurityuniformserviceAsync(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySaasSecuritySecuritycoreSecurityuniformserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse QuerySaasSecuritySecuritycoreSecurityuniformserviceEx(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse>(DoRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> QuerySaasSecuritySecuritycoreSecurityuniformserviceExAsync(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse>(await DoRequestAsync("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySaasSecurityTscenterUmidqueryserviceResponse QuerySaasSecurityTscenterUmidqueryservice(QuerySaasSecurityTscenterUmidqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySaasSecurityTscenterUmidqueryserviceEx(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySaasSecurityTscenterUmidqueryserviceResponse> QuerySaasSecurityTscenterUmidqueryserviceAsync(QuerySaasSecurityTscenterUmidqueryserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySaasSecurityTscenterUmidqueryserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public QuerySaasSecurityTscenterUmidqueryserviceResponse QuerySaasSecurityTscenterUmidqueryserviceEx(QuerySaasSecurityTscenterUmidqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecurityTscenterUmidqueryserviceResponse>(DoRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大安全接口
         * Summary: 大安全接口
         */
        public async Task<QuerySaasSecurityTscenterUmidqueryserviceResponse> QuerySaasSecurityTscenterUmidqueryserviceExAsync(QuerySaasSecurityTscenterUmidqueryserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasSecurityTscenterUmidqueryserviceResponse>(await DoRequestAsync("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
