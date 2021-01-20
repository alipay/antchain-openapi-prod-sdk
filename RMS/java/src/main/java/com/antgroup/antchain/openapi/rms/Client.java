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
    public Integer _readTimeout;
    public Integer _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Integer _maxIdleConns;
    public String _securityToken;
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
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.Client.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.1.0")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "undefined")),
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
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.Client.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.Client.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    continue;
                }
                throw new RuntimeException(e);
            }
        }

        throw new TeaUnretryableException(_lastRequest);
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
    public ListAppResponse listApp(ListAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     */
    public ListAppResponse listAppEx(ListAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.monitor.app.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppResponse());
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
}
