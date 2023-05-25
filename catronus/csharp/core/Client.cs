// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.CATRONUS.Models;

namespace AntChain.SDK.CATRONUS
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
                        {"sdk_version", "1.0.80"},
                        {"_prod_code", "CATRONUS"},
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
                        {"sdk_version", "1.0.80"},
                        {"_prod_code", "CATRONUS"},
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
         * Description: 创建风险工单/任务
         * Summary: 创建风险工单/任务
         */
        public CreateRiskTaskResponse CreateRiskTask(CreateRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 创建风险工单/任务
         * Summary: 创建风险工单/任务
         */
        public async Task<CreateRiskTaskResponse> CreateRiskTaskAsync(CreateRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建风险工单/任务
         * Summary: 创建风险工单/任务
         */
        public CreateRiskTaskResponse CreateRiskTaskEx(CreateRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建风险工单/任务
         * Summary: 创建风险工单/任务
         */
        public async Task<CreateRiskTaskResponse> CreateRiskTaskExAsync(CreateRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险任务列表
         * Summary: 查询风险任务列表
         */
        public QueryRiskTasksResponse QueryRiskTasks(QueryRiskTasksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskTasksEx(request, headers, runtime);
        }

        /**
         * Description: 查询风险任务列表
         * Summary: 查询风险任务列表
         */
        public async Task<QueryRiskTasksResponse> QueryRiskTasksAsync(QueryRiskTasksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskTasksExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询风险任务列表
         * Summary: 查询风险任务列表
         */
        public QueryRiskTasksResponse QueryRiskTasksEx(QueryRiskTasksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskTasksResponse>(DoRequest("1.0", "antcloud.catronus.risk.tasks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险任务列表
         * Summary: 查询风险任务列表
         */
        public async Task<QueryRiskTasksResponse> QueryRiskTasksExAsync(QueryRiskTasksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskTasksResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.tasks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险更单详情
         * Summary: 获取风险更单详情
         */
        public GetRiskTaskResponse GetRiskTask(GetRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 获取风险更单详情
         * Summary: 获取风险更单详情
         */
        public async Task<GetRiskTaskResponse> GetRiskTaskAsync(GetRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取风险更单详情
         * Summary: 获取风险更单详情
         */
        public GetRiskTaskResponse GetRiskTaskEx(GetRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险更单详情
         * Summary: 获取风险更单详情
         */
        public async Task<GetRiskTaskResponse> GetRiskTaskExAsync(GetRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
         * Summary: 更新风险工单
         */
        public UpdateRiskTaskResponse UpdateRiskTask(UpdateRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
         * Summary: 更新风险工单
         */
        public async Task<UpdateRiskTaskResponse> UpdateRiskTaskAsync(UpdateRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
         * Summary: 更新风险工单
         */
        public UpdateRiskTaskResponse UpdateRiskTaskEx(UpdateRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
         * Summary: 更新风险工单
         */
        public async Task<UpdateRiskTaskResponse> UpdateRiskTaskExAsync(UpdateRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单
         * Summary: 确认风险工单
         */
        public ConfirmRiskTaskResponse ConfirmRiskTask(ConfirmRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单
         * Summary: 确认风险工单
         */
        public async Task<ConfirmRiskTaskResponse> ConfirmRiskTaskAsync(ConfirmRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单
         * Summary: 确认风险工单
         */
        public ConfirmRiskTaskResponse ConfirmRiskTaskEx(ConfirmRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单
         * Summary: 确认风险工单
         */
        public async Task<ConfirmRiskTaskResponse> ConfirmRiskTaskExAsync(ConfirmRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销风险工单
         * Summary: 撤销风险工单
         */
        public CancelRiskTaskResponse CancelRiskTask(CancelRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 撤销风险工单
         * Summary: 撤销风险工单
         */
        public async Task<CancelRiskTaskResponse> CancelRiskTaskAsync(CancelRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销风险工单
         * Summary: 撤销风险工单
         */
        public CancelRiskTaskResponse CancelRiskTaskEx(CancelRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销风险工单
         * Summary: 撤销风险工单
         */
        public async Task<CancelRiskTaskResponse> CancelRiskTaskExAsync(CancelRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驳回风险工单
         * Summary: 驳回风险工单
         */
        public RefuseRiskTaskResponse RefuseRiskTask(RefuseRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 驳回风险工单
         * Summary: 驳回风险工单
         */
        public async Task<RefuseRiskTaskResponse> RefuseRiskTaskAsync(RefuseRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 驳回风险工单
         * Summary: 驳回风险工单
         */
        public RefuseRiskTaskResponse RefuseRiskTaskEx(RefuseRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驳回风险工单
         * Summary: 驳回风险工单
         */
        public async Task<RefuseRiskTaskResponse> RefuseRiskTaskExAsync(RefuseRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单修复
         * Summary: 确认风险工单修复
         */
        public VerifyRiskTaskResponse VerifyRiskTask(VerifyRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单修复
         * Summary: 确认风险工单修复
         */
        public async Task<VerifyRiskTaskResponse> VerifyRiskTaskAsync(VerifyRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单修复
         * Summary: 确认风险工单修复
         */
        public VerifyRiskTaskResponse VerifyRiskTaskEx(VerifyRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单修复
         * Summary: 确认风险工单修复
         */
        public async Task<VerifyRiskTaskResponse> VerifyRiskTaskExAsync(VerifyRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转派工单负责人
         * Summary: 转派工单负责人
         */
        public SendRiskTaskResponse SendRiskTask(SendRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 转派工单负责人
         * Summary: 转派工单负责人
         */
        public async Task<SendRiskTaskResponse> SendRiskTaskAsync(SendRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 转派工单负责人
         * Summary: 转派工单负责人
         */
        public SendRiskTaskResponse SendRiskTaskEx(SendRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转派工单负责人
         * Summary: 转派工单负责人
         */
        public async Task<SendRiskTaskResponse> SendRiskTaskExAsync(SendRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单修复，待安全Owner确认
         * Summary: 确认风险工单修复
         */
        public CloseRiskTaskResponse CloseRiskTask(CloseRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单修复，待安全Owner确认
         * Summary: 确认风险工单修复
         */
        public async Task<CloseRiskTaskResponse> CloseRiskTaskAsync(CloseRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认风险工单修复，待安全Owner确认
         * Summary: 确认风险工单修复
         */
        public CloseRiskTaskResponse CloseRiskTaskEx(CloseRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认风险工单修复，待安全Owner确认
         * Summary: 确认风险工单修复
         */
        public async Task<CloseRiskTaskResponse> CloseRiskTaskExAsync(CloseRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取个人风险项统计
         * Summary: 获取个人风险项统计
         */
        public GetRiskStatisticsResponse GetRiskStatistics(GetRiskStatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRiskStatisticsEx(request, headers, runtime);
        }

        /**
         * Description: 获取个人风险项统计
         * Summary: 获取个人风险项统计
         */
        public async Task<GetRiskStatisticsResponse> GetRiskStatisticsAsync(GetRiskStatisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRiskStatisticsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取个人风险项统计
         * Summary: 获取个人风险项统计
         */
        public GetRiskStatisticsResponse GetRiskStatisticsEx(GetRiskStatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskStatisticsResponse>(DoRequest("1.0", "antcloud.catronus.risk.statistics.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取个人风险项统计
         * Summary: 获取个人风险项统计
         */
        public async Task<GetRiskStatisticsResponse> GetRiskStatisticsExAsync(GetRiskStatisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskStatisticsResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.statistics.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险日志审计
         * Summary: 查询风险日志审计
         */
        public QueryRiskAuditsResponse QueryRiskAudits(QueryRiskAuditsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskAuditsEx(request, headers, runtime);
        }

        /**
         * Description: 查询风险日志审计
         * Summary: 查询风险日志审计
         */
        public async Task<QueryRiskAuditsResponse> QueryRiskAuditsAsync(QueryRiskAuditsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskAuditsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询风险日志审计
         * Summary: 查询风险日志审计
         */
        public QueryRiskAuditsResponse QueryRiskAuditsEx(QueryRiskAuditsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskAuditsResponse>(DoRequest("1.0", "antcloud.catronus.risk.audits.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险日志审计
         * Summary: 查询风险日志审计
         */
        public async Task<QueryRiskAuditsResponse> QueryRiskAuditsExAsync(QueryRiskAuditsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskAuditsResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.audits.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建风险解决方案
         * Summary: 创建风险解决方案
         */
        public CreateRiskSolutionResponse CreateRiskSolution(CreateRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRiskSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 创建风险解决方案
         * Summary: 创建风险解决方案
         */
        public async Task<CreateRiskSolutionResponse> CreateRiskSolutionAsync(CreateRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRiskSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建风险解决方案
         * Summary: 创建风险解决方案
         */
        public CreateRiskSolutionResponse CreateRiskSolutionEx(CreateRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRiskSolutionResponse>(DoRequest("1.0", "antcloud.catronus.risk.solution.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建风险解决方案
         * Summary: 创建风险解决方案
         */
        public async Task<CreateRiskSolutionResponse> CreateRiskSolutionExAsync(CreateRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRiskSolutionResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.solution.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险解决方案列表
         * Summary: 查询风险解决方案
         */
        public QueryRiskSolutionsResponse QueryRiskSolutions(QueryRiskSolutionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskSolutionsEx(request, headers, runtime);
        }

        /**
         * Description: 查询风险解决方案列表
         * Summary: 查询风险解决方案
         */
        public async Task<QueryRiskSolutionsResponse> QueryRiskSolutionsAsync(QueryRiskSolutionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskSolutionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询风险解决方案列表
         * Summary: 查询风险解决方案
         */
        public QueryRiskSolutionsResponse QueryRiskSolutionsEx(QueryRiskSolutionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskSolutionsResponse>(DoRequest("1.0", "antcloud.catronus.risk.solutions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询风险解决方案列表
         * Summary: 查询风险解决方案
         */
        public async Task<QueryRiskSolutionsResponse> QueryRiskSolutionsExAsync(QueryRiskSolutionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskSolutionsResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.solutions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险解决方案详情
         * Summary: 获取风险解决方案
         */
        public GetRiskSolutionResponse GetRiskSolution(GetRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRiskSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 获取风险解决方案详情
         * Summary: 获取风险解决方案
         */
        public async Task<GetRiskSolutionResponse> GetRiskSolutionAsync(GetRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRiskSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取风险解决方案详情
         * Summary: 获取风险解决方案
         */
        public GetRiskSolutionResponse GetRiskSolutionEx(GetRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskSolutionResponse>(DoRequest("1.0", "antcloud.catronus.risk.solution.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取风险解决方案详情
         * Summary: 获取风险解决方案
         */
        public async Task<GetRiskSolutionResponse> GetRiskSolutionExAsync(GetRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRiskSolutionResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.solution.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新风险解决方案
         * Summary: 更新风险解决方案
         */
        public UpdateRiskSolutionResponse UpdateRiskSolution(UpdateRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRiskSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 更新风险解决方案
         * Summary: 更新风险解决方案
         */
        public async Task<UpdateRiskSolutionResponse> UpdateRiskSolutionAsync(UpdateRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRiskSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新风险解决方案
         * Summary: 更新风险解决方案
         */
        public UpdateRiskSolutionResponse UpdateRiskSolutionEx(UpdateRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRiskSolutionResponse>(DoRequest("1.0", "antcloud.catronus.risk.solution.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新风险解决方案
         * Summary: 更新风险解决方案
         */
        public async Task<UpdateRiskSolutionResponse> UpdateRiskSolutionExAsync(UpdateRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRiskSolutionResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.solution.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除风险解决方案
         * Summary: 删除风险解决方案
         */
        public DeleteRiskSolutionResponse DeleteRiskSolution(DeleteRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRiskSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 删除风险解决方案
         * Summary: 删除风险解决方案
         */
        public async Task<DeleteRiskSolutionResponse> DeleteRiskSolutionAsync(DeleteRiskSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRiskSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除风险解决方案
         * Summary: 删除风险解决方案
         */
        public DeleteRiskSolutionResponse DeleteRiskSolutionEx(DeleteRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRiskSolutionResponse>(DoRequest("1.0", "antcloud.catronus.risk.solution.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除风险解决方案
         * Summary: 删除风险解决方案
         */
        public async Task<DeleteRiskSolutionResponse> DeleteRiskSolutionExAsync(DeleteRiskSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRiskSolutionResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.solution.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纳管目标k8s集群
         * Summary: 导入（纳管）集群
         */
        public ImportClusterResponse ImportCluster(ImportClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportClusterEx(request, headers, runtime);
        }

        /**
         * Description: 纳管目标k8s集群
         * Summary: 导入（纳管）集群
         */
        public async Task<ImportClusterResponse> ImportClusterAsync(ImportClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 纳管目标k8s集群
         * Summary: 导入（纳管）集群
         */
        public ImportClusterResponse ImportClusterEx(ImportClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportClusterResponse>(DoRequest("1.0", "antcloud.catronus.cluster.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纳管目标k8s集群
         * Summary: 导入（纳管）集群
         */
        public async Task<ImportClusterResponse> ImportClusterExAsync(ImportClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportClusterResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动新增集群
         * Summary: 手动新增集群
         */
        public AddClusterResponse AddCluster(AddClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddClusterEx(request, headers, runtime);
        }

        /**
         * Description: 手动新增集群
         * Summary: 手动新增集群
         */
        public async Task<AddClusterResponse> AddClusterAsync(AddClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动新增集群
         * Summary: 手动新增集群
         */
        public AddClusterResponse AddClusterEx(AddClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddClusterResponse>(DoRequest("1.0", "antcloud.catronus.cluster.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动新增集群
         * Summary: 手动新增集群
         */
        public async Task<AddClusterResponse> AddClusterExAsync(AddClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddClusterResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群
         * Summary: 查询集群
         */
        public QueryClusterResponse QueryCluster(QueryClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群
         * Summary: 查询集群
         */
        public async Task<QueryClusterResponse> QueryClusterAsync(QueryClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群
         * Summary: 查询集群
         */
        public QueryClusterResponse QueryClusterEx(QueryClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterResponse>(DoRequest("1.0", "antcloud.catronus.cluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群
         * Summary: 查询集群
         */
        public async Task<QueryClusterResponse> QueryClusterExAsync(QueryClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群namespace
         * Summary: 查询集群namespace
         */
        public QueryClusterNamespaceResponse QueryClusterNamespace(QueryClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群namespace
         * Summary: 查询集群namespace
         */
        public async Task<QueryClusterNamespaceResponse> QueryClusterNamespaceAsync(QueryClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群namespace
         * Summary: 查询集群namespace
         */
        public QueryClusterNamespaceResponse QueryClusterNamespaceEx(QueryClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterNamespaceResponse>(DoRequest("1.0", "antcloud.catronus.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群namespace
         * Summary: 查询集群namespace
         */
        public async Task<QueryClusterNamespaceResponse> QueryClusterNamespaceExAsync(QueryClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解绑集群
         * Summary: 解绑集群
         */
        public ReclaimClusterResponse ReclaimCluster(ReclaimClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReclaimClusterEx(request, headers, runtime);
        }

        /**
         * Description: 解绑集群
         * Summary: 解绑集群
         */
        public async Task<ReclaimClusterResponse> ReclaimClusterAsync(ReclaimClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReclaimClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 解绑集群
         * Summary: 解绑集群
         */
        public ReclaimClusterResponse ReclaimClusterEx(ReclaimClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimClusterResponse>(DoRequest("1.0", "antcloud.catronus.cluster.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解绑集群
         * Summary: 解绑集群
         */
        public async Task<ReclaimClusterResponse> ReclaimClusterExAsync(ReclaimClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimClusterResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群安全简报列表
         * Summary: 获取集群安全简报列表
         */
        public QueryClusterBriefResponse QueryClusterBrief(QueryClusterBriefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterBriefEx(request, headers, runtime);
        }

        /**
         * Description: 获取集群安全简报列表
         * Summary: 获取集群安全简报列表
         */
        public async Task<QueryClusterBriefResponse> QueryClusterBriefAsync(QueryClusterBriefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterBriefExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取集群安全简报列表
         * Summary: 获取集群安全简报列表
         */
        public QueryClusterBriefResponse QueryClusterBriefEx(QueryClusterBriefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterBriefResponse>(DoRequest("1.0", "antcloud.catronus.cluster.brief.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群安全简报列表
         * Summary: 获取集群安全简报列表
         */
        public async Task<QueryClusterBriefResponse> QueryClusterBriefExAsync(QueryClusterBriefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterBriefResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.brief.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取默认策略
         * Summary: 获取默认策略
         */
        public GetStrategyDefaultResponse GetStrategyDefault(GetStrategyDefaultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetStrategyDefaultEx(request, headers, runtime);
        }

        /**
         * Description: 获取默认策略
         * Summary: 获取默认策略
         */
        public async Task<GetStrategyDefaultResponse> GetStrategyDefaultAsync(GetStrategyDefaultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetStrategyDefaultExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取默认策略
         * Summary: 获取默认策略
         */
        public GetStrategyDefaultResponse GetStrategyDefaultEx(GetStrategyDefaultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStrategyDefaultResponse>(DoRequest("1.0", "antcloud.catronus.strategy.default.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取默认策略
         * Summary: 获取默认策略
         */
        public async Task<GetStrategyDefaultResponse> GetStrategyDefaultExAsync(GetStrategyDefaultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStrategyDefaultResponse>(await DoRequestAsync("1.0", "antcloud.catronus.strategy.default.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置安全策略
         * Summary: 设置安全策略
         */
        public AddStrategyResponse AddStrategy(AddStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 设置安全策略
         * Summary: 设置安全策略
         */
        public async Task<AddStrategyResponse> AddStrategyAsync(AddStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置安全策略
         * Summary: 设置安全策略
         */
        public AddStrategyResponse AddStrategyEx(AddStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddStrategyResponse>(DoRequest("1.0", "antcloud.catronus.strategy.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置安全策略
         * Summary: 设置安全策略
         */
        public async Task<AddStrategyResponse> AddStrategyExAsync(AddStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddStrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.strategy.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定集群
         * Summary: 绑定集群
         */
        public BindStrategyResponse BindStrategy(BindStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 绑定集群
         * Summary: 绑定集群
         */
        public async Task<BindStrategyResponse> BindStrategyAsync(BindStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定集群
         * Summary: 绑定集群
         */
        public BindStrategyResponse BindStrategyEx(BindStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindStrategyResponse>(DoRequest("1.0", "antcloud.catronus.strategy.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定集群
         * Summary: 绑定集群
         */
        public async Task<BindStrategyResponse> BindStrategyExAsync(BindStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindStrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.strategy.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险列表
         * Summary: 风险列表
         */
        public QueryRisksResponse QueryRisks(QueryRisksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRisksEx(request, headers, runtime);
        }

        /**
         * Description: 风险列表
         * Summary: 风险列表
         */
        public async Task<QueryRisksResponse> QueryRisksAsync(QueryRisksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRisksExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险列表
         * Summary: 风险列表
         */
        public QueryRisksResponse QueryRisksEx(QueryRisksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRisksResponse>(DoRequest("1.0", "antcloud.catronus.risks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险列表
         * Summary: 风险列表
         */
        public async Task<QueryRisksResponse> QueryRisksExAsync(QueryRisksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRisksResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新策略
         * Summary: 更新策略
         */
        public UpdateStrategyResponse UpdateStrategy(UpdateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 更新策略
         * Summary: 更新策略
         */
        public async Task<UpdateStrategyResponse> UpdateStrategyAsync(UpdateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新策略
         * Summary: 更新策略
         */
        public UpdateStrategyResponse UpdateStrategyEx(UpdateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStrategyResponse>(DoRequest("1.0", "antcloud.catronus.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新策略
         * Summary: 更新策略
         */
        public async Task<UpdateStrategyResponse> UpdateStrategyExAsync(UpdateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉策略列表
         * Summary: 拉策略列表
         */
        public QueryStrategyResponse QueryStrategy(QueryStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 拉策略列表
         * Summary: 拉策略列表
         */
        public async Task<QueryStrategyResponse> QueryStrategyAsync(QueryStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 拉策略列表
         * Summary: 拉策略列表
         */
        public QueryStrategyResponse QueryStrategyEx(QueryStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStrategyResponse>(DoRequest("1.0", "antcloud.catronus.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉策略列表
         * Summary: 拉策略列表
         */
        public async Task<QueryStrategyResponse> QueryStrategyExAsync(QueryStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险任务延期
         * Summary: 风险任务延期
         */
        public ScaleRiskTaskResponse ScaleRiskTask(ScaleRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleRiskTaskEx(request, headers, runtime);
        }

        /**
         * Description: 风险任务延期
         * Summary: 风险任务延期
         */
        public async Task<ScaleRiskTaskResponse> ScaleRiskTaskAsync(ScaleRiskTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleRiskTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险任务延期
         * Summary: 风险任务延期
         */
        public ScaleRiskTaskResponse ScaleRiskTaskEx(ScaleRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleRiskTaskResponse>(DoRequest("1.0", "antcloud.catronus.risk.task.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险任务延期
         * Summary: 风险任务延期
         */
        public async Task<ScaleRiskTaskResponse> ScaleRiskTaskExAsync(ScaleRiskTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleRiskTaskResponse>(await DoRequestAsync("1.0", "antcloud.catronus.risk.task.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群镜像列表
         * Summary: 查询集群镜像列表
         */
        public ListClusterImagesResponse ListClusterImages(ListClusterImagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterImagesEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群镜像列表
         * Summary: 查询集群镜像列表
         */
        public async Task<ListClusterImagesResponse> ListClusterImagesAsync(ListClusterImagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterImagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群镜像列表
         * Summary: 查询集群镜像列表
         */
        public ListClusterImagesResponse ListClusterImagesEx(ListClusterImagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterImagesResponse>(DoRequest("1.0", "antcloud.catronus.cluster.images.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群镜像列表
         * Summary: 查询集群镜像列表
         */
        public async Task<ListClusterImagesResponse> ListClusterImagesExAsync(ListClusterImagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterImagesResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.images.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动触发快速扫描
         * Summary: 主动触发快速扫描
         */
        public StartClusterQuickscanResponse StartClusterQuickscan(StartClusterQuickscanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartClusterQuickscanEx(request, headers, runtime);
        }

        /**
         * Description: 主动触发快速扫描
         * Summary: 主动触发快速扫描
         */
        public async Task<StartClusterQuickscanResponse> StartClusterQuickscanAsync(StartClusterQuickscanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartClusterQuickscanExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动触发快速扫描
         * Summary: 主动触发快速扫描
         */
        public StartClusterQuickscanResponse StartClusterQuickscanEx(StartClusterQuickscanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartClusterQuickscanResponse>(DoRequest("1.0", "antcloud.catronus.cluster.quickscan.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动触发快速扫描
         * Summary: 主动触发快速扫描
         */
        public async Task<StartClusterQuickscanResponse> StartClusterQuickscanExAsync(StartClusterQuickscanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartClusterQuickscanResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.quickscan.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询扫描结果
         * Summary: 查询扫描结果
         */
        public QueryClusterScanResponse QueryClusterScan(QueryClusterScanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterScanEx(request, headers, runtime);
        }

        /**
         * Description: 查询扫描结果
         * Summary: 查询扫描结果
         */
        public async Task<QueryClusterScanResponse> QueryClusterScanAsync(QueryClusterScanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterScanExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询扫描结果
         * Summary: 查询扫描结果
         */
        public QueryClusterScanResponse QueryClusterScanEx(QueryClusterScanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterScanResponse>(DoRequest("1.0", "antcloud.catronus.cluster.scan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询扫描结果
         * Summary: 查询扫描结果
         */
        public async Task<QueryClusterScanResponse> QueryClusterScanExAsync(QueryClusterScanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterScanResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.scan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建运行时策略
         * Summary: 创建运行时策略
         */
        public CreateRuntimePolicyResponse CreateRuntimePolicy(CreateRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRuntimePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 创建运行时策略
         * Summary: 创建运行时策略
         */
        public async Task<CreateRuntimePolicyResponse> CreateRuntimePolicyAsync(CreateRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRuntimePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建运行时策略
         * Summary: 创建运行时策略
         */
        public CreateRuntimePolicyResponse CreateRuntimePolicyEx(CreateRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRuntimePolicyResponse>(DoRequest("1.0", "antcloud.catronus.runtime.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建运行时策略
         * Summary: 创建运行时策略
         */
        public async Task<CreateRuntimePolicyResponse> CreateRuntimePolicyExAsync(CreateRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRuntimePolicyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtime.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询运行时策略列表
         * Summary: 查询运行时策略列表
         */
        public ListRuntimePoliciesResponse ListRuntimePolicies(ListRuntimePoliciesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRuntimePoliciesEx(request, headers, runtime);
        }

        /**
         * Description: 查询运行时策略列表
         * Summary: 查询运行时策略列表
         */
        public async Task<ListRuntimePoliciesResponse> ListRuntimePoliciesAsync(ListRuntimePoliciesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRuntimePoliciesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询运行时策略列表
         * Summary: 查询运行时策略列表
         */
        public ListRuntimePoliciesResponse ListRuntimePoliciesEx(ListRuntimePoliciesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimePoliciesResponse>(DoRequest("1.0", "antcloud.catronus.runtime.policies.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询运行时策略列表
         * Summary: 查询运行时策略列表
         */
        public async Task<ListRuntimePoliciesResponse> ListRuntimePoliciesExAsync(ListRuntimePoliciesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimePoliciesResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtime.policies.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新运行时策略
         * Summary: 更新运行时策略
         */
        public UpdateRuntimePolicyResponse UpdateRuntimePolicy(UpdateRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRuntimePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 更新运行时策略
         * Summary: 更新运行时策略
         */
        public async Task<UpdateRuntimePolicyResponse> UpdateRuntimePolicyAsync(UpdateRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRuntimePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新运行时策略
         * Summary: 更新运行时策略
         */
        public UpdateRuntimePolicyResponse UpdateRuntimePolicyEx(UpdateRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRuntimePolicyResponse>(DoRequest("1.0", "antcloud.catronus.runtime.policy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新运行时策略
         * Summary: 更新运行时策略
         */
        public async Task<UpdateRuntimePolicyResponse> UpdateRuntimePolicyExAsync(UpdateRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRuntimePolicyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtime.policy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除运行时策略
         * Summary: 删除运行时策略
         */
        public DeleteRuntimePolicyResponse DeleteRuntimePolicy(DeleteRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRuntimePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 删除运行时策略
         * Summary: 删除运行时策略
         */
        public async Task<DeleteRuntimePolicyResponse> DeleteRuntimePolicyAsync(DeleteRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRuntimePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除运行时策略
         * Summary: 删除运行时策略
         */
        public DeleteRuntimePolicyResponse DeleteRuntimePolicyEx(DeleteRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRuntimePolicyResponse>(DoRequest("1.0", "antcloud.catronus.runtime.policy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除运行时策略
         * Summary: 删除运行时策略
         */
        public async Task<DeleteRuntimePolicyResponse> DeleteRuntimePolicyExAsync(DeleteRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRuntimePolicyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtime.policy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略目标Pods
         * Summary: 获取运行时策略Pods
         */
        public ListRuntimepolicyPodsResponse ListRuntimepolicyPods(ListRuntimepolicyPodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRuntimepolicyPodsEx(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略目标Pods
         * Summary: 获取运行时策略Pods
         */
        public async Task<ListRuntimepolicyPodsResponse> ListRuntimepolicyPodsAsync(ListRuntimepolicyPodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRuntimepolicyPodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略目标Pods
         * Summary: 获取运行时策略Pods
         */
        public ListRuntimepolicyPodsResponse ListRuntimepolicyPodsEx(ListRuntimepolicyPodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimepolicyPodsResponse>(DoRequest("1.0", "antcloud.catronus.runtimepolicy.pods.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略目标Pods
         * Summary: 获取运行时策略Pods
         */
        public async Task<ListRuntimepolicyPodsResponse> ListRuntimepolicyPodsExAsync(ListRuntimepolicyPodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimepolicyPodsResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtimepolicy.pods.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略Nodes
         * Summary: 获取运行时策略Nodes
         */
        public ListRuntimepolicyNodesResponse ListRuntimepolicyNodes(ListRuntimepolicyNodesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRuntimepolicyNodesEx(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略Nodes
         * Summary: 获取运行时策略Nodes
         */
        public async Task<ListRuntimepolicyNodesResponse> ListRuntimepolicyNodesAsync(ListRuntimepolicyNodesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRuntimepolicyNodesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略Nodes
         * Summary: 获取运行时策略Nodes
         */
        public ListRuntimepolicyNodesResponse ListRuntimepolicyNodesEx(ListRuntimepolicyNodesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimepolicyNodesResponse>(DoRequest("1.0", "antcloud.catronus.runtimepolicy.nodes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略Nodes
         * Summary: 获取运行时策略Nodes
         */
        public async Task<ListRuntimepolicyNodesResponse> ListRuntimepolicyNodesExAsync(ListRuntimepolicyNodesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRuntimepolicyNodesResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtimepolicy.nodes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略详情
         * Summary: 获取运行时策略详情
         */
        public GetRuntimePolicyResponse GetRuntimePolicy(GetRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRuntimePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略详情
         * Summary: 获取运行时策略详情
         */
        public async Task<GetRuntimePolicyResponse> GetRuntimePolicyAsync(GetRuntimePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRuntimePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取运行时策略详情
         * Summary: 获取运行时策略详情
         */
        public GetRuntimePolicyResponse GetRuntimePolicyEx(GetRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRuntimePolicyResponse>(DoRequest("1.0", "antcloud.catronus.runtime.policy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取运行时策略详情
         * Summary: 获取运行时策略详情
         */
        public async Task<GetRuntimePolicyResponse> GetRuntimePolicyExAsync(GetRuntimePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRuntimePolicyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.runtime.policy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基线扫描结果查询
         * Summary: 基线扫描结果查询
         */
        public QueryClusterBaselineResponse QueryClusterBaseline(QueryClusterBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterBaselineEx(request, headers, runtime);
        }

        /**
         * Description: 基线扫描结果查询
         * Summary: 基线扫描结果查询
         */
        public async Task<QueryClusterBaselineResponse> QueryClusterBaselineAsync(QueryClusterBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterBaselineExAsync(request, headers, runtime);
        }

        /**
         * Description: 基线扫描结果查询
         * Summary: 基线扫描结果查询
         */
        public QueryClusterBaselineResponse QueryClusterBaselineEx(QueryClusterBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterBaselineResponse>(DoRequest("1.0", "antcloud.catronus.cluster.baseline.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基线扫描结果查询
         * Summary: 基线扫描结果查询
         */
        public async Task<QueryClusterBaselineResponse> QueryClusterBaselineExAsync(QueryClusterBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterBaselineResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.baseline.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交镜像扫描触发任务
         * Summary: 提交镜像扫描触发任务
         */
        public SubmitImagesReposcanResponse SubmitImagesReposcan(SubmitImagesReposcanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitImagesReposcanEx(request, headers, runtime);
        }

        /**
         * Description: 提交镜像扫描触发任务
         * Summary: 提交镜像扫描触发任务
         */
        public async Task<SubmitImagesReposcanResponse> SubmitImagesReposcanAsync(SubmitImagesReposcanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitImagesReposcanExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交镜像扫描触发任务
         * Summary: 提交镜像扫描触发任务
         */
        public SubmitImagesReposcanResponse SubmitImagesReposcanEx(SubmitImagesReposcanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitImagesReposcanResponse>(DoRequest("1.0", "antcloud.catronus.images.reposcan.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交镜像扫描触发任务
         * Summary: 提交镜像扫描触发任务
         */
        public async Task<SubmitImagesReposcanResponse> SubmitImagesReposcanExAsync(SubmitImagesReposcanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitImagesReposcanResponse>(await DoRequestAsync("1.0", "antcloud.catronus.images.reposcan.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建镜像仓库
         * Summary: 创建镜像仓库
         */
        public CreateImageRepoResponse CreateImageRepo(CreateImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateImageRepoEx(request, headers, runtime);
        }

        /**
         * Description: 创建镜像仓库
         * Summary: 创建镜像仓库
         */
        public async Task<CreateImageRepoResponse> CreateImageRepoAsync(CreateImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateImageRepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建镜像仓库
         * Summary: 创建镜像仓库
         */
        public CreateImageRepoResponse CreateImageRepoEx(CreateImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImageRepoResponse>(DoRequest("1.0", "antcloud.catronus.image.repo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建镜像仓库
         * Summary: 创建镜像仓库
         */
        public async Task<CreateImageRepoResponse> CreateImageRepoExAsync(CreateImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImageRepoResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询镜像仓库列表
         * Summary: 查询镜像仓库列表
         */
        public QueryImageReposResponse QueryImageRepos(QueryImageReposRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImageReposEx(request, headers, runtime);
        }

        /**
         * Description: 查询镜像仓库列表
         * Summary: 查询镜像仓库列表
         */
        public async Task<QueryImageReposResponse> QueryImageReposAsync(QueryImageReposRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImageReposExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询镜像仓库列表
         * Summary: 查询镜像仓库列表
         */
        public QueryImageReposResponse QueryImageReposEx(QueryImageReposRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageReposResponse>(DoRequest("1.0", "antcloud.catronus.image.repos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询镜像仓库列表
         * Summary: 查询镜像仓库列表
         */
        public async Task<QueryImageReposResponse> QueryImageReposExAsync(QueryImageReposRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageReposResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除镜像仓库
         * Summary: 删除镜像仓库
         */
        public DeleteImageRepoResponse DeleteImageRepo(DeleteImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteImageRepoEx(request, headers, runtime);
        }

        /**
         * Description: 删除镜像仓库
         * Summary: 删除镜像仓库
         */
        public async Task<DeleteImageRepoResponse> DeleteImageRepoAsync(DeleteImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteImageRepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除镜像仓库
         * Summary: 删除镜像仓库
         */
        public DeleteImageRepoResponse DeleteImageRepoEx(DeleteImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageRepoResponse>(DoRequest("1.0", "antcloud.catronus.image.repo.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除镜像仓库
         * Summary: 删除镜像仓库
         */
        public async Task<DeleteImageRepoResponse> DeleteImageRepoExAsync(DeleteImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageRepoResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repo.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取镜像漏洞详情地址
         * Summary: 获取镜像漏洞详情地址
         */
        public GetImageRiskdetailurlResponse GetImageRiskdetailurl(GetImageRiskdetailurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetImageRiskdetailurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取镜像漏洞详情地址
         * Summary: 获取镜像漏洞详情地址
         */
        public async Task<GetImageRiskdetailurlResponse> GetImageRiskdetailurlAsync(GetImageRiskdetailurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetImageRiskdetailurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取镜像漏洞详情地址
         * Summary: 获取镜像漏洞详情地址
         */
        public GetImageRiskdetailurlResponse GetImageRiskdetailurlEx(GetImageRiskdetailurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageRiskdetailurlResponse>(DoRequest("1.0", "antcloud.catronus.image.riskdetailurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取镜像漏洞详情地址
         * Summary: 获取镜像漏洞详情地址
         */
        public async Task<GetImageRiskdetailurlResponse> GetImageRiskdetailurlExAsync(GetImageRiskdetailurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageRiskdetailurlResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.riskdetailurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建镜像仓库扫描策略
         * Summary: 创建镜像仓库扫描策略
         */
        public CreateImageReposcanstrategyResponse CreateImageReposcanstrategy(CreateImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateImageReposcanstrategyEx(request, headers, runtime);
        }

        /**
         * Description: 创建镜像仓库扫描策略
         * Summary: 创建镜像仓库扫描策略
         */
        public async Task<CreateImageReposcanstrategyResponse> CreateImageReposcanstrategyAsync(CreateImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateImageReposcanstrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建镜像仓库扫描策略
         * Summary: 创建镜像仓库扫描策略
         */
        public CreateImageReposcanstrategyResponse CreateImageReposcanstrategyEx(CreateImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImageReposcanstrategyResponse>(DoRequest("1.0", "antcloud.catronus.image.reposcanstrategy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建镜像仓库扫描策略
         * Summary: 创建镜像仓库扫描策略
         */
        public async Task<CreateImageReposcanstrategyResponse> CreateImageReposcanstrategyExAsync(CreateImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImageReposcanstrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.reposcanstrategy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库项目列表
         * Summary: 查询仓库项目列表
         */
        public QueryImagerepoProjectsResponse QueryImagerepoProjects(QueryImagerepoProjectsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImagerepoProjectsEx(request, headers, runtime);
        }

        /**
         * Description: 查询仓库项目列表
         * Summary: 查询仓库项目列表
         */
        public async Task<QueryImagerepoProjectsResponse> QueryImagerepoProjectsAsync(QueryImagerepoProjectsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImagerepoProjectsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询仓库项目列表
         * Summary: 查询仓库项目列表
         */
        public QueryImagerepoProjectsResponse QueryImagerepoProjectsEx(QueryImagerepoProjectsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImagerepoProjectsResponse>(DoRequest("1.0", "antcloud.catronus.imagerepo.projects.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库项目列表
         * Summary: 查询仓库项目列表
         */
        public async Task<QueryImagerepoProjectsResponse> QueryImagerepoProjectsExAsync(QueryImagerepoProjectsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImagerepoProjectsResponse>(await DoRequestAsync("1.0", "antcloud.catronus.imagerepo.projects.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库列表
         * Summary: 查询仓库列表
         */
        public QueryImagerepoRepositoriesResponse QueryImagerepoRepositories(QueryImagerepoRepositoriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImagerepoRepositoriesEx(request, headers, runtime);
        }

        /**
         * Description: 查询仓库列表
         * Summary: 查询仓库列表
         */
        public async Task<QueryImagerepoRepositoriesResponse> QueryImagerepoRepositoriesAsync(QueryImagerepoRepositoriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImagerepoRepositoriesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询仓库列表
         * Summary: 查询仓库列表
         */
        public QueryImagerepoRepositoriesResponse QueryImagerepoRepositoriesEx(QueryImagerepoRepositoriesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImagerepoRepositoriesResponse>(DoRequest("1.0", "antcloud.catronus.imagerepo.repositories.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库列表
         * Summary: 查询仓库列表
         */
        public async Task<QueryImagerepoRepositoriesResponse> QueryImagerepoRepositoriesExAsync(QueryImagerepoRepositoriesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImagerepoRepositoriesResponse>(await DoRequestAsync("1.0", "antcloud.catronus.imagerepo.repositories.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新镜像仓库
         * Summary: 更新镜像仓库
         */
        public UpdateImageRepoResponse UpdateImageRepo(UpdateImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateImageRepoEx(request, headers, runtime);
        }

        /**
         * Description: 更新镜像仓库
         * Summary: 更新镜像仓库
         */
        public async Task<UpdateImageRepoResponse> UpdateImageRepoAsync(UpdateImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateImageRepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新镜像仓库
         * Summary: 更新镜像仓库
         */
        public UpdateImageRepoResponse UpdateImageRepoEx(UpdateImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageRepoResponse>(DoRequest("1.0", "antcloud.catronus.image.repo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新镜像仓库
         * Summary: 更新镜像仓库
         */
        public async Task<UpdateImageRepoResponse> UpdateImageRepoExAsync(UpdateImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageRepoResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取镜像仓库详情
         * Summary: 获取镜像仓库详情
         */
        public GetImageRepoResponse GetImageRepo(GetImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetImageRepoEx(request, headers, runtime);
        }

        /**
         * Description: 获取镜像仓库详情
         * Summary: 获取镜像仓库详情
         */
        public async Task<GetImageRepoResponse> GetImageRepoAsync(GetImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetImageRepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取镜像仓库详情
         * Summary: 获取镜像仓库详情
         */
        public GetImageRepoResponse GetImageRepoEx(GetImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageRepoResponse>(DoRequest("1.0", "antcloud.catronus.image.repo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取镜像仓库详情
         * Summary: 获取镜像仓库详情
         */
        public async Task<GetImageRepoResponse> GetImageRepoExAsync(GetImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageRepoResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验仓库配置
         * Summary: 校验仓库配置
         */
        public VerifyImageRepoResponse VerifyImageRepo(VerifyImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyImageRepoEx(request, headers, runtime);
        }

        /**
         * Description: 校验仓库配置
         * Summary: 校验仓库配置
         */
        public async Task<VerifyImageRepoResponse> VerifyImageRepoAsync(VerifyImageRepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyImageRepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验仓库配置
         * Summary: 校验仓库配置
         */
        public VerifyImageRepoResponse VerifyImageRepoEx(VerifyImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyImageRepoResponse>(DoRequest("1.0", "antcloud.catronus.image.repo.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验仓库配置
         * Summary: 校验仓库配置
         */
        public async Task<VerifyImageRepoResponse> VerifyImageRepoExAsync(VerifyImageRepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyImageRepoResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.repo.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询镜像扫描策略
         * Summary: 查询镜像扫描策略
         */
        public QueryImageReposcanstrategiesResponse QueryImageReposcanstrategies(QueryImageReposcanstrategiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImageReposcanstrategiesEx(request, headers, runtime);
        }

        /**
         * Description: 查询镜像扫描策略
         * Summary: 查询镜像扫描策略
         */
        public async Task<QueryImageReposcanstrategiesResponse> QueryImageReposcanstrategiesAsync(QueryImageReposcanstrategiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImageReposcanstrategiesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询镜像扫描策略
         * Summary: 查询镜像扫描策略
         */
        public QueryImageReposcanstrategiesResponse QueryImageReposcanstrategiesEx(QueryImageReposcanstrategiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageReposcanstrategiesResponse>(DoRequest("1.0", "antcloud.catronus.image.reposcanstrategies.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询镜像扫描策略
         * Summary: 查询镜像扫描策略
         */
        public async Task<QueryImageReposcanstrategiesResponse> QueryImageReposcanstrategiesExAsync(QueryImageReposcanstrategiesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageReposcanstrategiesResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.reposcanstrategies.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除镜像扫描策略
         * Summary: 删除镜像扫描策略
         */
        public DeleteImageReposcanstrategyResponse DeleteImageReposcanstrategy(DeleteImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteImageReposcanstrategyEx(request, headers, runtime);
        }

        /**
         * Description: 删除镜像扫描策略
         * Summary: 删除镜像扫描策略
         */
        public async Task<DeleteImageReposcanstrategyResponse> DeleteImageReposcanstrategyAsync(DeleteImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteImageReposcanstrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除镜像扫描策略
         * Summary: 删除镜像扫描策略
         */
        public DeleteImageReposcanstrategyResponse DeleteImageReposcanstrategyEx(DeleteImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageReposcanstrategyResponse>(DoRequest("1.0", "antcloud.catronus.image.reposcanstrategy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除镜像扫描策略
         * Summary: 删除镜像扫描策略
         */
        public async Task<DeleteImageReposcanstrategyResponse> DeleteImageReposcanstrategyExAsync(DeleteImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageReposcanstrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.reposcanstrategy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新镜像仓库扫描策略
         * Summary: 更新镜像仓库扫描策略
         */
        public UpdateImageReposcanstrategyResponse UpdateImageReposcanstrategy(UpdateImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateImageReposcanstrategyEx(request, headers, runtime);
        }

        /**
         * Description: 更新镜像仓库扫描策略
         * Summary: 更新镜像仓库扫描策略
         */
        public async Task<UpdateImageReposcanstrategyResponse> UpdateImageReposcanstrategyAsync(UpdateImageReposcanstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateImageReposcanstrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新镜像仓库扫描策略
         * Summary: 更新镜像仓库扫描策略
         */
        public UpdateImageReposcanstrategyResponse UpdateImageReposcanstrategyEx(UpdateImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageReposcanstrategyResponse>(DoRequest("1.0", "antcloud.catronus.image.reposcanstrategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新镜像仓库扫描策略
         * Summary: 更新镜像仓库扫描策略
         */
        public async Task<UpdateImageReposcanstrategyResponse> UpdateImageReposcanstrategyExAsync(UpdateImageReposcanstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageReposcanstrategyResponse>(await DoRequestAsync("1.0", "antcloud.catronus.image.reposcanstrategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略某个baseline风险
         * Summary: 忽略某个baseline风险
         */
        public SkipClusterBaselineResponse SkipClusterBaseline(SkipClusterBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipClusterBaselineEx(request, headers, runtime);
        }

        /**
         * Description: 忽略某个baseline风险
         * Summary: 忽略某个baseline风险
         */
        public async Task<SkipClusterBaselineResponse> SkipClusterBaselineAsync(SkipClusterBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipClusterBaselineExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略某个baseline风险
         * Summary: 忽略某个baseline风险
         */
        public SkipClusterBaselineResponse SkipClusterBaselineEx(SkipClusterBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipClusterBaselineResponse>(DoRequest("1.0", "antcloud.catronus.cluster.baseline.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略某个baseline风险
         * Summary: 忽略某个baseline风险
         */
        public async Task<SkipClusterBaselineResponse> SkipClusterBaselineExAsync(SkipClusterBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipClusterBaselineResponse>(await DoRequestAsync("1.0", "antcloud.catronus.cluster.baseline.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
