// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.propertychain.models.*;
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
                    new TeaPair("sdk_version", "1.0.44")
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
     * Description: 用户注册
     * Summary: 用户注册
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserEx(request, headers, runtime);
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册
     */
    public CreateUserResponse createUserEx(CreateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserResponse());
    }

    /**
     * Description: 物权凭证转让/赠送
     * Summary: 物权凭证转让/赠送
     */
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTransferEx(request, headers, runtime);
    }

    /**
     * Description: 物权凭证转让/赠送
     * Summary: 物权凭证转让/赠送
     */
    public CreateTransferResponse createTransferEx(CreateTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.transfer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTransferResponse());
    }

    /**
     * Description: 创建提取码
     * Summary: 创建提取码
     */
    public CreatePickupResponse createPickup(CreatePickupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPickupEx(request, headers, runtime);
    }

    /**
     * Description: 创建提取码
     * Summary: 创建提取码
     */
    public CreatePickupResponse createPickupEx(CreatePickupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.pickup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePickupResponse());
    }

    /**
     * Description: 销毁提取码
     * Summary: 销毁提取码
     */
    public CancelPickupResponse cancelPickup(CancelPickupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelPickupEx(request, headers, runtime);
    }

    /**
     * Description: 销毁提取码
     * Summary: 销毁提取码
     */
    public CancelPickupResponse cancelPickupEx(CancelPickupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.pickup.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelPickupResponse());
    }

    /**
     * Description: 核销提取码
     * Summary: 核销提取码
     */
    public DisablePickupResponse disablePickup(DisablePickupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disablePickupEx(request, headers, runtime);
    }

    /**
     * Description: 核销提取码
     * Summary: 核销提取码
     */
    public DisablePickupResponse disablePickupEx(DisablePickupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.pickup.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisablePickupResponse());
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateLeagueResponse createLeague(CreateLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateLeagueResponse createLeagueEx(CreateLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeagueResponse());
    }

    /**
     * Description: 加入联盟
     * Summary: 加入联盟
     */
    public AddLeagueResponse addLeague(AddLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 加入联盟
     * Summary: 加入联盟
     */
    public AddLeagueResponse addLeagueEx(AddLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddLeagueResponse());
    }

    /**
     * Description: 审核加入联盟
     * Summary: 审核加入联盟
     */
    public ConfirmLeagueResponse confirmLeague(ConfirmLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 审核加入联盟
     * Summary: 审核加入联盟
     */
    public ConfirmLeagueResponse confirmLeagueEx(ConfirmLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmLeagueResponse());
    }

    /**
     * Description: 查询联盟
     * Summary: 查询联盟
     */
    public QueryLeagueResponse queryLeague(QueryLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 查询联盟
     * Summary: 查询联盟
     */
    public QueryLeagueResponse queryLeagueEx(QueryLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeagueResponse());
    }

    /**
     * Description: 创建资产信息
     * Summary: 创建资产信息
     */
    public CreateImportassetResponse createImportasset(CreateImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 创建资产信息
     * Summary: 创建资产信息
     */
    public CreateImportassetResponse createImportassetEx(CreateImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateImportassetResponse());
    }

    /**
     * Description: 更新物权
     * Summary: 更新物权
     */
    public UpdateImportassetResponse updateImportasset(UpdateImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 更新物权
     * Summary: 更新物权
     */
    public UpdateImportassetResponse updateImportassetEx(UpdateImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateImportassetResponse());
    }

    /**
     * Description: 注销物权
     * Summary: 注销物权
     */
    public CancelImportassetResponse cancelImportasset(CancelImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 注销物权
     * Summary: 注销物权
     */
    public CancelImportassetResponse cancelImportassetEx(CancelImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelImportassetResponse());
    }

    /**
     * Description: 冻结物权
     * Summary: 冻结物权
     */
    public FreezeImportassetResponse freezeImportasset(FreezeImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 冻结物权
     * Summary: 冻结物权
     */
    public FreezeImportassetResponse freezeImportassetEx(FreezeImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeImportassetResponse());
    }

    /**
     * Description: 解冻物权
     * Summary: 解冻物权
     */
    public UnfreezeImportassetResponse unfreezeImportasset(UnfreezeImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 解冻物权
     * Summary: 解冻物权
     */
    public UnfreezeImportassetResponse unfreezeImportassetEx(UnfreezeImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeImportassetResponse());
    }

    /**
     * Description: 查询物权
     * Summary: 查询物权
     */
    public QueryImportassetResponse queryImportasset(QueryImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 查询物权
     * Summary: 查询物权
     */
    public QueryImportassetResponse queryImportassetEx(QueryImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImportassetResponse());
    }

    /**
     * Description: 物权列表
     * Summary: 物权列表
     */
    public AllImportassetResponse allImportasset(AllImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 物权列表
     * Summary: 物权列表
     */
    public AllImportassetResponse allImportassetEx(AllImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllImportassetResponse());
    }

    /**
     * Description: 批量查询溯源信息
     * Summary: 批量查询溯源信息
     */
    public BatchqueryImportassetResponse batchqueryImportasset(BatchqueryImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询溯源信息
     * Summary: 批量查询溯源信息
     */
    public BatchqueryImportassetResponse batchqueryImportassetEx(BatchqueryImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryImportassetResponse());
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典
     */
    public CreateTemplateResponse createTemplateEx(CreateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTemplateResponse());
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典
     */
    public UpdateTemplateResponse updateTemplateEx(UpdateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTemplateResponse());
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典
     */
    public QueryTemplateResponse queryTemplate(QueryTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典
     */
    public QueryTemplateResponse queryTemplateEx(QueryTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTemplateResponse());
    }

    /**
     * Description: 数据字典列表信息
     * Summary: 数据字典列表信息
     */
    public AllTemplateResponse allTemplate(AllTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 数据字典列表信息
     * Summary: 数据字典列表信息
     */
    public AllTemplateResponse allTemplateEx(AllTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllTemplateResponse());
    }

    /**
     * Description: 创建验权码
     * Summary: 创建验权码
     */
    public CreateCheckcodeResponse createCheckcode(CreateCheckcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCheckcodeEx(request, headers, runtime);
    }

    /**
     * Description: 创建验权码
     * Summary: 创建验权码
     */
    public CreateCheckcodeResponse createCheckcodeEx(CreateCheckcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.checkcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCheckcodeResponse());
    }

    /**
     * Description: 校验验权码
     * Summary: 校验验权码
     */
    public CheckCheckcodeResponse checkCheckcode(CheckCheckcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCheckcodeEx(request, headers, runtime);
    }

    /**
     * Description: 校验验权码
     * Summary: 校验验权码
     */
    public CheckCheckcodeResponse checkCheckcodeEx(CheckCheckcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.checkcode.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCheckcodeResponse());
    }

    /**
     * Description: 创建质押申请
     * Summary: 创建质押申请
     */
    public CreateAssetpledgeResponse createAssetpledge(CreateAssetpledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAssetpledgeEx(request, headers, runtime);
    }

    /**
     * Description: 创建质押申请
     * Summary: 创建质押申请
     */
    public CreateAssetpledgeResponse createAssetpledgeEx(CreateAssetpledgeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assetpledge.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAssetpledgeResponse());
    }

    /**
     * Description: 质押放款
     * Summary: 质押放款
     */
    public ReleaseAssetpledgeResponse releaseAssetpledge(ReleaseAssetpledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseAssetpledgeEx(request, headers, runtime);
    }

    /**
     * Description: 质押放款
     * Summary: 质押放款
     */
    public ReleaseAssetpledgeResponse releaseAssetpledgeEx(ReleaseAssetpledgeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assetpledge.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseAssetpledgeResponse());
    }

    /**
     * Description: 质押还款
     * Summary: 质押还款
     */
    public RepayAssetpledgeResponse repayAssetpledge(RepayAssetpledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayAssetpledgeEx(request, headers, runtime);
    }

    /**
     * Description: 质押还款
     * Summary: 质押还款
     */
    public RepayAssetpledgeResponse repayAssetpledgeEx(RepayAssetpledgeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assetpledge.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayAssetpledgeResponse());
    }

    /**
     * Description: 查询账户信息
     * Summary: 查询账户信息
     */
    public GetLeagueAccountinfoResponse getLeagueAccountinfo(GetLeagueAccountinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLeagueAccountinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询账户信息
     * Summary: 查询账户信息
     */
    public GetLeagueAccountinfoResponse getLeagueAccountinfoEx(GetLeagueAccountinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.accountinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLeagueAccountinfoResponse());
    }

    /**
     * Description: 登记仓库
     * Summary: 登记仓库
     */
    public CreateWarehouseResponse createWarehouse(CreateWarehouseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWarehouseEx(request, headers, runtime);
    }

    /**
     * Description: 登记仓库
     * Summary: 登记仓库
     */
    public CreateWarehouseResponse createWarehouseEx(CreateWarehouseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWarehouseResponse());
    }

    /**
     * Description: 例举角色类型
     * Summary: 例举角色类型
     */
    public ListLeagueRoleResponse listLeagueRole(ListLeagueRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeagueRoleEx(request, headers, runtime);
    }

    /**
     * Description: 例举角色类型
     * Summary: 例举角色类型
     */
    public ListLeagueRoleResponse listLeagueRoleEx(ListLeagueRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.role.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLeagueRoleResponse());
    }

    /**
     * Description: 查询仓库详细信息
     * Summary: 查询仓库详细信息
     */
    public GetWarehouseResponse getWarehouse(GetWarehouseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWarehouseEx(request, headers, runtime);
    }

    /**
     * Description: 查询仓库详细信息
     * Summary: 查询仓库详细信息
     */
    public GetWarehouseResponse getWarehouseEx(GetWarehouseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWarehouseResponse());
    }

    /**
     * Description: 更新库存信息
     * Summary: 更新库存信息
     */
    public UpdateWarehouseResponse updateWarehouse(UpdateWarehouseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWarehouseEx(request, headers, runtime);
    }

    /**
     * Description: 更新库存信息
     * Summary: 更新库存信息
     */
    public UpdateWarehouseResponse updateWarehouseEx(UpdateWarehouseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWarehouseResponse());
    }

    /**
     * Description: 列举用户仓库列表
     * Summary: 列举用户仓库列表
     */
    public ListWarehouseResponse listWarehouse(ListWarehouseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarehouseEx(request, headers, runtime);
    }

    /**
     * Description: 列举用户仓库列表
     * Summary: 列举用户仓库列表
     */
    public ListWarehouseResponse listWarehouseEx(ListWarehouseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWarehouseResponse());
    }

    /**
     * Description: 例举联盟
     * Summary: 例举联盟
     */
    public ListLeagueResponse listLeague(ListLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 例举联盟
     * Summary: 例举联盟
     */
    public ListLeagueResponse listLeagueEx(ListLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLeagueResponse());
    }

    /**
     * Description: 列举某个仓库/仓位下的设备信息
     * Summary: 列举某个仓库/仓位下的设备信息
     */
    public QueryWarehouseDeviceResponse queryWarehouseDevice(QueryWarehouseDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWarehouseDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 列举某个仓库/仓位下的设备信息
     * Summary: 列举某个仓库/仓位下的设备信息
     */
    public QueryWarehouseDeviceResponse queryWarehouseDeviceEx(QueryWarehouseDeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.device.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWarehouseDeviceResponse());
    }

    /**
     * Description: 创建联盟申请
     * Summary: 创建联盟申请
     */
    public CreateLeagueApplyResponse createLeagueApply(CreateLeagueApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeagueApplyEx(request, headers, runtime);
    }

    /**
     * Description: 创建联盟申请
     * Summary: 创建联盟申请
     */
    public CreateLeagueApplyResponse createLeagueApplyEx(CreateLeagueApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.apply.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeagueApplyResponse());
    }

    /**
     * Description: 提交入盟申请
     * Summary: 提交入盟申请
     */
    public CreateLeagueJoinapplyResponse createLeagueJoinapply(CreateLeagueJoinapplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeagueJoinapplyEx(request, headers, runtime);
    }

    /**
     * Description: 提交入盟申请
     * Summary: 提交入盟申请
     */
    public CreateLeagueJoinapplyResponse createLeagueJoinapplyEx(CreateLeagueJoinapplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.joinapply.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeagueJoinapplyResponse());
    }

    /**
     * Description: 撤销入盟申请
     * Summary: 撤销入盟申请
     */
    public CancelLeagueApplyResponse cancelLeagueApply(CancelLeagueApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLeagueApplyEx(request, headers, runtime);
    }

    /**
     * Description: 撤销入盟申请
     * Summary: 撤销入盟申请
     */
    public CancelLeagueApplyResponse cancelLeagueApplyEx(CancelLeagueApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.apply.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelLeagueApplyResponse());
    }

    /**
     * Description: 列举仓库下的库位列表
     * Summary: 列举仓库下的库位列表
     */
    public QueryWarehouseStoragelocationResponse queryWarehouseStoragelocation(QueryWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description: 列举仓库下的库位列表
     * Summary: 列举仓库下的库位列表
     */
    public QueryWarehouseStoragelocationResponse queryWarehouseStoragelocationEx(QueryWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWarehouseStoragelocationResponse());
    }

    /**
     * Description: 盟主审核入盟申请
     * Summary: 盟主审核入盟申请
     */
    public AuthLeagueApplyResponse authLeagueApply(AuthLeagueApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authLeagueApplyEx(request, headers, runtime);
    }

    /**
     * Description: 盟主审核入盟申请
     * Summary: 盟主审核入盟申请
     */
    public AuthLeagueApplyResponse authLeagueApplyEx(AuthLeagueApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.apply.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthLeagueApplyResponse());
    }

    /**
     * Description: 删除仓库
     * Summary: 删除仓库
     */
    public DeleteWarehouseResponse deleteWarehouse(DeleteWarehouseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWarehouseEx(request, headers, runtime);
    }

    /**
     * Description: 删除仓库
     * Summary: 删除仓库
     */
    public DeleteWarehouseResponse deleteWarehouseEx(DeleteWarehouseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteWarehouseResponse());
    }

    /**
     * Description: 例举入盟申请
     * Summary: 例举入盟申请
     */
    public ListLeagueApplyResponse listLeagueApply(ListLeagueApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeagueApplyEx(request, headers, runtime);
    }

    /**
     * Description: 例举入盟申请
     * Summary: 例举入盟申请
     */
    public ListLeagueApplyResponse listLeagueApplyEx(ListLeagueApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.league.apply.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLeagueApplyResponse());
    }

    /**
     * Description: 登记库位信息
     * Summary: 登记库位信息
     */
    public CreateWarehouseStoraglocationResponse createWarehouseStoraglocation(CreateWarehouseStoraglocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWarehouseStoraglocationEx(request, headers, runtime);
    }

    /**
     * Description: 登记库位信息
     * Summary: 登记库位信息
     */
    public CreateWarehouseStoraglocationResponse createWarehouseStoraglocationEx(CreateWarehouseStoraglocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storaglocation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWarehouseStoraglocationResponse());
    }

    /**
     * Description: 查询库位详细信息
     * Summary: 查询库位详细信息
     */
    public GetWarehouseStoragelocationResponse getWarehouseStoragelocation(GetWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description: 查询库位详细信息
     * Summary: 查询库位详细信息
     */
    public GetWarehouseStoragelocationResponse getWarehouseStoragelocationEx(GetWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWarehouseStoragelocationResponse());
    }

    /**
     * Description:  更新库位信息
     * Summary:  更新库位信息
     */
    public UpdateWarehouseStoragelocationResponse updateWarehouseStoragelocation(UpdateWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description:  更新库位信息
     * Summary:  更新库位信息
     */
    public UpdateWarehouseStoragelocationResponse updateWarehouseStoragelocationEx(UpdateWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWarehouseStoragelocationResponse());
    }

    /**
     * Description: 列举用户库位列表
     * Summary: 列举用户库位列表
     */
    public BatchqueryWarehouseStoragelocationResponse batchqueryWarehouseStoragelocation(BatchqueryWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description: 列举用户库位列表
     * Summary: 列举用户库位列表
     */
    public BatchqueryWarehouseStoragelocationResponse batchqueryWarehouseStoragelocationEx(BatchqueryWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryWarehouseStoragelocationResponse());
    }

    /**
     * Description: 列举仓库下某状态的库位列表
     * Summary: 列举仓库下某状态的库位列表
     */
    public ListWarehouseStoragelocationResponse listWarehouseStoragelocation(ListWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description: 列举仓库下某状态的库位列表
     * Summary: 列举仓库下某状态的库位列表
     */
    public ListWarehouseStoragelocationResponse listWarehouseStoragelocationEx(ListWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWarehouseStoragelocationResponse());
    }

    /**
     * Description: 删除库位
     * Summary: 删除库位
     */
    public DeleteWarehouseStoragelocationResponse deleteWarehouseStoragelocation(DeleteWarehouseStoragelocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWarehouseStoragelocationEx(request, headers, runtime);
    }

    /**
     * Description: 删除库位
     * Summary: 删除库位
     */
    public DeleteWarehouseStoragelocationResponse deleteWarehouseStoragelocationEx(DeleteWarehouseStoragelocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteWarehouseStoragelocationResponse());
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典
     */
    public CreateAssettemplateResponse createAssettemplate(CreateAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典
     */
    public CreateAssettemplateResponse createAssettemplateEx(CreateAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAssettemplateResponse());
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典
     */
    public UpdateAssettemplateResponse updateAssettemplate(UpdateAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典
     */
    public UpdateAssettemplateResponse updateAssettemplateEx(UpdateAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAssettemplateResponse());
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典
     */
    public GetAssettemplateResponse getAssettemplate(GetAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典
     */
    public GetAssettemplateResponse getAssettemplateEx(GetAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAssettemplateResponse());
    }

    /**
     * Description: 列举数据字典
     * Summary: 列举数据字典
     */
    public ListAssettemplateResponse listAssettemplate(ListAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 列举数据字典
     * Summary: 列举数据字典
     */
    public ListAssettemplateResponse listAssettemplateEx(ListAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAssettemplateResponse());
    }

    /**
     * Description: 删除数据字典
     * Summary: 删除数据字典
     */
    public DeleteAssettemplateResponse deleteAssettemplate(DeleteAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 删除数据字典
     * Summary: 删除数据字典
     */
    public DeleteAssettemplateResponse deleteAssettemplateEx(DeleteAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAssettemplateResponse());
    }

    /**
     * Description: 生效/失效数据字典
     * Summary: 生效/失效数据字典
     */
    public EnableAssettemplateResponse enableAssettemplate(EnableAssettemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableAssettemplateEx(request, headers, runtime);
    }

    /**
     * Description: 生效/失效数据字典
     * Summary: 生效/失效数据字典
     */
    public EnableAssettemplateResponse enableAssettemplateEx(EnableAssettemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.assettemplate.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableAssettemplateResponse());
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件
     */
    public UpdateDocumentFileResponse updateDocumentFile(UpdateDocumentFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDocumentFileEx(request, headers, runtime);
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件
     */
    public UpdateDocumentFileResponse updateDocumentFileEx(UpdateDocumentFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.document.file.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDocumentFileResponse());
    }

    /**
     * Description: 根据文件id查找文件
     * Summary: 根据文件id查找文件
     */
    public GetDocumentFileResponse getDocumentFile(GetDocumentFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentFileEx(request, headers, runtime);
    }

    /**
     * Description: 根据文件id查找文件
     * Summary: 根据文件id查找文件
     */
    public GetDocumentFileResponse getDocumentFileEx(GetDocumentFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.document.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDocumentFileResponse());
    }

    /**
     * Description: 用户注销
     * Summary: 用户注销
     */
    public CancelUserResponse cancelUser(CancelUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelUserEx(request, headers, runtime);
    }

    /**
     * Description: 用户注销
     * Summary: 用户注销
     */
    public CancelUserResponse cancelUserEx(CancelUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.user.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelUserResponse());
    }

    /**
     * Description: 更新用户信息
     * Summary: 更新用户信息
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserEx(request, headers, runtime);
    }

    /**
     * Description: 更新用户信息
     * Summary: 更新用户信息
     */
    public UpdateUserResponse updateUserEx(UpdateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUserResponse());
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表
     */
    public ListUserResponse listUser(ListUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表
     */
    public ListUserResponse listUserEx(ListUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.user.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUserResponse());
    }

    /**
     * Description: 映射用户信息
     * Summary: 映射用户信息
     */
    public MountUserResponse mountUser(MountUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountUserEx(request, headers, runtime);
    }

    /**
     * Description: 映射用户信息
     * Summary: 映射用户信息
     */
    public MountUserResponse mountUserEx(MountUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.user.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountUserResponse());
    }

    /**
     * Description: 批量创建物权
     * Summary: 批量创建物权
     */
    public BatchcreateImportassetResponse batchcreateImportasset(BatchcreateImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建物权
     * Summary: 批量创建物权
     */
    public BatchcreateImportassetResponse batchcreateImportassetEx(BatchcreateImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateImportassetResponse());
    }

    /**
     * Description: 添加物权描述信息
     * Summary: 添加物权描述信息
     */
    public DescribeImportassetResponse describeImportasset(DescribeImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 添加物权描述信息
     * Summary: 添加物权描述信息
     */
    public DescribeImportassetResponse describeImportassetEx(DescribeImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeImportassetResponse());
    }

    /**
     * Description: 批量冻结
     * Summary: 批量冻结
     */
    public BatchfreezeImportassetResponse batchfreezeImportasset(BatchfreezeImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchfreezeImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 批量冻结
     * Summary: 批量冻结
     */
    public BatchfreezeImportassetResponse batchfreezeImportassetEx(BatchfreezeImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.batchfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchfreezeImportassetResponse());
    }

    /**
     * Description: 物权批量解冻
     * Summary: 物权批量解冻
     */
    public BatchunfreezeImportassetResponse batchunfreezeImportasset(BatchunfreezeImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchunfreezeImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 物权批量解冻
     * Summary: 物权批量解冻
     */
    public BatchunfreezeImportassetResponse batchunfreezeImportassetEx(BatchunfreezeImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.batchunfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchunfreezeImportassetResponse());
    }

    /**
     * Description: 物权批量撤销
     * Summary: 物权批量撤销
     */
    public BatchcancelImportassetResponse batchcancelImportasset(BatchcancelImportassetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcancelImportassetEx(request, headers, runtime);
    }

    /**
     * Description: 物权批量撤销
     * Summary: 物权批量撤销
     */
    public BatchcancelImportassetResponse batchcancelImportassetEx(BatchcancelImportassetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.importasset.batchcancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcancelImportassetResponse());
    }

    /**
     * Description: 批量创建转让申请
     * Summary: 批量创建转让申请
     */
    public BatchcreateTransferResponse batchcreateTransfer(BatchcreateTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateTransferEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建转让申请
     * Summary: 批量创建转让申请
     */
    public BatchcreateTransferResponse batchcreateTransferEx(BatchcreateTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.transfer.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateTransferResponse());
    }

    /**
     * Description: 创建分润比例配置
     * Summary: 创建分润比例配置
     */
    public CreateCmportProfitrateResponse createCmportProfitrate(CreateCmportProfitrateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCmportProfitrateEx(request, headers, runtime);
    }

    /**
     * Description: 创建分润比例配置
     * Summary: 创建分润比例配置
     */
    public CreateCmportProfitrateResponse createCmportProfitrateEx(CreateCmportProfitrateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.profitrate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCmportProfitrateResponse());
    }

    /**
     * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
     * Summary: 融资申请信息落地到区块链
     */
    public ApplyCmportFinanceResponse applyCmportFinance(ApplyCmportFinanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCmportFinanceEx(request, headers, runtime);
    }

    /**
     * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
     * Summary: 融资申请信息落地到区块链
     */
    public ApplyCmportFinanceResponse applyCmportFinanceEx(ApplyCmportFinanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.finance.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCmportFinanceResponse());
    }

    /**
     * Description: 分润对账，企业到当前记账日期的累计利润信息
     * Summary: 企业分润对账单
     */
    public ListCmportEnterprisestatementResponse listCmportEnterprisestatement(ListCmportEnterprisestatementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCmportEnterprisestatementEx(request, headers, runtime);
    }

    /**
     * Description: 分润对账，企业到当前记账日期的累计利润信息
     * Summary: 企业分润对账单
     */
    public ListCmportEnterprisestatementResponse listCmportEnterprisestatementEx(ListCmportEnterprisestatementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.enterprisestatement.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCmportEnterprisestatementResponse());
    }

    /**
     * Description: 用户对账单
     * Summary: 用户对账单
     */
    public ListCmportUserstatementResponse listCmportUserstatement(ListCmportUserstatementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCmportUserstatementEx(request, headers, runtime);
    }

    /**
     * Description: 用户对账单
     * Summary: 用户对账单
     */
    public ListCmportUserstatementResponse listCmportUserstatementEx(ListCmportUserstatementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.userstatement.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCmportUserstatementResponse());
    }

    /**
     * Description: 用户明细清单
     * Summary: 用户明细清单
     */
    public ListCmportUserprofitResponse listCmportUserprofit(ListCmportUserprofitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCmportUserprofitEx(request, headers, runtime);
    }

    /**
     * Description: 用户明细清单
     * Summary: 用户明细清单
     */
    public ListCmportUserprofitResponse listCmportUserprofitEx(ListCmportUserprofitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.userprofit.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCmportUserprofitResponse());
    }

    /**
     * Description: 还款本息查询
     * Summary: 还款本息查询
     */
    public QueryCmportBankfeeResponse queryCmportBankfee(QueryCmportBankfeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCmportBankfeeEx(request, headers, runtime);
    }

    /**
     * Description: 还款本息查询
     * Summary: 还款本息查询
     */
    public QueryCmportBankfeeResponse queryCmportBankfeeEx(QueryCmportBankfeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.bankfee.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCmportBankfeeResponse());
    }

    /**
     * Description: 创建分润归属配置
     * Summary: 创建分润归属配置
     */
    public CreateCmportProfitpartnerResponse createCmportProfitpartner(CreateCmportProfitpartnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCmportProfitpartnerEx(request, headers, runtime);
    }

    /**
     * Description: 创建分润归属配置
     * Summary: 创建分润归属配置
     */
    public CreateCmportProfitpartnerResponse createCmportProfitpartnerEx(CreateCmportProfitpartnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.profitpartner.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCmportProfitpartnerResponse());
    }

    /**
     * Description: 监管方（粮达网）撤销融资申请
     * Summary: 撤销融资申请
     */
    public CancelCmportFinanceResponse cancelCmportFinance(CancelCmportFinanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelCmportFinanceEx(request, headers, runtime);
    }

    /**
     * Description: 监管方（粮达网）撤销融资申请
     * Summary: 撤销融资申请
     */
    public CancelCmportFinanceResponse cancelCmportFinanceEx(CancelCmportFinanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.finance.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelCmportFinanceResponse());
    }

    /**
     * Description: 银行融资审核结果同步
     * Summary: 银行融资审核结果同步
     */
    public NotifyCmportBankResponse notifyCmportBank(NotifyCmportBankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyCmportBankEx(request, headers, runtime);
    }

    /**
     * Description: 银行融资审核结果同步
     * Summary: 银行融资审核结果同步
     */
    public NotifyCmportBankResponse notifyCmportBankEx(NotifyCmportBankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.bank.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyCmportBankResponse());
    }

    /**
     * Description: 银行放款结果同步给区块链
     * Summary: 银行放款结果同步给区块链
     */
    public NotifyCmportLoanResponse notifyCmportLoan(NotifyCmportLoanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyCmportLoanEx(request, headers, runtime);
    }

    /**
     * Description: 银行放款结果同步给区块链
     * Summary: 银行放款结果同步给区块链
     */
    public NotifyCmportLoanResponse notifyCmportLoanEx(NotifyCmportLoanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.loan.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyCmportLoanResponse());
    }

    /**
     * Description: 还款结果同步给区块链
     * Summary: 还款结果同步给区块链
     */
    public NotifyCmportRepayResponse notifyCmportRepay(NotifyCmportRepayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyCmportRepayEx(request, headers, runtime);
    }

    /**
     * Description: 还款结果同步给区块链
     * Summary: 还款结果同步给区块链
     */
    public NotifyCmportRepayResponse notifyCmportRepayEx(NotifyCmportRepayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.repay.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyCmportRepayResponse());
    }

    /**
     * Description: 还款本息查询-分页
     * Summary: 还款本息查询-分页
     */
    public ListCmportBankfeeResponse listCmportBankfee(ListCmportBankfeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCmportBankfeeEx(request, headers, runtime);
    }

    /**
     * Description: 还款本息查询-分页
     * Summary: 还款本息查询-分页
     */
    public ListCmportBankfeeResponse listCmportBankfeeEx(ListCmportBankfeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.bankfee.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCmportBankfeeResponse());
    }

    /**
     * Description: 物流轨迹同步给区块链
     * Summary: 物流轨迹同步给区块链
     */
    public NotifyCmportLogisticsResponse notifyCmportLogistics(NotifyCmportLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyCmportLogisticsEx(request, headers, runtime);
    }

    /**
     * Description: 物流轨迹同步给区块链
     * Summary: 物流轨迹同步给区块链
     */
    public NotifyCmportLogisticsResponse notifyCmportLogisticsEx(NotifyCmportLogisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.propertychain.cmport.logistics.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyCmportLogisticsResponse());
    }
}
