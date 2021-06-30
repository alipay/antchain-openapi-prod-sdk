// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BAASDT.Models;

namespace AntChain.SDK.BAASDT
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
                        {"sdk_version", "1.2.53"},
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
                        {"sdk_version", "1.2.53"},
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
         * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-创建卡密
         */
        public ExecCardCreateResponse ExecCardCreate(ExecCardCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardCreateEx(request, headers, runtime);
        }

        /**
         * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-创建卡密
         */
        public async Task<ExecCardCreateResponse> ExecCardCreateAsync(ExecCardCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardCreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-创建卡密
         */
        public ExecCardCreateResponse ExecCardCreateEx(ExecCardCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardCreateResponse>(DoRequest("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-创建卡密
         */
        public async Task<ExecCardCreateResponse> ExecCardCreateExAsync(ExecCardCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardCreateResponse>(await DoRequestAsync("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-查询卡密
         */
        public ExecCardQueryResponse ExecCardQuery(ExecCardQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardQueryEx(request, headers, runtime);
        }

        /**
         * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-查询卡密
         */
        public async Task<ExecCardQueryResponse> ExecCardQueryAsync(ExecCardQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-查询卡密
         */
        public ExecCardQueryResponse ExecCardQueryEx(ExecCardQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardQueryResponse>(DoRequest("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-查询卡密
         */
        public async Task<ExecCardQueryResponse> ExecCardQueryExAsync(ExecCardQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardQueryResponse>(await DoRequestAsync("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-记名卡发行
         */
        public ExecCardBindnameResponse ExecCardBindname(ExecCardBindnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardBindnameEx(request, headers, runtime);
        }

        /**
         * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-记名卡发行
         */
        public async Task<ExecCardBindnameResponse> ExecCardBindnameAsync(ExecCardBindnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardBindnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-记名卡发行
         */
        public ExecCardBindnameResponse ExecCardBindnameEx(ExecCardBindnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardBindnameResponse>(DoRequest("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-记名卡发行
         */
        public async Task<ExecCardBindnameResponse> ExecCardBindnameExAsync(ExecCardBindnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardBindnameResponse>(await DoRequestAsync("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值卡密
         */
        public ExecCardChargeResponse ExecCardCharge(ExecCardChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardChargeEx(request, headers, runtime);
        }

        /**
         * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值卡密
         */
        public async Task<ExecCardChargeResponse> ExecCardChargeAsync(ExecCardChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardChargeExAsync(request, headers, runtime);
        }

        /**
         * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值卡密
         */
        public ExecCardChargeResponse ExecCardChargeEx(ExecCardChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardChargeResponse>(DoRequest("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值卡密
         */
        public async Task<ExecCardChargeResponse> ExecCardChargeExAsync(ExecCardChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardChargeResponse>(await DoRequestAsync("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-核销卡密
         */
        public ExecCardWriteoffResponse ExecCardWriteoff(ExecCardWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardWriteoffEx(request, headers, runtime);
        }

        /**
         * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-核销卡密
         */
        public async Task<ExecCardWriteoffResponse> ExecCardWriteoffAsync(ExecCardWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardWriteoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-核销卡密
         */
        public ExecCardWriteoffResponse ExecCardWriteoffEx(ExecCardWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardWriteoffResponse>(DoRequest("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-核销卡密
         */
        public async Task<ExecCardWriteoffResponse> ExecCardWriteoffExAsync(ExecCardWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardWriteoffResponse>(await DoRequestAsync("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-过期卡密
         */
        public ExecCardExpiredResponse ExecCardExpired(ExecCardExpiredRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardExpiredEx(request, headers, runtime);
        }

        /**
         * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-过期卡密
         */
        public async Task<ExecCardExpiredResponse> ExecCardExpiredAsync(ExecCardExpiredRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardExpiredExAsync(request, headers, runtime);
        }

        /**
         * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-过期卡密
         */
        public ExecCardExpiredResponse ExecCardExpiredEx(ExecCardExpiredRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardExpiredResponse>(DoRequest("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-过期卡密
         */
        public async Task<ExecCardExpiredResponse> ExecCardExpiredExAsync(ExecCardExpiredRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardExpiredResponse>(await DoRequestAsync("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-风控禁用
         */
        public ExecCardForbiddenResponse ExecCardForbidden(ExecCardForbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardForbiddenEx(request, headers, runtime);
        }

        /**
         * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-风控禁用
         */
        public async Task<ExecCardForbiddenResponse> ExecCardForbiddenAsync(ExecCardForbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardForbiddenExAsync(request, headers, runtime);
        }

        /**
         * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-风控禁用
         */
        public ExecCardForbiddenResponse ExecCardForbiddenEx(ExecCardForbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardForbiddenResponse>(DoRequest("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-风控禁用
         */
        public async Task<ExecCardForbiddenResponse> ExecCardForbiddenExAsync(ExecCardForbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardForbiddenResponse>(await DoRequestAsync("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值重置
         */
        public ExecCardChargeresetResponse ExecCardChargereset(ExecCardChargeresetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCardChargeresetEx(request, headers, runtime);
        }

        /**
         * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值重置
         */
        public async Task<ExecCardChargeresetResponse> ExecCardChargeresetAsync(ExecCardChargeresetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCardChargeresetExAsync(request, headers, runtime);
        }

        /**
         * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值重置
         */
        public ExecCardChargeresetResponse ExecCardChargeresetEx(ExecCardChargeresetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardChargeresetResponse>(DoRequest("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
         * Summary: 数字商品服务-电子券卡密服务-充值重置
         */
        public async Task<ExecCardChargeresetResponse> ExecCardChargeresetExAsync(ExecCardChargeresetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCardChargeresetResponse>(await DoRequestAsync("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人或机构账户注册
         * Summary: 数字商品服务-消费卡服务-个人/机构注册
         */
        public CreateConsumecardAccountResponse CreateConsumecardAccount(CreateConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 个人或机构账户注册
         * Summary: 数字商品服务-消费卡服务-个人/机构注册
         */
        public async Task<CreateConsumecardAccountResponse> CreateConsumecardAccountAsync(CreateConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人或机构账户注册
         * Summary: 数字商品服务-消费卡服务-个人/机构注册
         */
        public CreateConsumecardAccountResponse CreateConsumecardAccountEx(CreateConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人或机构账户注册
         * Summary: 数字商品服务-消费卡服务-个人/机构注册
         */
        public async Task<CreateConsumecardAccountResponse> CreateConsumecardAccountExAsync(CreateConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户注销
         * Summary: 数字商品服务-消费卡服务-个人/机构注销
         */
        public OfflineConsumecardAccountResponse OfflineConsumecardAccount(OfflineConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户注销
         * Summary: 数字商品服务-消费卡服务-个人/机构注销
         */
        public async Task<OfflineConsumecardAccountResponse> OfflineConsumecardAccountAsync(OfflineConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户注销
         * Summary: 数字商品服务-消费卡服务-个人/机构注销
         */
        public OfflineConsumecardAccountResponse OfflineConsumecardAccountEx(OfflineConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户注销
         * Summary: 数字商品服务-消费卡服务-个人/机构注销
         */
        public async Task<OfflineConsumecardAccountResponse> OfflineConsumecardAccountExAsync(OfflineConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业消费卡余额回退
         * Summary: 数字商品服务-消费卡服务-企业消费卡回退
         */
        public ReclaimConsumecardWalletResponse ReclaimConsumecardWallet(ReclaimConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReclaimConsumecardWalletEx(request, headers, runtime);
        }

        /**
         * Description: 企业消费卡余额回退
         * Summary: 数字商品服务-消费卡服务-企业消费卡回退
         */
        public async Task<ReclaimConsumecardWalletResponse> ReclaimConsumecardWalletAsync(ReclaimConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReclaimConsumecardWalletExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业消费卡余额回退
         * Summary: 数字商品服务-消费卡服务-企业消费卡回退
         */
        public ReclaimConsumecardWalletResponse ReclaimConsumecardWalletEx(ReclaimConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimConsumecardWalletResponse>(DoRequest("1.0", "baas.antdao.consumecard.wallet.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业消费卡余额回退
         * Summary: 数字商品服务-消费卡服务-企业消费卡回退
         */
        public async Task<ReclaimConsumecardWalletResponse> ReclaimConsumecardWalletExAsync(ReclaimConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimConsumecardWalletResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.wallet.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户禁用
         * Summary: 数字商品服务-消费卡服务-账户禁用
         */
        public FreezeConsumecardAccountResponse FreezeConsumecardAccount(FreezeConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户禁用
         * Summary: 数字商品服务-消费卡服务-账户禁用
         */
        public async Task<FreezeConsumecardAccountResponse> FreezeConsumecardAccountAsync(FreezeConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户禁用
         * Summary: 数字商品服务-消费卡服务-账户禁用
         */
        public FreezeConsumecardAccountResponse FreezeConsumecardAccountEx(FreezeConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户禁用
         * Summary: 数字商品服务-消费卡服务-账户禁用
         */
        public async Task<FreezeConsumecardAccountResponse> FreezeConsumecardAccountExAsync(FreezeConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户解禁
         * Summary: 数字商品服务-消费卡服务-账户解禁
         */
        public UnfreezeConsumecardAccountResponse UnfreezeConsumecardAccount(UnfreezeConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户解禁
         * Summary: 数字商品服务-消费卡服务-账户解禁
         */
        public async Task<UnfreezeConsumecardAccountResponse> UnfreezeConsumecardAccountAsync(UnfreezeConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人/机构账户解禁
         * Summary: 数字商品服务-消费卡服务-账户解禁
         */
        public UnfreezeConsumecardAccountResponse UnfreezeConsumecardAccountEx(UnfreezeConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人/机构账户解禁
         * Summary: 数字商品服务-消费卡服务-账户解禁
         */
        public async Task<UnfreezeConsumecardAccountResponse> UnfreezeConsumecardAccountExAsync(UnfreezeConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费卡风控调整(特殊权限,暂不开放)
         * Summary: 数字商品服务-消费卡服务-消费卡风控调整
         */
        public UpdateConsumecardRiskcontrolResponse UpdateConsumecardRiskcontrol(UpdateConsumecardRiskcontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConsumecardRiskcontrolEx(request, headers, runtime);
        }

        /**
         * Description: 消费卡风控调整(特殊权限,暂不开放)
         * Summary: 数字商品服务-消费卡服务-消费卡风控调整
         */
        public async Task<UpdateConsumecardRiskcontrolResponse> UpdateConsumecardRiskcontrolAsync(UpdateConsumecardRiskcontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConsumecardRiskcontrolExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费卡风控调整(特殊权限,暂不开放)
         * Summary: 数字商品服务-消费卡服务-消费卡风控调整
         */
        public UpdateConsumecardRiskcontrolResponse UpdateConsumecardRiskcontrolEx(UpdateConsumecardRiskcontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardRiskcontrolResponse>(DoRequest("1.0", "baas.antdao.consumecard.riskcontrol.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费卡风控调整(特殊权限,暂不开放)
         * Summary: 数字商品服务-消费卡服务-消费卡风控调整
         */
        public async Task<UpdateConsumecardRiskcontrolResponse> UpdateConsumecardRiskcontrolExAsync(UpdateConsumecardRiskcontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardRiskcontrolResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.riskcontrol.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单查询
         * Summary: 数字商品服务-消费卡服务-账单查询
         */
        public QueryConsumecardBillResponse QueryConsumecardBill(QueryConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardBillEx(request, headers, runtime);
        }

        /**
         * Description: 账单查询
         * Summary: 数字商品服务-消费卡服务-账单查询
         */
        public async Task<QueryConsumecardBillResponse> QueryConsumecardBillAsync(QueryConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单查询
         * Summary: 数字商品服务-消费卡服务-账单查询
         */
        public QueryConsumecardBillResponse QueryConsumecardBillEx(QueryConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBillResponse>(DoRequest("1.0", "baas.antdao.consumecard.bill.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单查询
         * Summary: 数字商品服务-消费卡服务-账单查询
         */
        public async Task<QueryConsumecardBillResponse> QueryConsumecardBillExAsync(QueryConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBillResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.bill.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业消费卡充值冻结
         * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
         */
        public ChargeConsumecardWalletResponse ChargeConsumecardWallet(ChargeConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ChargeConsumecardWalletEx(request, headers, runtime);
        }

        /**
         * Description: 企业消费卡充值冻结
         * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
         */
        public async Task<ChargeConsumecardWalletResponse> ChargeConsumecardWalletAsync(ChargeConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ChargeConsumecardWalletExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业消费卡充值冻结
         * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
         */
        public ChargeConsumecardWalletResponse ChargeConsumecardWalletEx(ChargeConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChargeConsumecardWalletResponse>(DoRequest("1.0", "baas.antdao.consumecard.wallet.charge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业消费卡充值冻结
         * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
         */
        public async Task<ChargeConsumecardWalletResponse> ChargeConsumecardWalletExAsync(ChargeConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChargeConsumecardWalletResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.wallet.charge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更账户信息
         * Summary: 数字商品服务-消费卡服务-更新账户
         */
        public UpdateConsumecardAccountResponse UpdateConsumecardAccount(UpdateConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 更账户信息
         * Summary: 数字商品服务-消费卡服务-更新账户
         */
        public async Task<UpdateConsumecardAccountResponse> UpdateConsumecardAccountAsync(UpdateConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更账户信息
         * Summary: 数字商品服务-消费卡服务-更新账户
         */
        public UpdateConsumecardAccountResponse UpdateConsumecardAccountEx(UpdateConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更账户信息
         * Summary: 数字商品服务-消费卡服务-更新账户
         */
        public async Task<UpdateConsumecardAccountResponse> UpdateConsumecardAccountExAsync(UpdateConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单创建
         * Summary: 数字商品服务-消费卡服务-账单创建
         */
        public CreateConsumecardBillResponse CreateConsumecardBill(CreateConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardBillEx(request, headers, runtime);
        }

        /**
         * Description: 账单创建
         * Summary: 数字商品服务-消费卡服务-账单创建
         */
        public async Task<CreateConsumecardBillResponse> CreateConsumecardBillAsync(CreateConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单创建
         * Summary: 数字商品服务-消费卡服务-账单创建
         */
        public CreateConsumecardBillResponse CreateConsumecardBillEx(CreateConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardBillResponse>(DoRequest("1.0", "baas.antdao.consumecard.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单创建
         * Summary: 数字商品服务-消费卡服务-账单创建
         */
        public async Task<CreateConsumecardBillResponse> CreateConsumecardBillExAsync(CreateConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardBillResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单创建确认成功或失败
         * Summary: 数字商品服务-消费卡服务-账单创建确认
         */
        public ConfirmConsumecardBillcreateResponse ConfirmConsumecardBillcreate(ConfirmConsumecardBillcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmConsumecardBillcreateEx(request, headers, runtime);
        }

        /**
         * Description: 账单创建确认成功或失败
         * Summary: 数字商品服务-消费卡服务-账单创建确认
         */
        public async Task<ConfirmConsumecardBillcreateResponse> ConfirmConsumecardBillcreateAsync(ConfirmConsumecardBillcreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmConsumecardBillcreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单创建确认成功或失败
         * Summary: 数字商品服务-消费卡服务-账单创建确认
         */
        public ConfirmConsumecardBillcreateResponse ConfirmConsumecardBillcreateEx(ConfirmConsumecardBillcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardBillcreateResponse>(DoRequest("1.0", "baas.antdao.consumecard.billcreate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单创建确认成功或失败
         * Summary: 数字商品服务-消费卡服务-账单创建确认
         */
        public async Task<ConfirmConsumecardBillcreateResponse> ConfirmConsumecardBillcreateExAsync(ConfirmConsumecardBillcreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardBillcreateResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billcreate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单取消
         * Summary: 数字商品服务-消费卡服务-取消账单
         */
        public CancelConsumecardBillResponse CancelConsumecardBill(CancelConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelConsumecardBillEx(request, headers, runtime);
        }

        /**
         * Description: 账单取消
         * Summary: 数字商品服务-消费卡服务-取消账单
         */
        public async Task<CancelConsumecardBillResponse> CancelConsumecardBillAsync(CancelConsumecardBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelConsumecardBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单取消
         * Summary: 数字商品服务-消费卡服务-取消账单
         */
        public CancelConsumecardBillResponse CancelConsumecardBillEx(CancelConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardBillResponse>(DoRequest("1.0", "baas.antdao.consumecard.bill.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单取消
         * Summary: 数字商品服务-消费卡服务-取消账单
         */
        public async Task<CancelConsumecardBillResponse> CancelConsumecardBillExAsync(CancelConsumecardBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardBillResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.bill.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单支付
         * Summary: 数字商品服务-消费卡服务-账单支付
         */
        public ExecConsumecardBillpayResponse ExecConsumecardBillpay(ExecConsumecardBillpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardBillpayEx(request, headers, runtime);
        }

        /**
         * Description: 账单支付
         * Summary: 数字商品服务-消费卡服务-账单支付
         */
        public async Task<ExecConsumecardBillpayResponse> ExecConsumecardBillpayAsync(ExecConsumecardBillpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardBillpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单支付
         * Summary: 数字商品服务-消费卡服务-账单支付
         */
        public ExecConsumecardBillpayResponse ExecConsumecardBillpayEx(ExecConsumecardBillpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardBillpayResponse>(DoRequest("1.0", "baas.antdao.consumecard.billpay.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单支付
         * Summary: 数字商品服务-消费卡服务-账单支付
         */
        public async Task<ExecConsumecardBillpayResponse> ExecConsumecardBillpayExAsync(ExecConsumecardBillpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardBillpayResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billpay.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单核销和交易核销，传入交易类型和订单Id
         * Summary: 数字商品服务-消费卡服务-账单和交易核销
         */
        public ExecConsumecardOrderwriteoffResponse ExecConsumecardOrderwriteoff(ExecConsumecardOrderwriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardOrderwriteoffEx(request, headers, runtime);
        }

        /**
         * Description: 账单核销和交易核销，传入交易类型和订单Id
         * Summary: 数字商品服务-消费卡服务-账单和交易核销
         */
        public async Task<ExecConsumecardOrderwriteoffResponse> ExecConsumecardOrderwriteoffAsync(ExecConsumecardOrderwriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardOrderwriteoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单核销和交易核销，传入交易类型和订单Id
         * Summary: 数字商品服务-消费卡服务-账单和交易核销
         */
        public ExecConsumecardOrderwriteoffResponse ExecConsumecardOrderwriteoffEx(ExecConsumecardOrderwriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwriteoffResponse>(DoRequest("1.0", "baas.antdao.consumecard.orderwriteoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单核销和交易核销，传入交易类型和订单Id
         * Summary: 数字商品服务-消费卡服务-账单和交易核销
         */
        public async Task<ExecConsumecardOrderwriteoffResponse> ExecConsumecardOrderwriteoffExAsync(ExecConsumecardOrderwriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwriteoffResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.orderwriteoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 处理买家的退款申请，接受退款或者拒绝退款
         * Summary: 数字商品服务-消费卡服务-账单退款处理
         */
        public ConfirmConsumecardBillrefundResponse ConfirmConsumecardBillrefund(ConfirmConsumecardBillrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmConsumecardBillrefundEx(request, headers, runtime);
        }

        /**
         * Description: 处理买家的退款申请，接受退款或者拒绝退款
         * Summary: 数字商品服务-消费卡服务-账单退款处理
         */
        public async Task<ConfirmConsumecardBillrefundResponse> ConfirmConsumecardBillrefundAsync(ConfirmConsumecardBillrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmConsumecardBillrefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 处理买家的退款申请，接受退款或者拒绝退款
         * Summary: 数字商品服务-消费卡服务-账单退款处理
         */
        public ConfirmConsumecardBillrefundResponse ConfirmConsumecardBillrefundEx(ConfirmConsumecardBillrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardBillrefundResponse>(DoRequest("1.0", "baas.antdao.consumecard.billrefund.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 处理买家的退款申请，接受退款或者拒绝退款
         * Summary: 数字商品服务-消费卡服务-账单退款处理
         */
        public async Task<ConfirmConsumecardBillrefundResponse> ConfirmConsumecardBillrefundExAsync(ConfirmConsumecardBillrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardBillrefundResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billrefund.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账户信息
         * Summary: 数字商品服务-消费卡服务-查询账户信息
         */
        public QueryConsumecardAccountResponse QueryConsumecardAccount(QueryConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardAccountEx(request, headers, runtime);
        }

        /**
         * Description: 查询账户信息
         * Summary: 数字商品服务-消费卡服务-查询账户信息
         */
        public async Task<QueryConsumecardAccountResponse> QueryConsumecardAccountAsync(QueryConsumecardAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询账户信息
         * Summary: 数字商品服务-消费卡服务-查询账户信息
         */
        public QueryConsumecardAccountResponse QueryConsumecardAccountEx(QueryConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardAccountResponse>(DoRequest("1.0", "baas.antdao.consumecard.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账户信息
         * Summary: 数字商品服务-消费卡服务-查询账户信息
         */
        public async Task<QueryConsumecardAccountResponse> QueryConsumecardAccountExAsync(QueryConsumecardAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通钱包
         * Summary: 数字商品服务-消费卡服务-开通钱包
         */
        public OpenConsumecardWalletResponse OpenConsumecardWallet(OpenConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenConsumecardWalletEx(request, headers, runtime);
        }

        /**
         * Description: 开通钱包
         * Summary: 数字商品服务-消费卡服务-开通钱包
         */
        public async Task<OpenConsumecardWalletResponse> OpenConsumecardWalletAsync(OpenConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenConsumecardWalletExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通钱包
         * Summary: 数字商品服务-消费卡服务-开通钱包
         */
        public OpenConsumecardWalletResponse OpenConsumecardWalletEx(OpenConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenConsumecardWalletResponse>(DoRequest("1.0", "baas.antdao.consumecard.wallet.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通钱包
         * Summary: 数字商品服务-消费卡服务-开通钱包
         */
        public async Task<OpenConsumecardWalletResponse> OpenConsumecardWalletExAsync(OpenConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenConsumecardWalletResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.wallet.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询钱包信息
         * Summary: 数字商品服务-消费卡服务-查询钱包
         */
        public QueryConsumecardWalletResponse QueryConsumecardWallet(QueryConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardWalletEx(request, headers, runtime);
        }

        /**
         * Description: 查询钱包信息
         * Summary: 数字商品服务-消费卡服务-查询钱包
         */
        public async Task<QueryConsumecardWalletResponse> QueryConsumecardWalletAsync(QueryConsumecardWalletRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardWalletExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询钱包信息
         * Summary: 数字商品服务-消费卡服务-查询钱包
         */
        public QueryConsumecardWalletResponse QueryConsumecardWalletEx(QueryConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardWalletResponse>(DoRequest("1.0", "baas.antdao.consumecard.wallet.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询钱包信息
         * Summary: 数字商品服务-消费卡服务-查询钱包
         */
        public async Task<QueryConsumecardWalletResponse> QueryConsumecardWalletExAsync(QueryConsumecardWalletRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardWalletResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.wallet.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
         * Summary: 数字商品服务-消费卡服务-充值并兑换资产
         */
        public ExecConsumecardWalletchargetotokenResponse ExecConsumecardWalletchargetotoken(ExecConsumecardWalletchargetotokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardWalletchargetotokenEx(request, headers, runtime);
        }

        /**
         * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
         * Summary: 数字商品服务-消费卡服务-充值并兑换资产
         */
        public async Task<ExecConsumecardWalletchargetotokenResponse> ExecConsumecardWalletchargetotokenAsync(ExecConsumecardWalletchargetotokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardWalletchargetotokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
         * Summary: 数字商品服务-消费卡服务-充值并兑换资产
         */
        public ExecConsumecardWalletchargetotokenResponse ExecConsumecardWalletchargetotokenEx(ExecConsumecardWalletchargetotokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardWalletchargetotokenResponse>(DoRequest("1.0", "baas.antdao.consumecard.walletchargetotoken.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
         * Summary: 数字商品服务-消费卡服务-充值并兑换资产
         */
        public async Task<ExecConsumecardWalletchargetotokenResponse> ExecConsumecardWalletchargetotokenExAsync(ExecConsumecardWalletchargetotokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardWalletchargetotokenResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.walletchargetotoken.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 湮灭自己发行的token并提现
         * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
         */
        public ExecConsumecardWalletredeemtokenResponse ExecConsumecardWalletredeemtoken(ExecConsumecardWalletredeemtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardWalletredeemtokenEx(request, headers, runtime);
        }

        /**
         * Description: 湮灭自己发行的token并提现
         * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
         */
        public async Task<ExecConsumecardWalletredeemtokenResponse> ExecConsumecardWalletredeemtokenAsync(ExecConsumecardWalletredeemtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardWalletredeemtokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 湮灭自己发行的token并提现
         * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
         */
        public ExecConsumecardWalletredeemtokenResponse ExecConsumecardWalletredeemtokenEx(ExecConsumecardWalletredeemtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardWalletredeemtokenResponse>(DoRequest("1.0", "baas.antdao.consumecard.walletredeemtoken.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 湮灭自己发行的token并提现
         * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
         */
        public async Task<ExecConsumecardWalletredeemtokenResponse> ExecConsumecardWalletredeemtokenExAsync(ExecConsumecardWalletredeemtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardWalletredeemtokenResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.walletredeemtoken.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家发起交易
         * Summary: 数字商品服务-消费卡服务-买家发起交易
         */
        public StartConsumecardPurchaseResponse StartConsumecardPurchase(StartConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 买家发起交易
         * Summary: 数字商品服务-消费卡服务-买家发起交易
         */
        public async Task<StartConsumecardPurchaseResponse> StartConsumecardPurchaseAsync(StartConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 买家发起交易
         * Summary: 数字商品服务-消费卡服务-买家发起交易
         */
        public StartConsumecardPurchaseResponse StartConsumecardPurchaseEx(StartConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家发起交易
         * Summary: 数字商品服务-消费卡服务-买家发起交易
         */
        public async Task<StartConsumecardPurchaseResponse> StartConsumecardPurchaseExAsync(StartConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消交易，买家发起
         * Summary: 数字商品服务-消费卡服务-买家取消交易
         */
        public CancelConsumecardBuyerpurchaseResponse CancelConsumecardBuyerpurchase(CancelConsumecardBuyerpurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelConsumecardBuyerpurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 取消交易，买家发起
         * Summary: 数字商品服务-消费卡服务-买家取消交易
         */
        public async Task<CancelConsumecardBuyerpurchaseResponse> CancelConsumecardBuyerpurchaseAsync(CancelConsumecardBuyerpurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelConsumecardBuyerpurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消交易，买家发起
         * Summary: 数字商品服务-消费卡服务-买家取消交易
         */
        public CancelConsumecardBuyerpurchaseResponse CancelConsumecardBuyerpurchaseEx(CancelConsumecardBuyerpurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardBuyerpurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.buyerpurchase.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消交易，买家发起
         * Summary: 数字商品服务-消费卡服务-买家取消交易
         */
        public async Task<CancelConsumecardBuyerpurchaseResponse> CancelConsumecardBuyerpurchaseExAsync(CancelConsumecardBuyerpurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardBuyerpurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.buyerpurchase.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家申请退款
         * Summary: 数字商品服务-消费卡服务-买家申请退款
         */
        public ApplyConsumecardPurchaserefundResponse ApplyConsumecardPurchaserefund(ApplyConsumecardPurchaserefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyConsumecardPurchaserefundEx(request, headers, runtime);
        }

        /**
         * Description: 买家申请退款
         * Summary: 数字商品服务-消费卡服务-买家申请退款
         */
        public async Task<ApplyConsumecardPurchaserefundResponse> ApplyConsumecardPurchaserefundAsync(ApplyConsumecardPurchaserefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyConsumecardPurchaserefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 买家申请退款
         * Summary: 数字商品服务-消费卡服务-买家申请退款
         */
        public ApplyConsumecardPurchaserefundResponse ApplyConsumecardPurchaserefundEx(ApplyConsumecardPurchaserefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardPurchaserefundResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchaserefund.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家申请退款
         * Summary: 数字商品服务-消费卡服务-买家申请退款
         */
        public async Task<ApplyConsumecardPurchaserefundResponse> ApplyConsumecardPurchaserefundExAsync(ApplyConsumecardPurchaserefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardPurchaserefundResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchaserefund.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家申请售后
         * Summary: 数字商品服务-消费卡服务-买家申请售后
         */
        public ApplyConsumecardPurchasereplaceResponse ApplyConsumecardPurchasereplace(ApplyConsumecardPurchasereplaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyConsumecardPurchasereplaceEx(request, headers, runtime);
        }

        /**
         * Description: 买家申请售后
         * Summary: 数字商品服务-消费卡服务-买家申请售后
         */
        public async Task<ApplyConsumecardPurchasereplaceResponse> ApplyConsumecardPurchasereplaceAsync(ApplyConsumecardPurchasereplaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyConsumecardPurchasereplaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 买家申请售后
         * Summary: 数字商品服务-消费卡服务-买家申请售后
         */
        public ApplyConsumecardPurchasereplaceResponse ApplyConsumecardPurchasereplaceEx(ApplyConsumecardPurchasereplaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardPurchasereplaceResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchasereplace.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家申请售后
         * Summary: 数字商品服务-消费卡服务-买家申请售后
         */
        public async Task<ApplyConsumecardPurchasereplaceResponse> ApplyConsumecardPurchasereplaceExAsync(ApplyConsumecardPurchasereplaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardPurchasereplaceResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchasereplace.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家确认收货
         * Summary: 数字商品服务-消费卡服务-买家确认收货
         */
        public ExecConsumecardPurchasereceiveResponse ExecConsumecardPurchasereceive(ExecConsumecardPurchasereceiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardPurchasereceiveEx(request, headers, runtime);
        }

        /**
         * Description: 买家确认收货
         * Summary: 数字商品服务-消费卡服务-买家确认收货
         */
        public async Task<ExecConsumecardPurchasereceiveResponse> ExecConsumecardPurchasereceiveAsync(ExecConsumecardPurchasereceiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardPurchasereceiveExAsync(request, headers, runtime);
        }

        /**
         * Description: 买家确认收货
         * Summary: 数字商品服务-消费卡服务-买家确认收货
         */
        public ExecConsumecardPurchasereceiveResponse ExecConsumecardPurchasereceiveEx(ExecConsumecardPurchasereceiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardPurchasereceiveResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchasereceive.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家确认收货
         * Summary: 数字商品服务-消费卡服务-买家确认收货
         */
        public async Task<ExecConsumecardPurchasereceiveResponse> ExecConsumecardPurchasereceiveExAsync(ExecConsumecardPurchasereceiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardPurchasereceiveResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchasereceive.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家拒绝交易
         * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
         */
        public RefuseConsumecardPurchaseResponse RefuseConsumecardPurchase(RefuseConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 卖家拒绝交易
         * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
         */
        public async Task<RefuseConsumecardPurchaseResponse> RefuseConsumecardPurchaseAsync(RefuseConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家拒绝交易
         * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
         */
        public RefuseConsumecardPurchaseResponse RefuseConsumecardPurchaseEx(RefuseConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家拒绝交易
         * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
         */
        public async Task<RefuseConsumecardPurchaseResponse> RefuseConsumecardPurchaseExAsync(RefuseConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家退款操作。可以同意退款和拒绝退款。
         * Summary: 数字商品服务-消费卡服务-卖家退款操作
         */
        public SetConsumecardPurchaserefundResponse SetConsumecardPurchaserefund(SetConsumecardPurchaserefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardPurchaserefundEx(request, headers, runtime);
        }

        /**
         * Description: 卖家退款操作。可以同意退款和拒绝退款。
         * Summary: 数字商品服务-消费卡服务-卖家退款操作
         */
        public async Task<SetConsumecardPurchaserefundResponse> SetConsumecardPurchaserefundAsync(SetConsumecardPurchaserefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardPurchaserefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家退款操作。可以同意退款和拒绝退款。
         * Summary: 数字商品服务-消费卡服务-卖家退款操作
         */
        public SetConsumecardPurchaserefundResponse SetConsumecardPurchaserefundEx(SetConsumecardPurchaserefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardPurchaserefundResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchaserefund.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家退款操作。可以同意退款和拒绝退款。
         * Summary: 数字商品服务-消费卡服务-卖家退款操作
         */
        public async Task<SetConsumecardPurchaserefundResponse> SetConsumecardPurchaserefundExAsync(SetConsumecardPurchaserefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardPurchaserefundResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchaserefund.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家换货操作。可以同意换货，拒绝换货
         * Summary: 数字商品服务-消费卡服务-卖家换货操作
         */
        public SetConsumecardPurchasereplaceResponse SetConsumecardPurchasereplace(SetConsumecardPurchasereplaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardPurchasereplaceEx(request, headers, runtime);
        }

        /**
         * Description: 卖家换货操作。可以同意换货，拒绝换货
         * Summary: 数字商品服务-消费卡服务-卖家换货操作
         */
        public async Task<SetConsumecardPurchasereplaceResponse> SetConsumecardPurchasereplaceAsync(SetConsumecardPurchasereplaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardPurchasereplaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家换货操作。可以同意换货，拒绝换货
         * Summary: 数字商品服务-消费卡服务-卖家换货操作
         */
        public SetConsumecardPurchasereplaceResponse SetConsumecardPurchasereplaceEx(SetConsumecardPurchasereplaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardPurchasereplaceResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchasereplace.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家换货操作。可以同意换货，拒绝换货
         * Summary: 数字商品服务-消费卡服务-卖家换货操作
         */
        public async Task<SetConsumecardPurchasereplaceResponse> SetConsumecardPurchasereplaceExAsync(SetConsumecardPurchasereplaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardPurchasereplaceResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchasereplace.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家接单
         * Summary: 数字商品服务-消费卡服务-卖家接单
         */
        public ConfirmConsumecardPurchaseResponse ConfirmConsumecardPurchase(ConfirmConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 卖家接单
         * Summary: 数字商品服务-消费卡服务-卖家接单
         */
        public async Task<ConfirmConsumecardPurchaseResponse> ConfirmConsumecardPurchaseAsync(ConfirmConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家接单
         * Summary: 数字商品服务-消费卡服务-卖家接单
         */
        public ConfirmConsumecardPurchaseResponse ConfirmConsumecardPurchaseEx(ConfirmConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家接单
         * Summary: 数字商品服务-消费卡服务-卖家接单
         */
        public async Task<ConfirmConsumecardPurchaseResponse> ConfirmConsumecardPurchaseExAsync(ConfirmConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家发货
         * Summary: 数字商品服务-消费卡服务-卖家发货
         */
        public SendConsumecardPurchaseResponse SendConsumecardPurchase(SendConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 卖家发货
         * Summary: 数字商品服务-消费卡服务-卖家发货
         */
        public async Task<SendConsumecardPurchaseResponse> SendConsumecardPurchaseAsync(SendConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家发货
         * Summary: 数字商品服务-消费卡服务-卖家发货
         */
        public SendConsumecardPurchaseResponse SendConsumecardPurchaseEx(SendConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家发货
         * Summary: 数字商品服务-消费卡服务-卖家发货
         */
        public async Task<SendConsumecardPurchaseResponse> SendConsumecardPurchaseExAsync(SendConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家售后补发货
         * Summary: 数字商品服务-消费卡服务-卖家售后补发货
         */
        public ReplaceConsumecardPurchaseResponse ReplaceConsumecardPurchase(ReplaceConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 卖家售后补发货
         * Summary: 数字商品服务-消费卡服务-卖家售后补发货
         */
        public async Task<ReplaceConsumecardPurchaseResponse> ReplaceConsumecardPurchaseAsync(ReplaceConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家售后补发货
         * Summary: 数字商品服务-消费卡服务-卖家售后补发货
         */
        public ReplaceConsumecardPurchaseResponse ReplaceConsumecardPurchaseEx(ReplaceConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家售后补发货
         * Summary: 数字商品服务-消费卡服务-卖家售后补发货
         */
        public async Task<ReplaceConsumecardPurchaseResponse> ReplaceConsumecardPurchaseExAsync(ReplaceConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布商品
         * Summary: 数字商品服务-消费卡服务-发布商品
         */
        public CreateConsumecardGoodsResponse CreateConsumecardGoods(CreateConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 发布商品
         * Summary: 数字商品服务-消费卡服务-发布商品
         */
        public async Task<CreateConsumecardGoodsResponse> CreateConsumecardGoodsAsync(CreateConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布商品
         * Summary: 数字商品服务-消费卡服务-发布商品
         */
        public CreateConsumecardGoodsResponse CreateConsumecardGoodsEx(CreateConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardGoodsResponse>(DoRequest("1.0", "baas.antdao.consumecard.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布商品
         * Summary: 数字商品服务-消费卡服务-发布商品
         */
        public async Task<CreateConsumecardGoodsResponse> CreateConsumecardGoodsExAsync(CreateConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-消费卡服务-更新商品信息
         */
        public UpdateConsumecardGoodsResponse UpdateConsumecardGoods(UpdateConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConsumecardGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-消费卡服务-更新商品信息
         */
        public async Task<UpdateConsumecardGoodsResponse> UpdateConsumecardGoodsAsync(UpdateConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConsumecardGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-消费卡服务-更新商品信息
         */
        public UpdateConsumecardGoodsResponse UpdateConsumecardGoodsEx(UpdateConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardGoodsResponse>(DoRequest("1.0", "baas.antdao.consumecard.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-消费卡服务-更新商品信息
         */
        public async Task<UpdateConsumecardGoodsResponse> UpdateConsumecardGoodsExAsync(UpdateConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConsumecardGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品开放购买权限给指定账户
         * Summary: 数字商品服务-消费卡服务-开放购买权限
         */
        public OpenConsumecardGoodstocustomResponse OpenConsumecardGoodstocustom(OpenConsumecardGoodstocustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenConsumecardGoodstocustomEx(request, headers, runtime);
        }

        /**
         * Description: 商品开放购买权限给指定账户
         * Summary: 数字商品服务-消费卡服务-开放购买权限
         */
        public async Task<OpenConsumecardGoodstocustomResponse> OpenConsumecardGoodstocustomAsync(OpenConsumecardGoodstocustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenConsumecardGoodstocustomExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品开放购买权限给指定账户
         * Summary: 数字商品服务-消费卡服务-开放购买权限
         */
        public OpenConsumecardGoodstocustomResponse OpenConsumecardGoodstocustomEx(OpenConsumecardGoodstocustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenConsumecardGoodstocustomResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodstocustom.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品开放购买权限给指定账户
         * Summary: 数字商品服务-消费卡服务-开放购买权限
         */
        public async Task<OpenConsumecardGoodstocustomResponse> OpenConsumecardGoodstocustomExAsync(OpenConsumecardGoodstocustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenConsumecardGoodstocustomResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodstocustom.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增商品类别
         * Summary: 数字商品服务-消费卡服务-新增商品类别
         */
        public CreateConsumecardGoodscategoryResponse CreateConsumecardGoodscategory(CreateConsumecardGoodscategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardGoodscategoryEx(request, headers, runtime);
        }

        /**
         * Description: 新增商品类别
         * Summary: 数字商品服务-消费卡服务-新增商品类别
         */
        public async Task<CreateConsumecardGoodscategoryResponse> CreateConsumecardGoodscategoryAsync(CreateConsumecardGoodscategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardGoodscategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增商品类别
         * Summary: 数字商品服务-消费卡服务-新增商品类别
         */
        public CreateConsumecardGoodscategoryResponse CreateConsumecardGoodscategoryEx(CreateConsumecardGoodscategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardGoodscategoryResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodscategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增商品类别
         * Summary: 数字商品服务-消费卡服务-新增商品类别
         */
        public async Task<CreateConsumecardGoodscategoryResponse> CreateConsumecardGoodscategoryExAsync(CreateConsumecardGoodscategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardGoodscategoryResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodscategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品一客一价
         * Summary: 数字商品服务-消费卡服务-设置一客一价
         */
        public SetConsumecardGoodscustompriceResponse SetConsumecardGoodscustomprice(SetConsumecardGoodscustompriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardGoodscustompriceEx(request, headers, runtime);
        }

        /**
         * Description: 设置商品一客一价
         * Summary: 数字商品服务-消费卡服务-设置一客一价
         */
        public async Task<SetConsumecardGoodscustompriceResponse> SetConsumecardGoodscustompriceAsync(SetConsumecardGoodscustompriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardGoodscustompriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置商品一客一价
         * Summary: 数字商品服务-消费卡服务-设置一客一价
         */
        public SetConsumecardGoodscustompriceResponse SetConsumecardGoodscustompriceEx(SetConsumecardGoodscustompriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardGoodscustompriceResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodscustomprice.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品一客一价
         * Summary: 数字商品服务-消费卡服务-设置一客一价
         */
        public async Task<SetConsumecardGoodscustompriceResponse> SetConsumecardGoodscustompriceExAsync(SetConsumecardGoodscustompriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardGoodscustompriceResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodscustomprice.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片获取URL
         * Summary: 数字商品服务-消费卡服务-上传图片
         */
        public UploadConsumecardGoodsimageResponse UploadConsumecardGoodsimage(UploadConsumecardGoodsimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadConsumecardGoodsimageEx(request, headers, runtime);
        }

        /**
         * Description: 上传图片获取URL
         * Summary: 数字商品服务-消费卡服务-上传图片
         */
        public async Task<UploadConsumecardGoodsimageResponse> UploadConsumecardGoodsimageAsync(UploadConsumecardGoodsimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadConsumecardGoodsimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传图片获取URL
         * Summary: 数字商品服务-消费卡服务-上传图片
         */
        public UploadConsumecardGoodsimageResponse UploadConsumecardGoodsimageEx(UploadConsumecardGoodsimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadConsumecardGoodsimageResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodsimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片获取URL
         * Summary: 数字商品服务-消费卡服务-上传图片
         */
        public async Task<UploadConsumecardGoodsimageResponse> UploadConsumecardGoodsimageExAsync(UploadConsumecardGoodsimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadConsumecardGoodsimageResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodsimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现试算
         * Summary: 数字商品服务-消费卡服务-企业提现试算
         */
        public ExecConsumecardOrdertrywithdrawResponse ExecConsumecardOrdertrywithdraw(ExecConsumecardOrdertrywithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardOrdertrywithdrawEx(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现试算
         * Summary: 数字商品服务-消费卡服务-企业提现试算
         */
        public async Task<ExecConsumecardOrdertrywithdrawResponse> ExecConsumecardOrdertrywithdrawAsync(ExecConsumecardOrdertrywithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardOrdertrywithdrawExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现试算
         * Summary: 数字商品服务-消费卡服务-企业提现试算
         */
        public ExecConsumecardOrdertrywithdrawResponse ExecConsumecardOrdertrywithdrawEx(ExecConsumecardOrdertrywithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrdertrywithdrawResponse>(DoRequest("1.0", "baas.antdao.consumecard.ordertrywithdraw.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现试算
         * Summary: 数字商品服务-消费卡服务-企业提现试算
         */
        public async Task<ExecConsumecardOrdertrywithdrawResponse> ExecConsumecardOrdertrywithdrawExAsync(ExecConsumecardOrdertrywithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrdertrywithdrawResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.ordertrywithdraw.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
         * Summary: 数字商品服务-消费卡服务-根据区块提现
         */
        public ExecConsumecardOrderwithdrawbyblocknumResponse ExecConsumecardOrderwithdrawbyblocknum(ExecConsumecardOrderwithdrawbyblocknumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardOrderwithdrawbyblocknumEx(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
         * Summary: 数字商品服务-消费卡服务-根据区块提现
         */
        public async Task<ExecConsumecardOrderwithdrawbyblocknumResponse> ExecConsumecardOrderwithdrawbyblocknumAsync(ExecConsumecardOrderwithdrawbyblocknumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardOrderwithdrawbyblocknumExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
         * Summary: 数字商品服务-消费卡服务-根据区块提现
         */
        public ExecConsumecardOrderwithdrawbyblocknumResponse ExecConsumecardOrderwithdrawbyblocknumEx(ExecConsumecardOrderwithdrawbyblocknumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwithdrawbyblocknumResponse>(DoRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyblocknum.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
         * Summary: 数字商品服务-消费卡服务-根据区块提现
         */
        public async Task<ExecConsumecardOrderwithdrawbyblocknumResponse> ExecConsumecardOrderwithdrawbyblocknumExAsync(ExecConsumecardOrderwithdrawbyblocknumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwithdrawbyblocknumResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.orderwithdrawbyblocknum.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
         * Summary: 数字商品服务-消费卡服务-根据订单表提现
         */
        public ExecConsumecardOrderwithdrawbyidsResponse ExecConsumecardOrderwithdrawbyids(ExecConsumecardOrderwithdrawbyidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConsumecardOrderwithdrawbyidsEx(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
         * Summary: 数字商品服务-消费卡服务-根据订单表提现
         */
        public async Task<ExecConsumecardOrderwithdrawbyidsResponse> ExecConsumecardOrderwithdrawbyidsAsync(ExecConsumecardOrderwithdrawbyidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConsumecardOrderwithdrawbyidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
         * Summary: 数字商品服务-消费卡服务-根据订单表提现
         */
        public ExecConsumecardOrderwithdrawbyidsResponse ExecConsumecardOrderwithdrawbyidsEx(ExecConsumecardOrderwithdrawbyidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwithdrawbyidsResponse>(DoRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyids.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
         * Summary: 数字商品服务-消费卡服务-根据订单表提现
         */
        public async Task<ExecConsumecardOrderwithdrawbyidsResponse> ExecConsumecardOrderwithdrawbyidsExAsync(ExecConsumecardOrderwithdrawbyidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConsumecardOrderwithdrawbyidsResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.orderwithdrawbyids.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据提现单号获取提现结果
         * Summary: 数字商品服务-消费卡服务-获取提现结果
         */
        public GetConsumecardOrderwithdrawresultResponse GetConsumecardOrderwithdrawresult(GetConsumecardOrderwithdrawresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConsumecardOrderwithdrawresultEx(request, headers, runtime);
        }

        /**
         * Description: 根据提现单号获取提现结果
         * Summary: 数字商品服务-消费卡服务-获取提现结果
         */
        public async Task<GetConsumecardOrderwithdrawresultResponse> GetConsumecardOrderwithdrawresultAsync(GetConsumecardOrderwithdrawresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConsumecardOrderwithdrawresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据提现单号获取提现结果
         * Summary: 数字商品服务-消费卡服务-获取提现结果
         */
        public GetConsumecardOrderwithdrawresultResponse GetConsumecardOrderwithdrawresultEx(GetConsumecardOrderwithdrawresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConsumecardOrderwithdrawresultResponse>(DoRequest("1.0", "baas.antdao.consumecard.orderwithdrawresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据提现单号获取提现结果
         * Summary: 数字商品服务-消费卡服务-获取提现结果
         */
        public async Task<GetConsumecardOrderwithdrawresultResponse> GetConsumecardOrderwithdrawresultExAsync(GetConsumecardOrderwithdrawresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConsumecardOrderwithdrawresultResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.orderwithdrawresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销前需要回退资金,查询账户可回退金额
         * Summary: 数字商品服务-消费卡服务-查询可回退金额
         */
        public QueryConsumecardWalletredeemableResponse QueryConsumecardWalletredeemable(QueryConsumecardWalletredeemableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardWalletredeemableEx(request, headers, runtime);
        }

        /**
         * Description: 注销前需要回退资金,查询账户可回退金额
         * Summary: 数字商品服务-消费卡服务-查询可回退金额
         */
        public async Task<QueryConsumecardWalletredeemableResponse> QueryConsumecardWalletredeemableAsync(QueryConsumecardWalletredeemableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardWalletredeemableExAsync(request, headers, runtime);
        }

        /**
         * Description: 注销前需要回退资金,查询账户可回退金额
         * Summary: 数字商品服务-消费卡服务-查询可回退金额
         */
        public QueryConsumecardWalletredeemableResponse QueryConsumecardWalletredeemableEx(QueryConsumecardWalletredeemableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardWalletredeemableResponse>(DoRequest("1.0", "baas.antdao.consumecard.walletredeemable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销前需要回退资金,查询账户可回退金额
         * Summary: 数字商品服务-消费卡服务-查询可回退金额
         */
        public async Task<QueryConsumecardWalletredeemableResponse> QueryConsumecardWalletredeemableExAsync(QueryConsumecardWalletredeemableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardWalletredeemableResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.walletredeemable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布商品是异步流程，根据requestId查询商品发布结果
         * Summary: 数字商品服务-消费卡服务-查询商品发布
         */
        public QueryConsumecardGoodscreateresultResponse QueryConsumecardGoodscreateresult(QueryConsumecardGoodscreateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardGoodscreateresultEx(request, headers, runtime);
        }

        /**
         * Description: 发布商品是异步流程，根据requestId查询商品发布结果
         * Summary: 数字商品服务-消费卡服务-查询商品发布
         */
        public async Task<QueryConsumecardGoodscreateresultResponse> QueryConsumecardGoodscreateresultAsync(QueryConsumecardGoodscreateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardGoodscreateresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布商品是异步流程，根据requestId查询商品发布结果
         * Summary: 数字商品服务-消费卡服务-查询商品发布
         */
        public QueryConsumecardGoodscreateresultResponse QueryConsumecardGoodscreateresultEx(QueryConsumecardGoodscreateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodscreateresultResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodscreateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布商品是异步流程，根据requestId查询商品发布结果
         * Summary: 数字商品服务-消费卡服务-查询商品发布
         */
        public async Task<QueryConsumecardGoodscreateresultResponse> QueryConsumecardGoodscreateresultExAsync(QueryConsumecardGoodscreateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodscreateresultResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodscreateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消费卡商品信息
         * Summary: 数字商品服务-消费卡服务-查询商品信息
         */
        public QueryConsumecardGoodsResponse QueryConsumecardGoods(QueryConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 查询消费卡商品信息
         * Summary: 数字商品服务-消费卡服务-查询商品信息
         */
        public async Task<QueryConsumecardGoodsResponse> QueryConsumecardGoodsAsync(QueryConsumecardGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询消费卡商品信息
         * Summary: 数字商品服务-消费卡服务-查询商品信息
         */
        public QueryConsumecardGoodsResponse QueryConsumecardGoodsEx(QueryConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsResponse>(DoRequest("1.0", "baas.antdao.consumecard.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消费卡商品信息
         * Summary: 数字商品服务-消费卡服务-查询商品信息
         */
        public async Task<QueryConsumecardGoodsResponse> QueryConsumecardGoodsExAsync(QueryConsumecardGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单退款申请
         * Summary: 数字商品服务-消费卡服务-账单退款申请
         */
        public ApplyConsumecardBillrefundResponse ApplyConsumecardBillrefund(ApplyConsumecardBillrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyConsumecardBillrefundEx(request, headers, runtime);
        }

        /**
         * Description: 账单退款申请
         * Summary: 数字商品服务-消费卡服务-账单退款申请
         */
        public async Task<ApplyConsumecardBillrefundResponse> ApplyConsumecardBillrefundAsync(ApplyConsumecardBillrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyConsumecardBillrefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 账单退款申请
         * Summary: 数字商品服务-消费卡服务-账单退款申请
         */
        public ApplyConsumecardBillrefundResponse ApplyConsumecardBillrefundEx(ApplyConsumecardBillrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardBillrefundResponse>(DoRequest("1.0", "baas.antdao.consumecard.billrefund.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账单退款申请
         * Summary: 数字商品服务-消费卡服务-账单退款申请
         */
        public async Task<ApplyConsumecardBillrefundResponse> ApplyConsumecardBillrefundExAsync(ApplyConsumecardBillrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyConsumecardBillrefundResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billrefund.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交易信息
         * Summary: 数字商品服务-消费卡服务-交易查询
         */
        public QueryConsumecardPurchaseResponse QueryConsumecardPurchase(QueryConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardPurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 查询交易信息
         * Summary: 数字商品服务-消费卡服务-交易查询
         */
        public async Task<QueryConsumecardPurchaseResponse> QueryConsumecardPurchaseAsync(QueryConsumecardPurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardPurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询交易信息
         * Summary: 数字商品服务-消费卡服务-交易查询
         */
        public QueryConsumecardPurchaseResponse QueryConsumecardPurchaseEx(QueryConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardPurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.purchase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交易信息
         * Summary: 数字商品服务-消费卡服务-交易查询
         */
        public async Task<QueryConsumecardPurchaseResponse> QueryConsumecardPurchaseExAsync(QueryConsumecardPurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardPurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.purchase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-消费卡服务-获取区块
         */
        public QueryConsumecardBlockResponse QueryConsumecardBlock(QueryConsumecardBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardBlockEx(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-消费卡服务-获取区块
         */
        public async Task<QueryConsumecardBlockResponse> QueryConsumecardBlockAsync(QueryConsumecardBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardBlockExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-消费卡服务-获取区块
         */
        public QueryConsumecardBlockResponse QueryConsumecardBlockEx(QueryConsumecardBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBlockResponse>(DoRequest("1.0", "baas.antdao.consumecard.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-消费卡服务-获取区块
         */
        public async Task<QueryConsumecardBlockResponse> QueryConsumecardBlockExAsync(QueryConsumecardBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBlockResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最新区块高度
         * Summary: 数字商品服务-消费卡服务-查最新区块高度
         */
        public QueryConsumecardLastblocknumberResponse QueryConsumecardLastblocknumber(QueryConsumecardLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardLastblocknumberEx(request, headers, runtime);
        }

        /**
         * Description: 查询最新区块高度
         * Summary: 数字商品服务-消费卡服务-查最新区块高度
         */
        public async Task<QueryConsumecardLastblocknumberResponse> QueryConsumecardLastblocknumberAsync(QueryConsumecardLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardLastblocknumberExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询最新区块高度
         * Summary: 数字商品服务-消费卡服务-查最新区块高度
         */
        public QueryConsumecardLastblocknumberResponse QueryConsumecardLastblocknumberEx(QueryConsumecardLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardLastblocknumberResponse>(DoRequest("1.0", "baas.antdao.consumecard.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最新区块高度
         * Summary: 数字商品服务-消费卡服务-查最新区块高度
         */
        public async Task<QueryConsumecardLastblocknumberResponse> QueryConsumecardLastblocknumberExAsync(QueryConsumecardLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardLastblocknumberResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
         * Summary: 数字商品服务-消费卡服务-更新结果查询
         */
        public QueryConsumecardGoodsupdateresultResponse QueryConsumecardGoodsupdateresult(QueryConsumecardGoodsupdateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardGoodsupdateresultEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
         * Summary: 数字商品服务-消费卡服务-更新结果查询
         */
        public async Task<QueryConsumecardGoodsupdateresultResponse> QueryConsumecardGoodsupdateresultAsync(QueryConsumecardGoodsupdateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardGoodsupdateresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
         * Summary: 数字商品服务-消费卡服务-更新结果查询
         */
        public QueryConsumecardGoodsupdateresultResponse QueryConsumecardGoodsupdateresultEx(QueryConsumecardGoodsupdateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsupdateresultResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodsupdateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
         * Summary: 数字商品服务-消费卡服务-更新结果查询
         */
        public async Task<QueryConsumecardGoodsupdateresultResponse> QueryConsumecardGoodsupdateresultExAsync(QueryConsumecardGoodsupdateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsupdateresultResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodsupdateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家取消交易
         * Summary: 数字商品服务--消费卡服务-卖家取消交易
         */
        public CancelConsumecardSellerpurchaseResponse CancelConsumecardSellerpurchase(CancelConsumecardSellerpurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelConsumecardSellerpurchaseEx(request, headers, runtime);
        }

        /**
         * Description: 卖家取消交易
         * Summary: 数字商品服务--消费卡服务-卖家取消交易
         */
        public async Task<CancelConsumecardSellerpurchaseResponse> CancelConsumecardSellerpurchaseAsync(CancelConsumecardSellerpurchaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelConsumecardSellerpurchaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 卖家取消交易
         * Summary: 数字商品服务--消费卡服务-卖家取消交易
         */
        public CancelConsumecardSellerpurchaseResponse CancelConsumecardSellerpurchaseEx(CancelConsumecardSellerpurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardSellerpurchaseResponse>(DoRequest("1.0", "baas.antdao.consumecard.sellerpurchase.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卖家取消交易
         * Summary: 数字商品服务--消费卡服务-卖家取消交易
         */
        public async Task<CancelConsumecardSellerpurchaseResponse> CancelConsumecardSellerpurchaseExAsync(CancelConsumecardSellerpurchaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelConsumecardSellerpurchaseResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.sellerpurchase.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置商品和账单的手续费信息
         * Summary: 数字商品服务-消费卡服务-配置手续费
         */
        public SetConsumecardCommissionResponse SetConsumecardCommission(SetConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 配置商品和账单的手续费信息
         * Summary: 数字商品服务-消费卡服务-配置手续费
         */
        public async Task<SetConsumecardCommissionResponse> SetConsumecardCommissionAsync(SetConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置商品和账单的手续费信息
         * Summary: 数字商品服务-消费卡服务-配置手续费
         */
        public SetConsumecardCommissionResponse SetConsumecardCommissionEx(SetConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardCommissionResponse>(DoRequest("1.0", "baas.antdao.consumecard.commission.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置商品和账单的手续费信息
         * Summary: 数字商品服务-消费卡服务-配置手续费
         */
        public async Task<SetConsumecardCommissionResponse> SetConsumecardCommissionExAsync(SetConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardCommissionResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commission.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除手续费配置
         * Summary: 数字商品服务-消费卡服务-删除手续费配置
         */
        public RemoveConsumecardCommissionResponse RemoveConsumecardCommission(RemoveConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 删除手续费配置
         * Summary: 数字商品服务-消费卡服务-删除手续费配置
         */
        public async Task<RemoveConsumecardCommissionResponse> RemoveConsumecardCommissionAsync(RemoveConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除手续费配置
         * Summary: 数字商品服务-消费卡服务-删除手续费配置
         */
        public RemoveConsumecardCommissionResponse RemoveConsumecardCommissionEx(RemoveConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionResponse>(DoRequest("1.0", "baas.antdao.consumecard.commission.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除手续费配置
         * Summary: 数字商品服务-消费卡服务-删除手续费配置
         */
        public async Task<RemoveConsumecardCommissionResponse> RemoveConsumecardCommissionExAsync(RemoveConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commission.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询手续费信息
         * Summary: 数字商品服务-消费卡服务-查询手续费信息
         */
        public QueryConsumecardCommissionResponse QueryConsumecardCommission(QueryConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 查询手续费信息
         * Summary: 数字商品服务-消费卡服务-查询手续费信息
         */
        public async Task<QueryConsumecardCommissionResponse> QueryConsumecardCommissionAsync(QueryConsumecardCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询手续费信息
         * Summary: 数字商品服务-消费卡服务-查询手续费信息
         */
        public QueryConsumecardCommissionResponse QueryConsumecardCommissionEx(QueryConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardCommissionResponse>(DoRequest("1.0", "baas.antdao.consumecard.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询手续费信息
         * Summary: 数字商品服务-消费卡服务-查询手续费信息
         */
        public async Task<QueryConsumecardCommissionResponse> QueryConsumecardCommissionExAsync(QueryConsumecardCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardCommissionResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
         * Summary: 数字商品服务-消费卡服务-设置手续费管理
         */
        public SetConsumecardCommissionmanagerResponse SetConsumecardCommissionmanager(SetConsumecardCommissionmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardCommissionmanagerEx(request, headers, runtime);
        }

        /**
         * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
         * Summary: 数字商品服务-消费卡服务-设置手续费管理
         */
        public async Task<SetConsumecardCommissionmanagerResponse> SetConsumecardCommissionmanagerAsync(SetConsumecardCommissionmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardCommissionmanagerExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
         * Summary: 数字商品服务-消费卡服务-设置手续费管理
         */
        public SetConsumecardCommissionmanagerResponse SetConsumecardCommissionmanagerEx(SetConsumecardCommissionmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardCommissionmanagerResponse>(DoRequest("1.0", "baas.antdao.consumecard.commissionmanager.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
         * Summary: 数字商品服务-消费卡服务-设置手续费管理
         */
        public async Task<SetConsumecardCommissionmanagerResponse> SetConsumecardCommissionmanagerExAsync(SetConsumecardCommissionmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardCommissionmanagerResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commissionmanager.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品状态，可以设置为上线或下线
         * Summary: 数字商品服务-消费卡服务-设置商品状态
         */
        public SetConsumecardGoodsstatusResponse SetConsumecardGoodsstatus(SetConsumecardGoodsstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardGoodsstatusEx(request, headers, runtime);
        }

        /**
         * Description: 设置商品状态，可以设置为上线或下线
         * Summary: 数字商品服务-消费卡服务-设置商品状态
         */
        public async Task<SetConsumecardGoodsstatusResponse> SetConsumecardGoodsstatusAsync(SetConsumecardGoodsstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardGoodsstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置商品状态，可以设置为上线或下线
         * Summary: 数字商品服务-消费卡服务-设置商品状态
         */
        public SetConsumecardGoodsstatusResponse SetConsumecardGoodsstatusEx(SetConsumecardGoodsstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardGoodsstatusResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodsstatus.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品状态，可以设置为上线或下线
         * Summary: 数字商品服务-消费卡服务-设置商品状态
         */
        public async Task<SetConsumecardGoodsstatusResponse> SetConsumecardGoodsstatusExAsync(SetConsumecardGoodsstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardGoodsstatusResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodsstatus.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人用户来账付款协议签约
         * Summary: 数字商品-消费卡服务-个人用户签约
         */
        public CreateConsumecardReceiptcontractResponse CreateConsumecardReceiptcontract(CreateConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardReceiptcontractEx(request, headers, runtime);
        }

        /**
         * Description: 个人用户来账付款协议签约
         * Summary: 数字商品-消费卡服务-个人用户签约
         */
        public async Task<CreateConsumecardReceiptcontractResponse> CreateConsumecardReceiptcontractAsync(CreateConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardReceiptcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人用户来账付款协议签约
         * Summary: 数字商品-消费卡服务-个人用户签约
         */
        public CreateConsumecardReceiptcontractResponse CreateConsumecardReceiptcontractEx(CreateConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardReceiptcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.receiptcontract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人用户来账付款协议签约
         * Summary: 数字商品-消费卡服务-个人用户签约
         */
        public async Task<CreateConsumecardReceiptcontractResponse> CreateConsumecardReceiptcontractExAsync(CreateConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardReceiptcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.receiptcontract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 来账协议解约接口
         * Summary: 数字商品-消费卡服务-个人协议解约
         */
        public RemoveConsumecardReceiptcontractResponse RemoveConsumecardReceiptcontract(RemoveConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardReceiptcontractEx(request, headers, runtime);
        }

        /**
         * Description: 来账协议解约接口
         * Summary: 数字商品-消费卡服务-个人协议解约
         */
        public async Task<RemoveConsumecardReceiptcontractResponse> RemoveConsumecardReceiptcontractAsync(RemoveConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardReceiptcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 来账协议解约接口
         * Summary: 数字商品-消费卡服务-个人协议解约
         */
        public RemoveConsumecardReceiptcontractResponse RemoveConsumecardReceiptcontractEx(RemoveConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardReceiptcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.receiptcontract.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 来账协议解约接口
         * Summary: 数字商品-消费卡服务-个人协议解约
         */
        public async Task<RemoveConsumecardReceiptcontractResponse> RemoveConsumecardReceiptcontractExAsync(RemoveConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardReceiptcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.receiptcontract.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 来账协议查询接口
         * Summary: 数字商品-消费卡服务-个人协议查询
         */
        public QueryConsumecardReceiptcontractResponse QueryConsumecardReceiptcontract(QueryConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardReceiptcontractEx(request, headers, runtime);
        }

        /**
         * Description: 来账协议查询接口
         * Summary: 数字商品-消费卡服务-个人协议查询
         */
        public async Task<QueryConsumecardReceiptcontractResponse> QueryConsumecardReceiptcontractAsync(QueryConsumecardReceiptcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardReceiptcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 来账协议查询接口
         * Summary: 数字商品-消费卡服务-个人协议查询
         */
        public QueryConsumecardReceiptcontractResponse QueryConsumecardReceiptcontractEx(QueryConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardReceiptcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.receiptcontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 来账协议查询接口
         * Summary: 数字商品-消费卡服务-个人协议查询
         */
        public async Task<QueryConsumecardReceiptcontractResponse> QueryConsumecardReceiptcontractExAsync(QueryConsumecardReceiptcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardReceiptcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.receiptcontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议签约
         * Summary: 数字商品-消费卡服务-商家用户签约
         */
        public CreateConsumecardBillingcontractResponse CreateConsumecardBillingcontract(CreateConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumecardBillingcontractEx(request, headers, runtime);
        }

        /**
         * Description: 收单协议签约
         * Summary: 数字商品-消费卡服务-商家用户签约
         */
        public async Task<CreateConsumecardBillingcontractResponse> CreateConsumecardBillingcontractAsync(CreateConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumecardBillingcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 收单协议签约
         * Summary: 数字商品-消费卡服务-商家用户签约
         */
        public CreateConsumecardBillingcontractResponse CreateConsumecardBillingcontractEx(CreateConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardBillingcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.billingcontract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议签约
         * Summary: 数字商品-消费卡服务-商家用户签约
         */
        public async Task<CreateConsumecardBillingcontractResponse> CreateConsumecardBillingcontractExAsync(CreateConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumecardBillingcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billingcontract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议解约
         * Summary: 数字商品-消费卡服务-商家协议解约
         */
        public RemoveConsumecardBillingcontractResponse RemoveConsumecardBillingcontract(RemoveConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardBillingcontractEx(request, headers, runtime);
        }

        /**
         * Description: 收单协议解约
         * Summary: 数字商品-消费卡服务-商家协议解约
         */
        public async Task<RemoveConsumecardBillingcontractResponse> RemoveConsumecardBillingcontractAsync(RemoveConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardBillingcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 收单协议解约
         * Summary: 数字商品-消费卡服务-商家协议解约
         */
        public RemoveConsumecardBillingcontractResponse RemoveConsumecardBillingcontractEx(RemoveConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardBillingcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.billingcontract.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议解约
         * Summary: 数字商品-消费卡服务-商家协议解约
         */
        public async Task<RemoveConsumecardBillingcontractResponse> RemoveConsumecardBillingcontractExAsync(RemoveConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardBillingcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billingcontract.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议签约查询
         * Summary: 数字商品-消费卡服务-商家协议查询
         */
        public QueryConsumecardBillingcontractResponse QueryConsumecardBillingcontract(QueryConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardBillingcontractEx(request, headers, runtime);
        }

        /**
         * Description: 收单协议签约查询
         * Summary: 数字商品-消费卡服务-商家协议查询
         */
        public async Task<QueryConsumecardBillingcontractResponse> QueryConsumecardBillingcontractAsync(QueryConsumecardBillingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardBillingcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 收单协议签约查询
         * Summary: 数字商品-消费卡服务-商家协议查询
         */
        public QueryConsumecardBillingcontractResponse QueryConsumecardBillingcontractEx(QueryConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBillingcontractResponse>(DoRequest("1.0", "baas.antdao.consumecard.billingcontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收单协议签约查询
         * Summary: 数字商品-消费卡服务-商家协议查询
         */
        public async Task<QueryConsumecardBillingcontractResponse> QueryConsumecardBillingcontractExAsync(QueryConsumecardBillingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardBillingcontractResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.billingcontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增加一级分账方
         * Summary: 数字商品服务-消费卡服务-增加一级分账方
         */
        public AddConsumecardCommissionpartyResponse AddConsumecardCommissionparty(AddConsumecardCommissionpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddConsumecardCommissionpartyEx(request, headers, runtime);
        }

        /**
         * Description: 增加一级分账方
         * Summary: 数字商品服务-消费卡服务-增加一级分账方
         */
        public async Task<AddConsumecardCommissionpartyResponse> AddConsumecardCommissionpartyAsync(AddConsumecardCommissionpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddConsumecardCommissionpartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 增加一级分账方
         * Summary: 数字商品服务-消费卡服务-增加一级分账方
         */
        public AddConsumecardCommissionpartyResponse AddConsumecardCommissionpartyEx(AddConsumecardCommissionpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddConsumecardCommissionpartyResponse>(DoRequest("1.0", "baas.antdao.consumecard.commissionparty.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增加一级分账方
         * Summary: 数字商品服务-消费卡服务-增加一级分账方
         */
        public async Task<AddConsumecardCommissionpartyResponse> AddConsumecardCommissionpartyExAsync(AddConsumecardCommissionpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddConsumecardCommissionpartyResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commissionparty.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一级分账方
         * Summary: 数字商品服务-消费卡服务-删除一级分账方
         */
        public RemoveConsumecardCommissionpartyResponse RemoveConsumecardCommissionparty(RemoveConsumecardCommissionpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardCommissionpartyEx(request, headers, runtime);
        }

        /**
         * Description: 删除一级分账方
         * Summary: 数字商品服务-消费卡服务-删除一级分账方
         */
        public async Task<RemoveConsumecardCommissionpartyResponse> RemoveConsumecardCommissionpartyAsync(RemoveConsumecardCommissionpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardCommissionpartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一级分账方
         * Summary: 数字商品服务-消费卡服务-删除一级分账方
         */
        public RemoveConsumecardCommissionpartyResponse RemoveConsumecardCommissionpartyEx(RemoveConsumecardCommissionpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionpartyResponse>(DoRequest("1.0", "baas.antdao.consumecard.commissionparty.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一级分账方
         * Summary: 数字商品服务-消费卡服务-删除一级分账方
         */
        public async Task<RemoveConsumecardCommissionpartyResponse> RemoveConsumecardCommissionpartyExAsync(RemoveConsumecardCommissionpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionpartyResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commissionparty.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增加手续费周期
         * Summary: 数字商品服务-消费卡服务-增加手续费周期
         */
        public AddConsumecardCommissionperiodResponse AddConsumecardCommissionperiod(AddConsumecardCommissionperiodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddConsumecardCommissionperiodEx(request, headers, runtime);
        }

        /**
         * Description: 增加手续费周期
         * Summary: 数字商品服务-消费卡服务-增加手续费周期
         */
        public async Task<AddConsumecardCommissionperiodResponse> AddConsumecardCommissionperiodAsync(AddConsumecardCommissionperiodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddConsumecardCommissionperiodExAsync(request, headers, runtime);
        }

        /**
         * Description: 增加手续费周期
         * Summary: 数字商品服务-消费卡服务-增加手续费周期
         */
        public AddConsumecardCommissionperiodResponse AddConsumecardCommissionperiodEx(AddConsumecardCommissionperiodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddConsumecardCommissionperiodResponse>(DoRequest("1.0", "baas.antdao.consumecard.commissionperiod.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增加手续费周期
         * Summary: 数字商品服务-消费卡服务-增加手续费周期
         */
        public async Task<AddConsumecardCommissionperiodResponse> AddConsumecardCommissionperiodExAsync(AddConsumecardCommissionperiodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddConsumecardCommissionperiodResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commissionperiod.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除手续费周期
         * Summary: 数字商品服务-消费卡服务-删除手续费周期
         */
        public RemoveConsumecardCommissionperiodResponse RemoveConsumecardCommissionperiod(RemoveConsumecardCommissionperiodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardCommissionperiodEx(request, headers, runtime);
        }

        /**
         * Description: 删除手续费周期
         * Summary: 数字商品服务-消费卡服务-删除手续费周期
         */
        public async Task<RemoveConsumecardCommissionperiodResponse> RemoveConsumecardCommissionperiodAsync(RemoveConsumecardCommissionperiodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardCommissionperiodExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除手续费周期
         * Summary: 数字商品服务-消费卡服务-删除手续费周期
         */
        public RemoveConsumecardCommissionperiodResponse RemoveConsumecardCommissionperiodEx(RemoveConsumecardCommissionperiodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionperiodResponse>(DoRequest("1.0", "baas.antdao.consumecard.commissionperiod.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除手续费周期
         * Summary: 数字商品服务-消费卡服务-删除手续费周期
         */
        public async Task<RemoveConsumecardCommissionperiodResponse> RemoveConsumecardCommissionperiodExAsync(RemoveConsumecardCommissionperiodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardCommissionperiodResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.commissionperiod.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计信息
         * Summary: 数字商品服务-消费卡服务-查询统计信息
         */
        public QueryConsumecardCounterResponse QueryConsumecardCounter(QueryConsumecardCounterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardCounterEx(request, headers, runtime);
        }

        /**
         * Description: 查询统计信息
         * Summary: 数字商品服务-消费卡服务-查询统计信息
         */
        public async Task<QueryConsumecardCounterResponse> QueryConsumecardCounterAsync(QueryConsumecardCounterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardCounterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统计信息
         * Summary: 数字商品服务-消费卡服务-查询统计信息
         */
        public QueryConsumecardCounterResponse QueryConsumecardCounterEx(QueryConsumecardCounterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardCounterResponse>(DoRequest("1.0", "baas.antdao.consumecard.counter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计信息
         * Summary: 数字商品服务-消费卡服务-查询统计信息
         */
        public async Task<QueryConsumecardCounterResponse> QueryConsumecardCounterExAsync(QueryConsumecardCounterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardCounterResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.counter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理接口：配置场景码权限信息
         * Summary: 数字商品服务-消费卡服务-场景码配置
         */
        public SetConsumecardProductcodeResponse SetConsumecardProductcode(SetConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumecardProductcodeEx(request, headers, runtime);
        }

        /**
         * Description: 管理接口：配置场景码权限信息
         * Summary: 数字商品服务-消费卡服务-场景码配置
         */
        public async Task<SetConsumecardProductcodeResponse> SetConsumecardProductcodeAsync(SetConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumecardProductcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理接口：配置场景码权限信息
         * Summary: 数字商品服务-消费卡服务-场景码配置
         */
        public SetConsumecardProductcodeResponse SetConsumecardProductcodeEx(SetConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardProductcodeResponse>(DoRequest("1.0", "baas.antdao.consumecard.productcode.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理接口：配置场景码权限信息
         * Summary: 数字商品服务-消费卡服务-场景码配置
         */
        public async Task<SetConsumecardProductcodeResponse> SetConsumecardProductcodeExAsync(SetConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumecardProductcodeResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.productcode.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已配置的场景码信息
         * Summary: 数字商品服务-消费卡服务-查询场景码配置
         */
        public QueryConsumecardProductcodeResponse QueryConsumecardProductcode(QueryConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardProductcodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询已配置的场景码信息
         * Summary: 数字商品服务-消费卡服务-查询场景码配置
         */
        public async Task<QueryConsumecardProductcodeResponse> QueryConsumecardProductcodeAsync(QueryConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardProductcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已配置的场景码信息
         * Summary: 数字商品服务-消费卡服务-查询场景码配置
         */
        public QueryConsumecardProductcodeResponse QueryConsumecardProductcodeEx(QueryConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardProductcodeResponse>(DoRequest("1.0", "baas.antdao.consumecard.productcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已配置的场景码信息
         * Summary: 数字商品服务-消费卡服务-查询场景码配置
         */
        public async Task<QueryConsumecardProductcodeResponse> QueryConsumecardProductcodeExAsync(QueryConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardProductcodeResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.productcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除场景码配置
         * Summary: 数字商品服务-消费卡服务-删除场景码配置
         */
        public RemoveConsumecardProductcodeResponse RemoveConsumecardProductcode(RemoveConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveConsumecardProductcodeEx(request, headers, runtime);
        }

        /**
         * Description: 删除场景码配置
         * Summary: 数字商品服务-消费卡服务-删除场景码配置
         */
        public async Task<RemoveConsumecardProductcodeResponse> RemoveConsumecardProductcodeAsync(RemoveConsumecardProductcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveConsumecardProductcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除场景码配置
         * Summary: 数字商品服务-消费卡服务-删除场景码配置
         */
        public RemoveConsumecardProductcodeResponse RemoveConsumecardProductcodeEx(RemoveConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardProductcodeResponse>(DoRequest("1.0", "baas.antdao.consumecard.productcode.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除场景码配置
         * Summary: 数字商品服务-消费卡服务-删除场景码配置
         */
        public async Task<RemoveConsumecardProductcodeResponse> RemoveConsumecardProductcodeExAsync(RemoveConsumecardProductcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveConsumecardProductcodeResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.productcode.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据图片不可访问URl 获取可以访问的临时URL
         * Summary: 数字商品服务-消费卡服务-查询图片URL
         */
        public QueryConsumecardGoodsimageResponse QueryConsumecardGoodsimage(QueryConsumecardGoodsimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConsumecardGoodsimageEx(request, headers, runtime);
        }

        /**
         * Description: 根据图片不可访问URl 获取可以访问的临时URL
         * Summary: 数字商品服务-消费卡服务-查询图片URL
         */
        public async Task<QueryConsumecardGoodsimageResponse> QueryConsumecardGoodsimageAsync(QueryConsumecardGoodsimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConsumecardGoodsimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据图片不可访问URl 获取可以访问的临时URL
         * Summary: 数字商品服务-消费卡服务-查询图片URL
         */
        public QueryConsumecardGoodsimageResponse QueryConsumecardGoodsimageEx(QueryConsumecardGoodsimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsimageResponse>(DoRequest("1.0", "baas.antdao.consumecard.goodsimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据图片不可访问URl 获取可以访问的临时URL
         * Summary: 数字商品服务-消费卡服务-查询图片URL
         */
        public async Task<QueryConsumecardGoodsimageResponse> QueryConsumecardGoodsimageExAsync(QueryConsumecardGoodsimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConsumecardGoodsimageResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.goodsimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件API，上传文件
         * Summary: 数字商品服务-文件服务-上传文件
         */
        public UploadConsumecardFileResponse UploadConsumecardFile(UploadConsumecardFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadConsumecardFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件API，上传文件
         * Summary: 数字商品服务-文件服务-上传文件
         */
        public async Task<UploadConsumecardFileResponse> UploadConsumecardFileAsync(UploadConsumecardFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadConsumecardFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件API，上传文件
         * Summary: 数字商品服务-文件服务-上传文件
         */
        public UploadConsumecardFileResponse UploadConsumecardFileEx(UploadConsumecardFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "baas.antdao.consumecard.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadConsumecardFileResponse uploadConsumecardFileResponse = new UploadConsumecardFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadConsumecardFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadConsumecardFileResponse>(DoRequest("1.0", "baas.antdao.consumecard.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件API，上传文件
         * Summary: 数字商品服务-文件服务-上传文件
         */
        public async Task<UploadConsumecardFileResponse> UploadConsumecardFileExAsync(UploadConsumecardFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "baas.antdao.consumecard.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadConsumecardFileResponse uploadConsumecardFileResponse = new UploadConsumecardFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadConsumecardFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadConsumecardFileResponse>(await DoRequestAsync("1.0", "baas.antdao.consumecard.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-查询电子券
         */
        public QueryCouponResponse QueryCoupon(QueryCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponEx(request, headers, runtime);
        }

        /**
         * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-查询电子券
         */
        public async Task<QueryCouponResponse> QueryCouponAsync(QueryCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-查询电子券
         */
        public QueryCouponResponse QueryCouponEx(QueryCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponResponse>(DoRequest("1.0", "baas.antdao.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-查询电子券
         */
        public async Task<QueryCouponResponse> QueryCouponExAsync(QueryCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个电子券接口
         * Summary: 数字商品服务-电子券服务-创建单个电子券
         */
        public CreateCouponResponse CreateCoupon(CreateCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCouponEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个电子券接口
         * Summary: 数字商品服务-电子券服务-创建单个电子券
         */
        public async Task<CreateCouponResponse> CreateCouponAsync(CreateCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个电子券接口
         * Summary: 数字商品服务-电子券服务-创建单个电子券
         */
        public CreateCouponResponse CreateCouponEx(CreateCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponResponse>(DoRequest("1.0", "baas.antdao.coupon.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个电子券接口
         * Summary: 数字商品服务-电子券服务-创建单个电子券
         */
        public async Task<CreateCouponResponse> CreateCouponExAsync(CreateCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
         * Summary: 数字商品服务-电子券服务-电子券风控禁用
         */
        public ExecCouponForbiddenResponse ExecCouponForbidden(ExecCouponForbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponForbiddenEx(request, headers, runtime);
        }

        /**
         * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
         * Summary: 数字商品服务-电子券服务-电子券风控禁用
         */
        public async Task<ExecCouponForbiddenResponse> ExecCouponForbiddenAsync(ExecCouponForbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponForbiddenExAsync(request, headers, runtime);
        }

        /**
         * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
         * Summary: 数字商品服务-电子券服务-电子券风控禁用
         */
        public ExecCouponForbiddenResponse ExecCouponForbiddenEx(ExecCouponForbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponForbiddenResponse>(DoRequest("1.0", "baas.antdao.coupon.forbidden.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
         * Summary: 数字商品服务-电子券服务-电子券风控禁用
         */
        public async Task<ExecCouponForbiddenResponse> ExecCouponForbiddenExAsync(ExecCouponForbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponForbiddenResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.forbidden.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券更新为可用状态
         * Summary: 数字商品服务-电子券服务-电子券风控启用
         */
        public ExecCouponEnableResponse ExecCouponEnable(ExecCouponEnableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponEnableEx(request, headers, runtime);
        }

        /**
         * Description: 将电子券更新为可用状态
         * Summary: 数字商品服务-电子券服务-电子券风控启用
         */
        public async Task<ExecCouponEnableResponse> ExecCouponEnableAsync(ExecCouponEnableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponEnableExAsync(request, headers, runtime);
        }

        /**
         * Description: 将电子券更新为可用状态
         * Summary: 数字商品服务-电子券服务-电子券风控启用
         */
        public ExecCouponEnableResponse ExecCouponEnableEx(ExecCouponEnableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponEnableResponse>(DoRequest("1.0", "baas.antdao.coupon.enable.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券更新为可用状态
         * Summary: 数字商品服务-电子券服务-电子券风控启用
         */
        public async Task<ExecCouponEnableResponse> ExecCouponEnableExAsync(ExecCouponEnableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponEnableResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.enable.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券状态更新为过期
         * Summary: 数字商品服务-电子券服务-电子券过期
         */
        public ExecCouponExpireResponse ExecCouponExpire(ExecCouponExpireRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponExpireEx(request, headers, runtime);
        }

        /**
         * Description: 将电子券状态更新为过期
         * Summary: 数字商品服务-电子券服务-电子券过期
         */
        public async Task<ExecCouponExpireResponse> ExecCouponExpireAsync(ExecCouponExpireRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponExpireExAsync(request, headers, runtime);
        }

        /**
         * Description: 将电子券状态更新为过期
         * Summary: 数字商品服务-电子券服务-电子券过期
         */
        public ExecCouponExpireResponse ExecCouponExpireEx(ExecCouponExpireRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponExpireResponse>(DoRequest("1.0", "baas.antdao.coupon.expire.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券状态更新为过期
         * Summary: 数字商品服务-电子券服务-电子券过期
         */
        public async Task<ExecCouponExpireResponse> ExecCouponExpireExAsync(ExecCouponExpireRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponExpireResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.expire.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券状态更新为核销
         * Summary: 数字商品服务-电子券服务-电子券核销
         */
        public ExecCouponWriteoffResponse ExecCouponWriteoff(ExecCouponWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponWriteoffEx(request, headers, runtime);
        }

        /**
         * Description: 将电子券状态更新为核销
         * Summary: 数字商品服务-电子券服务-电子券核销
         */
        public async Task<ExecCouponWriteoffResponse> ExecCouponWriteoffAsync(ExecCouponWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponWriteoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 将电子券状态更新为核销
         * Summary: 数字商品服务-电子券服务-电子券核销
         */
        public ExecCouponWriteoffResponse ExecCouponWriteoffEx(ExecCouponWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponWriteoffResponse>(DoRequest("1.0", "baas.antdao.coupon.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券状态更新为核销
         * Summary: 数字商品服务-电子券服务-电子券核销
         */
        public async Task<ExecCouponWriteoffResponse> ExecCouponWriteoffExAsync(ExecCouponWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponWriteoffResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新电子券的激活码状态为已超时
         * Summary: 数字商品服务-电子券服务-券激活码超时
         */
        public ExecCouponTimeoutResponse ExecCouponTimeout(ExecCouponTimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponTimeoutEx(request, headers, runtime);
        }

        /**
         * Description: 更新电子券的激活码状态为已超时
         * Summary: 数字商品服务-电子券服务-券激活码超时
         */
        public async Task<ExecCouponTimeoutResponse> ExecCouponTimeoutAsync(ExecCouponTimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponTimeoutExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新电子券的激活码状态为已超时
         * Summary: 数字商品服务-电子券服务-券激活码超时
         */
        public ExecCouponTimeoutResponse ExecCouponTimeoutEx(ExecCouponTimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponTimeoutResponse>(DoRequest("1.0", "baas.antdao.coupon.timeout.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新电子券的激活码状态为已超时
         * Summary: 数字商品服务-电子券服务-券激活码超时
         */
        public async Task<ExecCouponTimeoutResponse> ExecCouponTimeoutExAsync(ExecCouponTimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponTimeoutResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.timeout.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传激活码，激活电子券
         * Summary: 数字商品服务-电子券服务-激活电子券
         */
        public ExecCouponActivateResponse ExecCouponActivate(ExecCouponActivateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponActivateEx(request, headers, runtime);
        }

        /**
         * Description: 商户上传激活码，激活电子券
         * Summary: 数字商品服务-电子券服务-激活电子券
         */
        public async Task<ExecCouponActivateResponse> ExecCouponActivateAsync(ExecCouponActivateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponActivateExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户上传激活码，激活电子券
         * Summary: 数字商品服务-电子券服务-激活电子券
         */
        public ExecCouponActivateResponse ExecCouponActivateEx(ExecCouponActivateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponActivateResponse>(DoRequest("1.0", "baas.antdao.coupon.activate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传激活码，激活电子券
         * Summary: 数字商品服务-电子券服务-激活电子券
         */
        public async Task<ExecCouponActivateResponse> ExecCouponActivateExAsync(ExecCouponActivateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponActivateResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.activate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券转让给其他用户
         * Summary: 数字商品服务-电子券服务-电子券转让
         */
        public ExecCouponTransferResponse ExecCouponTransfer(ExecCouponTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponTransferEx(request, headers, runtime);
        }

        /**
         * Description: 将电子券转让给其他用户
         * Summary: 数字商品服务-电子券服务-电子券转让
         */
        public async Task<ExecCouponTransferResponse> ExecCouponTransferAsync(ExecCouponTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 将电子券转让给其他用户
         * Summary: 数字商品服务-电子券服务-电子券转让
         */
        public ExecCouponTransferResponse ExecCouponTransferEx(ExecCouponTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponTransferResponse>(DoRequest("1.0", "baas.antdao.coupon.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将电子券转让给其他用户
         * Summary: 数字商品服务-电子券服务-电子券转让
         */
        public async Task<ExecCouponTransferResponse> ExecCouponTransferExAsync(ExecCouponTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponTransferResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
         * Summary: 数字商品服务-电子券服务-电子券记名
         */
        public ExecCouponSignResponse ExecCouponSign(ExecCouponSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponSignEx(request, headers, runtime);
        }

        /**
         * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
         * Summary: 数字商品服务-电子券服务-电子券记名
         */
        public async Task<ExecCouponSignResponse> ExecCouponSignAsync(ExecCouponSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
         * Summary: 数字商品服务-电子券服务-电子券记名
         */
        public ExecCouponSignResponse ExecCouponSignEx(ExecCouponSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponSignResponse>(DoRequest("1.0", "baas.antdao.coupon.sign.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
         * Summary: 数字商品服务-电子券服务-电子券记名
         */
        public async Task<ExecCouponSignResponse> ExecCouponSignExAsync(ExecCouponSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponSignResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.sign.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定电子券，更新为“绑定”状态
         * Summary: 数字商品服务-电子券服务-绑定电子券
         */
        public ExecCouponBindResponse ExecCouponBind(ExecCouponBindRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCouponBindEx(request, headers, runtime);
        }

        /**
         * Description: 绑定电子券，更新为“绑定”状态
         * Summary: 数字商品服务-电子券服务-绑定电子券
         */
        public async Task<ExecCouponBindResponse> ExecCouponBindAsync(ExecCouponBindRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCouponBindExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定电子券，更新为“绑定”状态
         * Summary: 数字商品服务-电子券服务-绑定电子券
         */
        public ExecCouponBindResponse ExecCouponBindEx(ExecCouponBindRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponBindResponse>(DoRequest("1.0", "baas.antdao.coupon.bind.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定电子券，更新为“绑定”状态
         * Summary: 数字商品服务-电子券服务-绑定电子券
         */
        public async Task<ExecCouponBindResponse> ExecCouponBindExAsync(ExecCouponBindRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCouponBindResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.bind.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
         * Summary: 数字商品服务-电子券服务-电子券批量创建
         */
        public BatchcreateCouponResponse BatchcreateCoupon(BatchcreateCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateCouponEx(request, headers, runtime);
        }

        /**
         * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
         * Summary: 数字商品服务-电子券服务-电子券批量创建
         */
        public async Task<BatchcreateCouponResponse> BatchcreateCouponAsync(BatchcreateCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
         * Summary: 数字商品服务-电子券服务-电子券批量创建
         */
        public BatchcreateCouponResponse BatchcreateCouponEx(BatchcreateCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCouponResponse>(DoRequest("1.0", "baas.antdao.coupon.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
         * Summary: 数字商品服务-电子券服务-电子券批量创建
         */
        public async Task<BatchcreateCouponResponse> BatchcreateCouponExAsync(BatchcreateCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCouponResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
         * Summary: 数字商品服务-电子券服务-电子券列表创建
         */
        public CreateCouponListResponse CreateCouponList(CreateCouponListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCouponListEx(request, headers, runtime);
        }

        /**
         * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
         * Summary: 数字商品服务-电子券服务-电子券列表创建
         */
        public async Task<CreateCouponListResponse> CreateCouponListAsync(CreateCouponListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCouponListExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
         * Summary: 数字商品服务-电子券服务-电子券列表创建
         */
        public CreateCouponListResponse CreateCouponListEx(CreateCouponListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponListResponse>(DoRequest("1.0", "baas.antdao.coupon.list.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
         * Summary: 数字商品服务-电子券服务-电子券列表创建
         */
        public async Task<CreateCouponListResponse> CreateCouponListExAsync(CreateCouponListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponListResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.list.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
         * Summary: 数字商品服务-电子券服务-创建电子券批次
         */
        public CreateCouponCollectionResponse CreateCouponCollection(CreateCouponCollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCouponCollectionEx(request, headers, runtime);
        }

        /**
         * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
         * Summary: 数字商品服务-电子券服务-创建电子券批次
         */
        public async Task<CreateCouponCollectionResponse> CreateCouponCollectionAsync(CreateCouponCollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCouponCollectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
         * Summary: 数字商品服务-电子券服务-创建电子券批次
         */
        public CreateCouponCollectionResponse CreateCouponCollectionEx(CreateCouponCollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponCollectionResponse>(DoRequest("1.0", "baas.antdao.coupon.collection.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
         * Summary: 数字商品服务-电子券服务-创建电子券批次
         */
        public async Task<CreateCouponCollectionResponse> CreateCouponCollectionExAsync(CreateCouponCollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCouponCollectionResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.collection.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-电子券批次查询
         */
        public QueryCouponCollectionResponse QueryCouponCollection(QueryCouponCollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponCollectionEx(request, headers, runtime);
        }

        /**
         * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-电子券批次查询
         */
        public async Task<QueryCouponCollectionResponse> QueryCouponCollectionAsync(QueryCouponCollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponCollectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-电子券批次查询
         */
        public QueryCouponCollectionResponse QueryCouponCollectionEx(QueryCouponCollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponCollectionResponse>(DoRequest("1.0", "baas.antdao.coupon.collection.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
         * Summary: 数字商品服务-电子券服务-电子券批次查询
         */
        public async Task<QueryCouponCollectionResponse> QueryCouponCollectionExAsync(QueryCouponCollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponCollectionResponse>(await DoRequestAsync("1.0", "baas.antdao.coupon.collection.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询调用商户下的用户信息
         * Summary: 数字商品服务-商户管理-查询用户信息
         */
        public QueryMerchantUserResponse QueryMerchantUser(QueryMerchantUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询调用商户下的用户信息
         * Summary: 数字商品服务-商户管理-查询用户信息
         */
        public async Task<QueryMerchantUserResponse> QueryMerchantUserAsync(QueryMerchantUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询调用商户下的用户信息
         * Summary: 数字商品服务-商户管理-查询用户信息
         */
        public QueryMerchantUserResponse QueryMerchantUserEx(QueryMerchantUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantUserResponse>(DoRequest("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询调用商户下的用户信息
         * Summary: 数字商品服务-商户管理-查询用户信息
         */
        public async Task<QueryMerchantUserResponse> QueryMerchantUserExAsync(QueryMerchantUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantUserResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建商户管理下的用户
         * Summary: 数字商品服务-商户管理-商户创建用户
         */
        public CreateMerchantUserResponse CreateMerchantUser(CreateMerchantUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMerchantUserEx(request, headers, runtime);
        }

        /**
         * Description: 创建商户管理下的用户
         * Summary: 数字商品服务-商户管理-商户创建用户
         */
        public async Task<CreateMerchantUserResponse> CreateMerchantUserAsync(CreateMerchantUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMerchantUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建商户管理下的用户
         * Summary: 数字商品服务-商户管理-商户创建用户
         */
        public CreateMerchantUserResponse CreateMerchantUserEx(CreateMerchantUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantUserResponse>(DoRequest("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建商户管理下的用户
         * Summary: 数字商品服务-商户管理-商户创建用户
         */
        public async Task<CreateMerchantUserResponse> CreateMerchantUserExAsync(CreateMerchantUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantUserResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
         * Summary: 数字商品服务-商户管理-查询商户信息
         */
        public QueryMerchantResponse QueryMerchant(QueryMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
         * Summary: 数字商品服务-商户管理-查询商户信息
         */
        public async Task<QueryMerchantResponse> QueryMerchantAsync(QueryMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
         * Summary: 数字商品服务-商户管理-查询商户信息
         */
        public QueryMerchantResponse QueryMerchantEx(QueryMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantResponse>(DoRequest("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
         * Summary: 数字商品服务-商户管理-查询商户信息
         */
        public async Task<QueryMerchantResponse> QueryMerchantExAsync(QueryMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
         * Summary: 数字商品服务-OSS服务-上传图片
         */
        public UploadImageResponse UploadImage(UploadImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadImageEx(request, headers, runtime);
        }

        /**
         * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
         * Summary: 数字商品服务-OSS服务-上传图片
         */
        public async Task<UploadImageResponse> UploadImageAsync(UploadImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
         * Summary: 数字商品服务-OSS服务-上传图片
         */
        public UploadImageResponse UploadImageEx(UploadImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadImageResponse>(DoRequest("1.0", "baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
         * Summary: 数字商品服务-OSS服务-上传图片
         */
        public async Task<UploadImageResponse> UploadImageExAsync(UploadImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadImageResponse>(await DoRequestAsync("1.0", "baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取kms中对应用户的公钥
         * Summary: 数字商品服务-密钥管理-获取用户公钥
         */
        public GetPkiPublickeyResponse GetPkiPublickey(GetPkiPublickeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPkiPublickeyEx(request, headers, runtime);
        }

        /**
         * Description: 获取kms中对应用户的公钥
         * Summary: 数字商品服务-密钥管理-获取用户公钥
         */
        public async Task<GetPkiPublickeyResponse> GetPkiPublickeyAsync(GetPkiPublickeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPkiPublickeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取kms中对应用户的公钥
         * Summary: 数字商品服务-密钥管理-获取用户公钥
         */
        public GetPkiPublickeyResponse GetPkiPublickeyEx(GetPkiPublickeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPkiPublickeyResponse>(DoRequest("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取kms中对应用户的公钥
         * Summary: 数字商品服务-密钥管理-获取用户公钥
         */
        public async Task<GetPkiPublickeyResponse> GetPkiPublickeyExAsync(GetPkiPublickeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPkiPublickeyResponse>(await DoRequestAsync("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ECC公钥加密接口
         * Summary: 数字商品服务-密钥管理-公钥加密
         */
        public ExecPkiEncryptResponse ExecPkiEncrypt(ExecPkiEncryptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecPkiEncryptEx(request, headers, runtime);
        }

        /**
         * Description: ECC公钥加密接口
         * Summary: 数字商品服务-密钥管理-公钥加密
         */
        public async Task<ExecPkiEncryptResponse> ExecPkiEncryptAsync(ExecPkiEncryptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecPkiEncryptExAsync(request, headers, runtime);
        }

        /**
         * Description: ECC公钥加密接口
         * Summary: 数字商品服务-密钥管理-公钥加密
         */
        public ExecPkiEncryptResponse ExecPkiEncryptEx(ExecPkiEncryptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPkiEncryptResponse>(DoRequest("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ECC公钥加密接口
         * Summary: 数字商品服务-密钥管理-公钥加密
         */
        public async Task<ExecPkiEncryptResponse> ExecPkiEncryptExAsync(ExecPkiEncryptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPkiEncryptResponse>(await DoRequestAsync("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ECC解密算法接口
         * Summary: 数字商品服务-密钥管理-私钥解密
         */
        public ExecPkiDecryptResponse ExecPkiDecrypt(ExecPkiDecryptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecPkiDecryptEx(request, headers, runtime);
        }

        /**
         * Description: ECC解密算法接口
         * Summary: 数字商品服务-密钥管理-私钥解密
         */
        public async Task<ExecPkiDecryptResponse> ExecPkiDecryptAsync(ExecPkiDecryptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecPkiDecryptExAsync(request, headers, runtime);
        }

        /**
         * Description: ECC解密算法接口
         * Summary: 数字商品服务-密钥管理-私钥解密
         */
        public ExecPkiDecryptResponse ExecPkiDecryptEx(ExecPkiDecryptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPkiDecryptResponse>(DoRequest("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ECC解密算法接口
         * Summary: 数字商品服务-密钥管理-私钥解密
         */
        public async Task<ExecPkiDecryptResponse> ExecPkiDecryptExAsync(ExecPkiDecryptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPkiDecryptResponse>(await DoRequestAsync("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商户的友商信息
         * Summary: 数字商品服务-商户管理-更新商户友商
         */
        public UpdateMerchantFriendResponse UpdateMerchantFriend(UpdateMerchantFriendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMerchantFriendEx(request, headers, runtime);
        }

        /**
         * Description: 更新商户的友商信息
         * Summary: 数字商品服务-商户管理-更新商户友商
         */
        public async Task<UpdateMerchantFriendResponse> UpdateMerchantFriendAsync(UpdateMerchantFriendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMerchantFriendExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商户的友商信息
         * Summary: 数字商品服务-商户管理-更新商户友商
         */
        public UpdateMerchantFriendResponse UpdateMerchantFriendEx(UpdateMerchantFriendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantFriendResponse>(DoRequest("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商户的友商信息
         * Summary: 数字商品服务-商户管理-更新商户友商
         */
        public async Task<UpdateMerchantFriendResponse> UpdateMerchantFriendExAsync(UpdateMerchantFriendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantFriendResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品供应商户发布一个商品
         * Summary: 数字商品服务-商品服务-创建商品
         */
        public CreateEquityResponse CreateEquity(CreateEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEquityEx(request, headers, runtime);
        }

        /**
         * Description: 商品供应商户发布一个商品
         * Summary: 数字商品服务-商品服务-创建商品
         */
        public async Task<CreateEquityResponse> CreateEquityAsync(CreateEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEquityExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品供应商户发布一个商品
         * Summary: 数字商品服务-商品服务-创建商品
         */
        public CreateEquityResponse CreateEquityEx(CreateEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEquityResponse>(DoRequest("1.0", "baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品供应商户发布一个商品
         * Summary: 数字商品服务-商品服务-创建商品
         */
        public async Task<CreateEquityResponse> CreateEquityExAsync(CreateEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEquityResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
         * Summary: 数字商品服务-商品服务-下线商品
         */
        public OfflineEquityResponse OfflineEquity(OfflineEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineEquityEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
         * Summary: 数字商品服务-商品服务-下线商品
         */
        public async Task<OfflineEquityResponse> OfflineEquityAsync(OfflineEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineEquityExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
         * Summary: 数字商品服务-商品服务-下线商品
         */
        public OfflineEquityResponse OfflineEquityEx(OfflineEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineEquityResponse>(DoRequest("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
         * Summary: 数字商品服务-商品服务-下线商品
         */
        public async Task<OfflineEquityResponse> OfflineEquityExAsync(OfflineEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineEquityResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
         * Summary: 数字商品服务-商品服务-冻结商品
         */
        public FreezeEquityResponse FreezeEquity(FreezeEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeEquityEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
         * Summary: 数字商品服务-商品服务-冻结商品
         */
        public async Task<FreezeEquityResponse> FreezeEquityAsync(FreezeEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeEquityExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
         * Summary: 数字商品服务-商品服务-冻结商品
         */
        public FreezeEquityResponse FreezeEquityEx(FreezeEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeEquityResponse>(DoRequest("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
         * Summary: 数字商品服务-商品服务-冻结商品
         */
        public async Task<FreezeEquityResponse> FreezeEquityExAsync(FreezeEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeEquityResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权兑换—非公开商品商户配置
         * Summary: 数字商品服务-商品服务-授权兑换
         */
        public OpenEquityMerchantResponse OpenEquityMerchant(OpenEquityMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenEquityMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 授权兑换—非公开商品商户配置
         * Summary: 数字商品服务-商品服务-授权兑换
         */
        public async Task<OpenEquityMerchantResponse> OpenEquityMerchantAsync(OpenEquityMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenEquityMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权兑换—非公开商品商户配置
         * Summary: 数字商品服务-商品服务-授权兑换
         */
        public OpenEquityMerchantResponse OpenEquityMerchantEx(OpenEquityMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenEquityMerchantResponse>(DoRequest("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权兑换—非公开商品商户配置
         * Summary: 数字商品服务-商品服务-授权兑换
         */
        public async Task<OpenEquityMerchantResponse> OpenEquityMerchantExAsync(OpenEquityMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenEquityMerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户兑换价格设置
         * Summary: 数字商品服务-商品服务-用户兑换价格设置
         */
        public AuthEquityMerchantuserpriceResponse AuthEquityMerchantuserprice(AuthEquityMerchantuserpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthEquityMerchantuserpriceEx(request, headers, runtime);
        }

        /**
         * Description: 用户兑换价格设置
         * Summary: 数字商品服务-商品服务-用户兑换价格设置
         */
        public async Task<AuthEquityMerchantuserpriceResponse> AuthEquityMerchantuserpriceAsync(AuthEquityMerchantuserpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthEquityMerchantuserpriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户兑换价格设置
         * Summary: 数字商品服务-商品服务-用户兑换价格设置
         */
        public AuthEquityMerchantuserpriceResponse AuthEquityMerchantuserpriceEx(AuthEquityMerchantuserpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthEquityMerchantuserpriceResponse>(DoRequest("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户兑换价格设置
         * Summary: 数字商品服务-商品服务-用户兑换价格设置
         */
        public async Task<AuthEquityMerchantuserpriceResponse> AuthEquityMerchantuserpriceExAsync(AuthEquityMerchantuserpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthEquityMerchantuserpriceResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
         * Summary: 数字商品服务-商品服务-更新商品价格
         */
        public UpdateEquityDefaultpriceResponse UpdateEquityDefaultprice(UpdateEquityDefaultpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityDefaultpriceEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
         * Summary: 数字商品服务-商品服务-更新商品价格
         */
        public async Task<UpdateEquityDefaultpriceResponse> UpdateEquityDefaultpriceAsync(UpdateEquityDefaultpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityDefaultpriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
         * Summary: 数字商品服务-商品服务-更新商品价格
         */
        public UpdateEquityDefaultpriceResponse UpdateEquityDefaultpriceEx(UpdateEquityDefaultpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityDefaultpriceResponse>(DoRequest("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
         * Summary: 数字商品服务-商品服务-更新商品价格
         */
        public async Task<UpdateEquityDefaultpriceResponse> UpdateEquityDefaultpriceExAsync(UpdateEquityDefaultpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityDefaultpriceResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品自定义定价
         * Summary: 数字商品服务-商品服务-更新自定义定价
         */
        public UpdateEquityTenantpriceResponse UpdateEquityTenantprice(UpdateEquityTenantpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityTenantpriceEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品自定义定价
         * Summary: 数字商品服务-商品服务-更新自定义定价
         */
        public async Task<UpdateEquityTenantpriceResponse> UpdateEquityTenantpriceAsync(UpdateEquityTenantpriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityTenantpriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品自定义定价
         * Summary: 数字商品服务-商品服务-更新自定义定价
         */
        public UpdateEquityTenantpriceResponse UpdateEquityTenantpriceEx(UpdateEquityTenantpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityTenantpriceResponse>(DoRequest("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品自定义定价
         * Summary: 数字商品服务-商品服务-更新自定义定价
         */
        public async Task<UpdateEquityTenantpriceResponse> UpdateEquityTenantpriceExAsync(UpdateEquityTenantpriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityTenantpriceResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
         * Summary: 数字商品服务-商品服务-增加权益库存
         */
        public AddEquityCountResponse AddEquityCount(AddEquityCountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddEquityCountEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
         * Summary: 数字商品服务-商品服务-增加权益库存
         */
        public async Task<AddEquityCountResponse> AddEquityCountAsync(AddEquityCountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddEquityCountExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
         * Summary: 数字商品服务-商品服务-增加权益库存
         */
        public AddEquityCountResponse AddEquityCountEx(AddEquityCountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEquityCountResponse>(DoRequest("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
         * Summary: 数字商品服务-商品服务-增加权益库存
         */
        public async Task<AddEquityCountResponse> AddEquityCountExAsync(AddEquityCountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEquityCountResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
         * Summary: 数字商品服务-商品服务-更新兑换限制规则
         */
        public UpdateEquityExchangelimitResponse UpdateEquityExchangelimit(UpdateEquityExchangelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityExchangelimitEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
         * Summary: 数字商品服务-商品服务-更新兑换限制规则
         */
        public async Task<UpdateEquityExchangelimitResponse> UpdateEquityExchangelimitAsync(UpdateEquityExchangelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityExchangelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
         * Summary: 数字商品服务-商品服务-更新兑换限制规则
         */
        public UpdateEquityExchangelimitResponse UpdateEquityExchangelimitEx(UpdateEquityExchangelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityExchangelimitResponse>(DoRequest("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
         * Summary: 数字商品服务-商品服务-更新兑换限制规则
         */
        public async Task<UpdateEquityExchangelimitResponse> UpdateEquityExchangelimitExAsync(UpdateEquityExchangelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityExchangelimitResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
         * Summary: 数字商品服务-商品服务-更新有效期
         */
        public UpdateEquityValidtimeResponse UpdateEquityValidtime(UpdateEquityValidtimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityValidtimeEx(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
         * Summary: 数字商品服务-商品服务-更新有效期
         */
        public async Task<UpdateEquityValidtimeResponse> UpdateEquityValidtimeAsync(UpdateEquityValidtimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityValidtimeExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
         * Summary: 数字商品服务-商品服务-更新有效期
         */
        public UpdateEquityValidtimeResponse UpdateEquityValidtimeEx(UpdateEquityValidtimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityValidtimeResponse>(DoRequest("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
         * Summary: 数字商品服务-商品服务-更新有效期
         */
        public async Task<UpdateEquityValidtimeResponse> UpdateEquityValidtimeExAsync(UpdateEquityValidtimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityValidtimeResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品信息
         * Summary: 数字商品服务-商品服务-查询商品信息
         */
        public QueryEquityResponse QueryEquity(QueryEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEquityEx(request, headers, runtime);
        }

        /**
         * Description: 查询商品信息
         * Summary: 数字商品服务-商品服务-查询商品信息
         */
        public async Task<QueryEquityResponse> QueryEquityAsync(QueryEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEquityExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商品信息
         * Summary: 数字商品服务-商品服务-查询商品信息
         */
        public QueryEquityResponse QueryEquityEx(QueryEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityResponse>(DoRequest("1.0", "baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品信息
         * Summary: 数字商品服务-商品服务-查询商品信息
         */
        public async Task<QueryEquityResponse> QueryEquityExAsync(QueryEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户身份发起兑换
         * Summary: 数字商品服务-兑换服务-用户身份发起兑换
         */
        public ExecExchangeByuserResponse ExecExchangeByuser(ExecExchangeByuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeByuserEx(request, headers, runtime);
        }

        /**
         * Description: 用户身份发起兑换
         * Summary: 数字商品服务-兑换服务-用户身份发起兑换
         */
        public async Task<ExecExchangeByuserResponse> ExecExchangeByuserAsync(ExecExchangeByuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeByuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户身份发起兑换
         * Summary: 数字商品服务-兑换服务-用户身份发起兑换
         */
        public ExecExchangeByuserResponse ExecExchangeByuserEx(ExecExchangeByuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeByuserResponse>(DoRequest("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户身份发起兑换
         * Summary: 数字商品服务-兑换服务-用户身份发起兑换
         */
        public async Task<ExecExchangeByuserResponse> ExecExchangeByuserExAsync(ExecExchangeByuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeByuserResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户身份发起兑换
         * Summary: 数字商品服务-兑换服务-商户身份发起兑换
         */
        public ExecExchangeBymerchantResponse ExecExchangeBymerchant(ExecExchangeBymerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeBymerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户身份发起兑换
         * Summary: 数字商品服务-兑换服务-商户身份发起兑换
         */
        public async Task<ExecExchangeBymerchantResponse> ExecExchangeBymerchantAsync(ExecExchangeBymerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeBymerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户身份发起兑换
         * Summary: 数字商品服务-兑换服务-商户身份发起兑换
         */
        public ExecExchangeBymerchantResponse ExecExchangeBymerchantEx(ExecExchangeBymerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeBymerchantResponse>(DoRequest("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户身份发起兑换
         * Summary: 数字商品服务-兑换服务-商户身份发起兑换
         */
        public async Task<ExecExchangeBymerchantResponse> ExecExchangeBymerchantExAsync(ExecExchangeBymerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeBymerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
         * Summary: 数字商品服务-兑换服务-确认接单
         */
        public ConfirmExchangeResponse ConfirmExchange(ConfirmExchangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmExchangeEx(request, headers, runtime);
        }

        /**
         * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
         * Summary: 数字商品服务-兑换服务-确认接单
         */
        public async Task<ConfirmExchangeResponse> ConfirmExchangeAsync(ConfirmExchangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmExchangeExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
         * Summary: 数字商品服务-兑换服务-确认接单
         */
        public ConfirmExchangeResponse ConfirmExchangeEx(ConfirmExchangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExchangeResponse>(DoRequest("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
         * Summary: 数字商品服务-兑换服务-确认接单
         */
        public async Task<ConfirmExchangeResponse> ConfirmExchangeExAsync(ConfirmExchangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExchangeResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
         * Summary: 数字商品服务-兑换服务-拒绝发货
         */
        public ExecExchangeOutofstoreResponse ExecExchangeOutofstore(ExecExchangeOutofstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeOutofstoreEx(request, headers, runtime);
        }

        /**
         * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
         * Summary: 数字商品服务-兑换服务-拒绝发货
         */
        public async Task<ExecExchangeOutofstoreResponse> ExecExchangeOutofstoreAsync(ExecExchangeOutofstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeOutofstoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
         * Summary: 数字商品服务-兑换服务-拒绝发货
         */
        public ExecExchangeOutofstoreResponse ExecExchangeOutofstoreEx(ExecExchangeOutofstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeOutofstoreResponse>(DoRequest("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
         * Summary: 数字商品服务-兑换服务-拒绝发货
         */
        public async Task<ExecExchangeOutofstoreResponse> ExecExchangeOutofstoreExAsync(ExecExchangeOutofstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeOutofstoreResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 兑换发货
         * Summary: 数字商品服务-兑换服务-兑换发货
         */
        public SendExchangeResponse SendExchange(SendExchangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendExchangeEx(request, headers, runtime);
        }

        /**
         * Description: 兑换发货
         * Summary: 数字商品服务-兑换服务-兑换发货
         */
        public async Task<SendExchangeResponse> SendExchangeAsync(SendExchangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendExchangeExAsync(request, headers, runtime);
        }

        /**
         * Description: 兑换发货
         * Summary: 数字商品服务-兑换服务-兑换发货
         */
        public SendExchangeResponse SendExchangeEx(SendExchangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendExchangeResponse>(DoRequest("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 兑换发货
         * Summary: 数字商品服务-兑换服务-兑换发货
         */
        public async Task<SendExchangeResponse> SendExchangeExAsync(SendExchangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendExchangeResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户身份确认收货
         * Summary: 数字商品服务-兑换服务-用户身份确认收货
         */
        public ExecExchangeReceivebyuserResponse ExecExchangeReceivebyuser(ExecExchangeReceivebyuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeReceivebyuserEx(request, headers, runtime);
        }

        /**
         * Description: 用户身份确认收货
         * Summary: 数字商品服务-兑换服务-用户身份确认收货
         */
        public async Task<ExecExchangeReceivebyuserResponse> ExecExchangeReceivebyuserAsync(ExecExchangeReceivebyuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeReceivebyuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户身份确认收货
         * Summary: 数字商品服务-兑换服务-用户身份确认收货
         */
        public ExecExchangeReceivebyuserResponse ExecExchangeReceivebyuserEx(ExecExchangeReceivebyuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeReceivebyuserResponse>(DoRequest("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户身份确认收货
         * Summary: 数字商品服务-兑换服务-用户身份确认收货
         */
        public async Task<ExecExchangeReceivebyuserResponse> ExecExchangeReceivebyuserExAsync(ExecExchangeReceivebyuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeReceivebyuserResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产过期
         * Summary: 数字商品服务-资产服务-资产过期
         */
        public ExecAssetExpireResponse ExecAssetExpire(ExecAssetExpireRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetExpireEx(request, headers, runtime);
        }

        /**
         * Description: 资产过期
         * Summary: 数字商品服务-资产服务-资产过期
         */
        public async Task<ExecAssetExpireResponse> ExecAssetExpireAsync(ExecAssetExpireRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetExpireExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产过期
         * Summary: 数字商品服务-资产服务-资产过期
         */
        public ExecAssetExpireResponse ExecAssetExpireEx(ExecAssetExpireRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetExpireResponse>(DoRequest("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产过期
         * Summary: 数字商品服务-资产服务-资产过期
         */
        public async Task<ExecAssetExpireResponse> ExecAssetExpireExAsync(ExecAssetExpireRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetExpireResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检索资产流转流水
         * Summary: 数字商品服务-资产服务-查询资产流转流水
         */
        public QueryAssetInstructionResponse QueryAssetInstruction(QueryAssetInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAssetInstructionEx(request, headers, runtime);
        }

        /**
         * Description: 检索资产流转流水
         * Summary: 数字商品服务-资产服务-查询资产流转流水
         */
        public async Task<QueryAssetInstructionResponse> QueryAssetInstructionAsync(QueryAssetInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAssetInstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 检索资产流转流水
         * Summary: 数字商品服务-资产服务-查询资产流转流水
         */
        public QueryAssetInstructionResponse QueryAssetInstructionEx(QueryAssetInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetInstructionResponse>(DoRequest("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检索资产流转流水
         * Summary: 数字商品服务-资产服务-查询资产流转流水
         */
        public async Task<QueryAssetInstructionResponse> QueryAssetInstructionExAsync(QueryAssetInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetInstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口废弃不用！！！
        查询商品兑换流水
         * Summary: 数字商品服务-兑换服务-查询商品兑换流水
         */
        public QueryExchangeInstructionResponse QueryExchangeInstruction(QueryExchangeInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryExchangeInstructionEx(request, headers, runtime);
        }

        /**
         * Description: 该接口废弃不用！！！
        查询商品兑换流水
         * Summary: 数字商品服务-兑换服务-查询商品兑换流水
         */
        public async Task<QueryExchangeInstructionResponse> QueryExchangeInstructionAsync(QueryExchangeInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryExchangeInstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口废弃不用！！！
        查询商品兑换流水
         * Summary: 数字商品服务-兑换服务-查询商品兑换流水
         */
        public QueryExchangeInstructionResponse QueryExchangeInstructionEx(QueryExchangeInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryExchangeInstructionResponse>(DoRequest("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口废弃不用！！！
        查询商品兑换流水
         * Summary: 数字商品服务-兑换服务-查询商品兑换流水
         */
        public async Task<QueryExchangeInstructionResponse> QueryExchangeInstructionExAsync(QueryExchangeInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryExchangeInstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产初始化发行
         * Summary: 数字商品服务-资产服务-资产初始化发行
         */
        public ExecAssetIssueResponse ExecAssetIssue(ExecAssetIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetIssueEx(request, headers, runtime);
        }

        /**
         * Description: 资产初始化发行
         * Summary: 数字商品服务-资产服务-资产初始化发行
         */
        public async Task<ExecAssetIssueResponse> ExecAssetIssueAsync(ExecAssetIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产初始化发行
         * Summary: 数字商品服务-资产服务-资产初始化发行
         */
        public ExecAssetIssueResponse ExecAssetIssueEx(ExecAssetIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetIssueResponse>(DoRequest("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产初始化发行
         * Summary: 数字商品服务-资产服务-资产初始化发行
         */
        public async Task<ExecAssetIssueResponse> ExecAssetIssueExAsync(ExecAssetIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetIssueResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回资产
         * Summary: 数字商品服务-资产服务-赎回资产
         */
        public ExecAssetRedeemResponse ExecAssetRedeem(ExecAssetRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetRedeemEx(request, headers, runtime);
        }

        /**
         * Description: 赎回资产
         * Summary: 数字商品服务-资产服务-赎回资产
         */
        public async Task<ExecAssetRedeemResponse> ExecAssetRedeemAsync(ExecAssetRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetRedeemExAsync(request, headers, runtime);
        }

        /**
         * Description: 赎回资产
         * Summary: 数字商品服务-资产服务-赎回资产
         */
        public ExecAssetRedeemResponse ExecAssetRedeemEx(ExecAssetRedeemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetRedeemResponse>(DoRequest("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回资产
         * Summary: 数字商品服务-资产服务-赎回资产
         */
        public async Task<ExecAssetRedeemResponse> ExecAssetRedeemExAsync(ExecAssetRedeemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetRedeemResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发放资产
         * Summary: 数字商品服务-资产服务-发放资产
         */
        public ExecAssetGrantResponse ExecAssetGrant(ExecAssetGrantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetGrantEx(request, headers, runtime);
        }

        /**
         * Description: 发放资产
         * Summary: 数字商品服务-资产服务-发放资产
         */
        public async Task<ExecAssetGrantResponse> ExecAssetGrantAsync(ExecAssetGrantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetGrantExAsync(request, headers, runtime);
        }

        /**
         * Description: 发放资产
         * Summary: 数字商品服务-资产服务-发放资产
         */
        public ExecAssetGrantResponse ExecAssetGrantEx(ExecAssetGrantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGrantResponse>(DoRequest("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发放资产
         * Summary: 数字商品服务-资产服务-发放资产
         */
        public async Task<ExecAssetGrantResponse> ExecAssetGrantExAsync(ExecAssetGrantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGrantResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发放回退资产
         * Summary: 数字商品服务-资产服务-发放回退资产
         */
        public ExecAssetGrantrefundResponse ExecAssetGrantrefund(ExecAssetGrantrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetGrantrefundEx(request, headers, runtime);
        }

        /**
         * Description: 发放回退资产
         * Summary: 数字商品服务-资产服务-发放回退资产
         */
        public async Task<ExecAssetGrantrefundResponse> ExecAssetGrantrefundAsync(ExecAssetGrantrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetGrantrefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 发放回退资产
         * Summary: 数字商品服务-资产服务-发放回退资产
         */
        public ExecAssetGrantrefundResponse ExecAssetGrantrefundEx(ExecAssetGrantrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGrantrefundResponse>(DoRequest("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发放回退资产
         * Summary: 数字商品服务-资产服务-发放回退资产
         */
        public async Task<ExecAssetGrantrefundResponse> ExecAssetGrantrefundExAsync(ExecAssetGrantrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGrantrefundResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风控调整资产
         * Summary: 数字商品服务-资产服务-风控调整资产
         */
        public ExecAssetAdjustResponse ExecAssetAdjust(ExecAssetAdjustRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetAdjustEx(request, headers, runtime);
        }

        /**
         * Description: 风控调整资产
         * Summary: 数字商品服务-资产服务-风控调整资产
         */
        public async Task<ExecAssetAdjustResponse> ExecAssetAdjustAsync(ExecAssetAdjustRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetAdjustExAsync(request, headers, runtime);
        }

        /**
         * Description: 风控调整资产
         * Summary: 数字商品服务-资产服务-风控调整资产
         */
        public ExecAssetAdjustResponse ExecAssetAdjustEx(ExecAssetAdjustRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetAdjustResponse>(DoRequest("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风控调整资产
         * Summary: 数字商品服务-资产服务-风控调整资产
         */
        public async Task<ExecAssetAdjustResponse> ExecAssetAdjustExAsync(ExecAssetAdjustRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetAdjustResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产查询
         * Summary: 数字商品服务-资产服务-资产查询
         */
        public QueryAssetResponse QueryAsset(QueryAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAssetEx(request, headers, runtime);
        }

        /**
         * Description: 资产查询
         * Summary: 数字商品服务-资产服务-资产查询
         */
        public async Task<QueryAssetResponse> QueryAssetAsync(QueryAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAssetExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产查询
         * Summary: 数字商品服务-资产服务-资产查询
         */
        public QueryAssetResponse QueryAssetEx(QueryAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetResponse>(DoRequest("1.0", "baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产查询
         * Summary: 数字商品服务-资产服务-资产查询
         */
        public async Task<QueryAssetResponse> QueryAssetExAsync(QueryAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户身份确认收货
         * Summary: 数字商品服务-兑换服务-商户身份确认收货
         */
        public ExecExchangeReceivebymerchantResponse ExecExchangeReceivebymerchant(ExecExchangeReceivebymerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeReceivebymerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户身份确认收货
         * Summary: 数字商品服务-兑换服务-商户身份确认收货
         */
        public async Task<ExecExchangeReceivebymerchantResponse> ExecExchangeReceivebymerchantAsync(ExecExchangeReceivebymerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeReceivebymerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户身份确认收货
         * Summary: 数字商品服务-兑换服务-商户身份确认收货
         */
        public ExecExchangeReceivebymerchantResponse ExecExchangeReceivebymerchantEx(ExecExchangeReceivebymerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeReceivebymerchantResponse>(DoRequest("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户身份确认收货
         * Summary: 数字商品服务-兑换服务-商户身份确认收货
         */
        public async Task<ExecExchangeReceivebymerchantResponse> ExecExchangeReceivebymerchantExAsync(ExecExchangeReceivebymerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeReceivebymerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public QueryBlockResponse QueryBlock(QueryBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockEx(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public async Task<QueryBlockResponse> QueryBlockAsync(QueryBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public QueryBlockResponse QueryBlockEx(QueryBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockResponse>(DoRequest("1.0", "baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public async Task<QueryBlockResponse> QueryBlockExAsync(QueryBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockResponse>(await DoRequestAsync("1.0", "baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public QueryBlockLastblocknumberResponse QueryBlockLastblocknumber(QueryBlockLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockLastblocknumberEx(request, headers, runtime);
        }

        /**
         * Description: 获取区块链最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public async Task<QueryBlockLastblocknumberResponse> QueryBlockLastblocknumberAsync(QueryBlockLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockLastblocknumberExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取区块链最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public QueryBlockLastblocknumberResponse QueryBlockLastblocknumberEx(QueryBlockLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockLastblocknumberResponse>(DoRequest("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public async Task<QueryBlockLastblocknumberResponse> QueryBlockLastblocknumberExAsync(QueryBlockLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockLastblocknumberResponse>(await DoRequestAsync("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-商品服务-更新商品属性信息
         */
        public UpdateEquityResponse UpdateEquity(UpdateEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-商品服务-更新商品属性信息
         */
        public async Task<UpdateEquityResponse> UpdateEquityAsync(UpdateEquityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-商品服务-更新商品属性信息
         */
        public UpdateEquityResponse UpdateEquityEx(UpdateEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityResponse>(DoRequest("1.0", "baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品信息
         * Summary: 数字商品服务-商品服务-更新商品属性信息
         */
        public async Task<UpdateEquityResponse> UpdateEquityExAsync(UpdateEquityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
         * Summary: 数字商品服务-商品服务-发布商品结果查询
         */
        public QueryEquityCreateresultResponse QueryEquityCreateresult(QueryEquityCreateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEquityCreateresultEx(request, headers, runtime);
        }

        /**
         * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
         * Summary: 数字商品服务-商品服务-发布商品结果查询
         */
        public async Task<QueryEquityCreateresultResponse> QueryEquityCreateresultAsync(QueryEquityCreateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEquityCreateresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
         * Summary: 数字商品服务-商品服务-发布商品结果查询
         */
        public QueryEquityCreateresultResponse QueryEquityCreateresultEx(QueryEquityCreateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityCreateresultResponse>(DoRequest("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
         * Summary: 数字商品服务-商品服务-发布商品结果查询
         */
        public async Task<QueryEquityCreateresultResponse> QueryEquityCreateresultExAsync(QueryEquityCreateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityCreateresultResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品兑换流水交易号查询商品兑换流水详情
         * Summary: 数字商品服务-商品服务-查询商品兑换流水
         */
        public QueryEquityInstructionResponse QueryEquityInstruction(QueryEquityInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEquityInstructionEx(request, headers, runtime);
        }

        /**
         * Description: 根据商品兑换流水交易号查询商品兑换流水详情
         * Summary: 数字商品服务-商品服务-查询商品兑换流水
         */
        public async Task<QueryEquityInstructionResponse> QueryEquityInstructionAsync(QueryEquityInstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEquityInstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商品兑换流水交易号查询商品兑换流水详情
         * Summary: 数字商品服务-商品服务-查询商品兑换流水
         */
        public QueryEquityInstructionResponse QueryEquityInstructionEx(QueryEquityInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityInstructionResponse>(DoRequest("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品兑换流水交易号查询商品兑换流水详情
         * Summary: 数字商品服务-商品服务-查询商品兑换流水
         */
        public async Task<QueryEquityInstructionResponse> QueryEquityInstructionExAsync(QueryEquityInstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEquityInstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
         * Summary: 数字商品服务-OSS服务-获取图片URL
         */
        public QueryImageResponse QueryImage(QueryImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImageEx(request, headers, runtime);
        }

        /**
         * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
         * Summary: 数字商品服务-OSS服务-获取图片URL
         */
        public async Task<QueryImageResponse> QueryImageAsync(QueryImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
         * Summary: 数字商品服务-OSS服务-获取图片URL
         */
        public QueryImageResponse QueryImageEx(QueryImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageResponse>(DoRequest("1.0", "baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
         * Summary: 数字商品服务-OSS服务-获取图片URL
         */
        public async Task<QueryImageResponse> QueryImageExAsync(QueryImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageResponse>(await DoRequestAsync("1.0", "baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品状态（可用，冻结，下线）
         * Summary: 数字商品服务-商品服务-更新商品状态
         */
        public UpdateEquityStatusResponse UpdateEquityStatus(UpdateEquityStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateEquityStatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品状态（可用，冻结，下线）
         * Summary: 数字商品服务-商品服务-更新商品状态
         */
        public async Task<UpdateEquityStatusResponse> UpdateEquityStatusAsync(UpdateEquityStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateEquityStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品状态（可用，冻结，下线）
         * Summary: 数字商品服务-商品服务-更新商品状态
         */
        public UpdateEquityStatusResponse UpdateEquityStatusEx(UpdateEquityStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityStatusResponse>(DoRequest("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品状态（可用，冻结，下线）
         * Summary: 数字商品服务-商品服务-更新商品状态
         */
        public async Task<UpdateEquityStatusResponse> UpdateEquityStatusExAsync(UpdateEquityStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEquityStatusResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置备付金金额（CAS接口）
         * Summary: 数字商品服务-商户管理-设置备付金金额
         */
        public SetMerchantProvisionResponse SetMerchantProvision(SetMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetMerchantProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 设置备付金金额（CAS接口）
         * Summary: 数字商品服务-商户管理-设置备付金金额
         */
        public async Task<SetMerchantProvisionResponse> SetMerchantProvisionAsync(SetMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetMerchantProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置备付金金额（CAS接口）
         * Summary: 数字商品服务-商户管理-设置备付金金额
         */
        public SetMerchantProvisionResponse SetMerchantProvisionEx(SetMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMerchantProvisionResponse>(DoRequest("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置备付金金额（CAS接口）
         * Summary: 数字商品服务-商户管理-设置备付金金额
         */
        public async Task<SetMerchantProvisionResponse> SetMerchantProvisionExAsync(SetMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMerchantProvisionResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商户的备付金金额，由资金管理员操作
         * Summary: 数字商品服务-商户管理-更新备付金金额
         */
        public UpdateMerchantProvisionResponse UpdateMerchantProvision(UpdateMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMerchantProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 更新商户的备付金金额，由资金管理员操作
         * Summary: 数字商品服务-商户管理-更新备付金金额
         */
        public async Task<UpdateMerchantProvisionResponse> UpdateMerchantProvisionAsync(UpdateMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMerchantProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商户的备付金金额，由资金管理员操作
         * Summary: 数字商品服务-商户管理-更新备付金金额
         */
        public UpdateMerchantProvisionResponse UpdateMerchantProvisionEx(UpdateMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantProvisionResponse>(DoRequest("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商户的备付金金额，由资金管理员操作
         * Summary: 数字商品服务-商户管理-更新备付金金额
         */
        public async Task<UpdateMerchantProvisionResponse> UpdateMerchantProvisionExAsync(UpdateMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMerchantProvisionResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销商品兑换交易，由资金管理员操作
         * Summary: 数字商品服务-商品服务-核销商品兑换交易
         */
        public ExecEquityInstructionwriteoffResponse ExecEquityInstructionwriteoff(ExecEquityInstructionwriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecEquityInstructionwriteoffEx(request, headers, runtime);
        }

        /**
         * Description: 核销商品兑换交易，由资金管理员操作
         * Summary: 数字商品服务-商品服务-核销商品兑换交易
         */
        public async Task<ExecEquityInstructionwriteoffResponse> ExecEquityInstructionwriteoffAsync(ExecEquityInstructionwriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecEquityInstructionwriteoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 核销商品兑换交易，由资金管理员操作
         * Summary: 数字商品服务-商品服务-核销商品兑换交易
         */
        public ExecEquityInstructionwriteoffResponse ExecEquityInstructionwriteoffEx(ExecEquityInstructionwriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEquityInstructionwriteoffResponse>(DoRequest("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销商品兑换交易，由资金管理员操作
         * Summary: 数字商品服务-商品服务-核销商品兑换交易
         */
        public async Task<ExecEquityInstructionwriteoffResponse> ExecEquityInstructionwriteoffExAsync(ExecEquityInstructionwriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEquityInstructionwriteoffResponse>(await DoRequestAsync("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的备付金列表
         * Summary: 数字商品服务-商户管理-查租户备付金列表
         */
        public QueryMerchantProvisionsResponse QueryMerchantProvisions(QueryMerchantProvisionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantProvisionsEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户的备付金列表
         * Summary: 数字商品服务-商户管理-查租户备付金列表
         */
        public async Task<QueryMerchantProvisionsResponse> QueryMerchantProvisionsAsync(QueryMerchantProvisionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantProvisionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户的备付金列表
         * Summary: 数字商品服务-商户管理-查租户备付金列表
         */
        public QueryMerchantProvisionsResponse QueryMerchantProvisionsEx(QueryMerchantProvisionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantProvisionsResponse>(DoRequest("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的备付金列表
         * Summary: 数字商品服务-商户管理-查租户备付金列表
         */
        public async Task<QueryMerchantProvisionsResponse> QueryMerchantProvisionsExAsync(QueryMerchantProvisionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantProvisionsResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
         * Summary: 数字商品服务-商户管理-查询可兑换商品
         */
        public QueryMerchantExchangeableequitylistResponse QueryMerchantExchangeableequitylist(QueryMerchantExchangeableequitylistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantExchangeableequitylistEx(request, headers, runtime);
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
         * Summary: 数字商品服务-商户管理-查询可兑换商品
         */
        public async Task<QueryMerchantExchangeableequitylistResponse> QueryMerchantExchangeableequitylistAsync(QueryMerchantExchangeableequitylistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantExchangeableequitylistExAsync(request, headers, runtime);
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
         * Summary: 数字商品服务-商户管理-查询可兑换商品
         */
        public QueryMerchantExchangeableequitylistResponse QueryMerchantExchangeableequitylistEx(QueryMerchantExchangeableequitylistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantExchangeableequitylistResponse>(DoRequest("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
         * Summary: 数字商品服务-商户管理-查询可兑换商品
         */
        public async Task<QueryMerchantExchangeableequitylistResponse> QueryMerchantExchangeableequitylistExAsync(QueryMerchantExchangeableequitylistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantExchangeableequitylistResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
         * Summary: 数字商品服务-商户管理-查询可兑商品明细
         */
        public QueryMerchantExchangeableequitydetailResponse QueryMerchantExchangeableequitydetail(QueryMerchantExchangeableequitydetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantExchangeableequitydetailEx(request, headers, runtime);
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
         * Summary: 数字商品服务-商户管理-查询可兑商品明细
         */
        public async Task<QueryMerchantExchangeableequitydetailResponse> QueryMerchantExchangeableequitydetailAsync(QueryMerchantExchangeableequitydetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantExchangeableequitydetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
         * Summary: 数字商品服务-商户管理-查询可兑商品明细
         */
        public QueryMerchantExchangeableequitydetailResponse QueryMerchantExchangeableequitydetailEx(QueryMerchantExchangeableequitydetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantExchangeableequitydetailResponse>(DoRequest("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
         * Summary: 数字商品服务-商户管理-查询可兑商品明细
         */
        public async Task<QueryMerchantExchangeableequitydetailResponse> QueryMerchantExchangeableequitydetailExAsync(QueryMerchantExchangeableequitydetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantExchangeableequitydetailResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建新资产
         * Summary: 数字商品服务-资产服务-创建资产
         */
        public ExecAssetCreateResponse ExecAssetCreate(ExecAssetCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetCreateEx(request, headers, runtime);
        }

        /**
         * Description: 创建新资产
         * Summary: 数字商品服务-资产服务-创建资产
         */
        public async Task<ExecAssetCreateResponse> ExecAssetCreateAsync(ExecAssetCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetCreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建新资产
         * Summary: 数字商品服务-资产服务-创建资产
         */
        public ExecAssetCreateResponse ExecAssetCreateEx(ExecAssetCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetCreateResponse>(DoRequest("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建新资产
         * Summary: 数字商品服务-资产服务-创建资产
         */
        public async Task<ExecAssetCreateResponse> ExecAssetCreateExAsync(ExecAssetCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetCreateResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产铸币(不扣减备付金)，合约管理员操作
         * Summary: 数字商品服务-资产服务-资产铸币
         */
        public ExecAssetGenerateResponse ExecAssetGenerate(ExecAssetGenerateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAssetGenerateEx(request, headers, runtime);
        }

        /**
         * Description: 资产铸币(不扣减备付金)，合约管理员操作
         * Summary: 数字商品服务-资产服务-资产铸币
         */
        public async Task<ExecAssetGenerateResponse> ExecAssetGenerateAsync(ExecAssetGenerateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAssetGenerateExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产铸币(不扣减备付金)，合约管理员操作
         * Summary: 数字商品服务-资产服务-资产铸币
         */
        public ExecAssetGenerateResponse ExecAssetGenerateEx(ExecAssetGenerateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGenerateResponse>(DoRequest("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产铸币(不扣减备付金)，合约管理员操作
         * Summary: 数字商品服务-资产服务-资产铸币
         */
        public async Task<ExecAssetGenerateResponse> ExecAssetGenerateExAsync(ExecAssetGenerateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAssetGenerateResponse>(await DoRequestAsync("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建商户（合约管理员权限）
         * Summary: 数字商品服务-商户管理-创建商户
         */
        public CreateMerchantResponse CreateMerchant(CreateMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 创建商户（合约管理员权限）
         * Summary: 数字商品服务-商户管理-创建商户
         */
        public async Task<CreateMerchantResponse> CreateMerchantAsync(CreateMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建商户（合约管理员权限）
         * Summary: 数字商品服务-商户管理-创建商户
         */
        public CreateMerchantResponse CreateMerchantEx(CreateMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantResponse>(DoRequest("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建商户（合约管理员权限）
         * Summary: 数字商品服务-商户管理-创建商户
         */
        public async Task<CreateMerchantResponse> CreateMerchantExAsync(CreateMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商户的资金管理员，重要权限，谨慎操作！
         * Summary: 数字商品服务-商户管理-设置资金管理员
         */
        public SetMerchantFundmanagerResponse SetMerchantFundmanager(SetMerchantFundmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetMerchantFundmanagerEx(request, headers, runtime);
        }

        /**
         * Description: 设置商户的资金管理员，重要权限，谨慎操作！
         * Summary: 数字商品服务-商户管理-设置资金管理员
         */
        public async Task<SetMerchantFundmanagerResponse> SetMerchantFundmanagerAsync(SetMerchantFundmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetMerchantFundmanagerExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置商户的资金管理员，重要权限，谨慎操作！
         * Summary: 数字商品服务-商户管理-设置资金管理员
         */
        public SetMerchantFundmanagerResponse SetMerchantFundmanagerEx(SetMerchantFundmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMerchantFundmanagerResponse>(DoRequest("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商户的资金管理员，重要权限，谨慎操作！
         * Summary: 数字商品服务-商户管理-设置资金管理员
         */
        public async Task<SetMerchantFundmanagerResponse> SetMerchantFundmanagerExAsync(SetMerchantFundmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMerchantFundmanagerResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建备付金账户，合约管理员权限
         * Summary: 数字商品服务-商户管理-创建备付金账户
         */
        public CreateMerchantProvisionResponse CreateMerchantProvision(CreateMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMerchantProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 创建备付金账户，合约管理员权限
         * Summary: 数字商品服务-商户管理-创建备付金账户
         */
        public async Task<CreateMerchantProvisionResponse> CreateMerchantProvisionAsync(CreateMerchantProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMerchantProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建备付金账户，合约管理员权限
         * Summary: 数字商品服务-商户管理-创建备付金账户
         */
        public CreateMerchantProvisionResponse CreateMerchantProvisionEx(CreateMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantProvisionResponse>(DoRequest("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建备付金账户，合约管理员权限
         * Summary: 数字商品服务-商户管理-创建备付金账户
         */
        public async Task<CreateMerchantProvisionResponse> CreateMerchantProvisionExAsync(CreateMerchantProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMerchantProvisionResponse>(await DoRequestAsync("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-管理服务-代理权限查询
         */
        public QueryConfigDelegaterelationResponse QueryConfigDelegaterelation(QueryConfigDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConfigDelegaterelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-管理服务-代理权限查询
         */
        public async Task<QueryConfigDelegaterelationResponse> QueryConfigDelegaterelationAsync(QueryConfigDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConfigDelegaterelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-管理服务-代理权限查询
         */
        public QueryConfigDelegaterelationResponse QueryConfigDelegaterelationEx(QueryConfigDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigDelegaterelationResponse>(DoRequest("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-管理服务-代理权限查询
         */
        public async Task<QueryConfigDelegaterelationResponse> QueryConfigDelegaterelationExAsync(QueryConfigDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigDelegaterelationResponse>(await DoRequestAsync("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-管理服务-设置代理权限
         */
        public UpdateConfigDelegaterelationResponse UpdateConfigDelegaterelation(UpdateConfigDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConfigDelegaterelationEx(request, headers, runtime);
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-管理服务-设置代理权限
         */
        public async Task<UpdateConfigDelegaterelationResponse> UpdateConfigDelegaterelationAsync(UpdateConfigDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConfigDelegaterelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-管理服务-设置代理权限
         */
        public UpdateConfigDelegaterelationResponse UpdateConfigDelegaterelationEx(UpdateConfigDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigDelegaterelationResponse>(DoRequest("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-管理服务-设置代理权限
         */
        public async Task<UpdateConfigDelegaterelationResponse> UpdateConfigDelegaterelationExAsync(UpdateConfigDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigDelegaterelationResponse>(await DoRequestAsync("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public QueryConfigWhitelistResponse QueryConfigWhitelist(QueryConfigWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConfigWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public async Task<QueryConfigWhitelistResponse> QueryConfigWhitelistAsync(QueryConfigWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConfigWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public QueryConfigWhitelistResponse QueryConfigWhitelistEx(QueryConfigWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigWhitelistResponse>(DoRequest("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public async Task<QueryConfigWhitelistResponse> QueryConfigWhitelistExAsync(QueryConfigWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigWhitelistResponse>(await DoRequestAsync("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置接口访问白名单
         * Summary: 数字商品服务-管理服务-设置访问白名单
         */
        public UpdateConfigWhitelistResponse UpdateConfigWhitelist(UpdateConfigWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConfigWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 设置接口访问白名单
         * Summary: 数字商品服务-管理服务-设置访问白名单
         */
        public async Task<UpdateConfigWhitelistResponse> UpdateConfigWhitelistAsync(UpdateConfigWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConfigWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置接口访问白名单
         * Summary: 数字商品服务-管理服务-设置访问白名单
         */
        public UpdateConfigWhitelistResponse UpdateConfigWhitelistEx(UpdateConfigWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigWhitelistResponse>(DoRequest("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置接口访问白名单
         * Summary: 数字商品服务-管理服务-设置访问白名单
         */
        public async Task<UpdateConfigWhitelistResponse> UpdateConfigWhitelistExAsync(UpdateConfigWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigWhitelistResponse>(await DoRequestAsync("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 兑换单申请售后（采购商）
         * Summary: 数字商品服务-兑换服务-申请售后(商家)
         */
        public ApplyExchangeAftersaleResponse ApplyExchangeAftersale(ApplyExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyExchangeAftersaleEx(request, headers, runtime);
        }

        /**
         * Description: 兑换单申请售后（采购商）
         * Summary: 数字商品服务-兑换服务-申请售后(商家)
         */
        public async Task<ApplyExchangeAftersaleResponse> ApplyExchangeAftersaleAsync(ApplyExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyExchangeAftersaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 兑换单申请售后（采购商）
         * Summary: 数字商品服务-兑换服务-申请售后(商家)
         */
        public ApplyExchangeAftersaleResponse ApplyExchangeAftersaleEx(ApplyExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyExchangeAftersaleResponse>(DoRequest("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 兑换单申请售后（采购商）
         * Summary: 数字商品服务-兑换服务-申请售后(商家)
         */
        public async Task<ApplyExchangeAftersaleResponse> ApplyExchangeAftersaleExAsync(ApplyExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyExchangeAftersaleResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同意售后（供应商）
         * Summary: 数字商品服务-兑换服务-同意售后
         */
        public ExecExchangeAgreeaftersaleResponse ExecExchangeAgreeaftersale(ExecExchangeAgreeaftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecExchangeAgreeaftersaleEx(request, headers, runtime);
        }

        /**
         * Description: 同意售后（供应商）
         * Summary: 数字商品服务-兑换服务-同意售后
         */
        public async Task<ExecExchangeAgreeaftersaleResponse> ExecExchangeAgreeaftersaleAsync(ExecExchangeAgreeaftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecExchangeAgreeaftersaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 同意售后（供应商）
         * Summary: 数字商品服务-兑换服务-同意售后
         */
        public ExecExchangeAgreeaftersaleResponse ExecExchangeAgreeaftersaleEx(ExecExchangeAgreeaftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeAgreeaftersaleResponse>(DoRequest("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同意售后（供应商）
         * Summary: 数字商品服务-兑换服务-同意售后
         */
        public async Task<ExecExchangeAgreeaftersaleResponse> ExecExchangeAgreeaftersaleExAsync(ExecExchangeAgreeaftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecExchangeAgreeaftersaleResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拒绝售后（供应商）
         * Summary: 数字商品服务-兑换服务-拒绝售后
         */
        public RefuseExchangeAftersaleResponse RefuseExchangeAftersale(RefuseExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseExchangeAftersaleEx(request, headers, runtime);
        }

        /**
         * Description: 拒绝售后（供应商）
         * Summary: 数字商品服务-兑换服务-拒绝售后
         */
        public async Task<RefuseExchangeAftersaleResponse> RefuseExchangeAftersaleAsync(RefuseExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseExchangeAftersaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 拒绝售后（供应商）
         * Summary: 数字商品服务-兑换服务-拒绝售后
         */
        public RefuseExchangeAftersaleResponse RefuseExchangeAftersaleEx(RefuseExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseExchangeAftersaleResponse>(DoRequest("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拒绝售后（供应商）
         * Summary: 数字商品服务-兑换服务-拒绝售后
         */
        public async Task<RefuseExchangeAftersaleResponse> RefuseExchangeAftersaleExAsync(RefuseExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseExchangeAftersaleResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新发货（供应商）
         * Summary: 数字商品服务-兑换服务-重新发货
         */
        public SendExchangeAftersaleResponse SendExchangeAftersale(SendExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendExchangeAftersaleEx(request, headers, runtime);
        }

        /**
         * Description: 重新发货（供应商）
         * Summary: 数字商品服务-兑换服务-重新发货
         */
        public async Task<SendExchangeAftersaleResponse> SendExchangeAftersaleAsync(SendExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendExchangeAftersaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新发货（供应商）
         * Summary: 数字商品服务-兑换服务-重新发货
         */
        public SendExchangeAftersaleResponse SendExchangeAftersaleEx(SendExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendExchangeAftersaleResponse>(DoRequest("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新发货（供应商）
         * Summary: 数字商品服务-兑换服务-重新发货
         */
        public async Task<SendExchangeAftersaleResponse> SendExchangeAftersaleExAsync(SendExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendExchangeAftersaleResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户确认售后（供应商）comfirmaftersale
         * Summary:  数字商品服务-兑换服务-商户确认售后
         */
        public ConfirmExchangeAftersaleResponse ConfirmExchangeAftersale(ConfirmExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmExchangeAftersaleEx(request, headers, runtime);
        }

        /**
         * Description: 商户确认售后（供应商）comfirmaftersale
         * Summary:  数字商品服务-兑换服务-商户确认售后
         */
        public async Task<ConfirmExchangeAftersaleResponse> ConfirmExchangeAftersaleAsync(ConfirmExchangeAftersaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmExchangeAftersaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户确认售后（供应商）comfirmaftersale
         * Summary:  数字商品服务-兑换服务-商户确认售后
         */
        public ConfirmExchangeAftersaleResponse ConfirmExchangeAftersaleEx(ConfirmExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExchangeAftersaleResponse>(DoRequest("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户确认售后（供应商）comfirmaftersale
         * Summary:  数字商品服务-兑换服务-商户确认售后
         */
        public async Task<ConfirmExchangeAftersaleResponse> ConfirmExchangeAftersaleExAsync(ConfirmExchangeAftersaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmExchangeAftersaleResponse>(await DoRequestAsync("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字消费卡链上发布
         * Summary: 数字商品服务-存证服务-消费卡链上发布
         */
        public ExecDataDepositResponse ExecDataDeposit(ExecDataDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecDataDepositEx(request, headers, runtime);
        }

        /**
         * Description: 数字消费卡链上发布
         * Summary: 数字商品服务-存证服务-消费卡链上发布
         */
        public async Task<ExecDataDepositResponse> ExecDataDepositAsync(ExecDataDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecDataDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字消费卡链上发布
         * Summary: 数字商品服务-存证服务-消费卡链上发布
         */
        public ExecDataDepositResponse ExecDataDepositEx(ExecDataDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDataDepositResponse>(DoRequest("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字消费卡链上发布
         * Summary: 数字商品服务-存证服务-消费卡链上发布
         */
        public async Task<ExecDataDepositResponse> ExecDataDepositExAsync(ExecDataDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDataDepositResponse>(await DoRequestAsync("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品兑换手续费
         * Summary: 数字商品服务-商品服务-设置商品手续费
         */
        public SetCommissionResponse SetCommission(SetCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 设置商品兑换手续费
         * Summary: 数字商品服务-商品服务-设置商品手续费
         */
        public async Task<SetCommissionResponse> SetCommissionAsync(SetCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置商品兑换手续费
         * Summary: 数字商品服务-商品服务-设置商品手续费
         */
        public SetCommissionResponse SetCommissionEx(SetCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCommissionResponse>(DoRequest("1.0", "baas.antdao.commission.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置商品兑换手续费
         * Summary: 数字商品服务-商品服务-设置商品手续费
         */
        public async Task<SetCommissionResponse> SetCommissionExAsync(SetCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCommissionResponse>(await DoRequestAsync("1.0", "baas.antdao.commission.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
         * Summary: 数字商品服务-商品服务-查询商品手续费
         */
        public QueryCommissionResponse QueryCommission(QueryCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
         * Summary: 数字商品服务-商品服务-查询商品手续费
         */
        public async Task<QueryCommissionResponse> QueryCommissionAsync(QueryCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
         * Summary: 数字商品服务-商品服务-查询商品手续费
         */
        public QueryCommissionResponse QueryCommissionEx(QueryCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommissionResponse>(DoRequest("1.0", "baas.antdao.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
         * Summary: 数字商品服务-商品服务-查询商品手续费
         */
        public async Task<QueryCommissionResponse> QueryCommissionExAsync(QueryCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommissionResponse>(await DoRequestAsync("1.0", "baas.antdao.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置收取手续费的商户信息（合约管理员权限）
         * Summary: 数字商品服务-商品服务-设置收手续费商户
         */
        public SetCommissionMerchantResponse SetCommissionMerchant(SetCommissionMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetCommissionMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 设置收取手续费的商户信息（合约管理员权限）
         * Summary: 数字商品服务-商品服务-设置收手续费商户
         */
        public async Task<SetCommissionMerchantResponse> SetCommissionMerchantAsync(SetCommissionMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetCommissionMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置收取手续费的商户信息（合约管理员权限）
         * Summary: 数字商品服务-商品服务-设置收手续费商户
         */
        public SetCommissionMerchantResponse SetCommissionMerchantEx(SetCommissionMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCommissionMerchantResponse>(DoRequest("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置收取手续费的商户信息（合约管理员权限）
         * Summary: 数字商品服务-商品服务-设置收手续费商户
         */
        public async Task<SetCommissionMerchantResponse> SetCommissionMerchantExAsync(SetCommissionMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCommissionMerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询收取手续费的商户信息
         * Summary: 数字商品服务-商品服务-查询收手续费商户
         */
        public QueryCommissionMerchantResponse QueryCommissionMerchant(QueryCommissionMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommissionMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 查询收取手续费的商户信息
         * Summary: 数字商品服务-商品服务-查询收手续费商户
         */
        public async Task<QueryCommissionMerchantResponse> QueryCommissionMerchantAsync(QueryCommissionMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommissionMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询收取手续费的商户信息
         * Summary: 数字商品服务-商品服务-查询收手续费商户
         */
        public QueryCommissionMerchantResponse QueryCommissionMerchantEx(QueryCommissionMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommissionMerchantResponse>(DoRequest("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询收取手续费的商户信息
         * Summary: 数字商品服务-商品服务-查询收手续费商户
         */
        public async Task<QueryCommissionMerchantResponse> QueryCommissionMerchantExAsync(QueryCommissionMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommissionMerchantResponse>(await DoRequestAsync("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单独创建对应的链ID的链上账户
         * Summary: 数字商品服务-管理服务-创建链上账户
         */
        public CreateConfigChainaccountResponse CreateConfigChainaccount(CreateConfigChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConfigChainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 单独创建对应的链ID的链上账户
         * Summary: 数字商品服务-管理服务-创建链上账户
         */
        public async Task<CreateConfigChainaccountResponse> CreateConfigChainaccountAsync(CreateConfigChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConfigChainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 单独创建对应的链ID的链上账户
         * Summary: 数字商品服务-管理服务-创建链上账户
         */
        public CreateConfigChainaccountResponse CreateConfigChainaccountEx(CreateConfigChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigChainaccountResponse>(DoRequest("1.0", "baas.antdao.config.chainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单独创建对应的链ID的链上账户
         * Summary: 数字商品服务-管理服务-创建链上账户
         */
        public async Task<CreateConfigChainaccountResponse> CreateConfigChainaccountExAsync(CreateConfigChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigChainaccountResponse>(await DoRequestAsync("1.0", "baas.antdao.config.chainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家发起套餐交易
         * Summary: 数字商品服务-IP授权服务-发起套餐交易
         */
        public StartIpPackagetradeResponse StartIpPackagetrade(StartIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartIpPackagetradeEx(request, headers, runtime);
        }

        /**
         * Description: 买家发起套餐交易
         * Summary: 数字商品服务-IP授权服务-发起套餐交易
         */
        public async Task<StartIpPackagetradeResponse> StartIpPackagetradeAsync(StartIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartIpPackagetradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 买家发起套餐交易
         * Summary: 数字商品服务-IP授权服务-发起套餐交易
         */
        public StartIpPackagetradeResponse StartIpPackagetradeEx(StartIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartIpPackagetradeResponse>(DoRequest("1.0", "baas.antdao.ip.packagetrade.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 买家发起套餐交易
         * Summary: 数字商品服务-IP授权服务-发起套餐交易
         */
        public async Task<StartIpPackagetradeResponse> StartIpPackagetradeExAsync(StartIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartIpPackagetradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.packagetrade.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易发起方取消交易，包括套餐交易和定向授权
         * Summary: 数字商品服务-IP授权服务-取消交易
         */
        public CancelIpPackagetradeResponse CancelIpPackagetrade(CancelIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelIpPackagetradeEx(request, headers, runtime);
        }

        /**
         * Description: 交易发起方取消交易，包括套餐交易和定向授权
         * Summary: 数字商品服务-IP授权服务-取消交易
         */
        public async Task<CancelIpPackagetradeResponse> CancelIpPackagetradeAsync(CancelIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelIpPackagetradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 交易发起方取消交易，包括套餐交易和定向授权
         * Summary: 数字商品服务-IP授权服务-取消交易
         */
        public CancelIpPackagetradeResponse CancelIpPackagetradeEx(CancelIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIpPackagetradeResponse>(DoRequest("1.0", "baas.antdao.ip.packagetrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易发起方取消交易，包括套餐交易和定向授权
         * Summary: 数字商品服务-IP授权服务-取消交易
         */
        public async Task<CancelIpPackagetradeResponse> CancelIpPackagetradeExAsync(CancelIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIpPackagetradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.packagetrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传套餐交易销售数据
         * Summary: 数字商品服务-IP授权服务-上传套餐数据
         */
        public UploadIpPackagetradesalesResponse UploadIpPackagetradesales(UploadIpPackagetradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadIpPackagetradesalesEx(request, headers, runtime);
        }

        /**
         * Description: 上传套餐交易销售数据
         * Summary: 数字商品服务-IP授权服务-上传套餐数据
         */
        public async Task<UploadIpPackagetradesalesResponse> UploadIpPackagetradesalesAsync(UploadIpPackagetradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadIpPackagetradesalesExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传套餐交易销售数据
         * Summary: 数字商品服务-IP授权服务-上传套餐数据
         */
        public UploadIpPackagetradesalesResponse UploadIpPackagetradesalesEx(UploadIpPackagetradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpPackagetradesalesResponse>(DoRequest("1.0", "baas.antdao.ip.packagetradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传套餐交易销售数据
         * Summary: 数字商品服务-IP授权服务-上传套餐数据
         */
        public async Task<UploadIpPackagetradesalesResponse> UploadIpPackagetradesalesExAsync(UploadIpPackagetradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpPackagetradesalesResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.packagetradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起授权交易
         * Summary: 数字商品服务-IP授权服务-发起授权交易
         */
        public StartIpAuthtradeResponse StartIpAuthtrade(StartIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartIpAuthtradeEx(request, headers, runtime);
        }

        /**
         * Description: 发起授权交易
         * Summary: 数字商品服务-IP授权服务-发起授权交易
         */
        public async Task<StartIpAuthtradeResponse> StartIpAuthtradeAsync(StartIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartIpAuthtradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起授权交易
         * Summary: 数字商品服务-IP授权服务-发起授权交易
         */
        public StartIpAuthtradeResponse StartIpAuthtradeEx(StartIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartIpAuthtradeResponse>(DoRequest("1.0", "baas.antdao.ip.authtrade.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起授权交易
         * Summary: 数字商品服务-IP授权服务-发起授权交易
         */
        public async Task<StartIpAuthtradeResponse> StartIpAuthtradeExAsync(StartIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartIpAuthtradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.authtrade.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权模式交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public UploadIpAuthtradesalesResponse UploadIpAuthtradesales(UploadIpAuthtradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadIpAuthtradesalesEx(request, headers, runtime);
        }

        /**
         * Description: 上传授权模式交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public async Task<UploadIpAuthtradesalesResponse> UploadIpAuthtradesalesAsync(UploadIpAuthtradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadIpAuthtradesalesExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传授权模式交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public UploadIpAuthtradesalesResponse UploadIpAuthtradesalesEx(UploadIpAuthtradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpAuthtradesalesResponse>(DoRequest("1.0", "baas.antdao.ip.authtradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权模式交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public async Task<UploadIpAuthtradesalesResponse> UploadIpAuthtradesalesExAsync(UploadIpAuthtradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpAuthtradesalesResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.authtradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消授权模式下销售数据账单
         * Summary: 数字商品服务-IP授权服务-取消授权账单
         */
        public CancelIpAuthtradebillResponse CancelIpAuthtradebill(CancelIpAuthtradebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelIpAuthtradebillEx(request, headers, runtime);
        }

        /**
         * Description: 取消授权模式下销售数据账单
         * Summary: 数字商品服务-IP授权服务-取消授权账单
         */
        public async Task<CancelIpAuthtradebillResponse> CancelIpAuthtradebillAsync(CancelIpAuthtradebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelIpAuthtradebillExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消授权模式下销售数据账单
         * Summary: 数字商品服务-IP授权服务-取消授权账单
         */
        public CancelIpAuthtradebillResponse CancelIpAuthtradebillEx(CancelIpAuthtradebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIpAuthtradebillResponse>(DoRequest("1.0", "baas.antdao.ip.authtradebill.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消授权模式下销售数据账单
         * Summary: 数字商品服务-IP授权服务-取消授权账单
         */
        public async Task<CancelIpAuthtradebillResponse> CancelIpAuthtradebillExAsync(CancelIpAuthtradebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIpAuthtradebillResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.authtradebill.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账单支付状态
         * Summary: 数字商品服务-IP授权服务-查询账单状态
         */
        public QueryIpBillstatusResponse QueryIpBillstatus(QueryIpBillstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpBillstatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询账单支付状态
         * Summary: 数字商品服务-IP授权服务-查询账单状态
         */
        public async Task<QueryIpBillstatusResponse> QueryIpBillstatusAsync(QueryIpBillstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpBillstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询账单支付状态
         * Summary: 数字商品服务-IP授权服务-查询账单状态
         */
        public QueryIpBillstatusResponse QueryIpBillstatusEx(QueryIpBillstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpBillstatusResponse>(DoRequest("1.0", "baas.antdao.ip.billstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账单支付状态
         * Summary: 数字商品服务-IP授权服务-查询账单状态
         */
        public async Task<QueryIpBillstatusResponse> QueryIpBillstatusExAsync(QueryIpBillstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpBillstatusResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.billstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单信息，模糊查询和分页查询
         * Summary: 数字商品服务-IP授权服务-查询订单列表
         */
        public QueryIpOrderlistResponse QueryIpOrderlist(QueryIpOrderlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpOrderlistEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单信息，模糊查询和分页查询
         * Summary: 数字商品服务-IP授权服务-查询订单列表
         */
        public async Task<QueryIpOrderlistResponse> QueryIpOrderlistAsync(QueryIpOrderlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpOrderlistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单信息，模糊查询和分页查询
         * Summary: 数字商品服务-IP授权服务-查询订单列表
         */
        public QueryIpOrderlistResponse QueryIpOrderlistEx(QueryIpOrderlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderlistResponse>(DoRequest("1.0", "baas.antdao.ip.orderlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单信息，模糊查询和分页查询
         * Summary: 数字商品服务-IP授权服务-查询订单列表
         */
        public async Task<QueryIpOrderlistResponse> QueryIpOrderlistExAsync(QueryIpOrderlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderlistResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.orderlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip创建
         */
        public CreateIpGoodsResponse CreateIpGoods(CreateIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIpGoodsEx(request, headers, runtime);
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip创建
         */
        public async Task<CreateIpGoodsResponse> CreateIpGoodsAsync(CreateIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIpGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip创建
         */
        public CreateIpGoodsResponse CreateIpGoodsEx(CreateIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpGoodsResponse>(DoRequest("1.0", "baas.antdao.ip.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip创建
         */
        public async Task<CreateIpGoodsResponse> CreateIpGoodsExAsync(CreateIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的渠道信息添加
         * Summary: 数字商品服务-IP授权服务-渠道信息添加
         */
        public AddIpChannelResponse AddIpChannel(AddIpChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddIpChannelEx(request, headers, runtime);
        }

        /**
         * Description: ip的渠道信息添加
         * Summary: 数字商品服务-IP授权服务-渠道信息添加
         */
        public async Task<AddIpChannelResponse> AddIpChannelAsync(AddIpChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddIpChannelExAsync(request, headers, runtime);
        }

        /**
         * Description: ip的渠道信息添加
         * Summary: 数字商品服务-IP授权服务-渠道信息添加
         */
        public AddIpChannelResponse AddIpChannelEx(AddIpChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIpChannelResponse>(DoRequest("1.0", "baas.antdao.ip.channel.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的渠道信息添加
         * Summary: 数字商品服务-IP授权服务-渠道信息添加
         */
        public async Task<AddIpChannelResponse> AddIpChannelExAsync(AddIpChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIpChannelResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.channel.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单详情，包含销售数据
         * Summary: 数字商品服务-IP授权服务-查询订单详情
         */
        public QueryIpOrderinfoResponse QueryIpOrderinfo(QueryIpOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpOrderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单详情，包含销售数据
         * Summary: 数字商品服务-IP授权服务-查询订单详情
         */
        public async Task<QueryIpOrderinfoResponse> QueryIpOrderinfoAsync(QueryIpOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpOrderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单详情，包含销售数据
         * Summary: 数字商品服务-IP授权服务-查询订单详情
         */
        public QueryIpOrderinfoResponse QueryIpOrderinfoEx(QueryIpOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderinfoResponse>(DoRequest("1.0", "baas.antdao.ip.orderinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单详情，包含销售数据
         * Summary: 数字商品服务-IP授权服务-查询订单详情
         */
        public async Task<QueryIpOrderinfoResponse> QueryIpOrderinfoExAsync(QueryIpOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderinfoResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.orderinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询ip简略信息
         * Summary: 数字商品服务-IP授权服务-批量查询
         */
        public BatchqueryIpGoodsResponse BatchqueryIpGoods(BatchqueryIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询ip简略信息
         * Summary: 数字商品服务-IP授权服务-批量查询
         */
        public async Task<BatchqueryIpGoodsResponse> BatchqueryIpGoodsAsync(BatchqueryIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询ip简略信息
         * Summary: 数字商品服务-IP授权服务-批量查询
         */
        public BatchqueryIpGoodsResponse BatchqueryIpGoodsEx(BatchqueryIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpGoodsResponse>(DoRequest("1.0", "baas.antdao.ip.goods.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询ip简略信息
         * Summary: 数字商品服务-IP授权服务-批量查询
         */
        public async Task<BatchqueryIpGoodsResponse> BatchqueryIpGoodsExAsync(BatchqueryIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goods.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据渠道查询详细的信息
         * Summary: 数字商品服务-IP授权服务-查询渠道详细
         */
        public QueryIpGoodsdetailwithchannelResponse QueryIpGoodsdetailwithchannel(QueryIpGoodsdetailwithchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpGoodsdetailwithchannelEx(request, headers, runtime);
        }

        /**
         * Description: 根据渠道查询详细的信息
         * Summary: 数字商品服务-IP授权服务-查询渠道详细
         */
        public async Task<QueryIpGoodsdetailwithchannelResponse> QueryIpGoodsdetailwithchannelAsync(QueryIpGoodsdetailwithchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpGoodsdetailwithchannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据渠道查询详细的信息
         * Summary: 数字商品服务-IP授权服务-查询渠道详细
         */
        public QueryIpGoodsdetailwithchannelResponse QueryIpGoodsdetailwithchannelEx(QueryIpGoodsdetailwithchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsdetailwithchannelResponse>(DoRequest("1.0", "baas.antdao.ip.goodsdetailwithchannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据渠道查询详细的信息
         * Summary: 数字商品服务-IP授权服务-查询渠道详细
         */
        public async Task<QueryIpGoodsdetailwithchannelResponse> QueryIpGoodsdetailwithchannelExAsync(QueryIpGoodsdetailwithchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsdetailwithchannelResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goodsdetailwithchannel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的所有信息 包括渠道和sku
         * Summary: 数字商品服务-IP授权服务-IP详情查询
         */
        public QueryIpDetailResponse QueryIpDetail(QueryIpDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpDetailEx(request, headers, runtime);
        }

        /**
         * Description: ip的所有信息 包括渠道和sku
         * Summary: 数字商品服务-IP授权服务-IP详情查询
         */
        public async Task<QueryIpDetailResponse> QueryIpDetailAsync(QueryIpDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: ip的所有信息 包括渠道和sku
         * Summary: 数字商品服务-IP授权服务-IP详情查询
         */
        public QueryIpDetailResponse QueryIpDetailEx(QueryIpDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpDetailResponse>(DoRequest("1.0", "baas.antdao.ip.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的所有信息 包括渠道和sku
         * Summary: 数字商品服务-IP授权服务-IP详情查询
         */
        public async Task<QueryIpDetailResponse> QueryIpDetailExAsync(QueryIpDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpDetailResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip更新
         */
        public UpdateIpGoodsResponse UpdateIpGoods(UpdateIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIpGoodsEx(request, headers, runtime);
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip更新
         */
        public async Task<UpdateIpGoodsResponse> UpdateIpGoodsAsync(UpdateIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIpGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip更新
         */
        public UpdateIpGoodsResponse UpdateIpGoodsEx(UpdateIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpGoodsResponse>(DoRequest("1.0", "baas.antdao.ip.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品创建
         * Summary: 数字商品服务-IP授权服务-ip更新
         */
        public async Task<UpdateIpGoodsResponse> UpdateIpGoodsExAsync(UpdateIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的渠道信息修改
         * Summary: 数字商品服务-IP授权服务-渠道信息更新
         */
        public UpdateIpChannelResponse UpdateIpChannel(UpdateIpChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIpChannelEx(request, headers, runtime);
        }

        /**
         * Description: ip的渠道信息修改
         * Summary: 数字商品服务-IP授权服务-渠道信息更新
         */
        public async Task<UpdateIpChannelResponse> UpdateIpChannelAsync(UpdateIpChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIpChannelExAsync(request, headers, runtime);
        }

        /**
         * Description: ip的渠道信息修改
         * Summary: 数字商品服务-IP授权服务-渠道信息更新
         */
        public UpdateIpChannelResponse UpdateIpChannelEx(UpdateIpChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpChannelResponse>(DoRequest("1.0", "baas.antdao.ip.channel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip的渠道信息修改
         * Summary: 数字商品服务-IP授权服务-渠道信息更新
         */
        public async Task<UpdateIpChannelResponse> UpdateIpChannelExAsync(UpdateIpChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpChannelResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.channel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip上线
         * Summary: 数字商品服务-IP授权服务-上架
         */
        public OnlineIpResponse OnlineIp(OnlineIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineIpEx(request, headers, runtime);
        }

        /**
         * Description: ip上线
         * Summary: 数字商品服务-IP授权服务-上架
         */
        public async Task<OnlineIpResponse> OnlineIpAsync(OnlineIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineIpExAsync(request, headers, runtime);
        }

        /**
         * Description: ip上线
         * Summary: 数字商品服务-IP授权服务-上架
         */
        public OnlineIpResponse OnlineIpEx(OnlineIpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineIpResponse>(DoRequest("1.0", "baas.antdao.ip.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip上线
         * Summary: 数字商品服务-IP授权服务-上架
         */
        public async Task<OnlineIpResponse> OnlineIpExAsync(OnlineIpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineIpResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip下线
         * Summary: 数字商品服务-IP授权服务-下架
         */
        public OfflineIpResponse OfflineIp(OfflineIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineIpEx(request, headers, runtime);
        }

        /**
         * Description: ip下线
         * Summary: 数字商品服务-IP授权服务-下架
         */
        public async Task<OfflineIpResponse> OfflineIpAsync(OfflineIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineIpExAsync(request, headers, runtime);
        }

        /**
         * Description: ip下线
         * Summary: 数字商品服务-IP授权服务-下架
         */
        public OfflineIpResponse OfflineIpEx(OfflineIpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineIpResponse>(DoRequest("1.0", "baas.antdao.ip.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip下线
         * Summary: 数字商品服务-IP授权服务-下架
         */
        public async Task<OfflineIpResponse> OfflineIpExAsync(OfflineIpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineIpResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
         * Summary: 数字商品服务-IP授权服务-账户创建
         */
        public CreateIpAccountResponse CreateIpAccount(CreateIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
         * Summary: 数字商品服务-IP授权服务-账户创建
         */
        public async Task<CreateIpAccountResponse> CreateIpAccountAsync(CreateIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
         * Summary: 数字商品服务-IP授权服务-账户创建
         */
        public CreateIpAccountResponse CreateIpAccountEx(CreateIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
         * Summary: 数字商品服务-IP授权服务-账户创建
         */
        public async Task<CreateIpAccountResponse> CreateIpAccountExAsync(CreateIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户冻结
         */
        public FreezeIpAccountResponse FreezeIpAccount(FreezeIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户冻结
         */
        public async Task<FreezeIpAccountResponse> FreezeIpAccountAsync(FreezeIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户冻结
         */
        public FreezeIpAccountResponse FreezeIpAccountEx(FreezeIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户冻结
         */
        public async Task<FreezeIpAccountResponse> FreezeIpAccountExAsync(FreezeIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户解冻
         */
        public UnfreezeIpAccountResponse UnfreezeIpAccount(UnfreezeIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户解冻
         */
        public async Task<UnfreezeIpAccountResponse> UnfreezeIpAccountAsync(UnfreezeIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户解冻
         */
        public UnfreezeIpAccountResponse UnfreezeIpAccountEx(UnfreezeIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
         * Summary: 数字商品服务-IP授权服务-账户解冻
         */
        public async Task<UnfreezeIpAccountResponse> UnfreezeIpAccountExAsync(UnfreezeIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户查询。
         * Summary: 数字商品服务-IP授权服务-账户查询
         */
        public QueryIpAccountResponse QueryIpAccount(QueryIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户查询。
         * Summary: 数字商品服务-IP授权服务-账户查询
         */
        public async Task<QueryIpAccountResponse> QueryIpAccountAsync(QueryIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户查询。
         * Summary: 数字商品服务-IP授权服务-账户查询
         */
        public QueryIpAccountResponse QueryIpAccountEx(QueryIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IP授权交易服务: IP采购商和版权方的账户查询。
         * Summary: 数字商品服务-IP授权服务-账户查询
         */
        public async Task<QueryIpAccountResponse> QueryIpAccountExAsync(QueryIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
         * Summary: 数字商品服务-IP授权服务-版权方申请
         */
        public ApplyIpAccountResponse ApplyIpAccount(ApplyIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
         * Summary: 数字商品服务-IP授权服务-版权方申请
         */
        public async Task<ApplyIpAccountResponse> ApplyIpAccountAsync(ApplyIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
         * Summary: 数字商品服务-IP授权服务-版权方申请
         */
        public ApplyIpAccountResponse ApplyIpAccountEx(ApplyIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
         * Summary: 数字商品服务-IP授权服务-版权方申请
         */
        public async Task<ApplyIpAccountResponse> ApplyIpAccountExAsync(ApplyIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
         * Summary: 数字商品服务-IP授权服务-查申请进度
         */
        public CheckIpAccountResponse CheckIpAccount(CheckIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
         * Summary: 数字商品服务-IP授权服务-查申请进度
         */
        public async Task<CheckIpAccountResponse> CheckIpAccountAsync(CheckIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
         * Summary: 数字商品服务-IP授权服务-查申请进度
         */
        public CheckIpAccountResponse CheckIpAccountEx(CheckIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
         * Summary: 数字商品服务-IP授权服务-查申请进度
         */
        public async Task<CheckIpAccountResponse> CheckIpAccountExAsync(CheckIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品审批
         * Summary: 数字商品服务-IP授权服务-ip创建审批
         */
        public ConfirmIpGoodsResponse ConfirmIpGoods(ConfirmIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpGoodsEx(request, headers, runtime);
        }

        /**
         * Description: ip商品审批
         * Summary: 数字商品服务-IP授权服务-ip创建审批
         */
        public async Task<ConfirmIpGoodsResponse> ConfirmIpGoodsAsync(ConfirmIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: ip商品审批
         * Summary: 数字商品服务-IP授权服务-ip创建审批
         */
        public ConfirmIpGoodsResponse ConfirmIpGoodsEx(ConfirmIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpGoodsResponse>(DoRequest("1.0", "baas.antdao.ip.goods.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品审批
         * Summary: 数字商品服务-IP授权服务-ip创建审批
         */
        public async Task<ConfirmIpGoodsResponse> ConfirmIpGoodsExAsync(ConfirmIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goods.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip信息批量查询--给运营使用
        查询审批信息
         * Summary: 数字商品服务-IP授权服务-审批信息查询
         */
        public BatchqueryIpApprovalResponse BatchqueryIpApproval(BatchqueryIpApprovalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpApprovalEx(request, headers, runtime);
        }

        /**
         * Description: ip信息批量查询--给运营使用
        查询审批信息
         * Summary: 数字商品服务-IP授权服务-审批信息查询
         */
        public async Task<BatchqueryIpApprovalResponse> BatchqueryIpApprovalAsync(BatchqueryIpApprovalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpApprovalExAsync(request, headers, runtime);
        }

        /**
         * Description: ip信息批量查询--给运营使用
        查询审批信息
         * Summary: 数字商品服务-IP授权服务-审批信息查询
         */
        public BatchqueryIpApprovalResponse BatchqueryIpApprovalEx(BatchqueryIpApprovalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalResponse>(DoRequest("1.0", "baas.antdao.ip.approval.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip信息批量查询--给运营使用
        查询审批信息
         * Summary: 数字商品服务-IP授权服务-审批信息查询
         */
        public async Task<BatchqueryIpApprovalResponse> BatchqueryIpApprovalExAsync(BatchqueryIpApprovalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.approval.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核确认
         * Summary: 数字商品服务-IP授权服务-运营审核确认
         */
        public ConfirmIpAccountResponse ConfirmIpAccount(ConfirmIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核确认
         * Summary: 数字商品服务-IP授权服务-运营审核确认
         */
        public async Task<ConfirmIpAccountResponse> ConfirmIpAccountAsync(ConfirmIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核确认
         * Summary: 数字商品服务-IP授权服务-运营审核确认
         */
        public ConfirmIpAccountResponse ConfirmIpAccountEx(ConfirmIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核确认
         * Summary: 数字商品服务-IP授权服务-运营审核确认
         */
        public async Task<ConfirmIpAccountResponse> ConfirmIpAccountExAsync(ConfirmIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核拒绝
         * Summary: 数字商品服务-IP授权服务-运营审核拒绝
         */
        public RefuseIpAccountResponse RefuseIpAccount(RefuseIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核拒绝
         * Summary: 数字商品服务-IP授权服务-运营审核拒绝
         */
        public async Task<RefuseIpAccountResponse> RefuseIpAccountAsync(RefuseIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核拒绝
         * Summary: 数字商品服务-IP授权服务-运营审核拒绝
         */
        public RefuseIpAccountResponse RefuseIpAccountEx(RefuseIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-运营审核拒绝
         * Summary: 数字商品服务-IP授权服务-运营审核拒绝
         */
        public async Task<RefuseIpAccountResponse> RefuseIpAccountExAsync(RefuseIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方进件信息的单个查询
         * Summary: 数字商品服务-IP授权服务-申请信息查询
         */
        public PullIpAccountResponse PullIpAccount(PullIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 版权方进件信息的单个查询
         * Summary: 数字商品服务-IP授权服务-申请信息查询
         */
        public async Task<PullIpAccountResponse> PullIpAccountAsync(PullIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方进件信息的单个查询
         * Summary: 数字商品服务-IP授权服务-申请信息查询
         */
        public PullIpAccountResponse PullIpAccountEx(PullIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方进件信息的单个查询
         * Summary: 数字商品服务-IP授权服务-申请信息查询
         */
        public async Task<PullIpAccountResponse> PullIpAccountExAsync(PullIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-MCC列表查询
         * Summary: 数字商品服务-IP授权服务-MCC查询
         */
        public QueryIpMccResponse QueryIpMcc(QueryIpMccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpMccEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-MCC列表查询
         * Summary: 数字商品服务-IP授权服务-MCC查询
         */
        public async Task<QueryIpMccResponse> QueryIpMccAsync(QueryIpMccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpMccExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-MCC列表查询
         * Summary: 数字商品服务-IP授权服务-MCC查询
         */
        public QueryIpMccResponse QueryIpMccEx(QueryIpMccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpMccResponse>(DoRequest("1.0", "baas.antdao.ip.mcc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-MCC列表查询
         * Summary: 数字商品服务-IP授权服务-MCC查询
         */
        public async Task<QueryIpMccResponse> QueryIpMccExAsync(QueryIpMccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpMccResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.mcc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ip type和受众人群
         * Summary: 数字商品服务-IP授权服务-IP标签查询
         */
        public QueryIpTypeResponse QueryIpType(QueryIpTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpTypeEx(request, headers, runtime);
        }

        /**
         * Description: 查询ip type和受众人群
         * Summary: 数字商品服务-IP授权服务-IP标签查询
         */
        public async Task<QueryIpTypeResponse> QueryIpTypeAsync(QueryIpTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpTypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询ip type和受众人群
         * Summary: 数字商品服务-IP授权服务-IP标签查询
         */
        public QueryIpTypeResponse QueryIpTypeEx(QueryIpTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpTypeResponse>(DoRequest("1.0", "baas.antdao.ip.type.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ip type和受众人群
         * Summary: 数字商品服务-IP授权服务-IP标签查询
         */
        public async Task<QueryIpTypeResponse> QueryIpTypeExAsync(QueryIpTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpTypeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.type.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip审批信息批量查询（带上渠道信息）
         * Summary: 数字商品服务-IP授权服务-审批批量查询
         */
        public BatchqueryIpApprovalandchannelResponse BatchqueryIpApprovalandchannel(BatchqueryIpApprovalandchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpApprovalandchannelEx(request, headers, runtime);
        }

        /**
         * Description: ip审批信息批量查询（带上渠道信息）
         * Summary: 数字商品服务-IP授权服务-审批批量查询
         */
        public async Task<BatchqueryIpApprovalandchannelResponse> BatchqueryIpApprovalandchannelAsync(BatchqueryIpApprovalandchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpApprovalandchannelExAsync(request, headers, runtime);
        }

        /**
         * Description: ip审批信息批量查询（带上渠道信息）
         * Summary: 数字商品服务-IP授权服务-审批批量查询
         */
        public BatchqueryIpApprovalandchannelResponse BatchqueryIpApprovalandchannelEx(BatchqueryIpApprovalandchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalandchannelResponse>(DoRequest("1.0", "baas.antdao.ip.approvalandchannel.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip审批信息批量查询（带上渠道信息）
         * Summary: 数字商品服务-IP授权服务-审批批量查询
         */
        public async Task<BatchqueryIpApprovalandchannelResponse> BatchqueryIpApprovalandchannelExAsync(BatchqueryIpApprovalandchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalandchannelResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.approvalandchannel.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方进件信息的批量查询
         * Summary: 数字商品服务-IP授权服务-查询商家信息
         */
        public BatchqueryIpAccountResponse BatchqueryIpAccount(BatchqueryIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 版权方进件信息的批量查询
         * Summary: 数字商品服务-IP授权服务-查询商家信息
         */
        public async Task<BatchqueryIpAccountResponse> BatchqueryIpAccountAsync(BatchqueryIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方进件信息的批量查询
         * Summary: 数字商品服务-IP授权服务-查询商家信息
         */
        public BatchqueryIpAccountResponse BatchqueryIpAccountEx(BatchqueryIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方进件信息的批量查询
         * Summary: 数字商品服务-IP授权服务-查询商家信息
         */
        public async Task<BatchqueryIpAccountResponse> BatchqueryIpAccountExAsync(BatchqueryIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方待审批的批量查询
         * Summary: 数字商品服务-IP授权服务-查版权方申请
         */
        public BatchqueryIpSellerResponse BatchqueryIpSeller(BatchqueryIpSellerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpSellerEx(request, headers, runtime);
        }

        /**
         * Description: 版权方待审批的批量查询
         * Summary: 数字商品服务-IP授权服务-查版权方申请
         */
        public async Task<BatchqueryIpSellerResponse> BatchqueryIpSellerAsync(BatchqueryIpSellerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpSellerExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方待审批的批量查询
         * Summary: 数字商品服务-IP授权服务-查版权方申请
         */
        public BatchqueryIpSellerResponse BatchqueryIpSellerEx(BatchqueryIpSellerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpSellerResponse>(DoRequest("1.0", "baas.antdao.ip.seller.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方待审批的批量查询
         * Summary: 数字商品服务-IP授权服务-查版权方申请
         */
        public async Task<BatchqueryIpSellerResponse> BatchqueryIpSellerExAsync(BatchqueryIpSellerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpSellerResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.seller.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码申请
         * Summary: 数字商品服务-IP授权服务-正版码申请
         */
        public ApplyIpCodeResponse ApplyIpCode(ApplyIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyIpCodeEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码申请
         * Summary: 数字商品服务-IP授权服务-正版码申请
         */
        public async Task<ApplyIpCodeResponse> ApplyIpCodeAsync(ApplyIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyIpCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码申请
         * Summary: 数字商品服务-IP授权服务-正版码申请
         */
        public ApplyIpCodeResponse ApplyIpCodeEx(ApplyIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpCodeResponse>(DoRequest("1.0", "baas.antdao.ip.code.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码申请
         * Summary: 数字商品服务-IP授权服务-正版码申请
         */
        public async Task<ApplyIpCodeResponse> ApplyIpCodeExAsync(ApplyIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpCodeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.code.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码分页查询
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public PagequeryIpCodeResponse PagequeryIpCode(PagequeryIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIpCodeEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码分页查询
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public async Task<PagequeryIpCodeResponse> PagequeryIpCodeAsync(PagequeryIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIpCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码分页查询
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public PagequeryIpCodeResponse PagequeryIpCodeEx(PagequeryIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpCodeResponse>(DoRequest("1.0", "baas.antdao.ip.code.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码分页查询
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public async Task<PagequeryIpCodeResponse> PagequeryIpCodeExAsync(PagequeryIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpCodeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.code.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码校验
         * Summary: 数字商品服务-IP授权服务-正版码校验
         */
        public CheckIpCodeResponse CheckIpCode(CheckIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIpCodeEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码校验
         * Summary: 数字商品服务-IP授权服务-正版码校验
         */
        public async Task<CheckIpCodeResponse> CheckIpCodeAsync(CheckIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIpCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码校验
         * Summary: 数字商品服务-IP授权服务-正版码校验
         */
        public CheckIpCodeResponse CheckIpCodeEx(CheckIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIpCodeResponse>(DoRequest("1.0", "baas.antdao.ip.code.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-正版码校验
         * Summary: 数字商品服务-IP授权服务-正版码校验
         */
        public async Task<CheckIpCodeResponse> CheckIpCodeExAsync(CheckIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIpCodeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.code.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对商品的更新进行审核
         * Summary: 数字商品服务-IP授权服务-IP更新审核
         */
        public ConfirmIpUpdateapprovalResponse ConfirmIpUpdateapproval(ConfirmIpUpdateapprovalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpUpdateapprovalEx(request, headers, runtime);
        }

        /**
         * Description: 对商品的更新进行审核
         * Summary: 数字商品服务-IP授权服务-IP更新审核
         */
        public async Task<ConfirmIpUpdateapprovalResponse> ConfirmIpUpdateapprovalAsync(ConfirmIpUpdateapprovalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpUpdateapprovalExAsync(request, headers, runtime);
        }

        /**
         * Description: 对商品的更新进行审核
         * Summary: 数字商品服务-IP授权服务-IP更新审核
         */
        public ConfirmIpUpdateapprovalResponse ConfirmIpUpdateapprovalEx(ConfirmIpUpdateapprovalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpUpdateapprovalResponse>(DoRequest("1.0", "baas.antdao.ip.updateapproval.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对商品的更新进行审核
         * Summary: 数字商品服务-IP授权服务-IP更新审核
         */
        public async Task<ConfirmIpUpdateapprovalResponse> ConfirmIpUpdateapprovalExAsync(ConfirmIpUpdateapprovalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpUpdateapprovalResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.updateapproval.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品sku信息设置
         * Summary: 数字商品服务-IP授权服务-sku设置
         */
        public SetIpSkuResponse SetIpSku(SetIpSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetIpSkuEx(request, headers, runtime);
        }

        /**
         * Description: ip商品sku信息设置
         * Summary: 数字商品服务-IP授权服务-sku设置
         */
        public async Task<SetIpSkuResponse> SetIpSkuAsync(SetIpSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetIpSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: ip商品sku信息设置
         * Summary: 数字商品服务-IP授权服务-sku设置
         */
        public SetIpSkuResponse SetIpSkuEx(SetIpSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpSkuResponse>(DoRequest("1.0", "baas.antdao.ip.sku.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品sku信息设置
         * Summary: 数字商品服务-IP授权服务-sku设置
         */
        public async Task<SetIpSkuResponse> SetIpSkuExAsync(SetIpSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpSkuResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.sku.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品基础信息的更新数据
         * Summary: 数字商品服务-IP授权服务-查询更新数据
         */
        public QueryIpGoodsupdateResponse QueryIpGoodsupdate(QueryIpGoodsupdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpGoodsupdateEx(request, headers, runtime);
        }

        /**
         * Description: 查询商品基础信息的更新数据
         * Summary: 数字商品服务-IP授权服务-查询更新数据
         */
        public async Task<QueryIpGoodsupdateResponse> QueryIpGoodsupdateAsync(QueryIpGoodsupdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpGoodsupdateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商品基础信息的更新数据
         * Summary: 数字商品服务-IP授权服务-查询更新数据
         */
        public QueryIpGoodsupdateResponse QueryIpGoodsupdateEx(QueryIpGoodsupdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsupdateResponse>(DoRequest("1.0", "baas.antdao.ip.goodsupdate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商品基础信息的更新数据
         * Summary: 数字商品服务-IP授权服务-查询更新数据
         */
        public async Task<QueryIpGoodsupdateResponse> QueryIpGoodsupdateExAsync(QueryIpGoodsupdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsupdateResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goodsupdate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账单信息，分页查询
         * Summary: 数字商品服务-IP授权服务-查询账单列表
         */
        public PagequeryIpBillResponse PagequeryIpBill(PagequeryIpBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIpBillEx(request, headers, runtime);
        }

        /**
         * Description: 查询账单信息，分页查询
         * Summary: 数字商品服务-IP授权服务-查询账单列表
         */
        public async Task<PagequeryIpBillResponse> PagequeryIpBillAsync(PagequeryIpBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIpBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询账单信息，分页查询
         * Summary: 数字商品服务-IP授权服务-查询账单列表
         */
        public PagequeryIpBillResponse PagequeryIpBillEx(PagequeryIpBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpBillResponse>(DoRequest("1.0", "baas.antdao.ip.bill.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账单信息，分页查询
         * Summary: 数字商品服务-IP授权服务-查询账单列表
         */
        public async Task<PagequeryIpBillResponse> PagequeryIpBillExAsync(PagequeryIpBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpBillResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.bill.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品某个渠道默认sku查询
         * Summary: 数字商品服务-IP授权服务-sku查询
         */
        public QueryIpSkuconfigResponse QueryIpSkuconfig(QueryIpSkuconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpSkuconfigEx(request, headers, runtime);
        }

        /**
         * Description: ip商品某个渠道默认sku查询
         * Summary: 数字商品服务-IP授权服务-sku查询
         */
        public async Task<QueryIpSkuconfigResponse> QueryIpSkuconfigAsync(QueryIpSkuconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpSkuconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: ip商品某个渠道默认sku查询
         * Summary: 数字商品服务-IP授权服务-sku查询
         */
        public QueryIpSkuconfigResponse QueryIpSkuconfigEx(QueryIpSkuconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpSkuconfigResponse>(DoRequest("1.0", "baas.antdao.ip.skuconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip商品某个渠道默认sku查询
         * Summary: 数字商品服务-IP授权服务-sku查询
         */
        public async Task<QueryIpSkuconfigResponse> QueryIpSkuconfigExAsync(QueryIpSkuconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpSkuconfigResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.skuconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
         * Summary: 数字商品服务-IP授权服务-版权方导入
         */
        public ImportIpAccountResponse ImportIpAccount(ImportIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
         * Summary: 数字商品服务-IP授权服务-版权方导入
         */
        public async Task<ImportIpAccountResponse> ImportIpAccountAsync(ImportIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
         * Summary: 数字商品服务-IP授权服务-版权方导入
         */
        public ImportIpAccountResponse ImportIpAccountEx(ImportIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
         * Summary: 数字商品服务-IP授权服务-版权方导入
         */
        public async Task<ImportIpAccountResponse> ImportIpAccountExAsync(ImportIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品特定渠道的sku信息清空
         * Summary: 数字商品服务-IP授权服务-sku清空
         */
        public RemoveIpSkuResponse RemoveIpSku(RemoveIpSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveIpSkuEx(request, headers, runtime);
        }

        /**
         * Description: 商品特定渠道的sku信息清空
         * Summary: 数字商品服务-IP授权服务-sku清空
         */
        public async Task<RemoveIpSkuResponse> RemoveIpSkuAsync(RemoveIpSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveIpSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品特定渠道的sku信息清空
         * Summary: 数字商品服务-IP授权服务-sku清空
         */
        public RemoveIpSkuResponse RemoveIpSkuEx(RemoveIpSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveIpSkuResponse>(DoRequest("1.0", "baas.antdao.ip.sku.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品特定渠道的sku信息清空
         * Summary: 数字商品服务-IP授权服务-sku清空
         */
        public async Task<RemoveIpSkuResponse> RemoveIpSkuExAsync(RemoveIpSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveIpSkuResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.sku.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建监修报审
         * Summary: 数字商品服务-IP授权服务-创建监修报审
         */
        public CreateIpSuperviseapproveResponse CreateIpSuperviseapprove(CreateIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIpSuperviseapproveEx(request, headers, runtime);
        }

        /**
         * Description: 创建监修报审
         * Summary: 数字商品服务-IP授权服务-创建监修报审
         */
        public async Task<CreateIpSuperviseapproveResponse> CreateIpSuperviseapproveAsync(CreateIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIpSuperviseapproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建监修报审
         * Summary: 数字商品服务-IP授权服务-创建监修报审
         */
        public CreateIpSuperviseapproveResponse CreateIpSuperviseapproveEx(CreateIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpSuperviseapproveResponse>(DoRequest("1.0", "baas.antdao.ip.superviseapprove.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建监修报审
         * Summary: 数字商品服务-IP授权服务-创建监修报审
         */
        public async Task<CreateIpSuperviseapproveResponse> CreateIpSuperviseapproveExAsync(CreateIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpSuperviseapproveResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.superviseapprove.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监修报审审批
         * Summary: 数字商品服务-IP授权服务-监修报审审批
         */
        public ConfirmIpSuperviseapproveResponse ConfirmIpSuperviseapprove(ConfirmIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpSuperviseapproveEx(request, headers, runtime);
        }

        /**
         * Description: 监修报审审批
         * Summary: 数字商品服务-IP授权服务-监修报审审批
         */
        public async Task<ConfirmIpSuperviseapproveResponse> ConfirmIpSuperviseapproveAsync(ConfirmIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpSuperviseapproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 监修报审审批
         * Summary: 数字商品服务-IP授权服务-监修报审审批
         */
        public ConfirmIpSuperviseapproveResponse ConfirmIpSuperviseapproveEx(ConfirmIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpSuperviseapproveResponse>(DoRequest("1.0", "baas.antdao.ip.superviseapprove.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监修报审审批
         * Summary: 数字商品服务-IP授权服务-监修报审审批
         */
        public async Task<ConfirmIpSuperviseapproveResponse> ConfirmIpSuperviseapproveExAsync(ConfirmIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpSuperviseapproveResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.superviseapprove.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监修报审进度推进/重置
         * Summary: 数字商品服务-IP授权服务-推进监修报审
         */
        public PushIpSuperviseapproveResponse PushIpSuperviseapprove(PushIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushIpSuperviseapproveEx(request, headers, runtime);
        }

        /**
         * Description: 监修报审进度推进/重置
         * Summary: 数字商品服务-IP授权服务-推进监修报审
         */
        public async Task<PushIpSuperviseapproveResponse> PushIpSuperviseapproveAsync(PushIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushIpSuperviseapproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 监修报审进度推进/重置
         * Summary: 数字商品服务-IP授权服务-推进监修报审
         */
        public PushIpSuperviseapproveResponse PushIpSuperviseapproveEx(PushIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIpSuperviseapproveResponse>(DoRequest("1.0", "baas.antdao.ip.superviseapprove.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监修报审进度推进/重置
         * Summary: 数字商品服务-IP授权服务-推进监修报审
         */
        public async Task<PushIpSuperviseapproveResponse> PushIpSuperviseapproveExAsync(PushIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIpSuperviseapproveResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.superviseapprove.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-查询监修报审详情
         * Summary: 数字商品服务-IP授权服务-查询监修报审
         */
        public QueryIpSuperviseapproveResponse QueryIpSuperviseapprove(QueryIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpSuperviseapproveEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-查询监修报审详情
         * Summary: 数字商品服务-IP授权服务-查询监修报审
         */
        public async Task<QueryIpSuperviseapproveResponse> QueryIpSuperviseapproveAsync(QueryIpSuperviseapproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpSuperviseapproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-查询监修报审详情
         * Summary: 数字商品服务-IP授权服务-查询监修报审
         */
        public QueryIpSuperviseapproveResponse QueryIpSuperviseapproveEx(QueryIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpSuperviseapproveResponse>(DoRequest("1.0", "baas.antdao.ip.superviseapprove.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-查询监修报审详情
         * Summary: 数字商品服务-IP授权服务-查询监修报审
         */
        public async Task<QueryIpSuperviseapproveResponse> QueryIpSuperviseapproveExAsync(QueryIpSuperviseapproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpSuperviseapproveResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.superviseapprove.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 领取正版码，如已被领取则返回被领取人昵称信息
         * Summary: 数字商品服务-IP授权服务-正版码领取
         */
        public ReceiveIpCodeResponse ReceiveIpCode(ReceiveIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReceiveIpCodeEx(request, headers, runtime);
        }

        /**
         * Description: 领取正版码，如已被领取则返回被领取人昵称信息
         * Summary: 数字商品服务-IP授权服务-正版码领取
         */
        public async Task<ReceiveIpCodeResponse> ReceiveIpCodeAsync(ReceiveIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReceiveIpCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 领取正版码，如已被领取则返回被领取人昵称信息
         * Summary: 数字商品服务-IP授权服务-正版码领取
         */
        public ReceiveIpCodeResponse ReceiveIpCodeEx(ReceiveIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveIpCodeResponse>(DoRequest("1.0", "baas.antdao.ip.code.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 领取正版码，如已被领取则返回被领取人昵称信息
         * Summary: 数字商品服务-IP授权服务-正版码领取
         */
        public async Task<ReceiveIpCodeResponse> ReceiveIpCodeExAsync(ReceiveIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveIpCodeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.code.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已领取或以扫描过的正版码列表，分页查询
         * Summary: 数字商品服务-IP授权服务-正版码列表
         */
        public PagequeryIpCodeinfoResponse PagequeryIpCodeinfo(PagequeryIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIpCodeinfoEx(request, headers, runtime);
        }

        /**
         * Description: 已领取或以扫描过的正版码列表，分页查询
         * Summary: 数字商品服务-IP授权服务-正版码列表
         */
        public async Task<PagequeryIpCodeinfoResponse> PagequeryIpCodeinfoAsync(PagequeryIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIpCodeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 已领取或以扫描过的正版码列表，分页查询
         * Summary: 数字商品服务-IP授权服务-正版码列表
         */
        public PagequeryIpCodeinfoResponse PagequeryIpCodeinfoEx(PagequeryIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpCodeinfoResponse>(DoRequest("1.0", "baas.antdao.ip.codeinfo.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已领取或以扫描过的正版码列表，分页查询
         * Summary: 数字商品服务-IP授权服务-正版码列表
         */
        public async Task<PagequeryIpCodeinfoResponse> PagequeryIpCodeinfoExAsync(PagequeryIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpCodeinfoResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.codeinfo.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建增值服务
         * Summary: 数字商品服务-IP授权服务-创建增值服务
         */
        public CreateIpValueaddResponse CreateIpValueadd(CreateIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIpValueaddEx(request, headers, runtime);
        }

        /**
         * Description: 创建增值服务
         * Summary: 数字商品服务-IP授权服务-创建增值服务
         */
        public async Task<CreateIpValueaddResponse> CreateIpValueaddAsync(CreateIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIpValueaddExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建增值服务
         * Summary: 数字商品服务-IP授权服务-创建增值服务
         */
        public CreateIpValueaddResponse CreateIpValueaddEx(CreateIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpValueaddResponse>(DoRequest("1.0", "baas.antdao.ip.valueadd.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建增值服务
         * Summary: 数字商品服务-IP授权服务-创建增值服务
         */
        public async Task<CreateIpValueaddResponse> CreateIpValueaddExAsync(CreateIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIpValueaddResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueadd.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-更新增值服务
         * Summary: 数字商品服务-IP授权服务-更新增值服务
         */
        public UpdateIpValueaddResponse UpdateIpValueadd(UpdateIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIpValueaddEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-更新增值服务
         * Summary: 数字商品服务-IP授权服务-更新增值服务
         */
        public async Task<UpdateIpValueaddResponse> UpdateIpValueaddAsync(UpdateIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIpValueaddExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-更新增值服务
         * Summary: 数字商品服务-IP授权服务-更新增值服务
         */
        public UpdateIpValueaddResponse UpdateIpValueaddEx(UpdateIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpValueaddResponse>(DoRequest("1.0", "baas.antdao.ip.valueadd.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-更新增值服务
         * Summary: 数字商品服务-IP授权服务-更新增值服务
         */
        public async Task<UpdateIpValueaddResponse> UpdateIpValueaddExAsync(UpdateIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpValueaddResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueadd.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权-设置增值服务sku
         * Summary: 数字商品服务-IP授权服务-设置增值服务
         */
        public SetIpValueaddskuResponse SetIpValueaddsku(SetIpValueaddskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetIpValueaddskuEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权-设置增值服务sku
         * Summary: 数字商品服务-IP授权服务-设置增值服务
         */
        public async Task<SetIpValueaddskuResponse> SetIpValueaddskuAsync(SetIpValueaddskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetIpValueaddskuExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权-设置增值服务sku
         * Summary: 数字商品服务-IP授权服务-设置增值服务
         */
        public SetIpValueaddskuResponse SetIpValueaddskuEx(SetIpValueaddskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpValueaddskuResponse>(DoRequest("1.0", "baas.antdao.ip.valueaddsku.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权-设置增值服务sku
         * Summary: 数字商品服务-IP授权服务-设置增值服务
         */
        public async Task<SetIpValueaddskuResponse> SetIpValueaddskuExAsync(SetIpValueaddskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpValueaddskuResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueaddsku.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-增值服务上下架操作
         * Summary: 数字商品服务-IP授权服务-服务上下架
         */
        public OnlineIpValueaddResponse OnlineIpValueadd(OnlineIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineIpValueaddEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-增值服务上下架操作
         * Summary: 数字商品服务-IP授权服务-服务上下架
         */
        public async Task<OnlineIpValueaddResponse> OnlineIpValueaddAsync(OnlineIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineIpValueaddExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-增值服务上下架操作
         * Summary: 数字商品服务-IP授权服务-服务上下架
         */
        public OnlineIpValueaddResponse OnlineIpValueaddEx(OnlineIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineIpValueaddResponse>(DoRequest("1.0", "baas.antdao.ip.valueadd.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-增值服务上下架操作
         * Summary: 数字商品服务-IP授权服务-服务上下架
         */
        public async Task<OnlineIpValueaddResponse> OnlineIpValueaddExAsync(OnlineIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineIpValueaddResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueadd.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-增值服务查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public QueryIpValueaddResponse QueryIpValueadd(QueryIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpValueaddEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-增值服务查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public async Task<QueryIpValueaddResponse> QueryIpValueaddAsync(QueryIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpValueaddExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品-IP授权交易-增值服务查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public QueryIpValueaddResponse QueryIpValueaddEx(QueryIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpValueaddResponse>(DoRequest("1.0", "baas.antdao.ip.valueadd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品-IP授权交易-增值服务查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public async Task<QueryIpValueaddResponse> QueryIpValueaddExAsync(QueryIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpValueaddResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueadd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增值服务批量查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public PagequeryIpValueaddResponse PagequeryIpValueadd(PagequeryIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIpValueaddEx(request, headers, runtime);
        }

        /**
         * Description: 增值服务批量查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public async Task<PagequeryIpValueaddResponse> PagequeryIpValueaddAsync(PagequeryIpValueaddRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIpValueaddExAsync(request, headers, runtime);
        }

        /**
         * Description: 增值服务批量查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public PagequeryIpValueaddResponse PagequeryIpValueaddEx(PagequeryIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpValueaddResponse>(DoRequest("1.0", "baas.antdao.ip.valueadd.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 增值服务批量查询
         * Summary: 数字商品服务-IP授权服务-增值服务查询
         */
        public async Task<PagequeryIpValueaddResponse> PagequeryIpValueaddExAsync(PagequeryIpValueaddRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpValueaddResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.valueadd.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量上传授权交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public UploadIpTradesalesResponse UploadIpTradesales(UploadIpTradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadIpTradesalesEx(request, headers, runtime);
        }

        /**
         * Description: 批量上传授权交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public async Task<UploadIpTradesalesResponse> UploadIpTradesalesAsync(UploadIpTradesalesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadIpTradesalesExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量上传授权交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public UploadIpTradesalesResponse UploadIpTradesalesEx(UploadIpTradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpTradesalesResponse>(DoRequest("1.0", "baas.antdao.ip.tradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量上传授权交易的销售数据
         * Summary: 数字商品服务-IP授权服务-上传销售数据
         */
        public async Task<UploadIpTradesalesResponse> UploadIpTradesalesExAsync(UploadIpTradesalesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIpTradesalesResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.tradesales.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: C端用户授权信息
         * Summary: 数字商品服务-IP授权服务-C用户授权
         */
        public AuthIpUserResponse AuthIpUser(AuthIpUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthIpUserEx(request, headers, runtime);
        }

        /**
         * Description: C端用户授权信息
         * Summary: 数字商品服务-IP授权服务-C用户授权
         */
        public async Task<AuthIpUserResponse> AuthIpUserAsync(AuthIpUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthIpUserExAsync(request, headers, runtime);
        }

        /**
         * Description: C端用户授权信息
         * Summary: 数字商品服务-IP授权服务-C用户授权
         */
        public AuthIpUserResponse AuthIpUserEx(AuthIpUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIpUserResponse>(DoRequest("1.0", "baas.antdao.ip.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: C端用户授权信息
         * Summary: 数字商品服务-IP授权服务-C用户授权
         */
        public async Task<AuthIpUserResponse> AuthIpUserExAsync(AuthIpUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIpUserResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-删除ip商品
         * Summary: 数字商品服务-IP授权服务-IP删除
         */
        public RemoveIpGoodsResponse RemoveIpGoods(RemoveIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveIpGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-删除ip商品
         * Summary: 数字商品服务-IP授权服务-IP删除
         */
        public async Task<RemoveIpGoodsResponse> RemoveIpGoodsAsync(RemoveIpGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveIpGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-删除ip商品
         * Summary: 数字商品服务-IP授权服务-IP删除
         */
        public RemoveIpGoodsResponse RemoveIpGoodsEx(RemoveIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveIpGoodsResponse>(DoRequest("1.0", "baas.antdao.ip.goods.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-删除ip商品
         * Summary: 数字商品服务-IP授权服务-IP删除
         */
        public async Task<RemoveIpGoodsResponse> RemoveIpGoodsExAsync(RemoveIpGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveIpGoodsResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goods.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-ip数量统计
         * Summary: 数字商品服务-IP授权服务-ip数量统计
         */
        public CountIpNumResponse CountIpNum(CountIpNumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountIpNumEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-ip数量统计
         * Summary: 数字商品服务-IP授权服务-ip数量统计
         */
        public async Task<CountIpNumResponse> CountIpNumAsync(CountIpNumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountIpNumExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-ip数量统计
         * Summary: 数字商品服务-IP授权服务-ip数量统计
         */
        public CountIpNumResponse CountIpNumEx(CountIpNumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpNumResponse>(DoRequest("1.0", "baas.antdao.ip.num.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-ip数量统计
         * Summary: 数字商品服务-IP授权服务-ip数量统计
         */
        public async Task<CountIpNumResponse> CountIpNumExAsync(CountIpNumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpNumResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.num.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-pv统计
         * Summary: 数字商品服务-IP授权服务-pv统计
         */
        public CountIpPvResponse CountIpPv(CountIpPvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountIpPvEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-pv统计
         * Summary: 数字商品服务-IP授权服务-pv统计
         */
        public async Task<CountIpPvResponse> CountIpPvAsync(CountIpPvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountIpPvExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-pv统计
         * Summary: 数字商品服务-IP授权服务-pv统计
         */
        public CountIpPvResponse CountIpPvEx(CountIpPvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpPvResponse>(DoRequest("1.0", "baas.antdao.ip.pv.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-pv统计
         * Summary: 数字商品服务-IP授权服务-pv统计
         */
        public async Task<CountIpPvResponse> CountIpPvExAsync(CountIpPvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpPvResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.pv.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询正版码信息
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public QueryIpCodeResponse QueryIpCode(QueryIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpCodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询正版码信息
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public async Task<QueryIpCodeResponse> QueryIpCodeAsync(QueryIpCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询正版码信息
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public QueryIpCodeResponse QueryIpCodeEx(QueryIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpCodeResponse>(DoRequest("1.0", "baas.antdao.ip.code.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询正版码信息
         * Summary: 数字商品服务-IP授权服务-正版码查询
         */
        public async Task<QueryIpCodeResponse> QueryIpCodeExAsync(QueryIpCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpCodeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.code.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-账户统计
         * Summary: 数字商品服务-IP授权服务-账户统计
         */
        public CountIpAccountResponse CountIpAccount(CountIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountIpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-账户统计
         * Summary: 数字商品服务-IP授权服务-账户统计
         */
        public async Task<CountIpAccountResponse> CountIpAccountAsync(CountIpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountIpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字商品服务-IP授权服务-账户统计
         * Summary: 数字商品服务-IP授权服务-账户统计
         */
        public CountIpAccountResponse CountIpAccountEx(CountIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpAccountResponse>(DoRequest("1.0", "baas.antdao.ip.account.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字商品服务-IP授权服务-账户统计
         * Summary: 数字商品服务-IP授权服务-账户统计
         */
        public async Task<CountIpAccountResponse> CountIpAccountExAsync(CountIpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIpAccountResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.account.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询渠道订单统计值
         * Summary: 数字商品服务-IP授权服务-查询订单统计
         */
        public QueryIpOrderstatisticResponse QueryIpOrderstatistic(QueryIpOrderstatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpOrderstatisticEx(request, headers, runtime);
        }

        /**
         * Description: 查询渠道订单统计值
         * Summary: 数字商品服务-IP授权服务-查询订单统计
         */
        public async Task<QueryIpOrderstatisticResponse> QueryIpOrderstatisticAsync(QueryIpOrderstatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpOrderstatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询渠道订单统计值
         * Summary: 数字商品服务-IP授权服务-查询订单统计
         */
        public QueryIpOrderstatisticResponse QueryIpOrderstatisticEx(QueryIpOrderstatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderstatisticResponse>(DoRequest("1.0", "baas.antdao.ip.orderstatistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询渠道订单统计值
         * Summary: 数字商品服务-IP授权服务-查询订单统计
         */
        public async Task<QueryIpOrderstatisticResponse> QueryIpOrderstatisticExAsync(QueryIpOrderstatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpOrderstatisticResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.orderstatistic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方更新IP图库
         * Summary: 数字商品服务-IP授权服务-ip更新图库
         */
        public UpdateIpGoodsgalleryResponse UpdateIpGoodsgallery(UpdateIpGoodsgalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIpGoodsgalleryEx(request, headers, runtime);
        }

        /**
         * Description: 版权方更新IP图库
         * Summary: 数字商品服务-IP授权服务-ip更新图库
         */
        public async Task<UpdateIpGoodsgalleryResponse> UpdateIpGoodsgalleryAsync(UpdateIpGoodsgalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIpGoodsgalleryExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方更新IP图库
         * Summary: 数字商品服务-IP授权服务-ip更新图库
         */
        public UpdateIpGoodsgalleryResponse UpdateIpGoodsgalleryEx(UpdateIpGoodsgalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpGoodsgalleryResponse>(DoRequest("1.0", "baas.antdao.ip.goodsgallery.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方更新IP图库
         * Summary: 数字商品服务-IP授权服务-ip更新图库
         */
        public async Task<UpdateIpGoodsgalleryResponse> UpdateIpGoodsgalleryExAsync(UpdateIpGoodsgalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIpGoodsgalleryResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goodsgallery.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
         * Summary: 数字商品服务-IP授权服务-查询ip图库
         */
        public QueryIpGoodsgalleryResponse QueryIpGoodsgallery(QueryIpGoodsgalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpGoodsgalleryEx(request, headers, runtime);
        }

        /**
         * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
         * Summary: 数字商品服务-IP授权服务-查询ip图库
         */
        public async Task<QueryIpGoodsgalleryResponse> QueryIpGoodsgalleryAsync(QueryIpGoodsgalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpGoodsgalleryExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
         * Summary: 数字商品服务-IP授权服务-查询ip图库
         */
        public QueryIpGoodsgalleryResponse QueryIpGoodsgalleryEx(QueryIpGoodsgalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsgalleryResponse>(DoRequest("1.0", "baas.antdao.ip.goodsgallery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
         * Summary: 数字商品服务-IP授权服务-查询ip图库
         */
        public async Task<QueryIpGoodsgalleryResponse> QueryIpGoodsgalleryExAsync(QueryIpGoodsgalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpGoodsgalleryResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.goodsgallery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置正版码的商品信息和资源位信息
         * Summary: 数字商品服务-IP授权服务-正版码配置
         */
        public SetIpCodeinfoResponse SetIpCodeinfo(SetIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetIpCodeinfoEx(request, headers, runtime);
        }

        /**
         * Description: 配置正版码的商品信息和资源位信息
         * Summary: 数字商品服务-IP授权服务-正版码配置
         */
        public async Task<SetIpCodeinfoResponse> SetIpCodeinfoAsync(SetIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetIpCodeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置正版码的商品信息和资源位信息
         * Summary: 数字商品服务-IP授权服务-正版码配置
         */
        public SetIpCodeinfoResponse SetIpCodeinfoEx(SetIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpCodeinfoResponse>(DoRequest("1.0", "baas.antdao.ip.codeinfo.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置正版码的商品信息和资源位信息
         * Summary: 数字商品服务-IP授权服务-正版码配置
         */
        public async Task<SetIpCodeinfoResponse> SetIpCodeinfoExAsync(SetIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetIpCodeinfoResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.codeinfo.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单的图库下载记录
         * Summary: 数字商品服务-IP授权服务-查询图库记录
         */
        public PagequeryIpGalleryinstructionResponse PagequeryIpGalleryinstruction(PagequeryIpGalleryinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIpGalleryinstructionEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单的图库下载记录
         * Summary: 数字商品服务-IP授权服务-查询图库记录
         */
        public async Task<PagequeryIpGalleryinstructionResponse> PagequeryIpGalleryinstructionAsync(PagequeryIpGalleryinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIpGalleryinstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单的图库下载记录
         * Summary: 数字商品服务-IP授权服务-查询图库记录
         */
        public PagequeryIpGalleryinstructionResponse PagequeryIpGalleryinstructionEx(PagequeryIpGalleryinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpGalleryinstructionResponse>(DoRequest("1.0", "baas.antdao.ip.galleryinstruction.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单的图库下载记录
         * Summary: 数字商品服务-IP授权服务-查询图库记录
         */
        public async Task<PagequeryIpGalleryinstructionResponse> PagequeryIpGalleryinstructionExAsync(PagequeryIpGalleryinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIpGalleryinstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.galleryinstruction.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方确认订单图库信息
         * Summary: 数字商品服务-IP授权服务-订单图库确认
         */
        public ConfirmIpOrdergalleryResponse ConfirmIpOrdergallery(ConfirmIpOrdergalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpOrdergalleryEx(request, headers, runtime);
        }

        /**
         * Description: 版权方确认订单图库信息
         * Summary: 数字商品服务-IP授权服务-订单图库确认
         */
        public async Task<ConfirmIpOrdergalleryResponse> ConfirmIpOrdergalleryAsync(ConfirmIpOrdergalleryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpOrdergalleryExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方确认订单图库信息
         * Summary: 数字商品服务-IP授权服务-订单图库确认
         */
        public ConfirmIpOrdergalleryResponse ConfirmIpOrdergalleryEx(ConfirmIpOrdergalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpOrdergalleryResponse>(DoRequest("1.0", "baas.antdao.ip.ordergallery.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方确认订单图库信息
         * Summary: 数字商品服务-IP授权服务-订单图库确认
         */
        public async Task<ConfirmIpOrdergalleryResponse> ConfirmIpOrdergalleryExAsync(ConfirmIpOrdergalleryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpOrdergalleryResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.ordergallery.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审批IP定向授权交易
         * Summary: 数字商品服务-IP授权服务-审批定向授权
         */
        public ConfirmIpAuthtradeResponse ConfirmIpAuthtrade(ConfirmIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpAuthtradeEx(request, headers, runtime);
        }

        /**
         * Description: 审批IP定向授权交易
         * Summary: 数字商品服务-IP授权服务-审批定向授权
         */
        public async Task<ConfirmIpAuthtradeResponse> ConfirmIpAuthtradeAsync(ConfirmIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpAuthtradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 审批IP定向授权交易
         * Summary: 数字商品服务-IP授权服务-审批定向授权
         */
        public ConfirmIpAuthtradeResponse ConfirmIpAuthtradeEx(ConfirmIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpAuthtradeResponse>(DoRequest("1.0", "baas.antdao.ip.authtrade.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审批IP定向授权交易
         * Summary: 数字商品服务-IP授权服务-审批定向授权
         */
        public async Task<ConfirmIpAuthtradeResponse> ConfirmIpAuthtradeExAsync(ConfirmIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpAuthtradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.authtrade.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审核套餐授权申请
         * Summary: 数字商品服务-IP授权服务-审批套餐授权
         */
        public ConfirmIpPackagetradeResponse ConfirmIpPackagetrade(ConfirmIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmIpPackagetradeEx(request, headers, runtime);
        }

        /**
         * Description: 审核套餐授权申请
         * Summary: 数字商品服务-IP授权服务-审批套餐授权
         */
        public async Task<ConfirmIpPackagetradeResponse> ConfirmIpPackagetradeAsync(ConfirmIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmIpPackagetradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 审核套餐授权申请
         * Summary: 数字商品服务-IP授权服务-审批套餐授权
         */
        public ConfirmIpPackagetradeResponse ConfirmIpPackagetradeEx(ConfirmIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpPackagetradeResponse>(DoRequest("1.0", "baas.antdao.ip.packagetrade.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审核套餐授权申请
         * Summary: 数字商品服务-IP授权服务-审批套餐授权
         */
        public async Task<ConfirmIpPackagetradeResponse> ConfirmIpPackagetradeExAsync(ConfirmIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmIpPackagetradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.packagetrade.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家申请套餐交易
         * Summary: 数字商品服务-IP授权服务-申请套餐交易
         */
        public ApplyIpPackagetradeResponse ApplyIpPackagetrade(ApplyIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyIpPackagetradeEx(request, headers, runtime);
        }

        /**
         * Description: 商家申请套餐交易
         * Summary: 数字商品服务-IP授权服务-申请套餐交易
         */
        public async Task<ApplyIpPackagetradeResponse> ApplyIpPackagetradeAsync(ApplyIpPackagetradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyIpPackagetradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家申请套餐交易
         * Summary: 数字商品服务-IP授权服务-申请套餐交易
         */
        public ApplyIpPackagetradeResponse ApplyIpPackagetradeEx(ApplyIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpPackagetradeResponse>(DoRequest("1.0", "baas.antdao.ip.packagetrade.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家申请套餐交易
         * Summary: 数字商品服务-IP授权服务-申请套餐交易
         */
        public async Task<ApplyIpPackagetradeResponse> ApplyIpPackagetradeExAsync(ApplyIpPackagetradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpPackagetradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.packagetrade.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方申请授权交易
         * Summary: 数字商品服务-IP授权服务-申请授权交易
         */
        public ApplyIpAuthtradeResponse ApplyIpAuthtrade(ApplyIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyIpAuthtradeEx(request, headers, runtime);
        }

        /**
         * Description: 版权方申请授权交易
         * Summary: 数字商品服务-IP授权服务-申请授权交易
         */
        public async Task<ApplyIpAuthtradeResponse> ApplyIpAuthtradeAsync(ApplyIpAuthtradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyIpAuthtradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权方申请授权交易
         * Summary: 数字商品服务-IP授权服务-申请授权交易
         */
        public ApplyIpAuthtradeResponse ApplyIpAuthtradeEx(ApplyIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpAuthtradeResponse>(DoRequest("1.0", "baas.antdao.ip.authtrade.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权方申请授权交易
         * Summary: 数字商品服务-IP授权服务-申请授权交易
         */
        public async Task<ApplyIpAuthtradeResponse> ApplyIpAuthtradeExAsync(ApplyIpAuthtradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIpAuthtradeResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.authtrade.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询正版码的配置信息
         * Summary: 数字商品服务-IP授权服务-查正版码配置
         */
        public QueryIpCodeinfoResponse QueryIpCodeinfo(QueryIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpCodeinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询正版码的配置信息
         * Summary: 数字商品服务-IP授权服务-查正版码配置
         */
        public async Task<QueryIpCodeinfoResponse> QueryIpCodeinfoAsync(QueryIpCodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpCodeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询正版码的配置信息
         * Summary: 数字商品服务-IP授权服务-查正版码配置
         */
        public QueryIpCodeinfoResponse QueryIpCodeinfoEx(QueryIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpCodeinfoResponse>(DoRequest("1.0", "baas.antdao.ip.codeinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询正版码的配置信息
         * Summary: 数字商品服务-IP授权服务-查正版码配置
         */
        public async Task<QueryIpCodeinfoResponse> QueryIpCodeinfoExAsync(QueryIpCodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpCodeinfoResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.codeinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
         * Summary: ip审批信息批量查询（带上更新信息）
         */
        public BatchqueryIpApprovalwithupdateResponse BatchqueryIpApprovalwithupdate(BatchqueryIpApprovalwithupdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryIpApprovalwithupdateEx(request, headers, runtime);
        }

        /**
         * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
         * Summary: ip审批信息批量查询（带上更新信息）
         */
        public async Task<BatchqueryIpApprovalwithupdateResponse> BatchqueryIpApprovalwithupdateAsync(BatchqueryIpApprovalwithupdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryIpApprovalwithupdateExAsync(request, headers, runtime);
        }

        /**
         * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
         * Summary: ip审批信息批量查询（带上更新信息）
         */
        public BatchqueryIpApprovalwithupdateResponse BatchqueryIpApprovalwithupdateEx(BatchqueryIpApprovalwithupdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalwithupdateResponse>(DoRequest("1.0", "baas.antdao.ip.approvalwithupdate.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
         * Summary: ip审批信息批量查询（带上更新信息）
         */
        public async Task<BatchqueryIpApprovalwithupdateResponse> BatchqueryIpApprovalwithupdateExAsync(BatchqueryIpApprovalwithupdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryIpApprovalwithupdateResponse>(await DoRequestAsync("1.0", "baas.antdao.ip.approvalwithupdate.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public QueryBlockanalysisBlockResponse QueryBlockanalysisBlock(QueryBlockanalysisBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisBlockEx(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public async Task<QueryBlockanalysisBlockResponse> QueryBlockanalysisBlockAsync(QueryBlockanalysisBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisBlockExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public QueryBlockanalysisBlockResponse QueryBlockanalysisBlockEx(QueryBlockanalysisBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisBlockResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定高度的区块信息
         * Summary: 数字商品服务-拉块服务-获取区块信息
         */
        public async Task<QueryBlockanalysisBlockResponse> QueryBlockanalysisBlockExAsync(QueryBlockanalysisBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisBlockResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public QueryBlockanalysisLastblocknumberResponse QueryBlockanalysisLastblocknumber(QueryBlockanalysisLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisLastblocknumberEx(request, headers, runtime);
        }

        /**
         * Description: 获取最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public async Task<QueryBlockanalysisLastblocknumberResponse> QueryBlockanalysisLastblocknumberAsync(QueryBlockanalysisLastblocknumberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisLastblocknumberExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public QueryBlockanalysisLastblocknumberResponse QueryBlockanalysisLastblocknumberEx(QueryBlockanalysisLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisLastblocknumberResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取最新区块高度
         * Summary: 数字商品服务-拉块服务-获取最新区块高度
         */
        public async Task<QueryBlockanalysisLastblocknumberResponse> QueryBlockanalysisLastblocknumberExAsync(QueryBlockanalysisLastblocknumberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisLastblocknumberResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取公开的或者已授权的权益商品信息
         * Summary: 数字商品服务-拉块服务-获取已授权商品
         */
        public QueryBlockanalysisOpenedequitiesResponse QueryBlockanalysisOpenedequities(QueryBlockanalysisOpenedequitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisOpenedequitiesEx(request, headers, runtime);
        }

        /**
         * Description: 获取公开的或者已授权的权益商品信息
         * Summary: 数字商品服务-拉块服务-获取已授权商品
         */
        public async Task<QueryBlockanalysisOpenedequitiesResponse> QueryBlockanalysisOpenedequitiesAsync(QueryBlockanalysisOpenedequitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisOpenedequitiesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取公开的或者已授权的权益商品信息
         * Summary: 数字商品服务-拉块服务-获取已授权商品
         */
        public QueryBlockanalysisOpenedequitiesResponse QueryBlockanalysisOpenedequitiesEx(QueryBlockanalysisOpenedequitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisOpenedequitiesResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取公开的或者已授权的权益商品信息
         * Summary: 数字商品服务-拉块服务-获取已授权商品
         */
        public async Task<QueryBlockanalysisOpenedequitiesResponse> QueryBlockanalysisOpenedequitiesExAsync(QueryBlockanalysisOpenedequitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisOpenedequitiesResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已设置过用户价格的有效权益商品信息
         * Summary: 数字商品服务-拉块服务-已设用户价格商品
         */
        public QueryBlockanalysisUserpriceupdatedequitiesResponse QueryBlockanalysisUserpriceupdatedequities(QueryBlockanalysisUserpriceupdatedequitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisUserpriceupdatedequitiesEx(request, headers, runtime);
        }

        /**
         * Description: 查询已设置过用户价格的有效权益商品信息
         * Summary: 数字商品服务-拉块服务-已设用户价格商品
         */
        public async Task<QueryBlockanalysisUserpriceupdatedequitiesResponse> QueryBlockanalysisUserpriceupdatedequitiesAsync(QueryBlockanalysisUserpriceupdatedequitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisUserpriceupdatedequitiesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已设置过用户价格的有效权益商品信息
         * Summary: 数字商品服务-拉块服务-已设用户价格商品
         */
        public QueryBlockanalysisUserpriceupdatedequitiesResponse QueryBlockanalysisUserpriceupdatedequitiesEx(QueryBlockanalysisUserpriceupdatedequitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisUserpriceupdatedequitiesResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已设置过用户价格的有效权益商品信息
         * Summary: 数字商品服务-拉块服务-已设用户价格商品
         */
        public async Task<QueryBlockanalysisUserpriceupdatedequitiesResponse> QueryBlockanalysisUserpriceupdatedequitiesExAsync(QueryBlockanalysisUserpriceupdatedequitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisUserpriceupdatedequitiesResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户的可提现资产价值(单位:分)
         * Summary: 数字商品服务-拉块服务-查询可提现资产
         */
        public QueryBlockanalysisUnwriteoffvalueResponse QueryBlockanalysisUnwriteoffvalue(QueryBlockanalysisUnwriteoffvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisUnwriteoffvalueEx(request, headers, runtime);
        }

        /**
         * Description: 查询商户的可提现资产价值(单位:分)
         * Summary: 数字商品服务-拉块服务-查询可提现资产
         */
        public async Task<QueryBlockanalysisUnwriteoffvalueResponse> QueryBlockanalysisUnwriteoffvalueAsync(QueryBlockanalysisUnwriteoffvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisUnwriteoffvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商户的可提现资产价值(单位:分)
         * Summary: 数字商品服务-拉块服务-查询可提现资产
         */
        public QueryBlockanalysisUnwriteoffvalueResponse QueryBlockanalysisUnwriteoffvalueEx(QueryBlockanalysisUnwriteoffvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisUnwriteoffvalueResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户的可提现资产价值(单位:分)
         * Summary: 数字商品服务-拉块服务-查询可提现资产
         */
        public async Task<QueryBlockanalysisUnwriteoffvalueResponse> QueryBlockanalysisUnwriteoffvalueExAsync(QueryBlockanalysisUnwriteoffvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisUnwriteoffvalueResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-拉块服务-设置代理权限
         */
        public UpdateBlockanalysisDelegaterelationResponse UpdateBlockanalysisDelegaterelation(UpdateBlockanalysisDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBlockanalysisDelegaterelationEx(request, headers, runtime);
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-拉块服务-设置代理权限
         */
        public async Task<UpdateBlockanalysisDelegaterelationResponse> UpdateBlockanalysisDelegaterelationAsync(UpdateBlockanalysisDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBlockanalysisDelegaterelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-拉块服务-设置代理权限
         */
        public UpdateBlockanalysisDelegaterelationResponse UpdateBlockanalysisDelegaterelationEx(UpdateBlockanalysisDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockanalysisDelegaterelationResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
         * Summary: 数字商品服务-拉块服务-设置代理权限
         */
        public async Task<UpdateBlockanalysisDelegaterelationResponse> UpdateBlockanalysisDelegaterelationExAsync(UpdateBlockanalysisDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockanalysisDelegaterelationResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置接口访问白名单。
         * Summary: 数字商品服务-拉块服务-设置访问白名单
         */
        public UpdateBlockanalysisWhitelistResponse UpdateBlockanalysisWhitelist(UpdateBlockanalysisWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBlockanalysisWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 设置接口访问白名单。
         * Summary: 数字商品服务-拉块服务-设置访问白名单
         */
        public async Task<UpdateBlockanalysisWhitelistResponse> UpdateBlockanalysisWhitelistAsync(UpdateBlockanalysisWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBlockanalysisWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置接口访问白名单。
         * Summary: 数字商品服务-拉块服务-设置访问白名单
         */
        public UpdateBlockanalysisWhitelistResponse UpdateBlockanalysisWhitelistEx(UpdateBlockanalysisWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockanalysisWhitelistResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置接口访问白名单。
         * Summary: 数字商品服务-拉块服务-设置访问白名单
         */
        public async Task<UpdateBlockanalysisWhitelistResponse> UpdateBlockanalysisWhitelistExAsync(UpdateBlockanalysisWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockanalysisWhitelistResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-拉块服务-代理权限查询
         */
        public QueryBlockanalysisDelegaterelationResponse QueryBlockanalysisDelegaterelation(QueryBlockanalysisDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisDelegaterelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-拉块服务-代理权限查询
         */
        public async Task<QueryBlockanalysisDelegaterelationResponse> QueryBlockanalysisDelegaterelationAsync(QueryBlockanalysisDelegaterelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisDelegaterelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-拉块服务-代理权限查询
         */
        public QueryBlockanalysisDelegaterelationResponse QueryBlockanalysisDelegaterelationEx(QueryBlockanalysisDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisDelegaterelationResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的授权代理权限
         * Summary: 数字商品服务-拉块服务-代理权限查询
         */
        public async Task<QueryBlockanalysisDelegaterelationResponse> QueryBlockanalysisDelegaterelationExAsync(QueryBlockanalysisDelegaterelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisDelegaterelationResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public QueryBlockanalysisWhitelistResponse QueryBlockanalysisWhitelist(QueryBlockanalysisWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public async Task<QueryBlockanalysisWhitelistResponse> QueryBlockanalysisWhitelistAsync(QueryBlockanalysisWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public QueryBlockanalysisWhitelistResponse QueryBlockanalysisWhitelistEx(QueryBlockanalysisWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisWhitelistResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询接口访问白名单信息
         * Summary: 数字商品服务-拉块服务-查询接口白名单
         */
        public async Task<QueryBlockanalysisWhitelistResponse> QueryBlockanalysisWhitelistExAsync(QueryBlockanalysisWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisWhitelistResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易信息
         * Summary: 数字商品服务-拉块服务-获取交易信息
         */
        public QueryBlockanalysisTransactionResponse QueryBlockanalysisTransaction(QueryBlockanalysisTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisTransactionEx(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易信息
         * Summary: 数字商品服务-拉块服务-获取交易信息
         */
        public async Task<QueryBlockanalysisTransactionResponse> QueryBlockanalysisTransactionAsync(QueryBlockanalysisTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisTransactionExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易信息
         * Summary: 数字商品服务-拉块服务-获取交易信息
         */
        public QueryBlockanalysisTransactionResponse QueryBlockanalysisTransactionEx(QueryBlockanalysisTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisTransactionResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易信息
         * Summary: 数字商品服务-拉块服务-获取交易信息
         */
        public async Task<QueryBlockanalysisTransactionResponse> QueryBlockanalysisTransactionExAsync(QueryBlockanalysisTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisTransactionResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商品的授权信息列表(一客一价信息)
         * Summary: 数字商品服务-拉块服务-获取商品授权信息
         */
        public QueryBlockanalysisEquityauthlistResponse QueryBlockanalysisEquityauthlist(QueryBlockanalysisEquityauthlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisEquityauthlistEx(request, headers, runtime);
        }

        /**
         * Description: 获取商品的授权信息列表(一客一价信息)
         * Summary: 数字商品服务-拉块服务-获取商品授权信息
         */
        public async Task<QueryBlockanalysisEquityauthlistResponse> QueryBlockanalysisEquityauthlistAsync(QueryBlockanalysisEquityauthlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisEquityauthlistExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取商品的授权信息列表(一客一价信息)
         * Summary: 数字商品服务-拉块服务-获取商品授权信息
         */
        public QueryBlockanalysisEquityauthlistResponse QueryBlockanalysisEquityauthlistEx(QueryBlockanalysisEquityauthlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisEquityauthlistResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.equityauthlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商品的授权信息列表(一客一价信息)
         * Summary: 数字商品服务-拉块服务-获取商品授权信息
         */
        public async Task<QueryBlockanalysisEquityauthlistResponse> QueryBlockanalysisEquityauthlistExAsync(QueryBlockanalysisEquityauthlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisEquityauthlistResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.equityauthlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
         * Summary: 数字商品服务-拉块服务-获取下个相关区块
         */
        public QueryBlockanalysisNextblockResponse QueryBlockanalysisNextblock(QueryBlockanalysisNextblockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockanalysisNextblockEx(request, headers, runtime);
        }

        /**
         * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
         * Summary: 数字商品服务-拉块服务-获取下个相关区块
         */
        public async Task<QueryBlockanalysisNextblockResponse> QueryBlockanalysisNextblockAsync(QueryBlockanalysisNextblockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockanalysisNextblockExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
         * Summary: 数字商品服务-拉块服务-获取下个相关区块
         */
        public QueryBlockanalysisNextblockResponse QueryBlockanalysisNextblockEx(QueryBlockanalysisNextblockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisNextblockResponse>(DoRequest("1.0", "baas.antdao.blockanalysis.nextblock.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
         * Summary: 数字商品服务-拉块服务-获取下个相关区块
         */
        public async Task<QueryBlockanalysisNextblockResponse> QueryBlockanalysisNextblockExAsync(QueryBlockanalysisNextblockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockanalysisNextblockResponse>(await DoRequestAsync("1.0", "baas.antdao.blockanalysis.nextblock.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可订购的SKU列表查询
         * Summary: 数字商品服务-商品服务-商品列表查询
         */
        public QueryMypointsSkuResponse QueryMypointsSku(QueryMypointsSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypointsSkuEx(request, headers, runtime);
        }

        /**
         * Description: 可订购的SKU列表查询
         * Summary: 数字商品服务-商品服务-商品列表查询
         */
        public async Task<QueryMypointsSkuResponse> QueryMypointsSkuAsync(QueryMypointsSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypointsSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 可订购的SKU列表查询
         * Summary: 数字商品服务-商品服务-商品列表查询
         */
        public QueryMypointsSkuResponse QueryMypointsSkuEx(QueryMypointsSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsSkuResponse>(DoRequest("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可订购的SKU列表查询
         * Summary: 数字商品服务-商品服务-商品列表查询
         */
        public async Task<QueryMypointsSkuResponse> QueryMypointsSkuExAsync(QueryMypointsSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsSkuResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户的积分库和预算库
         * Summary: 数字商品服务-商品服务-积分预算库查询
         */
        public QueryMypointsMerchantbalanceResponse QueryMypointsMerchantbalance(QueryMypointsMerchantbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypointsMerchantbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询商户的积分库和预算库
         * Summary: 数字商品服务-商品服务-积分预算库查询
         */
        public async Task<QueryMypointsMerchantbalanceResponse> QueryMypointsMerchantbalanceAsync(QueryMypointsMerchantbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypointsMerchantbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商户的积分库和预算库
         * Summary: 数字商品服务-商品服务-积分预算库查询
         */
        public QueryMypointsMerchantbalanceResponse QueryMypointsMerchantbalanceEx(QueryMypointsMerchantbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsMerchantbalanceResponse>(DoRequest("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户的积分库和预算库
         * Summary: 数字商品服务-商品服务-积分预算库查询
         */
        public async Task<QueryMypointsMerchantbalanceResponse> QueryMypointsMerchantbalanceExAsync(QueryMypointsMerchantbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsMerchantbalanceResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预下单商品
         * Summary: 数字商品服务-商品服务-商品预下单
         */
        public ExecMypointsPreorderskuResponse ExecMypointsPreordersku(ExecMypointsPreorderskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecMypointsPreorderskuEx(request, headers, runtime);
        }

        /**
         * Description: 预下单商品
         * Summary: 数字商品服务-商品服务-商品预下单
         */
        public async Task<ExecMypointsPreorderskuResponse> ExecMypointsPreorderskuAsync(ExecMypointsPreorderskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecMypointsPreorderskuExAsync(request, headers, runtime);
        }

        /**
         * Description: 预下单商品
         * Summary: 数字商品服务-商品服务-商品预下单
         */
        public ExecMypointsPreorderskuResponse ExecMypointsPreorderskuEx(ExecMypointsPreorderskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMypointsPreorderskuResponse>(DoRequest("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预下单商品
         * Summary: 数字商品服务-商品服务-商品预下单
         */
        public async Task<ExecMypointsPreorderskuResponse> ExecMypointsPreorderskuExAsync(ExecMypointsPreorderskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMypointsPreorderskuResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品下单
         * Summary: 数字商品服务-商品服务-商品下单
         */
        public ExecMypointsOrderskuResponse ExecMypointsOrdersku(ExecMypointsOrderskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecMypointsOrderskuEx(request, headers, runtime);
        }

        /**
         * Description: 商品下单
         * Summary: 数字商品服务-商品服务-商品下单
         */
        public async Task<ExecMypointsOrderskuResponse> ExecMypointsOrderskuAsync(ExecMypointsOrderskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecMypointsOrderskuExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品下单
         * Summary: 数字商品服务-商品服务-商品下单
         */
        public ExecMypointsOrderskuResponse ExecMypointsOrderskuEx(ExecMypointsOrderskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMypointsOrderskuResponse>(DoRequest("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品下单
         * Summary: 数字商品服务-商品服务-商品下单
         */
        public async Task<ExecMypointsOrderskuResponse> ExecMypointsOrderskuExAsync(ExecMypointsOrderskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMypointsOrderskuResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品ID，查询批量购买的费率
         * Summary: 数字商品服务-商品服务-商品费率查询
         */
        public QueryMypointsSkufeeResponse QueryMypointsSkufee(QueryMypointsSkufeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypointsSkufeeEx(request, headers, runtime);
        }

        /**
         * Description: 根据商品ID，查询批量购买的费率
         * Summary: 数字商品服务-商品服务-商品费率查询
         */
        public async Task<QueryMypointsSkufeeResponse> QueryMypointsSkufeeAsync(QueryMypointsSkufeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypointsSkufeeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商品ID，查询批量购买的费率
         * Summary: 数字商品服务-商品服务-商品费率查询
         */
        public QueryMypointsSkufeeResponse QueryMypointsSkufeeEx(QueryMypointsSkufeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsSkufeeResponse>(DoRequest("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品ID，查询批量购买的费率
         * Summary: 数字商品服务-商品服务-商品费率查询
         */
        public async Task<QueryMypointsSkufeeResponse> QueryMypointsSkufeeExAsync(QueryMypointsSkufeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsSkufeeResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集分宝SKU的预下单流水记录
         * Summary: 数字商品服务-商品服务-预下单流水查询
         */
        public QueryMypointsPreorderinstructionResponse QueryMypointsPreorderinstruction(QueryMypointsPreorderinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypointsPreorderinstructionEx(request, headers, runtime);
        }

        /**
         * Description: 查询集分宝SKU的预下单流水记录
         * Summary: 数字商品服务-商品服务-预下单流水查询
         */
        public async Task<QueryMypointsPreorderinstructionResponse> QueryMypointsPreorderinstructionAsync(QueryMypointsPreorderinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypointsPreorderinstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集分宝SKU的预下单流水记录
         * Summary: 数字商品服务-商品服务-预下单流水查询
         */
        public QueryMypointsPreorderinstructionResponse QueryMypointsPreorderinstructionEx(QueryMypointsPreorderinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsPreorderinstructionResponse>(DoRequest("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集分宝SKU的预下单流水记录
         * Summary: 数字商品服务-商品服务-预下单流水查询
         */
        public async Task<QueryMypointsPreorderinstructionResponse> QueryMypointsPreorderinstructionExAsync(QueryMypointsPreorderinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsPreorderinstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询下单流水信息
         * Summary: 数字商品服务-商品服务-商品下单流水查询
         */
        public QueryMypointsOrderinstructionResponse QueryMypointsOrderinstruction(QueryMypointsOrderinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypointsOrderinstructionEx(request, headers, runtime);
        }

        /**
         * Description: 查询下单流水信息
         * Summary: 数字商品服务-商品服务-商品下单流水查询
         */
        public async Task<QueryMypointsOrderinstructionResponse> QueryMypointsOrderinstructionAsync(QueryMypointsOrderinstructionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypointsOrderinstructionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询下单流水信息
         * Summary: 数字商品服务-商品服务-商品下单流水查询
         */
        public QueryMypointsOrderinstructionResponse QueryMypointsOrderinstructionEx(QueryMypointsOrderinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsOrderinstructionResponse>(DoRequest("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询下单流水信息
         * Summary: 数字商品服务-商品服务-商品下单流水查询
         */
        public async Task<QueryMypointsOrderinstructionResponse> QueryMypointsOrderinstructionExAsync(QueryMypointsOrderinstructionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypointsOrderinstructionResponse>(await DoRequestAsync("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
