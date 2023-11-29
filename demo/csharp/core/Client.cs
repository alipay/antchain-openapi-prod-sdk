// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DEMO.Models;

namespace AntChain.SDK.DEMO
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
                        {"sdk_version", "1.0.230"},
                        {"_prod_code", "DEMO"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "centre-openapi.antchain.antgroup.com")},
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
                        {"sdk_version", "1.0.230"},
                        {"_prod_code", "DEMO"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "centre-openapi.antchain.antgroup.com")},
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
         * Description: 123
         * Summary: 123
         */
        public BindQweQweResponse BindQweQwe(BindQweQweRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindQweQweEx(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 123
         */
        public async Task<BindQweQweResponse> BindQweQweAsync(BindQweQweRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindQweQweExAsync(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 123
         */
        public BindQweQweResponse BindQweQweEx(BindQweQweRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindQweQweResponse>(DoRequest("1.0", "demo.qwe.qwe.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 123
         */
        public async Task<BindQweQweResponse> BindQweQweExAsync(BindQweQweRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindQweQweResponse>(await DoRequestAsync("1.0", "demo.qwe.qwe.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public BindSdfSssSssResponse BindSdfSssSss(BindSdfSssSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindSdfSssSssEx(request, headers, runtime);
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public async Task<BindSdfSssSssResponse> BindSdfSssSssAsync(BindSdfSssSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindSdfSssSssExAsync(request, headers, runtime);
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public BindSdfSssSssResponse BindSdfSssSssEx(BindSdfSssSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindSdfSssSssResponse>(DoRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sdf
         * Summary: sdf
         */
        public async Task<BindSdfSssSssResponse> BindSdfSssSssExAsync(BindSdfSssSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindSdfSssSssResponse>(await DoRequestAsync("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public StatusGatewayCheckResponse StatusGatewayCheck(StatusGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StatusGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public async Task<StatusGatewayCheckResponse> StatusGatewayCheckAsync(StatusGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StatusGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public StatusGatewayCheckResponse StatusGatewayCheckEx(StatusGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public async Task<StatusGatewayCheckResponse> StatusGatewayCheckExAsync(StatusGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当前输入的值
         * Summary: 返回输入值1
         */
        public EchoGatewayCheckResponse EchoGatewayCheck(EchoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EchoGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前输入的值
         * Summary: 返回输入值1
         */
        public async Task<EchoGatewayCheckResponse> EchoGatewayCheckAsync(EchoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EchoGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前输入的值
         * Summary: 返回输入值1
         */
        public EchoGatewayCheckResponse EchoGatewayCheckEx(EchoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.gateway.check.echo",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    EchoGatewayCheckResponse echoGatewayCheckResponse = new EchoGatewayCheckResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return echoGatewayCheckResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EchoGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当前输入的值
         * Summary: 返回输入值1
         */
        public async Task<EchoGatewayCheckResponse> EchoGatewayCheckExAsync(EchoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.gateway.check.echo",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    EchoGatewayCheckResponse echoGatewayCheckResponse = new EchoGatewayCheckResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return echoGatewayCheckResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EchoGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public QueryGatewayCheckResponse QueryGatewayCheck(QueryGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public async Task<QueryGatewayCheckResponse> QueryGatewayCheckAsync(QueryGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public QueryGatewayCheckResponse QueryGatewayCheckEx(QueryGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public async Task<QueryGatewayCheckResponse> QueryGatewayCheckExAsync(QueryGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试用aaa
         * Summary: 测试001
         */
        public QueryGatewayTestResponse QueryGatewayTest(QueryGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试用aaa
         * Summary: 测试001
         */
        public async Task<QueryGatewayTestResponse> QueryGatewayTestAsync(QueryGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试用aaa
         * Summary: 测试001
         */
        public QueryGatewayTestResponse QueryGatewayTestEx(QueryGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayTestResponse>(DoRequest("1.0", "demo.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试用aaa
         * Summary: 测试001
         */
        public async Task<QueryGatewayTestResponse> QueryGatewayTestExAsync(QueryGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayTestResponse>(await DoRequestAsync("1.0", "demo.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aaa
         * Summary: 测试demo
         */
        public QueryGatewayMyResponse QueryGatewayMy(QueryGatewayMyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayMyEx(request, headers, runtime);
        }

        /**
         * Description: aaa
         * Summary: 测试demo
         */
        public async Task<QueryGatewayMyResponse> QueryGatewayMyAsync(QueryGatewayMyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayMyExAsync(request, headers, runtime);
        }

        /**
         * Description: aaa
         * Summary: 测试demo
         */
        public QueryGatewayMyResponse QueryGatewayMyEx(QueryGatewayMyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayMyResponse>(DoRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aaa
         * Summary: 测试demo
         */
        public async Task<QueryGatewayMyResponse> QueryGatewayMyExAsync(QueryGatewayMyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayMyResponse>(await DoRequestAsync("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: s
         * Summary: ss
         */
        public BindDemoCheckEeeResponse BindDemoCheckEee(BindDemoCheckEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoCheckEeeEx(request, headers, runtime);
        }

        /**
         * Description: s
         * Summary: ss
         */
        public async Task<BindDemoCheckEeeResponse> BindDemoCheckEeeAsync(BindDemoCheckEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoCheckEeeExAsync(request, headers, runtime);
        }

        /**
         * Description: s
         * Summary: ss
         */
        public BindDemoCheckEeeResponse BindDemoCheckEeeEx(BindDemoCheckEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoCheckEeeResponse>(DoRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: s
         * Summary: ss
         */
        public async Task<BindDemoCheckEeeResponse> BindDemoCheckEeeExAsync(BindDemoCheckEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoCheckEeeResponse>(await DoRequestAsync("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public BindGatewayAbcTestResponse BindGatewayAbcTest(BindGatewayAbcTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindGatewayAbcTestEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<BindGatewayAbcTestResponse> BindGatewayAbcTestAsync(BindGatewayAbcTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindGatewayAbcTestExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public BindGatewayAbcTestResponse BindGatewayAbcTestEx(BindGatewayAbcTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindGatewayAbcTestResponse>(DoRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<BindGatewayAbcTestResponse> BindGatewayAbcTestExAsync(BindGatewayAbcTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindGatewayAbcTestResponse>(await DoRequestAsync("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public BindTestTestTestResponse BindTestTestTest(BindTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindTestTestTestEx(request, headers, runtime);
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public async Task<BindTestTestTestResponse> BindTestTestTestAsync(BindTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindTestTestTestExAsync(request, headers, runtime);
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public BindTestTestTestResponse BindTestTestTestEx(BindTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindTestTestTestResponse>(DoRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testaaa
         * Summary: test
         */
        public async Task<BindTestTestTestResponse> BindTestTestTestExAsync(BindTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindTestTestTestResponse>(await DoRequestAsync("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public QueryGatewayCheckEchotimeoutResponse QueryGatewayCheckEchotimeout(QueryGatewayCheckEchotimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayCheckEchotimeoutEx(request, headers, runtime);
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public async Task<QueryGatewayCheckEchotimeoutResponse> QueryGatewayCheckEchotimeoutAsync(QueryGatewayCheckEchotimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayCheckEchotimeoutExAsync(request, headers, runtime);
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public QueryGatewayCheckEchotimeoutResponse QueryGatewayCheckEchotimeoutEx(QueryGatewayCheckEchotimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotimeoutResponse>(DoRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public async Task<QueryGatewayCheckEchotimeoutResponse> QueryGatewayCheckEchotimeoutExAsync(QueryGatewayCheckEchotimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotimeoutResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public QueryGatewayCheckEchotenResponse QueryGatewayCheckEchoten(QueryGatewayCheckEchotenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayCheckEchotenEx(request, headers, runtime);
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public async Task<QueryGatewayCheckEchotenResponse> QueryGatewayCheckEchotenAsync(QueryGatewayCheckEchotenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayCheckEchotenExAsync(request, headers, runtime);
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public QueryGatewayCheckEchotenResponse QueryGatewayCheckEchotenEx(QueryGatewayCheckEchotenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotenResponse>(DoRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public async Task<QueryGatewayCheckEchotenResponse> QueryGatewayCheckEchotenExAsync(QueryGatewayCheckEchotenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotenResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 简介简介简介s
         * Summary: 简介简介
         */
        public QueryAdAsdAsdResponse QueryAdAsdAsd(QueryAdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAdAsdAsdEx(request, headers, runtime);
        }

        /**
         * Description: 简介简介简介s
         * Summary: 简介简介
         */
        public async Task<QueryAdAsdAsdResponse> QueryAdAsdAsdAsync(QueryAdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAdAsdAsdExAsync(request, headers, runtime);
        }

        /**
         * Description: 简介简介简介s
         * Summary: 简介简介
         */
        public QueryAdAsdAsdResponse QueryAdAsdAsdEx(QueryAdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdAsdAsdResponse>(DoRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 简介简介简介s
         * Summary: 简介简介
         */
        public async Task<QueryAdAsdAsdResponse> QueryAdAsdAsdExAsync(QueryAdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdAsdAsdResponse>(await DoRequestAsync("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public UpdateCjtestCjResponse UpdateCjtestCj(UpdateCjtestCjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCjtestCjEx(request, headers, runtime);
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public async Task<UpdateCjtestCjResponse> UpdateCjtestCjAsync(UpdateCjtestCjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCjtestCjExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public UpdateCjtestCjResponse UpdateCjtestCjEx(UpdateCjtestCjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCjtestCjResponse>(DoRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public async Task<UpdateCjtestCjResponse> UpdateCjtestCjExAsync(UpdateCjtestCjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCjtestCjResponse>(await DoRequestAsync("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件测试1
         * Summary: 文件测试
         */
        public UploadCjtestSourceFileResponse UploadCjtestSourceFile(UploadCjtestSourceFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCjtestSourceFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件测试1
         * Summary: 文件测试
         */
        public async Task<UploadCjtestSourceFileResponse> UploadCjtestSourceFileAsync(UploadCjtestSourceFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCjtestSourceFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件测试1
         * Summary: 文件测试
         */
        public UploadCjtestSourceFileResponse UploadCjtestSourceFileEx(UploadCjtestSourceFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.cjtest.source.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    UploadCjtestSourceFileResponse uploadCjtestSourceFileResponse = new UploadCjtestSourceFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadCjtestSourceFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCjtestSourceFileResponse>(DoRequest("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件测试1
         * Summary: 文件测试
         */
        public async Task<UploadCjtestSourceFileResponse> UploadCjtestSourceFileExAsync(UploadCjtestSourceFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.cjtest.source.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    UploadCjtestSourceFileResponse uploadCjtestSourceFileResponse = new UploadCjtestSourceFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadCjtestSourceFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCjtestSourceFileResponse>(await DoRequestAsync("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public InitGatewayRoadResponse InitGatewayRoad(InitGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitGatewayRoadEx(request, headers, runtime);
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public async Task<InitGatewayRoadResponse> InitGatewayRoadAsync(InitGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitGatewayRoadExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public InitGatewayRoadResponse InitGatewayRoadEx(InitGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitGatewayRoadResponse>(DoRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public async Task<InitGatewayRoadResponse> InitGatewayRoadExAsync(InitGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitGatewayRoadResponse>(await DoRequestAsync("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 近端网关测试接口
         * Summary: 近端网关测试接口（勿删）
         */
        public QueryGatewayEmbedResponse QueryGatewayEmbed(QueryGatewayEmbedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayEmbedEx(request, headers, runtime);
        }

        /**
         * Description: 近端网关测试接口
         * Summary: 近端网关测试接口（勿删）
         */
        public async Task<QueryGatewayEmbedResponse> QueryGatewayEmbedAsync(QueryGatewayEmbedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayEmbedExAsync(request, headers, runtime);
        }

        /**
         * Description: 近端网关测试接口
         * Summary: 近端网关测试接口（勿删）
         */
        public QueryGatewayEmbedResponse QueryGatewayEmbedEx(QueryGatewayEmbedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayEmbedResponse>(DoRequest("1.0", "demo.gateway.embed.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 近端网关测试接口
         * Summary: 近端网关测试接口（勿删）
         */
        public async Task<QueryGatewayEmbedResponse> QueryGatewayEmbedExAsync(QueryGatewayEmbedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayEmbedResponse>(await DoRequestAsync("1.0", "demo.gateway.embed.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新入参后返回结果，Fr 自动化连通性测试。
         * Summary: road.upd（Fr AutoT）
         */
        public UpdateGatewayRoadResponse UpdateGatewayRoad(UpdateGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGatewayRoadEx(request, headers, runtime);
        }

        /**
         * Description: 更新入参后返回结果，Fr 自动化连通性测试。
         * Summary: road.upd（Fr AutoT）
         */
        public async Task<UpdateGatewayRoadResponse> UpdateGatewayRoadAsync(UpdateGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGatewayRoadExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新入参后返回结果，Fr 自动化连通性测试。
         * Summary: road.upd（Fr AutoT）
         */
        public UpdateGatewayRoadResponse UpdateGatewayRoadEx(UpdateGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGatewayRoadResponse>(DoRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新入参后返回结果，Fr 自动化连通性测试。
         * Summary: road.upd（Fr AutoT）
         */
        public async Task<UpdateGatewayRoadResponse> UpdateGatewayRoadExAsync(UpdateGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGatewayRoadResponse>(await DoRequestAsync("1.0", "demo.gateway.road.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public InitCjtestAcopmResResponse InitCjtestAcopmRes(InitCjtestAcopmResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCjtestAcopmResEx(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public async Task<InitCjtestAcopmResResponse> InitCjtestAcopmResAsync(InitCjtestAcopmResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCjtestAcopmResExAsync(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public InitCjtestAcopmResResponse InitCjtestAcopmResEx(InitCjtestAcopmResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCjtestAcopmResResponse>(DoRequest("1.0", "demo.cjtest.acopm.res.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public async Task<InitCjtestAcopmResResponse> InitCjtestAcopmResExAsync(InitCjtestAcopmResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCjtestAcopmResResponse>(await DoRequestAsync("1.0", "demo.cjtest.acopm.res.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试打包
         * Summary: 测试打包
         */
        public ImportTestSdkProductResponse ImportTestSdkProduct(ImportTestSdkProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTestSdkProductEx(request, headers, runtime);
        }

        /**
         * Description: 测试打包
         * Summary: 测试打包
         */
        public async Task<ImportTestSdkProductResponse> ImportTestSdkProductAsync(ImportTestSdkProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTestSdkProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试打包
         * Summary: 测试打包
         */
        public ImportTestSdkProductResponse ImportTestSdkProductEx(ImportTestSdkProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestSdkProductResponse>(DoRequest("1.0", "demo.test.sdk.product.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试打包
         * Summary: 测试打包
         */
        public async Task<ImportTestSdkProductResponse> ImportTestSdkProductExAsync(ImportTestSdkProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestSdkProductResponse>(await DoRequestAsync("1.0", "demo.test.sdk.product.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询并返回结果，Fr 自动化连通性测试。
         * Summary: road.query（Fr AutoT）
         */
        public QueryGatewayRoadResponse QueryGatewayRoad(QueryGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayRoadEx(request, headers, runtime);
        }

        /**
         * Description: 查询并返回结果，Fr 自动化连通性测试。
         * Summary: road.query（Fr AutoT）
         */
        public async Task<QueryGatewayRoadResponse> QueryGatewayRoadAsync(QueryGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayRoadExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询并返回结果，Fr 自动化连通性测试。
         * Summary: road.query（Fr AutoT）
         */
        public QueryGatewayRoadResponse QueryGatewayRoadEx(QueryGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayRoadResponse>(DoRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询并返回结果，Fr 自动化连通性测试。
         * Summary: road.query（Fr AutoT）
         */
        public async Task<QueryGatewayRoadResponse> QueryGatewayRoadExAsync(QueryGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayRoadResponse>(await DoRequestAsync("1.0", "demo.gateway.road.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行计算后返回，Fr 自动化连通性测试。
         * Summary: road.exec（Fr AutoT）
         */
        public ExecGatewayRoadResponse ExecGatewayRoad(ExecGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecGatewayRoadEx(request, headers, runtime);
        }

        /**
         * Description: 执行计算后返回，Fr 自动化连通性测试。
         * Summary: road.exec（Fr AutoT）
         */
        public async Task<ExecGatewayRoadResponse> ExecGatewayRoadAsync(ExecGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecGatewayRoadExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行计算后返回，Fr 自动化连通性测试。
         * Summary: road.exec（Fr AutoT）
         */
        public ExecGatewayRoadResponse ExecGatewayRoadEx(ExecGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecGatewayRoadResponse>(DoRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行计算后返回，Fr 自动化连通性测试。
         * Summary: road.exec（Fr AutoT）
         */
        public async Task<ExecGatewayRoadResponse> ExecGatewayRoadExAsync(ExecGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecGatewayRoadResponse>(await DoRequestAsync("1.0", "demo.gateway.road.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口3
         * Summary: 压测接口3
         */
        public QueryLoadtestTimeThreeResponse QueryLoadtestTimeThree(QueryLoadtestTimeThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadtestTimeThreeEx(request, headers, runtime);
        }

        /**
         * Description: 压测接口3
         * Summary: 压测接口3
         */
        public async Task<QueryLoadtestTimeThreeResponse> QueryLoadtestTimeThreeAsync(QueryLoadtestTimeThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadtestTimeThreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 压测接口3
         * Summary: 压测接口3
         */
        public QueryLoadtestTimeThreeResponse QueryLoadtestTimeThreeEx(QueryLoadtestTimeThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeThreeResponse>(DoRequest("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口3
         * Summary: 压测接口3
         */
        public async Task<QueryLoadtestTimeThreeResponse> QueryLoadtestTimeThreeExAsync(QueryLoadtestTimeThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeThreeResponse>(await DoRequestAsync("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api下架测试
         * Summary: api下架测试测试状态
         */
        public QueryApiOfflineStatusResponse QueryApiOfflineStatus(QueryApiOfflineStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiOfflineStatusEx(request, headers, runtime);
        }

        /**
         * Description: api下架测试
         * Summary: api下架测试测试状态
         */
        public async Task<QueryApiOfflineStatusResponse> QueryApiOfflineStatusAsync(QueryApiOfflineStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiOfflineStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: api下架测试
         * Summary: api下架测试测试状态
         */
        public QueryApiOfflineStatusResponse QueryApiOfflineStatusEx(QueryApiOfflineStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiOfflineStatusResponse>(DoRequest("1.0", "demo.api.offline.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api下架测试
         * Summary: api下架测试测试状态
         */
        public async Task<QueryApiOfflineStatusResponse> QueryApiOfflineStatusExAsync(QueryApiOfflineStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiOfflineStatusResponse>(await DoRequestAsync("1.0", "demo.api.offline.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试数据，可删除
         * Summary: api状态测试
         */
        public ImportDemoApistatusResponse ImportDemoApistatus(ImportDemoApistatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDemoApistatusEx(request, headers, runtime);
        }

        /**
         * Description: 测试数据，可删除
         * Summary: api状态测试
         */
        public async Task<ImportDemoApistatusResponse> ImportDemoApistatusAsync(ImportDemoApistatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDemoApistatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试数据，可删除
         * Summary: api状态测试
         */
        public ImportDemoApistatusResponse ImportDemoApistatusEx(ImportDemoApistatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDemoApistatusResponse>(DoRequest("1.0", "demo.demo.apistatus.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试数据，可删除
         * Summary: api状态测试
         */
        public async Task<ImportDemoApistatusResponse> ImportDemoApistatusExAsync(ImportDemoApistatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDemoApistatusResponse>(await DoRequestAsync("1.0", "demo.demo.apistatus.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试自动生成回归测试代码
         * Summary: 测试自动生成回归测试代码
         */
        public CreateAutoTestCodeResponse CreateAutoTestCode(CreateAutoTestCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAutoTestCodeEx(request, headers, runtime);
        }

        /**
         * Description: 测试自动生成回归测试代码
         * Summary: 测试自动生成回归测试代码
         */
        public async Task<CreateAutoTestCodeResponse> CreateAutoTestCodeAsync(CreateAutoTestCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAutoTestCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试自动生成回归测试代码
         * Summary: 测试自动生成回归测试代码
         */
        public CreateAutoTestCodeResponse CreateAutoTestCodeEx(CreateAutoTestCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutoTestCodeResponse>(DoRequest("1.0", "demo.auto.test.code.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试自动生成回归测试代码
         * Summary: 测试自动生成回归测试代码
         */
        public async Task<CreateAutoTestCodeResponse> CreateAutoTestCodeExAsync(CreateAutoTestCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutoTestCodeResponse>(await DoRequestAsync("1.0", "demo.auto.test.code.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aa
         * Summary: 测试接口
         */
        public QueryDemoLulinSuccessResponse QueryDemoLulinSuccess(QueryDemoLulinSuccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoLulinSuccessEx(request, headers, runtime);
        }

        /**
         * Description: aa
         * Summary: 测试接口
         */
        public async Task<QueryDemoLulinSuccessResponse> QueryDemoLulinSuccessAsync(QueryDemoLulinSuccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoLulinSuccessExAsync(request, headers, runtime);
        }

        /**
         * Description: aa
         * Summary: 测试接口
         */
        public QueryDemoLulinSuccessResponse QueryDemoLulinSuccessEx(QueryDemoLulinSuccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoLulinSuccessResponse>(DoRequest("1.0", "demo.demo.lulin.success.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aa
         * Summary: 测试接口
         */
        public async Task<QueryDemoLulinSuccessResponse> QueryDemoLulinSuccessExAsync(QueryDemoLulinSuccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoLulinSuccessResponse>(await DoRequestAsync("1.0", "demo.demo.lulin.success.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 11
         * Summary: 测试接口
         */
        public QueryDemoLulinccDataResponse QueryDemoLulinccData(QueryDemoLulinccDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoLulinccDataEx(request, headers, runtime);
        }

        /**
         * Description: 11
         * Summary: 测试接口
         */
        public async Task<QueryDemoLulinccDataResponse> QueryDemoLulinccDataAsync(QueryDemoLulinccDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoLulinccDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 11
         * Summary: 测试接口
         */
        public QueryDemoLulinccDataResponse QueryDemoLulinccDataEx(QueryDemoLulinccDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoLulinccDataResponse>(DoRequest("1.0", "demo.demo.lulincc.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 11
         * Summary: 测试接口
         */
        public async Task<QueryDemoLulinccDataResponse> QueryDemoLulinccDataExAsync(QueryDemoLulinccDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoLulinccDataResponse>(await DoRequestAsync("1.0", "demo.demo.lulincc.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 111
         * Summary: 测试接口
         */
        public QueryDemoDefaultSdkcccResponse QueryDemoDefaultSdkccc(QueryDemoDefaultSdkcccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoDefaultSdkcccEx(request, headers, runtime);
        }

        /**
         * Description: 111
         * Summary: 测试接口
         */
        public async Task<QueryDemoDefaultSdkcccResponse> QueryDemoDefaultSdkcccAsync(QueryDemoDefaultSdkcccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoDefaultSdkcccExAsync(request, headers, runtime);
        }

        /**
         * Description: 111
         * Summary: 测试接口
         */
        public QueryDemoDefaultSdkcccResponse QueryDemoDefaultSdkcccEx(QueryDemoDefaultSdkcccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoDefaultSdkcccResponse>(DoRequest("1.0", "demo.demo.default.sdkccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 111
         * Summary: 测试接口
         */
        public async Task<QueryDemoDefaultSdkcccResponse> QueryDemoDefaultSdkcccExAsync(QueryDemoDefaultSdkcccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoDefaultSdkcccResponse>(await DoRequestAsync("1.0", "demo.demo.default.sdkccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 描述
         * Summary: 测试接口
         */
        public QueryDemoDefaultSdkfffResponse QueryDemoDefaultSdkfff(QueryDemoDefaultSdkfffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoDefaultSdkfffEx(request, headers, runtime);
        }

        /**
         * Description: 描述
         * Summary: 测试接口
         */
        public async Task<QueryDemoDefaultSdkfffResponse> QueryDemoDefaultSdkfffAsync(QueryDemoDefaultSdkfffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoDefaultSdkfffExAsync(request, headers, runtime);
        }

        /**
         * Description: 描述
         * Summary: 测试接口
         */
        public QueryDemoDefaultSdkfffResponse QueryDemoDefaultSdkfffEx(QueryDemoDefaultSdkfffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoDefaultSdkfffResponse>(DoRequest("1.0", "demo.demo.default.sdkfff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 描述
         * Summary: 测试接口
         */
        public async Task<QueryDemoDefaultSdkfffResponse> QueryDemoDefaultSdkfffExAsync(QueryDemoDefaultSdkfffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoDefaultSdkfffResponse>(await DoRequestAsync("1.0", "demo.demo.default.sdkfff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public QueryDemoAbcAbcResponse QueryDemoAbcAbc(QueryDemoAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoAbcAbcEx(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<QueryDemoAbcAbcResponse> QueryDemoAbcAbcAsync(QueryDemoAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoAbcAbcExAsync(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public QueryDemoAbcAbcResponse QueryDemoAbcAbcEx(QueryDemoAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoAbcAbcResponse>(DoRequest("1.0", "demo.demo.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<QueryDemoAbcAbcResponse> QueryDemoAbcAbcExAsync(QueryDemoAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoAbcAbcResponse>(await DoRequestAsync("1.0", "demo.demo.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试api评审接入SDL的测试使用
        测试评审。评审字段测试ACCCCC
         * Summary: api评审测试CCCC
         */
        public QueryApprovalTestResponse QueryApprovalTest(QueryApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApprovalTestEx(request, headers, runtime);
        }

        /**
         * Description: 用于测试api评审接入SDL的测试使用
        测试评审。评审字段测试ACCCCC
         * Summary: api评审测试CCCC
         */
        public async Task<QueryApprovalTestResponse> QueryApprovalTestAsync(QueryApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApprovalTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于测试api评审接入SDL的测试使用
        测试评审。评审字段测试ACCCCC
         * Summary: api评审测试CCCC
         */
        public QueryApprovalTestResponse QueryApprovalTestEx(QueryApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApprovalTestResponse>(DoRequest("1.0", "demo.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试api评审接入SDL的测试使用
        测试评审。评审字段测试ACCCCC
         * Summary: api评审测试CCCC
         */
        public async Task<QueryApprovalTestResponse> QueryApprovalTestExAsync(QueryApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApprovalTestResponse>(await DoRequestAsync("1.0", "demo.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在路由三板斧迭代中测试使用
         * Summary: 路由灰度测试使用API
         */
        public QueryRoutingGrayscaleTestResponse QueryRoutingGrayscaleTest(QueryRoutingGrayscaleTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRoutingGrayscaleTestEx(request, headers, runtime);
        }

        /**
         * Description: 在路由三板斧迭代中测试使用
         * Summary: 路由灰度测试使用API
         */
        public async Task<QueryRoutingGrayscaleTestResponse> QueryRoutingGrayscaleTestAsync(QueryRoutingGrayscaleTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRoutingGrayscaleTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 在路由三板斧迭代中测试使用
         * Summary: 路由灰度测试使用API
         */
        public QueryRoutingGrayscaleTestResponse QueryRoutingGrayscaleTestEx(QueryRoutingGrayscaleTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoutingGrayscaleTestResponse>(DoRequest("1.0", "demo.routing.grayscale.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在路由三板斧迭代中测试使用
         * Summary: 路由灰度测试使用API
         */
        public async Task<QueryRoutingGrayscaleTestResponse> QueryRoutingGrayscaleTestExAsync(QueryRoutingGrayscaleTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoutingGrayscaleTestResponse>(await DoRequestAsync("1.0", "demo.routing.grayscale.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public InitBbpInsuranceUserResponse InitBbpInsuranceUser(InitBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitBbpInsuranceUserEx(request, headers, runtime);
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitBbpInsuranceUserResponse> InitBbpInsuranceUserAsync(InitBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitBbpInsuranceUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public InitBbpInsuranceUserResponse InitBbpInsuranceUserEx(InitBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitBbpInsuranceUserResponse>(DoRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitBbpInsuranceUserResponse> InitBbpInsuranceUserExAsync(InitBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitBbpInsuranceUserResponse>(await DoRequestAsync("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试
         * Summary: 测试
         */
        public QueryShaofangTestResponse QueryShaofangTest(QueryShaofangTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryShaofangTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试
         * Summary: 测试
         */
        public async Task<QueryShaofangTestResponse> QueryShaofangTestAsync(QueryShaofangTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryShaofangTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试
         * Summary: 测试
         */
        public QueryShaofangTestResponse QueryShaofangTestEx(QueryShaofangTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.shaofang.test.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    QueryShaofangTestResponse queryShaofangTestResponse = new QueryShaofangTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryShaofangTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryShaofangTestResponse>(DoRequest("1.0", "demo.shaofang.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试
         * Summary: 测试
         */
        public async Task<QueryShaofangTestResponse> QueryShaofangTestExAsync(QueryShaofangTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.shaofang.test.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    QueryShaofangTestResponse queryShaofangTestResponse = new QueryShaofangTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryShaofangTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryShaofangTestResponse>(await DoRequestAsync("1.0", "demo.shaofang.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: tr测试
         * Summary: tr测试
         */
        public QueryShaofangTestTrResponse QueryShaofangTestTr(QueryShaofangTestTrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryShaofangTestTrEx(request, headers, runtime);
        }

        /**
         * Description: tr测试
         * Summary: tr测试
         */
        public async Task<QueryShaofangTestTrResponse> QueryShaofangTestTrAsync(QueryShaofangTestTrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryShaofangTestTrExAsync(request, headers, runtime);
        }

        /**
         * Description: tr测试
         * Summary: tr测试
         */
        public QueryShaofangTestTrResponse QueryShaofangTestTrEx(QueryShaofangTestTrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryShaofangTestTrResponse>(DoRequest("1.0", "demo.shaofang.test.tr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: tr测试
         * Summary: tr测试
         */
        public async Task<QueryShaofangTestTrResponse> QueryShaofangTestTrExAsync(QueryShaofangTestTrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryShaofangTestTrResponse>(await DoRequestAsync("1.0", "demo.shaofang.test.tr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public QueryTestTestobjectBbbResponse QueryTestTestobjectBbb(QueryTestTestobjectBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestTestobjectBbbEx(request, headers, runtime);
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public async Task<QueryTestTestobjectBbbResponse> QueryTestTestobjectBbbAsync(QueryTestTestobjectBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestTestobjectBbbExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public QueryTestTestobjectBbbResponse QueryTestTestobjectBbbEx(QueryTestTestobjectBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestobjectBbbResponse>(DoRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试添加api
         * Summary: 测试用api
         */
        public async Task<QueryTestTestobjectBbbResponse> QueryTestTestobjectBbbExAsync(QueryTestTestobjectBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestobjectBbbResponse>(await DoRequestAsync("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public QueryCjtestCjResResponse QueryCjtestCjRes(QueryCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCjtestCjResEx(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public async Task<QueryCjtestCjResResponse> QueryCjtestCjResAsync(QueryCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCjtestCjResExAsync(request, headers, runtime);
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public QueryCjtestCjResResponse QueryCjtestCjResEx(QueryCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCjtestCjResResponse>(DoRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cj test
         * Summary: cj test1
         */
        public async Task<QueryCjtestCjResResponse> QueryCjtestCjResExAsync(QueryCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCjtestCjResResponse>(await DoRequestAsync("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口1
         * Summary: 压测接口1
         */
        public QueryLoadtestTimeOneResponse QueryLoadtestTimeOne(QueryLoadtestTimeOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadtestTimeOneEx(request, headers, runtime);
        }

        /**
         * Description: 压测接口1
         * Summary: 压测接口1
         */
        public async Task<QueryLoadtestTimeOneResponse> QueryLoadtestTimeOneAsync(QueryLoadtestTimeOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadtestTimeOneExAsync(request, headers, runtime);
        }

        /**
         * Description: 压测接口1
         * Summary: 压测接口1
         */
        public QueryLoadtestTimeOneResponse QueryLoadtestTimeOneEx(QueryLoadtestTimeOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeOneResponse>(DoRequest("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口1
         * Summary: 压测接口1
         */
        public async Task<QueryLoadtestTimeOneResponse> QueryLoadtestTimeOneExAsync(QueryLoadtestTimeOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeOneResponse>(await DoRequestAsync("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口2
         * Summary: 压测接口2
         */
        public QueryLoadtestTimeTwoResponse QueryLoadtestTimeTwo(QueryLoadtestTimeTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadtestTimeTwoEx(request, headers, runtime);
        }

        /**
         * Description: 压测接口2
         * Summary: 压测接口2
         */
        public async Task<QueryLoadtestTimeTwoResponse> QueryLoadtestTimeTwoAsync(QueryLoadtestTimeTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadtestTimeTwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 压测接口2
         * Summary: 压测接口2
         */
        public QueryLoadtestTimeTwoResponse QueryLoadtestTimeTwoEx(QueryLoadtestTimeTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeTwoResponse>(DoRequest("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口2
         * Summary: 压测接口2
         */
        public async Task<QueryLoadtestTimeTwoResponse> QueryLoadtestTimeTwoExAsync(QueryLoadtestTimeTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeTwoResponse>(await DoRequestAsync("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public ResetSaasTestApiResponse ResetSaasTestApi(ResetSaasTestApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetSaasTestApiEx(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<ResetSaasTestApiResponse> ResetSaasTestApiAsync(ResetSaasTestApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetSaasTestApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public ResetSaasTestApiResponse ResetSaasTestApiEx(ResetSaasTestApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetSaasTestApiResponse>(DoRequest("1.0", "demo.saas.test.api.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<ResetSaasTestApiResponse> ResetSaasTestApiExAsync(ResetSaasTestApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetSaasTestApiResponse>(await DoRequestAsync("1.0", "demo.saas.test.api.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用1
         * Summary: 测试创建
         */
        public QueryTestGatewayTestResponse QueryTestGatewayTest(QueryTestGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestGatewayTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试使用1
         * Summary: 测试创建
         */
        public async Task<QueryTestGatewayTestResponse> QueryTestGatewayTestAsync(QueryTestGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestGatewayTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试使用1
         * Summary: 测试创建
         */
        public QueryTestGatewayTestResponse QueryTestGatewayTestEx(QueryTestGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestGatewayTestResponse>(DoRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用1
         * Summary: 测试创建
         */
        public async Task<QueryTestGatewayTestResponse> QueryTestGatewayTestExAsync(QueryTestGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestGatewayTestResponse>(await DoRequestAsync("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力中心六期回归验证创建使用
         * Summary: 共享能力中心六期回归验证创建
         */
        public QueryGongxiangTestDemoResponse QueryGongxiangTestDemo(QueryGongxiangTestDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGongxiangTestDemoEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力中心六期回归验证创建使用
         * Summary: 共享能力中心六期回归验证创建
         */
        public async Task<QueryGongxiangTestDemoResponse> QueryGongxiangTestDemoAsync(QueryGongxiangTestDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGongxiangTestDemoExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力中心六期回归验证创建使用
         * Summary: 共享能力中心六期回归验证创建
         */
        public QueryGongxiangTestDemoResponse QueryGongxiangTestDemoEx(QueryGongxiangTestDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGongxiangTestDemoResponse>(DoRequest("1.0", "demo.gongxiang.test.demo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力中心六期回归验证创建使用
         * Summary: 共享能力中心六期回归验证创建
         */
        public async Task<QueryGongxiangTestDemoResponse> QueryGongxiangTestDemoExAsync(QueryGongxiangTestDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGongxiangTestDemoResponse>(await DoRequestAsync("1.0", "demo.gongxiang.test.demo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testa
         * Summary: 测试用api
         */
        public QuerySaasTestTestaResponse QuerySaasTestTesta(QuerySaasTestTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySaasTestTestaEx(request, headers, runtime);
        }

        /**
         * Description: testa
         * Summary: 测试用api
         */
        public async Task<QuerySaasTestTestaResponse> QuerySaasTestTestaAsync(QuerySaasTestTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySaasTestTestaExAsync(request, headers, runtime);
        }

        /**
         * Description: testa
         * Summary: 测试用api
         */
        public QuerySaasTestTestaResponse QuerySaasTestTestaEx(QuerySaasTestTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasTestTestaResponse>(DoRequest("1.0", "demo.saas.test.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testa
         * Summary: 测试用api
         */
        public async Task<QuerySaasTestTestaResponse> QuerySaasTestTestaExAsync(QuerySaasTestTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySaasTestTestaResponse>(await DoRequestAsync("1.0", "demo.saas.test.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testB
         * Summary: 测试用api
         */
        public ImportSaasTestTestbResponse ImportSaasTestTestb(ImportSaasTestTestbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSaasTestTestbEx(request, headers, runtime);
        }

        /**
         * Description: testB
         * Summary: 测试用api
         */
        public async Task<ImportSaasTestTestbResponse> ImportSaasTestTestbAsync(ImportSaasTestTestbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSaasTestTestbExAsync(request, headers, runtime);
        }

        /**
         * Description: testB
         * Summary: 测试用api
         */
        public ImportSaasTestTestbResponse ImportSaasTestTestbEx(ImportSaasTestTestbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSaasTestTestbResponse>(DoRequest("1.0", "demo.saas.test.testb.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testB
         * Summary: 测试用api
         */
        public async Task<ImportSaasTestTestbResponse> ImportSaasTestTestbExAsync(ImportSaasTestTestbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSaasTestTestbResponse>(await DoRequestAsync("1.0", "demo.saas.test.testb.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishSaasTestTestcResponse PublishSaasTestTestc(PublishSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishSaasTestTestcEx(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishSaasTestTestcResponse> PublishSaasTestTestcAsync(PublishSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishSaasTestTestcExAsync(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishSaasTestTestcResponse PublishSaasTestTestcEx(PublishSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishSaasTestTestcResponse>(DoRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishSaasTestTestcResponse> PublishSaasTestTestcExAsync(PublishSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishSaasTestTestcResponse>(await DoRequestAsync("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public RegisterTestBizeventMessageResponse RegisterTestBizeventMessage(RegisterTestBizeventMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterTestBizeventMessageEx(request, headers, runtime);
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public async Task<RegisterTestBizeventMessageResponse> RegisterTestBizeventMessageAsync(RegisterTestBizeventMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterTestBizeventMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public RegisterTestBizeventMessageResponse RegisterTestBizeventMessageEx(RegisterTestBizeventMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTestBizeventMessageResponse>(DoRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 随机测试
         * Summary: 消息发送及消费
         */
        public async Task<RegisterTestBizeventMessageResponse> RegisterTestBizeventMessageExAsync(RegisterTestBizeventMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTestBizeventMessageResponse>(await DoRequestAsync("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力六期回归验证
         * Summary: 共享能力六期回归验证
         */
        public BindGongxaingTestResponse BindGongxaingTest(BindGongxaingTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindGongxaingTestEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力六期回归验证
         * Summary: 共享能力六期回归验证
         */
        public async Task<BindGongxaingTestResponse> BindGongxaingTestAsync(BindGongxaingTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindGongxaingTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力六期回归验证
         * Summary: 共享能力六期回归验证
         */
        public BindGongxaingTestResponse BindGongxaingTestEx(BindGongxaingTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindGongxaingTestResponse>(DoRequest("1.0", "demo.gongxaing.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力六期回归验证
         * Summary: 共享能力六期回归验证
         */
        public async Task<BindGongxaingTestResponse> BindGongxaingTestExAsync(BindGongxaingTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindGongxaingTestResponse>(await DoRequestAsync("1.0", "demo.gongxaing.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: album/api/patrol/data/queryBizInfos
         * Summary: test
         */
        public QueryPatrolStatisticBizinfosResponse QueryPatrolStatisticBizinfos(QueryPatrolStatisticBizinfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPatrolStatisticBizinfosEx(request, headers, runtime);
        }

        /**
         * Description: album/api/patrol/data/queryBizInfos
         * Summary: test
         */
        public async Task<QueryPatrolStatisticBizinfosResponse> QueryPatrolStatisticBizinfosAsync(QueryPatrolStatisticBizinfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPatrolStatisticBizinfosExAsync(request, headers, runtime);
        }

        /**
         * Description: album/api/patrol/data/queryBizInfos
         * Summary: test
         */
        public QueryPatrolStatisticBizinfosResponse QueryPatrolStatisticBizinfosEx(QueryPatrolStatisticBizinfosRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPatrolStatisticBizinfosResponse>(DoRequest("1.0", "demo.patrol.statistic.bizinfos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: album/api/patrol/data/queryBizInfos
         * Summary: test
         */
        public async Task<QueryPatrolStatisticBizinfosResponse> QueryPatrolStatisticBizinfosExAsync(QueryPatrolStatisticBizinfosRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPatrolStatisticBizinfosResponse>(await DoRequestAsync("1.0", "demo.patrol.statistic.bizinfos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建test222
         * Summary: 自动化测试创建test1
         */
        public BindAaaBbbCccResponse BindAaaBbbCcc(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test222
         * Summary: 自动化测试创建test1
         */
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccAsync(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test222
         * Summary: 自动化测试创建test1
         */
        public BindAaaBbbCccResponse BindAaaBbbCccEx(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建test222
         * Summary: 自动化测试创建test1
         */
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccExAsync(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建111
         * Summary: 自动化测试创建（勿动）
         */
        public QueryAaaBbbCccResponse QueryAaaBbbCcc(QueryAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建111
         * Summary: 自动化测试创建（勿动）
         */
        public async Task<QueryAaaBbbCccResponse> QueryAaaBbbCccAsync(QueryAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建111
         * Summary: 自动化测试创建（勿动）
         */
        public QueryAaaBbbCccResponse QueryAaaBbbCccEx(QueryAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建111
         * Summary: 自动化测试创建（勿动）
         */
        public async Task<QueryAaaBbbCccResponse> QueryAaaBbbCccExAsync(QueryAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaBbbCccResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public QueryAbcAbcAbcResponse QueryAbcAbcAbc(QueryAbcAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbcAbcAbcEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public async Task<QueryAbcAbcAbcResponse> QueryAbcAbcAbcAsync(QueryAbcAbcAbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbcAbcAbcExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public QueryAbcAbcAbcResponse QueryAbcAbcAbcEx(QueryAbcAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcAbcAbcResponse>(DoRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建,用于测试API的修改
         * Summary: 自动化测试创建,用于测试API的修改勿动
         */
        public async Task<QueryAbcAbcAbcResponse> QueryAbcAbcAbcExAsync(QueryAbcAbcAbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcAbcAbcResponse>(await DoRequestAsync("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public BindAaaBbbCcdResponse BindAaaBbbCcd(BindAaaBbbCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCcdEx(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<BindAaaBbbCcdResponse> BindAaaBbbCcdAsync(BindAaaBbbCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCcdExAsync(request, headers, runtime);
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public BindAaaBbbCcdResponse BindAaaBbbCcdEx(BindAaaBbbCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCcdResponse>(DoRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 123
         * Summary: 测试用api
         */
        public async Task<BindAaaBbbCcdResponse> BindAaaBbbCcdExAsync(BindAaaBbbCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCcdResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public ResetComCnCcResponse ResetComCnCc(ResetComCnCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetComCnCcEx(request, headers, runtime);
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public async Task<ResetComCnCcResponse> ResetComCnCcAsync(ResetComCnCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetComCnCcExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public ResetComCnCcResponse ResetComCnCcEx(ResetComCnCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetComCnCcResponse>(DoRequest("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public async Task<ResetComCnCcResponse> ResetComCnCcExAsync(ResetComCnCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetComCnCcResponse>(await DoRequestAsync("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长捷,qiujianglong.qjl
         * Summary: api简介
         */
        public ImportComCnTestResponse ImportComCnTest(ImportComCnTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportComCnTestEx(request, headers, runtime);
        }

        /**
         * Description: 长捷,qiujianglong.qjl
         * Summary: api简介
         */
        public async Task<ImportComCnTestResponse> ImportComCnTestAsync(ImportComCnTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportComCnTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 长捷,qiujianglong.qjl
         * Summary: api简介
         */
        public ImportComCnTestResponse ImportComCnTestEx(ImportComCnTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.com.cn.test.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    ImportComCnTestResponse importComCnTestResponse = new ImportComCnTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importComCnTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportComCnTestResponse>(DoRequest("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长捷,qiujianglong.qjl
         * Summary: api简介
         */
        public async Task<ImportComCnTestResponse> ImportComCnTestExAsync(ImportComCnTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "demo.com.cn.test.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "OK"))
                {
                    ImportComCnTestResponse importComCnTestResponse = new ImportComCnTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importComCnTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportComCnTestResponse>(await DoRequestAsync("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试能力中心九期API打标&能力绑定API使用
         * Summary: 能力中心九期测试
         */
        public BindCenterAbilityResponse BindCenterAbility(BindCenterAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindCenterAbilityEx(request, headers, runtime);
        }

        /**
         * Description: 测试能力中心九期API打标&能力绑定API使用
         * Summary: 能力中心九期测试
         */
        public async Task<BindCenterAbilityResponse> BindCenterAbilityAsync(BindCenterAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindCenterAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试能力中心九期API打标&能力绑定API使用
         * Summary: 能力中心九期测试
         */
        public BindCenterAbilityResponse BindCenterAbilityEx(BindCenterAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindCenterAbilityResponse>(DoRequest("1.0", "demo.center.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试能力中心九期API打标&能力绑定API使用
         * Summary: 能力中心九期测试
         */
        public async Task<BindCenterAbilityResponse> BindCenterAbilityExAsync(BindCenterAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindCenterAbilityResponse>(await DoRequestAsync("1.0", "demo.center.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
