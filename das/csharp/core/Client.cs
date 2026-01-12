// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DAS.Models;

namespace AntChain.SDK.DAS
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
                        {"sdk_version", "1.1.123"},
                        {"_prod_code", "DAS"},
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
                        {"sdk_version", "1.1.123"},
                        {"_prod_code", "DAS"},
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
         * Description: 上传批量查询数据文件
         * Summary: 上传批量查询数据文件
         */
        public UploadApplicationBatchqueryfileResponse UploadApplicationBatchqueryfile(UploadApplicationBatchqueryfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadApplicationBatchqueryfileEx(request, headers, runtime);
        }

        /**
         * Description: 上传批量查询数据文件
         * Summary: 上传批量查询数据文件
         */
        public async Task<UploadApplicationBatchqueryfileResponse> UploadApplicationBatchqueryfileAsync(UploadApplicationBatchqueryfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadApplicationBatchqueryfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传批量查询数据文件
         * Summary: 上传批量查询数据文件
         */
        public UploadApplicationBatchqueryfileResponse UploadApplicationBatchqueryfileEx(UploadApplicationBatchqueryfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.batchqueryfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationBatchqueryfileResponse uploadApplicationBatchqueryfileResponse = new UploadApplicationBatchqueryfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationBatchqueryfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationBatchqueryfileResponse>(DoRequest("1.0", "antchain.das.application.batchqueryfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传批量查询数据文件
         * Summary: 上传批量查询数据文件
         */
        public async Task<UploadApplicationBatchqueryfileResponse> UploadApplicationBatchqueryfileExAsync(UploadApplicationBatchqueryfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.batchqueryfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationBatchqueryfileResponse uploadApplicationBatchqueryfileResponse = new UploadApplicationBatchqueryfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationBatchqueryfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationBatchqueryfileResponse>(await DoRequestAsync("1.0", "antchain.das.application.batchqueryfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取查询数据集任务结果
         * Summary: 获取查询数据集任务结果
         */
        public QueryApplicationBatchqueryresultResponse QueryApplicationBatchqueryresult(QueryApplicationBatchqueryresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationBatchqueryresultEx(request, headers, runtime);
        }

        /**
         * Description: 获取查询数据集任务结果
         * Summary: 获取查询数据集任务结果
         */
        public async Task<QueryApplicationBatchqueryresultResponse> QueryApplicationBatchqueryresultAsync(QueryApplicationBatchqueryresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationBatchqueryresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取查询数据集任务结果
         * Summary: 获取查询数据集任务结果
         */
        public QueryApplicationBatchqueryresultResponse QueryApplicationBatchqueryresultEx(QueryApplicationBatchqueryresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationBatchqueryresultResponse>(DoRequest("1.0", "antchain.das.application.batchqueryresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取查询数据集任务结果
         * Summary: 获取查询数据集任务结果
         */
        public async Task<QueryApplicationBatchqueryresultResponse> QueryApplicationBatchqueryresultExAsync(QueryApplicationBatchqueryresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationBatchqueryresultResponse>(await DoRequestAsync("1.0", "antchain.das.application.batchqueryresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时获取数据源数据
         * Summary: 实时查询数据
         */
        public QueryApplicationDataResponse QueryApplicationData(QueryApplicationDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationDataEx(request, headers, runtime);
        }

        /**
         * Description: 实时获取数据源数据
         * Summary: 实时查询数据
         */
        public async Task<QueryApplicationDataResponse> QueryApplicationDataAsync(QueryApplicationDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 实时获取数据源数据
         * Summary: 实时查询数据
         */
        public QueryApplicationDataResponse QueryApplicationDataEx(QueryApplicationDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDataResponse>(DoRequest("1.0", "antchain.das.application.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时获取数据源数据
         * Summary: 实时查询数据
         */
        public async Task<QueryApplicationDataResponse> QueryApplicationDataExAsync(QueryApplicationDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDataResponse>(await DoRequestAsync("1.0", "antchain.das.application.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识产权实时接口
         * Summary: 知识产权实时接口
         */
        public QueryApplicationIpeResponse QueryApplicationIpe(QueryApplicationIpeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationIpeEx(request, headers, runtime);
        }

        /**
         * Description: 知识产权实时接口
         * Summary: 知识产权实时接口
         */
        public async Task<QueryApplicationIpeResponse> QueryApplicationIpeAsync(QueryApplicationIpeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationIpeExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识产权实时接口
         * Summary: 知识产权实时接口
         */
        public QueryApplicationIpeResponse QueryApplicationIpeEx(QueryApplicationIpeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationIpeResponse>(DoRequest("1.0", "antchain.das.application.ipe.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识产权实时接口
         * Summary: 知识产权实时接口
         */
        public async Task<QueryApplicationIpeResponse> QueryApplicationIpeExAsync(QueryApplicationIpeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationIpeResponse>(await DoRequestAsync("1.0", "antchain.das.application.ipe.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询国内商标数据
         * Summary: 查询国内商标数据
         */
        public QueryDomesticTrademarkResponse QueryDomesticTrademark(QueryDomesticTrademarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDomesticTrademarkEx(request, headers, runtime);
        }

        /**
         * Description: 查询国内商标数据
         * Summary: 查询国内商标数据
         */
        public async Task<QueryDomesticTrademarkResponse> QueryDomesticTrademarkAsync(QueryDomesticTrademarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDomesticTrademarkExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询国内商标数据
         * Summary: 查询国内商标数据
         */
        public QueryDomesticTrademarkResponse QueryDomesticTrademarkEx(QueryDomesticTrademarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDomesticTrademarkResponse>(DoRequest("1.0", "antchain.das.domestic.trademark.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询国内商标数据
         * Summary: 查询国内商标数据
         */
        public async Task<QueryDomesticTrademarkResponse> QueryDomesticTrademarkExAsync(QueryDomesticTrademarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDomesticTrademarkResponse>(await DoRequestAsync("1.0", "antchain.das.domestic.trademark.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取国内商标LOGO文件
         * Summary: 获取国内商标LOGO文件
         */
        public GetDomesticTrademarklogoResponse GetDomesticTrademarklogo(GetDomesticTrademarklogoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDomesticTrademarklogoEx(request, headers, runtime);
        }

        /**
         * Description: 获取国内商标LOGO文件
         * Summary: 获取国内商标LOGO文件
         */
        public async Task<GetDomesticTrademarklogoResponse> GetDomesticTrademarklogoAsync(GetDomesticTrademarklogoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDomesticTrademarklogoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取国内商标LOGO文件
         * Summary: 获取国内商标LOGO文件
         */
        public GetDomesticTrademarklogoResponse GetDomesticTrademarklogoEx(GetDomesticTrademarklogoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDomesticTrademarklogoResponse>(DoRequest("1.0", "antchain.das.domestic.trademarklogo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取国内商标LOGO文件
         * Summary: 获取国内商标LOGO文件
         */
        public async Task<GetDomesticTrademarklogoResponse> GetDomesticTrademarklogoExAsync(GetDomesticTrademarklogoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDomesticTrademarklogoResponse>(await DoRequestAsync("1.0", "antchain.das.domestic.trademarklogo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询加密的企业工商信息
         * Summary: 查询加密的企业工商信息
         */
        public QueryEncryptEnterpriseinfoResponse QueryEncryptEnterpriseinfo(QueryEncryptEnterpriseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEncryptEnterpriseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询加密的企业工商信息
         * Summary: 查询加密的企业工商信息
         */
        public async Task<QueryEncryptEnterpriseinfoResponse> QueryEncryptEnterpriseinfoAsync(QueryEncryptEnterpriseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEncryptEnterpriseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询加密的企业工商信息
         * Summary: 查询加密的企业工商信息
         */
        public QueryEncryptEnterpriseinfoResponse QueryEncryptEnterpriseinfoEx(QueryEncryptEnterpriseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEncryptEnterpriseinfoResponse>(DoRequest("1.0", "antchain.das.encrypt.enterpriseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询加密的企业工商信息
         * Summary: 查询加密的企业工商信息
         */
        public async Task<QueryEncryptEnterpriseinfoResponse> QueryEncryptEnterpriseinfoExAsync(QueryEncryptEnterpriseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEncryptEnterpriseinfoResponse>(await DoRequestAsync("1.0", "antchain.das.encrypt.enterpriseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权协议文件
         * Summary: 上传授权协议文件
         */
        public UploadApplicationAuthfileResponse UploadApplicationAuthfile(UploadApplicationAuthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadApplicationAuthfileEx(request, headers, runtime);
        }

        /**
         * Description: 上传授权协议文件
         * Summary: 上传授权协议文件
         */
        public async Task<UploadApplicationAuthfileResponse> UploadApplicationAuthfileAsync(UploadApplicationAuthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadApplicationAuthfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传授权协议文件
         * Summary: 上传授权协议文件
         */
        public UploadApplicationAuthfileResponse UploadApplicationAuthfileEx(UploadApplicationAuthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.authfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationAuthfileResponse uploadApplicationAuthfileResponse = new UploadApplicationAuthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationAuthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationAuthfileResponse>(DoRequest("1.0", "antchain.das.application.authfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权协议文件
         * Summary: 上传授权协议文件
         */
        public async Task<UploadApplicationAuthfileResponse> UploadApplicationAuthfileExAsync(UploadApplicationAuthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.authfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationAuthfileResponse uploadApplicationAuthfileResponse = new UploadApplicationAuthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationAuthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationAuthfileResponse>(await DoRequestAsync("1.0", "antchain.das.application.authfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验用户是否车
         * Summary: 校验用户是否车
         */
        public CheckApplicationHascarResponse CheckApplicationHascar(CheckApplicationHascarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckApplicationHascarEx(request, headers, runtime);
        }

        /**
         * Description: 校验用户是否车
         * Summary: 校验用户是否车
         */
        public async Task<CheckApplicationHascarResponse> CheckApplicationHascarAsync(CheckApplicationHascarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckApplicationHascarExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验用户是否车
         * Summary: 校验用户是否车
         */
        public CheckApplicationHascarResponse CheckApplicationHascarEx(CheckApplicationHascarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApplicationHascarResponse>(DoRequest("1.0", "antchain.das.application.hascar.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验用户是否车
         * Summary: 校验用户是否车
         */
        public async Task<CheckApplicationHascarResponse> CheckApplicationHascarExAsync(CheckApplicationHascarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApplicationHascarResponse>(await DoRequestAsync("1.0", "antchain.das.application.hascar.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询车辆基础信息
         * Summary: 查询车辆基础信息
         */
        public QueryApplicationBasecarinfoResponse QueryApplicationBasecarinfo(QueryApplicationBasecarinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationBasecarinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询车辆基础信息
         * Summary: 查询车辆基础信息
         */
        public async Task<QueryApplicationBasecarinfoResponse> QueryApplicationBasecarinfoAsync(QueryApplicationBasecarinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationBasecarinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询车辆基础信息
         * Summary: 查询车辆基础信息
         */
        public QueryApplicationBasecarinfoResponse QueryApplicationBasecarinfoEx(QueryApplicationBasecarinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationBasecarinfoResponse>(DoRequest("1.0", "antchain.das.application.basecarinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询车辆基础信息
         * Summary: 查询车辆基础信息
         */
        public async Task<QueryApplicationBasecarinfoResponse> QueryApplicationBasecarinfoExAsync(QueryApplicationBasecarinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationBasecarinfoResponse>(await DoRequestAsync("1.0", "antchain.das.application.basecarinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询车辆详细信息
         * Summary: 查询车辆详细信息
         */
        public QueryApplicationDetailcarinfoResponse QueryApplicationDetailcarinfo(QueryApplicationDetailcarinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationDetailcarinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询车辆详细信息
         * Summary: 查询车辆详细信息
         */
        public async Task<QueryApplicationDetailcarinfoResponse> QueryApplicationDetailcarinfoAsync(QueryApplicationDetailcarinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationDetailcarinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询车辆详细信息
         * Summary: 查询车辆详细信息
         */
        public QueryApplicationDetailcarinfoResponse QueryApplicationDetailcarinfoEx(QueryApplicationDetailcarinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDetailcarinfoResponse>(DoRequest("1.0", "antchain.das.application.detailcarinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询车辆详细信息
         * Summary: 查询车辆详细信息
         */
        public async Task<QueryApplicationDetailcarinfoResponse> QueryApplicationDetailcarinfoExAsync(QueryApplicationDetailcarinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDetailcarinfoResponse>(await DoRequestAsync("1.0", "antchain.das.application.detailcarinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权简历查询服务
         * Summary: 授权简历查询服务
         */
        public SignApplicationResumeResponse SignApplicationResume(SignApplicationResumeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignApplicationResumeEx(request, headers, runtime);
        }

        /**
         * Description: 授权简历查询服务
         * Summary: 授权简历查询服务
         */
        public async Task<SignApplicationResumeResponse> SignApplicationResumeAsync(SignApplicationResumeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignApplicationResumeExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权简历查询服务
         * Summary: 授权简历查询服务
         */
        public SignApplicationResumeResponse SignApplicationResumeEx(SignApplicationResumeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignApplicationResumeResponse>(DoRequest("1.0", "antchain.das.application.resume.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权简历查询服务
         * Summary: 授权简历查询服务
         */
        public async Task<SignApplicationResumeResponse> SignApplicationResumeExAsync(SignApplicationResumeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignApplicationResumeResponse>(await DoRequestAsync("1.0", "antchain.das.application.resume.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询简历信息
         * Summary: 查询简历信息
         */
        public QueryApplicationResumeResponse QueryApplicationResume(QueryApplicationResumeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationResumeEx(request, headers, runtime);
        }

        /**
         * Description: 查询简历信息
         * Summary: 查询简历信息
         */
        public async Task<QueryApplicationResumeResponse> QueryApplicationResumeAsync(QueryApplicationResumeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationResumeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询简历信息
         * Summary: 查询简历信息
         */
        public QueryApplicationResumeResponse QueryApplicationResumeEx(QueryApplicationResumeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationResumeResponse>(DoRequest("1.0", "antchain.das.application.resume.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询简历信息
         * Summary: 查询简历信息
         */
        public async Task<QueryApplicationResumeResponse> QueryApplicationResumeExAsync(QueryApplicationResumeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationResumeResponse>(await DoRequestAsync("1.0", "antchain.das.application.resume.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人车核验并查询车辆详细信息
         * Summary: 人车核验并查询车辆详细信息
         */
        public QueryDetailcarinfoPesonandlicResponse QueryDetailcarinfoPesonandlic(QueryDetailcarinfoPesonandlicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDetailcarinfoPesonandlicEx(request, headers, runtime);
        }

        /**
         * Description: 人车核验并查询车辆详细信息
         * Summary: 人车核验并查询车辆详细信息
         */
        public async Task<QueryDetailcarinfoPesonandlicResponse> QueryDetailcarinfoPesonandlicAsync(QueryDetailcarinfoPesonandlicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDetailcarinfoPesonandlicExAsync(request, headers, runtime);
        }

        /**
         * Description: 人车核验并查询车辆详细信息
         * Summary: 人车核验并查询车辆详细信息
         */
        public QueryDetailcarinfoPesonandlicResponse QueryDetailcarinfoPesonandlicEx(QueryDetailcarinfoPesonandlicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDetailcarinfoPesonandlicResponse>(DoRequest("1.0", "antchain.das.detailcarinfo.pesonandlic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人车核验并查询车辆详细信息
         * Summary: 人车核验并查询车辆详细信息
         */
        public async Task<QueryDetailcarinfoPesonandlicResponse> QueryDetailcarinfoPesonandlicExAsync(QueryDetailcarinfoPesonandlicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDetailcarinfoPesonandlicResponse>(await DoRequestAsync("1.0", "antchain.das.detailcarinfo.pesonandlic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 教育标签(姓名身份证)信息查询
         * Summary: 教育标签(姓名身份证)信息查询
         */
        public QueryIdnumberEducationtaginfoResponse QueryIdnumberEducationtaginfo(QueryIdnumberEducationtaginfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIdnumberEducationtaginfoEx(request, headers, runtime);
        }

        /**
         * Description: 教育标签(姓名身份证)信息查询
         * Summary: 教育标签(姓名身份证)信息查询
         */
        public async Task<QueryIdnumberEducationtaginfoResponse> QueryIdnumberEducationtaginfoAsync(QueryIdnumberEducationtaginfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIdnumberEducationtaginfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 教育标签(姓名身份证)信息查询
         * Summary: 教育标签(姓名身份证)信息查询
         */
        public QueryIdnumberEducationtaginfoResponse QueryIdnumberEducationtaginfoEx(QueryIdnumberEducationtaginfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdnumberEducationtaginfoResponse>(DoRequest("1.0", "antchain.das.idnumber.educationtaginfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 教育标签(姓名身份证)信息查询
         * Summary: 教育标签(姓名身份证)信息查询
         */
        public async Task<QueryIdnumberEducationtaginfoResponse> QueryIdnumberEducationtaginfoExAsync(QueryIdnumberEducationtaginfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdnumberEducationtaginfoResponse>(await DoRequestAsync("1.0", "antchain.das.idnumber.educationtaginfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 教育信息查询（姓名手机号/姓名身份证）
         * Summary: 教育信息查询（姓名手机号/姓名身份证）
         */
        public QueryPhonenumberEducationinfoResponse QueryPhonenumberEducationinfo(QueryPhonenumberEducationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPhonenumberEducationinfoEx(request, headers, runtime);
        }

        /**
         * Description: 教育信息查询（姓名手机号/姓名身份证）
         * Summary: 教育信息查询（姓名手机号/姓名身份证）
         */
        public async Task<QueryPhonenumberEducationinfoResponse> QueryPhonenumberEducationinfoAsync(QueryPhonenumberEducationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPhonenumberEducationinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 教育信息查询（姓名手机号/姓名身份证）
         * Summary: 教育信息查询（姓名手机号/姓名身份证）
         */
        public QueryPhonenumberEducationinfoResponse QueryPhonenumberEducationinfoEx(QueryPhonenumberEducationinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPhonenumberEducationinfoResponse>(DoRequest("1.0", "antchain.das.phonenumber.educationinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 教育信息查询（姓名手机号/姓名身份证）
         * Summary: 教育信息查询（姓名手机号/姓名身份证）
         */
        public async Task<QueryPhonenumberEducationinfoResponse> QueryPhonenumberEducationinfoExAsync(QueryPhonenumberEducationinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPhonenumberEducationinfoResponse>(await DoRequestAsync("1.0", "antchain.das.phonenumber.educationinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据应用统一入口
         * Summary: 数据应用统一入口
         */
        public QueryApplicationUnifiedentranceResponse QueryApplicationUnifiedentrance(QueryApplicationUnifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationUnifiedentranceEx(request, headers, runtime);
        }

        /**
         * Description: 数据应用统一入口
         * Summary: 数据应用统一入口
         */
        public async Task<QueryApplicationUnifiedentranceResponse> QueryApplicationUnifiedentranceAsync(QueryApplicationUnifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationUnifiedentranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据应用统一入口
         * Summary: 数据应用统一入口
         */
        public QueryApplicationUnifiedentranceResponse QueryApplicationUnifiedentranceEx(QueryApplicationUnifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationUnifiedentranceResponse>(DoRequest("1.0", "antchain.das.application.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据应用统一入口
         * Summary: 数据应用统一入口
         */
        public async Task<QueryApplicationUnifiedentranceResponse> QueryApplicationUnifiedentranceExAsync(QueryApplicationUnifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationUnifiedentranceResponse>(await DoRequestAsync("1.0", "antchain.das.application.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据姓名和身份证，返回驾驶证核验信息
         * Summary: 驾驶证核验信息查询
         */
        public QueryApplicationDriverlicensecertResponse QueryApplicationDriverlicensecert(QueryApplicationDriverlicensecertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationDriverlicensecertEx(request, headers, runtime);
        }

        /**
         * Description: 根据姓名和身份证，返回驾驶证核验信息
         * Summary: 驾驶证核验信息查询
         */
        public async Task<QueryApplicationDriverlicensecertResponse> QueryApplicationDriverlicensecertAsync(QueryApplicationDriverlicensecertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationDriverlicensecertExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据姓名和身份证，返回驾驶证核验信息
         * Summary: 驾驶证核验信息查询
         */
        public QueryApplicationDriverlicensecertResponse QueryApplicationDriverlicensecertEx(QueryApplicationDriverlicensecertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDriverlicensecertResponse>(DoRequest("1.0", "antchain.das.application.driverlicensecert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据姓名和身份证，返回驾驶证核验信息
         * Summary: 驾驶证核验信息查询
         */
        public async Task<QueryApplicationDriverlicensecertResponse> QueryApplicationDriverlicensecertExAsync(QueryApplicationDriverlicensecertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDriverlicensecertResponse>(await DoRequestAsync("1.0", "antchain.das.application.driverlicensecert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据车牌号所有人等信息，返回行驶证核验结果
         * Summary: 行驶证核验信息查询
         */
        public QueryApplicationVehiclelicensecertResponse QueryApplicationVehiclelicensecert(QueryApplicationVehiclelicensecertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationVehiclelicensecertEx(request, headers, runtime);
        }

        /**
         * Description: 根据车牌号所有人等信息，返回行驶证核验结果
         * Summary: 行驶证核验信息查询
         */
        public async Task<QueryApplicationVehiclelicensecertResponse> QueryApplicationVehiclelicensecertAsync(QueryApplicationVehiclelicensecertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationVehiclelicensecertExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据车牌号所有人等信息，返回行驶证核验结果
         * Summary: 行驶证核验信息查询
         */
        public QueryApplicationVehiclelicensecertResponse QueryApplicationVehiclelicensecertEx(QueryApplicationVehiclelicensecertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationVehiclelicensecertResponse>(DoRequest("1.0", "antchain.das.application.vehiclelicensecert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据车牌号所有人等信息，返回行驶证核验结果
         * Summary: 行驶证核验信息查询
         */
        public async Task<QueryApplicationVehiclelicensecertResponse> QueryApplicationVehiclelicensecertExAsync(QueryApplicationVehiclelicensecertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationVehiclelicensecertResponse>(await DoRequestAsync("1.0", "antchain.das.application.vehiclelicensecert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据姓名身份证信息查询学籍信息
         * Summary: 根据姓名身份证信息查询学籍
         */
        public QueryApplicationEducationstatusResponse QueryApplicationEducationstatus(QueryApplicationEducationstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationEducationstatusEx(request, headers, runtime);
        }

        /**
         * Description: 根据姓名身份证信息查询学籍信息
         * Summary: 根据姓名身份证信息查询学籍
         */
        public async Task<QueryApplicationEducationstatusResponse> QueryApplicationEducationstatusAsync(QueryApplicationEducationstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationEducationstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据姓名身份证信息查询学籍信息
         * Summary: 根据姓名身份证信息查询学籍
         */
        public QueryApplicationEducationstatusResponse QueryApplicationEducationstatusEx(QueryApplicationEducationstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationEducationstatusResponse>(DoRequest("1.0", "antchain.das.application.educationstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据姓名身份证信息查询学籍信息
         * Summary: 根据姓名身份证信息查询学籍
         */
        public async Task<QueryApplicationEducationstatusResponse> QueryApplicationEducationstatusExAsync(QueryApplicationEducationstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationEducationstatusResponse>(await DoRequestAsync("1.0", "antchain.das.application.educationstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据服务授权文件上传
         * Summary: 数据服务授权文件上传
         */
        public UploadServiceAuthfileResponse UploadServiceAuthfile(UploadServiceAuthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadServiceAuthfileEx(request, headers, runtime);
        }

        /**
         * Description: 数据服务授权文件上传
         * Summary: 数据服务授权文件上传
         */
        public async Task<UploadServiceAuthfileResponse> UploadServiceAuthfileAsync(UploadServiceAuthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadServiceAuthfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据服务授权文件上传
         * Summary: 数据服务授权文件上传
         */
        public UploadServiceAuthfileResponse UploadServiceAuthfileEx(UploadServiceAuthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.service.authfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadServiceAuthfileResponse uploadServiceAuthfileResponse = new UploadServiceAuthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadServiceAuthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadServiceAuthfileResponse>(DoRequest("1.0", "antchain.das.service.authfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据服务授权文件上传
         * Summary: 数据服务授权文件上传
         */
        public async Task<UploadServiceAuthfileResponse> UploadServiceAuthfileExAsync(UploadServiceAuthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.service.authfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadServiceAuthfileResponse uploadServiceAuthfileResponse = new UploadServiceAuthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadServiceAuthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadServiceAuthfileResponse>(await DoRequestAsync("1.0", "antchain.das.service.authfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询国内商标扩展信息
         * Summary: 查询国内商标扩展信息
         */
        public QueryDomestictrademarkExtensioninfoResponse QueryDomestictrademarkExtensioninfo(QueryDomestictrademarkExtensioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDomestictrademarkExtensioninfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询国内商标扩展信息
         * Summary: 查询国内商标扩展信息
         */
        public async Task<QueryDomestictrademarkExtensioninfoResponse> QueryDomestictrademarkExtensioninfoAsync(QueryDomestictrademarkExtensioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDomestictrademarkExtensioninfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询国内商标扩展信息
         * Summary: 查询国内商标扩展信息
         */
        public QueryDomestictrademarkExtensioninfoResponse QueryDomestictrademarkExtensioninfoEx(QueryDomestictrademarkExtensioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDomestictrademarkExtensioninfoResponse>(DoRequest("1.0", "antchain.das.domestictrademark.extensioninfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询国内商标扩展信息
         * Summary: 查询国内商标扩展信息
         */
        public async Task<QueryDomestictrademarkExtensioninfoResponse> QueryDomestictrademarkExtensioninfoExAsync(QueryDomestictrademarkExtensioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDomestictrademarkExtensioninfoResponse>(await DoRequestAsync("1.0", "antchain.das.domestictrademark.extensioninfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件类型数据服务统一接口
         * Summary: 文件类型服务统一接口
         */
        public GetApplicationFileentranceResponse GetApplicationFileentrance(GetApplicationFileentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationFileentranceEx(request, headers, runtime);
        }

        /**
         * Description: 文件类型数据服务统一接口
         * Summary: 文件类型服务统一接口
         */
        public async Task<GetApplicationFileentranceResponse> GetApplicationFileentranceAsync(GetApplicationFileentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationFileentranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件类型数据服务统一接口
         * Summary: 文件类型服务统一接口
         */
        public GetApplicationFileentranceResponse GetApplicationFileentranceEx(GetApplicationFileentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationFileentranceResponse>(DoRequest("1.0", "antchain.das.application.fileentrance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件类型数据服务统一接口
         * Summary: 文件类型服务统一接口
         */
        public async Task<GetApplicationFileentranceResponse> GetApplicationFileentranceExAsync(GetApplicationFileentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationFileentranceResponse>(await DoRequestAsync("1.0", "antchain.das.application.fileentrance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 万文
         * Summary: 异步入口--获取流水号
         */
        public InitUnifiedentranceAsyncResponse InitUnifiedentranceAsync(InitUnifiedentranceAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitUnifiedentranceAsyncEx(request, headers, runtime);
        }

        /**
         * Description: 万文
         * Summary: 异步入口--获取流水号
         */
        public async Task<InitUnifiedentranceAsyncResponse> InitUnifiedentranceAsyncAsync(InitUnifiedentranceAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitUnifiedentranceAsyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 万文
         * Summary: 异步入口--获取流水号
         */
        public InitUnifiedentranceAsyncResponse InitUnifiedentranceAsyncEx(InitUnifiedentranceAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitUnifiedentranceAsyncResponse>(DoRequest("1.0", "antchain.das.unifiedentrance.async.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 万文
         * Summary: 异步入口--获取流水号
         */
        public async Task<InitUnifiedentranceAsyncResponse> InitUnifiedentranceAsyncExAsync(InitUnifiedentranceAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitUnifiedentranceAsyncResponse>(await DoRequestAsync("1.0", "antchain.das.unifiedentrance.async.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取异步结果
         * Summary: 获取异步结果
         */
        public QueryUnifiedentranceAsyncResponse QueryUnifiedentranceAsync(QueryUnifiedentranceAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedentranceAsyncEx(request, headers, runtime);
        }

        /**
         * Description: 获取异步结果
         * Summary: 获取异步结果
         */
        public async Task<QueryUnifiedentranceAsyncResponse> QueryUnifiedentranceAsyncAsync(QueryUnifiedentranceAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedentranceAsyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取异步结果
         * Summary: 获取异步结果
         */
        public QueryUnifiedentranceAsyncResponse QueryUnifiedentranceAsyncEx(QueryUnifiedentranceAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedentranceAsyncResponse>(DoRequest("1.0", "antchain.das.unifiedentrance.async.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取异步结果
         * Summary: 获取异步结果
         */
        public async Task<QueryUnifiedentranceAsyncResponse> QueryUnifiedentranceAsyncExAsync(QueryUnifiedentranceAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedentranceAsyncResponse>(await DoRequestAsync("1.0", "antchain.das.unifiedentrance.async.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据应用统一入口，主站调用
         * Summary: 数据应用统一入口，主站调用
         */
        public QueryMainsiteUnifiedentranceResponse QueryMainsiteUnifiedentrance(QueryMainsiteUnifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMainsiteUnifiedentranceEx(request, headers, runtime);
        }

        /**
         * Description: 数据应用统一入口，主站调用
         * Summary: 数据应用统一入口，主站调用
         */
        public async Task<QueryMainsiteUnifiedentranceResponse> QueryMainsiteUnifiedentranceAsync(QueryMainsiteUnifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMainsiteUnifiedentranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据应用统一入口，主站调用
         * Summary: 数据应用统一入口，主站调用
         */
        public QueryMainsiteUnifiedentranceResponse QueryMainsiteUnifiedentranceEx(QueryMainsiteUnifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMainsiteUnifiedentranceResponse>(DoRequest("1.0", "antchain.das.mainsite.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据应用统一入口，主站调用
         * Summary: 数据应用统一入口，主站调用
         */
        public async Task<QueryMainsiteUnifiedentranceResponse> QueryMainsiteUnifiedentranceExAsync(QueryMainsiteUnifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMainsiteUnifiedentranceResponse>(await DoRequestAsync("1.0", "antchain.das.mainsite.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代客签名
         * Summary: 代客签名
         */
        public GetApplicationProxysignResponse GetApplicationProxysign(GetApplicationProxysignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationProxysignEx(request, headers, runtime);
        }

        /**
         * Description: 代客签名
         * Summary: 代客签名
         */
        public async Task<GetApplicationProxysignResponse> GetApplicationProxysignAsync(GetApplicationProxysignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationProxysignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代客签名
         * Summary: 代客签名
         */
        public GetApplicationProxysignResponse GetApplicationProxysignEx(GetApplicationProxysignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationProxysignResponse>(DoRequest("1.0", "antchain.das.application.proxysign.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代客签名
         * Summary: 代客签名
         */
        public async Task<GetApplicationProxysignResponse> GetApplicationProxysignExAsync(GetApplicationProxysignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationProxysignResponse>(await DoRequestAsync("1.0", "antchain.das.application.proxysign.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据服务内部渠道统一查询入口
         * Summary: 数据服务内部渠道统一查询入口
         */
        public QueryApplicationChannelunifiedentranceResponse QueryApplicationChannelunifiedentrance(QueryApplicationChannelunifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationChannelunifiedentranceEx(request, headers, runtime);
        }

        /**
         * Description: 数据服务内部渠道统一查询入口
         * Summary: 数据服务内部渠道统一查询入口
         */
        public async Task<QueryApplicationChannelunifiedentranceResponse> QueryApplicationChannelunifiedentranceAsync(QueryApplicationChannelunifiedentranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationChannelunifiedentranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据服务内部渠道统一查询入口
         * Summary: 数据服务内部渠道统一查询入口
         */
        public QueryApplicationChannelunifiedentranceResponse QueryApplicationChannelunifiedentranceEx(QueryApplicationChannelunifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationChannelunifiedentranceResponse>(DoRequest("1.0", "antchain.das.application.channelunifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据服务内部渠道统一查询入口
         * Summary: 数据服务内部渠道统一查询入口
         */
        public async Task<QueryApplicationChannelunifiedentranceResponse> QueryApplicationChannelunifiedentranceExAsync(QueryApplicationChannelunifiedentranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationChannelunifiedentranceResponse>(await DoRequestAsync("1.0", "antchain.das.application.channelunifiedentrance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道调用上传授权协议文件
         * Summary: 渠道调用上传授权协议文件
         */
        public UploadApplicationChannelauthfileResponse UploadApplicationChannelauthfile(UploadApplicationChannelauthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadApplicationChannelauthfileEx(request, headers, runtime);
        }

        /**
         * Description: 渠道调用上传授权协议文件
         * Summary: 渠道调用上传授权协议文件
         */
        public async Task<UploadApplicationChannelauthfileResponse> UploadApplicationChannelauthfileAsync(UploadApplicationChannelauthfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadApplicationChannelauthfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 渠道调用上传授权协议文件
         * Summary: 渠道调用上传授权协议文件
         */
        public UploadApplicationChannelauthfileResponse UploadApplicationChannelauthfileEx(UploadApplicationChannelauthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.channelauthfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationChannelauthfileResponse uploadApplicationChannelauthfileResponse = new UploadApplicationChannelauthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationChannelauthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationChannelauthfileResponse>(DoRequest("1.0", "antchain.das.application.channelauthfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道调用上传授权协议文件
         * Summary: 渠道调用上传授权协议文件
         */
        public async Task<UploadApplicationChannelauthfileResponse> UploadApplicationChannelauthfileExAsync(UploadApplicationChannelauthfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.das.application.channelauthfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadApplicationChannelauthfileResponse uploadApplicationChannelauthfileResponse = new UploadApplicationChannelauthfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadApplicationChannelauthfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationChannelauthfileResponse>(await DoRequestAsync("1.0", "antchain.das.application.channelauthfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核婚的查询
         * Summary: 核婚的查询
         */
        public QueryApplicationMarriageResponse QueryApplicationMarriage(QueryApplicationMarriageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationMarriageEx(request, headers, runtime);
        }

        /**
         * Description: 核婚的查询
         * Summary: 核婚的查询
         */
        public async Task<QueryApplicationMarriageResponse> QueryApplicationMarriageAsync(QueryApplicationMarriageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationMarriageExAsync(request, headers, runtime);
        }

        /**
         * Description: 核婚的查询
         * Summary: 核婚的查询
         */
        public QueryApplicationMarriageResponse QueryApplicationMarriageEx(QueryApplicationMarriageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationMarriageResponse>(DoRequest("1.0", "antchain.das.application.marriage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核婚的查询
         * Summary: 核婚的查询
         */
        public async Task<QueryApplicationMarriageResponse> QueryApplicationMarriageExAsync(QueryApplicationMarriageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationMarriageResponse>(await DoRequestAsync("1.0", "antchain.das.application.marriage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权H5页面链接
         * Summary: 获取授权H5页面链接
         */
        public GetDasLinkResponse GetDasLink(GetDasLinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDasLinkEx(request, headers, runtime);
        }

        /**
         * Description: 获取授权H5页面链接
         * Summary: 获取授权H5页面链接
         */
        public async Task<GetDasLinkResponse> GetDasLinkAsync(GetDasLinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDasLinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授权H5页面链接
         * Summary: 获取授权H5页面链接
         */
        public GetDasLinkResponse GetDasLinkEx(GetDasLinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasLinkResponse>(DoRequest("1.0", "antchain.das.das.link.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权H5页面链接
         * Summary: 获取授权H5页面链接
         */
        public async Task<GetDasLinkResponse> GetDasLinkExAsync(GetDasLinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasLinkResponse>(await DoRequestAsync("1.0", "antchain.das.das.link.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权企业VC
         * Summary: 获取授权企业VC
         */
        public GetDasEnterprisevcResponse GetDasEnterprisevc(GetDasEnterprisevcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDasEnterprisevcEx(request, headers, runtime);
        }

        /**
         * Description: 获取授权企业VC
         * Summary: 获取授权企业VC
         */
        public async Task<GetDasEnterprisevcResponse> GetDasEnterprisevcAsync(GetDasEnterprisevcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDasEnterprisevcExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授权企业VC
         * Summary: 获取授权企业VC
         */
        public GetDasEnterprisevcResponse GetDasEnterprisevcEx(GetDasEnterprisevcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasEnterprisevcResponse>(DoRequest("1.0", "antchain.das.das.enterprisevc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权企业VC
         * Summary: 获取授权企业VC
         */
        public async Task<GetDasEnterprisevcResponse> GetDasEnterprisevcExAsync(GetDasEnterprisevcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasEnterprisevcResponse>(await DoRequestAsync("1.0", "antchain.das.das.enterprisevc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取个人VC
         * Summary: 获取个人VC
         */
        public GetDasIndividualvcResponse GetDasIndividualvc(GetDasIndividualvcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDasIndividualvcEx(request, headers, runtime);
        }

        /**
         * Description: 获取个人VC
         * Summary: 获取个人VC
         */
        public async Task<GetDasIndividualvcResponse> GetDasIndividualvcAsync(GetDasIndividualvcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDasIndividualvcExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取个人VC
         * Summary: 获取个人VC
         */
        public GetDasIndividualvcResponse GetDasIndividualvcEx(GetDasIndividualvcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasIndividualvcResponse>(DoRequest("1.0", "antchain.das.das.individualvc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取个人VC
         * Summary: 获取个人VC
         */
        public async Task<GetDasIndividualvcResponse> GetDasIndividualvcExAsync(GetDasIndividualvcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDasIndividualvcResponse>(await DoRequestAsync("1.0", "antchain.das.das.individualvc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送短信验证码
         * Summary: 发送短信验证码
         */
        public SendDasSmsResponse SendDasSms(SendDasSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendDasSmsEx(request, headers, runtime);
        }

        /**
         * Description: 发送短信验证码
         * Summary: 发送短信验证码
         */
        public async Task<SendDasSmsResponse> SendDasSmsAsync(SendDasSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendDasSmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发送短信验证码
         * Summary: 发送短信验证码
         */
        public SendDasSmsResponse SendDasSmsEx(SendDasSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDasSmsResponse>(DoRequest("1.0", "antchain.das.das.sms.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送短信验证码
         * Summary: 发送短信验证码
         */
        public async Task<SendDasSmsResponse> SendDasSmsExAsync(SendDasSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDasSmsResponse>(await DoRequestAsync("1.0", "antchain.das.das.sms.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过短信验证码授权
         * Summary: 通过短信验证码授权
         */
        public AuthDasSmsResponse AuthDasSms(AuthDasSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthDasSmsEx(request, headers, runtime);
        }

        /**
         * Description: 通过短信验证码授权
         * Summary: 通过短信验证码授权
         */
        public async Task<AuthDasSmsResponse> AuthDasSmsAsync(AuthDasSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthDasSmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过短信验证码授权
         * Summary: 通过短信验证码授权
         */
        public AuthDasSmsResponse AuthDasSmsEx(AuthDasSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDasSmsResponse>(DoRequest("1.0", "antchain.das.das.sms.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过短信验证码授权
         * Summary: 通过短信验证码授权
         */
        public async Task<AuthDasSmsResponse> AuthDasSmsExAsync(AuthDasSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDasSmsResponse>(await DoRequestAsync("1.0", "antchain.das.das.sms.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
         * Summary: 企业信息核验
         */
        public VerifyDasEnterpriseResponse VerifyDasEnterprise(VerifyDasEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDasEnterpriseEx(request, headers, runtime);
        }

        /**
         * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
         * Summary: 企业信息核验
         */
        public async Task<VerifyDasEnterpriseResponse> VerifyDasEnterpriseAsync(VerifyDasEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDasEnterpriseExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
         * Summary: 企业信息核验
         */
        public VerifyDasEnterpriseResponse VerifyDasEnterpriseEx(VerifyDasEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasEnterpriseResponse>(DoRequest("1.0", "antchain.das.das.enterprise.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
         * Summary: 企业信息核验
         */
        public async Task<VerifyDasEnterpriseResponse> VerifyDasEnterpriseExAsync(VerifyDasEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasEnterpriseResponse>(await DoRequestAsync("1.0", "antchain.das.das.enterprise.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人信息核验
         * Summary: 个人信息核验
         */
        public VerifyDasIndividualResponse VerifyDasIndividual(VerifyDasIndividualRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDasIndividualEx(request, headers, runtime);
        }

        /**
         * Description: 个人信息核验
         * Summary: 个人信息核验
         */
        public async Task<VerifyDasIndividualResponse> VerifyDasIndividualAsync(VerifyDasIndividualRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDasIndividualExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人信息核验
         * Summary: 个人信息核验
         */
        public VerifyDasIndividualResponse VerifyDasIndividualEx(VerifyDasIndividualRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasIndividualResponse>(DoRequest("1.0", "antchain.das.das.individual.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人信息核验
         * Summary: 个人信息核验
         */
        public async Task<VerifyDasIndividualResponse> VerifyDasIndividualExAsync(VerifyDasIndividualRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasIndividualResponse>(await DoRequestAsync("1.0", "antchain.das.das.individual.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据源
         * Summary: 创建数据源
         */
        public CreateDasDatasourceResponse CreateDasDatasource(CreateDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDasDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 创建数据源
         * Summary: 创建数据源
         */
        public async Task<CreateDasDatasourceResponse> CreateDasDatasourceAsync(CreateDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDasDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数据源
         * Summary: 创建数据源
         */
        public CreateDasDatasourceResponse CreateDasDatasourceEx(CreateDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDasDatasourceResponse>(DoRequest("1.0", "antchain.das.das.datasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据源
         * Summary: 创建数据源
         */
        public async Task<CreateDasDatasourceResponse> CreateDasDatasourceExAsync(CreateDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDasDatasourceResponse>(await DoRequestAsync("1.0", "antchain.das.das.datasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据源
         * Summary: 更新数据源
         */
        public UpdateDasDatasourceResponse UpdateDasDatasource(UpdateDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDasDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 更新数据源
         * Summary: 更新数据源
         */
        public async Task<UpdateDasDatasourceResponse> UpdateDasDatasourceAsync(UpdateDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDasDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新数据源
         * Summary: 更新数据源
         */
        public UpdateDasDatasourceResponse UpdateDasDatasourceEx(UpdateDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDasDatasourceResponse>(DoRequest("1.0", "antchain.das.das.datasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据源
         * Summary: 更新数据源
         */
        public async Task<UpdateDasDatasourceResponse> UpdateDasDatasourceExAsync(UpdateDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDasDatasourceResponse>(await DoRequestAsync("1.0", "antchain.das.das.datasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据源
         * Summary: 删除数据源
         */
        public DeleteDasDatasourceResponse DeleteDasDatasource(DeleteDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDasDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 删除数据源
         * Summary: 删除数据源
         */
        public async Task<DeleteDasDatasourceResponse> DeleteDasDatasourceAsync(DeleteDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDasDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除数据源
         * Summary: 删除数据源
         */
        public DeleteDasDatasourceResponse DeleteDasDatasourceEx(DeleteDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDasDatasourceResponse>(DoRequest("1.0", "antchain.das.das.datasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据源
         * Summary: 删除数据源
         */
        public async Task<DeleteDasDatasourceResponse> DeleteDasDatasourceExAsync(DeleteDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDasDatasourceResponse>(await DoRequestAsync("1.0", "antchain.das.das.datasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据源信息
         * Summary: 查询数据源信息
         */
        public QueryDasDatasourceResponse QueryDasDatasource(QueryDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDasDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据源信息
         * Summary: 查询数据源信息
         */
        public async Task<QueryDasDatasourceResponse> QueryDasDatasourceAsync(QueryDasDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDasDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据源信息
         * Summary: 查询数据源信息
         */
        public QueryDasDatasourceResponse QueryDasDatasourceEx(QueryDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDasDatasourceResponse>(DoRequest("1.0", "antchain.das.das.datasource.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据源信息
         * Summary: 查询数据源信息
         */
        public async Task<QueryDasDatasourceResponse> QueryDasDatasourceExAsync(QueryDasDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDasDatasourceResponse>(await DoRequestAsync("1.0", "antchain.das.das.datasource.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验授权结果
         * Summary: 校验授权结果
         */
        public VerifyDasAuthresultResponse VerifyDasAuthresult(VerifyDasAuthresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDasAuthresultEx(request, headers, runtime);
        }

        /**
         * Description: 校验授权结果
         * Summary: 校验授权结果
         */
        public async Task<VerifyDasAuthresultResponse> VerifyDasAuthresultAsync(VerifyDasAuthresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDasAuthresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验授权结果
         * Summary: 校验授权结果
         */
        public VerifyDasAuthresultResponse VerifyDasAuthresultEx(VerifyDasAuthresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasAuthresultResponse>(DoRequest("1.0", "antchain.das.das.authresult.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验授权结果
         * Summary: 校验授权结果
         */
        public async Task<VerifyDasAuthresultResponse> VerifyDasAuthresultExAsync(VerifyDasAuthresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDasAuthresultResponse>(await DoRequestAsync("1.0", "antchain.das.das.authresult.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据授权三方信息做授权
         * Summary: 根据授权三方信息做授权
         */
        public AuthDasAuthresultResponse AuthDasAuthresult(AuthDasAuthresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthDasAuthresultEx(request, headers, runtime);
        }

        /**
         * Description: 根据授权三方信息做授权
         * Summary: 根据授权三方信息做授权
         */
        public async Task<AuthDasAuthresultResponse> AuthDasAuthresultAsync(AuthDasAuthresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthDasAuthresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据授权三方信息做授权
         * Summary: 根据授权三方信息做授权
         */
        public AuthDasAuthresultResponse AuthDasAuthresultEx(AuthDasAuthresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDasAuthresultResponse>(DoRequest("1.0", "antchain.das.das.authresult.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据授权三方信息做授权
         * Summary: 根据授权三方信息做授权
         */
        public async Task<AuthDasAuthresultResponse> AuthDasAuthresultExAsync(AuthDasAuthresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDasAuthresultResponse>(await DoRequestAsync("1.0", "antchain.das.das.authresult.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增数据授权配置
         * Summary: 新增数据授权配置
         */
        public AddAuthConfigResponse AddAuthConfig(AddAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAuthConfigEx(request, headers, runtime);
        }

        /**
         * Description: 新增数据授权配置
         * Summary: 新增数据授权配置
         */
        public async Task<AddAuthConfigResponse> AddAuthConfigAsync(AddAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAuthConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增数据授权配置
         * Summary: 新增数据授权配置
         */
        public AddAuthConfigResponse AddAuthConfigEx(AddAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAuthConfigResponse>(DoRequest("1.0", "antchain.das.auth.config.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增数据授权配置
         * Summary: 新增数据授权配置
         */
        public async Task<AddAuthConfigResponse> AddAuthConfigExAsync(AddAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAuthConfigResponse>(await DoRequestAsync("1.0", "antchain.das.auth.config.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑数据授权配置
         * Summary: 编辑数据授权配置
         */
        public UpdateAuthConfigResponse UpdateAuthConfig(UpdateAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAuthConfigEx(request, headers, runtime);
        }

        /**
         * Description: 编辑数据授权配置
         * Summary: 编辑数据授权配置
         */
        public async Task<UpdateAuthConfigResponse> UpdateAuthConfigAsync(UpdateAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAuthConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑数据授权配置
         * Summary: 编辑数据授权配置
         */
        public UpdateAuthConfigResponse UpdateAuthConfigEx(UpdateAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthConfigResponse>(DoRequest("1.0", "antchain.das.auth.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑数据授权配置
         * Summary: 编辑数据授权配置
         */
        public async Task<UpdateAuthConfigResponse> UpdateAuthConfigExAsync(UpdateAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthConfigResponse>(await DoRequestAsync("1.0", "antchain.das.auth.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权协议
         * Summary: 上传授权协议
         */
        public UploadAuthAgreementResponse UploadAuthAgreement(UploadAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAuthAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 上传授权协议
         * Summary: 上传授权协议
         */
        public async Task<UploadAuthAgreementResponse> UploadAuthAgreementAsync(UploadAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAuthAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传授权协议
         * Summary: 上传授权协议
         */
        public UploadAuthAgreementResponse UploadAuthAgreementEx(UploadAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAuthAgreementResponse>(DoRequest("1.0", "antchain.das.auth.agreement.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传授权协议
         * Summary: 上传授权协议
         */
        public async Task<UploadAuthAgreementResponse> UploadAuthAgreementExAsync(UploadAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAuthAgreementResponse>(await DoRequestAsync("1.0", "antchain.das.auth.agreement.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片
         * Summary: 上传图片
         */
        public UploadAuthPictureResponse UploadAuthPicture(UploadAuthPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAuthPictureEx(request, headers, runtime);
        }

        /**
         * Description: 上传图片
         * Summary: 上传图片
         */
        public async Task<UploadAuthPictureResponse> UploadAuthPictureAsync(UploadAuthPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAuthPictureExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传图片
         * Summary: 上传图片
         */
        public UploadAuthPictureResponse UploadAuthPictureEx(UploadAuthPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAuthPictureResponse>(DoRequest("1.0", "antchain.das.auth.picture.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传图片
         * Summary: 上传图片
         */
        public async Task<UploadAuthPictureResponse> UploadAuthPictureExAsync(UploadAuthPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAuthPictureResponse>(await DoRequestAsync("1.0", "antchain.das.auth.picture.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权内容列表
         * Summary: 查询授权内容列表
         */
        public ListAuthContentResponse ListAuthContent(ListAuthContentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthContentEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权内容列表
         * Summary: 查询授权内容列表
         */
        public async Task<ListAuthContentResponse> ListAuthContentAsync(ListAuthContentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthContentExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权内容列表
         * Summary: 查询授权内容列表
         */
        public ListAuthContentResponse ListAuthContentEx(ListAuthContentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthContentResponse>(DoRequest("1.0", "antchain.das.auth.content.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权内容列表
         * Summary: 查询授权内容列表
         */
        public async Task<ListAuthContentResponse> ListAuthContentExAsync(ListAuthContentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthContentResponse>(await DoRequestAsync("1.0", "antchain.das.auth.content.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据授权配置列表
         * Summary: 查询数据授权配置列表
         */
        public ListAuthConfigResponse ListAuthConfig(ListAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthConfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据授权配置列表
         * Summary: 查询数据授权配置列表
         */
        public async Task<ListAuthConfigResponse> ListAuthConfigAsync(ListAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据授权配置列表
         * Summary: 查询数据授权配置列表
         */
        public ListAuthConfigResponse ListAuthConfigEx(ListAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthConfigResponse>(DoRequest("1.0", "antchain.das.auth.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据授权配置列表
         * Summary: 查询数据授权配置列表
         */
        public async Task<ListAuthConfigResponse> ListAuthConfigExAsync(ListAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthConfigResponse>(await DoRequestAsync("1.0", "antchain.das.auth.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权配置状态
         * Summary: 更新授权配置状态
         */
        public UpdateAuthStatusResponse UpdateAuthStatus(UpdateAuthStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAuthStatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新授权配置状态
         * Summary: 更新授权配置状态
         */
        public async Task<UpdateAuthStatusResponse> UpdateAuthStatusAsync(UpdateAuthStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAuthStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新授权配置状态
         * Summary: 更新授权配置状态
         */
        public UpdateAuthStatusResponse UpdateAuthStatusEx(UpdateAuthStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthStatusResponse>(DoRequest("1.0", "antchain.das.auth.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权配置状态
         * Summary: 更新授权配置状态
         */
        public async Task<UpdateAuthStatusResponse> UpdateAuthStatusExAsync(UpdateAuthStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthStatusResponse>(await DoRequestAsync("1.0", "antchain.das.auth.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权配置详情
         * Summary: 查询授权配置详情
         */
        public DetailAuthConfigResponse DetailAuthConfig(DetailAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAuthConfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权配置详情
         * Summary: 查询授权配置详情
         */
        public async Task<DetailAuthConfigResponse> DetailAuthConfigAsync(DetailAuthConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAuthConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权配置详情
         * Summary: 查询授权配置详情
         */
        public DetailAuthConfigResponse DetailAuthConfigEx(DetailAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAuthConfigResponse>(DoRequest("1.0", "antchain.das.auth.config.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权配置详情
         * Summary: 查询授权配置详情
         */
        public async Task<DetailAuthConfigResponse> DetailAuthConfigExAsync(DetailAuthConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAuthConfigResponse>(await DoRequestAsync("1.0", "antchain.das.auth.config.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户授权记录列表
         * Summary: 查询用户授权记录列表
         */
        public ListAuthRecordResponse ListAuthRecord(ListAuthRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthRecordEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户授权记录列表
         * Summary: 查询用户授权记录列表
         */
        public async Task<ListAuthRecordResponse> ListAuthRecordAsync(ListAuthRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户授权记录列表
         * Summary: 查询用户授权记录列表
         */
        public ListAuthRecordResponse ListAuthRecordEx(ListAuthRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthRecordResponse>(DoRequest("1.0", "antchain.das.auth.record.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户授权记录列表
         * Summary: 查询用户授权记录列表
         */
        public async Task<ListAuthRecordResponse> ListAuthRecordExAsync(ListAuthRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthRecordResponse>(await DoRequestAsync("1.0", "antchain.das.auth.record.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载用户授权协议
         * Summary: 下载用户授权协议
         */
        public DownloadAuthAgreementResponse DownloadAuthAgreement(DownloadAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadAuthAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 下载用户授权协议
         * Summary: 下载用户授权协议
         */
        public async Task<DownloadAuthAgreementResponse> DownloadAuthAgreementAsync(DownloadAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadAuthAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 下载用户授权协议
         * Summary: 下载用户授权协议
         */
        public DownloadAuthAgreementResponse DownloadAuthAgreementEx(DownloadAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAuthAgreementResponse>(DoRequest("1.0", "antchain.das.auth.agreement.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载用户授权协议
         * Summary: 下载用户授权协议
         */
        public async Task<DownloadAuthAgreementResponse> DownloadAuthAgreementExAsync(DownloadAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAuthAgreementResponse>(await DoRequestAsync("1.0", "antchain.das.auth.agreement.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据授权核验
         * Summary: 数据授权核验
         */
        public VerifyDataAuthResponse VerifyDataAuth(VerifyDataAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyDataAuthEx(request, headers, runtime);
        }

        /**
         * Description: 数据授权核验
         * Summary: 数据授权核验
         */
        public async Task<VerifyDataAuthResponse> VerifyDataAuthAsync(VerifyDataAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyDataAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据授权核验
         * Summary: 数据授权核验
         */
        public VerifyDataAuthResponse VerifyDataAuthEx(VerifyDataAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDataAuthResponse>(DoRequest("1.0", "antchain.das.data.auth.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据授权核验
         * Summary: 数据授权核验
         */
        public async Task<VerifyDataAuthResponse> VerifyDataAuthExAsync(VerifyDataAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyDataAuthResponse>(await DoRequestAsync("1.0", "antchain.das.data.auth.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品参数信息
         * Summary: 查询产品参数信息
         */
        public QueryProductParamResponse QueryProductParam(QueryProductParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProductParamEx(request, headers, runtime);
        }

        /**
         * Description: 查询产品参数信息
         * Summary: 查询产品参数信息
         */
        public async Task<QueryProductParamResponse> QueryProductParamAsync(QueryProductParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProductParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产品参数信息
         * Summary: 查询产品参数信息
         */
        public QueryProductParamResponse QueryProductParamEx(QueryProductParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductParamResponse>(DoRequest("1.0", "antchain.das.product.param.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品参数信息
         * Summary: 查询产品参数信息
         */
        public async Task<QueryProductParamResponse> QueryProductParamExAsync(QueryProductParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductParamResponse>(await DoRequestAsync("1.0", "antchain.das.product.param.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据回调
         * Summary: 授权数据回调
         */
        public CallbackAuthDataResponse CallbackAuthData(CallbackAuthDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAuthDataEx(request, headers, runtime);
        }

        /**
         * Description: 授权数据回调
         * Summary: 授权数据回调
         */
        public async Task<CallbackAuthDataResponse> CallbackAuthDataAsync(CallbackAuthDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAuthDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权数据回调
         * Summary: 授权数据回调
         */
        public CallbackAuthDataResponse CallbackAuthDataEx(CallbackAuthDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAuthDataResponse>(DoRequest("1.0", "antchain.das.auth.data.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据回调
         * Summary: 授权数据回调
         */
        public async Task<CallbackAuthDataResponse> CallbackAuthDataExAsync(CallbackAuthDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAuthDataResponse>(await DoRequestAsync("1.0", "antchain.das.auth.data.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录回调
         * Summary: 授权记录回调
         */
        public CallbackAuthRecordResponse CallbackAuthRecord(CallbackAuthRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAuthRecordEx(request, headers, runtime);
        }

        /**
         * Description: 授权记录回调
         * Summary: 授权记录回调
         */
        public async Task<CallbackAuthRecordResponse> CallbackAuthRecordAsync(CallbackAuthRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAuthRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权记录回调
         * Summary: 授权记录回调
         */
        public CallbackAuthRecordResponse CallbackAuthRecordEx(CallbackAuthRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAuthRecordResponse>(DoRequest("1.0", "antchain.das.auth.record.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录回调
         * Summary: 授权记录回调
         */
        public async Task<CallbackAuthRecordResponse> CallbackAuthRecordExAsync(CallbackAuthRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAuthRecordResponse>(await DoRequestAsync("1.0", "antchain.das.auth.record.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取默认的授权协议
         * Summary: 获取默认的授权协议
         */
        public ListAuthAgreementResponse ListAuthAgreement(ListAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 获取默认的授权协议
         * Summary: 获取默认的授权协议
         */
        public async Task<ListAuthAgreementResponse> ListAuthAgreementAsync(ListAuthAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取默认的授权协议
         * Summary: 获取默认的授权协议
         */
        public ListAuthAgreementResponse ListAuthAgreementEx(ListAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthAgreementResponse>(DoRequest("1.0", "antchain.das.auth.agreement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取默认的授权协议
         * Summary: 获取默认的授权协议
         */
        public async Task<ListAuthAgreementResponse> ListAuthAgreementExAsync(ListAuthAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthAgreementResponse>(await DoRequestAsync("1.0", "antchain.das.auth.agreement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据产品是否需要授权
         * Summary: 数据产品是否需要授权
         */
        public StartProductAuthResponse StartProductAuth(StartProductAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartProductAuthEx(request, headers, runtime);
        }

        /**
         * Description: 数据产品是否需要授权
         * Summary: 数据产品是否需要授权
         */
        public async Task<StartProductAuthResponse> StartProductAuthAsync(StartProductAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartProductAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据产品是否需要授权
         * Summary: 数据产品是否需要授权
         */
        public StartProductAuthResponse StartProductAuthEx(StartProductAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartProductAuthResponse>(DoRequest("1.0", "antchain.das.product.auth.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据产品是否需要授权
         * Summary: 数据产品是否需要授权
         */
        public async Task<StartProductAuthResponse> StartProductAuthExAsync(StartProductAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartProductAuthResponse>(await DoRequestAsync("1.0", "antchain.das.product.auth.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
