// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8
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
                        {"sdk_version", "1.0.2"},
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
                        {"sdk_version", "1.0.2"},
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
         * Description: 通过代理模式为企业创建did
         * Summary: 通过代理模式为企业创建did
         */
        public StartBaasDidCorporateAgentcreateResponse StartBaasDidCorporateAgentcreate(StartBaasDidCorporateAgentcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidCorporateAgentcreateEx(request, headers, runtime);
        }

        /**
         * Description: 通过代理模式为企业创建did
         * Summary: 通过代理模式为企业创建did
         */
        public async Task<StartBaasDidCorporateAgentcreateResponse> StartBaasDidCorporateAgentcreateAsync(StartBaasDidCorporateAgentcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidCorporateAgentcreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过代理模式为企业创建did
         * Summary: 通过代理模式为企业创建did
         */
        public StartBaasDidCorporateAgentcreateResponse StartBaasDidCorporateAgentcreateEx(StartBaasDidCorporateAgentcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidCorporateAgentcreateResponse>(DoRequest("1.0", "baas.did.corporate.agentcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过代理模式为企业创建did
         * Summary: 通过代理模式为企业创建did
         */
        public async Task<StartBaasDidCorporateAgentcreateResponse> StartBaasDidCorporateAgentcreateExAsync(StartBaasDidCorporateAgentcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidCorporateAgentcreateResponse>(await DoRequestAsync("1.0", "baas.did.corporate.agentcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过代理模式为个人创建did
         * Summary: 通过代理模式为个人创建did
         */
        public StartBaasDidPersonAgentcreateResponse StartBaasDidPersonAgentcreate(StartBaasDidPersonAgentcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidPersonAgentcreateEx(request, headers, runtime);
        }

        /**
         * Description: 通过代理模式为个人创建did
         * Summary: 通过代理模式为个人创建did
         */
        public async Task<StartBaasDidPersonAgentcreateResponse> StartBaasDidPersonAgentcreateAsync(StartBaasDidPersonAgentcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidPersonAgentcreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过代理模式为个人创建did
         * Summary: 通过代理模式为个人创建did
         */
        public StartBaasDidPersonAgentcreateResponse StartBaasDidPersonAgentcreateEx(StartBaasDidPersonAgentcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidPersonAgentcreateResponse>(DoRequest("1.0", "baas.did.person.agentcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过代理模式为个人创建did
         * Summary: 通过代理模式为个人创建did
         */
        public async Task<StartBaasDidPersonAgentcreateResponse> StartBaasDidPersonAgentcreateExAsync(StartBaasDidPersonAgentcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidPersonAgentcreateResponse>(await DoRequestAsync("1.0", "baas.did.person.agentcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 直接创建自己的企业did
         * Summary: 直接创建自己的企业did
         */
        public StartBaasDidCorporateSelfcreateResponse StartBaasDidCorporateSelfcreate(StartBaasDidCorporateSelfcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidCorporateSelfcreateEx(request, headers, runtime);
        }

        /**
         * Description: 直接创建自己的企业did
         * Summary: 直接创建自己的企业did
         */
        public async Task<StartBaasDidCorporateSelfcreateResponse> StartBaasDidCorporateSelfcreateAsync(StartBaasDidCorporateSelfcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidCorporateSelfcreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 直接创建自己的企业did
         * Summary: 直接创建自己的企业did
         */
        public StartBaasDidCorporateSelfcreateResponse StartBaasDidCorporateSelfcreateEx(StartBaasDidCorporateSelfcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidCorporateSelfcreateResponse>(DoRequest("1.0", "baas.did.corporate.selfcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 直接创建自己的企业did
         * Summary: 直接创建自己的企业did
         */
        public async Task<StartBaasDidCorporateSelfcreateResponse> StartBaasDidCorporateSelfcreateExAsync(StartBaasDidCorporateSelfcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidCorporateSelfcreateResponse>(await DoRequestAsync("1.0", "baas.did.corporate.selfcreate.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书
         * Summary: 为指定did颁发证书
         */
        public StartBaasDidVerifiableclaimIssureResponse StartBaasDidVerifiableclaimIssure(StartBaasDidVerifiableclaimIssureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidVerifiableclaimIssureEx(request, headers, runtime);
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书
         * Summary: 为指定did颁发证书
         */
        public async Task<StartBaasDidVerifiableclaimIssureResponse> StartBaasDidVerifiableclaimIssureAsync(StartBaasDidVerifiableclaimIssureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidVerifiableclaimIssureExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书
         * Summary: 为指定did颁发证书
         */
        public StartBaasDidVerifiableclaimIssureResponse StartBaasDidVerifiableclaimIssureEx(StartBaasDidVerifiableclaimIssureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVerifiableclaimIssureResponse>(DoRequest("1.0", "baas.did.verifiableclaim.issure.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书
         * Summary: 为指定did颁发证书
         */
        public async Task<StartBaasDidVerifiableclaimIssureResponse> StartBaasDidVerifiableclaimIssureExAsync(StartBaasDidVerifiableclaimIssureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVerifiableclaimIssureResponse>(await DoRequestAsync("1.0", "baas.did.verifiableclaim.issure.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证可验证声明
         * Summary: 验证可验证声明
         */
        public StartBaasDidVerifiableclaimVerifierResponse StartBaasDidVerifiableclaimVerifier(StartBaasDidVerifiableclaimVerifierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidVerifiableclaimVerifierEx(request, headers, runtime);
        }

        /**
         * Description: 验证可验证声明
         * Summary: 验证可验证声明
         */
        public async Task<StartBaasDidVerifiableclaimVerifierResponse> StartBaasDidVerifiableclaimVerifierAsync(StartBaasDidVerifiableclaimVerifierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidVerifiableclaimVerifierExAsync(request, headers, runtime);
        }

        /**
         * Description: 验证可验证声明
         * Summary: 验证可验证声明
         */
        public StartBaasDidVerifiableclaimVerifierResponse StartBaasDidVerifiableclaimVerifierEx(StartBaasDidVerifiableclaimVerifierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVerifiableclaimVerifierResponse>(DoRequest("1.0", "baas.did.verifiableclaim.verifier.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证可验证声明
         * Summary: 验证可验证声明
         */
        public async Task<StartBaasDidVerifiableclaimVerifierResponse> StartBaasDidVerifiableclaimVerifierExAsync(StartBaasDidVerifiableclaimVerifierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVerifiableclaimVerifierResponse>(await DoRequestAsync("1.0", "baas.did.verifiableclaim.verifier.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过vcid查询vc内容
         * Summary: 通过vcid查询vc内容
         */
        public QueryBaasDidVcResponse QueryBaasDidVc(QueryBaasDidVcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasDidVcEx(request, headers, runtime);
        }

        /**
         * Description: 通过vcid查询vc内容
         * Summary: 通过vcid查询vc内容
         */
        public async Task<QueryBaasDidVcResponse> QueryBaasDidVcAsync(QueryBaasDidVcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasDidVcExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过vcid查询vc内容
         * Summary: 通过vcid查询vc内容
         */
        public QueryBaasDidVcResponse QueryBaasDidVcEx(QueryBaasDidVcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasDidVcResponse>(DoRequest("1.0", "baas.did.vc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过vcid查询vc内容
         * Summary: 通过vcid查询vc内容
         */
        public async Task<QueryBaasDidVcResponse> QueryBaasDidVcExAsync(QueryBaasDidVcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasDidVcResponse>(await DoRequestAsync("1.0", "baas.did.vc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
         * Summary: 通过个人三要素验证后创建个人did
         */
        public CreateBaasDidPersonWiththreemetaResponse CreateBaasDidPersonWiththreemeta(CreateBaasDidPersonWiththreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasDidPersonWiththreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
         * Summary: 通过个人三要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWiththreemetaResponse> CreateBaasDidPersonWiththreemetaAsync(CreateBaasDidPersonWiththreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasDidPersonWiththreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
         * Summary: 通过个人三要素验证后创建个人did
         */
        public CreateBaasDidPersonWiththreemetaResponse CreateBaasDidPersonWiththreemetaEx(CreateBaasDidPersonWiththreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWiththreemetaResponse>(DoRequest("1.0", "baas.did.person.withthreemeta.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
         * Summary: 通过个人三要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWiththreemetaResponse> CreateBaasDidPersonWiththreemetaExAsync(CreateBaasDidPersonWiththreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWiththreemetaResponse>(await DoRequestAsync("1.0", "baas.did.person.withthreemeta.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
         * Summary: 指定did颁发证书，并存储
         */
        public StartBaasDidVcrepositoryIssueResponse StartBaasDidVcrepositoryIssue(StartBaasDidVcrepositoryIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasDidVcrepositoryIssueEx(request, headers, runtime);
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
         * Summary: 指定did颁发证书，并存储
         */
        public async Task<StartBaasDidVcrepositoryIssueResponse> StartBaasDidVcrepositoryIssueAsync(StartBaasDidVcrepositoryIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasDidVcrepositoryIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
         * Summary: 指定did颁发证书，并存储
         */
        public StartBaasDidVcrepositoryIssueResponse StartBaasDidVcrepositoryIssueEx(StartBaasDidVcrepositoryIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVcrepositoryIssueResponse>(DoRequest("1.0", "baas.did.vcrepository.issue.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
         * Summary: 指定did颁发证书，并存储
         */
        public async Task<StartBaasDidVcrepositoryIssueResponse> StartBaasDidVcrepositoryIssueExAsync(StartBaasDidVcrepositoryIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasDidVcrepositoryIssueResponse>(await DoRequestAsync("1.0", "baas.did.vcrepository.issue.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理模式下更新企业did doc中service中的字段
         * Summary: 代理更新企业did中的services
         */
        public UpdateBaasDidServicesResponse UpdateBaasDidServices(UpdateBaasDidServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasDidServicesEx(request, headers, runtime);
        }

        /**
         * Description: 代理模式下更新企业did doc中service中的字段
         * Summary: 代理更新企业did中的services
         */
        public async Task<UpdateBaasDidServicesResponse> UpdateBaasDidServicesAsync(UpdateBaasDidServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasDidServicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 代理模式下更新企业did doc中service中的字段
         * Summary: 代理更新企业did中的services
         */
        public UpdateBaasDidServicesResponse UpdateBaasDidServicesEx(UpdateBaasDidServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasDidServicesResponse>(DoRequest("1.0", "baas.did.services.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理模式下更新企业did doc中service中的字段
         * Summary: 代理更新企业did中的services
         */
        public async Task<UpdateBaasDidServicesResponse> UpdateBaasDidServicesExAsync(UpdateBaasDidServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasDidServicesResponse>(await DoRequestAsync("1.0", "baas.did.services.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
         * Summary: 通过个人二要素验证后创建个人did
         */
        public CreateBaasDidPersonWithtwometaResponse CreateBaasDidPersonWithtwometa(CreateBaasDidPersonWithtwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasDidPersonWithtwometaEx(request, headers, runtime);
        }

        /**
         * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
         * Summary: 通过个人二要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWithtwometaResponse> CreateBaasDidPersonWithtwometaAsync(CreateBaasDidPersonWithtwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasDidPersonWithtwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
         * Summary: 通过个人二要素验证后创建个人did
         */
        public CreateBaasDidPersonWithtwometaResponse CreateBaasDidPersonWithtwometaEx(CreateBaasDidPersonWithtwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWithtwometaResponse>(DoRequest("1.0", "baas.did.person.withtwometa.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
         * Summary: 通过个人二要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWithtwometaResponse> CreateBaasDidPersonWithtwometaExAsync(CreateBaasDidPersonWithtwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWithtwometaResponse>(await DoRequestAsync("1.0", "baas.did.person.withtwometa.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人四要素验证后创建个人did
         * Summary: 通过个人四要素验证后创建个人did
         */
        public CreateBaasDidPersonWithfourmetaResponse CreateBaasDidPersonWithfourmeta(CreateBaasDidPersonWithfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasDidPersonWithfourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 通过个人四要素验证后创建个人did
         * Summary: 通过个人四要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWithfourmetaResponse> CreateBaasDidPersonWithfourmetaAsync(CreateBaasDidPersonWithfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasDidPersonWithfourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过个人四要素验证后创建个人did
         * Summary: 通过个人四要素验证后创建个人did
         */
        public CreateBaasDidPersonWithfourmetaResponse CreateBaasDidPersonWithfourmetaEx(CreateBaasDidPersonWithfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWithfourmetaResponse>(DoRequest("1.0", "baas.did.person.withfourmeta.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过个人四要素验证后创建个人did
         * Summary: 通过个人四要素验证后创建个人did
         */
        public async Task<CreateBaasDidPersonWithfourmetaResponse> CreateBaasDidPersonWithfourmetaExAsync(CreateBaasDidPersonWithfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasDidPersonWithfourmetaResponse>(await DoRequestAsync("1.0", "baas.did.person.withfourmeta.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
