// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_ff19a88a999c4b3587aa011598273c77.Models;

namespace AntChain.SDK.Ak_ff19a88a999c4b3587aa011598273c77
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "ak_ff19a88a999c4b3587aa011598273c77"},
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "ak_ff19a88a999c4b3587aa011598273c77"},
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
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public StatusDemoGatewayCheckResponse StatusDemoGatewayCheck(StatusDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StatusDemoGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public async Task<StatusDemoGatewayCheckResponse> StatusDemoGatewayCheckAsync(StatusDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StatusDemoGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public StatusDemoGatewayCheckResponse StatusDemoGatewayCheckEx(StatusDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusDemoGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当前服务器当前状态1
         * Summary: 检查服务状态
         */
        public async Task<StatusDemoGatewayCheckResponse> StatusDemoGatewayCheckExAsync(StatusDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusDemoGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当输入的值
         * Summary: 返回输入值
         */
        public EchoDemoGatewayCheckResponse EchoDemoGatewayCheck(EchoDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EchoDemoGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当输入的值
         * Summary: 返回输入值
         */
        public async Task<EchoDemoGatewayCheckResponse> EchoDemoGatewayCheckAsync(EchoDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EchoDemoGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: Demo接口，返回当输入的值
         * Summary: 返回输入值
         */
        public EchoDemoGatewayCheckResponse EchoDemoGatewayCheckEx(EchoDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    EchoDemoGatewayCheckResponse echoDemoGatewayCheckResponse = new EchoDemoGatewayCheckResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return echoDemoGatewayCheckResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EchoDemoGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Demo接口，返回当输入的值
         * Summary: 返回输入值
         */
        public async Task<EchoDemoGatewayCheckResponse> EchoDemoGatewayCheckExAsync(EchoDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    EchoDemoGatewayCheckResponse echoDemoGatewayCheckResponse = new EchoDemoGatewayCheckResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return echoDemoGatewayCheckResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EchoDemoGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public QueryDemoGatewayCheckResponse QueryDemoGatewayCheck(QueryDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public async Task<QueryDemoGatewayCheckResponse> QueryDemoGatewayCheckAsync(QueryDemoGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public QueryDemoGatewayCheckResponse QueryDemoGatewayCheckEx(QueryDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckResponse>(DoRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ceshi
         * Summary: ss
         */
        public async Task<QueryDemoGatewayCheckResponse> QueryDemoGatewayCheckExAsync(QueryDemoGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckResponse>(await DoRequestAsync("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: s
         * Summary: ss
         */
        public BindDemoDemoCheckEeeResponse BindDemoDemoCheckEee(BindDemoDemoCheckEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoDemoCheckEeeEx(request, headers, runtime);
        }

        /**
         * Description: s
         * Summary: ss
         */
        public async Task<BindDemoDemoCheckEeeResponse> BindDemoDemoCheckEeeAsync(BindDemoDemoCheckEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoDemoCheckEeeExAsync(request, headers, runtime);
        }

        /**
         * Description: s
         * Summary: ss
         */
        public BindDemoDemoCheckEeeResponse BindDemoDemoCheckEeeEx(BindDemoDemoCheckEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoDemoCheckEeeResponse>(DoRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: s
         * Summary: ss
         */
        public async Task<BindDemoDemoCheckEeeResponse> BindDemoDemoCheckEeeExAsync(BindDemoDemoCheckEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoDemoCheckEeeResponse>(await DoRequestAsync("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public BindDemoGatewayAbcTestResponse BindDemoGatewayAbcTest(BindDemoGatewayAbcTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoGatewayAbcTestEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<BindDemoGatewayAbcTestResponse> BindDemoGatewayAbcTestAsync(BindDemoGatewayAbcTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoGatewayAbcTestExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public BindDemoGatewayAbcTestResponse BindDemoGatewayAbcTestEx(BindDemoGatewayAbcTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoGatewayAbcTestResponse>(DoRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<BindDemoGatewayAbcTestResponse> BindDemoGatewayAbcTestExAsync(BindDemoGatewayAbcTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoGatewayAbcTestResponse>(await DoRequestAsync("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public QueryDemoGatewayCheckEchotimeoutResponse QueryDemoGatewayCheckEchotimeout(QueryDemoGatewayCheckEchotimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoGatewayCheckEchotimeoutEx(request, headers, runtime);
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public async Task<QueryDemoGatewayCheckEchotimeoutResponse> QueryDemoGatewayCheckEchotimeoutAsync(QueryDemoGatewayCheckEchotimeoutRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoGatewayCheckEchotimeoutExAsync(request, headers, runtime);
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public QueryDemoGatewayCheckEchotimeoutResponse QueryDemoGatewayCheckEchotimeoutEx(QueryDemoGatewayCheckEchotimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckEchotimeoutResponse>(DoRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 超时测试
         * Summary: 超时
         */
        public async Task<QueryDemoGatewayCheckEchotimeoutResponse> QueryDemoGatewayCheckEchotimeoutExAsync(QueryDemoGatewayCheckEchotimeoutRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckEchotimeoutResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public QueryDemoGatewayCheckEchotenResponse QueryDemoGatewayCheckEchoten(QueryDemoGatewayCheckEchotenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoGatewayCheckEchotenEx(request, headers, runtime);
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public async Task<QueryDemoGatewayCheckEchotenResponse> QueryDemoGatewayCheckEchotenAsync(QueryDemoGatewayCheckEchotenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoGatewayCheckEchotenExAsync(request, headers, runtime);
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public QueryDemoGatewayCheckEchotenResponse QueryDemoGatewayCheckEchotenEx(QueryDemoGatewayCheckEchotenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckEchotenResponse>(DoRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 10  测测aa
         * Summary: 10s
         */
        public async Task<QueryDemoGatewayCheckEchotenResponse> QueryDemoGatewayCheckEchotenExAsync(QueryDemoGatewayCheckEchotenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoGatewayCheckEchotenResponse>(await DoRequestAsync("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public InitDemoBbpInsuranceUserResponse InitDemoBbpInsuranceUser(InitDemoBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitDemoBbpInsuranceUserEx(request, headers, runtime);
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitDemoBbpInsuranceUserResponse> InitDemoBbpInsuranceUserAsync(InitDemoBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitDemoBbpInsuranceUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public InitDemoBbpInsuranceUserResponse InitDemoBbpInsuranceUserEx(InitDemoBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitDemoBbpInsuranceUserResponse>(DoRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司用户埋点信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitDemoBbpInsuranceUserResponse> InitDemoBbpInsuranceUserExAsync(InitDemoBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitDemoBbpInsuranceUserResponse>(await DoRequestAsync("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public UpdateDemoCjtestCjResponse UpdateDemoCjtestCj(UpdateDemoCjtestCjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDemoCjtestCjEx(request, headers, runtime);
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public async Task<UpdateDemoCjtestCjResponse> UpdateDemoCjtestCjAsync(UpdateDemoCjtestCjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDemoCjtestCjExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public UpdateDemoCjtestCjResponse UpdateDemoCjtestCjEx(UpdateDemoCjtestCjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDemoCjtestCjResponse>(DoRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关评审能力
         * Summary: 评审测试
         */
        public async Task<UpdateDemoCjtestCjResponse> UpdateDemoCjtestCjExAsync(UpdateDemoCjtestCjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDemoCjtestCjResponse>(await DoRequestAsync("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public ResetDemoComCnCcResponse ResetDemoComCnCc(ResetDemoComCnCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetDemoComCnCcEx(request, headers, runtime);
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public async Task<ResetDemoComCnCcResponse> ResetDemoComCnCcAsync(ResetDemoComCnCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetDemoComCnCcExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public ResetDemoComCnCcResponse ResetDemoComCnCcEx(ResetDemoComCnCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoComCnCcResponse>(DoRequest("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试api描述
         * Summary: api简介
         */
        public async Task<ResetDemoComCnCcResponse> ResetDemoComCnCcExAsync(ResetDemoComCnCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoComCnCcResponse>(await DoRequestAsync("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件测试
         * Summary: 文件测试
         */
        public UploadDemoCjtestSourceFileResponse UploadDemoCjtestSourceFile(UploadDemoCjtestSourceFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadDemoCjtestSourceFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件测试
         * Summary: 文件测试
         */
        public async Task<UploadDemoCjtestSourceFileResponse> UploadDemoCjtestSourceFileAsync(UploadDemoCjtestSourceFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadDemoCjtestSourceFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件测试
         * Summary: 文件测试
         */
        public UploadDemoCjtestSourceFileResponse UploadDemoCjtestSourceFileEx(UploadDemoCjtestSourceFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadDemoCjtestSourceFileResponse uploadDemoCjtestSourceFileResponse = new UploadDemoCjtestSourceFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadDemoCjtestSourceFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDemoCjtestSourceFileResponse>(DoRequest("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件测试
         * Summary: 文件测试
         */
        public async Task<UploadDemoCjtestSourceFileResponse> UploadDemoCjtestSourceFileExAsync(UploadDemoCjtestSourceFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadDemoCjtestSourceFileResponse uploadDemoCjtestSourceFileResponse = new UploadDemoCjtestSourceFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadDemoCjtestSourceFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDemoCjtestSourceFileResponse>(await DoRequestAsync("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试返回值限制
         * Summary: dev测试返回值限制
         */
        public QueryDemoCjtestCjResResponse QueryDemoCjtestCjRes(QueryDemoCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoCjtestCjResEx(request, headers, runtime);
        }

        /**
         * Description: 测试返回值限制
         * Summary: dev测试返回值限制
         */
        public async Task<QueryDemoCjtestCjResResponse> QueryDemoCjtestCjResAsync(QueryDemoCjtestCjResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoCjtestCjResExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试返回值限制
         * Summary: dev测试返回值限制
         */
        public QueryDemoCjtestCjResResponse QueryDemoCjtestCjResEx(QueryDemoCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCjtestCjResResponse>(DoRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试返回值限制
         * Summary: dev测试返回值限制
         */
        public async Task<QueryDemoCjtestCjResResponse> QueryDemoCjtestCjResExAsync(QueryDemoCjtestCjResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCjtestCjResResponse>(await DoRequestAsync("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public ResetDemoCjtestApiAuthorizeResponse ResetDemoCjtestApiAuthorize(ResetDemoCjtestApiAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetDemoCjtestApiAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<ResetDemoCjtestApiAuthorizeResponse> ResetDemoCjtestApiAuthorizeAsync(ResetDemoCjtestApiAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetDemoCjtestApiAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: test
         * Summary: test
         */
        public ResetDemoCjtestApiAuthorizeResponse ResetDemoCjtestApiAuthorizeEx(ResetDemoCjtestApiAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoCjtestApiAuthorizeResponse>(DoRequest("1.0", "demo.cjtest.api.authorize.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: test
         * Summary: test
         */
        public async Task<ResetDemoCjtestApiAuthorizeResponse> ResetDemoCjtestApiAuthorizeExAsync(ResetDemoCjtestApiAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoCjtestApiAuthorizeResponse>(await DoRequestAsync("1.0", "demo.cjtest.api.authorize.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public InitDemoGatewayRoadResponse InitDemoGatewayRoad(InitDemoGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitDemoGatewayRoadEx(request, headers, runtime);
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public async Task<InitDemoGatewayRoadResponse> InitDemoGatewayRoadAsync(InitDemoGatewayRoadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitDemoGatewayRoadExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public InitDemoGatewayRoadResponse InitDemoGatewayRoadEx(InitDemoGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitDemoGatewayRoadResponse>(DoRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
         * Summary: road.init（Fr AutoT）
         */
        public async Task<InitDemoGatewayRoadResponse> InitDemoGatewayRoadExAsync(InitDemoGatewayRoadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitDemoGatewayRoadResponse>(await DoRequestAsync("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: api简介
         */
        public ImportDemoComCnTestResponse ImportDemoComCnTest(ImportDemoComCnTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDemoComCnTestEx(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: api简介
         */
        public async Task<ImportDemoComCnTestResponse> ImportDemoComCnTestAsync(ImportDemoComCnTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDemoComCnTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 1
         * Summary: api简介
         */
        public ImportDemoComCnTestResponse ImportDemoComCnTestEx(ImportDemoComCnTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportDemoComCnTestResponse importDemoComCnTestResponse = new ImportDemoComCnTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importDemoComCnTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDemoComCnTestResponse>(DoRequest("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1
         * Summary: api简介
         */
        public async Task<ImportDemoComCnTestResponse> ImportDemoComCnTestExAsync(ImportDemoComCnTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportDemoComCnTestResponse importDemoComCnTestResponse = new ImportDemoComCnTestResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importDemoComCnTestResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDemoComCnTestResponse>(await DoRequestAsync("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestc(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishDemoSaasTestTestcEx(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcAsync(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishDemoSaasTestTestcExAsync(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestcEx(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(DoRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcExAsync(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(await DoRequestAsync("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ResetDemoSaasTestTestdResponse ResetDemoSaasTestTestd(ResetDemoSaasTestTestdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetDemoSaasTestTestdEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ResetDemoSaasTestTestdResponse> ResetDemoSaasTestTestdAsync(ResetDemoSaasTestTestdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetDemoSaasTestTestdExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ResetDemoSaasTestTestdResponse ResetDemoSaasTestTestdEx(ResetDemoSaasTestTestdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoSaasTestTestdResponse>(DoRequest("1.0", "demo.saas.test.testd.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ResetDemoSaasTestTestdResponse> ResetDemoSaasTestTestdExAsync(ResetDemoSaasTestTestdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoSaasTestTestdResponse>(await DoRequestAsync("1.0", "demo.saas.test.testd.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OperateDemoSaasTestTesteResponse OperateDemoSaasTestTeste(OperateDemoSaasTestTesteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDemoSaasTestTesteEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OperateDemoSaasTestTesteResponse> OperateDemoSaasTestTesteAsync(OperateDemoSaasTestTesteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDemoSaasTestTesteExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OperateDemoSaasTestTesteResponse OperateDemoSaasTestTesteEx(OperateDemoSaasTestTesteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDemoSaasTestTesteResponse>(DoRequest("1.0", "demo.saas.test.teste.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OperateDemoSaasTestTesteResponse> OperateDemoSaasTestTesteExAsync(OperateDemoSaasTestTesteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDemoSaasTestTesteResponse>(await DoRequestAsync("1.0", "demo.saas.test.teste.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public BatchcreateDemoSaasTestTestfResponse BatchcreateDemoSaasTestTestf(BatchcreateDemoSaasTestTestfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateDemoSaasTestTestfEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<BatchcreateDemoSaasTestTestfResponse> BatchcreateDemoSaasTestTestfAsync(BatchcreateDemoSaasTestTestfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateDemoSaasTestTestfExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public BatchcreateDemoSaasTestTestfResponse BatchcreateDemoSaasTestTestfEx(BatchcreateDemoSaasTestTestfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDemoSaasTestTestfResponse>(DoRequest("1.0", "demo.saas.test.testf.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<BatchcreateDemoSaasTestTestfResponse> BatchcreateDemoSaasTestTestfExAsync(BatchcreateDemoSaasTestTestfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDemoSaasTestTestfResponse>(await DoRequestAsync("1.0", "demo.saas.test.testf.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesth(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTesthEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthAsync(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTesthExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesthEx(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(DoRequest("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthExAsync(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(await DoRequestAsync("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTesti(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTestiEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiAsync(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTestiExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTestiEx(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(DoRequest("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiExAsync(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(await DoRequestAsync("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
