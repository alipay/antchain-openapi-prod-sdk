// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.HK_SECURITYTECH.Models;

namespace AntChain.SDK.HK_SECURITYTECH
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
                        {"sdk_version", "1.5.9"},
                        {"_prod_code", "HK_SECURITYTECH"},
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
                        {"sdk_version", "1.5.9"},
                        {"_prod_code", "HK_SECURITYTECH"},
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
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBlueshieldSecuritypictureResponse CreateBlueshieldSecuritypicture(CreateBlueshieldSecuritypictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlueshieldSecuritypictureEx(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBlueshieldSecuritypictureResponse> CreateBlueshieldSecuritypictureAsync(CreateBlueshieldSecuritypictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlueshieldSecuritypictureExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBlueshieldSecuritypictureResponse CreateBlueshieldSecuritypictureEx(CreateBlueshieldSecuritypictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(DoRequest("1.0", "hksecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBlueshieldSecuritypictureResponse> CreateBlueshieldSecuritypictureExAsync(CreateBlueshieldSecuritypictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public QueryFaceshieldNativeResponse QueryFaceshieldNative(QueryFaceshieldNativeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceshieldNativeEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public async Task<QueryFaceshieldNativeResponse> QueryFaceshieldNativeAsync(QueryFaceshieldNativeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceshieldNativeExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public QueryFaceshieldNativeResponse QueryFaceshieldNativeEx(QueryFaceshieldNativeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(DoRequest("1.0", "hksecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public async Task<QueryFaceshieldNativeResponse> QueryFaceshieldNativeExAsync(QueryFaceshieldNativeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务
         */
        public SubmitAshieldHardeningtaskResponse SubmitAshieldHardeningtask(SubmitAshieldHardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAshieldHardeningtaskEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务
         */
        public async Task<SubmitAshieldHardeningtaskResponse> SubmitAshieldHardeningtaskAsync(SubmitAshieldHardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAshieldHardeningtaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务
         */
        public SubmitAshieldHardeningtaskResponse SubmitAshieldHardeningtaskEx(SubmitAshieldHardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldHardeningtaskResponse>(DoRequest("1.0", "hksecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务
         */
        public async Task<SubmitAshieldHardeningtaskResponse> SubmitAshieldHardeningtaskExAsync(SubmitAshieldHardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldHardeningtaskResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskFingerResponse QueryDeviceriskFinger(QueryDeviceriskFingerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskFingerEx(request, headers, runtime);
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskFingerResponse> QueryDeviceriskFingerAsync(QueryDeviceriskFingerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskFingerExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskFingerResponse QueryDeviceriskFingerEx(QueryDeviceriskFingerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskFingerResponse>(DoRequest("1.0", "hksecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskFingerResponse> QueryDeviceriskFingerExAsync(QueryDeviceriskFingerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskFingerResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskDeviceriskResponse QueryDeviceriskDevicerisk(QueryDeviceriskDeviceriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskDeviceriskEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskDeviceriskResponse> QueryDeviceriskDeviceriskAsync(QueryDeviceriskDeviceriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskDeviceriskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskDeviceriskResponse QueryDeviceriskDeviceriskEx(QueryDeviceriskDeviceriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskDeviceriskResponse>(DoRequest("1.0", "hksecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskDeviceriskResponse> QueryDeviceriskDeviceriskExAsync(QueryDeviceriskDeviceriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskDeviceriskResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public QueryFaceshieldWebResponse QueryFaceshieldWeb(QueryFaceshieldWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceshieldWebEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public async Task<QueryFaceshieldWebResponse> QueryFaceshieldWebAsync(QueryFaceshieldWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceshieldWebExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public QueryFaceshieldWebResponse QueryFaceshieldWebEx(QueryFaceshieldWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(DoRequest("1.0", "hksecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public async Task<QueryFaceshieldWebResponse> QueryFaceshieldWebExAsync(QueryFaceshieldWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全 设备信息上报
         * Summary: 设备信息上报
         */
        public SubmitDeviceriskReportResponse SubmitDeviceriskReport(SubmitDeviceriskReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitDeviceriskReportEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全 设备信息上报
         * Summary: 设备信息上报
         */
        public async Task<SubmitDeviceriskReportResponse> SubmitDeviceriskReportAsync(SubmitDeviceriskReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitDeviceriskReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全 设备信息上报
         * Summary: 设备信息上报
         */
        public SubmitDeviceriskReportResponse SubmitDeviceriskReportEx(SubmitDeviceriskReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDeviceriskReportResponse>(DoRequest("1.0", "hksecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全 设备信息上报
         * Summary: 设备信息上报
         */
        public async Task<SubmitDeviceriskReportResponse> SubmitDeviceriskReportExAsync(SubmitDeviceriskReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDeviceriskReportResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全 EaglePromo
         * Summary: EaglePromo
         */
        public QueryEaglepromoMarketingriskResponse QueryEaglepromoMarketingrisk(QueryEaglepromoMarketingriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEaglepromoMarketingriskEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全 EaglePromo
         * Summary: EaglePromo
         */
        public async Task<QueryEaglepromoMarketingriskResponse> QueryEaglepromoMarketingriskAsync(QueryEaglepromoMarketingriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEaglepromoMarketingriskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全 EaglePromo
         * Summary: EaglePromo
         */
        public QueryEaglepromoMarketingriskResponse QueryEaglepromoMarketingriskEx(QueryEaglepromoMarketingriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEaglepromoMarketingriskResponse>(DoRequest("1.0", "hksecuritytech.gateway.eaglepromo.marketingrisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全 EaglePromo
         * Summary: EaglePromo
         */
        public async Task<QueryEaglepromoMarketingriskResponse> QueryEaglepromoMarketingriskExAsync(QueryEaglepromoMarketingriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEaglepromoMarketingriskResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.eaglepromo.marketingrisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 form
         * Summary: aml analyze v2 form
         */
        public SubmitAmlcloudAnalyzeResponse SubmitAmlcloudAnalyze(SubmitAmlcloudAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAmlcloudAnalyzeEx(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 form
         * Summary: aml analyze v2 form
         */
        public async Task<SubmitAmlcloudAnalyzeResponse> SubmitAmlcloudAnalyzeAsync(SubmitAmlcloudAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAmlcloudAnalyzeExAsync(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 form
         * Summary: aml analyze v2 form
         */
        public SubmitAmlcloudAnalyzeResponse SubmitAmlcloudAnalyzeEx(SubmitAmlcloudAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAmlcloudAnalyzeResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlcloud.analyze.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 form
         * Summary: aml analyze v2 form
         */
        public async Task<SubmitAmlcloudAnalyzeResponse> SubmitAmlcloudAnalyzeExAsync(SubmitAmlcloudAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAmlcloudAnalyzeResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlcloud.analyze.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml analyze v2 rest
         */
        public QueryAmlcloudAnalyzeResponse QueryAmlcloudAnalyze(QueryAmlcloudAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAmlcloudAnalyzeEx(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml analyze v2 rest
         */
        public async Task<QueryAmlcloudAnalyzeResponse> QueryAmlcloudAnalyzeAsync(QueryAmlcloudAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAmlcloudAnalyzeExAsync(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml analyze v2 rest
         */
        public QueryAmlcloudAnalyzeResponse QueryAmlcloudAnalyzeEx(QueryAmlcloudAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlcloudAnalyzeResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlcloud.analyze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml analyze v2 rest
         */
        public async Task<QueryAmlcloudAnalyzeResponse> QueryAmlcloudAnalyzeExAsync(QueryAmlcloudAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlcloudAnalyzeResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlcloud.analyze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml check v2 rest
         */
        public QueryAmlcloudCheckcaseresultResponse QueryAmlcloudCheckcaseresult(QueryAmlcloudCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAmlcloudCheckcaseresultEx(request, headers, runtime);
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml check v2 rest
         */
        public async Task<QueryAmlcloudCheckcaseresultResponse> QueryAmlcloudCheckcaseresultAsync(QueryAmlcloudCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAmlcloudCheckcaseresultExAsync(request, headers, runtime);
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml check v2 rest
         */
        public QueryAmlcloudCheckcaseresultResponse QueryAmlcloudCheckcaseresultEx(QueryAmlcloudCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlcloudCheckcaseresultResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
         * Summary: aml check v2 rest
         */
        public async Task<QueryAmlcloudCheckcaseresultResponse> QueryAmlcloudCheckcaseresultExAsync(QueryAmlcloudCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlcloudCheckcaseresultResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 form
         * Summary: aml check v2 form
         */
        public SubmitAmlcloudCheckcaseresultResponse SubmitAmlcloudCheckcaseresult(SubmitAmlcloudCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAmlcloudCheckcaseresultEx(request, headers, runtime);
        }

        /**
         * Description: aml check v2 form
         * Summary: aml check v2 form
         */
        public async Task<SubmitAmlcloudCheckcaseresultResponse> SubmitAmlcloudCheckcaseresultAsync(SubmitAmlcloudCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAmlcloudCheckcaseresultExAsync(request, headers, runtime);
        }

        /**
         * Description: aml check v2 form
         * Summary: aml check v2 form
         */
        public SubmitAmlcloudCheckcaseresultResponse SubmitAmlcloudCheckcaseresultEx(SubmitAmlcloudCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAmlcloudCheckcaseresultResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 form
         * Summary: aml check v2 form
         */
        public async Task<SubmitAmlcloudCheckcaseresultResponse> SubmitAmlcloudCheckcaseresultExAsync(SubmitAmlcloudCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAmlcloudCheckcaseresultResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml analyze v2 rest
         */
        public QueryAmlclouduatAnalyzeResponse QueryAmlclouduatAnalyze(QueryAmlclouduatAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAmlclouduatAnalyzeEx(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml analyze v2 rest
         */
        public async Task<QueryAmlclouduatAnalyzeResponse> QueryAmlclouduatAnalyzeAsync(QueryAmlclouduatAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAmlclouduatAnalyzeExAsync(request, headers, runtime);
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml analyze v2 rest
         */
        public QueryAmlclouduatAnalyzeResponse QueryAmlclouduatAnalyzeEx(QueryAmlclouduatAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlclouduatAnalyzeResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlclouduat.analyze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml analyze v2 rest
         */
        public async Task<QueryAmlclouduatAnalyzeResponse> QueryAmlclouduatAnalyzeExAsync(QueryAmlclouduatAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlclouduatAnalyzeResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlclouduat.analyze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml check v2 rest
         */
        public QueryAmlclouduatCheckcaseresultResponse QueryAmlclouduatCheckcaseresult(QueryAmlclouduatCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAmlclouduatCheckcaseresultEx(request, headers, runtime);
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml check v2 rest
         */
        public async Task<QueryAmlclouduatCheckcaseresultResponse> QueryAmlclouduatCheckcaseresultAsync(QueryAmlclouduatCheckcaseresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAmlclouduatCheckcaseresultExAsync(request, headers, runtime);
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml check v2 rest
         */
        public QueryAmlclouduatCheckcaseresultResponse QueryAmlclouduatCheckcaseresultEx(QueryAmlclouduatCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlclouduatCheckcaseresultResponse>(DoRequest("1.0", "hksecuritytech.gateway.amlclouduat.checkcaseresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
         * Summary: aml check v2 rest
         */
        public async Task<QueryAmlclouduatCheckcaseresultResponse> QueryAmlclouduatCheckcaseresultExAsync(QueryAmlclouduatCheckcaseresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAmlclouduatCheckcaseresultResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.amlclouduat.checkcaseresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public GetAshieldFiletokenResponse GetAshieldFiletoken(GetAshieldFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldFiletokenEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public async Task<GetAshieldFiletokenResponse> GetAshieldFiletokenAsync(GetAshieldFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldFiletokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public GetAshieldFiletokenResponse GetAshieldFiletokenEx(GetAshieldFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldFiletokenResponse>(DoRequest("1.0", "hksecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public async Task<GetAshieldFiletokenResponse> GetAshieldFiletokenExAsync(GetAshieldFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldFiletokenResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public GetAshieldHardeningtaskprocessResponse GetAshieldHardeningtaskprocess(GetAshieldHardeningtaskprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeningtaskprocessEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public async Task<GetAshieldHardeningtaskprocessResponse> GetAshieldHardeningtaskprocessAsync(GetAshieldHardeningtaskprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeningtaskprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public GetAshieldHardeningtaskprocessResponse GetAshieldHardeningtaskprocessEx(GetAshieldHardeningtaskprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningtaskprocessResponse>(DoRequest("1.0", "hksecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public async Task<GetAshieldHardeningtaskprocessResponse> GetAshieldHardeningtaskprocessExAsync(GetAshieldHardeningtaskprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningtaskprocessResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public GetAshieldHardeningresultResponse GetAshieldHardeningresult(GetAshieldHardeningresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeningresultEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public async Task<GetAshieldHardeningresultResponse> GetAshieldHardeningresultAsync(GetAshieldHardeningresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeningresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public GetAshieldHardeningresultResponse GetAshieldHardeningresultEx(GetAshieldHardeningresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningresultResponse>(DoRequest("1.0", "hksecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public async Task<GetAshieldHardeningresultResponse> GetAshieldHardeningresultExAsync(GetAshieldHardeningresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningresultResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public GetAshieldHardeninglogResponse GetAshieldHardeninglog(GetAshieldHardeninglogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeninglogEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public async Task<GetAshieldHardeninglogResponse> GetAshieldHardeninglogAsync(GetAshieldHardeninglogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeninglogExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public GetAshieldHardeninglogResponse GetAshieldHardeninglogEx(GetAshieldHardeninglogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeninglogResponse>(DoRequest("1.0", "hksecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public async Task<GetAshieldHardeninglogResponse> GetAshieldHardeninglogExAsync(GetAshieldHardeninglogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeninglogResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public QueryDeviceriskRisklabelResponse QueryDeviceriskRisklabel(QueryDeviceriskRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskRisklabelEx(request, headers, runtime);
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public async Task<QueryDeviceriskRisklabelResponse> QueryDeviceriskRisklabelAsync(QueryDeviceriskRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskRisklabelExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public QueryDeviceriskRisklabelResponse QueryDeviceriskRisklabelEx(QueryDeviceriskRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskRisklabelResponse>(DoRequest("1.0", "hksecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public async Task<QueryDeviceriskRisklabelResponse> QueryDeviceriskRisklabelExAsync(QueryDeviceriskRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskRisklabelResponse>(await DoRequestAsync("1.0", "hksecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
