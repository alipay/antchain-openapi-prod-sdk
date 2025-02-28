// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BCCR.Models;

namespace AntChain.SDK.BCCR
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
                        {"sdk_version", "1.19.41"},
                        {"_prod_code", "BCCR"},
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
                        {"sdk_version", "1.19.41"},
                        {"_prod_code", "BCCR"},
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
         * Description: 调用接口获取版权开放平台授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public GetUploadurlResponse GetUploadurl(GetUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 调用接口获取版权开放平台授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public async Task<GetUploadurlResponse> GetUploadurlAsync(GetUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用接口获取版权开放平台授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public GetUploadurlResponse GetUploadurlEx(GetUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadurlResponse>(DoRequest("1.0", "blockchain.bccr.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用接口获取版权开放平台授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public async Task<GetUploadurlResponse> GetUploadurlExAsync(GetUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权开发平台hash登记
         * Summary: 新增HASH版权登记
         */
        public AddHashregisterResponse AddHashregister(AddHashregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddHashregisterEx(request, headers, runtime);
        }

        /**
         * Description: 版权开发平台hash登记
         * Summary: 新增HASH版权登记
         */
        public async Task<AddHashregisterResponse> AddHashregisterAsync(AddHashregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddHashregisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权开发平台hash登记
         * Summary: 新增HASH版权登记
         */
        public AddHashregisterResponse AddHashregisterEx(AddHashregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddHashregisterResponse>(DoRequest("1.0", "blockchain.bccr.hashregister.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权开发平台hash登记
         * Summary: 新增HASH版权登记
         */
        public async Task<AddHashregisterResponse> AddHashregisterExAsync(AddHashregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddHashregisterResponse>(await DoRequestAsync("1.0", "blockchain.bccr.hashregister.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台新增版权登记
         * Summary: 新增版权登记
         */
        public AddRegisterResponse AddRegister(AddRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddRegisterEx(request, headers, runtime);
        }

        /**
         * Description: 版权平台新增版权登记
         * Summary: 新增版权登记
         */
        public async Task<AddRegisterResponse> AddRegisterAsync(AddRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddRegisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权平台新增版权登记
         * Summary: 新增版权登记
         */
        public AddRegisterResponse AddRegisterEx(AddRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRegisterResponse>(DoRequest("1.0", "blockchain.bccr.register.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台新增版权登记
         * Summary: 新增版权登记
         */
        public async Task<AddRegisterResponse> AddRegisterExAsync(AddRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRegisterResponse>(await DoRequestAsync("1.0", "blockchain.bccr.register.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台查询版权登记状态
         * Summary: 查询版权登记状态
         */
        public QueryRegisterstatusResponse QueryRegisterstatus(QueryRegisterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRegisterstatusEx(request, headers, runtime);
        }

        /**
         * Description: 版权平台查询版权登记状态
         * Summary: 查询版权登记状态
         */
        public async Task<QueryRegisterstatusResponse> QueryRegisterstatusAsync(QueryRegisterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRegisterstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权平台查询版权登记状态
         * Summary: 查询版权登记状态
         */
        public QueryRegisterstatusResponse QueryRegisterstatusEx(QueryRegisterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRegisterstatusResponse>(DoRequest("1.0", "blockchain.bccr.registerstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台查询版权登记状态
         * Summary: 查询版权登记状态
         */
        public async Task<QueryRegisterstatusResponse> QueryRegisterstatusExAsync(QueryRegisterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRegisterstatusResponse>(await DoRequestAsync("1.0", "blockchain.bccr.registerstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台生成版权登记证书
         * Summary: 生成版权登记证书
         */
        public CreateCertificateResponse CreateCertificate(CreateCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 版权平台生成版权登记证书
         * Summary: 生成版权登记证书
         */
        public async Task<CreateCertificateResponse> CreateCertificateAsync(CreateCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权平台生成版权登记证书
         * Summary: 生成版权登记证书
         */
        public CreateCertificateResponse CreateCertificateEx(CreateCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCertificateResponse>(DoRequest("1.0", "blockchain.bccr.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台生成版权登记证书
         * Summary: 生成版权登记证书
         */
        public async Task<CreateCertificateResponse> CreateCertificateExAsync(CreateCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCertificateResponse>(await DoRequestAsync("1.0", "blockchain.bccr.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台获取版权登记证书
         * Summary: 获取版权登记证书
         */
        public GetCertificateResponse GetCertificate(GetCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 版权平台获取版权登记证书
         * Summary: 获取版权登记证书
         */
        public async Task<GetCertificateResponse> GetCertificateAsync(GetCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权平台获取版权登记证书
         * Summary: 获取版权登记证书
         */
        public GetCertificateResponse GetCertificateEx(GetCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCertificateResponse>(DoRequest("1.0", "blockchain.bccr.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台获取版权登记证书
         * Summary: 获取版权登记证书
         */
        public async Task<GetCertificateResponse> GetCertificateExAsync(GetCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCertificateResponse>(await DoRequestAsync("1.0", "blockchain.bccr.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增版权监测任务
         * Summary: 新增版权监测
         */
        public CreateMonitorTaskResponse CreateMonitorTask(CreateMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMonitorTaskEx(request, headers, runtime);
        }

        /**
         * Description: 新增版权监测任务
         * Summary: 新增版权监测
         */
        public async Task<CreateMonitorTaskResponse> CreateMonitorTaskAsync(CreateMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMonitorTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增版权监测任务
         * Summary: 新增版权监测
         */
        public CreateMonitorTaskResponse CreateMonitorTaskEx(CreateMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMonitorTaskResponse>(DoRequest("1.0", "blockchain.bccr.monitor.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增版权监测任务
         * Summary: 新增版权监测
         */
        public async Task<CreateMonitorTaskResponse> CreateMonitorTaskExAsync(CreateMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMonitorTaskResponse>(await DoRequestAsync("1.0", "blockchain.bccr.monitor.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止版权监测任务
         * Summary: 停止版权监测
         */
        public StopMonitorTaskResponse StopMonitorTask(StopMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopMonitorTaskEx(request, headers, runtime);
        }

        /**
         * Description: 停止版权监测任务
         * Summary: 停止版权监测
         */
        public async Task<StopMonitorTaskResponse> StopMonitorTaskAsync(StopMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopMonitorTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止版权监测任务
         * Summary: 停止版权监测
         */
        public StopMonitorTaskResponse StopMonitorTaskEx(StopMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopMonitorTaskResponse>(DoRequest("1.0", "blockchain.bccr.monitor.task.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止版权监测任务
         * Summary: 停止版权监测
         */
        public async Task<StopMonitorTaskResponse> StopMonitorTaskExAsync(StopMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopMonitorTaskResponse>(await DoRequestAsync("1.0", "blockchain.bccr.monitor.task.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权监测任务
         * Summary: 查询版权监测
         */
        public QueryMonitorTaskResponse QueryMonitorTask(QueryMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMonitorTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询版权监测任务
         * Summary: 查询版权监测
         */
        public async Task<QueryMonitorTaskResponse> QueryMonitorTaskAsync(QueryMonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMonitorTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询版权监测任务
         * Summary: 查询版权监测
         */
        public QueryMonitorTaskResponse QueryMonitorTaskEx(QueryMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorTaskResponse>(DoRequest("1.0", "blockchain.bccr.monitor.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权监测任务
         * Summary: 查询版权监测
         */
        public async Task<QueryMonitorTaskResponse> QueryMonitorTaskExAsync(QueryMonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorTaskResponse>(await DoRequestAsync("1.0", "blockchain.bccr.monitor.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权任务监测结果
         * Summary: 查询版权监测结果
         */
        public QueryMonitorResultResponse QueryMonitorResult(QueryMonitorResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMonitorResultEx(request, headers, runtime);
        }

        /**
         * Description: 查询版权任务监测结果
         * Summary: 查询版权监测结果
         */
        public async Task<QueryMonitorResultResponse> QueryMonitorResultAsync(QueryMonitorResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMonitorResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询版权任务监测结果
         * Summary: 查询版权监测结果
         */
        public QueryMonitorResultResponse QueryMonitorResultEx(QueryMonitorResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorResultResponse>(DoRequest("1.0", "blockchain.bccr.monitor.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权任务监测结果
         * Summary: 查询版权监测结果
         */
        public async Task<QueryMonitorResultResponse> QueryMonitorResultExAsync(QueryMonitorResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorResultResponse>(await DoRequestAsync("1.0", "blockchain.bccr.monitor.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取传播监测能力服务商列表
         * Summary: 获取传播监测能力服务商列表
         */
        public ListMonitorProviderResponse ListMonitorProvider(ListMonitorProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMonitorProviderEx(request, headers, runtime);
        }

        /**
         * Description: 获取传播监测能力服务商列表
         * Summary: 获取传播监测能力服务商列表
         */
        public async Task<ListMonitorProviderResponse> ListMonitorProviderAsync(ListMonitorProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMonitorProviderExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取传播监测能力服务商列表
         * Summary: 获取传播监测能力服务商列表
         */
        public ListMonitorProviderResponse ListMonitorProviderEx(ListMonitorProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMonitorProviderResponse>(DoRequest("1.0", "blockchain.bccr.monitor.provider.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取传播监测能力服务商列表
         * Summary: 获取传播监测能力服务商列表
         */
        public async Task<ListMonitorProviderResponse> ListMonitorProviderExAsync(ListMonitorProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMonitorProviderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.monitor.provider.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证(废弃)
         * Summary: 创建录屏取证(废弃)
         */
        public CreateRecodescreenResponse CreateRecodescreen(CreateRecodescreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRecodescreenEx(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证(废弃)
         * Summary: 创建录屏取证(废弃)
         */
        public async Task<CreateRecodescreenResponse> CreateRecodescreenAsync(CreateRecodescreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRecodescreenExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证(废弃)
         * Summary: 创建录屏取证(废弃)
         */
        public CreateRecodescreenResponse CreateRecodescreenEx(CreateRecodescreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecodescreenResponse>(DoRequest("1.0", "blockchain.bccr.recodescreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证(废弃)
         * Summary: 创建录屏取证(废弃)
         */
        public async Task<CreateRecodescreenResponse> CreateRecodescreenExAsync(CreateRecodescreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecodescreenResponse>(await DoRequestAsync("1.0", "blockchain.bccr.recodescreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询录屏取证(废弃)
         * Summary: 查询录屏取证(废弃)
         */
        public QueryRecodescreenResponse QueryRecodescreen(QueryRecodescreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRecodescreenEx(request, headers, runtime);
        }

        /**
         * Description: 查询录屏取证(废弃)
         * Summary: 查询录屏取证(废弃)
         */
        public async Task<QueryRecodescreenResponse> QueryRecodescreenAsync(QueryRecodescreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRecodescreenExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询录屏取证(废弃)
         * Summary: 查询录屏取证(废弃)
         */
        public QueryRecodescreenResponse QueryRecodescreenEx(QueryRecodescreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRecodescreenResponse>(DoRequest("1.0", "blockchain.bccr.recodescreen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询录屏取证(废弃)
         * Summary: 查询录屏取证(废弃)
         */
        public async Task<QueryRecodescreenResponse> QueryRecodescreenExAsync(QueryRecodescreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRecodescreenResponse>(await DoRequestAsync("1.0", "blockchain.bccr.recodescreen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户信息查询
         * Summary: 用户信息查询
         */
        public QueryUserResponse QueryUser(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserEx(request, headers, runtime);
        }

        /**
         * Description: 用户信息查询
         * Summary: 用户信息查询
         */
        public async Task<QueryUserResponse> QueryUserAsync(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户信息查询
         * Summary: 用户信息查询
         */
        public QueryUserResponse QueryUserEx(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(DoRequest("1.0", "blockchain.bccr.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户信息查询
         * Summary: 用户信息查询
         */
        public async Task<QueryUserResponse> QueryUserExAsync(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(await DoRequestAsync("1.0", "blockchain.bccr.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public QueryUserListResponse QueryUserList(QueryUserListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserListEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public async Task<QueryUserListResponse> QueryUserListAsync(QueryUserListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserListExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public QueryUserListResponse QueryUserListEx(QueryUserListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserListResponse>(DoRequest("1.0", "blockchain.bccr.user.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public async Task<QueryUserListResponse> QueryUserListExAsync(QueryUserListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserListResponse>(await DoRequestAsync("1.0", "blockchain.bccr.user.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页取证
         * Summary: 创建网页取证
         */
        public CreateScreenshotResponse CreateScreenshot(CreateScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateScreenshotEx(request, headers, runtime);
        }

        /**
         * Description: 创建网页取证
         * Summary: 创建网页取证
         */
        public async Task<CreateScreenshotResponse> CreateScreenshotAsync(CreateScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateScreenshotExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建网页取证
         * Summary: 创建网页取证
         */
        public CreateScreenshotResponse CreateScreenshotEx(CreateScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateScreenshotResponse>(DoRequest("1.0", "blockchain.bccr.screenshot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页取证
         * Summary: 创建网页取证
         */
        public async Task<CreateScreenshotResponse> CreateScreenshotExAsync(CreateScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateScreenshotResponse>(await DoRequestAsync("1.0", "blockchain.bccr.screenshot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询网页取证
         * Summary: 查询网页取证
         */
        public QueryScreenshotResponse QueryScreenshot(QueryScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryScreenshotEx(request, headers, runtime);
        }

        /**
         * Description: 查询网页取证
         * Summary: 查询网页取证
         */
        public async Task<QueryScreenshotResponse> QueryScreenshotAsync(QueryScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryScreenshotExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询网页取证
         * Summary: 查询网页取证
         */
        public QueryScreenshotResponse QueryScreenshotEx(QueryScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryScreenshotResponse>(DoRequest("1.0", "blockchain.bccr.screenshot.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询网页取证
         * Summary: 查询网页取证
         */
        public async Task<QueryScreenshotResponse> QueryScreenshotExAsync(QueryScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryScreenshotResponse>(await DoRequestAsync("1.0", "blockchain.bccr.screenshot.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上核验
         * Summary: 链上核验
         */
        public VerifyBlockchainResponse VerifyBlockchain(VerifyBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyBlockchainEx(request, headers, runtime);
        }

        /**
         * Description: 链上核验
         * Summary: 链上核验
         */
        public async Task<VerifyBlockchainResponse> VerifyBlockchainAsync(VerifyBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyBlockchainExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上核验
         * Summary: 链上核验
         */
        public VerifyBlockchainResponse VerifyBlockchainEx(VerifyBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBlockchainResponse>(DoRequest("1.0", "blockchain.bccr.blockchain.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上核验
         * Summary: 链上核验
         */
        public async Task<VerifyBlockchainResponse> VerifyBlockchainExAsync(VerifyBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBlockchainResponse>(await DoRequestAsync("1.0", "blockchain.bccr.blockchain.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public CreateRecordscreenResponse CreateRecordscreen(CreateRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRecordscreenEx(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public async Task<CreateRecordscreenResponse> CreateRecordscreenAsync(CreateRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRecordscreenExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public CreateRecordscreenResponse CreateRecordscreenEx(CreateRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecordscreenResponse>(DoRequest("1.0", "blockchain.bccr.recordscreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public async Task<CreateRecordscreenResponse> CreateRecordscreenExAsync(CreateRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecordscreenResponse>(await DoRequestAsync("1.0", "blockchain.bccr.recordscreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询录屏取证
         * Summary: 查询录屏取证
         */
        public QueryRecordscreenResponse QueryRecordscreen(QueryRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRecordscreenEx(request, headers, runtime);
        }

        /**
         * Description: 查询录屏取证
         * Summary: 查询录屏取证
         */
        public async Task<QueryRecordscreenResponse> QueryRecordscreenAsync(QueryRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRecordscreenExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询录屏取证
         * Summary: 查询录屏取证
         */
        public QueryRecordscreenResponse QueryRecordscreenEx(QueryRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRecordscreenResponse>(DoRequest("1.0", "blockchain.bccr.recordscreen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询录屏取证
         * Summary: 查询录屏取证
         */
        public async Task<QueryRecordscreenResponse> QueryRecordscreenExAsync(QueryRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRecordscreenResponse>(await DoRequestAsync("1.0", "blockchain.bccr.recordscreen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取支持的公证处列表
         * Summary: 获取支持的公证处列表
         */
        public ListNotaryResponse ListNotary(ListNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListNotaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取支持的公证处列表
         * Summary: 获取支持的公证处列表
         */
        public async Task<ListNotaryResponse> ListNotaryAsync(ListNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListNotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取支持的公证处列表
         * Summary: 获取支持的公证处列表
         */
        public ListNotaryResponse ListNotaryEx(ListNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListNotaryResponse>(DoRequest("1.0", "blockchain.bccr.notary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取支持的公证处列表
         * Summary: 获取支持的公证处列表
         */
        public async Task<ListNotaryResponse> ListNotaryExAsync(ListNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListNotaryResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增版权定向监测任务
         * Summary: 新增版权定向监测
         */
        public CreateDirectmonitorTaskResponse CreateDirectmonitorTask(CreateDirectmonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDirectmonitorTaskEx(request, headers, runtime);
        }

        /**
         * Description: 新增版权定向监测任务
         * Summary: 新增版权定向监测
         */
        public async Task<CreateDirectmonitorTaskResponse> CreateDirectmonitorTaskAsync(CreateDirectmonitorTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDirectmonitorTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增版权定向监测任务
         * Summary: 新增版权定向监测
         */
        public CreateDirectmonitorTaskResponse CreateDirectmonitorTaskEx(CreateDirectmonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDirectmonitorTaskResponse>(DoRequest("1.0", "blockchain.bccr.directmonitor.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增版权定向监测任务
         * Summary: 新增版权定向监测
         */
        public async Task<CreateDirectmonitorTaskResponse> CreateDirectmonitorTaskExAsync(CreateDirectmonitorTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDirectmonitorTaskResponse>(await DoRequestAsync("1.0", "blockchain.bccr.directmonitor.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权定向监测结果
         * Summary: 查询版权定向监测结果
         */
        public QueryDirectmonitorResultResponse QueryDirectmonitorResult(QueryDirectmonitorResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDirectmonitorResultEx(request, headers, runtime);
        }

        /**
         * Description: 查询版权定向监测结果
         * Summary: 查询版权定向监测结果
         */
        public async Task<QueryDirectmonitorResultResponse> QueryDirectmonitorResultAsync(QueryDirectmonitorResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDirectmonitorResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询版权定向监测结果
         * Summary: 查询版权定向监测结果
         */
        public QueryDirectmonitorResultResponse QueryDirectmonitorResultEx(QueryDirectmonitorResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDirectmonitorResultResponse>(DoRequest("1.0", "blockchain.bccr.directmonitor.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版权定向监测结果
         * Summary: 查询版权定向监测结果
         */
        public async Task<QueryDirectmonitorResultResponse> QueryDirectmonitorResultExAsync(QueryDirectmonitorResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDirectmonitorResultResponse>(await DoRequestAsync("1.0", "blockchain.bccr.directmonitor.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DCI预登记
         * Summary: dci预登记
         */
        public CreateDciPreregistrationResponse CreateDciPreregistration(CreateDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDciPreregistrationEx(request, headers, runtime);
        }

        /**
         * Description: DCI预登记
         * Summary: dci预登记
         */
        public async Task<CreateDciPreregistrationResponse> CreateDciPreregistrationAsync(CreateDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDciPreregistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: DCI预登记
         * Summary: dci预登记
         */
        public CreateDciPreregistrationResponse CreateDciPreregistrationEx(CreateDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciPreregistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.preregistration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DCI预登记
         * Summary: dci预登记
         */
        public async Task<CreateDciPreregistrationResponse> CreateDciPreregistrationExAsync(CreateDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciPreregistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.preregistration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询dci预登记信息
         * Summary: 查询dci预登记信息
         */
        public QueryDciPreregistrationResponse QueryDciPreregistration(QueryDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciPreregistrationEx(request, headers, runtime);
        }

        /**
         * Description: 查询dci预登记信息
         * Summary: 查询dci预登记信息
         */
        public async Task<QueryDciPreregistrationResponse> QueryDciPreregistrationAsync(QueryDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciPreregistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询dci预登记信息
         * Summary: 查询dci预登记信息
         */
        public QueryDciPreregistrationResponse QueryDciPreregistrationEx(QueryDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreregistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.preregistration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询dci预登记信息
         * Summary: 查询dci预登记信息
         */
        public async Task<QueryDciPreregistrationResponse> QueryDciPreregistrationExAsync(QueryDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreregistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.preregistration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册dci账号
         * Summary: 注册dci账号
         */
        public AddDciUserResponse AddDciUser(AddDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDciUserEx(request, headers, runtime);
        }

        /**
         * Description: 注册dci账号
         * Summary: 注册dci账号
         */
        public async Task<AddDciUserResponse> AddDciUserAsync(AddDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDciUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册dci账号
         * Summary: 注册dci账号
         */
        public AddDciUserResponse AddDciUserEx(AddDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDciUserResponse>(DoRequest("1.0", "blockchain.bccr.dci.user.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册dci账号
         * Summary: 注册dci账号
         */
        public async Task<AddDciUserResponse> AddDciUserExAsync(AddDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDciUserResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.user.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dci预登记再确认
         * Summary: dci预登记再确认
         */
        public RetryDciPreregistrationResponse RetryDciPreregistration(RetryDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryDciPreregistrationEx(request, headers, runtime);
        }

        /**
         * Description: dci预登记再确认
         * Summary: dci预登记再确认
         */
        public async Task<RetryDciPreregistrationResponse> RetryDciPreregistrationAsync(RetryDciPreregistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryDciPreregistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: dci预登记再确认
         * Summary: dci预登记再确认
         */
        public RetryDciPreregistrationResponse RetryDciPreregistrationEx(RetryDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDciPreregistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.preregistration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dci预登记再确认
         * Summary: dci预登记再确认
         */
        public async Task<RetryDciPreregistrationResponse> RetryDciPreregistrationExAsync(RetryDciPreregistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDciPreregistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.preregistration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询dci账号信息
         * Summary: 查询dci账号信息
         */
        public QueryDciUserResponse QueryDciUser(QueryDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询dci账号信息
         * Summary: 查询dci账号信息
         */
        public async Task<QueryDciUserResponse> QueryDciUserAsync(QueryDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询dci账号信息
         * Summary: 查询dci账号信息
         */
        public QueryDciUserResponse QueryDciUserEx(QueryDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciUserResponse>(DoRequest("1.0", "blockchain.bccr.dci.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询dci账号信息
         * Summary: 查询dci账号信息
         */
        public async Task<QueryDciUserResponse> QueryDciUserExAsync(QueryDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciUserResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Dci预登记公示地址查询
         * Summary: Dci预登记公示地址查询
         */
        public QueryDciPreregpublicationResponse QueryDciPreregpublication(QueryDciPreregpublicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciPreregpublicationEx(request, headers, runtime);
        }

        /**
         * Description: Dci预登记公示地址查询
         * Summary: Dci预登记公示地址查询
         */
        public async Task<QueryDciPreregpublicationResponse> QueryDciPreregpublicationAsync(QueryDciPreregpublicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciPreregpublicationExAsync(request, headers, runtime);
        }

        /**
         * Description: Dci预登记公示地址查询
         * Summary: Dci预登记公示地址查询
         */
        public QueryDciPreregpublicationResponse QueryDciPreregpublicationEx(QueryDciPreregpublicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreregpublicationResponse>(DoRequest("1.0", "blockchain.bccr.dci.preregpublication.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Dci预登记公示地址查询
         * Summary: Dci预登记公示地址查询
         */
        public async Task<QueryDciPreregpublicationResponse> QueryDciPreregpublicationExAsync(QueryDciPreregpublicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreregpublicationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.preregpublication.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新dci账号信息
         * Summary: 更新dci账号信息
         */
        public UpdateDciUserResponse UpdateDciUser(UpdateDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDciUserEx(request, headers, runtime);
        }

        /**
         * Description: 更新dci账号信息
         * Summary: 更新dci账号信息
         */
        public async Task<UpdateDciUserResponse> UpdateDciUserAsync(UpdateDciUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDciUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新dci账号信息
         * Summary: 更新dci账号信息
         */
        public UpdateDciUserResponse UpdateDciUserEx(UpdateDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDciUserResponse>(DoRequest("1.0", "blockchain.bccr.dci.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新dci账号信息
         * Summary: 更新dci账号信息
         */
        public async Task<UpdateDciUserResponse> UpdateDciUserExAsync(UpdateDciUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDciUserResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public CreateDciRegistrationResponse CreateDciRegistration(CreateDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public async Task<CreateDciRegistrationResponse> CreateDciRegistrationAsync(CreateDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public CreateDciRegistrationResponse CreateDciRegistrationEx(CreateDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起数登申请
         * Summary: 发起数登申请
         */
        public async Task<CreateDciRegistrationResponse> CreateDciRegistrationExAsync(CreateDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryDciRegistrationsubmitResponse QueryDciRegistrationsubmit(QueryDciRegistrationsubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciRegistrationsubmitEx(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryDciRegistrationsubmitResponse> QueryDciRegistrationsubmitAsync(QueryDciRegistrationsubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciRegistrationsubmitExAsync(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryDciRegistrationsubmitResponse QueryDciRegistrationsubmitEx(QueryDciRegistrationsubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationsubmitResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryDciRegistrationsubmitResponse> QueryDciRegistrationsubmitExAsync(QueryDciRegistrationsubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationsubmitResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public QueryDciRegistrationResponse QueryDciRegistration(QueryDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public async Task<QueryDciRegistrationResponse> QueryDciRegistrationAsync(QueryDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public QueryDciRegistrationResponse QueryDciRegistrationEx(QueryDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登结果
         * Summary: 查询数登结果
         */
        public async Task<QueryDciRegistrationResponse> QueryDciRegistrationExAsync(QueryDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public GetDciRegistrationcertResponse GetDciRegistrationcert(GetDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public async Task<GetDciRegistrationcertResponse> GetDciRegistrationcertAsync(GetDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public GetDciRegistrationcertResponse GetDciRegistrationcertEx(GetDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数登证书下载链接
         * Summary: 获取数登证书下载链接
         */
        public async Task<GetDciRegistrationcertResponse> GetDciRegistrationcertExAsync(GetDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容安全审核详情
         * Summary: 查询内容安全审核详情
         */
        public QueryDciContentsecurityResponse QueryDciContentsecurity(QueryDciContentsecurityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciContentsecurityEx(request, headers, runtime);
        }

        /**
         * Description: 查询内容安全审核详情
         * Summary: 查询内容安全审核详情
         */
        public async Task<QueryDciContentsecurityResponse> QueryDciContentsecurityAsync(QueryDciContentsecurityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciContentsecurityExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询内容安全审核详情
         * Summary: 查询内容安全审核详情
         */
        public QueryDciContentsecurityResponse QueryDciContentsecurityEx(QueryDciContentsecurityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciContentsecurityResponse>(DoRequest("1.0", "blockchain.bccr.dci.contentsecurity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容安全审核详情
         * Summary: 查询内容安全审核详情
         */
        public async Task<QueryDciContentsecurityResponse> QueryDciContentsecurityExAsync(QueryDciContentsecurityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciContentsecurityResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.contentsecurity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public CreateDciRegistrationcertResponse CreateDciRegistrationcert(CreateDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public async Task<CreateDciRegistrationcertResponse> CreateDciRegistrationcertAsync(CreateDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public CreateDciRegistrationcertResponse CreateDciRegistrationcertEx(CreateDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字登记证书
         * Summary: 创建数字登记证书
         */
        public async Task<CreateDciRegistrationcertResponse> CreateDciRegistrationcertExAsync(CreateDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryDciRegistrationcertResponse QueryDciRegistrationcert(QueryDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryDciRegistrationcertResponse> QueryDciRegistrationcertAsync(QueryDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public QueryDciRegistrationcertResponse QueryDciRegistrationcertEx(QueryDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已废弃接口
         * Summary: 已废弃接口
         */
        public async Task<QueryDciRegistrationcertResponse> QueryDciRegistrationcertExAsync(QueryDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public GetDciPayurlResponse GetDciPayurl(GetDciPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDciPayurlEx(request, headers, runtime);
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public async Task<GetDciPayurlResponse> GetDciPayurlAsync(GetDciPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDciPayurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public GetDciPayurlResponse GetDciPayurlEx(GetDciPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDciPayurlResponse>(DoRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起支付，获取支付链接
         * Summary: 数登支付-发起支付
         */
        public async Task<GetDciPayurlResponse> GetDciPayurlExAsync(GetDciPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDciPayurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public QueryDciPayResponse QueryDciPay(QueryDciPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciPayEx(request, headers, runtime);
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public async Task<QueryDciPayResponse> QueryDciPayAsync(QueryDciPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public QueryDciPayResponse QueryDciPayEx(QueryDciPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPayResponse>(DoRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数登支付结果
         * Summary: 查询数登支付结果
         */
        public async Task<QueryDciPayResponse> QueryDciPayExAsync(QueryDciPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPayResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public CallbackDciPayresultResponse CallbackDciPayresult(CallbackDciPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackDciPayresultEx(request, headers, runtime);
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public async Task<CallbackDciPayresultResponse> CallbackDciPayresultAsync(CallbackDciPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackDciPayresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public CallbackDciPayresultResponse CallbackDciPayresultEx(CallbackDciPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackDciPayresultResponse>(DoRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付结果回调
         * Summary: 数登支付-支付结果回调
         */
        public async Task<CallbackDciPayresultResponse> CallbackDciPayresultExAsync(CallbackDciPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackDciPayresultResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public RefuseDciRegistrationResponse RefuseDciRegistration(RefuseDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public async Task<RefuseDciRegistrationResponse> RefuseDciRegistrationAsync(RefuseDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public RefuseDciRegistrationResponse RefuseDciRegistrationEx(RefuseDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登审核失败结果回调
         * Summary: 数登审核失败结果回调
         */
        public async Task<RefuseDciRegistrationResponse> RefuseDciRegistrationExAsync(RefuseDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台获取申办事由配置
         * Summary: 获取申办事由配置
         */
        public QueryNotaryBidreasonResponse QueryNotaryBidreason(QueryNotaryBidreasonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotaryBidreasonEx(request, headers, runtime);
        }

        /**
         * Description: 版权平台获取申办事由配置
         * Summary: 获取申办事由配置
         */
        public async Task<QueryNotaryBidreasonResponse> QueryNotaryBidreasonAsync(QueryNotaryBidreasonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotaryBidreasonExAsync(request, headers, runtime);
        }

        /**
         * Description: 版权平台获取申办事由配置
         * Summary: 获取申办事由配置
         */
        public QueryNotaryBidreasonResponse QueryNotaryBidreasonEx(QueryNotaryBidreasonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryBidreasonResponse>(DoRequest("1.0", "blockchain.bccr.notary.bidreason.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版权平台获取申办事由配置
         * Summary: 获取申办事由配置
         */
        public async Task<QueryNotaryBidreasonResponse> QueryNotaryBidreasonExAsync(QueryNotaryBidreasonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryBidreasonResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.bidreason.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取签署文件
         * Summary: 获取签署文件
         */
        public QueryNotaryDocumenttosignResponse QueryNotaryDocumenttosign(QueryNotaryDocumenttosignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotaryDocumenttosignEx(request, headers, runtime);
        }

        /**
         * Description: 获取签署文件
         * Summary: 获取签署文件
         */
        public async Task<QueryNotaryDocumenttosignResponse> QueryNotaryDocumenttosignAsync(QueryNotaryDocumenttosignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotaryDocumenttosignExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取签署文件
         * Summary: 获取签署文件
         */
        public QueryNotaryDocumenttosignResponse QueryNotaryDocumenttosignEx(QueryNotaryDocumenttosignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryDocumenttosignResponse>(DoRequest("1.0", "blockchain.bccr.notary.documenttosign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取签署文件
         * Summary: 获取签署文件
         */
        public async Task<QueryNotaryDocumenttosignResponse> QueryNotaryDocumenttosignExAsync(QueryNotaryDocumenttosignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryDocumenttosignResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.documenttosign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交申办订单
         * Summary: 提交申办订单
         */
        public ApplyNotaryOrderResponse ApplyNotaryOrder(ApplyNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyNotaryOrderEx(request, headers, runtime);
        }

        /**
         * Description: 提交申办订单
         * Summary: 提交申办订单
         */
        public async Task<ApplyNotaryOrderResponse> ApplyNotaryOrderAsync(ApplyNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyNotaryOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交申办订单
         * Summary: 提交申办订单
         */
        public ApplyNotaryOrderResponse ApplyNotaryOrderEx(ApplyNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNotaryOrderResponse>(DoRequest("1.0", "blockchain.bccr.notary.order.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交申办订单
         * Summary: 提交申办订单
         */
        public async Task<ApplyNotaryOrderResponse> ApplyNotaryOrderExAsync(ApplyNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNotaryOrderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.order.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证重新获取支付链接
         * Summary: 重新获取支付链接
         */
        public QueryNotaryPayurlResponse QueryNotaryPayurl(QueryNotaryPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotaryPayurlEx(request, headers, runtime);
        }

        /**
         * Description: 公证出证重新获取支付链接
         * Summary: 重新获取支付链接
         */
        public async Task<QueryNotaryPayurlResponse> QueryNotaryPayurlAsync(QueryNotaryPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotaryPayurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 公证出证重新获取支付链接
         * Summary: 重新获取支付链接
         */
        public QueryNotaryPayurlResponse QueryNotaryPayurlEx(QueryNotaryPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryPayurlResponse>(DoRequest("1.0", "blockchain.bccr.notary.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证重新获取支付链接
         * Summary: 重新获取支付链接
         */
        public async Task<QueryNotaryPayurlResponse> QueryNotaryPayurlExAsync(QueryNotaryPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryPayurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证获取收费标准和明细
         * Summary: 获取收费标准和明细
         */
        public QueryNotaryFeedetailResponse QueryNotaryFeedetail(QueryNotaryFeedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotaryFeedetailEx(request, headers, runtime);
        }

        /**
         * Description: 公证出证获取收费标准和明细
         * Summary: 获取收费标准和明细
         */
        public async Task<QueryNotaryFeedetailResponse> QueryNotaryFeedetailAsync(QueryNotaryFeedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotaryFeedetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 公证出证获取收费标准和明细
         * Summary: 获取收费标准和明细
         */
        public QueryNotaryFeedetailResponse QueryNotaryFeedetailEx(QueryNotaryFeedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryFeedetailResponse>(DoRequest("1.0", "blockchain.bccr.notary.feedetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证获取收费标准和明细
         * Summary: 获取收费标准和明细
         */
        public async Task<QueryNotaryFeedetailResponse> QueryNotaryFeedetailExAsync(QueryNotaryFeedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryFeedetailResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.feedetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证查询申办订单接口
         * Summary: 查询申办订单接口
         */
        public QueryNotaryOrderResponse QueryNotaryOrder(QueryNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotaryOrderEx(request, headers, runtime);
        }

        /**
         * Description: 公证出证查询申办订单接口
         * Summary: 查询申办订单接口
         */
        public async Task<QueryNotaryOrderResponse> QueryNotaryOrderAsync(QueryNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotaryOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 公证出证查询申办订单接口
         * Summary: 查询申办订单接口
         */
        public QueryNotaryOrderResponse QueryNotaryOrderEx(QueryNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryOrderResponse>(DoRequest("1.0", "blockchain.bccr.notary.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证查询申办订单接口
         * Summary: 查询申办订单接口
         */
        public async Task<QueryNotaryOrderResponse> QueryNotaryOrderExAsync(QueryNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotaryOrderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证申请出证材料补齐
         * Summary: 申请出证材料补齐
         */
        public UploadNotaryAttachmentResponse UploadNotaryAttachment(UploadNotaryAttachmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadNotaryAttachmentEx(request, headers, runtime);
        }

        /**
         * Description: 公证出证申请出证材料补齐
         * Summary: 申请出证材料补齐
         */
        public async Task<UploadNotaryAttachmentResponse> UploadNotaryAttachmentAsync(UploadNotaryAttachmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadNotaryAttachmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 公证出证申请出证材料补齐
         * Summary: 申请出证材料补齐
         */
        public UploadNotaryAttachmentResponse UploadNotaryAttachmentEx(UploadNotaryAttachmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadNotaryAttachmentResponse>(DoRequest("1.0", "blockchain.bccr.notary.attachment.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证申请出证材料补齐
         * Summary: 申请出证材料补齐
         */
        public async Task<UploadNotaryAttachmentResponse> UploadNotaryAttachmentExAsync(UploadNotaryAttachmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadNotaryAttachmentResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.attachment.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证更新申办状态
         * Summary: 更新申办状态
         */
        public OperateNotaryOrderResponse OperateNotaryOrder(OperateNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateNotaryOrderEx(request, headers, runtime);
        }

        /**
         * Description: 公证出证更新申办状态
         * Summary: 更新申办状态
         */
        public async Task<OperateNotaryOrderResponse> OperateNotaryOrderAsync(OperateNotaryOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateNotaryOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 公证出证更新申办状态
         * Summary: 更新申办状态
         */
        public OperateNotaryOrderResponse OperateNotaryOrderEx(OperateNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateNotaryOrderResponse>(DoRequest("1.0", "blockchain.bccr.notary.order.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公证出证更新申办状态
         * Summary: 更新申办状态
         */
        public async Task<OperateNotaryOrderResponse> OperateNotaryOrderExAsync(OperateNotaryOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateNotaryOrderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.notary.order.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询DCI作品预览结果
         * Summary: 查询DCI作品预览结果
         */
        public QueryDciPreviewResponse QueryDciPreview(QueryDciPreviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciPreviewEx(request, headers, runtime);
        }

        /**
         * Description: 查询DCI作品预览结果
         * Summary: 查询DCI作品预览结果
         */
        public async Task<QueryDciPreviewResponse> QueryDciPreviewAsync(QueryDciPreviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciPreviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询DCI作品预览结果
         * Summary: 查询DCI作品预览结果
         */
        public QueryDciPreviewResponse QueryDciPreviewEx(QueryDciPreviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreviewResponse>(DoRequest("1.0", "blockchain.bccr.dci.preview.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询DCI作品预览结果
         * Summary: 查询DCI作品预览结果
         */
        public async Task<QueryDciPreviewResponse> QueryDciPreviewExAsync(QueryDciPreviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciPreviewResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.preview.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public RetryDciRegistrationResponse RetryDciRegistration(RetryDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public async Task<RetryDciRegistrationResponse> RetryDciRegistrationAsync(RetryDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public RetryDciRegistrationResponse RetryDciRegistrationEx(RetryDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补正数登申请
         * Summary: 补正数登申请
         */
        public async Task<RetryDciRegistrationResponse> RetryDciRegistrationExAsync(RetryDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public CloseDciRegistrationResponse CloseDciRegistration(CloseDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseDciRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public async Task<CloseDciRegistrationResponse> CloseDciRegistrationAsync(CloseDciRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseDciRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public CloseDciRegistrationResponse CloseDciRegistrationEx(CloseDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseDciRegistrationResponse>(DoRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数登停止申请
         * Summary: 数登停止申请
         */
        public async Task<CloseDciRegistrationResponse> CloseDciRegistrationExAsync(CloseDciRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseDciRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dci用户无需证件注册
         * Summary: dci用户无需证件注册
         */
        public AddDciUsernocertResponse AddDciUsernocert(AddDciUsernocertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDciUsernocertEx(request, headers, runtime);
        }

        /**
         * Description: dci用户无需证件注册
         * Summary: dci用户无需证件注册
         */
        public async Task<AddDciUsernocertResponse> AddDciUsernocertAsync(AddDciUsernocertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDciUsernocertExAsync(request, headers, runtime);
        }

        /**
         * Description: dci用户无需证件注册
         * Summary: dci用户无需证件注册
         */
        public AddDciUsernocertResponse AddDciUsernocertEx(AddDciUsernocertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDciUsernocertResponse>(DoRequest("1.0", "blockchain.bccr.dci.usernocert.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dci用户无需证件注册
         * Summary: dci用户无需证件注册
         */
        public async Task<AddDciUsernocertResponse> AddDciUsernocertExAsync(AddDciUsernocertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDciUsernocertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.usernocert.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询相似作品下载链接
         * Summary: 查询相似作品下载链接
         */
        public QueryDciSimilarfileResponse QueryDciSimilarfile(QueryDciSimilarfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciSimilarfileEx(request, headers, runtime);
        }

        /**
         * Description: 查询相似作品下载链接
         * Summary: 查询相似作品下载链接
         */
        public async Task<QueryDciSimilarfileResponse> QueryDciSimilarfileAsync(QueryDciSimilarfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciSimilarfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询相似作品下载链接
         * Summary: 查询相似作品下载链接
         */
        public QueryDciSimilarfileResponse QueryDciSimilarfileEx(QueryDciSimilarfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciSimilarfileResponse>(DoRequest("1.0", "blockchain.bccr.dci.similarfile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询相似作品下载链接
         * Summary: 查询相似作品下载链接
         */
        public async Task<QueryDciSimilarfileResponse> QueryDciSimilarfileExAsync(QueryDciSimilarfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciSimilarfileResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.similarfile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请渠道推广
         * Summary: 申请渠道推广
         */
        public ApplyDciPromotionResponse ApplyDciPromotion(ApplyDciPromotionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDciPromotionEx(request, headers, runtime);
        }

        /**
         * Description: 申请渠道推广
         * Summary: 申请渠道推广
         */
        public async Task<ApplyDciPromotionResponse> ApplyDciPromotionAsync(ApplyDciPromotionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDciPromotionExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请渠道推广
         * Summary: 申请渠道推广
         */
        public ApplyDciPromotionResponse ApplyDciPromotionEx(ApplyDciPromotionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDciPromotionResponse>(DoRequest("1.0", "blockchain.bccr.dci.promotion.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请渠道推广
         * Summary: 申请渠道推广
         */
        public async Task<ApplyDciPromotionResponse> ApplyDciPromotionExAsync(ApplyDciPromotionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDciPromotionResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.promotion.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据手机号查询dci用户
         * Summary: 根据手机号查询dci用户
         */
        public QueryDciUserbyphoneResponse QueryDciUserbyphone(QueryDciUserbyphoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciUserbyphoneEx(request, headers, runtime);
        }

        /**
         * Description: 根据手机号查询dci用户
         * Summary: 根据手机号查询dci用户
         */
        public async Task<QueryDciUserbyphoneResponse> QueryDciUserbyphoneAsync(QueryDciUserbyphoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciUserbyphoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据手机号查询dci用户
         * Summary: 根据手机号查询dci用户
         */
        public QueryDciUserbyphoneResponse QueryDciUserbyphoneEx(QueryDciUserbyphoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciUserbyphoneResponse>(DoRequest("1.0", "blockchain.bccr.dci.userbyphone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据手机号查询dci用户
         * Summary: 根据手机号查询dci用户
         */
        public async Task<QueryDciUserbyphoneResponse> QueryDciUserbyphoneExAsync(QueryDciUserbyphoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciUserbyphoneResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.userbyphone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持交易的已进行用途登记的商品查询
         * Summary: 支持交易的商品查询
         */
        public QueryTradeSaleResponse QueryTradeSale(QueryTradeSaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTradeSaleEx(request, headers, runtime);
        }

        /**
         * Description: 支持交易的已进行用途登记的商品查询
         * Summary: 支持交易的商品查询
         */
        public async Task<QueryTradeSaleResponse> QueryTradeSaleAsync(QueryTradeSaleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTradeSaleExAsync(request, headers, runtime);
        }

        /**
         * Description: 支持交易的已进行用途登记的商品查询
         * Summary: 支持交易的商品查询
         */
        public QueryTradeSaleResponse QueryTradeSaleEx(QueryTradeSaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradeSaleResponse>(DoRequest("1.0", "blockchain.bccr.trade.sale.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持交易的已进行用途登记的商品查询
         * Summary: 支持交易的商品查询
         */
        public async Task<QueryTradeSaleResponse> QueryTradeSaleExAsync(QueryTradeSaleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradeSaleResponse>(await DoRequestAsync("1.0", "blockchain.bccr.trade.sale.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途登记
         * Summary: 商品交易用途登记
         */
        public RegisterTradeUsageResponse RegisterTradeUsage(RegisterTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterTradeUsageEx(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途登记
         * Summary: 商品交易用途登记
         */
        public async Task<RegisterTradeUsageResponse> RegisterTradeUsageAsync(RegisterTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterTradeUsageExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途登记
         * Summary: 商品交易用途登记
         */
        public RegisterTradeUsageResponse RegisterTradeUsageEx(RegisterTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTradeUsageResponse>(DoRequest("1.0", "blockchain.bccr.trade.usage.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途登记
         * Summary: 商品交易用途登记
         */
        public async Task<RegisterTradeUsageResponse> RegisterTradeUsageExAsync(RegisterTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTradeUsageResponse>(await DoRequestAsync("1.0", "blockchain.bccr.trade.usage.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建取证用户
         * Summary: 创建取证用户
         */
        public CreateEvidenceUserResponse CreateEvidenceUser(CreateEvidenceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceUserEx(request, headers, runtime);
        }

        /**
         * Description: 创建取证用户
         * Summary: 创建取证用户
         */
        public async Task<CreateEvidenceUserResponse> CreateEvidenceUserAsync(CreateEvidenceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建取证用户
         * Summary: 创建取证用户
         */
        public CreateEvidenceUserResponse CreateEvidenceUserEx(CreateEvidenceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceUserResponse>(DoRequest("1.0", "blockchain.bccr.evidence.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建取证用户
         * Summary: 创建取证用户
         */
        public async Task<CreateEvidenceUserResponse> CreateEvidenceUserExAsync(CreateEvidenceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceUserResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页截图
         * Summary: 创建网页截图
         */
        public CreateEvidenceScreenshotResponse CreateEvidenceScreenshot(CreateEvidenceScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceScreenshotEx(request, headers, runtime);
        }

        /**
         * Description: 创建网页截图
         * Summary: 创建网页截图
         */
        public async Task<CreateEvidenceScreenshotResponse> CreateEvidenceScreenshotAsync(CreateEvidenceScreenshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceScreenshotExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建网页截图
         * Summary: 创建网页截图
         */
        public CreateEvidenceScreenshotResponse CreateEvidenceScreenshotEx(CreateEvidenceScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceScreenshotResponse>(DoRequest("1.0", "blockchain.bccr.evidence.screenshot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页截图
         * Summary: 创建网页截图
         */
        public async Task<CreateEvidenceScreenshotResponse> CreateEvidenceScreenshotExAsync(CreateEvidenceScreenshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceScreenshotResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.screenshot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页截图存证
         * Summary: 创建网页截图存证
         */
        public CreateEvidenceRegisterResponse CreateEvidenceRegister(CreateEvidenceRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceRegisterEx(request, headers, runtime);
        }

        /**
         * Description: 创建网页截图存证
         * Summary: 创建网页截图存证
         */
        public async Task<CreateEvidenceRegisterResponse> CreateEvidenceRegisterAsync(CreateEvidenceRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceRegisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建网页截图存证
         * Summary: 创建网页截图存证
         */
        public CreateEvidenceRegisterResponse CreateEvidenceRegisterEx(CreateEvidenceRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceRegisterResponse>(DoRequest("1.0", "blockchain.bccr.evidence.register.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建网页截图存证
         * Summary: 创建网页截图存证
         */
        public async Task<CreateEvidenceRegisterResponse> CreateEvidenceRegisterExAsync(CreateEvidenceRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceRegisterResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.register.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public CreateEvidenceRecordscreenResponse CreateEvidenceRecordscreen(CreateEvidenceRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceRecordscreenEx(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public async Task<CreateEvidenceRecordscreenResponse> CreateEvidenceRecordscreenAsync(CreateEvidenceRecordscreenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceRecordscreenExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public CreateEvidenceRecordscreenResponse CreateEvidenceRecordscreenEx(CreateEvidenceRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceRecordscreenResponse>(DoRequest("1.0", "blockchain.bccr.evidence.recordscreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建录屏取证
         * Summary: 创建录屏取证
         */
        public async Task<CreateEvidenceRecordscreenResponse> CreateEvidenceRecordscreenExAsync(CreateEvidenceRecordscreenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceRecordscreenResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.recordscreen.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途撤销
         * Summary: 商品交易用途撤销
         */
        public CancelTradeUsageResponse CancelTradeUsage(CancelTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelTradeUsageEx(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途撤销
         * Summary: 商品交易用途撤销
         */
        public async Task<CancelTradeUsageResponse> CancelTradeUsageAsync(CancelTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelTradeUsageExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途撤销
         * Summary: 商品交易用途撤销
         */
        public CancelTradeUsageResponse CancelTradeUsageEx(CancelTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelTradeUsageResponse>(DoRequest("1.0", "blockchain.bccr.trade.usage.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途撤销
         * Summary: 商品交易用途撤销
         */
        public async Task<CancelTradeUsageResponse> CancelTradeUsageExAsync(CancelTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelTradeUsageResponse>(await DoRequestAsync("1.0", "blockchain.bccr.trade.usage.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自动化直播录屏取证
         * Summary: 创建自动化直播取证
         */
        public CreateEvidenceLiveResponse CreateEvidenceLive(CreateEvidenceLiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceLiveEx(request, headers, runtime);
        }

        /**
         * Description: 创建自动化直播录屏取证
         * Summary: 创建自动化直播取证
         */
        public async Task<CreateEvidenceLiveResponse> CreateEvidenceLiveAsync(CreateEvidenceLiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceLiveExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建自动化直播录屏取证
         * Summary: 创建自动化直播取证
         */
        public CreateEvidenceLiveResponse CreateEvidenceLiveEx(CreateEvidenceLiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceLiveResponse>(DoRequest("1.0", "blockchain.bccr.evidence.live.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自动化直播录屏取证
         * Summary: 创建自动化直播取证
         */
        public async Task<CreateEvidenceLiveResponse> CreateEvidenceLiveExAsync(CreateEvidenceLiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceLiveResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.live.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据点播网站url发起点播取证
         * Summary: 发起点播取证
         */
        public CreateEvidenceVodResponse CreateEvidenceVod(CreateEvidenceVodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEvidenceVodEx(request, headers, runtime);
        }

        /**
         * Description: 根据点播网站url发起点播取证
         * Summary: 发起点播取证
         */
        public async Task<CreateEvidenceVodResponse> CreateEvidenceVodAsync(CreateEvidenceVodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEvidenceVodExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据点播网站url发起点播取证
         * Summary: 发起点播取证
         */
        public CreateEvidenceVodResponse CreateEvidenceVodEx(CreateEvidenceVodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceVodResponse>(DoRequest("1.0", "blockchain.bccr.evidence.vod.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据点播网站url发起点播取证
         * Summary: 发起点播取证
         */
        public async Task<CreateEvidenceVodResponse> CreateEvidenceVodExAsync(CreateEvidenceVodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEvidenceVodResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.vod.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途登记结果查询，目前仅用于测试
         * Summary: 商品交易用途登记结果查询
         */
        public GetTradeUsageResponse GetTradeUsage(GetTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTradeUsageEx(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途登记结果查询，目前仅用于测试
         * Summary: 商品交易用途登记结果查询
         */
        public async Task<GetTradeUsageResponse> GetTradeUsageAsync(GetTradeUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTradeUsageExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品交易用途登记结果查询，目前仅用于测试
         * Summary: 商品交易用途登记结果查询
         */
        public GetTradeUsageResponse GetTradeUsageEx(GetTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeUsageResponse>(DoRequest("1.0", "blockchain.bccr.trade.usage.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交易用途登记结果查询，目前仅用于测试
         * Summary: 商品交易用途登记结果查询
         */
        public async Task<GetTradeUsageResponse> GetTradeUsageExAsync(GetTradeUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTradeUsageResponse>(await DoRequestAsync("1.0", "blockchain.bccr.trade.usage.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询取证信息
         * Summary: 查询取证信息
         */
        public GetEvidenceInfoResponse GetEvidenceInfo(GetEvidenceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetEvidenceInfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询取证信息
         * Summary: 查询取证信息
         */
        public async Task<GetEvidenceInfoResponse> GetEvidenceInfoAsync(GetEvidenceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetEvidenceInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询取证信息
         * Summary: 查询取证信息
         */
        public GetEvidenceInfoResponse GetEvidenceInfoEx(GetEvidenceInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEvidenceInfoResponse>(DoRequest("1.0", "blockchain.bccr.evidence.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询取证信息
         * Summary: 查询取证信息
         */
        public async Task<GetEvidenceInfoResponse> GetEvidenceInfoExAsync(GetEvidenceInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEvidenceInfoResponse>(await DoRequestAsync("1.0", "blockchain.bccr.evidence.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DCI变更
         * Summary: DCI变更
         */
        public ReplaceDciResponse ReplaceDci(ReplaceDciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceDciEx(request, headers, runtime);
        }

        /**
         * Description: DCI变更
         * Summary: DCI变更
         */
        public async Task<ReplaceDciResponse> ReplaceDciAsync(ReplaceDciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceDciExAsync(request, headers, runtime);
        }

        /**
         * Description: DCI变更
         * Summary: DCI变更
         */
        public ReplaceDciResponse ReplaceDciEx(ReplaceDciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDciResponse>(DoRequest("1.0", "blockchain.bccr.dci.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DCI变更
         * Summary: DCI变更
         */
        public async Task<ReplaceDciResponse> ReplaceDciExAsync(ReplaceDciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDciResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交作品申诉
         * Summary: 提交作品申诉
         */
        public SubmitDciFeedbackResponse SubmitDciFeedback(SubmitDciFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitDciFeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 提交作品申诉
         * Summary: 提交作品申诉
         */
        public async Task<SubmitDciFeedbackResponse> SubmitDciFeedbackAsync(SubmitDciFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitDciFeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交作品申诉
         * Summary: 提交作品申诉
         */
        public SubmitDciFeedbackResponse SubmitDciFeedbackEx(SubmitDciFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDciFeedbackResponse>(DoRequest("1.0", "blockchain.bccr.dci.feedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交作品申诉
         * Summary: 提交作品申诉
         */
        public async Task<SubmitDciFeedbackResponse> SubmitDciFeedbackExAsync(SubmitDciFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDciFeedbackResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.feedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询申诉结果
         * Summary: 查询申诉结果
         */
        public QueryDciFeedbackResponse QueryDciFeedback(QueryDciFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDciFeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 查询申诉结果
         * Summary: 查询申诉结果
         */
        public async Task<QueryDciFeedbackResponse> QueryDciFeedbackAsync(QueryDciFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDciFeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询申诉结果
         * Summary: 查询申诉结果
         */
        public QueryDciFeedbackResponse QueryDciFeedbackEx(QueryDciFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciFeedbackResponse>(DoRequest("1.0", "blockchain.bccr.dci.feedback.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询申诉结果
         * Summary: 查询申诉结果
         */
        public async Task<QueryDciFeedbackResponse> QueryDciFeedbackExAsync(QueryDciFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDciFeedbackResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.feedback.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易商品抽取封面
         * Summary: 交易商品抽取封面
         */
        public ExecTradeCoverResponse ExecTradeCover(ExecTradeCoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecTradeCoverEx(request, headers, runtime);
        }

        /**
         * Description: 交易商品抽取封面
         * Summary: 交易商品抽取封面
         */
        public async Task<ExecTradeCoverResponse> ExecTradeCoverAsync(ExecTradeCoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecTradeCoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 交易商品抽取封面
         * Summary: 交易商品抽取封面
         */
        public ExecTradeCoverResponse ExecTradeCoverEx(ExecTradeCoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTradeCoverResponse>(DoRequest("1.0", "blockchain.bccr.trade.cover.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易商品抽取封面
         * Summary: 交易商品抽取封面
         */
        public async Task<ExecTradeCoverResponse> ExecTradeCoverExAsync(ExecTradeCoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTradeCoverResponse>(await DoRequestAsync("1.0", "blockchain.bccr.trade.cover.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public CreateOrderResponse CreateOrder(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOrderEx(request, headers, runtime);
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public async Task<CreateOrderResponse> CreateOrderAsync(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public CreateOrderResponse CreateOrderEx(CreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(DoRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建订单
         * Summary: 创建订单
         */
        public async Task<CreateOrderResponse> CreateOrderExAsync(CreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(await DoRequestAsync("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public QueryOrderPayurlResponse QueryOrderPayurl(QueryOrderPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOrderPayurlEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public async Task<QueryOrderPayurlResponse> QueryOrderPayurlAsync(QueryOrderPayurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOrderPayurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public QueryOrderPayurlResponse QueryOrderPayurlEx(QueryOrderPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrderPayurlResponse>(DoRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单支付链接
         * Summary: 查询订单支付链接
         */
        public async Task<QueryOrderPayurlResponse> QueryOrderPayurlExAsync(QueryOrderPayurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrderPayurlResponse>(await DoRequestAsync("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public FinishDciRegistrationcertResponse FinishDciRegistrationcert(FinishDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishDciRegistrationcertEx(request, headers, runtime);
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public async Task<FinishDciRegistrationcertResponse> FinishDciRegistrationcertAsync(FinishDciRegistrationcertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishDciRegistrationcertExAsync(request, headers, runtime);
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public FinishDciRegistrationcertResponse FinishDciRegistrationcertEx(FinishDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishDciRegistrationcertResponse>(DoRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版保完成数登证书回调
         * Summary: 版保完成数登证书回调
         */
        public async Task<FinishDciRegistrationcertResponse> FinishDciRegistrationcertExAsync(FinishDciRegistrationcertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishDciRegistrationcertResponse>(await DoRequestAsync("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加发布视频内容
         * Summary: 发布视频内容
         */
        public AddContentResponse AddContent(AddContentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContentEx(request, headers, runtime);
        }

        /**
         * Description: 添加发布视频内容
         * Summary: 发布视频内容
         */
        public async Task<AddContentResponse> AddContentAsync(AddContentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContentExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加发布视频内容
         * Summary: 发布视频内容
         */
        public AddContentResponse AddContentEx(AddContentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContentResponse>(DoRequest("1.0", "blockchain.bccr.content.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加发布视频内容
         * Summary: 发布视频内容
         */
        public async Task<AddContentResponse> AddContentExAsync(AddContentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContentResponse>(await DoRequestAsync("1.0", "blockchain.bccr.content.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询视频内容状态
         * Summary: 查询视频内容状态
         */
        public QueryContentStatusResponse QueryContentStatus(QueryContentStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContentStatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询视频内容状态
         * Summary: 查询视频内容状态
         */
        public async Task<QueryContentStatusResponse> QueryContentStatusAsync(QueryContentStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContentStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询视频内容状态
         * Summary: 查询视频内容状态
         */
        public QueryContentStatusResponse QueryContentStatusEx(QueryContentStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentStatusResponse>(DoRequest("1.0", "blockchain.bccr.content.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询视频内容状态
         * Summary: 查询视频内容状态
         */
        public async Task<QueryContentStatusResponse> QueryContentStatusExAsync(QueryContentStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentStatusResponse>(await DoRequestAsync("1.0", "blockchain.bccr.content.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询视频内容统计数据
         * Summary: 查询视频内容统计
         */
        public QueryContentStatisticsResponse QueryContentStatistics(QueryContentStatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContentStatisticsEx(request, headers, runtime);
        }

        /**
         * Description: 查询视频内容统计数据
         * Summary: 查询视频内容统计
         */
        public async Task<QueryContentStatisticsResponse> QueryContentStatisticsAsync(QueryContentStatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContentStatisticsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询视频内容统计数据
         * Summary: 查询视频内容统计
         */
        public QueryContentStatisticsResponse QueryContentStatisticsEx(QueryContentStatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentStatisticsResponse>(DoRequest("1.0", "blockchain.bccr.content.statistics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询视频内容统计数据
         * Summary: 查询视频内容统计
         */
        public async Task<QueryContentStatisticsResponse> QueryContentStatisticsExAsync(QueryContentStatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentStatisticsResponse>(await DoRequestAsync("1.0", "blockchain.bccr.content.statistics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询视频内容统计数据
         * Summary: 批量查询视频统计信息
         */
        public QueryContentBatchstatisticsResponse QueryContentBatchstatistics(QueryContentBatchstatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContentBatchstatisticsEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询视频内容统计数据
         * Summary: 批量查询视频统计信息
         */
        public async Task<QueryContentBatchstatisticsResponse> QueryContentBatchstatisticsAsync(QueryContentBatchstatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContentBatchstatisticsExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询视频内容统计数据
         * Summary: 批量查询视频统计信息
         */
        public QueryContentBatchstatisticsResponse QueryContentBatchstatisticsEx(QueryContentBatchstatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentBatchstatisticsResponse>(DoRequest("1.0", "blockchain.bccr.content.batchstatistics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询视频内容统计数据
         * Summary: 批量查询视频统计信息
         */
        public async Task<QueryContentBatchstatisticsResponse> QueryContentBatchstatisticsExAsync(QueryContentBatchstatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentBatchstatisticsResponse>(await DoRequestAsync("1.0", "blockchain.bccr.content.batchstatistics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品发布
         * Summary: 商品发布
         */
        public PublishGoodResponse PublishGood(PublishGoodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishGoodEx(request, headers, runtime);
        }

        /**
         * Description: 商品发布
         * Summary: 商品发布
         */
        public async Task<PublishGoodResponse> PublishGoodAsync(PublishGoodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishGoodExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品发布
         * Summary: 商品发布
         */
        public PublishGoodResponse PublishGoodEx(PublishGoodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishGoodResponse>(DoRequest("1.0", "blockchain.bccr.good.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品发布
         * Summary: 商品发布
         */
        public async Task<PublishGoodResponse> PublishGoodExAsync(PublishGoodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishGoodResponse>(await DoRequestAsync("1.0", "blockchain.bccr.good.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品发布查询
         * Summary: 商品发布查询
         */
        public QueryGoodsPublishResponse QueryGoodsPublish(QueryGoodsPublishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGoodsPublishEx(request, headers, runtime);
        }

        /**
         * Description: 商品发布查询
         * Summary: 商品发布查询
         */
        public async Task<QueryGoodsPublishResponse> QueryGoodsPublishAsync(QueryGoodsPublishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGoodsPublishExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品发布查询
         * Summary: 商品发布查询
         */
        public QueryGoodsPublishResponse QueryGoodsPublishEx(QueryGoodsPublishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsPublishResponse>(DoRequest("1.0", "blockchain.bccr.goods.publish.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品发布查询
         * Summary: 商品发布查询
         */
        public async Task<QueryGoodsPublishResponse> QueryGoodsPublishExAsync(QueryGoodsPublishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsPublishResponse>(await DoRequestAsync("1.0", "blockchain.bccr.goods.publish.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品更新
         * Summary: 商品更新
         */
        public UpdateGoodsResponse UpdateGoods(UpdateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 商品更新
         * Summary: 商品更新
         */
        public async Task<UpdateGoodsResponse> UpdateGoodsAsync(UpdateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品更新
         * Summary: 商品更新
         */
        public UpdateGoodsResponse UpdateGoodsEx(UpdateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodsResponse>(DoRequest("1.0", "blockchain.bccr.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品更新
         * Summary: 商品更新
         */
        public async Task<UpdateGoodsResponse> UpdateGoodsExAsync(UpdateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodsResponse>(await DoRequestAsync("1.0", "blockchain.bccr.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public QueryGoodsResponse QueryGoods(QueryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public async Task<QueryGoodsResponse> QueryGoodsAsync(QueryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public QueryGoodsResponse QueryGoodsEx(QueryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsResponse>(DoRequest("1.0", "blockchain.bccr.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public async Task<QueryGoodsResponse> QueryGoodsExAsync(QueryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsResponse>(await DoRequestAsync("1.0", "blockchain.bccr.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
