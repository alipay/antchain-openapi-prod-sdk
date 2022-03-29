// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.rms.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Number _readTimeout;
    public Number _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Number _maxIdleConns;
    public String _securityToken;
    public Number _maxIdleTimeMillis;
    public Number _keepAliveDurationMillis;
    public Number _maxRequests;
    public Number _maxRequestsPerHost;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = com.aliyun.teautil.Common.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = com.aliyun.teautil.Common.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = com.aliyun.teautil.Common.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = com.aliyun.teautil.Common.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = com.aliyun.teautil.Common.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = com.aliyun.teautil.Common.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = com.aliyun.teautil.Common.defaultNumber(config.maxRequestsPerHost, 100);
    }

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
            new TeaPair("maxRequests", _maxRequests),
            new TeaPair("maxRequestsPerHost", _maxRequestsPerHost),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.3.273")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "openapi.antchain.antgroup.com")),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                    ),
                    headers
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.AntchainUtils.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
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
    public QueryRmsAgentloglocateResponse queryRmsAgentloglocate(QueryRmsAgentloglocateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAgentloglocateEx(request, headers, runtime);
    }

    /**
     * Description: /agent/logLocate
     * Summary: /agent/logLocate
     */
    public QueryRmsAgentloglocateResponse queryRmsAgentloglocateEx(QueryRmsAgentloglocateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.agentloglocate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAgentloglocateResponse());
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail
     */
    public QueryRmsAgenttailResponse queryRmsAgenttail(QueryRmsAgenttailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAgenttailEx(request, headers, runtime);
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail
     */
    public QueryRmsAgenttailResponse queryRmsAgenttailEx(QueryRmsAgenttailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.agenttail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAgenttailResponse());
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser
     */
    public QueryRmsAgentbrowserResponse queryRmsAgentbrowser(QueryRmsAgentbrowserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAgentbrowserEx(request, headers, runtime);
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser
     */
    public QueryRmsAgentbrowserResponse queryRmsAgentbrowserEx(QueryRmsAgentbrowserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.agentbrowser.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAgentbrowserResponse());
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats
     */
    public QueryRmsAlarmhistorytypeResponse queryRmsAlarmhistorytype(QueryRmsAlarmhistorytypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAlarmhistorytypeEx(request, headers, runtime);
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats
     */
    public QueryRmsAlarmhistorytypeResponse queryRmsAlarmhistorytypeEx(QueryRmsAlarmhistorytypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.alarmhistorytype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAlarmhistorytypeResponse());
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats
     */
    public QueryRmsAlarmhistorylevelResponse queryRmsAlarmhistorylevel(QueryRmsAlarmhistorylevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAlarmhistorylevelEx(request, headers, runtime);
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats
     */
    public QueryRmsAlarmhistorylevelResponse queryRmsAlarmhistorylevelEx(QueryRmsAlarmhistorylevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.alarmhistorylevel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAlarmhistorylevelResponse());
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2
     */
    public QueryRmsNotifyhistoryResponse queryRmsNotifyhistory(QueryRmsNotifyhistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsNotifyhistoryEx(request, headers, runtime);
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2
     */
    public QueryRmsNotifyhistoryResponse queryRmsNotifyhistoryEx(QueryRmsNotifyhistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.notifyhistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsNotifyhistoryResponse());
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats
     */
    public QueryRmsStackentityResponse queryRmsStackentity(QueryRmsStackentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsStackentityEx(request, headers, runtime);
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats
     */
    public QueryRmsStackentityResponse queryRmsStackentityEx(QueryRmsStackentityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.stackentity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsStackentityResponse());
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount
     */
    public QueryRmsAlarmhistoryappcountResponse queryRmsAlarmhistoryappcount(QueryRmsAlarmhistoryappcountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAlarmhistoryappcountEx(request, headers, runtime);
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount
     */
    public QueryRmsAlarmhistoryappcountResponse queryRmsAlarmhistoryappcountEx(QueryRmsAlarmhistoryappcountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappcount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAlarmhistoryappcountResponse());
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats
     */
    public QueryRmsAlarmhistoryappstatsResponse queryRmsAlarmhistoryappstats(QueryRmsAlarmhistoryappstatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAlarmhistoryappstatsEx(request, headers, runtime);
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats
     */
    public QueryRmsAlarmhistoryappstatsResponse queryRmsAlarmhistoryappstatsEx(QueryRmsAlarmhistoryappstatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappstats.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAlarmhistoryappstatsResponse());
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable
     */
    public QueryRmsAppstatspageableResponse queryRmsAppstatspageable(QueryRmsAppstatspageableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsAppstatspageableEx(request, headers, runtime);
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable
     */
    public QueryRmsAppstatspageableResponse queryRmsAppstatspageableEx(QueryRmsAppstatspageableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.appstatspageable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsAppstatspageableResponse());
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error
     */
    public QueryRmsLogreaderrorResponse queryRmsLogreaderror(QueryRmsLogreaderrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsLogreaderrorEx(request, headers, runtime);
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error
     */
    public QueryRmsLogreaderrorResponse queryRmsLogreaderrorEx(QueryRmsLogreaderrorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.logreaderror.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsLogreaderrorResponse());
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read
     */
    public QueryRmsUniversalreadResponse queryRmsUniversalread(QueryRmsUniversalreadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsUniversalreadEx(request, headers, runtime);
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read
     */
    public QueryRmsUniversalreadResponse queryRmsUniversalreadEx(QueryRmsUniversalreadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.universalread.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsUniversalreadResponse());
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write
     */
    public QueryRmsUniversalwriteResponse queryRmsUniversalwrite(QueryRmsUniversalwriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsUniversalwriteEx(request, headers, runtime);
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write
     */
    public QueryRmsUniversalwriteResponse queryRmsUniversalwriteEx(QueryRmsUniversalwriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.universalwrite.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsUniversalwriteResponse());
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create
     */
    public CreateRmsPluginResponse createRmsPlugin(CreateRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create
     */
    public CreateRmsPluginResponse createRmsPluginEx(CreateRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete
     */
    public DeleteRmsPluginResponse deleteRmsPlugin(DeleteRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete
     */
    public DeleteRmsPluginResponse deleteRmsPluginEx(DeleteRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close
     */
    public CloseRmsPluginResponse closeRmsPlugin(CloseRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close
     */
    public CloseRmsPluginResponse closeRmsPluginEx(CloseRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open
     */
    public OpenRmsPluginResponse openRmsPlugin(OpenRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open
     */
    public OpenRmsPluginResponse openRmsPluginEx(OpenRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update
     */
    public UpdateRmsPluginResponse updateRmsPlugin(UpdateRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update
     */
    public UpdateRmsPluginResponse updateRmsPluginEx(UpdateRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType
     */
    public QueryRmsPluginbytypeResponse queryRmsPluginbytype(QueryRmsPluginbytypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsPluginbytypeEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType
     */
    public QueryRmsPluginbytypeResponse queryRmsPluginbytypeEx(QueryRmsPluginbytypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.pluginbytype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsPluginbytypeResponse());
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder
     */
    public QueryRmsPluginbyfolderResponse queryRmsPluginbyfolder(QueryRmsPluginbyfolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsPluginbyfolderEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder
     */
    public QueryRmsPluginbyfolderResponse queryRmsPluginbyfolderEx(QueryRmsPluginbyfolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.pluginbyfolder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsPluginbyfolderResponse());
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query
     */
    public QueryRmsPluginResponse queryRmsPlugin(QueryRmsPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsPluginEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query
     */
    public QueryRmsPluginResponse queryRmsPluginEx(QueryRmsPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugin.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsPluginResponse());
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest
     */
    public QueryRmsPlugintestResponse queryRmsPlugintest(QueryRmsPlugintestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsPlugintestEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest
     */
    public QueryRmsPlugintestResponse queryRmsPlugintestEx(QueryRmsPlugintestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.plugintest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsPlugintestResponse());
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath
     */
    public QueryRmsPathResponse queryRmsPath(QueryRmsPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsPathEx(request, headers, runtime);
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath
     */
    public QueryRmsPathResponse queryRmsPathEx(QueryRmsPathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.path.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsPathResponse());
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey
     */
    public ExecRmsUniversalcleankeyResponse execRmsUniversalcleankey(ExecRmsUniversalcleankeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRmsUniversalcleankeyEx(request, headers, runtime);
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey
     */
    public ExecRmsUniversalcleankeyResponse execRmsUniversalcleankeyEx(ExecRmsUniversalcleankeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.universalcleankey.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRmsUniversalcleankeyResponse());
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery
     */
    public QueryRmsUniversalResponse queryRmsUniversal(QueryRmsUniversalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsUniversalEx(request, headers, runtime);
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery
     */
    public QueryRmsUniversalResponse queryRmsUniversalEx(QueryRmsUniversalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.universal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsUniversalResponse());
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索
     */
    public QueryRmsTracespanResponse queryRmsTracespan(QueryRmsTracespanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRmsTracespanEx(request, headers, runtime);
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索
     */
    public QueryRmsTracespanResponse queryRmsTracespanEx(QueryRmsTracespanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.tracespan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRmsTracespanResponse());
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置
     */
    public GetRmsTracespanqueryconfigResponse getRmsTracespanqueryconfig(GetRmsTracespanqueryconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRmsTracespanqueryconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置
     */
    public GetRmsTracespanqueryconfigResponse getRmsTracespanqueryconfigEx(GetRmsTracespanqueryconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.tracespanqueryconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRmsTracespanqueryconfigResponse());
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询
     */
    public DescribeRmsTracetreeResponse describeRmsTracetree(DescribeRmsTracetreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRmsTracetreeEx(request, headers, runtime);
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询
     */
    public DescribeRmsTracetreeResponse describeRmsTracetreeEx(DescribeRmsTracetreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.tracetree.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeRmsTracetreeResponse());
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口
     */
    public CallbackSpiCompletecommodityResponse callbackSpiCompletecommodity(CallbackSpiCompletecommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiCompletecommodityEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口
     */
    public CallbackSpiCompletecommodityResponse callbackSpiCompletecommodityEx(CallbackSpiCompletecommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.completecommodity.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiCompletecommodityResponse());
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调
     */
    public CallbackSpiPayordercallbackResponse callbackSpiPayordercallback(CallbackSpiPayordercallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiPayordercallbackEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调
     */
    public CallbackSpiPayordercallbackResponse callbackSpiPayordercallbackEx(CallbackSpiPayordercallbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.payordercallback.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiPayordercallbackResponse());
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单
     */
    public CallbackSpiCompleteorderparamResponse callbackSpiCompleteorderparam(CallbackSpiCompleteorderparamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiCompleteorderparamEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单
     */
    public CallbackSpiCompleteorderparamResponse callbackSpiCompleteorderparamEx(CallbackSpiCompleteorderparamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.completeorderparam.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiCompleteorderparamResponse());
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调
     */
    public CallbackSpiVerifyResponse callbackSpiVerify(CallbackSpiVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调
     */
    public CallbackSpiVerifyResponse callbackSpiVerifyEx(CallbackSpiVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.verify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiVerifyResponse());
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款
     */
    public CallbackSpiRefundResponse callbackSpiRefund(CallbackSpiRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiRefundEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款
     */
    public CallbackSpiRefundResponse callbackSpiRefundEx(CallbackSpiRefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.refund.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiRefundResponse());
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调
     */
    public CallbackSpiLifecycleResponse callbackSpiLifecycle(CallbackSpiLifecycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiLifecycleEx(request, headers, runtime);
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调
     */
    public CallbackSpiLifecycleResponse callbackSpiLifecycleEx(CallbackSpiLifecycleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.spi.lifecycle.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiLifecycleResponse());
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标
     */
    public DescribeRmsTimeseriesmetricsResponse describeRmsTimeseriesmetrics(DescribeRmsTimeseriesmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRmsTimeseriesmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标
     */
    public DescribeRmsTimeseriesmetricsResponse describeRmsTimeseriesmetricsEx(DescribeRmsTimeseriesmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.timeseriesmetrics.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeRmsTimeseriesmetricsResponse());
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑
     */
    public DescribeRmsTopologyResponse describeRmsTopology(DescribeRmsTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRmsTopologyEx(request, headers, runtime);
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑
     */
    public DescribeRmsTopologyResponse describeRmsTopologyEx(DescribeRmsTopologyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.rms.topology.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeRmsTopologyResponse());
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询
     */
    public QueryMetricsResponse queryMetrics(QueryMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsEx(request, headers, runtime);
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询
     */
    public QueryMetricsResponse queryMetricsEx(QueryMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.metrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsResponse());
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询
     */
    public QueryTraceSpanResponse queryTraceSpan(QueryTraceSpanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceSpanEx(request, headers, runtime);
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询
     */
    public QueryTraceSpanResponse queryTraceSpanEx(QueryTraceSpanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.span.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceSpanResponse());
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     */
    public ListAppNameResponse listAppName(ListAppNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppNameEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     */
    public ListAppNameResponse listAppNameEx(ListAppNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.name.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppNameResponse());
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标
     */
    public CreateCustompluginResponse createCustomplugin(CreateCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustompluginEx(request, headers, runtime);
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标
     */
    public CreateCustompluginResponse createCustompluginEx(CreateCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCustompluginResponse());
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标
     */
    public DeleteCustompluginResponse deleteCustomplugin(DeleteCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustompluginEx(request, headers, runtime);
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标
     */
    public DeleteCustompluginResponse deleteCustompluginEx(DeleteCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCustompluginResponse());
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFolderEx(request, headers, runtime);
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹
     */
    public CreateFolderResponse createFolderEx(CreateFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.folder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFolderResponse());
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFolderEx(request, headers, runtime);
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新
     */
    public UpdateFolderResponse updateFolderEx(UpdateFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.folder.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFolderResponse());
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询
     */
    public QueryTraceConfigResponse queryTraceConfig(QueryTraceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceConfigEx(request, headers, runtime);
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询
     */
    public QueryTraceConfigResponse queryTraceConfigEx(QueryTraceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceConfigResponse());
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径
     */
    public QueryFolderPathResponse queryFolderPath(QueryFolderPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFolderPathEx(request, headers, runtime);
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径
     */
    public QueryFolderPathResponse queryFolderPathEx(QueryFolderPathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.folder.path.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFolderPathResponse());
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情
     */
    public QueryTraceDetailResponse queryTraceDetail(QueryTraceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceDetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情
     */
    public QueryTraceDetailResponse queryTraceDetailEx(QueryTraceDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceDetailResponse());
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图
     */
    public QueryTraceTopologyResponse queryTraceTopology(QueryTraceTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceTopologyEx(request, headers, runtime);
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图
     */
    public QueryTraceTopologyResponse queryTraceTopologyEx(QueryTraceTopologyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.topology.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceTopologyResponse());
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标
     */
    public QueryTraceMetricsResponse queryTraceMetrics(QueryTraceMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceMetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标
     */
    public QueryTraceMetricsResponse queryTraceMetricsEx(QueryTraceMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.metrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceMetricsResponse());
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情
     */
    public GetCustompluginResponse getCustomplugin(GetCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustompluginEx(request, headers, runtime);
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情
     */
    public GetCustompluginResponse getCustompluginEx(GetCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCustompluginResponse());
    }

    /**
     * Description: 查询应用监控
     * Summary: 查询应用监控
     */
    public QueryAppResponse queryApp(QueryAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用监控
     * Summary: 查询应用监控
     */
    public QueryAppResponse queryAppEx(QueryAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppResponse());
    }

    /**
     * Description: 获取用户收藏资源状态
     * Summary: 获取用户收藏资源状态
     */
    public GetUserFavoriteResponse getUserFavorite(GetUserFavoriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserFavoriteEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户收藏资源状态
     * Summary: 获取用户收藏资源状态
     */
    public GetUserFavoriteResponse getUserFavoriteEx(GetUserFavoriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.favorite.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUserFavoriteResponse());
    }

    /**
     * Description: 查询文件夹列表
     * Summary: 查询文件夹列表
     */
    public QueryFolderResponse queryFolder(QueryFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFolderEx(request, headers, runtime);
    }

    /**
     * Description: 查询文件夹列表
     * Summary: 查询文件夹列表
     */
    public QueryFolderResponse queryFolderEx(QueryFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.folder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFolderResponse());
    }

    /**
     * Description:  查询自定义监控配置列表
     * Summary:  查询自定义监控配置列表
     */
    public QueryCustompluginResponse queryCustomplugin(QueryCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCustompluginEx(request, headers, runtime);
    }

    /**
     * Description:  查询自定义监控配置列表
     * Summary:  查询自定义监控配置列表
     */
    public QueryCustompluginResponse queryCustompluginEx(QueryCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCustompluginResponse());
    }

    /**
     * Description: 查询用户收藏列表
     * Summary: 查询用户收藏列表
     */
    public QueryUserFavoriteResponse queryUserFavorite(QueryUserFavoriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserFavoriteEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户收藏列表
     * Summary: 查询用户收藏列表
     */
    public QueryUserFavoriteResponse queryUserFavoriteEx(QueryUserFavoriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.favorite.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserFavoriteResponse());
    }

    /**
     * Description: 告警暂停列表查询
     * Summary: 告警暂停列表查询
     */
    public QueryAlarmPauseResponse queryAlarmPause(QueryAlarmPauseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmPauseEx(request, headers, runtime);
    }

    /**
     * Description: 告警暂停列表查询
     * Summary: 告警暂停列表查询
     */
    public QueryAlarmPauseResponse queryAlarmPauseEx(QueryAlarmPauseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.pause.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmPauseResponse());
    }

    /**
     * Description: 获取告警应用统计信息
     * Summary: 获取告警应用统计信息
     */
    public CountAlarmAppResponse countAlarmApp(CountAlarmAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAlarmAppEx(request, headers, runtime);
    }

    /**
     * Description: 获取告警应用统计信息
     * Summary: 获取告警应用统计信息
     */
    public CountAlarmAppResponse countAlarmAppEx(CountAlarmAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.app.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAlarmAppResponse());
    }

    /**
     * Description: 查询告警应用关联Map
     * Summary: 查询告警应用关联Map
     */
    public QueryAlarmApprelationResponse queryAlarmApprelation(QueryAlarmApprelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmApprelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警应用关联Map
     * Summary: 查询告警应用关联Map
     */
    public QueryAlarmApprelationResponse queryAlarmApprelationEx(QueryAlarmApprelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.apprelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmApprelationResponse());
    }

    /**
     * Description: 批量查询栈配置
     * Summary: 批量查询栈配置
     */
    public BatchqueryStackGeneratedconfigResponse batchqueryStackGeneratedconfig(BatchqueryStackGeneratedconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryStackGeneratedconfigEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询栈配置
     * Summary: 批量查询栈配置
     */
    public BatchqueryStackGeneratedconfigResponse batchqueryStackGeneratedconfigEx(BatchqueryStackGeneratedconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryStackGeneratedconfigResponse());
    }

    /**
     * Description: 获取大盘列表
     * Summary: 获取大盘列表
     */
    public ListDashboardResponse listDashboard(ListDashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardEx(request, headers, runtime);
    }

    /**
     * Description: 获取大盘列表
     * Summary: 获取大盘列表
     */
    public ListDashboardResponse listDashboardEx(ListDashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.dashboard.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDashboardResponse());
    }

    /**
     * Description: 查询技术栈配置详情
     * Summary: 查询技术栈配置详情
     */
    public QueryStackGeneratedconfigResponse queryStackGeneratedconfig(QueryStackGeneratedconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStackGeneratedconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询技术栈配置详情
     * Summary: 查询技术栈配置详情
     */
    public QueryStackGeneratedconfigResponse queryStackGeneratedconfigEx(QueryStackGeneratedconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStackGeneratedconfigResponse());
    }

    /**
     * Description: 查询监控项
     * Summary: 查询监控项
     */
    public QueryStackMonitoritemResponse queryStackMonitoritem(QueryStackMonitoritemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStackMonitoritemEx(request, headers, runtime);
    }

    /**
     * Description: 查询监控项
     * Summary: 查询监控项
     */
    public QueryStackMonitoritemResponse queryStackMonitoritemEx(QueryStackMonitoritemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.stack.monitoritem.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStackMonitoritemResponse());
    }

    /**
     * Description: 分页查询通知组
     * Summary: 分页查询通知组
     */
    public QueryUsergroupResponse queryUsergroup(QueryUsergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUsergroupEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询通知组
     * Summary: 分页查询通知组
     */
    public QueryUsergroupResponse queryUsergroupEx(QueryUsergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.usergroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUsergroupResponse());
    }

    /**
     * Description: 创建通知组
     * Summary: 创建通知组
     */
    public CreateUsergroupResponse createUsergroup(CreateUsergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUsergroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建通知组
     * Summary: 创建通知组
     */
    public CreateUsergroupResponse createUsergroupEx(CreateUsergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.usergroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUsergroupResponse());
    }

    /**
     * Description: 更新通知组
     * Summary: 更新通知组
     */
    public UpdateUsergroupResponse updateUsergroup(UpdateUsergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUsergroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新通知组
     * Summary: 更新通知组
     */
    public UpdateUsergroupResponse updateUsergroupEx(UpdateUsergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.usergroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUsergroupResponse());
    }

    /**
     * Description: 删除通知组
     * Summary: 删除通知组
     */
    public DeleteUsergroupResponse deleteUsergroup(DeleteUsergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUsergroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除通知组
     * Summary: 删除通知组
     */
    public DeleteUsergroupResponse deleteUsergroupEx(DeleteUsergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.usergroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUsergroupResponse());
    }

    /**
     * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
     * Summary: 查询过去某一时段内的告警趋势
     */
    public QueryAlarmTrendResponse queryAlarmTrend(QueryAlarmTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmTrendEx(request, headers, runtime);
    }

    /**
     * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
     * Summary: 查询过去某一时段内的告警趋势
     */
    public QueryAlarmTrendResponse queryAlarmTrendEx(QueryAlarmTrendRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.trend.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmTrendResponse());
    }

    /**
     * Description: 查询过去某一时段的告警详情
     * Summary: 查询过去某一时段的告警详情
     */
    public QueryAlarmHistoryResponse queryAlarmHistory(QueryAlarmHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询过去某一时段的告警详情
     * Summary: 查询过去某一时段的告警详情
     */
    public QueryAlarmHistoryResponse queryAlarmHistoryEx(QueryAlarmHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.history.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmHistoryResponse());
    }

    /**
     * Description: 查询告警订阅
     * Summary: 查询告警订阅
     */
    public QueryAlarmSubscriptionResponse queryAlarmSubscription(QueryAlarmSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmSubscriptionEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警订阅
     * Summary: 查询告警订阅
     */
    public QueryAlarmSubscriptionResponse queryAlarmSubscriptionEx(QueryAlarmSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.subscription.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmSubscriptionResponse());
    }

    /**
     * Description: 查询某个应用监控的告警套餐
     * Summary: 查询某个应用监控的告警套餐
     */
    public QueryStackAlarmruleResponse queryStackAlarmrule(QueryStackAlarmruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStackAlarmruleEx(request, headers, runtime);
    }

    /**
     * Description: 查询某个应用监控的告警套餐
     * Summary: 查询某个应用监控的告警套餐
     */
    public QueryStackAlarmruleResponse queryStackAlarmruleEx(QueryStackAlarmruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.stack.alarmrule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStackAlarmruleResponse());
    }

    /**
     * Description: 修改自定义监控指标
     * Summary: 修改自定义监控指标
     */
    public UpdateCustompluginResponse updateCustomplugin(UpdateCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustompluginEx(request, headers, runtime);
    }

    /**
     * Description: 修改自定义监控指标
     * Summary: 修改自定义监控指标
     */
    public UpdateCustompluginResponse updateCustompluginEx(UpdateCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCustompluginResponse());
    }

    /**
     * Description: 查询 agent 安装信息列表
     * Summary: 查询 agent 安装信息列表
     */
    public QueryAgentResponse queryAgent(QueryAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAgentEx(request, headers, runtime);
    }

    /**
     * Description: 查询 agent 安装信息列表
     * Summary: 查询 agent 安装信息列表
     */
    public QueryAgentResponse queryAgentEx(QueryAgentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAgentResponse());
    }

    /**
     * Description: 安装 agent 组件
     * Summary: 安装 agent 组件
     */
    public InstallAgentResponse installAgent(InstallAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentEx(request, headers, runtime);
    }

    /**
     * Description: 安装 agent 组件
     * Summary: 安装 agent 组件
     */
    public InstallAgentResponse installAgentEx(InstallAgentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.install", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InstallAgentResponse());
    }

    /**
     * Description: 获取需要安装的 agent 版本
     * Summary: 获取需要安装的 agent 版本
     */
    public GetAgentVersionResponse getAgentVersion(GetAgentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentVersionEx(request, headers, runtime);
    }

    /**
     * Description: 获取需要安装的 agent 版本
     * Summary: 获取需要安装的 agent 版本
     */
    public GetAgentVersionResponse getAgentVersionEx(GetAgentVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.version.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAgentVersionResponse());
    }

    /**
     * Description:  设置默认最新agent版本
     * Summary:  设置默认最新agent版本
     */
    public EnableAgentVersionResponse enableAgentVersion(EnableAgentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableAgentVersionEx(request, headers, runtime);
    }

    /**
     * Description:  设置默认最新agent版本
     * Summary:  设置默认最新agent版本
     */
    public EnableAgentVersionResponse enableAgentVersionEx(EnableAgentVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.version.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableAgentVersionResponse());
    }

    /**
     * Description: 获取当前工作空间
     * Summary: 获取当前工作空间
     */
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前工作空间
     * Summary: 获取当前工作空间
     */
    public GetWorkspaceResponse getWorkspaceEx(GetWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.workspace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspaceResponse());
    }

    /**
     * Description: 获取当前租户
     * Summary: 获取当前租户
     */
    public GetTenantResponse getTenant(GetTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前租户
     * Summary: 获取当前租户
     */
    public GetTenantResponse getTenantEx(GetTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTenantResponse());
    }

    /**
     * Description: 查询核心态监控配置
     * Summary: 查询核心态监控配置
     */
    public QueryKernelstackGeneratedconfigResponse queryKernelstackGeneratedconfig(QueryKernelstackGeneratedconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKernelstackGeneratedconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询核心态监控配置
     * Summary: 查询核心态监控配置
     */
    public QueryKernelstackGeneratedconfigResponse queryKernelstackGeneratedconfigEx(QueryKernelstackGeneratedconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.kernelstack.generatedconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKernelstackGeneratedconfigResponse());
    }

    /**
     * Description: 获取阿里云开通状态
     * Summary: 获取阿里云开通状态
     */
    public GetAliyunStatusResponse getAliyunStatus(GetAliyunStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAliyunStatusEx(request, headers, runtime);
    }

    /**
     * Description: 获取阿里云开通状态
     * Summary: 获取阿里云开通状态
     */
    public GetAliyunStatusResponse getAliyunStatusEx(GetAliyunStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.aliyun.status.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAliyunStatusResponse());
    }

    /**
     * Description: 监控工作空间开通
     * Summary: 监控工作空间开通
     */
    public OpenWorkspaceResponse openWorkspace(OpenWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 监控工作空间开通
     * Summary: 监控工作空间开通
     */
    public OpenWorkspaceResponse openWorkspaceEx(OpenWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.workspace.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenWorkspaceResponse());
    }

    /**
     * Description: 更新技术栈配置
     * Summary: 更新技术栈配置
     */
    public UpdateStackGeneratedconfigResponse updateStackGeneratedconfig(UpdateStackGeneratedconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStackGeneratedconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新技术栈配置
     * Summary: 更新技术栈配置
     */
    public UpdateStackGeneratedconfigResponse updateStackGeneratedconfigEx(UpdateStackGeneratedconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateStackGeneratedconfigResponse());
    }

    /**
     * Description: 查询用户列表
     * Summary: 查询用户列表
     */
    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户列表
     * Summary: 查询用户列表
     */
    public QueryUserResponse queryUserEx(QueryUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserResponse());
    }

    /**
     * Description: 获取用户权限列表
     * Summary: 获取用户权限列表
     */
    public ListAuthResponse listAuth(ListAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户权限列表
     * Summary: 获取用户权限列表
     */
    public ListAuthResponse listAuthEx(ListAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.auth.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAuthResponse());
    }

    /**
     * Description: 删除用户权限
     * Summary: 删除用户权限
     */
    public DeleteAuthResponse deleteAuth(DeleteAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAuthEx(request, headers, runtime);
    }

    /**
     * Description: 删除用户权限
     * Summary: 删除用户权限
     */
    public DeleteAuthResponse deleteAuthEx(DeleteAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.auth.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAuthResponse());
    }

    /**
     * Description: 新建用户权限
     * Summary: 新建用户权限
     */
    public CreateAuthResponse createAuth(CreateAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthEx(request, headers, runtime);
    }

    /**
     * Description: 新建用户权限
     * Summary: 新建用户权限
     */
    public CreateAuthResponse createAuthEx(CreateAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.auth.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthResponse());
    }

    /**
     * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
     * Summary: 用户添加收藏资源
     */
    public BatchcreateUserFavoriteResponse batchcreateUserFavorite(BatchcreateUserFavoriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateUserFavoriteEx(request, headers, runtime);
    }

    /**
     * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
     * Summary: 用户添加收藏资源
     */
    public BatchcreateUserFavoriteResponse batchcreateUserFavoriteEx(BatchcreateUserFavoriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.favorite.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateUserFavoriteResponse());
    }

    /**
     * Description: 批量取消收藏
     * Summary: 批量取消收藏
     */
    public BatchdeleteUserFavoriteResponse batchdeleteUserFavorite(BatchdeleteUserFavoriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteUserFavoriteEx(request, headers, runtime);
    }

    /**
     * Description: 批量取消收藏
     * Summary: 批量取消收藏
     */
    public BatchdeleteUserFavoriteResponse batchdeleteUserFavoriteEx(BatchdeleteUserFavoriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.favorite.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteUserFavoriteResponse());
    }

    /**
     * Description: 分页查询用户的操作历史
     * Summary: 查询用户的操作历史
     */
    public QueryUserOperationResponse queryUserOperation(QueryUserOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserOperationEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询用户的操作历史
     * Summary: 查询用户的操作历史
     */
    public QueryUserOperationResponse queryUserOperationEx(QueryUserOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.operation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserOperationResponse());
    }

    /**
     * Description: 新增告警订阅
     * Summary: 新增告警订阅
     */
    public CreateAlarmSubscriptionResponse createAlarmSubscription(CreateAlarmSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlarmSubscriptionEx(request, headers, runtime);
    }

    /**
     * Description: 新增告警订阅
     * Summary: 新增告警订阅
     */
    public CreateAlarmSubscriptionResponse createAlarmSubscriptionEx(CreateAlarmSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.subscription.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAlarmSubscriptionResponse());
    }

    /**
     * Description: 取消告警订阅 (删除)
     * Summary: 取消告警订阅
     */
    public DeleteAlarmSubscriptionResponse deleteAlarmSubscription(DeleteAlarmSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlarmSubscriptionEx(request, headers, runtime);
    }

    /**
     * Description: 取消告警订阅 (删除)
     * Summary: 取消告警订阅
     */
    public DeleteAlarmSubscriptionResponse deleteAlarmSubscriptionEx(DeleteAlarmSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.subscription.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAlarmSubscriptionResponse());
    }

    /**
     * Description: 暂停告警
     * Summary: 暂停告警
     */
    public PauseAlarmResponse pauseAlarm(PauseAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 暂停告警
     * Summary: 暂停告警
     */
    public PauseAlarmResponse pauseAlarmEx(PauseAlarmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseAlarmResponse());
    }

    /**
     * Description: 恢复告警
     * Summary: 恢复告警
     */
    public ResumeAlarmResponse resumeAlarm(ResumeAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 恢复告警
     * Summary: 恢复告警
     */
    public ResumeAlarmResponse resumeAlarmEx(ResumeAlarmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeAlarmResponse());
    }

    /**
     * Description: 拉取日志，返回LogTail
     * Summary: 拉取日志
     */
    public GetLogTailResponse getLogTail(GetLogTailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogTailEx(request, headers, runtime);
    }

    /**
     * Description: 拉取日志，返回LogTail
     * Summary: 拉取日志
     */
    public GetLogTailResponse getLogTailEx(GetLogTailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.log.tail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLogTailResponse());
    }

    /**
     * Description: 获取文件浏览结果
     * Summary: 获取文件浏览结果
     */
    public GetLogBrowserResponse getLogBrowser(GetLogBrowserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogBrowserEx(request, headers, runtime);
    }

    /**
     * Description: 获取文件浏览结果
     * Summary: 获取文件浏览结果
     */
    public GetLogBrowserResponse getLogBrowserEx(GetLogBrowserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.log.browser.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLogBrowserResponse());
    }

    /**
     * Description: 按ID删除文件夹
     * Summary: 删除文件夹
     */
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFolderEx(request, headers, runtime);
    }

    /**
     * Description: 按ID删除文件夹
     * Summary: 删除文件夹
     */
    public DeleteFolderResponse deleteFolderEx(DeleteFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.folder.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFolderResponse());
    }

    /**
     * Description: 获取总览页应用统计信息
     * Summary: 获取总览页应用统计信息
     */
    public GetAppOverviewResponse getAppOverview(GetAppOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppOverviewEx(request, headers, runtime);
    }

    /**
     * Description: 获取总览页应用统计信息
     * Summary: 获取总览页应用统计信息
     */
    public GetAppOverviewResponse getAppOverviewEx(GetAppOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.overview.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppOverviewResponse());
    }

    /**
     * Description: 查询统一告警历史记录
     * Summary: 查询统一告警历史记录
     */
    public QueryUnifiedalarmHistoryResponse queryUnifiedalarmHistory(QueryUnifiedalarmHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询统一告警历史记录
     * Summary: 查询统一告警历史记录
     */
    public QueryUnifiedalarmHistoryResponse queryUnifiedalarmHistoryEx(QueryUnifiedalarmHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.history.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmHistoryResponse());
    }

    /**
     * Description: 测试演示
     * Summary: 测试演示
     */
    public GetAlarmTestResponse getAlarmTest(GetAlarmTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlarmTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试演示
     * Summary: 测试演示
     */
    public GetAlarmTestResponse getAlarmTestEx(GetAlarmTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.test.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAlarmTestResponse());
    }

    /**
     * Description: 获取webhook列表
     * Summary: 获取webhook列表
     */
    public QueryAlarmwebhookResponse queryAlarmwebhook(QueryAlarmwebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmwebhookEx(request, headers, runtime);
    }

    /**
     * Description: 获取webhook列表
     * Summary: 获取webhook列表
     */
    public QueryAlarmwebhookResponse queryAlarmwebhookEx(QueryAlarmwebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarmwebhook.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmwebhookResponse());
    }

    /**
     * Description: 创建告警规则
     * Summary: 创建告警规则
     */
    public CreateUnifiedalarmRuleResponse createUnifiedalarmRule(CreateUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 创建告警规则
     * Summary: 创建告警规则
     */
    public CreateUnifiedalarmRuleResponse createUnifiedalarmRuleEx(CreateUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnifiedalarmRuleResponse());
    }

    /**
     * Description: 更新告警规则
     * Summary: 更新告警规则
     */
    public UpdateUnifiedalarmRuleResponse updateUnifiedalarmRule(UpdateUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 更新告警规则
     * Summary: 更新告警规则
     */
    public UpdateUnifiedalarmRuleResponse updateUnifiedalarmRuleEx(UpdateUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUnifiedalarmRuleResponse());
    }

    /**
     * Description: 查询告警规则列表
     * Summary: 查询告警规则列表
     */
    public QueryUnifiedalarmRuleResponse queryUnifiedalarmRule(QueryUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警规则列表
     * Summary: 查询告警规则列表
     */
    public QueryUnifiedalarmRuleResponse queryUnifiedalarmRuleEx(QueryUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmRuleResponse());
    }

    /**
     * Description: 查询告警规则详情
     * Summary: 查询告警规则详情
     */
    public GetUnifiedalarmRuleResponse getUnifiedalarmRule(GetUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警规则详情
     * Summary: 查询告警规则详情
     */
    public GetUnifiedalarmRuleResponse getUnifiedalarmRuleEx(GetUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnifiedalarmRuleResponse());
    }

    /**
     * Description: 删除告警规则
     * Summary: 删除告警规则
     */
    public DeleteUnifiedalarmRuleResponse deleteUnifiedalarmRule(DeleteUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 删除告警规则
     * Summary: 删除告警规则
     */
    public DeleteUnifiedalarmRuleResponse deleteUnifiedalarmRuleEx(DeleteUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUnifiedalarmRuleResponse());
    }

    /**
     * Description: 查询告警消息历史
     * Summary: 查询告警消息历史
     */
    public QueryUnifiedalarmNotifyhistoryResponse queryUnifiedalarmNotifyhistory(QueryUnifiedalarmNotifyhistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmNotifyhistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警消息历史
     * Summary: 查询告警消息历史
     */
    public QueryUnifiedalarmNotifyhistoryResponse queryUnifiedalarmNotifyhistoryEx(QueryUnifiedalarmNotifyhistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.notifyhistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmNotifyhistoryResponse());
    }

    /**
     * Description: 批量订阅告警
     * Summary: 批量订阅告警
     */
    public BatchcreateUnifiedalarmSubResponse batchcreateUnifiedalarmSub(BatchcreateUnifiedalarmSubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateUnifiedalarmSubEx(request, headers, runtime);
    }

    /**
     * Description: 批量订阅告警
     * Summary: 批量订阅告警
     */
    public BatchcreateUnifiedalarmSubResponse batchcreateUnifiedalarmSubEx(BatchcreateUnifiedalarmSubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateUnifiedalarmSubResponse());
    }

    /**
     * Description: 取消订阅
     * Summary: 批量取消订阅
     */
    public DeleteUnifiedalarmSubResponse deleteUnifiedalarmSub(DeleteUnifiedalarmSubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUnifiedalarmSubEx(request, headers, runtime);
    }

    /**
     * Description: 取消订阅
     * Summary: 批量取消订阅
     */
    public DeleteUnifiedalarmSubResponse deleteUnifiedalarmSubEx(DeleteUnifiedalarmSubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUnifiedalarmSubResponse());
    }

    /**
     * Description: 查询告警订阅关系列表
     * Summary: 查询告警订阅关系列表
     */
    public QueryUnifiedalarmSubResponse queryUnifiedalarmSub(QueryUnifiedalarmSubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmSubEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警订阅关系列表
     * Summary: 查询告警订阅关系列表
     */
    public QueryUnifiedalarmSubResponse queryUnifiedalarmSubEx(QueryUnifiedalarmSubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmSubResponse());
    }

    /**
     * Description: 创建告警规则模板
     * Summary: 创建告警规则模板
     */
    public CreateUnifiedalarmTplResponse createUnifiedalarmTpl(CreateUnifiedalarmTplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnifiedalarmTplEx(request, headers, runtime);
    }

    /**
     * Description: 创建告警规则模板
     * Summary: 创建告警规则模板
     */
    public CreateUnifiedalarmTplResponse createUnifiedalarmTplEx(CreateUnifiedalarmTplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnifiedalarmTplResponse());
    }

    /**
     * Description: 更新告警规则模板
     * Summary: 更新告警规则模板
     */
    public UpdateUnifiedalarmTplResponse updateUnifiedalarmTpl(UpdateUnifiedalarmTplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUnifiedalarmTplEx(request, headers, runtime);
    }

    /**
     * Description: 更新告警规则模板
     * Summary: 更新告警规则模板
     */
    public UpdateUnifiedalarmTplResponse updateUnifiedalarmTplEx(UpdateUnifiedalarmTplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUnifiedalarmTplResponse());
    }

    /**
     * Description: 查询告警规则模板列表
     * Summary: 查询告警规则模板列表
     */
    public QueryUnifiedalarmTplResponse queryUnifiedalarmTpl(QueryUnifiedalarmTplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmTplEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警规则模板列表
     * Summary: 查询告警规则模板列表
     */
    public QueryUnifiedalarmTplResponse queryUnifiedalarmTplEx(QueryUnifiedalarmTplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmTplResponse());
    }

    /**
     * Description: 查询告警规则模板详情
     * Summary: 查询告警规则模板详情
     */
    public GetUnifiedalarmTplResponse getUnifiedalarmTpl(GetUnifiedalarmTplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnifiedalarmTplEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警规则模板详情
     * Summary: 查询告警规则模板详情
     */
    public GetUnifiedalarmTplResponse getUnifiedalarmTplEx(GetUnifiedalarmTplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnifiedalarmTplResponse());
    }

    /**
     * Description: 删除告警规则模板
     * Summary: 删除告警规则模板
     */
    public DeleteUnifiedalarmTplResponse deleteUnifiedalarmTpl(DeleteUnifiedalarmTplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUnifiedalarmTplEx(request, headers, runtime);
    }

    /**
     * Description: 删除告警规则模板
     * Summary: 删除告警规则模板
     */
    public DeleteUnifiedalarmTplResponse deleteUnifiedalarmTplEx(DeleteUnifiedalarmTplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUnifiedalarmTplResponse());
    }

    /**
     * Description: 暂停/开启告警规则
     * Summary: 暂停告警规则
     */
    public SwitchUnifiedalarmRuleResponse switchUnifiedalarmRule(SwitchUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 暂停/开启告警规则
     * Summary: 暂停告警规则
     */
    public SwitchUnifiedalarmRuleResponse switchUnifiedalarmRuleEx(SwitchUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchUnifiedalarmRuleResponse());
    }

    /**
     * Description: 根据资源类型获取告警订阅列表
     * Summary: 获取告警订阅列表
     */
    public ListAlarmSubscriptionResponse listAlarmSubscription(ListAlarmSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlarmSubscriptionEx(request, headers, runtime);
    }

    /**
     * Description: 根据资源类型获取告警订阅列表
     * Summary: 获取告警订阅列表
     */
    public ListAlarmSubscriptionResponse listAlarmSubscriptionEx(ListAlarmSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.subscription.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAlarmSubscriptionResponse());
    }

    /**
     * Description: 更新告警订阅
     * Summary: 更新告警订阅
     */
    public UpdateAlarmSubscriptionResponse updateAlarmSubscription(UpdateAlarmSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlarmSubscriptionEx(request, headers, runtime);
    }

    /**
     * Description: 更新告警订阅
     * Summary: 更新告警订阅
     */
    public UpdateAlarmSubscriptionResponse updateAlarmSubscriptionEx(UpdateAlarmSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.subscription.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAlarmSubscriptionResponse());
    }

    /**
     * Description: 查询 custom plugin 列表
     * Summary: 查询 custom plugin 列表
     */
    public ListCustompluginResponse listCustomplugin(ListCustompluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustompluginEx(request, headers, runtime);
    }

    /**
     * Description: 查询 custom plugin 列表
     * Summary: 查询 custom plugin 列表
     */
    public ListCustompluginResponse listCustompluginEx(ListCustompluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.customplugin.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCustompluginResponse());
    }

    /**
     * Description: 查询事件列表
     * Summary: 查询事件列表
     */
    public QueryUnifiedalarmEventResponse queryUnifiedalarmEvent(QueryUnifiedalarmEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmEventEx(request, headers, runtime);
    }

    /**
     * Description: 查询事件列表
     * Summary: 查询事件列表
     */
    public QueryUnifiedalarmEventResponse queryUnifiedalarmEventEx(QueryUnifiedalarmEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmEventResponse());
    }

    /**
     * Description: 告警指标查询
     * Summary: 告警指标查询
     */
    public QueryUnifiedalarmMetricsResponse queryUnifiedalarmMetrics(QueryUnifiedalarmMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmMetricsEx(request, headers, runtime);
    }

    /**
     * Description: 告警指标查询
     * Summary: 告警指标查询
     */
    public QueryUnifiedalarmMetricsResponse queryUnifiedalarmMetricsEx(QueryUnifiedalarmMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.metrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmMetricsResponse());
    }

    /**
     * Description: 批量创建告警历史
     * Summary: 批量创建告警历史
     */
    public BatchcreateUnifiedalarmHistoryResponse batchcreateUnifiedalarmHistory(BatchcreateUnifiedalarmHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateUnifiedalarmHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建告警历史
     * Summary: 批量创建告警历史
     */
    public BatchcreateUnifiedalarmHistoryResponse batchcreateUnifiedalarmHistoryEx(BatchcreateUnifiedalarmHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.history.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateUnifiedalarmHistoryResponse());
    }

    /**
     * Description: 根据模板批量创建规则
     * Summary: 根据模板批量创建规则
     */
    public BatchcreateUnifiedalarmRuleResponse batchcreateUnifiedalarmRule(BatchcreateUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 根据模板批量创建规则
     * Summary: 根据模板批量创建规则
     */
    public BatchcreateUnifiedalarmRuleResponse batchcreateUnifiedalarmRuleEx(BatchcreateUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateUnifiedalarmRuleResponse());
    }

    /**
     * Description: 告警事件统计信息
     * Summary: 告警事件统计信息
     */
    public QueryUnifiedalarmEventstatResponse queryUnifiedalarmEventstat(QueryUnifiedalarmEventstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmEventstatEx(request, headers, runtime);
    }

    /**
     * Description: 告警事件统计信息
     * Summary: 告警事件统计信息
     */
    public QueryUnifiedalarmEventstatResponse queryUnifiedalarmEventstatEx(QueryUnifiedalarmEventstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.eventstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmEventstatResponse());
    }

    /**
     * Description: 通知历史统计
     * Summary: 通知历史统计
     */
    public QueryUnifiedalarmNotifystatResponse queryUnifiedalarmNotifystat(QueryUnifiedalarmNotifystatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmNotifystatEx(request, headers, runtime);
    }

    /**
     * Description: 通知历史统计
     * Summary: 通知历史统计
     */
    public QueryUnifiedalarmNotifystatResponse queryUnifiedalarmNotifystatEx(QueryUnifiedalarmNotifystatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.notifystat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmNotifystatResponse());
    }

    /**
     * Description: 查询主机ip列表
     * Summary: 查询主机ip列表
     */
    public QueryMetaNodeResponse queryMetaNode(QueryMetaNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetaNodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询主机ip列表
     * Summary: 查询主机ip列表
     */
    public QueryMetaNodeResponse queryMetaNodeEx(QueryMetaNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.meta.node.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetaNodeResponse());
    }

    /**
     * Description: 批量删除告警规则
     * Summary: 批量删除告警规则
     */
    public BatchdeleteUnifiedalarmRuleResponse batchdeleteUnifiedalarmRule(BatchdeleteUnifiedalarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteUnifiedalarmRuleEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除告警规则
     * Summary: 批量删除告警规则
     */
    public BatchdeleteUnifiedalarmRuleResponse batchdeleteUnifiedalarmRuleEx(BatchdeleteUnifiedalarmRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteUnifiedalarmRuleResponse());
    }

    /**
     * Description: dashboard创建
     * Summary: dashboard创建
     */
    public CreateXdashboardResponse createXdashboard(CreateXdashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createXdashboardEx(request, headers, runtime);
    }

    /**
     * Description: dashboard创建
     * Summary: dashboard创建
     */
    public CreateXdashboardResponse createXdashboardEx(CreateXdashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateXdashboardResponse());
    }

    /**
     * Description: dashboard更新
     * Summary: dashboard更新
     */
    public UpdateXdashboardResponse updateXdashboard(UpdateXdashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXdashboardEx(request, headers, runtime);
    }

    /**
     * Description: dashboard更新
     * Summary: dashboard更新
     */
    public UpdateXdashboardResponse updateXdashboardEx(UpdateXdashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateXdashboardResponse());
    }

    /**
     * Description: dashboard查询
     * Summary: dashboard查询
     */
    public QueryXdashboardResponse queryXdashboard(QueryXdashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdashboardEx(request, headers, runtime);
    }

    /**
     * Description: dashboard查询
     * Summary: dashboard查询
     */
    public QueryXdashboardResponse queryXdashboardEx(QueryXdashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdashboardResponse());
    }

    /**
     * Description: dashboard目录列表
     * Summary: dashboard目录列表
     */
    public ListXdashboardDirectoryResponse listXdashboardDirectory(ListXdashboardDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listXdashboardDirectoryEx(request, headers, runtime);
    }

    /**
     * Description: dashboard目录列表
     * Summary: dashboard目录列表
     */
    public ListXdashboardDirectoryResponse listXdashboardDirectoryEx(ListXdashboardDirectoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.directory.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListXdashboardDirectoryResponse());
    }

    /**
     * Description: dashboard删除。
    单个dashboard删除或者整个目录删除
     * Summary: dashboard删除
     */
    public DeleteXdashboardResponse deleteXdashboard(DeleteXdashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteXdashboardEx(request, headers, runtime);
    }

    /**
     * Description: dashboard删除。
    单个dashboard删除或者整个目录删除
     * Summary: dashboard删除
     */
    public DeleteXdashboardResponse deleteXdashboardEx(DeleteXdashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteXdashboardResponse());
    }

    /**
     * Description: instant query
     * Summary: instant query
     */
    public QueryXmetricInstantResponse queryXmetricInstant(QueryXmetricInstantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricInstantEx(request, headers, runtime);
    }

    /**
     * Description: instant query
     * Summary: instant query
     */
    public QueryXmetricInstantResponse queryXmetricInstantEx(QueryXmetricInstantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetric.instant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricInstantResponse());
    }

    /**
     * Description: range query
     * Summary: range query
     */
    public QueryXmetricRangeResponse queryXmetricRange(QueryXmetricRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricRangeEx(request, headers, runtime);
    }

    /**
     * Description: range query
     * Summary: range query
     */
    public QueryXmetricRangeResponse queryXmetricRangeEx(QueryXmetricRangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetric.range.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricRangeResponse());
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric
     */
    public QueryXmetricdatasourceInstantResponse queryXmetricdatasourceInstant(QueryXmetricdatasourceInstantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricdatasourceInstantEx(request, headers, runtime);
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric
     */
    public QueryXmetricdatasourceInstantResponse queryXmetricdatasourceInstantEx(QueryXmetricdatasourceInstantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetricdatasource.instant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricdatasourceInstantResponse());
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric
     */
    public QueryXmetricdatasourceRangeResponse queryXmetricdatasourceRange(QueryXmetricdatasourceRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricdatasourceRangeEx(request, headers, runtime);
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric
     */
    public QueryXmetricdatasourceRangeResponse queryXmetricdatasourceRangeEx(QueryXmetricdatasourceRangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetricdatasource.range.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricdatasourceRangeResponse());
    }

    /**
     * Description: metric tag keys
     * Summary: metric tag keys
     */
    public QueryXmetrictagKeyResponse queryXmetrictagKey(QueryXmetrictagKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetrictagKeyEx(request, headers, runtime);
    }

    /**
     * Description: metric tag keys
     * Summary: metric tag keys
     */
    public QueryXmetrictagKeyResponse queryXmetrictagKeyEx(QueryXmetrictagKeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetrictag.key.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetrictagKeyResponse());
    }

    /**
     * Description: metric tag values
     * Summary: metric tag values
     */
    public QueryXmetrictagValueResponse queryXmetrictagValue(QueryXmetrictagValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetrictagValueEx(request, headers, runtime);
    }

    /**
     * Description: metric tag values
     * Summary: metric tag values
     */
    public QueryXmetrictagValueResponse queryXmetrictagValueEx(QueryXmetrictagValueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetrictag.value.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetrictagValueResponse());
    }

    /**
     * Description: 日志脱敏类型列表查询
     * Summary: 日志脱敏类型列表查询
     */
    public ListLogserviceDesenstypesResponse listLogserviceDesenstypes(ListLogserviceDesenstypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogserviceDesenstypesEx(request, headers, runtime);
    }

    /**
     * Description: 日志脱敏类型列表查询
     * Summary: 日志脱敏类型列表查询
     */
    public ListLogserviceDesenstypesResponse listLogserviceDesenstypesEx(ListLogserviceDesenstypesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.logservice.desenstypes.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLogserviceDesenstypesResponse());
    }

    /**
     * Description: 日志脱敏配置查询
     * Summary: 日志脱敏配置查询
     */
    public GetLogserviceDesensconfigResponse getLogserviceDesensconfig(GetLogserviceDesensconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogserviceDesensconfigEx(request, headers, runtime);
    }

    /**
     * Description: 日志脱敏配置查询
     * Summary: 日志脱敏配置查询
     */
    public GetLogserviceDesensconfigResponse getLogserviceDesensconfigEx(GetLogserviceDesensconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.logservice.desensconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLogserviceDesensconfigResponse());
    }

    /**
     * Description: 日志脱敏配置更新
     * Summary: 日志脱敏配置更新
     */
    public UpdateLogserviceDesensconfigResponse updateLogserviceDesensconfig(UpdateLogserviceDesensconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogserviceDesensconfigEx(request, headers, runtime);
    }

    /**
     * Description: 日志脱敏配置更新
     * Summary: 日志脱敏配置更新
     */
    public UpdateLogserviceDesensconfigResponse updateLogserviceDesensconfigEx(UpdateLogserviceDesensconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.logservice.desensconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLogserviceDesensconfigResponse());
    }

    /**
     * Description: 获取登录用户信息
     * Summary: 获取登录用户信息
     */
    public DetailUserResponse detailUser(DetailUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailUserEx(request, headers, runtime);
    }

    /**
     * Description: 获取登录用户信息
     * Summary: 获取登录用户信息
     */
    public DetailUserResponse detailUserEx(DetailUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailUserResponse());
    }

    /**
     * Description: 通过登录名获取鉴权
     * Summary: 通过登录名获取鉴权
     */
    public AuthUserResponse authUser(AuthUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authUserEx(request, headers, runtime);
    }

    /**
     * Description: 通过登录名获取鉴权
     * Summary: 通过登录名获取鉴权
     */
    public AuthUserResponse authUserEx(AuthUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.user.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthUserResponse());
    }

    /**
     * Description: 获取持久化日志路径级别的监控数据
     * Summary: 持久化日志监控
     */
    public QueryLogpathMetricsResponse queryLogpathMetrics(QueryLogpathMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLogpathMetricsEx(request, headers, runtime);
    }

    /**
     * Description: 获取持久化日志路径级别的监控数据
     * Summary: 持久化日志监控
     */
    public QueryLogpathMetricsResponse queryLogpathMetricsEx(QueryLogpathMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.logpath.metrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLogpathMetricsResponse());
    }

    /**
     * Description: query metric names
     * Summary: query metric names
     */
    public QueryXmetricNameResponse queryXmetricName(QueryXmetricNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricNameEx(request, headers, runtime);
    }

    /**
     * Description: query metric names
     * Summary: query metric names
     */
    public QueryXmetricNameResponse queryXmetricNameEx(QueryXmetricNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetric.name.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricNameResponse());
    }

    /**
     * Description: 创建alarmwebhook
     * Summary: 创建alarmwebhook
     */
    public CreateAlarmwebhookResponse createAlarmwebhook(CreateAlarmwebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlarmwebhookEx(request, headers, runtime);
    }

    /**
     * Description: 创建alarmwebhook
     * Summary: 创建alarmwebhook
     */
    public CreateAlarmwebhookResponse createAlarmwebhookEx(CreateAlarmwebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarmwebhook.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAlarmwebhookResponse());
    }

    /**
     * Description: datasource 创建
     * Summary: datasource 创建
     */
    public CreateXdatasourceResponse createXdatasource(CreateXdatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createXdatasourceEx(request, headers, runtime);
    }

    /**
     * Description: datasource 创建
     * Summary: datasource 创建
     */
    public CreateXdatasourceResponse createXdatasourceEx(CreateXdatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateXdatasourceResponse());
    }

    /**
     * Description:  
     * Summary: datasource update
     */
    public UpdateXdatasourceResponse updateXdatasource(UpdateXdatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXdatasourceEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: datasource update
     */
    public UpdateXdatasourceResponse updateXdatasourceEx(UpdateXdatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateXdatasourceResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public GetXdatasourceResponse getXdatasource(GetXdatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getXdatasourceEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public GetXdatasourceResponse getXdatasourceEx(GetXdatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetXdatasourceResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public DeleteXdatasourceResponse deleteXdatasource(DeleteXdatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteXdatasourceEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public DeleteXdatasourceResponse deleteXdatasourceEx(DeleteXdatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteXdatasourceResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public ListXdatasourceDirectoryResponse listXdatasourceDirectory(ListXdatasourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listXdatasourceDirectoryEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public ListXdatasourceDirectoryResponse listXdatasourceDirectoryEx(ListXdatasourceDirectoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.directory.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListXdatasourceDirectoryResponse());
    }

    /**
     * Description: 更新alarmwebhook
     * Summary: 更新alarmwebhook
     */
    public UpdateAlarmwebhookResponse updateAlarmwebhook(UpdateAlarmwebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlarmwebhookEx(request, headers, runtime);
    }

    /**
     * Description: 更新alarmwebhook
     * Summary: 更新alarmwebhook
     */
    public UpdateAlarmwebhookResponse updateAlarmwebhookEx(UpdateAlarmwebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarmwebhook.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAlarmwebhookResponse());
    }

    /**
     * Description: 删除alarmwebhook
     * Summary: 删除alarmwebhook
     */
    public DeleteAlarmwebhookResponse deleteAlarmwebhook(DeleteAlarmwebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlarmwebhookEx(request, headers, runtime);
    }

    /**
     * Description: 删除alarmwebhook
     * Summary: 删除alarmwebhook
     */
    public DeleteAlarmwebhookResponse deleteAlarmwebhookEx(DeleteAlarmwebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarmwebhook.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAlarmwebhookResponse());
    }

    /**
     * Description: datasource table
     * Summary: datasource table
     */
    public QueryXdatasourceTableResponse queryXdatasourceTable(QueryXdatasourceTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdatasourceTableEx(request, headers, runtime);
    }

    /**
     * Description: datasource table
     * Summary: datasource table
     */
    public QueryXdatasourceTableResponse queryXdatasourceTableEx(QueryXdatasourceTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.table.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdatasourceTableResponse());
    }

    /**
     * Description: 告警总览
     * Summary: 告警总览
     */
    public GetAlarmOverviewResponse getAlarmOverview(GetAlarmOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlarmOverviewEx(request, headers, runtime);
    }

    /**
     * Description: 告警总览
     * Summary: 告警总览
     */
    public GetAlarmOverviewResponse getAlarmOverviewEx(GetAlarmOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.overview.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAlarmOverviewResponse());
    }

    /**
     * Description: 查询应用的告警数据
     * Summary: 查询应用的告警数据
     */
    public QueryAppAlarmstatsResponse queryAppAlarmstats(QueryAppAlarmstatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppAlarmstatsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的告警数据
     * Summary: 查询应用的告警数据
     */
    public QueryAppAlarmstatsResponse queryAppAlarmstatsEx(QueryAppAlarmstatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.alarmstats.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppAlarmstatsResponse());
    }

    /**
     * Description: 告警趋势
     * Summary: 告警趋势
     */
    public QueryAlarmhistoryAlarmtrendsResponse queryAlarmhistoryAlarmtrends(QueryAlarmhistoryAlarmtrendsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmhistoryAlarmtrendsEx(request, headers, runtime);
    }

    /**
     * Description: 告警趋势
     * Summary: 告警趋势
     */
    public QueryAlarmhistoryAlarmtrendsResponse queryAlarmhistoryAlarmtrendsEx(QueryAlarmhistoryAlarmtrendsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarmhistory.alarmtrends.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmhistoryAlarmtrendsResponse());
    }

    /**
     * Description: 获取workspace的配置
     * Summary: 获取workspace的配置
     */
    public GetWorkspaceConfigResponse getWorkspaceConfig(GetWorkspaceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceConfigEx(request, headers, runtime);
    }

    /**
     * Description: 获取workspace的配置
     * Summary: 获取workspace的配置
     */
    public GetWorkspaceConfigResponse getWorkspaceConfigEx(GetWorkspaceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.workspace.config.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspaceConfigResponse());
    }

    /**
     * Description: Agent版本策略配置
     * Summary: Agent版本策略配置
     */
    public SetAgentVersionstrategyResponse setAgentVersionstrategy(SetAgentVersionstrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setAgentVersionstrategyEx(request, headers, runtime);
    }

    /**
     * Description: Agent版本策略配置
     * Summary: Agent版本策略配置
     */
    public SetAgentVersionstrategyResponse setAgentVersionstrategyEx(SetAgentVersionstrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.versionstrategy.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetAgentVersionstrategyResponse());
    }

    /**
     * Description: 获取agent版本策略详情
     * Summary: 获取agent版本策略详情
     */
    public GetAgentVersionstrategyResponse getAgentVersionstrategy(GetAgentVersionstrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentVersionstrategyEx(request, headers, runtime);
    }

    /**
     * Description: 获取agent版本策略详情
     * Summary: 获取agent版本策略详情
     */
    public GetAgentVersionstrategyResponse getAgentVersionstrategyEx(GetAgentVersionstrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.versionstrategy.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAgentVersionstrategyResponse());
    }

    /**
     * Description: 获取服务器系统时间
     * Summary: 获取服务器系统时间
     */
    public GetSystemTimeResponse getSystemTime(GetSystemTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSystemTimeEx(request, headers, runtime);
    }

    /**
     * Description: 获取服务器系统时间
     * Summary: 获取服务器系统时间
     */
    public GetSystemTimeResponse getSystemTimeEx(GetSystemTimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.system.time.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSystemTimeResponse());
    }

    /**
     * Description: move datasource
     * Summary: move datasource
     */
    public ExecXdatasourceMoveResponse execXdatasourceMove(ExecXdatasourceMoveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execXdatasourceMoveEx(request, headers, runtime);
    }

    /**
     * Description: move datasource
     * Summary: move datasource
     */
    public ExecXdatasourceMoveResponse execXdatasourceMoveEx(ExecXdatasourceMoveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.move.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecXdatasourceMoveResponse());
    }

    /**
     * Description: metadata default tags
     * Summary: default tags
     */
    public QueryXmetadataTagResponse queryXmetadataTag(QueryXmetadataTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetadataTagEx(request, headers, runtime);
    }

    /**
     * Description: metadata default tags
     * Summary: default tags
     */
    public QueryXmetadataTagResponse queryXmetadataTagEx(QueryXmetadataTagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetadata.tag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetadataTagResponse());
    }

    /**
     * Description: search datasource
     * Summary: search datasource
     */
    public QueryXdatasourceSearchResponse queryXdatasourceSearch(QueryXdatasourceSearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdatasourceSearchEx(request, headers, runtime);
    }

    /**
     * Description: search datasource
     * Summary: search datasource
     */
    public QueryXdatasourceSearchResponse queryXdatasourceSearchEx(QueryXdatasourceSearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.search.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdatasourceSearchResponse());
    }

    /**
     * Description:  
     * Summary: query setup config
     */
    public QuerySetupConfigResponse querySetupConfig(QuerySetupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySetupConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: query setup config
     */
    public QuerySetupConfigResponse querySetupConfigEx(QuerySetupConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.setup.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySetupConfigResponse());
    }

    /**
     * Description:  
     * Summary: update or insert 
     */
    public UpdateSetupConfigResponse updateSetupConfig(UpdateSetupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSetupConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: update or insert 
     */
    public UpdateSetupConfigResponse updateSetupConfigEx(UpdateSetupConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.setup.config.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSetupConfigResponse());
    }

    /**
     * Description:  
     * Summary: delete config
     */
    public DeleteSetupConfigResponse deleteSetupConfig(DeleteSetupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSetupConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: delete config
     */
    public DeleteSetupConfigResponse deleteSetupConfigEx(DeleteSetupConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.setup.config.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSetupConfigResponse());
    }

    /**
     * Description: 告警开关配置更新
     * Summary: 告警开关配置更新
     */
    public UpdateWorkspaceSettingResponse updateWorkspaceSetting(UpdateWorkspaceSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceSettingEx(request, headers, runtime);
    }

    /**
     * Description: 告警开关配置更新
     * Summary: 告警开关配置更新
     */
    public UpdateWorkspaceSettingResponse updateWorkspaceSettingEx(UpdateWorkspaceSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.workspace.setting.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWorkspaceSettingResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public ExportXsiteConfigResponse exportXsiteConfig(ExportXsiteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportXsiteConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public ExportXsiteConfigResponse exportXsiteConfigEx(ExportXsiteConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xsite.config.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportXsiteConfigResponse());
    }

    /**
     * Description:  
     * Summary: import
     */
    public ImportXsiteConfigResponse importXsiteConfig(ImportXsiteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importXsiteConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: import
     */
    public ImportXsiteConfigResponse importXsiteConfigEx(ImportXsiteConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xsite.config.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportXsiteConfigResponse());
    }

    /**
     * Description:  
     * Summary: tree
     */
    public QueryXdatasourceTreeResponse queryXdatasourceTree(QueryXdatasourceTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdatasourceTreeEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: tree
     */
    public QueryXdatasourceTreeResponse queryXdatasourceTreeEx(QueryXdatasourceTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.tree.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdatasourceTreeResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public QueryXdashboardTreeResponse queryXdashboardTree(QueryXdashboardTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdashboardTreeEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public QueryXdashboardTreeResponse queryXdashboardTreeEx(QueryXdashboardTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.tree.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdashboardTreeResponse());
    }

    /**
     * Description:  
     * Summary: dashboard查询
     */
    public GetXdashboardResponse getXdashboard(GetXdashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getXdashboardEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: dashboard查询
     */
    public GetXdashboardResponse getXdashboardEx(GetXdashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdashboard.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetXdashboardResponse());
    }

    /**
     * Description:  
     * Summary: prometheus metrics
     */
    public QueryXdatasourcePrometheusResponse queryXdatasourcePrometheus(QueryXdatasourcePrometheusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXdatasourcePrometheusEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: prometheus metrics
     */
    public QueryXdatasourcePrometheusResponse queryXdatasourcePrometheusEx(QueryXdatasourcePrometheusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xdatasource.prometheus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXdatasourcePrometheusResponse());
    }

    /**
     * Description:  获取总览页主机统计信息
     * Summary:  获取总览页主机统计信息
     */
    public GetNodeOverviewResponse getNodeOverview(GetNodeOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeOverviewEx(request, headers, runtime);
    }

    /**
     * Description:  获取总览页主机统计信息
     * Summary:  获取总览页主机统计信息
     */
    public GetNodeOverviewResponse getNodeOverviewEx(GetNodeOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.node.overview.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNodeOverviewResponse());
    }

    /**
     * Description: 总览页配置信息统计
     * Summary: 总览页配置信息统计
     */
    public GetConfigOverviewResponse getConfigOverview(GetConfigOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigOverviewEx(request, headers, runtime);
    }

    /**
     * Description: 总览页配置信息统计
     * Summary: 总览页配置信息统计
     */
    public GetConfigOverviewResponse getConfigOverviewEx(GetConfigOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.config.overview.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigOverviewResponse());
    }

    /**
     * Description: 获取workspace具体配置
     * Summary: 获取workspace具体配置
     */
    public GetWorkspaceSettingResponse getWorkspaceSetting(GetWorkspaceSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceSettingEx(request, headers, runtime);
    }

    /**
     * Description: 获取workspace具体配置
     * Summary: 获取workspace具体配置
     */
    public GetWorkspaceSettingResponse getWorkspaceSettingEx(GetWorkspaceSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.workspace.setting.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspaceSettingResponse());
    }

    /**
     * Description: 获取链路工作空间配置
     * Summary: 获取链路工作空间配置
     */
    public ListTraceWorkspacesettingResponse listTraceWorkspacesetting(ListTraceWorkspacesettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTraceWorkspacesettingEx(request, headers, runtime);
    }

    /**
     * Description: 获取链路工作空间配置
     * Summary: 获取链路工作空间配置
     */
    public ListTraceWorkspacesettingResponse listTraceWorkspacesettingEx(ListTraceWorkspacesettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTraceWorkspacesettingResponse());
    }

    /**
     * Description: 链路工作空间配置更新
     * Summary: 链路工作空间配置更新
     */
    public UpdateTraceWorkspacesettingResponse updateTraceWorkspacesetting(UpdateTraceWorkspacesettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraceWorkspacesettingEx(request, headers, runtime);
    }

    /**
     * Description: 链路工作空间配置更新
     * Summary: 链路工作空间配置更新
     */
    public UpdateTraceWorkspacesettingResponse updateTraceWorkspacesettingEx(UpdateTraceWorkspacesettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraceWorkspacesettingResponse());
    }

    /**
     * Description: APP配置列表
     * Summary: APP配置列表
     */
    public ListAppSettingResponse listAppSetting(ListAppSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppSettingEx(request, headers, runtime);
    }

    /**
     * Description: APP配置列表
     * Summary: APP配置列表
     */
    public ListAppSettingResponse listAppSettingEx(ListAppSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.setting.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppSettingResponse());
    }

    /**
     * Description: 创建APP配置信息
     * Summary: 创建APP配置信息
     */
    public UpdateAppSettingResponse updateAppSetting(UpdateAppSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppSettingEx(request, headers, runtime);
    }

    /**
     * Description: 创建APP配置信息
     * Summary: 创建APP配置信息
     */
    public UpdateAppSettingResponse updateAppSettingEx(UpdateAppSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.setting.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppSettingResponse());
    }

    /**
     * Description: 获取APP配置信息
     * Summary: 获取APP配置信息
     */
    public GetAppSettingResponse getAppSetting(GetAppSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppSettingEx(request, headers, runtime);
    }

    /**
     * Description: 获取APP配置信息
     * Summary: 获取APP配置信息
     */
    public GetAppSettingResponse getAppSettingEx(GetAppSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.setting.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppSettingResponse());
    }

    /**
     * Description: 查询某一告警事件相关的告警列表
     * Summary: 查询某一告警事件相关的告警列表
     */
    public QueryUnifiedalarmEventdetailResponse queryUnifiedalarmEventdetail(QueryUnifiedalarmEventdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmEventdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询某一告警事件相关的告警列表
     * Summary: 查询某一告警事件相关的告警列表
     */
    public QueryUnifiedalarmEventdetailResponse queryUnifiedalarmEventdetailEx(QueryUnifiedalarmEventdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.eventdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmEventdetailResponse());
    }

    /**
     * Description: 查询应用的告警指标清单
     * Summary: 查询应用的告警指标清单
     */
    public QueryUnifiedalarmMonitorlistResponse queryUnifiedalarmMonitorlist(QueryUnifiedalarmMonitorlistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmMonitorlistEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的告警指标清单
     * Summary: 查询应用的告警指标清单
     */
    public QueryUnifiedalarmMonitorlistResponse queryUnifiedalarmMonitorlistEx(QueryUnifiedalarmMonitorlistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.monitorlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmMonitorlistResponse());
    }

    /**
     * Description:  
     * Summary:  
     */
    public QueryXmetricTableResponse queryXmetricTable(QueryXmetricTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXmetricTableEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary:  
     */
    public QueryXmetricTableResponse queryXmetricTableEx(QueryXmetricTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.xmetric.table.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXmetricTableResponse());
    }

    /**
     * Description: 查询应用的SQL调用指标
     * Summary: 查询应用的SQL调用指标
     */
    public QueryTraceAppsqlmetricsResponse queryTraceAppsqlmetrics(QueryTraceAppsqlmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppsqlmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的SQL调用指标
     * Summary: 查询应用的SQL调用指标
     */
    public QueryTraceAppsqlmetricsResponse queryTraceAppsqlmetricsEx(QueryTraceAppsqlmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appsqlmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppsqlmetricsResponse());
    }

    /**
     * Description: 查询应用的SQL请求调用明细
     * Summary: 查询应用的SQL请求调用明细
     */
    public QueryTraceAppsqlstatResponse queryTraceAppsqlstat(QueryTraceAppsqlstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppsqlstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的SQL请求调用明细
     * Summary: 查询应用的SQL请求调用明细
     */
    public QueryTraceAppsqlstatResponse queryTraceAppsqlstatEx(QueryTraceAppsqlstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appsqlstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppsqlstatResponse());
    }

    /**
     * Description: 查询应用的NoSQL调用指标
     * Summary: 查询应用的NoSQL调用指标
     */
    public QueryTraceAppnosqlmetricsResponse queryTraceAppnosqlmetrics(QueryTraceAppnosqlmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppnosqlmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的NoSQL调用指标
     * Summary: 查询应用的NoSQL调用指标
     */
    public QueryTraceAppnosqlmetricsResponse queryTraceAppnosqlmetricsEx(QueryTraceAppnosqlmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appnosqlmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppnosqlmetricsResponse());
    }

    /**
     * Description: 查询应用的MQ消费调用指标
     * Summary: 查询应用的MQ消费调用指标
     */
    public QueryTraceAppmqconsumemetricsResponse queryTraceAppmqconsumemetrics(QueryTraceAppmqconsumemetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppmqconsumemetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的MQ消费调用指标
     * Summary: 查询应用的MQ消费调用指标
     */
    public QueryTraceAppmqconsumemetricsResponse queryTraceAppmqconsumemetricsEx(QueryTraceAppmqconsumemetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appmqconsumemetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppmqconsumemetricsResponse());
    }

    /**
     * Description: 查询应用的RPC客户端调用指标
     * Summary: 查询应用的RPC客户端调用指标
     */
    public QueryTraceApprpcclientmetricsResponse queryTraceApprpcclientmetrics(QueryTraceApprpcclientmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApprpcclientmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的RPC客户端调用指标
     * Summary: 查询应用的RPC客户端调用指标
     */
    public QueryTraceApprpcclientmetricsResponse queryTraceApprpcclientmetricsEx(QueryTraceApprpcclientmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apprpcclientmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApprpcclientmetricsResponse());
    }

    /**
     * Description: 查询应用的RPC服务端指标
     * Summary:  查询应用的RPC服务端指标
     */
    public QueryTraceApprpcservermetricsResponse queryTraceApprpcservermetrics(QueryTraceApprpcservermetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApprpcservermetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的RPC服务端指标
     * Summary:  查询应用的RPC服务端指标
     */
    public QueryTraceApprpcservermetricsResponse queryTraceApprpcservermetricsEx(QueryTraceApprpcservermetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apprpcservermetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApprpcservermetricsResponse());
    }

    /**
     * Description: 查询应用的HTTP客户端调用指标
     * Summary: 查询应用的HTTP客户端调用指标
     */
    public QueryTraceApphttpclientmetricsResponse queryTraceApphttpclientmetrics(QueryTraceApphttpclientmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApphttpclientmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的HTTP客户端调用指标
     * Summary: 查询应用的HTTP客户端调用指标
     */
    public QueryTraceApphttpclientmetricsResponse queryTraceApphttpclientmetricsEx(QueryTraceApphttpclientmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apphttpclientmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApphttpclientmetricsResponse());
    }

    /**
     * Description: 查询应用的HTTP服务端指标
     * Summary: 查询应用的HTTP服务端指标
     */
    public QueryTraceApphttpservermetricsResponse queryTraceApphttpservermetrics(QueryTraceApphttpservermetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApphttpservermetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端指标
     * Summary: 查询应用的HTTP服务端指标
     */
    public QueryTraceApphttpservermetricsResponse queryTraceApphttpservermetricsEx(QueryTraceApphttpservermetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apphttpservermetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApphttpservermetricsResponse());
    }

    /**
     * Description: 查询应用的NoSQL请求调用明细
     * Summary: 查询应用的NoSQL请求调用明细
     */
    public QueryTraceAppnosqlstatResponse queryTraceAppnosqlstat(QueryTraceAppnosqlstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppnosqlstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的NoSQL请求调用明细
     * Summary: 查询应用的NoSQL请求调用明细
     */
    public QueryTraceAppnosqlstatResponse queryTraceAppnosqlstatEx(QueryTraceAppnosqlstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appnosqlstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppnosqlstatResponse());
    }

    /**
     * Description: 查询应用的MQ消费调用明细
     * Summary: 查询应用的MQ消费调用明细
     */
    public QueryTraceAppmqconsumestatResponse queryTraceAppmqconsumestat(QueryTraceAppmqconsumestatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppmqconsumestatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的MQ消费调用明细
     * Summary: 查询应用的MQ消费调用明细
     */
    public QueryTraceAppmqconsumestatResponse queryTraceAppmqconsumestatEx(QueryTraceAppmqconsumestatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appmqconsumestat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppmqconsumestatResponse());
    }

    /**
     * Description: 查询应用的HTTP客户端请求调用明细
     * Summary: 查询应用的HTTP客户端请求调用明细
     */
    public QueryTraceApphttpclientstatResponse queryTraceApphttpclientstat(QueryTraceApphttpclientstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApphttpclientstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的HTTP客户端请求调用明细
     * Summary: 查询应用的HTTP客户端请求调用明细
     */
    public QueryTraceApphttpclientstatResponse queryTraceApphttpclientstatEx(QueryTraceApphttpclientstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apphttpclientstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApphttpclientstatResponse());
    }

    /**
     * Description: 查询应用的HTTP服务端调用明细
     * Summary: 查询应用的HTTP服务端调用明细
     */
    public QueryTraceApphttpserverstatResponse queryTraceApphttpserverstat(QueryTraceApphttpserverstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApphttpserverstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端调用明细
     * Summary: 查询应用的HTTP服务端调用明细
     */
    public QueryTraceApphttpserverstatResponse queryTraceApphttpserverstatEx(QueryTraceApphttpserverstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apphttpserverstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApphttpserverstatResponse());
    }

    /**
     * Description: 查询应用的RPC客户端请求调用明细
     * Summary: 查询应用的RPC客户端请求调用明细
     */
    public QueryTraceApprpcclientstatResponse queryTraceApprpcclientstat(QueryTraceApprpcclientstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApprpcclientstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的RPC客户端请求调用明细
     * Summary: 查询应用的RPC客户端请求调用明细
     */
    public QueryTraceApprpcclientstatResponse queryTraceApprpcclientstatEx(QueryTraceApprpcclientstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apprpcclientstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApprpcclientstatResponse());
    }

    /**
     * Description: 查询应用的RPC服务端调用明细
     * Summary: 查询应用的RPC服务端调用明细
     */
    public QueryTraceApprpcserverstatResponse queryTraceApprpcserverstat(QueryTraceApprpcserverstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApprpcserverstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的RPC服务端调用明细
     * Summary: 查询应用的RPC服务端调用明细
     */
    public QueryTraceApprpcserverstatResponse queryTraceApprpcserverstatEx(QueryTraceApprpcserverstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apprpcserverstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApprpcserverstatResponse());
    }

    /**
     * Description: 获取链路单工作空间配置
     * Summary: 获取链路单工作空间配置
     */
    public GetTraceWorkspacesettingResponse getTraceWorkspacesetting(GetTraceWorkspacesettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraceWorkspacesettingEx(request, headers, runtime);
    }

    /**
     * Description: 获取链路单工作空间配置
     * Summary: 获取链路单工作空间配置
     */
    public GetTraceWorkspacesettingResponse getTraceWorkspacesettingEx(GetTraceWorkspacesettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraceWorkspacesettingResponse());
    }

    /**
     * Description: 查询应用的MQ生产调用指标
     * Summary: 查询应用的MQ生产调用指标
     */
    public QueryTraceAppmqproducemetricsResponse queryTraceAppmqproducemetrics(QueryTraceAppmqproducemetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppmqproducemetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的MQ生产调用指标
     * Summary: 查询应用的MQ生产调用指标
     */
    public QueryTraceAppmqproducemetricsResponse queryTraceAppmqproducemetricsEx(QueryTraceAppmqproducemetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appmqproducemetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppmqproducemetricsResponse());
    }

    /**
     * Description: 查询应用的MQ生产调用明细
     * Summary: 查询应用的MQ生产调用明细
     */
    public QueryTraceAppmqproducestatResponse queryTraceAppmqproducestat(QueryTraceAppmqproducestatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppmqproducestatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的MQ生产调用明细
     * Summary: 查询应用的MQ生产调用明细
     */
    public QueryTraceAppmqproducestatResponse queryTraceAppmqproducestatEx(QueryTraceAppmqproducestatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appmqproducestat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppmqproducestatResponse());
    }

    /**
     * Description: 计量计费是否开启
     * Summary: 计量计费是否开启
     */
    public GetMeasurementStatusResponse getMeasurementStatus(GetMeasurementStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMeasurementStatusEx(request, headers, runtime);
    }

    /**
     * Description: 计量计费是否开启
     * Summary: 计量计费是否开启
     */
    public GetMeasurementStatusResponse getMeasurementStatusEx(GetMeasurementStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.measurement.status.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMeasurementStatusResponse());
    }

    /**
     * Description: 日志查询页面获取应用列表
     * Summary: 获取应用列表
     */
    public QueryLogserviceAppsResponse queryLogserviceApps(QueryLogserviceAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLogserviceAppsEx(request, headers, runtime);
    }

    /**
     * Description: 日志查询页面获取应用列表
     * Summary: 获取应用列表
     */
    public QueryLogserviceAppsResponse queryLogserviceAppsEx(QueryLogserviceAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.logservice.apps.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLogserviceAppsResponse());
    }

    /**
     * Description: 查询应用的HTTP服务端状态指标
     * Summary: 查询应用的HTTP服务端状态指标
     */
    public QueryTraceApphttpserverstatusmetricsResponse queryTraceApphttpserverstatusmetrics(QueryTraceApphttpserverstatusmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceApphttpserverstatusmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端状态指标
     * Summary: 查询应用的HTTP服务端状态指标
     */
    public QueryTraceApphttpserverstatusmetricsResponse queryTraceApphttpserverstatusmetricsEx(QueryTraceApphttpserverstatusmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.apphttpserverstatusmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceApphttpserverstatusmetricsResponse());
    }

    /**
     * Description: 查询应用的告警指标，或应用已经配置。
     * Summary: 查询应用的告警指标清单
     */
    public QueryAppAlarmrulesResponse queryAppAlarmrules(QueryAppAlarmrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppAlarmrulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的告警指标，或应用已经配置。
     * Summary: 查询应用的告警指标清单
     */
    public QueryAppAlarmrulesResponse queryAppAlarmrulesEx(QueryAppAlarmrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.alarmrules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppAlarmrulesResponse());
    }

    /**
     * Description: 查询链路紧凑详情
     * Summary: 查询链路紧凑详情
     */
    public QueryTraceCompactdetailResponse queryTraceCompactdetail(QueryTraceCompactdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceCompactdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询链路紧凑详情
     * Summary: 查询链路紧凑详情
     */
    public QueryTraceCompactdetailResponse queryTraceCompactdetailEx(QueryTraceCompactdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.compactdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceCompactdetailResponse());
    }

    /**
     * Description: 查询应用的异常调用指标
     * Summary: 查询应用的异常调用指标
     */
    public QueryTraceAppexceptionmetricsResponse queryTraceAppexceptionmetrics(QueryTraceAppexceptionmetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppexceptionmetricsEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的异常调用指标
     * Summary: 查询应用的异常调用指标
     */
    public QueryTraceAppexceptionmetricsResponse queryTraceAppexceptionmetricsEx(QueryTraceAppexceptionmetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appexceptionmetrics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppexceptionmetricsResponse());
    }

    /**
     * Description: 查询应用的异常请求调用明细
     * Summary: 查询应用的异常请求调用明细
     */
    public QueryTraceAppexceptionstatResponse queryTraceAppexceptionstat(QueryTraceAppexceptionstatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAppexceptionstatEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用的异常请求调用明细
     * Summary: 查询应用的异常请求调用明细
     */
    public QueryTraceAppexceptionstatResponse queryTraceAppexceptionstatEx(QueryTraceAppexceptionstatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.appexceptionstat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceAppexceptionstatResponse());
    }

    /**
     * Description: 查询告警绑定关系
     * Summary: 罗予
     */
    public QueryUnifiedalarmRulebindingResponse queryUnifiedalarmRulebinding(QueryUnifiedalarmRulebindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedalarmRulebindingEx(request, headers, runtime);
    }

    /**
     * Description: 查询告警绑定关系
     * Summary: 罗予
     */
    public QueryUnifiedalarmRulebindingResponse queryUnifiedalarmRulebindingEx(QueryUnifiedalarmRulebindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rulebinding.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedalarmRulebindingResponse());
    }

    /**
     * Description: 监控数据诊断列表查询
     * Summary: 监控数据诊断列表查询
     */
    public QueryOpsCheckResponse queryOpsCheck(QueryOpsCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsCheckEx(request, headers, runtime);
    }

    /**
     * Description: 监控数据诊断列表查询
     * Summary: 监控数据诊断列表查询
     */
    public QueryOpsCheckResponse queryOpsCheckEx(QueryOpsCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.ops.check.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsCheckResponse());
    }

    /**
     * Description: 应用诊断
     * Summary: 应用诊断
     */
    public QueryOpsAppcheckResponse queryOpsAppcheck(QueryOpsAppcheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsAppcheckEx(request, headers, runtime);
    }

    /**
     * Description: 应用诊断
     * Summary: 应用诊断
     */
    public QueryOpsAppcheckResponse queryOpsAppcheckEx(QueryOpsAppcheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.ops.appcheck.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsAppcheckResponse());
    }

    /**
     * Description: 添加钉钉机器人
     * Summary: 添加钉钉机器人
     */
    public CreateAlarmDingdingrobotResponse createAlarmDingdingrobot(CreateAlarmDingdingrobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlarmDingdingrobotEx(request, headers, runtime);
    }

    /**
     * Description: 添加钉钉机器人
     * Summary: 添加钉钉机器人
     */
    public CreateAlarmDingdingrobotResponse createAlarmDingdingrobotEx(CreateAlarmDingdingrobotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAlarmDingdingrobotResponse());
    }

    /**
     * Description: 查询钉钉机器人
     * Summary: 查询钉钉机器人
     */
    public QueryAlarmDingdingrobotResponse queryAlarmDingdingrobot(QueryAlarmDingdingrobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmDingdingrobotEx(request, headers, runtime);
    }

    /**
     * Description: 查询钉钉机器人
     * Summary: 查询钉钉机器人
     */
    public QueryAlarmDingdingrobotResponse queryAlarmDingdingrobotEx(QueryAlarmDingdingrobotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmDingdingrobotResponse());
    }

    /**
     * Description: 删除钉钉机器人
     * Summary: 删除钉钉机器人
     */
    public DeleteAlarmDingdingrobotResponse deleteAlarmDingdingrobot(DeleteAlarmDingdingrobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlarmDingdingrobotEx(request, headers, runtime);
    }

    /**
     * Description: 删除钉钉机器人
     * Summary: 删除钉钉机器人
     */
    public DeleteAlarmDingdingrobotResponse deleteAlarmDingdingrobotEx(DeleteAlarmDingdingrobotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAlarmDingdingrobotResponse());
    }

    /**
     * Description: 更新钉钉机器人
     * Summary: 更新钉钉机器人
     */
    public UpdateAlarmDingdingrobotResponse updateAlarmDingdingrobot(UpdateAlarmDingdingrobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlarmDingdingrobotEx(request, headers, runtime);
    }

    /**
     * Description: 更新钉钉机器人
     * Summary: 更新钉钉机器人
     */
    public UpdateAlarmDingdingrobotResponse updateAlarmDingdingrobotEx(UpdateAlarmDingdingrobotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAlarmDingdingrobotResponse());
    }

    /**
     * Description: 查询应用告警统计
     * Summary: 查询应用告警统计
     */
    public QueryAppsAlarmrulecountResponse queryAppsAlarmrulecount(QueryAppsAlarmrulecountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppsAlarmrulecountEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用告警统计
     * Summary: 查询应用告警统计
     */
    public QueryAppsAlarmrulecountResponse queryAppsAlarmrulecountEx(QueryAppsAlarmrulecountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.apps.alarmrulecount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppsAlarmrulecountResponse());
    }

    /**
     * Description: 根据app维度查询统一告警状态
     * Summary: 根据app维度查询统一告警状态
     */
    public QueryAppsUnifiedalarmstatsResponse queryAppsUnifiedalarmstats(QueryAppsUnifiedalarmstatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppsUnifiedalarmstatsEx(request, headers, runtime);
    }

    /**
     * Description: 根据app维度查询统一告警状态
     * Summary: 根据app维度查询统一告警状态
     */
    public QueryAppsUnifiedalarmstatsResponse queryAppsUnifiedalarmstatsEx(QueryAppsUnifiedalarmstatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.apps.unifiedalarmstats.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppsUnifiedalarmstatsResponse());
    }

    /**
     * Description: 开启监控数据诊断告警
     * Summary: 开启监控数据诊断告警
     */
    public SwitchOpsAlarmResponse switchOpsAlarm(SwitchOpsAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchOpsAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 开启监控数据诊断告警
     * Summary: 开启监控数据诊断告警
     */
    public SwitchOpsAlarmResponse switchOpsAlarmEx(SwitchOpsAlarmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.ops.alarm.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchOpsAlarmResponse());
    }

    /**
     * Description: 获取所有租户
     * Summary: 获取所有租户
     */
    public AllTraasmetaTenantResponse allTraasmetaTenant(AllTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有租户
     * Summary: 获取所有租户
     */
    public AllTraasmetaTenantResponse allTraasmetaTenantEx(AllTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaTenantResponse());
    }

    /**
     * Description: 获取所有region
     * Summary: 获取所有region
     */
    public AllTraasmetaRegionResponse allTraasmetaRegion(AllTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有region
     * Summary: 获取所有region
     */
    public AllTraasmetaRegionResponse allTraasmetaRegionEx(AllTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaRegionResponse());
    }

    /**
     * Description: 租户分页查询
     * Summary: 租户分页查询
     */
    public PagequeryTraasmetaTenantResponse pagequeryTraasmetaTenant(PagequeryTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 租户分页查询
     * Summary: 租户分页查询
     */
    public PagequeryTraasmetaTenantResponse pagequeryTraasmetaTenantEx(PagequeryTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaTenantResponse());
    }

    /**
     * Description: 获取单个租户
     * Summary: 获取单个租户
     */
    public GetTraasmetaTenantResponse getTraasmetaTenant(GetTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个租户
     * Summary: 获取单个租户
     */
    public GetTraasmetaTenantResponse getTraasmetaTenantEx(GetTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaTenantResponse());
    }

    /**
     * Description: 租户查询
     * Summary: 租户查询
     */
    public QueryTraasmetaTenantResponse queryTraasmetaTenant(QueryTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 租户查询
     * Summary: 租户查询
     */
    public QueryTraasmetaTenantResponse queryTraasmetaTenantEx(QueryTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaTenantResponse());
    }

    /**
     * Description: 批量查询租户
     * Summary: 批量查询租户
     */
    public BatchqueryTraasmetaTenantResponse batchqueryTraasmetaTenant(BatchqueryTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询租户
     * Summary: 批量查询租户
     */
    public BatchqueryTraasmetaTenantResponse batchqueryTraasmetaTenantEx(BatchqueryTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaTenantResponse());
    }

    /**
     * Description: 创建tenant
     * Summary: 创建tenant
     */
    public CreateTraasmetaTenantResponse createTraasmetaTenant(CreateTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 创建tenant
     * Summary: 创建tenant
     */
    public CreateTraasmetaTenantResponse createTraasmetaTenantEx(CreateTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaTenantResponse());
    }

    /**
     * Description: 批量创建租户
     * Summary: 批量创建租户
     */
    public BatchcreateTraasmetaTenantResponse batchcreateTraasmetaTenant(BatchcreateTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建租户
     * Summary: 批量创建租户
     */
    public BatchcreateTraasmetaTenantResponse batchcreateTraasmetaTenantEx(BatchcreateTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaTenantResponse());
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户
     */
    public UpdateTraasmetaTenantResponse updateTraasmetaTenant(UpdateTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户
     */
    public UpdateTraasmetaTenantResponse updateTraasmetaTenantEx(UpdateTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaTenantResponse());
    }

    /**
     * Description: 删除租户
     * Summary: 删除租户
     */
    public DeleteTraasmetaTenantResponse deleteTraasmetaTenant(DeleteTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 删除租户
     * Summary: 删除租户
     */
    public DeleteTraasmetaTenantResponse deleteTraasmetaTenantEx(DeleteTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaTenantResponse());
    }

    /**
     * Description: 批量删除租户
     * Summary: 批量删除租户
     */
    public BatchdeleteTraasmetaTenantResponse batchdeleteTraasmetaTenant(BatchdeleteTraasmetaTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaTenantEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除租户
     * Summary: 批量删除租户
     */
    public BatchdeleteTraasmetaTenantResponse batchdeleteTraasmetaTenantEx(BatchdeleteTraasmetaTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaTenantResponse());
    }

    /**
     * Description: 获取单个地域
     * Summary: 获取单个地域
     */
    public GetTraasmetaRegionResponse getTraasmetaRegion(GetTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个地域
     * Summary: 获取单个地域
     */
    public GetTraasmetaRegionResponse getTraasmetaRegionEx(GetTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaRegionResponse());
    }

    /**
     * Description: 获取所有机房
     * Summary: 获取所有机房
     */
    public AllTraasmetaZoneResponse allTraasmetaZone(AllTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有机房
     * Summary: 获取所有机房
     */
    public AllTraasmetaZoneResponse allTraasmetaZoneEx(AllTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaZoneResponse());
    }

    /**
     * Description: 获取单个机房
     * Summary: 获取单个机房
     */
    public GetTraasmetaZoneResponse getTraasmetaZone(GetTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个机房
     * Summary: 获取单个机房
     */
    public GetTraasmetaZoneResponse getTraasmetaZoneEx(GetTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaZoneResponse());
    }

    /**
     * Description: 创建单个地域
     * Summary: 创建单个地域
     */
    public CreateTraasmetaRegionResponse createTraasmetaRegion(CreateTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个地域
     * Summary: 创建单个地域
     */
    public CreateTraasmetaRegionResponse createTraasmetaRegionEx(CreateTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaRegionResponse());
    }

    /**
     * Description: 批量修改agent是否开启告警标记
     * Summary: agent批量打标
     */
    public UpdateAgentLabelResponse updateAgentLabel(UpdateAgentLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentLabelEx(request, headers, runtime);
    }

    /**
     * Description: 批量修改agent是否开启告警标记
     * Summary: agent批量打标
     */
    public UpdateAgentLabelResponse updateAgentLabelEx(UpdateAgentLabelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.agent.label.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAgentLabelResponse());
    }

    /**
     * Description: 创建单个机房
     * Summary: 创建单个机房
     */
    public CreateTraasmetaZoneResponse createTraasmetaZone(CreateTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个机房
     * Summary: 创建单个机房
     */
    public CreateTraasmetaZoneResponse createTraasmetaZoneEx(CreateTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaZoneResponse());
    }

    /**
     * Description: 删除单个地域
     * Summary: 删除单个地域
     */
    public DeleteTraasmetaRegionResponse deleteTraasmetaRegion(DeleteTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个地域
     * Summary: 删除单个地域
     */
    public DeleteTraasmetaRegionResponse deleteTraasmetaRegionEx(DeleteTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaRegionResponse());
    }

    /**
     * Description: 删除单个机房
     * Summary: 删除单个机房
     */
    public DeleteTraasmetaZoneResponse deleteTraasmetaZone(DeleteTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个机房
     * Summary: 删除单个机房
     */
    public DeleteTraasmetaZoneResponse deleteTraasmetaZoneEx(DeleteTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaZoneResponse());
    }

    /**
     * Description: 更新单个地域
     * Summary: 更新单个地域
     */
    public UpdateTraasmetaRegionResponse updateTraasmetaRegion(UpdateTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个地域
     * Summary: 更新单个地域
     */
    public UpdateTraasmetaRegionResponse updateTraasmetaRegionEx(UpdateTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaRegionResponse());
    }

    /**
     * Description: 更新单个机房
     * Summary: 更新单个机房
     */
    public UpdateTraasmetaZoneResponse updateTraasmetaZone(UpdateTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个机房
     * Summary: 更新单个机房
     */
    public UpdateTraasmetaZoneResponse updateTraasmetaZoneEx(UpdateTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaZoneResponse());
    }

    /**
     * Description: 地域查询
     * Summary: 地域查询
     */
    public QueryTraasmetaRegionResponse queryTraasmetaRegion(QueryTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 地域查询
     * Summary: 地域查询
     */
    public QueryTraasmetaRegionResponse queryTraasmetaRegionEx(QueryTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaRegionResponse());
    }

    /**
     * Description: 机房查询
     * Summary: 机房查询
     */
    public QueryTraasmetaZoneResponse queryTraasmetaZone(QueryTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 机房查询
     * Summary: 机房查询
     */
    public QueryTraasmetaZoneResponse queryTraasmetaZoneEx(QueryTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaZoneResponse());
    }

    /**
     * Description: 地域分页查询
     * Summary: 地域分页查询
     */
    public PagequeryTraasmetaRegionResponse pagequeryTraasmetaRegion(PagequeryTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 地域分页查询
     * Summary: 地域分页查询
     */
    public PagequeryTraasmetaRegionResponse pagequeryTraasmetaRegionEx(PagequeryTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaRegionResponse());
    }

    /**
     * Description: 机房分页查询
     * Summary: 机房分页查询
     */
    public PagequeryTraasmetaZoneResponse pagequeryTraasmetaZone(PagequeryTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 机房分页查询
     * Summary: 机房分页查询
     */
    public PagequeryTraasmetaZoneResponse pagequeryTraasmetaZoneEx(PagequeryTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaZoneResponse());
    }

    /**
     * Description: 批量查询地域
     * Summary: 批量查询地域
     */
    public BatchqueryTraasmetaRegionResponse batchqueryTraasmetaRegion(BatchqueryTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询地域
     * Summary: 批量查询地域
     */
    public BatchqueryTraasmetaRegionResponse batchqueryTraasmetaRegionEx(BatchqueryTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaRegionResponse());
    }

    /**
     * Description: 批量创建地域
     * Summary: 批量创建地域
     */
    public BatchcreateTraasmetaRegionResponse batchcreateTraasmetaRegion(BatchcreateTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建地域
     * Summary: 批量创建地域
     */
    public BatchcreateTraasmetaRegionResponse batchcreateTraasmetaRegionEx(BatchcreateTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaRegionResponse());
    }

    /**
     * Description: 批量创建机房
     * Summary: 批量创建机房
     */
    public BatchcreateTraasmetaZoneResponse batchcreateTraasmetaZone(BatchcreateTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建机房
     * Summary: 批量创建机房
     */
    public BatchcreateTraasmetaZoneResponse batchcreateTraasmetaZoneEx(BatchcreateTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaZoneResponse());
    }

    /**
     * Description: 批量查询机房
     * Summary: 批量查询机房
     */
    public BatchqueryTraasmetaZoneResponse batchqueryTraasmetaZone(BatchqueryTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询机房
     * Summary: 批量查询机房
     */
    public BatchqueryTraasmetaZoneResponse batchqueryTraasmetaZoneEx(BatchqueryTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaZoneResponse());
    }

    /**
     * Description: 批量删除地域
     * Summary: 批量删除地域
     */
    public BatchdeleteTraasmetaRegionResponse batchdeleteTraasmetaRegion(BatchdeleteTraasmetaRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaRegionEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除地域
     * Summary: 批量删除地域
     */
    public BatchdeleteTraasmetaRegionResponse batchdeleteTraasmetaRegionEx(BatchdeleteTraasmetaRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaRegionResponse());
    }

    /**
     * Description: 批量删除机房
     * Summary: 批量删除机房
     */
    public BatchdeleteTraasmetaZoneResponse batchdeleteTraasmetaZone(BatchdeleteTraasmetaZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaZoneEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除机房
     * Summary: 批量删除机房
     */
    public BatchdeleteTraasmetaZoneResponse batchdeleteTraasmetaZoneEx(BatchdeleteTraasmetaZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaZoneResponse());
    }

    /**
     * Description: 获取所有应用
     * Summary: 获取所有应用
     */
    public AllTraasmetaAppResponse allTraasmetaApp(AllTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有应用
     * Summary: 获取所有应用
     */
    public AllTraasmetaAppResponse allTraasmetaAppEx(AllTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaAppResponse());
    }

    /**
     * Description: 获取所有应用分组
     * Summary: 获取所有应用分组
     */
    public AllTraasmetaAppgroupResponse allTraasmetaAppgroup(AllTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有应用分组
     * Summary: 获取所有应用分组
     */
    public AllTraasmetaAppgroupResponse allTraasmetaAppgroupEx(AllTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaAppgroupResponse());
    }

    /**
     * Description: 获取所有应用服务器
     * Summary: 获取所有应用服务器
     */
    public AllTraasmetaAppserverResponse allTraasmetaAppserver(AllTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有应用服务器
     * Summary: 获取所有应用服务器
     */
    public AllTraasmetaAppserverResponse allTraasmetaAppserverEx(AllTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaAppserverResponse());
    }

    /**
     * Description: 获取所有应用标签
     * Summary: 获取所有应用标签
     */
    public AllTraasmetaApptagResponse allTraasmetaApptag(AllTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有应用标签
     * Summary: 获取所有应用标签
     */
    public AllTraasmetaApptagResponse allTraasmetaApptagEx(AllTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaApptagResponse());
    }

    /**
     * Description: 获取所有工作空间
     * Summary: 获取所有工作空间
     */
    public AllTraasmetaWorkspaceResponse allTraasmetaWorkspace(AllTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有工作空间
     * Summary: 获取所有工作空间
     */
    public AllTraasmetaWorkspaceResponse allTraasmetaWorkspaceEx(AllTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 获取所有工作空间组
     * Summary: 获取所有工作空间组
     */
    public AllTraasmetaWorkspacegroupResponse allTraasmetaWorkspacegroup(AllTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有工作空间组
     * Summary: 获取所有工作空间组
     */
    public AllTraasmetaWorkspacegroupResponse allTraasmetaWorkspacegroupEx(AllTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 批量创建工作空间组
     * Summary: 批量创建工作空间组
     */
    public BatchcreateTraasmetaWorkspacegroupResponse batchcreateTraasmetaWorkspacegroup(BatchcreateTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建工作空间组
     * Summary: 批量创建工作空间组
     */
    public BatchcreateTraasmetaWorkspacegroupResponse batchcreateTraasmetaWorkspacegroupEx(BatchcreateTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 批量创建应用
     * Summary: 批量创建应用
     */
    public BatchcreateTraasmetaAppResponse batchcreateTraasmetaApp(BatchcreateTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建应用
     * Summary: 批量创建应用
     */
    public BatchcreateTraasmetaAppResponse batchcreateTraasmetaAppEx(BatchcreateTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaAppResponse());
    }

    /**
     * Description: 批量创建应用组
     * Summary: 批量创建应用组
     */
    public BatchcreateTraasmetaAppgroupResponse batchcreateTraasmetaAppgroup(BatchcreateTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建应用组
     * Summary: 批量创建应用组
     */
    public BatchcreateTraasmetaAppgroupResponse batchcreateTraasmetaAppgroupEx(BatchcreateTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaAppgroupResponse());
    }

    /**
     * Description: 批量创建应用服务器
     * Summary: 批量创建应用服务器
     */
    public BatchcreateTraasmetaAppserverResponse batchcreateTraasmetaAppserver(BatchcreateTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建应用服务器
     * Summary: 批量创建应用服务器
     */
    public BatchcreateTraasmetaAppserverResponse batchcreateTraasmetaAppserverEx(BatchcreateTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaAppserverResponse());
    }

    /**
     * Description: 批量创建应用标签
     * Summary: 批量创建应用标签
     */
    public BatchcreateTraasmetaApptagResponse batchcreateTraasmetaApptag(BatchcreateTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建应用标签
     * Summary: 批量创建应用标签
     */
    public BatchcreateTraasmetaApptagResponse batchcreateTraasmetaApptagEx(BatchcreateTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaApptagResponse());
    }

    /**
     * Description: 批量创建工作空间
     * Summary: 批量创建工作空间
     */
    public BatchcreateTraasmetaWorkspaceResponse batchcreateTraasmetaWorkspace(BatchcreateTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建工作空间
     * Summary: 批量创建工作空间
     */
    public BatchcreateTraasmetaWorkspaceResponse batchcreateTraasmetaWorkspaceEx(BatchcreateTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 批量删除应用
     * Summary: 批量删除应用
     */
    public BatchdeleteTraasmetaAppResponse batchdeleteTraasmetaApp(BatchdeleteTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除应用
     * Summary: 批量删除应用
     */
    public BatchdeleteTraasmetaAppResponse batchdeleteTraasmetaAppEx(BatchdeleteTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaAppResponse());
    }

    /**
     * Description: 批量删除工作空间
     * Summary: 批量删除工作空间
     */
    public BatchdeleteTraasmetaWorkspaceResponse batchdeleteTraasmetaWorkspace(BatchdeleteTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除工作空间
     * Summary: 批量删除工作空间
     */
    public BatchdeleteTraasmetaWorkspaceResponse batchdeleteTraasmetaWorkspaceEx(BatchdeleteTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 批量删除应用标签
     * Summary: 批量删除应用标签
     */
    public BatchdeleteTraasmetaApptagResponse batchdeleteTraasmetaApptag(BatchdeleteTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除应用标签
     * Summary: 批量删除应用标签
     */
    public BatchdeleteTraasmetaApptagResponse batchdeleteTraasmetaApptagEx(BatchdeleteTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaApptagResponse());
    }

    /**
     * Description: 批量删除应用服务器
     * Summary: 批量删除应用服务器
     */
    public BatchdeleteTraasmetaAppserverResponse batchdeleteTraasmetaAppserver(BatchdeleteTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除应用服务器
     * Summary: 批量删除应用服务器
     */
    public BatchdeleteTraasmetaAppserverResponse batchdeleteTraasmetaAppserverEx(BatchdeleteTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaAppserverResponse());
    }

    /**
     * Description: 批量删除应用组
     * Summary: 批量删除应用组
     */
    public BatchdeleteTraasmetaAppgroupResponse batchdeleteTraasmetaAppgroup(BatchdeleteTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除应用组
     * Summary: 批量删除应用组
     */
    public BatchdeleteTraasmetaAppgroupResponse batchdeleteTraasmetaAppgroupEx(BatchdeleteTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaAppgroupResponse());
    }

    /**
     * Description: 批量删除工作空间组
     * Summary: 批量删除工作空间组
     */
    public BatchdeleteTraasmetaWorkspacegroupResponse batchdeleteTraasmetaWorkspacegroup(BatchdeleteTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除工作空间组
     * Summary: 批量删除工作空间组
     */
    public BatchdeleteTraasmetaWorkspacegroupResponse batchdeleteTraasmetaWorkspacegroupEx(BatchdeleteTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 批量查询工作空间组
     * Summary: 批量查询工作空间组
     */
    public BatchqueryTraasmetaWorkspacegroupResponse batchqueryTraasmetaWorkspacegroup(BatchqueryTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询工作空间组
     * Summary: 批量查询工作空间组
     */
    public BatchqueryTraasmetaWorkspacegroupResponse batchqueryTraasmetaWorkspacegroupEx(BatchqueryTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 批量查询工作空间
     * Summary: 批量查询工作空间
     */
    public BatchqueryTraasmetaWorkspaceResponse batchqueryTraasmetaWorkspace(BatchqueryTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询工作空间
     * Summary: 批量查询工作空间
     */
    public BatchqueryTraasmetaWorkspaceResponse batchqueryTraasmetaWorkspaceEx(BatchqueryTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 批量查询应用标签
     * Summary: 批量查询应用标签
     */
    public BatchqueryTraasmetaApptagResponse batchqueryTraasmetaApptag(BatchqueryTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询应用标签
     * Summary: 批量查询应用标签
     */
    public BatchqueryTraasmetaApptagResponse batchqueryTraasmetaApptagEx(BatchqueryTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaApptagResponse());
    }

    /**
     * Description: 批量查询应用服务器
     * Summary: 批量查询应用服务器
     */
    public BatchqueryTraasmetaAppserverResponse batchqueryTraasmetaAppserver(BatchqueryTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询应用服务器
     * Summary: 批量查询应用服务器
     */
    public BatchqueryTraasmetaAppserverResponse batchqueryTraasmetaAppserverEx(BatchqueryTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaAppserverResponse());
    }

    /**
     * Description: 批量查询应用组
     * Summary: 批量查询应用组
     */
    public BatchqueryTraasmetaAppgroupResponse batchqueryTraasmetaAppgroup(BatchqueryTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询应用组
     * Summary: 批量查询应用组
     */
    public BatchqueryTraasmetaAppgroupResponse batchqueryTraasmetaAppgroupEx(BatchqueryTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaAppgroupResponse());
    }

    /**
     * Description: 批量查询应用
     * Summary: 批量查询应用
     */
    public BatchqueryTraasmetaAppResponse batchqueryTraasmetaApp(BatchqueryTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询应用
     * Summary: 批量查询应用
     */
    public BatchqueryTraasmetaAppResponse batchqueryTraasmetaAppEx(BatchqueryTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaAppResponse());
    }

    /**
     * Description: 删除单个应用
     * Summary: 删除单个应用
     */
    public DeleteTraasmetaAppResponse deleteTraasmetaApp(DeleteTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个应用
     * Summary: 删除单个应用
     */
    public DeleteTraasmetaAppResponse deleteTraasmetaAppEx(DeleteTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaAppResponse());
    }

    /**
     * Description: 删除单个应用组
     * Summary: 删除单个应用组
     */
    public DeleteTraasmetaAppgroupResponse deleteTraasmetaAppgroup(DeleteTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个应用组
     * Summary: 删除单个应用组
     */
    public DeleteTraasmetaAppgroupResponse deleteTraasmetaAppgroupEx(DeleteTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaAppgroupResponse());
    }

    /**
     * Description: 删除单个应用服务器
     * Summary: 删除单个应用服务器
     */
    public DeleteTraasmetaAppserverResponse deleteTraasmetaAppserver(DeleteTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个应用服务器
     * Summary: 删除单个应用服务器
     */
    public DeleteTraasmetaAppserverResponse deleteTraasmetaAppserverEx(DeleteTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaAppserverResponse());
    }

    /**
     * Description: 删除单个应用标签
     * Summary: 删除单个应用标签
     */
    public DeleteTraasmetaApptagResponse deleteTraasmetaApptag(DeleteTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个应用标签
     * Summary: 删除单个应用标签
     */
    public DeleteTraasmetaApptagResponse deleteTraasmetaApptagEx(DeleteTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaApptagResponse());
    }

    /**
     * Description: 删除单个工作空间
     * Summary: 删除单个工作空间
     */
    public DeleteTraasmetaWorkspaceResponse deleteTraasmetaWorkspace(DeleteTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个工作空间
     * Summary: 删除单个工作空间
     */
    public DeleteTraasmetaWorkspaceResponse deleteTraasmetaWorkspaceEx(DeleteTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 删除单个工作空间组
     * Summary: 删除单个工作空间组
     */
    public DeleteTraasmetaWorkspacegroupResponse deleteTraasmetaWorkspacegroup(DeleteTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个工作空间组
     * Summary: 删除单个工作空间组
     */
    public DeleteTraasmetaWorkspacegroupResponse deleteTraasmetaWorkspacegroupEx(DeleteTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 获取单个应用
     * Summary: 获取单个应用
     */
    public GetTraasmetaAppResponse getTraasmetaApp(GetTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个应用
     * Summary: 获取单个应用
     */
    public GetTraasmetaAppResponse getTraasmetaAppEx(GetTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaAppResponse());
    }

    /**
     * Description: 获取单个应用组
     * Summary: 获取单个应用组
     */
    public GetTraasmetaAppgroupResponse getTraasmetaAppgroup(GetTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个应用组
     * Summary: 获取单个应用组
     */
    public GetTraasmetaAppgroupResponse getTraasmetaAppgroupEx(GetTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaAppgroupResponse());
    }

    /**
     * Description: 获取单个应用服务器
     * Summary: 获取单个应用服务器
     */
    public GetTraasmetaAppserverResponse getTraasmetaAppserver(GetTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个应用服务器
     * Summary: 获取单个应用服务器
     */
    public GetTraasmetaAppserverResponse getTraasmetaAppserverEx(GetTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaAppserverResponse());
    }

    /**
     * Description: 获取单个应用标签
     * Summary: 获取单个应用标签
     */
    public GetTraasmetaApptagResponse getTraasmetaApptag(GetTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个应用标签
     * Summary: 获取单个应用标签
     */
    public GetTraasmetaApptagResponse getTraasmetaApptagEx(GetTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaApptagResponse());
    }

    /**
     * Description: 获取单个工作空间
     * Summary: 获取单个工作空间
     */
    public GetTraasmetaWorkspaceResponse getTraasmetaWorkspace(GetTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个工作空间
     * Summary: 获取单个工作空间
     */
    public GetTraasmetaWorkspaceResponse getTraasmetaWorkspaceEx(GetTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 获取单个工作空间组
     * Summary: 获取单个工作空间组
     */
    public GetTraasmetaWorkspacegroupResponse getTraasmetaWorkspacegroup(GetTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个工作空间组
     * Summary: 获取单个工作空间组
     */
    public GetTraasmetaWorkspacegroupResponse getTraasmetaWorkspacegroupEx(GetTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 工作空间组分页查询
     * Summary: 工作空间组分页查询
     */
    public PagequeryTraasmetaWorkspacegroupResponse pagequeryTraasmetaWorkspacegroup(PagequeryTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 工作空间组分页查询
     * Summary: 工作空间组分页查询
     */
    public PagequeryTraasmetaWorkspacegroupResponse pagequeryTraasmetaWorkspacegroupEx(PagequeryTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 工作空间分页查询
     * Summary: 工作空间分页查询
     */
    public PagequeryTraasmetaWorkspaceResponse pagequeryTraasmetaWorkspace(PagequeryTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 工作空间分页查询
     * Summary: 工作空间分页查询
     */
    public PagequeryTraasmetaWorkspaceResponse pagequeryTraasmetaWorkspaceEx(PagequeryTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 应用标签分页查询
     * Summary: 应用标签分页查询
     */
    public PagequeryTraasmetaApptagResponse pagequeryTraasmetaApptag(PagequeryTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 应用标签分页查询
     * Summary: 应用标签分页查询
     */
    public PagequeryTraasmetaApptagResponse pagequeryTraasmetaApptagEx(PagequeryTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaApptagResponse());
    }

    /**
     * Description: 应用服务器分页查询
     * Summary: 应用服务器分页查询
     */
    public PagequeryTraasmetaAppserverResponse pagequeryTraasmetaAppserver(PagequeryTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 应用服务器分页查询
     * Summary: 应用服务器分页查询
     */
    public PagequeryTraasmetaAppserverResponse pagequeryTraasmetaAppserverEx(PagequeryTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaAppserverResponse());
    }

    /**
     * Description: 应用组分页查询
     * Summary: 应用组分页查询
     */
    public PagequeryTraasmetaAppgroupResponse pagequeryTraasmetaAppgroup(PagequeryTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用组分页查询
     * Summary: 应用组分页查询
     */
    public PagequeryTraasmetaAppgroupResponse pagequeryTraasmetaAppgroupEx(PagequeryTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaAppgroupResponse());
    }

    /**
     * Description: 应用分页查询
     * Summary: 应用分页查询
     */
    public PagequeryTraasmetaAppResponse pagequeryTraasmetaApp(PagequeryTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用分页查询
     * Summary: 应用分页查询
     */
    public PagequeryTraasmetaAppResponse pagequeryTraasmetaAppEx(PagequeryTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaAppResponse());
    }

    /**
     * Description: 工作空间组查询
     * Summary: 工作空间组查询
     */
    public QueryTraasmetaWorkspacegroupResponse queryTraasmetaWorkspacegroup(QueryTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 工作空间组查询
     * Summary: 工作空间组查询
     */
    public QueryTraasmetaWorkspacegroupResponse queryTraasmetaWorkspacegroupEx(QueryTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 工作空间查询
     * Summary: 工作空间查询
     */
    public QueryTraasmetaWorkspaceResponse queryTraasmetaWorkspace(QueryTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 工作空间查询
     * Summary: 工作空间查询
     */
    public QueryTraasmetaWorkspaceResponse queryTraasmetaWorkspaceEx(QueryTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 应用标签查询
     * Summary: 应用标签查询
     */
    public QueryTraasmetaApptagResponse queryTraasmetaApptag(QueryTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 应用标签查询
     * Summary: 应用标签查询
     */
    public QueryTraasmetaApptagResponse queryTraasmetaApptagEx(QueryTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaApptagResponse());
    }

    /**
     * Description: 应用服务器查询
     * Summary: 应用服务器查询
     */
    public QueryTraasmetaAppserverResponse queryTraasmetaAppserver(QueryTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 应用服务器查询
     * Summary: 应用服务器查询
     */
    public QueryTraasmetaAppserverResponse queryTraasmetaAppserverEx(QueryTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaAppserverResponse());
    }

    /**
     * Description: 应用组查询
     * Summary: 应用组查询
     */
    public QueryTraasmetaAppgroupResponse queryTraasmetaAppgroup(QueryTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用组查询
     * Summary: 应用组查询
     */
    public QueryTraasmetaAppgroupResponse queryTraasmetaAppgroupEx(QueryTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaAppgroupResponse());
    }

    /**
     * Description: 应用查询
     * Summary: 应用查询
     */
    public QueryTraasmetaAppResponse queryTraasmetaApp(QueryTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用查询
     * Summary: 应用查询
     */
    public QueryTraasmetaAppResponse queryTraasmetaAppEx(QueryTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaAppResponse());
    }

    /**
     * Description: 更新单个应用
     * Summary: 更新单个应用
     */
    public UpdateTraasmetaAppResponse updateTraasmetaApp(UpdateTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个应用
     * Summary: 更新单个应用
     */
    public UpdateTraasmetaAppResponse updateTraasmetaAppEx(UpdateTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaAppResponse());
    }

    /**
     * Description: 创建单个应用
     * Summary: 创建单个应用
     */
    public CreateTraasmetaAppResponse createTraasmetaApp(CreateTraasmetaAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaAppEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个应用
     * Summary: 创建单个应用
     */
    public CreateTraasmetaAppResponse createTraasmetaAppEx(CreateTraasmetaAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.app.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaAppResponse());
    }

    /**
     * Description: 更新单个工作空间组
     * Summary: 更新单个工作空间组
     */
    public UpdateTraasmetaWorkspacegroupResponse updateTraasmetaWorkspacegroup(UpdateTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个工作空间组
     * Summary: 更新单个工作空间组
     */
    public UpdateTraasmetaWorkspacegroupResponse updateTraasmetaWorkspacegroupEx(UpdateTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 更新单个应用组
     * Summary: 更新单个应用组
     */
    public UpdateTraasmetaAppgroupResponse updateTraasmetaAppgroup(UpdateTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个应用组
     * Summary: 更新单个应用组
     */
    public UpdateTraasmetaAppgroupResponse updateTraasmetaAppgroupEx(UpdateTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaAppgroupResponse());
    }

    /**
     * Description: 创建单个应用组
     * Summary: 创建单个应用组
     */
    public CreateTraasmetaAppgroupResponse createTraasmetaAppgroup(CreateTraasmetaAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个应用组
     * Summary: 创建单个应用组
     */
    public CreateTraasmetaAppgroupResponse createTraasmetaAppgroupEx(CreateTraasmetaAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaAppgroupResponse());
    }

    /**
     * Description: 创建单个工作空间
     * Summary: 创建单个工作空间
     */
    public CreateTraasmetaWorkspaceResponse createTraasmetaWorkspace(CreateTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个工作空间
     * Summary: 创建单个工作空间
     */
    public CreateTraasmetaWorkspaceResponse createTraasmetaWorkspaceEx(CreateTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 更新单个工作空间
     * Summary: 更新单个工作空间
     */
    public UpdateTraasmetaWorkspaceResponse updateTraasmetaWorkspace(UpdateTraasmetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个工作空间
     * Summary: 更新单个工作空间
     */
    public UpdateTraasmetaWorkspaceResponse updateTraasmetaWorkspaceEx(UpdateTraasmetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaWorkspaceResponse());
    }

    /**
     * Description: 更新单个应用标签
     * Summary: 更新单个应用标签
     */
    public UpdateTraasmetaApptagResponse updateTraasmetaApptag(UpdateTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个应用标签
     * Summary: 更新单个应用标签
     */
    public UpdateTraasmetaApptagResponse updateTraasmetaApptagEx(UpdateTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaApptagResponse());
    }

    /**
     * Description: 创建单个应用标签
     * Summary: 创建单个应用标签
     */
    public CreateTraasmetaApptagResponse createTraasmetaApptag(CreateTraasmetaApptagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaApptagEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个应用标签
     * Summary: 创建单个应用标签
     */
    public CreateTraasmetaApptagResponse createTraasmetaApptagEx(CreateTraasmetaApptagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaApptagResponse());
    }

    /**
     * Description: 创建单个应用服务器
     * Summary: 创建单个应用服务器
     */
    public CreateTraasmetaAppserverResponse createTraasmetaAppserver(CreateTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个应用服务器
     * Summary: 创建单个应用服务器
     */
    public CreateTraasmetaAppserverResponse createTraasmetaAppserverEx(CreateTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaAppserverResponse());
    }

    /**
     * Description: 更新单个应用服务器
     * Summary: 更新单个应用服务器
     */
    public UpdateTraasmetaAppserverResponse updateTraasmetaAppserver(UpdateTraasmetaAppserverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaAppserverEx(request, headers, runtime);
    }

    /**
     * Description: 更新单个应用服务器
     * Summary: 更新单个应用服务器
     */
    public UpdateTraasmetaAppserverResponse updateTraasmetaAppserverEx(UpdateTraasmetaAppserverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaAppserverResponse());
    }

    /**
     * Description: 获取SetupModel
     * Summary: 获取SetupModel
     */
    public GetSetupModelResponse getSetupModel(GetSetupModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSetupModelEx(request, headers, runtime);
    }

    /**
     * Description: 获取SetupModel
     * Summary: 获取SetupModel
     */
    public GetSetupModelResponse getSetupModelEx(GetSetupModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.setup.model.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSetupModelResponse());
    }

    /**
     * Description: 创建单个工作空间组
     * Summary: 创建单个工作空间组
     */
    public CreateTraasmetaWorkspacegroupResponse createTraasmetaWorkspacegroup(CreateTraasmetaWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个工作空间组
     * Summary: 创建单个工作空间组
     */
    public CreateTraasmetaWorkspacegroupResponse createTraasmetaWorkspacegroupEx(CreateTraasmetaWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaWorkspacegroupResponse());
    }

    /**
     * Description: 获取单个cell
     * Summary: 获取单个cell
     */
    public GetTraasmetaCellResponse getTraasmetaCell(GetTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个cell
     * Summary: 获取单个cell
     */
    public GetTraasmetaCellResponse getTraasmetaCellEx(GetTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaCellResponse());
    }

    /**
     * Description: 分页查询
     * Summary: 分页查询
     */
    public PagequeryTraasmetaCellResponse pagequeryTraasmetaCell(PagequeryTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询
     * Summary: 分页查询
     */
    public PagequeryTraasmetaCellResponse pagequeryTraasmetaCellEx(PagequeryTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaCellResponse());
    }

    /**
     * Description: 获取单个主机
     * Summary: 获取单个主机
     */
    public GetTraasmetaHostmachineResponse getTraasmetaHostmachine(GetTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个主机
     * Summary: 获取单个主机
     */
    public GetTraasmetaHostmachineResponse getTraasmetaHostmachineEx(GetTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTraasmetaHostmachineResponse());
    }

    /**
     * Description: 分页查询主机
     * Summary: 分页查询主机
     */
    public PagequeryTraasmetaHostmachineResponse pagequeryTraasmetaHostmachine(PagequeryTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询主机
     * Summary: 分页查询主机
     */
    public PagequeryTraasmetaHostmachineResponse pagequeryTraasmetaHostmachineEx(PagequeryTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTraasmetaHostmachineResponse());
    }

    /**
     * Description: 获取单链路详细拓扑
     * Summary: 获取单链路详细拓扑
     */
    public QueryTraceDetailtopologyResponse queryTraceDetailtopology(QueryTraceDetailtopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceDetailtopologyEx(request, headers, runtime);
    }

    /**
     * Description: 获取单链路详细拓扑
     * Summary: 获取单链路详细拓扑
     */
    public QueryTraceDetailtopologyResponse queryTraceDetailtopologyEx(QueryTraceDetailtopologyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.trace.detailtopology.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceDetailtopologyResponse());
    }

    /**
     * Description: spi配置-保存spi
     * Summary: spi配置-保存spi
     */
    public SaveTenantconfigSpiResponse saveTenantconfigSpi(SaveTenantconfigSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveTenantconfigSpiEx(request, headers, runtime);
    }

    /**
     * Description: spi配置-保存spi
     * Summary: spi配置-保存spi
     */
    public SaveTenantconfigSpiResponse saveTenantconfigSpiEx(SaveTenantconfigSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenantconfig.spi.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveTenantconfigSpiResponse());
    }

    /**
     * Description: spi配置-查询spi
     * Summary: spi配置-查询spi
     */
    public QueryTenantconfigSpiResponse queryTenantconfigSpi(QueryTenantconfigSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantconfigSpiEx(request, headers, runtime);
    }

    /**
     * Description: spi配置-查询spi
     * Summary: spi配置-查询spi
     */
    public QueryTenantconfigSpiResponse queryTenantconfigSpiEx(QueryTenantconfigSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenantconfig.spi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantconfigSpiResponse());
    }

    /**
     * Description: 获取当前用户能够访问的workspace
     * Summary: 获取当前用户能够访问的workspace
     */
    public ListOneconsoleWorkspaceResponse listOneconsoleWorkspace(ListOneconsoleWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOneconsoleWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前用户能够访问的workspace
     * Summary: 获取当前用户能够访问的workspace
     */
    public ListOneconsoleWorkspaceResponse listOneconsoleWorkspaceEx(ListOneconsoleWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.oneconsole.workspace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListOneconsoleWorkspaceResponse());
    }

    /**
     * Description: spi配置-删除
     * Summary: spi配置-删除
     */
    public DeleteTenantconfigResponse deleteTenantconfig(DeleteTenantconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTenantconfigEx(request, headers, runtime);
    }

    /**
     * Description: spi配置-删除
     * Summary: spi配置-删除
     */
    public DeleteTenantconfigResponse deleteTenantconfigEx(DeleteTenantconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenantconfig.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTenantconfigResponse());
    }

    /**
     * Description: spi配置-查询token
     * Summary: spi配置-查询token
     */
    public QueryTenantconfigTokenResponse queryTenantconfigToken(QueryTenantconfigTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantconfigTokenEx(request, headers, runtime);
    }

    /**
     * Description: spi配置-查询token
     * Summary: spi配置-查询token
     */
    public QueryTenantconfigTokenResponse queryTenantconfigTokenEx(QueryTenantconfigTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenantconfig.token.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantconfigTokenResponse());
    }

    /**
     * Description: spi配置-保存token
     * Summary: spi配置-保存token
     */
    public SaveTenantconfigTokenResponse saveTenantconfigToken(SaveTenantconfigTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveTenantconfigTokenEx(request, headers, runtime);
    }

    /**
     * Description: spi配置-保存token
     * Summary: spi配置-保存token
     */
    public SaveTenantconfigTokenResponse saveTenantconfigTokenEx(SaveTenantconfigTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.tenantconfig.token.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveTenantconfigTokenResponse());
    }

    /**
     * Description: 查询元数据实体基本信息
     * Summary: 查询元数据实体基本信息
     */
    public QueryTraasmetaEntityResponse queryTraasmetaEntity(QueryTraasmetaEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaEntityEx(request, headers, runtime);
    }

    /**
     * Description: 查询元数据实体基本信息
     * Summary: 查询元数据实体基本信息
     */
    public QueryTraasmetaEntityResponse queryTraasmetaEntityEx(QueryTraasmetaEntityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.entity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaEntityResponse());
    }

    /**
     * Description: 获取实体字段列表
     * Summary: 获取实体字段列表
     */
    public ListTraasmetaEntityfieldResponse listTraasmetaEntityfield(ListTraasmetaEntityfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTraasmetaEntityfieldEx(request, headers, runtime);
    }

    /**
     * Description: 获取实体字段列表
     * Summary: 获取实体字段列表
     */
    public ListTraasmetaEntityfieldResponse listTraasmetaEntityfieldEx(ListTraasmetaEntityfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.entityfield.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTraasmetaEntityfieldResponse());
    }

    /**
     * Description: 查询实体拓扑
     * Summary: 查询实体拓扑
     */
    public QueryTraasmetaEntitytopoResponse queryTraasmetaEntitytopo(QueryTraasmetaEntitytopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaEntitytopoEx(request, headers, runtime);
    }

    /**
     * Description: 查询实体拓扑
     * Summary: 查询实体拓扑
     */
    public QueryTraasmetaEntitytopoResponse queryTraasmetaEntitytopoEx(QueryTraasmetaEntitytopoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.entitytopo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaEntitytopoResponse());
    }

    /**
     * Description: 获取所有主机
     * Summary: 获取所有主机
     */
    public AllTraasmetaHostmachineResponse allTraasmetaHostmachine(AllTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有主机
     * Summary: 获取所有主机
     */
    public AllTraasmetaHostmachineResponse allTraasmetaHostmachineEx(AllTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaHostmachineResponse());
    }

    /**
     * Description: 批量创建主机
     * Summary: 批量创建主机
     */
    public BatchcreateTraasmetaHostmachineResponse batchcreateTraasmetaHostmachine(BatchcreateTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建主机
     * Summary: 批量创建主机
     */
    public BatchcreateTraasmetaHostmachineResponse batchcreateTraasmetaHostmachineEx(BatchcreateTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaHostmachineResponse());
    }

    /**
     * Description: 批量删除主机
     * Summary: 批量删除主机
     */
    public BatchdeleteTraasmetaHostmachineResponse batchdeleteTraasmetaHostmachine(BatchdeleteTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除主机
     * Summary: 批量删除主机
     */
    public BatchdeleteTraasmetaHostmachineResponse batchdeleteTraasmetaHostmachineEx(BatchdeleteTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaHostmachineResponse());
    }

    /**
     * Description: 批量查询主机
     * Summary: 批量查询主机
     */
    public BatchqueryTraasmetaHostmachineResponse batchqueryTraasmetaHostmachine(BatchqueryTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询主机
     * Summary: 批量查询主机
     */
    public BatchqueryTraasmetaHostmachineResponse batchqueryTraasmetaHostmachineEx(BatchqueryTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaHostmachineResponse());
    }

    /**
     * Description: 创建单个主机
     * Summary: 创建单个主机
     */
    public CreateTraasmetaHostmachineResponse createTraasmetaHostmachine(CreateTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个主机
     * Summary: 创建单个主机
     */
    public CreateTraasmetaHostmachineResponse createTraasmetaHostmachineEx(CreateTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaHostmachineResponse());
    }

    /**
     * Description: 删除主机
     * Summary: 删除主机
     */
    public DeleteTraasmetaHostmachineResponse deleteTraasmetaHostmachine(DeleteTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 删除主机
     * Summary: 删除主机
     */
    public DeleteTraasmetaHostmachineResponse deleteTraasmetaHostmachineEx(DeleteTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaHostmachineResponse());
    }

    /**
     * Description: 查询主机
     * Summary: 查询主机
     */
    public QueryTraasmetaHostmachineResponse queryTraasmetaHostmachine(QueryTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 查询主机
     * Summary: 查询主机
     */
    public QueryTraasmetaHostmachineResponse queryTraasmetaHostmachineEx(QueryTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaHostmachineResponse());
    }

    /**
     * Description: 更新主机
     * Summary: 更新主机
     */
    public UpdateTraasmetaHostmachineResponse updateTraasmetaHostmachine(UpdateTraasmetaHostmachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaHostmachineEx(request, headers, runtime);
    }

    /**
     * Description: 更新主机
     * Summary: 更新主机
     */
    public UpdateTraasmetaHostmachineResponse updateTraasmetaHostmachineEx(UpdateTraasmetaHostmachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaHostmachineResponse());
    }

    /**
     * Description: 批量创建cell
     * Summary: 批量创建cell
     */
    public BatchcreateTraasmetaCellResponse batchcreateTraasmetaCell(BatchcreateTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建cell
     * Summary: 批量创建cell
     */
    public BatchcreateTraasmetaCellResponse batchcreateTraasmetaCellEx(BatchcreateTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTraasmetaCellResponse());
    }

    /**
     * Description: 批量删除cell
     * Summary: 批量删除cell
     */
    public BatchdeleteTraasmetaCellResponse batchdeleteTraasmetaCell(BatchdeleteTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除cell
     * Summary: 批量删除cell
     */
    public BatchdeleteTraasmetaCellResponse batchdeleteTraasmetaCellEx(BatchdeleteTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteTraasmetaCellResponse());
    }

    /**
     * Description: 批量查询cell
     * Summary: 批量查询cell
     */
    public BatchqueryTraasmetaCellResponse batchqueryTraasmetaCell(BatchqueryTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询cell
     * Summary: 批量查询cell
     */
    public BatchqueryTraasmetaCellResponse batchqueryTraasmetaCellEx(BatchqueryTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTraasmetaCellResponse());
    }

    /**
     * Description: 更新cell
     * Summary: 更新cell
     */
    public UpdateTraasmetaCellResponse updateTraasmetaCell(UpdateTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 更新cell
     * Summary: 更新cell
     */
    public UpdateTraasmetaCellResponse updateTraasmetaCellEx(UpdateTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTraasmetaCellResponse());
    }

    /**
     * Description: 创建单个cell
     * Summary: 创建单个cell
     */
    public CreateTraasmetaCellResponse createTraasmetaCell(CreateTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个cell
     * Summary: 创建单个cell
     */
    public CreateTraasmetaCellResponse createTraasmetaCellEx(CreateTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTraasmetaCellResponse());
    }

    /**
     * Description: 删除单个cell
     * Summary: 删除单个cell
     */
    public DeleteTraasmetaCellResponse deleteTraasmetaCell(DeleteTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个cell
     * Summary: 删除单个cell
     */
    public DeleteTraasmetaCellResponse deleteTraasmetaCellEx(DeleteTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTraasmetaCellResponse());
    }

    /**
     * Description: 获取所有cell
     * Summary: 获取所有cell
     */
    public AllTraasmetaCellResponse allTraasmetaCell(AllTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有cell
     * Summary: 获取所有cell
     */
    public AllTraasmetaCellResponse allTraasmetaCellEx(AllTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTraasmetaCellResponse());
    }

    /**
     * Description: 查询cell
     * Summary: 查询cell
     */
    public QueryTraasmetaCellResponse queryTraasmetaCell(QueryTraasmetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraasmetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询cell
     * Summary: 查询cell
     */
    public QueryTraasmetaCellResponse queryTraasmetaCellEx(QueryTraasmetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraasmetaCellResponse());
    }
}
