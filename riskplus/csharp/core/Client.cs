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
                        {"req_time", AntChain.AlipayUtil.AntchainUtils.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.AntchainUtils.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.13.9"},
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
                        {"sdk_version", "1.13.9"},
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
         * Description: 反欺诈风险数据服务请求执行
         * Summary: 反欺诈风险数据服务请求执行
         */
        public ExecSecurityRiskdataserviceResponse ExecSecurityRiskdataservice(ExecSecurityRiskdataserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecSecurityRiskdataserviceEx(request, headers, runtime);
        }

        /**
         * Description: 反欺诈风险数据服务请求执行
         * Summary: 反欺诈风险数据服务请求执行
         */
        public async Task<ExecSecurityRiskdataserviceResponse> ExecSecurityRiskdataserviceAsync(ExecSecurityRiskdataserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecSecurityRiskdataserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 反欺诈风险数据服务请求执行
         * Summary: 反欺诈风险数据服务请求执行
         */
        public ExecSecurityRiskdataserviceResponse ExecSecurityRiskdataserviceEx(ExecSecurityRiskdataserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSecurityRiskdataserviceResponse>(DoRequest("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 反欺诈风险数据服务请求执行
         * Summary: 反欺诈风险数据服务请求执行
         */
        public async Task<ExecSecurityRiskdataserviceResponse> ExecSecurityRiskdataserviceExAsync(ExecSecurityRiskdataserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSecurityRiskdataserviceResponse>(await DoRequestAsync("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统线下测试环境测试接口
         * Summary: 天枢信贷业务系统线下测试接口
         */
        public QueryDubheTestResponse QueryDubheTest(QueryDubheTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheTestEx(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统线下测试环境测试接口
         * Summary: 天枢信贷业务系统线下测试接口
         */
        public async Task<QueryDubheTestResponse> QueryDubheTestAsync(QueryDubheTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统线下测试环境测试接口
         * Summary: 天枢信贷业务系统线下测试接口
         */
        public QueryDubheTestResponse QueryDubheTestEx(QueryDubheTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheTestResponse>(DoRequest("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统线下测试环境测试接口
         * Summary: 天枢信贷业务系统线下测试接口
         */
        public async Task<QueryDubheTestResponse> QueryDubheTestExAsync(QueryDubheTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheTestResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过客户三要素信息查询资金方代码(资金路由)
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public QueryDubheRouterFundrouterResponse QueryDubheRouterFundrouter(QueryDubheRouterFundrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheRouterFundrouterEx(request, headers, runtime);
        }

        /**
         * Description: 通过客户三要素信息查询资金方代码(资金路由)
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public async Task<QueryDubheRouterFundrouterResponse> QueryDubheRouterFundrouterAsync(QueryDubheRouterFundrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheRouterFundrouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过客户三要素信息查询资金方代码(资金路由)
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public QueryDubheRouterFundrouterResponse QueryDubheRouterFundrouterEx(QueryDubheRouterFundrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRouterFundrouterResponse>(DoRequest("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过客户三要素信息查询资金方代码(资金路由)
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public async Task<QueryDubheRouterFundrouterResponse> QueryDubheRouterFundrouterExAsync(QueryDubheRouterFundrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRouterFundrouterResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public ApplyDubheCreditResponse ApplyDubheCredit(ApplyDubheCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubheCreditEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public async Task<ApplyDubheCreditResponse> ApplyDubheCreditAsync(ApplyDubheCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubheCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public ApplyDubheCreditResponse ApplyDubheCreditEx(ApplyDubheCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheCreditResponse>(DoRequest("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public async Task<ApplyDubheCreditResponse> ApplyDubheCreditExAsync(ApplyDubheCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheCreditResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public QueryDubheCreditStatusResponse QueryDubheCreditStatus(QueryDubheCreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheCreditStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public async Task<QueryDubheCreditStatusResponse> QueryDubheCreditStatusAsync(QueryDubheCreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheCreditStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public QueryDubheCreditStatusResponse QueryDubheCreditStatusEx(QueryDubheCreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheCreditStatusResponse>(DoRequest("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public async Task<QueryDubheCreditStatusResponse> QueryDubheCreditStatusExAsync(QueryDubheCreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheCreditStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public CountDubheRepayReftrialResponse CountDubheRepayReftrial(CountDubheRepayReftrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDubheRepayReftrialEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public async Task<CountDubheRepayReftrialResponse> CountDubheRepayReftrialAsync(CountDubheRepayReftrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDubheRepayReftrialExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public CountDubheRepayReftrialResponse CountDubheRepayReftrialEx(CountDubheRepayReftrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubheRepayReftrialResponse>(DoRequest("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public async Task<CountDubheRepayReftrialResponse> CountDubheRepayReftrialExAsync(CountDubheRepayReftrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubheRepayReftrialResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public QueryDubheRepayListResponse QueryDubheRepayList(QueryDubheRepayListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheRepayListEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public async Task<QueryDubheRepayListResponse> QueryDubheRepayListAsync(QueryDubheRepayListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheRepayListExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public QueryDubheRepayListResponse QueryDubheRepayListEx(QueryDubheRepayListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRepayListResponse>(DoRequest("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public async Task<QueryDubheRepayListResponse> QueryDubheRepayListExAsync(QueryDubheRepayListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRepayListResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public ApplyDubheUsecreditResponse ApplyDubheUsecredit(ApplyDubheUsecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubheUsecreditEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public async Task<ApplyDubheUsecreditResponse> ApplyDubheUsecreditAsync(ApplyDubheUsecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubheUsecreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public ApplyDubheUsecreditResponse ApplyDubheUsecreditEx(ApplyDubheUsecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheUsecreditResponse>(DoRequest("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public async Task<ApplyDubheUsecreditResponse> ApplyDubheUsecreditExAsync(ApplyDubheUsecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheUsecreditResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public QueryDubheUsecreditStatusResponse QueryDubheUsecreditStatus(QueryDubheUsecreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheUsecreditStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public async Task<QueryDubheUsecreditStatusResponse> QueryDubheUsecreditStatusAsync(QueryDubheUsecreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheUsecreditStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public QueryDubheUsecreditStatusResponse QueryDubheUsecreditStatusEx(QueryDubheUsecreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheUsecreditStatusResponse>(DoRequest("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public async Task<QueryDubheUsecreditStatusResponse> QueryDubheUsecreditStatusExAsync(QueryDubheUsecreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheUsecreditStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public CountDubheRepayTrialResponse CountDubheRepayTrial(CountDubheRepayTrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDubheRepayTrialEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public async Task<CountDubheRepayTrialResponse> CountDubheRepayTrialAsync(CountDubheRepayTrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDubheRepayTrialExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public CountDubheRepayTrialResponse CountDubheRepayTrialEx(CountDubheRepayTrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubheRepayTrialResponse>(DoRequest("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public async Task<CountDubheRepayTrialResponse> CountDubheRepayTrialExAsync(CountDubheRepayTrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubheRepayTrialResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public RepayDubheRepayCheckstandResponse RepayDubheRepayCheckstand(RepayDubheRepayCheckstandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayDubheRepayCheckstandEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public async Task<RepayDubheRepayCheckstandResponse> RepayDubheRepayCheckstandAsync(RepayDubheRepayCheckstandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayDubheRepayCheckstandExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public RepayDubheRepayCheckstandResponse RepayDubheRepayCheckstandEx(RepayDubheRepayCheckstandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubheRepayCheckstandResponse>(DoRequest("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public async Task<RepayDubheRepayCheckstandResponse> RepayDubheRepayCheckstandExAsync(RepayDubheRepayCheckstandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubheRepayCheckstandResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public QueryDubheRepayInfoResponse QueryDubheRepayInfo(QueryDubheRepayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheRepayInfoEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public async Task<QueryDubheRepayInfoResponse> QueryDubheRepayInfoAsync(QueryDubheRepayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheRepayInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public QueryDubheRepayInfoResponse QueryDubheRepayInfoEx(QueryDubheRepayInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRepayInfoResponse>(DoRequest("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public async Task<QueryDubheRepayInfoResponse> QueryDubheRepayInfoExAsync(QueryDubheRepayInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheRepayInfoResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public UpdateDubheCustomerInfoResponse UpdateDubheCustomerInfo(UpdateDubheCustomerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDubheCustomerInfoEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public async Task<UpdateDubheCustomerInfoResponse> UpdateDubheCustomerInfoAsync(UpdateDubheCustomerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDubheCustomerInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public UpdateDubheCustomerInfoResponse UpdateDubheCustomerInfoEx(UpdateDubheCustomerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubheCustomerInfoResponse>(DoRequest("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public async Task<UpdateDubheCustomerInfoResponse> UpdateDubheCustomerInfoExAsync(UpdateDubheCustomerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubheCustomerInfoResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public ApplyDubheCustomerAgreementsignResponse ApplyDubheCustomerAgreementsign(ApplyDubheCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubheCustomerAgreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public async Task<ApplyDubheCustomerAgreementsignResponse> ApplyDubheCustomerAgreementsignAsync(ApplyDubheCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubheCustomerAgreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public ApplyDubheCustomerAgreementsignResponse ApplyDubheCustomerAgreementsignEx(ApplyDubheCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheCustomerAgreementsignResponse>(DoRequest("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public async Task<ApplyDubheCustomerAgreementsignResponse> ApplyDubheCustomerAgreementsignExAsync(ApplyDubheCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubheCustomerAgreementsignResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public QueryDubheCustomerAgreementsignResponse QueryDubheCustomerAgreementsign(QueryDubheCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheCustomerAgreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public async Task<QueryDubheCustomerAgreementsignResponse> QueryDubheCustomerAgreementsignAsync(QueryDubheCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheCustomerAgreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public QueryDubheCustomerAgreementsignResponse QueryDubheCustomerAgreementsignEx(QueryDubheCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheCustomerAgreementsignResponse>(DoRequest("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public async Task<QueryDubheCustomerAgreementsignResponse> QueryDubheCustomerAgreementsignExAsync(QueryDubheCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheCustomerAgreementsignResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public RepayDubheRepayWithholdResponse RepayDubheRepayWithhold(RepayDubheRepayWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayDubheRepayWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public async Task<RepayDubheRepayWithholdResponse> RepayDubheRepayWithholdAsync(RepayDubheRepayWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayDubheRepayWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public RepayDubheRepayWithholdResponse RepayDubheRepayWithholdEx(RepayDubheRepayWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubheRepayWithholdResponse>(DoRequest("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public async Task<RepayDubheRepayWithholdResponse> RepayDubheRepayWithholdExAsync(RepayDubheRepayWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubheRepayWithholdResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public QueryDubheSearchContractResponse QueryDubheSearchContract(QueryDubheSearchContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheSearchContractEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public async Task<QueryDubheSearchContractResponse> QueryDubheSearchContractAsync(QueryDubheSearchContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheSearchContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public QueryDubheSearchContractResponse QueryDubheSearchContractEx(QueryDubheSearchContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheSearchContractResponse>(DoRequest("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public async Task<QueryDubheSearchContractResponse> QueryDubheSearchContractExAsync(QueryDubheSearchContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheSearchContractResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public QueryDubheReceiptOverdueResponse QueryDubheReceiptOverdue(QueryDubheReceiptOverdueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubheReceiptOverdueEx(request, headers, runtime);
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public async Task<QueryDubheReceiptOverdueResponse> QueryDubheReceiptOverdueAsync(QueryDubheReceiptOverdueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubheReceiptOverdueExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public QueryDubheReceiptOverdueResponse QueryDubheReceiptOverdueEx(QueryDubheReceiptOverdueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheReceiptOverdueResponse>(DoRequest("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public async Task<QueryDubheReceiptOverdueResponse> QueryDubheReceiptOverdueExAsync(QueryDubheReceiptOverdueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubheReceiptOverdueResponse>(await DoRequestAsync("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢发送短信接口，适用于一个模板相同参数
         * Summary: 天枢发送短信接口
         */
        public SendDubbridgeSmsResponse SendDubbridgeSms(SendDubbridgeSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendDubbridgeSmsEx(request, headers, runtime);
        }

        /**
         * Description: 天枢发送短信接口，适用于一个模板相同参数
         * Summary: 天枢发送短信接口
         */
        public async Task<SendDubbridgeSmsResponse> SendDubbridgeSmsAsync(SendDubbridgeSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendDubbridgeSmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢发送短信接口，适用于一个模板相同参数
         * Summary: 天枢发送短信接口
         */
        public SendDubbridgeSmsResponse SendDubbridgeSmsEx(SendDubbridgeSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDubbridgeSmsResponse>(DoRequest("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢发送短信接口，适用于一个模板相同参数
         * Summary: 天枢发送短信接口
         */
        public async Task<SendDubbridgeSmsResponse> SendDubbridgeSmsExAsync(SendDubbridgeSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDubbridgeSmsResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
         * Summary: 天枢批量发送短信接口
         */
        public SendDubbridgeSmsBatchResponse SendDubbridgeSmsBatch(SendDubbridgeSmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendDubbridgeSmsBatchEx(request, headers, runtime);
        }

        /**
         * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
         * Summary: 天枢批量发送短信接口
         */
        public async Task<SendDubbridgeSmsBatchResponse> SendDubbridgeSmsBatchAsync(SendDubbridgeSmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendDubbridgeSmsBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
         * Summary: 天枢批量发送短信接口
         */
        public SendDubbridgeSmsBatchResponse SendDubbridgeSmsBatchEx(SendDubbridgeSmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDubbridgeSmsBatchResponse>(DoRequest("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
         * Summary: 天枢批量发送短信接口
         */
        public async Task<SendDubbridgeSmsBatchResponse> SendDubbridgeSmsBatchExAsync(SendDubbridgeSmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDubbridgeSmsBatchResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资金路由接口，获取资金方编号
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public QueryDubbridgeRouterFundrouterResponse QueryDubbridgeRouterFundrouter(QueryDubbridgeRouterFundrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRouterFundrouterEx(request, headers, runtime);
        }

        /**
         * Description: 资金路由接口，获取资金方编号
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public async Task<QueryDubbridgeRouterFundrouterResponse> QueryDubbridgeRouterFundrouterAsync(QueryDubbridgeRouterFundrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRouterFundrouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 资金路由接口，获取资金方编号
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public QueryDubbridgeRouterFundrouterResponse QueryDubbridgeRouterFundrouterEx(QueryDubbridgeRouterFundrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRouterFundrouterResponse>(DoRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资金路由接口，获取资金方编号
         * Summary: 天枢系统资金方代码(资金路由)查询
         */
        public async Task<QueryDubbridgeRouterFundrouterResponse> QueryDubbridgeRouterFundrouterExAsync(QueryDubbridgeRouterFundrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRouterFundrouterResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public ApplyDubbridgeCreditResponse ApplyDubbridgeCredit(ApplyDubbridgeCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubbridgeCreditEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public async Task<ApplyDubbridgeCreditResponse> ApplyDubbridgeCreditAsync(ApplyDubbridgeCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubbridgeCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public ApplyDubbridgeCreditResponse ApplyDubbridgeCreditEx(ApplyDubbridgeCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeCreditResponse>(DoRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信申请接口
         * Summary: 天枢系统授信申请接口
         */
        public async Task<ApplyDubbridgeCreditResponse> ApplyDubbridgeCreditExAsync(ApplyDubbridgeCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeCreditResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
         * Summary: 天枢文件上传
         */
        public UploadDubbridgeFileResponse UploadDubbridgeFile(UploadDubbridgeFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadDubbridgeFileEx(request, headers, runtime);
        }

        /**
         * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
         * Summary: 天枢文件上传
         */
        public async Task<UploadDubbridgeFileResponse> UploadDubbridgeFileAsync(UploadDubbridgeFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadDubbridgeFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
         * Summary: 天枢文件上传
         */
        public UploadDubbridgeFileResponse UploadDubbridgeFileEx(UploadDubbridgeFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.dubbridge.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadDubbridgeFileResponse uploadDubbridgeFileResponse = new UploadDubbridgeFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadDubbridgeFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDubbridgeFileResponse>(DoRequest("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
         * Summary: 天枢文件上传
         */
        public async Task<UploadDubbridgeFileResponse> UploadDubbridgeFileExAsync(UploadDubbridgeFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.dubbridge.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadDubbridgeFileResponse uploadDubbridgeFileResponse = new UploadDubbridgeFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadDubbridgeFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDubbridgeFileResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约绑卡接口
         * Summary: 代扣协议签约申请(银行卡绑卡)
         */
        public BindDubbridgeCustomerBankcardResponse BindDubbridgeCustomerBankcard(BindDubbridgeCustomerBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDubbridgeCustomerBankcardEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约绑卡接口
         * Summary: 代扣协议签约申请(银行卡绑卡)
         */
        public async Task<BindDubbridgeCustomerBankcardResponse> BindDubbridgeCustomerBankcardAsync(BindDubbridgeCustomerBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDubbridgeCustomerBankcardExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约绑卡接口
         * Summary: 代扣协议签约申请(银行卡绑卡)
         */
        public BindDubbridgeCustomerBankcardResponse BindDubbridgeCustomerBankcardEx(BindDubbridgeCustomerBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDubbridgeCustomerBankcardResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约绑卡接口
         * Summary: 代扣协议签约申请(银行卡绑卡)
         */
        public async Task<BindDubbridgeCustomerBankcardResponse> BindDubbridgeCustomerBankcardExAsync(BindDubbridgeCustomerBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDubbridgeCustomerBankcardResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议签约提交(银行卡绑卡)
         * Summary: 代扣协议签约校验(银行卡绑卡)
         */
        public VerifyDubbridgeCustomerBankcardResponse VerifyDubbridgeCustomerBankcard(VerifyDubbridgeCustomerBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDubbridgeCustomerBankcardEx(request, headers, runtime);
        }

        /**
         * Description: 代扣协议签约提交(银行卡绑卡)
         * Summary: 代扣协议签约校验(银行卡绑卡)
         */
        public async Task<VerifyDubbridgeCustomerBankcardResponse> VerifyDubbridgeCustomerBankcardAsync(VerifyDubbridgeCustomerBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDubbridgeCustomerBankcardExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣协议签约提交(银行卡绑卡)
         * Summary: 代扣协议签约校验(银行卡绑卡)
         */
        public VerifyDubbridgeCustomerBankcardResponse VerifyDubbridgeCustomerBankcardEx(VerifyDubbridgeCustomerBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDubbridgeCustomerBankcardResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议签约提交(银行卡绑卡)
         * Summary: 代扣协议签约校验(银行卡绑卡)
         */
        public async Task<VerifyDubbridgeCustomerBankcardResponse> VerifyDubbridgeCustomerBankcardExAsync(VerifyDubbridgeCustomerBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDubbridgeCustomerBankcardResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于机构通道通用回调
         * Summary: 机构通道回调通用接口
         */
        public NotifyDubbridgeDefininnerchannelResponse NotifyDubbridgeDefininnerchannel(NotifyDubbridgeDefininnerchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyDubbridgeDefininnerchannelEx(request, headers, runtime);
        }

        /**
         * Description: 用于机构通道通用回调
         * Summary: 机构通道回调通用接口
         */
        public async Task<NotifyDubbridgeDefininnerchannelResponse> NotifyDubbridgeDefininnerchannelAsync(NotifyDubbridgeDefininnerchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyDubbridgeDefininnerchannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于机构通道通用回调
         * Summary: 机构通道回调通用接口
         */
        public NotifyDubbridgeDefininnerchannelResponse NotifyDubbridgeDefininnerchannelEx(NotifyDubbridgeDefininnerchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDubbridgeDefininnerchannelResponse>(DoRequest("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于机构通道通用回调
         * Summary: 机构通道回调通用接口
         */
        public async Task<NotifyDubbridgeDefininnerchannelResponse> NotifyDubbridgeDefininnerchannelExAsync(NotifyDubbridgeDefininnerchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDubbridgeDefininnerchannelResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public QueryDubbridgeCreditStatusResponse QueryDubbridgeCreditStatus(QueryDubbridgeCreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeCreditStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public async Task<QueryDubbridgeCreditStatusResponse> QueryDubbridgeCreditStatusAsync(QueryDubbridgeCreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeCreditStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public QueryDubbridgeCreditStatusResponse QueryDubbridgeCreditStatusEx(QueryDubbridgeCreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCreditStatusResponse>(DoRequest("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统授信额度查询接口
         * Summary: 天枢系统授信额度查询接口
         */
        public async Task<QueryDubbridgeCreditStatusResponse> QueryDubbridgeCreditStatusExAsync(QueryDubbridgeCreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCreditStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统企业小微分查询
         * Summary: 天枢系统企业小微分查询
         */
        public QueryDubbridgeRiskinfoEnterprisescoreResponse QueryDubbridgeRiskinfoEnterprisescore(QueryDubbridgeRiskinfoEnterprisescoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统企业小微分查询
         * Summary: 天枢系统企业小微分查询
         */
        public async Task<QueryDubbridgeRiskinfoEnterprisescoreResponse> QueryDubbridgeRiskinfoEnterprisescoreAsync(QueryDubbridgeRiskinfoEnterprisescoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRiskinfoEnterprisescoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统企业小微分查询
         * Summary: 天枢系统企业小微分查询
         */
        public QueryDubbridgeRiskinfoEnterprisescoreResponse QueryDubbridgeRiskinfoEnterprisescoreEx(QueryDubbridgeRiskinfoEnterprisescoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoEnterprisescoreResponse>(DoRequest("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统企业小微分查询
         * Summary: 天枢系统企业小微分查询
         */
        public async Task<QueryDubbridgeRiskinfoEnterprisescoreResponse> QueryDubbridgeRiskinfoEnterprisescoreExAsync(QueryDubbridgeRiskinfoEnterprisescoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoEnterprisescoreResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统风控信息通用查询
         * Summary: 天枢系统风控信息通用查询
         */
        public QueryDubbridgeRiskinfoCommonResponse QueryDubbridgeRiskinfoCommon(QueryDubbridgeRiskinfoCommonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRiskinfoCommonEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统风控信息通用查询
         * Summary: 天枢系统风控信息通用查询
         */
        public async Task<QueryDubbridgeRiskinfoCommonResponse> QueryDubbridgeRiskinfoCommonAsync(QueryDubbridgeRiskinfoCommonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRiskinfoCommonExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统风控信息通用查询
         * Summary: 天枢系统风控信息通用查询
         */
        public QueryDubbridgeRiskinfoCommonResponse QueryDubbridgeRiskinfoCommonEx(QueryDubbridgeRiskinfoCommonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoCommonResponse>(DoRequest("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统风控信息通用查询
         * Summary: 天枢系统风控信息通用查询
         */
        public async Task<QueryDubbridgeRiskinfoCommonResponse> QueryDubbridgeRiskinfoCommonExAsync(QueryDubbridgeRiskinfoCommonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoCommonResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 额度、利率、状态调整
         * Summary: 调额申请
         */
        public UpdateDubbridgeInstitutionCreditResponse UpdateDubbridgeInstitutionCredit(UpdateDubbridgeInstitutionCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDubbridgeInstitutionCreditEx(request, headers, runtime);
        }

        /**
         * Description: 额度、利率、状态调整
         * Summary: 调额申请
         */
        public async Task<UpdateDubbridgeInstitutionCreditResponse> UpdateDubbridgeInstitutionCreditAsync(UpdateDubbridgeInstitutionCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDubbridgeInstitutionCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 额度、利率、状态调整
         * Summary: 调额申请
         */
        public UpdateDubbridgeInstitutionCreditResponse UpdateDubbridgeInstitutionCreditEx(UpdateDubbridgeInstitutionCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeInstitutionCreditResponse>(DoRequest("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 额度、利率、状态调整
         * Summary: 调额申请
         */
        public async Task<UpdateDubbridgeInstitutionCreditResponse> UpdateDubbridgeInstitutionCreditExAsync(UpdateDubbridgeInstitutionCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeInstitutionCreditResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢企业经营数据查询
         * Summary: 天枢企业经营数据查询
         */
        public QueryDubbridgeRiskinfoBusinessinfoResponse QueryDubbridgeRiskinfoBusinessinfo(QueryDubbridgeRiskinfoBusinessinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime);
        }

        /**
         * Description: 天枢企业经营数据查询
         * Summary: 天枢企业经营数据查询
         */
        public async Task<QueryDubbridgeRiskinfoBusinessinfoResponse> QueryDubbridgeRiskinfoBusinessinfoAsync(QueryDubbridgeRiskinfoBusinessinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRiskinfoBusinessinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢企业经营数据查询
         * Summary: 天枢企业经营数据查询
         */
        public QueryDubbridgeRiskinfoBusinessinfoResponse QueryDubbridgeRiskinfoBusinessinfoEx(QueryDubbridgeRiskinfoBusinessinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoBusinessinfoResponse>(DoRequest("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢企业经营数据查询
         * Summary: 天枢企业经营数据查询
         */
        public async Task<QueryDubbridgeRiskinfoBusinessinfoResponse> QueryDubbridgeRiskinfoBusinessinfoExAsync(QueryDubbridgeRiskinfoBusinessinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRiskinfoBusinessinfoResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝）
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public ApplyDubbridgeCustomerAgreementsignResponse ApplyDubbridgeCustomerAgreementsign(ApplyDubbridgeCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubbridgeCustomerAgreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝）
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public async Task<ApplyDubbridgeCustomerAgreementsignResponse> ApplyDubbridgeCustomerAgreementsignAsync(ApplyDubbridgeCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubbridgeCustomerAgreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝）
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public ApplyDubbridgeCustomerAgreementsignResponse ApplyDubbridgeCustomerAgreementsignEx(ApplyDubbridgeCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeCustomerAgreementsignResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约申请(支付宝）
         * Summary: 天枢系统协议签约申请(支付宝)
         */
        public async Task<ApplyDubbridgeCustomerAgreementsignResponse> ApplyDubbridgeCustomerAgreementsignExAsync(ApplyDubbridgeCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeCustomerAgreementsignResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统是否授信查询
         * Summary: 天枢系统是否授信查询
         */
        public QueryDubbridgeAccountStatusResponse QueryDubbridgeAccountStatus(QueryDubbridgeAccountStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeAccountStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统是否授信查询
         * Summary: 天枢系统是否授信查询
         */
        public async Task<QueryDubbridgeAccountStatusResponse> QueryDubbridgeAccountStatusAsync(QueryDubbridgeAccountStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeAccountStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统是否授信查询
         * Summary: 天枢系统是否授信查询
         */
        public QueryDubbridgeAccountStatusResponse QueryDubbridgeAccountStatusEx(QueryDubbridgeAccountStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeAccountStatusResponse>(DoRequest("1.0", "riskplus.dubbridge.account.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统是否授信查询
         * Summary: 天枢系统是否授信查询
         */
        public async Task<QueryDubbridgeAccountStatusResponse> QueryDubbridgeAccountStatusExAsync(QueryDubbridgeAccountStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeAccountStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.account.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统校验是否联登
         * Summary: 天枢系统校验是否联登
         */
        public QueryDubbridgeAccountCustomResponse QueryDubbridgeAccountCustom(QueryDubbridgeAccountCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeAccountCustomEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统校验是否联登
         * Summary: 天枢系统校验是否联登
         */
        public async Task<QueryDubbridgeAccountCustomResponse> QueryDubbridgeAccountCustomAsync(QueryDubbridgeAccountCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeAccountCustomExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统校验是否联登
         * Summary: 天枢系统校验是否联登
         */
        public QueryDubbridgeAccountCustomResponse QueryDubbridgeAccountCustomEx(QueryDubbridgeAccountCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeAccountCustomResponse>(DoRequest("1.0", "riskplus.dubbridge.account.custom.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统校验是否联登
         * Summary: 天枢系统校验是否联登
         */
        public async Task<QueryDubbridgeAccountCustomResponse> QueryDubbridgeAccountCustomExAsync(QueryDubbridgeAccountCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeAccountCustomResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.account.custom.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统更新渠道
         * Summary: 天枢系统更新渠道
         */
        public UpdateDubbridgeAccountCustomResponse UpdateDubbridgeAccountCustom(UpdateDubbridgeAccountCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDubbridgeAccountCustomEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统更新渠道
         * Summary: 天枢系统更新渠道
         */
        public async Task<UpdateDubbridgeAccountCustomResponse> UpdateDubbridgeAccountCustomAsync(UpdateDubbridgeAccountCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDubbridgeAccountCustomExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统更新渠道
         * Summary: 天枢系统更新渠道
         */
        public UpdateDubbridgeAccountCustomResponse UpdateDubbridgeAccountCustomEx(UpdateDubbridgeAccountCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeAccountCustomResponse>(DoRequest("1.0", "riskplus.dubbridge.account.custom.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统更新渠道
         * Summary: 天枢系统更新渠道
         */
        public async Task<UpdateDubbridgeAccountCustomResponse> UpdateDubbridgeAccountCustomExAsync(UpdateDubbridgeAccountCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeAccountCustomResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.account.custom.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public QueryDubbridgeCustomerAgreementsignResponse QueryDubbridgeCustomerAgreementsign(QueryDubbridgeCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeCustomerAgreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public async Task<QueryDubbridgeCustomerAgreementsignResponse> QueryDubbridgeCustomerAgreementsignAsync(QueryDubbridgeCustomerAgreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeCustomerAgreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public QueryDubbridgeCustomerAgreementsignResponse QueryDubbridgeCustomerAgreementsignEx(QueryDubbridgeCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCustomerAgreementsignResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(支付宝)
         * Summary: 天枢系统协议签约查询(支付宝)
         */
        public async Task<QueryDubbridgeCustomerAgreementsignResponse> QueryDubbridgeCustomerAgreementsignExAsync(QueryDubbridgeCustomerAgreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCustomerAgreementsignResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public UpdateDubbridgeCustomerInfoResponse UpdateDubbridgeCustomerInfo(UpdateDubbridgeCustomerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDubbridgeCustomerInfoEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public async Task<UpdateDubbridgeCustomerInfoResponse> UpdateDubbridgeCustomerInfoAsync(UpdateDubbridgeCustomerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDubbridgeCustomerInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public UpdateDubbridgeCustomerInfoResponse UpdateDubbridgeCustomerInfoEx(UpdateDubbridgeCustomerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeCustomerInfoResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
         * Summary: 天枢系统客户信息变更接口
         */
        public async Task<UpdateDubbridgeCustomerInfoResponse> UpdateDubbridgeCustomerInfoExAsync(UpdateDubbridgeCustomerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeCustomerInfoResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public QueryDubbridgeReceiptOverdueResponse QueryDubbridgeReceiptOverdue(QueryDubbridgeReceiptOverdueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeReceiptOverdueEx(request, headers, runtime);
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public async Task<QueryDubbridgeReceiptOverdueResponse> QueryDubbridgeReceiptOverdueAsync(QueryDubbridgeReceiptOverdueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeReceiptOverdueExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public QueryDubbridgeReceiptOverdueResponse QueryDubbridgeReceiptOverdueEx(QueryDubbridgeReceiptOverdueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeReceiptOverdueResponse>(DoRequest("1.0", "riskplus.dubbridge.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢逾期信息查询接口
         * Summary: 逾期信息查询
         */
        public async Task<QueryDubbridgeReceiptOverdueResponse> QueryDubbridgeReceiptOverdueExAsync(QueryDubbridgeReceiptOverdueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeReceiptOverdueResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public RepayDubbridgeRepayCheckstandResponse RepayDubbridgeRepayCheckstand(RepayDubbridgeRepayCheckstandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayDubbridgeRepayCheckstandEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public async Task<RepayDubbridgeRepayCheckstandResponse> RepayDubbridgeRepayCheckstandAsync(RepayDubbridgeRepayCheckstandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayDubbridgeRepayCheckstandExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public RepayDubbridgeRepayCheckstandResponse RepayDubbridgeRepayCheckstandEx(RepayDubbridgeRepayCheckstandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubbridgeRepayCheckstandResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统主动还款（收银台）接口
         * Summary: 天枢系统主动还款（收银台）接口
         */
        public async Task<RepayDubbridgeRepayCheckstandResponse> RepayDubbridgeRepayCheckstandExAsync(RepayDubbridgeRepayCheckstandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubbridgeRepayCheckstandResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public QueryDubbridgeRepayInfoResponse QueryDubbridgeRepayInfo(QueryDubbridgeRepayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRepayInfoEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public async Task<QueryDubbridgeRepayInfoResponse> QueryDubbridgeRepayInfoAsync(QueryDubbridgeRepayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRepayInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public QueryDubbridgeRepayInfoResponse QueryDubbridgeRepayInfoEx(QueryDubbridgeRepayInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRepayInfoResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款信息查询
         * Summary: 天枢系统还款信息查询
         */
        public async Task<QueryDubbridgeRepayInfoResponse> QueryDubbridgeRepayInfoExAsync(QueryDubbridgeRepayInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRepayInfoResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public QueryDubbridgeRepayListResponse QueryDubbridgeRepayList(QueryDubbridgeRepayListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeRepayListEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public async Task<QueryDubbridgeRepayListResponse> QueryDubbridgeRepayListAsync(QueryDubbridgeRepayListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeRepayListExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public QueryDubbridgeRepayListResponse QueryDubbridgeRepayListEx(QueryDubbridgeRepayListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRepayListResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
         * Summary: 天枢系统还款计划查询
         */
        public async Task<QueryDubbridgeRepayListResponse> QueryDubbridgeRepayListExAsync(QueryDubbridgeRepayListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeRepayListResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public CountDubbridgeRepayReftrialResponse CountDubbridgeRepayReftrial(CountDubbridgeRepayReftrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDubbridgeRepayReftrialEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public async Task<CountDubbridgeRepayReftrialResponse> CountDubbridgeRepayReftrialAsync(CountDubbridgeRepayReftrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDubbridgeRepayReftrialExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public CountDubbridgeRepayReftrialResponse CountDubbridgeRepayReftrialEx(CountDubbridgeRepayReftrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubbridgeRepayReftrialResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
         * Summary: 天枢系统还款计划试算
         */
        public async Task<CountDubbridgeRepayReftrialResponse> CountDubbridgeRepayReftrialExAsync(CountDubbridgeRepayReftrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubbridgeRepayReftrialResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public CountDubbridgeRepayTrialResponse CountDubbridgeRepayTrial(CountDubbridgeRepayTrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDubbridgeRepayTrialEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public async Task<CountDubbridgeRepayTrialResponse> CountDubbridgeRepayTrialAsync(CountDubbridgeRepayTrialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDubbridgeRepayTrialExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public CountDubbridgeRepayTrialResponse CountDubbridgeRepayTrialEx(CountDubbridgeRepayTrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubbridgeRepayTrialResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.trial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统还款试算，根据借据号计算还款金额
         * Summary: 天枢系统还款试算
         */
        public async Task<CountDubbridgeRepayTrialResponse> CountDubbridgeRepayTrialExAsync(CountDubbridgeRepayTrialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDubbridgeRepayTrialResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.trial.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public RepayDubbridgeRepayWithholdResponse RepayDubbridgeRepayWithhold(RepayDubbridgeRepayWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayDubbridgeRepayWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public async Task<RepayDubbridgeRepayWithholdResponse> RepayDubbridgeRepayWithholdAsync(RepayDubbridgeRepayWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayDubbridgeRepayWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public RepayDubbridgeRepayWithholdResponse RepayDubbridgeRepayWithholdEx(RepayDubbridgeRepayWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubbridgeRepayWithholdResponse>(DoRequest("1.0", "riskplus.dubbridge.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢信贷业务系统主动还款（直接代扣）接口
         * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
         */
        public async Task<RepayDubbridgeRepayWithholdResponse> RepayDubbridgeRepayWithholdExAsync(RepayDubbridgeRepayWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayDubbridgeRepayWithholdResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public QueryDubbridgeSearchContractResponse QueryDubbridgeSearchContract(QueryDubbridgeSearchContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeSearchContractEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public async Task<QueryDubbridgeSearchContractResponse> QueryDubbridgeSearchContractAsync(QueryDubbridgeSearchContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeSearchContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public QueryDubbridgeSearchContractResponse QueryDubbridgeSearchContractEx(QueryDubbridgeSearchContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeSearchContractResponse>(DoRequest("1.0", "riskplus.dubbridge.search.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统合同获取
         * Summary: 天枢系统合同获取
         */
        public async Task<QueryDubbridgeSearchContractResponse> QueryDubbridgeSearchContractExAsync(QueryDubbridgeSearchContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeSearchContractResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.search.contract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public ApplyDubbridgeUsecreditResponse ApplyDubbridgeUsecredit(ApplyDubbridgeUsecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDubbridgeUsecreditEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public async Task<ApplyDubbridgeUsecreditResponse> ApplyDubbridgeUsecreditAsync(ApplyDubbridgeUsecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDubbridgeUsecreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public ApplyDubbridgeUsecreditResponse ApplyDubbridgeUsecreditEx(ApplyDubbridgeUsecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeUsecreditResponse>(DoRequest("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请接口
         * Summary: 天枢系统用信申请接口
         */
        public async Task<ApplyDubbridgeUsecreditResponse> ApplyDubbridgeUsecreditExAsync(ApplyDubbridgeUsecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDubbridgeUsecreditResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public QueryDubbridgeUsecreditStatusResponse QueryDubbridgeUsecreditStatus(QueryDubbridgeUsecreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeUsecreditStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public async Task<QueryDubbridgeUsecreditStatusResponse> QueryDubbridgeUsecreditStatusAsync(QueryDubbridgeUsecreditStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeUsecreditStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public QueryDubbridgeUsecreditStatusResponse QueryDubbridgeUsecreditStatusEx(QueryDubbridgeUsecreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeUsecreditStatusResponse>(DoRequest("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
         * Summary: 天枢系统用信申请状态查询
         */
        public async Task<QueryDubbridgeUsecreditStatusResponse> QueryDubbridgeUsecreditStatusExAsync(QueryDubbridgeUsecreditStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeUsecreditStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统是否结清
         * Summary: 天枢系统借款是否结清
         */
        public QueryDubbridgeReceiptStatusResponse QueryDubbridgeReceiptStatus(QueryDubbridgeReceiptStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeReceiptStatusEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统是否结清
         * Summary: 天枢系统借款是否结清
         */
        public async Task<QueryDubbridgeReceiptStatusResponse> QueryDubbridgeReceiptStatusAsync(QueryDubbridgeReceiptStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeReceiptStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统是否结清
         * Summary: 天枢系统借款是否结清
         */
        public QueryDubbridgeReceiptStatusResponse QueryDubbridgeReceiptStatusEx(QueryDubbridgeReceiptStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeReceiptStatusResponse>(DoRequest("1.0", "riskplus.dubbridge.receipt.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统是否结清
         * Summary: 天枢系统借款是否结清
         */
        public async Task<QueryDubbridgeReceiptStatusResponse> QueryDubbridgeReceiptStatusExAsync(QueryDubbridgeReceiptStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeReceiptStatusResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.receipt.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(通用)
         * Summary: 天枢系统协议签约查询(通用)
         */
        public QueryDubbridgeCustomerCommonagreementsignResponse QueryDubbridgeCustomerCommonagreementsign(QueryDubbridgeCustomerCommonagreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeCustomerCommonagreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(通用)
         * Summary: 天枢系统协议签约查询(通用)
         */
        public async Task<QueryDubbridgeCustomerCommonagreementsignResponse> QueryDubbridgeCustomerCommonagreementsignAsync(QueryDubbridgeCustomerCommonagreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeCustomerCommonagreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统协议签约查询(通用)
         * Summary: 天枢系统协议签约查询(通用)
         */
        public QueryDubbridgeCustomerCommonagreementsignResponse QueryDubbridgeCustomerCommonagreementsignEx(QueryDubbridgeCustomerCommonagreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCustomerCommonagreementsignResponse>(DoRequest("1.0", "riskplus.dubbridge.customer.commonagreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统协议签约查询(通用)
         * Summary: 天枢系统协议签约查询(通用)
         */
        public async Task<QueryDubbridgeCustomerCommonagreementsignResponse> QueryDubbridgeCustomerCommonagreementsignExAsync(QueryDubbridgeCustomerCommonagreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCustomerCommonagreementsignResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.customer.commonagreementsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据关键字从第三方查询企业信息
         * Summary: 天枢系统企业搜索
         */
        public QueryDubbridgeCompanyItemsResponse QueryDubbridgeCompanyItems(QueryDubbridgeCompanyItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeCompanyItemsEx(request, headers, runtime);
        }

        /**
         * Description: 根据关键字从第三方查询企业信息
         * Summary: 天枢系统企业搜索
         */
        public async Task<QueryDubbridgeCompanyItemsResponse> QueryDubbridgeCompanyItemsAsync(QueryDubbridgeCompanyItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeCompanyItemsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据关键字从第三方查询企业信息
         * Summary: 天枢系统企业搜索
         */
        public QueryDubbridgeCompanyItemsResponse QueryDubbridgeCompanyItemsEx(QueryDubbridgeCompanyItemsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCompanyItemsResponse>(DoRequest("1.0", "riskplus.dubbridge.company.items.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据关键字从第三方查询企业信息
         * Summary: 天枢系统企业搜索
         */
        public async Task<QueryDubbridgeCompanyItemsResponse> QueryDubbridgeCompanyItemsExAsync(QueryDubbridgeCompanyItemsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCompanyItemsResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.company.items.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户影像信息更新
         * Summary: 客户影像信息更新
         */
        public UpdateDubbridgeFileResponse UpdateDubbridgeFile(UpdateDubbridgeFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDubbridgeFileEx(request, headers, runtime);
        }

        /**
         * Description: 客户影像信息更新
         * Summary: 客户影像信息更新
         */
        public async Task<UpdateDubbridgeFileResponse> UpdateDubbridgeFileAsync(UpdateDubbridgeFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDubbridgeFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户影像信息更新
         * Summary: 客户影像信息更新
         */
        public UpdateDubbridgeFileResponse UpdateDubbridgeFileEx(UpdateDubbridgeFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeFileResponse>(DoRequest("1.0", "riskplus.dubbridge.file.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户影像信息更新
         * Summary: 客户影像信息更新
         */
        public async Task<UpdateDubbridgeFileResponse> UpdateDubbridgeFileExAsync(UpdateDubbridgeFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDubbridgeFileResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.file.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统获取授信H5地址
         * Summary: 天枢系统获取授信H5地址
         */
        public QueryDubbridgeCreditUrlResponse QueryDubbridgeCreditUrl(QueryDubbridgeCreditUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeCreditUrlEx(request, headers, runtime);
        }

        /**
         * Description: 天枢系统获取授信H5地址
         * Summary: 天枢系统获取授信H5地址
         */
        public async Task<QueryDubbridgeCreditUrlResponse> QueryDubbridgeCreditUrlAsync(QueryDubbridgeCreditUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeCreditUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢系统获取授信H5地址
         * Summary: 天枢系统获取授信H5地址
         */
        public QueryDubbridgeCreditUrlResponse QueryDubbridgeCreditUrlEx(QueryDubbridgeCreditUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCreditUrlResponse>(DoRequest("1.0", "riskplus.dubbridge.credit.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢系统获取授信H5地址
         * Summary: 天枢系统获取授信H5地址
         */
        public async Task<QueryDubbridgeCreditUrlResponse> QueryDubbridgeCreditUrlExAsync(QueryDubbridgeCreditUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeCreditUrlResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.credit.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据关键字从第三方查询企业详情信息
         * Summary: 天枢系统企业详情信息查询
         */
        public QueryDubbridgeBusinessDetailResponse QueryDubbridgeBusinessDetail(QueryDubbridgeBusinessDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDubbridgeBusinessDetailEx(request, headers, runtime);
        }

        /**
         * Description: 根据关键字从第三方查询企业详情信息
         * Summary: 天枢系统企业详情信息查询
         */
        public async Task<QueryDubbridgeBusinessDetailResponse> QueryDubbridgeBusinessDetailAsync(QueryDubbridgeBusinessDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDubbridgeBusinessDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据关键字从第三方查询企业详情信息
         * Summary: 天枢系统企业详情信息查询
         */
        public QueryDubbridgeBusinessDetailResponse QueryDubbridgeBusinessDetailEx(QueryDubbridgeBusinessDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeBusinessDetailResponse>(DoRequest("1.0", "riskplus.dubbridge.business.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据关键字从第三方查询企业详情信息
         * Summary: 天枢系统企业详情信息查询
         */
        public async Task<QueryDubbridgeBusinessDetailResponse> QueryDubbridgeBusinessDetailExAsync(QueryDubbridgeBusinessDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDubbridgeBusinessDetailResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.business.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢回调通用接口
         * Summary: 天枢回调通用接口
         */
        public NotifyDubbridgeCallbackResponse NotifyDubbridgeCallback(NotifyDubbridgeCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyDubbridgeCallbackEx(request, headers, runtime);
        }

        /**
         * Description: 天枢回调通用接口
         * Summary: 天枢回调通用接口
         */
        public async Task<NotifyDubbridgeCallbackResponse> NotifyDubbridgeCallbackAsync(NotifyDubbridgeCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyDubbridgeCallbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 天枢回调通用接口
         * Summary: 天枢回调通用接口
         */
        public NotifyDubbridgeCallbackResponse NotifyDubbridgeCallbackEx(NotifyDubbridgeCallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDubbridgeCallbackResponse>(DoRequest("1.0", "riskplus.dubbridge.callback.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天枢回调通用接口
         * Summary: 天枢回调通用接口
         */
        public async Task<NotifyDubbridgeCallbackResponse> NotifyDubbridgeCallbackExAsync(NotifyDubbridgeCallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDubbridgeCallbackResponse>(await DoRequestAsync("1.0", "riskplus.dubbridge.callback.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 多源融合平台的数据服务查询接口
         * Summary: 多源融合平台的数据服务查询接口
         */
        public QueryMdipDataserviceResponse QueryMdipDataservice(QueryMdipDataserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMdipDataserviceEx(request, headers, runtime);
        }

        /**
         * Description: 多源融合平台的数据服务查询接口
         * Summary: 多源融合平台的数据服务查询接口
         */
        public async Task<QueryMdipDataserviceResponse> QueryMdipDataserviceAsync(QueryMdipDataserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMdipDataserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 多源融合平台的数据服务查询接口
         * Summary: 多源融合平台的数据服务查询接口
         */
        public QueryMdipDataserviceResponse QueryMdipDataserviceEx(QueryMdipDataserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMdipDataserviceResponse>(DoRequest("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 多源融合平台的数据服务查询接口
         * Summary: 多源融合平台的数据服务查询接口
         */
        public async Task<QueryMdipDataserviceResponse> QueryMdipDataserviceExAsync(QueryMdipDataserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMdipDataserviceResponse>(await DoRequestAsync("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 接受op的文件id,支持外网多源文件上传
         * Summary: 接受op的文件id,支持外网多源文件上传
         */
        public ReceiveMdipParamsFileResponse ReceiveMdipParamsFile(ReceiveMdipParamsFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReceiveMdipParamsFileEx(request, headers, runtime);
        }

        /**
         * Description: 接受op的文件id,支持外网多源文件上传
         * Summary: 接受op的文件id,支持外网多源文件上传
         */
        public async Task<ReceiveMdipParamsFileResponse> ReceiveMdipParamsFileAsync(ReceiveMdipParamsFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReceiveMdipParamsFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 接受op的文件id,支持外网多源文件上传
         * Summary: 接受op的文件id,支持外网多源文件上传
         */
        public ReceiveMdipParamsFileResponse ReceiveMdipParamsFileEx(ReceiveMdipParamsFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.mdip.params.file.receive",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ReceiveMdipParamsFileResponse receiveMdipParamsFileResponse = new ReceiveMdipParamsFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return receiveMdipParamsFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveMdipParamsFileResponse>(DoRequest("1.0", "riskplus.mdip.params.file.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 接受op的文件id,支持外网多源文件上传
         * Summary: 接受op的文件id,支持外网多源文件上传
         */
        public async Task<ReceiveMdipParamsFileResponse> ReceiveMdipParamsFileExAsync(ReceiveMdipParamsFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.mdip.params.file.receive",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ReceiveMdipParamsFileResponse receiveMdipParamsFileResponse = new ReceiveMdipParamsFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return receiveMdipParamsFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveMdipParamsFileResponse>(await DoRequestAsync("1.0", "riskplus.mdip.params.file.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 企业准入接口
         * Summary: 企业准入
         */
        public ExecRbbCompanyGuardResponse ExecRbbCompanyGuard(ExecRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRbbCompanyGuardEx(request, headers, runtime);
        }

        /**
         * Description: 企业准入接口
         * Summary: 企业准入
         */
        public async Task<ExecRbbCompanyGuardResponse> ExecRbbCompanyGuardAsync(ExecRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRbbCompanyGuardExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业准入接口
         * Summary: 企业准入
         */
        public ExecRbbCompanyGuardResponse ExecRbbCompanyGuardEx(ExecRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRbbCompanyGuardResponse>(DoRequest("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业准入接口
         * Summary: 企业准入
         */
        public async Task<ExecRbbCompanyGuardResponse> ExecRbbCompanyGuardExAsync(ExecRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRbbCompanyGuardResponse>(await DoRequestAsync("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 企业授信申请
         */
        public ApplyRbbCompanyCreditResponse ApplyRbbCompanyCredit(ApplyRbbCompanyCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyRbbCompanyCreditEx(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 企业授信申请
         */
        public async Task<ApplyRbbCompanyCreditResponse> ApplyRbbCompanyCreditAsync(ApplyRbbCompanyCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyRbbCompanyCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 企业授信申请
         */
        public ApplyRbbCompanyCreditResponse ApplyRbbCompanyCreditEx(ApplyRbbCompanyCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyRbbCompanyCreditResponse>(DoRequest("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 企业授信申请
         */
        public async Task<ApplyRbbCompanyCreditResponse> ApplyRbbCompanyCreditExAsync(ApplyRbbCompanyCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyRbbCompanyCreditResponse>(await DoRequestAsync("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业授信结果
         * Summary: 企业授信结果查询
         */
        public QueryRbbCompanyCreditResponse QueryRbbCompanyCredit(QueryRbbCompanyCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbCompanyCreditEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业授信结果
         * Summary: 企业授信结果查询
         */
        public async Task<QueryRbbCompanyCreditResponse> QueryRbbCompanyCreditAsync(QueryRbbCompanyCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbCompanyCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业授信结果
         * Summary: 企业授信结果查询
         */
        public QueryRbbCompanyCreditResponse QueryRbbCompanyCreditEx(QueryRbbCompanyCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbCompanyCreditResponse>(DoRequest("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业授信结果
         * Summary: 企业授信结果查询
         */
        public async Task<QueryRbbCompanyCreditResponse> QueryRbbCompanyCreditExAsync(QueryRbbCompanyCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbCompanyCreditResponse>(await DoRequestAsync("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
         * Summary: 风险大脑-上交所数据离线同步数据准备状态
         */
        public QueryRbbRegdatasyncPreparedResponse QueryRbbRegdatasyncPrepared(QueryRbbRegdatasyncPreparedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbRegdatasyncPreparedEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
         * Summary: 风险大脑-上交所数据离线同步数据准备状态
         */
        public async Task<QueryRbbRegdatasyncPreparedResponse> QueryRbbRegdatasyncPreparedAsync(QueryRbbRegdatasyncPreparedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbRegdatasyncPreparedExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
         * Summary: 风险大脑-上交所数据离线同步数据准备状态
         */
        public QueryRbbRegdatasyncPreparedResponse QueryRbbRegdatasyncPreparedEx(QueryRbbRegdatasyncPreparedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbRegdatasyncPreparedResponse>(DoRequest("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
         * Summary: 风险大脑-上交所数据离线同步数据准备状态
         */
        public async Task<QueryRbbRegdatasyncPreparedResponse> QueryRbbRegdatasyncPreparedExAsync(QueryRbbRegdatasyncPreparedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbRegdatasyncPreparedResponse>(await DoRequestAsync("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据开始通知标识
         * Summary: 风险大脑-上交所数据离线同步数据开始通知
         */
        public StartRbbRegdatasyncScheduleResponse StartRbbRegdatasyncSchedule(StartRbbRegdatasyncScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRbbRegdatasyncScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据开始通知标识
         * Summary: 风险大脑-上交所数据离线同步数据开始通知
         */
        public async Task<StartRbbRegdatasyncScheduleResponse> StartRbbRegdatasyncScheduleAsync(StartRbbRegdatasyncScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRbbRegdatasyncScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据开始通知标识
         * Summary: 风险大脑-上交所数据离线同步数据开始通知
         */
        public StartRbbRegdatasyncScheduleResponse StartRbbRegdatasyncScheduleEx(StartRbbRegdatasyncScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRbbRegdatasyncScheduleResponse>(DoRequest("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据开始通知标识
         * Summary: 风险大脑-上交所数据离线同步数据开始通知
         */
        public async Task<StartRbbRegdatasyncScheduleResponse> StartRbbRegdatasyncScheduleExAsync(StartRbbRegdatasyncScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRbbRegdatasyncScheduleResponse>(await DoRequestAsync("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
         * Summary: 风险大脑-上交所数据离线同步数据完成记录
         */
        public FinishRbbRegdatasyncScheduleResponse FinishRbbRegdatasyncSchedule(FinishRbbRegdatasyncScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishRbbRegdatasyncScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
         * Summary: 风险大脑-上交所数据离线同步数据完成记录
         */
        public async Task<FinishRbbRegdatasyncScheduleResponse> FinishRbbRegdatasyncScheduleAsync(FinishRbbRegdatasyncScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishRbbRegdatasyncScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
         * Summary: 风险大脑-上交所数据离线同步数据完成记录
         */
        public FinishRbbRegdatasyncScheduleResponse FinishRbbRegdatasyncScheduleEx(FinishRbbRegdatasyncScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRbbRegdatasyncScheduleResponse>(DoRequest("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
         * Summary: 风险大脑-上交所数据离线同步数据完成记录
         */
        public async Task<FinishRbbRegdatasyncScheduleResponse> FinishRbbRegdatasyncScheduleExAsync(FinishRbbRegdatasyncScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRbbRegdatasyncScheduleResponse>(await DoRequestAsync("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交准入规则的执行请求
         * Summary: 企业准入申请
         */
        public ApplyRbbCompanyGuardResponse ApplyRbbCompanyGuard(ApplyRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyRbbCompanyGuardEx(request, headers, runtime);
        }

        /**
         * Description: 提交准入规则的执行请求
         * Summary: 企业准入申请
         */
        public async Task<ApplyRbbCompanyGuardResponse> ApplyRbbCompanyGuardAsync(ApplyRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyRbbCompanyGuardExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交准入规则的执行请求
         * Summary: 企业准入申请
         */
        public ApplyRbbCompanyGuardResponse ApplyRbbCompanyGuardEx(ApplyRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyRbbCompanyGuardResponse>(DoRequest("1.0", "riskplus.rbb.company.guard.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交准入规则的执行请求
         * Summary: 企业准入申请
         */
        public async Task<ApplyRbbCompanyGuardResponse> ApplyRbbCompanyGuardExAsync(ApplyRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyRbbCompanyGuardResponse>(await DoRequestAsync("1.0", "riskplus.rbb.company.guard.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业准入结果查询
         * Summary: 企业准入结果查询
         */
        public QueryRbbCompanyGuardResponse QueryRbbCompanyGuard(QueryRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbCompanyGuardEx(request, headers, runtime);
        }

        /**
         * Description: 企业准入结果查询
         * Summary: 企业准入结果查询
         */
        public async Task<QueryRbbCompanyGuardResponse> QueryRbbCompanyGuardAsync(QueryRbbCompanyGuardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbCompanyGuardExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业准入结果查询
         * Summary: 企业准入结果查询
         */
        public QueryRbbCompanyGuardResponse QueryRbbCompanyGuardEx(QueryRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbCompanyGuardResponse>(DoRequest("1.0", "riskplus.rbb.company.guard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业准入结果查询
         * Summary: 企业准入结果查询
         */
        public async Task<QueryRbbCompanyGuardResponse> QueryRbbCompanyGuardExAsync(QueryRbbCompanyGuardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbCompanyGuardResponse>(await DoRequestAsync("1.0", "riskplus.rbb.company.guard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风控给上交所鹰眼使用的zsearch查询
         * Summary: 企业风控给鹰眼使用的zsearch查询
         */
        public QueryRbbObtsZsearchResponse QueryRbbObtsZsearch(QueryRbbObtsZsearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRbbObtsZsearchEx(request, headers, runtime);
        }

        /**
         * Description: 企业风控给上交所鹰眼使用的zsearch查询
         * Summary: 企业风控给鹰眼使用的zsearch查询
         */
        public async Task<QueryRbbObtsZsearchResponse> QueryRbbObtsZsearchAsync(QueryRbbObtsZsearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRbbObtsZsearchExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业风控给上交所鹰眼使用的zsearch查询
         * Summary: 企业风控给鹰眼使用的zsearch查询
         */
        public QueryRbbObtsZsearchResponse QueryRbbObtsZsearchEx(QueryRbbObtsZsearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbObtsZsearchResponse>(DoRequest("1.0", "riskplus.rbb.obts.zsearch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风控给上交所鹰眼使用的zsearch查询
         * Summary: 企业风控给鹰眼使用的zsearch查询
         */
        public async Task<QueryRbbObtsZsearchResponse> QueryRbbObtsZsearchExAsync(QueryRbbObtsZsearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRbbObtsZsearchResponse>(await DoRequestAsync("1.0", "riskplus.rbb.obts.zsearch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风控客户推送的企业信息
         * Summary: 企业风控客户推送的企业信息
         */
        public PushRbbCustomerCompanyinfoResponse PushRbbCustomerCompanyinfo(PushRbbCustomerCompanyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRbbCustomerCompanyinfoEx(request, headers, runtime);
        }

        /**
         * Description: 企业风控客户推送的企业信息
         * Summary: 企业风控客户推送的企业信息
         */
        public async Task<PushRbbCustomerCompanyinfoResponse> PushRbbCustomerCompanyinfoAsync(PushRbbCustomerCompanyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRbbCustomerCompanyinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业风控客户推送的企业信息
         * Summary: 企业风控客户推送的企业信息
         */
        public PushRbbCustomerCompanyinfoResponse PushRbbCustomerCompanyinfoEx(PushRbbCustomerCompanyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRbbCustomerCompanyinfoResponse>(DoRequest("1.0", "riskplus.rbb.customer.companyinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业风控客户推送的企业信息
         * Summary: 企业风控客户推送的企业信息
         */
        public async Task<PushRbbCustomerCompanyinfoResponse> PushRbbCustomerCompanyinfoExAsync(PushRbbCustomerCompanyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRbbCustomerCompanyinfoResponse>(await DoRequestAsync("1.0", "riskplus.rbb.customer.companyinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取签约接口
         * Summary: 获取签约接口
         */
        public QueryRpgwSignUrlResponse QueryRpgwSignUrl(QueryRpgwSignUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRpgwSignUrlEx(request, headers, runtime);
        }

        /**
         * Description: 获取签约接口
         * Summary: 获取签约接口
         */
        public async Task<QueryRpgwSignUrlResponse> QueryRpgwSignUrlAsync(QueryRpgwSignUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRpgwSignUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取签约接口
         * Summary: 获取签约接口
         */
        public QueryRpgwSignUrlResponse QueryRpgwSignUrlEx(QueryRpgwSignUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpgwSignUrlResponse>(DoRequest("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取签约接口
         * Summary: 获取签约接口
         */
        public async Task<QueryRpgwSignUrlResponse> QueryRpgwSignUrlExAsync(QueryRpgwSignUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpgwSignUrlResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建报税用户接口
         * Summary: 创建报税用户接口
         */
        public RegisterRpgwUserEinvoiceResponse RegisterRpgwUserEinvoice(RegisterRpgwUserEinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterRpgwUserEinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 创建报税用户接口
         * Summary: 创建报税用户接口
         */
        public async Task<RegisterRpgwUserEinvoiceResponse> RegisterRpgwUserEinvoiceAsync(RegisterRpgwUserEinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterRpgwUserEinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建报税用户接口
         * Summary: 创建报税用户接口
         */
        public RegisterRpgwUserEinvoiceResponse RegisterRpgwUserEinvoiceEx(RegisterRpgwUserEinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterRpgwUserEinvoiceResponse>(DoRequest("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建报税用户接口
         * Summary: 创建报税用户接口
         */
        public async Task<RegisterRpgwUserEinvoiceResponse> RegisterRpgwUserEinvoiceExAsync(RegisterRpgwUserEinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterRpgwUserEinvoiceResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签约接口
         * Summary: 获取签约接口
         */
        public QueryRpgwUserSignurlResponse QueryRpgwUserSignurl(QueryRpgwUserSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRpgwUserSignurlEx(request, headers, runtime);
        }

        /**
         * Description: 查询签约接口
         * Summary: 获取签约接口
         */
        public async Task<QueryRpgwUserSignurlResponse> QueryRpgwUserSignurlAsync(QueryRpgwUserSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRpgwUserSignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签约接口
         * Summary: 获取签约接口
         */
        public QueryRpgwUserSignurlResponse QueryRpgwUserSignurlEx(QueryRpgwUserSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpgwUserSignurlResponse>(DoRequest("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签约接口
         * Summary: 获取签约接口
         */
        public async Task<QueryRpgwUserSignurlResponse> QueryRpgwUserSignurlExAsync(QueryRpgwUserSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRpgwUserSignurlResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提现
         * Summary: 提现
         */
        public WithdrawRpgwUserCommissionResponse WithdrawRpgwUserCommission(WithdrawRpgwUserCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return WithdrawRpgwUserCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 提现
         * Summary: 提现
         */
        public async Task<WithdrawRpgwUserCommissionResponse> WithdrawRpgwUserCommissionAsync(WithdrawRpgwUserCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await WithdrawRpgwUserCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 提现
         * Summary: 提现
         */
        public WithdrawRpgwUserCommissionResponse WithdrawRpgwUserCommissionEx(WithdrawRpgwUserCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawRpgwUserCommissionResponse>(DoRequest("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提现
         * Summary: 提现
         */
        public async Task<WithdrawRpgwUserCommissionResponse> WithdrawRpgwUserCommissionExAsync(WithdrawRpgwUserCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawRpgwUserCommissionResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信息同步
         * Summary: 下单等信息同步
         */
        public SyncRpgwUserOrderinfoResponse SyncRpgwUserOrderinfo(SyncRpgwUserOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncRpgwUserOrderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 信息同步
         * Summary: 下单等信息同步
         */
        public async Task<SyncRpgwUserOrderinfoResponse> SyncRpgwUserOrderinfoAsync(SyncRpgwUserOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncRpgwUserOrderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 信息同步
         * Summary: 下单等信息同步
         */
        public SyncRpgwUserOrderinfoResponse SyncRpgwUserOrderinfoEx(SyncRpgwUserOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRpgwUserOrderinfoResponse>(DoRequest("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信息同步
         * Summary: 下单等信息同步
         */
        public async Task<SyncRpgwUserOrderinfoResponse> SyncRpgwUserOrderinfoExAsync(SyncRpgwUserOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRpgwUserOrderinfoResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约结果通知
         * Summary: 签约结果通知
         */
        public NotifyRpgwUserSignresultResponse NotifyRpgwUserSignresult(NotifyRpgwUserSignresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyRpgwUserSignresultEx(request, headers, runtime);
        }

        /**
         * Description: 签约结果通知
         * Summary: 签约结果通知
         */
        public async Task<NotifyRpgwUserSignresultResponse> NotifyRpgwUserSignresultAsync(NotifyRpgwUserSignresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyRpgwUserSignresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 签约结果通知
         * Summary: 签约结果通知
         */
        public NotifyRpgwUserSignresultResponse NotifyRpgwUserSignresultEx(NotifyRpgwUserSignresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyRpgwUserSignresultResponse>(DoRequest("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约结果通知
         * Summary: 签约结果通知
         */
        public async Task<NotifyRpgwUserSignresultResponse> NotifyRpgwUserSignresultExAsync(NotifyRpgwUserSignresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyRpgwUserSignresultResponse>(await DoRequestAsync("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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

        /**
         * Description: 风控快照查询
         * Summary: 风控事件快照查询
         */
        public QuerySnapshotEventResponse QuerySnapshotEvent(QuerySnapshotEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySnapshotEventEx(request, headers, runtime);
        }

        /**
         * Description: 风控快照查询
         * Summary: 风控事件快照查询
         */
        public async Task<QuerySnapshotEventResponse> QuerySnapshotEventAsync(QuerySnapshotEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySnapshotEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 风控快照查询
         * Summary: 风控事件快照查询
         */
        public QuerySnapshotEventResponse QuerySnapshotEventEx(QuerySnapshotEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySnapshotEventResponse>(DoRequest("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风控快照查询
         * Summary: 风控事件快照查询
         */
        public async Task<QuerySnapshotEventResponse> QuerySnapshotEventExAsync(QuerySnapshotEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySnapshotEventResponse>(await DoRequestAsync("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾批量参数文件上传接口
         * Summary: 营销盾参数文件上传
         */
        public UploadUmktParamsFileResponse UploadUmktParamsFile(UploadUmktParamsFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadUmktParamsFileEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾批量参数文件上传接口
         * Summary: 营销盾参数文件上传
         */
        public async Task<UploadUmktParamsFileResponse> UploadUmktParamsFileAsync(UploadUmktParamsFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadUmktParamsFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾批量参数文件上传接口
         * Summary: 营销盾参数文件上传
         */
        public UploadUmktParamsFileResponse UploadUmktParamsFileEx(UploadUmktParamsFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.umkt.params.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadUmktParamsFileResponse uploadUmktParamsFileResponse = new UploadUmktParamsFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadUmktParamsFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadUmktParamsFileResponse>(DoRequest("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾批量参数文件上传接口
         * Summary: 营销盾参数文件上传
         */
        public async Task<UploadUmktParamsFileResponse> UploadUmktParamsFileExAsync(UploadUmktParamsFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "riskplus.umkt.params.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadUmktParamsFileResponse uploadUmktParamsFileResponse = new UploadUmktParamsFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadUmktParamsFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadUmktParamsFileResponse>(await DoRequestAsync("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾实时营销服务，支持批量
         * Summary: 营销盾实时营销服务
         */
        public BatchqueryUmktRtMarketingResponse BatchqueryUmktRtMarketing(BatchqueryUmktRtMarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryUmktRtMarketingEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾实时营销服务，支持批量
         * Summary: 营销盾实时营销服务
         */
        public async Task<BatchqueryUmktRtMarketingResponse> BatchqueryUmktRtMarketingAsync(BatchqueryUmktRtMarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryUmktRtMarketingExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾实时营销服务，支持批量
         * Summary: 营销盾实时营销服务
         */
        public BatchqueryUmktRtMarketingResponse BatchqueryUmktRtMarketingEx(BatchqueryUmktRtMarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryUmktRtMarketingResponse>(DoRequest("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾实时营销服务，支持批量
         * Summary: 营销盾实时营销服务
         */
        public async Task<BatchqueryUmktRtMarketingResponse> BatchqueryUmktRtMarketingExAsync(BatchqueryUmktRtMarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryUmktRtMarketingResponse>(await DoRequestAsync("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 梦网富信投放事件通知
         * Summary: 梦网富信投放事件通知
         */
        public SyncUmktRtEventresultResponse SyncUmktRtEventresult(SyncUmktRtEventresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncUmktRtEventresultEx(request, headers, runtime);
        }

        /**
         * Description: 梦网富信投放事件通知
         * Summary: 梦网富信投放事件通知
         */
        public async Task<SyncUmktRtEventresultResponse> SyncUmktRtEventresultAsync(SyncUmktRtEventresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncUmktRtEventresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 梦网富信投放事件通知
         * Summary: 梦网富信投放事件通知
         */
        public SyncUmktRtEventresultResponse SyncUmktRtEventresultEx(SyncUmktRtEventresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncUmktRtEventresultResponse>(DoRequest("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 梦网富信投放事件通知
         * Summary: 梦网富信投放事件通知
         */
        public async Task<SyncUmktRtEventresultResponse> SyncUmktRtEventresultExAsync(SyncUmktRtEventresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncUmktRtEventresultResponse>(await DoRequestAsync("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾场景租户信息上传or更新
         * Summary: 营销盾场景租户信息上传or更新
         */
        public ImportUmktSceneUploadResponse ImportUmktSceneUpload(ImportUmktSceneUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportUmktSceneUploadEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾场景租户信息上传or更新
         * Summary: 营销盾场景租户信息上传or更新
         */
        public async Task<ImportUmktSceneUploadResponse> ImportUmktSceneUploadAsync(ImportUmktSceneUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportUmktSceneUploadExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾场景租户信息上传or更新
         * Summary: 营销盾场景租户信息上传or更新
         */
        public ImportUmktSceneUploadResponse ImportUmktSceneUploadEx(ImportUmktSceneUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportUmktSceneUploadResponse>(DoRequest("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾场景租户信息上传or更新
         * Summary: 营销盾场景租户信息上传or更新
         */
        public async Task<ImportUmktSceneUploadResponse> ImportUmktSceneUploadExAsync(ImportUmktSceneUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportUmktSceneUploadResponse>(await DoRequestAsync("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 富信贴尾实时圈客
         * Summary: 富信贴尾实时圈客
         */
        public BatchqueryUmktRtTailmarketingResponse BatchqueryUmktRtTailmarketing(BatchqueryUmktRtTailmarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryUmktRtTailmarketingEx(request, headers, runtime);
        }

        /**
         * Description: 富信贴尾实时圈客
         * Summary: 富信贴尾实时圈客
         */
        public async Task<BatchqueryUmktRtTailmarketingResponse> BatchqueryUmktRtTailmarketingAsync(BatchqueryUmktRtTailmarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryUmktRtTailmarketingExAsync(request, headers, runtime);
        }

        /**
         * Description: 富信贴尾实时圈客
         * Summary: 富信贴尾实时圈客
         */
        public BatchqueryUmktRtTailmarketingResponse BatchqueryUmktRtTailmarketingEx(BatchqueryUmktRtTailmarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryUmktRtTailmarketingResponse>(DoRequest("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 富信贴尾实时圈客
         * Summary: 富信贴尾实时圈客
         */
        public async Task<BatchqueryUmktRtTailmarketingResponse> BatchqueryUmktRtTailmarketingExAsync(BatchqueryUmktRtTailmarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryUmktRtTailmarketingResponse>(await DoRequestAsync("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时圈客场景策略测试
         * Summary: 实时圈客场景策略测试功能
         */
        public QueryUmktScenestrategyTestResponse QueryUmktScenestrategyTest(QueryUmktScenestrategyTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUmktScenestrategyTestEx(request, headers, runtime);
        }

        /**
         * Description: 实时圈客场景策略测试
         * Summary: 实时圈客场景策略测试功能
         */
        public async Task<QueryUmktScenestrategyTestResponse> QueryUmktScenestrategyTestAsync(QueryUmktScenestrategyTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUmktScenestrategyTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 实时圈客场景策略测试
         * Summary: 实时圈客场景策略测试功能
         */
        public QueryUmktScenestrategyTestResponse QueryUmktScenestrategyTestEx(QueryUmktScenestrategyTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktScenestrategyTestResponse>(DoRequest("1.0", "riskplus.umkt.scenestrategy.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时圈客场景策略测试
         * Summary: 实时圈客场景策略测试功能
         */
        public async Task<QueryUmktScenestrategyTestResponse> QueryUmktScenestrategyTestExAsync(QueryUmktScenestrategyTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktScenestrategyTestResponse>(await DoRequestAsync("1.0", "riskplus.umkt.scenestrategy.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起AI外呼
         * Summary: 发起AI外呼
         */
        public ApplyUmktRobotcallResponse ApplyUmktRobotcall(ApplyUmktRobotcallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyUmktRobotcallEx(request, headers, runtime);
        }

        /**
         * Description: 发起AI外呼
         * Summary: 发起AI外呼
         */
        public async Task<ApplyUmktRobotcallResponse> ApplyUmktRobotcallAsync(ApplyUmktRobotcallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyUmktRobotcallExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起AI外呼
         * Summary: 发起AI外呼
         */
        public ApplyUmktRobotcallResponse ApplyUmktRobotcallEx(ApplyUmktRobotcallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUmktRobotcallResponse>(DoRequest("1.0", "riskplus.umkt.robotcall.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起AI外呼
         * Summary: 发起AI外呼
         */
        public async Task<ApplyUmktRobotcallResponse> ApplyUmktRobotcallExAsync(ApplyUmktRobotcallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUmktRobotcallResponse>(await DoRequestAsync("1.0", "riskplus.umkt.robotcall.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾查询回执统计数据接口
         * Summary: 营销盾回执统计查询
         */
        public QueryUmktDataaccessStatisticResponse QueryUmktDataaccessStatistic(QueryUmktDataaccessStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUmktDataaccessStatisticEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾查询回执统计数据接口
         * Summary: 营销盾回执统计查询
         */
        public async Task<QueryUmktDataaccessStatisticResponse> QueryUmktDataaccessStatisticAsync(QueryUmktDataaccessStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUmktDataaccessStatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾查询回执统计数据接口
         * Summary: 营销盾回执统计查询
         */
        public QueryUmktDataaccessStatisticResponse QueryUmktDataaccessStatisticEx(QueryUmktDataaccessStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktDataaccessStatisticResponse>(DoRequest("1.0", "riskplus.umkt.dataaccess.statistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾查询回执统计数据接口
         * Summary: 营销盾回执统计查询
         */
        public async Task<QueryUmktDataaccessStatisticResponse> QueryUmktDataaccessStatisticExAsync(QueryUmktDataaccessStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktDataaccessStatisticResponse>(await DoRequestAsync("1.0", "riskplus.umkt.dataaccess.statistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾离线批量任务取消接口
         * Summary: 营销盾取消离线批量任务
         */
        public CancelUmktDataaccessOfflinetaskResponse CancelUmktDataaccessOfflinetask(CancelUmktDataaccessOfflinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelUmktDataaccessOfflinetaskEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾离线批量任务取消接口
         * Summary: 营销盾取消离线批量任务
         */
        public async Task<CancelUmktDataaccessOfflinetaskResponse> CancelUmktDataaccessOfflinetaskAsync(CancelUmktDataaccessOfflinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelUmktDataaccessOfflinetaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾离线批量任务取消接口
         * Summary: 营销盾取消离线批量任务
         */
        public CancelUmktDataaccessOfflinetaskResponse CancelUmktDataaccessOfflinetaskEx(CancelUmktDataaccessOfflinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelUmktDataaccessOfflinetaskResponse>(DoRequest("1.0", "riskplus.umkt.dataaccess.offlinetask.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾离线批量任务取消接口
         * Summary: 营销盾取消离线批量任务
         */
        public async Task<CancelUmktDataaccessOfflinetaskResponse> CancelUmktDataaccessOfflinetaskExAsync(CancelUmktDataaccessOfflinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelUmktDataaccessOfflinetaskResponse>(await DoRequestAsync("1.0", "riskplus.umkt.dataaccess.offlinetask.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
         * Summary: 营销盾实时单一凭证营销接口
         */
        public QueryUmktRtMarketingResponse QueryUmktRtMarketing(QueryUmktRtMarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUmktRtMarketingEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
         * Summary: 营销盾实时单一凭证营销接口
         */
        public async Task<QueryUmktRtMarketingResponse> QueryUmktRtMarketingAsync(QueryUmktRtMarketingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUmktRtMarketingExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
         * Summary: 营销盾实时单一凭证营销接口
         */
        public QueryUmktRtMarketingResponse QueryUmktRtMarketingEx(QueryUmktRtMarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktRtMarketingResponse>(DoRequest("1.0", "riskplus.umkt.rt.marketing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
         * Summary: 营销盾实时单一凭证营销接口
         */
        public async Task<QueryUmktRtMarketingResponse> QueryUmktRtMarketingExAsync(QueryUmktRtMarketingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktRtMarketingResponse>(await DoRequestAsync("1.0", "riskplus.umkt.rt.marketing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾业务回流事件推送
         * Summary: 营销盾回流事件推送
         */
        public PushUmktBackflowEventResponse PushUmktBackflowEvent(PushUmktBackflowEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushUmktBackflowEventEx(request, headers, runtime);
        }

        /**
         * Description: 营销盾业务回流事件推送
         * Summary: 营销盾回流事件推送
         */
        public async Task<PushUmktBackflowEventResponse> PushUmktBackflowEventAsync(PushUmktBackflowEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushUmktBackflowEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销盾业务回流事件推送
         * Summary: 营销盾回流事件推送
         */
        public PushUmktBackflowEventResponse PushUmktBackflowEventEx(PushUmktBackflowEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushUmktBackflowEventResponse>(DoRequest("1.0", "riskplus.umkt.backflow.event.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销盾业务回流事件推送
         * Summary: 营销盾回流事件推送
         */
        public async Task<PushUmktBackflowEventResponse> PushUmktBackflowEventExAsync(PushUmktBackflowEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushUmktBackflowEventResponse>(await DoRequestAsync("1.0", "riskplus.umkt.backflow.event.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡片短信批量发送接口
         * Summary: 卡片短信批量发送接口
         */
        public SendUmktCardsmsBatchResponse SendUmktCardsmsBatch(SendUmktCardsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendUmktCardsmsBatchEx(request, headers, runtime);
        }

        /**
         * Description: 卡片短信批量发送接口
         * Summary: 卡片短信批量发送接口
         */
        public async Task<SendUmktCardsmsBatchResponse> SendUmktCardsmsBatchAsync(SendUmktCardsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendUmktCardsmsBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 卡片短信批量发送接口
         * Summary: 卡片短信批量发送接口
         */
        public SendUmktCardsmsBatchResponse SendUmktCardsmsBatchEx(SendUmktCardsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktCardsmsBatchResponse>(DoRequest("1.0", "riskplus.umkt.cardsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡片短信批量发送接口
         * Summary: 卡片短信批量发送接口
         */
        public async Task<SendUmktCardsmsBatchResponse> SendUmktCardsmsBatchExAsync(SendUmktCardsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktCardsmsBatchResponse>(await DoRequestAsync("1.0", "riskplus.umkt.cardsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡片短信支持能力查询
         * Summary: 卡片短信支持能力查询
         */
        public QueryUmktCardsmsSupportResponse QueryUmktCardsmsSupport(QueryUmktCardsmsSupportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUmktCardsmsSupportEx(request, headers, runtime);
        }

        /**
         * Description: 卡片短信支持能力查询
         * Summary: 卡片短信支持能力查询
         */
        public async Task<QueryUmktCardsmsSupportResponse> QueryUmktCardsmsSupportAsync(QueryUmktCardsmsSupportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUmktCardsmsSupportExAsync(request, headers, runtime);
        }

        /**
         * Description: 卡片短信支持能力查询
         * Summary: 卡片短信支持能力查询
         */
        public QueryUmktCardsmsSupportResponse QueryUmktCardsmsSupportEx(QueryUmktCardsmsSupportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktCardsmsSupportResponse>(DoRequest("1.0", "riskplus.umkt.cardsms.support.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡片短信支持能力查询
         * Summary: 卡片短信支持能力查询
         */
        public async Task<QueryUmktCardsmsSupportResponse> QueryUmktCardsmsSupportExAsync(QueryUmktCardsmsSupportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUmktCardsmsSupportResponse>(await DoRequestAsync("1.0", "riskplus.umkt.cardsms.support.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本短信批量发送接口
         * Summary: 文本短信批量发送接口
         */
        public SendUmktTextsmsBatchResponse SendUmktTextsmsBatch(SendUmktTextsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendUmktTextsmsBatchEx(request, headers, runtime);
        }

        /**
         * Description: 文本短信批量发送接口
         * Summary: 文本短信批量发送接口
         */
        public async Task<SendUmktTextsmsBatchResponse> SendUmktTextsmsBatchAsync(SendUmktTextsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendUmktTextsmsBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本短信批量发送接口
         * Summary: 文本短信批量发送接口
         */
        public SendUmktTextsmsBatchResponse SendUmktTextsmsBatchEx(SendUmktTextsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktTextsmsBatchResponse>(DoRequest("1.0", "riskplus.umkt.textsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本短信批量发送接口
         * Summary: 文本短信批量发送接口
         */
        public async Task<SendUmktTextsmsBatchResponse> SendUmktTextsmsBatchExAsync(SendUmktTextsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktTextsmsBatchResponse>(await DoRequestAsync("1.0", "riskplus.umkt.textsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字短信批量发送接口（单模板）
         * Summary: 数字短信批量发送接口（单模板）
         */
        public SendUmktDigitalsmsBatchResponse SendUmktDigitalsmsBatch(SendUmktDigitalsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendUmktDigitalsmsBatchEx(request, headers, runtime);
        }

        /**
         * Description: 数字短信批量发送接口（单模板）
         * Summary: 数字短信批量发送接口（单模板）
         */
        public async Task<SendUmktDigitalsmsBatchResponse> SendUmktDigitalsmsBatchAsync(SendUmktDigitalsmsBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendUmktDigitalsmsBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字短信批量发送接口（单模板）
         * Summary: 数字短信批量发送接口（单模板）
         */
        public SendUmktDigitalsmsBatchResponse SendUmktDigitalsmsBatchEx(SendUmktDigitalsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktDigitalsmsBatchResponse>(DoRequest("1.0", "riskplus.umkt.digitalsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字短信批量发送接口（单模板）
         * Summary: 数字短信批量发送接口（单模板）
         */
        public async Task<SendUmktDigitalsmsBatchResponse> SendUmktDigitalsmsBatchExAsync(SendUmktDigitalsmsBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUmktDigitalsmsBatchResponse>(await DoRequestAsync("1.0", "riskplus.umkt.digitalsms.batch.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
