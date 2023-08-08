// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SECURITYTECH.Models;

namespace AntChain.SDK.SECURITYTECH
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
                        {"sdk_version", "1.1.12"},
                        {"_prod_code", "SECURITYTECH"},
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
                        {"sdk_version", "1.1.12"},
                        {"_prod_code", "SECURITYTECH"},
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
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public RunGeneralResponse RunGeneral(RunGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunGeneralEx(request, headers, runtime);
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public async Task<RunGeneralResponse> RunGeneralAsync(RunGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunGeneralExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public RunGeneralResponse RunGeneralEx(RunGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunGeneralResponse>(DoRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public async Task<RunGeneralResponse> RunGeneralExAsync(RunGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunGeneralResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public ExecEkytInsureResponse ExecEkytInsure(ExecEkytInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecEkytInsureEx(request, headers, runtime);
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public async Task<ExecEkytInsureResponse> ExecEkytInsureAsync(ExecEkytInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecEkytInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public ExecEkytInsureResponse ExecEkytInsureEx(ExecEkytInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEkytInsureResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public async Task<ExecEkytInsureResponse> ExecEkytInsureExAsync(ExecEkytInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEkytInsureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBssecpicResponse CreateBssecpic(CreateBssecpicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBssecpicEx(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBssecpicResponse> CreateBssecpicAsync(CreateBssecpicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBssecpicExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBssecpicResponse CreateBssecpicEx(CreateBssecpicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBssecpicResponse>(DoRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBssecpicResponse> CreateBssecpicExAsync(CreateBssecpicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBssecpicResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(DoRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBlueshieldSecuritypictureResponse> CreateBlueshieldSecuritypictureExAsync(CreateBlueshieldSecuritypictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(DoRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public async Task<QueryFaceshieldNativeResponse> QueryFaceshieldNativeExAsync(QueryFaceshieldNativeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(DoRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public async Task<QueryFaceshieldWebResponse> QueryFaceshieldWebExAsync(QueryFaceshieldWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public InitIifaaDeviceResponse InitIifaaDevice(InitIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public async Task<InitIifaaDeviceResponse> InitIifaaDeviceAsync(InitIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public InitIifaaDeviceResponse InitIifaaDeviceEx(InitIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public async Task<InitIifaaDeviceResponse> InitIifaaDeviceExAsync(InitIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public RecognizeIifaaDeviceResponse RecognizeIifaaDevice(RecognizeIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public async Task<RecognizeIifaaDeviceResponse> RecognizeIifaaDeviceAsync(RecognizeIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public RecognizeIifaaDeviceResponse RecognizeIifaaDeviceEx(RecognizeIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public async Task<RecognizeIifaaDeviceResponse> RecognizeIifaaDeviceExAsync(RecognizeIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public VerifyIifaaDeviceResponse VerifyIifaaDevice(VerifyIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public async Task<VerifyIifaaDeviceResponse> VerifyIifaaDeviceAsync(VerifyIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public VerifyIifaaDeviceResponse VerifyIifaaDeviceEx(VerifyIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public async Task<VerifyIifaaDeviceResponse> VerifyIifaaDeviceExAsync(VerifyIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public RegisterIifaaCorpResponse RegisterIifaaCorp(RegisterIifaaCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterIifaaCorpEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public async Task<RegisterIifaaCorpResponse> RegisterIifaaCorpAsync(RegisterIifaaCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterIifaaCorpExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public RegisterIifaaCorpResponse RegisterIifaaCorpEx(RegisterIifaaCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIifaaCorpResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public async Task<RegisterIifaaCorpResponse> RegisterIifaaCorpExAsync(RegisterIifaaCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIifaaCorpResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public DeprecateIifaaDeviceResponse DeprecateIifaaDevice(DeprecateIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeprecateIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public async Task<DeprecateIifaaDeviceResponse> DeprecateIifaaDeviceAsync(DeprecateIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeprecateIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public DeprecateIifaaDeviceResponse DeprecateIifaaDeviceEx(DeprecateIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public async Task<DeprecateIifaaDeviceResponse> DeprecateIifaaDeviceExAsync(DeprecateIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public RunXhunterSpiResponse RunXhunterSpi(RunXhunterSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunXhunterSpiEx(request, headers, runtime);
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public async Task<RunXhunterSpiResponse> RunXhunterSpiAsync(RunXhunterSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunXhunterSpiExAsync(request, headers, runtime);
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public RunXhunterSpiResponse RunXhunterSpiEx(RunXhunterSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunXhunterSpiResponse>(DoRequest("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public async Task<RunXhunterSpiResponse> RunXhunterSpiExAsync(RunXhunterSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunXhunterSpiResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public ExecIifaaInsureResponse ExecIifaaInsure(ExecIifaaInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecIifaaInsureEx(request, headers, runtime);
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public async Task<ExecIifaaInsureResponse> ExecIifaaInsureAsync(ExecIifaaInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecIifaaInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public ExecIifaaInsureResponse ExecIifaaInsureEx(ExecIifaaInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIifaaInsureResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public async Task<ExecIifaaInsureResponse> ExecIifaaInsureExAsync(ExecIifaaInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIifaaInsureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public QueryCctPictureResponse QueryCctPicture(QueryCctPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCctPictureEx(request, headers, runtime);
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public async Task<QueryCctPictureResponse> QueryCctPictureAsync(QueryCctPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCctPictureExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public QueryCctPictureResponse QueryCctPictureEx(QueryCctPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCctPictureResponse>(DoRequest("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public async Task<QueryCctPictureResponse> QueryCctPictureExAsync(QueryCctPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCctPictureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public RecognizeCctAnalyzeResponse RecognizeCctAnalyze(RecognizeCctAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeCctAnalyzeEx(request, headers, runtime);
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public async Task<RecognizeCctAnalyzeResponse> RecognizeCctAnalyzeAsync(RecognizeCctAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeCctAnalyzeExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public RecognizeCctAnalyzeResponse RecognizeCctAnalyzeEx(RecognizeCctAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeCctAnalyzeResponse>(DoRequest("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public async Task<RecognizeCctAnalyzeResponse> RecognizeCctAnalyzeExAsync(RecognizeCctAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeCctAnalyzeResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
