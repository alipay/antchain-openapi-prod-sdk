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
                        {"sdk_version", "1.0.90"},
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
                        {"sdk_version", "1.0.90"},
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
         * Description: Demo接口，返回当输入的值
        测试下
         * Summary: 返回输入值
         */
        public EchoGatewayCheckResponse EchoGatewayCheck(EchoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EchoGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当输入的值
        测试下
         * Summary: 返回输入值
         */
        public async Task<EchoGatewayCheckResponse> EchoGatewayCheckAsync(EchoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EchoGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当输入的值
        测试下
         * Summary: 返回输入值
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
         * Description: Demo接口，返回当输入的值
        测试下
         * Summary: 返回输入值
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
         * Description: sss
         * Summary: ss
         */
        public BindSssSsSsResponse BindSssSsSs(BindSssSsSsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindSssSsSsEx(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public async Task<BindSssSsSsResponse> BindSssSsSsAsync(BindSssSsSsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindSssSsSsExAsync(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public BindSssSsSsResponse BindSssSsSsEx(BindSssSsSsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindSssSsSsResponse>(DoRequest("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sss
         * Summary: ss
         */
        public async Task<BindSssSsSsResponse> BindSssSsSsExAsync(BindSssSsSsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindSssSsSsResponse>(await DoRequestAsync("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: asd
         * Summary: asd
         */
        public QueryAdAsdAsdResponse QueryAdAsdAsd(QueryAdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAdAsdAsdEx(request, headers, runtime);
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public async Task<QueryAdAsdAsdResponse> QueryAdAsdAsdAsync(QueryAdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAdAsdAsdExAsync(request, headers, runtime);
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public QueryAdAsdAsdResponse QueryAdAsdAsdEx(QueryAdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdAsdAsdResponse>(DoRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public async Task<QueryAdAsdAsdResponse> QueryAdAsdAsdExAsync(QueryAdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdAsdAsdResponse>(await DoRequestAsync("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public BindAsdAsdAsdResponse BindAsdAsdAsd(BindAsdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAsdAsdAsdEx(request, headers, runtime);
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public async Task<BindAsdAsdAsdResponse> BindAsdAsdAsdAsync(BindAsdAsdAsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAsdAsdAsdExAsync(request, headers, runtime);
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public BindAsdAsdAsdResponse BindAsdAsdAsdEx(BindAsdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAsdAsdAsdResponse>(DoRequest("1.0", "demo.asd.asd.asd.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: asd
         * Summary: asd
         */
        public async Task<BindAsdAsdAsdResponse> BindAsdAsdAsdExAsync(BindAsdAsdAsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAsdAsdAsdResponse>(await DoRequestAsync("1.0", "demo.asd.asd.asd.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 测试使用
         * Summary: 测试创建
         */
        public QueryTestGatewayTestResponse QueryTestGatewayTest(QueryTestGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestGatewayTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: 测试创建
         */
        public async Task<QueryTestGatewayTestResponse> QueryTestGatewayTestAsync(QueryTestGatewayTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestGatewayTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: 测试创建
         */
        public QueryTestGatewayTestResponse QueryTestGatewayTestEx(QueryTestGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestGatewayTestResponse>(DoRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用
         * Summary: 测试创建
         */
        public async Task<QueryTestGatewayTestResponse> QueryTestGatewayTestExAsync(QueryTestGatewayTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestGatewayTestResponse>(await DoRequestAsync("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public BindAaaBbbCccResponse BindAaaBbbCcc(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccAsync(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public BindAaaBbbCccResponse BindAaaBbbCccEx(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccExAsync(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建1
         * Summary: 自动化测试创建（勿动）
         */
        public QueryAaaBbbCccResponse QueryAaaBbbCcc(QueryAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建1
         * Summary: 自动化测试创建（勿动）
         */
        public async Task<QueryAaaBbbCccResponse> QueryAaaBbbCccAsync(QueryAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建1
         * Summary: 自动化测试创建（勿动）
         */
        public QueryAaaBbbCccResponse QueryAaaBbbCccEx(QueryAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建1
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
