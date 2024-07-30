// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0
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
                        {"sdk_version", "2.0.2"},
                        {"_prod_code", "ak_320bc483f2434f39a3af9ec9f04d3cc0"},
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
                        {"sdk_version", "2.0.2"},
                        {"_prod_code", "ak_320bc483f2434f39a3af9ec9f04d3cc0"},
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
         * Description: 发起签约调用接口
         * Summary: 发起签约
         */
        public SignAntsaasStaffingcContractSendResponse SignAntsaasStaffingcContractSend(SignAntsaasStaffingcContractSendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignAntsaasStaffingcContractSendEx(request, headers, runtime);
        }

        /**
         * Description: 发起签约调用接口
         * Summary: 发起签约
         */
        public async Task<SignAntsaasStaffingcContractSendResponse> SignAntsaasStaffingcContractSendAsync(SignAntsaasStaffingcContractSendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignAntsaasStaffingcContractSendExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起签约调用接口
         * Summary: 发起签约
         */
        public SignAntsaasStaffingcContractSendResponse SignAntsaasStaffingcContractSendEx(SignAntsaasStaffingcContractSendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antsaas.staffingc.contract.send.sign",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SignAntsaasStaffingcContractSendResponse signAntsaasStaffingcContractSendResponse = new SignAntsaasStaffingcContractSendResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return signAntsaasStaffingcContractSendResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignAntsaasStaffingcContractSendResponse>(DoRequest("1.0", "antsaas.staffingc.contract.send.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起签约调用接口
         * Summary: 发起签约
         */
        public async Task<SignAntsaasStaffingcContractSendResponse> SignAntsaasStaffingcContractSendExAsync(SignAntsaasStaffingcContractSendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antsaas.staffingc.contract.send.sign",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SignAntsaasStaffingcContractSendResponse signAntsaasStaffingcContractSendResponse = new SignAntsaasStaffingcContractSendResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return signAntsaasStaffingcContractSendResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignAntsaasStaffingcContractSendResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.contract.send.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约结果查询
         * Summary: 查询签约结果
         */
        public QueryAntsaasStaffingcContractSignResponse QueryAntsaasStaffingcContractSign(QueryAntsaasStaffingcContractSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsaasStaffingcContractSignEx(request, headers, runtime);
        }

        /**
         * Description: 签约结果查询
         * Summary: 查询签约结果
         */
        public async Task<QueryAntsaasStaffingcContractSignResponse> QueryAntsaasStaffingcContractSignAsync(QueryAntsaasStaffingcContractSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsaasStaffingcContractSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 签约结果查询
         * Summary: 查询签约结果
         */
        public QueryAntsaasStaffingcContractSignResponse QueryAntsaasStaffingcContractSignEx(QueryAntsaasStaffingcContractSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcContractSignResponse>(DoRequest("1.0", "antsaas.staffingc.contract.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约结果查询
         * Summary: 查询签约结果
         */
        public async Task<QueryAntsaasStaffingcContractSignResponse> QueryAntsaasStaffingcContractSignExAsync(QueryAntsaasStaffingcContractSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcContractSignResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.contract.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证授权url查询接口
         * Summary: 企业认证授权url查询接口
         */
        public QueryAntsaasStaffingcEpcertificationUrlResponse QueryAntsaasStaffingcEpcertificationUrl(QueryAntsaasStaffingcEpcertificationUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsaasStaffingcEpcertificationUrlEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证授权url查询接口
         * Summary: 企业认证授权url查询接口
         */
        public async Task<QueryAntsaasStaffingcEpcertificationUrlResponse> QueryAntsaasStaffingcEpcertificationUrlAsync(QueryAntsaasStaffingcEpcertificationUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsaasStaffingcEpcertificationUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证授权url查询接口
         * Summary: 企业认证授权url查询接口
         */
        public QueryAntsaasStaffingcEpcertificationUrlResponse QueryAntsaasStaffingcEpcertificationUrlEx(QueryAntsaasStaffingcEpcertificationUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcEpcertificationUrlResponse>(DoRequest("1.0", "antsaas.staffingc.epcertification.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证授权url查询接口
         * Summary: 企业认证授权url查询接口
         */
        public async Task<QueryAntsaasStaffingcEpcertificationUrlResponse> QueryAntsaasStaffingcEpcertificationUrlExAsync(QueryAntsaasStaffingcEpcertificationUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcEpcertificationUrlResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.epcertification.url.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证创建接口
         * Summary: 企业认证创建接口
         */
        public CreateAntsaasStaffingcEpcertificationAuthorizeResponse CreateAntsaasStaffingcEpcertificationAuthorize(CreateAntsaasStaffingcEpcertificationAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntsaasStaffingcEpcertificationAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证创建接口
         * Summary: 企业认证创建接口
         */
        public async Task<CreateAntsaasStaffingcEpcertificationAuthorizeResponse> CreateAntsaasStaffingcEpcertificationAuthorizeAsync(CreateAntsaasStaffingcEpcertificationAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntsaasStaffingcEpcertificationAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证创建接口
         * Summary: 企业认证创建接口
         */
        public CreateAntsaasStaffingcEpcertificationAuthorizeResponse CreateAntsaasStaffingcEpcertificationAuthorizeEx(CreateAntsaasStaffingcEpcertificationAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntsaasStaffingcEpcertificationAuthorizeResponse>(DoRequest("1.0", "antsaas.staffingc.epcertification.authorize.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证创建接口
         * Summary: 企业认证创建接口
         */
        public async Task<CreateAntsaasStaffingcEpcertificationAuthorizeResponse> CreateAntsaasStaffingcEpcertificationAuthorizeExAsync(CreateAntsaasStaffingcEpcertificationAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntsaasStaffingcEpcertificationAuthorizeResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.epcertification.authorize.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证风险查询接口
         * Summary: 企业认证风险查询接口
         */
        public QueryAntsaasStaffingcEpcertificationRiskResponse QueryAntsaasStaffingcEpcertificationRisk(QueryAntsaasStaffingcEpcertificationRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsaasStaffingcEpcertificationRiskEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证风险查询接口
         * Summary: 企业认证风险查询接口
         */
        public async Task<QueryAntsaasStaffingcEpcertificationRiskResponse> QueryAntsaasStaffingcEpcertificationRiskAsync(QueryAntsaasStaffingcEpcertificationRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsaasStaffingcEpcertificationRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证风险查询接口
         * Summary: 企业认证风险查询接口
         */
        public QueryAntsaasStaffingcEpcertificationRiskResponse QueryAntsaasStaffingcEpcertificationRiskEx(QueryAntsaasStaffingcEpcertificationRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcEpcertificationRiskResponse>(DoRequest("1.0", "antsaas.staffingc.epcertification.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证风险查询接口
         * Summary: 企业认证风险查询接口
         */
        public async Task<QueryAntsaasStaffingcEpcertificationRiskResponse> QueryAntsaasStaffingcEpcertificationRiskExAsync(QueryAntsaasStaffingcEpcertificationRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcEpcertificationRiskResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.epcertification.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取保险签约认证连接
         * Summary: 获取保险签约认证连接
         */
        public ApplyAntsaasStaffingcInsureSignurlResponse ApplyAntsaasStaffingcInsureSignurl(ApplyAntsaasStaffingcInsureSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntsaasStaffingcInsureSignurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取保险签约认证连接
         * Summary: 获取保险签约认证连接
         */
        public async Task<ApplyAntsaasStaffingcInsureSignurlResponse> ApplyAntsaasStaffingcInsureSignurlAsync(ApplyAntsaasStaffingcInsureSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntsaasStaffingcInsureSignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取保险签约认证连接
         * Summary: 获取保险签约认证连接
         */
        public ApplyAntsaasStaffingcInsureSignurlResponse ApplyAntsaasStaffingcInsureSignurlEx(ApplyAntsaasStaffingcInsureSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntsaasStaffingcInsureSignurlResponse>(DoRequest("1.0", "antsaas.staffingc.insure.signurl.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取保险签约认证连接
         * Summary: 获取保险签约认证连接
         */
        public async Task<ApplyAntsaasStaffingcInsureSignurlResponse> ApplyAntsaasStaffingcInsureSignurlExAsync(ApplyAntsaasStaffingcInsureSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntsaasStaffingcInsureSignurlResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.insure.signurl.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可投保的保险产品
         * Summary: 查询可投保的保险产品
         */
        public ListAntsaasStaffingcInsureProductResponse ListAntsaasStaffingcInsureProduct(ListAntsaasStaffingcInsureProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntsaasStaffingcInsureProductEx(request, headers, runtime);
        }

        /**
         * Description: 查询可投保的保险产品
         * Summary: 查询可投保的保险产品
         */
        public async Task<ListAntsaasStaffingcInsureProductResponse> ListAntsaasStaffingcInsureProductAsync(ListAntsaasStaffingcInsureProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntsaasStaffingcInsureProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可投保的保险产品
         * Summary: 查询可投保的保险产品
         */
        public ListAntsaasStaffingcInsureProductResponse ListAntsaasStaffingcInsureProductEx(ListAntsaasStaffingcInsureProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntsaasStaffingcInsureProductResponse>(DoRequest("1.0", "antsaas.staffingc.insure.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可投保的保险产品
         * Summary: 查询可投保的保险产品
         */
        public async Task<ListAntsaasStaffingcInsureProductResponse> ListAntsaasStaffingcInsureProductExAsync(ListAntsaasStaffingcInsureProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntsaasStaffingcInsureProductResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.insure.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询保险产品价格相关信息
         * Summary: 查询保险产品价格相关信息
         */
        public QueryAntsaasStaffingcInsurePriceResponse QueryAntsaasStaffingcInsurePrice(QueryAntsaasStaffingcInsurePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsaasStaffingcInsurePriceEx(request, headers, runtime);
        }

        /**
         * Description: 查询保险产品价格相关信息
         * Summary: 查询保险产品价格相关信息
         */
        public async Task<QueryAntsaasStaffingcInsurePriceResponse> QueryAntsaasStaffingcInsurePriceAsync(QueryAntsaasStaffingcInsurePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsaasStaffingcInsurePriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询保险产品价格相关信息
         * Summary: 查询保险产品价格相关信息
         */
        public QueryAntsaasStaffingcInsurePriceResponse QueryAntsaasStaffingcInsurePriceEx(QueryAntsaasStaffingcInsurePriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcInsurePriceResponse>(DoRequest("1.0", "antsaas.staffingc.insure.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询保险产品价格相关信息
         * Summary: 查询保险产品价格相关信息
         */
        public async Task<QueryAntsaasStaffingcInsurePriceResponse> QueryAntsaasStaffingcInsurePriceExAsync(QueryAntsaasStaffingcInsurePriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcInsurePriceResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.insure.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行投保
         * Summary: 执行投保
         */
        public SendAntsaasStaffingcInsureResponse SendAntsaasStaffingcInsure(SendAntsaasStaffingcInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendAntsaasStaffingcInsureEx(request, headers, runtime);
        }

        /**
         * Description: 执行投保
         * Summary: 执行投保
         */
        public async Task<SendAntsaasStaffingcInsureResponse> SendAntsaasStaffingcInsureAsync(SendAntsaasStaffingcInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendAntsaasStaffingcInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行投保
         * Summary: 执行投保
         */
        public SendAntsaasStaffingcInsureResponse SendAntsaasStaffingcInsureEx(SendAntsaasStaffingcInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntsaasStaffingcInsureResponse>(DoRequest("1.0", "antsaas.staffingc.insure.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行投保
         * Summary: 执行投保
         */
        public async Task<SendAntsaasStaffingcInsureResponse> SendAntsaasStaffingcInsureExAsync(SendAntsaasStaffingcInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntsaasStaffingcInsureResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.insure.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退保接口
         * Summary: 退保接口
         */
        public SendAntsaasStaffingcInsureRefundResponse SendAntsaasStaffingcInsureRefund(SendAntsaasStaffingcInsureRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendAntsaasStaffingcInsureRefundEx(request, headers, runtime);
        }

        /**
         * Description: 退保接口
         * Summary: 退保接口
         */
        public async Task<SendAntsaasStaffingcInsureRefundResponse> SendAntsaasStaffingcInsureRefundAsync(SendAntsaasStaffingcInsureRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendAntsaasStaffingcInsureRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 退保接口
         * Summary: 退保接口
         */
        public SendAntsaasStaffingcInsureRefundResponse SendAntsaasStaffingcInsureRefundEx(SendAntsaasStaffingcInsureRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntsaasStaffingcInsureRefundResponse>(DoRequest("1.0", "antsaas.staffingc.insure.refund.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退保接口
         * Summary: 退保接口
         */
        public async Task<SendAntsaasStaffingcInsureRefundResponse> SendAntsaasStaffingcInsureRefundExAsync(SendAntsaasStaffingcInsureRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntsaasStaffingcInsureRefundResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.insure.refund.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: CA电子签
         * Summary: CA电子签约
         */
        public SignAntsaasStaffingcContractCaResponse SignAntsaasStaffingcContractCa(SignAntsaasStaffingcContractCaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignAntsaasStaffingcContractCaEx(request, headers, runtime);
        }

        /**
         * Description: CA电子签
         * Summary: CA电子签约
         */
        public async Task<SignAntsaasStaffingcContractCaResponse> SignAntsaasStaffingcContractCaAsync(SignAntsaasStaffingcContractCaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignAntsaasStaffingcContractCaExAsync(request, headers, runtime);
        }

        /**
         * Description: CA电子签
         * Summary: CA电子签约
         */
        public SignAntsaasStaffingcContractCaResponse SignAntsaasStaffingcContractCaEx(SignAntsaasStaffingcContractCaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antsaas.staffingc.contract.ca.sign",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SignAntsaasStaffingcContractCaResponse signAntsaasStaffingcContractCaResponse = new SignAntsaasStaffingcContractCaResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return signAntsaasStaffingcContractCaResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignAntsaasStaffingcContractCaResponse>(DoRequest("1.0", "antsaas.staffingc.contract.ca.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: CA电子签
         * Summary: CA电子签约
         */
        public async Task<SignAntsaasStaffingcContractCaResponse> SignAntsaasStaffingcContractCaExAsync(SignAntsaasStaffingcContractCaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antsaas.staffingc.contract.ca.sign",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SignAntsaasStaffingcContractCaResponse signAntsaasStaffingcContractCaResponse = new SignAntsaasStaffingcContractCaResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return signAntsaasStaffingcContractCaResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignAntsaasStaffingcContractCaResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.contract.ca.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签约结果
         * Summary: 查询签约结果
         */
        public QueryAntsaasStaffingcContractCaResponse QueryAntsaasStaffingcContractCa(QueryAntsaasStaffingcContractCaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsaasStaffingcContractCaEx(request, headers, runtime);
        }

        /**
         * Description: 查询签约结果
         * Summary: 查询签约结果
         */
        public async Task<QueryAntsaasStaffingcContractCaResponse> QueryAntsaasStaffingcContractCaAsync(QueryAntsaasStaffingcContractCaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsaasStaffingcContractCaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签约结果
         * Summary: 查询签约结果
         */
        public QueryAntsaasStaffingcContractCaResponse QueryAntsaasStaffingcContractCaEx(QueryAntsaasStaffingcContractCaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcContractCaResponse>(DoRequest("1.0", "antsaas.staffingc.contract.ca.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签约结果
         * Summary: 查询签约结果
         */
        public async Task<QueryAntsaasStaffingcContractCaResponse> QueryAntsaasStaffingcContractCaExAsync(QueryAntsaasStaffingcContractCaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsaasStaffingcContractCaResponse>(await DoRequestAsync("1.0", "antsaas.staffingc.contract.ca.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
