// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.RMS.Models;

namespace AntChain.SDK.RMS
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
                        {"sdk_version", "1.3.273"},
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
                        {"sdk_version", "1.3.273"},
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
         * Description: /agent/logLocate
         * Summary: /agent/logLocate
         */
        public QueryRmsAgentloglocateResponse QueryRmsAgentloglocate(QueryRmsAgentloglocateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAgentloglocateEx(request, headers, runtime);
        }

        /**
         * Description: /agent/logLocate
         * Summary: /agent/logLocate
         */
        public async Task<QueryRmsAgentloglocateResponse> QueryRmsAgentloglocateAsync(QueryRmsAgentloglocateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAgentloglocateExAsync(request, headers, runtime);
        }

        /**
         * Description: /agent/logLocate
         * Summary: /agent/logLocate
         */
        public QueryRmsAgentloglocateResponse QueryRmsAgentloglocateEx(QueryRmsAgentloglocateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgentloglocateResponse>(DoRequest("1.0", "antcloud.monitor.rms.agentloglocate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /agent/logLocate
         * Summary: /agent/logLocate
         */
        public async Task<QueryRmsAgentloglocateResponse> QueryRmsAgentloglocateExAsync(QueryRmsAgentloglocateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgentloglocateResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.agentloglocate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /agent/tail
         * Summary: /agent/tail
         */
        public QueryRmsAgenttailResponse QueryRmsAgenttail(QueryRmsAgenttailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAgenttailEx(request, headers, runtime);
        }

        /**
         * Description: /agent/tail
         * Summary: /agent/tail
         */
        public async Task<QueryRmsAgenttailResponse> QueryRmsAgenttailAsync(QueryRmsAgenttailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAgenttailExAsync(request, headers, runtime);
        }

        /**
         * Description: /agent/tail
         * Summary: /agent/tail
         */
        public QueryRmsAgenttailResponse QueryRmsAgenttailEx(QueryRmsAgenttailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgenttailResponse>(DoRequest("1.0", "antcloud.monitor.rms.agenttail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /agent/tail
         * Summary: /agent/tail
         */
        public async Task<QueryRmsAgenttailResponse> QueryRmsAgenttailExAsync(QueryRmsAgenttailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgenttailResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.agenttail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /agent/browser
         * Summary: /agent/browser
         */
        public QueryRmsAgentbrowserResponse QueryRmsAgentbrowser(QueryRmsAgentbrowserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAgentbrowserEx(request, headers, runtime);
        }

        /**
         * Description: /agent/browser
         * Summary: /agent/browser
         */
        public async Task<QueryRmsAgentbrowserResponse> QueryRmsAgentbrowserAsync(QueryRmsAgentbrowserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAgentbrowserExAsync(request, headers, runtime);
        }

        /**
         * Description: /agent/browser
         * Summary: /agent/browser
         */
        public QueryRmsAgentbrowserResponse QueryRmsAgentbrowserEx(QueryRmsAgentbrowserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgentbrowserResponse>(DoRequest("1.0", "antcloud.monitor.rms.agentbrowser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /agent/browser
         * Summary: /agent/browser
         */
        public async Task<QueryRmsAgentbrowserResponse> QueryRmsAgentbrowserExAsync(QueryRmsAgentbrowserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAgentbrowserResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.agentbrowser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: rms.alarmhistorytype.query
         * Summary: alarmTypeStats
         */
        public QueryRmsAlarmhistorytypeResponse QueryRmsAlarmhistorytype(QueryRmsAlarmhistorytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAlarmhistorytypeEx(request, headers, runtime);
        }

        /**
         * Description: rms.alarmhistorytype.query
         * Summary: alarmTypeStats
         */
        public async Task<QueryRmsAlarmhistorytypeResponse> QueryRmsAlarmhistorytypeAsync(QueryRmsAlarmhistorytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAlarmhistorytypeExAsync(request, headers, runtime);
        }

        /**
         * Description: rms.alarmhistorytype.query
         * Summary: alarmTypeStats
         */
        public QueryRmsAlarmhistorytypeResponse QueryRmsAlarmhistorytypeEx(QueryRmsAlarmhistorytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistorytypeResponse>(DoRequest("1.0", "antcloud.monitor.rms.alarmhistorytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: rms.alarmhistorytype.query
         * Summary: alarmTypeStats
         */
        public async Task<QueryRmsAlarmhistorytypeResponse> QueryRmsAlarmhistorytypeExAsync(QueryRmsAlarmhistorytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistorytypeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.alarmhistorytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: alarmLevelStats
         * Summary: alarmLevelStats
         */
        public QueryRmsAlarmhistorylevelResponse QueryRmsAlarmhistorylevel(QueryRmsAlarmhistorylevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAlarmhistorylevelEx(request, headers, runtime);
        }

        /**
         * Description: alarmLevelStats
         * Summary: alarmLevelStats
         */
        public async Task<QueryRmsAlarmhistorylevelResponse> QueryRmsAlarmhistorylevelAsync(QueryRmsAlarmhistorylevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAlarmhistorylevelExAsync(request, headers, runtime);
        }

        /**
         * Description: alarmLevelStats
         * Summary: alarmLevelStats
         */
        public QueryRmsAlarmhistorylevelResponse QueryRmsAlarmhistorylevelEx(QueryRmsAlarmhistorylevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistorylevelResponse>(DoRequest("1.0", "antcloud.monitor.rms.alarmhistorylevel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: alarmLevelStats
         * Summary: alarmLevelStats
         */
        public async Task<QueryRmsAlarmhistorylevelResponse> QueryRmsAlarmhistorylevelExAsync(QueryRmsAlarmhistorylevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistorylevelResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.alarmhistorylevel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/notify/history
         * Summary: notifyHistoryStatsV2
         */
        public QueryRmsNotifyhistoryResponse QueryRmsNotifyhistory(QueryRmsNotifyhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsNotifyhistoryEx(request, headers, runtime);
        }

        /**
         * Description: /stats/notify/history
         * Summary: notifyHistoryStatsV2
         */
        public async Task<QueryRmsNotifyhistoryResponse> QueryRmsNotifyhistoryAsync(QueryRmsNotifyhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsNotifyhistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: /stats/notify/history
         * Summary: notifyHistoryStatsV2
         */
        public QueryRmsNotifyhistoryResponse QueryRmsNotifyhistoryEx(QueryRmsNotifyhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsNotifyhistoryResponse>(DoRequest("1.0", "antcloud.monitor.rms.notifyhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/notify/history
         * Summary: notifyHistoryStatsV2
         */
        public async Task<QueryRmsNotifyhistoryResponse> QueryRmsNotifyhistoryExAsync(QueryRmsNotifyhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsNotifyhistoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.notifyhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/stack/entity
         * Summary: stackEntityStats
         */
        public QueryRmsStackentityResponse QueryRmsStackentity(QueryRmsStackentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsStackentityEx(request, headers, runtime);
        }

        /**
         * Description: /stats/stack/entity
         * Summary: stackEntityStats
         */
        public async Task<QueryRmsStackentityResponse> QueryRmsStackentityAsync(QueryRmsStackentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsStackentityExAsync(request, headers, runtime);
        }

        /**
         * Description: /stats/stack/entity
         * Summary: stackEntityStats
         */
        public QueryRmsStackentityResponse QueryRmsStackentityEx(QueryRmsStackentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsStackentityResponse>(DoRequest("1.0", "antcloud.monitor.rms.stackentity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/stack/entity
         * Summary: stackEntityStats
         */
        public async Task<QueryRmsStackentityResponse> QueryRmsStackentityExAsync(QueryRmsStackentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsStackentityResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.stackentity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/alarm/history/appCount
         * Summary: alarmHistoryAppCount
         */
        public QueryRmsAlarmhistoryappcountResponse QueryRmsAlarmhistoryappcount(QueryRmsAlarmhistoryappcountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAlarmhistoryappcountEx(request, headers, runtime);
        }

        /**
         * Description: /stats/alarm/history/appCount
         * Summary: alarmHistoryAppCount
         */
        public async Task<QueryRmsAlarmhistoryappcountResponse> QueryRmsAlarmhistoryappcountAsync(QueryRmsAlarmhistoryappcountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAlarmhistoryappcountExAsync(request, headers, runtime);
        }

        /**
         * Description: /stats/alarm/history/appCount
         * Summary: alarmHistoryAppCount
         */
        public QueryRmsAlarmhistoryappcountResponse QueryRmsAlarmhistoryappcountEx(QueryRmsAlarmhistoryappcountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistoryappcountResponse>(DoRequest("1.0", "antcloud.monitor.rms.alarmhistoryappcount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /stats/alarm/history/appCount
         * Summary: alarmHistoryAppCount
         */
        public async Task<QueryRmsAlarmhistoryappcountResponse> QueryRmsAlarmhistoryappcountExAsync(QueryRmsAlarmhistoryappcountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistoryappcountResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.alarmhistoryappcount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /alarm/history/appStats
         * Summary: alarmHistoryAppStats
         */
        public QueryRmsAlarmhistoryappstatsResponse QueryRmsAlarmhistoryappstats(QueryRmsAlarmhistoryappstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAlarmhistoryappstatsEx(request, headers, runtime);
        }

        /**
         * Description: /alarm/history/appStats
         * Summary: alarmHistoryAppStats
         */
        public async Task<QueryRmsAlarmhistoryappstatsResponse> QueryRmsAlarmhistoryappstatsAsync(QueryRmsAlarmhistoryappstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAlarmhistoryappstatsExAsync(request, headers, runtime);
        }

        /**
         * Description: /alarm/history/appStats
         * Summary: alarmHistoryAppStats
         */
        public QueryRmsAlarmhistoryappstatsResponse QueryRmsAlarmhistoryappstatsEx(QueryRmsAlarmhistoryappstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistoryappstatsResponse>(DoRequest("1.0", "antcloud.monitor.rms.alarmhistoryappstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /alarm/history/appStats
         * Summary: alarmHistoryAppStats
         */
        public async Task<QueryRmsAlarmhistoryappstatsResponse> QueryRmsAlarmhistoryappstatsExAsync(QueryRmsAlarmhistoryappstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAlarmhistoryappstatsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.alarmhistoryappstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /alarm/history/appStatsPageable
         * Summary: appstatspageable
         */
        public QueryRmsAppstatspageableResponse QueryRmsAppstatspageable(QueryRmsAppstatspageableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsAppstatspageableEx(request, headers, runtime);
        }

        /**
         * Description: /alarm/history/appStatsPageable
         * Summary: appstatspageable
         */
        public async Task<QueryRmsAppstatspageableResponse> QueryRmsAppstatspageableAsync(QueryRmsAppstatspageableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsAppstatspageableExAsync(request, headers, runtime);
        }

        /**
         * Description: /alarm/history/appStatsPageable
         * Summary: appstatspageable
         */
        public QueryRmsAppstatspageableResponse QueryRmsAppstatspageableEx(QueryRmsAppstatspageableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAppstatspageableResponse>(DoRequest("1.0", "antcloud.monitor.rms.appstatspageable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /alarm/history/appStatsPageable
         * Summary: appstatspageable
         */
        public async Task<QueryRmsAppstatspageableResponse> QueryRmsAppstatspageableExAsync(QueryRmsAppstatspageableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsAppstatspageableResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.appstatspageable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /logread/error
         * Summary: /logread/error
         */
        public QueryRmsLogreaderrorResponse QueryRmsLogreaderror(QueryRmsLogreaderrorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsLogreaderrorEx(request, headers, runtime);
        }

        /**
         * Description: /logread/error
         * Summary: /logread/error
         */
        public async Task<QueryRmsLogreaderrorResponse> QueryRmsLogreaderrorAsync(QueryRmsLogreaderrorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsLogreaderrorExAsync(request, headers, runtime);
        }

        /**
         * Description: /logread/error
         * Summary: /logread/error
         */
        public QueryRmsLogreaderrorResponse QueryRmsLogreaderrorEx(QueryRmsLogreaderrorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsLogreaderrorResponse>(DoRequest("1.0", "antcloud.monitor.rms.logreaderror.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /logread/error
         * Summary: /logread/error
         */
        public async Task<QueryRmsLogreaderrorResponse> QueryRmsLogreaderrorExAsync(QueryRmsLogreaderrorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsLogreaderrorResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.logreaderror.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /universal/read
         * Summary: /universal/read
         */
        public QueryRmsUniversalreadResponse QueryRmsUniversalread(QueryRmsUniversalreadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsUniversalreadEx(request, headers, runtime);
        }

        /**
         * Description: /universal/read
         * Summary: /universal/read
         */
        public async Task<QueryRmsUniversalreadResponse> QueryRmsUniversalreadAsync(QueryRmsUniversalreadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsUniversalreadExAsync(request, headers, runtime);
        }

        /**
         * Description: /universal/read
         * Summary: /universal/read
         */
        public QueryRmsUniversalreadResponse QueryRmsUniversalreadEx(QueryRmsUniversalreadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalreadResponse>(DoRequest("1.0", "antcloud.monitor.rms.universalread.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /universal/read
         * Summary: /universal/read
         */
        public async Task<QueryRmsUniversalreadResponse> QueryRmsUniversalreadExAsync(QueryRmsUniversalreadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalreadResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.universalread.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /universal/write
         * Summary: /universal/write
         */
        public QueryRmsUniversalwriteResponse QueryRmsUniversalwrite(QueryRmsUniversalwriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsUniversalwriteEx(request, headers, runtime);
        }

        /**
         * Description: /universal/write
         * Summary: /universal/write
         */
        public async Task<QueryRmsUniversalwriteResponse> QueryRmsUniversalwriteAsync(QueryRmsUniversalwriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsUniversalwriteExAsync(request, headers, runtime);
        }

        /**
         * Description: /universal/write
         * Summary: /universal/write
         */
        public QueryRmsUniversalwriteResponse QueryRmsUniversalwriteEx(QueryRmsUniversalwriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalwriteResponse>(DoRequest("1.0", "antcloud.monitor.rms.universalwrite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /universal/write
         * Summary: /universal/write
         */
        public async Task<QueryRmsUniversalwriteResponse> QueryRmsUniversalwriteExAsync(QueryRmsUniversalwriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalwriteResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.universalwrite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/create
         * Summary: create
         */
        public CreateRmsPluginResponse CreateRmsPlugin(CreateRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/create
         * Summary: create
         */
        public async Task<CreateRmsPluginResponse> CreateRmsPluginAsync(CreateRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/create
         * Summary: create
         */
        public CreateRmsPluginResponse CreateRmsPluginEx(CreateRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/create
         * Summary: create
         */
        public async Task<CreateRmsPluginResponse> CreateRmsPluginExAsync(CreateRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/delete
         * Summary: delete
         */
        public DeleteRmsPluginResponse DeleteRmsPlugin(DeleteRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/delete
         * Summary: delete
         */
        public async Task<DeleteRmsPluginResponse> DeleteRmsPluginAsync(DeleteRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/delete
         * Summary: delete
         */
        public DeleteRmsPluginResponse DeleteRmsPluginEx(DeleteRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/delete
         * Summary: delete
         */
        public async Task<DeleteRmsPluginResponse> DeleteRmsPluginExAsync(DeleteRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/close
         * Summary: close
         */
        public CloseRmsPluginResponse CloseRmsPlugin(CloseRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/close
         * Summary: close
         */
        public async Task<CloseRmsPluginResponse> CloseRmsPluginAsync(CloseRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/close
         * Summary: close
         */
        public CloseRmsPluginResponse CloseRmsPluginEx(CloseRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/close
         * Summary: close
         */
        public async Task<CloseRmsPluginResponse> CloseRmsPluginExAsync(CloseRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/open
         * Summary: open
         */
        public OpenRmsPluginResponse OpenRmsPlugin(OpenRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/open
         * Summary: open
         */
        public async Task<OpenRmsPluginResponse> OpenRmsPluginAsync(OpenRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/open
         * Summary: open
         */
        public OpenRmsPluginResponse OpenRmsPluginEx(OpenRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/open
         * Summary: open
         */
        public async Task<OpenRmsPluginResponse> OpenRmsPluginExAsync(OpenRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/update
         * Summary: update
         */
        public UpdateRmsPluginResponse UpdateRmsPlugin(UpdateRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/update
         * Summary: update
         */
        public async Task<UpdateRmsPluginResponse> UpdateRmsPluginAsync(UpdateRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/update
         * Summary: update
         */
        public UpdateRmsPluginResponse UpdateRmsPluginEx(UpdateRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/update
         * Summary: update
         */
        public async Task<UpdateRmsPluginResponse> UpdateRmsPluginExAsync(UpdateRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/queryByPluginType
         * Summary: queryByPluginType
         */
        public QueryRmsPluginbytypeResponse QueryRmsPluginbytype(QueryRmsPluginbytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsPluginbytypeEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/queryByPluginType
         * Summary: queryByPluginType
         */
        public async Task<QueryRmsPluginbytypeResponse> QueryRmsPluginbytypeAsync(QueryRmsPluginbytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsPluginbytypeExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/queryByPluginType
         * Summary: queryByPluginType
         */
        public QueryRmsPluginbytypeResponse QueryRmsPluginbytypeEx(QueryRmsPluginbytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginbytypeResponse>(DoRequest("1.0", "antcloud.monitor.rms.pluginbytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/queryByPluginType
         * Summary: queryByPluginType
         */
        public async Task<QueryRmsPluginbytypeResponse> QueryRmsPluginbytypeExAsync(QueryRmsPluginbytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginbytypeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.pluginbytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/queryByFolder
         * Summary: queryByFolder
         */
        public QueryRmsPluginbyfolderResponse QueryRmsPluginbyfolder(QueryRmsPluginbyfolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsPluginbyfolderEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/queryByFolder
         * Summary: queryByFolder
         */
        public async Task<QueryRmsPluginbyfolderResponse> QueryRmsPluginbyfolderAsync(QueryRmsPluginbyfolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsPluginbyfolderExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/queryByFolder
         * Summary: queryByFolder
         */
        public QueryRmsPluginbyfolderResponse QueryRmsPluginbyfolderEx(QueryRmsPluginbyfolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginbyfolderResponse>(DoRequest("1.0", "antcloud.monitor.rms.pluginbyfolder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/queryByFolder
         * Summary: queryByFolder
         */
        public async Task<QueryRmsPluginbyfolderResponse> QueryRmsPluginbyfolderExAsync(QueryRmsPluginbyfolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginbyfolderResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.pluginbyfolder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/query
         * Summary: query
         */
        public QueryRmsPluginResponse QueryRmsPlugin(QueryRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsPluginEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/query
         * Summary: query
         */
        public async Task<QueryRmsPluginResponse> QueryRmsPluginAsync(QueryRmsPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsPluginExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/query
         * Summary: query
         */
        public QueryRmsPluginResponse QueryRmsPluginEx(QueryRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/query
         * Summary: query
         */
        public async Task<QueryRmsPluginResponse> QueryRmsPluginExAsync(QueryRmsPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/querytest
         * Summary: querytest
         */
        public QueryRmsPlugintestResponse QueryRmsPlugintest(QueryRmsPlugintestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsPlugintestEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/querytest
         * Summary: querytest
         */
        public async Task<QueryRmsPlugintestResponse> QueryRmsPlugintestAsync(QueryRmsPlugintestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsPlugintestExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/plugin/querytest
         * Summary: querytest
         */
        public QueryRmsPlugintestResponse QueryRmsPlugintestEx(QueryRmsPlugintestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPlugintestResponse>(DoRequest("1.0", "antcloud.monitor.rms.plugintest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/plugin/querytest
         * Summary: querytest
         */
        public async Task<QueryRmsPlugintestResponse> QueryRmsPlugintestExAsync(QueryRmsPlugintestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPlugintestResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.plugintest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/folder/path
         * Summary: queryPath
         */
        public QueryRmsPathResponse QueryRmsPath(QueryRmsPathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsPathEx(request, headers, runtime);
        }

        /**
         * Description: /modeling/folder/path
         * Summary: queryPath
         */
        public async Task<QueryRmsPathResponse> QueryRmsPathAsync(QueryRmsPathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsPathExAsync(request, headers, runtime);
        }

        /**
         * Description: /modeling/folder/path
         * Summary: queryPath
         */
        public QueryRmsPathResponse QueryRmsPathEx(QueryRmsPathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPathResponse>(DoRequest("1.0", "antcloud.monitor.rms.path.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /modeling/folder/path
         * Summary: queryPath
         */
        public async Task<QueryRmsPathResponse> QueryRmsPathExAsync(QueryRmsPathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsPathResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.path.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /{tenantId}/webapi/cleankey
         * Summary: cleankey
         */
        public ExecRmsUniversalcleankeyResponse ExecRmsUniversalcleankey(ExecRmsUniversalcleankeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRmsUniversalcleankeyEx(request, headers, runtime);
        }

        /**
         * Description: /{tenantId}/webapi/cleankey
         * Summary: cleankey
         */
        public async Task<ExecRmsUniversalcleankeyResponse> ExecRmsUniversalcleankeyAsync(ExecRmsUniversalcleankeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRmsUniversalcleankeyExAsync(request, headers, runtime);
        }

        /**
         * Description: /{tenantId}/webapi/cleankey
         * Summary: cleankey
         */
        public ExecRmsUniversalcleankeyResponse ExecRmsUniversalcleankeyEx(ExecRmsUniversalcleankeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRmsUniversalcleankeyResponse>(DoRequest("1.0", "antcloud.monitor.rms.universalcleankey.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /{tenantId}/webapi/cleankey
         * Summary: cleankey
         */
        public async Task<ExecRmsUniversalcleankeyResponse> ExecRmsUniversalcleankeyExAsync(ExecRmsUniversalcleankeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRmsUniversalcleankeyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.universalcleankey.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /{tenantId}/universalQuery
         * Summary: universalQuery
         */
        public QueryRmsUniversalResponse QueryRmsUniversal(QueryRmsUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsUniversalEx(request, headers, runtime);
        }

        /**
         * Description: /{tenantId}/universalQuery
         * Summary: universalQuery
         */
        public async Task<QueryRmsUniversalResponse> QueryRmsUniversalAsync(QueryRmsUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsUniversalExAsync(request, headers, runtime);
        }

        /**
         * Description: /{tenantId}/universalQuery
         * Summary: universalQuery
         */
        public QueryRmsUniversalResponse QueryRmsUniversalEx(QueryRmsUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalResponse>(DoRequest("1.0", "antcloud.monitor.rms.universal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /{tenantId}/universalQuery
         * Summary: universalQuery
         */
        public async Task<QueryRmsUniversalResponse> QueryRmsUniversalExAsync(QueryRmsUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsUniversalResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.universal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路搜索
         * Summary: 链路搜索
         */
        public QueryRmsTracespanResponse QueryRmsTracespan(QueryRmsTracespanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRmsTracespanEx(request, headers, runtime);
        }

        /**
         * Description: 链路搜索
         * Summary: 链路搜索
         */
        public async Task<QueryRmsTracespanResponse> QueryRmsTracespanAsync(QueryRmsTracespanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRmsTracespanExAsync(request, headers, runtime);
        }

        /**
         * Description: 链路搜索
         * Summary: 链路搜索
         */
        public QueryRmsTracespanResponse QueryRmsTracespanEx(QueryRmsTracespanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsTracespanResponse>(DoRequest("1.0", "antcloud.monitor.rms.tracespan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路搜索
         * Summary: 链路搜索
         */
        public async Task<QueryRmsTracespanResponse> QueryRmsTracespanExAsync(QueryRmsTracespanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRmsTracespanResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.tracespan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路搜索页面的配置
         * Summary: 查询链路搜索页面的配置
         */
        public GetRmsTracespanqueryconfigResponse GetRmsTracespanqueryconfig(GetRmsTracespanqueryconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRmsTracespanqueryconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询链路搜索页面的配置
         * Summary: 查询链路搜索页面的配置
         */
        public async Task<GetRmsTracespanqueryconfigResponse> GetRmsTracespanqueryconfigAsync(GetRmsTracespanqueryconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRmsTracespanqueryconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链路搜索页面的配置
         * Summary: 查询链路搜索页面的配置
         */
        public GetRmsTracespanqueryconfigResponse GetRmsTracespanqueryconfigEx(GetRmsTracespanqueryconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRmsTracespanqueryconfigResponse>(DoRequest("1.0", "antcloud.monitor.rms.tracespanqueryconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路搜索页面的配置
         * Summary: 查询链路搜索页面的配置
         */
        public async Task<GetRmsTracespanqueryconfigResponse> GetRmsTracespanqueryconfigExAsync(GetRmsTracespanqueryconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRmsTracespanqueryconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.tracespanqueryconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单链路树状图查询
         * Summary: 单链路树状图查询
         */
        public DescribeRmsTracetreeResponse DescribeRmsTracetree(DescribeRmsTracetreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeRmsTracetreeEx(request, headers, runtime);
        }

        /**
         * Description: 单链路树状图查询
         * Summary: 单链路树状图查询
         */
        public async Task<DescribeRmsTracetreeResponse> DescribeRmsTracetreeAsync(DescribeRmsTracetreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeRmsTracetreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 单链路树状图查询
         * Summary: 单链路树状图查询
         */
        public DescribeRmsTracetreeResponse DescribeRmsTracetreeEx(DescribeRmsTracetreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTracetreeResponse>(DoRequest("1.0", "antcloud.monitor.rms.tracetree.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单链路树状图查询
         * Summary: 单链路树状图查询
         */
        public async Task<DescribeRmsTracetreeResponse> DescribeRmsTracetreeExAsync(DescribeRmsTracetreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTracetreeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.tracetree.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 商品补全接口
         * Summary: 南天门 - 商品补全接口
         */
        public CallbackSpiCompletecommodityResponse CallbackSpiCompletecommodity(CallbackSpiCompletecommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiCompletecommodityEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 商品补全接口
         * Summary: 南天门 - 商品补全接口
         */
        public async Task<CallbackSpiCompletecommodityResponse> CallbackSpiCompletecommodityAsync(CallbackSpiCompletecommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiCompletecommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 商品补全接口
         * Summary: 南天门 - 商品补全接口
         */
        public CallbackSpiCompletecommodityResponse CallbackSpiCompletecommodityEx(CallbackSpiCompletecommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiCompletecommodityResponse>(DoRequest("1.0", "antcloud.monitor.spi.completecommodity.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 商品补全接口
         * Summary: 南天门 - 商品补全接口
         */
        public async Task<CallbackSpiCompletecommodityResponse> CallbackSpiCompletecommodityExAsync(CallbackSpiCompletecommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiCompletecommodityResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.completecommodity.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 支付后回调
         * Summary: 南天门 - 支付后回调
         */
        public CallbackSpiPayordercallbackResponse CallbackSpiPayordercallback(CallbackSpiPayordercallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiPayordercallbackEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 支付后回调
         * Summary: 南天门 - 支付后回调
         */
        public async Task<CallbackSpiPayordercallbackResponse> CallbackSpiPayordercallbackAsync(CallbackSpiPayordercallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiPayordercallbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 支付后回调
         * Summary: 南天门 - 支付后回调
         */
        public CallbackSpiPayordercallbackResponse CallbackSpiPayordercallbackEx(CallbackSpiPayordercallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiPayordercallbackResponse>(DoRequest("1.0", "antcloud.monitor.spi.payordercallback.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 支付后回调
         * Summary: 南天门 - 支付后回调
         */
        public async Task<CallbackSpiPayordercallbackResponse> CallbackSpiPayordercallbackExAsync(CallbackSpiPayordercallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiPayordercallbackResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.payordercallback.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 补全订单
         * Summary: 南天门 - 补全订单
         */
        public CallbackSpiCompleteorderparamResponse CallbackSpiCompleteorderparam(CallbackSpiCompleteorderparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiCompleteorderparamEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 补全订单
         * Summary: 南天门 - 补全订单
         */
        public async Task<CallbackSpiCompleteorderparamResponse> CallbackSpiCompleteorderparamAsync(CallbackSpiCompleteorderparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiCompleteorderparamExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 补全订单
         * Summary: 南天门 - 补全订单
         */
        public CallbackSpiCompleteorderparamResponse CallbackSpiCompleteorderparamEx(CallbackSpiCompleteorderparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiCompleteorderparamResponse>(DoRequest("1.0", "antcloud.monitor.spi.completeorderparam.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 补全订单
         * Summary: 南天门 - 补全订单
         */
        public async Task<CallbackSpiCompleteorderparamResponse> CallbackSpiCompleteorderparamExAsync(CallbackSpiCompleteorderparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiCompleteorderparamResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.completeorderparam.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 订单校验回调
         * Summary: 南天门 - 订单校验回调
         */
        public CallbackSpiVerifyResponse CallbackSpiVerify(CallbackSpiVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 订单校验回调
         * Summary: 南天门 - 订单校验回调
         */
        public async Task<CallbackSpiVerifyResponse> CallbackSpiVerifyAsync(CallbackSpiVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 订单校验回调
         * Summary: 南天门 - 订单校验回调
         */
        public CallbackSpiVerifyResponse CallbackSpiVerifyEx(CallbackSpiVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiVerifyResponse>(DoRequest("1.0", "antcloud.monitor.spi.verify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 订单校验回调
         * Summary: 南天门 - 订单校验回调
         */
        public async Task<CallbackSpiVerifyResponse> CallbackSpiVerifyExAsync(CallbackSpiVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiVerifyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.verify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 退款
         * Summary: 南天门 - 退款
         */
        public CallbackSpiRefundResponse CallbackSpiRefund(CallbackSpiRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiRefundEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 退款
         * Summary: 南天门 - 退款
         */
        public async Task<CallbackSpiRefundResponse> CallbackSpiRefundAsync(CallbackSpiRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 退款
         * Summary: 南天门 - 退款
         */
        public CallbackSpiRefundResponse CallbackSpiRefundEx(CallbackSpiRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiRefundResponse>(DoRequest("1.0", "antcloud.monitor.spi.refund.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 退款
         * Summary: 南天门 - 退款
         */
        public async Task<CallbackSpiRefundResponse> CallbackSpiRefundExAsync(CallbackSpiRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiRefundResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.refund.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 商品实例生命周期回调
         * Summary: 南天门 - 商品实例生命周期回调
         */
        public CallbackSpiLifecycleResponse CallbackSpiLifecycle(CallbackSpiLifecycleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiLifecycleEx(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 商品实例生命周期回调
         * Summary: 南天门 - 商品实例生命周期回调
         */
        public async Task<CallbackSpiLifecycleResponse> CallbackSpiLifecycleAsync(CallbackSpiLifecycleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiLifecycleExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门 - 商品实例生命周期回调
         * Summary: 南天门 - 商品实例生命周期回调
         */
        public CallbackSpiLifecycleResponse CallbackSpiLifecycleEx(CallbackSpiLifecycleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiLifecycleResponse>(DoRequest("1.0", "antcloud.monitor.spi.lifecycle.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门 - 商品实例生命周期回调
         * Summary: 南天门 - 商品实例生命周期回调
         */
        public async Task<CallbackSpiLifecycleResponse> CallbackSpiLifecycleExAsync(CallbackSpiLifecycleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiLifecycleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.spi.lifecycle.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询时序指标
         * Summary: 查询时序指标
         */
        public DescribeRmsTimeseriesmetricsResponse DescribeRmsTimeseriesmetrics(DescribeRmsTimeseriesmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeRmsTimeseriesmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询时序指标
         * Summary: 查询时序指标
         */
        public async Task<DescribeRmsTimeseriesmetricsResponse> DescribeRmsTimeseriesmetricsAsync(DescribeRmsTimeseriesmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeRmsTimeseriesmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询时序指标
         * Summary: 查询时序指标
         */
        public DescribeRmsTimeseriesmetricsResponse DescribeRmsTimeseriesmetricsEx(DescribeRmsTimeseriesmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTimeseriesmetricsResponse>(DoRequest("1.0", "antcloud.monitor.rms.timeseriesmetrics.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询时序指标
         * Summary: 查询时序指标
         */
        public async Task<DescribeRmsTimeseriesmetricsResponse> DescribeRmsTimeseriesmetricsExAsync(DescribeRmsTimeseriesmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTimeseriesmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.timeseriesmetrics.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取调用拓扑
         * Summary: 获取调用拓扑
         */
        public DescribeRmsTopologyResponse DescribeRmsTopology(DescribeRmsTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeRmsTopologyEx(request, headers, runtime);
        }

        /**
         * Description: 获取调用拓扑
         * Summary: 获取调用拓扑
         */
        public async Task<DescribeRmsTopologyResponse> DescribeRmsTopologyAsync(DescribeRmsTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeRmsTopologyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取调用拓扑
         * Summary: 获取调用拓扑
         */
        public DescribeRmsTopologyResponse DescribeRmsTopologyEx(DescribeRmsTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTopologyResponse>(DoRequest("1.0", "antcloud.monitor.rms.topology.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取调用拓扑
         * Summary: 获取调用拓扑
         */
        public async Task<DescribeRmsTopologyResponse> DescribeRmsTopologyExAsync(DescribeRmsTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeRmsTopologyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.rms.topology.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控指标数据查询
         * Summary: 监控指标数据查询
         */
        public QueryMetricsResponse QueryMetrics(QueryMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsEx(request, headers, runtime);
        }

        /**
         * Description: 监控指标数据查询
         * Summary: 监控指标数据查询
         */
        public async Task<QueryMetricsResponse> QueryMetricsAsync(QueryMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 监控指标数据查询
         * Summary: 监控指标数据查询
         */
        public QueryMetricsResponse QueryMetricsEx(QueryMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsResponse>(DoRequest("1.0", "antcloud.monitor.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控指标数据查询
         * Summary: 监控指标数据查询
         */
        public async Task<QueryMetricsResponse> QueryMetricsExAsync(QueryMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路Span查询搜索
         * Summary: 链路查询
         */
        public QueryTraceSpanResponse QueryTraceSpan(QueryTraceSpanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceSpanEx(request, headers, runtime);
        }

        /**
         * Description: 链路Span查询搜索
         * Summary: 链路查询
         */
        public async Task<QueryTraceSpanResponse> QueryTraceSpanAsync(QueryTraceSpanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceSpanExAsync(request, headers, runtime);
        }

        /**
         * Description: 链路Span查询搜索
         * Summary: 链路查询
         */
        public QueryTraceSpanResponse QueryTraceSpanEx(QueryTraceSpanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceSpanResponse>(DoRequest("1.0", "antcloud.monitor.trace.span.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路Span查询搜索
         * Summary: 链路查询
         */
        public async Task<QueryTraceSpanResponse> QueryTraceSpanExAsync(QueryTraceSpanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceSpanResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.span.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public ListAppNameResponse ListAppName(ListAppNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppNameEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListAppNameResponse> ListAppNameAsync(ListAppNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppNameExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public ListAppNameResponse ListAppNameEx(ListAppNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppNameResponse>(DoRequest("1.0", "antcloud.monitor.app.name.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListAppNameResponse> ListAppNameExAsync(ListAppNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppNameResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.name.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义监控指标
         * Summary: 创建自定义监控指标
         */
        public CreateCustompluginResponse CreateCustomplugin(CreateCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCustompluginEx(request, headers, runtime);
        }

        /**
         * Description: 创建自定义监控指标
         * Summary: 创建自定义监控指标
         */
        public async Task<CreateCustompluginResponse> CreateCustompluginAsync(CreateCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建自定义监控指标
         * Summary: 创建自定义监控指标
         */
        public CreateCustompluginResponse CreateCustompluginEx(CreateCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义监控指标
         * Summary: 创建自定义监控指标
         */
        public async Task<CreateCustompluginResponse> CreateCustompluginExAsync(CreateCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除自定义监控指标
         * Summary: 删除自定义监控指标
         */
        public DeleteCustompluginResponse DeleteCustomplugin(DeleteCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCustompluginEx(request, headers, runtime);
        }

        /**
         * Description: 删除自定义监控指标
         * Summary: 删除自定义监控指标
         */
        public async Task<DeleteCustompluginResponse> DeleteCustompluginAsync(DeleteCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除自定义监控指标
         * Summary: 删除自定义监控指标
         */
        public DeleteCustompluginResponse DeleteCustompluginEx(DeleteCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除自定义监控指标
         * Summary: 删除自定义监控指标
         */
        public async Task<DeleteCustompluginResponse> DeleteCustompluginExAsync(DeleteCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义监控 - 添加文件夹
         * Summary: 自定义监控 - 添加文件夹
         */
        public CreateFolderResponse CreateFolder(CreateFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFolderEx(request, headers, runtime);
        }

        /**
         * Description: 自定义监控 - 添加文件夹
         * Summary: 自定义监控 - 添加文件夹
         */
        public async Task<CreateFolderResponse> CreateFolderAsync(CreateFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFolderExAsync(request, headers, runtime);
        }

        /**
         * Description: 自定义监控 - 添加文件夹
         * Summary: 自定义监控 - 添加文件夹
         */
        public CreateFolderResponse CreateFolderEx(CreateFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFolderResponse>(DoRequest("1.0", "antcloud.monitor.folder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义监控 - 添加文件夹
         * Summary: 自定义监控 - 添加文件夹
         */
        public async Task<CreateFolderResponse> CreateFolderExAsync(CreateFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFolderResponse>(await DoRequestAsync("1.0", "antcloud.monitor.folder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义监控 - 文件夹更新
         * Summary: 自定义监控 - 文件夹更新
         */
        public UpdateFolderResponse UpdateFolder(UpdateFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFolderEx(request, headers, runtime);
        }

        /**
         * Description: 自定义监控 - 文件夹更新
         * Summary: 自定义监控 - 文件夹更新
         */
        public async Task<UpdateFolderResponse> UpdateFolderAsync(UpdateFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFolderExAsync(request, headers, runtime);
        }

        /**
         * Description: 自定义监控 - 文件夹更新
         * Summary: 自定义监控 - 文件夹更新
         */
        public UpdateFolderResponse UpdateFolderEx(UpdateFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFolderResponse>(DoRequest("1.0", "antcloud.monitor.folder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义监控 - 文件夹更新
         * Summary: 自定义监控 - 文件夹更新
         */
        public async Task<UpdateFolderResponse> UpdateFolderExAsync(UpdateFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFolderResponse>(await DoRequestAsync("1.0", "antcloud.monitor.folder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路查询时可选参数的配置查询
         * Summary: 链路查询时可选参数的配置查询
         */
        public QueryTraceConfigResponse QueryTraceConfig(QueryTraceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceConfigEx(request, headers, runtime);
        }

        /**
         * Description: 链路查询时可选参数的配置查询
         * Summary: 链路查询时可选参数的配置查询
         */
        public async Task<QueryTraceConfigResponse> QueryTraceConfigAsync(QueryTraceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 链路查询时可选参数的配置查询
         * Summary: 链路查询时可选参数的配置查询
         */
        public QueryTraceConfigResponse QueryTraceConfigEx(QueryTraceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceConfigResponse>(DoRequest("1.0", "antcloud.monitor.trace.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路查询时可选参数的配置查询
         * Summary: 链路查询时可选参数的配置查询
         */
        public async Task<QueryTraceConfigResponse> QueryTraceConfigExAsync(QueryTraceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件夹路径
         * Summary: 查询文件夹路径
         */
        public QueryFolderPathResponse QueryFolderPath(QueryFolderPathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFolderPathEx(request, headers, runtime);
        }

        /**
         * Description: 查询文件夹路径
         * Summary: 查询文件夹路径
         */
        public async Task<QueryFolderPathResponse> QueryFolderPathAsync(QueryFolderPathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFolderPathExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询文件夹路径
         * Summary: 查询文件夹路径
         */
        public QueryFolderPathResponse QueryFolderPathEx(QueryFolderPathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFolderPathResponse>(DoRequest("1.0", "antcloud.monitor.folder.path.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件夹路径
         * Summary: 查询文件夹路径
         */
        public async Task<QueryFolderPathResponse> QueryFolderPathExAsync(QueryFolderPathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFolderPathResponse>(await DoRequestAsync("1.0", "antcloud.monitor.folder.path.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路详情
         * Summary: 查询链路详情
         */
        public QueryTraceDetailResponse QueryTraceDetail(QueryTraceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceDetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询链路详情
         * Summary: 查询链路详情
         */
        public async Task<QueryTraceDetailResponse> QueryTraceDetailAsync(QueryTraceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链路详情
         * Summary: 查询链路详情
         */
        public QueryTraceDetailResponse QueryTraceDetailEx(QueryTraceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceDetailResponse>(DoRequest("1.0", "antcloud.monitor.trace.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路详情
         * Summary: 查询链路详情
         */
        public async Task<QueryTraceDetailResponse> QueryTraceDetailExAsync(QueryTraceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceDetailResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路拓扑图
         * Summary: 获取链路拓扑图
         */
        public QueryTraceTopologyResponse QueryTraceTopology(QueryTraceTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceTopologyEx(request, headers, runtime);
        }

        /**
         * Description: 获取链路拓扑图
         * Summary: 获取链路拓扑图
         */
        public async Task<QueryTraceTopologyResponse> QueryTraceTopologyAsync(QueryTraceTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceTopologyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链路拓扑图
         * Summary: 获取链路拓扑图
         */
        public QueryTraceTopologyResponse QueryTraceTopologyEx(QueryTraceTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceTopologyResponse>(DoRequest("1.0", "antcloud.monitor.trace.topology.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路拓扑图
         * Summary: 获取链路拓扑图
         */
        public async Task<QueryTraceTopologyResponse> QueryTraceTopologyExAsync(QueryTraceTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceTopologyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.topology.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路关联指标
         * Summary: 查询链路关联指标
         */
        public QueryTraceMetricsResponse QueryTraceMetrics(QueryTraceMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceMetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询链路关联指标
         * Summary: 查询链路关联指标
         */
        public async Task<QueryTraceMetricsResponse> QueryTraceMetricsAsync(QueryTraceMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceMetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链路关联指标
         * Summary: 查询链路关联指标
         */
        public QueryTraceMetricsResponse QueryTraceMetricsEx(QueryTraceMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceMetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路关联指标
         * Summary: 查询链路关联指标
         */
        public async Task<QueryTraceMetricsResponse> QueryTraceMetricsExAsync(QueryTraceMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceMetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取自定义监控指标详情
         * Summary: 获取自定义监控指标详情
         */
        public GetCustompluginResponse GetCustomplugin(GetCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCustompluginEx(request, headers, runtime);
        }

        /**
         * Description: 获取自定义监控指标详情
         * Summary: 获取自定义监控指标详情
         */
        public async Task<GetCustompluginResponse> GetCustompluginAsync(GetCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取自定义监控指标详情
         * Summary: 获取自定义监控指标详情
         */
        public GetCustompluginResponse GetCustompluginEx(GetCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取自定义监控指标详情
         * Summary: 获取自定义监控指标详情
         */
        public async Task<GetCustompluginResponse> GetCustompluginExAsync(GetCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用监控
         * Summary: 查询应用监控
         */
        public QueryAppResponse QueryApp(QueryAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用监控
         * Summary: 查询应用监控
         */
        public async Task<QueryAppResponse> QueryAppAsync(QueryAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用监控
         * Summary: 查询应用监控
         */
        public QueryAppResponse QueryAppEx(QueryAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppResponse>(DoRequest("1.0", "antcloud.monitor.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用监控
         * Summary: 查询应用监控
         */
        public async Task<QueryAppResponse> QueryAppExAsync(QueryAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户收藏资源状态
         * Summary: 获取用户收藏资源状态
         */
        public GetUserFavoriteResponse GetUserFavorite(GetUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUserFavoriteEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户收藏资源状态
         * Summary: 获取用户收藏资源状态
         */
        public async Task<GetUserFavoriteResponse> GetUserFavoriteAsync(GetUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUserFavoriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户收藏资源状态
         * Summary: 获取用户收藏资源状态
         */
        public GetUserFavoriteResponse GetUserFavoriteEx(GetUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserFavoriteResponse>(DoRequest("1.0", "antcloud.monitor.user.favorite.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户收藏资源状态
         * Summary: 获取用户收藏资源状态
         */
        public async Task<GetUserFavoriteResponse> GetUserFavoriteExAsync(GetUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserFavoriteResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.favorite.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件夹列表
         * Summary: 查询文件夹列表
         */
        public QueryFolderResponse QueryFolder(QueryFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFolderEx(request, headers, runtime);
        }

        /**
         * Description: 查询文件夹列表
         * Summary: 查询文件夹列表
         */
        public async Task<QueryFolderResponse> QueryFolderAsync(QueryFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFolderExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询文件夹列表
         * Summary: 查询文件夹列表
         */
        public QueryFolderResponse QueryFolderEx(QueryFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFolderResponse>(DoRequest("1.0", "antcloud.monitor.folder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件夹列表
         * Summary: 查询文件夹列表
         */
        public async Task<QueryFolderResponse> QueryFolderExAsync(QueryFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFolderResponse>(await DoRequestAsync("1.0", "antcloud.monitor.folder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询自定义监控配置列表
         * Summary:  查询自定义监控配置列表
         */
        public QueryCustompluginResponse QueryCustomplugin(QueryCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCustompluginEx(request, headers, runtime);
        }

        /**
         * Description:  查询自定义监控配置列表
         * Summary:  查询自定义监控配置列表
         */
        public async Task<QueryCustompluginResponse> QueryCustompluginAsync(QueryCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description:  查询自定义监控配置列表
         * Summary:  查询自定义监控配置列表
         */
        public QueryCustompluginResponse QueryCustompluginEx(QueryCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询自定义监控配置列表
         * Summary:  查询自定义监控配置列表
         */
        public async Task<QueryCustompluginResponse> QueryCustompluginExAsync(QueryCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户收藏列表
         * Summary: 查询用户收藏列表
         */
        public QueryUserFavoriteResponse QueryUserFavorite(QueryUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserFavoriteEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户收藏列表
         * Summary: 查询用户收藏列表
         */
        public async Task<QueryUserFavoriteResponse> QueryUserFavoriteAsync(QueryUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserFavoriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户收藏列表
         * Summary: 查询用户收藏列表
         */
        public QueryUserFavoriteResponse QueryUserFavoriteEx(QueryUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserFavoriteResponse>(DoRequest("1.0", "antcloud.monitor.user.favorite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户收藏列表
         * Summary: 查询用户收藏列表
         */
        public async Task<QueryUserFavoriteResponse> QueryUserFavoriteExAsync(QueryUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserFavoriteResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.favorite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警暂停列表查询
         * Summary: 告警暂停列表查询
         */
        public QueryAlarmPauseResponse QueryAlarmPause(QueryAlarmPauseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmPauseEx(request, headers, runtime);
        }

        /**
         * Description: 告警暂停列表查询
         * Summary: 告警暂停列表查询
         */
        public async Task<QueryAlarmPauseResponse> QueryAlarmPauseAsync(QueryAlarmPauseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmPauseExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警暂停列表查询
         * Summary: 告警暂停列表查询
         */
        public QueryAlarmPauseResponse QueryAlarmPauseEx(QueryAlarmPauseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmPauseResponse>(DoRequest("1.0", "antcloud.monitor.alarm.pause.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警暂停列表查询
         * Summary: 告警暂停列表查询
         */
        public async Task<QueryAlarmPauseResponse> QueryAlarmPauseExAsync(QueryAlarmPauseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmPauseResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.pause.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取告警应用统计信息
         * Summary: 获取告警应用统计信息
         */
        public CountAlarmAppResponse CountAlarmApp(CountAlarmAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountAlarmAppEx(request, headers, runtime);
        }

        /**
         * Description: 获取告警应用统计信息
         * Summary: 获取告警应用统计信息
         */
        public async Task<CountAlarmAppResponse> CountAlarmAppAsync(CountAlarmAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountAlarmAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取告警应用统计信息
         * Summary: 获取告警应用统计信息
         */
        public CountAlarmAppResponse CountAlarmAppEx(CountAlarmAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAlarmAppResponse>(DoRequest("1.0", "antcloud.monitor.alarm.app.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取告警应用统计信息
         * Summary: 获取告警应用统计信息
         */
        public async Task<CountAlarmAppResponse> CountAlarmAppExAsync(CountAlarmAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAlarmAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.app.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警应用关联Map
         * Summary: 查询告警应用关联Map
         */
        public QueryAlarmApprelationResponse QueryAlarmApprelation(QueryAlarmApprelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmApprelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警应用关联Map
         * Summary: 查询告警应用关联Map
         */
        public async Task<QueryAlarmApprelationResponse> QueryAlarmApprelationAsync(QueryAlarmApprelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmApprelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警应用关联Map
         * Summary: 查询告警应用关联Map
         */
        public QueryAlarmApprelationResponse QueryAlarmApprelationEx(QueryAlarmApprelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmApprelationResponse>(DoRequest("1.0", "antcloud.monitor.alarm.apprelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警应用关联Map
         * Summary: 查询告警应用关联Map
         */
        public async Task<QueryAlarmApprelationResponse> QueryAlarmApprelationExAsync(QueryAlarmApprelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmApprelationResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.apprelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询栈配置
         * Summary: 批量查询栈配置
         */
        public BatchqueryStackGeneratedconfigResponse BatchqueryStackGeneratedconfig(BatchqueryStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryStackGeneratedconfigEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询栈配置
         * Summary: 批量查询栈配置
         */
        public async Task<BatchqueryStackGeneratedconfigResponse> BatchqueryStackGeneratedconfigAsync(BatchqueryStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryStackGeneratedconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询栈配置
         * Summary: 批量查询栈配置
         */
        public BatchqueryStackGeneratedconfigResponse BatchqueryStackGeneratedconfigEx(BatchqueryStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryStackGeneratedconfigResponse>(DoRequest("1.0", "antcloud.monitor.stack.generatedconfig.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询栈配置
         * Summary: 批量查询栈配置
         */
        public async Task<BatchqueryStackGeneratedconfigResponse> BatchqueryStackGeneratedconfigExAsync(BatchqueryStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryStackGeneratedconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.stack.generatedconfig.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取大盘列表
         * Summary: 获取大盘列表
         */
        public ListDashboardResponse ListDashboard(ListDashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDashboardEx(request, headers, runtime);
        }

        /**
         * Description: 获取大盘列表
         * Summary: 获取大盘列表
         */
        public async Task<ListDashboardResponse> ListDashboardAsync(ListDashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDashboardExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取大盘列表
         * Summary: 获取大盘列表
         */
        public ListDashboardResponse ListDashboardEx(ListDashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDashboardResponse>(DoRequest("1.0", "antcloud.monitor.dashboard.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取大盘列表
         * Summary: 获取大盘列表
         */
        public async Task<ListDashboardResponse> ListDashboardExAsync(ListDashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.dashboard.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询技术栈配置详情
         * Summary: 查询技术栈配置详情
         */
        public QueryStackGeneratedconfigResponse QueryStackGeneratedconfig(QueryStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStackGeneratedconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询技术栈配置详情
         * Summary: 查询技术栈配置详情
         */
        public async Task<QueryStackGeneratedconfigResponse> QueryStackGeneratedconfigAsync(QueryStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStackGeneratedconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询技术栈配置详情
         * Summary: 查询技术栈配置详情
         */
        public QueryStackGeneratedconfigResponse QueryStackGeneratedconfigEx(QueryStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackGeneratedconfigResponse>(DoRequest("1.0", "antcloud.monitor.stack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询技术栈配置详情
         * Summary: 查询技术栈配置详情
         */
        public async Task<QueryStackGeneratedconfigResponse> QueryStackGeneratedconfigExAsync(QueryStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackGeneratedconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.stack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控项
         * Summary: 查询监控项
         */
        public QueryStackMonitoritemResponse QueryStackMonitoritem(QueryStackMonitoritemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStackMonitoritemEx(request, headers, runtime);
        }

        /**
         * Description: 查询监控项
         * Summary: 查询监控项
         */
        public async Task<QueryStackMonitoritemResponse> QueryStackMonitoritemAsync(QueryStackMonitoritemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStackMonitoritemExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询监控项
         * Summary: 查询监控项
         */
        public QueryStackMonitoritemResponse QueryStackMonitoritemEx(QueryStackMonitoritemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackMonitoritemResponse>(DoRequest("1.0", "antcloud.monitor.stack.monitoritem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控项
         * Summary: 查询监控项
         */
        public async Task<QueryStackMonitoritemResponse> QueryStackMonitoritemExAsync(QueryStackMonitoritemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackMonitoritemResponse>(await DoRequestAsync("1.0", "antcloud.monitor.stack.monitoritem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询通知组
         * Summary: 分页查询通知组
         */
        public QueryUsergroupResponse QueryUsergroup(QueryUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsergroupEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询通知组
         * Summary: 分页查询通知组
         */
        public async Task<QueryUsergroupResponse> QueryUsergroupAsync(QueryUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询通知组
         * Summary: 分页查询通知组
         */
        public QueryUsergroupResponse QueryUsergroupEx(QueryUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsergroupResponse>(DoRequest("1.0", "antcloud.monitor.usergroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询通知组
         * Summary: 分页查询通知组
         */
        public async Task<QueryUsergroupResponse> QueryUsergroupExAsync(QueryUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsergroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.usergroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通知组
         * Summary: 创建通知组
         */
        public CreateUsergroupResponse CreateUsergroup(CreateUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUsergroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建通知组
         * Summary: 创建通知组
         */
        public async Task<CreateUsergroupResponse> CreateUsergroupAsync(CreateUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUsergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建通知组
         * Summary: 创建通知组
         */
        public CreateUsergroupResponse CreateUsergroupEx(CreateUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUsergroupResponse>(DoRequest("1.0", "antcloud.monitor.usergroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通知组
         * Summary: 创建通知组
         */
        public async Task<CreateUsergroupResponse> CreateUsergroupExAsync(CreateUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUsergroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.usergroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新通知组
         * Summary: 更新通知组
         */
        public UpdateUsergroupResponse UpdateUsergroup(UpdateUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUsergroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新通知组
         * Summary: 更新通知组
         */
        public async Task<UpdateUsergroupResponse> UpdateUsergroupAsync(UpdateUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUsergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新通知组
         * Summary: 更新通知组
         */
        public UpdateUsergroupResponse UpdateUsergroupEx(UpdateUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUsergroupResponse>(DoRequest("1.0", "antcloud.monitor.usergroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新通知组
         * Summary: 更新通知组
         */
        public async Task<UpdateUsergroupResponse> UpdateUsergroupExAsync(UpdateUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUsergroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.usergroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通知组
         * Summary: 删除通知组
         */
        public DeleteUsergroupResponse DeleteUsergroup(DeleteUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUsergroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除通知组
         * Summary: 删除通知组
         */
        public async Task<DeleteUsergroupResponse> DeleteUsergroupAsync(DeleteUsergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUsergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除通知组
         * Summary: 删除通知组
         */
        public DeleteUsergroupResponse DeleteUsergroupEx(DeleteUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUsergroupResponse>(DoRequest("1.0", "antcloud.monitor.usergroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通知组
         * Summary: 删除通知组
         */
        public async Task<DeleteUsergroupResponse> DeleteUsergroupExAsync(DeleteUsergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUsergroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.usergroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
         * Summary: 查询过去某一时段内的告警趋势
         */
        public QueryAlarmTrendResponse QueryAlarmTrend(QueryAlarmTrendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmTrendEx(request, headers, runtime);
        }

        /**
         * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
         * Summary: 查询过去某一时段内的告警趋势
         */
        public async Task<QueryAlarmTrendResponse> QueryAlarmTrendAsync(QueryAlarmTrendRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmTrendExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
         * Summary: 查询过去某一时段内的告警趋势
         */
        public QueryAlarmTrendResponse QueryAlarmTrendEx(QueryAlarmTrendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmTrendResponse>(DoRequest("1.0", "antcloud.monitor.alarm.trend.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
         * Summary: 查询过去某一时段内的告警趋势
         */
        public async Task<QueryAlarmTrendResponse> QueryAlarmTrendExAsync(QueryAlarmTrendRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmTrendResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.trend.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询过去某一时段的告警详情
         * Summary: 查询过去某一时段的告警详情
         */
        public QueryAlarmHistoryResponse QueryAlarmHistory(QueryAlarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询过去某一时段的告警详情
         * Summary: 查询过去某一时段的告警详情
         */
        public async Task<QueryAlarmHistoryResponse> QueryAlarmHistoryAsync(QueryAlarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询过去某一时段的告警详情
         * Summary: 查询过去某一时段的告警详情
         */
        public QueryAlarmHistoryResponse QueryAlarmHistoryEx(QueryAlarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmHistoryResponse>(DoRequest("1.0", "antcloud.monitor.alarm.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询过去某一时段的告警详情
         * Summary: 查询过去某一时段的告警详情
         */
        public async Task<QueryAlarmHistoryResponse> QueryAlarmHistoryExAsync(QueryAlarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmHistoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警订阅
         * Summary: 查询告警订阅
         */
        public QueryAlarmSubscriptionResponse QueryAlarmSubscription(QueryAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmSubscriptionEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警订阅
         * Summary: 查询告警订阅
         */
        public async Task<QueryAlarmSubscriptionResponse> QueryAlarmSubscriptionAsync(QueryAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmSubscriptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警订阅
         * Summary: 查询告警订阅
         */
        public QueryAlarmSubscriptionResponse QueryAlarmSubscriptionEx(QueryAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmSubscriptionResponse>(DoRequest("1.0", "antcloud.monitor.alarm.subscription.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警订阅
         * Summary: 查询告警订阅
         */
        public async Task<QueryAlarmSubscriptionResponse> QueryAlarmSubscriptionExAsync(QueryAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmSubscriptionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.subscription.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个应用监控的告警套餐
         * Summary: 查询某个应用监控的告警套餐
         */
        public QueryStackAlarmruleResponse QueryStackAlarmrule(QueryStackAlarmruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStackAlarmruleEx(request, headers, runtime);
        }

        /**
         * Description: 查询某个应用监控的告警套餐
         * Summary: 查询某个应用监控的告警套餐
         */
        public async Task<QueryStackAlarmruleResponse> QueryStackAlarmruleAsync(QueryStackAlarmruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStackAlarmruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某个应用监控的告警套餐
         * Summary: 查询某个应用监控的告警套餐
         */
        public QueryStackAlarmruleResponse QueryStackAlarmruleEx(QueryStackAlarmruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackAlarmruleResponse>(DoRequest("1.0", "antcloud.monitor.stack.alarmrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个应用监控的告警套餐
         * Summary: 查询某个应用监控的告警套餐
         */
        public async Task<QueryStackAlarmruleResponse> QueryStackAlarmruleExAsync(QueryStackAlarmruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStackAlarmruleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.stack.alarmrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改自定义监控指标
         * Summary: 修改自定义监控指标
         */
        public UpdateCustompluginResponse UpdateCustomplugin(UpdateCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCustompluginEx(request, headers, runtime);
        }

        /**
         * Description: 修改自定义监控指标
         * Summary: 修改自定义监控指标
         */
        public async Task<UpdateCustompluginResponse> UpdateCustompluginAsync(UpdateCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改自定义监控指标
         * Summary: 修改自定义监控指标
         */
        public UpdateCustompluginResponse UpdateCustompluginEx(UpdateCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改自定义监控指标
         * Summary: 修改自定义监控指标
         */
        public async Task<UpdateCustompluginResponse> UpdateCustompluginExAsync(UpdateCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 agent 安装信息列表
         * Summary: 查询 agent 安装信息列表
         */
        public QueryAgentResponse QueryAgent(QueryAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAgentEx(request, headers, runtime);
        }

        /**
         * Description: 查询 agent 安装信息列表
         * Summary: 查询 agent 安装信息列表
         */
        public async Task<QueryAgentResponse> QueryAgentAsync(QueryAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAgentExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 agent 安装信息列表
         * Summary: 查询 agent 安装信息列表
         */
        public QueryAgentResponse QueryAgentEx(QueryAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentResponse>(DoRequest("1.0", "antcloud.monitor.agent.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 agent 安装信息列表
         * Summary: 查询 agent 安装信息列表
         */
        public async Task<QueryAgentResponse> QueryAgentExAsync(QueryAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安装 agent 组件
         * Summary: 安装 agent 组件
         */
        public InstallAgentResponse InstallAgent(InstallAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InstallAgentEx(request, headers, runtime);
        }

        /**
         * Description: 安装 agent 组件
         * Summary: 安装 agent 组件
         */
        public async Task<InstallAgentResponse> InstallAgentAsync(InstallAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InstallAgentExAsync(request, headers, runtime);
        }

        /**
         * Description: 安装 agent 组件
         * Summary: 安装 agent 组件
         */
        public InstallAgentResponse InstallAgentEx(InstallAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InstallAgentResponse>(DoRequest("1.0", "antcloud.monitor.agent.install", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安装 agent 组件
         * Summary: 安装 agent 组件
         */
        public async Task<InstallAgentResponse> InstallAgentExAsync(InstallAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InstallAgentResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.install", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取需要安装的 agent 版本
         * Summary: 获取需要安装的 agent 版本
         */
        public GetAgentVersionResponse GetAgentVersion(GetAgentVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAgentVersionEx(request, headers, runtime);
        }

        /**
         * Description: 获取需要安装的 agent 版本
         * Summary: 获取需要安装的 agent 版本
         */
        public async Task<GetAgentVersionResponse> GetAgentVersionAsync(GetAgentVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAgentVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取需要安装的 agent 版本
         * Summary: 获取需要安装的 agent 版本
         */
        public GetAgentVersionResponse GetAgentVersionEx(GetAgentVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAgentVersionResponse>(DoRequest("1.0", "antcloud.monitor.agent.version.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取需要安装的 agent 版本
         * Summary: 获取需要安装的 agent 版本
         */
        public async Task<GetAgentVersionResponse> GetAgentVersionExAsync(GetAgentVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAgentVersionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.version.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  设置默认最新agent版本
         * Summary:  设置默认最新agent版本
         */
        public EnableAgentVersionResponse EnableAgentVersion(EnableAgentVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableAgentVersionEx(request, headers, runtime);
        }

        /**
         * Description:  设置默认最新agent版本
         * Summary:  设置默认最新agent版本
         */
        public async Task<EnableAgentVersionResponse> EnableAgentVersionAsync(EnableAgentVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableAgentVersionExAsync(request, headers, runtime);
        }

        /**
         * Description:  设置默认最新agent版本
         * Summary:  设置默认最新agent版本
         */
        public EnableAgentVersionResponse EnableAgentVersionEx(EnableAgentVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableAgentVersionResponse>(DoRequest("1.0", "antcloud.monitor.agent.version.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  设置默认最新agent版本
         * Summary:  设置默认最新agent版本
         */
        public async Task<EnableAgentVersionResponse> EnableAgentVersionExAsync(EnableAgentVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableAgentVersionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.version.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前工作空间
         * Summary: 获取当前工作空间
         */
        public GetWorkspaceResponse GetWorkspace(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前工作空间
         * Summary: 获取当前工作空间
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceAsync(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前工作空间
         * Summary: 获取当前工作空间
         */
        public GetWorkspaceResponse GetWorkspaceEx(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前工作空间
         * Summary: 获取当前工作空间
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceExAsync(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户
         * Summary: 获取当前租户
         */
        public GetTenantResponse GetTenant(GetTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTenantEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户
         * Summary: 获取当前租户
         */
        public async Task<GetTenantResponse> GetTenantAsync(GetTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户
         * Summary: 获取当前租户
         */
        public GetTenantResponse GetTenantEx(GetTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantResponse>(DoRequest("1.0", "antcloud.monitor.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户
         * Summary: 获取当前租户
         */
        public async Task<GetTenantResponse> GetTenantExAsync(GetTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询核心态监控配置
         * Summary: 查询核心态监控配置
         */
        public QueryKernelstackGeneratedconfigResponse QueryKernelstackGeneratedconfig(QueryKernelstackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKernelstackGeneratedconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询核心态监控配置
         * Summary: 查询核心态监控配置
         */
        public async Task<QueryKernelstackGeneratedconfigResponse> QueryKernelstackGeneratedconfigAsync(QueryKernelstackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKernelstackGeneratedconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询核心态监控配置
         * Summary: 查询核心态监控配置
         */
        public QueryKernelstackGeneratedconfigResponse QueryKernelstackGeneratedconfigEx(QueryKernelstackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKernelstackGeneratedconfigResponse>(DoRequest("1.0", "antcloud.monitor.kernelstack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询核心态监控配置
         * Summary: 查询核心态监控配置
         */
        public async Task<QueryKernelstackGeneratedconfigResponse> QueryKernelstackGeneratedconfigExAsync(QueryKernelstackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKernelstackGeneratedconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.kernelstack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取阿里云开通状态
         * Summary: 获取阿里云开通状态
         */
        public GetAliyunStatusResponse GetAliyunStatus(GetAliyunStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAliyunStatusEx(request, headers, runtime);
        }

        /**
         * Description: 获取阿里云开通状态
         * Summary: 获取阿里云开通状态
         */
        public async Task<GetAliyunStatusResponse> GetAliyunStatusAsync(GetAliyunStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAliyunStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取阿里云开通状态
         * Summary: 获取阿里云开通状态
         */
        public GetAliyunStatusResponse GetAliyunStatusEx(GetAliyunStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAliyunStatusResponse>(DoRequest("1.0", "antcloud.monitor.aliyun.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取阿里云开通状态
         * Summary: 获取阿里云开通状态
         */
        public async Task<GetAliyunStatusResponse> GetAliyunStatusExAsync(GetAliyunStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAliyunStatusResponse>(await DoRequestAsync("1.0", "antcloud.monitor.aliyun.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控工作空间开通
         * Summary: 监控工作空间开通
         */
        public OpenWorkspaceResponse OpenWorkspace(OpenWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 监控工作空间开通
         * Summary: 监控工作空间开通
         */
        public async Task<OpenWorkspaceResponse> OpenWorkspaceAsync(OpenWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 监控工作空间开通
         * Summary: 监控工作空间开通
         */
        public OpenWorkspaceResponse OpenWorkspaceEx(OpenWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.workspace.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控工作空间开通
         * Summary: 监控工作空间开通
         */
        public async Task<OpenWorkspaceResponse> OpenWorkspaceExAsync(OpenWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.workspace.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新技术栈配置
         * Summary: 更新技术栈配置
         */
        public UpdateStackGeneratedconfigResponse UpdateStackGeneratedconfig(UpdateStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateStackGeneratedconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新技术栈配置
         * Summary: 更新技术栈配置
         */
        public async Task<UpdateStackGeneratedconfigResponse> UpdateStackGeneratedconfigAsync(UpdateStackGeneratedconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateStackGeneratedconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新技术栈配置
         * Summary: 更新技术栈配置
         */
        public UpdateStackGeneratedconfigResponse UpdateStackGeneratedconfigEx(UpdateStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStackGeneratedconfigResponse>(DoRequest("1.0", "antcloud.monitor.stack.generatedconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新技术栈配置
         * Summary: 更新技术栈配置
         */
        public async Task<UpdateStackGeneratedconfigResponse> UpdateStackGeneratedconfigExAsync(UpdateStackGeneratedconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStackGeneratedconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.stack.generatedconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户列表
         * Summary: 查询用户列表
         */
        public QueryUserResponse QueryUser(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户列表
         * Summary: 查询用户列表
         */
        public async Task<QueryUserResponse> QueryUserAsync(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户列表
         * Summary: 查询用户列表
         */
        public QueryUserResponse QueryUserEx(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(DoRequest("1.0", "antcloud.monitor.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户列表
         * Summary: 查询用户列表
         */
        public async Task<QueryUserResponse> QueryUserExAsync(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户权限列表
         * Summary: 获取用户权限列表
         */
        public ListAuthResponse ListAuth(ListAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户权限列表
         * Summary: 获取用户权限列表
         */
        public async Task<ListAuthResponse> ListAuthAsync(ListAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户权限列表
         * Summary: 获取用户权限列表
         */
        public ListAuthResponse ListAuthEx(ListAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthResponse>(DoRequest("1.0", "antcloud.monitor.auth.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户权限列表
         * Summary: 获取用户权限列表
         */
        public async Task<ListAuthResponse> ListAuthExAsync(ListAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthResponse>(await DoRequestAsync("1.0", "antcloud.monitor.auth.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除用户权限
         * Summary: 删除用户权限
         */
        public DeleteAuthResponse DeleteAuth(DeleteAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAuthEx(request, headers, runtime);
        }

        /**
         * Description: 删除用户权限
         * Summary: 删除用户权限
         */
        public async Task<DeleteAuthResponse> DeleteAuthAsync(DeleteAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除用户权限
         * Summary: 删除用户权限
         */
        public DeleteAuthResponse DeleteAuthEx(DeleteAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAuthResponse>(DoRequest("1.0", "antcloud.monitor.auth.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除用户权限
         * Summary: 删除用户权限
         */
        public async Task<DeleteAuthResponse> DeleteAuthExAsync(DeleteAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAuthResponse>(await DoRequestAsync("1.0", "antcloud.monitor.auth.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建用户权限
         * Summary: 新建用户权限
         */
        public CreateAuthResponse CreateAuth(CreateAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAuthEx(request, headers, runtime);
        }

        /**
         * Description: 新建用户权限
         * Summary: 新建用户权限
         */
        public async Task<CreateAuthResponse> CreateAuthAsync(CreateAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 新建用户权限
         * Summary: 新建用户权限
         */
        public CreateAuthResponse CreateAuthEx(CreateAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuthResponse>(DoRequest("1.0", "antcloud.monitor.auth.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建用户权限
         * Summary: 新建用户权限
         */
        public async Task<CreateAuthResponse> CreateAuthExAsync(CreateAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuthResponse>(await DoRequestAsync("1.0", "antcloud.monitor.auth.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
         * Summary: 用户添加收藏资源
         */
        public BatchcreateUserFavoriteResponse BatchcreateUserFavorite(BatchcreateUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateUserFavoriteEx(request, headers, runtime);
        }

        /**
         * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
         * Summary: 用户添加收藏资源
         */
        public async Task<BatchcreateUserFavoriteResponse> BatchcreateUserFavoriteAsync(BatchcreateUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateUserFavoriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
         * Summary: 用户添加收藏资源
         */
        public BatchcreateUserFavoriteResponse BatchcreateUserFavoriteEx(BatchcreateUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUserFavoriteResponse>(DoRequest("1.0", "antcloud.monitor.user.favorite.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
         * Summary: 用户添加收藏资源
         */
        public async Task<BatchcreateUserFavoriteResponse> BatchcreateUserFavoriteExAsync(BatchcreateUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUserFavoriteResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.favorite.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量取消收藏
         * Summary: 批量取消收藏
         */
        public BatchdeleteUserFavoriteResponse BatchdeleteUserFavorite(BatchdeleteUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteUserFavoriteEx(request, headers, runtime);
        }

        /**
         * Description: 批量取消收藏
         * Summary: 批量取消收藏
         */
        public async Task<BatchdeleteUserFavoriteResponse> BatchdeleteUserFavoriteAsync(BatchdeleteUserFavoriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteUserFavoriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量取消收藏
         * Summary: 批量取消收藏
         */
        public BatchdeleteUserFavoriteResponse BatchdeleteUserFavoriteEx(BatchdeleteUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteUserFavoriteResponse>(DoRequest("1.0", "antcloud.monitor.user.favorite.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量取消收藏
         * Summary: 批量取消收藏
         */
        public async Task<BatchdeleteUserFavoriteResponse> BatchdeleteUserFavoriteExAsync(BatchdeleteUserFavoriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteUserFavoriteResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.favorite.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询用户的操作历史
         * Summary: 查询用户的操作历史
         */
        public QueryUserOperationResponse QueryUserOperation(QueryUserOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserOperationEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询用户的操作历史
         * Summary: 查询用户的操作历史
         */
        public async Task<QueryUserOperationResponse> QueryUserOperationAsync(QueryUserOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询用户的操作历史
         * Summary: 查询用户的操作历史
         */
        public QueryUserOperationResponse QueryUserOperationEx(QueryUserOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserOperationResponse>(DoRequest("1.0", "antcloud.monitor.user.operation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询用户的操作历史
         * Summary: 查询用户的操作历史
         */
        public async Task<QueryUserOperationResponse> QueryUserOperationExAsync(QueryUserOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserOperationResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.operation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增告警订阅
         * Summary: 新增告警订阅
         */
        public CreateAlarmSubscriptionResponse CreateAlarmSubscription(CreateAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAlarmSubscriptionEx(request, headers, runtime);
        }

        /**
         * Description: 新增告警订阅
         * Summary: 新增告警订阅
         */
        public async Task<CreateAlarmSubscriptionResponse> CreateAlarmSubscriptionAsync(CreateAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAlarmSubscriptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增告警订阅
         * Summary: 新增告警订阅
         */
        public CreateAlarmSubscriptionResponse CreateAlarmSubscriptionEx(CreateAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmSubscriptionResponse>(DoRequest("1.0", "antcloud.monitor.alarm.subscription.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增告警订阅
         * Summary: 新增告警订阅
         */
        public async Task<CreateAlarmSubscriptionResponse> CreateAlarmSubscriptionExAsync(CreateAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmSubscriptionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.subscription.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消告警订阅 (删除)
         * Summary: 取消告警订阅
         */
        public DeleteAlarmSubscriptionResponse DeleteAlarmSubscription(DeleteAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAlarmSubscriptionEx(request, headers, runtime);
        }

        /**
         * Description: 取消告警订阅 (删除)
         * Summary: 取消告警订阅
         */
        public async Task<DeleteAlarmSubscriptionResponse> DeleteAlarmSubscriptionAsync(DeleteAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAlarmSubscriptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消告警订阅 (删除)
         * Summary: 取消告警订阅
         */
        public DeleteAlarmSubscriptionResponse DeleteAlarmSubscriptionEx(DeleteAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmSubscriptionResponse>(DoRequest("1.0", "antcloud.monitor.alarm.subscription.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消告警订阅 (删除)
         * Summary: 取消告警订阅
         */
        public async Task<DeleteAlarmSubscriptionResponse> DeleteAlarmSubscriptionExAsync(DeleteAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmSubscriptionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.subscription.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停告警
         * Summary: 暂停告警
         */
        public PauseAlarmResponse PauseAlarm(PauseAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseAlarmEx(request, headers, runtime);
        }

        /**
         * Description: 暂停告警
         * Summary: 暂停告警
         */
        public async Task<PauseAlarmResponse> PauseAlarmAsync(PauseAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseAlarmExAsync(request, headers, runtime);
        }

        /**
         * Description: 暂停告警
         * Summary: 暂停告警
         */
        public PauseAlarmResponse PauseAlarmEx(PauseAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseAlarmResponse>(DoRequest("1.0", "antcloud.monitor.alarm.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停告警
         * Summary: 暂停告警
         */
        public async Task<PauseAlarmResponse> PauseAlarmExAsync(PauseAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseAlarmResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复告警
         * Summary: 恢复告警
         */
        public ResumeAlarmResponse ResumeAlarm(ResumeAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeAlarmEx(request, headers, runtime);
        }

        /**
         * Description: 恢复告警
         * Summary: 恢复告警
         */
        public async Task<ResumeAlarmResponse> ResumeAlarmAsync(ResumeAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeAlarmExAsync(request, headers, runtime);
        }

        /**
         * Description: 恢复告警
         * Summary: 恢复告警
         */
        public ResumeAlarmResponse ResumeAlarmEx(ResumeAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAlarmResponse>(DoRequest("1.0", "antcloud.monitor.alarm.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复告警
         * Summary: 恢复告警
         */
        public async Task<ResumeAlarmResponse> ResumeAlarmExAsync(ResumeAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAlarmResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉取日志，返回LogTail
         * Summary: 拉取日志
         */
        public GetLogTailResponse GetLogTail(GetLogTailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLogTailEx(request, headers, runtime);
        }

        /**
         * Description: 拉取日志，返回LogTail
         * Summary: 拉取日志
         */
        public async Task<GetLogTailResponse> GetLogTailAsync(GetLogTailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLogTailExAsync(request, headers, runtime);
        }

        /**
         * Description: 拉取日志，返回LogTail
         * Summary: 拉取日志
         */
        public GetLogTailResponse GetLogTailEx(GetLogTailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogTailResponse>(DoRequest("1.0", "antcloud.monitor.log.tail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉取日志，返回LogTail
         * Summary: 拉取日志
         */
        public async Task<GetLogTailResponse> GetLogTailExAsync(GetLogTailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogTailResponse>(await DoRequestAsync("1.0", "antcloud.monitor.log.tail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件浏览结果
         * Summary: 获取文件浏览结果
         */
        public GetLogBrowserResponse GetLogBrowser(GetLogBrowserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLogBrowserEx(request, headers, runtime);
        }

        /**
         * Description: 获取文件浏览结果
         * Summary: 获取文件浏览结果
         */
        public async Task<GetLogBrowserResponse> GetLogBrowserAsync(GetLogBrowserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLogBrowserExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取文件浏览结果
         * Summary: 获取文件浏览结果
         */
        public GetLogBrowserResponse GetLogBrowserEx(GetLogBrowserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogBrowserResponse>(DoRequest("1.0", "antcloud.monitor.log.browser.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件浏览结果
         * Summary: 获取文件浏览结果
         */
        public async Task<GetLogBrowserResponse> GetLogBrowserExAsync(GetLogBrowserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogBrowserResponse>(await DoRequestAsync("1.0", "antcloud.monitor.log.browser.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按ID删除文件夹
         * Summary: 删除文件夹
         */
        public DeleteFolderResponse DeleteFolder(DeleteFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFolderEx(request, headers, runtime);
        }

        /**
         * Description: 按ID删除文件夹
         * Summary: 删除文件夹
         */
        public async Task<DeleteFolderResponse> DeleteFolderAsync(DeleteFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFolderExAsync(request, headers, runtime);
        }

        /**
         * Description: 按ID删除文件夹
         * Summary: 删除文件夹
         */
        public DeleteFolderResponse DeleteFolderEx(DeleteFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFolderResponse>(DoRequest("1.0", "antcloud.monitor.folder.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按ID删除文件夹
         * Summary: 删除文件夹
         */
        public async Task<DeleteFolderResponse> DeleteFolderExAsync(DeleteFolderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFolderResponse>(await DoRequestAsync("1.0", "antcloud.monitor.folder.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取总览页应用统计信息
         * Summary: 获取总览页应用统计信息
         */
        public GetAppOverviewResponse GetAppOverview(GetAppOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppOverviewEx(request, headers, runtime);
        }

        /**
         * Description: 获取总览页应用统计信息
         * Summary: 获取总览页应用统计信息
         */
        public async Task<GetAppOverviewResponse> GetAppOverviewAsync(GetAppOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取总览页应用统计信息
         * Summary: 获取总览页应用统计信息
         */
        public GetAppOverviewResponse GetAppOverviewEx(GetAppOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppOverviewResponse>(DoRequest("1.0", "antcloud.monitor.app.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取总览页应用统计信息
         * Summary: 获取总览页应用统计信息
         */
        public async Task<GetAppOverviewResponse> GetAppOverviewExAsync(GetAppOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppOverviewResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统一告警历史记录
         * Summary: 查询统一告警历史记录
         */
        public QueryUnifiedalarmHistoryResponse QueryUnifiedalarmHistory(QueryUnifiedalarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询统一告警历史记录
         * Summary: 查询统一告警历史记录
         */
        public async Task<QueryUnifiedalarmHistoryResponse> QueryUnifiedalarmHistoryAsync(QueryUnifiedalarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统一告警历史记录
         * Summary: 查询统一告警历史记录
         */
        public QueryUnifiedalarmHistoryResponse QueryUnifiedalarmHistoryEx(QueryUnifiedalarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmHistoryResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统一告警历史记录
         * Summary: 查询统一告警历史记录
         */
        public async Task<QueryUnifiedalarmHistoryResponse> QueryUnifiedalarmHistoryExAsync(QueryUnifiedalarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmHistoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试演示
         * Summary: 测试演示
         */
        public GetAlarmTestResponse GetAlarmTest(GetAlarmTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAlarmTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试演示
         * Summary: 测试演示
         */
        public async Task<GetAlarmTestResponse> GetAlarmTestAsync(GetAlarmTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAlarmTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试演示
         * Summary: 测试演示
         */
        public GetAlarmTestResponse GetAlarmTestEx(GetAlarmTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAlarmTestResponse>(DoRequest("1.0", "antcloud.monitor.alarm.test.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试演示
         * Summary: 测试演示
         */
        public async Task<GetAlarmTestResponse> GetAlarmTestExAsync(GetAlarmTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAlarmTestResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.test.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取webhook列表
         * Summary: 获取webhook列表
         */
        public QueryAlarmwebhookResponse QueryAlarmwebhook(QueryAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmwebhookEx(request, headers, runtime);
        }

        /**
         * Description: 获取webhook列表
         * Summary: 获取webhook列表
         */
        public async Task<QueryAlarmwebhookResponse> QueryAlarmwebhookAsync(QueryAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmwebhookExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取webhook列表
         * Summary: 获取webhook列表
         */
        public QueryAlarmwebhookResponse QueryAlarmwebhookEx(QueryAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmwebhookResponse>(DoRequest("1.0", "antcloud.monitor.alarmwebhook.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取webhook列表
         * Summary: 获取webhook列表
         */
        public async Task<QueryAlarmwebhookResponse> QueryAlarmwebhookExAsync(QueryAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmwebhookResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarmwebhook.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建告警规则
         * Summary: 创建告警规则
         */
        public CreateUnifiedalarmRuleResponse CreateUnifiedalarmRule(CreateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 创建告警规则
         * Summary: 创建告警规则
         */
        public async Task<CreateUnifiedalarmRuleResponse> CreateUnifiedalarmRuleAsync(CreateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建告警规则
         * Summary: 创建告警规则
         */
        public CreateUnifiedalarmRuleResponse CreateUnifiedalarmRuleEx(CreateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建告警规则
         * Summary: 创建告警规则
         */
        public async Task<CreateUnifiedalarmRuleResponse> CreateUnifiedalarmRuleExAsync(CreateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警规则
         * Summary: 更新告警规则
         */
        public UpdateUnifiedalarmRuleResponse UpdateUnifiedalarmRule(UpdateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 更新告警规则
         * Summary: 更新告警规则
         */
        public async Task<UpdateUnifiedalarmRuleResponse> UpdateUnifiedalarmRuleAsync(UpdateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新告警规则
         * Summary: 更新告警规则
         */
        public UpdateUnifiedalarmRuleResponse UpdateUnifiedalarmRuleEx(UpdateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警规则
         * Summary: 更新告警规则
         */
        public async Task<UpdateUnifiedalarmRuleResponse> UpdateUnifiedalarmRuleExAsync(UpdateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则列表
         * Summary: 查询告警规则列表
         */
        public QueryUnifiedalarmRuleResponse QueryUnifiedalarmRule(QueryUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则列表
         * Summary: 查询告警规则列表
         */
        public async Task<QueryUnifiedalarmRuleResponse> QueryUnifiedalarmRuleAsync(QueryUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则列表
         * Summary: 查询告警规则列表
         */
        public QueryUnifiedalarmRuleResponse QueryUnifiedalarmRuleEx(QueryUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则列表
         * Summary: 查询告警规则列表
         */
        public async Task<QueryUnifiedalarmRuleResponse> QueryUnifiedalarmRuleExAsync(QueryUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则详情
         * Summary: 查询告警规则详情
         */
        public GetUnifiedalarmRuleResponse GetUnifiedalarmRule(GetUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则详情
         * Summary: 查询告警规则详情
         */
        public async Task<GetUnifiedalarmRuleResponse> GetUnifiedalarmRuleAsync(GetUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则详情
         * Summary: 查询告警规则详情
         */
        public GetUnifiedalarmRuleResponse GetUnifiedalarmRuleEx(GetUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则详情
         * Summary: 查询告警规则详情
         */
        public async Task<GetUnifiedalarmRuleResponse> GetUnifiedalarmRuleExAsync(GetUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除告警规则
         * Summary: 删除告警规则
         */
        public DeleteUnifiedalarmRuleResponse DeleteUnifiedalarmRule(DeleteUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 删除告警规则
         * Summary: 删除告警规则
         */
        public async Task<DeleteUnifiedalarmRuleResponse> DeleteUnifiedalarmRuleAsync(DeleteUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除告警规则
         * Summary: 删除告警规则
         */
        public DeleteUnifiedalarmRuleResponse DeleteUnifiedalarmRuleEx(DeleteUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除告警规则
         * Summary: 删除告警规则
         */
        public async Task<DeleteUnifiedalarmRuleResponse> DeleteUnifiedalarmRuleExAsync(DeleteUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警消息历史
         * Summary: 查询告警消息历史
         */
        public QueryUnifiedalarmNotifyhistoryResponse QueryUnifiedalarmNotifyhistory(QueryUnifiedalarmNotifyhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmNotifyhistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警消息历史
         * Summary: 查询告警消息历史
         */
        public async Task<QueryUnifiedalarmNotifyhistoryResponse> QueryUnifiedalarmNotifyhistoryAsync(QueryUnifiedalarmNotifyhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmNotifyhistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警消息历史
         * Summary: 查询告警消息历史
         */
        public QueryUnifiedalarmNotifyhistoryResponse QueryUnifiedalarmNotifyhistoryEx(QueryUnifiedalarmNotifyhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmNotifyhistoryResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.notifyhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警消息历史
         * Summary: 查询告警消息历史
         */
        public async Task<QueryUnifiedalarmNotifyhistoryResponse> QueryUnifiedalarmNotifyhistoryExAsync(QueryUnifiedalarmNotifyhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmNotifyhistoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.notifyhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量订阅告警
         * Summary: 批量订阅告警
         */
        public BatchcreateUnifiedalarmSubResponse BatchcreateUnifiedalarmSub(BatchcreateUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateUnifiedalarmSubEx(request, headers, runtime);
        }

        /**
         * Description: 批量订阅告警
         * Summary: 批量订阅告警
         */
        public async Task<BatchcreateUnifiedalarmSubResponse> BatchcreateUnifiedalarmSubAsync(BatchcreateUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateUnifiedalarmSubExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量订阅告警
         * Summary: 批量订阅告警
         */
        public BatchcreateUnifiedalarmSubResponse BatchcreateUnifiedalarmSubEx(BatchcreateUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmSubResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.sub.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量订阅告警
         * Summary: 批量订阅告警
         */
        public async Task<BatchcreateUnifiedalarmSubResponse> BatchcreateUnifiedalarmSubExAsync(BatchcreateUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmSubResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.sub.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消订阅
         * Summary: 批量取消订阅
         */
        public DeleteUnifiedalarmSubResponse DeleteUnifiedalarmSub(DeleteUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUnifiedalarmSubEx(request, headers, runtime);
        }

        /**
         * Description: 取消订阅
         * Summary: 批量取消订阅
         */
        public async Task<DeleteUnifiedalarmSubResponse> DeleteUnifiedalarmSubAsync(DeleteUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUnifiedalarmSubExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消订阅
         * Summary: 批量取消订阅
         */
        public DeleteUnifiedalarmSubResponse DeleteUnifiedalarmSubEx(DeleteUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmSubResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.sub.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消订阅
         * Summary: 批量取消订阅
         */
        public async Task<DeleteUnifiedalarmSubResponse> DeleteUnifiedalarmSubExAsync(DeleteUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmSubResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.sub.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警订阅关系列表
         * Summary: 查询告警订阅关系列表
         */
        public QueryUnifiedalarmSubResponse QueryUnifiedalarmSub(QueryUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmSubEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警订阅关系列表
         * Summary: 查询告警订阅关系列表
         */
        public async Task<QueryUnifiedalarmSubResponse> QueryUnifiedalarmSubAsync(QueryUnifiedalarmSubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmSubExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警订阅关系列表
         * Summary: 查询告警订阅关系列表
         */
        public QueryUnifiedalarmSubResponse QueryUnifiedalarmSubEx(QueryUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmSubResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.sub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警订阅关系列表
         * Summary: 查询告警订阅关系列表
         */
        public async Task<QueryUnifiedalarmSubResponse> QueryUnifiedalarmSubExAsync(QueryUnifiedalarmSubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmSubResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.sub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建告警规则模板
         * Summary: 创建告警规则模板
         */
        public CreateUnifiedalarmTplResponse CreateUnifiedalarmTpl(CreateUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnifiedalarmTplEx(request, headers, runtime);
        }

        /**
         * Description: 创建告警规则模板
         * Summary: 创建告警规则模板
         */
        public async Task<CreateUnifiedalarmTplResponse> CreateUnifiedalarmTplAsync(CreateUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnifiedalarmTplExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建告警规则模板
         * Summary: 创建告警规则模板
         */
        public CreateUnifiedalarmTplResponse CreateUnifiedalarmTplEx(CreateUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedalarmTplResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建告警规则模板
         * Summary: 创建告警规则模板
         */
        public async Task<CreateUnifiedalarmTplResponse> CreateUnifiedalarmTplExAsync(CreateUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedalarmTplResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.tpl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警规则模板
         * Summary: 更新告警规则模板
         */
        public UpdateUnifiedalarmTplResponse UpdateUnifiedalarmTpl(UpdateUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUnifiedalarmTplEx(request, headers, runtime);
        }

        /**
         * Description: 更新告警规则模板
         * Summary: 更新告警规则模板
         */
        public async Task<UpdateUnifiedalarmTplResponse> UpdateUnifiedalarmTplAsync(UpdateUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUnifiedalarmTplExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新告警规则模板
         * Summary: 更新告警规则模板
         */
        public UpdateUnifiedalarmTplResponse UpdateUnifiedalarmTplEx(UpdateUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedalarmTplResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警规则模板
         * Summary: 更新告警规则模板
         */
        public async Task<UpdateUnifiedalarmTplResponse> UpdateUnifiedalarmTplExAsync(UpdateUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedalarmTplResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.tpl.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则模板列表
         * Summary: 查询告警规则模板列表
         */
        public QueryUnifiedalarmTplResponse QueryUnifiedalarmTpl(QueryUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmTplEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则模板列表
         * Summary: 查询告警规则模板列表
         */
        public async Task<QueryUnifiedalarmTplResponse> QueryUnifiedalarmTplAsync(QueryUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmTplExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则模板列表
         * Summary: 查询告警规则模板列表
         */
        public QueryUnifiedalarmTplResponse QueryUnifiedalarmTplEx(QueryUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmTplResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则模板列表
         * Summary: 查询告警规则模板列表
         */
        public async Task<QueryUnifiedalarmTplResponse> QueryUnifiedalarmTplExAsync(QueryUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmTplResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.tpl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则模板详情
         * Summary: 查询告警规则模板详情
         */
        public GetUnifiedalarmTplResponse GetUnifiedalarmTpl(GetUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnifiedalarmTplEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则模板详情
         * Summary: 查询告警规则模板详情
         */
        public async Task<GetUnifiedalarmTplResponse> GetUnifiedalarmTplAsync(GetUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnifiedalarmTplExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警规则模板详情
         * Summary: 查询告警规则模板详情
         */
        public GetUnifiedalarmTplResponse GetUnifiedalarmTplEx(GetUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedalarmTplResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警规则模板详情
         * Summary: 查询告警规则模板详情
         */
        public async Task<GetUnifiedalarmTplResponse> GetUnifiedalarmTplExAsync(GetUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedalarmTplResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.tpl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除告警规则模板
         * Summary: 删除告警规则模板
         */
        public DeleteUnifiedalarmTplResponse DeleteUnifiedalarmTpl(DeleteUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUnifiedalarmTplEx(request, headers, runtime);
        }

        /**
         * Description: 删除告警规则模板
         * Summary: 删除告警规则模板
         */
        public async Task<DeleteUnifiedalarmTplResponse> DeleteUnifiedalarmTplAsync(DeleteUnifiedalarmTplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUnifiedalarmTplExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除告警规则模板
         * Summary: 删除告警规则模板
         */
        public DeleteUnifiedalarmTplResponse DeleteUnifiedalarmTplEx(DeleteUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmTplResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除告警规则模板
         * Summary: 删除告警规则模板
         */
        public async Task<DeleteUnifiedalarmTplResponse> DeleteUnifiedalarmTplExAsync(DeleteUnifiedalarmTplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedalarmTplResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.tpl.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停/开启告警规则
         * Summary: 暂停告警规则
         */
        public SwitchUnifiedalarmRuleResponse SwitchUnifiedalarmRule(SwitchUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 暂停/开启告警规则
         * Summary: 暂停告警规则
         */
        public async Task<SwitchUnifiedalarmRuleResponse> SwitchUnifiedalarmRuleAsync(SwitchUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 暂停/开启告警规则
         * Summary: 暂停告警规则
         */
        public SwitchUnifiedalarmRuleResponse SwitchUnifiedalarmRuleEx(SwitchUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停/开启告警规则
         * Summary: 暂停告警规则
         */
        public async Task<SwitchUnifiedalarmRuleResponse> SwitchUnifiedalarmRuleExAsync(SwitchUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源类型获取告警订阅列表
         * Summary: 获取告警订阅列表
         */
        public ListAlarmSubscriptionResponse ListAlarmSubscription(ListAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAlarmSubscriptionEx(request, headers, runtime);
        }

        /**
         * Description: 根据资源类型获取告警订阅列表
         * Summary: 获取告警订阅列表
         */
        public async Task<ListAlarmSubscriptionResponse> ListAlarmSubscriptionAsync(ListAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAlarmSubscriptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据资源类型获取告警订阅列表
         * Summary: 获取告警订阅列表
         */
        public ListAlarmSubscriptionResponse ListAlarmSubscriptionEx(ListAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAlarmSubscriptionResponse>(DoRequest("1.0", "antcloud.monitor.alarm.subscription.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源类型获取告警订阅列表
         * Summary: 获取告警订阅列表
         */
        public async Task<ListAlarmSubscriptionResponse> ListAlarmSubscriptionExAsync(ListAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAlarmSubscriptionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.subscription.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警订阅
         * Summary: 更新告警订阅
         */
        public UpdateAlarmSubscriptionResponse UpdateAlarmSubscription(UpdateAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAlarmSubscriptionEx(request, headers, runtime);
        }

        /**
         * Description: 更新告警订阅
         * Summary: 更新告警订阅
         */
        public async Task<UpdateAlarmSubscriptionResponse> UpdateAlarmSubscriptionAsync(UpdateAlarmSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAlarmSubscriptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新告警订阅
         * Summary: 更新告警订阅
         */
        public UpdateAlarmSubscriptionResponse UpdateAlarmSubscriptionEx(UpdateAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmSubscriptionResponse>(DoRequest("1.0", "antcloud.monitor.alarm.subscription.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警订阅
         * Summary: 更新告警订阅
         */
        public async Task<UpdateAlarmSubscriptionResponse> UpdateAlarmSubscriptionExAsync(UpdateAlarmSubscriptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmSubscriptionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.subscription.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 custom plugin 列表
         * Summary: 查询 custom plugin 列表
         */
        public ListCustompluginResponse ListCustomplugin(ListCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCustompluginEx(request, headers, runtime);
        }

        /**
         * Description: 查询 custom plugin 列表
         * Summary: 查询 custom plugin 列表
         */
        public async Task<ListCustompluginResponse> ListCustompluginAsync(ListCustompluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCustompluginExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 custom plugin 列表
         * Summary: 查询 custom plugin 列表
         */
        public ListCustompluginResponse ListCustompluginEx(ListCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustompluginResponse>(DoRequest("1.0", "antcloud.monitor.customplugin.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 custom plugin 列表
         * Summary: 查询 custom plugin 列表
         */
        public async Task<ListCustompluginResponse> ListCustompluginExAsync(ListCustompluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustompluginResponse>(await DoRequestAsync("1.0", "antcloud.monitor.customplugin.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询事件列表
         * Summary: 查询事件列表
         */
        public QueryUnifiedalarmEventResponse QueryUnifiedalarmEvent(QueryUnifiedalarmEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmEventEx(request, headers, runtime);
        }

        /**
         * Description: 查询事件列表
         * Summary: 查询事件列表
         */
        public async Task<QueryUnifiedalarmEventResponse> QueryUnifiedalarmEventAsync(QueryUnifiedalarmEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询事件列表
         * Summary: 查询事件列表
         */
        public QueryUnifiedalarmEventResponse QueryUnifiedalarmEventEx(QueryUnifiedalarmEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询事件列表
         * Summary: 查询事件列表
         */
        public async Task<QueryUnifiedalarmEventResponse> QueryUnifiedalarmEventExAsync(QueryUnifiedalarmEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警指标查询
         * Summary: 告警指标查询
         */
        public QueryUnifiedalarmMetricsResponse QueryUnifiedalarmMetrics(QueryUnifiedalarmMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmMetricsEx(request, headers, runtime);
        }

        /**
         * Description: 告警指标查询
         * Summary: 告警指标查询
         */
        public async Task<QueryUnifiedalarmMetricsResponse> QueryUnifiedalarmMetricsAsync(QueryUnifiedalarmMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmMetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警指标查询
         * Summary: 告警指标查询
         */
        public QueryUnifiedalarmMetricsResponse QueryUnifiedalarmMetricsEx(QueryUnifiedalarmMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmMetricsResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警指标查询
         * Summary: 告警指标查询
         */
        public async Task<QueryUnifiedalarmMetricsResponse> QueryUnifiedalarmMetricsExAsync(QueryUnifiedalarmMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmMetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建告警历史
         * Summary: 批量创建告警历史
         */
        public BatchcreateUnifiedalarmHistoryResponse BatchcreateUnifiedalarmHistory(BatchcreateUnifiedalarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateUnifiedalarmHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建告警历史
         * Summary: 批量创建告警历史
         */
        public async Task<BatchcreateUnifiedalarmHistoryResponse> BatchcreateUnifiedalarmHistoryAsync(BatchcreateUnifiedalarmHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateUnifiedalarmHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建告警历史
         * Summary: 批量创建告警历史
         */
        public BatchcreateUnifiedalarmHistoryResponse BatchcreateUnifiedalarmHistoryEx(BatchcreateUnifiedalarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmHistoryResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.history.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建告警历史
         * Summary: 批量创建告警历史
         */
        public async Task<BatchcreateUnifiedalarmHistoryResponse> BatchcreateUnifiedalarmHistoryExAsync(BatchcreateUnifiedalarmHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmHistoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.history.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据模板批量创建规则
         * Summary: 根据模板批量创建规则
         */
        public BatchcreateUnifiedalarmRuleResponse BatchcreateUnifiedalarmRule(BatchcreateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 根据模板批量创建规则
         * Summary: 根据模板批量创建规则
         */
        public async Task<BatchcreateUnifiedalarmRuleResponse> BatchcreateUnifiedalarmRuleAsync(BatchcreateUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据模板批量创建规则
         * Summary: 根据模板批量创建规则
         */
        public BatchcreateUnifiedalarmRuleResponse BatchcreateUnifiedalarmRuleEx(BatchcreateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据模板批量创建规则
         * Summary: 根据模板批量创建规则
         */
        public async Task<BatchcreateUnifiedalarmRuleResponse> BatchcreateUnifiedalarmRuleExAsync(BatchcreateUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警事件统计信息
         * Summary: 告警事件统计信息
         */
        public QueryUnifiedalarmEventstatResponse QueryUnifiedalarmEventstat(QueryUnifiedalarmEventstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmEventstatEx(request, headers, runtime);
        }

        /**
         * Description: 告警事件统计信息
         * Summary: 告警事件统计信息
         */
        public async Task<QueryUnifiedalarmEventstatResponse> QueryUnifiedalarmEventstatAsync(QueryUnifiedalarmEventstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmEventstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警事件统计信息
         * Summary: 告警事件统计信息
         */
        public QueryUnifiedalarmEventstatResponse QueryUnifiedalarmEventstatEx(QueryUnifiedalarmEventstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventstatResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.eventstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警事件统计信息
         * Summary: 告警事件统计信息
         */
        public async Task<QueryUnifiedalarmEventstatResponse> QueryUnifiedalarmEventstatExAsync(QueryUnifiedalarmEventstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.eventstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知历史统计
         * Summary: 通知历史统计
         */
        public QueryUnifiedalarmNotifystatResponse QueryUnifiedalarmNotifystat(QueryUnifiedalarmNotifystatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmNotifystatEx(request, headers, runtime);
        }

        /**
         * Description: 通知历史统计
         * Summary: 通知历史统计
         */
        public async Task<QueryUnifiedalarmNotifystatResponse> QueryUnifiedalarmNotifystatAsync(QueryUnifiedalarmNotifystatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmNotifystatExAsync(request, headers, runtime);
        }

        /**
         * Description: 通知历史统计
         * Summary: 通知历史统计
         */
        public QueryUnifiedalarmNotifystatResponse QueryUnifiedalarmNotifystatEx(QueryUnifiedalarmNotifystatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmNotifystatResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.notifystat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知历史统计
         * Summary: 通知历史统计
         */
        public async Task<QueryUnifiedalarmNotifystatResponse> QueryUnifiedalarmNotifystatExAsync(QueryUnifiedalarmNotifystatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmNotifystatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.notifystat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询主机ip列表
         * Summary: 查询主机ip列表
         */
        public QueryMetaNodeResponse QueryMetaNode(QueryMetaNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetaNodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询主机ip列表
         * Summary: 查询主机ip列表
         */
        public async Task<QueryMetaNodeResponse> QueryMetaNodeAsync(QueryMetaNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetaNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询主机ip列表
         * Summary: 查询主机ip列表
         */
        public QueryMetaNodeResponse QueryMetaNodeEx(QueryMetaNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaNodeResponse>(DoRequest("1.0", "antcloud.monitor.meta.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询主机ip列表
         * Summary: 查询主机ip列表
         */
        public async Task<QueryMetaNodeResponse> QueryMetaNodeExAsync(QueryMetaNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaNodeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.meta.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除告警规则
         * Summary: 批量删除告警规则
         */
        public BatchdeleteUnifiedalarmRuleResponse BatchdeleteUnifiedalarmRule(BatchdeleteUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteUnifiedalarmRuleEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除告警规则
         * Summary: 批量删除告警规则
         */
        public async Task<BatchdeleteUnifiedalarmRuleResponse> BatchdeleteUnifiedalarmRuleAsync(BatchdeleteUnifiedalarmRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteUnifiedalarmRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除告警规则
         * Summary: 批量删除告警规则
         */
        public BatchdeleteUnifiedalarmRuleResponse BatchdeleteUnifiedalarmRuleEx(BatchdeleteUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteUnifiedalarmRuleResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除告警规则
         * Summary: 批量删除告警规则
         */
        public async Task<BatchdeleteUnifiedalarmRuleResponse> BatchdeleteUnifiedalarmRuleExAsync(BatchdeleteUnifiedalarmRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteUnifiedalarmRuleResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rule.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard创建
         * Summary: dashboard创建
         */
        public CreateXdashboardResponse CreateXdashboard(CreateXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateXdashboardEx(request, headers, runtime);
        }

        /**
         * Description: dashboard创建
         * Summary: dashboard创建
         */
        public async Task<CreateXdashboardResponse> CreateXdashboardAsync(CreateXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateXdashboardExAsync(request, headers, runtime);
        }

        /**
         * Description: dashboard创建
         * Summary: dashboard创建
         */
        public CreateXdashboardResponse CreateXdashboardEx(CreateXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXdashboardResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard创建
         * Summary: dashboard创建
         */
        public async Task<CreateXdashboardResponse> CreateXdashboardExAsync(CreateXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXdashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard更新
         * Summary: dashboard更新
         */
        public UpdateXdashboardResponse UpdateXdashboard(UpdateXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateXdashboardEx(request, headers, runtime);
        }

        /**
         * Description: dashboard更新
         * Summary: dashboard更新
         */
        public async Task<UpdateXdashboardResponse> UpdateXdashboardAsync(UpdateXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateXdashboardExAsync(request, headers, runtime);
        }

        /**
         * Description: dashboard更新
         * Summary: dashboard更新
         */
        public UpdateXdashboardResponse UpdateXdashboardEx(UpdateXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXdashboardResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard更新
         * Summary: dashboard更新
         */
        public async Task<UpdateXdashboardResponse> UpdateXdashboardExAsync(UpdateXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXdashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard查询
         * Summary: dashboard查询
         */
        public QueryXdashboardResponse QueryXdashboard(QueryXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdashboardEx(request, headers, runtime);
        }

        /**
         * Description: dashboard查询
         * Summary: dashboard查询
         */
        public async Task<QueryXdashboardResponse> QueryXdashboardAsync(QueryXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdashboardExAsync(request, headers, runtime);
        }

        /**
         * Description: dashboard查询
         * Summary: dashboard查询
         */
        public QueryXdashboardResponse QueryXdashboardEx(QueryXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdashboardResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard查询
         * Summary: dashboard查询
         */
        public async Task<QueryXdashboardResponse> QueryXdashboardExAsync(QueryXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard目录列表
         * Summary: dashboard目录列表
         */
        public ListXdashboardDirectoryResponse ListXdashboardDirectory(ListXdashboardDirectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListXdashboardDirectoryEx(request, headers, runtime);
        }

        /**
         * Description: dashboard目录列表
         * Summary: dashboard目录列表
         */
        public async Task<ListXdashboardDirectoryResponse> ListXdashboardDirectoryAsync(ListXdashboardDirectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListXdashboardDirectoryExAsync(request, headers, runtime);
        }

        /**
         * Description: dashboard目录列表
         * Summary: dashboard目录列表
         */
        public ListXdashboardDirectoryResponse ListXdashboardDirectoryEx(ListXdashboardDirectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXdashboardDirectoryResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.directory.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard目录列表
         * Summary: dashboard目录列表
         */
        public async Task<ListXdashboardDirectoryResponse> ListXdashboardDirectoryExAsync(ListXdashboardDirectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXdashboardDirectoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.directory.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard删除。
        单个dashboard删除或者整个目录删除
         * Summary: dashboard删除
         */
        public DeleteXdashboardResponse DeleteXdashboard(DeleteXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteXdashboardEx(request, headers, runtime);
        }

        /**
         * Description: dashboard删除。
        单个dashboard删除或者整个目录删除
         * Summary: dashboard删除
         */
        public async Task<DeleteXdashboardResponse> DeleteXdashboardAsync(DeleteXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteXdashboardExAsync(request, headers, runtime);
        }

        /**
         * Description: dashboard删除。
        单个dashboard删除或者整个目录删除
         * Summary: dashboard删除
         */
        public DeleteXdashboardResponse DeleteXdashboardEx(DeleteXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteXdashboardResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dashboard删除。
        单个dashboard删除或者整个目录删除
         * Summary: dashboard删除
         */
        public async Task<DeleteXdashboardResponse> DeleteXdashboardExAsync(DeleteXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteXdashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: instant query
         * Summary: instant query
         */
        public QueryXmetricInstantResponse QueryXmetricInstant(QueryXmetricInstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricInstantEx(request, headers, runtime);
        }

        /**
         * Description: instant query
         * Summary: instant query
         */
        public async Task<QueryXmetricInstantResponse> QueryXmetricInstantAsync(QueryXmetricInstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricInstantExAsync(request, headers, runtime);
        }

        /**
         * Description: instant query
         * Summary: instant query
         */
        public QueryXmetricInstantResponse QueryXmetricInstantEx(QueryXmetricInstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricInstantResponse>(DoRequest("1.0", "antcloud.monitor.xmetric.instant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: instant query
         * Summary: instant query
         */
        public async Task<QueryXmetricInstantResponse> QueryXmetricInstantExAsync(QueryXmetricInstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricInstantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetric.instant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: range query
         * Summary: range query
         */
        public QueryXmetricRangeResponse QueryXmetricRange(QueryXmetricRangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricRangeEx(request, headers, runtime);
        }

        /**
         * Description: range query
         * Summary: range query
         */
        public async Task<QueryXmetricRangeResponse> QueryXmetricRangeAsync(QueryXmetricRangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricRangeExAsync(request, headers, runtime);
        }

        /**
         * Description: range query
         * Summary: range query
         */
        public QueryXmetricRangeResponse QueryXmetricRangeEx(QueryXmetricRangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricRangeResponse>(DoRequest("1.0", "antcloud.monitor.xmetric.range.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: range query
         * Summary: range query
         */
        public async Task<QueryXmetricRangeResponse> QueryXmetricRangeExAsync(QueryXmetricRangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricRangeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetric.range.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public QueryXmetricdatasourceInstantResponse QueryXmetricdatasourceInstant(QueryXmetricdatasourceInstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricdatasourceInstantEx(request, headers, runtime);
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public async Task<QueryXmetricdatasourceInstantResponse> QueryXmetricdatasourceInstantAsync(QueryXmetricdatasourceInstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricdatasourceInstantExAsync(request, headers, runtime);
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public QueryXmetricdatasourceInstantResponse QueryXmetricdatasourceInstantEx(QueryXmetricdatasourceInstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricdatasourceInstantResponse>(DoRequest("1.0", "antcloud.monitor.xmetricdatasource.instant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public async Task<QueryXmetricdatasourceInstantResponse> QueryXmetricdatasourceInstantExAsync(QueryXmetricdatasourceInstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricdatasourceInstantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetricdatasource.instant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public QueryXmetricdatasourceRangeResponse QueryXmetricdatasourceRange(QueryXmetricdatasourceRangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricdatasourceRangeEx(request, headers, runtime);
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public async Task<QueryXmetricdatasourceRangeResponse> QueryXmetricdatasourceRangeAsync(QueryXmetricdatasourceRangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricdatasourceRangeExAsync(request, headers, runtime);
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public QueryXmetricdatasourceRangeResponse QueryXmetricdatasourceRangeEx(QueryXmetricdatasourceRangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricdatasourceRangeResponse>(DoRequest("1.0", "antcloud.monitor.xmetricdatasource.range.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource metric
         * Summary: datasource metric
         */
        public async Task<QueryXmetricdatasourceRangeResponse> QueryXmetricdatasourceRangeExAsync(QueryXmetricdatasourceRangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricdatasourceRangeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetricdatasource.range.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metric tag keys
         * Summary: metric tag keys
         */
        public QueryXmetrictagKeyResponse QueryXmetrictagKey(QueryXmetrictagKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetrictagKeyEx(request, headers, runtime);
        }

        /**
         * Description: metric tag keys
         * Summary: metric tag keys
         */
        public async Task<QueryXmetrictagKeyResponse> QueryXmetrictagKeyAsync(QueryXmetrictagKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetrictagKeyExAsync(request, headers, runtime);
        }

        /**
         * Description: metric tag keys
         * Summary: metric tag keys
         */
        public QueryXmetrictagKeyResponse QueryXmetrictagKeyEx(QueryXmetrictagKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetrictagKeyResponse>(DoRequest("1.0", "antcloud.monitor.xmetrictag.key.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metric tag keys
         * Summary: metric tag keys
         */
        public async Task<QueryXmetrictagKeyResponse> QueryXmetrictagKeyExAsync(QueryXmetrictagKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetrictagKeyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetrictag.key.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metric tag values
         * Summary: metric tag values
         */
        public QueryXmetrictagValueResponse QueryXmetrictagValue(QueryXmetrictagValueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetrictagValueEx(request, headers, runtime);
        }

        /**
         * Description: metric tag values
         * Summary: metric tag values
         */
        public async Task<QueryXmetrictagValueResponse> QueryXmetrictagValueAsync(QueryXmetrictagValueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetrictagValueExAsync(request, headers, runtime);
        }

        /**
         * Description: metric tag values
         * Summary: metric tag values
         */
        public QueryXmetrictagValueResponse QueryXmetrictagValueEx(QueryXmetrictagValueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetrictagValueResponse>(DoRequest("1.0", "antcloud.monitor.xmetrictag.value.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metric tag values
         * Summary: metric tag values
         */
        public async Task<QueryXmetrictagValueResponse> QueryXmetrictagValueExAsync(QueryXmetrictagValueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetrictagValueResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetrictag.value.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏类型列表查询
         * Summary: 日志脱敏类型列表查询
         */
        public ListLogserviceDesenstypesResponse ListLogserviceDesenstypes(ListLogserviceDesenstypesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLogserviceDesenstypesEx(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏类型列表查询
         * Summary: 日志脱敏类型列表查询
         */
        public async Task<ListLogserviceDesenstypesResponse> ListLogserviceDesenstypesAsync(ListLogserviceDesenstypesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLogserviceDesenstypesExAsync(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏类型列表查询
         * Summary: 日志脱敏类型列表查询
         */
        public ListLogserviceDesenstypesResponse ListLogserviceDesenstypesEx(ListLogserviceDesenstypesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLogserviceDesenstypesResponse>(DoRequest("1.0", "antcloud.monitor.logservice.desenstypes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏类型列表查询
         * Summary: 日志脱敏类型列表查询
         */
        public async Task<ListLogserviceDesenstypesResponse> ListLogserviceDesenstypesExAsync(ListLogserviceDesenstypesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLogserviceDesenstypesResponse>(await DoRequestAsync("1.0", "antcloud.monitor.logservice.desenstypes.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏配置查询
         * Summary: 日志脱敏配置查询
         */
        public GetLogserviceDesensconfigResponse GetLogserviceDesensconfig(GetLogserviceDesensconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLogserviceDesensconfigEx(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏配置查询
         * Summary: 日志脱敏配置查询
         */
        public async Task<GetLogserviceDesensconfigResponse> GetLogserviceDesensconfigAsync(GetLogserviceDesensconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLogserviceDesensconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏配置查询
         * Summary: 日志脱敏配置查询
         */
        public GetLogserviceDesensconfigResponse GetLogserviceDesensconfigEx(GetLogserviceDesensconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogserviceDesensconfigResponse>(DoRequest("1.0", "antcloud.monitor.logservice.desensconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏配置查询
         * Summary: 日志脱敏配置查询
         */
        public async Task<GetLogserviceDesensconfigResponse> GetLogserviceDesensconfigExAsync(GetLogserviceDesensconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLogserviceDesensconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.logservice.desensconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏配置更新
         * Summary: 日志脱敏配置更新
         */
        public UpdateLogserviceDesensconfigResponse UpdateLogserviceDesensconfig(UpdateLogserviceDesensconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLogserviceDesensconfigEx(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏配置更新
         * Summary: 日志脱敏配置更新
         */
        public async Task<UpdateLogserviceDesensconfigResponse> UpdateLogserviceDesensconfigAsync(UpdateLogserviceDesensconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLogserviceDesensconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 日志脱敏配置更新
         * Summary: 日志脱敏配置更新
         */
        public UpdateLogserviceDesensconfigResponse UpdateLogserviceDesensconfigEx(UpdateLogserviceDesensconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLogserviceDesensconfigResponse>(DoRequest("1.0", "antcloud.monitor.logservice.desensconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志脱敏配置更新
         * Summary: 日志脱敏配置更新
         */
        public async Task<UpdateLogserviceDesensconfigResponse> UpdateLogserviceDesensconfigExAsync(UpdateLogserviceDesensconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLogserviceDesensconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.logservice.desensconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取登录用户信息
         * Summary: 获取登录用户信息
         */
        public DetailUserResponse DetailUser(DetailUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailUserEx(request, headers, runtime);
        }

        /**
         * Description: 获取登录用户信息
         * Summary: 获取登录用户信息
         */
        public async Task<DetailUserResponse> DetailUserAsync(DetailUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取登录用户信息
         * Summary: 获取登录用户信息
         */
        public DetailUserResponse DetailUserEx(DetailUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUserResponse>(DoRequest("1.0", "antcloud.monitor.user.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取登录用户信息
         * Summary: 获取登录用户信息
         */
        public async Task<DetailUserResponse> DetailUserExAsync(DetailUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUserResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过登录名获取鉴权
         * Summary: 通过登录名获取鉴权
         */
        public AuthUserResponse AuthUser(AuthUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthUserEx(request, headers, runtime);
        }

        /**
         * Description: 通过登录名获取鉴权
         * Summary: 通过登录名获取鉴权
         */
        public async Task<AuthUserResponse> AuthUserAsync(AuthUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过登录名获取鉴权
         * Summary: 通过登录名获取鉴权
         */
        public AuthUserResponse AuthUserEx(AuthUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthUserResponse>(DoRequest("1.0", "antcloud.monitor.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过登录名获取鉴权
         * Summary: 通过登录名获取鉴权
         */
        public async Task<AuthUserResponse> AuthUserExAsync(AuthUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthUserResponse>(await DoRequestAsync("1.0", "antcloud.monitor.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取持久化日志路径级别的监控数据
         * Summary: 持久化日志监控
         */
        public QueryLogpathMetricsResponse QueryLogpathMetrics(QueryLogpathMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLogpathMetricsEx(request, headers, runtime);
        }

        /**
         * Description: 获取持久化日志路径级别的监控数据
         * Summary: 持久化日志监控
         */
        public async Task<QueryLogpathMetricsResponse> QueryLogpathMetricsAsync(QueryLogpathMetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLogpathMetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取持久化日志路径级别的监控数据
         * Summary: 持久化日志监控
         */
        public QueryLogpathMetricsResponse QueryLogpathMetricsEx(QueryLogpathMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLogpathMetricsResponse>(DoRequest("1.0", "antcloud.monitor.logpath.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取持久化日志路径级别的监控数据
         * Summary: 持久化日志监控
         */
        public async Task<QueryLogpathMetricsResponse> QueryLogpathMetricsExAsync(QueryLogpathMetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLogpathMetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.logpath.metrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query metric names
         * Summary: query metric names
         */
        public QueryXmetricNameResponse QueryXmetricName(QueryXmetricNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricNameEx(request, headers, runtime);
        }

        /**
         * Description: query metric names
         * Summary: query metric names
         */
        public async Task<QueryXmetricNameResponse> QueryXmetricNameAsync(QueryXmetricNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricNameExAsync(request, headers, runtime);
        }

        /**
         * Description: query metric names
         * Summary: query metric names
         */
        public QueryXmetricNameResponse QueryXmetricNameEx(QueryXmetricNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricNameResponse>(DoRequest("1.0", "antcloud.monitor.xmetric.name.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query metric names
         * Summary: query metric names
         */
        public async Task<QueryXmetricNameResponse> QueryXmetricNameExAsync(QueryXmetricNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricNameResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetric.name.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建alarmwebhook
         * Summary: 创建alarmwebhook
         */
        public CreateAlarmwebhookResponse CreateAlarmwebhook(CreateAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAlarmwebhookEx(request, headers, runtime);
        }

        /**
         * Description: 创建alarmwebhook
         * Summary: 创建alarmwebhook
         */
        public async Task<CreateAlarmwebhookResponse> CreateAlarmwebhookAsync(CreateAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAlarmwebhookExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建alarmwebhook
         * Summary: 创建alarmwebhook
         */
        public CreateAlarmwebhookResponse CreateAlarmwebhookEx(CreateAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmwebhookResponse>(DoRequest("1.0", "antcloud.monitor.alarmwebhook.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建alarmwebhook
         * Summary: 创建alarmwebhook
         */
        public async Task<CreateAlarmwebhookResponse> CreateAlarmwebhookExAsync(CreateAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmwebhookResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarmwebhook.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource 创建
         * Summary: datasource 创建
         */
        public CreateXdatasourceResponse CreateXdatasource(CreateXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateXdatasourceEx(request, headers, runtime);
        }

        /**
         * Description: datasource 创建
         * Summary: datasource 创建
         */
        public async Task<CreateXdatasourceResponse> CreateXdatasourceAsync(CreateXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateXdatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: datasource 创建
         * Summary: datasource 创建
         */
        public CreateXdatasourceResponse CreateXdatasourceEx(CreateXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXdatasourceResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource 创建
         * Summary: datasource 创建
         */
        public async Task<CreateXdatasourceResponse> CreateXdatasourceExAsync(CreateXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXdatasourceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: datasource update
         */
        public UpdateXdatasourceResponse UpdateXdatasource(UpdateXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateXdatasourceEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: datasource update
         */
        public async Task<UpdateXdatasourceResponse> UpdateXdatasourceAsync(UpdateXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateXdatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: datasource update
         */
        public UpdateXdatasourceResponse UpdateXdatasourceEx(UpdateXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXdatasourceResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: datasource update
         */
        public async Task<UpdateXdatasourceResponse> UpdateXdatasourceExAsync(UpdateXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXdatasourceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public GetXdatasourceResponse GetXdatasource(GetXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetXdatasourceEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<GetXdatasourceResponse> GetXdatasourceAsync(GetXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetXdatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public GetXdatasourceResponse GetXdatasourceEx(GetXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXdatasourceResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<GetXdatasourceResponse> GetXdatasourceExAsync(GetXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXdatasourceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public DeleteXdatasourceResponse DeleteXdatasource(DeleteXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteXdatasourceEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<DeleteXdatasourceResponse> DeleteXdatasourceAsync(DeleteXdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteXdatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public DeleteXdatasourceResponse DeleteXdatasourceEx(DeleteXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteXdatasourceResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<DeleteXdatasourceResponse> DeleteXdatasourceExAsync(DeleteXdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteXdatasourceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public ListXdatasourceDirectoryResponse ListXdatasourceDirectory(ListXdatasourceDirectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListXdatasourceDirectoryEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<ListXdatasourceDirectoryResponse> ListXdatasourceDirectoryAsync(ListXdatasourceDirectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListXdatasourceDirectoryExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public ListXdatasourceDirectoryResponse ListXdatasourceDirectoryEx(ListXdatasourceDirectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXdatasourceDirectoryResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.directory.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<ListXdatasourceDirectoryResponse> ListXdatasourceDirectoryExAsync(ListXdatasourceDirectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXdatasourceDirectoryResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.directory.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新alarmwebhook
         * Summary: 更新alarmwebhook
         */
        public UpdateAlarmwebhookResponse UpdateAlarmwebhook(UpdateAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAlarmwebhookEx(request, headers, runtime);
        }

        /**
         * Description: 更新alarmwebhook
         * Summary: 更新alarmwebhook
         */
        public async Task<UpdateAlarmwebhookResponse> UpdateAlarmwebhookAsync(UpdateAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAlarmwebhookExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新alarmwebhook
         * Summary: 更新alarmwebhook
         */
        public UpdateAlarmwebhookResponse UpdateAlarmwebhookEx(UpdateAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmwebhookResponse>(DoRequest("1.0", "antcloud.monitor.alarmwebhook.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新alarmwebhook
         * Summary: 更新alarmwebhook
         */
        public async Task<UpdateAlarmwebhookResponse> UpdateAlarmwebhookExAsync(UpdateAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmwebhookResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarmwebhook.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除alarmwebhook
         * Summary: 删除alarmwebhook
         */
        public DeleteAlarmwebhookResponse DeleteAlarmwebhook(DeleteAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAlarmwebhookEx(request, headers, runtime);
        }

        /**
         * Description: 删除alarmwebhook
         * Summary: 删除alarmwebhook
         */
        public async Task<DeleteAlarmwebhookResponse> DeleteAlarmwebhookAsync(DeleteAlarmwebhookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAlarmwebhookExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除alarmwebhook
         * Summary: 删除alarmwebhook
         */
        public DeleteAlarmwebhookResponse DeleteAlarmwebhookEx(DeleteAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmwebhookResponse>(DoRequest("1.0", "antcloud.monitor.alarmwebhook.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除alarmwebhook
         * Summary: 删除alarmwebhook
         */
        public async Task<DeleteAlarmwebhookResponse> DeleteAlarmwebhookExAsync(DeleteAlarmwebhookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmwebhookResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarmwebhook.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource table
         * Summary: datasource table
         */
        public QueryXdatasourceTableResponse QueryXdatasourceTable(QueryXdatasourceTableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdatasourceTableEx(request, headers, runtime);
        }

        /**
         * Description: datasource table
         * Summary: datasource table
         */
        public async Task<QueryXdatasourceTableResponse> QueryXdatasourceTableAsync(QueryXdatasourceTableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdatasourceTableExAsync(request, headers, runtime);
        }

        /**
         * Description: datasource table
         * Summary: datasource table
         */
        public QueryXdatasourceTableResponse QueryXdatasourceTableEx(QueryXdatasourceTableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceTableResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.table.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datasource table
         * Summary: datasource table
         */
        public async Task<QueryXdatasourceTableResponse> QueryXdatasourceTableExAsync(QueryXdatasourceTableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceTableResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.table.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警总览
         * Summary: 告警总览
         */
        public GetAlarmOverviewResponse GetAlarmOverview(GetAlarmOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAlarmOverviewEx(request, headers, runtime);
        }

        /**
         * Description: 告警总览
         * Summary: 告警总览
         */
        public async Task<GetAlarmOverviewResponse> GetAlarmOverviewAsync(GetAlarmOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAlarmOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警总览
         * Summary: 告警总览
         */
        public GetAlarmOverviewResponse GetAlarmOverviewEx(GetAlarmOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAlarmOverviewResponse>(DoRequest("1.0", "antcloud.monitor.alarm.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警总览
         * Summary: 告警总览
         */
        public async Task<GetAlarmOverviewResponse> GetAlarmOverviewExAsync(GetAlarmOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAlarmOverviewResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警数据
         * Summary: 查询应用的告警数据
         */
        public QueryAppAlarmstatsResponse QueryAppAlarmstats(QueryAppAlarmstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppAlarmstatsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警数据
         * Summary: 查询应用的告警数据
         */
        public async Task<QueryAppAlarmstatsResponse> QueryAppAlarmstatsAsync(QueryAppAlarmstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppAlarmstatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警数据
         * Summary: 查询应用的告警数据
         */
        public QueryAppAlarmstatsResponse QueryAppAlarmstatsEx(QueryAppAlarmstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppAlarmstatsResponse>(DoRequest("1.0", "antcloud.monitor.app.alarmstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警数据
         * Summary: 查询应用的告警数据
         */
        public async Task<QueryAppAlarmstatsResponse> QueryAppAlarmstatsExAsync(QueryAppAlarmstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppAlarmstatsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.alarmstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警趋势
         * Summary: 告警趋势
         */
        public QueryAlarmhistoryAlarmtrendsResponse QueryAlarmhistoryAlarmtrends(QueryAlarmhistoryAlarmtrendsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmhistoryAlarmtrendsEx(request, headers, runtime);
        }

        /**
         * Description: 告警趋势
         * Summary: 告警趋势
         */
        public async Task<QueryAlarmhistoryAlarmtrendsResponse> QueryAlarmhistoryAlarmtrendsAsync(QueryAlarmhistoryAlarmtrendsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmhistoryAlarmtrendsExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警趋势
         * Summary: 告警趋势
         */
        public QueryAlarmhistoryAlarmtrendsResponse QueryAlarmhistoryAlarmtrendsEx(QueryAlarmhistoryAlarmtrendsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmhistoryAlarmtrendsResponse>(DoRequest("1.0", "antcloud.monitor.alarmhistory.alarmtrends.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警趋势
         * Summary: 告警趋势
         */
        public async Task<QueryAlarmhistoryAlarmtrendsResponse> QueryAlarmhistoryAlarmtrendsExAsync(QueryAlarmhistoryAlarmtrendsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmhistoryAlarmtrendsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarmhistory.alarmtrends.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取workspace的配置
         * Summary: 获取workspace的配置
         */
        public GetWorkspaceConfigResponse GetWorkspaceConfig(GetWorkspaceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspaceConfigEx(request, headers, runtime);
        }

        /**
         * Description: 获取workspace的配置
         * Summary: 获取workspace的配置
         */
        public async Task<GetWorkspaceConfigResponse> GetWorkspaceConfigAsync(GetWorkspaceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspaceConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取workspace的配置
         * Summary: 获取workspace的配置
         */
        public GetWorkspaceConfigResponse GetWorkspaceConfigEx(GetWorkspaceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceConfigResponse>(DoRequest("1.0", "antcloud.monitor.workspace.config.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取workspace的配置
         * Summary: 获取workspace的配置
         */
        public async Task<GetWorkspaceConfigResponse> GetWorkspaceConfigExAsync(GetWorkspaceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.workspace.config.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent版本策略配置
         * Summary: Agent版本策略配置
         */
        public SetAgentVersionstrategyResponse SetAgentVersionstrategy(SetAgentVersionstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetAgentVersionstrategyEx(request, headers, runtime);
        }

        /**
         * Description: Agent版本策略配置
         * Summary: Agent版本策略配置
         */
        public async Task<SetAgentVersionstrategyResponse> SetAgentVersionstrategyAsync(SetAgentVersionstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetAgentVersionstrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: Agent版本策略配置
         * Summary: Agent版本策略配置
         */
        public SetAgentVersionstrategyResponse SetAgentVersionstrategyEx(SetAgentVersionstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAgentVersionstrategyResponse>(DoRequest("1.0", "antcloud.monitor.agent.versionstrategy.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent版本策略配置
         * Summary: Agent版本策略配置
         */
        public async Task<SetAgentVersionstrategyResponse> SetAgentVersionstrategyExAsync(SetAgentVersionstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAgentVersionstrategyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.versionstrategy.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取agent版本策略详情
         * Summary: 获取agent版本策略详情
         */
        public GetAgentVersionstrategyResponse GetAgentVersionstrategy(GetAgentVersionstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAgentVersionstrategyEx(request, headers, runtime);
        }

        /**
         * Description: 获取agent版本策略详情
         * Summary: 获取agent版本策略详情
         */
        public async Task<GetAgentVersionstrategyResponse> GetAgentVersionstrategyAsync(GetAgentVersionstrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAgentVersionstrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取agent版本策略详情
         * Summary: 获取agent版本策略详情
         */
        public GetAgentVersionstrategyResponse GetAgentVersionstrategyEx(GetAgentVersionstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAgentVersionstrategyResponse>(DoRequest("1.0", "antcloud.monitor.agent.versionstrategy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取agent版本策略详情
         * Summary: 获取agent版本策略详情
         */
        public async Task<GetAgentVersionstrategyResponse> GetAgentVersionstrategyExAsync(GetAgentVersionstrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAgentVersionstrategyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.versionstrategy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务器系统时间
         * Summary: 获取服务器系统时间
         */
        public GetSystemTimeResponse GetSystemTime(GetSystemTimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSystemTimeEx(request, headers, runtime);
        }

        /**
         * Description: 获取服务器系统时间
         * Summary: 获取服务器系统时间
         */
        public async Task<GetSystemTimeResponse> GetSystemTimeAsync(GetSystemTimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSystemTimeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取服务器系统时间
         * Summary: 获取服务器系统时间
         */
        public GetSystemTimeResponse GetSystemTimeEx(GetSystemTimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSystemTimeResponse>(DoRequest("1.0", "antcloud.monitor.system.time.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务器系统时间
         * Summary: 获取服务器系统时间
         */
        public async Task<GetSystemTimeResponse> GetSystemTimeExAsync(GetSystemTimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSystemTimeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.system.time.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: move datasource
         * Summary: move datasource
         */
        public ExecXdatasourceMoveResponse ExecXdatasourceMove(ExecXdatasourceMoveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecXdatasourceMoveEx(request, headers, runtime);
        }

        /**
         * Description: move datasource
         * Summary: move datasource
         */
        public async Task<ExecXdatasourceMoveResponse> ExecXdatasourceMoveAsync(ExecXdatasourceMoveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecXdatasourceMoveExAsync(request, headers, runtime);
        }

        /**
         * Description: move datasource
         * Summary: move datasource
         */
        public ExecXdatasourceMoveResponse ExecXdatasourceMoveEx(ExecXdatasourceMoveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecXdatasourceMoveResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.move.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: move datasource
         * Summary: move datasource
         */
        public async Task<ExecXdatasourceMoveResponse> ExecXdatasourceMoveExAsync(ExecXdatasourceMoveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecXdatasourceMoveResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.move.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metadata default tags
         * Summary: default tags
         */
        public QueryXmetadataTagResponse QueryXmetadataTag(QueryXmetadataTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetadataTagEx(request, headers, runtime);
        }

        /**
         * Description: metadata default tags
         * Summary: default tags
         */
        public async Task<QueryXmetadataTagResponse> QueryXmetadataTagAsync(QueryXmetadataTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetadataTagExAsync(request, headers, runtime);
        }

        /**
         * Description: metadata default tags
         * Summary: default tags
         */
        public QueryXmetadataTagResponse QueryXmetadataTagEx(QueryXmetadataTagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetadataTagResponse>(DoRequest("1.0", "antcloud.monitor.xmetadata.tag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: metadata default tags
         * Summary: default tags
         */
        public async Task<QueryXmetadataTagResponse> QueryXmetadataTagExAsync(QueryXmetadataTagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetadataTagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetadata.tag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: search datasource
         * Summary: search datasource
         */
        public QueryXdatasourceSearchResponse QueryXdatasourceSearch(QueryXdatasourceSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdatasourceSearchEx(request, headers, runtime);
        }

        /**
         * Description: search datasource
         * Summary: search datasource
         */
        public async Task<QueryXdatasourceSearchResponse> QueryXdatasourceSearchAsync(QueryXdatasourceSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdatasourceSearchExAsync(request, headers, runtime);
        }

        /**
         * Description: search datasource
         * Summary: search datasource
         */
        public QueryXdatasourceSearchResponse QueryXdatasourceSearchEx(QueryXdatasourceSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceSearchResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: search datasource
         * Summary: search datasource
         */
        public async Task<QueryXdatasourceSearchResponse> QueryXdatasourceSearchExAsync(QueryXdatasourceSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceSearchResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: query setup config
         */
        public QuerySetupConfigResponse QuerySetupConfig(QuerySetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySetupConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: query setup config
         */
        public async Task<QuerySetupConfigResponse> QuerySetupConfigAsync(QuerySetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySetupConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: query setup config
         */
        public QuerySetupConfigResponse QuerySetupConfigEx(QuerySetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySetupConfigResponse>(DoRequest("1.0", "antcloud.monitor.setup.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: query setup config
         */
        public async Task<QuerySetupConfigResponse> QuerySetupConfigExAsync(QuerySetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySetupConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.setup.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: update or insert 
         */
        public UpdateSetupConfigResponse UpdateSetupConfig(UpdateSetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSetupConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: update or insert 
         */
        public async Task<UpdateSetupConfigResponse> UpdateSetupConfigAsync(UpdateSetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSetupConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: update or insert 
         */
        public UpdateSetupConfigResponse UpdateSetupConfigEx(UpdateSetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSetupConfigResponse>(DoRequest("1.0", "antcloud.monitor.setup.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: update or insert 
         */
        public async Task<UpdateSetupConfigResponse> UpdateSetupConfigExAsync(UpdateSetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSetupConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.setup.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: delete config
         */
        public DeleteSetupConfigResponse DeleteSetupConfig(DeleteSetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSetupConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: delete config
         */
        public async Task<DeleteSetupConfigResponse> DeleteSetupConfigAsync(DeleteSetupConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSetupConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: delete config
         */
        public DeleteSetupConfigResponse DeleteSetupConfigEx(DeleteSetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSetupConfigResponse>(DoRequest("1.0", "antcloud.monitor.setup.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: delete config
         */
        public async Task<DeleteSetupConfigResponse> DeleteSetupConfigExAsync(DeleteSetupConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSetupConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.setup.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警开关配置更新
         * Summary: 告警开关配置更新
         */
        public UpdateWorkspaceSettingResponse UpdateWorkspaceSetting(UpdateWorkspaceSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWorkspaceSettingEx(request, headers, runtime);
        }

        /**
         * Description: 告警开关配置更新
         * Summary: 告警开关配置更新
         */
        public async Task<UpdateWorkspaceSettingResponse> UpdateWorkspaceSettingAsync(UpdateWorkspaceSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWorkspaceSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 告警开关配置更新
         * Summary: 告警开关配置更新
         */
        public UpdateWorkspaceSettingResponse UpdateWorkspaceSettingEx(UpdateWorkspaceSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWorkspaceSettingResponse>(DoRequest("1.0", "antcloud.monitor.workspace.setting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 告警开关配置更新
         * Summary: 告警开关配置更新
         */
        public async Task<UpdateWorkspaceSettingResponse> UpdateWorkspaceSettingExAsync(UpdateWorkspaceSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWorkspaceSettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.workspace.setting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public ExportXsiteConfigResponse ExportXsiteConfig(ExportXsiteConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportXsiteConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<ExportXsiteConfigResponse> ExportXsiteConfigAsync(ExportXsiteConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportXsiteConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public ExportXsiteConfigResponse ExportXsiteConfigEx(ExportXsiteConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportXsiteConfigResponse>(DoRequest("1.0", "antcloud.monitor.xsite.config.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<ExportXsiteConfigResponse> ExportXsiteConfigExAsync(ExportXsiteConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportXsiteConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xsite.config.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: import
         */
        public ImportXsiteConfigResponse ImportXsiteConfig(ImportXsiteConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportXsiteConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: import
         */
        public async Task<ImportXsiteConfigResponse> ImportXsiteConfigAsync(ImportXsiteConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportXsiteConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: import
         */
        public ImportXsiteConfigResponse ImportXsiteConfigEx(ImportXsiteConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportXsiteConfigResponse>(DoRequest("1.0", "antcloud.monitor.xsite.config.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: import
         */
        public async Task<ImportXsiteConfigResponse> ImportXsiteConfigExAsync(ImportXsiteConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportXsiteConfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xsite.config.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: tree
         */
        public QueryXdatasourceTreeResponse QueryXdatasourceTree(QueryXdatasourceTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdatasourceTreeEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: tree
         */
        public async Task<QueryXdatasourceTreeResponse> QueryXdatasourceTreeAsync(QueryXdatasourceTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdatasourceTreeExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: tree
         */
        public QueryXdatasourceTreeResponse QueryXdatasourceTreeEx(QueryXdatasourceTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceTreeResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.tree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: tree
         */
        public async Task<QueryXdatasourceTreeResponse> QueryXdatasourceTreeExAsync(QueryXdatasourceTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourceTreeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.tree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public QueryXdashboardTreeResponse QueryXdashboardTree(QueryXdashboardTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdashboardTreeEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<QueryXdashboardTreeResponse> QueryXdashboardTreeAsync(QueryXdashboardTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdashboardTreeExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public QueryXdashboardTreeResponse QueryXdashboardTreeEx(QueryXdashboardTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdashboardTreeResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.tree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<QueryXdashboardTreeResponse> QueryXdashboardTreeExAsync(QueryXdashboardTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdashboardTreeResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.tree.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: dashboard查询
         */
        public GetXdashboardResponse GetXdashboard(GetXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetXdashboardEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: dashboard查询
         */
        public async Task<GetXdashboardResponse> GetXdashboardAsync(GetXdashboardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetXdashboardExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: dashboard查询
         */
        public GetXdashboardResponse GetXdashboardEx(GetXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXdashboardResponse>(DoRequest("1.0", "antcloud.monitor.xdashboard.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: dashboard查询
         */
        public async Task<GetXdashboardResponse> GetXdashboardExAsync(GetXdashboardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXdashboardResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdashboard.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: prometheus metrics
         */
        public QueryXdatasourcePrometheusResponse QueryXdatasourcePrometheus(QueryXdatasourcePrometheusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXdatasourcePrometheusEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: prometheus metrics
         */
        public async Task<QueryXdatasourcePrometheusResponse> QueryXdatasourcePrometheusAsync(QueryXdatasourcePrometheusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXdatasourcePrometheusExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: prometheus metrics
         */
        public QueryXdatasourcePrometheusResponse QueryXdatasourcePrometheusEx(QueryXdatasourcePrometheusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourcePrometheusResponse>(DoRequest("1.0", "antcloud.monitor.xdatasource.prometheus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: prometheus metrics
         */
        public async Task<QueryXdatasourcePrometheusResponse> QueryXdatasourcePrometheusExAsync(QueryXdatasourcePrometheusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXdatasourcePrometheusResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xdatasource.prometheus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  获取总览页主机统计信息
         * Summary:  获取总览页主机统计信息
         */
        public GetNodeOverviewResponse GetNodeOverview(GetNodeOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNodeOverviewEx(request, headers, runtime);
        }

        /**
         * Description:  获取总览页主机统计信息
         * Summary:  获取总览页主机统计信息
         */
        public async Task<GetNodeOverviewResponse> GetNodeOverviewAsync(GetNodeOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNodeOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description:  获取总览页主机统计信息
         * Summary:  获取总览页主机统计信息
         */
        public GetNodeOverviewResponse GetNodeOverviewEx(GetNodeOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNodeOverviewResponse>(DoRequest("1.0", "antcloud.monitor.node.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  获取总览页主机统计信息
         * Summary:  获取总览页主机统计信息
         */
        public async Task<GetNodeOverviewResponse> GetNodeOverviewExAsync(GetNodeOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNodeOverviewResponse>(await DoRequestAsync("1.0", "antcloud.monitor.node.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 总览页配置信息统计
         * Summary: 总览页配置信息统计
         */
        public GetConfigOverviewResponse GetConfigOverview(GetConfigOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigOverviewEx(request, headers, runtime);
        }

        /**
         * Description: 总览页配置信息统计
         * Summary: 总览页配置信息统计
         */
        public async Task<GetConfigOverviewResponse> GetConfigOverviewAsync(GetConfigOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 总览页配置信息统计
         * Summary: 总览页配置信息统计
         */
        public GetConfigOverviewResponse GetConfigOverviewEx(GetConfigOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigOverviewResponse>(DoRequest("1.0", "antcloud.monitor.config.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 总览页配置信息统计
         * Summary: 总览页配置信息统计
         */
        public async Task<GetConfigOverviewResponse> GetConfigOverviewExAsync(GetConfigOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigOverviewResponse>(await DoRequestAsync("1.0", "antcloud.monitor.config.overview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取workspace具体配置
         * Summary: 获取workspace具体配置
         */
        public GetWorkspaceSettingResponse GetWorkspaceSetting(GetWorkspaceSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspaceSettingEx(request, headers, runtime);
        }

        /**
         * Description: 获取workspace具体配置
         * Summary: 获取workspace具体配置
         */
        public async Task<GetWorkspaceSettingResponse> GetWorkspaceSettingAsync(GetWorkspaceSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspaceSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取workspace具体配置
         * Summary: 获取workspace具体配置
         */
        public GetWorkspaceSettingResponse GetWorkspaceSettingEx(GetWorkspaceSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceSettingResponse>(DoRequest("1.0", "antcloud.monitor.workspace.setting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取workspace具体配置
         * Summary: 获取workspace具体配置
         */
        public async Task<GetWorkspaceSettingResponse> GetWorkspaceSettingExAsync(GetWorkspaceSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceSettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.workspace.setting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路工作空间配置
         * Summary: 获取链路工作空间配置
         */
        public ListTraceWorkspacesettingResponse ListTraceWorkspacesetting(ListTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTraceWorkspacesettingEx(request, headers, runtime);
        }

        /**
         * Description: 获取链路工作空间配置
         * Summary: 获取链路工作空间配置
         */
        public async Task<ListTraceWorkspacesettingResponse> ListTraceWorkspacesettingAsync(ListTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTraceWorkspacesettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链路工作空间配置
         * Summary: 获取链路工作空间配置
         */
        public ListTraceWorkspacesettingResponse ListTraceWorkspacesettingEx(ListTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTraceWorkspacesettingResponse>(DoRequest("1.0", "antcloud.monitor.trace.workspacesetting.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路工作空间配置
         * Summary: 获取链路工作空间配置
         */
        public async Task<ListTraceWorkspacesettingResponse> ListTraceWorkspacesettingExAsync(ListTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTraceWorkspacesettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.workspacesetting.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路工作空间配置更新
         * Summary: 链路工作空间配置更新
         */
        public UpdateTraceWorkspacesettingResponse UpdateTraceWorkspacesetting(UpdateTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraceWorkspacesettingEx(request, headers, runtime);
        }

        /**
         * Description: 链路工作空间配置更新
         * Summary: 链路工作空间配置更新
         */
        public async Task<UpdateTraceWorkspacesettingResponse> UpdateTraceWorkspacesettingAsync(UpdateTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraceWorkspacesettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 链路工作空间配置更新
         * Summary: 链路工作空间配置更新
         */
        public UpdateTraceWorkspacesettingResponse UpdateTraceWorkspacesettingEx(UpdateTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraceWorkspacesettingResponse>(DoRequest("1.0", "antcloud.monitor.trace.workspacesetting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链路工作空间配置更新
         * Summary: 链路工作空间配置更新
         */
        public async Task<UpdateTraceWorkspacesettingResponse> UpdateTraceWorkspacesettingExAsync(UpdateTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraceWorkspacesettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.workspacesetting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: APP配置列表
         * Summary: APP配置列表
         */
        public ListAppSettingResponse ListAppSetting(ListAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppSettingEx(request, headers, runtime);
        }

        /**
         * Description: APP配置列表
         * Summary: APP配置列表
         */
        public async Task<ListAppSettingResponse> ListAppSettingAsync(ListAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: APP配置列表
         * Summary: APP配置列表
         */
        public ListAppSettingResponse ListAppSettingEx(ListAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppSettingResponse>(DoRequest("1.0", "antcloud.monitor.app.setting.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: APP配置列表
         * Summary: APP配置列表
         */
        public async Task<ListAppSettingResponse> ListAppSettingExAsync(ListAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppSettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.setting.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建APP配置信息
         * Summary: 创建APP配置信息
         */
        public UpdateAppSettingResponse UpdateAppSetting(UpdateAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppSettingEx(request, headers, runtime);
        }

        /**
         * Description: 创建APP配置信息
         * Summary: 创建APP配置信息
         */
        public async Task<UpdateAppSettingResponse> UpdateAppSettingAsync(UpdateAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建APP配置信息
         * Summary: 创建APP配置信息
         */
        public UpdateAppSettingResponse UpdateAppSettingEx(UpdateAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppSettingResponse>(DoRequest("1.0", "antcloud.monitor.app.setting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建APP配置信息
         * Summary: 创建APP配置信息
         */
        public async Task<UpdateAppSettingResponse> UpdateAppSettingExAsync(UpdateAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppSettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.setting.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取APP配置信息
         * Summary: 获取APP配置信息
         */
        public GetAppSettingResponse GetAppSetting(GetAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppSettingEx(request, headers, runtime);
        }

        /**
         * Description: 获取APP配置信息
         * Summary: 获取APP配置信息
         */
        public async Task<GetAppSettingResponse> GetAppSettingAsync(GetAppSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取APP配置信息
         * Summary: 获取APP配置信息
         */
        public GetAppSettingResponse GetAppSettingEx(GetAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppSettingResponse>(DoRequest("1.0", "antcloud.monitor.app.setting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取APP配置信息
         * Summary: 获取APP配置信息
         */
        public async Task<GetAppSettingResponse> GetAppSettingExAsync(GetAppSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppSettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.setting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某一告警事件相关的告警列表
         * Summary: 查询某一告警事件相关的告警列表
         */
        public QueryUnifiedalarmEventdetailResponse QueryUnifiedalarmEventdetail(QueryUnifiedalarmEventdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmEventdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询某一告警事件相关的告警列表
         * Summary: 查询某一告警事件相关的告警列表
         */
        public async Task<QueryUnifiedalarmEventdetailResponse> QueryUnifiedalarmEventdetailAsync(QueryUnifiedalarmEventdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmEventdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某一告警事件相关的告警列表
         * Summary: 查询某一告警事件相关的告警列表
         */
        public QueryUnifiedalarmEventdetailResponse QueryUnifiedalarmEventdetailEx(QueryUnifiedalarmEventdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventdetailResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.eventdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某一告警事件相关的告警列表
         * Summary: 查询某一告警事件相关的告警列表
         */
        public async Task<QueryUnifiedalarmEventdetailResponse> QueryUnifiedalarmEventdetailExAsync(QueryUnifiedalarmEventdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmEventdetailResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.eventdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警指标清单
         * Summary: 查询应用的告警指标清单
         */
        public QueryUnifiedalarmMonitorlistResponse QueryUnifiedalarmMonitorlist(QueryUnifiedalarmMonitorlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmMonitorlistEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警指标清单
         * Summary: 查询应用的告警指标清单
         */
        public async Task<QueryUnifiedalarmMonitorlistResponse> QueryUnifiedalarmMonitorlistAsync(QueryUnifiedalarmMonitorlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmMonitorlistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警指标清单
         * Summary: 查询应用的告警指标清单
         */
        public QueryUnifiedalarmMonitorlistResponse QueryUnifiedalarmMonitorlistEx(QueryUnifiedalarmMonitorlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmMonitorlistResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.monitorlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警指标清单
         * Summary: 查询应用的告警指标清单
         */
        public async Task<QueryUnifiedalarmMonitorlistResponse> QueryUnifiedalarmMonitorlistExAsync(QueryUnifiedalarmMonitorlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmMonitorlistResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.monitorlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public QueryXmetricTableResponse QueryXmetricTable(QueryXmetricTableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryXmetricTableEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<QueryXmetricTableResponse> QueryXmetricTableAsync(QueryXmetricTableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryXmetricTableExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary:  
         */
        public QueryXmetricTableResponse QueryXmetricTableEx(QueryXmetricTableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricTableResponse>(DoRequest("1.0", "antcloud.monitor.xmetric.table.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary:  
         */
        public async Task<QueryXmetricTableResponse> QueryXmetricTableExAsync(QueryXmetricTableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryXmetricTableResponse>(await DoRequestAsync("1.0", "antcloud.monitor.xmetric.table.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的SQL调用指标
         * Summary: 查询应用的SQL调用指标
         */
        public QueryTraceAppsqlmetricsResponse QueryTraceAppsqlmetrics(QueryTraceAppsqlmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppsqlmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的SQL调用指标
         * Summary: 查询应用的SQL调用指标
         */
        public async Task<QueryTraceAppsqlmetricsResponse> QueryTraceAppsqlmetricsAsync(QueryTraceAppsqlmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppsqlmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的SQL调用指标
         * Summary: 查询应用的SQL调用指标
         */
        public QueryTraceAppsqlmetricsResponse QueryTraceAppsqlmetricsEx(QueryTraceAppsqlmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppsqlmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.appsqlmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的SQL调用指标
         * Summary: 查询应用的SQL调用指标
         */
        public async Task<QueryTraceAppsqlmetricsResponse> QueryTraceAppsqlmetricsExAsync(QueryTraceAppsqlmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppsqlmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appsqlmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的SQL请求调用明细
         * Summary: 查询应用的SQL请求调用明细
         */
        public QueryTraceAppsqlstatResponse QueryTraceAppsqlstat(QueryTraceAppsqlstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppsqlstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的SQL请求调用明细
         * Summary: 查询应用的SQL请求调用明细
         */
        public async Task<QueryTraceAppsqlstatResponse> QueryTraceAppsqlstatAsync(QueryTraceAppsqlstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppsqlstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的SQL请求调用明细
         * Summary: 查询应用的SQL请求调用明细
         */
        public QueryTraceAppsqlstatResponse QueryTraceAppsqlstatEx(QueryTraceAppsqlstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppsqlstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.appsqlstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的SQL请求调用明细
         * Summary: 查询应用的SQL请求调用明细
         */
        public async Task<QueryTraceAppsqlstatResponse> QueryTraceAppsqlstatExAsync(QueryTraceAppsqlstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppsqlstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appsqlstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的NoSQL调用指标
         * Summary: 查询应用的NoSQL调用指标
         */
        public QueryTraceAppnosqlmetricsResponse QueryTraceAppnosqlmetrics(QueryTraceAppnosqlmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppnosqlmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的NoSQL调用指标
         * Summary: 查询应用的NoSQL调用指标
         */
        public async Task<QueryTraceAppnosqlmetricsResponse> QueryTraceAppnosqlmetricsAsync(QueryTraceAppnosqlmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppnosqlmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的NoSQL调用指标
         * Summary: 查询应用的NoSQL调用指标
         */
        public QueryTraceAppnosqlmetricsResponse QueryTraceAppnosqlmetricsEx(QueryTraceAppnosqlmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppnosqlmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.appnosqlmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的NoSQL调用指标
         * Summary: 查询应用的NoSQL调用指标
         */
        public async Task<QueryTraceAppnosqlmetricsResponse> QueryTraceAppnosqlmetricsExAsync(QueryTraceAppnosqlmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppnosqlmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appnosqlmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ消费调用指标
         * Summary: 查询应用的MQ消费调用指标
         */
        public QueryTraceAppmqconsumemetricsResponse QueryTraceAppmqconsumemetrics(QueryTraceAppmqconsumemetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppmqconsumemetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ消费调用指标
         * Summary: 查询应用的MQ消费调用指标
         */
        public async Task<QueryTraceAppmqconsumemetricsResponse> QueryTraceAppmqconsumemetricsAsync(QueryTraceAppmqconsumemetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppmqconsumemetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ消费调用指标
         * Summary: 查询应用的MQ消费调用指标
         */
        public QueryTraceAppmqconsumemetricsResponse QueryTraceAppmqconsumemetricsEx(QueryTraceAppmqconsumemetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqconsumemetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.appmqconsumemetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ消费调用指标
         * Summary: 查询应用的MQ消费调用指标
         */
        public async Task<QueryTraceAppmqconsumemetricsResponse> QueryTraceAppmqconsumemetricsExAsync(QueryTraceAppmqconsumemetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqconsumemetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appmqconsumemetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC客户端调用指标
         * Summary: 查询应用的RPC客户端调用指标
         */
        public QueryTraceApprpcclientmetricsResponse QueryTraceApprpcclientmetrics(QueryTraceApprpcclientmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApprpcclientmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC客户端调用指标
         * Summary: 查询应用的RPC客户端调用指标
         */
        public async Task<QueryTraceApprpcclientmetricsResponse> QueryTraceApprpcclientmetricsAsync(QueryTraceApprpcclientmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApprpcclientmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC客户端调用指标
         * Summary: 查询应用的RPC客户端调用指标
         */
        public QueryTraceApprpcclientmetricsResponse QueryTraceApprpcclientmetricsEx(QueryTraceApprpcclientmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcclientmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.apprpcclientmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC客户端调用指标
         * Summary: 查询应用的RPC客户端调用指标
         */
        public async Task<QueryTraceApprpcclientmetricsResponse> QueryTraceApprpcclientmetricsExAsync(QueryTraceApprpcclientmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcclientmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apprpcclientmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC服务端指标
         * Summary:  查询应用的RPC服务端指标
         */
        public QueryTraceApprpcservermetricsResponse QueryTraceApprpcservermetrics(QueryTraceApprpcservermetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApprpcservermetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC服务端指标
         * Summary:  查询应用的RPC服务端指标
         */
        public async Task<QueryTraceApprpcservermetricsResponse> QueryTraceApprpcservermetricsAsync(QueryTraceApprpcservermetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApprpcservermetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC服务端指标
         * Summary:  查询应用的RPC服务端指标
         */
        public QueryTraceApprpcservermetricsResponse QueryTraceApprpcservermetricsEx(QueryTraceApprpcservermetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcservermetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.apprpcservermetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC服务端指标
         * Summary:  查询应用的RPC服务端指标
         */
        public async Task<QueryTraceApprpcservermetricsResponse> QueryTraceApprpcservermetricsExAsync(QueryTraceApprpcservermetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcservermetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apprpcservermetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP客户端调用指标
         * Summary: 查询应用的HTTP客户端调用指标
         */
        public QueryTraceApphttpclientmetricsResponse QueryTraceApphttpclientmetrics(QueryTraceApphttpclientmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApphttpclientmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP客户端调用指标
         * Summary: 查询应用的HTTP客户端调用指标
         */
        public async Task<QueryTraceApphttpclientmetricsResponse> QueryTraceApphttpclientmetricsAsync(QueryTraceApphttpclientmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApphttpclientmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP客户端调用指标
         * Summary: 查询应用的HTTP客户端调用指标
         */
        public QueryTraceApphttpclientmetricsResponse QueryTraceApphttpclientmetricsEx(QueryTraceApphttpclientmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpclientmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.apphttpclientmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP客户端调用指标
         * Summary: 查询应用的HTTP客户端调用指标
         */
        public async Task<QueryTraceApphttpclientmetricsResponse> QueryTraceApphttpclientmetricsExAsync(QueryTraceApphttpclientmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpclientmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apphttpclientmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端指标
         * Summary: 查询应用的HTTP服务端指标
         */
        public QueryTraceApphttpservermetricsResponse QueryTraceApphttpservermetrics(QueryTraceApphttpservermetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApphttpservermetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端指标
         * Summary: 查询应用的HTTP服务端指标
         */
        public async Task<QueryTraceApphttpservermetricsResponse> QueryTraceApphttpservermetricsAsync(QueryTraceApphttpservermetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApphttpservermetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端指标
         * Summary: 查询应用的HTTP服务端指标
         */
        public QueryTraceApphttpservermetricsResponse QueryTraceApphttpservermetricsEx(QueryTraceApphttpservermetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpservermetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.apphttpservermetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端指标
         * Summary: 查询应用的HTTP服务端指标
         */
        public async Task<QueryTraceApphttpservermetricsResponse> QueryTraceApphttpservermetricsExAsync(QueryTraceApphttpservermetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpservermetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apphttpservermetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的NoSQL请求调用明细
         * Summary: 查询应用的NoSQL请求调用明细
         */
        public QueryTraceAppnosqlstatResponse QueryTraceAppnosqlstat(QueryTraceAppnosqlstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppnosqlstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的NoSQL请求调用明细
         * Summary: 查询应用的NoSQL请求调用明细
         */
        public async Task<QueryTraceAppnosqlstatResponse> QueryTraceAppnosqlstatAsync(QueryTraceAppnosqlstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppnosqlstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的NoSQL请求调用明细
         * Summary: 查询应用的NoSQL请求调用明细
         */
        public QueryTraceAppnosqlstatResponse QueryTraceAppnosqlstatEx(QueryTraceAppnosqlstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppnosqlstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.appnosqlstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的NoSQL请求调用明细
         * Summary: 查询应用的NoSQL请求调用明细
         */
        public async Task<QueryTraceAppnosqlstatResponse> QueryTraceAppnosqlstatExAsync(QueryTraceAppnosqlstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppnosqlstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appnosqlstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ消费调用明细
         * Summary: 查询应用的MQ消费调用明细
         */
        public QueryTraceAppmqconsumestatResponse QueryTraceAppmqconsumestat(QueryTraceAppmqconsumestatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppmqconsumestatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ消费调用明细
         * Summary: 查询应用的MQ消费调用明细
         */
        public async Task<QueryTraceAppmqconsumestatResponse> QueryTraceAppmqconsumestatAsync(QueryTraceAppmqconsumestatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppmqconsumestatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ消费调用明细
         * Summary: 查询应用的MQ消费调用明细
         */
        public QueryTraceAppmqconsumestatResponse QueryTraceAppmqconsumestatEx(QueryTraceAppmqconsumestatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqconsumestatResponse>(DoRequest("1.0", "antcloud.monitor.trace.appmqconsumestat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ消费调用明细
         * Summary: 查询应用的MQ消费调用明细
         */
        public async Task<QueryTraceAppmqconsumestatResponse> QueryTraceAppmqconsumestatExAsync(QueryTraceAppmqconsumestatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqconsumestatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appmqconsumestat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP客户端请求调用明细
         * Summary: 查询应用的HTTP客户端请求调用明细
         */
        public QueryTraceApphttpclientstatResponse QueryTraceApphttpclientstat(QueryTraceApphttpclientstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApphttpclientstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP客户端请求调用明细
         * Summary: 查询应用的HTTP客户端请求调用明细
         */
        public async Task<QueryTraceApphttpclientstatResponse> QueryTraceApphttpclientstatAsync(QueryTraceApphttpclientstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApphttpclientstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP客户端请求调用明细
         * Summary: 查询应用的HTTP客户端请求调用明细
         */
        public QueryTraceApphttpclientstatResponse QueryTraceApphttpclientstatEx(QueryTraceApphttpclientstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpclientstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.apphttpclientstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP客户端请求调用明细
         * Summary: 查询应用的HTTP客户端请求调用明细
         */
        public async Task<QueryTraceApphttpclientstatResponse> QueryTraceApphttpclientstatExAsync(QueryTraceApphttpclientstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpclientstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apphttpclientstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端调用明细
         * Summary: 查询应用的HTTP服务端调用明细
         */
        public QueryTraceApphttpserverstatResponse QueryTraceApphttpserverstat(QueryTraceApphttpserverstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApphttpserverstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端调用明细
         * Summary: 查询应用的HTTP服务端调用明细
         */
        public async Task<QueryTraceApphttpserverstatResponse> QueryTraceApphttpserverstatAsync(QueryTraceApphttpserverstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApphttpserverstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端调用明细
         * Summary: 查询应用的HTTP服务端调用明细
         */
        public QueryTraceApphttpserverstatResponse QueryTraceApphttpserverstatEx(QueryTraceApphttpserverstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpserverstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.apphttpserverstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端调用明细
         * Summary: 查询应用的HTTP服务端调用明细
         */
        public async Task<QueryTraceApphttpserverstatResponse> QueryTraceApphttpserverstatExAsync(QueryTraceApphttpserverstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpserverstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apphttpserverstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC客户端请求调用明细
         * Summary: 查询应用的RPC客户端请求调用明细
         */
        public QueryTraceApprpcclientstatResponse QueryTraceApprpcclientstat(QueryTraceApprpcclientstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApprpcclientstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC客户端请求调用明细
         * Summary: 查询应用的RPC客户端请求调用明细
         */
        public async Task<QueryTraceApprpcclientstatResponse> QueryTraceApprpcclientstatAsync(QueryTraceApprpcclientstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApprpcclientstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC客户端请求调用明细
         * Summary: 查询应用的RPC客户端请求调用明细
         */
        public QueryTraceApprpcclientstatResponse QueryTraceApprpcclientstatEx(QueryTraceApprpcclientstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcclientstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.apprpcclientstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC客户端请求调用明细
         * Summary: 查询应用的RPC客户端请求调用明细
         */
        public async Task<QueryTraceApprpcclientstatResponse> QueryTraceApprpcclientstatExAsync(QueryTraceApprpcclientstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcclientstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apprpcclientstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC服务端调用明细
         * Summary: 查询应用的RPC服务端调用明细
         */
        public QueryTraceApprpcserverstatResponse QueryTraceApprpcserverstat(QueryTraceApprpcserverstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApprpcserverstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC服务端调用明细
         * Summary: 查询应用的RPC服务端调用明细
         */
        public async Task<QueryTraceApprpcserverstatResponse> QueryTraceApprpcserverstatAsync(QueryTraceApprpcserverstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApprpcserverstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的RPC服务端调用明细
         * Summary: 查询应用的RPC服务端调用明细
         */
        public QueryTraceApprpcserverstatResponse QueryTraceApprpcserverstatEx(QueryTraceApprpcserverstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcserverstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.apprpcserverstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的RPC服务端调用明细
         * Summary: 查询应用的RPC服务端调用明细
         */
        public async Task<QueryTraceApprpcserverstatResponse> QueryTraceApprpcserverstatExAsync(QueryTraceApprpcserverstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApprpcserverstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apprpcserverstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路单工作空间配置
         * Summary: 获取链路单工作空间配置
         */
        public GetTraceWorkspacesettingResponse GetTraceWorkspacesetting(GetTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraceWorkspacesettingEx(request, headers, runtime);
        }

        /**
         * Description: 获取链路单工作空间配置
         * Summary: 获取链路单工作空间配置
         */
        public async Task<GetTraceWorkspacesettingResponse> GetTraceWorkspacesettingAsync(GetTraceWorkspacesettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraceWorkspacesettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链路单工作空间配置
         * Summary: 获取链路单工作空间配置
         */
        public GetTraceWorkspacesettingResponse GetTraceWorkspacesettingEx(GetTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraceWorkspacesettingResponse>(DoRequest("1.0", "antcloud.monitor.trace.workspacesetting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链路单工作空间配置
         * Summary: 获取链路单工作空间配置
         */
        public async Task<GetTraceWorkspacesettingResponse> GetTraceWorkspacesettingExAsync(GetTraceWorkspacesettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraceWorkspacesettingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.workspacesetting.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ生产调用指标
         * Summary: 查询应用的MQ生产调用指标
         */
        public QueryTraceAppmqproducemetricsResponse QueryTraceAppmqproducemetrics(QueryTraceAppmqproducemetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppmqproducemetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ生产调用指标
         * Summary: 查询应用的MQ生产调用指标
         */
        public async Task<QueryTraceAppmqproducemetricsResponse> QueryTraceAppmqproducemetricsAsync(QueryTraceAppmqproducemetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppmqproducemetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ生产调用指标
         * Summary: 查询应用的MQ生产调用指标
         */
        public QueryTraceAppmqproducemetricsResponse QueryTraceAppmqproducemetricsEx(QueryTraceAppmqproducemetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqproducemetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.appmqproducemetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ生产调用指标
         * Summary: 查询应用的MQ生产调用指标
         */
        public async Task<QueryTraceAppmqproducemetricsResponse> QueryTraceAppmqproducemetricsExAsync(QueryTraceAppmqproducemetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqproducemetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appmqproducemetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ生产调用明细
         * Summary: 查询应用的MQ生产调用明细
         */
        public QueryTraceAppmqproducestatResponse QueryTraceAppmqproducestat(QueryTraceAppmqproducestatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppmqproducestatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ生产调用明细
         * Summary: 查询应用的MQ生产调用明细
         */
        public async Task<QueryTraceAppmqproducestatResponse> QueryTraceAppmqproducestatAsync(QueryTraceAppmqproducestatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppmqproducestatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的MQ生产调用明细
         * Summary: 查询应用的MQ生产调用明细
         */
        public QueryTraceAppmqproducestatResponse QueryTraceAppmqproducestatEx(QueryTraceAppmqproducestatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqproducestatResponse>(DoRequest("1.0", "antcloud.monitor.trace.appmqproducestat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的MQ生产调用明细
         * Summary: 查询应用的MQ生产调用明细
         */
        public async Task<QueryTraceAppmqproducestatResponse> QueryTraceAppmqproducestatExAsync(QueryTraceAppmqproducestatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppmqproducestatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appmqproducestat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 计量计费是否开启
         * Summary: 计量计费是否开启
         */
        public GetMeasurementStatusResponse GetMeasurementStatus(GetMeasurementStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMeasurementStatusEx(request, headers, runtime);
        }

        /**
         * Description: 计量计费是否开启
         * Summary: 计量计费是否开启
         */
        public async Task<GetMeasurementStatusResponse> GetMeasurementStatusAsync(GetMeasurementStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMeasurementStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 计量计费是否开启
         * Summary: 计量计费是否开启
         */
        public GetMeasurementStatusResponse GetMeasurementStatusEx(GetMeasurementStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMeasurementStatusResponse>(DoRequest("1.0", "antcloud.monitor.measurement.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 计量计费是否开启
         * Summary: 计量计费是否开启
         */
        public async Task<GetMeasurementStatusResponse> GetMeasurementStatusExAsync(GetMeasurementStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMeasurementStatusResponse>(await DoRequestAsync("1.0", "antcloud.monitor.measurement.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志查询页面获取应用列表
         * Summary: 获取应用列表
         */
        public QueryLogserviceAppsResponse QueryLogserviceApps(QueryLogserviceAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLogserviceAppsEx(request, headers, runtime);
        }

        /**
         * Description: 日志查询页面获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<QueryLogserviceAppsResponse> QueryLogserviceAppsAsync(QueryLogserviceAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLogserviceAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 日志查询页面获取应用列表
         * Summary: 获取应用列表
         */
        public QueryLogserviceAppsResponse QueryLogserviceAppsEx(QueryLogserviceAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLogserviceAppsResponse>(DoRequest("1.0", "antcloud.monitor.logservice.apps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日志查询页面获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<QueryLogserviceAppsResponse> QueryLogserviceAppsExAsync(QueryLogserviceAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLogserviceAppsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.logservice.apps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端状态指标
         * Summary: 查询应用的HTTP服务端状态指标
         */
        public QueryTraceApphttpserverstatusmetricsResponse QueryTraceApphttpserverstatusmetrics(QueryTraceApphttpserverstatusmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceApphttpserverstatusmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端状态指标
         * Summary: 查询应用的HTTP服务端状态指标
         */
        public async Task<QueryTraceApphttpserverstatusmetricsResponse> QueryTraceApphttpserverstatusmetricsAsync(QueryTraceApphttpserverstatusmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceApphttpserverstatusmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的HTTP服务端状态指标
         * Summary: 查询应用的HTTP服务端状态指标
         */
        public QueryTraceApphttpserverstatusmetricsResponse QueryTraceApphttpserverstatusmetricsEx(QueryTraceApphttpserverstatusmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpserverstatusmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.apphttpserverstatusmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的HTTP服务端状态指标
         * Summary: 查询应用的HTTP服务端状态指标
         */
        public async Task<QueryTraceApphttpserverstatusmetricsResponse> QueryTraceApphttpserverstatusmetricsExAsync(QueryTraceApphttpserverstatusmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceApphttpserverstatusmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.apphttpserverstatusmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警指标，或应用已经配置。
         * Summary: 查询应用的告警指标清单
         */
        public QueryAppAlarmrulesResponse QueryAppAlarmrules(QueryAppAlarmrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppAlarmrulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警指标，或应用已经配置。
         * Summary: 查询应用的告警指标清单
         */
        public async Task<QueryAppAlarmrulesResponse> QueryAppAlarmrulesAsync(QueryAppAlarmrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppAlarmrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的告警指标，或应用已经配置。
         * Summary: 查询应用的告警指标清单
         */
        public QueryAppAlarmrulesResponse QueryAppAlarmrulesEx(QueryAppAlarmrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppAlarmrulesResponse>(DoRequest("1.0", "antcloud.monitor.app.alarmrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的告警指标，或应用已经配置。
         * Summary: 查询应用的告警指标清单
         */
        public async Task<QueryAppAlarmrulesResponse> QueryAppAlarmrulesExAsync(QueryAppAlarmrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppAlarmrulesResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.alarmrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路紧凑详情
         * Summary: 查询链路紧凑详情
         */
        public QueryTraceCompactdetailResponse QueryTraceCompactdetail(QueryTraceCompactdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceCompactdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询链路紧凑详情
         * Summary: 查询链路紧凑详情
         */
        public async Task<QueryTraceCompactdetailResponse> QueryTraceCompactdetailAsync(QueryTraceCompactdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceCompactdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链路紧凑详情
         * Summary: 查询链路紧凑详情
         */
        public QueryTraceCompactdetailResponse QueryTraceCompactdetailEx(QueryTraceCompactdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceCompactdetailResponse>(DoRequest("1.0", "antcloud.monitor.trace.compactdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链路紧凑详情
         * Summary: 查询链路紧凑详情
         */
        public async Task<QueryTraceCompactdetailResponse> QueryTraceCompactdetailExAsync(QueryTraceCompactdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceCompactdetailResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.compactdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的异常调用指标
         * Summary: 查询应用的异常调用指标
         */
        public QueryTraceAppexceptionmetricsResponse QueryTraceAppexceptionmetrics(QueryTraceAppexceptionmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppexceptionmetricsEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的异常调用指标
         * Summary: 查询应用的异常调用指标
         */
        public async Task<QueryTraceAppexceptionmetricsResponse> QueryTraceAppexceptionmetricsAsync(QueryTraceAppexceptionmetricsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppexceptionmetricsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的异常调用指标
         * Summary: 查询应用的异常调用指标
         */
        public QueryTraceAppexceptionmetricsResponse QueryTraceAppexceptionmetricsEx(QueryTraceAppexceptionmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppexceptionmetricsResponse>(DoRequest("1.0", "antcloud.monitor.trace.appexceptionmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的异常调用指标
         * Summary: 查询应用的异常调用指标
         */
        public async Task<QueryTraceAppexceptionmetricsResponse> QueryTraceAppexceptionmetricsExAsync(QueryTraceAppexceptionmetricsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppexceptionmetricsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appexceptionmetrics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的异常请求调用明细
         * Summary: 查询应用的异常请求调用明细
         */
        public QueryTraceAppexceptionstatResponse QueryTraceAppexceptionstat(QueryTraceAppexceptionstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceAppexceptionstatEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用的异常请求调用明细
         * Summary: 查询应用的异常请求调用明细
         */
        public async Task<QueryTraceAppexceptionstatResponse> QueryTraceAppexceptionstatAsync(QueryTraceAppexceptionstatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceAppexceptionstatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用的异常请求调用明细
         * Summary: 查询应用的异常请求调用明细
         */
        public QueryTraceAppexceptionstatResponse QueryTraceAppexceptionstatEx(QueryTraceAppexceptionstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppexceptionstatResponse>(DoRequest("1.0", "antcloud.monitor.trace.appexceptionstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用的异常请求调用明细
         * Summary: 查询应用的异常请求调用明细
         */
        public async Task<QueryTraceAppexceptionstatResponse> QueryTraceAppexceptionstatExAsync(QueryTraceAppexceptionstatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceAppexceptionstatResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.appexceptionstat.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警绑定关系
         * Summary: 罗予
         */
        public QueryUnifiedalarmRulebindingResponse QueryUnifiedalarmRulebinding(QueryUnifiedalarmRulebindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedalarmRulebindingEx(request, headers, runtime);
        }

        /**
         * Description: 查询告警绑定关系
         * Summary: 罗予
         */
        public async Task<QueryUnifiedalarmRulebindingResponse> QueryUnifiedalarmRulebindingAsync(QueryUnifiedalarmRulebindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedalarmRulebindingExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询告警绑定关系
         * Summary: 罗予
         */
        public QueryUnifiedalarmRulebindingResponse QueryUnifiedalarmRulebindingEx(QueryUnifiedalarmRulebindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmRulebindingResponse>(DoRequest("1.0", "antcloud.monitor.unifiedalarm.rulebinding.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询告警绑定关系
         * Summary: 罗予
         */
        public async Task<QueryUnifiedalarmRulebindingResponse> QueryUnifiedalarmRulebindingExAsync(QueryUnifiedalarmRulebindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedalarmRulebindingResponse>(await DoRequestAsync("1.0", "antcloud.monitor.unifiedalarm.rulebinding.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控数据诊断列表查询
         * Summary: 监控数据诊断列表查询
         */
        public QueryOpsCheckResponse QueryOpsCheck(QueryOpsCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsCheckEx(request, headers, runtime);
        }

        /**
         * Description: 监控数据诊断列表查询
         * Summary: 监控数据诊断列表查询
         */
        public async Task<QueryOpsCheckResponse> QueryOpsCheckAsync(QueryOpsCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 监控数据诊断列表查询
         * Summary: 监控数据诊断列表查询
         */
        public QueryOpsCheckResponse QueryOpsCheckEx(QueryOpsCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsCheckResponse>(DoRequest("1.0", "antcloud.monitor.ops.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监控数据诊断列表查询
         * Summary: 监控数据诊断列表查询
         */
        public async Task<QueryOpsCheckResponse> QueryOpsCheckExAsync(QueryOpsCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsCheckResponse>(await DoRequestAsync("1.0", "antcloud.monitor.ops.check.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用诊断
         * Summary: 应用诊断
         */
        public QueryOpsAppcheckResponse QueryOpsAppcheck(QueryOpsAppcheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsAppcheckEx(request, headers, runtime);
        }

        /**
         * Description: 应用诊断
         * Summary: 应用诊断
         */
        public async Task<QueryOpsAppcheckResponse> QueryOpsAppcheckAsync(QueryOpsAppcheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsAppcheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用诊断
         * Summary: 应用诊断
         */
        public QueryOpsAppcheckResponse QueryOpsAppcheckEx(QueryOpsAppcheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsAppcheckResponse>(DoRequest("1.0", "antcloud.monitor.ops.appcheck.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用诊断
         * Summary: 应用诊断
         */
        public async Task<QueryOpsAppcheckResponse> QueryOpsAppcheckExAsync(QueryOpsAppcheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsAppcheckResponse>(await DoRequestAsync("1.0", "antcloud.monitor.ops.appcheck.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加钉钉机器人
         * Summary: 添加钉钉机器人
         */
        public CreateAlarmDingdingrobotResponse CreateAlarmDingdingrobot(CreateAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAlarmDingdingrobotEx(request, headers, runtime);
        }

        /**
         * Description: 添加钉钉机器人
         * Summary: 添加钉钉机器人
         */
        public async Task<CreateAlarmDingdingrobotResponse> CreateAlarmDingdingrobotAsync(CreateAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAlarmDingdingrobotExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加钉钉机器人
         * Summary: 添加钉钉机器人
         */
        public CreateAlarmDingdingrobotResponse CreateAlarmDingdingrobotEx(CreateAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmDingdingrobotResponse>(DoRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加钉钉机器人
         * Summary: 添加钉钉机器人
         */
        public async Task<CreateAlarmDingdingrobotResponse> CreateAlarmDingdingrobotExAsync(CreateAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlarmDingdingrobotResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.dingdingrobot.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询钉钉机器人
         * Summary: 查询钉钉机器人
         */
        public QueryAlarmDingdingrobotResponse QueryAlarmDingdingrobot(QueryAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmDingdingrobotEx(request, headers, runtime);
        }

        /**
         * Description: 查询钉钉机器人
         * Summary: 查询钉钉机器人
         */
        public async Task<QueryAlarmDingdingrobotResponse> QueryAlarmDingdingrobotAsync(QueryAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmDingdingrobotExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询钉钉机器人
         * Summary: 查询钉钉机器人
         */
        public QueryAlarmDingdingrobotResponse QueryAlarmDingdingrobotEx(QueryAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmDingdingrobotResponse>(DoRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询钉钉机器人
         * Summary: 查询钉钉机器人
         */
        public async Task<QueryAlarmDingdingrobotResponse> QueryAlarmDingdingrobotExAsync(QueryAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmDingdingrobotResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.dingdingrobot.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除钉钉机器人
         * Summary: 删除钉钉机器人
         */
        public DeleteAlarmDingdingrobotResponse DeleteAlarmDingdingrobot(DeleteAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAlarmDingdingrobotEx(request, headers, runtime);
        }

        /**
         * Description: 删除钉钉机器人
         * Summary: 删除钉钉机器人
         */
        public async Task<DeleteAlarmDingdingrobotResponse> DeleteAlarmDingdingrobotAsync(DeleteAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAlarmDingdingrobotExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除钉钉机器人
         * Summary: 删除钉钉机器人
         */
        public DeleteAlarmDingdingrobotResponse DeleteAlarmDingdingrobotEx(DeleteAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmDingdingrobotResponse>(DoRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除钉钉机器人
         * Summary: 删除钉钉机器人
         */
        public async Task<DeleteAlarmDingdingrobotResponse> DeleteAlarmDingdingrobotExAsync(DeleteAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAlarmDingdingrobotResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.dingdingrobot.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新钉钉机器人
         * Summary: 更新钉钉机器人
         */
        public UpdateAlarmDingdingrobotResponse UpdateAlarmDingdingrobot(UpdateAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAlarmDingdingrobotEx(request, headers, runtime);
        }

        /**
         * Description: 更新钉钉机器人
         * Summary: 更新钉钉机器人
         */
        public async Task<UpdateAlarmDingdingrobotResponse> UpdateAlarmDingdingrobotAsync(UpdateAlarmDingdingrobotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAlarmDingdingrobotExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新钉钉机器人
         * Summary: 更新钉钉机器人
         */
        public UpdateAlarmDingdingrobotResponse UpdateAlarmDingdingrobotEx(UpdateAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmDingdingrobotResponse>(DoRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新钉钉机器人
         * Summary: 更新钉钉机器人
         */
        public async Task<UpdateAlarmDingdingrobotResponse> UpdateAlarmDingdingrobotExAsync(UpdateAlarmDingdingrobotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlarmDingdingrobotResponse>(await DoRequestAsync("1.0", "antcloud.monitor.alarm.dingdingrobot.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用告警统计
         * Summary: 查询应用告警统计
         */
        public QueryAppsAlarmrulecountResponse QueryAppsAlarmrulecount(QueryAppsAlarmrulecountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppsAlarmrulecountEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用告警统计
         * Summary: 查询应用告警统计
         */
        public async Task<QueryAppsAlarmrulecountResponse> QueryAppsAlarmrulecountAsync(QueryAppsAlarmrulecountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppsAlarmrulecountExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用告警统计
         * Summary: 查询应用告警统计
         */
        public QueryAppsAlarmrulecountResponse QueryAppsAlarmrulecountEx(QueryAppsAlarmrulecountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsAlarmrulecountResponse>(DoRequest("1.0", "antcloud.monitor.apps.alarmrulecount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用告警统计
         * Summary: 查询应用告警统计
         */
        public async Task<QueryAppsAlarmrulecountResponse> QueryAppsAlarmrulecountExAsync(QueryAppsAlarmrulecountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsAlarmrulecountResponse>(await DoRequestAsync("1.0", "antcloud.monitor.apps.alarmrulecount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app维度查询统一告警状态
         * Summary: 根据app维度查询统一告警状态
         */
        public QueryAppsUnifiedalarmstatsResponse QueryAppsUnifiedalarmstats(QueryAppsUnifiedalarmstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppsUnifiedalarmstatsEx(request, headers, runtime);
        }

        /**
         * Description: 根据app维度查询统一告警状态
         * Summary: 根据app维度查询统一告警状态
         */
        public async Task<QueryAppsUnifiedalarmstatsResponse> QueryAppsUnifiedalarmstatsAsync(QueryAppsUnifiedalarmstatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppsUnifiedalarmstatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据app维度查询统一告警状态
         * Summary: 根据app维度查询统一告警状态
         */
        public QueryAppsUnifiedalarmstatsResponse QueryAppsUnifiedalarmstatsEx(QueryAppsUnifiedalarmstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsUnifiedalarmstatsResponse>(DoRequest("1.0", "antcloud.monitor.apps.unifiedalarmstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据app维度查询统一告警状态
         * Summary: 根据app维度查询统一告警状态
         */
        public async Task<QueryAppsUnifiedalarmstatsResponse> QueryAppsUnifiedalarmstatsExAsync(QueryAppsUnifiedalarmstatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppsUnifiedalarmstatsResponse>(await DoRequestAsync("1.0", "antcloud.monitor.apps.unifiedalarmstats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启监控数据诊断告警
         * Summary: 开启监控数据诊断告警
         */
        public SwitchOpsAlarmResponse SwitchOpsAlarm(SwitchOpsAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchOpsAlarmEx(request, headers, runtime);
        }

        /**
         * Description: 开启监控数据诊断告警
         * Summary: 开启监控数据诊断告警
         */
        public async Task<SwitchOpsAlarmResponse> SwitchOpsAlarmAsync(SwitchOpsAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchOpsAlarmExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启监控数据诊断告警
         * Summary: 开启监控数据诊断告警
         */
        public SwitchOpsAlarmResponse SwitchOpsAlarmEx(SwitchOpsAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchOpsAlarmResponse>(DoRequest("1.0", "antcloud.monitor.ops.alarm.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启监控数据诊断告警
         * Summary: 开启监控数据诊断告警
         */
        public async Task<SwitchOpsAlarmResponse> SwitchOpsAlarmExAsync(SwitchOpsAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchOpsAlarmResponse>(await DoRequestAsync("1.0", "antcloud.monitor.ops.alarm.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有租户
         * Summary: 获取所有租户
         */
        public AllTraasmetaTenantResponse AllTraasmetaTenant(AllTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有租户
         * Summary: 获取所有租户
         */
        public async Task<AllTraasmetaTenantResponse> AllTraasmetaTenantAsync(AllTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有租户
         * Summary: 获取所有租户
         */
        public AllTraasmetaTenantResponse AllTraasmetaTenantEx(AllTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有租户
         * Summary: 获取所有租户
         */
        public async Task<AllTraasmetaTenantResponse> AllTraasmetaTenantExAsync(AllTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有region
         * Summary: 获取所有region
         */
        public AllTraasmetaRegionResponse AllTraasmetaRegion(AllTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有region
         * Summary: 获取所有region
         */
        public async Task<AllTraasmetaRegionResponse> AllTraasmetaRegionAsync(AllTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有region
         * Summary: 获取所有region
         */
        public AllTraasmetaRegionResponse AllTraasmetaRegionEx(AllTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有region
         * Summary: 获取所有region
         */
        public async Task<AllTraasmetaRegionResponse> AllTraasmetaRegionExAsync(AllTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户分页查询
         * Summary: 租户分页查询
         */
        public PagequeryTraasmetaTenantResponse PagequeryTraasmetaTenant(PagequeryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 租户分页查询
         * Summary: 租户分页查询
         */
        public async Task<PagequeryTraasmetaTenantResponse> PagequeryTraasmetaTenantAsync(PagequeryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户分页查询
         * Summary: 租户分页查询
         */
        public PagequeryTraasmetaTenantResponse PagequeryTraasmetaTenantEx(PagequeryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户分页查询
         * Summary: 租户分页查询
         */
        public async Task<PagequeryTraasmetaTenantResponse> PagequeryTraasmetaTenantExAsync(PagequeryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个租户
         * Summary: 获取单个租户
         */
        public GetTraasmetaTenantResponse GetTraasmetaTenant(GetTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个租户
         * Summary: 获取单个租户
         */
        public async Task<GetTraasmetaTenantResponse> GetTraasmetaTenantAsync(GetTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个租户
         * Summary: 获取单个租户
         */
        public GetTraasmetaTenantResponse GetTraasmetaTenantEx(GetTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个租户
         * Summary: 获取单个租户
         */
        public async Task<GetTraasmetaTenantResponse> GetTraasmetaTenantExAsync(GetTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户查询
         * Summary: 租户查询
         */
        public QueryTraasmetaTenantResponse QueryTraasmetaTenant(QueryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 租户查询
         * Summary: 租户查询
         */
        public async Task<QueryTraasmetaTenantResponse> QueryTraasmetaTenantAsync(QueryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户查询
         * Summary: 租户查询
         */
        public QueryTraasmetaTenantResponse QueryTraasmetaTenantEx(QueryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户查询
         * Summary: 租户查询
         */
        public async Task<QueryTraasmetaTenantResponse> QueryTraasmetaTenantExAsync(QueryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询租户
         * Summary: 批量查询租户
         */
        public BatchqueryTraasmetaTenantResponse BatchqueryTraasmetaTenant(BatchqueryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询租户
         * Summary: 批量查询租户
         */
        public async Task<BatchqueryTraasmetaTenantResponse> BatchqueryTraasmetaTenantAsync(BatchqueryTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询租户
         * Summary: 批量查询租户
         */
        public BatchqueryTraasmetaTenantResponse BatchqueryTraasmetaTenantEx(BatchqueryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询租户
         * Summary: 批量查询租户
         */
        public async Task<BatchqueryTraasmetaTenantResponse> BatchqueryTraasmetaTenantExAsync(BatchqueryTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建tenant
         * Summary: 创建tenant
         */
        public CreateTraasmetaTenantResponse CreateTraasmetaTenant(CreateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 创建tenant
         * Summary: 创建tenant
         */
        public async Task<CreateTraasmetaTenantResponse> CreateTraasmetaTenantAsync(CreateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建tenant
         * Summary: 创建tenant
         */
        public CreateTraasmetaTenantResponse CreateTraasmetaTenantEx(CreateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建tenant
         * Summary: 创建tenant
         */
        public async Task<CreateTraasmetaTenantResponse> CreateTraasmetaTenantExAsync(CreateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建租户
         * Summary: 批量创建租户
         */
        public BatchcreateTraasmetaTenantResponse BatchcreateTraasmetaTenant(BatchcreateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建租户
         * Summary: 批量创建租户
         */
        public async Task<BatchcreateTraasmetaTenantResponse> BatchcreateTraasmetaTenantAsync(BatchcreateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建租户
         * Summary: 批量创建租户
         */
        public BatchcreateTraasmetaTenantResponse BatchcreateTraasmetaTenantEx(BatchcreateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建租户
         * Summary: 批量创建租户
         */
        public async Task<BatchcreateTraasmetaTenantResponse> BatchcreateTraasmetaTenantExAsync(BatchcreateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public UpdateTraasmetaTenantResponse UpdateTraasmetaTenant(UpdateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public async Task<UpdateTraasmetaTenantResponse> UpdateTraasmetaTenantAsync(UpdateTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public UpdateTraasmetaTenantResponse UpdateTraasmetaTenantEx(UpdateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public async Task<UpdateTraasmetaTenantResponse> UpdateTraasmetaTenantExAsync(UpdateTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除租户
         * Summary: 删除租户
         */
        public DeleteTraasmetaTenantResponse DeleteTraasmetaTenant(DeleteTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 删除租户
         * Summary: 删除租户
         */
        public async Task<DeleteTraasmetaTenantResponse> DeleteTraasmetaTenantAsync(DeleteTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除租户
         * Summary: 删除租户
         */
        public DeleteTraasmetaTenantResponse DeleteTraasmetaTenantEx(DeleteTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除租户
         * Summary: 删除租户
         */
        public async Task<DeleteTraasmetaTenantResponse> DeleteTraasmetaTenantExAsync(DeleteTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除租户
         * Summary: 批量删除租户
         */
        public BatchdeleteTraasmetaTenantResponse BatchdeleteTraasmetaTenant(BatchdeleteTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaTenantEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除租户
         * Summary: 批量删除租户
         */
        public async Task<BatchdeleteTraasmetaTenantResponse> BatchdeleteTraasmetaTenantAsync(BatchdeleteTraasmetaTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除租户
         * Summary: 批量删除租户
         */
        public BatchdeleteTraasmetaTenantResponse BatchdeleteTraasmetaTenantEx(BatchdeleteTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaTenantResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除租户
         * Summary: 批量删除租户
         */
        public async Task<BatchdeleteTraasmetaTenantResponse> BatchdeleteTraasmetaTenantExAsync(BatchdeleteTraasmetaTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaTenantResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.tenant.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个地域
         * Summary: 获取单个地域
         */
        public GetTraasmetaRegionResponse GetTraasmetaRegion(GetTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个地域
         * Summary: 获取单个地域
         */
        public async Task<GetTraasmetaRegionResponse> GetTraasmetaRegionAsync(GetTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个地域
         * Summary: 获取单个地域
         */
        public GetTraasmetaRegionResponse GetTraasmetaRegionEx(GetTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个地域
         * Summary: 获取单个地域
         */
        public async Task<GetTraasmetaRegionResponse> GetTraasmetaRegionExAsync(GetTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有机房
         * Summary: 获取所有机房
         */
        public AllTraasmetaZoneResponse AllTraasmetaZone(AllTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有机房
         * Summary: 获取所有机房
         */
        public async Task<AllTraasmetaZoneResponse> AllTraasmetaZoneAsync(AllTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有机房
         * Summary: 获取所有机房
         */
        public AllTraasmetaZoneResponse AllTraasmetaZoneEx(AllTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有机房
         * Summary: 获取所有机房
         */
        public async Task<AllTraasmetaZoneResponse> AllTraasmetaZoneExAsync(AllTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个机房
         * Summary: 获取单个机房
         */
        public GetTraasmetaZoneResponse GetTraasmetaZone(GetTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个机房
         * Summary: 获取单个机房
         */
        public async Task<GetTraasmetaZoneResponse> GetTraasmetaZoneAsync(GetTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个机房
         * Summary: 获取单个机房
         */
        public GetTraasmetaZoneResponse GetTraasmetaZoneEx(GetTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个机房
         * Summary: 获取单个机房
         */
        public async Task<GetTraasmetaZoneResponse> GetTraasmetaZoneExAsync(GetTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个地域
         * Summary: 创建单个地域
         */
        public CreateTraasmetaRegionResponse CreateTraasmetaRegion(CreateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个地域
         * Summary: 创建单个地域
         */
        public async Task<CreateTraasmetaRegionResponse> CreateTraasmetaRegionAsync(CreateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个地域
         * Summary: 创建单个地域
         */
        public CreateTraasmetaRegionResponse CreateTraasmetaRegionEx(CreateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个地域
         * Summary: 创建单个地域
         */
        public async Task<CreateTraasmetaRegionResponse> CreateTraasmetaRegionExAsync(CreateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量修改agent是否开启告警标记
         * Summary: agent批量打标
         */
        public UpdateAgentLabelResponse UpdateAgentLabel(UpdateAgentLabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAgentLabelEx(request, headers, runtime);
        }

        /**
         * Description: 批量修改agent是否开启告警标记
         * Summary: agent批量打标
         */
        public async Task<UpdateAgentLabelResponse> UpdateAgentLabelAsync(UpdateAgentLabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAgentLabelExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量修改agent是否开启告警标记
         * Summary: agent批量打标
         */
        public UpdateAgentLabelResponse UpdateAgentLabelEx(UpdateAgentLabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentLabelResponse>(DoRequest("1.0", "antcloud.monitor.agent.label.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量修改agent是否开启告警标记
         * Summary: agent批量打标
         */
        public async Task<UpdateAgentLabelResponse> UpdateAgentLabelExAsync(UpdateAgentLabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentLabelResponse>(await DoRequestAsync("1.0", "antcloud.monitor.agent.label.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个机房
         * Summary: 创建单个机房
         */
        public CreateTraasmetaZoneResponse CreateTraasmetaZone(CreateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个机房
         * Summary: 创建单个机房
         */
        public async Task<CreateTraasmetaZoneResponse> CreateTraasmetaZoneAsync(CreateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个机房
         * Summary: 创建单个机房
         */
        public CreateTraasmetaZoneResponse CreateTraasmetaZoneEx(CreateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个机房
         * Summary: 创建单个机房
         */
        public async Task<CreateTraasmetaZoneResponse> CreateTraasmetaZoneExAsync(CreateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个地域
         * Summary: 删除单个地域
         */
        public DeleteTraasmetaRegionResponse DeleteTraasmetaRegion(DeleteTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个地域
         * Summary: 删除单个地域
         */
        public async Task<DeleteTraasmetaRegionResponse> DeleteTraasmetaRegionAsync(DeleteTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个地域
         * Summary: 删除单个地域
         */
        public DeleteTraasmetaRegionResponse DeleteTraasmetaRegionEx(DeleteTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个地域
         * Summary: 删除单个地域
         */
        public async Task<DeleteTraasmetaRegionResponse> DeleteTraasmetaRegionExAsync(DeleteTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个机房
         * Summary: 删除单个机房
         */
        public DeleteTraasmetaZoneResponse DeleteTraasmetaZone(DeleteTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个机房
         * Summary: 删除单个机房
         */
        public async Task<DeleteTraasmetaZoneResponse> DeleteTraasmetaZoneAsync(DeleteTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个机房
         * Summary: 删除单个机房
         */
        public DeleteTraasmetaZoneResponse DeleteTraasmetaZoneEx(DeleteTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个机房
         * Summary: 删除单个机房
         */
        public async Task<DeleteTraasmetaZoneResponse> DeleteTraasmetaZoneExAsync(DeleteTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个地域
         * Summary: 更新单个地域
         */
        public UpdateTraasmetaRegionResponse UpdateTraasmetaRegion(UpdateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个地域
         * Summary: 更新单个地域
         */
        public async Task<UpdateTraasmetaRegionResponse> UpdateTraasmetaRegionAsync(UpdateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个地域
         * Summary: 更新单个地域
         */
        public UpdateTraasmetaRegionResponse UpdateTraasmetaRegionEx(UpdateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个地域
         * Summary: 更新单个地域
         */
        public async Task<UpdateTraasmetaRegionResponse> UpdateTraasmetaRegionExAsync(UpdateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个机房
         * Summary: 更新单个机房
         */
        public UpdateTraasmetaZoneResponse UpdateTraasmetaZone(UpdateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个机房
         * Summary: 更新单个机房
         */
        public async Task<UpdateTraasmetaZoneResponse> UpdateTraasmetaZoneAsync(UpdateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个机房
         * Summary: 更新单个机房
         */
        public UpdateTraasmetaZoneResponse UpdateTraasmetaZoneEx(UpdateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个机房
         * Summary: 更新单个机房
         */
        public async Task<UpdateTraasmetaZoneResponse> UpdateTraasmetaZoneExAsync(UpdateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 地域查询
         * Summary: 地域查询
         */
        public QueryTraasmetaRegionResponse QueryTraasmetaRegion(QueryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 地域查询
         * Summary: 地域查询
         */
        public async Task<QueryTraasmetaRegionResponse> QueryTraasmetaRegionAsync(QueryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 地域查询
         * Summary: 地域查询
         */
        public QueryTraasmetaRegionResponse QueryTraasmetaRegionEx(QueryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 地域查询
         * Summary: 地域查询
         */
        public async Task<QueryTraasmetaRegionResponse> QueryTraasmetaRegionExAsync(QueryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机房查询
         * Summary: 机房查询
         */
        public QueryTraasmetaZoneResponse QueryTraasmetaZone(QueryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 机房查询
         * Summary: 机房查询
         */
        public async Task<QueryTraasmetaZoneResponse> QueryTraasmetaZoneAsync(QueryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 机房查询
         * Summary: 机房查询
         */
        public QueryTraasmetaZoneResponse QueryTraasmetaZoneEx(QueryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机房查询
         * Summary: 机房查询
         */
        public async Task<QueryTraasmetaZoneResponse> QueryTraasmetaZoneExAsync(QueryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 地域分页查询
         * Summary: 地域分页查询
         */
        public PagequeryTraasmetaRegionResponse PagequeryTraasmetaRegion(PagequeryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 地域分页查询
         * Summary: 地域分页查询
         */
        public async Task<PagequeryTraasmetaRegionResponse> PagequeryTraasmetaRegionAsync(PagequeryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 地域分页查询
         * Summary: 地域分页查询
         */
        public PagequeryTraasmetaRegionResponse PagequeryTraasmetaRegionEx(PagequeryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 地域分页查询
         * Summary: 地域分页查询
         */
        public async Task<PagequeryTraasmetaRegionResponse> PagequeryTraasmetaRegionExAsync(PagequeryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机房分页查询
         * Summary: 机房分页查询
         */
        public PagequeryTraasmetaZoneResponse PagequeryTraasmetaZone(PagequeryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 机房分页查询
         * Summary: 机房分页查询
         */
        public async Task<PagequeryTraasmetaZoneResponse> PagequeryTraasmetaZoneAsync(PagequeryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 机房分页查询
         * Summary: 机房分页查询
         */
        public PagequeryTraasmetaZoneResponse PagequeryTraasmetaZoneEx(PagequeryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机房分页查询
         * Summary: 机房分页查询
         */
        public async Task<PagequeryTraasmetaZoneResponse> PagequeryTraasmetaZoneExAsync(PagequeryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询地域
         * Summary: 批量查询地域
         */
        public BatchqueryTraasmetaRegionResponse BatchqueryTraasmetaRegion(BatchqueryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询地域
         * Summary: 批量查询地域
         */
        public async Task<BatchqueryTraasmetaRegionResponse> BatchqueryTraasmetaRegionAsync(BatchqueryTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询地域
         * Summary: 批量查询地域
         */
        public BatchqueryTraasmetaRegionResponse BatchqueryTraasmetaRegionEx(BatchqueryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询地域
         * Summary: 批量查询地域
         */
        public async Task<BatchqueryTraasmetaRegionResponse> BatchqueryTraasmetaRegionExAsync(BatchqueryTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建地域
         * Summary: 批量创建地域
         */
        public BatchcreateTraasmetaRegionResponse BatchcreateTraasmetaRegion(BatchcreateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建地域
         * Summary: 批量创建地域
         */
        public async Task<BatchcreateTraasmetaRegionResponse> BatchcreateTraasmetaRegionAsync(BatchcreateTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建地域
         * Summary: 批量创建地域
         */
        public BatchcreateTraasmetaRegionResponse BatchcreateTraasmetaRegionEx(BatchcreateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建地域
         * Summary: 批量创建地域
         */
        public async Task<BatchcreateTraasmetaRegionResponse> BatchcreateTraasmetaRegionExAsync(BatchcreateTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建机房
         * Summary: 批量创建机房
         */
        public BatchcreateTraasmetaZoneResponse BatchcreateTraasmetaZone(BatchcreateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建机房
         * Summary: 批量创建机房
         */
        public async Task<BatchcreateTraasmetaZoneResponse> BatchcreateTraasmetaZoneAsync(BatchcreateTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建机房
         * Summary: 批量创建机房
         */
        public BatchcreateTraasmetaZoneResponse BatchcreateTraasmetaZoneEx(BatchcreateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建机房
         * Summary: 批量创建机房
         */
        public async Task<BatchcreateTraasmetaZoneResponse> BatchcreateTraasmetaZoneExAsync(BatchcreateTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询机房
         * Summary: 批量查询机房
         */
        public BatchqueryTraasmetaZoneResponse BatchqueryTraasmetaZone(BatchqueryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询机房
         * Summary: 批量查询机房
         */
        public async Task<BatchqueryTraasmetaZoneResponse> BatchqueryTraasmetaZoneAsync(BatchqueryTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询机房
         * Summary: 批量查询机房
         */
        public BatchqueryTraasmetaZoneResponse BatchqueryTraasmetaZoneEx(BatchqueryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询机房
         * Summary: 批量查询机房
         */
        public async Task<BatchqueryTraasmetaZoneResponse> BatchqueryTraasmetaZoneExAsync(BatchqueryTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除地域
         * Summary: 批量删除地域
         */
        public BatchdeleteTraasmetaRegionResponse BatchdeleteTraasmetaRegion(BatchdeleteTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaRegionEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除地域
         * Summary: 批量删除地域
         */
        public async Task<BatchdeleteTraasmetaRegionResponse> BatchdeleteTraasmetaRegionAsync(BatchdeleteTraasmetaRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除地域
         * Summary: 批量删除地域
         */
        public BatchdeleteTraasmetaRegionResponse BatchdeleteTraasmetaRegionEx(BatchdeleteTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaRegionResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.region.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除地域
         * Summary: 批量删除地域
         */
        public async Task<BatchdeleteTraasmetaRegionResponse> BatchdeleteTraasmetaRegionExAsync(BatchdeleteTraasmetaRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaRegionResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.region.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除机房
         * Summary: 批量删除机房
         */
        public BatchdeleteTraasmetaZoneResponse BatchdeleteTraasmetaZone(BatchdeleteTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaZoneEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除机房
         * Summary: 批量删除机房
         */
        public async Task<BatchdeleteTraasmetaZoneResponse> BatchdeleteTraasmetaZoneAsync(BatchdeleteTraasmetaZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除机房
         * Summary: 批量删除机房
         */
        public BatchdeleteTraasmetaZoneResponse BatchdeleteTraasmetaZoneEx(BatchdeleteTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaZoneResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.zone.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除机房
         * Summary: 批量删除机房
         */
        public async Task<BatchdeleteTraasmetaZoneResponse> BatchdeleteTraasmetaZoneExAsync(BatchdeleteTraasmetaZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaZoneResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.zone.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用
         * Summary: 获取所有应用
         */
        public AllTraasmetaAppResponse AllTraasmetaApp(AllTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用
         * Summary: 获取所有应用
         */
        public async Task<AllTraasmetaAppResponse> AllTraasmetaAppAsync(AllTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用
         * Summary: 获取所有应用
         */
        public AllTraasmetaAppResponse AllTraasmetaAppEx(AllTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用
         * Summary: 获取所有应用
         */
        public async Task<AllTraasmetaAppResponse> AllTraasmetaAppExAsync(AllTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用分组
         * Summary: 获取所有应用分组
         */
        public AllTraasmetaAppgroupResponse AllTraasmetaAppgroup(AllTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用分组
         * Summary: 获取所有应用分组
         */
        public async Task<AllTraasmetaAppgroupResponse> AllTraasmetaAppgroupAsync(AllTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用分组
         * Summary: 获取所有应用分组
         */
        public AllTraasmetaAppgroupResponse AllTraasmetaAppgroupEx(AllTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用分组
         * Summary: 获取所有应用分组
         */
        public async Task<AllTraasmetaAppgroupResponse> AllTraasmetaAppgroupExAsync(AllTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用服务器
         * Summary: 获取所有应用服务器
         */
        public AllTraasmetaAppserverResponse AllTraasmetaAppserver(AllTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用服务器
         * Summary: 获取所有应用服务器
         */
        public async Task<AllTraasmetaAppserverResponse> AllTraasmetaAppserverAsync(AllTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用服务器
         * Summary: 获取所有应用服务器
         */
        public AllTraasmetaAppserverResponse AllTraasmetaAppserverEx(AllTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用服务器
         * Summary: 获取所有应用服务器
         */
        public async Task<AllTraasmetaAppserverResponse> AllTraasmetaAppserverExAsync(AllTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用标签
         * Summary: 获取所有应用标签
         */
        public AllTraasmetaApptagResponse AllTraasmetaApptag(AllTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用标签
         * Summary: 获取所有应用标签
         */
        public async Task<AllTraasmetaApptagResponse> AllTraasmetaApptagAsync(AllTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有应用标签
         * Summary: 获取所有应用标签
         */
        public AllTraasmetaApptagResponse AllTraasmetaApptagEx(AllTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有应用标签
         * Summary: 获取所有应用标签
         */
        public async Task<AllTraasmetaApptagResponse> AllTraasmetaApptagExAsync(AllTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有工作空间
         * Summary: 获取所有工作空间
         */
        public AllTraasmetaWorkspaceResponse AllTraasmetaWorkspace(AllTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有工作空间
         * Summary: 获取所有工作空间
         */
        public async Task<AllTraasmetaWorkspaceResponse> AllTraasmetaWorkspaceAsync(AllTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有工作空间
         * Summary: 获取所有工作空间
         */
        public AllTraasmetaWorkspaceResponse AllTraasmetaWorkspaceEx(AllTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有工作空间
         * Summary: 获取所有工作空间
         */
        public async Task<AllTraasmetaWorkspaceResponse> AllTraasmetaWorkspaceExAsync(AllTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有工作空间组
         * Summary: 获取所有工作空间组
         */
        public AllTraasmetaWorkspacegroupResponse AllTraasmetaWorkspacegroup(AllTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有工作空间组
         * Summary: 获取所有工作空间组
         */
        public async Task<AllTraasmetaWorkspacegroupResponse> AllTraasmetaWorkspacegroupAsync(AllTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有工作空间组
         * Summary: 获取所有工作空间组
         */
        public AllTraasmetaWorkspacegroupResponse AllTraasmetaWorkspacegroupEx(AllTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有工作空间组
         * Summary: 获取所有工作空间组
         */
        public async Task<AllTraasmetaWorkspacegroupResponse> AllTraasmetaWorkspacegroupExAsync(AllTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建工作空间组
         * Summary: 批量创建工作空间组
         */
        public BatchcreateTraasmetaWorkspacegroupResponse BatchcreateTraasmetaWorkspacegroup(BatchcreateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建工作空间组
         * Summary: 批量创建工作空间组
         */
        public async Task<BatchcreateTraasmetaWorkspacegroupResponse> BatchcreateTraasmetaWorkspacegroupAsync(BatchcreateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建工作空间组
         * Summary: 批量创建工作空间组
         */
        public BatchcreateTraasmetaWorkspacegroupResponse BatchcreateTraasmetaWorkspacegroupEx(BatchcreateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建工作空间组
         * Summary: 批量创建工作空间组
         */
        public async Task<BatchcreateTraasmetaWorkspacegroupResponse> BatchcreateTraasmetaWorkspacegroupExAsync(BatchcreateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用
         * Summary: 批量创建应用
         */
        public BatchcreateTraasmetaAppResponse BatchcreateTraasmetaApp(BatchcreateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用
         * Summary: 批量创建应用
         */
        public async Task<BatchcreateTraasmetaAppResponse> BatchcreateTraasmetaAppAsync(BatchcreateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用
         * Summary: 批量创建应用
         */
        public BatchcreateTraasmetaAppResponse BatchcreateTraasmetaAppEx(BatchcreateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用
         * Summary: 批量创建应用
         */
        public async Task<BatchcreateTraasmetaAppResponse> BatchcreateTraasmetaAppExAsync(BatchcreateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用组
         * Summary: 批量创建应用组
         */
        public BatchcreateTraasmetaAppgroupResponse BatchcreateTraasmetaAppgroup(BatchcreateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用组
         * Summary: 批量创建应用组
         */
        public async Task<BatchcreateTraasmetaAppgroupResponse> BatchcreateTraasmetaAppgroupAsync(BatchcreateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用组
         * Summary: 批量创建应用组
         */
        public BatchcreateTraasmetaAppgroupResponse BatchcreateTraasmetaAppgroupEx(BatchcreateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用组
         * Summary: 批量创建应用组
         */
        public async Task<BatchcreateTraasmetaAppgroupResponse> BatchcreateTraasmetaAppgroupExAsync(BatchcreateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用服务器
         * Summary: 批量创建应用服务器
         */
        public BatchcreateTraasmetaAppserverResponse BatchcreateTraasmetaAppserver(BatchcreateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用服务器
         * Summary: 批量创建应用服务器
         */
        public async Task<BatchcreateTraasmetaAppserverResponse> BatchcreateTraasmetaAppserverAsync(BatchcreateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用服务器
         * Summary: 批量创建应用服务器
         */
        public BatchcreateTraasmetaAppserverResponse BatchcreateTraasmetaAppserverEx(BatchcreateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用服务器
         * Summary: 批量创建应用服务器
         */
        public async Task<BatchcreateTraasmetaAppserverResponse> BatchcreateTraasmetaAppserverExAsync(BatchcreateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用标签
         * Summary: 批量创建应用标签
         */
        public BatchcreateTraasmetaApptagResponse BatchcreateTraasmetaApptag(BatchcreateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用标签
         * Summary: 批量创建应用标签
         */
        public async Task<BatchcreateTraasmetaApptagResponse> BatchcreateTraasmetaApptagAsync(BatchcreateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用标签
         * Summary: 批量创建应用标签
         */
        public BatchcreateTraasmetaApptagResponse BatchcreateTraasmetaApptagEx(BatchcreateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用标签
         * Summary: 批量创建应用标签
         */
        public async Task<BatchcreateTraasmetaApptagResponse> BatchcreateTraasmetaApptagExAsync(BatchcreateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建工作空间
         * Summary: 批量创建工作空间
         */
        public BatchcreateTraasmetaWorkspaceResponse BatchcreateTraasmetaWorkspace(BatchcreateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建工作空间
         * Summary: 批量创建工作空间
         */
        public async Task<BatchcreateTraasmetaWorkspaceResponse> BatchcreateTraasmetaWorkspaceAsync(BatchcreateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建工作空间
         * Summary: 批量创建工作空间
         */
        public BatchcreateTraasmetaWorkspaceResponse BatchcreateTraasmetaWorkspaceEx(BatchcreateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建工作空间
         * Summary: 批量创建工作空间
         */
        public async Task<BatchcreateTraasmetaWorkspaceResponse> BatchcreateTraasmetaWorkspaceExAsync(BatchcreateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用
         * Summary: 批量删除应用
         */
        public BatchdeleteTraasmetaAppResponse BatchdeleteTraasmetaApp(BatchdeleteTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用
         * Summary: 批量删除应用
         */
        public async Task<BatchdeleteTraasmetaAppResponse> BatchdeleteTraasmetaAppAsync(BatchdeleteTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用
         * Summary: 批量删除应用
         */
        public BatchdeleteTraasmetaAppResponse BatchdeleteTraasmetaAppEx(BatchdeleteTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用
         * Summary: 批量删除应用
         */
        public async Task<BatchdeleteTraasmetaAppResponse> BatchdeleteTraasmetaAppExAsync(BatchdeleteTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除工作空间
         * Summary: 批量删除工作空间
         */
        public BatchdeleteTraasmetaWorkspaceResponse BatchdeleteTraasmetaWorkspace(BatchdeleteTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除工作空间
         * Summary: 批量删除工作空间
         */
        public async Task<BatchdeleteTraasmetaWorkspaceResponse> BatchdeleteTraasmetaWorkspaceAsync(BatchdeleteTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除工作空间
         * Summary: 批量删除工作空间
         */
        public BatchdeleteTraasmetaWorkspaceResponse BatchdeleteTraasmetaWorkspaceEx(BatchdeleteTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除工作空间
         * Summary: 批量删除工作空间
         */
        public async Task<BatchdeleteTraasmetaWorkspaceResponse> BatchdeleteTraasmetaWorkspaceExAsync(BatchdeleteTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用标签
         * Summary: 批量删除应用标签
         */
        public BatchdeleteTraasmetaApptagResponse BatchdeleteTraasmetaApptag(BatchdeleteTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用标签
         * Summary: 批量删除应用标签
         */
        public async Task<BatchdeleteTraasmetaApptagResponse> BatchdeleteTraasmetaApptagAsync(BatchdeleteTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用标签
         * Summary: 批量删除应用标签
         */
        public BatchdeleteTraasmetaApptagResponse BatchdeleteTraasmetaApptagEx(BatchdeleteTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用标签
         * Summary: 批量删除应用标签
         */
        public async Task<BatchdeleteTraasmetaApptagResponse> BatchdeleteTraasmetaApptagExAsync(BatchdeleteTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用服务器
         * Summary: 批量删除应用服务器
         */
        public BatchdeleteTraasmetaAppserverResponse BatchdeleteTraasmetaAppserver(BatchdeleteTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用服务器
         * Summary: 批量删除应用服务器
         */
        public async Task<BatchdeleteTraasmetaAppserverResponse> BatchdeleteTraasmetaAppserverAsync(BatchdeleteTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用服务器
         * Summary: 批量删除应用服务器
         */
        public BatchdeleteTraasmetaAppserverResponse BatchdeleteTraasmetaAppserverEx(BatchdeleteTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用服务器
         * Summary: 批量删除应用服务器
         */
        public async Task<BatchdeleteTraasmetaAppserverResponse> BatchdeleteTraasmetaAppserverExAsync(BatchdeleteTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用组
         * Summary: 批量删除应用组
         */
        public BatchdeleteTraasmetaAppgroupResponse BatchdeleteTraasmetaAppgroup(BatchdeleteTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用组
         * Summary: 批量删除应用组
         */
        public async Task<BatchdeleteTraasmetaAppgroupResponse> BatchdeleteTraasmetaAppgroupAsync(BatchdeleteTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用组
         * Summary: 批量删除应用组
         */
        public BatchdeleteTraasmetaAppgroupResponse BatchdeleteTraasmetaAppgroupEx(BatchdeleteTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用组
         * Summary: 批量删除应用组
         */
        public async Task<BatchdeleteTraasmetaAppgroupResponse> BatchdeleteTraasmetaAppgroupExAsync(BatchdeleteTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除工作空间组
         * Summary: 批量删除工作空间组
         */
        public BatchdeleteTraasmetaWorkspacegroupResponse BatchdeleteTraasmetaWorkspacegroup(BatchdeleteTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除工作空间组
         * Summary: 批量删除工作空间组
         */
        public async Task<BatchdeleteTraasmetaWorkspacegroupResponse> BatchdeleteTraasmetaWorkspacegroupAsync(BatchdeleteTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除工作空间组
         * Summary: 批量删除工作空间组
         */
        public BatchdeleteTraasmetaWorkspacegroupResponse BatchdeleteTraasmetaWorkspacegroupEx(BatchdeleteTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除工作空间组
         * Summary: 批量删除工作空间组
         */
        public async Task<BatchdeleteTraasmetaWorkspacegroupResponse> BatchdeleteTraasmetaWorkspacegroupExAsync(BatchdeleteTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询工作空间组
         * Summary: 批量查询工作空间组
         */
        public BatchqueryTraasmetaWorkspacegroupResponse BatchqueryTraasmetaWorkspacegroup(BatchqueryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询工作空间组
         * Summary: 批量查询工作空间组
         */
        public async Task<BatchqueryTraasmetaWorkspacegroupResponse> BatchqueryTraasmetaWorkspacegroupAsync(BatchqueryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询工作空间组
         * Summary: 批量查询工作空间组
         */
        public BatchqueryTraasmetaWorkspacegroupResponse BatchqueryTraasmetaWorkspacegroupEx(BatchqueryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询工作空间组
         * Summary: 批量查询工作空间组
         */
        public async Task<BatchqueryTraasmetaWorkspacegroupResponse> BatchqueryTraasmetaWorkspacegroupExAsync(BatchqueryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询工作空间
         * Summary: 批量查询工作空间
         */
        public BatchqueryTraasmetaWorkspaceResponse BatchqueryTraasmetaWorkspace(BatchqueryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询工作空间
         * Summary: 批量查询工作空间
         */
        public async Task<BatchqueryTraasmetaWorkspaceResponse> BatchqueryTraasmetaWorkspaceAsync(BatchqueryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询工作空间
         * Summary: 批量查询工作空间
         */
        public BatchqueryTraasmetaWorkspaceResponse BatchqueryTraasmetaWorkspaceEx(BatchqueryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询工作空间
         * Summary: 批量查询工作空间
         */
        public async Task<BatchqueryTraasmetaWorkspaceResponse> BatchqueryTraasmetaWorkspaceExAsync(BatchqueryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用标签
         * Summary: 批量查询应用标签
         */
        public BatchqueryTraasmetaApptagResponse BatchqueryTraasmetaApptag(BatchqueryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用标签
         * Summary: 批量查询应用标签
         */
        public async Task<BatchqueryTraasmetaApptagResponse> BatchqueryTraasmetaApptagAsync(BatchqueryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用标签
         * Summary: 批量查询应用标签
         */
        public BatchqueryTraasmetaApptagResponse BatchqueryTraasmetaApptagEx(BatchqueryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用标签
         * Summary: 批量查询应用标签
         */
        public async Task<BatchqueryTraasmetaApptagResponse> BatchqueryTraasmetaApptagExAsync(BatchqueryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用服务器
         * Summary: 批量查询应用服务器
         */
        public BatchqueryTraasmetaAppserverResponse BatchqueryTraasmetaAppserver(BatchqueryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用服务器
         * Summary: 批量查询应用服务器
         */
        public async Task<BatchqueryTraasmetaAppserverResponse> BatchqueryTraasmetaAppserverAsync(BatchqueryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用服务器
         * Summary: 批量查询应用服务器
         */
        public BatchqueryTraasmetaAppserverResponse BatchqueryTraasmetaAppserverEx(BatchqueryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用服务器
         * Summary: 批量查询应用服务器
         */
        public async Task<BatchqueryTraasmetaAppserverResponse> BatchqueryTraasmetaAppserverExAsync(BatchqueryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用组
         * Summary: 批量查询应用组
         */
        public BatchqueryTraasmetaAppgroupResponse BatchqueryTraasmetaAppgroup(BatchqueryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用组
         * Summary: 批量查询应用组
         */
        public async Task<BatchqueryTraasmetaAppgroupResponse> BatchqueryTraasmetaAppgroupAsync(BatchqueryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用组
         * Summary: 批量查询应用组
         */
        public BatchqueryTraasmetaAppgroupResponse BatchqueryTraasmetaAppgroupEx(BatchqueryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用组
         * Summary: 批量查询应用组
         */
        public async Task<BatchqueryTraasmetaAppgroupResponse> BatchqueryTraasmetaAppgroupExAsync(BatchqueryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用
         * Summary: 批量查询应用
         */
        public BatchqueryTraasmetaAppResponse BatchqueryTraasmetaApp(BatchqueryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用
         * Summary: 批量查询应用
         */
        public async Task<BatchqueryTraasmetaAppResponse> BatchqueryTraasmetaAppAsync(BatchqueryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用
         * Summary: 批量查询应用
         */
        public BatchqueryTraasmetaAppResponse BatchqueryTraasmetaAppEx(BatchqueryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用
         * Summary: 批量查询应用
         */
        public async Task<BatchqueryTraasmetaAppResponse> BatchqueryTraasmetaAppExAsync(BatchqueryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用
         * Summary: 删除单个应用
         */
        public DeleteTraasmetaAppResponse DeleteTraasmetaApp(DeleteTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用
         * Summary: 删除单个应用
         */
        public async Task<DeleteTraasmetaAppResponse> DeleteTraasmetaAppAsync(DeleteTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用
         * Summary: 删除单个应用
         */
        public DeleteTraasmetaAppResponse DeleteTraasmetaAppEx(DeleteTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用
         * Summary: 删除单个应用
         */
        public async Task<DeleteTraasmetaAppResponse> DeleteTraasmetaAppExAsync(DeleteTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用组
         * Summary: 删除单个应用组
         */
        public DeleteTraasmetaAppgroupResponse DeleteTraasmetaAppgroup(DeleteTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用组
         * Summary: 删除单个应用组
         */
        public async Task<DeleteTraasmetaAppgroupResponse> DeleteTraasmetaAppgroupAsync(DeleteTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用组
         * Summary: 删除单个应用组
         */
        public DeleteTraasmetaAppgroupResponse DeleteTraasmetaAppgroupEx(DeleteTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用组
         * Summary: 删除单个应用组
         */
        public async Task<DeleteTraasmetaAppgroupResponse> DeleteTraasmetaAppgroupExAsync(DeleteTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用服务器
         * Summary: 删除单个应用服务器
         */
        public DeleteTraasmetaAppserverResponse DeleteTraasmetaAppserver(DeleteTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用服务器
         * Summary: 删除单个应用服务器
         */
        public async Task<DeleteTraasmetaAppserverResponse> DeleteTraasmetaAppserverAsync(DeleteTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用服务器
         * Summary: 删除单个应用服务器
         */
        public DeleteTraasmetaAppserverResponse DeleteTraasmetaAppserverEx(DeleteTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用服务器
         * Summary: 删除单个应用服务器
         */
        public async Task<DeleteTraasmetaAppserverResponse> DeleteTraasmetaAppserverExAsync(DeleteTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用标签
         * Summary: 删除单个应用标签
         */
        public DeleteTraasmetaApptagResponse DeleteTraasmetaApptag(DeleteTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用标签
         * Summary: 删除单个应用标签
         */
        public async Task<DeleteTraasmetaApptagResponse> DeleteTraasmetaApptagAsync(DeleteTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个应用标签
         * Summary: 删除单个应用标签
         */
        public DeleteTraasmetaApptagResponse DeleteTraasmetaApptagEx(DeleteTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个应用标签
         * Summary: 删除单个应用标签
         */
        public async Task<DeleteTraasmetaApptagResponse> DeleteTraasmetaApptagExAsync(DeleteTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个工作空间
         * Summary: 删除单个工作空间
         */
        public DeleteTraasmetaWorkspaceResponse DeleteTraasmetaWorkspace(DeleteTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个工作空间
         * Summary: 删除单个工作空间
         */
        public async Task<DeleteTraasmetaWorkspaceResponse> DeleteTraasmetaWorkspaceAsync(DeleteTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个工作空间
         * Summary: 删除单个工作空间
         */
        public DeleteTraasmetaWorkspaceResponse DeleteTraasmetaWorkspaceEx(DeleteTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个工作空间
         * Summary: 删除单个工作空间
         */
        public async Task<DeleteTraasmetaWorkspaceResponse> DeleteTraasmetaWorkspaceExAsync(DeleteTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个工作空间组
         * Summary: 删除单个工作空间组
         */
        public DeleteTraasmetaWorkspacegroupResponse DeleteTraasmetaWorkspacegroup(DeleteTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个工作空间组
         * Summary: 删除单个工作空间组
         */
        public async Task<DeleteTraasmetaWorkspacegroupResponse> DeleteTraasmetaWorkspacegroupAsync(DeleteTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个工作空间组
         * Summary: 删除单个工作空间组
         */
        public DeleteTraasmetaWorkspacegroupResponse DeleteTraasmetaWorkspacegroupEx(DeleteTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个工作空间组
         * Summary: 删除单个工作空间组
         */
        public async Task<DeleteTraasmetaWorkspacegroupResponse> DeleteTraasmetaWorkspacegroupExAsync(DeleteTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用
         * Summary: 获取单个应用
         */
        public GetTraasmetaAppResponse GetTraasmetaApp(GetTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用
         * Summary: 获取单个应用
         */
        public async Task<GetTraasmetaAppResponse> GetTraasmetaAppAsync(GetTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用
         * Summary: 获取单个应用
         */
        public GetTraasmetaAppResponse GetTraasmetaAppEx(GetTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用
         * Summary: 获取单个应用
         */
        public async Task<GetTraasmetaAppResponse> GetTraasmetaAppExAsync(GetTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用组
         * Summary: 获取单个应用组
         */
        public GetTraasmetaAppgroupResponse GetTraasmetaAppgroup(GetTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用组
         * Summary: 获取单个应用组
         */
        public async Task<GetTraasmetaAppgroupResponse> GetTraasmetaAppgroupAsync(GetTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用组
         * Summary: 获取单个应用组
         */
        public GetTraasmetaAppgroupResponse GetTraasmetaAppgroupEx(GetTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用组
         * Summary: 获取单个应用组
         */
        public async Task<GetTraasmetaAppgroupResponse> GetTraasmetaAppgroupExAsync(GetTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用服务器
         * Summary: 获取单个应用服务器
         */
        public GetTraasmetaAppserverResponse GetTraasmetaAppserver(GetTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用服务器
         * Summary: 获取单个应用服务器
         */
        public async Task<GetTraasmetaAppserverResponse> GetTraasmetaAppserverAsync(GetTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用服务器
         * Summary: 获取单个应用服务器
         */
        public GetTraasmetaAppserverResponse GetTraasmetaAppserverEx(GetTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用服务器
         * Summary: 获取单个应用服务器
         */
        public async Task<GetTraasmetaAppserverResponse> GetTraasmetaAppserverExAsync(GetTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用标签
         * Summary: 获取单个应用标签
         */
        public GetTraasmetaApptagResponse GetTraasmetaApptag(GetTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用标签
         * Summary: 获取单个应用标签
         */
        public async Task<GetTraasmetaApptagResponse> GetTraasmetaApptagAsync(GetTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个应用标签
         * Summary: 获取单个应用标签
         */
        public GetTraasmetaApptagResponse GetTraasmetaApptagEx(GetTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个应用标签
         * Summary: 获取单个应用标签
         */
        public async Task<GetTraasmetaApptagResponse> GetTraasmetaApptagExAsync(GetTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个工作空间
         * Summary: 获取单个工作空间
         */
        public GetTraasmetaWorkspaceResponse GetTraasmetaWorkspace(GetTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个工作空间
         * Summary: 获取单个工作空间
         */
        public async Task<GetTraasmetaWorkspaceResponse> GetTraasmetaWorkspaceAsync(GetTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个工作空间
         * Summary: 获取单个工作空间
         */
        public GetTraasmetaWorkspaceResponse GetTraasmetaWorkspaceEx(GetTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个工作空间
         * Summary: 获取单个工作空间
         */
        public async Task<GetTraasmetaWorkspaceResponse> GetTraasmetaWorkspaceExAsync(GetTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个工作空间组
         * Summary: 获取单个工作空间组
         */
        public GetTraasmetaWorkspacegroupResponse GetTraasmetaWorkspacegroup(GetTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个工作空间组
         * Summary: 获取单个工作空间组
         */
        public async Task<GetTraasmetaWorkspacegroupResponse> GetTraasmetaWorkspacegroupAsync(GetTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个工作空间组
         * Summary: 获取单个工作空间组
         */
        public GetTraasmetaWorkspacegroupResponse GetTraasmetaWorkspacegroupEx(GetTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个工作空间组
         * Summary: 获取单个工作空间组
         */
        public async Task<GetTraasmetaWorkspacegroupResponse> GetTraasmetaWorkspacegroupExAsync(GetTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间组分页查询
         * Summary: 工作空间组分页查询
         */
        public PagequeryTraasmetaWorkspacegroupResponse PagequeryTraasmetaWorkspacegroup(PagequeryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 工作空间组分页查询
         * Summary: 工作空间组分页查询
         */
        public async Task<PagequeryTraasmetaWorkspacegroupResponse> PagequeryTraasmetaWorkspacegroupAsync(PagequeryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 工作空间组分页查询
         * Summary: 工作空间组分页查询
         */
        public PagequeryTraasmetaWorkspacegroupResponse PagequeryTraasmetaWorkspacegroupEx(PagequeryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间组分页查询
         * Summary: 工作空间组分页查询
         */
        public async Task<PagequeryTraasmetaWorkspacegroupResponse> PagequeryTraasmetaWorkspacegroupExAsync(PagequeryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间分页查询
         * Summary: 工作空间分页查询
         */
        public PagequeryTraasmetaWorkspaceResponse PagequeryTraasmetaWorkspace(PagequeryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 工作空间分页查询
         * Summary: 工作空间分页查询
         */
        public async Task<PagequeryTraasmetaWorkspaceResponse> PagequeryTraasmetaWorkspaceAsync(PagequeryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 工作空间分页查询
         * Summary: 工作空间分页查询
         */
        public PagequeryTraasmetaWorkspaceResponse PagequeryTraasmetaWorkspaceEx(PagequeryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间分页查询
         * Summary: 工作空间分页查询
         */
        public async Task<PagequeryTraasmetaWorkspaceResponse> PagequeryTraasmetaWorkspaceExAsync(PagequeryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用标签分页查询
         * Summary: 应用标签分页查询
         */
        public PagequeryTraasmetaApptagResponse PagequeryTraasmetaApptag(PagequeryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 应用标签分页查询
         * Summary: 应用标签分页查询
         */
        public async Task<PagequeryTraasmetaApptagResponse> PagequeryTraasmetaApptagAsync(PagequeryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用标签分页查询
         * Summary: 应用标签分页查询
         */
        public PagequeryTraasmetaApptagResponse PagequeryTraasmetaApptagEx(PagequeryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用标签分页查询
         * Summary: 应用标签分页查询
         */
        public async Task<PagequeryTraasmetaApptagResponse> PagequeryTraasmetaApptagExAsync(PagequeryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务器分页查询
         * Summary: 应用服务器分页查询
         */
        public PagequeryTraasmetaAppserverResponse PagequeryTraasmetaAppserver(PagequeryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 应用服务器分页查询
         * Summary: 应用服务器分页查询
         */
        public async Task<PagequeryTraasmetaAppserverResponse> PagequeryTraasmetaAppserverAsync(PagequeryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用服务器分页查询
         * Summary: 应用服务器分页查询
         */
        public PagequeryTraasmetaAppserverResponse PagequeryTraasmetaAppserverEx(PagequeryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务器分页查询
         * Summary: 应用服务器分页查询
         */
        public async Task<PagequeryTraasmetaAppserverResponse> PagequeryTraasmetaAppserverExAsync(PagequeryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用组分页查询
         * Summary: 应用组分页查询
         */
        public PagequeryTraasmetaAppgroupResponse PagequeryTraasmetaAppgroup(PagequeryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用组分页查询
         * Summary: 应用组分页查询
         */
        public async Task<PagequeryTraasmetaAppgroupResponse> PagequeryTraasmetaAppgroupAsync(PagequeryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用组分页查询
         * Summary: 应用组分页查询
         */
        public PagequeryTraasmetaAppgroupResponse PagequeryTraasmetaAppgroupEx(PagequeryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用组分页查询
         * Summary: 应用组分页查询
         */
        public async Task<PagequeryTraasmetaAppgroupResponse> PagequeryTraasmetaAppgroupExAsync(PagequeryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分页查询
         * Summary: 应用分页查询
         */
        public PagequeryTraasmetaAppResponse PagequeryTraasmetaApp(PagequeryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用分页查询
         * Summary: 应用分页查询
         */
        public async Task<PagequeryTraasmetaAppResponse> PagequeryTraasmetaAppAsync(PagequeryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用分页查询
         * Summary: 应用分页查询
         */
        public PagequeryTraasmetaAppResponse PagequeryTraasmetaAppEx(PagequeryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分页查询
         * Summary: 应用分页查询
         */
        public async Task<PagequeryTraasmetaAppResponse> PagequeryTraasmetaAppExAsync(PagequeryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间组查询
         * Summary: 工作空间组查询
         */
        public QueryTraasmetaWorkspacegroupResponse QueryTraasmetaWorkspacegroup(QueryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 工作空间组查询
         * Summary: 工作空间组查询
         */
        public async Task<QueryTraasmetaWorkspacegroupResponse> QueryTraasmetaWorkspacegroupAsync(QueryTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 工作空间组查询
         * Summary: 工作空间组查询
         */
        public QueryTraasmetaWorkspacegroupResponse QueryTraasmetaWorkspacegroupEx(QueryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间组查询
         * Summary: 工作空间组查询
         */
        public async Task<QueryTraasmetaWorkspacegroupResponse> QueryTraasmetaWorkspacegroupExAsync(QueryTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间查询
         * Summary: 工作空间查询
         */
        public QueryTraasmetaWorkspaceResponse QueryTraasmetaWorkspace(QueryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 工作空间查询
         * Summary: 工作空间查询
         */
        public async Task<QueryTraasmetaWorkspaceResponse> QueryTraasmetaWorkspaceAsync(QueryTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 工作空间查询
         * Summary: 工作空间查询
         */
        public QueryTraasmetaWorkspaceResponse QueryTraasmetaWorkspaceEx(QueryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 工作空间查询
         * Summary: 工作空间查询
         */
        public async Task<QueryTraasmetaWorkspaceResponse> QueryTraasmetaWorkspaceExAsync(QueryTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用标签查询
         * Summary: 应用标签查询
         */
        public QueryTraasmetaApptagResponse QueryTraasmetaApptag(QueryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 应用标签查询
         * Summary: 应用标签查询
         */
        public async Task<QueryTraasmetaApptagResponse> QueryTraasmetaApptagAsync(QueryTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用标签查询
         * Summary: 应用标签查询
         */
        public QueryTraasmetaApptagResponse QueryTraasmetaApptagEx(QueryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用标签查询
         * Summary: 应用标签查询
         */
        public async Task<QueryTraasmetaApptagResponse> QueryTraasmetaApptagExAsync(QueryTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务器查询
         * Summary: 应用服务器查询
         */
        public QueryTraasmetaAppserverResponse QueryTraasmetaAppserver(QueryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 应用服务器查询
         * Summary: 应用服务器查询
         */
        public async Task<QueryTraasmetaAppserverResponse> QueryTraasmetaAppserverAsync(QueryTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用服务器查询
         * Summary: 应用服务器查询
         */
        public QueryTraasmetaAppserverResponse QueryTraasmetaAppserverEx(QueryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务器查询
         * Summary: 应用服务器查询
         */
        public async Task<QueryTraasmetaAppserverResponse> QueryTraasmetaAppserverExAsync(QueryTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用组查询
         * Summary: 应用组查询
         */
        public QueryTraasmetaAppgroupResponse QueryTraasmetaAppgroup(QueryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用组查询
         * Summary: 应用组查询
         */
        public async Task<QueryTraasmetaAppgroupResponse> QueryTraasmetaAppgroupAsync(QueryTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用组查询
         * Summary: 应用组查询
         */
        public QueryTraasmetaAppgroupResponse QueryTraasmetaAppgroupEx(QueryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用组查询
         * Summary: 应用组查询
         */
        public async Task<QueryTraasmetaAppgroupResponse> QueryTraasmetaAppgroupExAsync(QueryTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用查询
         * Summary: 应用查询
         */
        public QueryTraasmetaAppResponse QueryTraasmetaApp(QueryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用查询
         * Summary: 应用查询
         */
        public async Task<QueryTraasmetaAppResponse> QueryTraasmetaAppAsync(QueryTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用查询
         * Summary: 应用查询
         */
        public QueryTraasmetaAppResponse QueryTraasmetaAppEx(QueryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用查询
         * Summary: 应用查询
         */
        public async Task<QueryTraasmetaAppResponse> QueryTraasmetaAppExAsync(QueryTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用
         * Summary: 更新单个应用
         */
        public UpdateTraasmetaAppResponse UpdateTraasmetaApp(UpdateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用
         * Summary: 更新单个应用
         */
        public async Task<UpdateTraasmetaAppResponse> UpdateTraasmetaAppAsync(UpdateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用
         * Summary: 更新单个应用
         */
        public UpdateTraasmetaAppResponse UpdateTraasmetaAppEx(UpdateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用
         * Summary: 更新单个应用
         */
        public async Task<UpdateTraasmetaAppResponse> UpdateTraasmetaAppExAsync(UpdateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用
         * Summary: 创建单个应用
         */
        public CreateTraasmetaAppResponse CreateTraasmetaApp(CreateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaAppEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用
         * Summary: 创建单个应用
         */
        public async Task<CreateTraasmetaAppResponse> CreateTraasmetaAppAsync(CreateTraasmetaAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用
         * Summary: 创建单个应用
         */
        public CreateTraasmetaAppResponse CreateTraasmetaAppEx(CreateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用
         * Summary: 创建单个应用
         */
        public async Task<CreateTraasmetaAppResponse> CreateTraasmetaAppExAsync(CreateTraasmetaAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个工作空间组
         * Summary: 更新单个工作空间组
         */
        public UpdateTraasmetaWorkspacegroupResponse UpdateTraasmetaWorkspacegroup(UpdateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个工作空间组
         * Summary: 更新单个工作空间组
         */
        public async Task<UpdateTraasmetaWorkspacegroupResponse> UpdateTraasmetaWorkspacegroupAsync(UpdateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个工作空间组
         * Summary: 更新单个工作空间组
         */
        public UpdateTraasmetaWorkspacegroupResponse UpdateTraasmetaWorkspacegroupEx(UpdateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个工作空间组
         * Summary: 更新单个工作空间组
         */
        public async Task<UpdateTraasmetaWorkspacegroupResponse> UpdateTraasmetaWorkspacegroupExAsync(UpdateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用组
         * Summary: 更新单个应用组
         */
        public UpdateTraasmetaAppgroupResponse UpdateTraasmetaAppgroup(UpdateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用组
         * Summary: 更新单个应用组
         */
        public async Task<UpdateTraasmetaAppgroupResponse> UpdateTraasmetaAppgroupAsync(UpdateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用组
         * Summary: 更新单个应用组
         */
        public UpdateTraasmetaAppgroupResponse UpdateTraasmetaAppgroupEx(UpdateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用组
         * Summary: 更新单个应用组
         */
        public async Task<UpdateTraasmetaAppgroupResponse> UpdateTraasmetaAppgroupExAsync(UpdateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用组
         * Summary: 创建单个应用组
         */
        public CreateTraasmetaAppgroupResponse CreateTraasmetaAppgroup(CreateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用组
         * Summary: 创建单个应用组
         */
        public async Task<CreateTraasmetaAppgroupResponse> CreateTraasmetaAppgroupAsync(CreateTraasmetaAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用组
         * Summary: 创建单个应用组
         */
        public CreateTraasmetaAppgroupResponse CreateTraasmetaAppgroupEx(CreateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppgroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用组
         * Summary: 创建单个应用组
         */
        public async Task<CreateTraasmetaAppgroupResponse> CreateTraasmetaAppgroupExAsync(CreateTraasmetaAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个工作空间
         * Summary: 创建单个工作空间
         */
        public CreateTraasmetaWorkspaceResponse CreateTraasmetaWorkspace(CreateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个工作空间
         * Summary: 创建单个工作空间
         */
        public async Task<CreateTraasmetaWorkspaceResponse> CreateTraasmetaWorkspaceAsync(CreateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个工作空间
         * Summary: 创建单个工作空间
         */
        public CreateTraasmetaWorkspaceResponse CreateTraasmetaWorkspaceEx(CreateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个工作空间
         * Summary: 创建单个工作空间
         */
        public async Task<CreateTraasmetaWorkspaceResponse> CreateTraasmetaWorkspaceExAsync(CreateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个工作空间
         * Summary: 更新单个工作空间
         */
        public UpdateTraasmetaWorkspaceResponse UpdateTraasmetaWorkspace(UpdateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个工作空间
         * Summary: 更新单个工作空间
         */
        public async Task<UpdateTraasmetaWorkspaceResponse> UpdateTraasmetaWorkspaceAsync(UpdateTraasmetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个工作空间
         * Summary: 更新单个工作空间
         */
        public UpdateTraasmetaWorkspaceResponse UpdateTraasmetaWorkspaceEx(UpdateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个工作空间
         * Summary: 更新单个工作空间
         */
        public async Task<UpdateTraasmetaWorkspaceResponse> UpdateTraasmetaWorkspaceExAsync(UpdateTraasmetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用标签
         * Summary: 更新单个应用标签
         */
        public UpdateTraasmetaApptagResponse UpdateTraasmetaApptag(UpdateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用标签
         * Summary: 更新单个应用标签
         */
        public async Task<UpdateTraasmetaApptagResponse> UpdateTraasmetaApptagAsync(UpdateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用标签
         * Summary: 更新单个应用标签
         */
        public UpdateTraasmetaApptagResponse UpdateTraasmetaApptagEx(UpdateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用标签
         * Summary: 更新单个应用标签
         */
        public async Task<UpdateTraasmetaApptagResponse> UpdateTraasmetaApptagExAsync(UpdateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用标签
         * Summary: 创建单个应用标签
         */
        public CreateTraasmetaApptagResponse CreateTraasmetaApptag(CreateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaApptagEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用标签
         * Summary: 创建单个应用标签
         */
        public async Task<CreateTraasmetaApptagResponse> CreateTraasmetaApptagAsync(CreateTraasmetaApptagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaApptagExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用标签
         * Summary: 创建单个应用标签
         */
        public CreateTraasmetaApptagResponse CreateTraasmetaApptagEx(CreateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaApptagResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.apptag.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用标签
         * Summary: 创建单个应用标签
         */
        public async Task<CreateTraasmetaApptagResponse> CreateTraasmetaApptagExAsync(CreateTraasmetaApptagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaApptagResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.apptag.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用服务器
         * Summary: 创建单个应用服务器
         */
        public CreateTraasmetaAppserverResponse CreateTraasmetaAppserver(CreateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用服务器
         * Summary: 创建单个应用服务器
         */
        public async Task<CreateTraasmetaAppserverResponse> CreateTraasmetaAppserverAsync(CreateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个应用服务器
         * Summary: 创建单个应用服务器
         */
        public CreateTraasmetaAppserverResponse CreateTraasmetaAppserverEx(CreateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个应用服务器
         * Summary: 创建单个应用服务器
         */
        public async Task<CreateTraasmetaAppserverResponse> CreateTraasmetaAppserverExAsync(CreateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用服务器
         * Summary: 更新单个应用服务器
         */
        public UpdateTraasmetaAppserverResponse UpdateTraasmetaAppserver(UpdateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaAppserverEx(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用服务器
         * Summary: 更新单个应用服务器
         */
        public async Task<UpdateTraasmetaAppserverResponse> UpdateTraasmetaAppserverAsync(UpdateTraasmetaAppserverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaAppserverExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新单个应用服务器
         * Summary: 更新单个应用服务器
         */
        public UpdateTraasmetaAppserverResponse UpdateTraasmetaAppserverEx(UpdateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppserverResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.appserver.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新单个应用服务器
         * Summary: 更新单个应用服务器
         */
        public async Task<UpdateTraasmetaAppserverResponse> UpdateTraasmetaAppserverExAsync(UpdateTraasmetaAppserverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaAppserverResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.appserver.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取SetupModel
         * Summary: 获取SetupModel
         */
        public GetSetupModelResponse GetSetupModel(GetSetupModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSetupModelEx(request, headers, runtime);
        }

        /**
         * Description: 获取SetupModel
         * Summary: 获取SetupModel
         */
        public async Task<GetSetupModelResponse> GetSetupModelAsync(GetSetupModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSetupModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取SetupModel
         * Summary: 获取SetupModel
         */
        public GetSetupModelResponse GetSetupModelEx(GetSetupModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSetupModelResponse>(DoRequest("1.0", "antcloud.monitor.setup.model.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取SetupModel
         * Summary: 获取SetupModel
         */
        public async Task<GetSetupModelResponse> GetSetupModelExAsync(GetSetupModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSetupModelResponse>(await DoRequestAsync("1.0", "antcloud.monitor.setup.model.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个工作空间组
         * Summary: 创建单个工作空间组
         */
        public CreateTraasmetaWorkspacegroupResponse CreateTraasmetaWorkspacegroup(CreateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个工作空间组
         * Summary: 创建单个工作空间组
         */
        public async Task<CreateTraasmetaWorkspacegroupResponse> CreateTraasmetaWorkspacegroupAsync(CreateTraasmetaWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个工作空间组
         * Summary: 创建单个工作空间组
         */
        public CreateTraasmetaWorkspacegroupResponse CreateTraasmetaWorkspacegroupEx(CreateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaWorkspacegroupResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个工作空间组
         * Summary: 创建单个工作空间组
         */
        public async Task<CreateTraasmetaWorkspacegroupResponse> CreateTraasmetaWorkspacegroupExAsync(CreateTraasmetaWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.workspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个cell
         * Summary: 获取单个cell
         */
        public GetTraasmetaCellResponse GetTraasmetaCell(GetTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个cell
         * Summary: 获取单个cell
         */
        public async Task<GetTraasmetaCellResponse> GetTraasmetaCellAsync(GetTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个cell
         * Summary: 获取单个cell
         */
        public GetTraasmetaCellResponse GetTraasmetaCellEx(GetTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个cell
         * Summary: 获取单个cell
         */
        public async Task<GetTraasmetaCellResponse> GetTraasmetaCellExAsync(GetTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询
         * Summary: 分页查询
         */
        public PagequeryTraasmetaCellResponse PagequeryTraasmetaCell(PagequeryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询
         * Summary: 分页查询
         */
        public async Task<PagequeryTraasmetaCellResponse> PagequeryTraasmetaCellAsync(PagequeryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询
         * Summary: 分页查询
         */
        public PagequeryTraasmetaCellResponse PagequeryTraasmetaCellEx(PagequeryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询
         * Summary: 分页查询
         */
        public async Task<PagequeryTraasmetaCellResponse> PagequeryTraasmetaCellExAsync(PagequeryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个主机
         * Summary: 获取单个主机
         */
        public GetTraasmetaHostmachineResponse GetTraasmetaHostmachine(GetTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个主机
         * Summary: 获取单个主机
         */
        public async Task<GetTraasmetaHostmachineResponse> GetTraasmetaHostmachineAsync(GetTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个主机
         * Summary: 获取单个主机
         */
        public GetTraasmetaHostmachineResponse GetTraasmetaHostmachineEx(GetTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个主机
         * Summary: 获取单个主机
         */
        public async Task<GetTraasmetaHostmachineResponse> GetTraasmetaHostmachineExAsync(GetTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询主机
         * Summary: 分页查询主机
         */
        public PagequeryTraasmetaHostmachineResponse PagequeryTraasmetaHostmachine(PagequeryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询主机
         * Summary: 分页查询主机
         */
        public async Task<PagequeryTraasmetaHostmachineResponse> PagequeryTraasmetaHostmachineAsync(PagequeryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询主机
         * Summary: 分页查询主机
         */
        public PagequeryTraasmetaHostmachineResponse PagequeryTraasmetaHostmachineEx(PagequeryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询主机
         * Summary: 分页查询主机
         */
        public async Task<PagequeryTraasmetaHostmachineResponse> PagequeryTraasmetaHostmachineExAsync(PagequeryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单链路详细拓扑
         * Summary: 获取单链路详细拓扑
         */
        public QueryTraceDetailtopologyResponse QueryTraceDetailtopology(QueryTraceDetailtopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraceDetailtopologyEx(request, headers, runtime);
        }

        /**
         * Description: 获取单链路详细拓扑
         * Summary: 获取单链路详细拓扑
         */
        public async Task<QueryTraceDetailtopologyResponse> QueryTraceDetailtopologyAsync(QueryTraceDetailtopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraceDetailtopologyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单链路详细拓扑
         * Summary: 获取单链路详细拓扑
         */
        public QueryTraceDetailtopologyResponse QueryTraceDetailtopologyEx(QueryTraceDetailtopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceDetailtopologyResponse>(DoRequest("1.0", "antcloud.monitor.trace.detailtopology.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单链路详细拓扑
         * Summary: 获取单链路详细拓扑
         */
        public async Task<QueryTraceDetailtopologyResponse> QueryTraceDetailtopologyExAsync(QueryTraceDetailtopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraceDetailtopologyResponse>(await DoRequestAsync("1.0", "antcloud.monitor.trace.detailtopology.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-保存spi
         * Summary: spi配置-保存spi
         */
        public SaveTenantconfigSpiResponse SaveTenantconfigSpi(SaveTenantconfigSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveTenantconfigSpiEx(request, headers, runtime);
        }

        /**
         * Description: spi配置-保存spi
         * Summary: spi配置-保存spi
         */
        public async Task<SaveTenantconfigSpiResponse> SaveTenantconfigSpiAsync(SaveTenantconfigSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveTenantconfigSpiExAsync(request, headers, runtime);
        }

        /**
         * Description: spi配置-保存spi
         * Summary: spi配置-保存spi
         */
        public SaveTenantconfigSpiResponse SaveTenantconfigSpiEx(SaveTenantconfigSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTenantconfigSpiResponse>(DoRequest("1.0", "antcloud.monitor.tenantconfig.spi.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-保存spi
         * Summary: spi配置-保存spi
         */
        public async Task<SaveTenantconfigSpiResponse> SaveTenantconfigSpiExAsync(SaveTenantconfigSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTenantconfigSpiResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenantconfig.spi.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-查询spi
         * Summary: spi配置-查询spi
         */
        public QueryTenantconfigSpiResponse QueryTenantconfigSpi(QueryTenantconfigSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantconfigSpiEx(request, headers, runtime);
        }

        /**
         * Description: spi配置-查询spi
         * Summary: spi配置-查询spi
         */
        public async Task<QueryTenantconfigSpiResponse> QueryTenantconfigSpiAsync(QueryTenantconfigSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantconfigSpiExAsync(request, headers, runtime);
        }

        /**
         * Description: spi配置-查询spi
         * Summary: spi配置-查询spi
         */
        public QueryTenantconfigSpiResponse QueryTenantconfigSpiEx(QueryTenantconfigSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantconfigSpiResponse>(DoRequest("1.0", "antcloud.monitor.tenantconfig.spi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-查询spi
         * Summary: spi配置-查询spi
         */
        public async Task<QueryTenantconfigSpiResponse> QueryTenantconfigSpiExAsync(QueryTenantconfigSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantconfigSpiResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenantconfig.spi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前用户能够访问的workspace
         * Summary: 获取当前用户能够访问的workspace
         */
        public ListOneconsoleWorkspaceResponse ListOneconsoleWorkspace(ListOneconsoleWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListOneconsoleWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前用户能够访问的workspace
         * Summary: 获取当前用户能够访问的workspace
         */
        public async Task<ListOneconsoleWorkspaceResponse> ListOneconsoleWorkspaceAsync(ListOneconsoleWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListOneconsoleWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前用户能够访问的workspace
         * Summary: 获取当前用户能够访问的workspace
         */
        public ListOneconsoleWorkspaceResponse ListOneconsoleWorkspaceEx(ListOneconsoleWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOneconsoleWorkspaceResponse>(DoRequest("1.0", "antcloud.monitor.oneconsole.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前用户能够访问的workspace
         * Summary: 获取当前用户能够访问的workspace
         */
        public async Task<ListOneconsoleWorkspaceResponse> ListOneconsoleWorkspaceExAsync(ListOneconsoleWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOneconsoleWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.monitor.oneconsole.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-删除
         * Summary: spi配置-删除
         */
        public DeleteTenantconfigResponse DeleteTenantconfig(DeleteTenantconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTenantconfigEx(request, headers, runtime);
        }

        /**
         * Description: spi配置-删除
         * Summary: spi配置-删除
         */
        public async Task<DeleteTenantconfigResponse> DeleteTenantconfigAsync(DeleteTenantconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTenantconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: spi配置-删除
         * Summary: spi配置-删除
         */
        public DeleteTenantconfigResponse DeleteTenantconfigEx(DeleteTenantconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTenantconfigResponse>(DoRequest("1.0", "antcloud.monitor.tenantconfig.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-删除
         * Summary: spi配置-删除
         */
        public async Task<DeleteTenantconfigResponse> DeleteTenantconfigExAsync(DeleteTenantconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTenantconfigResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenantconfig.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-查询token
         * Summary: spi配置-查询token
         */
        public QueryTenantconfigTokenResponse QueryTenantconfigToken(QueryTenantconfigTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantconfigTokenEx(request, headers, runtime);
        }

        /**
         * Description: spi配置-查询token
         * Summary: spi配置-查询token
         */
        public async Task<QueryTenantconfigTokenResponse> QueryTenantconfigTokenAsync(QueryTenantconfigTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantconfigTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: spi配置-查询token
         * Summary: spi配置-查询token
         */
        public QueryTenantconfigTokenResponse QueryTenantconfigTokenEx(QueryTenantconfigTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantconfigTokenResponse>(DoRequest("1.0", "antcloud.monitor.tenantconfig.token.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-查询token
         * Summary: spi配置-查询token
         */
        public async Task<QueryTenantconfigTokenResponse> QueryTenantconfigTokenExAsync(QueryTenantconfigTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantconfigTokenResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenantconfig.token.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-保存token
         * Summary: spi配置-保存token
         */
        public SaveTenantconfigTokenResponse SaveTenantconfigToken(SaveTenantconfigTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveTenantconfigTokenEx(request, headers, runtime);
        }

        /**
         * Description: spi配置-保存token
         * Summary: spi配置-保存token
         */
        public async Task<SaveTenantconfigTokenResponse> SaveTenantconfigTokenAsync(SaveTenantconfigTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveTenantconfigTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: spi配置-保存token
         * Summary: spi配置-保存token
         */
        public SaveTenantconfigTokenResponse SaveTenantconfigTokenEx(SaveTenantconfigTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTenantconfigTokenResponse>(DoRequest("1.0", "antcloud.monitor.tenantconfig.token.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi配置-保存token
         * Summary: spi配置-保存token
         */
        public async Task<SaveTenantconfigTokenResponse> SaveTenantconfigTokenExAsync(SaveTenantconfigTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTenantconfigTokenResponse>(await DoRequestAsync("1.0", "antcloud.monitor.tenantconfig.token.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询元数据实体基本信息
         * Summary: 查询元数据实体基本信息
         */
        public QueryTraasmetaEntityResponse QueryTraasmetaEntity(QueryTraasmetaEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaEntityEx(request, headers, runtime);
        }

        /**
         * Description: 查询元数据实体基本信息
         * Summary: 查询元数据实体基本信息
         */
        public async Task<QueryTraasmetaEntityResponse> QueryTraasmetaEntityAsync(QueryTraasmetaEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaEntityExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询元数据实体基本信息
         * Summary: 查询元数据实体基本信息
         */
        public QueryTraasmetaEntityResponse QueryTraasmetaEntityEx(QueryTraasmetaEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaEntityResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.entity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询元数据实体基本信息
         * Summary: 查询元数据实体基本信息
         */
        public async Task<QueryTraasmetaEntityResponse> QueryTraasmetaEntityExAsync(QueryTraasmetaEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaEntityResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.entity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实体字段列表
         * Summary: 获取实体字段列表
         */
        public ListTraasmetaEntityfieldResponse ListTraasmetaEntityfield(ListTraasmetaEntityfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTraasmetaEntityfieldEx(request, headers, runtime);
        }

        /**
         * Description: 获取实体字段列表
         * Summary: 获取实体字段列表
         */
        public async Task<ListTraasmetaEntityfieldResponse> ListTraasmetaEntityfieldAsync(ListTraasmetaEntityfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTraasmetaEntityfieldExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取实体字段列表
         * Summary: 获取实体字段列表
         */
        public ListTraasmetaEntityfieldResponse ListTraasmetaEntityfieldEx(ListTraasmetaEntityfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTraasmetaEntityfieldResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.entityfield.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实体字段列表
         * Summary: 获取实体字段列表
         */
        public async Task<ListTraasmetaEntityfieldResponse> ListTraasmetaEntityfieldExAsync(ListTraasmetaEntityfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTraasmetaEntityfieldResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.entityfield.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实体拓扑
         * Summary: 查询实体拓扑
         */
        public QueryTraasmetaEntitytopoResponse QueryTraasmetaEntitytopo(QueryTraasmetaEntitytopoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaEntitytopoEx(request, headers, runtime);
        }

        /**
         * Description: 查询实体拓扑
         * Summary: 查询实体拓扑
         */
        public async Task<QueryTraasmetaEntitytopoResponse> QueryTraasmetaEntitytopoAsync(QueryTraasmetaEntitytopoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaEntitytopoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实体拓扑
         * Summary: 查询实体拓扑
         */
        public QueryTraasmetaEntitytopoResponse QueryTraasmetaEntitytopoEx(QueryTraasmetaEntitytopoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaEntitytopoResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.entitytopo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实体拓扑
         * Summary: 查询实体拓扑
         */
        public async Task<QueryTraasmetaEntitytopoResponse> QueryTraasmetaEntitytopoExAsync(QueryTraasmetaEntitytopoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaEntitytopoResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.entitytopo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有主机
         * Summary: 获取所有主机
         */
        public AllTraasmetaHostmachineResponse AllTraasmetaHostmachine(AllTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有主机
         * Summary: 获取所有主机
         */
        public async Task<AllTraasmetaHostmachineResponse> AllTraasmetaHostmachineAsync(AllTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有主机
         * Summary: 获取所有主机
         */
        public AllTraasmetaHostmachineResponse AllTraasmetaHostmachineEx(AllTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有主机
         * Summary: 获取所有主机
         */
        public async Task<AllTraasmetaHostmachineResponse> AllTraasmetaHostmachineExAsync(AllTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建主机
         * Summary: 批量创建主机
         */
        public BatchcreateTraasmetaHostmachineResponse BatchcreateTraasmetaHostmachine(BatchcreateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建主机
         * Summary: 批量创建主机
         */
        public async Task<BatchcreateTraasmetaHostmachineResponse> BatchcreateTraasmetaHostmachineAsync(BatchcreateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建主机
         * Summary: 批量创建主机
         */
        public BatchcreateTraasmetaHostmachineResponse BatchcreateTraasmetaHostmachineEx(BatchcreateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建主机
         * Summary: 批量创建主机
         */
        public async Task<BatchcreateTraasmetaHostmachineResponse> BatchcreateTraasmetaHostmachineExAsync(BatchcreateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除主机
         * Summary: 批量删除主机
         */
        public BatchdeleteTraasmetaHostmachineResponse BatchdeleteTraasmetaHostmachine(BatchdeleteTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除主机
         * Summary: 批量删除主机
         */
        public async Task<BatchdeleteTraasmetaHostmachineResponse> BatchdeleteTraasmetaHostmachineAsync(BatchdeleteTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除主机
         * Summary: 批量删除主机
         */
        public BatchdeleteTraasmetaHostmachineResponse BatchdeleteTraasmetaHostmachineEx(BatchdeleteTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除主机
         * Summary: 批量删除主机
         */
        public async Task<BatchdeleteTraasmetaHostmachineResponse> BatchdeleteTraasmetaHostmachineExAsync(BatchdeleteTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询主机
         * Summary: 批量查询主机
         */
        public BatchqueryTraasmetaHostmachineResponse BatchqueryTraasmetaHostmachine(BatchqueryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询主机
         * Summary: 批量查询主机
         */
        public async Task<BatchqueryTraasmetaHostmachineResponse> BatchqueryTraasmetaHostmachineAsync(BatchqueryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询主机
         * Summary: 批量查询主机
         */
        public BatchqueryTraasmetaHostmachineResponse BatchqueryTraasmetaHostmachineEx(BatchqueryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询主机
         * Summary: 批量查询主机
         */
        public async Task<BatchqueryTraasmetaHostmachineResponse> BatchqueryTraasmetaHostmachineExAsync(BatchqueryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个主机
         * Summary: 创建单个主机
         */
        public CreateTraasmetaHostmachineResponse CreateTraasmetaHostmachine(CreateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个主机
         * Summary: 创建单个主机
         */
        public async Task<CreateTraasmetaHostmachineResponse> CreateTraasmetaHostmachineAsync(CreateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个主机
         * Summary: 创建单个主机
         */
        public CreateTraasmetaHostmachineResponse CreateTraasmetaHostmachineEx(CreateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个主机
         * Summary: 创建单个主机
         */
        public async Task<CreateTraasmetaHostmachineResponse> CreateTraasmetaHostmachineExAsync(CreateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除主机
         * Summary: 删除主机
         */
        public DeleteTraasmetaHostmachineResponse DeleteTraasmetaHostmachine(DeleteTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 删除主机
         * Summary: 删除主机
         */
        public async Task<DeleteTraasmetaHostmachineResponse> DeleteTraasmetaHostmachineAsync(DeleteTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除主机
         * Summary: 删除主机
         */
        public DeleteTraasmetaHostmachineResponse DeleteTraasmetaHostmachineEx(DeleteTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除主机
         * Summary: 删除主机
         */
        public async Task<DeleteTraasmetaHostmachineResponse> DeleteTraasmetaHostmachineExAsync(DeleteTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询主机
         * Summary: 查询主机
         */
        public QueryTraasmetaHostmachineResponse QueryTraasmetaHostmachine(QueryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 查询主机
         * Summary: 查询主机
         */
        public async Task<QueryTraasmetaHostmachineResponse> QueryTraasmetaHostmachineAsync(QueryTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询主机
         * Summary: 查询主机
         */
        public QueryTraasmetaHostmachineResponse QueryTraasmetaHostmachineEx(QueryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询主机
         * Summary: 查询主机
         */
        public async Task<QueryTraasmetaHostmachineResponse> QueryTraasmetaHostmachineExAsync(QueryTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新主机
         * Summary: 更新主机
         */
        public UpdateTraasmetaHostmachineResponse UpdateTraasmetaHostmachine(UpdateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaHostmachineEx(request, headers, runtime);
        }

        /**
         * Description: 更新主机
         * Summary: 更新主机
         */
        public async Task<UpdateTraasmetaHostmachineResponse> UpdateTraasmetaHostmachineAsync(UpdateTraasmetaHostmachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaHostmachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新主机
         * Summary: 更新主机
         */
        public UpdateTraasmetaHostmachineResponse UpdateTraasmetaHostmachineEx(UpdateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaHostmachineResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新主机
         * Summary: 更新主机
         */
        public async Task<UpdateTraasmetaHostmachineResponse> UpdateTraasmetaHostmachineExAsync(UpdateTraasmetaHostmachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaHostmachineResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.hostmachine.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建cell
         * Summary: 批量创建cell
         */
        public BatchcreateTraasmetaCellResponse BatchcreateTraasmetaCell(BatchcreateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建cell
         * Summary: 批量创建cell
         */
        public async Task<BatchcreateTraasmetaCellResponse> BatchcreateTraasmetaCellAsync(BatchcreateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建cell
         * Summary: 批量创建cell
         */
        public BatchcreateTraasmetaCellResponse BatchcreateTraasmetaCellEx(BatchcreateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建cell
         * Summary: 批量创建cell
         */
        public async Task<BatchcreateTraasmetaCellResponse> BatchcreateTraasmetaCellExAsync(BatchcreateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除cell
         * Summary: 批量删除cell
         */
        public BatchdeleteTraasmetaCellResponse BatchdeleteTraasmetaCell(BatchdeleteTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除cell
         * Summary: 批量删除cell
         */
        public async Task<BatchdeleteTraasmetaCellResponse> BatchdeleteTraasmetaCellAsync(BatchdeleteTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除cell
         * Summary: 批量删除cell
         */
        public BatchdeleteTraasmetaCellResponse BatchdeleteTraasmetaCellEx(BatchdeleteTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除cell
         * Summary: 批量删除cell
         */
        public async Task<BatchdeleteTraasmetaCellResponse> BatchdeleteTraasmetaCellExAsync(BatchdeleteTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询cell
         * Summary: 批量查询cell
         */
        public BatchqueryTraasmetaCellResponse BatchqueryTraasmetaCell(BatchqueryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询cell
         * Summary: 批量查询cell
         */
        public async Task<BatchqueryTraasmetaCellResponse> BatchqueryTraasmetaCellAsync(BatchqueryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询cell
         * Summary: 批量查询cell
         */
        public BatchqueryTraasmetaCellResponse BatchqueryTraasmetaCellEx(BatchqueryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询cell
         * Summary: 批量查询cell
         */
        public async Task<BatchqueryTraasmetaCellResponse> BatchqueryTraasmetaCellExAsync(BatchqueryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新cell
         * Summary: 更新cell
         */
        public UpdateTraasmetaCellResponse UpdateTraasmetaCell(UpdateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 更新cell
         * Summary: 更新cell
         */
        public async Task<UpdateTraasmetaCellResponse> UpdateTraasmetaCellAsync(UpdateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新cell
         * Summary: 更新cell
         */
        public UpdateTraasmetaCellResponse UpdateTraasmetaCellEx(UpdateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新cell
         * Summary: 更新cell
         */
        public async Task<UpdateTraasmetaCellResponse> UpdateTraasmetaCellExAsync(UpdateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个cell
         * Summary: 创建单个cell
         */
        public CreateTraasmetaCellResponse CreateTraasmetaCell(CreateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 创建单个cell
         * Summary: 创建单个cell
         */
        public async Task<CreateTraasmetaCellResponse> CreateTraasmetaCellAsync(CreateTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建单个cell
         * Summary: 创建单个cell
         */
        public CreateTraasmetaCellResponse CreateTraasmetaCellEx(CreateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建单个cell
         * Summary: 创建单个cell
         */
        public async Task<CreateTraasmetaCellResponse> CreateTraasmetaCellExAsync(CreateTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个cell
         * Summary: 删除单个cell
         */
        public DeleteTraasmetaCellResponse DeleteTraasmetaCell(DeleteTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个cell
         * Summary: 删除单个cell
         */
        public async Task<DeleteTraasmetaCellResponse> DeleteTraasmetaCellAsync(DeleteTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个cell
         * Summary: 删除单个cell
         */
        public DeleteTraasmetaCellResponse DeleteTraasmetaCellEx(DeleteTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个cell
         * Summary: 删除单个cell
         */
        public async Task<DeleteTraasmetaCellResponse> DeleteTraasmetaCellExAsync(DeleteTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有cell
         * Summary: 获取所有cell
         */
        public AllTraasmetaCellResponse AllTraasmetaCell(AllTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有cell
         * Summary: 获取所有cell
         */
        public async Task<AllTraasmetaCellResponse> AllTraasmetaCellAsync(AllTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有cell
         * Summary: 获取所有cell
         */
        public AllTraasmetaCellResponse AllTraasmetaCellEx(AllTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有cell
         * Summary: 获取所有cell
         */
        public async Task<AllTraasmetaCellResponse> AllTraasmetaCellExAsync(AllTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cell
         * Summary: 查询cell
         */
        public QueryTraasmetaCellResponse QueryTraasmetaCell(QueryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTraasmetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询cell
         * Summary: 查询cell
         */
        public async Task<QueryTraasmetaCellResponse> QueryTraasmetaCellAsync(QueryTraasmetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTraasmetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询cell
         * Summary: 查询cell
         */
        public QueryTraasmetaCellResponse QueryTraasmetaCellEx(QueryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaCellResponse>(DoRequest("1.0", "antcloud.monitor.traasmeta.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cell
         * Summary: 查询cell
         */
        public async Task<QueryTraasmetaCellResponse> QueryTraasmetaCellExAsync(QueryTraasmetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTraasmetaCellResponse>(await DoRequestAsync("1.0", "antcloud.monitor.traasmeta.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
