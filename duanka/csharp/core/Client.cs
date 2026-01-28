// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DUANKA.Models;

namespace AntChain.SDK.DUANKA
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
                        {"sdk_version", "1.1.15"},
                        {"_prod_code", "DUANKA"},
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
                        {"sdk_version", "1.1.15"},
                        {"_prod_code", "DUANKA"},
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
         * Description: 查询断卡结果
         * Summary: 查询断卡结果
         */
        public QueryDuankaEvaluationResponse QueryDuankaEvaluation(QueryDuankaEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDuankaEvaluationEx(request, headers, runtime);
        }

        /**
         * Description: 查询断卡结果
         * Summary: 查询断卡结果
         */
        public async Task<QueryDuankaEvaluationResponse> QueryDuankaEvaluationAsync(QueryDuankaEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDuankaEvaluationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询断卡结果
         * Summary: 查询断卡结果
         */
        public QueryDuankaEvaluationResponse QueryDuankaEvaluationEx(QueryDuankaEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDuankaEvaluationResponse>(DoRequest("1.0", "antcloud.duanka.duanka.evaluation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询断卡结果
         * Summary: 查询断卡结果
         */
        public async Task<QueryDuankaEvaluationResponse> QueryDuankaEvaluationExAsync(QueryDuankaEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDuankaEvaluationResponse>(await DoRequestAsync("1.0", "antcloud.duanka.duanka.evaluation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: hr主数据用户信息查询接口
         * Summary: hr主数据用户信息查询接口
         */
        public QueryHrUserResponse QueryHrUser(QueryHrUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryHrUserEx(request, headers, runtime);
        }

        /**
         * Description: hr主数据用户信息查询接口
         * Summary: hr主数据用户信息查询接口
         */
        public async Task<QueryHrUserResponse> QueryHrUserAsync(QueryHrUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryHrUserExAsync(request, headers, runtime);
        }

        /**
         * Description: hr主数据用户信息查询接口
         * Summary: hr主数据用户信息查询接口
         */
        public QueryHrUserResponse QueryHrUserEx(QueryHrUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryHrUserResponse>(DoRequest("1.0", "antcloud.duanka.hr.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: hr主数据用户信息查询接口
         * Summary: hr主数据用户信息查询接口
         */
        public async Task<QueryHrUserResponse> QueryHrUserExAsync(QueryHrUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryHrUserResponse>(await DoRequestAsync("1.0", "antcloud.duanka.hr.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天擎数据接口查询
         * Summary: 天擎数据接口查询
         */
        public QuerySkyholdResResponse QuerySkyholdRes(QuerySkyholdResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySkyholdResEx(request, headers, runtime);
        }

        /**
         * Description: 天擎数据接口查询
         * Summary: 天擎数据接口查询
         */
        public async Task<QuerySkyholdResResponse> QuerySkyholdResAsync(QuerySkyholdResRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySkyholdResExAsync(request, headers, runtime);
        }

        /**
         * Description: 天擎数据接口查询
         * Summary: 天擎数据接口查询
         */
        public QuerySkyholdResResponse QuerySkyholdResEx(QuerySkyholdResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySkyholdResResponse>(DoRequest("1.0", "antcloud.duanka.skyhold.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天擎数据接口查询
         * Summary: 天擎数据接口查询
         */
        public async Task<QuerySkyholdResResponse> QuerySkyholdResExAsync(QuerySkyholdResRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySkyholdResResponse>(await DoRequestAsync("1.0", "antcloud.duanka.skyhold.res.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public QueryCommonScoreResponse QueryCommonScore(QueryCommonScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommonScoreEx(request, headers, runtime);
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public async Task<QueryCommonScoreResponse> QueryCommonScoreAsync(QueryCommonScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommonScoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public QueryCommonScoreResponse QueryCommonScoreEx(QueryCommonScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommonScoreResponse>(DoRequest("1.0", "antcloud.duanka.common.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public async Task<QueryCommonScoreResponse> QueryCommonScoreExAsync(QueryCommonScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommonScoreResponse>(await DoRequestAsync("1.0", "antcloud.duanka.common.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云凤蝶工单提交接口
         * Summary: 云凤蝶工单提交接口
         */
        public SubmitYunfengdieAuditResponse SubmitYunfengdieAudit(SubmitYunfengdieAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitYunfengdieAuditEx(request, headers, runtime);
        }

        /**
         * Description: 云凤蝶工单提交接口
         * Summary: 云凤蝶工单提交接口
         */
        public async Task<SubmitYunfengdieAuditResponse> SubmitYunfengdieAuditAsync(SubmitYunfengdieAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitYunfengdieAuditExAsync(request, headers, runtime);
        }

        /**
         * Description: 云凤蝶工单提交接口
         * Summary: 云凤蝶工单提交接口
         */
        public SubmitYunfengdieAuditResponse SubmitYunfengdieAuditEx(SubmitYunfengdieAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitYunfengdieAuditResponse>(DoRequest("1.0", "antcloud.duanka.yunfengdie.audit.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云凤蝶工单提交接口
         * Summary: 云凤蝶工单提交接口
         */
        public async Task<SubmitYunfengdieAuditResponse> SubmitYunfengdieAuditExAsync(SubmitYunfengdieAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitYunfengdieAuditResponse>(await DoRequestAsync("1.0", "antcloud.duanka.yunfengdie.audit.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件转存接口
         * Summary: 文件转存接口
         */
        public ImportAistudioOssResponse ImportAistudioOss(ImportAistudioOssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAistudioOssEx(request, headers, runtime);
        }

        /**
         * Description: 文件转存接口
         * Summary: 文件转存接口
         */
        public async Task<ImportAistudioOssResponse> ImportAistudioOssAsync(ImportAistudioOssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAistudioOssExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件转存接口
         * Summary: 文件转存接口
         */
        public ImportAistudioOssResponse ImportAistudioOssEx(ImportAistudioOssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAistudioOssResponse>(DoRequest("1.0", "antcloud.duanka.aistudio.oss.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件转存接口
         * Summary: 文件转存接口
         */
        public async Task<ImportAistudioOssResponse> ImportAistudioOssExAsync(ImportAistudioOssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAistudioOssResponse>(await DoRequestAsync("1.0", "antcloud.duanka.aistudio.oss.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型验收服务
         * Summary: 模型验收服务
         */
        public CheckAistudioModelResponse CheckAistudioModel(CheckAistudioModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAistudioModelEx(request, headers, runtime);
        }

        /**
         * Description: 模型验收服务
         * Summary: 模型验收服务
         */
        public async Task<CheckAistudioModelResponse> CheckAistudioModelAsync(CheckAistudioModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAistudioModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 模型验收服务
         * Summary: 模型验收服务
         */
        public CheckAistudioModelResponse CheckAistudioModelEx(CheckAistudioModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAistudioModelResponse>(DoRequest("1.0", "antcloud.duanka.aistudio.model.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型验收服务
         * Summary: 模型验收服务
         */
        public async Task<CheckAistudioModelResponse> CheckAistudioModelExAsync(CheckAistudioModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAistudioModelResponse>(await DoRequestAsync("1.0", "antcloud.duanka.aistudio.model.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型验收服务结果查询
         * Summary: 模型验收服务结果查询
         */
        public QueryAistudioModelResponse QueryAistudioModel(QueryAistudioModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAistudioModelEx(request, headers, runtime);
        }

        /**
         * Description: 模型验收服务结果查询
         * Summary: 模型验收服务结果查询
         */
        public async Task<QueryAistudioModelResponse> QueryAistudioModelAsync(QueryAistudioModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAistudioModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 模型验收服务结果查询
         * Summary: 模型验收服务结果查询
         */
        public QueryAistudioModelResponse QueryAistudioModelEx(QueryAistudioModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAistudioModelResponse>(DoRequest("1.0", "antcloud.duanka.aistudio.model.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型验收服务结果查询
         * Summary: 模型验收服务结果查询
         */
        public async Task<QueryAistudioModelResponse> QueryAistudioModelExAsync(QueryAistudioModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAistudioModelResponse>(await DoRequestAsync("1.0", "antcloud.duanka.aistudio.model.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询-回溯
         * Summary: 通用查询-回溯
         */
        public QueryBacktrackScoreResponse QueryBacktrackScore(QueryBacktrackScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBacktrackScoreEx(request, headers, runtime);
        }

        /**
         * Description: 通用查询-回溯
         * Summary: 通用查询-回溯
         */
        public async Task<QueryBacktrackScoreResponse> QueryBacktrackScoreAsync(QueryBacktrackScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBacktrackScoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用查询-回溯
         * Summary: 通用查询-回溯
         */
        public QueryBacktrackScoreResponse QueryBacktrackScoreEx(QueryBacktrackScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBacktrackScoreResponse>(DoRequest("1.0", "antcloud.duanka.backtrack.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询-回溯
         * Summary: 通用查询-回溯
         */
        public async Task<QueryBacktrackScoreResponse> QueryBacktrackScoreExAsync(QueryBacktrackScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBacktrackScoreResponse>(await DoRequestAsync("1.0", "antcloud.duanka.backtrack.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型sql检验
         * Summary: 大模型sql检验
         */
        public CheckEasMdetectionResponse CheckEasMdetection(CheckEasMdetectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckEasMdetectionEx(request, headers, runtime);
        }

        /**
         * Description: 大模型sql检验
         * Summary: 大模型sql检验
         */
        public async Task<CheckEasMdetectionResponse> CheckEasMdetectionAsync(CheckEasMdetectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckEasMdetectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 大模型sql检验
         * Summary: 大模型sql检验
         */
        public CheckEasMdetectionResponse CheckEasMdetectionEx(CheckEasMdetectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEasMdetectionResponse>(DoRequest("1.0", "antcloud.duanka.eas.mdetection.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型sql检验
         * Summary: 大模型sql检验
         */
        public async Task<CheckEasMdetectionResponse> CheckEasMdetectionExAsync(CheckEasMdetectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEasMdetectionResponse>(await DoRequestAsync("1.0", "antcloud.duanka.eas.mdetection.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
         * Summary: 主站bpservice通用http接口
         */
        public QueryBpserviceHttpResponse QueryBpserviceHttp(QueryBpserviceHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBpserviceHttpEx(request, headers, runtime);
        }

        /**
         * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
         * Summary: 主站bpservice通用http接口
         */
        public async Task<QueryBpserviceHttpResponse> QueryBpserviceHttpAsync(QueryBpserviceHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBpserviceHttpExAsync(request, headers, runtime);
        }

        /**
         * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
         * Summary: 主站bpservice通用http接口
         */
        public QueryBpserviceHttpResponse QueryBpserviceHttpEx(QueryBpserviceHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBpserviceHttpResponse>(DoRequest("1.0", "antcloud.duanka.bpservice.http.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
         * Summary: 主站bpservice通用http接口
         */
        public async Task<QueryBpserviceHttpResponse> QueryBpserviceHttpExAsync(QueryBpserviceHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBpserviceHttpResponse>(await DoRequestAsync("1.0", "antcloud.duanka.bpservice.http.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入dataphin的同步任务
         * Summary: 导入dataphin的同步任务
         */
        public ImportDataphinTaskResponse ImportDataphinTask(ImportDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDataphinTaskEx(request, headers, runtime);
        }

        /**
         * Description: 导入dataphin的同步任务
         * Summary: 导入dataphin的同步任务
         */
        public async Task<ImportDataphinTaskResponse> ImportDataphinTaskAsync(ImportDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDataphinTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入dataphin的同步任务
         * Summary: 导入dataphin的同步任务
         */
        public ImportDataphinTaskResponse ImportDataphinTaskEx(ImportDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDataphinTaskResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.task.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入dataphin的同步任务
         * Summary: 导入dataphin的同步任务
         */
        public async Task<ImportDataphinTaskResponse> ImportDataphinTaskExAsync(ImportDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDataphinTaskResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.task.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步oss文件到odps里面
         * Summary: 同步oss文件到odps里面
         */
        public SyncOssOdpsResponse SyncOssOdps(SyncOssOdpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncOssOdpsEx(request, headers, runtime);
        }

        /**
         * Description: 同步oss文件到odps里面
         * Summary: 同步oss文件到odps里面
         */
        public async Task<SyncOssOdpsResponse> SyncOssOdpsAsync(SyncOssOdpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncOssOdpsExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步oss文件到odps里面
         * Summary: 同步oss文件到odps里面
         */
        public SyncOssOdpsResponse SyncOssOdpsEx(SyncOssOdpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOssOdpsResponse>(DoRequest("1.0", "antcloud.duanka.oss.odps.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步oss文件到odps里面
         * Summary: 同步oss文件到odps里面
         */
        public async Task<SyncOssOdpsResponse> SyncOssOdpsExAsync(SyncOssOdpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOssOdpsResponse>(await DoRequestAsync("1.0", "antcloud.duanka.oss.odps.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: odps表数据导出到oss中
         * Summary: odps表数据导出到oss中
         */
        public SyncOpdsOssResponse SyncOpdsOss(SyncOpdsOssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncOpdsOssEx(request, headers, runtime);
        }

        /**
         * Description: odps表数据导出到oss中
         * Summary: odps表数据导出到oss中
         */
        public async Task<SyncOpdsOssResponse> SyncOpdsOssAsync(SyncOpdsOssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncOpdsOssExAsync(request, headers, runtime);
        }

        /**
         * Description: odps表数据导出到oss中
         * Summary: odps表数据导出到oss中
         */
        public SyncOpdsOssResponse SyncOpdsOssEx(SyncOpdsOssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOpdsOssResponse>(DoRequest("1.0", "antcloud.duanka.opds.oss.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: odps表数据导出到oss中
         * Summary: odps表数据导出到oss中
         */
        public async Task<SyncOpdsOssResponse> SyncOpdsOssExAsync(SyncOpdsOssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOpdsOssResponse>(await DoRequestAsync("1.0", "antcloud.duanka.opds.oss.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断dataphin表分区是否存在
         * Summary: 判断dataphin表分区是否存在
         */
        public ExistDataphinTablepartitionResponse ExistDataphinTablepartition(ExistDataphinTablepartitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistDataphinTablepartitionEx(request, headers, runtime);
        }

        /**
         * Description: 判断dataphin表分区是否存在
         * Summary: 判断dataphin表分区是否存在
         */
        public async Task<ExistDataphinTablepartitionResponse> ExistDataphinTablepartitionAsync(ExistDataphinTablepartitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistDataphinTablepartitionExAsync(request, headers, runtime);
        }

        /**
         * Description: 判断dataphin表分区是否存在
         * Summary: 判断dataphin表分区是否存在
         */
        public ExistDataphinTablepartitionResponse ExistDataphinTablepartitionEx(ExistDataphinTablepartitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistDataphinTablepartitionResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.tablepartition.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断dataphin表分区是否存在
         * Summary: 判断dataphin表分区是否存在
         */
        public async Task<ExistDataphinTablepartitionResponse> ExistDataphinTablepartitionExAsync(ExistDataphinTablepartitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistDataphinTablepartitionResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.tablepartition.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布dataphin任务
         * Summary: 发布dataphin任务
         */
        public PublishDataphinTaskResponse PublishDataphinTask(PublishDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishDataphinTaskEx(request, headers, runtime);
        }

        /**
         * Description: 发布dataphin任务
         * Summary: 发布dataphin任务
         */
        public async Task<PublishDataphinTaskResponse> PublishDataphinTaskAsync(PublishDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishDataphinTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布dataphin任务
         * Summary: 发布dataphin任务
         */
        public PublishDataphinTaskResponse PublishDataphinTaskEx(PublishDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDataphinTaskResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.task.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布dataphin任务
         * Summary: 发布dataphin任务
         */
        public async Task<PublishDataphinTaskResponse> PublishDataphinTaskExAsync(PublishDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDataphinTaskResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.task.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验任务发布
         * Summary: 校验任务发布
         */
        public CheckDataphinTaskResponse CheckDataphinTask(CheckDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckDataphinTaskEx(request, headers, runtime);
        }

        /**
         * Description: 校验任务发布
         * Summary: 校验任务发布
         */
        public async Task<CheckDataphinTaskResponse> CheckDataphinTaskAsync(CheckDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckDataphinTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验任务发布
         * Summary: 校验任务发布
         */
        public CheckDataphinTaskResponse CheckDataphinTaskEx(CheckDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckDataphinTaskResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.task.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验任务发布
         * Summary: 校验任务发布
         */
        public async Task<CheckDataphinTaskResponse> CheckDataphinTaskExAsync(CheckDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckDataphinTaskResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.task.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运行任务
         * Summary: 运行任务
         */
        public RunDataphinTaskResponse RunDataphinTask(RunDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunDataphinTaskEx(request, headers, runtime);
        }

        /**
         * Description: 运行任务
         * Summary: 运行任务
         */
        public async Task<RunDataphinTaskResponse> RunDataphinTaskAsync(RunDataphinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunDataphinTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 运行任务
         * Summary: 运行任务
         */
        public RunDataphinTaskResponse RunDataphinTaskEx(RunDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunDataphinTaskResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.task.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运行任务
         * Summary: 运行任务
         */
        public async Task<RunDataphinTaskResponse> RunDataphinTaskExAsync(RunDataphinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunDataphinTaskResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.task.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 表信息查询
         * Summary: 表信息查询
         */
        public QueryDataphinTableinfoResponse QueryDataphinTableinfo(QueryDataphinTableinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataphinTableinfoEx(request, headers, runtime);
        }

        /**
         * Description: 表信息查询
         * Summary: 表信息查询
         */
        public async Task<QueryDataphinTableinfoResponse> QueryDataphinTableinfoAsync(QueryDataphinTableinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataphinTableinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 表信息查询
         * Summary: 表信息查询
         */
        public QueryDataphinTableinfoResponse QueryDataphinTableinfoEx(QueryDataphinTableinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataphinTableinfoResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.tableinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 表信息查询
         * Summary: 表信息查询
         */
        public async Task<QueryDataphinTableinfoResponse> QueryDataphinTableinfoExAsync(QueryDataphinTableinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataphinTableinfoResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.tableinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件ossToOdps
         * Summary: 文件ossToOdps
         */
        public ImportDataphinFileResponse ImportDataphinFile(ImportDataphinFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDataphinFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件ossToOdps
         * Summary: 文件ossToOdps
         */
        public async Task<ImportDataphinFileResponse> ImportDataphinFileAsync(ImportDataphinFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDataphinFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件ossToOdps
         * Summary: 文件ossToOdps
         */
        public ImportDataphinFileResponse ImportDataphinFileEx(ImportDataphinFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDataphinFileResponse>(DoRequest("1.0", "antcloud.duanka.dataphin.file.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件ossToOdps
         * Summary: 文件ossToOdps
         */
        public async Task<ImportDataphinFileResponse> ImportDataphinFileExAsync(ImportDataphinFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDataphinFileResponse>(await DoRequestAsync("1.0", "antcloud.duanka.dataphin.file.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交dataphin任务
         * Summary: 提交dataphin任务
         */
        public SubmitDatapinTaskResponse SubmitDatapinTask(SubmitDatapinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitDatapinTaskEx(request, headers, runtime);
        }

        /**
         * Description: 提交dataphin任务
         * Summary: 提交dataphin任务
         */
        public async Task<SubmitDatapinTaskResponse> SubmitDatapinTaskAsync(SubmitDatapinTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitDatapinTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交dataphin任务
         * Summary: 提交dataphin任务
         */
        public SubmitDatapinTaskResponse SubmitDatapinTaskEx(SubmitDatapinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDatapinTaskResponse>(DoRequest("1.0", "antcloud.duanka.datapin.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交dataphin任务
         * Summary: 提交dataphin任务
         */
        public async Task<SubmitDatapinTaskResponse> SubmitDatapinTaskExAsync(SubmitDatapinTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDatapinTaskResponse>(await DoRequestAsync("1.0", "antcloud.duanka.datapin.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 行业分查询
         * Summary: 行业分查询
         */
        public QueryIndustryScoreResponse QueryIndustryScore(QueryIndustryScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndustryScoreEx(request, headers, runtime);
        }

        /**
         * Description: 行业分查询
         * Summary: 行业分查询
         */
        public async Task<QueryIndustryScoreResponse> QueryIndustryScoreAsync(QueryIndustryScoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndustryScoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 行业分查询
         * Summary: 行业分查询
         */
        public QueryIndustryScoreResponse QueryIndustryScoreEx(QueryIndustryScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndustryScoreResponse>(DoRequest("1.0", "antcloud.duanka.industry.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 行业分查询
         * Summary: 行业分查询
         */
        public async Task<QueryIndustryScoreResponse> QueryIndustryScoreExAsync(QueryIndustryScoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndustryScoreResponse>(await DoRequestAsync("1.0", "antcloud.duanka.industry.score.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 品牌研究数据查询
         * Summary: 品牌研究数据查询
         */
        public QueryIrBrandResponse QueryIrBrand(QueryIrBrandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIrBrandEx(request, headers, runtime);
        }

        /**
         * Description: 品牌研究数据查询
         * Summary: 品牌研究数据查询
         */
        public async Task<QueryIrBrandResponse> QueryIrBrandAsync(QueryIrBrandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIrBrandExAsync(request, headers, runtime);
        }

        /**
         * Description: 品牌研究数据查询
         * Summary: 品牌研究数据查询
         */
        public QueryIrBrandResponse QueryIrBrandEx(QueryIrBrandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIrBrandResponse>(DoRequest("1.0", "antcloud.duanka.ir.brand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 品牌研究数据查询
         * Summary: 品牌研究数据查询
         */
        public async Task<QueryIrBrandResponse> QueryIrBrandExAsync(QueryIrBrandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIrBrandResponse>(await DoRequestAsync("1.0", "antcloud.duanka.ir.brand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
