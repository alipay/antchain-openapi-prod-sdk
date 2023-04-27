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
                        {"sdk_version", "1.1.42"},
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
                        {"sdk_version", "1.1.42"},
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
         * Description: 教育信息查询（姓名+手机号）
         * Summary: 教育信息查询（姓名+手机号）
         */
        public QueryPhonenumberEducationinfoResponse QueryPhonenumberEducationinfo(QueryPhonenumberEducationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPhonenumberEducationinfoEx(request, headers, runtime);
        }

        /**
         * Description: 教育信息查询（姓名+手机号）
         * Summary: 教育信息查询（姓名+手机号）
         */
        public async Task<QueryPhonenumberEducationinfoResponse> QueryPhonenumberEducationinfoAsync(QueryPhonenumberEducationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPhonenumberEducationinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 教育信息查询（姓名+手机号）
         * Summary: 教育信息查询（姓名+手机号）
         */
        public QueryPhonenumberEducationinfoResponse QueryPhonenumberEducationinfoEx(QueryPhonenumberEducationinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPhonenumberEducationinfoResponse>(DoRequest("1.0", "antchain.das.phonenumber.educationinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 教育信息查询（姓名+手机号）
         * Summary: 教育信息查询（姓名+手机号）
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
