// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.goodschain.models.*;
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
                    new TeaPair("sdk_version", "1.0.4")
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
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.league.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeagueResponse());
    }

    /**
     * Description: 注销联盟
     * Summary: 注销联盟
     */
    public CancelLeagueResponse cancelLeague(CancelLeagueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLeagueEx(request, headers, runtime);
    }

    /**
     * Description: 注销联盟
     * Summary: 注销联盟
     */
    public CancelLeagueResponse cancelLeagueEx(CancelLeagueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.league.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelLeagueResponse());
    }

    /**
     * Description: 创建用户
     * Summary: 创建用户
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserEx(request, headers, runtime);
    }

    /**
     * Description: 创建用户
     * Summary: 创建用户
     */
    public CreateUserResponse createUserEx(CreateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserResponse());
    }

    /**
     * Description: 更新用户
     * Summary: 更新用户
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserEx(request, headers, runtime);
    }

    /**
     * Description: 更新用户
     * Summary: 更新用户
     */
    public UpdateUserResponse updateUserEx(UpdateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUserResponse());
    }

    /**
     * Description: 渠道用户绑定
     * Summary: 渠道用户绑定
     */
    public BindUserResponse bindUser(BindUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindUserEx(request, headers, runtime);
    }

    /**
     * Description: 渠道用户绑定
     * Summary: 渠道用户绑定
     */
    public BindUserResponse bindUserEx(BindUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.user.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindUserResponse());
    }

    /**
     * Description: 渠道用户解绑
     * Summary: 渠道用户解绑
     */
    public UnbindUserResponse unbindUser(UnbindUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindUserEx(request, headers, runtime);
    }

    /**
     * Description: 渠道用户解绑
     * Summary: 渠道用户解绑
     */
    public UnbindUserResponse unbindUserEx(UnbindUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.user.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindUserResponse());
    }

    /**
     * Description: 链上商品模版定义
     * Summary: 链上商品模版定义
     */
    public CreateGoodstemplateResponse createGoodstemplate(CreateGoodstemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGoodstemplateEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品模版定义
     * Summary: 链上商品模版定义
     */
    public CreateGoodstemplateResponse createGoodstemplateEx(CreateGoodstemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goodstemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGoodstemplateResponse());
    }

    /**
     * Description: 链上商品模版更新
     * Summary: 链上商品模版更新
     */
    public UpdateGoodstemplateResponse updateGoodstemplate(UpdateGoodstemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGoodstemplateEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品模版更新
     * Summary: 链上商品模版更新
     */
    public UpdateGoodstemplateResponse updateGoodstemplateEx(UpdateGoodstemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goodstemplate.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGoodstemplateResponse());
    }

    /**
     * Description: 链上商品模版注销
     * Summary: 链上商品模版注销
     */
    public CancelGoodstemplateResponse cancelGoodstemplate(CancelGoodstemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelGoodstemplateEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品模版注销
     * Summary: 链上商品模版注销
     */
    public CancelGoodstemplateResponse cancelGoodstemplateEx(CancelGoodstemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goodstemplate.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelGoodstemplateResponse());
    }

    /**
     * Description: 链上商品模版查询
     * Summary: 链上商品模版查询
     */
    public QueryGoodstemplateResponse queryGoodstemplate(QueryGoodstemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodstemplateEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品模版查询
     * Summary: 链上商品模版查询
     */
    public QueryGoodstemplateResponse queryGoodstemplateEx(QueryGoodstemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goodstemplate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodstemplateResponse());
    }

    /**
     * Description: 链上商品发行
     * Summary: 链上商品发行
     */
    public CreateGoodsResponse createGoods(CreateGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品发行
     * Summary: 链上商品发行
     */
    public CreateGoodsResponse createGoodsEx(CreateGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGoodsResponse());
    }

    /**
     * Description: 链上商品更新
     * Summary: 链上商品更新
     */
    public UpdateGoodsResponse updateGoods(UpdateGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品更新
     * Summary: 链上商品更新
     */
    public UpdateGoodsResponse updateGoodsEx(UpdateGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGoodsResponse());
    }

    /**
     * Description: 链上商品转增
     * Summary: 链上商品转增
     */
    public SendGoodsResponse sendGoods(SendGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品转增
     * Summary: 链上商品转增
     */
    public SendGoodsResponse sendGoodsEx(SendGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendGoodsResponse());
    }

    /**
     * Description: 链上商品详情查询
     * Summary: 链上商品详情查询
     */
    public QueryGoodsResponse queryGoods(QueryGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品详情查询
     * Summary: 链上商品详情查询
     */
    public QueryGoodsResponse queryGoodsEx(QueryGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodsResponse());
    }

    /**
     * Description: 链上商品列表查询
     * Summary: 链上商品列表查询
     */
    public PagequeryGoodsResponse pagequeryGoods(PagequeryGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 链上商品列表查询
     * Summary: 链上商品列表查询
     */
    public PagequeryGoodsResponse pagequeryGoodsEx(PagequeryGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryGoodsResponse());
    }

    /**
     * Description: 自定义链上商品操作节点
     * Summary: 自定义链上商品操作节点
     */
    public CreateGoodsOperateResponse createGoodsOperate(CreateGoodsOperateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGoodsOperateEx(request, headers, runtime);
    }

    /**
     * Description: 自定义链上商品操作节点
     * Summary: 自定义链上商品操作节点
     */
    public CreateGoodsOperateResponse createGoodsOperateEx(CreateGoodsOperateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.operate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGoodsOperateResponse());
    }

    /**
     * Description: 商品交收核销
     * Summary: 商品交收核销
     */
    public CancelGoodsResponse cancelGoods(CancelGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 商品交收核销
     * Summary: 商品交收核销
     */
    public CancelGoodsResponse cancelGoodsEx(CancelGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelGoodsResponse());
    }

    /**
     * Description: 商品异常处置
     * Summary: 商品异常处置
     */
    public DisableGoodsResponse disableGoods(DisableGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 商品异常处置
     * Summary: 商品异常处置
     */
    public DisableGoodsResponse disableGoodsEx(DisableGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.goods.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableGoodsResponse());
    }

    /**
     * Description: 获取健康码、核酸、疫苗、行程码等信息
     * Summary: 获取健康码、核酸、疫苗、行程码等信息
     */
    public GetHealthcodeResponse getHealthcode(GetHealthcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHealthcodeEx(request, headers, runtime);
    }

    /**
     * Description: 获取健康码、核酸、疫苗、行程码等信息
     * Summary: 获取健康码、核酸、疫苗、行程码等信息
     */
    public GetHealthcodeResponse getHealthcodeEx(GetHealthcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.goodschain.healthcode.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetHealthcodeResponse());
    }
}
