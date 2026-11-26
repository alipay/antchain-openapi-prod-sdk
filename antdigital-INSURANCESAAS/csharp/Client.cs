// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.INSURANCESAAS.Models;

namespace AntChain.SDK.INSURANCESAAS
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Init client with Config</para>
        /// </description>
        /// 
        /// <param name="config">
        /// config contains the necessary information to create a client
        /// </param>
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config))
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.1.0"},
                        {"_prod_code", "INSURANCESAAS"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.1.0"},
                        {"_prod_code", "INSURANCESAAS"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        /// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分</para>
        /// </description>
        public UploadAntcloudInsuranceMktFileResponse UploadAntcloudInsuranceMktFile(UploadAntcloudInsuranceMktFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntcloudInsuranceMktFileEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        /// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分</para>
        /// </description>
        public async Task<UploadAntcloudInsuranceMktFileResponse> UploadAntcloudInsuranceMktFileAsync(UploadAntcloudInsuranceMktFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntcloudInsuranceMktFileExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        /// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分</para>
        /// </description>
        public UploadAntcloudInsuranceMktFileResponse UploadAntcloudInsuranceMktFileEx(UploadAntcloudInsuranceMktFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.mkt.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntcloudInsuranceMktFileResponse uploadAntcloudInsuranceMktFileResponse = new UploadAntcloudInsuranceMktFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntcloudInsuranceMktFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntcloudInsuranceMktFileResponse>(DoRequest("1.0", "antcloud.insurance.mkt.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        /// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分</para>
        /// </description>
        public async Task<UploadAntcloudInsuranceMktFileResponse> UploadAntcloudInsuranceMktFileExAsync(UploadAntcloudInsuranceMktFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.mkt.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntcloudInsuranceMktFileResponse uploadAntcloudInsuranceMktFileResponse = new UploadAntcloudInsuranceMktFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntcloudInsuranceMktFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntcloudInsuranceMktFileResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传
        /// Summary: 保险营销效果回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktEffectResponse CallbackAntcloudInsuranceMktEffect(CallbackAntcloudInsuranceMktEffectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntcloudInsuranceMktEffectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传
        /// Summary: 保险营销效果回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktEffectResponse> CallbackAntcloudInsuranceMktEffectAsync(CallbackAntcloudInsuranceMktEffectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntcloudInsuranceMktEffectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传
        /// Summary: 保险营销效果回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktEffectResponse CallbackAntcloudInsuranceMktEffectEx(CallbackAntcloudInsuranceMktEffectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktEffectResponse>(DoRequest("1.0", "antcloud.insurance.mkt.effect.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传
        /// Summary: 保险营销效果回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktEffectResponse> CallbackAntcloudInsuranceMktEffectExAsync(CallbackAntcloudInsuranceMktEffectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktEffectResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.effect.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传接口——媒体
        /// Summary: 保险营销效果回传接口——媒体</para>
        /// </description>
        public CallbackAntcloudInsuranceMktLiveeffectResponse CallbackAntcloudInsuranceMktLiveeffect(CallbackAntcloudInsuranceMktLiveeffectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntcloudInsuranceMktLiveeffectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传接口——媒体
        /// Summary: 保险营销效果回传接口——媒体</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktLiveeffectResponse> CallbackAntcloudInsuranceMktLiveeffectAsync(CallbackAntcloudInsuranceMktLiveeffectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntcloudInsuranceMktLiveeffectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传接口——媒体
        /// Summary: 保险营销效果回传接口——媒体</para>
        /// </description>
        public CallbackAntcloudInsuranceMktLiveeffectResponse CallbackAntcloudInsuranceMktLiveeffectEx(CallbackAntcloudInsuranceMktLiveeffectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktLiveeffectResponse>(DoRequest("1.0", "antcloud.insurance.mkt.liveeffect.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销效果回传接口——媒体
        /// Summary: 保险营销效果回传接口——媒体</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktLiveeffectResponse> CallbackAntcloudInsuranceMktLiveeffectExAsync(CallbackAntcloudInsuranceMktLiveeffectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktLiveeffectResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.liveeffect.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险实时营销提交
        /// Summary: 保险实时营销提交</para>
        /// </description>
        public ApplyAntcloudInsuranceMktRealtimemktResponse ApplyAntcloudInsuranceMktRealtimemkt(ApplyAntcloudInsuranceMktRealtimemktRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntcloudInsuranceMktRealtimemktEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险实时营销提交
        /// Summary: 保险实时营销提交</para>
        /// </description>
        public async Task<ApplyAntcloudInsuranceMktRealtimemktResponse> ApplyAntcloudInsuranceMktRealtimemktAsync(ApplyAntcloudInsuranceMktRealtimemktRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntcloudInsuranceMktRealtimemktExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险实时营销提交
        /// Summary: 保险实时营销提交</para>
        /// </description>
        public ApplyAntcloudInsuranceMktRealtimemktResponse ApplyAntcloudInsuranceMktRealtimemktEx(ApplyAntcloudInsuranceMktRealtimemktRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudInsuranceMktRealtimemktResponse>(DoRequest("1.0", "antcloud.insurance.mkt.realtimemkt.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险实时营销提交
        /// Summary: 保险实时营销提交</para>
        /// </description>
        public async Task<ApplyAntcloudInsuranceMktRealtimemktResponse> ApplyAntcloudInsuranceMktRealtimemktExAsync(ApplyAntcloudInsuranceMktRealtimemktRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudInsuranceMktRealtimemktResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.realtimemkt.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保司营销监测数据回传
        /// Summary: 保司营销监测数据回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktMonitordataResponse CallbackAntcloudInsuranceMktMonitordata(CallbackAntcloudInsuranceMktMonitordataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntcloudInsuranceMktMonitordataEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保司营销监测数据回传
        /// Summary: 保司营销监测数据回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktMonitordataResponse> CallbackAntcloudInsuranceMktMonitordataAsync(CallbackAntcloudInsuranceMktMonitordataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntcloudInsuranceMktMonitordataExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保司营销监测数据回传
        /// Summary: 保司营销监测数据回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktMonitordataResponse CallbackAntcloudInsuranceMktMonitordataEx(CallbackAntcloudInsuranceMktMonitordataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktMonitordataResponse>(DoRequest("1.0", "antcloud.insurance.mkt.monitordata.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保司营销监测数据回传
        /// Summary: 保司营销监测数据回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktMonitordataResponse> CallbackAntcloudInsuranceMktMonitordataExAsync(CallbackAntcloudInsuranceMktMonitordataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktMonitordataResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.monitordata.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 媒体点击统计数据回传
        /// Summary: 媒体点击统计数据回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktMediastatisticaldataResponse CallbackAntcloudInsuranceMktMediastatisticaldata(CallbackAntcloudInsuranceMktMediastatisticaldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntcloudInsuranceMktMediastatisticaldataEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 媒体点击统计数据回传
        /// Summary: 媒体点击统计数据回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktMediastatisticaldataResponse> CallbackAntcloudInsuranceMktMediastatisticaldataAsync(CallbackAntcloudInsuranceMktMediastatisticaldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntcloudInsuranceMktMediastatisticaldataExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 媒体点击统计数据回传
        /// Summary: 媒体点击统计数据回传</para>
        /// </description>
        public CallbackAntcloudInsuranceMktMediastatisticaldataResponse CallbackAntcloudInsuranceMktMediastatisticaldataEx(CallbackAntcloudInsuranceMktMediastatisticaldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktMediastatisticaldataResponse>(DoRequest("1.0", "antcloud.insurance.mkt.mediastatisticaldata.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 媒体点击统计数据回传
        /// Summary: 媒体点击统计数据回传</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktMediastatisticaldataResponse> CallbackAntcloudInsuranceMktMediastatisticaldataExAsync(CallbackAntcloudInsuranceMktMediastatisticaldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktMediastatisticaldataResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.mediastatisticaldata.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销效果节点数据（简版）
        /// Summary: 营销效果节点数据（简版）</para>
        /// </description>
        public CallbackAntcloudInsuranceMktEffectsimpleResponse CallbackAntcloudInsuranceMktEffectsimple(CallbackAntcloudInsuranceMktEffectsimpleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntcloudInsuranceMktEffectsimpleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销效果节点数据（简版）
        /// Summary: 营销效果节点数据（简版）</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktEffectsimpleResponse> CallbackAntcloudInsuranceMktEffectsimpleAsync(CallbackAntcloudInsuranceMktEffectsimpleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntcloudInsuranceMktEffectsimpleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销效果节点数据（简版）
        /// Summary: 营销效果节点数据（简版）</para>
        /// </description>
        public CallbackAntcloudInsuranceMktEffectsimpleResponse CallbackAntcloudInsuranceMktEffectsimpleEx(CallbackAntcloudInsuranceMktEffectsimpleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktEffectsimpleResponse>(DoRequest("1.0", "antcloud.insurance.mkt.effectsimple.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销效果节点数据（简版）
        /// Summary: 营销效果节点数据（简版）</para>
        /// </description>
        public async Task<CallbackAntcloudInsuranceMktEffectsimpleResponse> CallbackAntcloudInsuranceMktEffectsimpleExAsync(CallbackAntcloudInsuranceMktEffectsimpleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntcloudInsuranceMktEffectsimpleResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.effectsimple.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销服务商人群圈选
        /// Summary: 保险营销服务商人群圈选</para>
        /// </description>
        public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse ApplyAntcloudInsuranceMktserviceproviderAudiencecircle(ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntcloudInsuranceMktserviceproviderAudiencecircleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销服务商人群圈选
        /// Summary: 保险营销服务商人群圈选</para>
        /// </description>
        public async Task<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse> ApplyAntcloudInsuranceMktserviceproviderAudiencecircleAsync(ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntcloudInsuranceMktserviceproviderAudiencecircleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销服务商人群圈选
        /// Summary: 保险营销服务商人群圈选</para>
        /// </description>
        public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse ApplyAntcloudInsuranceMktserviceproviderAudiencecircleEx(ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse>(DoRequest("1.0", "antcloud.insurance.mktserviceprovider.audiencecircle.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 保险营销服务商人群圈选
        /// Summary: 保险营销服务商人群圈选</para>
        /// </description>
        public async Task<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse> ApplyAntcloudInsuranceMktserviceproviderAudiencecircleExAsync(ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mktserviceprovider.audiencecircle.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销人群底包析出结果查询
        /// Summary: 营销人群底包析出结果查询</para>
        /// </description>
        public GetAntcloudInsuranceMktExtresulturlResponse GetAntcloudInsuranceMktExtresulturl(GetAntcloudInsuranceMktExtresulturlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntcloudInsuranceMktExtresulturlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销人群底包析出结果查询
        /// Summary: 营销人群底包析出结果查询</para>
        /// </description>
        public async Task<GetAntcloudInsuranceMktExtresulturlResponse> GetAntcloudInsuranceMktExtresulturlAsync(GetAntcloudInsuranceMktExtresulturlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntcloudInsuranceMktExtresulturlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销人群底包析出结果查询
        /// Summary: 营销人群底包析出结果查询</para>
        /// </description>
        public GetAntcloudInsuranceMktExtresulturlResponse GetAntcloudInsuranceMktExtresulturlEx(GetAntcloudInsuranceMktExtresulturlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntcloudInsuranceMktExtresulturlResponse>(DoRequest("1.0", "antcloud.insurance.mkt.extresulturl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 营销人群底包析出结果查询
        /// Summary: 营销人群底包析出结果查询</para>
        /// </description>
        public async Task<GetAntcloudInsuranceMktExtresulturlResponse> GetAntcloudInsuranceMktExtresulturlExAsync(GetAntcloudInsuranceMktExtresulturlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntcloudInsuranceMktExtresulturlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.mkt.extresulturl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商机接收-既往症人群评分-对客
        /// Summary: 商机接收-既往症人群评分-对客</para>
        /// </description>
        public ReceiveAntcloudInsuranceLeadOpportunitiesResponse ReceiveAntcloudInsuranceLeadOpportunities(ReceiveAntcloudInsuranceLeadOpportunitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReceiveAntcloudInsuranceLeadOpportunitiesEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商机接收-既往症人群评分-对客
        /// Summary: 商机接收-既往症人群评分-对客</para>
        /// </description>
        public async Task<ReceiveAntcloudInsuranceLeadOpportunitiesResponse> ReceiveAntcloudInsuranceLeadOpportunitiesAsync(ReceiveAntcloudInsuranceLeadOpportunitiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReceiveAntcloudInsuranceLeadOpportunitiesExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商机接收-既往症人群评分-对客
        /// Summary: 商机接收-既往症人群评分-对客</para>
        /// </description>
        public ReceiveAntcloudInsuranceLeadOpportunitiesResponse ReceiveAntcloudInsuranceLeadOpportunitiesEx(ReceiveAntcloudInsuranceLeadOpportunitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.lead.opportunities.receive",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ReceiveAntcloudInsuranceLeadOpportunitiesResponse receiveAntcloudInsuranceLeadOpportunitiesResponse = new ReceiveAntcloudInsuranceLeadOpportunitiesResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return receiveAntcloudInsuranceLeadOpportunitiesResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveAntcloudInsuranceLeadOpportunitiesResponse>(DoRequest("1.0", "antcloud.insurance.lead.opportunities.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商机接收-既往症人群评分-对客
        /// Summary: 商机接收-既往症人群评分-对客</para>
        /// </description>
        public async Task<ReceiveAntcloudInsuranceLeadOpportunitiesResponse> ReceiveAntcloudInsuranceLeadOpportunitiesExAsync(ReceiveAntcloudInsuranceLeadOpportunitiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.lead.opportunities.receive",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ReceiveAntcloudInsuranceLeadOpportunitiesResponse receiveAntcloudInsuranceLeadOpportunitiesResponse = new ReceiveAntcloudInsuranceLeadOpportunitiesResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return receiveAntcloudInsuranceLeadOpportunitiesResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveAntcloudInsuranceLeadOpportunitiesResponse>(await DoRequestAsync("1.0", "antcloud.insurance.lead.opportunities.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 既往症线索供给方评分结果文件回传
        /// Summary: 既往症线索供给方评分结果文件回传</para>
        /// </description>
        public PostbackAntcloudInsuranceLeadReceiveResponse PostbackAntcloudInsuranceLeadReceive(PostbackAntcloudInsuranceLeadReceiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PostbackAntcloudInsuranceLeadReceiveEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 既往症线索供给方评分结果文件回传
        /// Summary: 既往症线索供给方评分结果文件回传</para>
        /// </description>
        public async Task<PostbackAntcloudInsuranceLeadReceiveResponse> PostbackAntcloudInsuranceLeadReceiveAsync(PostbackAntcloudInsuranceLeadReceiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PostbackAntcloudInsuranceLeadReceiveExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 既往症线索供给方评分结果文件回传
        /// Summary: 既往症线索供给方评分结果文件回传</para>
        /// </description>
        public PostbackAntcloudInsuranceLeadReceiveResponse PostbackAntcloudInsuranceLeadReceiveEx(PostbackAntcloudInsuranceLeadReceiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.lead.receive.postback",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PostbackAntcloudInsuranceLeadReceiveResponse postbackAntcloudInsuranceLeadReceiveResponse = new PostbackAntcloudInsuranceLeadReceiveResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return postbackAntcloudInsuranceLeadReceiveResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PostbackAntcloudInsuranceLeadReceiveResponse>(DoRequest("1.0", "antcloud.insurance.lead.receive.postback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 既往症线索供给方评分结果文件回传
        /// Summary: 既往症线索供给方评分结果文件回传</para>
        /// </description>
        public async Task<PostbackAntcloudInsuranceLeadReceiveResponse> PostbackAntcloudInsuranceLeadReceiveExAsync(PostbackAntcloudInsuranceLeadReceiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.insurance.lead.receive.postback",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PostbackAntcloudInsuranceLeadReceiveResponse postbackAntcloudInsuranceLeadReceiveResponse = new PostbackAntcloudInsuranceLeadReceiveResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return postbackAntcloudInsuranceLeadReceiveResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PostbackAntcloudInsuranceLeadReceiveResponse>(await DoRequestAsync("1.0", "antcloud.insurance.lead.receive.postback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
