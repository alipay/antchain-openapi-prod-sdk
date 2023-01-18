// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MYTC.Models;

namespace AntChain.SDK.MYTC
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
                        {"sdk_version", "1.2.7"},
                        {"_prod_code", "MYTC"},
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
                        {"sdk_version", "1.2.7"},
                        {"_prod_code", "MYTC"},
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
         * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
         * Summary: 二维码防伪识别
         */
        public RecognizeAntiQrcodeacResponse RecognizeAntiQrcodeac(RecognizeAntiQrcodeacRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeAntiQrcodeacEx(request, headers, runtime);
        }

        /**
         * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
         * Summary: 二维码防伪识别
         */
        public async Task<RecognizeAntiQrcodeacResponse> RecognizeAntiQrcodeacAsync(RecognizeAntiQrcodeacRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeAntiQrcodeacExAsync(request, headers, runtime);
        }

        /**
         * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
         * Summary: 二维码防伪识别
         */
        public RecognizeAntiQrcodeacResponse RecognizeAntiQrcodeacEx(RecognizeAntiQrcodeacRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.mytc.anti.qrcodeac.recognize",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    RecognizeAntiQrcodeacResponse recognizeAntiQrcodeacResponse = new RecognizeAntiQrcodeacResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return recognizeAntiQrcodeacResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeAntiQrcodeacResponse>(DoRequest("1.0", "antchain.mytc.anti.qrcodeac.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
         * Summary: 二维码防伪识别
         */
        public async Task<RecognizeAntiQrcodeacResponse> RecognizeAntiQrcodeacExAsync(RecognizeAntiQrcodeacRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.mytc.anti.qrcodeac.recognize",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    RecognizeAntiQrcodeacResponse recognizeAntiQrcodeacResponse = new RecognizeAntiQrcodeacResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return recognizeAntiQrcodeacResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeAntiQrcodeacResponse>(await DoRequestAsync("1.0", "antchain.mytc.anti.qrcodeac.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码平台防伪底图上传，初始化上传记录
         * Summary: 防伪码平台防伪底图上传初始化
         */
        public InitAntiImagesyncResponse InitAntiImagesync(InitAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitAntiImagesyncEx(request, headers, runtime);
        }

        /**
         * Description: 防伪码平台防伪底图上传，初始化上传记录
         * Summary: 防伪码平台防伪底图上传初始化
         */
        public async Task<InitAntiImagesyncResponse> InitAntiImagesyncAsync(InitAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitAntiImagesyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 防伪码平台防伪底图上传，初始化上传记录
         * Summary: 防伪码平台防伪底图上传初始化
         */
        public InitAntiImagesyncResponse InitAntiImagesyncEx(InitAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntiImagesyncResponse>(DoRequest("1.0", "antchain.mytc.anti.imagesync.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码平台防伪底图上传，初始化上传记录
         * Summary: 防伪码平台防伪底图上传初始化
         */
        public async Task<InitAntiImagesyncResponse> InitAntiImagesyncExAsync(InitAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntiImagesyncResponse>(await DoRequestAsync("1.0", "antchain.mytc.anti.imagesync.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码图片上传
         * Summary: 防伪码平台防伪码图片上传
         */
        public UploadAntiImagesyncResponse UploadAntiImagesync(UploadAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntiImagesyncEx(request, headers, runtime);
        }

        /**
         * Description: 防伪码图片上传
         * Summary: 防伪码平台防伪码图片上传
         */
        public async Task<UploadAntiImagesyncResponse> UploadAntiImagesyncAsync(UploadAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntiImagesyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 防伪码图片上传
         * Summary: 防伪码平台防伪码图片上传
         */
        public UploadAntiImagesyncResponse UploadAntiImagesyncEx(UploadAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.mytc.anti.imagesync.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntiImagesyncResponse uploadAntiImagesyncResponse = new UploadAntiImagesyncResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntiImagesyncResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntiImagesyncResponse>(DoRequest("1.0", "antchain.mytc.anti.imagesync.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码图片上传
         * Summary: 防伪码平台防伪码图片上传
         */
        public async Task<UploadAntiImagesyncResponse> UploadAntiImagesyncExAsync(UploadAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.mytc.anti.imagesync.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntiImagesyncResponse uploadAntiImagesyncResponse = new UploadAntiImagesyncResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntiImagesyncResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntiImagesyncResponse>(await DoRequestAsync("1.0", "antchain.mytc.anti.imagesync.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码平台防伪底图上传完成
         * Summary: 防伪码平台防伪底图上传完成
         */
        public FinishAntiImagesyncResponse FinishAntiImagesync(FinishAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishAntiImagesyncEx(request, headers, runtime);
        }

        /**
         * Description: 防伪码平台防伪底图上传完成
         * Summary: 防伪码平台防伪底图上传完成
         */
        public async Task<FinishAntiImagesyncResponse> FinishAntiImagesyncAsync(FinishAntiImagesyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishAntiImagesyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 防伪码平台防伪底图上传完成
         * Summary: 防伪码平台防伪底图上传完成
         */
        public FinishAntiImagesyncResponse FinishAntiImagesyncEx(FinishAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishAntiImagesyncResponse>(DoRequest("1.0", "antchain.mytc.anti.imagesync.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 防伪码平台防伪底图上传完成
         * Summary: 防伪码平台防伪底图上传完成
         */
        public async Task<FinishAntiImagesyncResponse> FinishAntiImagesyncExAsync(FinishAntiImagesyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishAntiImagesyncResponse>(await DoRequestAsync("1.0", "antchain.mytc.anti.imagesync.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自研二维码生成
         * Summary: 二维码防伪图片生成
         */
        public CreateAntiQrcodeimageResponse CreateAntiQrcodeimage(CreateAntiQrcodeimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntiQrcodeimageEx(request, headers, runtime);
        }

        /**
         * Description: 自研二维码生成
         * Summary: 二维码防伪图片生成
         */
        public async Task<CreateAntiQrcodeimageResponse> CreateAntiQrcodeimageAsync(CreateAntiQrcodeimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntiQrcodeimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 自研二维码生成
         * Summary: 二维码防伪图片生成
         */
        public CreateAntiQrcodeimageResponse CreateAntiQrcodeimageEx(CreateAntiQrcodeimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntiQrcodeimageResponse>(DoRequest("1.0", "antchain.mytc.anti.qrcodeimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自研二维码生成
         * Summary: 二维码防伪图片生成
         */
        public async Task<CreateAntiQrcodeimageResponse> CreateAntiQrcodeimageExAsync(CreateAntiQrcodeimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntiQrcodeimageResponse>(await DoRequestAsync("1.0", "antchain.mytc.anti.qrcodeimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码注册
         */
        public CreateCodeRegistrationResponse CreateCodeRegistration(CreateCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCodeRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码注册
         */
        public async Task<CreateCodeRegistrationResponse> CreateCodeRegistrationAsync(CreateCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCodeRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码注册
         */
        public CreateCodeRegistrationResponse CreateCodeRegistrationEx(CreateCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCodeRegistrationResponse>(DoRequest("1.0", "antchain.mytc.code.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码注册
         */
        public async Task<CreateCodeRegistrationResponse> CreateCodeRegistrationExAsync(CreateCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCodeRegistrationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.registration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
         * Summary: 溯源码注册记录删除
         */
        public DeleteCodeRegistrationResponse DeleteCodeRegistration(DeleteCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCodeRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
         * Summary: 溯源码注册记录删除
         */
        public async Task<DeleteCodeRegistrationResponse> DeleteCodeRegistrationAsync(DeleteCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCodeRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
         * Summary: 溯源码注册记录删除
         */
        public DeleteCodeRegistrationResponse DeleteCodeRegistrationEx(DeleteCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCodeRegistrationResponse>(DoRequest("1.0", "antchain.mytc.code.registration.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
         * Summary: 溯源码注册记录删除
         */
        public async Task<DeleteCodeRegistrationResponse> DeleteCodeRegistrationExAsync(DeleteCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCodeRegistrationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.registration.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        
        
         * Summary: 溯源码关联信息
         */
        public CreateCodeRelationResponse CreateCodeRelation(CreateCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCodeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        
        
         * Summary: 溯源码关联信息
         */
        public async Task<CreateCodeRelationResponse> CreateCodeRelationAsync(CreateCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCodeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        
        
         * Summary: 溯源码关联信息
         */
        public CreateCodeRelationResponse CreateCodeRelationEx(CreateCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCodeRelationResponse>(DoRequest("1.0", "antchain.mytc.code.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        
        
         * Summary: 溯源码关联信息
         */
        public async Task<CreateCodeRelationResponse> CreateCodeRelationExAsync(CreateCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCodeRelationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
         * Summary: 溯源码关联信息删除
         */
        public DeleteCodeRelationResponse DeleteCodeRelation(DeleteCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCodeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
         * Summary: 溯源码关联信息删除
         */
        public async Task<DeleteCodeRelationResponse> DeleteCodeRelationAsync(DeleteCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCodeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
         * Summary: 溯源码关联信息删除
         */
        public DeleteCodeRelationResponse DeleteCodeRelationEx(DeleteCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCodeRelationResponse>(DoRequest("1.0", "antchain.mytc.code.relation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
         * Summary: 溯源码关联信息删除
         */
        public async Task<DeleteCodeRelationResponse> DeleteCodeRelationExAsync(DeleteCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCodeRelationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.relation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        
         * Summary: 溯源码查询
         */
        public QueryCodeCombineResponse QueryCodeCombine(QueryCodeCombineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCodeCombineEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        
         * Summary: 溯源码查询
         */
        public async Task<QueryCodeCombineResponse> QueryCodeCombineAsync(QueryCodeCombineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCodeCombineExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        
         * Summary: 溯源码查询
         */
        public QueryCodeCombineResponse QueryCodeCombineEx(QueryCodeCombineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeCombineResponse>(DoRequest("1.0", "antchain.mytc.code.combine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        
         * Summary: 溯源码查询
         */
        public async Task<QueryCodeCombineResponse> QueryCodeCombineExAsync(QueryCodeCombineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeCombineResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.combine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册历史查询
         * Summary: 溯源码注册历史查询
         */
        public QueryCodeRegistrationResponse QueryCodeRegistration(QueryCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCodeRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册历史查询
         * Summary: 溯源码注册历史查询
         */
        public async Task<QueryCodeRegistrationResponse> QueryCodeRegistrationAsync(QueryCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCodeRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册历史查询
         * Summary: 溯源码注册历史查询
         */
        public QueryCodeRegistrationResponse QueryCodeRegistrationEx(QueryCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeRegistrationResponse>(DoRequest("1.0", "antchain.mytc.code.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册历史查询
         * Summary: 溯源码注册历史查询
         */
        public async Task<QueryCodeRegistrationResponse> QueryCodeRegistrationExAsync(QueryCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeRegistrationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码关联历史信息查询
         * Summary: 溯源码关联历史信息查询
         */
        public QueryCodeRelationResponse QueryCodeRelation(QueryCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCodeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码关联历史信息查询
         * Summary: 溯源码关联历史信息查询
         */
        public async Task<QueryCodeRelationResponse> QueryCodeRelationAsync(QueryCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCodeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码关联历史信息查询
         * Summary: 溯源码关联历史信息查询
         */
        public QueryCodeRelationResponse QueryCodeRelationEx(QueryCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeRelationResponse>(DoRequest("1.0", "antchain.mytc.code.relation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码关联历史信息查询
         * Summary: 溯源码关联历史信息查询
         */
        public async Task<QueryCodeRelationResponse> QueryCodeRelationExAsync(QueryCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeRelationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.relation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
         * Summary: 原生存证
         */
        public AddCodeDepositResponse AddCodeDeposit(AddCodeDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCodeDepositEx(request, headers, runtime);
        }

        /**
         * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
         * Summary: 原生存证
         */
        public async Task<AddCodeDepositResponse> AddCodeDepositAsync(AddCodeDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCodeDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
         * Summary: 原生存证
         */
        public AddCodeDepositResponse AddCodeDepositEx(AddCodeDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeDepositResponse>(DoRequest("1.0", "antchain.mytc.code.deposit.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
         * Summary: 原生存证
         */
        public async Task<AddCodeDepositResponse> AddCodeDepositExAsync(AddCodeDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeDepositResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.deposit.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上交易详情查询
         * Summary: 链上交易证书查询
         */
        public QueryCodeCertResponse QueryCodeCert(QueryCodeCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCodeCertEx(request, headers, runtime);
        }

        /**
         * Description: 链上交易详情查询
         * Summary: 链上交易证书查询
         */
        public async Task<QueryCodeCertResponse> QueryCodeCertAsync(QueryCodeCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCodeCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上交易详情查询
         * Summary: 链上交易证书查询
         */
        public QueryCodeCertResponse QueryCodeCertEx(QueryCodeCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeCertResponse>(DoRequest("1.0", "antchain.mytc.code.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上交易详情查询
         * Summary: 链上交易证书查询
         */
        public async Task<QueryCodeCertResponse> QueryCodeCertExAsync(QueryCodeCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeCertResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
        若填写starTime和endTime，统计时间范围不能超过7天。
         * Summary: 溯源统计信息查询
         */
        public QueryCodeStatResponse QueryCodeStat(QueryCodeStatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCodeStatEx(request, headers, runtime);
        }

        /**
         * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
        若填写starTime和endTime，统计时间范围不能超过7天。
         * Summary: 溯源统计信息查询
         */
        public async Task<QueryCodeStatResponse> QueryCodeStatAsync(QueryCodeStatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCodeStatExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
        若填写starTime和endTime，统计时间范围不能超过7天。
         * Summary: 溯源统计信息查询
         */
        public QueryCodeStatResponse QueryCodeStatEx(QueryCodeStatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeStatResponse>(DoRequest("1.0", "antchain.mytc.code.stat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
        若填写starTime和endTime，统计时间范围不能超过7天。
         * Summary: 溯源统计信息查询
         */
        public async Task<QueryCodeStatResponse> QueryCodeStatExAsync(QueryCodeStatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCodeStatResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.stat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码(可重复)注册
         */
        public AddCodeRegistrationResponse AddCodeRegistration(AddCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCodeRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码(可重复)注册
         */
        public async Task<AddCodeRegistrationResponse> AddCodeRegistrationAsync(AddCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCodeRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码(可重复)注册
         */
        public AddCodeRegistrationResponse AddCodeRegistrationEx(AddCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeRegistrationResponse>(DoRequest("1.0", "antchain.mytc.code.registration.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
         * Summary: 溯源码(可重复)注册
         */
        public async Task<AddCodeRegistrationResponse> AddCodeRegistrationExAsync(AddCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeRegistrationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.registration.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新已注册的溯源信息
         * Summary: 溯源注册信息更新
         */
        public UpdateCodeRegistrationResponse UpdateCodeRegistration(UpdateCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCodeRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 更新已注册的溯源信息
         * Summary: 溯源注册信息更新
         */
        public async Task<UpdateCodeRegistrationResponse> UpdateCodeRegistrationAsync(UpdateCodeRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCodeRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新已注册的溯源信息
         * Summary: 溯源注册信息更新
         */
        public UpdateCodeRegistrationResponse UpdateCodeRegistrationEx(UpdateCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCodeRegistrationResponse>(DoRequest("1.0", "antchain.mytc.code.registration.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新已注册的溯源信息
         * Summary: 溯源注册信息更新
         */
        public async Task<UpdateCodeRegistrationResponse> UpdateCodeRegistrationExAsync(UpdateCodeRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCodeRegistrationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.registration.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
         * Summary: 溯源码(可重复)关联信息
         */
        public AddCodeRelationResponse AddCodeRelation(AddCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCodeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
         * Summary: 溯源码(可重复)关联信息
         */
        public async Task<AddCodeRelationResponse> AddCodeRelationAsync(AddCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCodeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
         * Summary: 溯源码(可重复)关联信息
         */
        public AddCodeRelationResponse AddCodeRelationEx(AddCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeRelationResponse>(DoRequest("1.0", "antchain.mytc.code.relation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
         * Summary: 溯源码(可重复)关联信息
         */
        public async Task<AddCodeRelationResponse> AddCodeRelationExAsync(AddCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCodeRelationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.relation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新绑定到溯源码上的关联信息。
         * Summary: 溯源码关联信息更新
         */
        public UpdateCodeRelationResponse UpdateCodeRelation(UpdateCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCodeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 更新绑定到溯源码上的关联信息。
         * Summary: 溯源码关联信息更新
         */
        public async Task<UpdateCodeRelationResponse> UpdateCodeRelationAsync(UpdateCodeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCodeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新绑定到溯源码上的关联信息。
         * Summary: 溯源码关联信息更新
         */
        public UpdateCodeRelationResponse UpdateCodeRelationEx(UpdateCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCodeRelationResponse>(DoRequest("1.0", "antchain.mytc.code.relation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新绑定到溯源码上的关联信息。
         * Summary: 溯源码关联信息更新
         */
        public async Task<UpdateCodeRelationResponse> UpdateCodeRelationExAsync(UpdateCodeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCodeRelationResponse>(await DoRequestAsync("1.0", "antchain.mytc.code.relation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码详情查询
         * Summary: 溯源码详情查询
         */
        public QueryMiniCodeResponse QueryMiniCode(QueryMiniCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMiniCodeEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码详情查询
         * Summary: 溯源码详情查询
         */
        public async Task<QueryMiniCodeResponse> QueryMiniCodeAsync(QueryMiniCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMiniCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码详情查询
         * Summary: 溯源码详情查询
         */
        public QueryMiniCodeResponse QueryMiniCodeEx(QueryMiniCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiniCodeResponse>(DoRequest("1.0", "antchain.mytc.mini.code.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码详情查询
         * Summary: 溯源码详情查询
         */
        public async Task<QueryMiniCodeResponse> QueryMiniCodeExAsync(QueryMiniCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiniCodeResponse>(await DoRequestAsync("1.0", "antchain.mytc.mini.code.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源证书查询
         * Summary: 溯源证书查询
         */
        public QueryMiniCertResponse QueryMiniCert(QueryMiniCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMiniCertEx(request, headers, runtime);
        }

        /**
         * Description: 溯源证书查询
         * Summary: 溯源证书查询
         */
        public async Task<QueryMiniCertResponse> QueryMiniCertAsync(QueryMiniCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMiniCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源证书查询
         * Summary: 溯源证书查询
         */
        public QueryMiniCertResponse QueryMiniCertEx(QueryMiniCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiniCertResponse>(DoRequest("1.0", "antchain.mytc.mini.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源证书查询
         * Summary: 溯源证书查询
         */
        public async Task<QueryMiniCertResponse> QueryMiniCertExAsync(QueryMiniCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiniCertResponse>(await DoRequestAsync("1.0", "antchain.mytc.mini.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动态秘钥NFC二维码校验
         * Summary: 动态秘钥NFC二维码校验
         */
        public VerifyMiniNfcResponse VerifyMiniNfc(VerifyMiniNfcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyMiniNfcEx(request, headers, runtime);
        }

        /**
         * Description: 动态秘钥NFC二维码校验
         * Summary: 动态秘钥NFC二维码校验
         */
        public async Task<VerifyMiniNfcResponse> VerifyMiniNfcAsync(VerifyMiniNfcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyMiniNfcExAsync(request, headers, runtime);
        }

        /**
         * Description: 动态秘钥NFC二维码校验
         * Summary: 动态秘钥NFC二维码校验
         */
        public VerifyMiniNfcResponse VerifyMiniNfcEx(VerifyMiniNfcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMiniNfcResponse>(DoRequest("1.0", "antchain.mytc.mini.nfc.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动态秘钥NFC二维码校验
         * Summary: 动态秘钥NFC二维码校验
         */
        public async Task<VerifyMiniNfcResponse> VerifyMiniNfcExAsync(VerifyMiniNfcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMiniNfcResponse>(await DoRequestAsync("1.0", "antchain.mytc.mini.nfc.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
