// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.iam.models.*;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.Client.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "3.12.4")
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
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    /**
     * Description: 获取Role
     * Summary: 获取角色
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleEx(request, headers, runtime);
    }

    /**
     * Description: 获取Role
     * Summary: 获取角色
     */
    public GetRoleResponse getRoleEx(GetRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRoleResponse());
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略
     * Summary: 查询授权
     */
    public QueryPolicyResponse queryPolicy(QueryPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略
     * Summary: 查询授权
     */
    public QueryPolicyResponse queryPolicyEx(QueryPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPolicyResponse());
    }

    /**
     * Description: 查询租户下的权限组
     * Summary: 查询授权组
     */
    public QueryGroupResponse queryGroup(QueryGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户下的权限组
     * Summary: 查询授权组
     */
    public QueryGroupResponse queryGroupEx(QueryGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGroupResponse());
    }

    /**
     * Description: 创建授权策略
     * Summary: 创建授权策略
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 创建授权策略
     * Summary: 创建授权策略
     */
    public CreatePolicyResponse createPolicyEx(CreatePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePolicyResponse());
    }

    /**
     * Description: 删除授权策略
     * Summary: 删除授权策略
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 删除授权策略
     * Summary: 删除授权策略
     */
    public DeletePolicyResponse deletePolicyEx(DeletePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeletePolicyResponse());
    }

    /**
     * Description: 授权策略赋予某个对象
     * Summary: 添加授权
     */
    public AttachPolicyResponse attachPolicy(AttachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 授权策略赋予某个对象
     * Summary: 添加授权
     */
    public AttachPolicyResponse attachPolicyEx(AttachPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.attach", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AttachPolicyResponse());
    }

    /**
     * Description: 解除授权对象的授权策略
     * Summary: 解除授权
     */
    public DetachPolicyResponse detachPolicy(DetachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detachPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 解除授权对象的授权策略
     * Summary: 解除授权
     */
    public DetachPolicyResponse detachPolicyEx(DetachPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.detach", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetachPolicyResponse());
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
     * Summary: 查询授权
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
     * Summary: 查询授权
     */
    public ListPolicyResponse listPolicyEx(ListPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.policy.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListPolicyResponse());
    }

    /**
     * Description: 授权对象的权限校验
     * Summary: 校验权限
     */
    public JudgeAuthorityResponse judgeAuthority(JudgeAuthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeAuthorityEx(request, headers, runtime);
    }

    /**
     * Description: 授权对象的权限校验
     * Summary: 校验权限
     */
    public JudgeAuthorityResponse judgeAuthorityEx(JudgeAuthorityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.authority.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeAuthorityResponse());
    }

    /**
     * Description: 添加产品操作元数据
     * Summary: 创建产品操作点
     */
    public CreateProductActionResponse createProductAction(CreateProductActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductActionEx(request, headers, runtime);
    }

    /**
     * Description: 添加产品操作元数据
     * Summary: 创建产品操作点
     */
    public CreateProductActionResponse createProductActionEx(CreateProductActionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.product.action.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProductActionResponse());
    }

    /**
     * Description: 校验token合法性
     * Summary: 校验token合法性
     */
    public VerifyOauthTokenResponse verifyOauthToken(VerifyOauthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: 校验token合法性
     * Summary: 校验token合法性
     */
    public VerifyOauthTokenResponse verifyOauthTokenEx(VerifyOauthTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.oauth.token.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyOauthTokenResponse());
    }

    /**
     * Description: 校验中枢登录态合法性
     * Summary: 校验中枢登录态合法性
     */
    public VerifySessionTokenResponse verifySessionToken(VerifySessionTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifySessionTokenEx(request, headers, runtime);
    }

    /**
     * Description: 校验中枢登录态合法性
     * Summary: 校验中枢登录态合法性
     */
    public VerifySessionTokenResponse verifySessionTokenEx(VerifySessionTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.session.token.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifySessionTokenResponse());
    }

    /**
     * Description: 获取授予角色的操作员列表
     * Summary: 授予角色的操作员列表
     */
    public ListRoleOperatorResponse listRoleOperator(ListRoleOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 获取授予角色的操作员列表
     * Summary: 授予角色的操作员列表
     */
    public ListRoleOperatorResponse listRoleOperatorEx(ListRoleOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.operator.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRoleOperatorResponse());
    }

    /**
     * Description: 申请信任登录URL
     * Summary: 申请信任登录URL
     */
    public ApplyTrustloginUrlResponse applyTrustloginUrl(ApplyTrustloginUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTrustloginUrlEx(request, headers, runtime);
    }

    /**
     * Description: 申请信任登录URL
     * Summary: 申请信任登录URL
     */
    public ApplyTrustloginUrlResponse applyTrustloginUrlEx(ApplyTrustloginUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.trustlogin.url.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTrustloginUrlResponse());
    }

    /**
     * Description: 扮演虚拟身份，获取安全令牌
     * Summary: 扮演虚拟身份，获取安全令牌
     */
    public AssumeStsResponse assumeSts(AssumeStsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.assumeStsEx(request, headers, runtime);
    }

    /**
     * Description: 扮演虚拟身份，获取安全令牌
     * Summary: 扮演虚拟身份，获取安全令牌
     */
    public AssumeStsResponse assumeStsEx(AssumeStsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.assume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AssumeStsResponse());
    }

    /**
     * Description: 创建虚拟身份
     * Summary: 创建虚拟身份
     */
    public CreateStsActorResponse createStsActor(CreateStsActorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStsActorEx(request, headers, runtime);
    }

    /**
     * Description: 创建虚拟身份
     * Summary: 创建虚拟身份
     */
    public CreateStsActorResponse createStsActorEx(CreateStsActorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.actor.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStsActorResponse());
    }

    /**
     * Description: 删除虚拟身份
     * Summary: 删除虚拟身份
     */
    public DeleteStsActorResponse deleteStsActor(DeleteStsActorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStsActorEx(request, headers, runtime);
    }

    /**
     * Description: 删除虚拟身份
     * Summary: 删除虚拟身份
     */
    public DeleteStsActorResponse deleteStsActorEx(DeleteStsActorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.actor.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteStsActorResponse());
    }

    /**
     * Description: 唯一查询虚拟身份
     * Summary: 唯一查询虚拟身份
     */
    public GetStsActorResponse getStsActor(GetStsActorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStsActorEx(request, headers, runtime);
    }

    /**
     * Description: 唯一查询虚拟身份
     * Summary: 唯一查询虚拟身份
     */
    public GetStsActorResponse getStsActorEx(GetStsActorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.actor.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetStsActorResponse());
    }

    /**
     * Description: 获取租户内的虚拟身份
     * Summary: 获取租户内的虚拟身份
     */
    public ListStsActorResponse listStsActor(ListStsActorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStsActorEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户内的虚拟身份
     * Summary: 获取租户内的虚拟身份
     */
    public ListStsActorResponse listStsActorEx(ListStsActorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.actor.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListStsActorResponse());
    }

    /**
     * Description: 更新虚拟身份
     * Summary: 更新虚拟身份
     */
    public UpdateStsActorResponse updateStsActor(UpdateStsActorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStsActorEx(request, headers, runtime);
    }

    /**
     * Description: 更新虚拟身份
     * Summary: 更新虚拟身份
     */
    public UpdateStsActorResponse updateStsActorEx(UpdateStsActorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.sts.actor.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateStsActorResponse());
    }

    /**
     * Description: 查询租户内可见的角色
     * Summary: 角色查询
     */
    public QueryRoleResponse queryRole(QueryRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRoleEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户内可见的角色
     * Summary: 角色查询
     */
    public QueryRoleResponse queryRoleEx(QueryRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRoleResponse());
    }

    /**
     * Description: 获取租户Iaas账号基本信息
     * Summary: 获取租户Iaas账号基本信息
     */
    public GetIaasaccountBaseinfoResponse getIaasaccountBaseinfo(GetIaasaccountBaseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIaasaccountBaseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户Iaas账号基本信息
     * Summary: 获取租户Iaas账号基本信息
     */
    public GetIaasaccountBaseinfoResponse getIaasaccountBaseinfoEx(GetIaasaccountBaseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.iaasaccount.baseinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetIaasaccountBaseinfoResponse());
    }

    /**
     * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
     * Summary: 校验密码是否正确
     */
    public VerifyPasswordResponse verifyPassword(VerifyPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPasswordEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
     * Summary: 校验密码是否正确
     */
    public VerifyPasswordResponse verifyPasswordEx(VerifyPasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.password.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPasswordResponse());
    }

    /**
     * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
     * Summary: 更新操作员状态
     */
    public UpdateOperatorStatusResponse updateOperatorStatus(UpdateOperatorStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOperatorStatusEx(request, headers, runtime);
    }

    /**
     * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
     * Summary: 更新操作员状态
     */
    public UpdateOperatorStatusResponse updateOperatorStatusEx(UpdateOperatorStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.operator.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOperatorStatusResponse());
    }

    /**
     * Description: 冻结操作员
     * Summary: 冻结操作员
     */
    public FreezeOperatorResponse freezeOperator(FreezeOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 冻结操作员
     * Summary: 冻结操作员
     */
    public FreezeOperatorResponse freezeOperatorEx(FreezeOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.operator.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeOperatorResponse());
    }

    /**
     * Description: 解冻操作员
     * Summary: 解冻操作员
     */
    public UnfreezeOperatorResponse unfreezeOperator(UnfreezeOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 解冻操作员
     * Summary: 解冻操作员
     */
    public UnfreezeOperatorResponse unfreezeOperatorEx(UnfreezeOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.operator.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeOperatorResponse());
    }

    /**
     * Description: 获取主账号信息
     * Summary: 获取主账号信息
     */
    public GetInternalMasterResponse getInternalMaster(GetInternalMasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInternalMasterEx(request, headers, runtime);
    }

    /**
     * Description: 获取主账号信息
     * Summary: 获取主账号信息
     */
    public GetInternalMasterResponse getInternalMasterEx(GetInternalMasterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.internal.master.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInternalMasterResponse());
    }

    /**
     * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
     * Summary: 获取阿里云用户信息
     */
    public GetAliyunUserResponse getAliyunUser(GetAliyunUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAliyunUserEx(request, headers, runtime);
    }

    /**
     * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
     * Summary: 获取阿里云用户信息
     */
    public GetAliyunUserResponse getAliyunUserEx(GetAliyunUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.aliyun.user.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAliyunUserResponse());
    }

    /**
     * Description: 阿里云RAM权限校验
     * Summary: 阿里云RAM权限校验
     */
    public JudgeAliyunAuthorityResponse judgeAliyunAuthority(JudgeAliyunAuthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeAliyunAuthorityEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云RAM权限校验
     * Summary: 阿里云RAM权限校验
     */
    public JudgeAliyunAuthorityResponse judgeAliyunAuthorityEx(JudgeAliyunAuthorityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.aliyun.authority.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeAliyunAuthorityResponse());
    }

    /**
     * Description: 根据登录态获取ak
     * Summary: 根据登录态获取ak
     */
    public GetSessionAccessorResponse getSessionAccessor(GetSessionAccessorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSessionAccessorEx(request, headers, runtime);
    }

    /**
     * Description: 根据登录态获取ak
     * Summary: 根据登录态获取ak
     */
    public GetSessionAccessorResponse getSessionAccessorEx(GetSessionAccessorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.session.accessor.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSessionAccessorResponse());
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     */
    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePasswordEx(request, headers, runtime);
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     */
    public UpdatePasswordResponse updatePasswordEx(UpdatePasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.password.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePasswordResponse());
    }

    /**
     * Description: 蚂蚁侧批量鉴权
     * Summary: 蚂蚁侧批量鉴权
     */
    public JudgeMultiauthorityResponse judgeMultiauthority(JudgeMultiauthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeMultiauthorityEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁侧批量鉴权
     * Summary: 蚂蚁侧批量鉴权
     */
    public JudgeMultiauthorityResponse judgeMultiauthorityEx(JudgeMultiauthorityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.multiauthority.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeMultiauthorityResponse());
    }

    /**
     * Description: 阿里云批量鉴权
     * Summary: 阿里云批量鉴权
     */
    public JudgeAliyunMultiauthorityResponse judgeAliyunMultiauthority(JudgeAliyunMultiauthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeAliyunMultiauthorityEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云批量鉴权
     * Summary: 阿里云批量鉴权
     */
    public JudgeAliyunMultiauthorityResponse judgeAliyunMultiauthorityEx(JudgeAliyunMultiauthorityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.aliyun.multiauthority.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeAliyunMultiauthorityResponse());
    }

    /**
     * Description: 辰霖
     * Summary: 获取当前AK关联的用户实体信息
     */
    public GetAccessorCurrentResponse getAccessorCurrent(GetAccessorCurrentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccessorCurrentEx(request, headers, runtime);
    }

    /**
     * Description: 辰霖
     * Summary: 获取当前AK关联的用户实体信息
     */
    public GetAccessorCurrentResponse getAccessorCurrentEx(GetAccessorCurrentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.accessor.current.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAccessorCurrentResponse());
    }

    /**
     * Description: 获取单个服务账号信息
     * Summary: 获取单个服务账号信息
     */
    public GetServiceaccountResponse getServiceaccount(GetServiceaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个服务账号信息
     * Summary: 获取单个服务账号信息
     */
    public GetServiceaccountResponse getServiceaccountEx(GetServiceaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.serviceaccount.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceaccountResponse());
    }

    /**
     * Description: 创建服务账号
     * Summary: 创建服务账号
     */
    public CreateServiceaccountResponse createServiceaccount(CreateServiceaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 创建服务账号
     * Summary: 创建服务账号
     */
    public CreateServiceaccountResponse createServiceaccountEx(CreateServiceaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.serviceaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateServiceaccountResponse());
    }

    /**
     * Description: 删除服务账号
     * Summary: 删除服务账号
     */
    public DeleteServiceaccountResponse deleteServiceaccount(DeleteServiceaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 删除服务账号
     * Summary: 删除服务账号
     */
    public DeleteServiceaccountResponse deleteServiceaccountEx(DeleteServiceaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.serviceaccount.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteServiceaccountResponse());
    }

    /**
     * Description: 更新服务账号信息
     * Summary: 更新服务账号信息
     */
    public UpdateServiceaccountResponse updateServiceaccount(UpdateServiceaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 更新服务账号信息
     * Summary: 更新服务账号信息
     */
    public UpdateServiceaccountResponse updateServiceaccountEx(UpdateServiceaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.serviceaccount.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateServiceaccountResponse());
    }

    /**
     * Description: 移除租户成员
     * Summary: 移除租户成员
     */
    public RemoveTenantMemberResponse removeTenantMember(RemoveTenantMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeTenantMemberEx(request, headers, runtime);
    }

    /**
     * Description: 移除租户成员
     * Summary: 移除租户成员
     */
    public RemoveTenantMemberResponse removeTenantMemberEx(RemoveTenantMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.tenant.member.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveTenantMemberResponse());
    }

    /**
     * Description: 创建成员组
     * Summary: 创建成员组
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建成员组
     * Summary: 创建成员组
     */
    public CreateGroupResponse createGroupEx(CreateGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGroupResponse());
    }

    /**
     * Description: 删除成员组
     * Summary: 删除成员组
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除成员组
     * Summary: 删除成员组
     */
    public DeleteGroupResponse deleteGroupEx(DeleteGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteGroupResponse());
    }

    /**
     * Description: 更新成员组
     * Summary: 更新成员组
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新成员组
     * Summary: 更新成员组
     */
    public UpdateGroupResponse updateGroupEx(UpdateGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGroupResponse());
    }

    /**
     * Description: 添加成员组成员
     * Summary: 添加成员组成员
     */
    public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberEx(request, headers, runtime);
    }

    /**
     * Description: 添加成员组成员
     * Summary: 添加成员组成员
     */
    public AddGroupMemberResponse addGroupMemberEx(AddGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddGroupMemberResponse());
    }

    /**
     * Description: 移除成员组成员
     * Summary: 移除成员组成员
     */
    public RemoveGroupMemberResponse removeGroupMember(RemoveGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeGroupMemberEx(request, headers, runtime);
    }

    /**
     * Description: 移除成员组成员
     * Summary: 移除成员组成员
     */
    public RemoveGroupMemberResponse removeGroupMemberEx(RemoveGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.member.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveGroupMemberResponse());
    }

    /**
     * Description: 成员组基本信息查询
     * Summary: 成员组基本信息查询
     */
    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupEx(request, headers, runtime);
    }

    /**
     * Description: 成员组基本信息查询
     * Summary: 成员组基本信息查询
     */
    public GetGroupResponse getGroupEx(GetGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGroupResponse());
    }

    /**
     * Description: 成员组成员查询
     * Summary: 成员组成员查询
     */
    public QueryGroupMemberResponse queryGroupMember(QueryGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGroupMemberEx(request, headers, runtime);
    }

    /**
     * Description: 成员组成员查询
     * Summary: 成员组成员查询
     */
    public QueryGroupMemberResponse queryGroupMemberEx(QueryGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.group.member.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGroupMemberResponse());
    }

    /**
     * Description: 获取用户所在成员组
     * Summary: 获取用户所在成员组
     */
    public ListOperatorGroupResponse listOperatorGroup(ListOperatorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperatorGroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户所在成员组
     * Summary: 获取用户所在成员组
     */
    public ListOperatorGroupResponse listOperatorGroupEx(ListOperatorGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.operator.group.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListOperatorGroupResponse());
    }

    /**
     * Description: 为角色添加权限码
     * Summary: 为角色添加权限码
     */
    public AddRoleActionResponse addRoleAction(AddRoleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRoleActionEx(request, headers, runtime);
    }

    /**
     * Description: 为角色添加权限码
     * Summary: 为角色添加权限码
     */
    public AddRoleActionResponse addRoleActionEx(AddRoleActionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.action.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddRoleActionResponse());
    }

    /**
     * Description: 移除角色权限
     * Summary: 移除角色权限
     */
    public RemoveRoleActionResponse removeRoleAction(RemoveRoleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeRoleActionEx(request, headers, runtime);
    }

    /**
     * Description: 移除角色权限
     * Summary: 移除角色权限
     */
    public RemoveRoleActionResponse removeRoleActionEx(RemoveRoleActionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.action.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveRoleActionResponse());
    }

    /**
     * Description: 创建自定义角色
     * Summary: 创建自定义角色
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleEx(request, headers, runtime);
    }

    /**
     * Description: 创建自定义角色
     * Summary: 创建自定义角色
     */
    public CreateRoleResponse createRoleEx(CreateRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRoleResponse());
    }

    /**
     * Description: 删除角色
     * Summary: 删除角色
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleEx(request, headers, runtime);
    }

    /**
     * Description: 删除角色
     * Summary: 删除角色
     */
    public DeleteRoleResponse deleteRoleEx(DeleteRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRoleResponse());
    }

    /**
     * Description: 更新角色
     * Summary: 更新角色
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleEx(request, headers, runtime);
    }

    /**
     * Description: 更新角色
     * Summary: 更新角色
     */
    public UpdateRoleResponse updateRoleEx(UpdateRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.iam.role.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRoleResponse());
    }
}
