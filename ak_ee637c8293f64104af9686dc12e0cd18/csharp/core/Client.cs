// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_ee637c8293f64104af9686dc12e0cd18.Models;

namespace AntChain.SDK.Ak_ee637c8293f64104af9686dc12e0cd18
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
                        {"sdk_version", "1.0.177"},
                        {"_prod_code", "ak_ee637c8293f64104af9686dc12e0cd18"},
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
                        {"sdk_version", "1.0.177"},
                        {"_prod_code", "ak_ee637c8293f64104af9686dc12e0cd18"},
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
         * Description: sss
         * Summary: ss
         */
        public BindDemoSssSsSsResponse BindDemoSssSsSs(BindDemoSssSsSsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoSssSsSsEx(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public async Task<BindDemoSssSsSsResponse> BindDemoSssSsSsAsync(BindDemoSssSsSsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoSssSsSsExAsync(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public BindDemoSssSsSsResponse BindDemoSssSsSsEx(BindDemoSssSsSsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoSssSsSsResponse>(DoRequest("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public async Task<BindDemoSssSsSsResponse> BindDemoSssSsSsExAsync(BindDemoSssSsSsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoSssSsSsResponse>(await DoRequestAsync("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public BindDemoTestTestTestResponse BindDemoTestTestTest(BindDemoTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoTestTestTestEx(request, headers, runtime);
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public async Task<BindDemoTestTestTestResponse> BindDemoTestTestTestAsync(BindDemoTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoTestTestTestExAsync(request, headers, runtime);
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public BindDemoTestTestTestResponse BindDemoTestTestTestEx(BindDemoTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoTestTestTestResponse>(DoRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public async Task<BindDemoTestTestTestResponse> BindDemoTestTestTestExAsync(BindDemoTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoTestTestTestResponse>(await DoRequestAsync("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public QueryDemoTestTestobjectBbbResponse QueryDemoTestTestobjectBbb(QueryDemoTestTestobjectBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestTestobjectBbbEx(request, headers, runtime);
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public async Task<QueryDemoTestTestobjectBbbResponse> QueryDemoTestTestobjectBbbAsync(QueryDemoTestTestobjectBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestTestobjectBbbExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public QueryDemoTestTestobjectBbbResponse QueryDemoTestTestobjectBbbEx(QueryDemoTestTestobjectBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestTestobjectBbbResponse>(DoRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public async Task<QueryDemoTestTestobjectBbbResponse> QueryDemoTestTestobjectBbbExAsync(QueryDemoTestTestobjectBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestTestobjectBbbResponse>(await DoRequestAsync("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public BindDemoSdfSssSssResponse BindDemoSdfSssSss(BindDemoSdfSssSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoSdfSssSssEx(request, headers, runtime);
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public async Task<BindDemoSdfSssSssResponse> BindDemoSdfSssSssAsync(BindDemoSdfSssSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoSdfSssSssExAsync(request, headers, runtime);
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public BindDemoSdfSssSssResponse BindDemoSdfSssSssEx(BindDemoSdfSssSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoSdfSssSssResponse>(DoRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public async Task<BindDemoSdfSssSssResponse> BindDemoSdfSssSssExAsync(BindDemoSdfSssSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoSdfSssSssResponse>(await DoRequestAsync("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public RegisterDemoTestBizeventMessageResponse RegisterDemoTestBizeventMessage(RegisterDemoTestBizeventMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterDemoTestBizeventMessageEx(request, headers, runtime);
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public async Task<RegisterDemoTestBizeventMessageResponse> RegisterDemoTestBizeventMessageAsync(RegisterDemoTestBizeventMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterDemoTestBizeventMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public RegisterDemoTestBizeventMessageResponse RegisterDemoTestBizeventMessageEx(RegisterDemoTestBizeventMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterDemoTestBizeventMessageResponse>(DoRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public async Task<RegisterDemoTestBizeventMessageResponse> RegisterDemoTestBizeventMessageExAsync(RegisterDemoTestBizeventMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterDemoTestBizeventMessageResponse>(await DoRequestAsync("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test
         */
        public QueryDemoCjtestCjResResponse QueryDemoCjtestCjRes(QueryDemoCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoCjtestCjResEx(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test
         */
        public async Task<QueryDemoCjtestCjResResponse> QueryDemoCjtestCjResAsync(QueryDemoCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoCjtestCjResExAsync(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test
         */
        public QueryDemoCjtestCjResResponse QueryDemoCjtestCjResEx(QueryDemoCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCjtestCjResResponse>(DoRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test
         */
        public async Task<QueryDemoCjtestCjResResponse> QueryDemoCjtestCjResExAsync(QueryDemoCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCjtestCjResResponse>(await DoRequestAsync("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestc(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishDemoSaasTestTestcEx(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcAsync(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishDemoSaasTestTestcExAsync(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestcEx(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(DoRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcExAsync(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(await DoRequestAsync("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesth(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTesthEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthAsync(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTesthExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesthEx(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(DoRequest("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthExAsync(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(await DoRequestAsync("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTesti(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTestiEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiAsync(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTestiExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTestiEx(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(DoRequest("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiExAsync(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(await DoRequestAsync("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ReplaceDemoSaasTestTestjResponse ReplaceDemoSaasTestTestj(ReplaceDemoSaasTestTestjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceDemoSaasTestTestjEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ReplaceDemoSaasTestTestjResponse> ReplaceDemoSaasTestTestjAsync(ReplaceDemoSaasTestTestjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceDemoSaasTestTestjExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ReplaceDemoSaasTestTestjResponse ReplaceDemoSaasTestTestjEx(ReplaceDemoSaasTestTestjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDemoSaasTestTestjResponse>(DoRequest("1.0", "demo.saas.test.testj.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ReplaceDemoSaasTestTestjResponse> ReplaceDemoSaasTestTestjExAsync(ReplaceDemoSaasTestTestjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDemoSaasTestTestjResponse>(await DoRequestAsync("1.0", "demo.saas.test.testj.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 2
         * Summary: 2
         */
        public QueryDemoTestyyQResponse QueryDemoTestyyQ(QueryDemoTestyyQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestyyQEx(request, headers, runtime);
        }

        /**
         * Description: 2
         * Summary: 2
         */
        public async Task<QueryDemoTestyyQResponse> QueryDemoTestyyQAsync(QueryDemoTestyyQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestyyQExAsync(request, headers, runtime);
        }

        /**
         * Description: 2
         * Summary: 2
         */
        public QueryDemoTestyyQResponse QueryDemoTestyyQEx(QueryDemoTestyyQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestyyQResponse>(DoRequest("1.0", "demo.testyy.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 2
         * Summary: 2
         */
        public async Task<QueryDemoTestyyQResponse> QueryDemoTestyyQExAsync(QueryDemoTestyyQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestyyQResponse>(await DoRequestAsync("1.0", "demo.testyy.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public QueryDemoTestzzQResponse QueryDemoTestzzQ(QueryDemoTestzzQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestzzQEx(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public async Task<QueryDemoTestzzQResponse> QueryDemoTestzzQAsync(QueryDemoTestzzQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestzzQExAsync(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public QueryDemoTestzzQResponse QueryDemoTestzzQEx(QueryDemoTestzzQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestzzQResponse>(DoRequest("1.0", "demo.testzz.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public async Task<QueryDemoTestzzQResponse> QueryDemoTestzzQExAsync(QueryDemoTestzzQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestzzQResponse>(await DoRequestAsync("1.0", "demo.testzz.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public QueryDemoTestzzzQResponse QueryDemoTestzzzQ(QueryDemoTestzzzQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestzzzQEx(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public async Task<QueryDemoTestzzzQResponse> QueryDemoTestzzzQAsync(QueryDemoTestzzzQRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestzzzQExAsync(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public QueryDemoTestzzzQResponse QueryDemoTestzzzQEx(QueryDemoTestzzzQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestzzzQResponse>(DoRequest("1.0", "demo.testzzz.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: 1
         */
        public async Task<QueryDemoTestzzzQResponse> QueryDemoTestzzzQExAsync(QueryDemoTestzzzQRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestzzzQResponse>(await DoRequestAsync("1.0", "demo.testzzz.q.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试佐罗接口
         * Summary: 测试佐罗接口
         */
        public QueryDemoZolozFacecompareResponse QueryDemoZolozFacecompare(QueryDemoZolozFacecompareRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoZolozFacecompareEx(request, headers, runtime);
        }

        /**
         * Description: 测试佐罗接口
         * Summary: 测试佐罗接口
         */
        public async Task<QueryDemoZolozFacecompareResponse> QueryDemoZolozFacecompareAsync(QueryDemoZolozFacecompareRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoZolozFacecompareExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试佐罗接口
         * Summary: 测试佐罗接口
         */
        public QueryDemoZolozFacecompareResponse QueryDemoZolozFacecompareEx(QueryDemoZolozFacecompareRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoZolozFacecompareResponse>(DoRequest("1.0", "demo.zoloz.facecompare.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试佐罗接口
         * Summary: 测试佐罗接口
         */
        public async Task<QueryDemoZolozFacecompareResponse> QueryDemoZolozFacecompareExAsync(QueryDemoZolozFacecompareRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoZolozFacecompareResponse>(await DoRequestAsync("1.0", "demo.zoloz.facecompare.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryDemoXyzDemoXxxResponse QueryDemoXyzDemoXxx(QueryDemoXyzDemoXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoXyzDemoXxxEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryDemoXyzDemoXxxResponse> QueryDemoXyzDemoXxxAsync(QueryDemoXyzDemoXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoXyzDemoXxxExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryDemoXyzDemoXxxResponse QueryDemoXyzDemoXxxEx(QueryDemoXyzDemoXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoXyzDemoXxxResponse>(DoRequest("1.0", "demo.xyz.demo.xxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryDemoXyzDemoXxxResponse> QueryDemoXyzDemoXxxExAsync(QueryDemoXyzDemoXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoXyzDemoXxxResponse>(await DoRequestAsync("1.0", "demo.xyz.demo.xxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
