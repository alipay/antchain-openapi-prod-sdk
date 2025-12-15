// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_a1f82644937c486c81a62b0e5a6b4fbe.Models;

namespace AntChain.SDK.Ak_a1f82644937c486c81a62b0e5a6b4fbe
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
                        {"sdk_version", "1.0.10"},
                        {"_prod_code", "ak_a1f82644937c486c81a62b0e5a6b4fbe"},
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
                        {"sdk_version", "1.0.10"},
                        {"_prod_code", "ak_a1f82644937c486c81a62b0e5a6b4fbe"},
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
         * Description: 调试a s dddd
         * Summary: 调试1
         */
        public QueryAntchainAbcAbcdaAbcddaaResponse QueryAntchainAbcAbcdaAbcddaa(QueryAntchainAbcAbcdaAbcddaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAbcAbcdaAbcddaaEx(request, headers, runtime);
        }

        /**
         * Description: 调试a s dddd
         * Summary: 调试1
         */
        public async Task<QueryAntchainAbcAbcdaAbcddaaResponse> QueryAntchainAbcAbcdaAbcddaaAsync(QueryAntchainAbcAbcdaAbcddaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAbcAbcdaAbcddaaExAsync(request, headers, runtime);
        }

        /**
         * Description: 调试a s dddd
         * Summary: 调试1
         */
        public QueryAntchainAbcAbcdaAbcddaaResponse QueryAntchainAbcAbcdaAbcddaaEx(QueryAntchainAbcAbcdaAbcddaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcAbcdaAbcddaaResponse>(DoRequest("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调试a s dddd
         * Summary: 调试1
         */
        public async Task<QueryAntchainAbcAbcdaAbcddaaResponse> QueryAntchainAbcAbcdaAbcddaaExAsync(QueryAntchainAbcAbcdaAbcddaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcAbcdaAbcddaaResponse>(await DoRequestAsync("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public BindDemoAaaBbbCccResponse BindDemoAaaBbbCcc(BindDemoAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public async Task<BindDemoAaaBbbCccResponse> BindDemoAaaBbbCccAsync(BindDemoAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public BindDemoAaaBbbCccResponse BindDemoAaaBbbCccEx(BindDemoAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public async Task<BindDemoAaaBbbCccResponse> BindDemoAaaBbbCccExAsync(BindDemoAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoAaaBbbCccResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public BindAntchainSaasAbilityResponse BindAntchainSaasAbility(BindAntchainSaasAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAntchainSaasAbilityEx(request, headers, runtime);
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public async Task<BindAntchainSaasAbilityResponse> BindAntchainSaasAbilityAsync(BindAntchainSaasAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAntchainSaasAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public BindAntchainSaasAbilityResponse BindAntchainSaasAbilityEx(BindAntchainSaasAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainSaasAbilityResponse>(DoRequest("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public async Task<BindAntchainSaasAbilityResponse> BindAntchainSaasAbilityExAsync(BindAntchainSaasAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainSaasAbilityResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public QueryDemoAbcAbcAbcResponse QueryDemoAbcAbcAbc(QueryDemoAbcAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoAbcAbcAbcEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public async Task<QueryDemoAbcAbcAbcResponse> QueryDemoAbcAbcAbcAsync(QueryDemoAbcAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoAbcAbcAbcExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public QueryDemoAbcAbcAbcResponse QueryDemoAbcAbcAbcEx(QueryDemoAbcAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoAbcAbcAbcResponse>(DoRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public async Task<QueryDemoAbcAbcAbcResponse> QueryDemoAbcAbcAbcExAsync(QueryDemoAbcAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoAbcAbcAbcResponse>(await DoRequestAsync("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public CallbackAntchainSaasAbilityResponse CallbackAntchainSaasAbility(CallbackAntchainSaasAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntchainSaasAbilityEx(request, headers, runtime);
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public async Task<CallbackAntchainSaasAbilityResponse> CallbackAntchainSaasAbilityAsync(CallbackAntchainSaasAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntchainSaasAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public CallbackAntchainSaasAbilityResponse CallbackAntchainSaasAbilityEx(CallbackAntchainSaasAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntchainSaasAbilityResponse>(DoRequest("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public async Task<CallbackAntchainSaasAbilityResponse> CallbackAntchainSaasAbilityExAsync(CallbackAntchainSaasAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntchainSaasAbilityResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public BindAntchainSaasAbilityApiResponse BindAntchainSaasAbilityApi(BindAntchainSaasAbilityApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAntchainSaasAbilityApiEx(request, headers, runtime);
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public async Task<BindAntchainSaasAbilityApiResponse> BindAntchainSaasAbilityApiAsync(BindAntchainSaasAbilityApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAntchainSaasAbilityApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public BindAntchainSaasAbilityApiResponse BindAntchainSaasAbilityApiEx(BindAntchainSaasAbilityApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainSaasAbilityApiResponse>(DoRequest("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public async Task<BindAntchainSaasAbilityApiResponse> BindAntchainSaasAbilityApiExAsync(BindAntchainSaasAbilityApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainSaasAbilityApiResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public QueryAntchainSaasAbilityBusinesscodeResponse QueryAntchainSaasAbilityBusinesscode(QueryAntchainSaasAbilityBusinesscodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainSaasAbilityBusinesscodeEx(request, headers, runtime);
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public async Task<QueryAntchainSaasAbilityBusinesscodeResponse> QueryAntchainSaasAbilityBusinesscodeAsync(QueryAntchainSaasAbilityBusinesscodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainSaasAbilityBusinesscodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public QueryAntchainSaasAbilityBusinesscodeResponse QueryAntchainSaasAbilityBusinesscodeEx(QueryAntchainSaasAbilityBusinesscodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSaasAbilityBusinesscodeResponse>(DoRequest("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public async Task<QueryAntchainSaasAbilityBusinesscodeResponse> QueryAntchainSaasAbilityBusinesscodeExAsync(QueryAntchainSaasAbilityBusinesscodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSaasAbilityBusinesscodeResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
