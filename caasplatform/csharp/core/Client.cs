// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.CAASPLATFORM.Models;

namespace AntChain.SDK.CAASPLATFORM
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
                        {"sdk_version", "1.5.1"},
                        {"_prod_code", "CAASPLATFORM"},
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
                        {"sdk_version", "1.5.1"},
                        {"_prod_code", "CAASPLATFORM"},
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
         * Description: 创建存证
         * Summary: 创建存证
         */
        public CreateDepositResponse CreateDeposit(CreateDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDepositEx(request, headers, runtime);
        }

        /**
         * Description: 创建存证
         * Summary: 创建存证
         */
        public async Task<CreateDepositResponse> CreateDepositAsync(CreateDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建存证
         * Summary: 创建存证
         */
        public CreateDepositResponse CreateDepositEx(CreateDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositResponse createDepositResponse = new CreateDepositResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建存证
         * Summary: 创建存证
         */
        public async Task<CreateDepositResponse> CreateDepositExAsync(CreateDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositResponse createDepositResponse = new CreateDepositResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证查询
         * Summary: 存证查询
         */
        public QueryDepositResponse QueryDeposit(QueryDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDepositEx(request, headers, runtime);
        }

        /**
         * Description: 存证查询
         * Summary: 存证查询
         */
        public async Task<QueryDepositResponse> QueryDepositAsync(QueryDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证查询
         * Summary: 存证查询
         */
        public QueryDepositResponse QueryDepositEx(QueryDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证查询
         * Summary: 存证查询
         */
        public async Task<QueryDepositResponse> QueryDepositExAsync(QueryDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书存证合约-证书存证查询
         * Summary: 证书存证合约-证书存证查询
         */
        public QueryDepositCertificateResponse QueryDepositCertificate(QueryDepositCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDepositCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 证书存证合约-证书存证查询
         * Summary: 证书存证合约-证书存证查询
         */
        public async Task<QueryDepositCertificateResponse> QueryDepositCertificateAsync(QueryDepositCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDepositCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 证书存证合约-证书存证查询
         * Summary: 证书存证合约-证书存证查询
         */
        public QueryDepositCertificateResponse QueryDepositCertificateEx(QueryDepositCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositCertificateResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书存证合约-证书存证查询
         * Summary: 证书存证合约-证书存证查询
         */
        public async Task<QueryDepositCertificateResponse> QueryDepositCertificateExAsync(QueryDepositCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositCertificateResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书存证合约-创建证书存证
         * Summary: 证书存证合约-创建证书存证
         */
        public CreateDepositCertificateResponse CreateDepositCertificate(CreateDepositCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDepositCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 证书存证合约-创建证书存证
         * Summary: 证书存证合约-创建证书存证
         */
        public async Task<CreateDepositCertificateResponse> CreateDepositCertificateAsync(CreateDepositCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDepositCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 证书存证合约-创建证书存证
         * Summary: 证书存证合约-创建证书存证
         */
        public CreateDepositCertificateResponse CreateDepositCertificateEx(CreateDepositCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.certificate.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositCertificateResponse createDepositCertificateResponse = new CreateDepositCertificateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositCertificateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositCertificateResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书存证合约-创建证书存证
         * Summary: 证书存证合约-创建证书存证
         */
        public async Task<CreateDepositCertificateResponse> CreateDepositCertificateExAsync(CreateDepositCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.certificate.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositCertificateResponse createDepositCertificateResponse = new CreateDepositCertificateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositCertificateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositCertificateResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 捐赠合约-捐赠证明查询
         * Summary: 捐赠合约-捐赠证明查询
         */
        public QueryDepositCharityResponse QueryDepositCharity(QueryDepositCharityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDepositCharityEx(request, headers, runtime);
        }

        /**
         * Description: 捐赠合约-捐赠证明查询
         * Summary: 捐赠合约-捐赠证明查询
         */
        public async Task<QueryDepositCharityResponse> QueryDepositCharityAsync(QueryDepositCharityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDepositCharityExAsync(request, headers, runtime);
        }

        /**
         * Description: 捐赠合约-捐赠证明查询
         * Summary: 捐赠合约-捐赠证明查询
         */
        public QueryDepositCharityResponse QueryDepositCharityEx(QueryDepositCharityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositCharityResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.charity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 捐赠合约-捐赠证明查询
         * Summary: 捐赠合约-捐赠证明查询
         */
        public async Task<QueryDepositCharityResponse> QueryDepositCharityExAsync(QueryDepositCharityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositCharityResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.charity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 捐赠合约-创建捐赠证明
         * Summary: 捐赠合约-创建捐赠证明
         */
        public CreateDepositCharityResponse CreateDepositCharity(CreateDepositCharityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDepositCharityEx(request, headers, runtime);
        }

        /**
         * Description: 捐赠合约-创建捐赠证明
         * Summary: 捐赠合约-创建捐赠证明
         */
        public async Task<CreateDepositCharityResponse> CreateDepositCharityAsync(CreateDepositCharityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDepositCharityExAsync(request, headers, runtime);
        }

        /**
         * Description: 捐赠合约-创建捐赠证明
         * Summary: 捐赠合约-创建捐赠证明
         */
        public CreateDepositCharityResponse CreateDepositCharityEx(CreateDepositCharityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.charity.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositCharityResponse createDepositCharityResponse = new CreateDepositCharityResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositCharityResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositCharityResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.charity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 捐赠合约-创建捐赠证明
         * Summary: 捐赠合约-创建捐赠证明
         */
        public async Task<CreateDepositCharityResponse> CreateDepositCharityExAsync(CreateDepositCharityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.charity.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositCharityResponse createDepositCharityResponse = new CreateDepositCharityResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositCharityResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositCharityResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.charity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 抽奖活动审计合约-中奖记录查询
         * Summary: 抽奖活动审计合约-中奖记录查询
         */
        public QueryDepositSweepstakesResponse QueryDepositSweepstakes(QueryDepositSweepstakesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDepositSweepstakesEx(request, headers, runtime);
        }

        /**
         * Description: 抽奖活动审计合约-中奖记录查询
         * Summary: 抽奖活动审计合约-中奖记录查询
         */
        public async Task<QueryDepositSweepstakesResponse> QueryDepositSweepstakesAsync(QueryDepositSweepstakesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDepositSweepstakesExAsync(request, headers, runtime);
        }

        /**
         * Description: 抽奖活动审计合约-中奖记录查询
         * Summary: 抽奖活动审计合约-中奖记录查询
         */
        public QueryDepositSweepstakesResponse QueryDepositSweepstakesEx(QueryDepositSweepstakesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositSweepstakesResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 抽奖活动审计合约-中奖记录查询
         * Summary: 抽奖活动审计合约-中奖记录查询
         */
        public async Task<QueryDepositSweepstakesResponse> QueryDepositSweepstakesExAsync(QueryDepositSweepstakesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepositSweepstakesResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.sweepstakes.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 抽奖活动审计合约-创建活动记录
         * Summary: 抽奖活动审计合约-创建活动记录
         */
        public CreateDepositSweepstakesResponse CreateDepositSweepstakes(CreateDepositSweepstakesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDepositSweepstakesEx(request, headers, runtime);
        }

        /**
         * Description: 抽奖活动审计合约-创建活动记录
         * Summary: 抽奖活动审计合约-创建活动记录
         */
        public async Task<CreateDepositSweepstakesResponse> CreateDepositSweepstakesAsync(CreateDepositSweepstakesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDepositSweepstakesExAsync(request, headers, runtime);
        }

        /**
         * Description: 抽奖活动审计合约-创建活动记录
         * Summary: 抽奖活动审计合约-创建活动记录
         */
        public CreateDepositSweepstakesResponse CreateDepositSweepstakesEx(CreateDepositSweepstakesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.sweepstakes.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositSweepstakesResponse createDepositSweepstakesResponse = new CreateDepositSweepstakesResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositSweepstakesResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositSweepstakesResponse>(DoRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 抽奖活动审计合约-创建活动记录
         * Summary: 抽奖活动审计合约-创建活动记录
         */
        public async Task<CreateDepositSweepstakesResponse> CreateDepositSweepstakesExAsync(CreateDepositSweepstakesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.deposit.sweepstakes.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateDepositSweepstakesResponse createDepositSweepstakesResponse = new CreateDepositSweepstakesResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createDepositSweepstakesResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepositSweepstakesResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.deposit.sweepstakes.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-结构化存储场景
         * Summary: 通用合约调用-结构化存储场景
         */
        public SetGeneralDepositResponse SetGeneralDeposit(SetGeneralDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetGeneralDepositEx(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-结构化存储场景
         * Summary: 通用合约调用-结构化存储场景
         */
        public async Task<SetGeneralDepositResponse> SetGeneralDepositAsync(SetGeneralDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetGeneralDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-结构化存储场景
         * Summary: 通用合约调用-结构化存储场景
         */
        public SetGeneralDepositResponse SetGeneralDepositEx(SetGeneralDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetGeneralDepositResponse>(DoRequest("1.0", "antchain.caasplatform.general.deposit.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-结构化存储场景
         * Summary: 通用合约调用-结构化存储场景
         */
        public async Task<SetGeneralDepositResponse> SetGeneralDepositExAsync(SetGeneralDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetGeneralDepositResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.deposit.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-结构化查询场景
         * Summary: 通用合约调用-结构化查询场景
         */
        public GetGeneralDepositResponse GetGeneralDeposit(GetGeneralDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralDepositEx(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-结构化查询场景
         * Summary: 通用合约调用-结构化查询场景
         */
        public async Task<GetGeneralDepositResponse> GetGeneralDepositAsync(GetGeneralDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-结构化查询场景
         * Summary: 通用合约调用-结构化查询场景
         */
        public GetGeneralDepositResponse GetGeneralDepositEx(GetGeneralDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralDepositResponse>(DoRequest("1.0", "antchain.caasplatform.general.deposit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-结构化查询场景
         * Summary: 通用合约调用-结构化查询场景
         */
        public async Task<GetGeneralDepositResponse> GetGeneralDepositExAsync(GetGeneralDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralDepositResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.deposit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-转赠
         * Summary: 通用合约调用-权益-转赠
         */
        public PayGeneralRightsResponse PayGeneralRights(PayGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayGeneralRightsEx(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-转赠
         * Summary: 通用合约调用-权益-转赠
         */
        public async Task<PayGeneralRightsResponse> PayGeneralRightsAsync(PayGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayGeneralRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-转赠
         * Summary: 通用合约调用-权益-转赠
         */
        public PayGeneralRightsResponse PayGeneralRightsEx(PayGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralRightsResponse>(DoRequest("1.0", "antchain.caasplatform.general.rights.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-转赠
         * Summary: 通用合约调用-权益-转赠
         */
        public async Task<PayGeneralRightsResponse> PayGeneralRightsExAsync(PayGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralRightsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.rights.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源文件托管
         * Summary: 资源文件托管
         */
        public UploadExtendRightsResponse UploadExtendRights(UploadExtendRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadExtendRightsEx(request, headers, runtime);
        }

        /**
         * Description: 资源文件托管
         * Summary: 资源文件托管
         */
        public async Task<UploadExtendRightsResponse> UploadExtendRightsAsync(UploadExtendRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadExtendRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源文件托管
         * Summary: 资源文件托管
         */
        public UploadExtendRightsResponse UploadExtendRightsEx(UploadExtendRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.extend.rights.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadExtendRightsResponse uploadExtendRightsResponse = new UploadExtendRightsResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadExtendRightsResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadExtendRightsResponse>(DoRequest("1.0", "antchain.caasplatform.extend.rights.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源文件托管
         * Summary: 资源文件托管
         */
        public async Task<UploadExtendRightsResponse> UploadExtendRightsExAsync(UploadExtendRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.caasplatform.extend.rights.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadExtendRightsResponse uploadExtendRightsResponse = new UploadExtendRightsResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadExtendRightsResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadExtendRightsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.extend.rights.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建链上账户
         * Summary: 创建链上账户
         */
        public CreateExtendRightsResponse CreateExtendRights(CreateExtendRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateExtendRightsEx(request, headers, runtime);
        }

        /**
         * Description: 创建链上账户
         * Summary: 创建链上账户
         */
        public async Task<CreateExtendRightsResponse> CreateExtendRightsAsync(CreateExtendRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateExtendRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建链上账户
         * Summary: 创建链上账户
         */
        public CreateExtendRightsResponse CreateExtendRightsEx(CreateExtendRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExtendRightsResponse>(DoRequest("1.0", "antchain.caasplatform.extend.rights.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建链上账户
         * Summary: 创建链上账户
         */
        public async Task<CreateExtendRightsResponse> CreateExtendRightsExAsync(CreateExtendRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExtendRightsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.extend.rights.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-铸造
         * Summary: 通用合约调用-权益-铸造
         */
        public RegisterGeneralRightsResponse RegisterGeneralRights(RegisterGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterGeneralRightsEx(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-铸造
         * Summary: 通用合约调用-权益-铸造
         */
        public async Task<RegisterGeneralRightsResponse> RegisterGeneralRightsAsync(RegisterGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterGeneralRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-铸造
         * Summary: 通用合约调用-权益-铸造
         */
        public RegisterGeneralRightsResponse RegisterGeneralRightsEx(RegisterGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralRightsResponse>(DoRequest("1.0", "antchain.caasplatform.general.rights.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-铸造
         * Summary: 通用合约调用-权益-铸造
         */
        public async Task<RegisterGeneralRightsResponse> RegisterGeneralRightsExAsync(RegisterGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralRightsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.rights.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-URL查询
         * Summary: 通用合约调用-权益- URL查询
         */
        public GetGeneralRightsResponse GetGeneralRights(GetGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralRightsEx(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-URL查询
         * Summary: 通用合约调用-权益- URL查询
         */
        public async Task<GetGeneralRightsResponse> GetGeneralRightsAsync(GetGeneralRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用合约调用-权益-URL查询
         * Summary: 通用合约调用-权益- URL查询
         */
        public GetGeneralRightsResponse GetGeneralRightsEx(GetGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralRightsResponse>(DoRequest("1.0", "antchain.caasplatform.general.rights.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用合约调用-权益-URL查询
         * Summary: 通用合约调用-权益- URL查询
         */
        public async Task<GetGeneralRightsResponse> GetGeneralRightsExAsync(GetGeneralRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralRightsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.rights.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
         * Summary: 分账合约-配置分账方
         */
        public RegisterGeneralDivideResponse RegisterGeneralDivide(RegisterGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
         * Summary: 分账合约-配置分账方
         */
        public async Task<RegisterGeneralDivideResponse> RegisterGeneralDivideAsync(RegisterGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
         * Summary: 分账合约-配置分账方
         */
        public RegisterGeneralDivideResponse RegisterGeneralDivideEx(RegisterGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
         * Summary: 分账合约-配置分账方
         */
        public async Task<RegisterGeneralDivideResponse> RegisterGeneralDivideExAsync(RegisterGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-查询分账方
         * Summary: 分账合约-查询分账方
         */
        public QueryGeneralDivideResponse QueryGeneralDivide(QueryGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 分账合约-查询分账方
         * Summary: 分账合约-查询分账方
         */
        public async Task<QueryGeneralDivideResponse> QueryGeneralDivideAsync(QueryGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账合约-查询分账方
         * Summary: 分账合约-查询分账方
         */
        public QueryGeneralDivideResponse QueryGeneralDivideEx(QueryGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-查询分账方
         * Summary: 分账合约-查询分账方
         */
        public async Task<QueryGeneralDivideResponse> QueryGeneralDivideExAsync(QueryGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
         * Summary: 分账合约-配置分账规则
         */
        public SetGeneralDivideResponse SetGeneralDivide(SetGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
         * Summary: 分账合约-配置分账规则
         */
        public async Task<SetGeneralDivideResponse> SetGeneralDivideAsync(SetGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
         * Summary: 分账合约-配置分账规则
         */
        public SetGeneralDivideResponse SetGeneralDivideEx(SetGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
         * Summary: 分账合约-配置分账规则
         */
        public async Task<SetGeneralDivideResponse> SetGeneralDivideExAsync(SetGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-查询分账规则
         * Summary: 分账合约-查询分账规则
         */
        public GetGeneralDivideResponse GetGeneralDivide(GetGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 分账合约-查询分账规则
         * Summary: 分账合约-查询分账规则
         */
        public async Task<GetGeneralDivideResponse> GetGeneralDivideAsync(GetGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账合约-查询分账规则
         * Summary: 分账合约-查询分账规则
         */
        public GetGeneralDivideResponse GetGeneralDivideEx(GetGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-查询分账规则
         * Summary: 分账合约-查询分账规则
         */
        public async Task<GetGeneralDivideResponse> GetGeneralDivideExAsync(GetGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
         * Summary: 分账合约-删除分账方
         */
        public DeleteGeneralDivideResponse DeleteGeneralDivide(DeleteGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
         * Summary: 分账合约-删除分账方
         */
        public async Task<DeleteGeneralDivideResponse> DeleteGeneralDivideAsync(DeleteGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
         * Summary: 分账合约-删除分账方
         */
        public DeleteGeneralDivideResponse DeleteGeneralDivideEx(DeleteGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
         * Summary: 分账合约-删除分账方
         */
        public async Task<DeleteGeneralDivideResponse> DeleteGeneralDivideExAsync(DeleteGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
         * Summary: 分账合约-发起分账
         */
        public PayGeneralDivideResponse PayGeneralDivide(PayGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
         * Summary: 分账合约-发起分账
         */
        public async Task<PayGeneralDivideResponse> PayGeneralDivideAsync(PayGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
         * Summary: 分账合约-发起分账
         */
        public PayGeneralDivideResponse PayGeneralDivideEx(PayGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
         * Summary: 分账合约-发起分账
         */
        public async Task<PayGeneralDivideResponse> PayGeneralDivideExAsync(PayGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-获取分账方余额
         * Summary: 分账合约-获取分账方余额
         */
        public PullGeneralDivideResponse PullGeneralDivide(PullGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 分账合约-获取分账方余额
         * Summary: 分账合约-获取分账方余额
         */
        public async Task<PullGeneralDivideResponse> PullGeneralDivideAsync(PullGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账合约-获取分账方余额
         * Summary: 分账合约-获取分账方余额
         */
        public PullGeneralDivideResponse PullGeneralDivideEx(PullGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-获取分账方余额
         * Summary: 分账合约-获取分账方余额
         */
        public async Task<PullGeneralDivideResponse> PullGeneralDivideExAsync(PullGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-获取订单分账信息
         * Summary: 分账合约-获取订单分账信息
         */
        public BatchqueryGeneralDivideResponse BatchqueryGeneralDivide(BatchqueryGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 分账合约-获取订单分账信息
         * Summary: 分账合约-获取订单分账信息
         */
        public async Task<BatchqueryGeneralDivideResponse> BatchqueryGeneralDivideAsync(BatchqueryGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账合约-获取订单分账信息
         * Summary: 分账合约-获取订单分账信息
         */
        public BatchqueryGeneralDivideResponse BatchqueryGeneralDivideEx(BatchqueryGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账合约-获取订单分账信息
         * Summary: 分账合约-获取订单分账信息
         */
        public async Task<BatchqueryGeneralDivideResponse> BatchqueryGeneralDivideExAsync(BatchqueryGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-文创URL查询
         * Summary: 旅游文创合约-文创URL查询
         */
        public GetGeneralTourismResponse GetGeneralTourism(GetGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralTourismEx(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-文创URL查询
         * Summary: 旅游文创合约-文创URL查询
         */
        public async Task<GetGeneralTourismResponse> GetGeneralTourismAsync(GetGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralTourismExAsync(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-文创URL查询
         * Summary: 旅游文创合约-文创URL查询
         */
        public GetGeneralTourismResponse GetGeneralTourismEx(GetGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralTourismResponse>(DoRequest("1.0", "antchain.caasplatform.general.tourism.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-文创URL查询
         * Summary: 旅游文创合约-文创URL查询
         */
        public async Task<GetGeneralTourismResponse> GetGeneralTourismExAsync(GetGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralTourismResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tourism.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-铸造文创
         * Summary: 旅游文创合约-铸造文创
         */
        public RegisterGeneralTourismResponse RegisterGeneralTourism(RegisterGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterGeneralTourismEx(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-铸造文创
         * Summary: 旅游文创合约-铸造文创
         */
        public async Task<RegisterGeneralTourismResponse> RegisterGeneralTourismAsync(RegisterGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterGeneralTourismExAsync(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-铸造文创
         * Summary: 旅游文创合约-铸造文创
         */
        public RegisterGeneralTourismResponse RegisterGeneralTourismEx(RegisterGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralTourismResponse>(DoRequest("1.0", "antchain.caasplatform.general.tourism.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-铸造文创
         * Summary: 旅游文创合约-铸造文创
         */
        public async Task<RegisterGeneralTourismResponse> RegisterGeneralTourismExAsync(RegisterGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralTourismResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tourism.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-文创转增
         * Summary: 旅游文创合约-文创转增
         */
        public PayGeneralTourismResponse PayGeneralTourism(PayGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayGeneralTourismEx(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-文创转增
         * Summary: 旅游文创合约-文创转增
         */
        public async Task<PayGeneralTourismResponse> PayGeneralTourismAsync(PayGeneralTourismRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayGeneralTourismExAsync(request, headers, runtime);
        }

        /**
         * Description: 旅游文创合约-文创转增
         * Summary: 旅游文创合约-文创转增
         */
        public PayGeneralTourismResponse PayGeneralTourismEx(PayGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralTourismResponse>(DoRequest("1.0", "antchain.caasplatform.general.tourism.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旅游文创合约-文创转增
         * Summary: 旅游文创合约-文创转增
         */
        public async Task<PayGeneralTourismResponse> PayGeneralTourismExAsync(PayGeneralTourismRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralTourismResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tourism.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-门票URL查询
         * Summary: 线下门票合约-门票URL查询
         */
        public GetGeneralTicketsResponse GetGeneralTickets(GetGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralTicketsEx(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-门票URL查询
         * Summary: 线下门票合约-门票URL查询
         */
        public async Task<GetGeneralTicketsResponse> GetGeneralTicketsAsync(GetGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralTicketsExAsync(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-门票URL查询
         * Summary: 线下门票合约-门票URL查询
         */
        public GetGeneralTicketsResponse GetGeneralTicketsEx(GetGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralTicketsResponse>(DoRequest("1.0", "antchain.caasplatform.general.tickets.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-门票URL查询
         * Summary: 线下门票合约-门票URL查询
         */
        public async Task<GetGeneralTicketsResponse> GetGeneralTicketsExAsync(GetGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralTicketsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tickets.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-铸造线下买票
         * Summary: 线下门票合约-铸造线下买票
         */
        public RegisterGeneralTicketsResponse RegisterGeneralTickets(RegisterGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterGeneralTicketsEx(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-铸造线下买票
         * Summary: 线下门票合约-铸造线下买票
         */
        public async Task<RegisterGeneralTicketsResponse> RegisterGeneralTicketsAsync(RegisterGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterGeneralTicketsExAsync(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-铸造线下买票
         * Summary: 线下门票合约-铸造线下买票
         */
        public RegisterGeneralTicketsResponse RegisterGeneralTicketsEx(RegisterGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralTicketsResponse>(DoRequest("1.0", "antchain.caasplatform.general.tickets.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-铸造线下买票
         * Summary: 线下门票合约-铸造线下买票
         */
        public async Task<RegisterGeneralTicketsResponse> RegisterGeneralTicketsExAsync(RegisterGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterGeneralTicketsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tickets.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-门票转增
         * Summary: 线下门票合约-门票转增
         */
        public PayGeneralTicketsResponse PayGeneralTickets(PayGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayGeneralTicketsEx(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-门票转增
         * Summary: 线下门票合约-门票转增
         */
        public async Task<PayGeneralTicketsResponse> PayGeneralTicketsAsync(PayGeneralTicketsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayGeneralTicketsExAsync(request, headers, runtime);
        }

        /**
         * Description: 线下门票合约-门票转增
         * Summary: 线下门票合约-门票转增
         */
        public PayGeneralTicketsResponse PayGeneralTicketsEx(PayGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralTicketsResponse>(DoRequest("1.0", "antchain.caasplatform.general.tickets.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下门票合约-门票转增
         * Summary: 线下门票合约-门票转增
         */
        public async Task<PayGeneralTicketsResponse> PayGeneralTicketsExAsync(PayGeneralTicketsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayGeneralTicketsResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.tickets.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 进行分账规则的确认
         * Summary: 分账规则确认接口
         */
        public UpdateGeneralDivideResponse UpdateGeneralDivide(UpdateGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 进行分账规则的确认
         * Summary: 分账规则确认接口
         */
        public async Task<UpdateGeneralDivideResponse> UpdateGeneralDivideAsync(UpdateGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 进行分账规则的确认
         * Summary: 分账规则确认接口
         */
        public UpdateGeneralDivideResponse UpdateGeneralDivideEx(UpdateGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 进行分账规则的确认
         * Summary: 分账规则确认接口
         */
        public async Task<UpdateGeneralDivideResponse> UpdateGeneralDivideExAsync(UpdateGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定分账方的分账明细数据
         * Summary: 分账明细查询
         */
        public ListGeneralDivideResponse ListGeneralDivide(ListGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListGeneralDivideEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定分账方的分账明细数据
         * Summary: 分账明细查询
         */
        public async Task<ListGeneralDivideResponse> ListGeneralDivideAsync(ListGeneralDivideRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListGeneralDivideExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定分账方的分账明细数据
         * Summary: 分账明细查询
         */
        public ListGeneralDivideResponse ListGeneralDivideEx(ListGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListGeneralDivideResponse>(DoRequest("1.0", "antchain.caasplatform.general.divide.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定分账方的分账明细数据
         * Summary: 分账明细查询
         */
        public async Task<ListGeneralDivideResponse> ListGeneralDivideExAsync(ListGeneralDivideRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListGeneralDivideResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.divide.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个账户下拥有的资产数量
         * Summary: 权证资产合约资产查询
         */
        public GetGeneralRightsbalanceResponse GetGeneralRightsbalance(GetGeneralRightsbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGeneralRightsbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询某个账户下拥有的资产数量
         * Summary: 权证资产合约资产查询
         */
        public async Task<GetGeneralRightsbalanceResponse> GetGeneralRightsbalanceAsync(GetGeneralRightsbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGeneralRightsbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某个账户下拥有的资产数量
         * Summary: 权证资产合约资产查询
         */
        public GetGeneralRightsbalanceResponse GetGeneralRightsbalanceEx(GetGeneralRightsbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralRightsbalanceResponse>(DoRequest("1.0", "antchain.caasplatform.general.rightsbalance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个账户下拥有的资产数量
         * Summary: 权证资产合约资产查询
         */
        public async Task<GetGeneralRightsbalanceResponse> GetGeneralRightsbalanceExAsync(GetGeneralRightsbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGeneralRightsbalanceResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.general.rightsbalance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蚂蚁区块链交易二维码
         * Summary: 获取蚂蚁区块链交易二维码
         */
        public DescribeExtendTxqrcodeResponse DescribeExtendTxqrcode(DescribeExtendTxqrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeExtendTxqrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 获取蚂蚁区块链交易二维码
         * Summary: 获取蚂蚁区块链交易二维码
         */
        public async Task<DescribeExtendTxqrcodeResponse> DescribeExtendTxqrcodeAsync(DescribeExtendTxqrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeExtendTxqrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取蚂蚁区块链交易二维码
         * Summary: 获取蚂蚁区块链交易二维码
         */
        public DescribeExtendTxqrcodeResponse DescribeExtendTxqrcodeEx(DescribeExtendTxqrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeExtendTxqrcodeResponse>(DoRequest("1.0", "antchain.caasplatform.extend.txqrcode.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蚂蚁区块链交易二维码
         * Summary: 获取蚂蚁区块链交易二维码
         */
        public async Task<DescribeExtendTxqrcodeResponse> DescribeExtendTxqrcodeExAsync(DescribeExtendTxqrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeExtendTxqrcodeResponse>(await DoRequestAsync("1.0", "antchain.caasplatform.extend.txqrcode.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
