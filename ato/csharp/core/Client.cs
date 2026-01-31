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
                        {"sdk_version", "1.19.3"},
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
                        {"sdk_version", "1.19.3"},
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
         * Description: 数据提供方可以通过此接口传输数据，触达给消费方
         * Summary: 用户信息传输代理
         */
        public TransferBrokerUserdataResponse TransferBrokerUserdata(TransferBrokerUserdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferBrokerUserdataEx(request, headers, runtime);
        }

        /**
         * Description: 数据提供方可以通过此接口传输数据，触达给消费方
         * Summary: 用户信息传输代理
         */
        public async Task<TransferBrokerUserdataResponse> TransferBrokerUserdataAsync(TransferBrokerUserdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferBrokerUserdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据提供方可以通过此接口传输数据，触达给消费方
         * Summary: 用户信息传输代理
         */
        public TransferBrokerUserdataResponse TransferBrokerUserdataEx(TransferBrokerUserdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferBrokerUserdataResponse>(DoRequest("1.0", "antchain.ato.broker.userdata.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据提供方可以通过此接口传输数据，触达给消费方
         * Summary: 用户信息传输代理
         */
        public async Task<TransferBrokerUserdataResponse> TransferBrokerUserdataExAsync(TransferBrokerUserdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferBrokerUserdataResponse>(await DoRequestAsync("1.0", "antchain.ato.broker.userdata.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 京东分账关系绑定创建/更新
         * Summary: 京东分账关系绑定创建/更新
         */
        public CreateJdFunddividerelationResponse CreateJdFunddividerelation(CreateJdFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJdFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 京东分账关系绑定创建/更新
         * Summary: 京东分账关系绑定创建/更新
         */
        public async Task<CreateJdFunddividerelationResponse> CreateJdFunddividerelationAsync(CreateJdFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJdFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 京东分账关系绑定创建/更新
         * Summary: 京东分账关系绑定创建/更新
         */
        public CreateJdFunddividerelationResponse CreateJdFunddividerelationEx(CreateJdFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJdFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.jd.funddividerelation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 京东分账关系绑定创建/更新
         * Summary: 京东分账关系绑定创建/更新
         */
        public async Task<CreateJdFunddividerelationResponse> CreateJdFunddividerelationExAsync(CreateJdFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJdFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.jd.funddividerelation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询京东支付分账关系绑定状态
         * Summary: 查询京东支付分账关系绑定状态
         */
        public QueryJdFunddividerelationResponse QueryJdFunddividerelation(QueryJdFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJdFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询京东支付分账关系绑定状态
         * Summary: 查询京东支付分账关系绑定状态
         */
        public async Task<QueryJdFunddividerelationResponse> QueryJdFunddividerelationAsync(QueryJdFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJdFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询京东支付分账关系绑定状态
         * Summary: 查询京东支付分账关系绑定状态
         */
        public QueryJdFunddividerelationResponse QueryJdFunddividerelationEx(QueryJdFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJdFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.jd.funddividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询京东支付分账关系绑定状态
         * Summary: 查询京东支付分账关系绑定状态
         */
        public async Task<QueryJdFunddividerelationResponse> QueryJdFunddividerelationExAsync(QueryJdFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJdFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.jd.funddividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统demo
         * Summary: 资方管理系统demo
         */
        public QueryInnerFundmngdemoResponse QueryInnerFundmngdemo(QueryInnerFundmngdemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngdemoEx(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统demo
         * Summary: 资方管理系统demo
         */
        public async Task<QueryInnerFundmngdemoResponse> QueryInnerFundmngdemoAsync(QueryInnerFundmngdemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngdemoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统demo
         * Summary: 资方管理系统demo
         */
        public QueryInnerFundmngdemoResponse QueryInnerFundmngdemoEx(QueryInnerFundmngdemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngdemoResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngdemo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统demo
         * Summary: 资方管理系统demo
         */
        public async Task<QueryInnerFundmngdemoResponse> QueryInnerFundmngdemoExAsync(QueryInnerFundmngdemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngdemoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngdemo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统融资订单列表
         * Summary: 资方管理系统融资订单列表
         */
        public PagequeryInnerFundmngfinanceorderResponse PagequeryInnerFundmngfinanceorder(PagequeryInnerFundmngfinanceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerFundmngfinanceorderEx(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统融资订单列表
         * Summary: 资方管理系统融资订单列表
         */
        public async Task<PagequeryInnerFundmngfinanceorderResponse> PagequeryInnerFundmngfinanceorderAsync(PagequeryInnerFundmngfinanceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerFundmngfinanceorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统融资订单列表
         * Summary: 资方管理系统融资订单列表
         */
        public PagequeryInnerFundmngfinanceorderResponse PagequeryInnerFundmngfinanceorderEx(PagequeryInnerFundmngfinanceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngfinanceorderResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngfinanceorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统融资订单列表
         * Summary: 资方管理系统融资订单列表
         */
        public async Task<PagequeryInnerFundmngfinanceorderResponse> PagequeryInnerFundmngfinanceorderExAsync(PagequeryInnerFundmngfinanceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngfinanceorderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngfinanceorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研系分设计-提交数据下载申请
         * Summary: 资方免研-提交数据下载申请
         */
        public SubmitInnerFundmngdatadownloadResponse SubmitInnerFundmngdatadownload(SubmitInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerFundmngdatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 资方免研系分设计-提交数据下载申请
         * Summary: 资方免研-提交数据下载申请
         */
        public async Task<SubmitInnerFundmngdatadownloadResponse> SubmitInnerFundmngdatadownloadAsync(SubmitInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerFundmngdatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方免研系分设计-提交数据下载申请
         * Summary: 资方免研-提交数据下载申请
         */
        public SubmitInnerFundmngdatadownloadResponse SubmitInnerFundmngdatadownloadEx(SubmitInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngdatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngdatadownload.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研系分设计-提交数据下载申请
         * Summary: 资方免研-提交数据下载申请
         */
        public async Task<SubmitInnerFundmngdatadownloadResponse> SubmitInnerFundmngdatadownloadExAsync(SubmitInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngdatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngdatadownload.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研-查询数据下载列表
         * Summary: 资方免研-查询数据下载列表
         */
        public PagequeryInnerFundmngdatadownloadResponse PagequeryInnerFundmngdatadownload(PagequeryInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerFundmngdatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 资方免研-查询数据下载列表
         * Summary: 资方免研-查询数据下载列表
         */
        public async Task<PagequeryInnerFundmngdatadownloadResponse> PagequeryInnerFundmngdatadownloadAsync(PagequeryInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerFundmngdatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方免研-查询数据下载列表
         * Summary: 资方免研-查询数据下载列表
         */
        public PagequeryInnerFundmngdatadownloadResponse PagequeryInnerFundmngdatadownloadEx(PagequeryInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngdatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngdatadownload.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研-查询数据下载列表
         * Summary: 资方免研-查询数据下载列表
         */
        public async Task<PagequeryInnerFundmngdatadownloadResponse> PagequeryInnerFundmngdatadownloadExAsync(PagequeryInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngdatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngdatadownload.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研-删除下载任务
         * Summary: 资方免研-删除下载任务
         */
        public DeleteInnerFundmngdatadownloadResponse DeleteInnerFundmngdatadownload(DeleteInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerFundmngdatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 资方免研-删除下载任务
         * Summary: 资方免研-删除下载任务
         */
        public async Task<DeleteInnerFundmngdatadownloadResponse> DeleteInnerFundmngdatadownloadAsync(DeleteInnerFundmngdatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerFundmngdatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方免研-删除下载任务
         * Summary: 资方免研-删除下载任务
         */
        public DeleteInnerFundmngdatadownloadResponse DeleteInnerFundmngdatadownloadEx(DeleteInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerFundmngdatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngdatadownload.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方免研-删除下载任务
         * Summary: 资方免研-删除下载任务
         */
        public async Task<DeleteInnerFundmngdatadownloadResponse> DeleteInnerFundmngdatadownloadExAsync(DeleteInnerFundmngdatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerFundmngdatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngdatadownload.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户付款项目查询
         * Summary: 商户付款项目查询
         */
        public QueryInnerFundmngmerchantpayitemResponse QueryInnerFundmngmerchantpayitem(QueryInnerFundmngmerchantpayitemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngmerchantpayitemEx(request, headers, runtime);
        }

        /**
         * Description: 商户付款项目查询
         * Summary: 商户付款项目查询
         */
        public async Task<QueryInnerFundmngmerchantpayitemResponse> QueryInnerFundmngmerchantpayitemAsync(QueryInnerFundmngmerchantpayitemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngmerchantpayitemExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户付款项目查询
         * Summary: 商户付款项目查询
         */
        public QueryInnerFundmngmerchantpayitemResponse QueryInnerFundmngmerchantpayitemEx(QueryInnerFundmngmerchantpayitemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngmerchantpayitemResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantpayitem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户付款项目查询
         * Summary: 商户付款项目查询
         */
        public async Task<QueryInnerFundmngmerchantpayitemResponse> QueryInnerFundmngmerchantpayitemExAsync(QueryInnerFundmngmerchantpayitemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngmerchantpayitemResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantpayitem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约承诺创建
         * Summary: 商户履约承诺创建
         */
        public CreateInnerFundmngmerchantpromiseResponse CreateInnerFundmngmerchantpromise(CreateInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerFundmngmerchantpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约承诺创建
         * Summary: 商户履约承诺创建
         */
        public async Task<CreateInnerFundmngmerchantpromiseResponse> CreateInnerFundmngmerchantpromiseAsync(CreateInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerFundmngmerchantpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约承诺创建
         * Summary: 商户履约承诺创建
         */
        public CreateInnerFundmngmerchantpromiseResponse CreateInnerFundmngmerchantpromiseEx(CreateInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFundmngmerchantpromiseResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约承诺创建
         * Summary: 商户履约承诺创建
         */
        public async Task<CreateInnerFundmngmerchantpromiseResponse> CreateInnerFundmngmerchantpromiseExAsync(CreateInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFundmngmerchantpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方放款申请查询
         * Summary: 资方放款申请查询
         */
        public QueryInnerFundmngloanapplyResponse QueryInnerFundmngloanapply(QueryInnerFundmngloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngloanapplyEx(request, headers, runtime);
        }

        /**
         * Description: 资方放款申请查询
         * Summary: 资方放款申请查询
         */
        public async Task<QueryInnerFundmngloanapplyResponse> QueryInnerFundmngloanapplyAsync(QueryInnerFundmngloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngloanapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方放款申请查询
         * Summary: 资方放款申请查询
         */
        public QueryInnerFundmngloanapplyResponse QueryInnerFundmngloanapplyEx(QueryInnerFundmngloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngloanapplyResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngloanapply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方放款申请查询
         * Summary: 资方放款申请查询
         */
        public async Task<QueryInnerFundmngloanapplyResponse> QueryInnerFundmngloanapplyExAsync(QueryInnerFundmngloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngloanapplyResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngloanapply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方账户信息查询
         * Summary: 资方账户信息查询
         */
        public QueryInnerFundmngaccountinfoResponse QueryInnerFundmngaccountinfo(QueryInnerFundmngaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngaccountinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方账户信息查询
         * Summary: 资方账户信息查询
         */
        public async Task<QueryInnerFundmngaccountinfoResponse> QueryInnerFundmngaccountinfoAsync(QueryInnerFundmngaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngaccountinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方账户信息查询
         * Summary: 资方账户信息查询
         */
        public QueryInnerFundmngaccountinfoResponse QueryInnerFundmngaccountinfoEx(QueryInnerFundmngaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngaccountinfoResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngaccountinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方账户信息查询
         * Summary: 资方账户信息查询
         */
        public async Task<QueryInnerFundmngaccountinfoResponse> QueryInnerFundmngaccountinfoExAsync(QueryInnerFundmngaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngaccountinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngaccountinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 放款结果同步
         * Summary: 放款结果同步
         */
        public SyncInnerFundmngloanresultsResponse SyncInnerFundmngloanresults(SyncInnerFundmngloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerFundmngloanresultsEx(request, headers, runtime);
        }

        /**
         * Description: 放款结果同步
         * Summary: 放款结果同步
         */
        public async Task<SyncInnerFundmngloanresultsResponse> SyncInnerFundmngloanresultsAsync(SyncInnerFundmngloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerFundmngloanresultsExAsync(request, headers, runtime);
        }

        /**
         * Description: 放款结果同步
         * Summary: 放款结果同步
         */
        public SyncInnerFundmngloanresultsResponse SyncInnerFundmngloanresultsEx(SyncInnerFundmngloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerFundmngloanresultsResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 放款结果同步
         * Summary: 放款结果同步
         */
        public async Task<SyncInnerFundmngloanresultsResponse> SyncInnerFundmngloanresultsExAsync(SyncInnerFundmngloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerFundmngloanresultsResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
         * Summary: 资产凭证创建
         */
        public CreateInnerFundmngcreditResponse CreateInnerFundmngcredit(CreateInnerFundmngcreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerFundmngcreditEx(request, headers, runtime);
        }

        /**
         * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
         * Summary: 资产凭证创建
         */
        public async Task<CreateInnerFundmngcreditResponse> CreateInnerFundmngcreditAsync(CreateInnerFundmngcreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerFundmngcreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
         * Summary: 资产凭证创建
         */
        public CreateInnerFundmngcreditResponse CreateInnerFundmngcreditEx(CreateInnerFundmngcreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFundmngcreditResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngcredit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
         * Summary: 资产凭证创建
         */
        public async Task<CreateInnerFundmngcreditResponse> CreateInnerFundmngcreditExAsync(CreateInnerFundmngcreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFundmngcreditResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngcredit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据订单号查询资产凭证信息
         * Summary: 资产凭证查询
         */
        public QueryInnerFundmngcreditResponse QueryInnerFundmngcredit(QueryInnerFundmngcreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngcreditEx(request, headers, runtime);
        }

        /**
         * Description: 可以根据订单号查询资产凭证信息
         * Summary: 资产凭证查询
         */
        public async Task<QueryInnerFundmngcreditResponse> QueryInnerFundmngcreditAsync(QueryInnerFundmngcreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngcreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 可以根据订单号查询资产凭证信息
         * Summary: 资产凭证查询
         */
        public QueryInnerFundmngcreditResponse QueryInnerFundmngcreditEx(QueryInnerFundmngcreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngcreditResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngcredit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据订单号查询资产凭证信息
         * Summary: 资产凭证查询
         */
        public async Task<QueryInnerFundmngcreditResponse> QueryInnerFundmngcreditExAsync(QueryInnerFundmngcreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngcreditResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngcredit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
         * Summary: 资方管理系统订单详情查询
         */
        public DetailInnerFundmngorderResponse DetailInnerFundmngorder(DetailInnerFundmngorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerFundmngorderEx(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
         * Summary: 资方管理系统订单详情查询
         */
        public async Task<DetailInnerFundmngorderResponse> DetailInnerFundmngorderAsync(DetailInnerFundmngorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerFundmngorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
         * Summary: 资方管理系统订单详情查询
         */
        public DetailInnerFundmngorderResponse DetailInnerFundmngorderEx(DetailInnerFundmngorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerFundmngorderResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngorder.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
         * Summary: 资方管理系统订单详情查询
         */
        public async Task<DetailInnerFundmngorderResponse> DetailInnerFundmngorderExAsync(DetailInnerFundmngorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerFundmngorderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngorder.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: （资方控制台）商户履约查询
         * Summary: 商户履约查询(资方控制台)
         */
        public QueryInnerFundmngmerchantperformanceResponse QueryInnerFundmngmerchantperformance(QueryInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngmerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: （资方控制台）商户履约查询
         * Summary: 商户履约查询(资方控制台)
         */
        public async Task<QueryInnerFundmngmerchantperformanceResponse> QueryInnerFundmngmerchantperformanceAsync(QueryInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngmerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: （资方控制台）商户履约查询
         * Summary: 商户履约查询(资方控制台)
         */
        public QueryInnerFundmngmerchantperformanceResponse QueryInnerFundmngmerchantperformanceEx(QueryInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngmerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantperformance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: （资方控制台）商户履约查询
         * Summary: 商户履约查询(资方控制台)
         */
        public async Task<QueryInnerFundmngmerchantperformanceResponse> QueryInnerFundmngmerchantperformanceExAsync(QueryInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngmerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantperformance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
         * Summary: 资方控制台商户履约其他方式还款
         */
        public RepayInnerFundmngmerchantperformanceResponse RepayInnerFundmngmerchantperformance(RepayInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayInnerFundmngmerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
         * Summary: 资方控制台商户履约其他方式还款
         */
        public async Task<RepayInnerFundmngmerchantperformanceResponse> RepayInnerFundmngmerchantperformanceAsync(RepayInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayInnerFundmngmerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
         * Summary: 资方控制台商户履约其他方式还款
         */
        public RepayInnerFundmngmerchantperformanceResponse RepayInnerFundmngmerchantperformanceEx(RepayInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayInnerFundmngmerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantperformance.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
         * Summary: 资方控制台商户履约其他方式还款
         */
        public async Task<RepayInnerFundmngmerchantperformanceResponse> RepayInnerFundmngmerchantperformanceExAsync(RepayInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayInnerFundmngmerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantperformance.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，赎回商户履约
         * Summary: 资方控制台商户履约赎回
         */
        public RedeemInnerFundmngmerchantperformanceResponse RedeemInnerFundmngmerchantperformance(RedeemInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RedeemInnerFundmngmerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用，赎回商户履约
         * Summary: 资方控制台商户履约赎回
         */
        public async Task<RedeemInnerFundmngmerchantperformanceResponse> RedeemInnerFundmngmerchantperformanceAsync(RedeemInnerFundmngmerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RedeemInnerFundmngmerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用，赎回商户履约
         * Summary: 资方控制台商户履约赎回
         */
        public RedeemInnerFundmngmerchantperformanceResponse RedeemInnerFundmngmerchantperformanceEx(RedeemInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RedeemInnerFundmngmerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantperformance.redeem", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，赎回商户履约
         * Summary: 资方控制台商户履约赎回
         */
        public async Task<RedeemInnerFundmngmerchantperformanceResponse> RedeemInnerFundmngmerchantperformanceExAsync(RedeemInnerFundmngmerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RedeemInnerFundmngmerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantperformance.redeem", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台提交批量放款
         * Summary: 资方控制台提交批量放款
         */
        public SubmitInnerFundmngbatchloanResponse SubmitInnerFundmngbatchloan(SubmitInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerFundmngbatchloanEx(request, headers, runtime);
        }

        /**
         * Description: 资方控制台提交批量放款
         * Summary: 资方控制台提交批量放款
         */
        public async Task<SubmitInnerFundmngbatchloanResponse> SubmitInnerFundmngbatchloanAsync(SubmitInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerFundmngbatchloanExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方控制台提交批量放款
         * Summary: 资方控制台提交批量放款
         */
        public SubmitInnerFundmngbatchloanResponse SubmitInnerFundmngbatchloanEx(SubmitInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngbatchloanResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngbatchloan.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台提交批量放款
         * Summary: 资方控制台提交批量放款
         */
        public async Task<SubmitInnerFundmngbatchloanResponse> SubmitInnerFundmngbatchloanExAsync(SubmitInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngbatchloanResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngbatchloan.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台批量放款提交前预览
         * Summary: 资方控制台批量放款提交前预览
         */
        public PreviewInnerFundmngbatchloanResponse PreviewInnerFundmngbatchloan(PreviewInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewInnerFundmngbatchloanEx(request, headers, runtime);
        }

        /**
         * Description: 资方控制台批量放款提交前预览
         * Summary: 资方控制台批量放款提交前预览
         */
        public async Task<PreviewInnerFundmngbatchloanResponse> PreviewInnerFundmngbatchloanAsync(PreviewInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewInnerFundmngbatchloanExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方控制台批量放款提交前预览
         * Summary: 资方控制台批量放款提交前预览
         */
        public PreviewInnerFundmngbatchloanResponse PreviewInnerFundmngbatchloanEx(PreviewInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewInnerFundmngbatchloanResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngbatchloan.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台批量放款提交前预览
         * Summary: 资方控制台批量放款提交前预览
         */
        public async Task<PreviewInnerFundmngbatchloanResponse> PreviewInnerFundmngbatchloanExAsync(PreviewInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewInnerFundmngbatchloanResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngbatchloan.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台批量放款记录分页查询
         * Summary: 资方控制台批量放款记录分页查询
         */
        public PagequeryInnerFundmngbatchloanResponse PagequeryInnerFundmngbatchloan(PagequeryInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerFundmngbatchloanEx(request, headers, runtime);
        }

        /**
         * Description: 资方控制台批量放款记录分页查询
         * Summary: 资方控制台批量放款记录分页查询
         */
        public async Task<PagequeryInnerFundmngbatchloanResponse> PagequeryInnerFundmngbatchloanAsync(PagequeryInnerFundmngbatchloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerFundmngbatchloanExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方控制台批量放款记录分页查询
         * Summary: 资方控制台批量放款记录分页查询
         */
        public PagequeryInnerFundmngbatchloanResponse PagequeryInnerFundmngbatchloanEx(PagequeryInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngbatchloanResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngbatchloan.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方控制台批量放款记录分页查询
         * Summary: 资方控制台批量放款记录分页查询
         */
        public async Task<PagequeryInnerFundmngbatchloanResponse> PagequeryInnerFundmngbatchloanExAsync(PagequeryInnerFundmngbatchloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngbatchloanResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngbatchloan.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
         * Summary: 商户履约计划渲染
         */
        public RenderInnerFundmngmerchantpromiseResponse RenderInnerFundmngmerchantpromise(RenderInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RenderInnerFundmngmerchantpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
         * Summary: 商户履约计划渲染
         */
        public async Task<RenderInnerFundmngmerchantpromiseResponse> RenderInnerFundmngmerchantpromiseAsync(RenderInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RenderInnerFundmngmerchantpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
         * Summary: 商户履约计划渲染
         */
        public RenderInnerFundmngmerchantpromiseResponse RenderInnerFundmngmerchantpromiseEx(RenderInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenderInnerFundmngmerchantpromiseResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantpromise.render", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
         * Summary: 商户履约计划渲染
         */
        public async Task<RenderInnerFundmngmerchantpromiseResponse> RenderInnerFundmngmerchantpromiseExAsync(RenderInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenderInnerFundmngmerchantpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantpromise.render", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约计划初始化
         * Summary: 商户履约计划初始化
         */
        public InitInnerFundmngmerchantpromiseResponse InitInnerFundmngmerchantpromise(InitInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitInnerFundmngmerchantpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约计划初始化
         * Summary: 商户履约计划初始化
         */
        public async Task<InitInnerFundmngmerchantpromiseResponse> InitInnerFundmngmerchantpromiseAsync(InitInnerFundmngmerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitInnerFundmngmerchantpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约计划初始化
         * Summary: 商户履约计划初始化
         */
        public InitInnerFundmngmerchantpromiseResponse InitInnerFundmngmerchantpromiseEx(InitInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitInnerFundmngmerchantpromiseResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngmerchantpromise.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约计划初始化
         * Summary: 商户履约计划初始化
         */
        public async Task<InitInnerFundmngmerchantpromiseResponse> InitInnerFundmngmerchantpromiseExAsync(InitInnerFundmngmerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitInnerFundmngmerchantpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngmerchantpromise.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方待办事件处理
         * Summary: 资方待办事件处理
         */
        public SubmitInnerFundmngpendingeventResponse SubmitInnerFundmngpendingevent(SubmitInnerFundmngpendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerFundmngpendingeventEx(request, headers, runtime);
        }

        /**
         * Description: 资方待办事件处理
         * Summary: 资方待办事件处理
         */
        public async Task<SubmitInnerFundmngpendingeventResponse> SubmitInnerFundmngpendingeventAsync(SubmitInnerFundmngpendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerFundmngpendingeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方待办事件处理
         * Summary: 资方待办事件处理
         */
        public SubmitInnerFundmngpendingeventResponse SubmitInnerFundmngpendingeventEx(SubmitInnerFundmngpendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngpendingeventResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngpendingevent.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方待办事件处理
         * Summary: 资方待办事件处理
         */
        public async Task<SubmitInnerFundmngpendingeventResponse> SubmitInnerFundmngpendingeventExAsync(SubmitInnerFundmngpendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFundmngpendingeventResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngpendingevent.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方待办事件查询
         * Summary: 资方待办事件查询
         */
        public PagequeryInnerFundmngpendingeventResponse PagequeryInnerFundmngpendingevent(PagequeryInnerFundmngpendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerFundmngpendingeventEx(request, headers, runtime);
        }

        /**
         * Description: 资方待办事件查询
         * Summary: 资方待办事件查询
         */
        public async Task<PagequeryInnerFundmngpendingeventResponse> PagequeryInnerFundmngpendingeventAsync(PagequeryInnerFundmngpendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerFundmngpendingeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方待办事件查询
         * Summary: 资方待办事件查询
         */
        public PagequeryInnerFundmngpendingeventResponse PagequeryInnerFundmngpendingeventEx(PagequeryInnerFundmngpendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngpendingeventResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngpendingevent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方待办事件查询
         * Summary: 资方待办事件查询
         */
        public async Task<PagequeryInnerFundmngpendingeventResponse> PagequeryInnerFundmngpendingeventExAsync(PagequeryInnerFundmngpendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFundmngpendingeventResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngpendingevent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询担保方信息
         * Summary: 查询担保方信息
         */
        public QueryInnerFundmngguaranteeinfoResponse QueryInnerFundmngguaranteeinfo(QueryInnerFundmngguaranteeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFundmngguaranteeinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询担保方信息
         * Summary: 查询担保方信息
         */
        public async Task<QueryInnerFundmngguaranteeinfoResponse> QueryInnerFundmngguaranteeinfoAsync(QueryInnerFundmngguaranteeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFundmngguaranteeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询担保方信息
         * Summary: 查询担保方信息
         */
        public QueryInnerFundmngguaranteeinfoResponse QueryInnerFundmngguaranteeinfoEx(QueryInnerFundmngguaranteeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngguaranteeinfoResponse>(DoRequest("1.0", "antchain.ato.inner.fundmngguaranteeinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询担保方信息
         * Summary: 查询担保方信息
         */
        public async Task<QueryInnerFundmngguaranteeinfoResponse> QueryInnerFundmngguaranteeinfoExAsync(QueryInnerFundmngguaranteeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFundmngguaranteeinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.fundmngguaranteeinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
                request.FileObject = null;
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
                request.FileObject = null;
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
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public AuthFundFlowResponse AuthFundFlow(AuthFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public async Task<AuthFundFlowResponse> AuthFundFlowAsync(AuthFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public AuthFundFlowResponse AuthFundFlowEx(AuthFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
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
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public GetFundOrderfullinfoResponse GetFundOrderfullinfo(GetFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public async Task<GetFundOrderfullinfoResponse> GetFundOrderfullinfoAsync(GetFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public GetFundOrderfullinfoResponse GetFundOrderfullinfoEx(GetFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public async Task<GetFundOrderfullinfoResponse> GetFundOrderfullinfoExAsync(GetFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public NotifyFundFlowResponse NotifyFundFlow(NotifyFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public async Task<NotifyFundFlowResponse> NotifyFundFlowAsync(NotifyFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public NotifyFundFlowResponse NotifyFundFlowEx(NotifyFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public async Task<NotifyFundFlowResponse> NotifyFundFlowExAsync(NotifyFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public UploadFundCreditResponse UploadFundCredit(UploadFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadFundCreditEx(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public async Task<UploadFundCreditResponse> UploadFundCreditAsync(UploadFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadFundCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public UploadFundCreditResponse UploadFundCreditEx(UploadFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFundCreditResponse>(DoRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public async Task<UploadFundCreditResponse> UploadFundCreditExAsync(UploadFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFundCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public QueryFundCreditResponse QueryFundCredit(QueryFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundCreditEx(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public async Task<QueryFundCreditResponse> QueryFundCreditAsync(QueryFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public QueryFundCreditResponse QueryFundCreditEx(QueryFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditResponse>(DoRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public async Task<QueryFundCreditResponse> QueryFundCreditExAsync(QueryFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public SyncFundFinanceprecheckresultResponse SyncFundFinanceprecheckresult(SyncFundFinanceprecheckresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundFinanceprecheckresultEx(request, headers, runtime);
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public async Task<SyncFundFinanceprecheckresultResponse> SyncFundFinanceprecheckresultAsync(SyncFundFinanceprecheckresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundFinanceprecheckresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public SyncFundFinanceprecheckresultResponse SyncFundFinanceprecheckresultEx(SyncFundFinanceprecheckresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFinanceprecheckresultResponse>(DoRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public async Task<SyncFundFinanceprecheckresultResponse> SyncFundFinanceprecheckresultExAsync(SyncFundFinanceprecheckresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFinanceprecheckresultResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public QueryFundCompensateaccountResponse QueryFundCompensateaccount(QueryFundCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundCompensateaccountEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public async Task<QueryFundCompensateaccountResponse> QueryFundCompensateaccountAsync(QueryFundCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundCompensateaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public QueryFundCompensateaccountResponse QueryFundCompensateaccountEx(QueryFundCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCompensateaccountResponse>(DoRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public async Task<QueryFundCompensateaccountResponse> QueryFundCompensateaccountExAsync(QueryFundCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCompensateaccountResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public GetFundOrderfinanceinfoResponse GetFundOrderfinanceinfo(GetFundOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundOrderfinanceinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public async Task<GetFundOrderfinanceinfoResponse> GetFundOrderfinanceinfoAsync(GetFundOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundOrderfinanceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public GetFundOrderfinanceinfoResponse GetFundOrderfinanceinfoEx(GetFundOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfinanceinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public async Task<GetFundOrderfinanceinfoResponse> GetFundOrderfinanceinfoExAsync(GetFundOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundOrderfinanceinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddFundDividerelationResponse AddFundDividerelation(AddFundDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddFundDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddFundDividerelationResponse> AddFundDividerelationAsync(AddFundDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddFundDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddFundDividerelationResponse AddFundDividerelationEx(AddFundDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFundDividerelationResponse>(DoRequest("1.0", "antchain.ato.fund.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddFundDividerelationResponse> AddFundDividerelationExAsync(AddFundDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFundDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryFundDividerelationResponse QueryFundDividerelation(QueryFundDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryFundDividerelationResponse> QueryFundDividerelationAsync(QueryFundDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryFundDividerelationResponse QueryFundDividerelationEx(QueryFundDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundDividerelationResponse>(DoRequest("1.0", "antchain.ato.fund.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryFundDividerelationResponse> QueryFundDividerelationExAsync(QueryFundDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public ApplyFundCreditutilizationResponse ApplyFundCreditutilization(ApplyFundCreditutilizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyFundCreditutilizationEx(request, headers, runtime);
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public async Task<ApplyFundCreditutilizationResponse> ApplyFundCreditutilizationAsync(ApplyFundCreditutilizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyFundCreditutilizationExAsync(request, headers, runtime);
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public ApplyFundCreditutilizationResponse ApplyFundCreditutilizationEx(ApplyFundCreditutilizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFundCreditutilizationResponse>(DoRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public async Task<ApplyFundCreditutilizationResponse> ApplyFundCreditutilizationExAsync(ApplyFundCreditutilizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFundCreditutilizationResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小贷融资用信申请订单履约信息
         * Summary: 用信申请订单履约信息
         */
        public ApplyFundAssertorderResponse ApplyFundAssertorder(ApplyFundAssertorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyFundAssertorderEx(request, headers, runtime);
        }

        /**
         * Description: 小贷融资用信申请订单履约信息
         * Summary: 用信申请订单履约信息
         */
        public async Task<ApplyFundAssertorderResponse> ApplyFundAssertorderAsync(ApplyFundAssertorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyFundAssertorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 小贷融资用信申请订单履约信息
         * Summary: 用信申请订单履约信息
         */
        public ApplyFundAssertorderResponse ApplyFundAssertorderEx(ApplyFundAssertorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFundAssertorderResponse>(DoRequest("1.0", "antchain.ato.fund.assertorder.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小贷融资用信申请订单履约信息
         * Summary: 用信申请订单履约信息
         */
        public async Task<ApplyFundAssertorderResponse> ApplyFundAssertorderExAsync(ApplyFundAssertorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFundAssertorderResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.assertorder.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用信查询订单履约信息
         * Summary: 用信查询订单履约信息
         */
        public QueryFundAssertorderResponse QueryFundAssertorder(QueryFundAssertorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundAssertorderEx(request, headers, runtime);
        }

        /**
         * Description: 用信查询订单履约信息
         * Summary: 用信查询订单履约信息
         */
        public async Task<QueryFundAssertorderResponse> QueryFundAssertorderAsync(QueryFundAssertorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundAssertorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 用信查询订单履约信息
         * Summary: 用信查询订单履约信息
         */
        public QueryFundAssertorderResponse QueryFundAssertorderEx(QueryFundAssertorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssertorderResponse>(DoRequest("1.0", "antchain.ato.fund.assertorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用信查询订单履约信息
         * Summary: 用信查询订单履约信息
         */
        public async Task<QueryFundAssertorderResponse> QueryFundAssertorderExAsync(QueryFundAssertorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssertorderResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.assertorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public SyncFundCreditgrantingResponse SyncFundCreditgranting(SyncFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public async Task<SyncFundCreditgrantingResponse> SyncFundCreditgrantingAsync(SyncFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public SyncFundCreditgrantingResponse SyncFundCreditgrantingEx(SyncFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public async Task<SyncFundCreditgrantingResponse> SyncFundCreditgrantingExAsync(SyncFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public AuthFundCreditgrantingResponse AuthFundCreditgranting(AuthFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public async Task<AuthFundCreditgrantingResponse> AuthFundCreditgrantingAsync(AuthFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public AuthFundCreditgrantingResponse AuthFundCreditgrantingEx(AuthFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public async Task<AuthFundCreditgrantingResponse> AuthFundCreditgrantingExAsync(AuthFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小贷融资查询资产报告
         * Summary: 查询资产报告
         */
        public QueryFundAssertreportResponse QueryFundAssertreport(QueryFundAssertreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundAssertreportEx(request, headers, runtime);
        }

        /**
         * Description: 小贷融资查询资产报告
         * Summary: 查询资产报告
         */
        public async Task<QueryFundAssertreportResponse> QueryFundAssertreportAsync(QueryFundAssertreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundAssertreportExAsync(request, headers, runtime);
        }

        /**
         * Description: 小贷融资查询资产报告
         * Summary: 查询资产报告
         */
        public QueryFundAssertreportResponse QueryFundAssertreportEx(QueryFundAssertreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssertreportResponse>(DoRequest("1.0", "antchain.ato.fund.assertreport.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小贷融资查询资产报告
         * Summary: 查询资产报告
         */
        public async Task<QueryFundAssertreportResponse> QueryFundAssertreportExAsync(QueryFundAssertreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssertreportResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.assertreport.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public QueryFundCreditgrantingResponse QueryFundCreditgranting(QueryFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public async Task<QueryFundCreditgrantingResponse> QueryFundCreditgrantingAsync(QueryFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public QueryFundCreditgrantingResponse QueryFundCreditgrantingEx(QueryFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public async Task<QueryFundCreditgrantingResponse> QueryFundCreditgrantingExAsync(QueryFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权信息查询
         * Summary: 授权信息查询
         */
        public QueryFundCreditauthResponse QueryFundCreditauth(QueryFundCreditauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundCreditauthEx(request, headers, runtime);
        }

        /**
         * Description: 授权信息查询
         * Summary: 授权信息查询
         */
        public async Task<QueryFundCreditauthResponse> QueryFundCreditauthAsync(QueryFundCreditauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundCreditauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权信息查询
         * Summary: 授权信息查询
         */
        public QueryFundCreditauthResponse QueryFundCreditauthEx(QueryFundCreditauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditauthResponse>(DoRequest("1.0", "antchain.ato.fund.creditauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权信息查询
         * Summary: 授权信息查询
         */
        public async Task<QueryFundCreditauthResponse> QueryFundCreditauthExAsync(QueryFundCreditauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundCreditauthResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public QueryFundAssetpackageResponse QueryFundAssetpackage(QueryFundAssetpackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFundAssetpackageEx(request, headers, runtime);
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public async Task<QueryFundAssetpackageResponse> QueryFundAssetpackageAsync(QueryFundAssetpackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFundAssetpackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public QueryFundAssetpackageResponse QueryFundAssetpackageEx(QueryFundAssetpackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssetpackageResponse>(DoRequest("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public async Task<QueryFundAssetpackageResponse> QueryFundAssetpackageExAsync(QueryFundAssetpackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFundAssetpackageResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
         * Summary: 允许用户取消(确认用户取消)
         */
        public ConfirmFundUsercancelResponse ConfirmFundUsercancel(ConfirmFundUsercancelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmFundUsercancelEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
         * Summary: 允许用户取消(确认用户取消)
         */
        public async Task<ConfirmFundUsercancelResponse> ConfirmFundUsercancelAsync(ConfirmFundUsercancelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmFundUsercancelExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
         * Summary: 允许用户取消(确认用户取消)
         */
        public ConfirmFundUsercancelResponse ConfirmFundUsercancelEx(ConfirmFundUsercancelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmFundUsercancelResponse>(DoRequest("1.0", "antchain.ato.fund.usercancel.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
         * Summary: 允许用户取消(确认用户取消)
         */
        public async Task<ConfirmFundUsercancelResponse> ConfirmFundUsercancelExAsync(ConfirmFundUsercancelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmFundUsercancelResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.usercancel.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public RepayFundPlanResponse RepayFundPlan(RepayFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayFundPlanEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public async Task<RepayFundPlanResponse> RepayFundPlanAsync(RepayFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayFundPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public RepayFundPlanResponse RepayFundPlanEx(RepayFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayFundPlanResponse>(DoRequest("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public async Task<RepayFundPlanResponse> RepayFundPlanExAsync(RepayFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayFundPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public GetFundCompensatesignurlResponse GetFundCompensatesignurl(GetFundCompensatesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFundCompensatesignurlEx(request, headers, runtime);
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public async Task<GetFundCompensatesignurlResponse> GetFundCompensatesignurlAsync(GetFundCompensatesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFundCompensatesignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public GetFundCompensatesignurlResponse GetFundCompensatesignurlEx(GetFundCompensatesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundCompensatesignurlResponse>(DoRequest("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public async Task<GetFundCompensatesignurlResponse> GetFundCompensatesignurlExAsync(GetFundCompensatesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFundCompensatesignurlResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public ConfirmFundCompensateResponse ConfirmFundCompensate(ConfirmFundCompensateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmFundCompensateEx(request, headers, runtime);
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public async Task<ConfirmFundCompensateResponse> ConfirmFundCompensateAsync(ConfirmFundCompensateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmFundCompensateExAsync(request, headers, runtime);
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public ConfirmFundCompensateResponse ConfirmFundCompensateEx(ConfirmFundCompensateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmFundCompensateResponse>(DoRequest("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public async Task<ConfirmFundCompensateResponse> ConfirmFundCompensateExAsync(ConfirmFundCompensateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmFundCompensateResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public SubmitFundFlowResponse SubmitFundFlow(SubmitFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public async Task<SubmitFundFlowResponse> SubmitFundFlowAsync(SubmitFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public SubmitFundFlowResponse SubmitFundFlowEx(SubmitFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public async Task<SubmitFundFlowResponse> SubmitFundFlowExAsync(SubmitFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public CancelFundFlowResponse CancelFundFlow(CancelFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public async Task<CancelFundFlowResponse> CancelFundFlowAsync(CancelFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public CancelFundFlowResponse CancelFundFlowEx(CancelFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public async Task<CancelFundFlowResponse> CancelFundFlowExAsync(CancelFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方自有合同同步
         * Summary: 资方自有合同同步
         */
        public SyncFundFlowResponse SyncFundFlow(SyncFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方自有合同同步
         * Summary: 资方自有合同同步
         */
        public async Task<SyncFundFlowResponse> SyncFundFlowAsync(SyncFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方自有合同同步
         * Summary: 资方自有合同同步
         */
        public SyncFundFlowResponse SyncFundFlowEx(SyncFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方自有合同同步
         * Summary: 资方自有合同同步
         */
        public async Task<SyncFundFlowResponse> SyncFundFlowExAsync(SyncFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方自有合同签署
         * Summary: 资方自有合同签署
         */
        public SignFundFlowResponse SignFundFlow(SignFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方自有合同签署
         * Summary: 资方自有合同签署
         */
        public async Task<SignFundFlowResponse> SignFundFlowAsync(SignFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方自有合同签署
         * Summary: 资方自有合同签署
         */
        public SignFundFlowResponse SignFundFlowEx(SignFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方自有合同签署
         * Summary: 资方自有合同签署
         */
        public async Task<SignFundFlowResponse> SignFundFlowExAsync(SignFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部调用,商品信息获取
         * Summary: 商品信息获取
         */
        public GetInnerProductResponse GetInnerProduct(GetInnerProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerProductEx(request, headers, runtime);
        }

        /**
         * Description: 内部调用,商品信息获取
         * Summary: 商品信息获取
         */
        public async Task<GetInnerProductResponse> GetInnerProductAsync(GetInnerProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部调用,商品信息获取
         * Summary: 商品信息获取
         */
        public GetInnerProductResponse GetInnerProductEx(GetInnerProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerProductResponse>(DoRequest("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部调用,商品信息获取
         * Summary: 商品信息获取
         */
        public async Task<GetInnerProductResponse> GetInnerProductExAsync(GetInnerProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerProductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato内部服务，客户系统不可访问；租户信息获取
         * Summary: 租户信息获取
         */
        public GetInnerTenantResponse GetInnerTenant(GetInnerTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerTenantEx(request, headers, runtime);
        }

        /**
         * Description: ato内部服务，客户系统不可访问；租户信息获取
         * Summary: 租户信息获取
         */
        public async Task<GetInnerTenantResponse> GetInnerTenantAsync(GetInnerTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: ato内部服务，客户系统不可访问；租户信息获取
         * Summary: 租户信息获取
         */
        public GetInnerTenantResponse GetInnerTenantEx(GetInnerTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerTenantResponse>(DoRequest("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato内部服务，客户系统不可访问；租户信息获取
         * Summary: 租户信息获取
         */
        public async Task<GetInnerTenantResponse> GetInnerTenantExAsync(GetInnerTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerTenantResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
         * Summary: 上报整单结算计量信息
         */
        public SyncInnerMeterforwholeorderResponse SyncInnerMeterforwholeorder(SyncInnerMeterforwholeorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerMeterforwholeorderEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
         * Summary: 上报整单结算计量信息
         */
        public async Task<SyncInnerMeterforwholeorderResponse> SyncInnerMeterforwholeorderAsync(SyncInnerMeterforwholeorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerMeterforwholeorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
         * Summary: 上报整单结算计量信息
         */
        public SyncInnerMeterforwholeorderResponse SyncInnerMeterforwholeorderEx(SyncInnerMeterforwholeorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerMeterforwholeorderResponse>(DoRequest("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
         * Summary: 上报整单结算计量信息
         */
        public async Task<SyncInnerMeterforwholeorderResponse> SyncInnerMeterforwholeorderExAsync(SyncInnerMeterforwholeorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerMeterforwholeorderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部调用，合同签署计量上报接口
         * Summary: 合同签署计量上报同步接口
         */
        public SyncInnerMeterforagsignResponse SyncInnerMeterforagsign(SyncInnerMeterforagsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerMeterforagsignEx(request, headers, runtime);
        }

        /**
         * Description: 内部调用，合同签署计量上报接口
         * Summary: 合同签署计量上报同步接口
         */
        public async Task<SyncInnerMeterforagsignResponse> SyncInnerMeterforagsignAsync(SyncInnerMeterforagsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerMeterforagsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部调用，合同签署计量上报接口
         * Summary: 合同签署计量上报同步接口
         */
        public SyncInnerMeterforagsignResponse SyncInnerMeterforagsignEx(SyncInnerMeterforagsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerMeterforagsignResponse>(DoRequest("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部调用，合同签署计量上报接口
         * Summary: 合同签署计量上报同步接口
         */
        public async Task<SyncInnerMeterforagsignResponse> SyncInnerMeterforagsignExAsync(SyncInnerMeterforagsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerMeterforagsignResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public AllInnerTemplateResponse AllInnerTemplate(AllInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public async Task<AllInnerTemplateResponse> AllInnerTemplateAsync(AllInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public AllInnerTemplateResponse AllInnerTemplateEx(AllInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public async Task<AllInnerTemplateResponse> AllInnerTemplateExAsync(AllInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public ListInnerTemplateResponse ListInnerTemplate(ListInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public async Task<ListInnerTemplateResponse> ListInnerTemplateAsync(ListInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public ListInnerTemplateResponse ListInnerTemplateEx(ListInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public async Task<ListInnerTemplateResponse> ListInnerTemplateExAsync(ListInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public DetailInnerTemplateResponse DetailInnerTemplate(DetailInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public async Task<DetailInnerTemplateResponse> DetailInnerTemplateAsync(DetailInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public DetailInnerTemplateResponse DetailInnerTemplateEx(DetailInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public async Task<DetailInnerTemplateResponse> DetailInnerTemplateExAsync(DetailInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public CreateInnerTemplateResponse CreateInnerTemplate(CreateInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public async Task<CreateInnerTemplateResponse> CreateInnerTemplateAsync(CreateInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public CreateInnerTemplateResponse CreateInnerTemplateEx(CreateInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public async Task<CreateInnerTemplateResponse> CreateInnerTemplateExAsync(CreateInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public SaveInnerTemplateResponse SaveInnerTemplate(SaveInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public async Task<SaveInnerTemplateResponse> SaveInnerTemplateAsync(SaveInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public SaveInnerTemplateResponse SaveInnerTemplateEx(SaveInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public async Task<SaveInnerTemplateResponse> SaveInnerTemplateExAsync(SaveInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板签署区
         * Summary: 保存魔法库模板签署区
         */
        public SaveInnerSignfieldsResponse SaveInnerSignfields(SaveInnerSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveInnerSignfieldsEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板签署区
         * Summary: 保存魔法库模板签署区
         */
        public async Task<SaveInnerSignfieldsResponse> SaveInnerSignfieldsAsync(SaveInnerSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveInnerSignfieldsExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板签署区
         * Summary: 保存魔法库模板签署区
         */
        public SaveInnerSignfieldsResponse SaveInnerSignfieldsEx(SaveInnerSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerSignfieldsResponse>(DoRequest("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板签署区
         * Summary: 保存魔法库模板签署区
         */
        public async Task<SaveInnerSignfieldsResponse> SaveInnerSignfieldsExAsync(SaveInnerSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerSignfieldsResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public PublishInnerTemplateResponse PublishInnerTemplate(PublishInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public async Task<PublishInnerTemplateResponse> PublishInnerTemplateAsync(PublishInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public PublishInnerTemplateResponse PublishInnerTemplateEx(PublishInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public async Task<PublishInnerTemplateResponse> PublishInnerTemplateExAsync(PublishInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public PreviewInnerTemplateResponse PreviewInnerTemplate(PreviewInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public async Task<PreviewInnerTemplateResponse> PreviewInnerTemplateAsync(PreviewInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public PreviewInnerTemplateResponse PreviewInnerTemplateEx(PreviewInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public async Task<PreviewInnerTemplateResponse> PreviewInnerTemplateExAsync(PreviewInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public DeleteInnerTemplateResponse DeleteInnerTemplate(DeleteInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public async Task<DeleteInnerTemplateResponse> DeleteInnerTemplateAsync(DeleteInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public DeleteInnerTemplateResponse DeleteInnerTemplateEx(DeleteInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public async Task<DeleteInnerTemplateResponse> DeleteInnerTemplateExAsync(DeleteInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public CloneInnerTemplateResponse CloneInnerTemplate(CloneInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloneInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public async Task<CloneInnerTemplateResponse> CloneInnerTemplateAsync(CloneInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloneInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public CloneInnerTemplateResponse CloneInnerTemplateEx(CloneInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public async Task<CloneInnerTemplateResponse> CloneInnerTemplateExAsync(CloneInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato文件上传
         * Summary: ato文件上传
         */
        public UploadInnerFileResponse UploadInnerFile(UploadInnerFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadInnerFileEx(request, headers, runtime);
        }

        /**
         * Description: ato文件上传
         * Summary: ato文件上传
         */
        public async Task<UploadInnerFileResponse> UploadInnerFileAsync(UploadInnerFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadInnerFileExAsync(request, headers, runtime);
        }

        /**
         * Description: ato文件上传
         * Summary: ato文件上传
         */
        public UploadInnerFileResponse UploadInnerFileEx(UploadInnerFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInnerFileResponse>(DoRequest("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato文件上传
         * Summary: ato文件上传
         */
        public async Task<UploadInnerFileResponse> UploadInnerFileExAsync(UploadInnerFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInnerFileResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato文件下载
         * Summary: ato文件下载
         */
        public DownloadInnerFileResponse DownloadInnerFile(DownloadInnerFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadInnerFileEx(request, headers, runtime);
        }

        /**
         * Description: ato文件下载
         * Summary: ato文件下载
         */
        public async Task<DownloadInnerFileResponse> DownloadInnerFileAsync(DownloadInnerFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadInnerFileExAsync(request, headers, runtime);
        }

        /**
         * Description: ato文件下载
         * Summary: ato文件下载
         */
        public DownloadInnerFileResponse DownloadInnerFileEx(DownloadInnerFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadInnerFileResponse>(DoRequest("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ato文件下载
         * Summary: ato文件下载
         */
        public async Task<DownloadInnerFileResponse> DownloadInnerFileExAsync(DownloadInnerFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadInnerFileResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 webofficeURL（透传）
         * Summary: 获取 webofficeURL
         */
        public GetInnerTemplateofficeurlResponse GetInnerTemplateofficeurl(GetInnerTemplateofficeurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerTemplateofficeurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取 webofficeURL（透传）
         * Summary: 获取 webofficeURL
         */
        public async Task<GetInnerTemplateofficeurlResponse> GetInnerTemplateofficeurlAsync(GetInnerTemplateofficeurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerTemplateofficeurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取 webofficeURL（透传）
         * Summary: 获取 webofficeURL
         */
        public GetInnerTemplateofficeurlResponse GetInnerTemplateofficeurlEx(GetInnerTemplateofficeurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerTemplateofficeurlResponse>(DoRequest("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 webofficeURL（透传）
         * Summary: 获取 webofficeURL
         */
        public async Task<GetInnerTemplateofficeurlResponse> GetInnerTemplateofficeurlExAsync(GetInnerTemplateofficeurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerTemplateofficeurlResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 魔法库控制台刷新token
         * Summary: 刷新token
         */
        public RefreshInnerTemplatetokenResponse RefreshInnerTemplatetoken(RefreshInnerTemplatetokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefreshInnerTemplatetokenEx(request, headers, runtime);
        }

        /**
         * Description: 魔法库控制台刷新token
         * Summary: 刷新token
         */
        public async Task<RefreshInnerTemplatetokenResponse> RefreshInnerTemplatetokenAsync(RefreshInnerTemplatetokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefreshInnerTemplatetokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 魔法库控制台刷新token
         * Summary: 刷新token
         */
        public RefreshInnerTemplatetokenResponse RefreshInnerTemplatetokenEx(RefreshInnerTemplatetokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshInnerTemplatetokenResponse>(DoRequest("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 魔法库控制台刷新token
         * Summary: 刷新token
         */
        public async Task<RefreshInnerTemplatetokenResponse> RefreshInnerTemplatetokenExAsync(RefreshInnerTemplatetokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshInnerTemplatetokenResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建文本域（组件）
         * Summary: 创建文本域
         */
        public CreateInnerTemplatetextareaResponse CreateInnerTemplatetextarea(CreateInnerTemplatetextareaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerTemplatetextareaEx(request, headers, runtime);
        }

        /**
         * Description: 创建文本域（组件）
         * Summary: 创建文本域
         */
        public async Task<CreateInnerTemplatetextareaResponse> CreateInnerTemplatetextareaAsync(CreateInnerTemplatetextareaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerTemplatetextareaExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建文本域（组件）
         * Summary: 创建文本域
         */
        public CreateInnerTemplatetextareaResponse CreateInnerTemplatetextareaEx(CreateInnerTemplatetextareaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTemplatetextareaResponse>(DoRequest("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建文本域（组件）
         * Summary: 创建文本域
         */
        public async Task<CreateInnerTemplatetextareaResponse> CreateInnerTemplatetextareaExAsync(CreateInnerTemplatetextareaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTemplatetextareaResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public QueryInnerTemplateimageResponse QueryInnerTemplateimage(QueryInnerTemplateimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTemplateimageEx(request, headers, runtime);
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public async Task<QueryInnerTemplateimageResponse> QueryInnerTemplateimageAsync(QueryInnerTemplateimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTemplateimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public QueryInnerTemplateimageResponse QueryInnerTemplateimageEx(QueryInnerTemplateimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateimageResponse>(DoRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public async Task<QueryInnerTemplateimageResponse> QueryInnerTemplateimageExAsync(QueryInnerTemplateimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateimageResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存/编辑分账关系信息
         * Summary: 保存/编辑分账关系信息
         */
        public CreateInnerFunddividerelationResponse CreateInnerFunddividerelation(CreateInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 保存/编辑分账关系信息
         * Summary: 保存/编辑分账关系信息
         */
        public async Task<CreateInnerFunddividerelationResponse> CreateInnerFunddividerelationAsync(CreateInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存/编辑分账关系信息
         * Summary: 保存/编辑分账关系信息
         */
        public CreateInnerFunddividerelationResponse CreateInnerFunddividerelationEx(CreateInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存/编辑分账关系信息
         * Summary: 保存/编辑分账关系信息
         */
        public async Task<CreateInnerFunddividerelationResponse> CreateInnerFunddividerelationExAsync(CreateInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交分账关系信息
         * Summary: 提交分账关系信息
         */
        public SubmitInnerFunddividerelationResponse SubmitInnerFunddividerelation(SubmitInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 提交分账关系信息
         * Summary: 提交分账关系信息
         */
        public async Task<SubmitInnerFunddividerelationResponse> SubmitInnerFunddividerelationAsync(SubmitInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交分账关系信息
         * Summary: 提交分账关系信息
         */
        public SubmitInnerFunddividerelationResponse SubmitInnerFunddividerelationEx(SubmitInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交分账关系信息
         * Summary: 提交分账关系信息
         */
        public async Task<SubmitInnerFunddividerelationResponse> SubmitInnerFunddividerelationExAsync(SubmitInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分账关系信息
         * Summary: 查询分账关系信息
         */
        public QueryInnerFunddividerelationResponse QueryInnerFunddividerelation(QueryInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询分账关系信息
         * Summary: 查询分账关系信息
         */
        public async Task<QueryInnerFunddividerelationResponse> QueryInnerFunddividerelationAsync(QueryInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分账关系信息
         * Summary: 查询分账关系信息
         */
        public QueryInnerFunddividerelationResponse QueryInnerFunddividerelationEx(QueryInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分账关系信息
         * Summary: 查询分账关系信息
         */
        public async Task<QueryInnerFunddividerelationResponse> QueryInnerFunddividerelationExAsync(QueryInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分账关系分页列表
         * Summary: 查询分账关系分页列表
         */
        public PagequeryInnerFunddividerelationResponse PagequeryInnerFunddividerelation(PagequeryInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerFunddividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询分账关系分页列表
         * Summary: 查询分账关系分页列表
         */
        public async Task<PagequeryInnerFunddividerelationResponse> PagequeryInnerFunddividerelationAsync(PagequeryInnerFunddividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerFunddividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分账关系分页列表
         * Summary: 查询分账关系分页列表
         */
        public PagequeryInnerFunddividerelationResponse PagequeryInnerFunddividerelationEx(PagequeryInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFunddividerelationResponse>(DoRequest("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分账关系分页列表
         * Summary: 查询分账关系分页列表
         */
        public async Task<PagequeryInnerFunddividerelationResponse> PagequeryInnerFunddividerelationExAsync(PagequeryInnerFunddividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerFunddividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存租户签约信息
         * Summary: 保存租户签约信息
         */
        public CreateInnerMerchantagreementResponse CreateInnerMerchantagreement(CreateInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerMerchantagreementEx(request, headers, runtime);
        }

        /**
         * Description: 保存租户签约信息
         * Summary: 保存租户签约信息
         */
        public async Task<CreateInnerMerchantagreementResponse> CreateInnerMerchantagreementAsync(CreateInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerMerchantagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存租户签约信息
         * Summary: 保存租户签约信息
         */
        public CreateInnerMerchantagreementResponse CreateInnerMerchantagreementEx(CreateInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerMerchantagreementResponse>(DoRequest("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存租户签约信息
         * Summary: 保存租户签约信息
         */
        public async Task<CreateInnerMerchantagreementResponse> CreateInnerMerchantagreementExAsync(CreateInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerMerchantagreementResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户签约信息
         * Summary: 查询租户签约信息
         */
        public QueryInnerMerchantagreementResponse QueryInnerMerchantagreement(QueryInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerMerchantagreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户签约信息
         * Summary: 查询租户签约信息
         */
        public async Task<QueryInnerMerchantagreementResponse> QueryInnerMerchantagreementAsync(QueryInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerMerchantagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户签约信息
         * Summary: 查询租户签约信息
         */
        public QueryInnerMerchantagreementResponse QueryInnerMerchantagreementEx(QueryInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantagreementResponse>(DoRequest("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户签约信息
         * Summary: 查询租户签约信息
         */
        public async Task<QueryInnerMerchantagreementResponse> QueryInnerMerchantagreementExAsync(QueryInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantagreementResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户签约协议分页列表
         * Summary: 查询租户签约协议分页列表
         */
        public PagequeryInnerMerchantagreementResponse PagequeryInnerMerchantagreement(PagequeryInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerMerchantagreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户签约协议分页列表
         * Summary: 查询租户签约协议分页列表
         */
        public async Task<PagequeryInnerMerchantagreementResponse> PagequeryInnerMerchantagreementAsync(PagequeryInnerMerchantagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerMerchantagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户签约协议分页列表
         * Summary: 查询租户签约协议分页列表
         */
        public PagequeryInnerMerchantagreementResponse PagequeryInnerMerchantagreementEx(PagequeryInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantagreementResponse>(DoRequest("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户签约协议分页列表
         * Summary: 查询租户签约协议分页列表
         */
        public async Task<PagequeryInnerMerchantagreementResponse> PagequeryInnerMerchantagreementExAsync(PagequeryInnerMerchantagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantagreementResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存/编辑进件信息
         * Summary: 保存/编辑进件信息
         */
        public CreateInnerMerchantpayexpandResponse CreateInnerMerchantpayexpand(CreateInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerMerchantpayexpandEx(request, headers, runtime);
        }

        /**
         * Description: 保存/编辑进件信息
         * Summary: 保存/编辑进件信息
         */
        public async Task<CreateInnerMerchantpayexpandResponse> CreateInnerMerchantpayexpandAsync(CreateInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerMerchantpayexpandExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存/编辑进件信息
         * Summary: 保存/编辑进件信息
         */
        public CreateInnerMerchantpayexpandResponse CreateInnerMerchantpayexpandEx(CreateInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerMerchantpayexpandResponse>(DoRequest("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存/编辑进件信息
         * Summary: 保存/编辑进件信息
         */
        public async Task<CreateInnerMerchantpayexpandResponse> CreateInnerMerchantpayexpandExAsync(CreateInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerMerchantpayexpandResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交进件信息
         * Summary: 提交进件信息
         */
        public SubmitInnerMerchantpayexpandResponse SubmitInnerMerchantpayexpand(SubmitInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerMerchantpayexpandEx(request, headers, runtime);
        }

        /**
         * Description: 提交进件信息
         * Summary: 提交进件信息
         */
        public async Task<SubmitInnerMerchantpayexpandResponse> SubmitInnerMerchantpayexpandAsync(SubmitInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerMerchantpayexpandExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交进件信息
         * Summary: 提交进件信息
         */
        public SubmitInnerMerchantpayexpandResponse SubmitInnerMerchantpayexpandEx(SubmitInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerMerchantpayexpandResponse>(DoRequest("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交进件信息
         * Summary: 提交进件信息
         */
        public async Task<SubmitInnerMerchantpayexpandResponse> SubmitInnerMerchantpayexpandExAsync(SubmitInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerMerchantpayexpandResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询进件信息
         * Summary: 查询进件信息
         */
        public QueryInnerMerchantpayexpandResponse QueryInnerMerchantpayexpand(QueryInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerMerchantpayexpandEx(request, headers, runtime);
        }

        /**
         * Description: 查询进件信息
         * Summary: 查询进件信息
         */
        public async Task<QueryInnerMerchantpayexpandResponse> QueryInnerMerchantpayexpandAsync(QueryInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerMerchantpayexpandExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询进件信息
         * Summary: 查询进件信息
         */
        public QueryInnerMerchantpayexpandResponse QueryInnerMerchantpayexpandEx(QueryInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantpayexpandResponse>(DoRequest("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询进件信息
         * Summary: 查询进件信息
         */
        public async Task<QueryInnerMerchantpayexpandResponse> QueryInnerMerchantpayexpandExAsync(QueryInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantpayexpandResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代理商户分页列表-间连商户使用
         * Summary: 查询代理商户分页列表-间连商户使用
         */
        public PagequeryInnerMerchantagentResponse PagequeryInnerMerchantagent(PagequeryInnerMerchantagentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerMerchantagentEx(request, headers, runtime);
        }

        /**
         * Description: 查询代理商户分页列表-间连商户使用
         * Summary: 查询代理商户分页列表-间连商户使用
         */
        public async Task<PagequeryInnerMerchantagentResponse> PagequeryInnerMerchantagentAsync(PagequeryInnerMerchantagentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerMerchantagentExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代理商户分页列表-间连商户使用
         * Summary: 查询代理商户分页列表-间连商户使用
         */
        public PagequeryInnerMerchantagentResponse PagequeryInnerMerchantagentEx(PagequeryInnerMerchantagentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantagentResponse>(DoRequest("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代理商户分页列表-间连商户使用
         * Summary: 查询代理商户分页列表-间连商户使用
         */
        public async Task<PagequeryInnerMerchantagentResponse> PagequeryInnerMerchantagentExAsync(PagequeryInnerMerchantagentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantagentResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拷贝模板文件，可用于保存模板的入参
         * Summary: 拷贝模板文件
         */
        public CloneInnerTemplatefileaddressResponse CloneInnerTemplatefileaddress(CloneInnerTemplatefileaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloneInnerTemplatefileaddressEx(request, headers, runtime);
        }

        /**
         * Description: 拷贝模板文件，可用于保存模板的入参
         * Summary: 拷贝模板文件
         */
        public async Task<CloneInnerTemplatefileaddressResponse> CloneInnerTemplatefileaddressAsync(CloneInnerTemplatefileaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloneInnerTemplatefileaddressExAsync(request, headers, runtime);
        }

        /**
         * Description: 拷贝模板文件，可用于保存模板的入参
         * Summary: 拷贝模板文件
         */
        public CloneInnerTemplatefileaddressResponse CloneInnerTemplatefileaddressEx(CloneInnerTemplatefileaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneInnerTemplatefileaddressResponse>(DoRequest("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拷贝模板文件，可用于保存模板的入参
         * Summary: 拷贝模板文件
         */
        public async Task<CloneInnerTemplatefileaddressResponse> CloneInnerTemplatefileaddressExAsync(CloneInnerTemplatefileaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneInnerTemplatefileaddressResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署区
         * Summary: 查询签署区
         */
        public QueryInnerSignfieldsResponse QueryInnerSignfields(QueryInnerSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerSignfieldsEx(request, headers, runtime);
        }

        /**
         * Description: 查询签署区
         * Summary: 查询签署区
         */
        public async Task<QueryInnerSignfieldsResponse> QueryInnerSignfieldsAsync(QueryInnerSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerSignfieldsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签署区
         * Summary: 查询签署区
         */
        public QueryInnerSignfieldsResponse QueryInnerSignfieldsEx(QueryInnerSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSignfieldsResponse>(DoRequest("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署区
         * Summary: 查询签署区
         */
        public async Task<QueryInnerSignfieldsResponse> QueryInnerSignfieldsExAsync(QueryInnerSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSignfieldsResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public SyncInnerTemplateResponse SyncInnerTemplate(SyncInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public async Task<SyncInnerTemplateResponse> SyncInnerTemplateAsync(SyncInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public SyncInnerTemplateResponse SyncInnerTemplateEx(SyncInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public async Task<SyncInnerTemplateResponse> SyncInnerTemplateExAsync(SyncInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public UpdateInnerTemplateResponse UpdateInnerTemplate(UpdateInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public async Task<UpdateInnerTemplateResponse> UpdateInnerTemplateAsync(UpdateInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public UpdateInnerTemplateResponse UpdateInnerTemplateEx(UpdateInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public async Task<UpdateInnerTemplateResponse> UpdateInnerTemplateExAsync(UpdateInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public QueryInnerTemplateResponse QueryInnerTemplate(QueryInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public async Task<QueryInnerTemplateResponse> QueryInnerTemplateAsync(QueryInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public QueryInnerTemplateResponse QueryInnerTemplateEx(QueryInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public async Task<QueryInnerTemplateResponse> QueryInnerTemplateExAsync(QueryInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public QueryInnerTemplateelementlinkResponse QueryInnerTemplateelementlink(QueryInnerTemplateelementlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTemplateelementlinkEx(request, headers, runtime);
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public async Task<QueryInnerTemplateelementlinkResponse> QueryInnerTemplateelementlinkAsync(QueryInnerTemplateelementlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTemplateelementlinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public QueryInnerTemplateelementlinkResponse QueryInnerTemplateelementlinkEx(QueryInnerTemplateelementlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateelementlinkResponse>(DoRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public async Task<QueryInnerTemplateelementlinkResponse> QueryInnerTemplateelementlinkExAsync(QueryInnerTemplateelementlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateelementlinkResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
         * Summary: 查询模板的版本详情
         */
        public QueryInnerTemplateversionResponse QueryInnerTemplateversion(QueryInnerTemplateversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTemplateversionEx(request, headers, runtime);
        }

        /**
         * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
         * Summary: 查询模板的版本详情
         */
        public async Task<QueryInnerTemplateversionResponse> QueryInnerTemplateversionAsync(QueryInnerTemplateversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTemplateversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
         * Summary: 查询模板的版本详情
         */
        public QueryInnerTemplateversionResponse QueryInnerTemplateversionEx(QueryInnerTemplateversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateversionResponse>(DoRequest("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
         * Summary: 查询模板的版本详情
         */
        public async Task<QueryInnerTemplateversionResponse> QueryInnerTemplateversionExAsync(QueryInnerTemplateversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateversionResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单消息查询
         * Summary: 订单消息查询
         */
        public PagequeryInnerOrdermsgResponse PagequeryInnerOrdermsg(PagequeryInnerOrdermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerOrdermsgEx(request, headers, runtime);
        }

        /**
         * Description: 订单消息查询
         * Summary: 订单消息查询
         */
        public async Task<PagequeryInnerOrdermsgResponse> PagequeryInnerOrdermsgAsync(PagequeryInnerOrdermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerOrdermsgExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单消息查询
         * Summary: 订单消息查询
         */
        public PagequeryInnerOrdermsgResponse PagequeryInnerOrdermsgEx(PagequeryInnerOrdermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerOrdermsgResponse>(DoRequest("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单消息查询
         * Summary: 订单消息查询
         */
        public async Task<PagequeryInnerOrdermsgResponse> PagequeryInnerOrdermsgExAsync(PagequeryInnerOrdermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerOrdermsgResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单消息重试
         * Summary: 订单消息重试
         */
        public RetryInnerOrdermsgResponse RetryInnerOrdermsg(RetryInnerOrdermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryInnerOrdermsgEx(request, headers, runtime);
        }

        /**
         * Description: 订单消息重试
         * Summary: 订单消息重试
         */
        public async Task<RetryInnerOrdermsgResponse> RetryInnerOrdermsgAsync(RetryInnerOrdermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryInnerOrdermsgExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单消息重试
         * Summary: 订单消息重试
         */
        public RetryInnerOrdermsgResponse RetryInnerOrdermsgEx(RetryInnerOrdermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryInnerOrdermsgResponse>(DoRequest("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单消息重试
         * Summary: 订单消息重试
         */
        public async Task<RetryInnerOrdermsgResponse> RetryInnerOrdermsgExAsync(RetryInnerOrdermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryInnerOrdermsgResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权-  签署合同代扣前置授权查询接口
         * Summary: 签署合同代扣前置授权查询接口
         */
        public QueryInnerAuthorizationResponse QueryInnerAuthorization(QueryInnerAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerAuthorizationEx(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权-  签署合同代扣前置授权查询接口
         * Summary: 签署合同代扣前置授权查询接口
         */
        public async Task<QueryInnerAuthorizationResponse> QueryInnerAuthorizationAsync(QueryInnerAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerAuthorizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权-  签署合同代扣前置授权查询接口
         * Summary: 签署合同代扣前置授权查询接口
         */
        public QueryInnerAuthorizationResponse QueryInnerAuthorizationEx(QueryInnerAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAuthorizationResponse>(DoRequest("1.0", "antchain.ato.inner.authorization.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权-  签署合同代扣前置授权查询接口
         * Summary: 签署合同代扣前置授权查询接口
         */
        public async Task<QueryInnerAuthorizationResponse> QueryInnerAuthorizationExAsync(QueryInnerAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAuthorizationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.authorization.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
         * Summary: 签署合同代扣前置同意授权接口
         */
        public SignInnerAuthorizationResponse SignInnerAuthorization(SignInnerAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignInnerAuthorizationEx(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
         * Summary: 签署合同代扣前置同意授权接口
         */
        public async Task<SignInnerAuthorizationResponse> SignInnerAuthorizationAsync(SignInnerAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignInnerAuthorizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
         * Summary: 签署合同代扣前置同意授权接口
         */
        public SignInnerAuthorizationResponse SignInnerAuthorizationEx(SignInnerAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignInnerAuthorizationResponse>(DoRequest("1.0", "antchain.ato.inner.authorization.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
         * Summary: 签署合同代扣前置同意授权接口
         */
        public async Task<SignInnerAuthorizationResponse> SignInnerAuthorizationExAsync(SignInnerAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignInnerAuthorizationResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.authorization.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小程序法务授权 - 商户补充协议状态查询接口
         * Summary: 商户补充协议状态查询接口
         */
        public QueryInnerSupplementalResponse QueryInnerSupplemental(QueryInnerSupplementalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerSupplementalEx(request, headers, runtime);
        }

        /**
         * Description: 小程序法务授权 - 商户补充协议状态查询接口
         * Summary: 商户补充协议状态查询接口
         */
        public async Task<QueryInnerSupplementalResponse> QueryInnerSupplementalAsync(QueryInnerSupplementalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerSupplementalExAsync(request, headers, runtime);
        }

        /**
         * Description: 小程序法务授权 - 商户补充协议状态查询接口
         * Summary: 商户补充协议状态查询接口
         */
        public QueryInnerSupplementalResponse QueryInnerSupplementalEx(QueryInnerSupplementalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSupplementalResponse>(DoRequest("1.0", "antchain.ato.inner.supplemental.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小程序法务授权 - 商户补充协议状态查询接口
         * Summary: 商户补充协议状态查询接口
         */
        public async Task<QueryInnerSupplementalResponse> QueryInnerSupplementalExAsync(QueryInnerSupplementalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSupplementalResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.supplemental.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权 - 商户补充协议状态同意接口
         * Summary: 商户补充协议状态同意接口
         */
        public SignInnerSupplementalResponse SignInnerSupplemental(SignInnerSupplementalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignInnerSupplementalEx(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权 - 商户补充协议状态同意接口
         * Summary: 商户补充协议状态同意接口
         */
        public async Task<SignInnerSupplementalResponse> SignInnerSupplementalAsync(SignInnerSupplementalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignInnerSupplementalExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务协议授权 - 商户补充协议状态同意接口
         * Summary: 商户补充协议状态同意接口
         */
        public SignInnerSupplementalResponse SignInnerSupplementalEx(SignInnerSupplementalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignInnerSupplementalResponse>(DoRequest("1.0", "antchain.ato.inner.supplemental.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务协议授权 - 商户补充协议状态同意接口
         * Summary: 商户补充协议状态同意接口
         */
        public async Task<SignInnerSupplementalResponse> SignInnerSupplementalExAsync(SignInnerSupplementalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignInnerSupplementalResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.supplemental.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代扣计划
         * Summary: 代扣计划查询
         */
        public QueryInnerWithholdplanResponse QueryInnerWithholdplan(QueryInnerWithholdplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerWithholdplanEx(request, headers, runtime);
        }

        /**
         * Description: 查询代扣计划
         * Summary: 代扣计划查询
         */
        public async Task<QueryInnerWithholdplanResponse> QueryInnerWithholdplanAsync(QueryInnerWithholdplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerWithholdplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代扣计划
         * Summary: 代扣计划查询
         */
        public QueryInnerWithholdplanResponse QueryInnerWithholdplanEx(QueryInnerWithholdplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerWithholdplanResponse>(DoRequest("1.0", "antchain.ato.inner.withholdplan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代扣计划
         * Summary: 代扣计划查询
         */
        public async Task<QueryInnerWithholdplanResponse> QueryInnerWithholdplanExAsync(QueryInnerWithholdplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerWithholdplanResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.withholdplan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建代扣协议
         * Summary: 创建代扣协议
         */
        public CreateInnerWithholdsignResponse CreateInnerWithholdsign(CreateInnerWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerWithholdsignEx(request, headers, runtime);
        }

        /**
         * Description: 创建代扣协议
         * Summary: 创建代扣协议
         */
        public async Task<CreateInnerWithholdsignResponse> CreateInnerWithholdsignAsync(CreateInnerWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerWithholdsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建代扣协议
         * Summary: 创建代扣协议
         */
        public CreateInnerWithholdsignResponse CreateInnerWithholdsignEx(CreateInnerWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerWithholdsignResponse>(DoRequest("1.0", "antchain.ato.inner.withholdsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建代扣协议
         * Summary: 创建代扣协议
         */
        public async Task<CreateInnerWithholdsignResponse> CreateInnerWithholdsignExAsync(CreateInnerWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerWithholdsignResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.withholdsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryInnerWithholdsignResponse QueryInnerWithholdsign(QueryInnerWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerWithholdsignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryInnerWithholdsignResponse> QueryInnerWithholdsignAsync(QueryInnerWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerWithholdsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryInnerWithholdsignResponse QueryInnerWithholdsignEx(QueryInnerWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerWithholdsignResponse>(DoRequest("1.0", "antchain.ato.inner.withholdsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryInnerWithholdsignResponse> QueryInnerWithholdsignExAsync(QueryInnerWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerWithholdsignResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.withholdsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户进件静态枚举数据
         * Summary: 获取商户进件静态枚举数据
         */
        public GetInnerMerchantstaticdataResponse GetInnerMerchantstaticdata(GetInnerMerchantstaticdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerMerchantstaticdataEx(request, headers, runtime);
        }

        /**
         * Description: 获取商户进件静态枚举数据
         * Summary: 获取商户进件静态枚举数据
         */
        public async Task<GetInnerMerchantstaticdataResponse> GetInnerMerchantstaticdataAsync(GetInnerMerchantstaticdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerMerchantstaticdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取商户进件静态枚举数据
         * Summary: 获取商户进件静态枚举数据
         */
        public GetInnerMerchantstaticdataResponse GetInnerMerchantstaticdataEx(GetInnerMerchantstaticdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerMerchantstaticdataResponse>(DoRequest("1.0", "antchain.ato.inner.merchantstaticdata.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户进件静态枚举数据
         * Summary: 获取商户进件静态枚举数据
         */
        public async Task<GetInnerMerchantstaticdataResponse> GetInnerMerchantstaticdataExAsync(GetInnerMerchantstaticdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerMerchantstaticdataResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantstaticdata.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
         * Summary: 间连查询已有绑定关系分账方数据
         */
        public GetInnerFunddividemerchantResponse GetInnerFunddividemerchant(GetInnerFunddividemerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerFunddividemerchantEx(request, headers, runtime);
        }

        /**
         * Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
         * Summary: 间连查询已有绑定关系分账方数据
         */
        public async Task<GetInnerFunddividemerchantResponse> GetInnerFunddividemerchantAsync(GetInnerFunddividemerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerFunddividemerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
         * Summary: 间连查询已有绑定关系分账方数据
         */
        public GetInnerFunddividemerchantResponse GetInnerFunddividemerchantEx(GetInnerFunddividemerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerFunddividemerchantResponse>(DoRequest("1.0", "antchain.ato.inner.funddividemerchant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
         * Summary: 间连查询已有绑定关系分账方数据
         */
        public async Task<GetInnerFunddividemerchantResponse> GetInnerFunddividemerchantExAsync(GetInnerFunddividemerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerFunddividemerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.funddividemerchant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户和保司协议签署信息
         * Summary: 查询商户和保司协议签署信息
         */
        public QueryInnerInsuresignResponse QueryInnerInsuresign(QueryInnerInsuresignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerInsuresignEx(request, headers, runtime);
        }

        /**
         * Description: 查询商户和保司协议签署信息
         * Summary: 查询商户和保司协议签署信息
         */
        public async Task<QueryInnerInsuresignResponse> QueryInnerInsuresignAsync(QueryInnerInsuresignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerInsuresignExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商户和保司协议签署信息
         * Summary: 查询商户和保司协议签署信息
         */
        public QueryInnerInsuresignResponse QueryInnerInsuresignEx(QueryInnerInsuresignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerInsuresignResponse>(DoRequest("1.0", "antchain.ato.inner.insuresign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户和保司协议签署信息
         * Summary: 查询商户和保司协议签署信息
         */
        public async Task<QueryInnerInsuresignResponse> QueryInnerInsuresignExAsync(QueryInnerInsuresignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerInsuresignResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.insuresign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成商户和保司签约链接
         * Summary: 生成商户和保司签约链接
         */
        public CreateInnerInsuresignResponse CreateInnerInsuresign(CreateInnerInsuresignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerInsuresignEx(request, headers, runtime);
        }

        /**
         * Description: 生成商户和保司签约链接
         * Summary: 生成商户和保司签约链接
         */
        public async Task<CreateInnerInsuresignResponse> CreateInnerInsuresignAsync(CreateInnerInsuresignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerInsuresignExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成商户和保司签约链接
         * Summary: 生成商户和保司签约链接
         */
        public CreateInnerInsuresignResponse CreateInnerInsuresignEx(CreateInnerInsuresignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerInsuresignResponse>(DoRequest("1.0", "antchain.ato.inner.insuresign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成商户和保司签约链接
         * Summary: 生成商户和保司签约链接
         */
        public async Task<CreateInnerInsuresignResponse> CreateInnerInsuresignExAsync(CreateInnerInsuresignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerInsuresignResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.insuresign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询保单信息
         * Summary: 查询保单信息
         */
        public PagequeryInnerInsureorderResponse PagequeryInnerInsureorder(PagequeryInnerInsureorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerInsureorderEx(request, headers, runtime);
        }

        /**
         * Description: 查询保单信息
         * Summary: 查询保单信息
         */
        public async Task<PagequeryInnerInsureorderResponse> PagequeryInnerInsureorderAsync(PagequeryInnerInsureorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerInsureorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询保单信息
         * Summary: 查询保单信息
         */
        public PagequeryInnerInsureorderResponse PagequeryInnerInsureorderEx(PagequeryInnerInsureorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerInsureorderResponse>(DoRequest("1.0", "antchain.ato.inner.insureorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询保单信息
         * Summary: 查询保单信息
         */
        public async Task<PagequeryInnerInsureorderResponse> PagequeryInnerInsureorderExAsync(PagequeryInnerInsureorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerInsureorderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.insureorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台商品列表
         * Summary: 商品列表
         */
        public PagequeryInnerProductResponse PagequeryInnerProduct(PagequeryInnerProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerProductEx(request, headers, runtime);
        }

        /**
         * Description: 商户控制台商品列表
         * Summary: 商品列表
         */
        public async Task<PagequeryInnerProductResponse> PagequeryInnerProductAsync(PagequeryInnerProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户控制台商品列表
         * Summary: 商品列表
         */
        public PagequeryInnerProductResponse PagequeryInnerProductEx(PagequeryInnerProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerProductResponse>(DoRequest("1.0", "antchain.ato.inner.product.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台商品列表
         * Summary: 商品列表
         */
        public async Task<PagequeryInnerProductResponse> PagequeryInnerProductExAsync(PagequeryInnerProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerProductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.product.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台首页通知栏
         * Summary: 首页通知栏
         */
        public GetInnerHomepagenoticeResponse GetInnerHomepagenotice(GetInnerHomepagenoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerHomepagenoticeEx(request, headers, runtime);
        }

        /**
         * Description: 商户控制台首页通知栏
         * Summary: 首页通知栏
         */
        public async Task<GetInnerHomepagenoticeResponse> GetInnerHomepagenoticeAsync(GetInnerHomepagenoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerHomepagenoticeExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户控制台首页通知栏
         * Summary: 首页通知栏
         */
        public GetInnerHomepagenoticeResponse GetInnerHomepagenoticeEx(GetInnerHomepagenoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerHomepagenoticeResponse>(DoRequest("1.0", "antchain.ato.inner.homepagenotice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台首页通知栏
         * Summary: 首页通知栏
         */
        public async Task<GetInnerHomepagenoticeResponse> GetInnerHomepagenoticeExAsync(GetInnerHomepagenoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerHomepagenoticeResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.homepagenotice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台通知列表
         * Summary: 通知列表
         */
        public PagequeryInnerNoticeResponse PagequeryInnerNotice(PagequeryInnerNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerNoticeEx(request, headers, runtime);
        }

        /**
         * Description: 商户控制台通知列表
         * Summary: 通知列表
         */
        public async Task<PagequeryInnerNoticeResponse> PagequeryInnerNoticeAsync(PagequeryInnerNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerNoticeExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户控制台通知列表
         * Summary: 通知列表
         */
        public PagequeryInnerNoticeResponse PagequeryInnerNoticeEx(PagequeryInnerNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerNoticeResponse>(DoRequest("1.0", "antchain.ato.inner.notice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台通知列表
         * Summary: 通知列表
         */
        public async Task<PagequeryInnerNoticeResponse> PagequeryInnerNoticeExAsync(PagequeryInnerNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerNoticeResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.notice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台通知详情
         * Summary: 通知详情
         */
        public DetailInnerNoticeResponse DetailInnerNotice(DetailInnerNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerNoticeEx(request, headers, runtime);
        }

        /**
         * Description: 商户控制台通知详情
         * Summary: 通知详情
         */
        public async Task<DetailInnerNoticeResponse> DetailInnerNoticeAsync(DetailInnerNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerNoticeExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户控制台通知详情
         * Summary: 通知详情
         */
        public DetailInnerNoticeResponse DetailInnerNoticeEx(DetailInnerNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerNoticeResponse>(DoRequest("1.0", "antchain.ato.inner.notice.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台通知详情
         * Summary: 通知详情
         */
        public async Task<DetailInnerNoticeResponse> DetailInnerNoticeExAsync(DetailInnerNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerNoticeResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.notice.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台订单列表
         * Summary: 订单列表
         */
        public PagequeryInnerOrderResponse PagequeryInnerOrder(PagequeryInnerOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerOrderEx(request, headers, runtime);
        }

        /**
         * Description: 商户控制台订单列表
         * Summary: 订单列表
         */
        public async Task<PagequeryInnerOrderResponse> PagequeryInnerOrderAsync(PagequeryInnerOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户控制台订单列表
         * Summary: 订单列表
         */
        public PagequeryInnerOrderResponse PagequeryInnerOrderEx(PagequeryInnerOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerOrderResponse>(DoRequest("1.0", "antchain.ato.inner.order.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户控制台订单列表
         * Summary: 订单列表
         */
        public async Task<PagequeryInnerOrderResponse> PagequeryInnerOrderExAsync(PagequeryInnerOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerOrderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.order.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单详情
         * Summary: 订单详情
         */
        public DetailInnerOrderResponse DetailInnerOrder(DetailInnerOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerOrderEx(request, headers, runtime);
        }

        /**
         * Description: 订单详情
         * Summary: 订单详情
         */
        public async Task<DetailInnerOrderResponse> DetailInnerOrderAsync(DetailInnerOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单详情
         * Summary: 订单详情
         */
        public DetailInnerOrderResponse DetailInnerOrderEx(DetailInnerOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerOrderResponse>(DoRequest("1.0", "antchain.ato.inner.order.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单详情
         * Summary: 订单详情
         */
        public async Task<DetailInnerOrderResponse> DetailInnerOrderExAsync(DetailInnerOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerOrderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.order.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板实例化渲染，文本域赋值
         * Summary: 合同模板实例化渲染
         */
        public RenderInnerTemplateinstanceResponse RenderInnerTemplateinstance(RenderInnerTemplateinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RenderInnerTemplateinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 合同模板实例化渲染，文本域赋值
         * Summary: 合同模板实例化渲染
         */
        public async Task<RenderInnerTemplateinstanceResponse> RenderInnerTemplateinstanceAsync(RenderInnerTemplateinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RenderInnerTemplateinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同模板实例化渲染，文本域赋值
         * Summary: 合同模板实例化渲染
         */
        public RenderInnerTemplateinstanceResponse RenderInnerTemplateinstanceEx(RenderInnerTemplateinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenderInnerTemplateinstanceResponse>(DoRequest("1.0", "antchain.ato.inner.templateinstance.render", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板实例化渲染，文本域赋值
         * Summary: 合同模板实例化渲染
         */
        public async Task<RenderInnerTemplateinstanceResponse> RenderInnerTemplateinstanceExAsync(RenderInnerTemplateinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenderInnerTemplateinstanceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateinstance.render", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询营销分
         * Summary: 批量查询营销分
         */
        public BatchqueryInnerMarketingscoreResponse BatchqueryInnerMarketingscore(BatchqueryInnerMarketingscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryInnerMarketingscoreEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询营销分
         * Summary: 批量查询营销分
         */
        public async Task<BatchqueryInnerMarketingscoreResponse> BatchqueryInnerMarketingscoreAsync(BatchqueryInnerMarketingscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryInnerMarketingscoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询营销分
         * Summary: 批量查询营销分
         */
        public BatchqueryInnerMarketingscoreResponse BatchqueryInnerMarketingscoreEx(BatchqueryInnerMarketingscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryInnerMarketingscoreResponse>(DoRequest("1.0", "antchain.ato.inner.marketingscore.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询营销分
         * Summary: 批量查询营销分
         */
        public async Task<BatchqueryInnerMarketingscoreResponse> BatchqueryInnerMarketingscoreExAsync(BatchqueryInnerMarketingscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryInnerMarketingscoreResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.marketingscore.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建客服信息
         * Summary: 创建客服信息
         */
        public CreateInnerCustomerserviceResponse CreateInnerCustomerservice(CreateInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerCustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 创建客服信息
         * Summary: 创建客服信息
         */
        public async Task<CreateInnerCustomerserviceResponse> CreateInnerCustomerserviceAsync(CreateInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerCustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建客服信息
         * Summary: 创建客服信息
         */
        public CreateInnerCustomerserviceResponse CreateInnerCustomerserviceEx(CreateInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerCustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.customerservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建客服信息
         * Summary: 创建客服信息
         */
        public async Task<CreateInnerCustomerserviceResponse> CreateInnerCustomerserviceExAsync(CreateInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerCustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.customerservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新客服信息
         * Summary: 更新客服信息
         */
        public UpdateInnerCustomerserviceResponse UpdateInnerCustomerservice(UpdateInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerCustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 更新客服信息
         * Summary: 更新客服信息
         */
        public async Task<UpdateInnerCustomerserviceResponse> UpdateInnerCustomerserviceAsync(UpdateInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerCustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新客服信息
         * Summary: 更新客服信息
         */
        public UpdateInnerCustomerserviceResponse UpdateInnerCustomerserviceEx(UpdateInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerCustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.customerservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新客服信息
         * Summary: 更新客服信息
         */
        public async Task<UpdateInnerCustomerserviceResponse> UpdateInnerCustomerserviceExAsync(UpdateInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerCustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.customerservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询客服信息
         * Summary:  分页查询客服信息
         */
        public PagequeryInnerCustomerserviceResponse PagequeryInnerCustomerservice(PagequeryInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerCustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询客服信息
         * Summary:  分页查询客服信息
         */
        public async Task<PagequeryInnerCustomerserviceResponse> PagequeryInnerCustomerserviceAsync(PagequeryInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerCustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询客服信息
         * Summary:  分页查询客服信息
         */
        public PagequeryInnerCustomerserviceResponse PagequeryInnerCustomerserviceEx(PagequeryInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerCustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.customerservice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询客服信息
         * Summary:  分页查询客服信息
         */
        public async Task<PagequeryInnerCustomerserviceResponse> PagequeryInnerCustomerserviceExAsync(PagequeryInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerCustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.customerservice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取客服信息详情
         * Summary: 获取客服信息详情
         */
        public DetailInnerCustomerserviceResponse DetailInnerCustomerservice(DetailInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerCustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 获取客服信息详情
         * Summary: 获取客服信息详情
         */
        public async Task<DetailInnerCustomerserviceResponse> DetailInnerCustomerserviceAsync(DetailInnerCustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerCustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取客服信息详情
         * Summary: 获取客服信息详情
         */
        public DetailInnerCustomerserviceResponse DetailInnerCustomerserviceEx(DetailInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerCustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.customerservice.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取客服信息详情
         * Summary: 获取客服信息详情
         */
        public async Task<DetailInnerCustomerserviceResponse> DetailInnerCustomerserviceExAsync(DetailInnerCustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerCustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.customerservice.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取代理商客服信息模版
         * Summary: 获取代理商客服信息模版
         */
        public GetInnerCustomerservicetemplateResponse GetInnerCustomerservicetemplate(GetInnerCustomerservicetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerCustomerservicetemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取代理商客服信息模版
         * Summary: 获取代理商客服信息模版
         */
        public async Task<GetInnerCustomerservicetemplateResponse> GetInnerCustomerservicetemplateAsync(GetInnerCustomerservicetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerCustomerservicetemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取代理商客服信息模版
         * Summary: 获取代理商客服信息模版
         */
        public GetInnerCustomerservicetemplateResponse GetInnerCustomerservicetemplateEx(GetInnerCustomerservicetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerCustomerservicetemplateResponse>(DoRequest("1.0", "antchain.ato.inner.customerservicetemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取代理商客服信息模版
         * Summary: 获取代理商客服信息模版
         */
        public async Task<GetInnerCustomerservicetemplateResponse> GetInnerCustomerservicetemplateExAsync(GetInnerCustomerservicetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerCustomerservicetemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.customerservicetemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板实例化后的模板信息，包括pdf下载链接
         * Summary: 获取模板实例化后的模板信息
         */
        public QueryInnerTemplateinstanceResponse QueryInnerTemplateinstance(QueryInnerTemplateinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTemplateinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取模板实例化后的模板信息，包括pdf下载链接
         * Summary: 获取模板实例化后的模板信息
         */
        public async Task<QueryInnerTemplateinstanceResponse> QueryInnerTemplateinstanceAsync(QueryInnerTemplateinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTemplateinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模板实例化后的模板信息，包括pdf下载链接
         * Summary: 获取模板实例化后的模板信息
         */
        public QueryInnerTemplateinstanceResponse QueryInnerTemplateinstanceEx(QueryInnerTemplateinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateinstanceResponse>(DoRequest("1.0", "antchain.ato.inner.templateinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板实例化后的模板信息，包括pdf下载链接
         * Summary: 获取模板实例化后的模板信息
         */
        public async Task<QueryInnerTemplateinstanceResponse> QueryInnerTemplateinstanceExAsync(QueryInnerTemplateinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTemplateinstanceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户类目信息详情
         * Summary: 查询租户类目信息详情
         */
        public QueryInnerTenantindirectmainclassResponse QueryInnerTenantindirectmainclass(QueryInnerTenantindirectmainclassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTenantindirectmainclassEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户类目信息详情
         * Summary: 查询租户类目信息详情
         */
        public async Task<QueryInnerTenantindirectmainclassResponse> QueryInnerTenantindirectmainclassAsync(QueryInnerTenantindirectmainclassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTenantindirectmainclassExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户类目信息详情
         * Summary: 查询租户类目信息详情
         */
        public QueryInnerTenantindirectmainclassResponse QueryInnerTenantindirectmainclassEx(QueryInnerTenantindirectmainclassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTenantindirectmainclassResponse>(DoRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户类目信息详情
         * Summary: 查询租户类目信息详情
         */
        public async Task<QueryInnerTenantindirectmainclassResponse> QueryInnerTenantindirectmainclassExAsync(QueryInnerTenantindirectmainclassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTenantindirectmainclassResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.tenantindirectmainclass.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改租户间联类目类目信息
         * Summary: 修改租户间联类目类目信息
         */
        public UpdateInnerTenantindirectmainclassResponse UpdateInnerTenantindirectmainclass(UpdateInnerTenantindirectmainclassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerTenantindirectmainclassEx(request, headers, runtime);
        }

        /**
         * Description: 修改租户间联类目类目信息
         * Summary: 修改租户间联类目类目信息
         */
        public async Task<UpdateInnerTenantindirectmainclassResponse> UpdateInnerTenantindirectmainclassAsync(UpdateInnerTenantindirectmainclassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerTenantindirectmainclassExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改租户间联类目类目信息
         * Summary: 修改租户间联类目类目信息
         */
        public UpdateInnerTenantindirectmainclassResponse UpdateInnerTenantindirectmainclassEx(UpdateInnerTenantindirectmainclassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerTenantindirectmainclassResponse>(DoRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改租户间联类目类目信息
         * Summary: 修改租户间联类目类目信息
         */
        public async Task<UpdateInnerTenantindirectmainclassResponse> UpdateInnerTenantindirectmainclassExAsync(UpdateInnerTenantindirectmainclassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerTenantindirectmainclassResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.tenantindirectmainclass.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模板同步上线时强管控字段校验未通过提交后台审核
         * Summary: 模板同步上线审核提交
         */
        public SubmitInnerTemplatesyncreviewResponse SubmitInnerTemplatesyncreview(SubmitInnerTemplatesyncreviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerTemplatesyncreviewEx(request, headers, runtime);
        }

        /**
         * Description: 模板同步上线时强管控字段校验未通过提交后台审核
         * Summary: 模板同步上线审核提交
         */
        public async Task<SubmitInnerTemplatesyncreviewResponse> SubmitInnerTemplatesyncreviewAsync(SubmitInnerTemplatesyncreviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerTemplatesyncreviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 模板同步上线时强管控字段校验未通过提交后台审核
         * Summary: 模板同步上线审核提交
         */
        public SubmitInnerTemplatesyncreviewResponse SubmitInnerTemplatesyncreviewEx(SubmitInnerTemplatesyncreviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerTemplatesyncreviewResponse>(DoRequest("1.0", "antchain.ato.inner.templatesyncreview.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模板同步上线时强管控字段校验未通过提交后台审核
         * Summary: 模板同步上线审核提交
         */
        public async Task<SubmitInnerTemplatesyncreviewResponse> SubmitInnerTemplatesyncreviewExAsync(SubmitInnerTemplatesyncreviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerTemplatesyncreviewResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templatesyncreview.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 待办事件处理
         * Summary: 待办事件处理
         */
        public SubmitInnerPendingeventResponse SubmitInnerPendingevent(SubmitInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerPendingeventEx(request, headers, runtime);
        }

        /**
         * Description: 待办事件处理
         * Summary: 待办事件处理
         */
        public async Task<SubmitInnerPendingeventResponse> SubmitInnerPendingeventAsync(SubmitInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerPendingeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 待办事件处理
         * Summary: 待办事件处理
         */
        public SubmitInnerPendingeventResponse SubmitInnerPendingeventEx(SubmitInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerPendingeventResponse>(DoRequest("1.0", "antchain.ato.inner.pendingevent.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 待办事件处理
         * Summary: 待办事件处理
         */
        public async Task<SubmitInnerPendingeventResponse> SubmitInnerPendingeventExAsync(SubmitInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerPendingeventResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.pendingevent.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 待办事件详情查询
         * Summary: 待办事件详情查询
         */
        public DetailInnerPendingeventResponse DetailInnerPendingevent(DetailInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerPendingeventEx(request, headers, runtime);
        }

        /**
         * Description: 待办事件详情查询
         * Summary: 待办事件详情查询
         */
        public async Task<DetailInnerPendingeventResponse> DetailInnerPendingeventAsync(DetailInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerPendingeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 待办事件详情查询
         * Summary: 待办事件详情查询
         */
        public DetailInnerPendingeventResponse DetailInnerPendingeventEx(DetailInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerPendingeventResponse>(DoRequest("1.0", "antchain.ato.inner.pendingevent.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 待办事件详情查询
         * Summary: 待办事件详情查询
         */
        public async Task<DetailInnerPendingeventResponse> DetailInnerPendingeventExAsync(DetailInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerPendingeventResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.pendingevent.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public AddInnerTemplateResponse AddInnerTemplate(AddInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public async Task<AddInnerTemplateResponse> AddInnerTemplateAsync(AddInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public AddInnerTemplateResponse AddInnerTemplateEx(AddInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public async Task<AddInnerTemplateResponse> AddInnerTemplateExAsync(AddInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询待办列表
         * Summary: 查询待办列表
         */
        public PagequeryInnerPendingeventResponse PagequeryInnerPendingevent(PagequeryInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerPendingeventEx(request, headers, runtime);
        }

        /**
         * Description: 查询待办列表
         * Summary: 查询待办列表
         */
        public async Task<PagequeryInnerPendingeventResponse> PagequeryInnerPendingeventAsync(PagequeryInnerPendingeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerPendingeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询待办列表
         * Summary: 查询待办列表
         */
        public PagequeryInnerPendingeventResponse PagequeryInnerPendingeventEx(PagequeryInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPendingeventResponse>(DoRequest("1.0", "antchain.ato.inner.pendingevent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询待办列表
         * Summary: 查询待办列表
         */
        public async Task<PagequeryInnerPendingeventResponse> PagequeryInnerPendingeventExAsync(PagequeryInnerPendingeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPendingeventResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.pendingevent.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改进件信息
         * Summary: 修改进件信息
         */
        public UpdateInnerMerchantpayexpandResponse UpdateInnerMerchantpayexpand(UpdateInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerMerchantpayexpandEx(request, headers, runtime);
        }

        /**
         * Description: 修改进件信息
         * Summary: 修改进件信息
         */
        public async Task<UpdateInnerMerchantpayexpandResponse> UpdateInnerMerchantpayexpandAsync(UpdateInnerMerchantpayexpandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerMerchantpayexpandExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改进件信息
         * Summary: 修改进件信息
         */
        public UpdateInnerMerchantpayexpandResponse UpdateInnerMerchantpayexpandEx(UpdateInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerMerchantpayexpandResponse>(DoRequest("1.0", "antchain.ato.inner.merchantpayexpand.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改进件信息
         * Summary: 修改进件信息
         */
        public async Task<UpdateInnerMerchantpayexpandResponse> UpdateInnerMerchantpayexpandExAsync(UpdateInnerMerchantpayexpandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerMerchantpayexpandResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantpayexpand.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户账号信息
         * Summary: 查询租户账号信息
         */
        public QueryInnerTenantaccountinfoResponse QueryInnerTenantaccountinfo(QueryInnerTenantaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerTenantaccountinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户账号信息
         * Summary: 查询租户账号信息
         */
        public async Task<QueryInnerTenantaccountinfoResponse> QueryInnerTenantaccountinfoAsync(QueryInnerTenantaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerTenantaccountinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户账号信息
         * Summary: 查询租户账号信息
         */
        public QueryInnerTenantaccountinfoResponse QueryInnerTenantaccountinfoEx(QueryInnerTenantaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTenantaccountinfoResponse>(DoRequest("1.0", "antchain.ato.inner.tenantaccountinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户账号信息
         * Summary: 查询租户账号信息
         */
        public async Task<QueryInnerTenantaccountinfoResponse> QueryInnerTenantaccountinfoExAsync(QueryInnerTenantaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerTenantaccountinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.tenantaccountinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租户账号信息
         * Summary: 创建租户账号信息
         */
        public CreateInnerTenantaccountinfoResponse CreateInnerTenantaccountinfo(CreateInnerTenantaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerTenantaccountinfoEx(request, headers, runtime);
        }

        /**
         * Description: 创建租户账号信息
         * Summary: 创建租户账号信息
         */
        public async Task<CreateInnerTenantaccountinfoResponse> CreateInnerTenantaccountinfoAsync(CreateInnerTenantaccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerTenantaccountinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建租户账号信息
         * Summary: 创建租户账号信息
         */
        public CreateInnerTenantaccountinfoResponse CreateInnerTenantaccountinfoEx(CreateInnerTenantaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTenantaccountinfoResponse>(DoRequest("1.0", "antchain.ato.inner.tenantaccountinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租户账号信息
         * Summary: 创建租户账号信息
         */
        public async Task<CreateInnerTenantaccountinfoResponse> CreateInnerTenantaccountinfoExAsync(CreateInnerTenantaccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerTenantaccountinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.tenantaccountinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代理商客服人员信息
         * Summary: 查询代理商客服人员信息
         */
        public GetInnerAgentcustomerserviceResponse GetInnerAgentcustomerservice(GetInnerAgentcustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerAgentcustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询代理商客服人员信息
         * Summary: 查询代理商客服人员信息
         */
        public async Task<GetInnerAgentcustomerserviceResponse> GetInnerAgentcustomerserviceAsync(GetInnerAgentcustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerAgentcustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代理商客服人员信息
         * Summary: 查询代理商客服人员信息
         */
        public GetInnerAgentcustomerserviceResponse GetInnerAgentcustomerserviceEx(GetInnerAgentcustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerAgentcustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.agentcustomerservice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代理商客服人员信息
         * Summary: 查询代理商客服人员信息
         */
        public async Task<GetInnerAgentcustomerserviceResponse> GetInnerAgentcustomerserviceExAsync(GetInnerAgentcustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerAgentcustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agentcustomerservice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存代理商客服人员信息
         * Summary: 保存代理商客服人员信息
         */
        public SaveInnerAgentcustomerserviceResponse SaveInnerAgentcustomerservice(SaveInnerAgentcustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveInnerAgentcustomerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 保存代理商客服人员信息
         * Summary: 保存代理商客服人员信息
         */
        public async Task<SaveInnerAgentcustomerserviceResponse> SaveInnerAgentcustomerserviceAsync(SaveInnerAgentcustomerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveInnerAgentcustomerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存代理商客服人员信息
         * Summary: 保存代理商客服人员信息
         */
        public SaveInnerAgentcustomerserviceResponse SaveInnerAgentcustomerserviceEx(SaveInnerAgentcustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerAgentcustomerserviceResponse>(DoRequest("1.0", "antchain.ato.inner.agentcustomerservice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存代理商客服人员信息
         * Summary: 保存代理商客服人员信息
         */
        public async Task<SaveInnerAgentcustomerserviceResponse> SaveInnerAgentcustomerserviceExAsync(SaveInnerAgentcustomerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerAgentcustomerserviceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agentcustomerservice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sls日志
         * Summary: 查询sls日志
         */
        public QueryInnerLoggerResponse QueryInnerLogger(QueryInnerLoggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerLoggerEx(request, headers, runtime);
        }

        /**
         * Description: 查询sls日志
         * Summary: 查询sls日志
         */
        public async Task<QueryInnerLoggerResponse> QueryInnerLoggerAsync(QueryInnerLoggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerLoggerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sls日志
         * Summary: 查询sls日志
         */
        public QueryInnerLoggerResponse QueryInnerLoggerEx(QueryInnerLoggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerLoggerResponse>(DoRequest("1.0", "antchain.ato.inner.logger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sls日志
         * Summary: 查询sls日志
         */
        public async Task<QueryInnerLoggerResponse> QueryInnerLoggerExAsync(QueryInnerLoggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerLoggerResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.logger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 离线数据下载
         * Summary: 离线数据下载
         */
        public SubmitInnerDatadownloadResponse SubmitInnerDatadownload(SubmitInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerDatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 离线数据下载
         * Summary: 离线数据下载
         */
        public async Task<SubmitInnerDatadownloadResponse> SubmitInnerDatadownloadAsync(SubmitInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerDatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 离线数据下载
         * Summary: 离线数据下载
         */
        public SubmitInnerDatadownloadResponse SubmitInnerDatadownloadEx(SubmitInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerDatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.datadownload.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 离线数据下载
         * Summary: 离线数据下载
         */
        public async Task<SubmitInnerDatadownloadResponse> SubmitInnerDatadownloadExAsync(SubmitInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerDatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.datadownload.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据下载列表
         * Summary: 查询数据下载列表
         */
        public PagequeryInnerDatadownloadResponse PagequeryInnerDatadownload(PagequeryInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerDatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据下载列表
         * Summary: 查询数据下载列表
         */
        public async Task<PagequeryInnerDatadownloadResponse> PagequeryInnerDatadownloadAsync(PagequeryInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerDatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据下载列表
         * Summary: 查询数据下载列表
         */
        public PagequeryInnerDatadownloadResponse PagequeryInnerDatadownloadEx(PagequeryInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerDatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.datadownload.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据下载列表
         * Summary: 查询数据下载列表
         */
        public async Task<PagequeryInnerDatadownloadResponse> PagequeryInnerDatadownloadExAsync(PagequeryInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerDatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.datadownload.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除下载任务
         * Summary: 删除下载任务
         */
        public DeleteInnerDatadownloadResponse DeleteInnerDatadownload(DeleteInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerDatadownloadEx(request, headers, runtime);
        }

        /**
         * Description: 删除下载任务
         * Summary: 删除下载任务
         */
        public async Task<DeleteInnerDatadownloadResponse> DeleteInnerDatadownloadAsync(DeleteInnerDatadownloadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerDatadownloadExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除下载任务
         * Summary: 删除下载任务
         */
        public DeleteInnerDatadownloadResponse DeleteInnerDatadownloadEx(DeleteInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerDatadownloadResponse>(DoRequest("1.0", "antchain.ato.inner.datadownload.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除下载任务
         * Summary: 删除下载任务
         */
        public async Task<DeleteInnerDatadownloadResponse> DeleteInnerDatadownloadExAsync(DeleteInnerDatadownloadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerDatadownloadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.datadownload.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询公司信息
         * Summary: 分页查询公司信息
         */
        public PagequeryInnerCompanyinfoResponse PagequeryInnerCompanyinfo(PagequeryInnerCompanyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerCompanyinfoEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询公司信息
         * Summary: 分页查询公司信息
         */
        public async Task<PagequeryInnerCompanyinfoResponse> PagequeryInnerCompanyinfoAsync(PagequeryInnerCompanyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerCompanyinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询公司信息
         * Summary: 分页查询公司信息
         */
        public PagequeryInnerCompanyinfoResponse PagequeryInnerCompanyinfoEx(PagequeryInnerCompanyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerCompanyinfoResponse>(DoRequest("1.0", "antchain.ato.inner.companyinfo.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询公司信息
         * Summary: 分页查询公司信息
         */
        public async Task<PagequeryInnerCompanyinfoResponse> PagequeryInnerCompanyinfoExAsync(PagequeryInnerCompanyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerCompanyinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.companyinfo.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户进件流程节点
         * Summary: 查询商户进件流程节点
         */
        public QueryInnerExpandprocessResponse QueryInnerExpandprocess(QueryInnerExpandprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerExpandprocessEx(request, headers, runtime);
        }

        /**
         * Description: 查询商户进件流程节点
         * Summary: 查询商户进件流程节点
         */
        public async Task<QueryInnerExpandprocessResponse> QueryInnerExpandprocessAsync(QueryInnerExpandprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerExpandprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商户进件流程节点
         * Summary: 查询商户进件流程节点
         */
        public QueryInnerExpandprocessResponse QueryInnerExpandprocessEx(QueryInnerExpandprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerExpandprocessResponse>(DoRequest("1.0", "antchain.ato.inner.expandprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户进件流程节点
         * Summary: 查询商户进件流程节点
         */
        public async Task<QueryInnerExpandprocessResponse> QueryInnerExpandprocessExAsync(QueryInnerExpandprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerExpandprocessResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.expandprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public QueryKnowledgeBaseinfoResponse QueryKnowledgeBaseinfo(QueryKnowledgeBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKnowledgeBaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public async Task<QueryKnowledgeBaseinfoResponse> QueryKnowledgeBaseinfoAsync(QueryKnowledgeBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKnowledgeBaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public QueryKnowledgeBaseinfoResponse QueryKnowledgeBaseinfoEx(QueryKnowledgeBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeBaseinfoResponse>(DoRequest("1.0", "antchain.ato.knowledge.baseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public async Task<QueryKnowledgeBaseinfoResponse> QueryKnowledgeBaseinfoExAsync(QueryKnowledgeBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeBaseinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.baseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public CreateKnowledgeCategoryResponse CreateKnowledgeCategory(CreateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public async Task<CreateKnowledgeCategoryResponse> CreateKnowledgeCategoryAsync(CreateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public CreateKnowledgeCategoryResponse CreateKnowledgeCategoryEx(CreateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public async Task<CreateKnowledgeCategoryResponse> CreateKnowledgeCategoryExAsync(CreateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库信息列表
         * Summary: 商家自定义知识库-查询知识库信息列表
         */
        public PagequeryKnowledgeCategoryResponse PagequeryKnowledgeCategory(PagequeryKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库信息列表
         * Summary: 商家自定义知识库-查询知识库信息列表
         */
        public async Task<PagequeryKnowledgeCategoryResponse> PagequeryKnowledgeCategoryAsync(PagequeryKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库信息列表
         * Summary: 商家自定义知识库-查询知识库信息列表
         */
        public PagequeryKnowledgeCategoryResponse PagequeryKnowledgeCategoryEx(PagequeryKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库信息列表
         * Summary: 商家自定义知识库-查询知识库信息列表
         */
        public async Task<PagequeryKnowledgeCategoryResponse> PagequeryKnowledgeCategoryExAsync(PagequeryKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public AddKnowledgeCategoryResponse AddKnowledgeCategory(AddKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public async Task<AddKnowledgeCategoryResponse> AddKnowledgeCategoryAsync(AddKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public AddKnowledgeCategoryResponse AddKnowledgeCategoryEx(AddKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public async Task<AddKnowledgeCategoryResponse> AddKnowledgeCategoryExAsync(AddKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public BatchdeleteKnowledgeCategoryResponse BatchdeleteKnowledgeCategory(BatchdeleteKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public async Task<BatchdeleteKnowledgeCategoryResponse> BatchdeleteKnowledgeCategoryAsync(BatchdeleteKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public BatchdeleteKnowledgeCategoryResponse BatchdeleteKnowledgeCategoryEx(BatchdeleteKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public async Task<BatchdeleteKnowledgeCategoryResponse> BatchdeleteKnowledgeCategoryExAsync(BatchdeleteKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public UpdateKnowledgeCategoryResponse UpdateKnowledgeCategory(UpdateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public async Task<UpdateKnowledgeCategoryResponse> UpdateKnowledgeCategoryAsync(UpdateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public UpdateKnowledgeCategoryResponse UpdateKnowledgeCategoryEx(UpdateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public async Task<UpdateKnowledgeCategoryResponse> UpdateKnowledgeCategoryExAsync(UpdateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识点流程撤回/上线/下线
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public OperateKnowledgeCategoryResponse OperateKnowledgeCategory(OperateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识点流程撤回/上线/下线
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public async Task<OperateKnowledgeCategoryResponse> OperateKnowledgeCategoryAsync(OperateKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识点流程撤回/上线/下线
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public OperateKnowledgeCategoryResponse OperateKnowledgeCategoryEx(OperateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识点流程撤回/上线/下线
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public async Task<OperateKnowledgeCategoryResponse> OperateKnowledgeCategoryExAsync(OperateKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public SubmitKnowledgeBaseinfoResponse SubmitKnowledgeBaseinfo(SubmitKnowledgeBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitKnowledgeBaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public async Task<SubmitKnowledgeBaseinfoResponse> SubmitKnowledgeBaseinfoAsync(SubmitKnowledgeBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitKnowledgeBaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public SubmitKnowledgeBaseinfoResponse SubmitKnowledgeBaseinfoEx(SubmitKnowledgeBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitKnowledgeBaseinfoResponse>(DoRequest("1.0", "antchain.ato.knowledge.baseinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public async Task<SubmitKnowledgeBaseinfoResponse> SubmitKnowledgeBaseinfoExAsync(SubmitKnowledgeBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitKnowledgeBaseinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.baseinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户知识库-知识点全量提交
         * Summary: 商户知识库-知识点全量提交
         */
        public SubmitKnowledgeCategoryResponse SubmitKnowledgeCategory(SubmitKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitKnowledgeCategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商户知识库-知识点全量提交
         * Summary: 商户知识库-知识点全量提交
         */
        public async Task<SubmitKnowledgeCategoryResponse> SubmitKnowledgeCategoryAsync(SubmitKnowledgeCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitKnowledgeCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户知识库-知识点全量提交
         * Summary: 商户知识库-知识点全量提交
         */
        public SubmitKnowledgeCategoryResponse SubmitKnowledgeCategoryEx(SubmitKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitKnowledgeCategoryResponse>(DoRequest("1.0", "antchain.ato.knowledge.category.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户知识库-知识点全量提交
         * Summary: 商户知识库-知识点全量提交
         */
        public async Task<SubmitKnowledgeCategoryResponse> SubmitKnowledgeCategoryExAsync(SubmitKnowledgeCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitKnowledgeCategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.category.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public QueryKnowledgeCategorylibraryResponse QueryKnowledgeCategorylibrary(QueryKnowledgeCategorylibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKnowledgeCategorylibraryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public async Task<QueryKnowledgeCategorylibraryResponse> QueryKnowledgeCategorylibraryAsync(QueryKnowledgeCategorylibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKnowledgeCategorylibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public QueryKnowledgeCategorylibraryResponse QueryKnowledgeCategorylibraryEx(QueryKnowledgeCategorylibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeCategorylibraryResponse>(DoRequest("1.0", "antchain.ato.knowledge.categorylibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public async Task<QueryKnowledgeCategorylibraryResponse> QueryKnowledgeCategorylibraryExAsync(QueryKnowledgeCategorylibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeCategorylibraryResponse>(await DoRequestAsync("1.0", "antchain.ato.knowledge.categorylibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public SubmitInnerKnowledgebaseinfoResponse SubmitInnerKnowledgebaseinfo(SubmitInnerKnowledgebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerKnowledgebaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public async Task<SubmitInnerKnowledgebaseinfoResponse> SubmitInnerKnowledgebaseinfoAsync(SubmitInnerKnowledgebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerKnowledgebaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public SubmitInnerKnowledgebaseinfoResponse SubmitInnerKnowledgebaseinfoEx(SubmitInnerKnowledgebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerKnowledgebaseinfoResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgebaseinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息维护
         * Summary: 商家自定义知识库-基础信息维护
         */
        public async Task<SubmitInnerKnowledgebaseinfoResponse> SubmitInnerKnowledgebaseinfoExAsync(SubmitInnerKnowledgebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerKnowledgebaseinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgebaseinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public QueryInnerKnowledgebaseinfoResponse QueryInnerKnowledgebaseinfo(QueryInnerKnowledgebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerKnowledgebaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public async Task<QueryInnerKnowledgebaseinfoResponse> QueryInnerKnowledgebaseinfoAsync(QueryInnerKnowledgebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerKnowledgebaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public QueryInnerKnowledgebaseinfoResponse QueryInnerKnowledgebaseinfoEx(QueryInnerKnowledgebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerKnowledgebaseinfoResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgebaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-基础信息查询
         * Summary: 商家自定义知识库-基础信息查询
         */
        public async Task<QueryInnerKnowledgebaseinfoResponse> QueryInnerKnowledgebaseinfoExAsync(QueryInnerKnowledgebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerKnowledgebaseinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgebaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 户知识库-知识点全量提交
         * Summary: 户知识库-知识点全量提交
         */
        public SubmitInnerKnowledgecategoryResponse SubmitInnerKnowledgecategory(SubmitInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 户知识库-知识点全量提交
         * Summary: 户知识库-知识点全量提交
         */
        public async Task<SubmitInnerKnowledgecategoryResponse> SubmitInnerKnowledgecategoryAsync(SubmitInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 户知识库-知识点全量提交
         * Summary: 户知识库-知识点全量提交
         */
        public SubmitInnerKnowledgecategoryResponse SubmitInnerKnowledgecategoryEx(SubmitInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 户知识库-知识点全量提交
         * Summary: 户知识库-知识点全量提交
         */
        public async Task<SubmitInnerKnowledgecategoryResponse> SubmitInnerKnowledgecategoryExAsync(SubmitInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public QueryInnerKnowledgecategorylibraryResponse QueryInnerKnowledgecategorylibrary(QueryInnerKnowledgecategorylibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerKnowledgecategorylibraryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public async Task<QueryInnerKnowledgecategorylibraryResponse> QueryInnerKnowledgecategorylibraryAsync(QueryInnerKnowledgecategorylibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerKnowledgecategorylibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public QueryInnerKnowledgecategorylibraryResponse QueryInnerKnowledgecategorylibraryEx(QueryInnerKnowledgecategorylibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerKnowledgecategorylibraryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategorylibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-查询知识库id
         * Summary: 商家自定义知识库-查询知识库id
         */
        public async Task<QueryInnerKnowledgecategorylibraryResponse> QueryInnerKnowledgecategorylibraryExAsync(QueryInnerKnowledgecategorylibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerKnowledgecategorylibraryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategorylibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public CreateInnerKnowledgecategoryResponse CreateInnerKnowledgecategory(CreateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public async Task<CreateInnerKnowledgecategoryResponse> CreateInnerKnowledgecategoryAsync(CreateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public CreateInnerKnowledgecategoryResponse CreateInnerKnowledgecategoryEx(CreateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-创建用户自定义知识库
         * Summary: 商家自定义知识库-创建用户自定义知识库
         */
        public async Task<CreateInnerKnowledgecategoryResponse> CreateInnerKnowledgecategoryExAsync(CreateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public BatchdeleteInnerKnowledgecategoryResponse BatchdeleteInnerKnowledgecategory(BatchdeleteInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public async Task<BatchdeleteInnerKnowledgecategoryResponse> BatchdeleteInnerKnowledgecategoryAsync(BatchdeleteInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public BatchdeleteInnerKnowledgecategoryResponse BatchdeleteInnerKnowledgecategoryEx(BatchdeleteInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识库信息批量删除
         * Summary: 商家自定义知识库-知识库信息批量删除
         */
        public async Task<BatchdeleteInnerKnowledgecategoryResponse> BatchdeleteInnerKnowledgecategoryExAsync(BatchdeleteInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识点相关功能
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public OperateInnerKnowledgecategoryResponse OperateInnerKnowledgecategory(OperateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识点相关功能
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public async Task<OperateInnerKnowledgecategoryResponse> OperateInnerKnowledgecategoryAsync(OperateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-知识点相关功能
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public OperateInnerKnowledgecategoryResponse OperateInnerKnowledgecategoryEx(OperateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-知识点相关功能
         * Summary: 商家自定义知识库-知识点相关功能
         */
        public async Task<OperateInnerKnowledgecategoryResponse> OperateInnerKnowledgecategoryExAsync(OperateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public AddInnerKnowledgecategoryResponse AddInnerKnowledgecategory(AddInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public async Task<AddInnerKnowledgecategoryResponse> AddInnerKnowledgecategoryAsync(AddInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public AddInnerKnowledgecategoryResponse AddInnerKnowledgecategoryEx(AddInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-新增知识知识库信息
         * Summary: 商家自定义知识库-新增知识知识库信息
         */
        public async Task<AddInnerKnowledgecategoryResponse> AddInnerKnowledgecategoryExAsync(AddInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 
        商家自定义知识库-查询知识库信息列表
         * Summary:  商家自定义知识库-查询知识库信息列表
         */
        public PagequeryInnerKnowledgecategoryResponse PagequeryInnerKnowledgecategory(PagequeryInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 
        商家自定义知识库-查询知识库信息列表
         * Summary:  商家自定义知识库-查询知识库信息列表
         */
        public async Task<PagequeryInnerKnowledgecategoryResponse> PagequeryInnerKnowledgecategoryAsync(PagequeryInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 
        商家自定义知识库-查询知识库信息列表
         * Summary:  商家自定义知识库-查询知识库信息列表
         */
        public PagequeryInnerKnowledgecategoryResponse PagequeryInnerKnowledgecategoryEx(PagequeryInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 
        商家自定义知识库-查询知识库信息列表
         * Summary:  商家自定义知识库-查询知识库信息列表
         */
        public async Task<PagequeryInnerKnowledgecategoryResponse> PagequeryInnerKnowledgecategoryExAsync(PagequeryInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public UpdateInnerKnowledgecategoryResponse UpdateInnerKnowledgecategory(UpdateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerKnowledgecategoryEx(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public async Task<UpdateInnerKnowledgecategoryResponse> UpdateInnerKnowledgecategoryAsync(UpdateInnerKnowledgecategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerKnowledgecategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public UpdateInnerKnowledgecategoryResponse UpdateInnerKnowledgecategoryEx(UpdateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerKnowledgecategoryResponse>(DoRequest("1.0", "antchain.ato.inner.knowledgecategory.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家自定义知识库-编辑知识点
         * Summary: 商家自定义知识库-编辑知识点
         */
        public async Task<UpdateInnerKnowledgecategoryResponse> UpdateInnerKnowledgecategoryExAsync(UpdateInnerKnowledgecategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerKnowledgecategoryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.knowledgecategory.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
         * Summary: 分销渠道创建
         */
        public CreateInnerSaleschannelResponse CreateInnerSaleschannel(CreateInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerSaleschannelEx(request, headers, runtime);
        }

        /**
         * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
         * Summary: 分销渠道创建
         */
        public async Task<CreateInnerSaleschannelResponse> CreateInnerSaleschannelAsync(CreateInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerSaleschannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
         * Summary: 分销渠道创建
         */
        public CreateInnerSaleschannelResponse CreateInnerSaleschannelEx(CreateInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerSaleschannelResponse>(DoRequest("1.0", "antchain.ato.inner.saleschannel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
         * Summary: 分销渠道创建
         */
        public async Task<CreateInnerSaleschannelResponse> CreateInnerSaleschannelExAsync(CreateInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerSaleschannelResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.saleschannel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分销渠道code、名称、级别等信息
         * Summary: 分销渠道查询
         */
        public QueryInnerSaleschannelResponse QueryInnerSaleschannel(QueryInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerSaleschannelEx(request, headers, runtime);
        }

        /**
         * Description: 查询分销渠道code、名称、级别等信息
         * Summary: 分销渠道查询
         */
        public async Task<QueryInnerSaleschannelResponse> QueryInnerSaleschannelAsync(QueryInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerSaleschannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分销渠道code、名称、级别等信息
         * Summary: 分销渠道查询
         */
        public QueryInnerSaleschannelResponse QueryInnerSaleschannelEx(QueryInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSaleschannelResponse>(DoRequest("1.0", "antchain.ato.inner.saleschannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分销渠道code、名称、级别等信息
         * Summary: 分销渠道查询
         */
        public async Task<QueryInnerSaleschannelResponse> QueryInnerSaleschannelExAsync(QueryInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerSaleschannelResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.saleschannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分销渠道更新，当前支持修改渠道名称
         * Summary: 分销渠道更新
         */
        public UpdateInnerSaleschannelResponse UpdateInnerSaleschannel(UpdateInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerSaleschannelEx(request, headers, runtime);
        }

        /**
         * Description: 分销渠道更新，当前支持修改渠道名称
         * Summary: 分销渠道更新
         */
        public async Task<UpdateInnerSaleschannelResponse> UpdateInnerSaleschannelAsync(UpdateInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerSaleschannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 分销渠道更新，当前支持修改渠道名称
         * Summary: 分销渠道更新
         */
        public UpdateInnerSaleschannelResponse UpdateInnerSaleschannelEx(UpdateInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerSaleschannelResponse>(DoRequest("1.0", "antchain.ato.inner.saleschannel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分销渠道更新，当前支持修改渠道名称
         * Summary: 分销渠道更新
         */
        public async Task<UpdateInnerSaleschannelResponse> UpdateInnerSaleschannelExAsync(UpdateInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerSaleschannelResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.saleschannel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除所选的分销渠道
         * Summary: 分销渠道删除
         */
        public DeleteInnerSaleschannelResponse DeleteInnerSaleschannel(DeleteInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerSaleschannelEx(request, headers, runtime);
        }

        /**
         * Description: 删除所选的分销渠道
         * Summary: 分销渠道删除
         */
        public async Task<DeleteInnerSaleschannelResponse> DeleteInnerSaleschannelAsync(DeleteInnerSaleschannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerSaleschannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除所选的分销渠道
         * Summary: 分销渠道删除
         */
        public DeleteInnerSaleschannelResponse DeleteInnerSaleschannelEx(DeleteInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerSaleschannelResponse>(DoRequest("1.0", "antchain.ato.inner.saleschannel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除所选的分销渠道
         * Summary: 分销渠道删除
         */
        public async Task<DeleteInnerSaleschannelResponse> DeleteInnerSaleschannelExAsync(DeleteInnerSaleschannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerSaleschannelResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.saleschannel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建文本域（组件）
         * Summary: 批量创建文本域
         */
        public BatchcreateInnerTemplatetextareaResponse BatchcreateInnerTemplatetextarea(BatchcreateInnerTemplatetextareaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateInnerTemplatetextareaEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建文本域（组件）
         * Summary: 批量创建文本域
         */
        public async Task<BatchcreateInnerTemplatetextareaResponse> BatchcreateInnerTemplatetextareaAsync(BatchcreateInnerTemplatetextareaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateInnerTemplatetextareaExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建文本域（组件）
         * Summary: 批量创建文本域
         */
        public BatchcreateInnerTemplatetextareaResponse BatchcreateInnerTemplatetextareaEx(BatchcreateInnerTemplatetextareaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateInnerTemplatetextareaResponse>(DoRequest("1.0", "antchain.ato.inner.templatetextarea.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建文本域（组件）
         * Summary: 批量创建文本域
         */
        public async Task<BatchcreateInnerTemplatetextareaResponse> BatchcreateInnerTemplatetextareaExAsync(BatchcreateInnerTemplatetextareaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateInnerTemplatetextareaResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templatetextarea.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步解约申请列表
         * Summary: 异步解约申请列表
         */
        public PagequeryInnerAgreementterminateResponse PagequeryInnerAgreementterminate(PagequeryInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerAgreementterminateEx(request, headers, runtime);
        }

        /**
         * Description: 异步解约申请列表
         * Summary: 异步解约申请列表
         */
        public async Task<PagequeryInnerAgreementterminateResponse> PagequeryInnerAgreementterminateAsync(PagequeryInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerAgreementterminateExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步解约申请列表
         * Summary: 异步解约申请列表
         */
        public PagequeryInnerAgreementterminateResponse PagequeryInnerAgreementterminateEx(PagequeryInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerAgreementterminateResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminate.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步解约申请列表
         * Summary: 异步解约申请列表
         */
        public async Task<PagequeryInnerAgreementterminateResponse> PagequeryInnerAgreementterminateExAsync(PagequeryInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerAgreementterminateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminate.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请记录详情
         * Summary: 解约申请记录详情
         */
        public DetailInnerAgreementterminateResponse DetailInnerAgreementterminate(DetailInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerAgreementterminateEx(request, headers, runtime);
        }

        /**
         * Description: 解约申请记录详情
         * Summary: 解约申请记录详情
         */
        public async Task<DetailInnerAgreementterminateResponse> DetailInnerAgreementterminateAsync(DetailInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerAgreementterminateExAsync(request, headers, runtime);
        }

        /**
         * Description: 解约申请记录详情
         * Summary: 解约申请记录详情
         */
        public DetailInnerAgreementterminateResponse DetailInnerAgreementterminateEx(DetailInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerAgreementterminateResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminate.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请记录详情
         * Summary: 解约申请记录详情
         */
        public async Task<DetailInnerAgreementterminateResponse> DetailInnerAgreementterminateExAsync(DetailInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerAgreementterminateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminate.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣解约申请处理
         * Summary: 代扣解约申请处理
         */
        public OperateInnerAgreementterminateResponse OperateInnerAgreementterminate(OperateInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateInnerAgreementterminateEx(request, headers, runtime);
        }

        /**
         * Description: 代扣解约申请处理
         * Summary: 代扣解约申请处理
         */
        public async Task<OperateInnerAgreementterminateResponse> OperateInnerAgreementterminateAsync(OperateInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateInnerAgreementterminateExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣解约申请处理
         * Summary: 代扣解约申请处理
         */
        public OperateInnerAgreementterminateResponse OperateInnerAgreementterminateEx(OperateInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerAgreementterminateResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminate.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣解约申请处理
         * Summary: 代扣解约申请处理
         */
        public async Task<OperateInnerAgreementterminateResponse> OperateInnerAgreementterminateExAsync(OperateInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerAgreementterminateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminate.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户补充拒绝举证材料
         * Summary: 商户补充拒绝举证材料
         */
        public ChargeInnerAgreementterminateevidenceResponse ChargeInnerAgreementterminateevidence(ChargeInnerAgreementterminateevidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ChargeInnerAgreementterminateevidenceEx(request, headers, runtime);
        }

        /**
         * Description: 商户补充拒绝举证材料
         * Summary: 商户补充拒绝举证材料
         */
        public async Task<ChargeInnerAgreementterminateevidenceResponse> ChargeInnerAgreementterminateevidenceAsync(ChargeInnerAgreementterminateevidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ChargeInnerAgreementterminateevidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户补充拒绝举证材料
         * Summary: 商户补充拒绝举证材料
         */
        public ChargeInnerAgreementterminateevidenceResponse ChargeInnerAgreementterminateevidenceEx(ChargeInnerAgreementterminateevidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChargeInnerAgreementterminateevidenceResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminateevidence.charge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户补充拒绝举证材料
         * Summary: 商户补充拒绝举证材料
         */
        public async Task<ChargeInnerAgreementterminateevidenceResponse> ChargeInnerAgreementterminateevidenceExAsync(ChargeInnerAgreementterminateevidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChargeInnerAgreementterminateevidenceResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminateevidence.charge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣异步解约-支付宝是否直接解约
         * Summary: 代扣异步解约-支付宝是否直接解约
         */
        public OperateInnerAgreementterminatezfbdirectResponse OperateInnerAgreementterminatezfbdirect(OperateInnerAgreementterminatezfbdirectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateInnerAgreementterminatezfbdirectEx(request, headers, runtime);
        }

        /**
         * Description: 代扣异步解约-支付宝是否直接解约
         * Summary: 代扣异步解约-支付宝是否直接解约
         */
        public async Task<OperateInnerAgreementterminatezfbdirectResponse> OperateInnerAgreementterminatezfbdirectAsync(OperateInnerAgreementterminatezfbdirectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateInnerAgreementterminatezfbdirectExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣异步解约-支付宝是否直接解约
         * Summary: 代扣异步解约-支付宝是否直接解约
         */
        public OperateInnerAgreementterminatezfbdirectResponse OperateInnerAgreementterminatezfbdirectEx(OperateInnerAgreementterminatezfbdirectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerAgreementterminatezfbdirectResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminatezfbdirect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣异步解约-支付宝是否直接解约
         * Summary: 代扣异步解约-支付宝是否直接解约
         */
        public async Task<OperateInnerAgreementterminatezfbdirectResponse> OperateInnerAgreementterminatezfbdirectExAsync(OperateInnerAgreementterminatezfbdirectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerAgreementterminatezfbdirectResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminatezfbdirect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请配置详情
         * Summary: 解约申请配置详情
         */
        public QueryInnerAgreementterminateconfigResponse QueryInnerAgreementterminateconfig(QueryInnerAgreementterminateconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerAgreementterminateconfigEx(request, headers, runtime);
        }

        /**
         * Description: 解约申请配置详情
         * Summary: 解约申请配置详情
         */
        public async Task<QueryInnerAgreementterminateconfigResponse> QueryInnerAgreementterminateconfigAsync(QueryInnerAgreementterminateconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerAgreementterminateconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 解约申请配置详情
         * Summary: 解约申请配置详情
         */
        public QueryInnerAgreementterminateconfigResponse QueryInnerAgreementterminateconfigEx(QueryInnerAgreementterminateconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAgreementterminateconfigResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminateconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请配置详情
         * Summary: 解约申请配置详情
         */
        public async Task<QueryInnerAgreementterminateconfigResponse> QueryInnerAgreementterminateconfigExAsync(QueryInnerAgreementterminateconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAgreementterminateconfigResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminateconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请商户各状态统计
         * Summary: 解约申请商户各状态统计
         */
        public CountInnerAgreementterminateResponse CountInnerAgreementterminate(CountInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountInnerAgreementterminateEx(request, headers, runtime);
        }

        /**
         * Description: 解约申请商户各状态统计
         * Summary: 解约申请商户各状态统计
         */
        public async Task<CountInnerAgreementterminateResponse> CountInnerAgreementterminateAsync(CountInnerAgreementterminateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountInnerAgreementterminateExAsync(request, headers, runtime);
        }

        /**
         * Description: 解约申请商户各状态统计
         * Summary: 解约申请商户各状态统计
         */
        public CountInnerAgreementterminateResponse CountInnerAgreementterminateEx(CountInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountInnerAgreementterminateResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminate.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解约申请商户各状态统计
         * Summary: 解约申请商户各状态统计
         */
        public async Task<CountInnerAgreementterminateResponse> CountInnerAgreementterminateExAsync(CountInnerAgreementterminateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountInnerAgreementterminateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminate.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
         * Summary: 代扣异步解约商户侧二级户查询订单
         */
        public QueryInnerAgreementterminateorderResponse QueryInnerAgreementterminateorder(QueryInnerAgreementterminateorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerAgreementterminateorderEx(request, headers, runtime);
        }

        /**
         * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
         * Summary: 代扣异步解约商户侧二级户查询订单
         */
        public async Task<QueryInnerAgreementterminateorderResponse> QueryInnerAgreementterminateorderAsync(QueryInnerAgreementterminateorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerAgreementterminateorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
         * Summary: 代扣异步解约商户侧二级户查询订单
         */
        public QueryInnerAgreementterminateorderResponse QueryInnerAgreementterminateorderEx(QueryInnerAgreementterminateorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAgreementterminateorderResponse>(DoRequest("1.0", "antchain.ato.inner.agreementterminateorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
         * Summary: 代扣异步解约商户侧二级户查询订单
         */
        public async Task<QueryInnerAgreementterminateorderResponse> QueryInnerAgreementterminateorderExAsync(QueryInnerAgreementterminateorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAgreementterminateorderResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.agreementterminateorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品列表查询
         * Summary: 随时享商户侧商品列表查询
         */
        public PagequeryInnerPlatformproductResponse PagequeryInnerPlatformproduct(PagequeryInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerPlatformproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品列表查询
         * Summary: 随时享商户侧商品列表查询
         */
        public async Task<PagequeryInnerPlatformproductResponse> PagequeryInnerPlatformproductAsync(PagequeryInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerPlatformproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品列表查询
         * Summary: 随时享商户侧商品列表查询
         */
        public PagequeryInnerPlatformproductResponse PagequeryInnerPlatformproductEx(PagequeryInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPlatformproductResponse>(DoRequest("1.0", "antchain.ato.inner.platformproduct.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品列表查询
         * Summary: 随时享商户侧商品列表查询
         */
        public async Task<PagequeryInnerPlatformproductResponse> PagequeryInnerPlatformproductExAsync(PagequeryInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPlatformproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformproduct.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品详情查询
         * Summary: 随时享商户侧商品详情查询
         */
        public DetailInnerPlatformproductResponse DetailInnerPlatformproduct(DetailInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerPlatformproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品详情查询
         * Summary: 随时享商户侧商品详情查询
         */
        public async Task<DetailInnerPlatformproductResponse> DetailInnerPlatformproductAsync(DetailInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerPlatformproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品详情查询
         * Summary: 随时享商户侧商品详情查询
         */
        public DetailInnerPlatformproductResponse DetailInnerPlatformproductEx(DetailInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerPlatformproductResponse>(DoRequest("1.0", "antchain.ato.inner.platformproduct.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品详情查询
         * Summary: 随时享商户侧商品详情查询
         */
        public async Task<DetailInnerPlatformproductResponse> DetailInnerPlatformproductExAsync(DetailInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerPlatformproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformproduct.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品报名或者编辑
         * Summary: 随时享商户侧商品报名或者编辑
         */
        public SubmitInnerPlatformproductResponse SubmitInnerPlatformproduct(SubmitInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerPlatformproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品报名或者编辑
         * Summary: 随时享商户侧商品报名或者编辑
         */
        public async Task<SubmitInnerPlatformproductResponse> SubmitInnerPlatformproductAsync(SubmitInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerPlatformproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品报名或者编辑
         * Summary: 随时享商户侧商品报名或者编辑
         */
        public SubmitInnerPlatformproductResponse SubmitInnerPlatformproductEx(SubmitInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerPlatformproductResponse>(DoRequest("1.0", "antchain.ato.inner.platformproduct.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品报名或者编辑
         * Summary: 随时享商户侧商品报名或者编辑
         */
        public async Task<SubmitInnerPlatformproductResponse> SubmitInnerPlatformproductExAsync(SubmitInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerPlatformproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformproduct.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品报名退出
         * Summary: 随时享商户侧商品报名退出
         */
        public ReclaimInnerPlatformproductResponse ReclaimInnerPlatformproduct(ReclaimInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReclaimInnerPlatformproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品报名退出
         * Summary: 随时享商户侧商品报名退出
         */
        public async Task<ReclaimInnerPlatformproductResponse> ReclaimInnerPlatformproductAsync(ReclaimInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReclaimInnerPlatformproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品报名退出
         * Summary: 随时享商户侧商品报名退出
         */
        public ReclaimInnerPlatformproductResponse ReclaimInnerPlatformproductEx(ReclaimInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimInnerPlatformproductResponse>(DoRequest("1.0", "antchain.ato.inner.platformproduct.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品报名退出
         * Summary: 随时享商户侧商品报名退出
         */
        public async Task<ReclaimInnerPlatformproductResponse> ReclaimInnerPlatformproductExAsync(ReclaimInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimInnerPlatformproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformproduct.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品租赁价格配置
         * Summary: 随时享商户侧商品租赁价格配置
         */
        public SetInnerPlatformproductResponse SetInnerPlatformproduct(SetInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetInnerPlatformproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品租赁价格配置
         * Summary: 随时享商户侧商品租赁价格配置
         */
        public async Task<SetInnerPlatformproductResponse> SetInnerPlatformproductAsync(SetInnerPlatformproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetInnerPlatformproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享商户侧商品租赁价格配置
         * Summary: 随时享商户侧商品租赁价格配置
         */
        public SetInnerPlatformproductResponse SetInnerPlatformproductEx(SetInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetInnerPlatformproductResponse>(DoRequest("1.0", "antchain.ato.inner.platformproduct.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享商户侧商品租赁价格配置
         * Summary: 随时享商户侧商品租赁价格配置
         */
        public async Task<SetInnerPlatformproductResponse> SetInnerPlatformproductExAsync(SetInnerPlatformproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetInnerPlatformproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformproduct.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权协议状态
         * Summary: 授权协议状态查询
         */
        public QueryInnerAuthagreementResponse QueryInnerAuthagreement(QueryInnerAuthagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerAuthagreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权协议状态
         * Summary: 授权协议状态查询
         */
        public async Task<QueryInnerAuthagreementResponse> QueryInnerAuthagreementAsync(QueryInnerAuthagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerAuthagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权协议状态
         * Summary: 授权协议状态查询
         */
        public QueryInnerAuthagreementResponse QueryInnerAuthagreementEx(QueryInnerAuthagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAuthagreementResponse>(DoRequest("1.0", "antchain.ato.inner.authagreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权协议状态
         * Summary: 授权协议状态查询
         */
        public async Task<QueryInnerAuthagreementResponse> QueryInnerAuthagreementExAsync(QueryInnerAuthagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAuthagreementResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.authagreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 访问需授权的业务功能是进行协议授权确认
         * Summary: 协议授权确认
         */
        public ConfirmInnerAuthagreementResponse ConfirmInnerAuthagreement(ConfirmInnerAuthagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmInnerAuthagreementEx(request, headers, runtime);
        }

        /**
         * Description: 访问需授权的业务功能是进行协议授权确认
         * Summary: 协议授权确认
         */
        public async Task<ConfirmInnerAuthagreementResponse> ConfirmInnerAuthagreementAsync(ConfirmInnerAuthagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmInnerAuthagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 访问需授权的业务功能是进行协议授权确认
         * Summary: 协议授权确认
         */
        public ConfirmInnerAuthagreementResponse ConfirmInnerAuthagreementEx(ConfirmInnerAuthagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmInnerAuthagreementResponse>(DoRequest("1.0", "antchain.ato.inner.authagreement.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 访问需授权的业务功能是进行协议授权确认
         * Summary: 协议授权确认
         */
        public async Task<ConfirmInnerAuthagreementResponse> ConfirmInnerAuthagreementExAsync(ConfirmInnerAuthagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmInnerAuthagreementResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.authagreement.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景分页列表
         * Summary: 随时享-服务商平台场景分页列表
         */
        public PagequeryInnerSceneproductResponse PagequeryInnerSceneproduct(PagequeryInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerSceneproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景分页列表
         * Summary: 随时享-服务商平台场景分页列表
         */
        public async Task<PagequeryInnerSceneproductResponse> PagequeryInnerSceneproductAsync(PagequeryInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerSceneproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景分页列表
         * Summary: 随时享-服务商平台场景分页列表
         */
        public PagequeryInnerSceneproductResponse PagequeryInnerSceneproductEx(PagequeryInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerSceneproductResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproduct.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景分页列表
         * Summary: 随时享-服务商平台场景分页列表
         */
        public async Task<PagequeryInnerSceneproductResponse> PagequeryInnerSceneproductExAsync(PagequeryInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerSceneproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproduct.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品详情
         * Summary: 随时享-服务商平台场景商品详情
         */
        public DetailInnerSceneproductResponse DetailInnerSceneproduct(DetailInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerSceneproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品详情
         * Summary: 随时享-服务商平台场景商品详情
         */
        public async Task<DetailInnerSceneproductResponse> DetailInnerSceneproductAsync(DetailInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerSceneproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品详情
         * Summary: 随时享-服务商平台场景商品详情
         */
        public DetailInnerSceneproductResponse DetailInnerSceneproductEx(DetailInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerSceneproductResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproduct.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品详情
         * Summary: 随时享-服务商平台场景商品详情
         */
        public async Task<DetailInnerSceneproductResponse> DetailInnerSceneproductExAsync(DetailInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerSceneproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproduct.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品批量添加
         * Summary: 随时享-服务商平台场景商品批量添加
         */
        public BatchcreateInnerSceneproductResponse BatchcreateInnerSceneproduct(BatchcreateInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateInnerSceneproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品批量添加
         * Summary: 随时享-服务商平台场景商品批量添加
         */
        public async Task<BatchcreateInnerSceneproductResponse> BatchcreateInnerSceneproductAsync(BatchcreateInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateInnerSceneproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品批量添加
         * Summary: 随时享-服务商平台场景商品批量添加
         */
        public BatchcreateInnerSceneproductResponse BatchcreateInnerSceneproductEx(BatchcreateInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateInnerSceneproductResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproduct.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品批量添加
         * Summary: 随时享-服务商平台场景商品批量添加
         */
        public async Task<BatchcreateInnerSceneproductResponse> BatchcreateInnerSceneproductExAsync(BatchcreateInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateInnerSceneproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproduct.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品移除
         * Summary: 随时享-服务商平台场景商品移除
         */
        public DeleteInnerSceneproductResponse DeleteInnerSceneproduct(DeleteInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerSceneproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品移除
         * Summary: 随时享-服务商平台场景商品移除
         */
        public async Task<DeleteInnerSceneproductResponse> DeleteInnerSceneproductAsync(DeleteInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerSceneproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品移除
         * Summary: 随时享-服务商平台场景商品移除
         */
        public DeleteInnerSceneproductResponse DeleteInnerSceneproductEx(DeleteInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerSceneproductResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproduct.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品移除
         * Summary: 随时享-服务商平台场景商品移除
         */
        public async Task<DeleteInnerSceneproductResponse> DeleteInnerSceneproductExAsync(DeleteInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerSceneproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproduct.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家列表
         * Summary: 随时享-服务商平台场景商品适用商家列表
         */
        public ListInnerSceneproductmerchantResponse ListInnerSceneproductmerchant(ListInnerSceneproductmerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListInnerSceneproductmerchantEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家列表
         * Summary: 随时享-服务商平台场景商品适用商家列表
         */
        public async Task<ListInnerSceneproductmerchantResponse> ListInnerSceneproductmerchantAsync(ListInnerSceneproductmerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListInnerSceneproductmerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家列表
         * Summary: 随时享-服务商平台场景商品适用商家列表
         */
        public ListInnerSceneproductmerchantResponse ListInnerSceneproductmerchantEx(ListInnerSceneproductmerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListInnerSceneproductmerchantResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproductmerchant.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家列表
         * Summary: 随时享-服务商平台场景商品适用商家列表
         */
        public async Task<ListInnerSceneproductmerchantResponse> ListInnerSceneproductmerchantExAsync(ListInnerSceneproductmerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListInnerSceneproductmerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproductmerchant.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家编辑
         * Summary: 随时享-服务商平台场景商品适用商家编辑
         */
        public OperateInnerSceneproductmerchantResponse OperateInnerSceneproductmerchant(OperateInnerSceneproductmerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateInnerSceneproductmerchantEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家编辑
         * Summary: 随时享-服务商平台场景商品适用商家编辑
         */
        public async Task<OperateInnerSceneproductmerchantResponse> OperateInnerSceneproductmerchantAsync(OperateInnerSceneproductmerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateInnerSceneproductmerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家编辑
         * Summary: 随时享-服务商平台场景商品适用商家编辑
         */
        public OperateInnerSceneproductmerchantResponse OperateInnerSceneproductmerchantEx(OperateInnerSceneproductmerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerSceneproductmerchantResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproductmerchant.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品适用商家编辑
         * Summary: 随时享-服务商平台场景商品适用商家编辑
         */
        public async Task<OperateInnerSceneproductmerchantResponse> OperateInnerSceneproductmerchantExAsync(OperateInnerSceneproductmerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInnerSceneproductmerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproductmerchant.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品上下架
         * Summary: 随时享-服务商平台场景商品上下架
         */
        public OnlineInnerSceneproductResponse OnlineInnerSceneproduct(OnlineInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineInnerSceneproductEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品上下架
         * Summary: 随时享-服务商平台场景商品上下架
         */
        public async Task<OnlineInnerSceneproductResponse> OnlineInnerSceneproductAsync(OnlineInnerSceneproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineInnerSceneproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台场景商品上下架
         * Summary: 随时享-服务商平台场景商品上下架
         */
        public OnlineInnerSceneproductResponse OnlineInnerSceneproductEx(OnlineInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineInnerSceneproductResponse>(DoRequest("1.0", "antchain.ato.inner.sceneproduct.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台场景商品上下架
         * Summary: 随时享-服务商平台场景商品上下架
         */
        public async Task<OnlineInnerSceneproductResponse> OnlineInnerSceneproductExAsync(OnlineInnerSceneproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineInnerSceneproductResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.sceneproduct.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
         * Summary: 随时享-服务商平台用户线索跟进
         */
        public PagequeryInnerPlatformorderleadResponse PagequeryInnerPlatformorderlead(PagequeryInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerPlatformorderleadEx(request, headers, runtime);
        }

        /**
         * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
         * Summary: 随时享-服务商平台用户线索跟进
         */
        public async Task<PagequeryInnerPlatformorderleadResponse> PagequeryInnerPlatformorderleadAsync(PagequeryInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerPlatformorderleadExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
         * Summary: 随时享-服务商平台用户线索跟进
         */
        public PagequeryInnerPlatformorderleadResponse PagequeryInnerPlatformorderleadEx(PagequeryInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPlatformorderleadResponse>(DoRequest("1.0", "antchain.ato.inner.platformorderlead.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
         * Summary: 随时享-服务商平台用户线索跟进
         */
        public async Task<PagequeryInnerPlatformorderleadResponse> PagequeryInnerPlatformorderleadExAsync(PagequeryInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPlatformorderleadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformorderlead.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台订单用户线索备注保存
         * Summary: 随时享-服务商平台用户线索跟进备注保存
         */
        public SaveInnerPlatformorderleadResponse SaveInnerPlatformorderlead(SaveInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveInnerPlatformorderleadEx(request, headers, runtime);
        }

        /**
         * Description: 平台订单用户线索备注保存
         * Summary: 随时享-服务商平台用户线索跟进备注保存
         */
        public async Task<SaveInnerPlatformorderleadResponse> SaveInnerPlatformorderleadAsync(SaveInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveInnerPlatformorderleadExAsync(request, headers, runtime);
        }

        /**
         * Description: 平台订单用户线索备注保存
         * Summary: 随时享-服务商平台用户线索跟进备注保存
         */
        public SaveInnerPlatformorderleadResponse SaveInnerPlatformorderleadEx(SaveInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerPlatformorderleadResponse>(DoRequest("1.0", "antchain.ato.inner.platformorderlead.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台订单用户线索备注保存
         * Summary: 随时享-服务商平台用户线索跟进备注保存
         */
        public async Task<SaveInnerPlatformorderleadResponse> SaveInnerPlatformorderleadExAsync(SaveInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInnerPlatformorderleadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformorderlead.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景创建
         * Summary: 营销场景创建
         */
        public CreateInnerPromotionsceneResponse CreateInnerPromotionscene(CreateInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerPromotionsceneEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景创建
         * Summary: 营销场景创建
         */
        public async Task<CreateInnerPromotionsceneResponse> CreateInnerPromotionsceneAsync(CreateInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerPromotionsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景创建
         * Summary: 营销场景创建
         */
        public CreateInnerPromotionsceneResponse CreateInnerPromotionsceneEx(CreateInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerPromotionsceneResponse>(DoRequest("1.0", "antchain.ato.inner.promotionscene.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景创建
         * Summary: 营销场景创建
         */
        public async Task<CreateInnerPromotionsceneResponse> CreateInnerPromotionsceneExAsync(CreateInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerPromotionsceneResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.promotionscene.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景分页查询
         * Summary: 营销场景分页查询
         */
        public PagequeryInnerPromotionsceneResponse PagequeryInnerPromotionscene(PagequeryInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerPromotionsceneEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景分页查询
         * Summary: 营销场景分页查询
         */
        public async Task<PagequeryInnerPromotionsceneResponse> PagequeryInnerPromotionsceneAsync(PagequeryInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerPromotionsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景分页查询
         * Summary: 营销场景分页查询
         */
        public PagequeryInnerPromotionsceneResponse PagequeryInnerPromotionsceneEx(PagequeryInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPromotionsceneResponse>(DoRequest("1.0", "antchain.ato.inner.promotionscene.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景分页查询
         * Summary: 营销场景分页查询
         */
        public async Task<PagequeryInnerPromotionsceneResponse> PagequeryInnerPromotionsceneExAsync(PagequeryInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerPromotionsceneResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.promotionscene.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景更新
         * Summary: 营销场景更新
         */
        public UpdateInnerPromotionsceneResponse UpdateInnerPromotionscene(UpdateInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInnerPromotionsceneEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景更新
         * Summary: 营销场景更新
         */
        public async Task<UpdateInnerPromotionsceneResponse> UpdateInnerPromotionsceneAsync(UpdateInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInnerPromotionsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景更新
         * Summary: 营销场景更新
         */
        public UpdateInnerPromotionsceneResponse UpdateInnerPromotionsceneEx(UpdateInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerPromotionsceneResponse>(DoRequest("1.0", "antchain.ato.inner.promotionscene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景更新
         * Summary: 营销场景更新
         */
        public async Task<UpdateInnerPromotionsceneResponse> UpdateInnerPromotionsceneExAsync(UpdateInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInnerPromotionsceneResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.promotionscene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景删除
         * Summary: 营销场景删除
         */
        public DeleteInnerPromotionsceneResponse DeleteInnerPromotionscene(DeleteInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerPromotionsceneEx(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景删除
         * Summary: 营销场景删除
         */
        public async Task<DeleteInnerPromotionsceneResponse> DeleteInnerPromotionsceneAsync(DeleteInnerPromotionsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerPromotionsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 随时享-服务商平台-营销场景删除
         * Summary: 营销场景删除
         */
        public DeleteInnerPromotionsceneResponse DeleteInnerPromotionsceneEx(DeleteInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerPromotionsceneResponse>(DoRequest("1.0", "antchain.ato.inner.promotionscene.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随时享-服务商平台-营销场景删除
         * Summary: 营销场景删除
         */
        public async Task<DeleteInnerPromotionsceneResponse> DeleteInnerPromotionsceneExAsync(DeleteInnerPromotionsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerPromotionsceneResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.promotionscene.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台订单用户线索备注删除
         * Summary: 随时享-服务商平台用户线索跟进删除备注
         */
        public DeleteInnerPlatformorderleadResponse DeleteInnerPlatformorderlead(DeleteInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteInnerPlatformorderleadEx(request, headers, runtime);
        }

        /**
         * Description: 平台订单用户线索备注删除
         * Summary: 随时享-服务商平台用户线索跟进删除备注
         */
        public async Task<DeleteInnerPlatformorderleadResponse> DeleteInnerPlatformorderleadAsync(DeleteInnerPlatformorderleadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteInnerPlatformorderleadExAsync(request, headers, runtime);
        }

        /**
         * Description: 平台订单用户线索备注删除
         * Summary: 随时享-服务商平台用户线索跟进删除备注
         */
        public DeleteInnerPlatformorderleadResponse DeleteInnerPlatformorderleadEx(DeleteInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerPlatformorderleadResponse>(DoRequest("1.0", "antchain.ato.inner.platformorderlead.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台订单用户线索备注删除
         * Summary: 随时享-服务商平台用户线索跟进删除备注
         */
        public async Task<DeleteInnerPlatformorderleadResponse> DeleteInnerPlatformorderleadExAsync(DeleteInnerPlatformorderleadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInnerPlatformorderleadResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.platformorderlead.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户基础信息添加/编辑接口
         * Summary: 商户基础信息添加/编辑接口
         */
        public SubmitInnerMerchantbasicinfoResponse SubmitInnerMerchantbasicinfo(SubmitInnerMerchantbasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInnerMerchantbasicinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商户基础信息添加/编辑接口
         * Summary: 商户基础信息添加/编辑接口
         */
        public async Task<SubmitInnerMerchantbasicinfoResponse> SubmitInnerMerchantbasicinfoAsync(SubmitInnerMerchantbasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInnerMerchantbasicinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户基础信息添加/编辑接口
         * Summary: 商户基础信息添加/编辑接口
         */
        public SubmitInnerMerchantbasicinfoResponse SubmitInnerMerchantbasicinfoEx(SubmitInnerMerchantbasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerMerchantbasicinfoResponse>(DoRequest("1.0", "antchain.ato.inner.merchantbasicinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户基础信息添加/编辑接口
         * Summary: 商户基础信息添加/编辑接口
         */
        public async Task<SubmitInnerMerchantbasicinfoResponse> SubmitInnerMerchantbasicinfoExAsync(SubmitInnerMerchantbasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInnerMerchantbasicinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantbasicinfo.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户基础信息查询接口
         * Summary: 商户基础信息查询接口
         */
        public DetailInnerMerchantbasicinfoResponse DetailInnerMerchantbasicinfo(DetailInnerMerchantbasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailInnerMerchantbasicinfoEx(request, headers, runtime);
        }

        /**
         * Description: 商户基础信息查询接口
         * Summary: 商户基础信息查询接口
         */
        public async Task<DetailInnerMerchantbasicinfoResponse> DetailInnerMerchantbasicinfoAsync(DetailInnerMerchantbasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailInnerMerchantbasicinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户基础信息查询接口
         * Summary: 商户基础信息查询接口
         */
        public DetailInnerMerchantbasicinfoResponse DetailInnerMerchantbasicinfoEx(DetailInnerMerchantbasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerMerchantbasicinfoResponse>(DoRequest("1.0", "antchain.ato.inner.merchantbasicinfo.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户基础信息查询接口
         * Summary: 商户基础信息查询接口
         */
        public async Task<DetailInnerMerchantbasicinfoResponse> DetailInnerMerchantbasicinfoExAsync(DetailInnerMerchantbasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailInnerMerchantbasicinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantbasicinfo.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户已开通支付渠道查询接口
         * Summary: 商户已开通支付渠道查询接口
         */
        public QueryInnerMerchantopenchannelResponse QueryInnerMerchantopenchannel(QueryInnerMerchantopenchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerMerchantopenchannelEx(request, headers, runtime);
        }

        /**
         * Description: 商户已开通支付渠道查询接口
         * Summary: 商户已开通支付渠道查询接口
         */
        public async Task<QueryInnerMerchantopenchannelResponse> QueryInnerMerchantopenchannelAsync(QueryInnerMerchantopenchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerMerchantopenchannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户已开通支付渠道查询接口
         * Summary: 商户已开通支付渠道查询接口
         */
        public QueryInnerMerchantopenchannelResponse QueryInnerMerchantopenchannelEx(QueryInnerMerchantopenchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantopenchannelResponse>(DoRequest("1.0", "antchain.ato.inner.merchantopenchannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户已开通支付渠道查询接口
         * Summary: 商户已开通支付渠道查询接口
         */
        public async Task<QueryInnerMerchantopenchannelResponse> QueryInnerMerchantopenchannelExAsync(QueryInnerMerchantopenchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerMerchantopenchannelResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantopenchannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户进件记录分页查询
         * Summary: 商户进件记录分页查询
         */
        public PagequeryInnerMerchantexpandsummaryResponse PagequeryInnerMerchantexpandsummary(PagequeryInnerMerchantexpandsummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryInnerMerchantexpandsummaryEx(request, headers, runtime);
        }

        /**
         * Description: 商户进件记录分页查询
         * Summary: 商户进件记录分页查询
         */
        public async Task<PagequeryInnerMerchantexpandsummaryResponse> PagequeryInnerMerchantexpandsummaryAsync(PagequeryInnerMerchantexpandsummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryInnerMerchantexpandsummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户进件记录分页查询
         * Summary: 商户进件记录分页查询
         */
        public PagequeryInnerMerchantexpandsummaryResponse PagequeryInnerMerchantexpandsummaryEx(PagequeryInnerMerchantexpandsummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantexpandsummaryResponse>(DoRequest("1.0", "antchain.ato.inner.merchantexpandsummary.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户进件记录分页查询
         * Summary: 商户进件记录分页查询
         */
        public async Task<PagequeryInnerMerchantexpandsummaryResponse> PagequeryInnerMerchantexpandsummaryExAsync(PagequeryInnerMerchantexpandsummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryInnerMerchantexpandsummaryResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.merchantexpandsummary.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取京东代扣签约链接签约串
         * Summary: 获取京东代扣签约链接签约串
         */
        public CreateInnerWithholdjdsignurlResponse CreateInnerWithholdjdsignurl(CreateInnerWithholdjdsignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerWithholdjdsignurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取京东代扣签约链接签约串
         * Summary: 获取京东代扣签约链接签约串
         */
        public async Task<CreateInnerWithholdjdsignurlResponse> CreateInnerWithholdjdsignurlAsync(CreateInnerWithholdjdsignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerWithholdjdsignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取京东代扣签约链接签约串
         * Summary: 获取京东代扣签约链接签约串
         */
        public CreateInnerWithholdjdsignurlResponse CreateInnerWithholdjdsignurlEx(CreateInnerWithholdjdsignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerWithholdjdsignurlResponse>(DoRequest("1.0", "antchain.ato.inner.withholdjdsignurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取京东代扣签约链接签约串
         * Summary: 获取京东代扣签约链接签约串
         */
        public async Task<CreateInnerWithholdjdsignurlResponse> CreateInnerWithholdjdsignurlExAsync(CreateInnerWithholdjdsignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerWithholdjdsignurlResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.withholdjdsignurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询法务电子签签署状态
         * Summary: 查询法务电子签签署状态
         */
        public GetInnerSignflowResponse GetInnerSignflow(GetInnerSignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInnerSignflowEx(request, headers, runtime);
        }

        /**
         * Description: 查询法务电子签签署状态
         * Summary: 查询法务电子签签署状态
         */
        public async Task<GetInnerSignflowResponse> GetInnerSignflowAsync(GetInnerSignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInnerSignflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询法务电子签签署状态
         * Summary: 查询法务电子签签署状态
         */
        public GetInnerSignflowResponse GetInnerSignflowEx(GetInnerSignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerSignflowResponse>(DoRequest("1.0", "antchain.ato.inner.signflow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询法务电子签签署状态
         * Summary: 查询法务电子签签署状态
         */
        public async Task<GetInnerSignflowResponse> GetInnerSignflowExAsync(GetInnerSignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInnerSignflowResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.signflow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键投保
         * Summary: 投保
         */
        public CreateInsureResponse CreateInsure(CreateInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInsureEx(request, headers, runtime);
        }

        /**
         * Description: 一键投保
         * Summary: 投保
         */
        public async Task<CreateInsureResponse> CreateInsureAsync(CreateInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 一键投保
         * Summary: 投保
         */
        public CreateInsureResponse CreateInsureEx(CreateInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInsureResponse>(DoRequest("1.0", "antchain.ato.insure.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键投保
         * Summary: 投保
         */
        public async Task<CreateInsureResponse> CreateInsureExAsync(CreateInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInsureResponse>(await DoRequestAsync("1.0", "antchain.ato.insure.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单查询
         * Summary: 保单查询
         */
        public QueryInsureResponse QueryInsure(QueryInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsureEx(request, headers, runtime);
        }

        /**
         * Description: 保单查询
         * Summary: 保单查询
         */
        public async Task<QueryInsureResponse> QueryInsureAsync(QueryInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单查询
         * Summary: 保单查询
         */
        public QueryInsureResponse QueryInsureEx(QueryInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsureResponse>(DoRequest("1.0", "antchain.ato.insure.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单查询
         * Summary: 保单查询
         */
        public async Task<QueryInsureResponse> QueryInsureExAsync(QueryInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsureResponse>(await DoRequestAsync("1.0", "antchain.ato.insure.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险代扣重试
         * Summary: 保险代扣重试
         */
        public RetryInsurePayResponse RetryInsurePay(RetryInsurePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryInsurePayEx(request, headers, runtime);
        }

        /**
         * Description: 保险代扣重试
         * Summary: 保险代扣重试
         */
        public async Task<RetryInsurePayResponse> RetryInsurePayAsync(RetryInsurePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryInsurePayExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险代扣重试
         * Summary: 保险代扣重试
         */
        public RetryInsurePayResponse RetryInsurePayEx(RetryInsurePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryInsurePayResponse>(DoRequest("1.0", "antchain.ato.insure.pay.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险代扣重试
         * Summary: 保险代扣重试
         */
        public async Task<RetryInsurePayResponse> RetryInsurePayExAsync(RetryInsurePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryInsurePayResponse>(await DoRequestAsync("1.0", "antchain.ato.insure.pay.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public RegisterMerchantexpandMerchantResponse RegisterMerchantexpandMerchant(RegisterMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public async Task<RegisterMerchantexpandMerchantResponse> RegisterMerchantexpandMerchantAsync(RegisterMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public RegisterMerchantexpandMerchantResponse RegisterMerchantexpandMerchantEx(RegisterMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public async Task<RegisterMerchantexpandMerchantResponse> RegisterMerchantexpandMerchantExAsync(RegisterMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public UploadMerchantexpandFileResponse UploadMerchantexpandFile(UploadMerchantexpandFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadMerchantexpandFileEx(request, headers, runtime);
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public async Task<UploadMerchantexpandFileResponse> UploadMerchantexpandFileAsync(UploadMerchantexpandFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadMerchantexpandFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public UploadMerchantexpandFileResponse UploadMerchantexpandFileEx(UploadMerchantexpandFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMerchantexpandFileResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public async Task<UploadMerchantexpandFileResponse> UploadMerchantexpandFileExAsync(UploadMerchantexpandFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMerchantexpandFileResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public QueryMerchantexpandMerchantResponse QueryMerchantexpandMerchant(QueryMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public async Task<QueryMerchantexpandMerchantResponse> QueryMerchantexpandMerchantAsync(QueryMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public QueryMerchantexpandMerchantResponse QueryMerchantexpandMerchantEx(QueryMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public async Task<QueryMerchantexpandMerchantResponse> QueryMerchantexpandMerchantExAsync(QueryMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public UpdateMerchantexpandMerchantResponse UpdateMerchantexpandMerchant(UpdateMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public async Task<UpdateMerchantexpandMerchantResponse> UpdateMerchantexpandMerchantAsync(UpdateMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public UpdateMerchantexpandMerchantResponse UpdateMerchantexpandMerchantEx(UpdateMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public async Task<UpdateMerchantexpandMerchantResponse> UpdateMerchantexpandMerchantExAsync(UpdateMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddMerchantexpandDividerelationResponse AddMerchantexpandDividerelation(AddMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMerchantexpandDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddMerchantexpandDividerelationResponse> AddMerchantexpandDividerelationAsync(AddMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMerchantexpandDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddMerchantexpandDividerelationResponse AddMerchantexpandDividerelationEx(AddMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMerchantexpandDividerelationResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddMerchantexpandDividerelationResponse> AddMerchantexpandDividerelationExAsync(AddMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMerchantexpandDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryMerchantexpandDividerelationResponse QueryMerchantexpandDividerelation(QueryMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantexpandDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryMerchantexpandDividerelationResponse> QueryMerchantexpandDividerelationAsync(QueryMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantexpandDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryMerchantexpandDividerelationResponse QueryMerchantexpandDividerelationEx(QueryMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantexpandDividerelationResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryMerchantexpandDividerelationResponse> QueryMerchantexpandDividerelationExAsync(QueryMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantexpandDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public BindMerchantexpandSettlecardResponse BindMerchantexpandSettlecard(BindMerchantexpandSettlecardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindMerchantexpandSettlecardEx(request, headers, runtime);
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public async Task<BindMerchantexpandSettlecardResponse> BindMerchantexpandSettlecardAsync(BindMerchantexpandSettlecardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindMerchantexpandSettlecardExAsync(request, headers, runtime);
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public BindMerchantexpandSettlecardResponse BindMerchantexpandSettlecardEx(BindMerchantexpandSettlecardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindMerchantexpandSettlecardResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public async Task<BindMerchantexpandSettlecardResponse> BindMerchantexpandSettlecardExAsync(BindMerchantexpandSettlecardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindMerchantexpandSettlecardResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 发起风控分析，获取风险分
         * Summary: 发起风控分析，获取风险分
         */
        public QueryRiskResponse QueryRisk(QueryRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskEx(request, headers, runtime);
        }

        /**
         * Description: 发起风控分析，获取风险分
         * Summary: 发起风控分析，获取风险分
         */
        public async Task<QueryRiskResponse> QueryRiskAsync(QueryRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起风控分析，获取风险分
         * Summary: 发起风控分析，获取风险分
         */
        public QueryRiskResponse QueryRiskEx(QueryRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskResponse>(DoRequest("1.0", "antchain.ato.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起风控分析，获取风险分
         * Summary: 发起风控分析，获取风险分
         */
        public async Task<QueryRiskResponse> QueryRiskExAsync(QueryRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskResponse>(await DoRequestAsync("1.0", "antchain.ato.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云 api 发起风控分析，获取风险评估
         * Summary: 云 api 发起风控分析，获取风险评估
         */
        public QueryRiskGoResponse QueryRiskGo(QueryRiskGoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskGoEx(request, headers, runtime);
        }

        /**
         * Description: 云 api 发起风控分析，获取风险评估
         * Summary: 云 api 发起风控分析，获取风险评估
         */
        public async Task<QueryRiskGoResponse> QueryRiskGoAsync(QueryRiskGoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskGoExAsync(request, headers, runtime);
        }

        /**
         * Description: 云 api 发起风控分析，获取风险评估
         * Summary: 云 api 发起风控分析，获取风险评估
         */
        public QueryRiskGoResponse QueryRiskGoEx(QueryRiskGoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskGoResponse>(DoRequest("1.0", "antchain.ato.risk.go.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云 api 发起风控分析，获取风险评估
         * Summary: 云 api 发起风控分析，获取风险评估
         */
        public async Task<QueryRiskGoResponse> QueryRiskGoExAsync(QueryRiskGoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskGoResponse>(await DoRequestAsync("1.0", "antchain.ato.risk.go.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小程序云调用，上报计量信息
         * Summary: 小程序云调用，上报计量信息
         */
        public UploadInnerRiskcallResponse UploadInnerRiskcall(UploadInnerRiskcallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadInnerRiskcallEx(request, headers, runtime);
        }

        /**
         * Description: 小程序云调用，上报计量信息
         * Summary: 小程序云调用，上报计量信息
         */
        public async Task<UploadInnerRiskcallResponse> UploadInnerRiskcallAsync(UploadInnerRiskcallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadInnerRiskcallExAsync(request, headers, runtime);
        }

        /**
         * Description: 小程序云调用，上报计量信息
         * Summary: 小程序云调用，上报计量信息
         */
        public UploadInnerRiskcallResponse UploadInnerRiskcallEx(UploadInnerRiskcallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInnerRiskcallResponse>(DoRequest("1.0", "antchain.ato.inner.riskcall.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 小程序云调用，上报计量信息
         * Summary: 小程序云调用，上报计量信息
         */
        public async Task<UploadInnerRiskcallResponse> UploadInnerRiskcallExAsync(UploadInnerRiskcallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInnerRiskcallResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.riskcall.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
                request.FileObject = null;
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
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public UploadSignTemplateResponse UploadSignTemplate(UploadSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadSignTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public async Task<UploadSignTemplateResponse> UploadSignTemplateAsync(UploadSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadSignTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public UploadSignTemplateResponse UploadSignTemplateEx(UploadSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.template.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSignTemplateResponse uploadSignTemplateResponse = new UploadSignTemplateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSignTemplateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignTemplateResponse>(DoRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public async Task<UploadSignTemplateResponse> UploadSignTemplateExAsync(UploadSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.template.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSignTemplateResponse uploadSignTemplateResponse = new UploadSignTemplateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSignTemplateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public UploadSignCreditResponse UploadSignCredit(UploadSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadSignCreditEx(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public async Task<UploadSignCreditResponse> UploadSignCreditAsync(UploadSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadSignCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public UploadSignCreditResponse UploadSignCreditEx(UploadSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignCreditResponse>(DoRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public async Task<UploadSignCreditResponse> UploadSignCreditExAsync(UploadSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSignCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public QuerySignCreditResponse QuerySignCredit(QuerySignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySignCreditEx(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public async Task<QuerySignCreditResponse> QuerySignCreditAsync(QuerySignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySignCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public QuerySignCreditResponse QuerySignCreditEx(QuerySignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySignCreditResponse>(DoRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public async Task<QuerySignCreditResponse> QuerySignCreditExAsync(QuerySignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySignCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public CancelSignFlowResponse CancelSignFlow(CancelSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public async Task<CancelSignFlowResponse> CancelSignFlowAsync(CancelSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public CancelSignFlowResponse CancelSignFlowEx(CancelSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public async Task<CancelSignFlowResponse> CancelSignFlowExAsync(CancelSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public GetSignContractcertificateResponse GetSignContractcertificate(GetSignContractcertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSignContractcertificateEx(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public async Task<GetSignContractcertificateResponse> GetSignContractcertificateAsync(GetSignContractcertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSignContractcertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public GetSignContractcertificateResponse GetSignContractcertificateEx(GetSignContractcertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSignContractcertificateResponse>(DoRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public async Task<GetSignContractcertificateResponse> GetSignContractcertificateExAsync(GetSignContractcertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSignContractcertificateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public UpdateTradeUserpromiseResponse UpdateTradeUserpromise(UpdateTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public async Task<UpdateTradeUserpromiseResponse> UpdateTradeUserpromiseAsync(UpdateTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public UpdateTradeUserpromiseResponse UpdateTradeUserpromiseEx(UpdateTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public async Task<UpdateTradeUserpromiseResponse> UpdateTradeUserpromiseExAsync(UpdateTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public SyncFrontIndirectorderResponse SyncFrontIndirectorder(SyncFrontIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncFrontIndirectorderEx(request, headers, runtime);
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public async Task<SyncFrontIndirectorderResponse> SyncFrontIndirectorderAsync(SyncFrontIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncFrontIndirectorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public SyncFrontIndirectorderResponse SyncFrontIndirectorderEx(SyncFrontIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFrontIndirectorderResponse>(DoRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public async Task<SyncFrontIndirectorderResponse> SyncFrontIndirectorderExAsync(SyncFrontIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncFrontIndirectorderResponse>(await DoRequestAsync("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public SyncTradeIndirectorderResponse SyncTradeIndirectorder(SyncTradeIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeIndirectorderEx(request, headers, runtime);
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public async Task<SyncTradeIndirectorderResponse> SyncTradeIndirectorderAsync(SyncTradeIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeIndirectorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public SyncTradeIndirectorderResponse SyncTradeIndirectorderEx(SyncTradeIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeIndirectorderResponse>(DoRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public async Task<SyncTradeIndirectorderResponse> SyncTradeIndirectorderExAsync(SyncTradeIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeIndirectorderResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public ReplaceTradeUserpromiseResponse ReplaceTradeUserpromise(ReplaceTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public async Task<ReplaceTradeUserpromiseResponse> ReplaceTradeUserpromiseAsync(ReplaceTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public ReplaceTradeUserpromiseResponse ReplaceTradeUserpromiseEx(ReplaceTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public async Task<ReplaceTradeUserpromiseResponse> ReplaceTradeUserpromiseExAsync(ReplaceTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public ApplyTradeFinanceprecheckResponse ApplyTradeFinanceprecheck(ApplyTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTradeFinanceprecheckEx(request, headers, runtime);
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public async Task<ApplyTradeFinanceprecheckResponse> ApplyTradeFinanceprecheckAsync(ApplyTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTradeFinanceprecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public ApplyTradeFinanceprecheckResponse ApplyTradeFinanceprecheckEx(ApplyTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTradeFinanceprecheckResponse>(DoRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public async Task<ApplyTradeFinanceprecheckResponse> ApplyTradeFinanceprecheckExAsync(ApplyTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTradeFinanceprecheckResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public TransferTradeFinanceResponse TransferTradeFinance(TransferTradeFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferTradeFinanceEx(request, headers, runtime);
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public async Task<TransferTradeFinanceResponse> TransferTradeFinanceAsync(TransferTradeFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferTradeFinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public TransferTradeFinanceResponse TransferTradeFinanceEx(TransferTradeFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferTradeFinanceResponse>(DoRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public async Task<TransferTradeFinanceResponse> TransferTradeFinanceExAsync(TransferTradeFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferTradeFinanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public UpdateTradeOrderResponse UpdateTradeOrder(UpdateTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTradeOrderEx(request, headers, runtime);
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public async Task<UpdateTradeOrderResponse> UpdateTradeOrderAsync(UpdateTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTradeOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public UpdateTradeOrderResponse UpdateTradeOrderEx(UpdateTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTradeOrderResponse>(DoRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public async Task<UpdateTradeOrderResponse> UpdateTradeOrderExAsync(UpdateTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTradeOrderResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public AddTradeFinanceprecheckResponse AddTradeFinanceprecheck(AddTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTradeFinanceprecheckEx(request, headers, runtime);
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public async Task<AddTradeFinanceprecheckResponse> AddTradeFinanceprecheckAsync(AddTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTradeFinanceprecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public AddTradeFinanceprecheckResponse AddTradeFinanceprecheckEx(AddTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTradeFinanceprecheckResponse>(DoRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public async Task<AddTradeFinanceprecheckResponse> AddTradeFinanceprecheckExAsync(AddTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTradeFinanceprecheckResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public GetTradeOrderfinanceinfoResponse GetTradeOrderfinanceinfo(GetTradeOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeOrderfinanceinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public async Task<GetTradeOrderfinanceinfoResponse> GetTradeOrderfinanceinfoAsync(GetTradeOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeOrderfinanceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public GetTradeOrderfinanceinfoResponse GetTradeOrderfinanceinfoEx(GetTradeOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeOrderfinanceinfoResponse>(DoRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public async Task<GetTradeOrderfinanceinfoResponse> GetTradeOrderfinanceinfoExAsync(GetTradeOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeOrderfinanceinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public SyncTradeUserpromisedelayResponse SyncTradeUserpromisedelay(SyncTradeUserpromisedelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeUserpromisedelayEx(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public async Task<SyncTradeUserpromisedelayResponse> SyncTradeUserpromisedelayAsync(SyncTradeUserpromisedelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeUserpromisedelayExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public SyncTradeUserpromisedelayResponse SyncTradeUserpromisedelayEx(SyncTradeUserpromisedelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeUserpromisedelayResponse>(DoRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public async Task<SyncTradeUserpromisedelayResponse> SyncTradeUserpromisedelayExAsync(SyncTradeUserpromisedelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeUserpromisedelayResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public PauseTradeUserpromiseResponse PauseTradeUserpromise(PauseTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public async Task<PauseTradeUserpromiseResponse> PauseTradeUserpromiseAsync(PauseTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public PauseTradeUserpromiseResponse PauseTradeUserpromiseEx(PauseTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public async Task<PauseTradeUserpromiseResponse> PauseTradeUserpromiseExAsync(PauseTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public ResumeTradeUserpromiseResponse ResumeTradeUserpromise(ResumeTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public async Task<ResumeTradeUserpromiseResponse> ResumeTradeUserpromiseAsync(ResumeTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public ResumeTradeUserpromiseResponse ResumeTradeUserpromiseEx(ResumeTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public async Task<ResumeTradeUserpromiseResponse> ResumeTradeUserpromiseExAsync(ResumeTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public SyncTradePromoorderinfoResponse SyncTradePromoorderinfo(SyncTradePromoorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradePromoorderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public async Task<SyncTradePromoorderinfoResponse> SyncTradePromoorderinfoAsync(SyncTradePromoorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradePromoorderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public SyncTradePromoorderinfoResponse SyncTradePromoorderinfoEx(SyncTradePromoorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradePromoorderinfoResponse>(DoRequest("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public async Task<SyncTradePromoorderinfoResponse> SyncTradePromoorderinfoExAsync(SyncTradePromoorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradePromoorderinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家端订单接单同步接口
         * Summary: 商家端同步接口
         */
        public SyncTradePlatformorderauditResponse SyncTradePlatformorderaudit(SyncTradePlatformorderauditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradePlatformorderauditEx(request, headers, runtime);
        }

        /**
         * Description: 商家端订单接单同步接口
         * Summary: 商家端同步接口
         */
        public async Task<SyncTradePlatformorderauditResponse> SyncTradePlatformorderauditAsync(SyncTradePlatformorderauditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradePlatformorderauditExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家端订单接单同步接口
         * Summary: 商家端同步接口
         */
        public SyncTradePlatformorderauditResponse SyncTradePlatformorderauditEx(SyncTradePlatformorderauditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradePlatformorderauditResponse>(DoRequest("1.0", "antchain.ato.trade.platformorderaudit.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家端订单接单同步接口
         * Summary: 商家端同步接口
         */
        public async Task<SyncTradePlatformorderauditResponse> SyncTradePlatformorderauditExAsync(SyncTradePlatformorderauditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradePlatformorderauditResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.platformorderaudit.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public SyncTradeReceiptorderfullinfoResponse SyncTradeReceiptorderfullinfo(SyncTradeReceiptorderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeReceiptorderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public async Task<SyncTradeReceiptorderfullinfoResponse> SyncTradeReceiptorderfullinfoAsync(SyncTradeReceiptorderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeReceiptorderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public SyncTradeReceiptorderfullinfoResponse SyncTradeReceiptorderfullinfoEx(SyncTradeReceiptorderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeReceiptorderfullinfoResponse>(DoRequest("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public async Task<SyncTradeReceiptorderfullinfoResponse> SyncTradeReceiptorderfullinfoExAsync(SyncTradeReceiptorderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeReceiptorderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public GetTradeOrderfullinfoResponse GetTradeOrderfullinfo(GetTradeOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public async Task<GetTradeOrderfullinfoResponse> GetTradeOrderfullinfoAsync(GetTradeOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public GetTradeOrderfullinfoResponse GetTradeOrderfullinfoEx(GetTradeOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public async Task<GetTradeOrderfullinfoResponse> GetTradeOrderfullinfoExAsync(GetTradeOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeOrderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public ApplyTradeCreditgrantingResponse ApplyTradeCreditgranting(ApplyTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTradeCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public async Task<ApplyTradeCreditgrantingResponse> ApplyTradeCreditgrantingAsync(ApplyTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTradeCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public ApplyTradeCreditgrantingResponse ApplyTradeCreditgrantingEx(ApplyTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTradeCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.trade.creditgranting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public async Task<ApplyTradeCreditgrantingResponse> ApplyTradeCreditgrantingExAsync(ApplyTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTradeCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.creditgranting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public QueryTradeCreditgrantingResponse QueryTradeCreditgranting(QueryTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTradeCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public async Task<QueryTradeCreditgrantingResponse> QueryTradeCreditgrantingAsync(QueryTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTradeCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public QueryTradeCreditgrantingResponse QueryTradeCreditgrantingEx(QueryTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradeCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.trade.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public async Task<QueryTradeCreditgrantingResponse> QueryTradeCreditgrantingExAsync(QueryTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradeCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public CreateWithholdSignResponse CreateWithholdSign(CreateWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public async Task<CreateWithholdSignResponse> CreateWithholdSignAsync(CreateWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public CreateWithholdSignResponse CreateWithholdSignEx(CreateWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约创建
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
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public RepayWithholdPlanResponse RepayWithholdPlan(RepayWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public async Task<RepayWithholdPlanResponse> RepayWithholdPlanAsync(RepayWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public RepayWithholdPlanResponse RepayWithholdPlanEx(RepayWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
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
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public CreateWithholdActivepayResponse CreateWithholdActivepay(CreateWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public async Task<CreateWithholdActivepayResponse> CreateWithholdActivepayAsync(CreateWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public CreateWithholdActivepayResponse CreateWithholdActivepayEx(CreateWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public async Task<CreateWithholdActivepayResponse> CreateWithholdActivepayExAsync(CreateWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public QueryWithholdActivepayResponse QueryWithholdActivepay(QueryWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public async Task<QueryWithholdActivepayResponse> QueryWithholdActivepayAsync(QueryWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public QueryWithholdActivepayResponse QueryWithholdActivepayEx(QueryWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public async Task<QueryWithholdActivepayResponse> QueryWithholdActivepayExAsync(QueryWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public CancelWithholdActivepayResponse CancelWithholdActivepay(CancelWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public async Task<CancelWithholdActivepayResponse> CancelWithholdActivepayAsync(CancelWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public CancelWithholdActivepayResponse CancelWithholdActivepayEx(CancelWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
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
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public QueryWithholdCompensateaccountResponse QueryWithholdCompensateaccount(QueryWithholdCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdCompensateaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public async Task<QueryWithholdCompensateaccountResponse> QueryWithholdCompensateaccountAsync(QueryWithholdCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdCompensateaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public QueryWithholdCompensateaccountResponse QueryWithholdCompensateaccountEx(QueryWithholdCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdCompensateaccountResponse>(DoRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public async Task<QueryWithholdCompensateaccountResponse> QueryWithholdCompensateaccountExAsync(QueryWithholdCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdCompensateaccountResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public RetryWithholdPlanpendingResponse RetryWithholdPlanpending(RetryWithholdPlanpendingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryWithholdPlanpendingEx(request, headers, runtime);
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public async Task<RetryWithholdPlanpendingResponse> RetryWithholdPlanpendingAsync(RetryWithholdPlanpendingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryWithholdPlanpendingExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public RetryWithholdPlanpendingResponse RetryWithholdPlanpendingEx(RetryWithholdPlanpendingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdPlanpendingResponse>(DoRequest("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public async Task<RetryWithholdPlanpendingResponse> RetryWithholdPlanpendingExAsync(RetryWithholdPlanpendingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdPlanpendingResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public RetryWithholdDividependingResponse RetryWithholdDividepending(RetryWithholdDividependingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryWithholdDividependingEx(request, headers, runtime);
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public async Task<RetryWithholdDividependingResponse> RetryWithholdDividependingAsync(RetryWithholdDividependingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryWithholdDividependingExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public RetryWithholdDividependingResponse RetryWithholdDividependingEx(RetryWithholdDividependingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdDividependingResponse>(DoRequest("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public async Task<RetryWithholdDividependingResponse> RetryWithholdDividependingExAsync(RetryWithholdDividependingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryWithholdDividependingResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
