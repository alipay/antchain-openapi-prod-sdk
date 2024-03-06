// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MPAASFACEVERIFY.Models;

namespace AntChain.SDK.MPAASFACEVERIFY
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
                        {"sdk_version", "1.2.10"},
                        {"_prod_code", "MPAASFACEVERIFY"},
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
                        {"sdk_version", "1.2.10"},
                        {"_prod_code", "MPAASFACEVERIFY"},
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
         * Description: 人脸认证问题自动化排查接口
         * Summary: 人脸认证问题自动化排查接口
         */
        public QueryCertifyAnalysisResponse QueryCertifyAnalysis(QueryCertifyAnalysisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertifyAnalysisEx(request, headers, runtime);
        }

        /**
         * Description: 人脸认证问题自动化排查接口
         * Summary: 人脸认证问题自动化排查接口
         */
        public async Task<QueryCertifyAnalysisResponse> QueryCertifyAnalysisAsync(QueryCertifyAnalysisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertifyAnalysisExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸认证问题自动化排查接口
         * Summary: 人脸认证问题自动化排查接口
         */
        public QueryCertifyAnalysisResponse QueryCertifyAnalysisEx(QueryCertifyAnalysisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyAnalysisResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certify.analysis.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸认证问题自动化排查接口
         * Summary: 人脸认证问题自动化排查接口
         */
        public async Task<QueryCertifyAnalysisResponse> QueryCertifyAnalysisExAsync(QueryCertifyAnalysisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyAnalysisResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certify.analysis.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸认证问题根据身份信息获取认证信息
         * Summary: 人脸认证问题根据身份信息获取认证信息
         */
        public QueryCertifyAnalysisrecordResponse QueryCertifyAnalysisrecord(QueryCertifyAnalysisrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertifyAnalysisrecordEx(request, headers, runtime);
        }

        /**
         * Description: 人脸认证问题根据身份信息获取认证信息
         * Summary: 人脸认证问题根据身份信息获取认证信息
         */
        public async Task<QueryCertifyAnalysisrecordResponse> QueryCertifyAnalysisrecordAsync(QueryCertifyAnalysisrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertifyAnalysisrecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸认证问题根据身份信息获取认证信息
         * Summary: 人脸认证问题根据身份信息获取认证信息
         */
        public QueryCertifyAnalysisrecordResponse QueryCertifyAnalysisrecordEx(QueryCertifyAnalysisrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyAnalysisrecordResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certify.analysisrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸认证问题根据身份信息获取认证信息
         * Summary: 人脸认证问题根据身份信息获取认证信息
         */
        public async Task<QueryCertifyAnalysisrecordResponse> QueryCertifyAnalysisrecordExAsync(QueryCertifyAnalysisrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyAnalysisrecordResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certify.analysisrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public InitFaceauthResponse InitFaceauth(InitFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public async Task<InitFaceauthResponse> InitFaceauthAsync(InitFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public InitFaceauthResponse InitFaceauthEx(InitFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
         * Summary: 实人认证初始化
         */
        public async Task<InitFaceauthResponse> InitFaceauthExAsync(InitFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceauthResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public QueryFaceauthResponse QueryFaceauth(QueryFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public async Task<QueryFaceauthResponse> QueryFaceauthAsync(QueryFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public QueryFaceauthResponse QueryFaceauthEx(QueryFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
         * Summary: 实人认证查询
         */
        public async Task<QueryFaceauthResponse> QueryFaceauthExAsync(QueryFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public InitFaceplusResponse InitFaceplus(InitFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFaceplusEx(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public async Task<InitFaceplusResponse> InitFaceplusAsync(InitFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFaceplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public InitFaceplusResponse InitFaceplusEx(InitFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceplusResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.faceplus.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端初始化
         * Summary: 人脸双因子认证服务端初始化
         */
        public async Task<InitFaceplusResponse> InitFaceplusExAsync(InitFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFaceplusResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.faceplus.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public QueryFaceplusResponse QueryFaceplus(QueryFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceplusEx(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public async Task<QueryFaceplusResponse> QueryFaceplusAsync(QueryFaceplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public QueryFaceplusResponse QueryFaceplusEx(QueryFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceplusResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.faceplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸双因子认证服务端查询
         * Summary: 人脸双因子认证服务端查询
         */
        public async Task<QueryFaceplusResponse> QueryFaceplusExAsync(QueryFaceplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceplusResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.faceplus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryFaceauthFileResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.faceauth.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
         * Summary: 获取认证资料
         */
        public async Task<QueryFaceauthFileResponse> QueryFaceauthFileExAsync(QueryFaceauthFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceauthFileResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.faceauth.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
         * Summary: 实人认证核验源服务
         */
        public CertifyServermodeResponse CertifyServermode(CertifyServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
         * Summary: 实人认证核验源服务
         */
        public async Task<CertifyServermodeResponse> CertifyServermodeAsync(CertifyServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
         * Summary: 实人认证核验源服务
         */
        public CertifyServermodeResponse CertifyServermodeEx(CertifyServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyServermodeResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.servermode.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
         * Summary: 实人认证核验源服务
         */
        public async Task<CertifyServermodeResponse> CertifyServermodeExAsync(CertifyServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyServermodeResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.servermode.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 实人认证单据初始化服务
         */
        public InitCertifyrecordRealpersonResponse InitCertifyrecordRealperson(InitCertifyrecordRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCertifyrecordRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 实人认证单据初始化服务
         */
        public async Task<InitCertifyrecordRealpersonResponse> InitCertifyrecordRealpersonAsync(InitCertifyrecordRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCertifyrecordRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 实人认证单据初始化服务
         */
        public InitCertifyrecordRealpersonResponse InitCertifyrecordRealpersonEx(InitCertifyrecordRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertifyrecordRealpersonResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.realperson.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 实人认证单据初始化服务
         */
        public async Task<InitCertifyrecordRealpersonResponse> InitCertifyrecordRealpersonExAsync(InitCertifyrecordRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertifyrecordRealpersonResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certifyrecord.realperson.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 认证单据初始化服务(无身份)
         */
        public InitCertifyrecordResponse InitCertifyrecord(InitCertifyrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCertifyrecordEx(request, headers, runtime);
        }

        /**
         * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 认证单据初始化服务(无身份)
         */
        public async Task<InitCertifyrecordResponse> InitCertifyrecordAsync(InitCertifyrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCertifyrecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 认证单据初始化服务(无身份)
         */
        public InitCertifyrecordResponse InitCertifyrecordEx(InitCertifyrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertifyrecordResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 认证单据初始化服务(无身份)
         */
        public async Task<InitCertifyrecordResponse> InitCertifyrecordExAsync(InitCertifyrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertifyrecordResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certifyrecord.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
         * Summary: 实人认证查询(certifyId)
         */
        public QueryCertifyrecordResponse QueryCertifyrecord(QueryCertifyrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertifyrecordEx(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
         * Summary: 实人认证查询(certifyId)
         */
        public async Task<QueryCertifyrecordResponse> QueryCertifyrecordAsync(QueryCertifyrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertifyrecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
         * Summary: 实人认证查询(certifyId)
         */
        public QueryCertifyrecordResponse QueryCertifyrecordEx(QueryCertifyrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyrecordResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
         * Summary: 实人认证查询(certifyId)
         */
        public async Task<QueryCertifyrecordResponse> QueryCertifyrecordExAsync(QueryCertifyrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyrecordResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certifyrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
         * Summary: OCR数据上传接口
         */
        public UploadOcrServermodeResponse UploadOcrServermode(UploadOcrServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadOcrServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
         * Summary: OCR数据上传接口
         */
        public async Task<UploadOcrServermodeResponse> UploadOcrServermodeAsync(UploadOcrServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadOcrServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
         * Summary: OCR数据上传接口
         */
        public UploadOcrServermodeResponse UploadOcrServermodeEx(UploadOcrServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadOcrServermodeResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.ocr.servermode.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
         * Summary: OCR数据上传接口
         */
        public async Task<UploadOcrServermodeResponse> UploadOcrServermodeExAsync(UploadOcrServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadOcrServermodeResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.ocr.servermode.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
         * Summary: 计费信息查询
         */
        public QueryCertifyrecordChargeResponse QueryCertifyrecordCharge(QueryCertifyrecordChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertifyrecordChargeEx(request, headers, runtime);
        }

        /**
         * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
         * Summary: 计费信息查询
         */
        public async Task<QueryCertifyrecordChargeResponse> QueryCertifyrecordChargeAsync(QueryCertifyrecordChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertifyrecordChargeExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
         * Summary: 计费信息查询
         */
        public QueryCertifyrecordChargeResponse QueryCertifyrecordChargeEx(QueryCertifyrecordChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyrecordChargeResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.charge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
         * Summary: 计费信息查询
         */
        public async Task<QueryCertifyrecordChargeResponse> QueryCertifyrecordChargeExAsync(QueryCertifyrecordChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertifyrecordChargeResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.certifyrecord.charge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 一键登录初始化
         */
        public InitOneloginResponse InitOnelogin(InitOneloginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitOneloginEx(request, headers, runtime);
        }

        /**
         * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 一键登录初始化
         */
        public async Task<InitOneloginResponse> InitOneloginAsync(InitOneloginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitOneloginExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 一键登录初始化
         */
        public InitOneloginResponse InitOneloginEx(InitOneloginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitOneloginResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.onelogin.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
         * Summary: 一键登录初始化
         */
        public async Task<InitOneloginResponse> InitOneloginExAsync(InitOneloginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitOneloginResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.onelogin.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
         * Summary: 融合认证查询
         */
        public QueryOneverifyResponse QueryOneverify(QueryOneverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOneverifyEx(request, headers, runtime);
        }

        /**
         * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
         * Summary: 融合认证查询
         */
        public async Task<QueryOneverifyResponse> QueryOneverifyAsync(QueryOneverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOneverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
         * Summary: 融合认证查询
         */
        public QueryOneverifyResponse QueryOneverifyEx(QueryOneverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOneverifyResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.oneverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
         * Summary: 融合认证查询
         */
        public async Task<QueryOneverifyResponse> QueryOneverifyExAsync(QueryOneverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOneverifyResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.oneverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
         * Summary: 本机校验初始化
         */
        public InitOnepassResponse InitOnepass(InitOnepassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitOnepassEx(request, headers, runtime);
        }

        /**
         * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
         * Summary: 本机校验初始化
         */
        public async Task<InitOnepassResponse> InitOnepassAsync(InitOnepassRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitOnepassExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
         * Summary: 本机校验初始化
         */
        public InitOnepassResponse InitOnepassEx(InitOnepassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitOnepassResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.onepass.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
         * Summary: 本机校验初始化
         */
        public async Task<InitOnepassResponse> InitOnepassExAsync(InitOnepassRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitOnepassResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.onepass.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
         * Summary: 身份信息二要素认证
         */
        public CertifyIdentitymetaServermodeResponse CertifyIdentitymetaServermode(CertifyIdentitymetaServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyIdentitymetaServermodeEx(request, headers, runtime);
        }

        /**
         * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
         * Summary: 身份信息二要素认证
         */
        public async Task<CertifyIdentitymetaServermodeResponse> CertifyIdentitymetaServermodeAsync(CertifyIdentitymetaServermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyIdentitymetaServermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
         * Summary: 身份信息二要素认证
         */
        public CertifyIdentitymetaServermodeResponse CertifyIdentitymetaServermodeEx(CertifyIdentitymetaServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIdentitymetaServermodeResponse>(DoRequest("1.0", "antfin.mpaasfaceverify.identitymeta.servermode.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
         * Summary: 身份信息二要素认证
         */
        public async Task<CertifyIdentitymetaServermodeResponse> CertifyIdentitymetaServermodeExAsync(CertifyIdentitymetaServermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIdentitymetaServermodeResponse>(await DoRequestAsync("1.0", "antfin.mpaasfaceverify.identitymeta.servermode.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
