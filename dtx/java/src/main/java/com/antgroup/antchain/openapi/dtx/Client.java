// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.dtx.models.*;
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
            new TeaPair("keepAliveDuration", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.0.166"),
                    new TeaPair("_prod_code", "DTX"),
                    new TeaPair("_prod_channel", "undefined")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "prodapigw-sofastack.cloud.alipay.com")),
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
     * Description: 创建应用
     * Summary: 创建应用
     */
    public CreateAppsResponse createApps(CreateAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppsEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用
     * Summary: 创建应用
     */
    public CreateAppsResponse createAppsEx(CreateAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppsResponse());
    }

    /**
     * Description: 发起方接入，新增发起方配置
     * Summary: 发起方接入
     */
    public CreateRecoveryInitiatorsResponse createRecoveryInitiators(CreateRecoveryInitiatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecoveryInitiatorsEx(request, headers, runtime);
    }

    /**
     * Description: 发起方接入，新增发起方配置
     * Summary: 发起方接入
     */
    public CreateRecoveryInitiatorsResponse createRecoveryInitiatorsEx(CreateRecoveryInitiatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.initiators.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecoveryInitiatorsResponse());
    }

    /**
     * Description: 根据app获取事务概览统计
     * Summary: 获取bizType事务概览统计
     */
    public CountAppsStatsResponse countAppsStats(CountAppsStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAppsStatsEx(request, headers, runtime);
    }

    /**
     * Description: 根据app获取事务概览统计
     * Summary: 获取bizType事务概览统计
     */
    public CountAppsStatsResponse countAppsStatsEx(CountAppsStatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.stats.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAppsStatsResponse());
    }

    /**
     * Description: 获取bizType列表
     * Summary: 获取bizType列表
     */
    public ListAppsBiztypesResponse listAppsBiztypes(ListAppsBiztypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsBiztypesEx(request, headers, runtime);
    }

    /**
     * Description: 获取bizType列表
     * Summary: 获取bizType列表
     */
    public ListAppsBiztypesResponse listAppsBiztypesEx(ListAppsBiztypesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.biztypes.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppsBiztypesResponse());
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 导出配置
     */
    public ExportAppsConfigsResponse exportAppsConfigs(ExportAppsConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportAppsConfigsEx(request, headers, runtime);
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 导出配置
     */
    public ExportAppsConfigsResponse exportAppsConfigsEx(ExportAppsConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.configs.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportAppsConfigsResponse());
    }

    /**
     * Description: 获取应用名（app_name）列表
     * Summary: 获取应用名（app_name）列表
     */
    public AllAppsAppnamesResponse allAppsAppnames(AllAppsAppnamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAppsAppnamesEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用名（app_name）列表
     * Summary: 获取应用名（app_name）列表
     */
    public AllAppsAppnamesResponse allAppsAppnamesEx(AllAppsAppnamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.appnames.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAppsAppnamesResponse());
    }

    /**
     * Description: 应用事务列表，分页
     * Summary: 应用事务列表
     */
    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsEx(request, headers, runtime);
    }

    /**
     * Description: 应用事务列表，分页
     * Summary: 应用事务列表
     */
    public ListAppsResponse listAppsEx(ListAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppsResponse());
    }

    /**
     * Description: 单个参与者详情
     * Summary: 单个参与者详情
     */
    public GetRecoveryParticipatorsResponse getRecoveryParticipators(GetRecoveryParticipatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecoveryParticipatorsEx(request, headers, runtime);
    }

    /**
     * Description: 单个参与者详情
     * Summary: 单个参与者详情
     */
    public GetRecoveryParticipatorsResponse getRecoveryParticipatorsEx(GetRecoveryParticipatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.participators.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRecoveryParticipatorsResponse());
    }

    /**
     * Description: 导出配置中需要有app、类型信息（发起方/参与者）
     * Summary: 导入配置
     */
    public ImportAppsConfigsResponse importAppsConfigs(ImportAppsConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAppsConfigsEx(request, headers, runtime);
    }

    /**
     * Description: 导出配置中需要有app、类型信息（发起方/参与者）
     * Summary: 导入配置
     */
    public ImportAppsConfigsResponse importAppsConfigsEx(ImportAppsConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.configs.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAppsConfigsResponse());
    }

    /**
     * Description: 获取上传文件URL
     * Summary: 获取上传文件URL
     */
    public GetUploadUrlResponse getUploadUrl(GetUploadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadUrlEx(request, headers, runtime);
    }

    /**
     * Description: 获取上传文件URL
     * Summary: 获取上传文件URL
     */
    public GetUploadUrlResponse getUploadUrlEx(GetUploadUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.upload.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUploadUrlResponse());
    }

    /**
     * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
     * Summary: 查询bizType的调用关系
     */
    public QueryAppsBiztypeResponse queryAppsBiztype(QueryAppsBiztypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppsBiztypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
     * Summary: 查询bizType的调用关系
     */
    public QueryAppsBiztypeResponse queryAppsBiztypeEx(QueryAppsBiztypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.biztype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppsBiztypeResponse());
    }

    /**
     * Description: 创建发起者获取数据源
     * Summary: 创建发起者获取数据源
     */
    public ListAppsRecoverydsnameResponse listAppsRecoverydsname(ListAppsRecoverydsnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsRecoverydsnameEx(request, headers, runtime);
    }

    /**
     * Description: 创建发起者获取数据源
     * Summary: 创建发起者获取数据源
     */
    public ListAppsRecoverydsnameResponse listAppsRecoverydsnameEx(ListAppsRecoverydsnameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.recoverydsname.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppsRecoverydsnameResponse());
    }

    /**
     * Description: 单个biztype的关联关系，Saga则是状态机json定义
     * Summary: 单个biztype的关联关系
     */
    public GetAppsBiztypeResponse getAppsBiztype(GetAppsBiztypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppsBiztypeEx(request, headers, runtime);
    }

    /**
     * Description: 单个biztype的关联关系，Saga则是状态机json定义
     * Summary: 单个biztype的关联关系
     */
    public GetAppsBiztypeResponse getAppsBiztypeEx(GetAppsBiztypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.biztype.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppsBiztypeResponse());
    }

    /**
     * Description: 事务更新
     * Summary: 事务更新
     */
    public UpdateAppsBiztypeResponse updateAppsBiztype(UpdateAppsBiztypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppsBiztypeEx(request, headers, runtime);
    }

    /**
     * Description: 事务更新
     * Summary: 事务更新
     */
    public UpdateAppsBiztypeResponse updateAppsBiztypeEx(UpdateAppsBiztypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.biztype.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppsBiztypeResponse());
    }

    /**
     * Description: 新增应用配置（包括发起方和参与者）
     * Summary: 新增应用配置（包括发起方和参与者）
     */
    public CreateAppsConfigsResponse createAppsConfigs(CreateAppsConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppsConfigsEx(request, headers, runtime);
    }

    /**
     * Description: 新增应用配置（包括发起方和参与者）
     * Summary: 新增应用配置（包括发起方和参与者）
     */
    public CreateAppsConfigsResponse createAppsConfigsEx(CreateAppsConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.configs.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppsConfigsResponse());
    }

    /**
     * Description: 事务配置-导入配置
     * Summary: 应用配置-导入配置
     */
    public ImportAppsNewconfigsResponse importAppsNewconfigs(ImportAppsNewconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAppsNewconfigsEx(request, headers, runtime);
    }

    /**
     * Description: 事务配置-导入配置
     * Summary: 应用配置-导入配置
     */
    public ImportAppsNewconfigsResponse importAppsNewconfigsEx(ImportAppsNewconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.newconfigs.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAppsNewconfigsResponse());
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 应用配置-导出配置
     */
    public ExportAppsNewconfigsResponse exportAppsNewconfigs(ExportAppsNewconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportAppsNewconfigsEx(request, headers, runtime);
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 应用配置-导出配置
     */
    public ExportAppsNewconfigsResponse exportAppsNewconfigsEx(ExportAppsNewconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.newconfigs.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportAppsNewconfigsResponse());
    }

    /**
     * Description: 导出配置中需要有事务信息
     * Summary: 事务配置-导入配置
     */
    public ImportTxConfigsResponse importTxConfigs(ImportTxConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importTxConfigsEx(request, headers, runtime);
    }

    /**
     * Description: 导出配置中需要有事务信息
     * Summary: 事务配置-导入配置
     */
    public ImportTxConfigsResponse importTxConfigsEx(ImportTxConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.tx.configs.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportTxConfigsResponse());
    }

    /**
     * Description: 事务导出配置
     * Summary: 事务配置-导出配置
     */
    public ExportTxConfigsResponse exportTxConfigs(ExportTxConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportTxConfigsEx(request, headers, runtime);
    }

    /**
     * Description: 事务导出配置
     * Summary: 事务配置-导出配置
     */
    public ExportTxConfigsResponse exportTxConfigsEx(ExportTxConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.tx.configs.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportTxConfigsResponse());
    }

    /**
     * Description: 管控台1.1 应用配置列表
     * Summary: 应用配置列表
     */
    public ListNewAppsResponse listNewApps(ListNewAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNewAppsEx(request, headers, runtime);
    }

    /**
     * Description: 管控台1.1 应用配置列表
     * Summary: 应用配置列表
     */
    public ListNewAppsResponse listNewAppsEx(ListNewAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.new.apps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListNewAppsResponse());
    }

    /**
     * Description: 新应用详情界面
     * Summary: 应用详情
     */
    public QueryAppsDetailResponse queryAppsDetail(QueryAppsDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppsDetailEx(request, headers, runtime);
    }

    /**
     * Description: 新应用详情界面
     * Summary: 应用详情
     */
    public QueryAppsDetailResponse queryAppsDetailEx(QueryAppsDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppsDetailResponse());
    }

    /**
     * Description: 。
     * Summary: 应用删除
     */
    public DeleteAppsResponse deleteApps(DeleteAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppsEx(request, headers, runtime);
    }

    /**
     * Description: 。
     * Summary: 应用删除
     */
    public DeleteAppsResponse deleteAppsEx(DeleteAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppsResponse());
    }

    /**
     * Description: 发起方删除
     * Summary: 发起方删除
     */
    public DeleteAppsRecoveryResponse deleteAppsRecovery(DeleteAppsRecoveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppsRecoveryEx(request, headers, runtime);
    }

    /**
     * Description: 发起方删除
     * Summary: 发起方删除
     */
    public DeleteAppsRecoveryResponse deleteAppsRecoveryEx(DeleteAppsRecoveryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.recovery.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppsRecoveryResponse());
    }

    /**
     * Description: 参与者删除
     * Summary: 参与者删除
     */
    public DeleteAppsActionResponse deleteAppsAction(DeleteAppsActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppsActionEx(request, headers, runtime);
    }

    /**
     * Description: 参与者删除
     * Summary: 参与者删除
     */
    public DeleteAppsActionResponse deleteAppsActionEx(DeleteAppsActionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.action.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppsActionResponse());
    }

    /**
     * Description: 批量新增 app下的发起方、参与者
     * Summary: 批量新增 app下的发起方、参与者
     */
    public BatchcreateAppsResponse batchcreateApps(BatchcreateAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateAppsEx(request, headers, runtime);
    }

    /**
     * Description: 批量新增 app下的发起方、参与者
     * Summary: 批量新增 app下的发起方、参与者
     */
    public BatchcreateAppsResponse batchcreateAppsEx(BatchcreateAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateAppsResponse());
    }

    /**
     * Description: 单个发起方新增/编辑
     * Summary: 单个发起方新增/编辑
     */
    public CreateAppsRecoveryResponse createAppsRecovery(CreateAppsRecoveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppsRecoveryEx(request, headers, runtime);
    }

    /**
     * Description: 单个发起方新增/编辑
     * Summary: 单个发起方新增/编辑
     */
    public CreateAppsRecoveryResponse createAppsRecoveryEx(CreateAppsRecoveryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.recovery.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppsRecoveryResponse());
    }

    /**
     * Description: 参与者新增/编辑
     * Summary: 参与者新增/编辑
     */
    public CreateAppsActionResponse createAppsAction(CreateAppsActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppsActionEx(request, headers, runtime);
    }

    /**
     * Description: 参与者新增/编辑
     * Summary: 参与者新增/编辑
     */
    public CreateAppsActionResponse createAppsActionEx(CreateAppsActionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.action.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppsActionResponse());
    }

    /**
     * Description: 新建/编辑事务关联关系
     * Summary: 新建/编辑事务关联关系
     */
    public CreateBiztypeRelationResponse createBiztypeRelation(CreateBiztypeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBiztypeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 新建/编辑事务关联关系
     * Summary: 新建/编辑事务关联关系
     */
    public CreateBiztypeRelationResponse createBiztypeRelationEx(CreateBiztypeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.biztype.relation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBiztypeRelationResponse());
    }

    /**
     * Description: 删除biztype关联关系
     * Summary: 删除biztype关联关系
     */
    public DeleteAppsBiztypeResponse deleteAppsBiztype(DeleteAppsBiztypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppsBiztypeEx(request, headers, runtime);
    }

    /**
     * Description: 删除biztype关联关系
     * Summary: 删除biztype关联关系
     */
    public DeleteAppsBiztypeResponse deleteAppsBiztypeEx(DeleteAppsBiztypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.apps.biztype.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppsBiztypeResponse());
    }

    /**
     * Description: 查询biztype与发起方，参与者的关联关系
     * Summary: 查询biztype关联关系
     */
    public QueryBiztypeRelationResponse queryBiztypeRelation(QueryBiztypeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBiztypeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询biztype与发起方，参与者的关联关系
     * Summary: 查询biztype关联关系
     */
    public QueryBiztypeRelationResponse queryBiztypeRelationEx(QueryBiztypeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.biztype.relation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBiztypeRelationResponse());
    }

    /**
     * Description: 根据txid，删除进行中的事务
     * Summary: 删除进行中的事务
     */
    public DeleteTransactionsResponse deleteTransactions(DeleteTransactionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTransactionsEx(request, headers, runtime);
    }

    /**
     * Description: 根据txid，删除进行中的事务
     * Summary: 删除进行中的事务
     */
    public DeleteTransactionsResponse deleteTransactionsEx(DeleteTransactionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTransactionsResponse());
    }

    /**
     * Description: 异库模式下， 发起方和参与者的配置信息。
    role取值：1是发起方，2是参与者；
    activityMode取值：1是同库模式，2是异库模式；
    actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
     * Summary: 异库接入（包括发起方和参与者）
     */
    public CreateRecoveryConfigurationResponse createRecoveryConfiguration(CreateRecoveryConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecoveryConfigurationEx(request, headers, runtime);
    }

    /**
     * Description: 异库模式下， 发起方和参与者的配置信息。
    role取值：1是发起方，2是参与者；
    activityMode取值：1是同库模式，2是异库模式；
    actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
     * Summary: 异库接入（包括发起方和参与者）
     */
    public CreateRecoveryConfigurationResponse createRecoveryConfigurationEx(CreateRecoveryConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.configuration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecoveryConfigurationResponse());
    }

    /**
     * Description: 获取当前环境信息，例如租户和环境
     * Summary: 获取当前环境
     */
    public GetGlobalEnvResponse getGlobalEnv(GetGlobalEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGlobalEnvEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前环境信息，例如租户和环境
     * Summary: 获取当前环境
     */
    public GetGlobalEnvResponse getGlobalEnvEx(GetGlobalEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.global.env.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGlobalEnvResponse());
    }

    /**
     * Description: 获取instanceId
     * Summary: 获取instanceId
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstance(GetMiddlewareInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMiddlewareInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 获取instanceId
     * Summary: 获取instanceId
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.middleware.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMiddlewareInstanceResponse());
    }

    /**
     * Description: 获取zone信息
     * Summary: 获取zone信息
     */
    public AllZoneResponse allZone(AllZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allZoneEx(request, headers, runtime);
    }

    /**
     * Description: 获取zone信息
     * Summary: 获取zone信息
     */
    public AllZoneResponse allZoneEx(AllZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.zone.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllZoneResponse());
    }

    /**
     * Description: 发起方接入配置的修改
     * Summary: 发起方编辑
     */
    public UpdateRecoveryInitiatorsResponse updateRecoveryInitiators(UpdateRecoveryInitiatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecoveryInitiatorsEx(request, headers, runtime);
    }

    /**
     * Description: 发起方接入配置的修改
     * Summary: 发起方编辑
     */
    public UpdateRecoveryInitiatorsResponse updateRecoveryInitiatorsEx(UpdateRecoveryInitiatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.initiators.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRecoveryInitiatorsResponse());
    }

    /**
     * Description: 应用作为参与者查询所有发起者
     * Summary: 应用作为参与者查询所有发起者
     */
    public ListBiztypesInitiatorsResponse listBiztypesInitiators(ListBiztypesInitiatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBiztypesInitiatorsEx(request, headers, runtime);
    }

    /**
     * Description: 应用作为参与者查询所有发起者
     * Summary: 应用作为参与者查询所有发起者
     */
    public ListBiztypesInitiatorsResponse listBiztypesInitiatorsEx(ListBiztypesInitiatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.biztypes.initiators.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBiztypesInitiatorsResponse());
    }

    /**
     * Description: 根据app获取数据源列表
     * Summary: 根据app获取数据源列表
     */
    public AllInitiatorsDatasourcesResponse allInitiatorsDatasources(AllInitiatorsDatasourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allInitiatorsDatasourcesEx(request, headers, runtime);
    }

    /**
     * Description: 根据app获取数据源列表
     * Summary: 根据app获取数据源列表
     */
    public AllInitiatorsDatasourcesResponse allInitiatorsDatasourcesEx(AllInitiatorsDatasourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.initiators.datasources.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllInitiatorsDatasourcesResponse());
    }

    /**
     * Description: 根据app+dsName获取所有表
     * Summary: 根据app+dsName获取所有表
     */
    public AllInitiatorsTablesResponse allInitiatorsTables(AllInitiatorsTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allInitiatorsTablesEx(request, headers, runtime);
    }

    /**
     * Description: 根据app+dsName获取所有表
     * Summary: 根据app+dsName获取所有表
     */
    public AllInitiatorsTablesResponse allInitiatorsTablesEx(AllInitiatorsTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.initiators.tables.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllInitiatorsTablesResponse());
    }

    /**
     * Description: 发起方联调
     * Summary: 发起方联调
     */
    public DebugInitiatorsResponse debugInitiators(DebugInitiatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.debugInitiatorsEx(request, headers, runtime);
    }

    /**
     * Description: 发起方联调
     * Summary: 发起方联调
     */
    public DebugInitiatorsResponse debugInitiatorsEx(DebugInitiatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.initiators.debug", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DebugInitiatorsResponse());
    }

    /**
     * Description: 单个发起方详情
     * Summary: 单个发起方详情
     */
    public GetRecoveryInitiatorsResponse getRecoveryInitiators(GetRecoveryInitiatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecoveryInitiatorsEx(request, headers, runtime);
    }

    /**
     * Description: 单个发起方详情
     * Summary: 单个发起方详情
     */
    public GetRecoveryInitiatorsResponse getRecoveryInitiatorsEx(GetRecoveryInitiatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.initiators.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRecoveryInitiatorsResponse());
    }

    /**
     * Description: 参与者接入，录入参与者信息
     * Summary: 参与者接入
     */
    public CreateRecoveryParticipatorsResponse createRecoveryParticipators(CreateRecoveryParticipatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecoveryParticipatorsEx(request, headers, runtime);
    }

    /**
     * Description: 参与者接入，录入参与者信息
     * Summary: 参与者接入
     */
    public CreateRecoveryParticipatorsResponse createRecoveryParticipatorsEx(CreateRecoveryParticipatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.participators.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecoveryParticipatorsResponse());
    }

    /**
     * Description: 更新参与者配置信息
     * Summary: 参与者编辑
     */
    public UpdateRecoveryParticipatorsResponse updateRecoveryParticipators(UpdateRecoveryParticipatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecoveryParticipatorsEx(request, headers, runtime);
    }

    /**
     * Description: 更新参与者配置信息
     * Summary: 参与者编辑
     */
    public UpdateRecoveryParticipatorsResponse updateRecoveryParticipatorsEx(UpdateRecoveryParticipatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.recovery.participators.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRecoveryParticipatorsResponse());
    }

    /**
     * Description:  应用作为发起者查询所有参与者
     * Summary:  应用作为发起者查询所有参与者
     */
    public ListBiztypesParticipatorsResponse listBiztypesParticipators(ListBiztypesParticipatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBiztypesParticipatorsEx(request, headers, runtime);
    }

    /**
     * Description:  应用作为发起者查询所有参与者
     * Summary:  应用作为发起者查询所有参与者
     */
    public ListBiztypesParticipatorsResponse listBiztypesParticipatorsEx(ListBiztypesParticipatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.biztypes.participators.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBiztypesParticipatorsResponse());
    }

    /**
     * Description: 根据app获取所有的参与者名称
     * Summary: 根据app获取所有的参与者名称
     */
    public AllParticipatorsActionamesResponse allParticipatorsActionames(AllParticipatorsActionamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allParticipatorsActionamesEx(request, headers, runtime);
    }

    /**
     * Description: 根据app获取所有的参与者名称
     * Summary: 根据app获取所有的参与者名称
     */
    public AllParticipatorsActionamesResponse allParticipatorsActionamesEx(AllParticipatorsActionamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.participators.actionames.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllParticipatorsActionamesResponse());
    }

    /**
     * Description: 参与者联调
     * Summary: 参与者联调
     */
    public DebugParticipatorsResponse debugParticipators(DebugParticipatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.debugParticipatorsEx(request, headers, runtime);
    }

    /**
     * Description: 参与者联调
     * Summary: 参与者联调
     */
    public DebugParticipatorsResponse debugParticipatorsEx(DebugParticipatorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.participators.debug", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DebugParticipatorsResponse());
    }

    /**
     * Description: 提交回滚方法参数
     * Summary: 获取action的调用参数
     */
    public QueryActionParamResponse queryActionParam(QueryActionParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryActionParamEx(request, headers, runtime);
    }

    /**
     * Description: 提交回滚方法参数
     * Summary: 获取action的调用参数
     */
    public QueryActionParamResponse queryActionParamEx(QueryActionParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.action.param.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryActionParamResponse());
    }

    /**
     * Description: 分布式事务-执行单元切换
     * Summary: 分布式事务执行单元切换
     */
    public ExecuteSwitchoverResponse executeSwitchover(ExecuteSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 分布式事务-执行单元切换
     * Summary: 分布式事务执行单元切换
     */
    public ExecuteSwitchoverResponse executeSwitchoverEx(ExecuteSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.switchover.execute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecuteSwitchoverResponse());
    }

    /**
     * Description: 分布式事务-取消单元切换
     * Summary: 分布式事务取消单元切换
     */
    public CancelSwitchoverResponse cancelSwitchover(CancelSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 分布式事务-取消单元切换
     * Summary: 分布式事务取消单元切换
     */
    public CancelSwitchoverResponse cancelSwitchoverEx(CancelSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.switchover.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSwitchoverResponse());
    }

    /**
     * Description: 分布式事务-查询单元切换状态
     * Summary: 查询分布式事务单元切换状态
     */
    public QuerySwitchoverResponse querySwitchover(QuerySwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 分布式事务-查询单元切换状态
     * Summary: 查询分布式事务单元切换状态
     */
    public QuerySwitchoverResponse querySwitchoverEx(QuerySwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.switchover.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySwitchoverResponse());
    }

    /**
     * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
     * Summary: 事务趋势图
     */
    public CountBiztypesTrendsResponse countBiztypesTrends(CountBiztypesTrendsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countBiztypesTrendsEx(request, headers, runtime);
    }

    /**
     * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
     * Summary: 事务趋势图
     */
    public CountBiztypesTrendsResponse countBiztypesTrendsEx(CountBiztypesTrendsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.biztypes.trends.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountBiztypesTrendsResponse());
    }

    /**
     * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
     * Summary: 事务概览统计接口
     */
    public GetGlobalStatsResponse getGlobalStats(GetGlobalStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGlobalStatsEx(request, headers, runtime);
    }

    /**
     * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
     * Summary: 事务概览统计接口
     */
    public GetGlobalStatsResponse getGlobalStatsEx(GetGlobalStatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.global.stats.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGlobalStatsResponse());
    }

    /**
     * Description: 联调历史列表
     * Summary: 联调历史列表
     */
    public ListTransactionDebugsResponse listTransactionDebugs(ListTransactionDebugsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTransactionDebugsEx(request, headers, runtime);
    }

    /**
     * Description: 联调历史列表
     * Summary: 联调历史列表
     */
    public ListTransactionDebugsResponse listTransactionDebugsEx(ListTransactionDebugsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transaction.debugs.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTransactionDebugsResponse());
    }

    /**
     * Description: 单个联调记录详情
     * Summary: 单个联调记录详情
     */
    public GetTransactionsDebugsResponse getTransactionsDebugs(GetTransactionsDebugsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransactionsDebugsEx(request, headers, runtime);
    }

    /**
     * Description: 单个联调记录详情
     * Summary: 单个联调记录详情
     */
    public GetTransactionsDebugsResponse getTransactionsDebugsEx(GetTransactionsDebugsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.debugs.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransactionsDebugsResponse());
    }

    /**
     * Description: 事务高级查询
     * Summary: 事务高级查询
     */
    public QueryTransactionsResponse queryTransactions(QueryTransactionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTransactionsEx(request, headers, runtime);
    }

    /**
     * Description: 事务高级查询
     * Summary: 事务高级查询
     */
    public QueryTransactionsResponse queryTransactionsEx(QueryTransactionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTransactionsResponse());
    }

    /**
     * Description: 单个事务详情
     * Summary: 单个事务详情
     */
    public GetTransactionsResponse getTransactions(GetTransactionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransactionsEx(request, headers, runtime);
    }

    /**
     * Description: 单个事务详情
     * Summary: 单个事务详情
     */
    public GetTransactionsResponse getTransactionsEx(GetTransactionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransactionsResponse());
    }

    /**
     * Description: 悬挂事务恢复
     * Summary: 创建事务恢复
     */
    public CreateTransactionsCorrectionsResponse createTransactionsCorrections(CreateTransactionsCorrectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTransactionsCorrectionsEx(request, headers, runtime);
    }

    /**
     * Description: 悬挂事务恢复
     * Summary: 创建事务恢复
     */
    public CreateTransactionsCorrectionsResponse createTransactionsCorrectionsEx(CreateTransactionsCorrectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.corrections.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTransactionsCorrectionsResponse());
    }

    /**
     * Description: 单个事务恢复详情
     * Summary: 单个事务恢复详情
     */
    public GetTransactionsCorrectionsResponse getTransactionsCorrections(GetTransactionsCorrectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransactionsCorrectionsEx(request, headers, runtime);
    }

    /**
     * Description: 单个事务恢复详情
     * Summary: 单个事务恢复详情
     */
    public GetTransactionsCorrectionsResponse getTransactionsCorrectionsEx(GetTransactionsCorrectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.corrections.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransactionsCorrectionsResponse());
    }

    /**
     * Description: 执行事务订正
     * Summary: 执行事务订正
     */
    public ExecTransactionsCorrectionsResponse execTransactionsCorrections(ExecTransactionsCorrectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execTransactionsCorrectionsEx(request, headers, runtime);
    }

    /**
     * Description: 执行事务订正
     * Summary: 执行事务订正
     */
    public ExecTransactionsCorrectionsResponse execTransactionsCorrectionsEx(ExecTransactionsCorrectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transactions.corrections.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecTransactionsCorrectionsResponse());
    }

    /**
     * Description: 事务订正列表
     * Summary: 事务订正列表
     */
    public ListTransactionCorrectionsResponse listTransactionCorrections(ListTransactionCorrectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTransactionCorrectionsEx(request, headers, runtime);
    }

    /**
     * Description: 事务订正列表
     * Summary: 事务订正列表
     */
    public ListTransactionCorrectionsResponse listTransactionCorrectionsEx(ListTransactionCorrectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transaction.corrections.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTransactionCorrectionsResponse());
    }

    /**
     * Description: 发起方app列表
     * Summary: 发起方app列表
     */
    public ListTransactionAppsResponse listTransactionApps(ListTransactionAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTransactionAppsEx(request, headers, runtime);
    }

    /**
     * Description: 发起方app列表
     * Summary: 发起方app列表
     */
    public ListTransactionAppsResponse listTransactionAppsEx(ListTransactionAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transaction.apps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTransactionAppsResponse());
    }

    /**
     * Description: 针对特定图，组装的特定数据结构 接口
     * Summary: 事务详情
     */
    public GetTransactionChartResponse getTransactionChart(GetTransactionChartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransactionChartEx(request, headers, runtime);
    }

    /**
     * Description: 针对特定图，组装的特定数据结构 接口
     * Summary: 事务详情
     */
    public GetTransactionChartResponse getTransactionChartEx(GetTransactionChartRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transaction.chart.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransactionChartResponse());
    }

    /**
     * Description: 获取Saga状态机事务执行记录，返回状态图json
     * Summary: 获取Saga状态机事务执行记录json
     */
    public GetTransactionSagaResponse getTransactionSaga(GetTransactionSagaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransactionSagaEx(request, headers, runtime);
    }

    /**
     * Description: 获取Saga状态机事务执行记录，返回状态图json
     * Summary: 获取Saga状态机事务执行记录json
     */
    public GetTransactionSagaResponse getTransactionSagaEx(GetTransactionSagaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.transaction.saga.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransactionSagaResponse());
    }

    /**
     * Description: 白名单列表
     * Summary: 白名单列表
     */
    public ListWhitelistResponse listWhitelist(ListWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 白名单列表
     * Summary: 白名单列表
     */
    public ListWhitelistResponse listWhitelistEx(ListWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWhitelistResponse());
    }

    /**
     * Description: 白名单更新
     * Summary: 白名单更新
     */
    public UpdateWhitelistResponse updateWhitelist(UpdateWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 白名单更新
     * Summary: 白名单更新
     */
    public UpdateWhitelistResponse updateWhitelistEx(UpdateWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWhitelistResponse());
    }

    /**
     * Description: 白名单添加
     * Summary: 白名单添加
     */
    public AddWhitelistResponse addWhitelist(AddWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 白名单添加
     * Summary: 白名单添加
     */
    public AddWhitelistResponse addWhitelistEx(AddWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddWhitelistResponse());
    }

    /**
     * Description: xts failover容灾推送
     * Summary: 容灾推送
     */
    public PushWhitelistResponse pushWhitelist(PushWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: xts failover容灾推送
     * Summary: 容灾推送
     */
    public PushWhitelistResponse pushWhitelistEx(PushWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushWhitelistResponse());
    }

    /**
     * Description: 删除白名单
     * Summary: 删除白名单
     */
    public DeleteWhitelistResponse deleteWhitelist(DeleteWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 删除白名单
     * Summary: 删除白名单
     */
    public DeleteWhitelistResponse deleteWhitelistEx(DeleteWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteWhitelistResponse());
    }

    /**
     * Description: 弹性位配置列表
     * Summary: 弹性位配置列表
     */
    public ListWhitelistZonesResponse listWhitelistZones(ListWhitelistZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWhitelistZonesEx(request, headers, runtime);
    }

    /**
     * Description: 弹性位配置列表
     * Summary: 弹性位配置列表
     */
    public ListWhitelistZonesResponse listWhitelistZonesEx(ListWhitelistZonesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.dtx.whitelist.zones.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWhitelistZonesResponse());
    }
}
