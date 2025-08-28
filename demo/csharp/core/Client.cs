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
                        {"sdk_version", "1.1.52"},
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
                        {"sdk_version", "1.1.52"},
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
                request.FileObject = null;
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
                request.FileObject = null;
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
         * Description: test
         * Summary: 自动化测试工程使用，勿删勿改
         */
        public QueryInstanceidRuleResponse QueryInstanceidRule(QueryInstanceidRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInstanceidRuleEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 自动化测试工程使用，勿删勿改
         */
        public async Task<QueryInstanceidRuleResponse> QueryInstanceidRuleAsync(QueryInstanceidRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInstanceidRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: 自动化测试工程使用，勿删勿改
         */
        public QueryInstanceidRuleResponse QueryInstanceidRuleEx(QueryInstanceidRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceidRuleResponse>(DoRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: 自动化测试工程使用，勿删勿改
         */
        public async Task<QueryInstanceidRuleResponse> QueryInstanceidRuleExAsync(QueryInstanceidRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceidRuleResponse>(await DoRequestAsync("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 流失查询测试
         * Summary: 流失查询测试
         */
        public QueryStreamTestResponse QueryStreamTest(QueryStreamTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamTestEx(request, headers, runtime);
        }

        /**
         * Description: 流失查询测试
         * Summary: 流失查询测试
         */
        public async Task<QueryStreamTestResponse> QueryStreamTestAsync(QueryStreamTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 流失查询测试
         * Summary: 流失查询测试
         */
        public QueryStreamTestResponse QueryStreamTestEx(QueryStreamTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTestResponse>(DoRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流失查询测试
         * Summary: 流失查询测试
         */
        public async Task<QueryStreamTestResponse> QueryStreamTestExAsync(QueryStreamTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTestResponse>(await DoRequestAsync("1.0", "demo.stream.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网关性能优化测试
         * Summary: 性能优化测试
         */
        public QueryTestCatcheLimitResponse QueryTestCatcheLimit(QueryTestCatcheLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestCatcheLimitEx(request, headers, runtime);
        }

        /**
         * Description: 网关性能优化测试
         * Summary: 性能优化测试
         */
        public async Task<QueryTestCatcheLimitResponse> QueryTestCatcheLimitAsync(QueryTestCatcheLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestCatcheLimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 网关性能优化测试
         * Summary: 性能优化测试
         */
        public QueryTestCatcheLimitResponse QueryTestCatcheLimitEx(QueryTestCatcheLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestCatcheLimitResponse>(DoRequest("1.0", "demo.test.catche.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网关性能优化测试
         * Summary: 性能优化测试
         */
        public async Task<QueryTestCatcheLimitResponse> QueryTestCatcheLimitExAsync(QueryTestCatcheLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestCatcheLimitResponse>(await DoRequestAsync("1.0", "demo.test.catche.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用
         * Summary: 测试使用
         */
        public QueryTestForLimitResponse QueryTestForLimit(QueryTestForLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestForLimitEx(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: 测试使用
         */
        public async Task<QueryTestForLimitResponse> QueryTestForLimitAsync(QueryTestForLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestForLimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试使用
         * Summary: 测试使用
         */
        public QueryTestForLimitResponse QueryTestForLimitEx(QueryTestForLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestForLimitResponse>(DoRequest("1.0", "demo.test.for.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试使用
         * Summary: 测试使用
         */
        public async Task<QueryTestForLimitResponse> QueryTestForLimitExAsync(QueryTestForLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestForLimitResponse>(await DoRequestAsync("1.0", "demo.test.for.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryTestTestTestResponse QueryTestTestTest(QueryTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestTestTestEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryTestTestTestResponse> QueryTestTestTestAsync(QueryTestTestTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestTestTestExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public QueryTestTestTestResponse QueryTestTestTestEx(QueryTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestTestResponse>(DoRequest("1.0", "demo.test.test.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<QueryTestTestTestResponse> QueryTestTestTestExAsync(QueryTestTestTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTestTestResponse>(await DoRequestAsync("1.0", "demo.test.test.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: a
         * Summary: abcde
         */
        public QueryABCResponse QueryABC(QueryABCRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryABCEx(request, headers, runtime);
        }

        /**
         * Description: a
         * Summary: abcde
         */
        public async Task<QueryABCResponse> QueryABCAsync(QueryABCRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryABCExAsync(request, headers, runtime);
        }

        /**
         * Description: a
         * Summary: abcde
         */
        public QueryABCResponse QueryABCEx(QueryABCRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryABCResponse>(DoRequest("1.0", "demo.a.b.c.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: a
         * Summary: abcde
         */
        public async Task<QueryABCResponse> QueryABCExAsync(QueryABCRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryABCResponse>(await DoRequestAsync("1.0", "demo.a.b.c.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 近端接口测试
         * Summary: 近端接口测试
         */
        public QueryTestEmbedUserResponse QueryTestEmbedUser(QueryTestEmbedUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestEmbedUserEx(request, headers, runtime);
        }

        /**
         * Description: 近端接口测试
         * Summary: 近端接口测试
         */
        public async Task<QueryTestEmbedUserResponse> QueryTestEmbedUserAsync(QueryTestEmbedUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestEmbedUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 近端接口测试
         * Summary: 近端接口测试
         */
        public QueryTestEmbedUserResponse QueryTestEmbedUserEx(QueryTestEmbedUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestEmbedUserResponse>(DoRequest("1.0", "demo.test.embed.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 近端接口测试
         * Summary: 近端接口测试
         */
        public async Task<QueryTestEmbedUserResponse> QueryTestEmbedUserExAsync(QueryTestEmbedUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestEmbedUserResponse>(await DoRequestAsync("1.0", "demo.test.embed.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sss
         * Summary: sss
         */
        public QueryAasSaSaResponse QueryAasSaSa(QueryAasSaSaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAasSaSaEx(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: sss
         */
        public async Task<QueryAasSaSaResponse> QueryAasSaSaAsync(QueryAasSaSaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAasSaSaExAsync(request, headers, runtime);
        }

        /**
         * Description: sss
         * Summary: sss
         */
        public QueryAasSaSaResponse QueryAasSaSaEx(QueryAasSaSaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAasSaSaResponse>(DoRequest("1.0", "demo.aas.sa.sa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sss
         * Summary: sss
         */
        public async Task<QueryAasSaSaResponse> QueryAasSaSaExAsync(QueryAasSaSaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAasSaSaResponse>(await DoRequestAsync("1.0", "demo.aas.sa.sa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public QueryApiWhiteListResponse QueryApiWhiteList(QueryApiWhiteListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiWhiteListEx(request, headers, runtime);
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public async Task<QueryApiWhiteListResponse> QueryApiWhiteListAsync(QueryApiWhiteListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiWhiteListExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public QueryApiWhiteListResponse QueryApiWhiteListEx(QueryApiWhiteListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiWhiteListResponse>(DoRequest("1.0", "demo.api.white.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public async Task<QueryApiWhiteListResponse> QueryApiWhiteListExAsync(QueryApiWhiteListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiWhiteListResponse>(await DoRequestAsync("1.0", "demo.api.white.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public QueryApiBlackListResponse QueryApiBlackList(QueryApiBlackListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiBlackListEx(request, headers, runtime);
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public async Task<QueryApiBlackListResponse> QueryApiBlackListAsync(QueryApiBlackListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiBlackListExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public QueryApiBlackListResponse QueryApiBlackListEx(QueryApiBlackListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiBlackListResponse>(DoRequest("1.0", "demo.api.black.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
         * Summary: 自动化测试需要，【请勿做任何改动！】
         */
        public async Task<QueryApiBlackListResponse> QueryApiBlackListExAsync(QueryApiBlackListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiBlackListResponse>(await DoRequestAsync("1.0", "demo.api.black.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问白名单测试
         */
        public QueryIpWhiteListResponse QueryIpWhiteList(QueryIpWhiteListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpWhiteListEx(request, headers, runtime);
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问白名单测试
         */
        public async Task<QueryIpWhiteListResponse> QueryIpWhiteListAsync(QueryIpWhiteListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpWhiteListExAsync(request, headers, runtime);
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问白名单测试
         */
        public QueryIpWhiteListResponse QueryIpWhiteListEx(QueryIpWhiteListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpWhiteListResponse>(DoRequest("1.0", "demo.ip.white.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问白名单测试
         */
        public async Task<QueryIpWhiteListResponse> QueryIpWhiteListExAsync(QueryIpWhiteListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpWhiteListResponse>(await DoRequestAsync("1.0", "demo.ip.white.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问黑名单测试
         */
        public QueryIpBlackListResponse QueryIpBlackList(QueryIpBlackListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpBlackListEx(request, headers, runtime);
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问黑名单测试
         */
        public async Task<QueryIpBlackListResponse> QueryIpBlackListAsync(QueryIpBlackListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpBlackListExAsync(request, headers, runtime);
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问黑名单测试
         */
        public QueryIpBlackListResponse QueryIpBlackListEx(QueryIpBlackListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpBlackListResponse>(DoRequest("1.0", "demo.ip.black.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ip访问白名单测试
         * Summary: 【自动化】ip访问黑名单测试
         */
        public async Task<QueryIpBlackListResponse> QueryIpBlackListExAsync(QueryIpBlackListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpBlackListResponse>(await DoRequestAsync("1.0", "demo.ip.black.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试策略
         * Summary: 【自动化】重试策略
         */
        public QueryIpRetryResponse QueryIpRetry(QueryIpRetryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIpRetryEx(request, headers, runtime);
        }

        /**
         * Description: 重试策略
         * Summary: 【自动化】重试策略
         */
        public async Task<QueryIpRetryResponse> QueryIpRetryAsync(QueryIpRetryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIpRetryExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试策略
         * Summary: 【自动化】重试策略
         */
        public QueryIpRetryResponse QueryIpRetryEx(QueryIpRetryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpRetryResponse>(DoRequest("1.0", "demo.ip.retry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试策略
         * Summary: 【自动化】重试策略
         */
        public async Task<QueryIpRetryResponse> QueryIpRetryExAsync(QueryIpRetryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIpRetryResponse>(await DoRequestAsync("1.0", "demo.ip.retry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public QueryTestTimeTestaResponse QueryTestTimeTesta(QueryTestTimeTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestTimeTestaEx(request, headers, runtime);
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public async Task<QueryTestTimeTestaResponse> QueryTestTimeTestaAsync(QueryTestTimeTestaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestTimeTestaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public QueryTestTimeTestaResponse QueryTestTimeTestaEx(QueryTestTimeTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTimeTestaResponse>(DoRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public async Task<QueryTestTimeTestaResponse> QueryTestTimeTestaExAsync(QueryTestTimeTestaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTimeTestaResponse>(await DoRequestAsync("1.0", "demo.test.time.testa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: oas 测试使用
         * Summary: oas 测试使用
         */
        public QueryOasRestResponse QueryOasRest(QueryOasRestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOasRestEx(request, headers, runtime);
        }

        /**
         * Description: oas 测试使用
         * Summary: oas 测试使用
         */
        public async Task<QueryOasRestResponse> QueryOasRestAsync(QueryOasRestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOasRestExAsync(request, headers, runtime);
        }

        /**
         * Description: oas 测试使用
         * Summary: oas 测试使用
         */
        public QueryOasRestResponse QueryOasRestEx(QueryOasRestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOasRestResponse>(DoRequest("1.0", "demo.oas.rest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: oas 测试使用
         * Summary: oas 测试使用
         */
        public async Task<QueryOasRestResponse> QueryOasRestExAsync(QueryOasRestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOasRestResponse>(await DoRequestAsync("1.0", "demo.oas.rest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypeResponse QueryTestContentType(QueryTestContentTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypeEx(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypeResponse> QueryTestContentTypeAsync(QueryTestContentTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypeResponse QueryTestContentTypeEx(QueryTestContentTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypeResponse>(DoRequest("1.0", "demo.test.content.type.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypeResponse> QueryTestContentTypeExAsync(QueryTestContentTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypeResponse>(await DoRequestAsync("1.0", "demo.test.content.type.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试contentType
         * Summary: 自动化测试contentType
         */
        public QueryTestContentTypeoneResponse QueryTestContentTypeone(QueryTestContentTypeoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypeoneEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试contentType
         * Summary: 自动化测试contentType
         */
        public async Task<QueryTestContentTypeoneResponse> QueryTestContentTypeoneAsync(QueryTestContentTypeoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypeoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试contentType
         * Summary: 自动化测试contentType
         */
        public QueryTestContentTypeoneResponse QueryTestContentTypeoneEx(QueryTestContentTypeoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypeoneResponse>(DoRequest("1.0", "demo.test.content.typeone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试contentType
         * Summary: 自动化测试contentType
         */
        public async Task<QueryTestContentTypeoneResponse> QueryTestContentTypeoneExAsync(QueryTestContentTypeoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypeoneResponse>(await DoRequestAsync("1.0", "demo.test.content.typeone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypetwoResponse QueryTestContentTypetwo(QueryTestContentTypetwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypetwoEx(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypetwoResponse> QueryTestContentTypetwoAsync(QueryTestContentTypetwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypetwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypetwoResponse QueryTestContentTypetwoEx(QueryTestContentTypetwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypetwoResponse>(DoRequest("1.0", "demo.test.content.typetwo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypetwoResponse> QueryTestContentTypetwoExAsync(QueryTestContentTypetwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypetwoResponse>(await DoRequestAsync("1.0", "demo.test.content.typetwo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypethreeResponse QueryTestContentTypethree(QueryTestContentTypethreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypethreeEx(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypethreeResponse> QueryTestContentTypethreeAsync(QueryTestContentTypethreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypethreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypethreeResponse QueryTestContentTypethreeEx(QueryTestContentTypethreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypethreeResponse>(DoRequest("1.0", "demo.test.content.typethree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypethreeResponse> QueryTestContentTypethreeExAsync(QueryTestContentTypethreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypethreeResponse>(await DoRequestAsync("1.0", "demo.test.content.typethree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypefourResponse QueryTestContentTypefour(QueryTestContentTypefourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypefourEx(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypefourResponse> QueryTestContentTypefourAsync(QueryTestContentTypefourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypefourExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypefourResponse QueryTestContentTypefourEx(QueryTestContentTypefourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypefourResponse>(DoRequest("1.0", "demo.test.content.typefour.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypefourResponse> QueryTestContentTypefourExAsync(QueryTestContentTypefourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypefourResponse>(await DoRequestAsync("1.0", "demo.test.content.typefour.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypefiveResponse QueryTestContentTypefive(QueryTestContentTypefiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestContentTypefiveEx(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypefiveResponse> QueryTestContentTypefiveAsync(QueryTestContentTypefiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestContentTypefiveExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public QueryTestContentTypefiveResponse QueryTestContentTypefiveEx(QueryTestContentTypefiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypefiveResponse>(DoRequest("1.0", "demo.test.content.typefive.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化contenttype兼容测试
         * Summary: 自动化contenttype兼容测试
         */
        public async Task<QueryTestContentTypefiveResponse> QueryTestContentTypefiveExAsync(QueryTestContentTypefiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestContentTypefiveResponse>(await DoRequestAsync("1.0", "demo.test.content.typefive.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 金融场景风险分析
         * Summary: 金融场景风险分析
         */
        public QueryAgentFinancialRiskResponse QueryAgentFinancialRisk(QueryAgentFinancialRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAgentFinancialRiskEx(request, headers, runtime);
        }

        /**
         * Description: 金融场景风险分析
         * Summary: 金融场景风险分析
         */
        public async Task<QueryAgentFinancialRiskResponse> QueryAgentFinancialRiskAsync(QueryAgentFinancialRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAgentFinancialRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 金融场景风险分析
         * Summary: 金融场景风险分析
         */
        public QueryAgentFinancialRiskResponse QueryAgentFinancialRiskEx(QueryAgentFinancialRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentFinancialRiskResponse>(DoRequest("1.0", "demo.agent.financial.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 金融场景风险分析
         * Summary: 金融场景风险分析
         */
        public async Task<QueryAgentFinancialRiskResponse> QueryAgentFinancialRiskExAsync(QueryAgentFinancialRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentFinancialRiskResponse>(await DoRequestAsync("1.0", "demo.agent.financial.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流式处理
         * Summary: 流式处理
         */
        public QueryStreamTestmethodResponse QueryStreamTestmethod(QueryStreamTestmethodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamTestmethodEx(request, headers, runtime);
        }

        /**
         * Description: 流式处理
         * Summary: 流式处理
         */
        public async Task<QueryStreamTestmethodResponse> QueryStreamTestmethodAsync(QueryStreamTestmethodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamTestmethodExAsync(request, headers, runtime);
        }

        /**
         * Description: 流式处理
         * Summary: 流式处理
         */
        public QueryStreamTestmethodResponse QueryStreamTestmethodEx(QueryStreamTestmethodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTestmethodResponse>(DoRequest("1.0", "demo.stream.testmethod.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流式处理
         * Summary: 流式处理
         */
        public async Task<QueryStreamTestmethodResponse> QueryStreamTestmethodExAsync(QueryStreamTestmethodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTestmethodResponse>(await DoRequestAsync("1.0", "demo.stream.testmethod.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模拟下游超时情况
         * Summary: 流式超时测试接口
         */
        public QueryStreamTimeoutResponse QueryStreamTimeout(QueryStreamTimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamTimeoutEx(request, headers, runtime);
        }

        /**
         * Description: 模拟下游超时情况
         * Summary: 流式超时测试接口
         */
        public async Task<QueryStreamTimeoutResponse> QueryStreamTimeoutAsync(QueryStreamTimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamTimeoutExAsync(request, headers, runtime);
        }

        /**
         * Description: 模拟下游超时情况
         * Summary: 流式超时测试接口
         */
        public QueryStreamTimeoutResponse QueryStreamTimeoutEx(QueryStreamTimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTimeoutResponse>(DoRequest("1.0", "demo.stream.timeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模拟下游超时情况
         * Summary: 流式超时测试接口
         */
        public async Task<QueryStreamTimeoutResponse> QueryStreamTimeoutExAsync(QueryStreamTimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamTimeoutResponse>(await DoRequestAsync("1.0", "demo.stream.timeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模拟下游返回非json的情况
         * Summary: 流式下游返回非json
         */
        public QueryStreamNonjsonResponse QueryStreamNonjson(QueryStreamNonjsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamNonjsonEx(request, headers, runtime);
        }

        /**
         * Description: 模拟下游返回非json的情况
         * Summary: 流式下游返回非json
         */
        public async Task<QueryStreamNonjsonResponse> QueryStreamNonjsonAsync(QueryStreamNonjsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamNonjsonExAsync(request, headers, runtime);
        }

        /**
         * Description: 模拟下游返回非json的情况
         * Summary: 流式下游返回非json
         */
        public QueryStreamNonjsonResponse QueryStreamNonjsonEx(QueryStreamNonjsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamNonjsonResponse>(DoRequest("1.0", "demo.stream.nonjson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模拟下游返回非json的情况
         * Summary: 流式下游返回非json
         */
        public async Task<QueryStreamNonjsonResponse> QueryStreamNonjsonExAsync(QueryStreamNonjsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamNonjsonResponse>(await DoRequestAsync("1.0", "demo.stream.nonjson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流式出参包含特殊字符
         * Summary: 流式出参包含特殊字符
         */
        public QueryStreamSpecialCharactersResponse QueryStreamSpecialCharacters(QueryStreamSpecialCharactersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamSpecialCharactersEx(request, headers, runtime);
        }

        /**
         * Description: 流式出参包含特殊字符
         * Summary: 流式出参包含特殊字符
         */
        public async Task<QueryStreamSpecialCharactersResponse> QueryStreamSpecialCharactersAsync(QueryStreamSpecialCharactersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamSpecialCharactersExAsync(request, headers, runtime);
        }

        /**
         * Description: 流式出参包含特殊字符
         * Summary: 流式出参包含特殊字符
         */
        public QueryStreamSpecialCharactersResponse QueryStreamSpecialCharactersEx(QueryStreamSpecialCharactersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamSpecialCharactersResponse>(DoRequest("1.0", "demo.stream.special.characters.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流式出参包含特殊字符
         * Summary: 流式出参包含特殊字符
         */
        public async Task<QueryStreamSpecialCharactersResponse> QueryStreamSpecialCharactersExAsync(QueryStreamSpecialCharactersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamSpecialCharactersResponse>(await DoRequestAsync("1.0", "demo.stream.special.characters.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非流式返回
         * Summary: 非流式返回
         */
        public QueryStreamNonstreamResponse QueryStreamNonstream(QueryStreamNonstreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStreamNonstreamEx(request, headers, runtime);
        }

        /**
         * Description: 非流式返回
         * Summary: 非流式返回
         */
        public async Task<QueryStreamNonstreamResponse> QueryStreamNonstreamAsync(QueryStreamNonstreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStreamNonstreamExAsync(request, headers, runtime);
        }

        /**
         * Description: 非流式返回
         * Summary: 非流式返回
         */
        public QueryStreamNonstreamResponse QueryStreamNonstreamEx(QueryStreamNonstreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamNonstreamResponse>(DoRequest("1.0", "demo.stream.nonstream.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非流式返回
         * Summary: 非流式返回
         */
        public async Task<QueryStreamNonstreamResponse> QueryStreamNonstreamExAsync(QueryStreamNonstreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStreamNonstreamResponse>(await DoRequestAsync("1.0", "demo.stream.nonstream.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 压测接口4，用于压测
         * Summary: 压测接口4
         */
        public QueryLoadtestTimeFourResponse QueryLoadtestTimeFour(QueryLoadtestTimeFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadtestTimeFourEx(request, headers, runtime);
        }

        /**
         * Description: 压测接口4，用于压测
         * Summary: 压测接口4
         */
        public async Task<QueryLoadtestTimeFourResponse> QueryLoadtestTimeFourAsync(QueryLoadtestTimeFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadtestTimeFourExAsync(request, headers, runtime);
        }

        /**
         * Description: 压测接口4，用于压测
         * Summary: 压测接口4
         */
        public QueryLoadtestTimeFourResponse QueryLoadtestTimeFourEx(QueryLoadtestTimeFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeFourResponse>(DoRequest("1.0", "demo.loadtest.time.four.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口4，用于压测
         * Summary: 压测接口4
         */
        public async Task<QueryLoadtestTimeFourResponse> QueryLoadtestTimeFourExAsync(QueryLoadtestTimeFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeFourResponse>(await DoRequestAsync("1.0", "demo.loadtest.time.four.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口5，用于压测
         * Summary: 压测接口5
         */
        public QueryLoadtestTimeFiveResponse QueryLoadtestTimeFive(QueryLoadtestTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadtestTimeFiveEx(request, headers, runtime);
        }

        /**
         * Description: 压测接口5，用于压测
         * Summary: 压测接口5
         */
        public async Task<QueryLoadtestTimeFiveResponse> QueryLoadtestTimeFiveAsync(QueryLoadtestTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadtestTimeFiveExAsync(request, headers, runtime);
        }

        /**
         * Description: 压测接口5，用于压测
         * Summary: 压测接口5
         */
        public QueryLoadtestTimeFiveResponse QueryLoadtestTimeFiveEx(QueryLoadtestTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeFiveResponse>(DoRequest("1.0", "demo.loadtest.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 压测接口5，用于压测
         * Summary: 压测接口5
         */
        public async Task<QueryLoadtestTimeFiveResponse> QueryLoadtestTimeFiveExAsync(QueryLoadtestTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadtestTimeFiveResponse>(await DoRequestAsync("1.0", "demo.loadtest.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型护栏多轮对话提问检测 测试
         * Summary: 大模型护栏多轮对话提问检测
         */
        public CheckAicoguardcoreAicoguardrailsQuestionResponse CheckAicoguardcoreAicoguardrailsQuestion(CheckAicoguardcoreAicoguardrailsQuestionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime);
        }

        /**
         * Description: 大模型护栏多轮对话提问检测 测试
         * Summary: 大模型护栏多轮对话提问检测
         */
        public async Task<CheckAicoguardcoreAicoguardrailsQuestionResponse> CheckAicoguardcoreAicoguardrailsQuestionAsync(CheckAicoguardcoreAicoguardrailsQuestionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAicoguardcoreAicoguardrailsQuestionExAsync(request, headers, runtime);
        }

        /**
         * Description: 大模型护栏多轮对话提问检测 测试
         * Summary: 大模型护栏多轮对话提问检测
         */
        public CheckAicoguardcoreAicoguardrailsQuestionResponse CheckAicoguardcoreAicoguardrailsQuestionEx(CheckAicoguardcoreAicoguardrailsQuestionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAicoguardcoreAicoguardrailsQuestionResponse>(DoRequest("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型护栏多轮对话提问检测 测试
         * Summary: 大模型护栏多轮对话提问检测
         */
        public async Task<CheckAicoguardcoreAicoguardrailsQuestionResponse> CheckAicoguardcoreAicoguardrailsQuestionExAsync(CheckAicoguardcoreAicoguardrailsQuestionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAicoguardcoreAicoguardrailsQuestionResponse>(await DoRequestAsync("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public QueryTestTimeMenhuResponse QueryTestTimeMenhu(QueryTestTimeMenhuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestTimeMenhuEx(request, headers, runtime);
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public async Task<QueryTestTimeMenhuResponse> QueryTestTimeMenhuAsync(QueryTestTimeMenhuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestTimeMenhuExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public QueryTestTimeMenhuResponse QueryTestTimeMenhuEx(QueryTestTimeMenhuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTimeMenhuResponse>(DoRequest("1.0", "demo.test.time.menhu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人工作台二期测试
         * Summary: 个人工作台二期测试
         */
        public async Task<QueryTestTimeMenhuResponse> QueryTestTimeMenhuExAsync(QueryTestTimeMenhuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestTimeMenhuResponse>(await DoRequestAsync("1.0", "demo.test.time.menhu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
