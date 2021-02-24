// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.RISKPLUS.Models;

namespace AntChain.SDK.RISKPLUS
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.6.5"},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.6.5"},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
         * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
         * Summary: 策略咨询服务输出
         */
        public QuerySecurityPolicyResponse QuerySecurityPolicy(QuerySecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySecurityPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
         * Summary: 策略咨询服务输出
         */
        public async Task<QuerySecurityPolicyResponse> QuerySecurityPolicyAsync(QuerySecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySecurityPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
         * Summary: 策略咨询服务输出
         */
        public QuerySecurityPolicyResponse QuerySecurityPolicyEx(QuerySecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecurityPolicyResponse>(DoRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
         * Summary: 策略咨询服务输出
         */
        public async Task<QuerySecurityPolicyResponse> QuerySecurityPolicyExAsync(QuerySecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecurityPolicyResponse>(await DoRequestAsync("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向风控发送异步安全数据
         * Summary: 异步发送安全数据
         */
        public SendSecurityDataResponse SendSecurityData(SendSecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendSecurityDataEx(request, headers, runtime);
        }

        /**
         * Description: 向风控发送异步安全数据
         * Summary: 异步发送安全数据
         */
        public async Task<SendSecurityDataResponse> SendSecurityDataAsync(SendSecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendSecurityDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 向风控发送异步安全数据
         * Summary: 异步发送安全数据
         */
        public SendSecurityDataResponse SendSecurityDataEx(SendSecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendSecurityDataResponse>(DoRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向风控发送异步安全数据
         * Summary: 异步发送安全数据
         */
        public async Task<SendSecurityDataResponse> SendSecurityDataExAsync(SendSecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendSecurityDataResponse>(await DoRequestAsync("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
         * Summary: 安全策略确认服务输出
         */
        public ConfirmSecurityPolicyResponse ConfirmSecurityPolicy(ConfirmSecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmSecurityPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
         * Summary: 安全策略确认服务输出
         */
        public async Task<ConfirmSecurityPolicyResponse> ConfirmSecurityPolicyAsync(ConfirmSecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmSecurityPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
         * Summary: 安全策略确认服务输出
         */
        public ConfirmSecurityPolicyResponse ConfirmSecurityPolicyEx(ConfirmSecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmSecurityPolicyResponse>(DoRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
         * Summary: 安全策略确认服务输出
         */
        public async Task<ConfirmSecurityPolicyResponse> ConfirmSecurityPolicyExAsync(ConfirmSecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmSecurityPolicyResponse>(await DoRequestAsync("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入风控+，进行人机识别判断。
         * Summary: 策略咨询服务输出
         */
        public CheckSecurityRdsResponse CheckSecurityRds(CheckSecurityRdsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSecurityRdsEx(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，进行人机识别判断。
         * Summary: 策略咨询服务输出
         */
        public async Task<CheckSecurityRdsResponse> CheckSecurityRdsAsync(CheckSecurityRdsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSecurityRdsExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，进行人机识别判断。
         * Summary: 策略咨询服务输出
         */
        public CheckSecurityRdsResponse CheckSecurityRdsEx(CheckSecurityRdsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSecurityRdsResponse>(DoRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入风控+，进行人机识别判断。
         * Summary: 策略咨询服务输出
         */
        public async Task<CheckSecurityRdsResponse> CheckSecurityRdsExAsync(CheckSecurityRdsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSecurityRdsResponse>(await DoRequestAsync("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
         * Summary: 安全数据服务输出
         */
        public QuerySecurityDataResponse QuerySecurityData(QuerySecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySecurityDataEx(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
         * Summary: 安全数据服务输出
         */
        public async Task<QuerySecurityDataResponse> QuerySecurityDataAsync(QuerySecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySecurityDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
         * Summary: 安全数据服务输出
         */
        public QuerySecurityDataResponse QuerySecurityDataEx(QuerySecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecurityDataResponse>(DoRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
         * Summary: 安全数据服务输出
         */
        public async Task<QuerySecurityDataResponse> QuerySecurityDataExAsync(QuerySecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecurityDataResponse>(await DoRequestAsync("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户数据校验接口，比如端防护
         * Summary: 安全数据服务校验
         */
        public CheckSecurityDataResponse CheckSecurityData(CheckSecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSecurityDataEx(request, headers, runtime);
        }

        /**
         * Description: 外部客户数据校验接口，比如端防护
         * Summary: 安全数据服务校验
         */
        public async Task<CheckSecurityDataResponse> CheckSecurityDataAsync(CheckSecurityDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSecurityDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部客户数据校验接口，比如端防护
         * Summary: 安全数据服务校验
         */
        public CheckSecurityDataResponse CheckSecurityDataEx(CheckSecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSecurityDataResponse>(DoRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部客户数据校验接口，比如端防护
         * Summary: 安全数据服务校验
         */
        public async Task<CheckSecurityDataResponse> CheckSecurityDataExAsync(CheckSecurityDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSecurityDataResponse>(await DoRequestAsync("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 四要素认证首先调用此接口
         * Summary: 芝麻四要素接口
         */
        public VerifyFinserviceZhimaIdentifyResponse VerifyFinserviceZhimaIdentify(VerifyFinserviceZhimaIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyFinserviceZhimaIdentifyEx(request, headers, runtime);
        }

        /**
         * Description: 四要素认证首先调用此接口
         * Summary: 芝麻四要素接口
         */
        public async Task<VerifyFinserviceZhimaIdentifyResponse> VerifyFinserviceZhimaIdentifyAsync(VerifyFinserviceZhimaIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyFinserviceZhimaIdentifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 四要素认证首先调用此接口
         * Summary: 芝麻四要素接口
         */
        public VerifyFinserviceZhimaIdentifyResponse VerifyFinserviceZhimaIdentifyEx(VerifyFinserviceZhimaIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFinserviceZhimaIdentifyResponse>(DoRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 四要素认证首先调用此接口
         * Summary: 芝麻四要素接口
         */
        public async Task<VerifyFinserviceZhimaIdentifyResponse> VerifyFinserviceZhimaIdentifyExAsync(VerifyFinserviceZhimaIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFinserviceZhimaIdentifyResponse>(await DoRequestAsync("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: 芝麻四要素认证结果查询
         */
        public QueryFinserviceZhimaIdentifyResponse QueryFinserviceZhimaIdentify(QueryFinserviceZhimaIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFinserviceZhimaIdentifyEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: 芝麻四要素认证结果查询
         */
        public async Task<QueryFinserviceZhimaIdentifyResponse> QueryFinserviceZhimaIdentifyAsync(QueryFinserviceZhimaIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFinserviceZhimaIdentifyExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: 芝麻四要素认证结果查询
         */
        public QueryFinserviceZhimaIdentifyResponse QueryFinserviceZhimaIdentifyEx(QueryFinserviceZhimaIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFinserviceZhimaIdentifyResponse>(DoRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: 芝麻四要素认证结果查询
         */
        public async Task<QueryFinserviceZhimaIdentifyResponse> QueryFinserviceZhimaIdentifyExAsync(QueryFinserviceZhimaIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFinserviceZhimaIdentifyResponse>(await DoRequestAsync("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版通用查询接口
         * Summary: 【已废弃】
         */
        public QueryRbbGenericInvokeResponse QueryRbbGenericInvoke(QueryRbbGenericInvokeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbGenericInvokeEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版通用查询接口
         * Summary: 【已废弃】
         */
        public async Task<QueryRbbGenericInvokeResponse> QueryRbbGenericInvokeAsync(QueryRbbGenericInvokeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbGenericInvokeExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版通用查询接口
         * Summary: 【已废弃】
         */
        public QueryRbbGenericInvokeResponse QueryRbbGenericInvokeEx(QueryRbbGenericInvokeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbGenericInvokeResponse>(DoRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版通用查询接口
         * Summary: 【已废弃】
         */
        public async Task<QueryRbbGenericInvokeResponse> QueryRbbGenericInvokeExAsync(QueryRbbGenericInvokeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbGenericInvokeResponse>(await DoRequestAsync("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版token生成
         * Summary: 【已废弃】
         */
        public CreateRbbTokenResponse CreateRbbToken(CreateRbbTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRbbTokenEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版token生成
         * Summary: 【已废弃】
         */
        public async Task<CreateRbbTokenResponse> CreateRbbTokenAsync(CreateRbbTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRbbTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版token生成
         * Summary: 【已废弃】
         */
        public CreateRbbTokenResponse CreateRbbTokenEx(CreateRbbTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbTokenResponse>(DoRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版token生成
         * Summary: 【已废弃】
         */
        public async Task<CreateRbbTokenResponse> CreateRbbTokenExAsync(CreateRbbTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbTokenResponse>(await DoRequestAsync("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险大脑企业版登录token
         * Summary: 【已废弃】
         */
        public CreateRbbApiGwtokenResponse CreateRbbApiGwtoken(CreateRbbApiGwtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRbbApiGwtokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取风险大脑企业版登录token
         * Summary: 【已废弃】
         */
        public async Task<CreateRbbApiGwtokenResponse> CreateRbbApiGwtokenAsync(CreateRbbApiGwtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRbbApiGwtokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取风险大脑企业版登录token
         * Summary: 【已废弃】
         */
        public CreateRbbApiGwtokenResponse CreateRbbApiGwtokenEx(CreateRbbApiGwtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbApiGwtokenResponse>(DoRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险大脑企业版登录token
         * Summary: 【已废弃】
         */
        public async Task<CreateRbbApiGwtokenResponse> CreateRbbApiGwtokenExAsync(CreateRbbApiGwtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbApiGwtokenResponse>(await DoRequestAsync("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版通用查询OpenAPI
         * Summary: 风险大脑企业版通用查询OpenAPI
         */
        public QueryRbbGeneralResponse QueryRbbGeneral(QueryRbbGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbGeneralEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版通用查询OpenAPI
         * Summary: 风险大脑企业版通用查询OpenAPI
         */
        public async Task<QueryRbbGeneralResponse> QueryRbbGeneralAsync(QueryRbbGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbGeneralExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版通用查询OpenAPI
         * Summary: 风险大脑企业版通用查询OpenAPI
         */
        public QueryRbbGeneralResponse QueryRbbGeneralEx(QueryRbbGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbGeneralResponse>(DoRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版通用查询OpenAPI
         * Summary: 风险大脑企业版通用查询OpenAPI
         */
        public async Task<QueryRbbGeneralResponse> QueryRbbGeneralExAsync(QueryRbbGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbGeneralResponse>(await DoRequestAsync("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取登录Token
         * Summary: 获取登录Token
         */
        public GetRbbLoginTokenResponse GetRbbLoginToken(GetRbbLoginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRbbLoginTokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取登录Token
         * Summary: 获取登录Token
         */
        public async Task<GetRbbLoginTokenResponse> GetRbbLoginTokenAsync(GetRbbLoginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRbbLoginTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取登录Token
         * Summary: 获取登录Token
         */
        public GetRbbLoginTokenResponse GetRbbLoginTokenEx(GetRbbLoginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRbbLoginTokenResponse>(DoRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取登录Token
         * Summary: 获取登录Token
         */
        public async Task<GetRbbLoginTokenResponse> GetRbbLoginTokenExAsync(GetRbbLoginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRbbLoginTokenResponse>(await DoRequestAsync("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版创建租户
         * Summary: 风险大脑企业版创建租户
         */
        public CreateRbbTenantResponse CreateRbbTenant(CreateRbbTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRbbTenantEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版创建租户
         * Summary: 风险大脑企业版创建租户
         */
        public async Task<CreateRbbTenantResponse> CreateRbbTenantAsync(CreateRbbTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRbbTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版创建租户
         * Summary: 风险大脑企业版创建租户
         */
        public CreateRbbTenantResponse CreateRbbTenantEx(CreateRbbTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbTenantResponse>(DoRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版创建租户
         * Summary: 风险大脑企业版创建租户
         */
        public async Task<CreateRbbTenantResponse> CreateRbbTenantExAsync(CreateRbbTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbTenantResponse>(await DoRequestAsync("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版创建用户
         * Summary: 风险大脑企业版创建用户
         */
        public CreateRbbUserResponse CreateRbbUser(CreateRbbUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRbbUserEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版创建用户
         * Summary: 风险大脑企业版创建用户
         */
        public async Task<CreateRbbUserResponse> CreateRbbUserAsync(CreateRbbUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRbbUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑企业版创建用户
         * Summary: 风险大脑企业版创建用户
         */
        public CreateRbbUserResponse CreateRbbUserEx(CreateRbbUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbUserResponse>(DoRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑企业版创建用户
         * Summary: 风险大脑企业版创建用户
         */
        public async Task<CreateRbbUserResponse> CreateRbbUserExAsync(CreateRbbUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRbbUserResponse>(await DoRequestAsync("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所在地的负面舆情企业列表
         * Summary: 查询所在地的负面舆情企业列表
         */
        public QueryRtopCompanyOpinionResponse QueryRtopCompanyOpinion(QueryRtopCompanyOpinionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyOpinionEx(request, headers, runtime);
        }

        /**
         * Description: 查询所在地的负面舆情企业列表
         * Summary: 查询所在地的负面舆情企业列表
         */
        public async Task<QueryRtopCompanyOpinionResponse> QueryRtopCompanyOpinionAsync(QueryRtopCompanyOpinionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyOpinionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所在地的负面舆情企业列表
         * Summary: 查询所在地的负面舆情企业列表
         */
        public QueryRtopCompanyOpinionResponse QueryRtopCompanyOpinionEx(QueryRtopCompanyOpinionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyOpinionResponse>(DoRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所在地的负面舆情企业列表
         * Summary: 查询所在地的负面舆情企业列表
         */
        public async Task<QueryRtopCompanyOpinionResponse> QueryRtopCompanyOpinionExAsync(QueryRtopCompanyOpinionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyOpinionResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业的舆情详情信息
         * Summary: 查询企业的舆情详情信息
         */
        public ListRtopCompanyOpinionsResponse ListRtopCompanyOpinions(ListRtopCompanyOpinionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRtopCompanyOpinionsEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业的舆情详情信息
         * Summary: 查询企业的舆情详情信息
         */
        public async Task<ListRtopCompanyOpinionsResponse> ListRtopCompanyOpinionsAsync(ListRtopCompanyOpinionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRtopCompanyOpinionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业的舆情详情信息
         * Summary: 查询企业的舆情详情信息
         */
        public ListRtopCompanyOpinionsResponse ListRtopCompanyOpinionsEx(ListRtopCompanyOpinionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCompanyOpinionsResponse>(DoRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业的舆情详情信息
         * Summary: 查询企业的舆情详情信息
         */
        public async Task<ListRtopCompanyOpinionsResponse> ListRtopCompanyOpinionsExAsync(ListRtopCompanyOpinionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCompanyOpinionsResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监测企业的详情
         * Summary: 查询监测企业的详情
         */
        public GetRtopCompanyMonitorResponse GetRtopCompanyMonitor(GetRtopCompanyMonitorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRtopCompanyMonitorEx(request, headers, runtime);
        }

        /**
         * Description: 查询监测企业的详情
         * Summary: 查询监测企业的详情
         */
        public async Task<GetRtopCompanyMonitorResponse> GetRtopCompanyMonitorAsync(GetRtopCompanyMonitorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRtopCompanyMonitorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询监测企业的详情
         * Summary: 查询监测企业的详情
         */
        public GetRtopCompanyMonitorResponse GetRtopCompanyMonitorEx(GetRtopCompanyMonitorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRtopCompanyMonitorResponse>(DoRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监测企业的详情
         * Summary: 查询监测企业的详情
         */
        public async Task<GetRtopCompanyMonitorResponse> GetRtopCompanyMonitorExAsync(GetRtopCompanyMonitorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRtopCompanyMonitorResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所在地的涉众风险企业统计信息
         * Summary: 查询所在地的涉众风险企业统计信息
         */
        public QueryRtopCrowdriskStatisticResponse QueryRtopCrowdriskStatistic(QueryRtopCrowdriskStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCrowdriskStatisticEx(request, headers, runtime);
        }

        /**
         * Description: 查询所在地的涉众风险企业统计信息
         * Summary: 查询所在地的涉众风险企业统计信息
         */
        public async Task<QueryRtopCrowdriskStatisticResponse> QueryRtopCrowdriskStatisticAsync(QueryRtopCrowdriskStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCrowdriskStatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所在地的涉众风险企业统计信息
         * Summary: 查询所在地的涉众风险企业统计信息
         */
        public QueryRtopCrowdriskStatisticResponse QueryRtopCrowdriskStatisticEx(QueryRtopCrowdriskStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskStatisticResponse>(DoRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所在地的涉众风险企业统计信息
         * Summary: 查询所在地的涉众风险企业统计信息
         */
        public async Task<QueryRtopCrowdriskStatisticResponse> QueryRtopCrowdriskStatisticExAsync(QueryRtopCrowdriskStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskStatisticResponse>(await DoRequestAsync("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询涉众风险企业的列表
         * Summary: 查询涉众风险企业的列表
         */
        public ListRtopCrowdriskResponse ListRtopCrowdrisk(ListRtopCrowdriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRtopCrowdriskEx(request, headers, runtime);
        }

        /**
         * Description: 查询涉众风险企业的列表
         * Summary: 查询涉众风险企业的列表
         */
        public async Task<ListRtopCrowdriskResponse> ListRtopCrowdriskAsync(ListRtopCrowdriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRtopCrowdriskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询涉众风险企业的列表
         * Summary: 查询涉众风险企业的列表
         */
        public ListRtopCrowdriskResponse ListRtopCrowdriskEx(ListRtopCrowdriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCrowdriskResponse>(DoRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询涉众风险企业的列表
         * Summary: 查询涉众风险企业的列表
         */
        public async Task<ListRtopCrowdriskResponse> ListRtopCrowdriskExAsync(ListRtopCrowdriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCrowdriskResponse>(await DoRequestAsync("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询涉众风险企业的详细信息
         * Summary: 查询涉众风险企业的详细信息
         */
        public QueryRtopCrowdriskDetailResponse QueryRtopCrowdriskDetail(QueryRtopCrowdriskDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCrowdriskDetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询涉众风险企业的详细信息
         * Summary: 查询涉众风险企业的详细信息
         */
        public async Task<QueryRtopCrowdriskDetailResponse> QueryRtopCrowdriskDetailAsync(QueryRtopCrowdriskDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCrowdriskDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询涉众风险企业的详细信息
         * Summary: 查询涉众风险企业的详细信息
         */
        public QueryRtopCrowdriskDetailResponse QueryRtopCrowdriskDetailEx(QueryRtopCrowdriskDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskDetailResponse>(DoRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询涉众风险企业的详细信息
         * Summary: 查询涉众风险企业的详细信息
         */
        public async Task<QueryRtopCrowdriskDetailResponse> QueryRtopCrowdriskDetailExAsync(QueryRtopCrowdriskDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskDetailResponse>(await DoRequestAsync("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风报的详细信息
         * Summary: 查询风报的详细信息
         */
        public QueryRtopRiskstormResponse QueryRtopRiskstorm(QueryRtopRiskstormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopRiskstormEx(request, headers, runtime);
        }

        /**
         * Description: 查询风报的详细信息
         * Summary: 查询风报的详细信息
         */
        public async Task<QueryRtopRiskstormResponse> QueryRtopRiskstormAsync(QueryRtopRiskstormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopRiskstormExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询风报的详细信息
         * Summary: 查询风报的详细信息
         */
        public QueryRtopRiskstormResponse QueryRtopRiskstormEx(QueryRtopRiskstormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRiskstormResponse>(DoRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风报的详细信息
         * Summary: 查询风报的详细信息
         */
        public async Task<QueryRtopRiskstormResponse> QueryRtopRiskstormExAsync(QueryRtopRiskstormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRiskstormResponse>(await DoRequestAsync("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
         * Summary: 监管涉众风险一批企业的影响人数影响金额
         */
        public QueryRtopCrowdriskSumResponse QueryRtopCrowdriskSum(QueryRtopCrowdriskSumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCrowdriskSumEx(request, headers, runtime);
        }

        /**
         * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
         * Summary: 监管涉众风险一批企业的影响人数影响金额
         */
        public async Task<QueryRtopCrowdriskSumResponse> QueryRtopCrowdriskSumAsync(QueryRtopCrowdriskSumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCrowdriskSumExAsync(request, headers, runtime);
        }

        /**
         * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
         * Summary: 监管涉众风险一批企业的影响人数影响金额
         */
        public QueryRtopCrowdriskSumResponse QueryRtopCrowdriskSumEx(QueryRtopCrowdriskSumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskSumResponse>(DoRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
         * Summary: 监管涉众风险一批企业的影响人数影响金额
         */
        public async Task<QueryRtopCrowdriskSumResponse> QueryRtopCrowdriskSumExAsync(QueryRtopCrowdriskSumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCrowdriskSumResponse>(await DoRequestAsync("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管企业详情获取，包括风险分数、风险标签。
         * Summary: 监管企业详情获取
         */
        public GetRtopCompanyDetailResponse GetRtopCompanyDetail(GetRtopCompanyDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRtopCompanyDetailEx(request, headers, runtime);
        }

        /**
         * Description: 监管企业详情获取，包括风险分数、风险标签。
         * Summary: 监管企业详情获取
         */
        public async Task<GetRtopCompanyDetailResponse> GetRtopCompanyDetailAsync(GetRtopCompanyDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRtopCompanyDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 监管企业详情获取，包括风险分数、风险标签。
         * Summary: 监管企业详情获取
         */
        public GetRtopCompanyDetailResponse GetRtopCompanyDetailEx(GetRtopCompanyDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRtopCompanyDetailResponse>(DoRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管企业详情获取，包括风险分数、风险标签。
         * Summary: 监管企业详情获取
         */
        public async Task<GetRtopCompanyDetailResponse> GetRtopCompanyDetailExAsync(GetRtopCompanyDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRtopCompanyDetailResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风险查询接口
         * Summary: 企业风险查询接口
         */
        public QueryRtopCompanyRiskinfoResponse QueryRtopCompanyRiskinfo(QueryRtopCompanyRiskinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyRiskinfoEx(request, headers, runtime);
        }

        /**
         * Description: 企业风险查询接口
         * Summary: 企业风险查询接口
         */
        public async Task<QueryRtopCompanyRiskinfoResponse> QueryRtopCompanyRiskinfoAsync(QueryRtopCompanyRiskinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyRiskinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业风险查询接口
         * Summary: 企业风险查询接口
         */
        public QueryRtopCompanyRiskinfoResponse QueryRtopCompanyRiskinfoEx(QueryRtopCompanyRiskinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskinfoResponse>(DoRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风险查询接口
         * Summary: 企业风险查询接口
         */
        public async Task<QueryRtopCompanyRiskinfoResponse> QueryRtopCompanyRiskinfoExAsync(QueryRtopCompanyRiskinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskinfoResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云通用风险信息接口
         * Summary: 公有云通用风险信息接口
         */
        public ExecRtopGenericInvokeResponse ExecRtopGenericInvoke(ExecRtopGenericInvokeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRtopGenericInvokeEx(request, headers, runtime);
        }

        /**
         * Description: 公有云通用风险信息接口
         * Summary: 公有云通用风险信息接口
         */
        public async Task<ExecRtopGenericInvokeResponse> ExecRtopGenericInvokeAsync(ExecRtopGenericInvokeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRtopGenericInvokeExAsync(request, headers, runtime);
        }

        /**
         * Description: 公有云通用风险信息接口
         * Summary: 公有云通用风险信息接口
         */
        public ExecRtopGenericInvokeResponse ExecRtopGenericInvokeEx(ExecRtopGenericInvokeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRtopGenericInvokeResponse>(DoRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云通用风险信息接口
         * Summary: 公有云通用风险信息接口
         */
        public async Task<ExecRtopGenericInvokeResponse> ExecRtopGenericInvokeExAsync(ExecRtopGenericInvokeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRtopGenericInvokeResponse>(await DoRequestAsync("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云生成token
         * Summary: 公有云生成token
         */
        public CreateRtopTokenResponse CreateRtopToken(CreateRtopTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRtopTokenEx(request, headers, runtime);
        }

        /**
         * Description: 公有云生成token
         * Summary: 公有云生成token
         */
        public async Task<CreateRtopTokenResponse> CreateRtopTokenAsync(CreateRtopTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRtopTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 公有云生成token
         * Summary: 公有云生成token
         */
        public CreateRtopTokenResponse CreateRtopTokenEx(CreateRtopTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRtopTokenResponse>(DoRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云生成token
         * Summary: 公有云生成token
         */
        public async Task<CreateRtopTokenResponse> CreateRtopTokenExAsync(CreateRtopTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRtopTokenResponse>(await DoRequestAsync("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签全量信息获取
         * Summary: 标签全量信息获取
         */
        public QueryRtopRisklabelResponse QueryRtopRisklabel(QueryRtopRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopRisklabelEx(request, headers, runtime);
        }

        /**
         * Description: 标签全量信息获取
         * Summary: 标签全量信息获取
         */
        public async Task<QueryRtopRisklabelResponse> QueryRtopRisklabelAsync(QueryRtopRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopRisklabelExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签全量信息获取
         * Summary: 标签全量信息获取
         */
        public QueryRtopRisklabelResponse QueryRtopRisklabelEx(QueryRtopRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelResponse>(DoRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签全量信息获取
         * Summary: 标签全量信息获取
         */
        public async Task<QueryRtopRisklabelResponse> QueryRtopRisklabelExAsync(QueryRtopRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelResponse>(await DoRequestAsync("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业全量信息获取
         * Summary: 企业全量信息获取
         */
        public QueryRtopCompanyResponse QueryRtopCompany(QueryRtopCompanyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyEx(request, headers, runtime);
        }

        /**
         * Description: 企业全量信息获取
         * Summary: 企业全量信息获取
         */
        public async Task<QueryRtopCompanyResponse> QueryRtopCompanyAsync(QueryRtopCompanyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业全量信息获取
         * Summary: 企业全量信息获取
         */
        public QueryRtopCompanyResponse QueryRtopCompanyEx(QueryRtopCompanyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyResponse>(DoRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业全量信息获取
         * Summary: 企业全量信息获取
         */
        public async Task<QueryRtopCompanyResponse> QueryRtopCompanyExAsync(QueryRtopCompanyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
         * Summary: 标签配置全量信息获取
         */
        public QueryRtopRisklabelFilterResponse QueryRtopRisklabelFilter(QueryRtopRisklabelFilterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopRisklabelFilterEx(request, headers, runtime);
        }

        /**
         * Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
         * Summary: 标签配置全量信息获取
         */
        public async Task<QueryRtopRisklabelFilterResponse> QueryRtopRisklabelFilterAsync(QueryRtopRisklabelFilterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopRisklabelFilterExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
         * Summary: 标签配置全量信息获取
         */
        public QueryRtopRisklabelFilterResponse QueryRtopRisklabelFilterEx(QueryRtopRisklabelFilterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelFilterResponse>(DoRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
         * Summary: 标签配置全量信息获取
         */
        public async Task<QueryRtopRisklabelFilterResponse> QueryRtopRisklabelFilterExAsync(QueryRtopRisklabelFilterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelFilterResponse>(await DoRequestAsync("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于鹰眼项目舆情同步
         * Summary: 鹰眼项目舆情同步
         */
        public PullRegtechNewsResponse PullRegtechNews(PullRegtechNewsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullRegtechNewsEx(request, headers, runtime);
        }

        /**
         * Description: 用于鹰眼项目舆情同步
         * Summary: 鹰眼项目舆情同步
         */
        public async Task<PullRegtechNewsResponse> PullRegtechNewsAsync(PullRegtechNewsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullRegtechNewsExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于鹰眼项目舆情同步
         * Summary: 鹰眼项目舆情同步
         */
        public PullRegtechNewsResponse PullRegtechNewsEx(PullRegtechNewsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullRegtechNewsResponse>(DoRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于鹰眼项目舆情同步
         * Summary: 鹰眼项目舆情同步
         */
        public async Task<PullRegtechNewsResponse> PullRegtechNewsExAsync(PullRegtechNewsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullRegtechNewsResponse>(await DoRequestAsync("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看企业反馈
         * Summary: 查看企业反馈
         */
        public QueryRtopCompanyFeedbackResponse QueryRtopCompanyFeedback(QueryRtopCompanyFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyFeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 查看企业反馈
         * Summary: 查看企业反馈
         */
        public async Task<QueryRtopCompanyFeedbackResponse> QueryRtopCompanyFeedbackAsync(QueryRtopCompanyFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyFeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看企业反馈
         * Summary: 查看企业反馈
         */
        public QueryRtopCompanyFeedbackResponse QueryRtopCompanyFeedbackEx(QueryRtopCompanyFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyFeedbackResponse>(DoRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看企业反馈
         * Summary: 查看企业反馈
         */
        public async Task<QueryRtopCompanyFeedbackResponse> QueryRtopCompanyFeedbackExAsync(QueryRtopCompanyFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyFeedbackResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局动态中的预警企业详细列表查询
         * Summary: 全局动态中的预警企业详细列表查询
         */
        public QueryRtopCompanyAlarmResponse QueryRtopCompanyAlarm(QueryRtopCompanyAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyAlarmEx(request, headers, runtime);
        }

        /**
         * Description: 全局动态中的预警企业详细列表查询
         * Summary: 全局动态中的预警企业详细列表查询
         */
        public async Task<QueryRtopCompanyAlarmResponse> QueryRtopCompanyAlarmAsync(QueryRtopCompanyAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyAlarmExAsync(request, headers, runtime);
        }

        /**
         * Description: 全局动态中的预警企业详细列表查询
         * Summary: 全局动态中的预警企业详细列表查询
         */
        public QueryRtopCompanyAlarmResponse QueryRtopCompanyAlarmEx(QueryRtopCompanyAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyAlarmResponse>(DoRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局动态中的预警企业详细列表查询
         * Summary: 全局动态中的预警企业详细列表查询
         */
        public async Task<QueryRtopCompanyAlarmResponse> QueryRtopCompanyAlarmExAsync(QueryRtopCompanyAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyAlarmResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局动态中的企业列表里的全部列表
         * Summary: 查询全局动态中的企业列表里的全部列表
         */
        public QueryRtopCompanyRiskyResponse QueryRtopCompanyRisky(QueryRtopCompanyRiskyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyRiskyEx(request, headers, runtime);
        }

        /**
         * Description: 查询全局动态中的企业列表里的全部列表
         * Summary: 查询全局动态中的企业列表里的全部列表
         */
        public async Task<QueryRtopCompanyRiskyResponse> QueryRtopCompanyRiskyAsync(QueryRtopCompanyRiskyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyRiskyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全局动态中的企业列表里的全部列表
         * Summary: 查询全局动态中的企业列表里的全部列表
         */
        public QueryRtopCompanyRiskyResponse QueryRtopCompanyRiskyEx(QueryRtopCompanyRiskyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskyResponse>(DoRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局动态中的企业列表里的全部列表
         * Summary: 查询全局动态中的企业列表里的全部列表
         */
        public async Task<QueryRtopCompanyRiskyResponse> QueryRtopCompanyRiskyExAsync(QueryRtopCompanyRiskyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskyResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业列表
         * Summary: 查询企业列表
         */
        public QueryRtopCompanyListResponse QueryRtopCompanyList(QueryRtopCompanyListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyListEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业列表
         * Summary: 查询企业列表
         */
        public async Task<QueryRtopCompanyListResponse> QueryRtopCompanyListAsync(QueryRtopCompanyListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyListExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业列表
         * Summary: 查询企业列表
         */
        public QueryRtopCompanyListResponse QueryRtopCompanyListEx(QueryRtopCompanyListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyListResponse>(DoRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业列表
         * Summary: 查询企业列表
         */
        public async Task<QueryRtopCompanyListResponse> QueryRtopCompanyListExAsync(QueryRtopCompanyListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyListResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签配置全量信息获取
         * Summary: 标签配置全量信息获取
         */
        public QueryRtopRisklabelConfigResponse QueryRtopRisklabelConfig(QueryRtopRisklabelConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopRisklabelConfigEx(request, headers, runtime);
        }

        /**
         * Description: 标签配置全量信息获取
         * Summary: 标签配置全量信息获取
         */
        public async Task<QueryRtopRisklabelConfigResponse> QueryRtopRisklabelConfigAsync(QueryRtopRisklabelConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopRisklabelConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签配置全量信息获取
         * Summary: 标签配置全量信息获取
         */
        public QueryRtopRisklabelConfigResponse QueryRtopRisklabelConfigEx(QueryRtopRisklabelConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelConfigResponse>(DoRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签配置全量信息获取
         * Summary: 标签配置全量信息获取
         */
        public async Task<QueryRtopRisklabelConfigResponse> QueryRtopRisklabelConfigExAsync(QueryRtopRisklabelConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopRisklabelConfigResponse>(await DoRequestAsync("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风险标签信息查询
         * Summary: 企业风险标签信息查询
         */
        public QueryRtopCompanyRiskResponse QueryRtopCompanyRisk(QueryRtopCompanyRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopCompanyRiskEx(request, headers, runtime);
        }

        /**
         * Description: 企业风险标签信息查询
         * Summary: 企业风险标签信息查询
         */
        public async Task<QueryRtopCompanyRiskResponse> QueryRtopCompanyRiskAsync(QueryRtopCompanyRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopCompanyRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业风险标签信息查询
         * Summary: 企业风险标签信息查询
         */
        public QueryRtopCompanyRiskResponse QueryRtopCompanyRiskEx(QueryRtopCompanyRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskResponse>(DoRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风险标签信息查询
         * Summary: 企业风险标签信息查询
         */
        public async Task<QueryRtopCompanyRiskResponse> QueryRtopCompanyRiskExAsync(QueryRtopCompanyRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopCompanyRiskResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看重点关联企业
         * Summary: 重点关联企业
         */
        public ListRtopCompanyRelatedResponse ListRtopCompanyRelated(ListRtopCompanyRelatedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRtopCompanyRelatedEx(request, headers, runtime);
        }

        /**
         * Description: 查看重点关联企业
         * Summary: 重点关联企业
         */
        public async Task<ListRtopCompanyRelatedResponse> ListRtopCompanyRelatedAsync(ListRtopCompanyRelatedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRtopCompanyRelatedExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看重点关联企业
         * Summary: 重点关联企业
         */
        public ListRtopCompanyRelatedResponse ListRtopCompanyRelatedEx(ListRtopCompanyRelatedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCompanyRelatedResponse>(DoRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看重点关联企业
         * Summary: 重点关联企业
         */
        public async Task<ListRtopCompanyRelatedResponse> ListRtopCompanyRelatedExAsync(ListRtopCompanyRelatedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopCompanyRelatedResponse>(await DoRequestAsync("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签图片查询
         * Summary: 风险标签图片查询
         */
        public QueryRtopTagImageResponse QueryRtopTagImage(QueryRtopTagImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRtopTagImageEx(request, headers, runtime);
        }

        /**
         * Description: 风险标签图片查询
         * Summary: 风险标签图片查询
         */
        public async Task<QueryRtopTagImageResponse> QueryRtopTagImageAsync(QueryRtopTagImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRtopTagImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险标签图片查询
         * Summary: 风险标签图片查询
         */
        public QueryRtopTagImageResponse QueryRtopTagImageEx(QueryRtopTagImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopTagImageResponse>(DoRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签图片查询
         * Summary: 风险标签图片查询
         */
        public async Task<QueryRtopTagImageResponse> QueryRtopTagImageExAsync(QueryRtopTagImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRtopTagImageResponse>(await DoRequestAsync("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户收藏企业列表
         * Summary: 查询用户收藏企业列表
         */
        public ListRtopStarCompanyResponse ListRtopStarCompany(ListRtopStarCompanyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRtopStarCompanyEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户收藏企业列表
         * Summary: 查询用户收藏企业列表
         */
        public async Task<ListRtopStarCompanyResponse> ListRtopStarCompanyAsync(ListRtopStarCompanyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRtopStarCompanyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户收藏企业列表
         * Summary: 查询用户收藏企业列表
         */
        public ListRtopStarCompanyResponse ListRtopStarCompanyEx(ListRtopStarCompanyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopStarCompanyResponse>(DoRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户收藏企业列表
         * Summary: 查询用户收藏企业列表
         */
        public async Task<ListRtopStarCompanyResponse> ListRtopStarCompanyExAsync(ListRtopStarCompanyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRtopStarCompanyResponse>(await DoRequestAsync("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 策略咨询服务输出(saas)
         * Summary: 策略咨询服务输出(saas)
         */
        public QueryRpSecurityPolicyResponse QueryRpSecurityPolicy(QueryRpSecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRpSecurityPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 策略咨询服务输出(saas)
         * Summary: 策略咨询服务输出(saas)
         */
        public async Task<QueryRpSecurityPolicyResponse> QueryRpSecurityPolicyAsync(QueryRpSecurityPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRpSecurityPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 策略咨询服务输出(saas)
         * Summary: 策略咨询服务输出(saas)
         */
        public QueryRpSecurityPolicyResponse QueryRpSecurityPolicyEx(QueryRpSecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpSecurityPolicyResponse>(DoRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 策略咨询服务输出(saas)
         * Summary: 策略咨询服务输出(saas)
         */
        public async Task<QueryRpSecurityPolicyResponse> QueryRpSecurityPolicyExAsync(QueryRpSecurityPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpSecurityPolicyResponse>(await DoRequestAsync("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
