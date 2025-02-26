// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_9705ae7650f74f47b1e8158151cc122f"},
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_9705ae7650f74f47b1e8158151cc122f"},
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
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public CreateBlockchainBccrDciRegistrationResponse CreateBlockchainBccrDciRegistration(CreateBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBccrDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public async Task<CreateBlockchainBccrDciRegistrationResponse> CreateBlockchainBccrDciRegistrationAsync(CreateBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBccrDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public CreateBlockchainBccrDciRegistrationResponse CreateBlockchainBccrDciRegistrationEx(CreateBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public async Task<CreateBlockchainBccrDciRegistrationResponse> CreateBlockchainBccrDciRegistrationExAsync(CreateBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryBlockchainBccrDciRegistrationsubmitResponse QueryBlockchainBccrDciRegistrationsubmit(QueryBlockchainBccrDciRegistrationsubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBccrDciRegistrationsubmitEx(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryBlockchainBccrDciRegistrationsubmitResponse> QueryBlockchainBccrDciRegistrationsubmitAsync(QueryBlockchainBccrDciRegistrationsubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBccrDciRegistrationsubmitExAsync(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryBlockchainBccrDciRegistrationsubmitResponse QueryBlockchainBccrDciRegistrationsubmitEx(QueryBlockchainBccrDciRegistrationsubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationsubmitResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryBlockchainBccrDciRegistrationsubmitResponse> QueryBlockchainBccrDciRegistrationsubmitExAsync(QueryBlockchainBccrDciRegistrationsubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationsubmitResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public QueryBlockchainBccrDciRegistrationResponse QueryBlockchainBccrDciRegistration(QueryBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBccrDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public async Task<QueryBlockchainBccrDciRegistrationResponse> QueryBlockchainBccrDciRegistrationAsync(QueryBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBccrDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public QueryBlockchainBccrDciRegistrationResponse QueryBlockchainBccrDciRegistrationEx(QueryBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public async Task<QueryBlockchainBccrDciRegistrationResponse> QueryBlockchainBccrDciRegistrationExAsync(QueryBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public GetBlockchainBccrDciRegistrationcertResponse GetBlockchainBccrDciRegistrationcert(GetBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public async Task<GetBlockchainBccrDciRegistrationcertResponse> GetBlockchainBccrDciRegistrationcertAsync(GetBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBlockchainBccrDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public GetBlockchainBccrDciRegistrationcertResponse GetBlockchainBccrDciRegistrationcertEx(GetBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBlockchainBccrDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public async Task<GetBlockchainBccrDciRegistrationcertResponse> GetBlockchainBccrDciRegistrationcertExAsync(GetBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBlockchainBccrDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public CreateBlockchainBccrDciRegistrationcertResponse CreateBlockchainBccrDciRegistrationcert(CreateBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public async Task<CreateBlockchainBccrDciRegistrationcertResponse> CreateBlockchainBccrDciRegistrationcertAsync(CreateBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBccrDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public CreateBlockchainBccrDciRegistrationcertResponse CreateBlockchainBccrDciRegistrationcertEx(CreateBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public async Task<CreateBlockchainBccrDciRegistrationcertResponse> CreateBlockchainBccrDciRegistrationcertExAsync(CreateBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryBlockchainBccrDciRegistrationcertResponse QueryBlockchainBccrDciRegistrationcert(QueryBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryBlockchainBccrDciRegistrationcertResponse> QueryBlockchainBccrDciRegistrationcertAsync(QueryBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBccrDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryBlockchainBccrDciRegistrationcertResponse QueryBlockchainBccrDciRegistrationcertEx(QueryBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryBlockchainBccrDciRegistrationcertResponse> QueryBlockchainBccrDciRegistrationcertExAsync(QueryBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public GetBlockchainBccrDciPayurlResponse GetBlockchainBccrDciPayurl(GetBlockchainBccrDciPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBlockchainBccrDciPayurlEx(request, headers, runtime);
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public async Task<GetBlockchainBccrDciPayurlResponse> GetBlockchainBccrDciPayurlAsync(GetBlockchainBccrDciPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBlockchainBccrDciPayurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public GetBlockchainBccrDciPayurlResponse GetBlockchainBccrDciPayurlEx(GetBlockchainBccrDciPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBlockchainBccrDciPayurlResponse>(DoRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public async Task<GetBlockchainBccrDciPayurlResponse> GetBlockchainBccrDciPayurlExAsync(GetBlockchainBccrDciPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBlockchainBccrDciPayurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public QueryBlockchainBccrDciPayResponse QueryBlockchainBccrDciPay(QueryBlockchainBccrDciPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBccrDciPayEx(request, headers, runtime);
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public async Task<QueryBlockchainBccrDciPayResponse> QueryBlockchainBccrDciPayAsync(QueryBlockchainBccrDciPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBccrDciPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public QueryBlockchainBccrDciPayResponse QueryBlockchainBccrDciPayEx(QueryBlockchainBccrDciPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciPayResponse>(DoRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public async Task<QueryBlockchainBccrDciPayResponse> QueryBlockchainBccrDciPayExAsync(QueryBlockchainBccrDciPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrDciPayResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public CallbackBlockchainBccrDciPayresultResponse CallbackBlockchainBccrDciPayresult(CallbackBlockchainBccrDciPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackBlockchainBccrDciPayresultEx(request, headers, runtime);
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public async Task<CallbackBlockchainBccrDciPayresultResponse> CallbackBlockchainBccrDciPayresultAsync(CallbackBlockchainBccrDciPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackBlockchainBccrDciPayresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public CallbackBlockchainBccrDciPayresultResponse CallbackBlockchainBccrDciPayresultEx(CallbackBlockchainBccrDciPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackBlockchainBccrDciPayresultResponse>(DoRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public async Task<CallbackBlockchainBccrDciPayresultResponse> CallbackBlockchainBccrDciPayresultExAsync(CallbackBlockchainBccrDciPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackBlockchainBccrDciPayresultResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public RefuseBlockchainBccrDciRegistrationResponse RefuseBlockchainBccrDciRegistration(RefuseBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseBlockchainBccrDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public async Task<RefuseBlockchainBccrDciRegistrationResponse> RefuseBlockchainBccrDciRegistrationAsync(RefuseBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseBlockchainBccrDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public RefuseBlockchainBccrDciRegistrationResponse RefuseBlockchainBccrDciRegistrationEx(RefuseBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseBlockchainBccrDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public async Task<RefuseBlockchainBccrDciRegistrationResponse> RefuseBlockchainBccrDciRegistrationExAsync(RefuseBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseBlockchainBccrDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public RetryBlockchainBccrDciRegistrationResponse RetryBlockchainBccrDciRegistration(RetryBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryBlockchainBccrDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public async Task<RetryBlockchainBccrDciRegistrationResponse> RetryBlockchainBccrDciRegistrationAsync(RetryBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryBlockchainBccrDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public RetryBlockchainBccrDciRegistrationResponse RetryBlockchainBccrDciRegistrationEx(RetryBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBlockchainBccrDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public async Task<RetryBlockchainBccrDciRegistrationResponse> RetryBlockchainBccrDciRegistrationExAsync(RetryBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBlockchainBccrDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public CloseBlockchainBccrDciRegistrationResponse CloseBlockchainBccrDciRegistration(CloseBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseBlockchainBccrDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public async Task<CloseBlockchainBccrDciRegistrationResponse> CloseBlockchainBccrDciRegistrationAsync(CloseBlockchainBccrDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseBlockchainBccrDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public CloseBlockchainBccrDciRegistrationResponse CloseBlockchainBccrDciRegistrationEx(CloseBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseBlockchainBccrDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public async Task<CloseBlockchainBccrDciRegistrationResponse> CloseBlockchainBccrDciRegistrationExAsync(CloseBlockchainBccrDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseBlockchainBccrDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public CreateBlockchainBccrOrderResponse CreateBlockchainBccrOrder(CreateBlockchainBccrOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBccrOrderEx(request, headers, runtime);
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public async Task<CreateBlockchainBccrOrderResponse> CreateBlockchainBccrOrderAsync(CreateBlockchainBccrOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBccrOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public CreateBlockchainBccrOrderResponse CreateBlockchainBccrOrderEx(CreateBlockchainBccrOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrOrderResponse>(DoRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public async Task<CreateBlockchainBccrOrderResponse> CreateBlockchainBccrOrderExAsync(CreateBlockchainBccrOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBccrOrderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public QueryBlockchainBccrOrderPayurlResponse QueryBlockchainBccrOrderPayurl(QueryBlockchainBccrOrderPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBccrOrderPayurlEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public async Task<QueryBlockchainBccrOrderPayurlResponse> QueryBlockchainBccrOrderPayurlAsync(QueryBlockchainBccrOrderPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBccrOrderPayurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public QueryBlockchainBccrOrderPayurlResponse QueryBlockchainBccrOrderPayurlEx(QueryBlockchainBccrOrderPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrOrderPayurlResponse>(DoRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public async Task<QueryBlockchainBccrOrderPayurlResponse> QueryBlockchainBccrOrderPayurlExAsync(QueryBlockchainBccrOrderPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBccrOrderPayurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public FinishBlockchainBccrDciRegistrationcertResponse FinishBlockchainBccrDciRegistrationcert(FinishBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public async Task<FinishBlockchainBccrDciRegistrationcertResponse> FinishBlockchainBccrDciRegistrationcertAsync(FinishBlockchainBccrDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishBlockchainBccrDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public FinishBlockchainBccrDciRegistrationcertResponse FinishBlockchainBccrDciRegistrationcertEx(FinishBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBlockchainBccrDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public async Task<FinishBlockchainBccrDciRegistrationcertResponse> FinishBlockchainBccrDciRegistrationcertExAsync(FinishBlockchainBccrDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBlockchainBccrDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
