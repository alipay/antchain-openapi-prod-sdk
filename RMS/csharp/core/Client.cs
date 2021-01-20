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
            this._readTimeout = config.ReadTimeout;
            this._connectTimeout = config.ConnectTimeout;
            this._httpProxy = config.HttpProxy;
            this._httpsProxy = config.HttpsProxy;
            this._noProxy = config.NoProxy;
            this._socks5Proxy = config.Socks5Proxy;
            this._socks5NetWork = config.Socks5NetWork;
            this._maxIdleConns = config.MaxIdleConns;
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.1.0"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "undefined")},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.1.0"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "undefined")},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
        public ListAppResponse ListApp(ListAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListAppResponse> ListAppAsync(ListAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public ListAppResponse ListAppEx(ListAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppResponse>(DoRequest("1.0", "antcloud.monitor.app.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListAppResponse> ListAppExAsync(ListAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppResponse>(await DoRequestAsync("1.0", "antcloud.monitor.app.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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

    }
}
