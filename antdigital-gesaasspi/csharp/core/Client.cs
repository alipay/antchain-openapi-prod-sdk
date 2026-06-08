// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.GESAASSPI.Models;

namespace AntChain.SDK.GESAASSPI
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
                        {"_prod_code", "GESAASSPI"},
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
                        {"_prod_code", "GESAASSPI"},
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

        /**
         * Description: 创建任务，获取批次号。
         * Summary: 创建任务，获取批次号。
         */
        public SubmitAntchainSdsScenedataTaskResponse SubmitAntchainSdsScenedataTask(SubmitAntchainSdsScenedataTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainSdsScenedataTaskEx(request, headers, runtime);
        }

        /**
         * Description: 创建任务，获取批次号。
         * Summary: 创建任务，获取批次号。
         */
        public async Task<SubmitAntchainSdsScenedataTaskResponse> SubmitAntchainSdsScenedataTaskAsync(SubmitAntchainSdsScenedataTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainSdsScenedataTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建任务，获取批次号。
         * Summary: 创建任务，获取批次号。
         */
        public SubmitAntchainSdsScenedataTaskResponse SubmitAntchainSdsScenedataTaskEx(SubmitAntchainSdsScenedataTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainSdsScenedataTaskResponse>(DoRequest("1.0", "antchain.sds.scenedata.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建任务，获取批次号。
         * Summary: 创建任务，获取批次号。
         */
        public async Task<SubmitAntchainSdsScenedataTaskResponse> SubmitAntchainSdsScenedataTaskExAsync(SubmitAntchainSdsScenedataTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainSdsScenedataTaskResponse>(await DoRequestAsync("1.0", "antchain.sds.scenedata.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批次数据文件上传
         * Summary: 批次数据文件上传
         */
        public UploadAntchainSdsScenedataFileResponse UploadAntchainSdsScenedataFile(UploadAntchainSdsScenedataFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainSdsScenedataFileEx(request, headers, runtime);
        }

        /**
         * Description: 批次数据文件上传
         * Summary: 批次数据文件上传
         */
        public async Task<UploadAntchainSdsScenedataFileResponse> UploadAntchainSdsScenedataFileAsync(UploadAntchainSdsScenedataFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainSdsScenedataFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 批次数据文件上传
         * Summary: 批次数据文件上传
         */
        public UploadAntchainSdsScenedataFileResponse UploadAntchainSdsScenedataFileEx(UploadAntchainSdsScenedataFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.sds.scenedata.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainSdsScenedataFileResponse uploadAntchainSdsScenedataFileResponse = new UploadAntchainSdsScenedataFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainSdsScenedataFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainSdsScenedataFileResponse>(DoRequest("1.0", "antchain.sds.scenedata.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批次数据文件上传
         * Summary: 批次数据文件上传
         */
        public async Task<UploadAntchainSdsScenedataFileResponse> UploadAntchainSdsScenedataFileExAsync(UploadAntchainSdsScenedataFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.sds.scenedata.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainSdsScenedataFileResponse uploadAntchainSdsScenedataFileResponse = new UploadAntchainSdsScenedataFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainSdsScenedataFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainSdsScenedataFileResponse>(await DoRequestAsync("1.0", "antchain.sds.scenedata.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务结果查询
         * Summary: 任务结果查询
         */
        public BatchqueryAntchainSdsScenedataTaskresultResponse BatchqueryAntchainSdsScenedataTaskresult(BatchqueryAntchainSdsScenedataTaskresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryAntchainSdsScenedataTaskresultEx(request, headers, runtime);
        }

        /**
         * Description: 任务结果查询
         * Summary: 任务结果查询
         */
        public async Task<BatchqueryAntchainSdsScenedataTaskresultResponse> BatchqueryAntchainSdsScenedataTaskresultAsync(BatchqueryAntchainSdsScenedataTaskresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryAntchainSdsScenedataTaskresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 任务结果查询
         * Summary: 任务结果查询
         */
        public BatchqueryAntchainSdsScenedataTaskresultResponse BatchqueryAntchainSdsScenedataTaskresultEx(BatchqueryAntchainSdsScenedataTaskresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryAntchainSdsScenedataTaskresultResponse>(DoRequest("1.0", "antchain.sds.scenedata.taskresult.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务结果查询
         * Summary: 任务结果查询
         */
        public async Task<BatchqueryAntchainSdsScenedataTaskresultResponse> BatchqueryAntchainSdsScenedataTaskresultExAsync(BatchqueryAntchainSdsScenedataTaskresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryAntchainSdsScenedataTaskresultResponse>(await DoRequestAsync("1.0", "antchain.sds.scenedata.taskresult.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过批次号查询任务详细信息
         * Summary: 通过批次号查询任务详细信息
         */
        public QueryAntchainSdsScenedataTaskinfoResponse QueryAntchainSdsScenedataTaskinfo(QueryAntchainSdsScenedataTaskinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainSdsScenedataTaskinfoEx(request, headers, runtime);
        }

        /**
         * Description: 通过批次号查询任务详细信息
         * Summary: 通过批次号查询任务详细信息
         */
        public async Task<QueryAntchainSdsScenedataTaskinfoResponse> QueryAntchainSdsScenedataTaskinfoAsync(QueryAntchainSdsScenedataTaskinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainSdsScenedataTaskinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过批次号查询任务详细信息
         * Summary: 通过批次号查询任务详细信息
         */
        public QueryAntchainSdsScenedataTaskinfoResponse QueryAntchainSdsScenedataTaskinfoEx(QueryAntchainSdsScenedataTaskinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSdsScenedataTaskinfoResponse>(DoRequest("1.0", "antchain.sds.scenedata.taskinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过批次号查询任务详细信息
         * Summary: 通过批次号查询任务详细信息
         */
        public async Task<QueryAntchainSdsScenedataTaskinfoResponse> QueryAntchainSdsScenedataTaskinfoExAsync(QueryAntchainSdsScenedataTaskinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSdsScenedataTaskinfoResponse>(await DoRequestAsync("1.0", "antchain.sds.scenedata.taskinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         */
        public QueryAntchainSdsFavorStocksResponse QueryAntchainSdsFavorStocks(QueryAntchainSdsFavorStocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainSdsFavorStocksEx(request, headers, runtime);
        }

        /**
         * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         */
        public async Task<QueryAntchainSdsFavorStocksResponse> QueryAntchainSdsFavorStocksAsync(QueryAntchainSdsFavorStocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainSdsFavorStocksExAsync(request, headers, runtime);
        }

        /**
         * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         */
        public QueryAntchainSdsFavorStocksResponse QueryAntchainSdsFavorStocksEx(QueryAntchainSdsFavorStocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSdsFavorStocksResponse>(DoRequest("1.0", "antchain.sds.favor.stocks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
         */
        public async Task<QueryAntchainSdsFavorStocksResponse> QueryAntchainSdsFavorStocksExAsync(QueryAntchainSdsFavorStocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainSdsFavorStocksResponse>(await DoRequestAsync("1.0", "antchain.sds.favor.stocks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信核销账单接口
         * Summary: 微信核销账单接口
         */
        public DownloadAntchainSdsStockUseflowResponse DownloadAntchainSdsStockUseflow(DownloadAntchainSdsStockUseflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadAntchainSdsStockUseflowEx(request, headers, runtime);
        }

        /**
         * Description: 微信核销账单接口
         * Summary: 微信核销账单接口
         */
        public async Task<DownloadAntchainSdsStockUseflowResponse> DownloadAntchainSdsStockUseflowAsync(DownloadAntchainSdsStockUseflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadAntchainSdsStockUseflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 微信核销账单接口
         * Summary: 微信核销账单接口
         */
        public DownloadAntchainSdsStockUseflowResponse DownloadAntchainSdsStockUseflowEx(DownloadAntchainSdsStockUseflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAntchainSdsStockUseflowResponse>(DoRequest("1.0", "antchain.sds.stock.useflow.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信核销账单接口
         * Summary: 微信核销账单接口
         */
        public async Task<DownloadAntchainSdsStockUseflowResponse> DownloadAntchainSdsStockUseflowExAsync(DownloadAntchainSdsStockUseflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAntchainSdsStockUseflowResponse>(await DoRequestAsync("1.0", "antchain.sds.stock.useflow.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信退款账单接口
         * Summary: 微信退款账单接口
         */
        public DownloadAntchainSdsStockRefundflowResponse DownloadAntchainSdsStockRefundflow(DownloadAntchainSdsStockRefundflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadAntchainSdsStockRefundflowEx(request, headers, runtime);
        }

        /**
         * Description: 微信退款账单接口
         * Summary: 微信退款账单接口
         */
        public async Task<DownloadAntchainSdsStockRefundflowResponse> DownloadAntchainSdsStockRefundflowAsync(DownloadAntchainSdsStockRefundflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadAntchainSdsStockRefundflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 微信退款账单接口
         * Summary: 微信退款账单接口
         */
        public DownloadAntchainSdsStockRefundflowResponse DownloadAntchainSdsStockRefundflowEx(DownloadAntchainSdsStockRefundflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAntchainSdsStockRefundflowResponse>(DoRequest("1.0", "antchain.sds.stock.refundflow.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微信退款账单接口
         * Summary: 微信退款账单接口
         */
        public async Task<DownloadAntchainSdsStockRefundflowResponse> DownloadAntchainSdsStockRefundflowExAsync(DownloadAntchainSdsStockRefundflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAntchainSdsStockRefundflowResponse>(await DoRequestAsync("1.0", "antchain.sds.stock.refundflow.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         */
        public UpdateAntchainSdsScenedataTaskResponse UpdateAntchainSdsScenedataTask(UpdateAntchainSdsScenedataTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainSdsScenedataTaskEx(request, headers, runtime);
        }

        /**
         * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         */
        public async Task<UpdateAntchainSdsScenedataTaskResponse> UpdateAntchainSdsScenedataTaskAsync(UpdateAntchainSdsScenedataTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainSdsScenedataTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         */
        public UpdateAntchainSdsScenedataTaskResponse UpdateAntchainSdsScenedataTaskEx(UpdateAntchainSdsScenedataTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainSdsScenedataTaskResponse>(DoRequest("1.0", "antchain.sds.scenedata.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
         */
        public async Task<UpdateAntchainSdsScenedataTaskResponse> UpdateAntchainSdsScenedataTaskExAsync(UpdateAntchainSdsScenedataTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainSdsScenedataTaskResponse>(await DoRequestAsync("1.0", "antchain.sds.scenedata.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益中心券状态变更回调通知
         * Summary: 权益中心券状态变更回调通知
         */
        public CallbackAntdigitalGesaasspiRightsprodStatusResponse CallbackAntdigitalGesaasspiRightsprodStatus(CallbackAntdigitalGesaasspiRightsprodStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntdigitalGesaasspiRightsprodStatusEx(request, headers, runtime);
        }

        /**
         * Description: 权益中心券状态变更回调通知
         * Summary: 权益中心券状态变更回调通知
         */
        public async Task<CallbackAntdigitalGesaasspiRightsprodStatusResponse> CallbackAntdigitalGesaasspiRightsprodStatusAsync(CallbackAntdigitalGesaasspiRightsprodStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntdigitalGesaasspiRightsprodStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 权益中心券状态变更回调通知
         * Summary: 权益中心券状态变更回调通知
         */
        public CallbackAntdigitalGesaasspiRightsprodStatusResponse CallbackAntdigitalGesaasspiRightsprodStatusEx(CallbackAntdigitalGesaasspiRightsprodStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntdigitalGesaasspiRightsprodStatusResponse>(DoRequest("1.0", "antdigital.gesaasspi.rightsprod.status.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益中心券状态变更回调通知
         * Summary: 权益中心券状态变更回调通知
         */
        public async Task<CallbackAntdigitalGesaasspiRightsprodStatusResponse> CallbackAntdigitalGesaasspiRightsprodStatusExAsync(CallbackAntdigitalGesaasspiRightsprodStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntdigitalGesaasspiRightsprodStatusResponse>(await DoRequestAsync("1.0", "antdigital.gesaasspi.rightsprod.status.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 券操作回调通知
         * Summary: 券操作回调通知
         */
        public CallbackAntdigitalGesaasspiRightsprodOperationResponse CallbackAntdigitalGesaasspiRightsprodOperation(CallbackAntdigitalGesaasspiRightsprodOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntdigitalGesaasspiRightsprodOperationEx(request, headers, runtime);
        }

        /**
         * Description: 券操作回调通知
         * Summary: 券操作回调通知
         */
        public async Task<CallbackAntdigitalGesaasspiRightsprodOperationResponse> CallbackAntdigitalGesaasspiRightsprodOperationAsync(CallbackAntdigitalGesaasspiRightsprodOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntdigitalGesaasspiRightsprodOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 券操作回调通知
         * Summary: 券操作回调通知
         */
        public CallbackAntdigitalGesaasspiRightsprodOperationResponse CallbackAntdigitalGesaasspiRightsprodOperationEx(CallbackAntdigitalGesaasspiRightsprodOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntdigitalGesaasspiRightsprodOperationResponse>(DoRequest("1.0", "antdigital.gesaasspi.rightsprod.operation.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 券操作回调通知
         * Summary: 券操作回调通知
         */
        public async Task<CallbackAntdigitalGesaasspiRightsprodOperationResponse> CallbackAntdigitalGesaasspiRightsprodOperationExAsync(CallbackAntdigitalGesaasspiRightsprodOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntdigitalGesaasspiRightsprodOperationResponse>(await DoRequestAsync("1.0", "antdigital.gesaasspi.rightsprod.operation.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益供应商权益发放spi
         * Summary: 权益供应商权益发放spi
         */
        public PushAntdigitalGesaasspiRightsprodGrantrightsResponse PushAntdigitalGesaasspiRightsprodGrantrights(PushAntdigitalGesaasspiRightsprodGrantrightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushAntdigitalGesaasspiRightsprodGrantrightsEx(request, headers, runtime);
        }

        /**
         * Description: 权益供应商权益发放spi
         * Summary: 权益供应商权益发放spi
         */
        public async Task<PushAntdigitalGesaasspiRightsprodGrantrightsResponse> PushAntdigitalGesaasspiRightsprodGrantrightsAsync(PushAntdigitalGesaasspiRightsprodGrantrightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushAntdigitalGesaasspiRightsprodGrantrightsExAsync(request, headers, runtime);
        }

        /**
         * Description: 权益供应商权益发放spi
         * Summary: 权益供应商权益发放spi
         */
        public PushAntdigitalGesaasspiRightsprodGrantrightsResponse PushAntdigitalGesaasspiRightsprodGrantrightsEx(PushAntdigitalGesaasspiRightsprodGrantrightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAntdigitalGesaasspiRightsprodGrantrightsResponse>(DoRequest("1.0", "antdigital.gesaasspi.rightsprod.grantrights.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益供应商权益发放spi
         * Summary: 权益供应商权益发放spi
         */
        public async Task<PushAntdigitalGesaasspiRightsprodGrantrightsResponse> PushAntdigitalGesaasspiRightsprodGrantrightsExAsync(PushAntdigitalGesaasspiRightsprodGrantrightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAntdigitalGesaasspiRightsprodGrantrightsResponse>(await DoRequestAsync("1.0", "antdigital.gesaasspi.rightsprod.grantrights.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
