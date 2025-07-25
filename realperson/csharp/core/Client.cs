// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.REALPERSON.Models;

namespace AntChain.SDK.REALPERSON
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
                        {"sdk_version", "1.21.4"},
                        {"_prod_code", "REALPERSON"},
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
                        {"sdk_version", "1.21.4"},
                        {"_prod_code", "REALPERSON"},
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
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryFacevrfServerResponse QueryFacevrfServer(QueryFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFacevrfServerEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryFacevrfServerResponse> QueryFacevrfServerAsync(QueryFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFacevrfServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryFacevrfServerResponse QueryFacevrfServerEx(QueryFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryFacevrfServerResponse> QueryFacevrfServerExAsync(QueryFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public CreateFacevrfServerResponse CreateFacevrfServer(CreateFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFacevrfServerEx(request, headers, runtime);
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public async Task<CreateFacevrfServerResponse> CreateFacevrfServerAsync(CreateFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFacevrfServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public CreateFacevrfServerResponse CreateFacevrfServerEx(CreateFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public async Task<CreateFacevrfServerResponse> CreateFacevrfServerExAsync(CreateFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public ExecFacevrfServerResponse ExecFacevrfServer(ExecFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecFacevrfServerEx(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public async Task<ExecFacevrfServerResponse> ExecFacevrfServerAsync(ExecFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecFacevrfServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public ExecFacevrfServerResponse ExecFacevrfServerEx(ExecFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public async Task<ExecFacevrfServerResponse> ExecFacevrfServerExAsync(ExecFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public GetFacevrfEvidenceResponse GetFacevrfEvidence(GetFacevrfEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFacevrfEvidenceEx(request, headers, runtime);
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public async Task<GetFacevrfEvidenceResponse> GetFacevrfEvidenceAsync(GetFacevrfEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFacevrfEvidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public GetFacevrfEvidenceResponse GetFacevrfEvidenceEx(GetFacevrfEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFacevrfEvidenceResponse>(DoRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public async Task<GetFacevrfEvidenceResponse> GetFacevrfEvidenceExAsync(GetFacevrfEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFacevrfEvidenceResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素认证
         * Summary: 个人二要素认证
         */
        public CheckIndividualidTwometaResponse CheckIndividualidTwometa(CheckIndividualidTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIndividualidTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人二要素认证
         * Summary: 个人二要素认证
         */
        public async Task<CheckIndividualidTwometaResponse> CheckIndividualidTwometaAsync(CheckIndividualidTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIndividualidTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人二要素认证
         * Summary: 个人二要素认证
         */
        public CheckIndividualidTwometaResponse CheckIndividualidTwometaEx(CheckIndividualidTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidTwometaResponse>(DoRequest("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素认证
         * Summary: 个人二要素认证
         */
        public async Task<CheckIndividualidTwometaResponse> CheckIndividualidTwometaExAsync(CheckIndividualidTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidTwometaResponse>(await DoRequestAsync("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人三要素认证
         * Summary: 个人三要素认证
         */
        public CheckIndividualidThreemetaResponse CheckIndividualidThreemeta(CheckIndividualidThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIndividualidThreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 个人三要素认证
         * Summary: 个人三要素认证
         */
        public async Task<CheckIndividualidThreemetaResponse> CheckIndividualidThreemetaAsync(CheckIndividualidThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIndividualidThreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人三要素认证
         * Summary: 个人三要素认证
         */
        public CheckIndividualidThreemetaResponse CheckIndividualidThreemetaEx(CheckIndividualidThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidThreemetaResponse>(DoRequest("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人三要素认证
         * Summary: 个人三要素认证
         */
        public async Task<CheckIndividualidThreemetaResponse> CheckIndividualidThreemetaExAsync(CheckIndividualidThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidThreemetaResponse>(await DoRequestAsync("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人四要素认证
         * Summary: 个人四要素认证
         */
        public CheckIndividualidFourmetaResponse CheckIndividualidFourmeta(CheckIndividualidFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIndividualidFourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 个人四要素认证
         * Summary: 个人四要素认证
         */
        public async Task<CheckIndividualidFourmetaResponse> CheckIndividualidFourmetaAsync(CheckIndividualidFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIndividualidFourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人四要素认证
         * Summary: 个人四要素认证
         */
        public CheckIndividualidFourmetaResponse CheckIndividualidFourmetaEx(CheckIndividualidFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidFourmetaResponse>(DoRequest("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人四要素认证
         * Summary: 个人四要素认证
         */
        public async Task<CheckIndividualidFourmetaResponse> CheckIndividualidFourmetaExAsync(CheckIndividualidFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndividualidFourmetaResponse>(await DoRequestAsync("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人三要素认证（场景路由）
         * Summary: 个人三要素认证（场景路由）
         */
        public CheckRouteThreemetaResponse CheckRouteThreemeta(CheckRouteThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckRouteThreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 个人三要素认证（场景路由）
         * Summary: 个人三要素认证（场景路由）
         */
        public async Task<CheckRouteThreemetaResponse> CheckRouteThreemetaAsync(CheckRouteThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckRouteThreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人三要素认证（场景路由）
         * Summary: 个人三要素认证（场景路由）
         */
        public CheckRouteThreemetaResponse CheckRouteThreemetaEx(CheckRouteThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRouteThreemetaResponse>(DoRequest("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人三要素认证（场景路由）
         * Summary: 个人三要素认证（场景路由）
         */
        public async Task<CheckRouteThreemetaResponse> CheckRouteThreemetaExAsync(CheckRouteThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRouteThreemetaResponse>(await DoRequestAsync("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端声纹注册
         * Summary: 纯服务端声纹注册
         */
        public CreateVoiceprintServermodeResponse CreateVoiceprintServermode(CreateVoiceprintServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateVoiceprintServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 纯服务端声纹注册
         * Summary: 纯服务端声纹注册
         */
        public async Task<CreateVoiceprintServermodeResponse> CreateVoiceprintServermodeAsync(CreateVoiceprintServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateVoiceprintServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 纯服务端声纹注册
         * Summary: 纯服务端声纹注册
         */
        public CreateVoiceprintServermodeResponse CreateVoiceprintServermodeEx(CreateVoiceprintServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.voiceprint.servermode.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateVoiceprintServermodeResponse createVoiceprintServermodeResponse = new CreateVoiceprintServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createVoiceprintServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVoiceprintServermodeResponse>(DoRequest("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端声纹注册
         * Summary: 纯服务端声纹注册
         */
        public async Task<CreateVoiceprintServermodeResponse> CreateVoiceprintServermodeExAsync(CreateVoiceprintServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.voiceprint.servermode.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateVoiceprintServermodeResponse createVoiceprintServermodeResponse = new CreateVoiceprintServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createVoiceprintServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVoiceprintServermodeResponse>(await DoRequestAsync("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端声纹比对
         * Summary: 纯服务端声纹比对
         */
        public VerifyVoiceprintServermodeResponse VerifyVoiceprintServermode(VerifyVoiceprintServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyVoiceprintServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 纯服务端声纹比对
         * Summary: 纯服务端声纹比对
         */
        public async Task<VerifyVoiceprintServermodeResponse> VerifyVoiceprintServermodeAsync(VerifyVoiceprintServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyVoiceprintServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 纯服务端声纹比对
         * Summary: 纯服务端声纹比对
         */
        public VerifyVoiceprintServermodeResponse VerifyVoiceprintServermodeEx(VerifyVoiceprintServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyVoiceprintServermodeResponse>(DoRequest("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端声纹比对
         * Summary: 纯服务端声纹比对
         */
        public async Task<VerifyVoiceprintServermodeResponse> VerifyVoiceprintServermodeExAsync(VerifyVoiceprintServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyVoiceprintServermodeResponse>(await DoRequestAsync("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素认证（场景路由）
         * Summary: 个人二要素认证（场景路由）
         */
        public CheckRouteTwometaResponse CheckRouteTwometa(CheckRouteTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckRouteTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人二要素认证（场景路由）
         * Summary: 个人二要素认证（场景路由）
         */
        public async Task<CheckRouteTwometaResponse> CheckRouteTwometaAsync(CheckRouteTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckRouteTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人二要素认证（场景路由）
         * Summary: 个人二要素认证（场景路由）
         */
        public CheckRouteTwometaResponse CheckRouteTwometaEx(CheckRouteTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRouteTwometaResponse>(DoRequest("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素认证（场景路由）
         * Summary: 个人二要素认证（场景路由）
         */
        public async Task<CheckRouteTwometaResponse> CheckRouteTwometaExAsync(CheckRouteTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckRouteTwometaResponse>(await DoRequestAsync("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
         * Summary: 移动风险设备查询
         */
        public QueryMobileRiskResponse QueryMobileRisk(QueryMobileRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMobileRiskEx(request, headers, runtime);
        }

        /**
         * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
         * Summary: 移动风险设备查询
         */
        public async Task<QueryMobileRiskResponse> QueryMobileRiskAsync(QueryMobileRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMobileRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
         * Summary: 移动风险设备查询
         */
        public QueryMobileRiskResponse QueryMobileRiskEx(QueryMobileRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMobileRiskResponse>(DoRequest("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
         * Summary: 移动风险设备查询
         */
        public async Task<QueryMobileRiskResponse> QueryMobileRiskExAsync(QueryMobileRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMobileRiskResponse>(await DoRequestAsync("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
         * Summary: 查询认证人、认证时间等相关信息
         */
        public DetailFacevrfServerResponse DetailFacevrfServer(DetailFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailFacevrfServerEx(request, headers, runtime);
        }

        /**
         * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
         * Summary: 查询认证人、认证时间等相关信息
         */
        public async Task<DetailFacevrfServerResponse> DetailFacevrfServerAsync(DetailFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailFacevrfServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
         * Summary: 查询认证人、认证时间等相关信息
         */
        public DetailFacevrfServerResponse DetailFacevrfServerEx(DetailFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
         * Summary: 查询认证人、认证时间等相关信息
         */
        public async Task<DetailFacevrfServerResponse> DetailFacevrfServerExAsync(DetailFacevrfServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
         * Summary: 个人反欺诈风险校验
         */
        public CheckAnticheatPersonalResponse CheckAnticheatPersonal(CheckAnticheatPersonalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAnticheatPersonalEx(request, headers, runtime);
        }

        /**
         * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
         * Summary: 个人反欺诈风险校验
         */
        public async Task<CheckAnticheatPersonalResponse> CheckAnticheatPersonalAsync(CheckAnticheatPersonalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAnticheatPersonalExAsync(request, headers, runtime);
        }

        /**
         * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
         * Summary: 个人反欺诈风险校验
         */
        public CheckAnticheatPersonalResponse CheckAnticheatPersonalEx(CheckAnticheatPersonalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAnticheatPersonalResponse>(DoRequest("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
         * Summary: 个人反欺诈风险校验
         */
        public async Task<CheckAnticheatPersonalResponse> CheckAnticheatPersonalExAsync(CheckAnticheatPersonalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAnticheatPersonalResponse>(await DoRequestAsync("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二要素支持hash主体信息
         * Summary: 个人二要素核验支持hash的主体信息
         */
        public CheckTwometaHashResponse CheckTwometaHash(CheckTwometaHashRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckTwometaHashEx(request, headers, runtime);
        }

        /**
         * Description: 二要素支持hash主体信息
         * Summary: 个人二要素核验支持hash的主体信息
         */
        public async Task<CheckTwometaHashResponse> CheckTwometaHashAsync(CheckTwometaHashRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckTwometaHashExAsync(request, headers, runtime);
        }

        /**
         * Description: 二要素支持hash主体信息
         * Summary: 个人二要素核验支持hash的主体信息
         */
        public CheckTwometaHashResponse CheckTwometaHashEx(CheckTwometaHashRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckTwometaHashResponse>(DoRequest("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二要素支持hash主体信息
         * Summary: 个人二要素核验支持hash的主体信息
         */
        public async Task<CheckTwometaHashResponse> CheckTwometaHashExAsync(CheckTwometaHashRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckTwometaHashResponse>(await DoRequestAsync("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接运营商等数据源查询手机号码的在网时长
         * Summary: 三要素在网时长查询接口
         */
        public QueryThreemetaOnlinetimeResponse QueryThreemetaOnlinetime(QueryThreemetaOnlinetimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThreemetaOnlinetimeEx(request, headers, runtime);
        }

        /**
         * Description: 对接运营商等数据源查询手机号码的在网时长
         * Summary: 三要素在网时长查询接口
         */
        public async Task<QueryThreemetaOnlinetimeResponse> QueryThreemetaOnlinetimeAsync(QueryThreemetaOnlinetimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThreemetaOnlinetimeExAsync(request, headers, runtime);
        }

        /**
         * Description: 对接运营商等数据源查询手机号码的在网时长
         * Summary: 三要素在网时长查询接口
         */
        public QueryThreemetaOnlinetimeResponse QueryThreemetaOnlinetimeEx(QueryThreemetaOnlinetimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThreemetaOnlinetimeResponse>(DoRequest("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接运营商等数据源查询手机号码的在网时长
         * Summary: 三要素在网时长查询接口
         */
        public async Task<QueryThreemetaOnlinetimeResponse> QueryThreemetaOnlinetimeExAsync(QueryThreemetaOnlinetimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThreemetaOnlinetimeResponse>(await DoRequestAsync("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端初始化认证(OEM专用)
         * Summary: 客户端初始化认证(OEM专用)
         */
        public InitFacevrfZimResponse InitFacevrfZim(InitFacevrfZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFacevrfZimEx(request, headers, runtime);
        }

        /**
         * Description: 客户端初始化认证(OEM专用)
         * Summary: 客户端初始化认证(OEM专用)
         */
        public async Task<InitFacevrfZimResponse> InitFacevrfZimAsync(InitFacevrfZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFacevrfZimExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户端初始化认证(OEM专用)
         * Summary: 客户端初始化认证(OEM专用)
         */
        public InitFacevrfZimResponse InitFacevrfZimEx(InitFacevrfZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFacevrfZimResponse>(DoRequest("1.0", "di.realperson.facevrf.zim.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端初始化认证(OEM专用)
         * Summary: 客户端初始化认证(OEM专用)
         */
        public async Task<InitFacevrfZimResponse> InitFacevrfZimExAsync(InitFacevrfZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFacevrfZimResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.zim.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端人脸验证(OEM专用)
         * Summary: 客户端人脸验证(OEM专用)
         */
        public VerifyFacevrfZimResponse VerifyFacevrfZim(VerifyFacevrfZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyFacevrfZimEx(request, headers, runtime);
        }

        /**
         * Description: 客户端人脸验证(OEM专用)
         * Summary: 客户端人脸验证(OEM专用)
         */
        public async Task<VerifyFacevrfZimResponse> VerifyFacevrfZimAsync(VerifyFacevrfZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyFacevrfZimExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户端人脸验证(OEM专用)
         * Summary: 客户端人脸验证(OEM专用)
         */
        public VerifyFacevrfZimResponse VerifyFacevrfZimEx(VerifyFacevrfZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFacevrfZimResponse>(DoRequest("1.0", "di.realperson.facevrf.zim.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端人脸验证(OEM专用)
         * Summary: 客户端人脸验证(OEM专用)
         */
        public async Task<VerifyFacevrfZimResponse> VerifyFacevrfZimExAsync(VerifyFacevrfZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFacevrfZimResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.zim.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡证OCR
         * Summary: 卡证OCR
         */
        public RecognizeDocIndividualcardResponse RecognizeDocIndividualcard(RecognizeDocIndividualcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeDocIndividualcardEx(request, headers, runtime);
        }

        /**
         * Description: 卡证OCR
         * Summary: 卡证OCR
         */
        public async Task<RecognizeDocIndividualcardResponse> RecognizeDocIndividualcardAsync(RecognizeDocIndividualcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeDocIndividualcardExAsync(request, headers, runtime);
        }

        /**
         * Description: 卡证OCR
         * Summary: 卡证OCR
         */
        public RecognizeDocIndividualcardResponse RecognizeDocIndividualcardEx(RecognizeDocIndividualcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.doc.individualcard.recognize",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    RecognizeDocIndividualcardResponse recognizeDocIndividualcardResponse = new RecognizeDocIndividualcardResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return recognizeDocIndividualcardResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeDocIndividualcardResponse>(DoRequest("1.0", "di.realperson.doc.individualcard.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卡证OCR
         * Summary: 卡证OCR
         */
        public async Task<RecognizeDocIndividualcardResponse> RecognizeDocIndividualcardExAsync(RecognizeDocIndividualcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.doc.individualcard.recognize",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    RecognizeDocIndividualcardResponse recognizeDocIndividualcardResponse = new RecognizeDocIndividualcardResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return recognizeDocIndividualcardResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeDocIndividualcardResponse>(await DoRequestAsync("1.0", "di.realperson.doc.individualcard.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡三要素
         * Summary: 个人银行卡三要素
         */
        public CheckThreemetaBankcardResponse CheckThreemetaBankcard(CheckThreemetaBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckThreemetaBankcardEx(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡三要素
         * Summary: 个人银行卡三要素
         */
        public async Task<CheckThreemetaBankcardResponse> CheckThreemetaBankcardAsync(CheckThreemetaBankcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckThreemetaBankcardExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡三要素
         * Summary: 个人银行卡三要素
         */
        public CheckThreemetaBankcardResponse CheckThreemetaBankcardEx(CheckThreemetaBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckThreemetaBankcardResponse>(DoRequest("1.0", "di.realperson.threemeta.bankcard.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡三要素
         * Summary: 个人银行卡三要素
         */
        public async Task<CheckThreemetaBankcardResponse> CheckThreemetaBankcardExAsync(CheckThreemetaBankcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckThreemetaBankcardResponse>(await DoRequestAsync("1.0", "di.realperson.threemeta.bankcard.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: deepsec终端安全风险标签查询
         * Summary: deepsec终端安全风险标签查询
         */
        public QueryDeepsecRiskResponse QueryDeepsecRisk(QueryDeepsecRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeepsecRiskEx(request, headers, runtime);
        }

        /**
         * Description: deepsec终端安全风险标签查询
         * Summary: deepsec终端安全风险标签查询
         */
        public async Task<QueryDeepsecRiskResponse> QueryDeepsecRiskAsync(QueryDeepsecRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeepsecRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: deepsec终端安全风险标签查询
         * Summary: deepsec终端安全风险标签查询
         */
        public QueryDeepsecRiskResponse QueryDeepsecRiskEx(QueryDeepsecRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepsecRiskResponse>(DoRequest("1.0", "di.realperson.deepsec.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: deepsec终端安全风险标签查询
         * Summary: deepsec终端安全风险标签查询
         */
        public async Task<QueryDeepsecRiskResponse> QueryDeepsecRiskExAsync(QueryDeepsecRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepsecRiskResponse>(await DoRequestAsync("1.0", "di.realperson.deepsec.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: deepsec终端安全api，用于apdid查询
         * Summary: tsbmrq设备id查询入口
         */
        public QueryDeepsecTsbmrqResponse QueryDeepsecTsbmrq(QueryDeepsecTsbmrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeepsecTsbmrqEx(request, headers, runtime);
        }

        /**
         * Description: deepsec终端安全api，用于apdid查询
         * Summary: tsbmrq设备id查询入口
         */
        public async Task<QueryDeepsecTsbmrqResponse> QueryDeepsecTsbmrqAsync(QueryDeepsecTsbmrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeepsecTsbmrqExAsync(request, headers, runtime);
        }

        /**
         * Description: deepsec终端安全api，用于apdid查询
         * Summary: tsbmrq设备id查询入口
         */
        public QueryDeepsecTsbmrqResponse QueryDeepsecTsbmrqEx(QueryDeepsecTsbmrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepsecTsbmrqResponse>(DoRequest("1.0", "di.realperson.deepsec.tsbmrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: deepsec终端安全api，用于apdid查询
         * Summary: tsbmrq设备id查询入口
         */
        public async Task<QueryDeepsecTsbmrqResponse> QueryDeepsecTsbmrqExAsync(QueryDeepsecTsbmrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepsecTsbmrqResponse>(await DoRequestAsync("1.0", "di.realperson.deepsec.tsbmrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人运营商二次放号
         * Summary: 个人运营商二次放号
         */
        public QueryThreemetaPhonereuseResponse QueryThreemetaPhonereuse(QueryThreemetaPhonereuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThreemetaPhonereuseEx(request, headers, runtime);
        }

        /**
         * Description: 个人运营商二次放号
         * Summary: 个人运营商二次放号
         */
        public async Task<QueryThreemetaPhonereuseResponse> QueryThreemetaPhonereuseAsync(QueryThreemetaPhonereuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThreemetaPhonereuseExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人运营商二次放号
         * Summary: 个人运营商二次放号
         */
        public QueryThreemetaPhonereuseResponse QueryThreemetaPhonereuseEx(QueryThreemetaPhonereuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThreemetaPhonereuseResponse>(DoRequest("1.0", "di.realperson.threemeta.phonereuse.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人运营商二次放号
         * Summary: 个人运营商二次放号
         */
        public async Task<QueryThreemetaPhonereuseResponse> QueryThreemetaPhonereuseExAsync(QueryThreemetaPhonereuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThreemetaPhonereuseResponse>(await DoRequestAsync("1.0", "di.realperson.threemeta.phonereuse.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询设备信息
         * Summary: 设备信息查询for蚁盾
         */
        public QueryTscenterDeviceResponse QueryTscenterDevice(QueryTscenterDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTscenterDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询设备信息
         * Summary: 设备信息查询for蚁盾
         */
        public async Task<QueryTscenterDeviceResponse> QueryTscenterDeviceAsync(QueryTscenterDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTscenterDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询设备信息
         * Summary: 设备信息查询for蚁盾
         */
        public QueryTscenterDeviceResponse QueryTscenterDeviceEx(QueryTscenterDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTscenterDeviceResponse>(DoRequest("1.0", "di.realperson.tscenter.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询设备信息
         * Summary: 设备信息查询for蚁盾
         */
        public async Task<QueryTscenterDeviceResponse> QueryTscenterDeviceExAsync(QueryTscenterDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTscenterDeviceResponse>(await DoRequestAsync("1.0", "di.realperson.tscenter.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public QueryEducationInfoResponse QueryEducationInfo(QueryEducationInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEducationInfoEx(request, headers, runtime);
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public async Task<QueryEducationInfoResponse> QueryEducationInfoAsync(QueryEducationInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEducationInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public QueryEducationInfoResponse QueryEducationInfoEx(QueryEducationInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEducationInfoResponse>(DoRequest("1.0", "di.realperson.education.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public async Task<QueryEducationInfoResponse> QueryEducationInfoExAsync(QueryEducationInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEducationInfoResponse>(await DoRequestAsync("1.0", "di.realperson.education.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: demo用记录查询
         * Summary: demo用记录查询
         */
        public QueryDemoInfoResponse QueryDemoInfo(QueryDemoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoInfoEx(request, headers, runtime);
        }

        /**
         * Description: demo用记录查询
         * Summary: demo用记录查询
         */
        public async Task<QueryDemoInfoResponse> QueryDemoInfoAsync(QueryDemoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: demo用记录查询
         * Summary: demo用记录查询
         */
        public QueryDemoInfoResponse QueryDemoInfoEx(QueryDemoInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoInfoResponse>(DoRequest("1.0", "di.realperson.demo.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: demo用记录查询
         * Summary: demo用记录查询
         */
        public async Task<QueryDemoInfoResponse> QueryDemoInfoExAsync(QueryDemoInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoInfoResponse>(await DoRequestAsync("1.0", "di.realperson.demo.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡二要素
         * Summary: 个人银行卡二要素
         */
        public CheckBankcardTwometaResponse CheckBankcardTwometa(CheckBankcardTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckBankcardTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡二要素
         * Summary: 个人银行卡二要素
         */
        public async Task<CheckBankcardTwometaResponse> CheckBankcardTwometaAsync(CheckBankcardTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckBankcardTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡二要素
         * Summary: 个人银行卡二要素
         */
        public CheckBankcardTwometaResponse CheckBankcardTwometaEx(CheckBankcardTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBankcardTwometaResponse>(DoRequest("1.0", "di.realperson.bankcard.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡二要素
         * Summary: 个人银行卡二要素
         */
        public async Task<CheckBankcardTwometaResponse> CheckBankcardTwometaExAsync(CheckBankcardTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBankcardTwometaResponse>(await DoRequestAsync("1.0", "di.realperson.bankcard.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人运营商二要素
         * Summary: 个人运营商二要素
         */
        public CheckCarrierTwometaResponse CheckCarrierTwometa(CheckCarrierTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCarrierTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人运营商二要素
         * Summary: 个人运营商二要素
         */
        public async Task<CheckCarrierTwometaResponse> CheckCarrierTwometaAsync(CheckCarrierTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCarrierTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人运营商二要素
         * Summary: 个人运营商二要素
         */
        public CheckCarrierTwometaResponse CheckCarrierTwometaEx(CheckCarrierTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCarrierTwometaResponse>(DoRequest("1.0", "di.realperson.carrier.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人运营商二要素
         * Summary: 个人运营商二要素
         */
        public async Task<CheckCarrierTwometaResponse> CheckCarrierTwometaExAsync(CheckCarrierTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCarrierTwometaResponse>(await DoRequestAsync("1.0", "di.realperson.carrier.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public CreateNfcServerResponse CreateNfcServer(CreateNfcServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateNfcServerEx(request, headers, runtime);
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public async Task<CreateNfcServerResponse> CreateNfcServerAsync(CreateNfcServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateNfcServerExAsync(request, headers, runtime);
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public CreateNfcServerResponse CreateNfcServerEx(CreateNfcServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNfcServerResponse>(DoRequest("1.0", "di.realperson.nfc.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public async Task<CreateNfcServerResponse> CreateNfcServerExAsync(CreateNfcServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNfcServerResponse>(await DoRequestAsync("1.0", "di.realperson.nfc.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public QueryNfcServerResponse QueryNfcServer(QueryNfcServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNfcServerEx(request, headers, runtime);
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public async Task<QueryNfcServerResponse> QueryNfcServerAsync(QueryNfcServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNfcServerExAsync(request, headers, runtime);
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public QueryNfcServerResponse QueryNfcServerEx(QueryNfcServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNfcServerResponse>(DoRequest("1.0", "di.realperson.nfc.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFC实证
         * Summary: NFC实证
         */
        public async Task<QueryNfcServerResponse> QueryNfcServerExAsync(QueryNfcServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNfcServerResponse>(await DoRequestAsync("1.0", "di.realperson.nfc.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险
         * Summary: 社会安全风险
         */
        public QuerySocialriskDetailResponse QuerySocialriskDetail(QuerySocialriskDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySocialriskDetailEx(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险
         * Summary: 社会安全风险
         */
        public async Task<QuerySocialriskDetailResponse> QuerySocialriskDetailAsync(QuerySocialriskDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySocialriskDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险
         * Summary: 社会安全风险
         */
        public QuerySocialriskDetailResponse QuerySocialriskDetailEx(QuerySocialriskDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskDetailResponse>(DoRequest("1.0", "di.realperson.socialrisk.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险
         * Summary: 社会安全风险
         */
        public async Task<QuerySocialriskDetailResponse> QuerySocialriskDetailExAsync(QuerySocialriskDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskDetailResponse>(await DoRequestAsync("1.0", "di.realperson.socialrisk.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运营商在网状态查询
         * Summary: 运营商在网状态查询
         */
        public QueryCarrierNetstatusResponse QueryCarrierNetstatus(QueryCarrierNetstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCarrierNetstatusEx(request, headers, runtime);
        }

        /**
         * Description: 运营商在网状态查询
         * Summary: 运营商在网状态查询
         */
        public async Task<QueryCarrierNetstatusResponse> QueryCarrierNetstatusAsync(QueryCarrierNetstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCarrierNetstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 运营商在网状态查询
         * Summary: 运营商在网状态查询
         */
        public QueryCarrierNetstatusResponse QueryCarrierNetstatusEx(QueryCarrierNetstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarrierNetstatusResponse>(DoRequest("1.0", "di.realperson.carrier.netstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运营商在网状态查询
         * Summary: 运营商在网状态查询
         */
        public async Task<QueryCarrierNetstatusResponse> QueryCarrierNetstatusExAsync(QueryCarrierNetstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarrierNetstatusResponse>(await DoRequestAsync("1.0", "di.realperson.carrier.netstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险（简版）
         * Summary: 社会安全风险（简版）
         */
        public QuerySocialriskBriefResponse QuerySocialriskBrief(QuerySocialriskBriefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySocialriskBriefEx(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险（简版）
         * Summary: 社会安全风险（简版）
         */
        public async Task<QuerySocialriskBriefResponse> QuerySocialriskBriefAsync(QuerySocialriskBriefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySocialriskBriefExAsync(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险（简版）
         * Summary: 社会安全风险（简版）
         */
        public QuerySocialriskBriefResponse QuerySocialriskBriefEx(QuerySocialriskBriefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskBriefResponse>(DoRequest("1.0", "di.realperson.socialrisk.brief.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险（简版）
         * Summary: 社会安全风险（简版）
         */
        public async Task<QuerySocialriskBriefResponse> QuerySocialriskBriefExAsync(QuerySocialriskBriefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskBriefResponse>(await DoRequestAsync("1.0", "di.realperson.socialrisk.brief.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险（tob风控版）
         * Summary: 社会安全风险（tob风控版）
         */
        public QuerySocialriskTobriskResponse QuerySocialriskTobrisk(QuerySocialriskTobriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySocialriskTobriskEx(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险（tob风控版）
         * Summary: 社会安全风险（tob风控版）
         */
        public async Task<QuerySocialriskTobriskResponse> QuerySocialriskTobriskAsync(QuerySocialriskTobriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySocialriskTobriskExAsync(request, headers, runtime);
        }

        /**
         * Description: 社会安全风险（tob风控版）
         * Summary: 社会安全风险（tob风控版）
         */
        public QuerySocialriskTobriskResponse QuerySocialriskTobriskEx(QuerySocialriskTobriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskTobriskResponse>(DoRequest("1.0", "di.realperson.socialrisk.tobrisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 社会安全风险（tob风控版）
         * Summary: 社会安全风险（tob风控版）
         */
        public async Task<QuerySocialriskTobriskResponse> QuerySocialriskTobriskExAsync(QuerySocialriskTobriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySocialriskTobriskResponse>(await DoRequestAsync("1.0", "di.realperson.socialrisk.tobrisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对V2版本
         */
        public ExecFacevrfServermodeResponse ExecFacevrfServermode(ExecFacevrfServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecFacevrfServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对V2版本
         */
        public async Task<ExecFacevrfServermodeResponse> ExecFacevrfServermodeAsync(ExecFacevrfServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecFacevrfServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对V2版本
         */
        public ExecFacevrfServermodeResponse ExecFacevrfServermodeEx(ExecFacevrfServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.facevrf.servermode.exec",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ExecFacevrfServermodeResponse execFacevrfServermodeResponse = new ExecFacevrfServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return execFacevrfServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFacevrfServermodeResponse>(DoRequest("1.0", "di.realperson.facevrf.servermode.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对V2版本
         */
        public async Task<ExecFacevrfServermodeResponse> ExecFacevrfServermodeExAsync(ExecFacevrfServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.facevrf.servermode.exec",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ExecFacevrfServermodeResponse execFacevrfServermodeResponse = new ExecFacevrfServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return execFacevrfServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFacevrfServermodeResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.servermode.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行活跃度
         * Summary: 银行活跃度
         */
        public QueryBankLivenessResponse QueryBankLiveness(QueryBankLivenessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBankLivenessEx(request, headers, runtime);
        }

        /**
         * Description: 银行活跃度
         * Summary: 银行活跃度
         */
        public async Task<QueryBankLivenessResponse> QueryBankLivenessAsync(QueryBankLivenessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBankLivenessExAsync(request, headers, runtime);
        }

        /**
         * Description: 银行活跃度
         * Summary: 银行活跃度
         */
        public QueryBankLivenessResponse QueryBankLivenessEx(QueryBankLivenessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessResponse>(DoRequest("1.0", "di.realperson.bank.liveness.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行活跃度
         * Summary: 银行活跃度
         */
        public async Task<QueryBankLivenessResponse> QueryBankLivenessExAsync(QueryBankLivenessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessResponse>(await DoRequestAsync("1.0", "di.realperson.bank.liveness.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public CreateConsoleDomainResponse CreateConsoleDomain(CreateConsoleDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsoleDomainEx(request, headers, runtime);
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public async Task<CreateConsoleDomainResponse> CreateConsoleDomainAsync(CreateConsoleDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsoleDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public CreateConsoleDomainResponse CreateConsoleDomainEx(CreateConsoleDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsoleDomainResponse>(DoRequest("1.0", "di.realperson.console.domain.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public async Task<CreateConsoleDomainResponse> CreateConsoleDomainExAsync(CreateConsoleDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsoleDomainResponse>(await DoRequestAsync("1.0", "di.realperson.console.domain.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云控制台删除场景与域名映射
         * Summary: 删除场景与域名映射
         */
        public DeleteConsoleDomainResponse DeleteConsoleDomain(DeleteConsoleDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteConsoleDomainEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云控制台删除场景与域名映射
         * Summary: 删除场景与域名映射
         */
        public async Task<DeleteConsoleDomainResponse> DeleteConsoleDomainAsync(DeleteConsoleDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteConsoleDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云控制台删除场景与域名映射
         * Summary: 删除场景与域名映射
         */
        public DeleteConsoleDomainResponse DeleteConsoleDomainEx(DeleteConsoleDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConsoleDomainResponse>(DoRequest("1.0", "di.realperson.console.domain.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云控制台删除场景与域名映射
         * Summary: 删除场景与域名映射
         */
        public async Task<DeleteConsoleDomainResponse> DeleteConsoleDomainExAsync(DeleteConsoleDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConsoleDomainResponse>(await DoRequestAsync("1.0", "di.realperson.console.domain.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复初始化
         * Summary: 失联修复初始化
         */
        public InitCarrierRepairmobileResponse InitCarrierRepairmobile(InitCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCarrierRepairmobileEx(request, headers, runtime);
        }

        /**
         * Description: 失联修复初始化
         * Summary: 失联修复初始化
         */
        public async Task<InitCarrierRepairmobileResponse> InitCarrierRepairmobileAsync(InitCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCarrierRepairmobileExAsync(request, headers, runtime);
        }

        /**
         * Description: 失联修复初始化
         * Summary: 失联修复初始化
         */
        public InitCarrierRepairmobileResponse InitCarrierRepairmobileEx(InitCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCarrierRepairmobileResponse>(DoRequest("1.0", "di.realperson.carrier.repairmobile.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复初始化
         * Summary: 失联修复初始化
         */
        public async Task<InitCarrierRepairmobileResponse> InitCarrierRepairmobileExAsync(InitCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCarrierRepairmobileResponse>(await DoRequestAsync("1.0", "di.realperson.carrier.repairmobile.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复查询修复结果
         * Summary: 失联修复查询修复结果
         */
        public QueryCarrierRepairmobileResponse QueryCarrierRepairmobile(QueryCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCarrierRepairmobileEx(request, headers, runtime);
        }

        /**
         * Description: 失联修复查询修复结果
         * Summary: 失联修复查询修复结果
         */
        public async Task<QueryCarrierRepairmobileResponse> QueryCarrierRepairmobileAsync(QueryCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCarrierRepairmobileExAsync(request, headers, runtime);
        }

        /**
         * Description: 失联修复查询修复结果
         * Summary: 失联修复查询修复结果
         */
        public QueryCarrierRepairmobileResponse QueryCarrierRepairmobileEx(QueryCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarrierRepairmobileResponse>(DoRequest("1.0", "di.realperson.carrier.repairmobile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复查询修复结果
         * Summary: 失联修复查询修复结果
         */
        public async Task<QueryCarrierRepairmobileResponse> QueryCarrierRepairmobileExAsync(QueryCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarrierRepairmobileResponse>(await DoRequestAsync("1.0", "di.realperson.carrier.repairmobile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复小号绑定
         * Summary: 失联修复小号绑定
         */
        public BindCarrierRepairmobileResponse BindCarrierRepairmobile(BindCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindCarrierRepairmobileEx(request, headers, runtime);
        }

        /**
         * Description: 失联修复小号绑定
         * Summary: 失联修复小号绑定
         */
        public async Task<BindCarrierRepairmobileResponse> BindCarrierRepairmobileAsync(BindCarrierRepairmobileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindCarrierRepairmobileExAsync(request, headers, runtime);
        }

        /**
         * Description: 失联修复小号绑定
         * Summary: 失联修复小号绑定
         */
        public BindCarrierRepairmobileResponse BindCarrierRepairmobileEx(BindCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindCarrierRepairmobileResponse>(DoRequest("1.0", "di.realperson.carrier.repairmobile.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 失联修复小号绑定
         * Summary: 失联修复小号绑定
         */
        public async Task<BindCarrierRepairmobileResponse> BindCarrierRepairmobileExAsync(BindCarrierRepairmobileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindCarrierRepairmobileResponse>(await DoRequestAsync("1.0", "di.realperson.carrier.repairmobile.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部机构数据上报
         * Summary: 外部机构数据上报
         */
        public ApplyExtOrgdataResponse ApplyExtOrgdata(ApplyExtOrgdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyExtOrgdataEx(request, headers, runtime);
        }

        /**
         * Description: 外部机构数据上报
         * Summary: 外部机构数据上报
         */
        public async Task<ApplyExtOrgdataResponse> ApplyExtOrgdataAsync(ApplyExtOrgdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyExtOrgdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部机构数据上报
         * Summary: 外部机构数据上报
         */
        public ApplyExtOrgdataResponse ApplyExtOrgdataEx(ApplyExtOrgdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyExtOrgdataResponse>(DoRequest("1.0", "di.realperson.ext.orgdata.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部机构数据上报
         * Summary: 外部机构数据上报
         */
        public async Task<ApplyExtOrgdataResponse> ApplyExtOrgdataExAsync(ApplyExtOrgdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyExtOrgdataResponse>(await DoRequestAsync("1.0", "di.realperson.ext.orgdata.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数科刷脸服务端初始化接口
         * Summary: 数科刷脸服务端初始化接口
         */
        public CreateFaceverifyServerResponse CreateFaceverifyServer(CreateFaceverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFaceverifyServerEx(request, headers, runtime);
        }

        /**
         * Description: 数科刷脸服务端初始化接口
         * Summary: 数科刷脸服务端初始化接口
         */
        public async Task<CreateFaceverifyServerResponse> CreateFaceverifyServerAsync(CreateFaceverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFaceverifyServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 数科刷脸服务端初始化接口
         * Summary: 数科刷脸服务端初始化接口
         */
        public CreateFaceverifyServerResponse CreateFaceverifyServerEx(CreateFaceverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFaceverifyServerResponse>(DoRequest("1.0", "di.realperson.faceverify.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数科刷脸服务端初始化接口
         * Summary: 数科刷脸服务端初始化接口
         */
        public async Task<CreateFaceverifyServerResponse> CreateFaceverifyServerExAsync(CreateFaceverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFaceverifyServerResponse>(await DoRequestAsync("1.0", "di.realperson.faceverify.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryFaceverifyServerResponse QueryFaceverifyServer(QueryFaceverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceverifyServerEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryFaceverifyServerResponse> QueryFaceverifyServerAsync(QueryFaceverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceverifyServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryFaceverifyServerResponse QueryFaceverifyServerEx(QueryFaceverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceverifyServerResponse>(DoRequest("1.0", "di.realperson.faceverify.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryFaceverifyServerResponse> QueryFaceverifyServerExAsync(QueryFaceverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceverifyServerResponse>(await DoRequestAsync("1.0", "di.realperson.faceverify.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡状态增强版
         * Summary: 个人银行卡状态增强版
         */
        public QueryBankLivenessplusResponse QueryBankLivenessplus(QueryBankLivenessplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBankLivenessplusEx(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡状态增强版
         * Summary: 个人银行卡状态增强版
         */
        public async Task<QueryBankLivenessplusResponse> QueryBankLivenessplusAsync(QueryBankLivenessplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBankLivenessplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡状态增强版
         * Summary: 个人银行卡状态增强版
         */
        public QueryBankLivenessplusResponse QueryBankLivenessplusEx(QueryBankLivenessplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessplusResponse>(DoRequest("1.0", "di.realperson.bank.livenessplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡状态增强版
         * Summary: 个人银行卡状态增强版
         */
        public async Task<QueryBankLivenessplusResponse> QueryBankLivenessplusExAsync(QueryBankLivenessplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessplusResponse>(await DoRequestAsync("1.0", "di.realperson.bank.livenessplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对基础版
         */
        public ExecFaceverifyServermodeResponse ExecFaceverifyServermode(ExecFaceverifyServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecFaceverifyServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对基础版
         */
        public async Task<ExecFaceverifyServermodeResponse> ExecFaceverifyServermodeAsync(ExecFaceverifyServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecFaceverifyServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对基础版
         */
        public ExecFaceverifyServermodeResponse ExecFaceverifyServermodeEx(ExecFaceverifyServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.faceverify.servermode.exec",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ExecFaceverifyServermodeResponse execFaceverifyServermodeResponse = new ExecFaceverifyServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return execFaceverifyServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFaceverifyServermodeResponse>(DoRequest("1.0", "di.realperson.faceverify.servermode.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对基础版
         */
        public async Task<ExecFaceverifyServermodeResponse> ExecFaceverifyServermodeExAsync(ExecFaceverifyServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "di.realperson.faceverify.servermode.exec",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ExecFaceverifyServermodeResponse execFaceverifyServermodeResponse = new ExecFaceverifyServermodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return execFaceverifyServermodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFaceverifyServermodeResponse>(await DoRequestAsync("1.0", "di.realperson.faceverify.servermode.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝实人认证初始化接口
         * Summary: 支付宝实人认证初始化接口
         */
        public CreateAlipayverifyServerResponse CreateAlipayverifyServer(CreateAlipayverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAlipayverifyServerEx(request, headers, runtime);
        }

        /**
         * Description: 支付宝实人认证初始化接口
         * Summary: 支付宝实人认证初始化接口
         */
        public async Task<CreateAlipayverifyServerResponse> CreateAlipayverifyServerAsync(CreateAlipayverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAlipayverifyServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付宝实人认证初始化接口
         * Summary: 支付宝实人认证初始化接口
         */
        public CreateAlipayverifyServerResponse CreateAlipayverifyServerEx(CreateAlipayverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlipayverifyServerResponse>(DoRequest("1.0", "di.realperson.alipayverify.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝实人认证初始化接口
         * Summary: 支付宝实人认证初始化接口
         */
        public async Task<CreateAlipayverifyServerResponse> CreateAlipayverifyServerExAsync(CreateAlipayverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlipayverifyServerResponse>(await DoRequestAsync("1.0", "di.realperson.alipayverify.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝实人认证查询接口
         * Summary: 支付宝实人认证查询接口
         */
        public QueryAlipayverifyServerResponse QueryAlipayverifyServer(QueryAlipayverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlipayverifyServerEx(request, headers, runtime);
        }

        /**
         * Description: 支付宝实人认证查询接口
         * Summary: 支付宝实人认证查询接口
         */
        public async Task<QueryAlipayverifyServerResponse> QueryAlipayverifyServerAsync(QueryAlipayverifyServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlipayverifyServerExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付宝实人认证查询接口
         * Summary: 支付宝实人认证查询接口
         */
        public QueryAlipayverifyServerResponse QueryAlipayverifyServerEx(QueryAlipayverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipayverifyServerResponse>(DoRequest("1.0", "di.realperson.alipayverify.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝实人认证查询接口
         * Summary: 支付宝实人认证查询接口
         */
        public async Task<QueryAlipayverifyServerResponse> QueryAlipayverifyServerExAsync(QueryAlipayverifyServerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipayverifyServerResponse>(await DoRequestAsync("1.0", "di.realperson.alipayverify.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车辆资产验证
         * Summary: 车辆资产验证
         */
        public CheckCarTwometaResponse CheckCarTwometa(CheckCarTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCarTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 车辆资产验证
         * Summary: 车辆资产验证
         */
        public async Task<CheckCarTwometaResponse> CheckCarTwometaAsync(CheckCarTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCarTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 车辆资产验证
         * Summary: 车辆资产验证
         */
        public CheckCarTwometaResponse CheckCarTwometaEx(CheckCarTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCarTwometaResponse>(DoRequest("1.0", "di.realperson.car.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车辆资产验证
         * Summary: 车辆资产验证
         */
        public async Task<CheckCarTwometaResponse> CheckCarTwometaExAsync(CheckCarTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCarTwometaResponse>(await DoRequestAsync("1.0", "di.realperson.car.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public QueryEducationBackgroundResponse QueryEducationBackground(QueryEducationBackgroundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEducationBackgroundEx(request, headers, runtime);
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public async Task<QueryEducationBackgroundResponse> QueryEducationBackgroundAsync(QueryEducationBackgroundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEducationBackgroundExAsync(request, headers, runtime);
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public QueryEducationBackgroundResponse QueryEducationBackgroundEx(QueryEducationBackgroundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEducationBackgroundResponse>(DoRequest("1.0", "di.realperson.education.background.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 学历验证
         * Summary: 学历验证
         */
        public async Task<QueryEducationBackgroundResponse> QueryEducationBackgroundExAsync(QueryEducationBackgroundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEducationBackgroundResponse>(await DoRequestAsync("1.0", "di.realperson.education.background.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡状态验证 V4.0
         * Summary: 个人银行卡状态验证 V4.0
         */
        public QueryBankLivenessfourResponse QueryBankLivenessfour(QueryBankLivenessfourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBankLivenessfourEx(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡状态验证 V4.0
         * Summary: 个人银行卡状态验证 V4.0
         */
        public async Task<QueryBankLivenessfourResponse> QueryBankLivenessfourAsync(QueryBankLivenessfourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBankLivenessfourExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人银行卡状态验证 V4.0
         * Summary: 个人银行卡状态验证 V4.0
         */
        public QueryBankLivenessfourResponse QueryBankLivenessfourEx(QueryBankLivenessfourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessfourResponse>(DoRequest("1.0", "di.realperson.bank.livenessfour.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人银行卡状态验证 V4.0
         * Summary: 个人银行卡状态验证 V4.0
         */
        public async Task<QueryBankLivenessfourResponse> QueryBankLivenessfourExAsync(QueryBankLivenessfourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBankLivenessfourResponse>(await DoRequestAsync("1.0", "di.realperson.bank.livenessfour.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的材料信息
         * Summary: 认证材料查询
         */
        public QueryFaceverifyServermaterialResponse QueryFaceverifyServermaterial(QueryFaceverifyServermaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceverifyServermaterialEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证的材料信息
         * Summary: 认证材料查询
         */
        public async Task<QueryFaceverifyServermaterialResponse> QueryFaceverifyServermaterialAsync(QueryFaceverifyServermaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceverifyServermaterialExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证的材料信息
         * Summary: 认证材料查询
         */
        public QueryFaceverifyServermaterialResponse QueryFaceverifyServermaterialEx(QueryFaceverifyServermaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceverifyServermaterialResponse>(DoRequest("1.0", "di.realperson.faceverify.servermaterial.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的材料信息
         * Summary: 认证材料查询
         */
        public async Task<QueryFaceverifyServermaterialResponse> QueryFaceverifyServermaterialExAsync(QueryFaceverifyServermaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceverifyServermaterialResponse>(await DoRequestAsync("1.0", "di.realperson.faceverify.servermaterial.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
