// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DTX.Models;

namespace AntChain.SDK.DTX
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
                        {"sdk_version", "1.0.166"},
                        {"_prod_code", "DTX"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "prodapigw-sofastack.cloud.alipay.com")},
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
                        {"sdk_version", "1.0.166"},
                        {"_prod_code", "DTX"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "prodapigw-sofastack.cloud.alipay.com")},
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
         * Description: 创建应用
         * Summary: 创建应用
         */
        public CreateAppsResponse CreateApps(CreateAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppsEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用
         * Summary: 创建应用
         */
        public async Task<CreateAppsResponse> CreateAppsAsync(CreateAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用
         * Summary: 创建应用
         */
        public CreateAppsResponse CreateAppsEx(CreateAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsResponse>(DoRequest("1.0", "sofa.dtx.apps.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用
         * Summary: 创建应用
         */
        public async Task<CreateAppsResponse> CreateAppsExAsync(CreateAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方接入，新增发起方配置
         * Summary: 发起方接入
         */
        public CreateRecoveryInitiatorsResponse CreateRecoveryInitiators(CreateRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRecoveryInitiatorsEx(request, headers, runtime);
        }

        /**
         * Description: 发起方接入，新增发起方配置
         * Summary: 发起方接入
         */
        public async Task<CreateRecoveryInitiatorsResponse> CreateRecoveryInitiatorsAsync(CreateRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRecoveryInitiatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起方接入，新增发起方配置
         * Summary: 发起方接入
         */
        public CreateRecoveryInitiatorsResponse CreateRecoveryInitiatorsEx(CreateRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryInitiatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.initiators.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方接入，新增发起方配置
         * Summary: 发起方接入
         */
        public async Task<CreateRecoveryInitiatorsResponse> CreateRecoveryInitiatorsExAsync(CreateRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryInitiatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.initiators.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取事务概览统计
         * Summary: 获取bizType事务概览统计
         */
        public CountAppsStatsResponse CountAppsStats(CountAppsStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountAppsStatsEx(request, headers, runtime);
        }

        /**
         * Description: 根据app获取事务概览统计
         * Summary: 获取bizType事务概览统计
         */
        public async Task<CountAppsStatsResponse> CountAppsStatsAsync(CountAppsStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountAppsStatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据app获取事务概览统计
         * Summary: 获取bizType事务概览统计
         */
        public CountAppsStatsResponse CountAppsStatsEx(CountAppsStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppsStatsResponse>(DoRequest("1.0", "sofa.dtx.apps.stats.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取事务概览统计
         * Summary: 获取bizType事务概览统计
         */
        public async Task<CountAppsStatsResponse> CountAppsStatsExAsync(CountAppsStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppsStatsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.stats.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取bizType列表
         * Summary: 获取bizType列表
         */
        public ListAppsBiztypesResponse ListAppsBiztypes(ListAppsBiztypesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppsBiztypesEx(request, headers, runtime);
        }

        /**
         * Description: 获取bizType列表
         * Summary: 获取bizType列表
         */
        public async Task<ListAppsBiztypesResponse> ListAppsBiztypesAsync(ListAppsBiztypesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppsBiztypesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取bizType列表
         * Summary: 获取bizType列表
         */
        public ListAppsBiztypesResponse ListAppsBiztypesEx(ListAppsBiztypesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsBiztypesResponse>(DoRequest("1.0", "sofa.dtx.apps.biztypes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取bizType列表
         * Summary: 获取bizType列表
         */
        public async Task<ListAppsBiztypesResponse> ListAppsBiztypesExAsync(ListAppsBiztypesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsBiztypesResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.biztypes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 导出配置
         */
        public ExportAppsConfigsResponse ExportAppsConfigs(ExportAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportAppsConfigsEx(request, headers, runtime);
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 导出配置
         */
        public async Task<ExportAppsConfigsResponse> ExportAppsConfigsAsync(ExportAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportAppsConfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 导出配置
         */
        public ExportAppsConfigsResponse ExportAppsConfigsEx(ExportAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportAppsConfigsResponse>(DoRequest("1.0", "sofa.dtx.apps.configs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 导出配置
         */
        public async Task<ExportAppsConfigsResponse> ExportAppsConfigsExAsync(ExportAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportAppsConfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.configs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用名（app_name）列表
         * Summary: 获取应用名（app_name）列表
         */
        public AllAppsAppnamesResponse AllAppsAppnames(AllAppsAppnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAppsAppnamesEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用名（app_name）列表
         * Summary: 获取应用名（app_name）列表
         */
        public async Task<AllAppsAppnamesResponse> AllAppsAppnamesAsync(AllAppsAppnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAppsAppnamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用名（app_name）列表
         * Summary: 获取应用名（app_name）列表
         */
        public AllAppsAppnamesResponse AllAppsAppnamesEx(AllAppsAppnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppsAppnamesResponse>(DoRequest("1.0", "sofa.dtx.apps.appnames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用名（app_name）列表
         * Summary: 获取应用名（app_name）列表
         */
        public async Task<AllAppsAppnamesResponse> AllAppsAppnamesExAsync(AllAppsAppnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppsAppnamesResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.appnames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用事务列表，分页
         * Summary: 应用事务列表
         */
        public ListAppsResponse ListApps(ListAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppsEx(request, headers, runtime);
        }

        /**
         * Description: 应用事务列表，分页
         * Summary: 应用事务列表
         */
        public async Task<ListAppsResponse> ListAppsAsync(ListAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用事务列表，分页
         * Summary: 应用事务列表
         */
        public ListAppsResponse ListAppsEx(ListAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsResponse>(DoRequest("1.0", "sofa.dtx.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用事务列表，分页
         * Summary: 应用事务列表
         */
        public async Task<ListAppsResponse> ListAppsExAsync(ListAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个参与者详情
         * Summary: 单个参与者详情
         */
        public GetRecoveryParticipatorsResponse GetRecoveryParticipators(GetRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRecoveryParticipatorsEx(request, headers, runtime);
        }

        /**
         * Description: 单个参与者详情
         * Summary: 单个参与者详情
         */
        public async Task<GetRecoveryParticipatorsResponse> GetRecoveryParticipatorsAsync(GetRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRecoveryParticipatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个参与者详情
         * Summary: 单个参与者详情
         */
        public GetRecoveryParticipatorsResponse GetRecoveryParticipatorsEx(GetRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRecoveryParticipatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.participators.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个参与者详情
         * Summary: 单个参与者详情
         */
        public async Task<GetRecoveryParticipatorsResponse> GetRecoveryParticipatorsExAsync(GetRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRecoveryParticipatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.participators.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出配置中需要有app、类型信息（发起方/参与者）
         * Summary: 导入配置
         */
        public ImportAppsConfigsResponse ImportAppsConfigs(ImportAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAppsConfigsEx(request, headers, runtime);
        }

        /**
         * Description: 导出配置中需要有app、类型信息（发起方/参与者）
         * Summary: 导入配置
         */
        public async Task<ImportAppsConfigsResponse> ImportAppsConfigsAsync(ImportAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAppsConfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出配置中需要有app、类型信息（发起方/参与者）
         * Summary: 导入配置
         */
        public ImportAppsConfigsResponse ImportAppsConfigsEx(ImportAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAppsConfigsResponse>(DoRequest("1.0", "sofa.dtx.apps.configs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出配置中需要有app、类型信息（发起方/参与者）
         * Summary: 导入配置
         */
        public async Task<ImportAppsConfigsResponse> ImportAppsConfigsExAsync(ImportAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAppsConfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.configs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传文件URL
         * Summary: 获取上传文件URL
         */
        public GetUploadUrlResponse GetUploadUrl(GetUploadUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUploadUrlEx(request, headers, runtime);
        }

        /**
         * Description: 获取上传文件URL
         * Summary: 获取上传文件URL
         */
        public async Task<GetUploadUrlResponse> GetUploadUrlAsync(GetUploadUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUploadUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取上传文件URL
         * Summary: 获取上传文件URL
         */
        public GetUploadUrlResponse GetUploadUrlEx(GetUploadUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadUrlResponse>(DoRequest("1.0", "sofa.dtx.upload.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传文件URL
         * Summary: 获取上传文件URL
         */
        public async Task<GetUploadUrlResponse> GetUploadUrlExAsync(GetUploadUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadUrlResponse>(await DoRequestAsync("1.0", "sofa.dtx.upload.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
         * Summary: 查询bizType的调用关系
         */
        public QueryAppsBiztypeResponse QueryAppsBiztype(QueryAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppsBiztypeEx(request, headers, runtime);
        }

        /**
         * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
         * Summary: 查询bizType的调用关系
         */
        public async Task<QueryAppsBiztypeResponse> QueryAppsBiztypeAsync(QueryAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppsBiztypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
         * Summary: 查询bizType的调用关系
         */
        public QueryAppsBiztypeResponse QueryAppsBiztypeEx(QueryAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsBiztypeResponse>(DoRequest("1.0", "sofa.dtx.apps.biztype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
         * Summary: 查询bizType的调用关系
         */
        public async Task<QueryAppsBiztypeResponse> QueryAppsBiztypeExAsync(QueryAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsBiztypeResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.biztype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发起者获取数据源
         * Summary: 创建发起者获取数据源
         */
        public ListAppsRecoverydsnameResponse ListAppsRecoverydsname(ListAppsRecoverydsnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppsRecoverydsnameEx(request, headers, runtime);
        }

        /**
         * Description: 创建发起者获取数据源
         * Summary: 创建发起者获取数据源
         */
        public async Task<ListAppsRecoverydsnameResponse> ListAppsRecoverydsnameAsync(ListAppsRecoverydsnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppsRecoverydsnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发起者获取数据源
         * Summary: 创建发起者获取数据源
         */
        public ListAppsRecoverydsnameResponse ListAppsRecoverydsnameEx(ListAppsRecoverydsnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsRecoverydsnameResponse>(DoRequest("1.0", "sofa.dtx.apps.recoverydsname.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发起者获取数据源
         * Summary: 创建发起者获取数据源
         */
        public async Task<ListAppsRecoverydsnameResponse> ListAppsRecoverydsnameExAsync(ListAppsRecoverydsnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppsRecoverydsnameResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.recoverydsname.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个biztype的关联关系，Saga则是状态机json定义
         * Summary: 单个biztype的关联关系
         */
        public GetAppsBiztypeResponse GetAppsBiztype(GetAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppsBiztypeEx(request, headers, runtime);
        }

        /**
         * Description: 单个biztype的关联关系，Saga则是状态机json定义
         * Summary: 单个biztype的关联关系
         */
        public async Task<GetAppsBiztypeResponse> GetAppsBiztypeAsync(GetAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppsBiztypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个biztype的关联关系，Saga则是状态机json定义
         * Summary: 单个biztype的关联关系
         */
        public GetAppsBiztypeResponse GetAppsBiztypeEx(GetAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppsBiztypeResponse>(DoRequest("1.0", "sofa.dtx.apps.biztype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个biztype的关联关系，Saga则是状态机json定义
         * Summary: 单个biztype的关联关系
         */
        public async Task<GetAppsBiztypeResponse> GetAppsBiztypeExAsync(GetAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppsBiztypeResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.biztype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务更新
         * Summary: 事务更新
         */
        public UpdateAppsBiztypeResponse UpdateAppsBiztype(UpdateAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppsBiztypeEx(request, headers, runtime);
        }

        /**
         * Description: 事务更新
         * Summary: 事务更新
         */
        public async Task<UpdateAppsBiztypeResponse> UpdateAppsBiztypeAsync(UpdateAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppsBiztypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 事务更新
         * Summary: 事务更新
         */
        public UpdateAppsBiztypeResponse UpdateAppsBiztypeEx(UpdateAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppsBiztypeResponse>(DoRequest("1.0", "sofa.dtx.apps.biztype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务更新
         * Summary: 事务更新
         */
        public async Task<UpdateAppsBiztypeResponse> UpdateAppsBiztypeExAsync(UpdateAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppsBiztypeResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.biztype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增应用配置（包括发起方和参与者）
         * Summary: 新增应用配置（包括发起方和参与者）
         */
        public CreateAppsConfigsResponse CreateAppsConfigs(CreateAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppsConfigsEx(request, headers, runtime);
        }

        /**
         * Description: 新增应用配置（包括发起方和参与者）
         * Summary: 新增应用配置（包括发起方和参与者）
         */
        public async Task<CreateAppsConfigsResponse> CreateAppsConfigsAsync(CreateAppsConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppsConfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增应用配置（包括发起方和参与者）
         * Summary: 新增应用配置（包括发起方和参与者）
         */
        public CreateAppsConfigsResponse CreateAppsConfigsEx(CreateAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsConfigsResponse>(DoRequest("1.0", "sofa.dtx.apps.configs.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增应用配置（包括发起方和参与者）
         * Summary: 新增应用配置（包括发起方和参与者）
         */
        public async Task<CreateAppsConfigsResponse> CreateAppsConfigsExAsync(CreateAppsConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsConfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.configs.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务配置-导入配置
         * Summary: 应用配置-导入配置
         */
        public ImportAppsNewconfigsResponse ImportAppsNewconfigs(ImportAppsNewconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAppsNewconfigsEx(request, headers, runtime);
        }

        /**
         * Description: 事务配置-导入配置
         * Summary: 应用配置-导入配置
         */
        public async Task<ImportAppsNewconfigsResponse> ImportAppsNewconfigsAsync(ImportAppsNewconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAppsNewconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 事务配置-导入配置
         * Summary: 应用配置-导入配置
         */
        public ImportAppsNewconfigsResponse ImportAppsNewconfigsEx(ImportAppsNewconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAppsNewconfigsResponse>(DoRequest("1.0", "sofa.dtx.apps.newconfigs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务配置-导入配置
         * Summary: 应用配置-导入配置
         */
        public async Task<ImportAppsNewconfigsResponse> ImportAppsNewconfigsExAsync(ImportAppsNewconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAppsNewconfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.newconfigs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 应用配置-导出配置
         */
        public ExportAppsNewconfigsResponse ExportAppsNewconfigs(ExportAppsNewconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportAppsNewconfigsEx(request, headers, runtime);
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 应用配置-导出配置
         */
        public async Task<ExportAppsNewconfigsResponse> ExportAppsNewconfigsAsync(ExportAppsNewconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportAppsNewconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 应用配置-导出配置
         */
        public ExportAppsNewconfigsResponse ExportAppsNewconfigsEx(ExportAppsNewconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportAppsNewconfigsResponse>(DoRequest("1.0", "sofa.dtx.apps.newconfigs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: app+发起方/参与者 导出配置
         * Summary: 应用配置-导出配置
         */
        public async Task<ExportAppsNewconfigsResponse> ExportAppsNewconfigsExAsync(ExportAppsNewconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportAppsNewconfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.newconfigs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出配置中需要有事务信息
         * Summary: 事务配置-导入配置
         */
        public ImportTxConfigsResponse ImportTxConfigs(ImportTxConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTxConfigsEx(request, headers, runtime);
        }

        /**
         * Description: 导出配置中需要有事务信息
         * Summary: 事务配置-导入配置
         */
        public async Task<ImportTxConfigsResponse> ImportTxConfigsAsync(ImportTxConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTxConfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出配置中需要有事务信息
         * Summary: 事务配置-导入配置
         */
        public ImportTxConfigsResponse ImportTxConfigsEx(ImportTxConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTxConfigsResponse>(DoRequest("1.0", "sofa.dtx.tx.configs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出配置中需要有事务信息
         * Summary: 事务配置-导入配置
         */
        public async Task<ImportTxConfigsResponse> ImportTxConfigsExAsync(ImportTxConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTxConfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.tx.configs.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务导出配置
         * Summary: 事务配置-导出配置
         */
        public ExportTxConfigsResponse ExportTxConfigs(ExportTxConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportTxConfigsEx(request, headers, runtime);
        }

        /**
         * Description: 事务导出配置
         * Summary: 事务配置-导出配置
         */
        public async Task<ExportTxConfigsResponse> ExportTxConfigsAsync(ExportTxConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportTxConfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 事务导出配置
         * Summary: 事务配置-导出配置
         */
        public ExportTxConfigsResponse ExportTxConfigsEx(ExportTxConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportTxConfigsResponse>(DoRequest("1.0", "sofa.dtx.tx.configs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务导出配置
         * Summary: 事务配置-导出配置
         */
        public async Task<ExportTxConfigsResponse> ExportTxConfigsExAsync(ExportTxConfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportTxConfigsResponse>(await DoRequestAsync("1.0", "sofa.dtx.tx.configs.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管控台1.1 应用配置列表
         * Summary: 应用配置列表
         */
        public ListNewAppsResponse ListNewApps(ListNewAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListNewAppsEx(request, headers, runtime);
        }

        /**
         * Description: 管控台1.1 应用配置列表
         * Summary: 应用配置列表
         */
        public async Task<ListNewAppsResponse> ListNewAppsAsync(ListNewAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListNewAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 管控台1.1 应用配置列表
         * Summary: 应用配置列表
         */
        public ListNewAppsResponse ListNewAppsEx(ListNewAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListNewAppsResponse>(DoRequest("1.0", "sofa.dtx.new.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管控台1.1 应用配置列表
         * Summary: 应用配置列表
         */
        public async Task<ListNewAppsResponse> ListNewAppsExAsync(ListNewAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListNewAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.new.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新应用详情界面
         * Summary: 应用详情
         */
        public QueryAppsDetailResponse QueryAppsDetail(QueryAppsDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppsDetailEx(request, headers, runtime);
        }

        /**
         * Description: 新应用详情界面
         * Summary: 应用详情
         */
        public async Task<QueryAppsDetailResponse> QueryAppsDetailAsync(QueryAppsDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppsDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 新应用详情界面
         * Summary: 应用详情
         */
        public QueryAppsDetailResponse QueryAppsDetailEx(QueryAppsDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsDetailResponse>(DoRequest("1.0", "sofa.dtx.apps.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新应用详情界面
         * Summary: 应用详情
         */
        public async Task<QueryAppsDetailResponse> QueryAppsDetailExAsync(QueryAppsDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsDetailResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 。
         * Summary: 应用删除
         */
        public DeleteAppsResponse DeleteApps(DeleteAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppsEx(request, headers, runtime);
        }

        /**
         * Description: 。
         * Summary: 应用删除
         */
        public async Task<DeleteAppsResponse> DeleteAppsAsync(DeleteAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 。
         * Summary: 应用删除
         */
        public DeleteAppsResponse DeleteAppsEx(DeleteAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsResponse>(DoRequest("1.0", "sofa.dtx.apps.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 。
         * Summary: 应用删除
         */
        public async Task<DeleteAppsResponse> DeleteAppsExAsync(DeleteAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方删除
         * Summary: 发起方删除
         */
        public DeleteAppsRecoveryResponse DeleteAppsRecovery(DeleteAppsRecoveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppsRecoveryEx(request, headers, runtime);
        }

        /**
         * Description: 发起方删除
         * Summary: 发起方删除
         */
        public async Task<DeleteAppsRecoveryResponse> DeleteAppsRecoveryAsync(DeleteAppsRecoveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppsRecoveryExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起方删除
         * Summary: 发起方删除
         */
        public DeleteAppsRecoveryResponse DeleteAppsRecoveryEx(DeleteAppsRecoveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsRecoveryResponse>(DoRequest("1.0", "sofa.dtx.apps.recovery.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方删除
         * Summary: 发起方删除
         */
        public async Task<DeleteAppsRecoveryResponse> DeleteAppsRecoveryExAsync(DeleteAppsRecoveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsRecoveryResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.recovery.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者删除
         * Summary: 参与者删除
         */
        public DeleteAppsActionResponse DeleteAppsAction(DeleteAppsActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppsActionEx(request, headers, runtime);
        }

        /**
         * Description: 参与者删除
         * Summary: 参与者删除
         */
        public async Task<DeleteAppsActionResponse> DeleteAppsActionAsync(DeleteAppsActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppsActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 参与者删除
         * Summary: 参与者删除
         */
        public DeleteAppsActionResponse DeleteAppsActionEx(DeleteAppsActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsActionResponse>(DoRequest("1.0", "sofa.dtx.apps.action.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者删除
         * Summary: 参与者删除
         */
        public async Task<DeleteAppsActionResponse> DeleteAppsActionExAsync(DeleteAppsActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsActionResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.action.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增 app下的发起方、参与者
         * Summary: 批量新增 app下的发起方、参与者
         */
        public BatchcreateAppsResponse BatchcreateApps(BatchcreateAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateAppsEx(request, headers, runtime);
        }

        /**
         * Description: 批量新增 app下的发起方、参与者
         * Summary: 批量新增 app下的发起方、参与者
         */
        public async Task<BatchcreateAppsResponse> BatchcreateAppsAsync(BatchcreateAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量新增 app下的发起方、参与者
         * Summary: 批量新增 app下的发起方、参与者
         */
        public BatchcreateAppsResponse BatchcreateAppsEx(BatchcreateAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateAppsResponse>(DoRequest("1.0", "sofa.dtx.apps.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增 app下的发起方、参与者
         * Summary: 批量新增 app下的发起方、参与者
         */
        public async Task<BatchcreateAppsResponse> BatchcreateAppsExAsync(BatchcreateAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个发起方新增/编辑
         * Summary: 单个发起方新增/编辑
         */
        public CreateAppsRecoveryResponse CreateAppsRecovery(CreateAppsRecoveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppsRecoveryEx(request, headers, runtime);
        }

        /**
         * Description: 单个发起方新增/编辑
         * Summary: 单个发起方新增/编辑
         */
        public async Task<CreateAppsRecoveryResponse> CreateAppsRecoveryAsync(CreateAppsRecoveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppsRecoveryExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个发起方新增/编辑
         * Summary: 单个发起方新增/编辑
         */
        public CreateAppsRecoveryResponse CreateAppsRecoveryEx(CreateAppsRecoveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsRecoveryResponse>(DoRequest("1.0", "sofa.dtx.apps.recovery.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个发起方新增/编辑
         * Summary: 单个发起方新增/编辑
         */
        public async Task<CreateAppsRecoveryResponse> CreateAppsRecoveryExAsync(CreateAppsRecoveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsRecoveryResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.recovery.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者新增/编辑
         * Summary: 参与者新增/编辑
         */
        public CreateAppsActionResponse CreateAppsAction(CreateAppsActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppsActionEx(request, headers, runtime);
        }

        /**
         * Description: 参与者新增/编辑
         * Summary: 参与者新增/编辑
         */
        public async Task<CreateAppsActionResponse> CreateAppsActionAsync(CreateAppsActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppsActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 参与者新增/编辑
         * Summary: 参与者新增/编辑
         */
        public CreateAppsActionResponse CreateAppsActionEx(CreateAppsActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsActionResponse>(DoRequest("1.0", "sofa.dtx.apps.action.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者新增/编辑
         * Summary: 参与者新增/编辑
         */
        public async Task<CreateAppsActionResponse> CreateAppsActionExAsync(CreateAppsActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppsActionResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.action.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建/编辑事务关联关系
         * Summary: 新建/编辑事务关联关系
         */
        public CreateBiztypeRelationResponse CreateBiztypeRelation(CreateBiztypeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBiztypeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 新建/编辑事务关联关系
         * Summary: 新建/编辑事务关联关系
         */
        public async Task<CreateBiztypeRelationResponse> CreateBiztypeRelationAsync(CreateBiztypeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBiztypeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 新建/编辑事务关联关系
         * Summary: 新建/编辑事务关联关系
         */
        public CreateBiztypeRelationResponse CreateBiztypeRelationEx(CreateBiztypeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBiztypeRelationResponse>(DoRequest("1.0", "sofa.dtx.biztype.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建/编辑事务关联关系
         * Summary: 新建/编辑事务关联关系
         */
        public async Task<CreateBiztypeRelationResponse> CreateBiztypeRelationExAsync(CreateBiztypeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBiztypeRelationResponse>(await DoRequestAsync("1.0", "sofa.dtx.biztype.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除biztype关联关系
         * Summary: 删除biztype关联关系
         */
        public DeleteAppsBiztypeResponse DeleteAppsBiztype(DeleteAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppsBiztypeEx(request, headers, runtime);
        }

        /**
         * Description: 删除biztype关联关系
         * Summary: 删除biztype关联关系
         */
        public async Task<DeleteAppsBiztypeResponse> DeleteAppsBiztypeAsync(DeleteAppsBiztypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppsBiztypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除biztype关联关系
         * Summary: 删除biztype关联关系
         */
        public DeleteAppsBiztypeResponse DeleteAppsBiztypeEx(DeleteAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsBiztypeResponse>(DoRequest("1.0", "sofa.dtx.apps.biztype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除biztype关联关系
         * Summary: 删除biztype关联关系
         */
        public async Task<DeleteAppsBiztypeResponse> DeleteAppsBiztypeExAsync(DeleteAppsBiztypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppsBiztypeResponse>(await DoRequestAsync("1.0", "sofa.dtx.apps.biztype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询biztype与发起方，参与者的关联关系
         * Summary: 查询biztype关联关系
         */
        public QueryBiztypeRelationResponse QueryBiztypeRelation(QueryBiztypeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBiztypeRelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询biztype与发起方，参与者的关联关系
         * Summary: 查询biztype关联关系
         */
        public async Task<QueryBiztypeRelationResponse> QueryBiztypeRelationAsync(QueryBiztypeRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBiztypeRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询biztype与发起方，参与者的关联关系
         * Summary: 查询biztype关联关系
         */
        public QueryBiztypeRelationResponse QueryBiztypeRelationEx(QueryBiztypeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBiztypeRelationResponse>(DoRequest("1.0", "sofa.dtx.biztype.relation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询biztype与发起方，参与者的关联关系
         * Summary: 查询biztype关联关系
         */
        public async Task<QueryBiztypeRelationResponse> QueryBiztypeRelationExAsync(QueryBiztypeRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBiztypeRelationResponse>(await DoRequestAsync("1.0", "sofa.dtx.biztype.relation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据txid，删除进行中的事务
         * Summary: 删除进行中的事务
         */
        public DeleteTransactionsResponse DeleteTransactions(DeleteTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTransactionsEx(request, headers, runtime);
        }

        /**
         * Description: 根据txid，删除进行中的事务
         * Summary: 删除进行中的事务
         */
        public async Task<DeleteTransactionsResponse> DeleteTransactionsAsync(DeleteTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTransactionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据txid，删除进行中的事务
         * Summary: 删除进行中的事务
         */
        public DeleteTransactionsResponse DeleteTransactionsEx(DeleteTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransactionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据txid，删除进行中的事务
         * Summary: 删除进行中的事务
         */
        public async Task<DeleteTransactionsResponse> DeleteTransactionsExAsync(DeleteTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransactionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
         * Summary: 异库接入（包括发起方和参与者）
         */
        public CreateRecoveryConfigurationResponse CreateRecoveryConfiguration(CreateRecoveryConfigurationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRecoveryConfigurationEx(request, headers, runtime);
        }

        /**
         * Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
         * Summary: 异库接入（包括发起方和参与者）
         */
        public async Task<CreateRecoveryConfigurationResponse> CreateRecoveryConfigurationAsync(CreateRecoveryConfigurationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRecoveryConfigurationExAsync(request, headers, runtime);
        }

        /**
         * Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
         * Summary: 异库接入（包括发起方和参与者）
         */
        public CreateRecoveryConfigurationResponse CreateRecoveryConfigurationEx(CreateRecoveryConfigurationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryConfigurationResponse>(DoRequest("1.0", "sofa.dtx.recovery.configuration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
         * Summary: 异库接入（包括发起方和参与者）
         */
        public async Task<CreateRecoveryConfigurationResponse> CreateRecoveryConfigurationExAsync(CreateRecoveryConfigurationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryConfigurationResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.configuration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境信息，例如租户和环境
         * Summary: 获取当前环境
         */
        public GetGlobalEnvResponse GetGlobalEnv(GetGlobalEnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGlobalEnvEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境信息，例如租户和环境
         * Summary: 获取当前环境
         */
        public async Task<GetGlobalEnvResponse> GetGlobalEnvAsync(GetGlobalEnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGlobalEnvExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境信息，例如租户和环境
         * Summary: 获取当前环境
         */
        public GetGlobalEnvResponse GetGlobalEnvEx(GetGlobalEnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGlobalEnvResponse>(DoRequest("1.0", "sofa.dtx.global.env.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境信息，例如租户和环境
         * Summary: 获取当前环境
         */
        public async Task<GetGlobalEnvResponse> GetGlobalEnvExAsync(GetGlobalEnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGlobalEnvResponse>(await DoRequestAsync("1.0", "sofa.dtx.global.env.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取instanceId
         * Summary: 获取instanceId
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstance(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMiddlewareInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取instanceId
         * Summary: 获取instanceId
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceAsync(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMiddlewareInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取instanceId
         * Summary: 获取instanceId
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(DoRequest("1.0", "sofa.dtx.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取instanceId
         * Summary: 获取instanceId
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceExAsync(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(await DoRequestAsync("1.0", "sofa.dtx.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取zone信息
         * Summary: 获取zone信息
         */
        public AllZoneResponse AllZone(AllZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllZoneEx(request, headers, runtime);
        }

        /**
         * Description: 获取zone信息
         * Summary: 获取zone信息
         */
        public async Task<AllZoneResponse> AllZoneAsync(AllZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取zone信息
         * Summary: 获取zone信息
         */
        public AllZoneResponse AllZoneEx(AllZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllZoneResponse>(DoRequest("1.0", "sofa.dtx.zone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取zone信息
         * Summary: 获取zone信息
         */
        public async Task<AllZoneResponse> AllZoneExAsync(AllZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllZoneResponse>(await DoRequestAsync("1.0", "sofa.dtx.zone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方接入配置的修改
         * Summary: 发起方编辑
         */
        public UpdateRecoveryInitiatorsResponse UpdateRecoveryInitiators(UpdateRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRecoveryInitiatorsEx(request, headers, runtime);
        }

        /**
         * Description: 发起方接入配置的修改
         * Summary: 发起方编辑
         */
        public async Task<UpdateRecoveryInitiatorsResponse> UpdateRecoveryInitiatorsAsync(UpdateRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRecoveryInitiatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起方接入配置的修改
         * Summary: 发起方编辑
         */
        public UpdateRecoveryInitiatorsResponse UpdateRecoveryInitiatorsEx(UpdateRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecoveryInitiatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.initiators.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方接入配置的修改
         * Summary: 发起方编辑
         */
        public async Task<UpdateRecoveryInitiatorsResponse> UpdateRecoveryInitiatorsExAsync(UpdateRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecoveryInitiatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.initiators.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用作为参与者查询所有发起者
         * Summary: 应用作为参与者查询所有发起者
         */
        public ListBiztypesInitiatorsResponse ListBiztypesInitiators(ListBiztypesInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBiztypesInitiatorsEx(request, headers, runtime);
        }

        /**
         * Description: 应用作为参与者查询所有发起者
         * Summary: 应用作为参与者查询所有发起者
         */
        public async Task<ListBiztypesInitiatorsResponse> ListBiztypesInitiatorsAsync(ListBiztypesInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBiztypesInitiatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用作为参与者查询所有发起者
         * Summary: 应用作为参与者查询所有发起者
         */
        public ListBiztypesInitiatorsResponse ListBiztypesInitiatorsEx(ListBiztypesInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBiztypesInitiatorsResponse>(DoRequest("1.0", "sofa.dtx.biztypes.initiators.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用作为参与者查询所有发起者
         * Summary: 应用作为参与者查询所有发起者
         */
        public async Task<ListBiztypesInitiatorsResponse> ListBiztypesInitiatorsExAsync(ListBiztypesInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBiztypesInitiatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.biztypes.initiators.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取数据源列表
         * Summary: 根据app获取数据源列表
         */
        public AllInitiatorsDatasourcesResponse AllInitiatorsDatasources(AllInitiatorsDatasourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllInitiatorsDatasourcesEx(request, headers, runtime);
        }

        /**
         * Description: 根据app获取数据源列表
         * Summary: 根据app获取数据源列表
         */
        public async Task<AllInitiatorsDatasourcesResponse> AllInitiatorsDatasourcesAsync(AllInitiatorsDatasourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllInitiatorsDatasourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据app获取数据源列表
         * Summary: 根据app获取数据源列表
         */
        public AllInitiatorsDatasourcesResponse AllInitiatorsDatasourcesEx(AllInitiatorsDatasourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInitiatorsDatasourcesResponse>(DoRequest("1.0", "sofa.dtx.initiators.datasources.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取数据源列表
         * Summary: 根据app获取数据源列表
         */
        public async Task<AllInitiatorsDatasourcesResponse> AllInitiatorsDatasourcesExAsync(AllInitiatorsDatasourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInitiatorsDatasourcesResponse>(await DoRequestAsync("1.0", "sofa.dtx.initiators.datasources.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app+dsName获取所有表
         * Summary: 根据app+dsName获取所有表
         */
        public AllInitiatorsTablesResponse AllInitiatorsTables(AllInitiatorsTablesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllInitiatorsTablesEx(request, headers, runtime);
        }

        /**
         * Description: 根据app+dsName获取所有表
         * Summary: 根据app+dsName获取所有表
         */
        public async Task<AllInitiatorsTablesResponse> AllInitiatorsTablesAsync(AllInitiatorsTablesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllInitiatorsTablesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据app+dsName获取所有表
         * Summary: 根据app+dsName获取所有表
         */
        public AllInitiatorsTablesResponse AllInitiatorsTablesEx(AllInitiatorsTablesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInitiatorsTablesResponse>(DoRequest("1.0", "sofa.dtx.initiators.tables.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app+dsName获取所有表
         * Summary: 根据app+dsName获取所有表
         */
        public async Task<AllInitiatorsTablesResponse> AllInitiatorsTablesExAsync(AllInitiatorsTablesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllInitiatorsTablesResponse>(await DoRequestAsync("1.0", "sofa.dtx.initiators.tables.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方联调
         * Summary: 发起方联调
         */
        public DebugInitiatorsResponse DebugInitiators(DebugInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DebugInitiatorsEx(request, headers, runtime);
        }

        /**
         * Description: 发起方联调
         * Summary: 发起方联调
         */
        public async Task<DebugInitiatorsResponse> DebugInitiatorsAsync(DebugInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DebugInitiatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起方联调
         * Summary: 发起方联调
         */
        public DebugInitiatorsResponse DebugInitiatorsEx(DebugInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DebugInitiatorsResponse>(DoRequest("1.0", "sofa.dtx.initiators.debug", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方联调
         * Summary: 发起方联调
         */
        public async Task<DebugInitiatorsResponse> DebugInitiatorsExAsync(DebugInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DebugInitiatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.initiators.debug", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个发起方详情
         * Summary: 单个发起方详情
         */
        public GetRecoveryInitiatorsResponse GetRecoveryInitiators(GetRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRecoveryInitiatorsEx(request, headers, runtime);
        }

        /**
         * Description: 单个发起方详情
         * Summary: 单个发起方详情
         */
        public async Task<GetRecoveryInitiatorsResponse> GetRecoveryInitiatorsAsync(GetRecoveryInitiatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRecoveryInitiatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个发起方详情
         * Summary: 单个发起方详情
         */
        public GetRecoveryInitiatorsResponse GetRecoveryInitiatorsEx(GetRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRecoveryInitiatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.initiators.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个发起方详情
         * Summary: 单个发起方详情
         */
        public async Task<GetRecoveryInitiatorsResponse> GetRecoveryInitiatorsExAsync(GetRecoveryInitiatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRecoveryInitiatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.initiators.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者接入，录入参与者信息
         * Summary: 参与者接入
         */
        public CreateRecoveryParticipatorsResponse CreateRecoveryParticipators(CreateRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRecoveryParticipatorsEx(request, headers, runtime);
        }

        /**
         * Description: 参与者接入，录入参与者信息
         * Summary: 参与者接入
         */
        public async Task<CreateRecoveryParticipatorsResponse> CreateRecoveryParticipatorsAsync(CreateRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRecoveryParticipatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 参与者接入，录入参与者信息
         * Summary: 参与者接入
         */
        public CreateRecoveryParticipatorsResponse CreateRecoveryParticipatorsEx(CreateRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryParticipatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.participators.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者接入，录入参与者信息
         * Summary: 参与者接入
         */
        public async Task<CreateRecoveryParticipatorsResponse> CreateRecoveryParticipatorsExAsync(CreateRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRecoveryParticipatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.participators.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新参与者配置信息
         * Summary: 参与者编辑
         */
        public UpdateRecoveryParticipatorsResponse UpdateRecoveryParticipators(UpdateRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRecoveryParticipatorsEx(request, headers, runtime);
        }

        /**
         * Description: 更新参与者配置信息
         * Summary: 参与者编辑
         */
        public async Task<UpdateRecoveryParticipatorsResponse> UpdateRecoveryParticipatorsAsync(UpdateRecoveryParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRecoveryParticipatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新参与者配置信息
         * Summary: 参与者编辑
         */
        public UpdateRecoveryParticipatorsResponse UpdateRecoveryParticipatorsEx(UpdateRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecoveryParticipatorsResponse>(DoRequest("1.0", "sofa.dtx.recovery.participators.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新参与者配置信息
         * Summary: 参与者编辑
         */
        public async Task<UpdateRecoveryParticipatorsResponse> UpdateRecoveryParticipatorsExAsync(UpdateRecoveryParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecoveryParticipatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.recovery.participators.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  应用作为发起者查询所有参与者
         * Summary:  应用作为发起者查询所有参与者
         */
        public ListBiztypesParticipatorsResponse ListBiztypesParticipators(ListBiztypesParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBiztypesParticipatorsEx(request, headers, runtime);
        }

        /**
         * Description:  应用作为发起者查询所有参与者
         * Summary:  应用作为发起者查询所有参与者
         */
        public async Task<ListBiztypesParticipatorsResponse> ListBiztypesParticipatorsAsync(ListBiztypesParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBiztypesParticipatorsExAsync(request, headers, runtime);
        }

        /**
         * Description:  应用作为发起者查询所有参与者
         * Summary:  应用作为发起者查询所有参与者
         */
        public ListBiztypesParticipatorsResponse ListBiztypesParticipatorsEx(ListBiztypesParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBiztypesParticipatorsResponse>(DoRequest("1.0", "sofa.dtx.biztypes.participators.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  应用作为发起者查询所有参与者
         * Summary:  应用作为发起者查询所有参与者
         */
        public async Task<ListBiztypesParticipatorsResponse> ListBiztypesParticipatorsExAsync(ListBiztypesParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBiztypesParticipatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.biztypes.participators.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取所有的参与者名称
         * Summary: 根据app获取所有的参与者名称
         */
        public AllParticipatorsActionamesResponse AllParticipatorsActionames(AllParticipatorsActionamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllParticipatorsActionamesEx(request, headers, runtime);
        }

        /**
         * Description: 根据app获取所有的参与者名称
         * Summary: 根据app获取所有的参与者名称
         */
        public async Task<AllParticipatorsActionamesResponse> AllParticipatorsActionamesAsync(AllParticipatorsActionamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllParticipatorsActionamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据app获取所有的参与者名称
         * Summary: 根据app获取所有的参与者名称
         */
        public AllParticipatorsActionamesResponse AllParticipatorsActionamesEx(AllParticipatorsActionamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllParticipatorsActionamesResponse>(DoRequest("1.0", "sofa.dtx.participators.actionames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app获取所有的参与者名称
         * Summary: 根据app获取所有的参与者名称
         */
        public async Task<AllParticipatorsActionamesResponse> AllParticipatorsActionamesExAsync(AllParticipatorsActionamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllParticipatorsActionamesResponse>(await DoRequestAsync("1.0", "sofa.dtx.participators.actionames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者联调
         * Summary: 参与者联调
         */
        public DebugParticipatorsResponse DebugParticipators(DebugParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DebugParticipatorsEx(request, headers, runtime);
        }

        /**
         * Description: 参与者联调
         * Summary: 参与者联调
         */
        public async Task<DebugParticipatorsResponse> DebugParticipatorsAsync(DebugParticipatorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DebugParticipatorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 参与者联调
         * Summary: 参与者联调
         */
        public DebugParticipatorsResponse DebugParticipatorsEx(DebugParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DebugParticipatorsResponse>(DoRequest("1.0", "sofa.dtx.participators.debug", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 参与者联调
         * Summary: 参与者联调
         */
        public async Task<DebugParticipatorsResponse> DebugParticipatorsExAsync(DebugParticipatorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DebugParticipatorsResponse>(await DoRequestAsync("1.0", "sofa.dtx.participators.debug", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交回滚方法参数
         * Summary: 获取action的调用参数
         */
        public QueryActionParamResponse QueryActionParam(QueryActionParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryActionParamEx(request, headers, runtime);
        }

        /**
         * Description: 提交回滚方法参数
         * Summary: 获取action的调用参数
         */
        public async Task<QueryActionParamResponse> QueryActionParamAsync(QueryActionParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryActionParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交回滚方法参数
         * Summary: 获取action的调用参数
         */
        public QueryActionParamResponse QueryActionParamEx(QueryActionParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryActionParamResponse>(DoRequest("1.0", "sofa.dtx.action.param.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交回滚方法参数
         * Summary: 获取action的调用参数
         */
        public async Task<QueryActionParamResponse> QueryActionParamExAsync(QueryActionParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryActionParamResponse>(await DoRequestAsync("1.0", "sofa.dtx.action.param.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-执行单元切换
         * Summary: 分布式事务执行单元切换
         */
        public ExecuteSwitchoverResponse ExecuteSwitchover(ExecuteSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecuteSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-执行单元切换
         * Summary: 分布式事务执行单元切换
         */
        public async Task<ExecuteSwitchoverResponse> ExecuteSwitchoverAsync(ExecuteSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecuteSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-执行单元切换
         * Summary: 分布式事务执行单元切换
         */
        public ExecuteSwitchoverResponse ExecuteSwitchoverEx(ExecuteSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteSwitchoverResponse>(DoRequest("1.0", "sofa.dtx.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-执行单元切换
         * Summary: 分布式事务执行单元切换
         */
        public async Task<ExecuteSwitchoverResponse> ExecuteSwitchoverExAsync(ExecuteSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.dtx.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-取消单元切换
         * Summary: 分布式事务取消单元切换
         */
        public CancelSwitchoverResponse CancelSwitchover(CancelSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-取消单元切换
         * Summary: 分布式事务取消单元切换
         */
        public async Task<CancelSwitchoverResponse> CancelSwitchoverAsync(CancelSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-取消单元切换
         * Summary: 分布式事务取消单元切换
         */
        public CancelSwitchoverResponse CancelSwitchoverEx(CancelSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSwitchoverResponse>(DoRequest("1.0", "sofa.dtx.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-取消单元切换
         * Summary: 分布式事务取消单元切换
         */
        public async Task<CancelSwitchoverResponse> CancelSwitchoverExAsync(CancelSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.dtx.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-查询单元切换状态
         * Summary: 查询分布式事务单元切换状态
         */
        public QuerySwitchoverResponse QuerySwitchover(QuerySwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-查询单元切换状态
         * Summary: 查询分布式事务单元切换状态
         */
        public async Task<QuerySwitchoverResponse> QuerySwitchoverAsync(QuerySwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 分布式事务-查询单元切换状态
         * Summary: 查询分布式事务单元切换状态
         */
        public QuerySwitchoverResponse QuerySwitchoverEx(QuerySwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySwitchoverResponse>(DoRequest("1.0", "sofa.dtx.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式事务-查询单元切换状态
         * Summary: 查询分布式事务单元切换状态
         */
        public async Task<QuerySwitchoverResponse> QuerySwitchoverExAsync(QuerySwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySwitchoverResponse>(await DoRequestAsync("1.0", "sofa.dtx.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
         * Summary: 事务趋势图
         */
        public CountBiztypesTrendsResponse CountBiztypesTrends(CountBiztypesTrendsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountBiztypesTrendsEx(request, headers, runtime);
        }

        /**
         * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
         * Summary: 事务趋势图
         */
        public async Task<CountBiztypesTrendsResponse> CountBiztypesTrendsAsync(CountBiztypesTrendsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountBiztypesTrendsExAsync(request, headers, runtime);
        }

        /**
         * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
         * Summary: 事务趋势图
         */
        public CountBiztypesTrendsResponse CountBiztypesTrendsEx(CountBiztypesTrendsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountBiztypesTrendsResponse>(DoRequest("1.0", "sofa.dtx.biztypes.trends.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
         * Summary: 事务趋势图
         */
        public async Task<CountBiztypesTrendsResponse> CountBiztypesTrendsExAsync(CountBiztypesTrendsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountBiztypesTrendsResponse>(await DoRequestAsync("1.0", "sofa.dtx.biztypes.trends.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
         * Summary: 事务概览统计接口
         */
        public GetGlobalStatsResponse GetGlobalStats(GetGlobalStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGlobalStatsEx(request, headers, runtime);
        }

        /**
         * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
         * Summary: 事务概览统计接口
         */
        public async Task<GetGlobalStatsResponse> GetGlobalStatsAsync(GetGlobalStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGlobalStatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
         * Summary: 事务概览统计接口
         */
        public GetGlobalStatsResponse GetGlobalStatsEx(GetGlobalStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGlobalStatsResponse>(DoRequest("1.0", "sofa.dtx.global.stats.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
         * Summary: 事务概览统计接口
         */
        public async Task<GetGlobalStatsResponse> GetGlobalStatsExAsync(GetGlobalStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGlobalStatsResponse>(await DoRequestAsync("1.0", "sofa.dtx.global.stats.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联调历史列表
         * Summary: 联调历史列表
         */
        public ListTransactionDebugsResponse ListTransactionDebugs(ListTransactionDebugsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTransactionDebugsEx(request, headers, runtime);
        }

        /**
         * Description: 联调历史列表
         * Summary: 联调历史列表
         */
        public async Task<ListTransactionDebugsResponse> ListTransactionDebugsAsync(ListTransactionDebugsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTransactionDebugsExAsync(request, headers, runtime);
        }

        /**
         * Description: 联调历史列表
         * Summary: 联调历史列表
         */
        public ListTransactionDebugsResponse ListTransactionDebugsEx(ListTransactionDebugsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionDebugsResponse>(DoRequest("1.0", "sofa.dtx.transaction.debugs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联调历史列表
         * Summary: 联调历史列表
         */
        public async Task<ListTransactionDebugsResponse> ListTransactionDebugsExAsync(ListTransactionDebugsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionDebugsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transaction.debugs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个联调记录详情
         * Summary: 单个联调记录详情
         */
        public GetTransactionsDebugsResponse GetTransactionsDebugs(GetTransactionsDebugsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransactionsDebugsEx(request, headers, runtime);
        }

        /**
         * Description: 单个联调记录详情
         * Summary: 单个联调记录详情
         */
        public async Task<GetTransactionsDebugsResponse> GetTransactionsDebugsAsync(GetTransactionsDebugsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransactionsDebugsExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个联调记录详情
         * Summary: 单个联调记录详情
         */
        public GetTransactionsDebugsResponse GetTransactionsDebugsEx(GetTransactionsDebugsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsDebugsResponse>(DoRequest("1.0", "sofa.dtx.transactions.debugs.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个联调记录详情
         * Summary: 单个联调记录详情
         */
        public async Task<GetTransactionsDebugsResponse> GetTransactionsDebugsExAsync(GetTransactionsDebugsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsDebugsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.debugs.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务高级查询
         * Summary: 事务高级查询
         */
        public QueryTransactionsResponse QueryTransactions(QueryTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTransactionsEx(request, headers, runtime);
        }

        /**
         * Description: 事务高级查询
         * Summary: 事务高级查询
         */
        public async Task<QueryTransactionsResponse> QueryTransactionsAsync(QueryTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTransactionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 事务高级查询
         * Summary: 事务高级查询
         */
        public QueryTransactionsResponse QueryTransactionsEx(QueryTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransactionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务高级查询
         * Summary: 事务高级查询
         */
        public async Task<QueryTransactionsResponse> QueryTransactionsExAsync(QueryTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransactionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个事务详情
         * Summary: 单个事务详情
         */
        public GetTransactionsResponse GetTransactions(GetTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransactionsEx(request, headers, runtime);
        }

        /**
         * Description: 单个事务详情
         * Summary: 单个事务详情
         */
        public async Task<GetTransactionsResponse> GetTransactionsAsync(GetTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransactionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个事务详情
         * Summary: 单个事务详情
         */
        public GetTransactionsResponse GetTransactionsEx(GetTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个事务详情
         * Summary: 单个事务详情
         */
        public async Task<GetTransactionsResponse> GetTransactionsExAsync(GetTransactionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 悬挂事务恢复
         * Summary: 创建事务恢复
         */
        public CreateTransactionsCorrectionsResponse CreateTransactionsCorrections(CreateTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTransactionsCorrectionsEx(request, headers, runtime);
        }

        /**
         * Description: 悬挂事务恢复
         * Summary: 创建事务恢复
         */
        public async Task<CreateTransactionsCorrectionsResponse> CreateTransactionsCorrectionsAsync(CreateTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTransactionsCorrectionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 悬挂事务恢复
         * Summary: 创建事务恢复
         */
        public CreateTransactionsCorrectionsResponse CreateTransactionsCorrectionsEx(CreateTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransactionsCorrectionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.corrections.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 悬挂事务恢复
         * Summary: 创建事务恢复
         */
        public async Task<CreateTransactionsCorrectionsResponse> CreateTransactionsCorrectionsExAsync(CreateTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransactionsCorrectionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.corrections.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个事务恢复详情
         * Summary: 单个事务恢复详情
         */
        public GetTransactionsCorrectionsResponse GetTransactionsCorrections(GetTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransactionsCorrectionsEx(request, headers, runtime);
        }

        /**
         * Description: 单个事务恢复详情
         * Summary: 单个事务恢复详情
         */
        public async Task<GetTransactionsCorrectionsResponse> GetTransactionsCorrectionsAsync(GetTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransactionsCorrectionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个事务恢复详情
         * Summary: 单个事务恢复详情
         */
        public GetTransactionsCorrectionsResponse GetTransactionsCorrectionsEx(GetTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsCorrectionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.corrections.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个事务恢复详情
         * Summary: 单个事务恢复详情
         */
        public async Task<GetTransactionsCorrectionsResponse> GetTransactionsCorrectionsExAsync(GetTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionsCorrectionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.corrections.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行事务订正
         * Summary: 执行事务订正
         */
        public ExecTransactionsCorrectionsResponse ExecTransactionsCorrections(ExecTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecTransactionsCorrectionsEx(request, headers, runtime);
        }

        /**
         * Description: 执行事务订正
         * Summary: 执行事务订正
         */
        public async Task<ExecTransactionsCorrectionsResponse> ExecTransactionsCorrectionsAsync(ExecTransactionsCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecTransactionsCorrectionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行事务订正
         * Summary: 执行事务订正
         */
        public ExecTransactionsCorrectionsResponse ExecTransactionsCorrectionsEx(ExecTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTransactionsCorrectionsResponse>(DoRequest("1.0", "sofa.dtx.transactions.corrections.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行事务订正
         * Summary: 执行事务订正
         */
        public async Task<ExecTransactionsCorrectionsResponse> ExecTransactionsCorrectionsExAsync(ExecTransactionsCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTransactionsCorrectionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transactions.corrections.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务订正列表
         * Summary: 事务订正列表
         */
        public ListTransactionCorrectionsResponse ListTransactionCorrections(ListTransactionCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTransactionCorrectionsEx(request, headers, runtime);
        }

        /**
         * Description: 事务订正列表
         * Summary: 事务订正列表
         */
        public async Task<ListTransactionCorrectionsResponse> ListTransactionCorrectionsAsync(ListTransactionCorrectionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTransactionCorrectionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 事务订正列表
         * Summary: 事务订正列表
         */
        public ListTransactionCorrectionsResponse ListTransactionCorrectionsEx(ListTransactionCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionCorrectionsResponse>(DoRequest("1.0", "sofa.dtx.transaction.corrections.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 事务订正列表
         * Summary: 事务订正列表
         */
        public async Task<ListTransactionCorrectionsResponse> ListTransactionCorrectionsExAsync(ListTransactionCorrectionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionCorrectionsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transaction.corrections.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方app列表
         * Summary: 发起方app列表
         */
        public ListTransactionAppsResponse ListTransactionApps(ListTransactionAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTransactionAppsEx(request, headers, runtime);
        }

        /**
         * Description: 发起方app列表
         * Summary: 发起方app列表
         */
        public async Task<ListTransactionAppsResponse> ListTransactionAppsAsync(ListTransactionAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTransactionAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起方app列表
         * Summary: 发起方app列表
         */
        public ListTransactionAppsResponse ListTransactionAppsEx(ListTransactionAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionAppsResponse>(DoRequest("1.0", "sofa.dtx.transaction.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起方app列表
         * Summary: 发起方app列表
         */
        public async Task<ListTransactionAppsResponse> ListTransactionAppsExAsync(ListTransactionAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTransactionAppsResponse>(await DoRequestAsync("1.0", "sofa.dtx.transaction.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对特定图，组装的特定数据结构 接口
         * Summary: 事务详情
         */
        public GetTransactionChartResponse GetTransactionChart(GetTransactionChartRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransactionChartEx(request, headers, runtime);
        }

        /**
         * Description: 针对特定图，组装的特定数据结构 接口
         * Summary: 事务详情
         */
        public async Task<GetTransactionChartResponse> GetTransactionChartAsync(GetTransactionChartRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransactionChartExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对特定图，组装的特定数据结构 接口
         * Summary: 事务详情
         */
        public GetTransactionChartResponse GetTransactionChartEx(GetTransactionChartRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionChartResponse>(DoRequest("1.0", "sofa.dtx.transaction.chart.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对特定图，组装的特定数据结构 接口
         * Summary: 事务详情
         */
        public async Task<GetTransactionChartResponse> GetTransactionChartExAsync(GetTransactionChartRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionChartResponse>(await DoRequestAsync("1.0", "sofa.dtx.transaction.chart.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取Saga状态机事务执行记录，返回状态图json
         * Summary: 获取Saga状态机事务执行记录json
         */
        public GetTransactionSagaResponse GetTransactionSaga(GetTransactionSagaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransactionSagaEx(request, headers, runtime);
        }

        /**
         * Description: 获取Saga状态机事务执行记录，返回状态图json
         * Summary: 获取Saga状态机事务执行记录json
         */
        public async Task<GetTransactionSagaResponse> GetTransactionSagaAsync(GetTransactionSagaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransactionSagaExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取Saga状态机事务执行记录，返回状态图json
         * Summary: 获取Saga状态机事务执行记录json
         */
        public GetTransactionSagaResponse GetTransactionSagaEx(GetTransactionSagaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionSagaResponse>(DoRequest("1.0", "sofa.dtx.transaction.saga.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取Saga状态机事务执行记录，返回状态图json
         * Summary: 获取Saga状态机事务执行记录json
         */
        public async Task<GetTransactionSagaResponse> GetTransactionSagaExAsync(GetTransactionSagaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransactionSagaResponse>(await DoRequestAsync("1.0", "sofa.dtx.transaction.saga.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单列表
         * Summary: 白名单列表
         */
        public ListWhitelistResponse ListWhitelist(ListWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 白名单列表
         * Summary: 白名单列表
         */
        public async Task<ListWhitelistResponse> ListWhitelistAsync(ListWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 白名单列表
         * Summary: 白名单列表
         */
        public ListWhitelistResponse ListWhitelistEx(ListWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWhitelistResponse>(DoRequest("1.0", "sofa.dtx.whitelist.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单列表
         * Summary: 白名单列表
         */
        public async Task<ListWhitelistResponse> ListWhitelistExAsync(ListWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWhitelistResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单更新
         * Summary: 白名单更新
         */
        public UpdateWhitelistResponse UpdateWhitelist(UpdateWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 白名单更新
         * Summary: 白名单更新
         */
        public async Task<UpdateWhitelistResponse> UpdateWhitelistAsync(UpdateWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 白名单更新
         * Summary: 白名单更新
         */
        public UpdateWhitelistResponse UpdateWhitelistEx(UpdateWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWhitelistResponse>(DoRequest("1.0", "sofa.dtx.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单更新
         * Summary: 白名单更新
         */
        public async Task<UpdateWhitelistResponse> UpdateWhitelistExAsync(UpdateWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWhitelistResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单添加
         * Summary: 白名单添加
         */
        public AddWhitelistResponse AddWhitelist(AddWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 白名单添加
         * Summary: 白名单添加
         */
        public async Task<AddWhitelistResponse> AddWhitelistAsync(AddWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 白名单添加
         * Summary: 白名单添加
         */
        public AddWhitelistResponse AddWhitelistEx(AddWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWhitelistResponse>(DoRequest("1.0", "sofa.dtx.whitelist.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 白名单添加
         * Summary: 白名单添加
         */
        public async Task<AddWhitelistResponse> AddWhitelistExAsync(AddWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWhitelistResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: xts failover容灾推送
         * Summary: 容灾推送
         */
        public PushWhitelistResponse PushWhitelist(PushWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: xts failover容灾推送
         * Summary: 容灾推送
         */
        public async Task<PushWhitelistResponse> PushWhitelistAsync(PushWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: xts failover容灾推送
         * Summary: 容灾推送
         */
        public PushWhitelistResponse PushWhitelistEx(PushWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushWhitelistResponse>(DoRequest("1.0", "sofa.dtx.whitelist.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: xts failover容灾推送
         * Summary: 容灾推送
         */
        public async Task<PushWhitelistResponse> PushWhitelistExAsync(PushWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushWhitelistResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除白名单
         * Summary: 删除白名单
         */
        public DeleteWhitelistResponse DeleteWhitelist(DeleteWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 删除白名单
         * Summary: 删除白名单
         */
        public async Task<DeleteWhitelistResponse> DeleteWhitelistAsync(DeleteWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除白名单
         * Summary: 删除白名单
         */
        public DeleteWhitelistResponse DeleteWhitelistEx(DeleteWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWhitelistResponse>(DoRequest("1.0", "sofa.dtx.whitelist.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除白名单
         * Summary: 删除白名单
         */
        public async Task<DeleteWhitelistResponse> DeleteWhitelistExAsync(DeleteWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWhitelistResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹性位配置列表
         * Summary: 弹性位配置列表
         */
        public ListWhitelistZonesResponse ListWhitelistZones(ListWhitelistZonesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWhitelistZonesEx(request, headers, runtime);
        }

        /**
         * Description: 弹性位配置列表
         * Summary: 弹性位配置列表
         */
        public async Task<ListWhitelistZonesResponse> ListWhitelistZonesAsync(ListWhitelistZonesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWhitelistZonesExAsync(request, headers, runtime);
        }

        /**
         * Description: 弹性位配置列表
         * Summary: 弹性位配置列表
         */
        public ListWhitelistZonesResponse ListWhitelistZonesEx(ListWhitelistZonesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWhitelistZonesResponse>(DoRequest("1.0", "sofa.dtx.whitelist.zones.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹性位配置列表
         * Summary: 弹性位配置列表
         */
        public async Task<ListWhitelistZonesResponse> ListWhitelistZonesExAsync(ListWhitelistZonesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWhitelistZonesResponse>(await DoRequestAsync("1.0", "sofa.dtx.whitelist.zones.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
