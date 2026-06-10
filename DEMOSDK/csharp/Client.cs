// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DEMOSDK.Models;

namespace AntChain.SDK.DEMOSDK
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
                        {"sdk_version", "1.4.5"},
                        {"_prod_code", "DEMOSDK"},
                        {"_prod_channel", "default"},
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
                        {"sdk_version", "1.4.5"},
                        {"_prod_code", "DEMOSDK"},
                        {"_prod_channel", "default"},
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
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTestapiResponse QueryTestapi(QueryTestapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestapiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTestapiResponse> QueryTestapiAsync(QueryTestapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestapiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTestapiResponse QueryTestapiEx(QueryTestapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestapiResponse>(DoRequest("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTestapiResponse> QueryTestapiExAsync(QueryTestapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestapiResponse>(await DoRequestAsync("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 123
        /// Summary: 123</para>
        /// </description>
        public RemarkTestResponse RemarkTest(RemarkTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemarkTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 123
        /// Summary: 123</para>
        /// </description>
        public async Task<RemarkTestResponse> RemarkTestAsync(RemarkTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemarkTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 123
        /// Summary: 123</para>
        /// </description>
        public RemarkTestResponse RemarkTestEx(RemarkTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemarkTestResponse>(DoRequest("1.0", "antchain.demosdk.test.remark", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 123
        /// Summary: 123</para>
        /// </description>
        public async Task<RemarkTestResponse> RemarkTestExAsync(RemarkTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemarkTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.remark", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestPreFullResponse TestPreFull(TestPreFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestPreFullEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestPreFullResponse> TestPreFullAsync(TestPreFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestPreFullExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestPreFullResponse TestPreFullEx(TestPreFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.pre.full.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestPreFullResponse testPreFullResponse = new TestPreFullResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testPreFullResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestPreFullResponse>(DoRequest("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestPreFullResponse> TestPreFullExAsync(TestPreFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.pre.full.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestPreFullResponse testPreFullResponse = new TestPreFullResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testPreFullResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestPreFullResponse>(await DoRequestAsync("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTumResponse QueryTum(QueryTumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTumResponse> QueryTumAsync(QueryTumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTumResponse QueryTumEx(QueryTumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTumResponse>(DoRequest("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTumResponse> QueryTumExAsync(QueryTumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTumResponse>(await DoRequestAsync("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTesxResponse QueryTesx(QueryTesxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTesxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTesxResponse> QueryTesxAsync(QueryTesxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTesxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTesxResponse QueryTesxEx(QueryTesxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTesxResponse>(DoRequest("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTesxResponse> QueryTesxExAsync(QueryTesxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTesxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 工作台测试接口
        /// Summary: 工作台测试接口</para>
        /// </description>
        public AaavTestLiuyzResponse AaavTestLiuyz(AaavTestLiuyzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AaavTestLiuyzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 工作台测试接口
        /// Summary: 工作台测试接口</para>
        /// </description>
        public async Task<AaavTestLiuyzResponse> AaavTestLiuyzAsync(AaavTestLiuyzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AaavTestLiuyzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 工作台测试接口
        /// Summary: 工作台测试接口</para>
        /// </description>
        public AaavTestLiuyzResponse AaavTestLiuyzEx(AaavTestLiuyzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AaavTestLiuyzResponse>(DoRequest("1.0", "antchain.demosdk.test.liuyz.aaav", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 工作台测试接口
        /// Summary: 工作台测试接口</para>
        /// </description>
        public async Task<AaavTestLiuyzResponse> AaavTestLiuyzExAsync(AaavTestLiuyzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AaavTestLiuyzResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.liuyz.aaav", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QuerySyhfResponse QuerySyhf(QuerySyhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySyhfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QuerySyhfResponse> QuerySyhfAsync(QuerySyhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySyhfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QuerySyhfResponse QuerySyhfEx(QuerySyhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySyhfResponse>(DoRequest("1.0", "antchain.demosdk.syhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QuerySyhfResponse> QuerySyhfExAsync(QuerySyhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySyhfResponse>(await DoRequestAsync("1.0", "antchain.demosdk.syhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试sdk打包用
        /// Summary: 测试sdk打包用</para>
        /// </description>
        public QueryBbbCccResponse QueryBbbCcc(QueryBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试sdk打包用
        /// Summary: 测试sdk打包用</para>
        /// </description>
        public async Task<QueryBbbCccResponse> QueryBbbCccAsync(QueryBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试sdk打包用
        /// Summary: 测试sdk打包用</para>
        /// </description>
        public QueryBbbCccResponse QueryBbbCccEx(QueryBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试sdk打包用
        /// Summary: 测试sdk打包用</para>
        /// </description>
        public async Task<QueryBbbCccResponse> QueryBbbCccExAsync(QueryBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public ImportBbbCciResponse ImportBbbCci(ImportBbbCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportBbbCciEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<ImportBbbCciResponse> ImportBbbCciAsync(ImportBbbCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportBbbCciExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public ImportBbbCciResponse ImportBbbCciEx(ImportBbbCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.bbb.cci.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportBbbCciResponse importBbbCciResponse = new ImportBbbCciResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importBbbCciResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportBbbCciResponse>(DoRequest("1.0", "antchain.demosdk.bbb.cci.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<ImportBbbCciResponse> ImportBbbCciExAsync(ImportBbbCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.bbb.cci.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportBbbCciResponse importBbbCciResponse = new ImportBbbCciResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importBbbCciResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportBbbCciResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.cci.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期全链路测试接口1
        /// Summary: 个人工作台二期全链路测试接口1</para>
        /// </description>
        public QueryTimeLimitResponse QueryTimeLimit(QueryTimeLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期全链路测试接口1
        /// Summary: 个人工作台二期全链路测试接口1</para>
        /// </description>
        public async Task<QueryTimeLimitResponse> QueryTimeLimitAsync(QueryTimeLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期全链路测试接口1
        /// Summary: 个人工作台二期全链路测试接口1</para>
        /// </description>
        public QueryTimeLimitResponse QueryTimeLimitEx(QueryTimeLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.time.limit.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    QueryTimeLimitResponse queryTimeLimitResponse = new QueryTimeLimitResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryTimeLimitResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeLimitResponse>(DoRequest("1.0", "antchain.demosdk.time.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期全链路测试接口1
        /// Summary: 个人工作台二期全链路测试接口1</para>
        /// </description>
        public async Task<QueryTimeLimitResponse> QueryTimeLimitExAsync(QueryTimeLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.time.limit.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    QueryTimeLimitResponse queryTimeLimitResponse = new QueryTimeLimitResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryTimeLimitResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeLimitResponse>(await DoRequestAsync("1.0", "antchain.demosdk.time.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口2
        /// Summary: 个人工作台二期测试接口2</para>
        /// </description>
        public QueryCacheLimitResponse QueryCacheLimit(QueryCacheLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCacheLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口2
        /// Summary: 个人工作台二期测试接口2</para>
        /// </description>
        public async Task<QueryCacheLimitResponse> QueryCacheLimitAsync(QueryCacheLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCacheLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口2
        /// Summary: 个人工作台二期测试接口2</para>
        /// </description>
        public QueryCacheLimitResponse QueryCacheLimitEx(QueryCacheLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCacheLimitResponse>(DoRequest("1.0", "antchain.demosdk.cache.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口2
        /// Summary: 个人工作台二期测试接口2</para>
        /// </description>
        public async Task<QueryCacheLimitResponse> QueryCacheLimitExAsync(QueryCacheLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCacheLimitResponse>(await DoRequestAsync("1.0", "antchain.demosdk.cache.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryBbbEeeResponse QueryBbbEee(QueryBbbEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBbbEeeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryBbbEeeResponse> QueryBbbEeeAsync(QueryBbbEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBbbEeeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryBbbEeeResponse QueryBbbEeeEx(QueryBbbEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbEeeResponse>(DoRequest("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryBbbEeeResponse> QueryBbbEeeExAsync(QueryBbbEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbEeeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryAaaTestResponse QueryAaaTest(QueryAaaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryAaaTestResponse> QueryAaaTestAsync(QueryAaaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryAaaTestResponse QueryAaaTestEx(QueryAaaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaTestResponse>(DoRequest("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryAaaTestResponse> QueryAaaTestExAsync(QueryAaaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public StabilizeBbbCccResponse StabilizeBbbCcc(StabilizeBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<StabilizeBbbCccResponse> StabilizeBbbCccAsync(StabilizeBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public StabilizeBbbCccResponse StabilizeBbbCccEx(StabilizeBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<StabilizeBbbCccResponse> StabilizeBbbCccExAsync(StabilizeBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public QueryMultiCccResponse QueryMultiCcc(QueryMultiCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMultiCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public async Task<QueryMultiCccResponse> QueryMultiCccAsync(QueryMultiCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMultiCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public QueryMultiCccResponse QueryMultiCccEx(QueryMultiCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCccResponse>(DoRequest("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public async Task<QueryMultiCccResponse> QueryMultiCccExAsync(QueryMultiCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryAaaCciResponse QueryAaaCci(QueryAaaCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaCciEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryAaaCciResponse> QueryAaaCciAsync(QueryAaaCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaCciExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryAaaCciResponse QueryAaaCciEx(QueryAaaCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCciResponse>(DoRequest("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryAaaCciResponse> QueryAaaCciExAsync(QueryAaaCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCciResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public QueryAaaSdkResponse QueryAaaSdk(QueryAaaSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaSdkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public async Task<QueryAaaSdkResponse> QueryAaaSdkAsync(QueryAaaSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaSdkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public QueryAaaSdkResponse QueryAaaSdkEx(QueryAaaSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaSdkResponse>(DoRequest("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public async Task<QueryAaaSdkResponse> QueryAaaSdkExAsync(QueryAaaSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaSdkResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: 测试</para>
        /// </description>
        public QueryMultiCciuResponse QueryMultiCciu(QueryMultiCciuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMultiCciuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryMultiCciuResponse> QueryMultiCciuAsync(QueryMultiCciuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMultiCciuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: 测试</para>
        /// </description>
        public QueryMultiCciuResponse QueryMultiCciuEx(QueryMultiCciuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCciuResponse>(DoRequest("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryMultiCciuResponse> QueryMultiCciuExAsync(QueryMultiCciuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCciuResponse>(await DoRequestAsync("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTxtResponse QueryTxt(QueryTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTxtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTxtResponse> QueryTxtAsync(QueryTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTxtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTxtResponse QueryTxtEx(QueryTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtResponse>(DoRequest("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTxtResponse> QueryTxtExAsync(QueryTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtResponse>(await DoRequestAsync("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryRuleResponse QueryRule(QueryRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRuleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryRuleResponse> QueryRuleAsync(QueryRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRuleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryRuleResponse QueryRuleEx(QueryRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRuleResponse>(DoRequest("1.0", "antchain.demosdk.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryRuleResponse> QueryRuleExAsync(QueryRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRuleResponse>(await DoRequestAsync("1.0", "antchain.demosdk.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试使用
        /// Summary: 个人工作台二期测试使用</para>
        /// </description>
        public ApiFileUploadResponse ApiFileUpload(ApiFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiFileUploadEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试使用
        /// Summary: 个人工作台二期测试使用</para>
        /// </description>
        public async Task<ApiFileUploadResponse> ApiFileUploadAsync(ApiFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiFileUploadExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试使用
        /// Summary: 个人工作台二期测试使用</para>
        /// </description>
        public ApiFileUploadResponse ApiFileUploadEx(ApiFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.file.upload.api",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApiFileUploadResponse apiFileUploadResponse = new ApiFileUploadResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apiFileUploadResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiFileUploadResponse>(DoRequest("1.0", "antchain.demosdk.file.upload.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试使用
        /// Summary: 个人工作台二期测试使用</para>
        /// </description>
        public async Task<ApiFileUploadResponse> ApiFileUploadExAsync(ApiFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.file.upload.api",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApiFileUploadResponse apiFileUploadResponse = new ApiFileUploadResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apiFileUploadResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiFileUploadResponse>(await DoRequestAsync("1.0", "antchain.demosdk.file.upload.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryTesthfhfhfResponse QueryTesthfhfhf(QueryTesthfhfhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTesthfhfhfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryTesthfhfhfResponse> QueryTesthfhfhfAsync(QueryTesthfhfhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTesthfhfhfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryTesthfhfhfResponse QueryTesthfhfhfEx(QueryTesthfhfhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTesthfhfhfResponse>(DoRequest("1.0", "antchain.demosdk.testhfhfhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryTesthfhfhfResponse> QueryTesthfhfhfExAsync(QueryTesthfhfhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTesthfhfhfResponse>(await DoRequestAsync("1.0", "antchain.demosdk.testhfhfhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public PublishIterationhfResponse PublishIterationhf(PublishIterationhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishIterationhfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<PublishIterationhfResponse> PublishIterationhfAsync(PublishIterationhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishIterationhfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public PublishIterationhfResponse PublishIterationhfEx(PublishIterationhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishIterationhfResponse>(DoRequest("1.0", "antchain.demosdk.iterationhf.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<PublishIterationhfResponse> PublishIterationhfExAsync(PublishIterationhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishIterationhfResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iterationhf.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public QueryWorkbenchTestsResponse QueryWorkbenchTests(QueryWorkbenchTestsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkbenchTestsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public async Task<QueryWorkbenchTestsResponse> QueryWorkbenchTestsAsync(QueryWorkbenchTestsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkbenchTestsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public QueryWorkbenchTestsResponse QueryWorkbenchTestsEx(QueryWorkbenchTestsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestsResponse>(DoRequest("1.0", "antchain.demosdk.workbench.tests.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public async Task<QueryWorkbenchTestsResponse> QueryWorkbenchTestsExAsync(QueryWorkbenchTestsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestsResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.tests.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ResetBbbCccResponse ResetBbbCcc(ResetBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ResetBbbCccResponse> ResetBbbCccAsync(ResetBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ResetBbbCccResponse ResetBbbCccEx(ResetBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ResetBbbCccResponse> ResetBbbCccExAsync(ResetBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTestSssResponse QueryTestSss(QueryTestSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestSssEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTestSssResponse> QueryTestSssAsync(QueryTestSssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestSssExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryTestSssResponse QueryTestSssEx(QueryTestSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestSssResponse>(DoRequest("1.0", "antchain.demosdk.test.sss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryTestSssResponse> QueryTestSssExAsync(QueryTestSssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestSssResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.sss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAaaBbbCccResponse BindAaaBbbCcc(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccAsync(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAaaBbbCccResponse BindAaaBbbCccEx(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccExAsync(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test1</para>
        /// </description>
        public QueryAaaCcdResponse QueryAaaCcd(QueryAaaCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaCcdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test1</para>
        /// </description>
        public async Task<QueryAaaCcdResponse> QueryAaaCcdAsync(QueryAaaCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaCcdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test1</para>
        /// </description>
        public QueryAaaCcdResponse QueryAaaCcdEx(QueryAaaCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCcdResponse>(DoRequest("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test1</para>
        /// </description>
        public async Task<QueryAaaCcdResponse> QueryAaaCcdExAsync(QueryAaaCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCcdResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindXxxResponse BindXxx(BindXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindXxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindXxxResponse> BindXxxAsync(BindXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindXxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindXxxResponse BindXxxEx(BindXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindXxxResponse>(DoRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindXxxResponse> BindXxxExAsync(BindXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindXxxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryCimRunResponse QueryCimRun(QueryCimRunRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCimRunEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryCimRunResponse> QueryCimRunAsync(QueryCimRunRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCimRunExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryCimRunResponse QueryCimRunEx(QueryCimRunRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCimRunResponse>(DoRequest("1.0", "antchain.demosdk.cim.run.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryCimRunResponse> QueryCimRunExAsync(QueryCimRunRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCimRunResponse>(await DoRequestAsync("1.0", "antchain.demosdk.cim.run.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryRoleListResponse QueryRoleList(QueryRoleListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRoleListEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryRoleListResponse> QueryRoleListAsync(QueryRoleListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRoleListExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryRoleListResponse QueryRoleListEx(QueryRoleListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleListResponse>(DoRequest("1.0", "antchain.demosdk.role.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryRoleListResponse> QueryRoleListExAsync(QueryRoleListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleListResponse>(await DoRequestAsync("1.0", "antchain.demosdk.role.list.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public ImportRoleResponse ImportRole(ImportRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportRoleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<ImportRoleResponse> ImportRoleAsync(ImportRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportRoleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public ImportRoleResponse ImportRoleEx(ImportRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportRoleResponse>(DoRequest("1.0", "antchain.demosdk.role.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<ImportRoleResponse> ImportRoleExAsync(ImportRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportRoleResponse>(await DoRequestAsync("1.0", "antchain.demosdk.role.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试流程
        /// Summary: 测试流程</para>
        /// </description>
        public ResetRoleResponse ResetRole(ResetRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetRoleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试流程
        /// Summary: 测试流程</para>
        /// </description>
        public async Task<ResetRoleResponse> ResetRoleAsync(ResetRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetRoleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试流程
        /// Summary: 测试流程</para>
        /// </description>
        public ResetRoleResponse ResetRoleEx(ResetRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetRoleResponse>(DoRequest("1.0", "antchain.demosdk.role.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试流程
        /// Summary: 测试流程</para>
        /// </description>
        public async Task<ResetRoleResponse> ResetRoleExAsync(ResetRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetRoleResponse>(await DoRequestAsync("1.0", "antchain.demosdk.role.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public PublishRoleListResponse PublishRoleList(PublishRoleListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishRoleListEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<PublishRoleListResponse> PublishRoleListAsync(PublishRoleListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishRoleListExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public PublishRoleListResponse PublishRoleListEx(PublishRoleListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishRoleListResponse>(DoRequest("1.0", "antchain.demosdk.role.list.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<PublishRoleListResponse> PublishRoleListExAsync(PublishRoleListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishRoleListResponse>(await DoRequestAsync("1.0", "antchain.demosdk.role.list.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public InitUserTestResponse InitUserTest(InitUserTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitUserTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<InitUserTestResponse> InitUserTestAsync(InitUserTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitUserTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public InitUserTestResponse InitUserTestEx(InitUserTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitUserTestResponse>(DoRequest("1.0", "antchain.demosdk.user.test.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<InitUserTestResponse> InitUserTestExAsync(InitUserTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitUserTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.user.test.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public ExecCimResponse ExecCim(ExecCimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecCimEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<ExecCimResponse> ExecCimAsync(ExecCimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecCimExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public ExecCimResponse ExecCimEx(ExecCimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCimResponse>(DoRequest("1.0", "antchain.demosdk.cim.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<ExecCimResponse> ExecCimExAsync(ExecCimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecCimResponse>(await DoRequestAsync("1.0", "antchain.demosdk.cim.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryCcXxResponse QueryCcXx(QueryCcXxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCcXxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryCcXxResponse> QueryCcXxAsync(QueryCcXxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCcXxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryCcXxResponse QueryCcXxEx(QueryCcXxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCcXxResponse>(DoRequest("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryCcXxResponse> QueryCcXxExAsync(QueryCcXxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCcXxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public LyzaTestResponse LyzaTest(LyzaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LyzaTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<LyzaTestResponse> LyzaTestAsync(LyzaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LyzaTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public LyzaTestResponse LyzaTestEx(LyzaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LyzaTestResponse>(DoRequest("1.0", "antchain.demosdk.test.lyza", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<LyzaTestResponse> LyzaTestExAsync(LyzaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LyzaTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.lyza", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public CTestLizAaaResponse CTestLizAaa(CTestLizAaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CTestLizAaaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<CTestLizAaaResponse> CTestLizAaaAsync(CTestLizAaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CTestLizAaaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public CTestLizAaaResponse CTestLizAaaEx(CTestLizAaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CTestLizAaaResponse>(DoRequest("1.0", "antchain.demosdk.test.liz.aaa.c", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<CTestLizAaaResponse> CTestLizAaaExAsync(CTestLizAaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CTestLizAaaResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.liz.aaa.c", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public VerifyApiListResponse VerifyApiList(VerifyApiListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyApiListEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<VerifyApiListResponse> VerifyApiListAsync(VerifyApiListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyApiListExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public VerifyApiListResponse VerifyApiListEx(VerifyApiListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyApiListResponse>(DoRequest("1.0", "antchain.demosdk.api.list.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<VerifyApiListResponse> VerifyApiListExAsync(VerifyApiListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyApiListResponse>(await DoRequestAsync("1.0", "antchain.demosdk.api.list.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryWorkbenchTestResponse QueryWorkbenchTest(QueryWorkbenchTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkbenchTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryWorkbenchTestResponse> QueryWorkbenchTestAsync(QueryWorkbenchTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkbenchTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryWorkbenchTestResponse QueryWorkbenchTestEx(QueryWorkbenchTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestResponse>(DoRequest("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryWorkbenchTestResponse> QueryWorkbenchTestExAsync(QueryWorkbenchTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateTestResponse ImportCreateTest(ImportCreateTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportCreateTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateTestResponse> ImportCreateTestAsync(ImportCreateTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportCreateTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateTestResponse ImportCreateTestEx(ImportCreateTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateTestResponse>(DoRequest("1.0", "antchain.demosdk.create.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateTestResponse> ImportCreateTestExAsync(ImportCreateTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.create.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈个人工作台二期测试接口test
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public QueryAbcdOneResponse QueryAbcdOne(QueryAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbcdOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈个人工作台二期测试接口test
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<QueryAbcdOneResponse> QueryAbcdOneAsync(QueryAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbcdOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈个人工作台二期测试接口test
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public QueryAbcdOneResponse QueryAbcdOneEx(QueryAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcdOneResponse>(DoRequest("1.0", "antchain.demosdk.abcd.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈个人工作台二期测试接口test
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<QueryAbcdOneResponse> QueryAbcdOneExAsync(QueryAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcdOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public ImportAbcdOneResponse ImportAbcdOne(ImportAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAbcdOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<ImportAbcdOneResponse> ImportAbcdOneAsync(ImportAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAbcdOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public ImportAbcdOneResponse ImportAbcdOneEx(ImportAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAbcdOneResponse>(DoRequest("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<ImportAbcdOneResponse> ImportAbcdOneExAsync(ImportAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAbcdOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public ResetAbcdLimitResponse ResetAbcdLimit(ResetAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetAbcdLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public async Task<ResetAbcdLimitResponse> ResetAbcdLimitAsync(ResetAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetAbcdLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public ResetAbcdLimitResponse ResetAbcdLimitEx(ResetAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAbcdLimitResponse>(DoRequest("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public async Task<ResetAbcdLimitResponse> ResetAbcdLimitExAsync(ResetAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAbcdLimitResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由测试接口
        /// Summary: 个人工作台二期分组路由测试接口</para>
        /// </description>
        public RegisterAbcdLimitResponse RegisterAbcdLimit(RegisterAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterAbcdLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由测试接口
        /// Summary: 个人工作台二期分组路由测试接口</para>
        /// </description>
        public async Task<RegisterAbcdLimitResponse> RegisterAbcdLimitAsync(RegisterAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterAbcdLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由测试接口
        /// Summary: 个人工作台二期分组路由测试接口</para>
        /// </description>
        public RegisterAbcdLimitResponse RegisterAbcdLimitEx(RegisterAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAbcdLimitResponse>(DoRequest("1.0", "antchain.demosdk.abcd.limit.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由测试接口
        /// Summary: 个人工作台二期分组路由测试接口</para>
        /// </description>
        public async Task<RegisterAbcdLimitResponse> RegisterAbcdLimitExAsync(RegisterAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAbcdLimitResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.limit.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台预发测试使用
        /// Summary: 个人工作台预发测试使用</para>
        /// </description>
        public QueryTwiceOneResponse QueryTwiceOne(QueryTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台预发测试使用
        /// Summary: 个人工作台预发测试使用</para>
        /// </description>
        public async Task<QueryTwiceOneResponse> QueryTwiceOneAsync(QueryTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台预发测试使用
        /// Summary: 个人工作台预发测试使用</para>
        /// </description>
        public QueryTwiceOneResponse QueryTwiceOneEx(QueryTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台预发测试使用
        /// Summary: 个人工作台预发测试使用</para>
        /// </description>
        public async Task<QueryTwiceOneResponse> QueryTwiceOneExAsync(QueryTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceOneResponse ImportTwiceOne(ImportTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceOneResponse> ImportTwiceOneAsync(ImportTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceOneResponse ImportTwiceOneEx(ImportTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceOneResponse> ImportTwiceOneExAsync(ImportTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public PublishTwiceOneResponse PublishTwiceOne(PublishTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<PublishTwiceOneResponse> PublishTwiceOneAsync(PublishTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public PublishTwiceOneResponse PublishTwiceOneEx(PublishTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<PublishTwiceOneResponse> PublishTwiceOneExAsync(PublishTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateOneResponse ImportCreateOne(ImportCreateOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportCreateOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateOneResponse> ImportCreateOneAsync(ImportCreateOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportCreateOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateOneResponse ImportCreateOneEx(ImportCreateOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateOneResponse>(DoRequest("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateOneResponse> ImportCreateOneExAsync(ImportCreateOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryCreateTwoResponse QueryCreateTwo(QueryCreateTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreateTwoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryCreateTwoResponse> QueryCreateTwoAsync(QueryCreateTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreateTwoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryCreateTwoResponse QueryCreateTwoEx(QueryCreateTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreateTwoResponse>(DoRequest("1.0", "antchain.demosdk.create.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryCreateTwoResponse> QueryCreateTwoExAsync(QueryCreateTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreateTwoResponse>(await DoRequestAsync("1.0", "antchain.demosdk.create.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateThreeResponse ImportCreateThree(ImportCreateThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportCreateThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateThreeResponse> ImportCreateThreeAsync(ImportCreateThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportCreateThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportCreateThreeResponse ImportCreateThreeEx(ImportCreateThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateThreeResponse>(DoRequest("1.0", "antchain.demosdk.create.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportCreateThreeResponse> ImportCreateThreeExAsync(ImportCreateThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCreateThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.create.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawTwiceOneResponse WithdrawTwiceOne(WithdrawTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return WithdrawTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawTwiceOneResponse> WithdrawTwiceOneAsync(WithdrawTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await WithdrawTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawTwiceOneResponse WithdrawTwiceOneEx(WithdrawTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawTwiceOneResponse> WithdrawTwiceOneExAsync(WithdrawTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateTwiceOneResponse OperateTwiceOne(OperateTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateTwiceOneResponse> OperateTwiceOneAsync(OperateTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateTwiceOneResponse OperateTwiceOneEx(OperateTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateTwiceOneResponse> OperateTwiceOneExAsync(OperateTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryTwiceTwoResponse QueryTwiceTwo(QueryTwiceTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTwiceTwoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryTwiceTwoResponse> QueryTwiceTwoAsync(QueryTwiceTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTwiceTwoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryTwiceTwoResponse QueryTwiceTwoEx(QueryTwiceTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceTwoResponse>(DoRequest("1.0", "antchain.demosdk.twice.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryTwiceTwoResponse> QueryTwiceTwoExAsync(QueryTwiceTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceTwoResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public QueryTestResponse QueryTest(QueryTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<QueryTestResponse> QueryTestAsync(QueryTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public QueryTestResponse QueryTestEx(QueryTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestResponse>(DoRequest("1.0", "antchain.demosdk.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<QueryTestResponse> QueryTestExAsync(QueryTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public ImportTestResponse ImportTest(ImportTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<ImportTestResponse> ImportTestAsync(ImportTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public ImportTestResponse ImportTestEx(ImportTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestResponse>(DoRequest("1.0", "antchain.demosdk.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<ImportTestResponse> ImportTestExAsync(ImportTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试灰度刷新缓存范围
        /// Summary: 测试灰度刷新缓存范围</para>
        /// </description>
        public StabilizeTestResponse StabilizeTest(StabilizeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试灰度刷新缓存范围
        /// Summary: 测试灰度刷新缓存范围</para>
        /// </description>
        public async Task<StabilizeTestResponse> StabilizeTestAsync(StabilizeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试灰度刷新缓存范围
        /// Summary: 测试灰度刷新缓存范围</para>
        /// </description>
        public StabilizeTestResponse StabilizeTestEx(StabilizeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTestResponse>(DoRequest("1.0", "antchain.demosdk.test.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试灰度刷新缓存范围
        /// Summary: 测试灰度刷新缓存范围</para>
        /// </description>
        public async Task<StabilizeTestResponse> StabilizeTestExAsync(StabilizeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryTwiceThreeResponse QueryTwiceThree(QueryTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryTwiceThreeResponse> QueryTwiceThreeAsync(QueryTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryTwiceThreeResponse QueryTwiceThreeEx(QueryTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryTwiceThreeResponse> QueryTwiceThreeExAsync(QueryTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceThreeResponse ImportTwiceThree(ImportTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceThreeResponse> ImportTwiceThreeAsync(ImportTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceThreeResponse ImportTwiceThreeEx(ImportTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceThreeResponse> ImportTwiceThreeExAsync(ImportTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public UnstabilizeTestResponse UnstabilizeTest(UnstabilizeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<UnstabilizeTestResponse> UnstabilizeTestAsync(UnstabilizeTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public UnstabilizeTestResponse UnstabilizeTestEx(UnstabilizeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeTestResponse>(DoRequest("1.0", "antchain.demosdk.test.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试刷新cachekey
        /// Summary: 测试刷新cachekey</para>
        /// </description>
        public async Task<UnstabilizeTestResponse> UnstabilizeTestExAsync(UnstabilizeTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTestXcResponse QueryTestXc(QueryTestXcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestXcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTestXcResponse> QueryTestXcAsync(QueryTestXcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestXcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryTestXcResponse QueryTestXcEx(QueryTestXcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestXcResponse>(DoRequest("1.0", "antchain.demosdk.test.xc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryTestXcResponse> QueryTestXcExAsync(QueryTestXcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestXcResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.xc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryTestSyaResponse QueryTestSya(QueryTestSyaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestSyaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryTestSyaResponse> QueryTestSyaAsync(QueryTestSyaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestSyaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryTestSyaResponse QueryTestSyaEx(QueryTestSyaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestSyaResponse>(DoRequest("1.0", "antchain.demosdk.test.sya.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryTestSyaResponse> QueryTestSyaExAsync(QueryTestSyaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestSyaResponse>(await DoRequestAsync("1.0", "antchain.demosdk.test.sya.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryQqqWwwResponse QueryQqqWww(QueryQqqWwwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryQqqWwwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryQqqWwwResponse> QueryQqqWwwAsync(QueryQqqWwwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryQqqWwwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public QueryQqqWwwResponse QueryQqqWwwEx(QueryQqqWwwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQqqWwwResponse>(DoRequest("1.0", "antchain.demosdk.qqq.www.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<QueryQqqWwwResponse> QueryQqqWwwExAsync(QueryQqqWwwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQqqWwwResponse>(await DoRequestAsync("1.0", "antchain.demosdk.qqq.www.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeTwiceThreeResponse StabilizeTwiceThree(StabilizeTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeTwiceThreeResponse> StabilizeTwiceThreeAsync(StabilizeTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeTwiceThreeResponse StabilizeTwiceThreeEx(StabilizeTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeTwiceThreeResponse> StabilizeTwiceThreeExAsync(StabilizeTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeTwiceThreeResponse UnstabilizeTwiceThree(UnstabilizeTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeTwiceThreeResponse> UnstabilizeTwiceThreeAsync(UnstabilizeTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeTwiceThreeResponse UnstabilizeTwiceThreeEx(UnstabilizeTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeTwiceThreeResponse> UnstabilizeTwiceThreeExAsync(UnstabilizeTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryBbbAatestResponse QueryBbbAatest(QueryBbbAatestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBbbAatestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryBbbAatestResponse> QueryBbbAatestAsync(QueryBbbAatestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBbbAatestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryBbbAatestResponse QueryBbbAatestEx(QueryBbbAatestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbAatestResponse>(DoRequest("1.0", "antchain.demosdk.bbb.aatest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryBbbAatestResponse> QueryBbbAatestExAsync(QueryBbbAatestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBbbAatestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.aatest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ParamLiuyzTestResponse ParamLiuyzTest(ParamLiuyzTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ParamLiuyzTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ParamLiuyzTestResponse> ParamLiuyzTestAsync(ParamLiuyzTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ParamLiuyzTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ParamLiuyzTestResponse ParamLiuyzTestEx(ParamLiuyzTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ParamLiuyzTestResponse>(DoRequest("1.0", "antchain.demosdk.liuyz.test.param", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ParamLiuyzTestResponse> ParamLiuyzTestExAsync(ParamLiuyzTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ParamLiuyzTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.liuyz.test.param", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public LllProxyLyzTestResponse LllProxyLyzTest(LllProxyLyzTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LllProxyLyzTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<LllProxyLyzTestResponse> LllProxyLyzTestAsync(LllProxyLyzTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LllProxyLyzTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public LllProxyLyzTestResponse LllProxyLyzTestEx(LllProxyLyzTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LllProxyLyzTestResponse>(DoRequest("1.0", "antchain.demosdk.proxy.lyz.test.lll", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<LllProxyLyzTestResponse> LllProxyLyzTestExAsync(LllProxyLyzTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LllProxyLyzTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.proxy.lyz.test.lll", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
