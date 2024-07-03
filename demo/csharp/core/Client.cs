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
                        {"sdk_version", "1.0.306"},
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
                        {"sdk_version", "1.0.306"},
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
         * Description: test
         * Summary: test
         */
        public QueryXxxxTestxAaaResponse QueryXxxxTestxAaa(QueryXxxxTestxAaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXxxxTestxAaaEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryXxxxTestxAaaResponse> QueryXxxxTestxAaaAsync(QueryXxxxTestxAaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXxxxTestxAaaExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryXxxxTestxAaaResponse QueryXxxxTestxAaaEx(QueryXxxxTestxAaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXxxxTestxAaaResponse>(DoRequest("1.0", "demo.xxxx.testx.aaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryXxxxTestxAaaResponse> QueryXxxxTestxAaaExAsync(QueryXxxxTestxAaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXxxxTestxAaaResponse>(await DoRequestAsync("1.0", "demo.xxxx.testx.aaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryTestTestaTestaResponse QueryTestTestaTesta(QueryTestTestaTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestTestaTestaEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryTestTestaTestaResponse> QueryTestTestaTestaAsync(QueryTestTestaTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestTestaTestaExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryTestTestaTestaResponse QueryTestTestaTestaEx(QueryTestTestaTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestaTestaResponse>(DoRequest("1.0", "demo.test.testa.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryTestTestaTestaResponse> QueryTestTestaTestaExAsync(QueryTestTestaTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestaTestaResponse>(await DoRequestAsync("1.0", "demo.test.testa.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryInstanceidRuleResponse QueryInstanceidRule(QueryInstanceidRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInstanceidRuleEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryInstanceidRuleResponse> QueryInstanceidRuleAsync(QueryInstanceidRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInstanceidRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryInstanceidRuleResponse QueryInstanceidRuleEx(QueryInstanceidRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceidRuleResponse>(DoRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryInstanceidRuleResponse> QueryInstanceidRuleExAsync(QueryInstanceidRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceidRuleResponse>(await DoRequestAsync("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryBusinessTestResponse QueryBusinessTest(QueryBusinessTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessTestEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryBusinessTestResponse> QueryBusinessTestAsync(QueryBusinessTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessTestExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryBusinessTestResponse QueryBusinessTestEx(QueryBusinessTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessTestResponse>(DoRequest("1.0", "demo.business.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryBusinessTestResponse> QueryBusinessTestExAsync(QueryBusinessTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessTestResponse>(await DoRequestAsync("1.0", "demo.business.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置下游耗时
         * Summary: 超时（加密）
         */
        public QueryGatewayCheckEchotimeoutokResponse QueryGatewayCheckEchotimeoutok(QueryGatewayCheckEchotimeoutokRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayCheckEchotimeoutokEx(request, headers, runtime);
        }

        /**
         * Description: 设置下游耗时
         * Summary: 超时（加密）
         */
        public async Task<QueryGatewayCheckEchotimeoutokResponse> QueryGatewayCheckEchotimeoutokAsync(QueryGatewayCheckEchotimeoutokRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayCheckEchotimeoutokExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置下游耗时
         * Summary: 超时（加密）
         */
        public QueryGatewayCheckEchotimeoutokResponse QueryGatewayCheckEchotimeoutokEx(QueryGatewayCheckEchotimeoutokRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotimeoutokResponse>(DoRequest("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置下游耗时
         * Summary: 超时（加密）
         */
        public async Task<QueryGatewayCheckEchotimeoutokResponse> QueryGatewayCheckEchotimeoutokExAsync(QueryGatewayCheckEchotimeoutokRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayCheckEchotimeoutokResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用
         * Summary: testuse1
         */
        public QueryBusinessCodeTestResponse QueryBusinessCodeTest(QueryBusinessCodeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessCodeTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: testuse1
         */
        public async Task<QueryBusinessCodeTestResponse> QueryBusinessCodeTestAsync(QueryBusinessCodeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessCodeTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: testuse1
         */
        public QueryBusinessCodeTestResponse QueryBusinessCodeTestEx(QueryBusinessCodeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessCodeTestResponse>(DoRequest("1.0", "demo.business.code.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用
         * Summary: testuse1
         */
        public async Task<QueryBusinessCodeTestResponse> QueryBusinessCodeTestExAsync(QueryBusinessCodeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessCodeTestResponse>(await DoRequestAsync("1.0", "demo.business.code.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 双百&门户&网关，停服决策测试使用
         * Summary: 商业化规则测试
         */
        public MatchBusinessAndInstanceResponse MatchBusinessAndInstance(MatchBusinessAndInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchBusinessAndInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 双百&门户&网关，停服决策测试使用
         * Summary: 商业化规则测试
         */
        public async Task<MatchBusinessAndInstanceResponse> MatchBusinessAndInstanceAsync(MatchBusinessAndInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchBusinessAndInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 双百&门户&网关，停服决策测试使用
         * Summary: 商业化规则测试
         */
        public MatchBusinessAndInstanceResponse MatchBusinessAndInstanceEx(MatchBusinessAndInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchBusinessAndInstanceResponse>(DoRequest("1.0", "demo.business.and.instance.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 双百&门户&网关，停服决策测试使用
         * Summary: 商业化规则测试
         */
        public async Task<MatchBusinessAndInstanceResponse> MatchBusinessAndInstanceExAsync(MatchBusinessAndInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchBusinessAndInstanceResponse>(await DoRequestAsync("1.0", "demo.business.and.instance.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 研发自测使用API
         * Summary: 研发自测使用API
         */
        public QueryDevelopTestUseResponse QueryDevelopTestUse(QueryDevelopTestUseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDevelopTestUseEx(request, headers, runtime);
        }

        /**
         * Description: 研发自测使用API
         * Summary: 研发自测使用API
         */
        public async Task<QueryDevelopTestUseResponse> QueryDevelopTestUseAsync(QueryDevelopTestUseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDevelopTestUseExAsync(request, headers, runtime);
        }

        /**
         * Description: 研发自测使用API
         * Summary: 研发自测使用API
         */
        public QueryDevelopTestUseResponse QueryDevelopTestUseEx(QueryDevelopTestUseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDevelopTestUseResponse>(DoRequest("1.0", "demo.develop.test.use.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 研发自测使用API
         * Summary: 研发自测使用API
         */
        public async Task<QueryDevelopTestUseResponse> QueryDevelopTestUseExAsync(QueryDevelopTestUseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDevelopTestUseResponse>(await DoRequestAsync("1.0", "demo.develop.test.use.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资损防控研发自测使用API
         * Summary: 研发自测使用API
         */
        public VerifyDevelopTestTestResponse VerifyDevelopTestTest(VerifyDevelopTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDevelopTestTestEx(request, headers, runtime);
        }

        /**
         * Description: 资损防控研发自测使用API
         * Summary: 研发自测使用API
         */
        public async Task<VerifyDevelopTestTestResponse> VerifyDevelopTestTestAsync(VerifyDevelopTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDevelopTestTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 资损防控研发自测使用API
         * Summary: 研发自测使用API
         */
        public VerifyDevelopTestTestResponse VerifyDevelopTestTestEx(VerifyDevelopTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDevelopTestTestResponse>(DoRequest("1.0", "demo.develop.test.test.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资损防控研发自测使用API
         * Summary: 研发自测使用API
         */
        public async Task<VerifyDevelopTestTestResponse> VerifyDevelopTestTestExAsync(VerifyDevelopTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDevelopTestTestResponse>(await DoRequestAsync("1.0", "demo.develop.test.test.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试预发环境RDS切OB之后的同步功能
         * Summary: 预发RDS切OB测试
         */
        public ImportPreObWriteResponse ImportPreObWrite(ImportPreObWriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportPreObWriteEx(request, headers, runtime);
        }

        /**
         * Description: 用于测试预发环境RDS切OB之后的同步功能
         * Summary: 预发RDS切OB测试
         */
        public async Task<ImportPreObWriteResponse> ImportPreObWriteAsync(ImportPreObWriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportPreObWriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于测试预发环境RDS切OB之后的同步功能
         * Summary: 预发RDS切OB测试
         */
        public ImportPreObWriteResponse ImportPreObWriteEx(ImportPreObWriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPreObWriteResponse>(DoRequest("1.0", "demo.pre.ob.write.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试预发环境RDS切OB之后的同步功能
         * Summary: 预发RDS切OB测试
         */
        public async Task<ImportPreObWriteResponse> ImportPreObWriteExAsync(ImportPreObWriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPreObWriteResponse>(await DoRequestAsync("1.0", "demo.pre.ob.write.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 用于上海非金生产环境的同步测试
         * Summary: 上海非金生产环境测试
         */
        public OperateShanghaiPreTestResponse OperateShanghaiPreTest(OperateShanghaiPreTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateShanghaiPreTestEx(request, headers, runtime);
        }

        /**
         * Description: 用于上海非金生产环境的同步测试
         * Summary: 上海非金生产环境测试
         */
        public async Task<OperateShanghaiPreTestResponse> OperateShanghaiPreTestAsync(OperateShanghaiPreTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateShanghaiPreTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于上海非金生产环境的同步测试
         * Summary: 上海非金生产环境测试
         */
        public OperateShanghaiPreTestResponse OperateShanghaiPreTestEx(OperateShanghaiPreTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateShanghaiPreTestResponse>(DoRequest("1.0", "demo.shanghai.pre.test.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于上海非金生产环境的同步测试
         * Summary: 上海非金生产环境测试
         */
        public async Task<OperateShanghaiPreTestResponse> OperateShanghaiPreTestExAsync(OperateShanghaiPreTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateShanghaiPreTestResponse>(await DoRequestAsync("1.0", "demo.shanghai.pre.test.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 测试
         * Summary: 测试ato异常
         */
        public QueryAcopmAtoWithholdResponse QueryAcopmAtoWithhold(QueryAcopmAtoWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAcopmAtoWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 测试
         * Summary: 测试ato异常
         */
        public async Task<QueryAcopmAtoWithholdResponse> QueryAcopmAtoWithholdAsync(QueryAcopmAtoWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAcopmAtoWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试
         * Summary: 测试ato异常
         */
        public QueryAcopmAtoWithholdResponse QueryAcopmAtoWithholdEx(QueryAcopmAtoWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAcopmAtoWithholdResponse>(DoRequest("1.0", "demo.acopm.ato.withhold.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试
         * Summary: 测试ato异常
         */
        public async Task<QueryAcopmAtoWithholdResponse> QueryAcopmAtoWithholdExAsync(QueryAcopmAtoWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAcopmAtoWithholdResponse>(await DoRequestAsync("1.0", "demo.acopm.ato.withhold.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryApdevcenterTestobjectTestsubResponse QueryApdevcenterTestobjectTestsub(QueryApdevcenterTestobjectTestsubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApdevcenterTestobjectTestsubEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryApdevcenterTestobjectTestsubResponse> QueryApdevcenterTestobjectTestsubAsync(QueryApdevcenterTestobjectTestsubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApdevcenterTestobjectTestsubExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryApdevcenterTestobjectTestsubResponse QueryApdevcenterTestobjectTestsubEx(QueryApdevcenterTestobjectTestsubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApdevcenterTestobjectTestsubResponse>(DoRequest("1.0", "demo.apdevcenter.testobject.testsub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryApdevcenterTestobjectTestsubResponse> QueryApdevcenterTestobjectTestsubExAsync(QueryApdevcenterTestobjectTestsubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApdevcenterTestobjectTestsubResponse>(await DoRequestAsync("1.0", "demo.apdevcenter.testobject.testsub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testtest
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryApdevcenterTestobjectTestsubaResponse QueryApdevcenterTestobjectTestsuba(QueryApdevcenterTestobjectTestsubaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApdevcenterTestobjectTestsubaEx(request, headers, runtime);
        }

        /**
         * Description: testtest
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryApdevcenterTestobjectTestsubaResponse> QueryApdevcenterTestobjectTestsubaAsync(QueryApdevcenterTestobjectTestsubaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApdevcenterTestobjectTestsubaExAsync(request, headers, runtime);
        }

        /**
         * Description: testtest
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryApdevcenterTestobjectTestsubaResponse QueryApdevcenterTestobjectTestsubaEx(QueryApdevcenterTestobjectTestsubaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApdevcenterTestobjectTestsubaResponse>(DoRequest("1.0", "demo.apdevcenter.testobject.testsuba.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testtest
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryApdevcenterTestobjectTestsubaResponse> QueryApdevcenterTestobjectTestsubaExAsync(QueryApdevcenterTestobjectTestsubaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApdevcenterTestobjectTestsubaResponse>(await DoRequestAsync("1.0", "demo.apdevcenter.testobject.testsuba.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryTestFilesystemFileinfoResponse QueryTestFilesystemFileinfo(QueryTestFilesystemFileinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestFilesystemFileinfoEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryTestFilesystemFileinfoResponse> QueryTestFilesystemFileinfoAsync(QueryTestFilesystemFileinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestFilesystemFileinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryTestFilesystemFileinfoResponse QueryTestFilesystemFileinfoEx(QueryTestFilesystemFileinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestFilesystemFileinfoResponse>(DoRequest("1.0", "demo.test.filesystem.fileinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryTestFilesystemFileinfoResponse> QueryTestFilesystemFileinfoExAsync(QueryTestFilesystemFileinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestFilesystemFileinfoResponse>(await DoRequestAsync("1.0", "demo.test.filesystem.fileinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryTestproductTestobjectTestsubaaaResponse QueryTestproductTestobjectTestsubaaa(QueryTestproductTestobjectTestsubaaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestproductTestobjectTestsubaaaEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryTestproductTestobjectTestsubaaaResponse> QueryTestproductTestobjectTestsubaaaAsync(QueryTestproductTestobjectTestsubaaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestproductTestobjectTestsubaaaExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public QueryTestproductTestobjectTestsubaaaResponse QueryTestproductTestobjectTestsubaaaEx(QueryTestproductTestobjectTestsubaaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestproductTestobjectTestsubaaaResponse>(DoRequest("1.0", "demo.testproduct.testobject.testsubaaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 新增API测试查询接口(只是测试使用)
         */
        public async Task<QueryTestproductTestobjectTestsubaaaResponse> QueryTestproductTestobjectTestsubaaaExAsync(QueryTestproductTestobjectTestsubaaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestproductTestobjectTestsubaaaResponse>(await DoRequestAsync("1.0", "demo.testproduct.testobject.testsubaaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public BindAaaBbbCccResponse BindAaaBbbCcc(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccAsync(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
         * Summary: 自动化测试创建test1
         */
        public BindAaaBbbCccResponse BindAaaBbbCccEx(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建test，请勿修改、删除
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
         * Description: 用于测试自动化脚本自动生成的功能
         * Summary: 自动生成自动化脚本测试
         */
        public CreateAutoGenerateCodeResponse CreateAutoGenerateCode(CreateAutoGenerateCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAutoGenerateCodeEx(request, headers, runtime);
        }

        /**
         * Description: 用于测试自动化脚本自动生成的功能
         * Summary: 自动生成自动化脚本测试
         */
        public async Task<CreateAutoGenerateCodeResponse> CreateAutoGenerateCodeAsync(CreateAutoGenerateCodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAutoGenerateCodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于测试自动化脚本自动生成的功能
         * Summary: 自动生成自动化脚本测试
         */
        public CreateAutoGenerateCodeResponse CreateAutoGenerateCodeEx(CreateAutoGenerateCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutoGenerateCodeResponse>(DoRequest("1.0", "demo.auto.generate.code.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试自动化脚本自动生成的功能
         * Summary: 自动生成自动化脚本测试
         */
        public async Task<CreateAutoGenerateCodeResponse> CreateAutoGenerateCodeExAsync(CreateAutoGenerateCodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutoGenerateCodeResponse>(await DoRequestAsync("1.0", "demo.auto.generate.code.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试预发环境ob数据同步
         * Summary: 用于测试ob数据同步
         */
        public QueryPreTestUseResponse QueryPreTestUse(QueryPreTestUseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreTestUseEx(request, headers, runtime);
        }

        /**
         * Description: 用于测试预发环境ob数据同步
         * Summary: 用于测试ob数据同步
         */
        public async Task<QueryPreTestUseResponse> QueryPreTestUseAsync(QueryPreTestUseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreTestUseExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于测试预发环境ob数据同步
         * Summary: 用于测试ob数据同步
         */
        public QueryPreTestUseResponse QueryPreTestUseEx(QueryPreTestUseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreTestUseResponse>(DoRequest("1.0", "demo.pre.test.use.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于测试预发环境ob数据同步
         * Summary: 用于测试ob数据同步
         */
        public async Task<QueryPreTestUseResponse> QueryPreTestUseExAsync(QueryPreTestUseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreTestUseResponse>(await DoRequestAsync("1.0", "demo.pre.test.use.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
