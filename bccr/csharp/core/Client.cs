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
                        {"sdk_version", "1.15.11"},
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
                        {"sdk_version", "1.15.11"},
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
