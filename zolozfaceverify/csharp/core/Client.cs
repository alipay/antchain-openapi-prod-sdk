// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ZOLOZFACEVERIFY.Models;

namespace AntChain.SDK.ZOLOZFACEVERIFY
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
                        {"sdk_version", "1.6.2"},
                        {"_prod_code", "ZOLOZFACEVERIFY"},
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
                        {"sdk_version", "1.6.2"},
                        {"_prod_code", "ZOLOZFACEVERIFY"},
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
         * Description: 金融云计算能力输出给主站使用
         * Summary: 金融云计算能力输出给主站使用
         */
        public ExecFaceauthAlgorithmResponse ExecFaceauthAlgorithm(ExecFaceauthAlgorithmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecFaceauthAlgorithmEx(request, headers, runtime);
        }

        /**
         * Description: 金融云计算能力输出给主站使用
         * Summary: 金融云计算能力输出给主站使用
         */
        public async Task<ExecFaceauthAlgorithmResponse> ExecFaceauthAlgorithmAsync(ExecFaceauthAlgorithmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecFaceauthAlgorithmExAsync(request, headers, runtime);
        }

        /**
         * Description: 金融云计算能力输出给主站使用
         * Summary: 金融云计算能力输出给主站使用
         */
        public ExecFaceauthAlgorithmResponse ExecFaceauthAlgorithmEx(ExecFaceauthAlgorithmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFaceauthAlgorithmResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.algorithm.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 金融云计算能力输出给主站使用
         * Summary: 金融云计算能力输出给主站使用
         */
        public async Task<ExecFaceauthAlgorithmResponse> ExecFaceauthAlgorithmExAsync(ExecFaceauthAlgorithmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecFaceauthAlgorithmResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.algorithm.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public FaceFaceauthInitializeResponse FaceFaceauthInitialize(FaceFaceauthInitializeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FaceFaceauthInitializeEx(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public async Task<FaceFaceauthInitializeResponse> FaceFaceauthInitializeAsync(FaceFaceauthInitializeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FaceFaceauthInitializeExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public FaceFaceauthInitializeResponse FaceFaceauthInitializeEx(FaceFaceauthInitializeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceFaceauthInitializeResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.initialize.face", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public async Task<FaceFaceauthInitializeResponse> FaceFaceauthInitializeExAsync(FaceFaceauthInitializeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceFaceauthInitializeResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.initialize.face", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public FaceFaceauthQueryResponse FaceFaceauthQuery(FaceFaceauthQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FaceFaceauthQueryEx(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public async Task<FaceFaceauthQueryResponse> FaceFaceauthQueryAsync(FaceFaceauthQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FaceFaceauthQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public FaceFaceauthQueryResponse FaceFaceauthQueryEx(FaceFaceauthQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceFaceauthQueryResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.query.face", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public async Task<FaceFaceauthQueryResponse> FaceFaceauthQueryExAsync(FaceFaceauthQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceFaceauthQueryResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.query.face", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸纯服务端模式比对
         * Summary: 人脸纯服务端模式比对
         */
        public IdentityFaceauthServermodeResponse IdentityFaceauthServermode(IdentityFaceauthServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IdentityFaceauthServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 人脸纯服务端模式比对
         * Summary: 人脸纯服务端模式比对
         */
        public async Task<IdentityFaceauthServermodeResponse> IdentityFaceauthServermodeAsync(IdentityFaceauthServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IdentityFaceauthServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸纯服务端模式比对
         * Summary: 人脸纯服务端模式比对
         */
        public IdentityFaceauthServermodeResponse IdentityFaceauthServermodeEx(IdentityFaceauthServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdentityFaceauthServermodeResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.servermode.identity", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸纯服务端模式比对
         * Summary: 人脸纯服务端模式比对
         */
        public async Task<IdentityFaceauthServermodeResponse> IdentityFaceauthServermodeExAsync(IdentityFaceauthServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdentityFaceauthServermodeResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.servermode.identity", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: H5实人认证初始化
         */
        public InitializeFaceauthWebResponse InitializeFaceauthWeb(InitializeFaceauthWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitializeFaceauthWebEx(request, headers, runtime);
        }

        /**
         * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: H5实人认证初始化
         */
        public async Task<InitializeFaceauthWebResponse> InitializeFaceauthWebAsync(InitializeFaceauthWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitializeFaceauthWebExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: H5实人认证初始化
         */
        public InitializeFaceauthWebResponse InitializeFaceauthWebEx(InitializeFaceauthWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitializeFaceauthWebResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.web.initialize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: H5实人认证初始化
         */
        public async Task<InitializeFaceauthWebResponse> InitializeFaceauthWebExAsync(InitializeFaceauthWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitializeFaceauthWebResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.web.initialize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: H5实人认证查询
         * Summary: H5实人认证查询
         */
        public QueryFaceauthWebResponse QueryFaceauthWeb(QueryFaceauthWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthWebEx(request, headers, runtime);
        }

        /**
         * Description: H5实人认证查询
         * Summary: H5实人认证查询
         */
        public async Task<QueryFaceauthWebResponse> QueryFaceauthWebAsync(QueryFaceauthWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthWebExAsync(request, headers, runtime);
        }

        /**
         * Description: H5实人认证查询
         * Summary: H5实人认证查询
         */
        public QueryFaceauthWebResponse QueryFaceauthWebEx(QueryFaceauthWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthWebResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: H5实人认证查询
         * Summary: H5实人认证查询
         */
        public async Task<QueryFaceauthWebResponse> QueryFaceauthWebExAsync(QueryFaceauthWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthWebResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给业务方刷脸认证计量查询接口
         * Summary: 提供给业务方刷脸认证计量查询接口
         */
        public QueryFaceauthMeteringResponse QueryFaceauthMetering(QueryFaceauthMeteringRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthMeteringEx(request, headers, runtime);
        }

        /**
         * Description: 提供给业务方刷脸认证计量查询接口
         * Summary: 提供给业务方刷脸认证计量查询接口
         */
        public async Task<QueryFaceauthMeteringResponse> QueryFaceauthMeteringAsync(QueryFaceauthMeteringRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthMeteringExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给业务方刷脸认证计量查询接口
         * Summary: 提供给业务方刷脸认证计量查询接口
         */
        public QueryFaceauthMeteringResponse QueryFaceauthMeteringEx(QueryFaceauthMeteringRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthMeteringResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.metering.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给业务方刷脸认证计量查询接口
         * Summary: 提供给业务方刷脸认证计量查询接口
         */
        public async Task<QueryFaceauthMeteringResponse> QueryFaceauthMeteringExAsync(QueryFaceauthMeteringRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthMeteringResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.metering.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简模式初始化接口，返回zimId和协议
         * Summary: 极简模式初始化接口
         */
        public InitFaceauthFaceLiteResponse InitFaceauthFaceLite(InitFaceauthFaceLiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthFaceLiteEx(request, headers, runtime);
        }

        /**
         * Description: 极简模式初始化接口，返回zimId和协议
         * Summary: 极简模式初始化接口
         */
        public async Task<InitFaceauthFaceLiteResponse> InitFaceauthFaceLiteAsync(InitFaceauthFaceLiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthFaceLiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简模式初始化接口，返回zimId和协议
         * Summary: 极简模式初始化接口
         */
        public InitFaceauthFaceLiteResponse InitFaceauthFaceLiteEx(InitFaceauthFaceLiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceLiteResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.face.lite.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简模式初始化接口，返回zimId和协议
         * Summary: 极简模式初始化接口
         */
        public async Task<InitFaceauthFaceLiteResponse> InitFaceauthFaceLiteExAsync(InitFaceauthFaceLiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceLiteResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.face.lite.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据查询，排查case
         * Summary: 数据查询，排查case
         */
        public QueryFaceauthDataResponse QueryFaceauthData(QueryFaceauthDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthDataEx(request, headers, runtime);
        }

        /**
         * Description: 数据查询，排查case
         * Summary: 数据查询，排查case
         */
        public async Task<QueryFaceauthDataResponse> QueryFaceauthDataAsync(QueryFaceauthDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据查询，排查case
         * Summary: 数据查询，排查case
         */
        public QueryFaceauthDataResponse QueryFaceauthDataEx(QueryFaceauthDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthDataResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据查询，排查case
         * Summary: 数据查询，排查case
         */
        public async Task<QueryFaceauthDataResponse> QueryFaceauthDataExAsync(QueryFaceauthDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthDataResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供人脸特征提取、人脸区域识别等能力接口
         * Summary: 提供人脸特征提取、人脸区域识别等能力接口
         */
        public ExecAuthenticationCustomerFaceabilityResponse ExecAuthenticationCustomerFaceability(ExecAuthenticationCustomerFaceabilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAuthenticationCustomerFaceabilityEx(request, headers, runtime);
        }

        /**
         * Description: 提供人脸特征提取、人脸区域识别等能力接口
         * Summary: 提供人脸特征提取、人脸区域识别等能力接口
         */
        public async Task<ExecAuthenticationCustomerFaceabilityResponse> ExecAuthenticationCustomerFaceabilityAsync(ExecAuthenticationCustomerFaceabilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAuthenticationCustomerFaceabilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供人脸特征提取、人脸区域识别等能力接口
         * Summary: 提供人脸特征提取、人脸区域识别等能力接口
         */
        public ExecAuthenticationCustomerFaceabilityResponse ExecAuthenticationCustomerFaceabilityEx(ExecAuthenticationCustomerFaceabilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthenticationCustomerFaceabilityResponse>(DoRequest("1.0", "faceverifyzoloz.authentication.customer.faceability.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供人脸特征提取、人脸区域识别等能力接口
         * Summary: 提供人脸特征提取、人脸区域识别等能力接口
         */
        public async Task<ExecAuthenticationCustomerFaceabilityResponse> ExecAuthenticationCustomerFaceabilityExAsync(ExecAuthenticationCustomerFaceabilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthenticationCustomerFaceabilityResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.authentication.customer.faceability.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端接口初始化认证
         * Summary: 客户端初始化
         */
        public InitFaceauthZimResponse InitFaceauthZim(InitFaceauthZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthZimEx(request, headers, runtime);
        }

        /**
         * Description: 客户端接口初始化认证
         * Summary: 客户端初始化
         */
        public async Task<InitFaceauthZimResponse> InitFaceauthZimAsync(InitFaceauthZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthZimExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户端接口初始化认证
         * Summary: 客户端初始化
         */
        public InitFaceauthZimResponse InitFaceauthZimEx(InitFaceauthZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthZimResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.zim.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户端接口初始化认证
         * Summary: 客户端初始化
         */
        public async Task<InitFaceauthZimResponse> InitFaceauthZimExAsync(InitFaceauthZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthZimResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.zim.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供客户端活体检测与人脸比对服务
         * Summary: 客户端人脸验证
         */
        public VerifyFaceauthZimResponse VerifyFaceauthZim(VerifyFaceauthZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyFaceauthZimEx(request, headers, runtime);
        }

        /**
         * Description: 提供客户端活体检测与人脸比对服务
         * Summary: 客户端人脸验证
         */
        public async Task<VerifyFaceauthZimResponse> VerifyFaceauthZimAsync(VerifyFaceauthZimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyFaceauthZimExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供客户端活体检测与人脸比对服务
         * Summary: 客户端人脸验证
         */
        public VerifyFaceauthZimResponse VerifyFaceauthZimEx(VerifyFaceauthZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFaceauthZimResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.zim.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供客户端活体检测与人脸比对服务
         * Summary: 客户端人脸验证
         */
        public async Task<VerifyFaceauthZimResponse> VerifyFaceauthZimExAsync(VerifyFaceauthZimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFaceauthZimResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.zim.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: OCR识别接口，开放给阿里云场景
         * Summary: OCR识别接口
         */
        public RecognizeFaceauthOcrResponse RecognizeFaceauthOcr(RecognizeFaceauthOcrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeFaceauthOcrEx(request, headers, runtime);
        }

        /**
         * Description: OCR识别接口，开放给阿里云场景
         * Summary: OCR识别接口
         */
        public async Task<RecognizeFaceauthOcrResponse> RecognizeFaceauthOcrAsync(RecognizeFaceauthOcrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeFaceauthOcrExAsync(request, headers, runtime);
        }

        /**
         * Description: OCR识别接口，开放给阿里云场景
         * Summary: OCR识别接口
         */
        public RecognizeFaceauthOcrResponse RecognizeFaceauthOcrEx(RecognizeFaceauthOcrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeFaceauthOcrResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.ocr.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: OCR识别接口，开放给阿里云场景
         * Summary: OCR识别接口
         */
        public async Task<RecognizeFaceauthOcrResponse> RecognizeFaceauthOcrExAsync(RecognizeFaceauthOcrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeFaceauthOcrResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.ocr.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Web实人认证初始化	
         * Summary: Web实人认证初始化 
         */
        public InitFaceauthWebsdkResponse InitFaceauthWebsdk(InitFaceauthWebsdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthWebsdkEx(request, headers, runtime);
        }

        /**
         * Description: Web实人认证初始化	
         * Summary: Web实人认证初始化 
         */
        public async Task<InitFaceauthWebsdkResponse> InitFaceauthWebsdkAsync(InitFaceauthWebsdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthWebsdkExAsync(request, headers, runtime);
        }

        /**
         * Description: Web实人认证初始化	
         * Summary: Web实人认证初始化 
         */
        public InitFaceauthWebsdkResponse InitFaceauthWebsdkEx(InitFaceauthWebsdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthWebsdkResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.websdk.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Web实人认证初始化	
         * Summary: Web实人认证初始化 
         */
        public async Task<InitFaceauthWebsdkResponse> InitFaceauthWebsdkExAsync(InitFaceauthWebsdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthWebsdkResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.websdk.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Web实人认证查询
         * Summary: Web实人认证查询
         */
        public QueryFaceauthWebsdkResponse QueryFaceauthWebsdk(QueryFaceauthWebsdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthWebsdkEx(request, headers, runtime);
        }

        /**
         * Description: Web实人认证查询
         * Summary: Web实人认证查询
         */
        public async Task<QueryFaceauthWebsdkResponse> QueryFaceauthWebsdkAsync(QueryFaceauthWebsdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthWebsdkExAsync(request, headers, runtime);
        }

        /**
         * Description: Web实人认证查询
         * Summary: Web实人认证查询
         */
        public QueryFaceauthWebsdkResponse QueryFaceauthWebsdkEx(QueryFaceauthWebsdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthWebsdkResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.websdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Web实人认证查询
         * Summary: Web实人认证查询
         */
        public async Task<QueryFaceauthWebsdkResponse> QueryFaceauthWebsdkExAsync(QueryFaceauthWebsdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthWebsdkResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.websdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
         * Summary: 获取认证资料
         */
        public QueryFaceauthFileResponse QueryFaceauthFile(QueryFaceauthFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthFileEx(request, headers, runtime);
        }

        /**
         * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
         * Summary: 获取认证资料
         */
        public async Task<QueryFaceauthFileResponse> QueryFaceauthFileAsync(QueryFaceauthFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthFileExAsync(request, headers, runtime);
        }

        /**
         * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
         * Summary: 获取认证资料
         */
        public QueryFaceauthFileResponse QueryFaceauthFileEx(QueryFaceauthFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthFileResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
         * Summary: 获取认证资料
         */
        public async Task<QueryFaceauthFileResponse> QueryFaceauthFileExAsync(QueryFaceauthFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthFileResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public InitFaceauthFaceplusResponse InitFaceauthFaceplus(InitFaceauthFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthFaceplusEx(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public async Task<InitFaceauthFaceplusResponse> InitFaceauthFaceplusAsync(InitFaceauthFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthFaceplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public InitFaceauthFaceplusResponse InitFaceauthFaceplusEx(InitFaceauthFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceplusResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.faceplus.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public async Task<InitFaceauthFaceplusResponse> InitFaceauthFaceplusExAsync(InitFaceauthFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceplusResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.faceplus.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public QueryFaceauthFaceplusResponse QueryFaceauthFaceplus(QueryFaceauthFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthFaceplusEx(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public async Task<QueryFaceauthFaceplusResponse> QueryFaceauthFaceplusAsync(QueryFaceauthFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthFaceplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public QueryFaceauthFaceplusResponse QueryFaceauthFaceplusEx(QueryFaceauthFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthFaceplusResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.faceplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public async Task<QueryFaceauthFaceplusResponse> QueryFaceauthFaceplusExAsync(QueryFaceauthFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthFaceplusResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.faceplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 意愿核身认证服务端初始化
         * Summary: 意愿核身认证服务端初始化
         */
        public InitFaceauthFaceWishResponse InitFaceauthFaceWish(InitFaceauthFaceWishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthFaceWishEx(request, headers, runtime);
        }

        /**
         * Description: 意愿核身认证服务端初始化
         * Summary: 意愿核身认证服务端初始化
         */
        public async Task<InitFaceauthFaceWishResponse> InitFaceauthFaceWishAsync(InitFaceauthFaceWishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthFaceWishExAsync(request, headers, runtime);
        }

        /**
         * Description: 意愿核身认证服务端初始化
         * Summary: 意愿核身认证服务端初始化
         */
        public InitFaceauthFaceWishResponse InitFaceauthFaceWishEx(InitFaceauthFaceWishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceWishResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.face.wish.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 意愿核身认证服务端初始化
         * Summary: 意愿核身认证服务端初始化
         */
        public async Task<InitFaceauthFaceWishResponse> InitFaceauthFaceWishExAsync(InitFaceauthFaceWishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthFaceWishResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.face.wish.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸视频认证
         * Summary: 人脸视频认证
         */
        public VerifyFaceauthVideoResponse VerifyFaceauthVideo(VerifyFaceauthVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyFaceauthVideoEx(request, headers, runtime);
        }

        /**
         * Description: 人脸视频认证
         * Summary: 人脸视频认证
         */
        public async Task<VerifyFaceauthVideoResponse> VerifyFaceauthVideoAsync(VerifyFaceauthVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyFaceauthVideoExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸视频认证
         * Summary: 人脸视频认证
         */
        public VerifyFaceauthVideoResponse VerifyFaceauthVideoEx(VerifyFaceauthVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFaceauthVideoResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.video.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸视频认证
         * Summary: 人脸视频认证
         */
        public async Task<VerifyFaceauthVideoResponse> VerifyFaceauthVideoExAsync(VerifyFaceauthVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFaceauthVideoResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.video.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实证NFC服务端初始化
         * Summary: 实证NFC服务端初始化
         */
        public InitFaceauthNfcResponse InitFaceauthNfc(InitFaceauthNfcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthNfcEx(request, headers, runtime);
        }

        /**
         * Description: 实证NFC服务端初始化
         * Summary: 实证NFC服务端初始化
         */
        public async Task<InitFaceauthNfcResponse> InitFaceauthNfcAsync(InitFaceauthNfcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthNfcExAsync(request, headers, runtime);
        }

        /**
         * Description: 实证NFC服务端初始化
         * Summary: 实证NFC服务端初始化
         */
        public InitFaceauthNfcResponse InitFaceauthNfcEx(InitFaceauthNfcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthNfcResponse>(DoRequest("1.0", "faceverifyzoloz.faceauth.nfc.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实证NFC服务端初始化
         * Summary: 实证NFC服务端初始化
         */
        public async Task<InitFaceauthNfcResponse> InitFaceauthNfcExAsync(InitFaceauthNfcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthNfcResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.faceauth.nfc.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public CreateConsoleSceneDomainResponse CreateConsoleSceneDomain(CreateConsoleSceneDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsoleSceneDomainEx(request, headers, runtime);
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public async Task<CreateConsoleSceneDomainResponse> CreateConsoleSceneDomainAsync(CreateConsoleSceneDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsoleSceneDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public CreateConsoleSceneDomainResponse CreateConsoleSceneDomainEx(CreateConsoleSceneDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsoleSceneDomainResponse>(DoRequest("1.0", "faceverifyzoloz.console.scene.domain.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于阿里云渠道小程序域名的绑定
         * Summary: 新增场景与域名映射
         */
        public async Task<CreateConsoleSceneDomainResponse> CreateConsoleSceneDomainExAsync(CreateConsoleSceneDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsoleSceneDomainResponse>(await DoRequestAsync("1.0", "faceverifyzoloz.console.scene.domain.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
