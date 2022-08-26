// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models.*;
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
                    new TeaPair("sdk_version", "1.0.0"),
                    new TeaPair("_prod_code", "ak_122342269ba34053ab6e5304d82e7358"),
                    new TeaPair("_prod_channel", "saas")
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
     * Description: 授权跨链数据访问
     * Summary: 授权跨链数据访问
     */
    public StartBaasOdatsAccesschainAuthorizeResponse startBaasOdatsAccesschainAuthorize(StartBaasOdatsAccesschainAuthorizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: 授权跨链数据访问
     * Summary: 授权跨链数据访问
     */
    public StartBaasOdatsAccesschainAuthorizeResponse startBaasOdatsAccesschainAuthorizeEx(StartBaasOdatsAccesschainAuthorizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.accesschain.authorize.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasOdatsAccesschainAuthorizeResponse());
    }

    /**
     * Description: 更新跨链数据访问权限
     * Summary: 更新跨链数据访问权限
     */
    public UpdateBaasOdatsAccesschainAuthorizeResponse updateBaasOdatsAccesschainAuthorize(UpdateBaasOdatsAccesschainAuthorizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: 更新跨链数据访问权限
     * Summary: 更新跨链数据访问权限
     */
    public UpdateBaasOdatsAccesschainAuthorizeResponse updateBaasOdatsAccesschainAuthorizeEx(UpdateBaasOdatsAccesschainAuthorizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.accesschain.authorize.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasOdatsAccesschainAuthorizeResponse());
    }

    /**
     * Description: 获取链授权访问的链列表
     * Summary: 获取链授权访问的链列表
     */
    public ListBaasOdatsAccesschainAuthorizedResponse listBaasOdatsAccesschainAuthorized(ListBaasOdatsAccesschainAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsAccesschainAuthorizedEx(request, headers, runtime);
    }

    /**
     * Description: 获取链授权访问的链列表
     * Summary: 获取链授权访问的链列表
     */
    public ListBaasOdatsAccesschainAuthorizedResponse listBaasOdatsAccesschainAuthorizedEx(ListBaasOdatsAccesschainAuthorizedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.accesschain.authorized.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsAccesschainAuthorizedResponse());
    }

    /**
     * Description: 查询被授权访问数据的映射关系列表
     * Summary: 查询被授权访问数据的映射关系列表
     */
    public ListBaasOdatsAccesschainGrantedResponse listBaasOdatsAccesschainGranted(ListBaasOdatsAccesschainGrantedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsAccesschainGrantedEx(request, headers, runtime);
    }

    /**
     * Description: 查询被授权访问数据的映射关系列表
     * Summary: 查询被授权访问数据的映射关系列表
     */
    public ListBaasOdatsAccesschainGrantedResponse listBaasOdatsAccesschainGrantedEx(ListBaasOdatsAccesschainGrantedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.accesschain.granted.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsAccesschainGrantedResponse());
    }

    /**
     * Description: 获取指定链提供的可访问的资源类型
     * Summary: 获取指定链提供的可访问的资源类型
     */
    public ListBaasOdatsAccesschainResourcetypeResponse listBaasOdatsAccesschainResourcetype(ListBaasOdatsAccesschainResourcetypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsAccesschainResourcetypeEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定链提供的可访问的资源类型
     * Summary: 获取指定链提供的可访问的资源类型
     */
    public ListBaasOdatsAccesschainResourcetypeResponse listBaasOdatsAccesschainResourcetypeEx(ListBaasOdatsAccesschainResourcetypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.accesschain.resourcetype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsAccesschainResourcetypeResponse());
    }

    /**
     * Description: 撤销跨链访问数据/调用权限
     * Summary: 撤销跨链访问数据/调用权限
     */
    public DisableBaasOdatsAclResponse disableBaasOdatsAcl(DisableBaasOdatsAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableBaasOdatsAclEx(request, headers, runtime);
    }

    /**
     * Description: 撤销跨链访问数据/调用权限
     * Summary: 撤销跨链访问数据/调用权限
     */
    public DisableBaasOdatsAclResponse disableBaasOdatsAclEx(DisableBaasOdatsAclRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.acl.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableBaasOdatsAclResponse());
    }

    /**
     * Description: 查询用户是否已经开通odats服务
     * Summary: 查询用户是否已经开通odats服务
     */
    public QueryBaasOdatsActivestatusResponse queryBaasOdatsActivestatus(QueryBaasOdatsActivestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsActivestatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户是否已经开通odats服务
     * Summary: 查询用户是否已经开通odats服务
     */
    public QueryBaasOdatsActivestatusResponse queryBaasOdatsActivestatusEx(QueryBaasOdatsActivestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.activestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsActivestatusResponse());
    }

    /**
     * Description: 查询用户是否已经同意odats服务协议
     * Summary: 查询用户是否已经同意odats服务协议
     */
    public QueryBaasOdatsAgreementResponse queryBaasOdatsAgreement(QueryBaasOdatsAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户是否已经同意odats服务协议
     * Summary: 查询用户是否已经同意odats服务协议
     */
    public QueryBaasOdatsAgreementResponse queryBaasOdatsAgreementEx(QueryBaasOdatsAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsAgreementResponse());
    }

    /**
     * Description: 用户同意授权之后保持状态
     * Summary: 用户同意授权之后保持状态
     */
    public SaveBaasOdatsAgreementResponse saveBaasOdatsAgreement(SaveBaasOdatsAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBaasOdatsAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 用户同意授权之后保持状态
     * Summary: 用户同意授权之后保持状态
     */
    public SaveBaasOdatsAgreementResponse saveBaasOdatsAgreementEx(SaveBaasOdatsAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.agreement.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBaasOdatsAgreementResponse());
    }

    /**
     * Description: 查询注册的链的基本信息
     * Summary: 查询注册的链的基本信息
     */
    public QueryBaasOdatsBlockchainBaseinfoResponse queryBaasOdatsBlockchainBaseinfo(QueryBaasOdatsBlockchainBaseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsBlockchainBaseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询注册的链的基本信息
     * Summary: 查询注册的链的基本信息
     */
    public QueryBaasOdatsBlockchainBaseinfoResponse queryBaasOdatsBlockchainBaseinfoEx(QueryBaasOdatsBlockchainBaseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.blockchain.baseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsBlockchainBaseinfoResponse());
    }

    /**
     * Description: 获取跨链合约信息
     * Summary: 获取跨链合约信息
     */
    public QueryBaasOdatsBlockchainContractinfoResponse queryBaasOdatsBlockchainContractinfo(QueryBaasOdatsBlockchainContractinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsBlockchainContractinfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取跨链合约信息
     * Summary: 获取跨链合约信息
     */
    public QueryBaasOdatsBlockchainContractinfoResponse queryBaasOdatsBlockchainContractinfoEx(QueryBaasOdatsBlockchainContractinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.blockchain.contractinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsBlockchainContractinfoResponse());
    }

    /**
     * Description: 更新跨链访问权限
     * Summary: 更新跨链访问权限
     */
    public UpdateBaasOdatsCrosschaimAuthorizeResponse updateBaasOdatsCrosschaimAuthorize(UpdateBaasOdatsCrosschaimAuthorizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasOdatsCrosschaimAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: 更新跨链访问权限
     * Summary: 更新跨链访问权限
     */
    public UpdateBaasOdatsCrosschaimAuthorizeResponse updateBaasOdatsCrosschaimAuthorizeEx(UpdateBaasOdatsCrosschaimAuthorizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.crosschaim.authorize.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasOdatsCrosschaimAuthorizeResponse());
    }

    /**
     * Description: 授权跨链合约调用权限
     * Summary: 授权跨链合约调用权限
     */
    public StartBaasOdatsCrosschainAuthorizeResponse startBaasOdatsCrosschainAuthorize(StartBaasOdatsCrosschainAuthorizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasOdatsCrosschainAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: 授权跨链合约调用权限
     * Summary: 授权跨链合约调用权限
     */
    public StartBaasOdatsCrosschainAuthorizeResponse startBaasOdatsCrosschainAuthorizeEx(StartBaasOdatsCrosschainAuthorizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.crosschain.authorize.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasOdatsCrosschainAuthorizeResponse());
    }

    /**
     * Description: 获取指定自有链已授权的信息列表
     * Summary: 获取指定自有链已授权的信息列表
     */
    public ListBaasOdatsCrosschainAuthorizedResponse listBaasOdatsCrosschainAuthorized(ListBaasOdatsCrosschainAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsCrosschainAuthorizedEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定自有链已授权的信息列表
     * Summary: 获取指定自有链已授权的信息列表
     */
    public ListBaasOdatsCrosschainAuthorizedResponse listBaasOdatsCrosschainAuthorizedEx(ListBaasOdatsCrosschainAuthorizedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.crosschain.authorized.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsCrosschainAuthorizedResponse());
    }

    /**
     * Description: 获取目标链被授权的映射关系列表
     * Summary: 获取目标链被授权的映射关系列表
     */
    public ListBaasOdatsCrosschainGrantedResponse listBaasOdatsCrosschainGranted(ListBaasOdatsCrosschainGrantedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsCrosschainGrantedEx(request, headers, runtime);
    }

    /**
     * Description: 获取目标链被授权的映射关系列表
     * Summary: 获取目标链被授权的映射关系列表
     */
    public ListBaasOdatsCrosschainGrantedResponse listBaasOdatsCrosschainGrantedEx(ListBaasOdatsCrosschainGrantedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.crosschain.granted.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsCrosschainGrantedResponse());
    }

    /**
     * Description: 获取域名证书
     * Summary: 获取域名证书
     */
    public QueryBaasOdatsDomaincertResponse queryBaasOdatsDomaincert(QueryBaasOdatsDomaincertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsDomaincertEx(request, headers, runtime);
    }

    /**
     * Description: 获取域名证书
     * Summary: 获取域名证书
     */
    public QueryBaasOdatsDomaincertResponse queryBaasOdatsDomaincertEx(QueryBaasOdatsDomaincertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.domaincert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsDomaincertResponse());
    }

    /**
     * Description: 查询跨链合约
     * Summary: 查询跨链CC
     */
    public QueryBaasOdatsFabricCcResponse queryBaasOdatsFabricCc(QueryBaasOdatsFabricCcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsFabricCcEx(request, headers, runtime);
    }

    /**
     * Description: 查询跨链合约
     * Summary: 查询跨链CC
     */
    public QueryBaasOdatsFabricCcResponse queryBaasOdatsFabricCcEx(QueryBaasOdatsFabricCcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.fabric.cc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsFabricCcResponse());
    }

    /**
     * Description: 查询fabric CC的oss路径
     * Summary: 查询fabric CC的oss路径
     */
    public QueryBaasOdatsFabricChaincodepathResponse queryBaasOdatsFabricChaincodepath(QueryBaasOdatsFabricChaincodepathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsFabricChaincodepathEx(request, headers, runtime);
    }

    /**
     * Description: 查询fabric CC的oss路径
     * Summary: 查询fabric CC的oss路径
     */
    public QueryBaasOdatsFabricChaincodepathResponse queryBaasOdatsFabricChaincodepathEx(QueryBaasOdatsFabricChaincodepathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.fabric.chaincodepath.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsFabricChaincodepathResponse());
    }

    /**
     * Description: 处理fabric配置文件
     * Summary: 处理fabric配置文件
     */
    public StartBaasOdatsFabricConfigyamlResponse startBaasOdatsFabricConfigyaml(StartBaasOdatsFabricConfigyamlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasOdatsFabricConfigyamlEx(request, headers, runtime);
    }

    /**
     * Description: 处理fabric配置文件
     * Summary: 处理fabric配置文件
     */
    public StartBaasOdatsFabricConfigyamlResponse startBaasOdatsFabricConfigyamlEx(StartBaasOdatsFabricConfigyamlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.fabric.configyaml.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasOdatsFabricConfigyamlResponse());
    }

    /**
     * Description: 注册fabric链
     * Summary: 注册fabric链
     */
    public StartBaasOdatsFabricResponse startBaasOdatsFabric(StartBaasOdatsFabricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasOdatsFabricEx(request, headers, runtime);
    }

    /**
     * Description: 注册fabric链
     * Summary: 注册fabric链
     */
    public StartBaasOdatsFabricResponse startBaasOdatsFabricEx(StartBaasOdatsFabricRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.fabric.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasOdatsFabricResponse());
    }

    /**
     * Description: 向odats注册mychain链
     * Summary: 向odats注册mychain链
     */
    public StartBaasOdatsMychainResponse startBaasOdatsMychain(StartBaasOdatsMychainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasOdatsMychainEx(request, headers, runtime);
    }

    /**
     * Description: 向odats注册mychain链
     * Summary: 向odats注册mychain链
     */
    public StartBaasOdatsMychainResponse startBaasOdatsMychainEx(StartBaasOdatsMychainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.mychain.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasOdatsMychainResponse());
    }

    /**
     * Description: 查询注册的blockchain列表
     * Summary: 查询注册的blockchain列表
     */
    public ListBaasOdatsRegisteredblockchainResponse listBaasOdatsRegisteredblockchain(ListBaasOdatsRegisteredblockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBaasOdatsRegisteredblockchainEx(request, headers, runtime);
    }

    /**
     * Description: 查询注册的blockchain列表
     * Summary: 查询注册的blockchain列表
     */
    public ListBaasOdatsRegisteredblockchainResponse listBaasOdatsRegisteredblockchainEx(ListBaasOdatsRegisteredblockchainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.registeredblockchain.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBaasOdatsRegisteredblockchainResponse());
    }

    /**
     * Description: 获取udns证书
     * Summary: 获取udns证书
     */
    public QueryBaasOdatsUdnscertResponse queryBaasOdatsUdnscert(QueryBaasOdatsUdnscertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasOdatsUdnscertEx(request, headers, runtime);
    }

    /**
     * Description: 获取udns证书
     * Summary: 获取udns证书
     */
    public QueryBaasOdatsUdnscertResponse queryBaasOdatsUdnscertEx(QueryBaasOdatsUdnscertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.odats.udnscert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasOdatsUdnscertResponse());
    }
}
