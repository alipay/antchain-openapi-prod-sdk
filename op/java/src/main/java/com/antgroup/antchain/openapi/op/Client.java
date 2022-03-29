// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.op.models.*;
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
                    new TeaPair("sdk_version", "3.2.3")
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
     * Description: 查询api详情
     * Summary: 查询api
     */
    public QueryApiserviceResponse queryApiservice(QueryApiserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询api详情
     * Summary: 查询api
     */
    public QueryApiserviceResponse queryApiserviceEx(QueryApiserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.apiservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiserviceResponse());
    }

    /**
     * Description: 导入api信息
     * Summary: 导入api信息
     */
    public ImportApiserviceResponse importApiservice(ImportApiserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importApiserviceEx(request, headers, runtime);
    }

    /**
     * Description: 导入api信息
     * Summary: 导入api信息
     */
    public ImportApiserviceResponse importApiserviceEx(ImportApiserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.apiservice.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportApiserviceResponse());
    }

    /**
     * Description: 调用apicore创建产品
     * Summary: 创建产品
     */
    public CreateApiserviceProductResponse createApiserviceProduct(CreateApiserviceProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiserviceProductEx(request, headers, runtime);
    }

    /**
     * Description: 调用apicore创建产品
     * Summary: 创建产品
     */
    public CreateApiserviceProductResponse createApiserviceProductEx(CreateApiserviceProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.apiservice.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiserviceProductResponse());
    }

    /**
     * Description: 创建分组
     * Summary: 创建分组
     */
    public CreateApiserviceGroupResponse createApiserviceGroup(CreateApiserviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiserviceGroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建分组
     * Summary: 创建分组
     */
    public CreateApiserviceGroupResponse createApiserviceGroupEx(CreateApiserviceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.apiservice.group.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiserviceGroupResponse());
    }

    /**
     * Description: 创建suite
     * Summary: 创建suite
     */
    public CreateApiserviceSuiteResponse createApiserviceSuite(CreateApiserviceSuiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiserviceSuiteEx(request, headers, runtime);
    }

    /**
     * Description: 创建suite
     * Summary: 创建suite
     */
    public CreateApiserviceSuiteResponse createApiserviceSuiteEx(CreateApiserviceSuiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.apiservice.suite.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiserviceSuiteResponse());
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置
     */
    public ImportSpecResponse importSpec(ImportSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSpecEx(request, headers, runtime);
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置
     */
    public ImportSpecResponse importSpecEx(ImportSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.spec.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSpecResponse());
    }

    /**
     * Description: 导出Spec
     * Summary: 导出Spec
     */
    public ExportSpecResponse exportSpec(ExportSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportSpecEx(request, headers, runtime);
    }

    /**
     * Description: 导出Spec
     * Summary: 导出Spec
     */
    public ExportSpecResponse exportSpecEx(ExportSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.spec.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportSpecResponse());
    }

    /**
     * Description: 获取OpenAPI提供方详情
     * Summary: 获取OpenAPI提供方详情
     */
    public GetProviderResponse getProvider(GetProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProviderEx(request, headers, runtime);
    }

    /**
     * Description: 获取OpenAPI提供方详情
     * Summary: 获取OpenAPI提供方详情
     */
    public GetProviderResponse getProviderEx(GetProviderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.provider.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetProviderResponse());
    }

    /**
     * Description: 渠道API导入
     * Summary: 渠道API导入
     */
    public ImportChannelapiResponse importChannelapi(ImportChannelapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importChannelapiEx(request, headers, runtime);
    }

    /**
     * Description: 渠道API导入
     * Summary: 渠道API导入
     */
    public ImportChannelapiResponse importChannelapiEx(ImportChannelapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.channelapi.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportChannelapiResponse());
    }

    /**
     * Description: 检测金融云网关目前的健康状态
     * Summary: 网关健康检查1
     */
    public ServiceGatewayCheckResponse serviceGatewayCheck(ServiceGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.serviceGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: 检测金融云网关目前的健康状态
     * Summary: 网关健康检查1
     */
    public ServiceGatewayCheckResponse serviceGatewayCheckEx(ServiceGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.gateway.check.service", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ServiceGatewayCheckResponse());
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置
     */
    public ImportGatewaySpecResponse importGatewaySpec(ImportGatewaySpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importGatewaySpecEx(request, headers, runtime);
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置
     */
    public ImportGatewaySpecResponse importGatewaySpecEx(ImportGatewaySpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.gateway.spec.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportGatewaySpecResponse());
    }

    /**
     * Description: 更新集群路由host
     * Summary: 更新集群路由host
     */
    public UpdateGatewayClusterhostResponse updateGatewayClusterhost(UpdateGatewayClusterhostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayClusterhostEx(request, headers, runtime);
    }

    /**
     * Description: 更新集群路由host
     * Summary: 更新集群路由host
     */
    public UpdateGatewayClusterhostResponse updateGatewayClusterhostEx(UpdateGatewayClusterhostRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.gateway.clusterhost.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGatewayClusterhostResponse());
    }

    /**
     * Description: 创建静态路由
     * Summary: 创建静态路由
     */
    public CreateGatewayStaticrouterResponse createGatewayStaticrouter(CreateGatewayStaticrouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayStaticrouterEx(request, headers, runtime);
    }

    /**
     * Description: 创建静态路由
     * Summary: 创建静态路由
     */
    public CreateGatewayStaticrouterResponse createGatewayStaticrouterEx(CreateGatewayStaticrouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.gateway.staticrouter.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGatewayStaticrouterResponse());
    }

    /**
     * Description: 查询集群路由host
     * Summary: 查询集群路由host
     */
    public QueryGatewayClusterhostResponse queryGatewayClusterhost(QueryGatewayClusterhostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayClusterhostEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群路由host
     * Summary: 查询集群路由host
     */
    public QueryGatewayClusterhostResponse queryGatewayClusterhostEx(QueryGatewayClusterhostRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.gateway.clusterhost.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayClusterhostResponse());
    }

    /**
     * Description: 导入SDK信息
     * Summary: 导入SDK信息
     */
    public ImportSdkResponse importSdk(ImportSdkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSdkEx(request, headers, runtime);
    }

    /**
     * Description: 导入SDK信息
     * Summary: 导入SDK信息
     */
    public ImportSdkResponse importSdkEx(ImportSdkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.openapi.sdk.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSdkResponse());
    }
}
