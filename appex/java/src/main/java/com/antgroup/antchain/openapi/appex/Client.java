// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.appex.models.*;
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
                    new TeaPair("sdk_version", "1.3.3")
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
     * Description: 为用户在MyPocket创建链上账户
     * Summary: MyPocket创建链上账户
     */
    public CreateMypocketChainaccountResponse createMypocketChainaccount(CreateMypocketChainaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMypocketChainaccountEx(request, headers, runtime);
    }

    /**
     * Description: 为用户在MyPocket创建链上账户
     * Summary: MyPocket创建链上账户
     */
    public CreateMypocketChainaccountResponse createMypocketChainaccountEx(CreateMypocketChainaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.chainaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMypocketChainaccountResponse());
    }

    /**
     * Description: 用户根据DID和chainID，查询区块链账户
     * Summary: 用户查询区块链账户
     */
    public QueryMypocketChainaccountResponse queryMypocketChainaccount(QueryMypocketChainaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypocketChainaccountEx(request, headers, runtime);
    }

    /**
     * Description: 用户根据DID和chainID，查询区块链账户
     * Summary: 用户查询区块链账户
     */
    public QueryMypocketChainaccountResponse queryMypocketChainaccountEx(QueryMypocketChainaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.chainaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypocketChainaccountResponse());
    }

    /**
     * Description: 外部DApp应用绑定链账户至did
     * Summary: 外部DApp应用绑定链账户至did
     */
    public BindMypocketKmsaccountResponse bindMypocketKmsaccount(BindMypocketKmsaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindMypocketKmsaccountEx(request, headers, runtime);
    }

    /**
     * Description: 外部DApp应用绑定链账户至did
     * Summary: 外部DApp应用绑定链账户至did
     */
    public BindMypocketKmsaccountResponse bindMypocketKmsaccountEx(BindMypocketKmsaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.kmsaccount.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindMypocketKmsaccountResponse());
    }

    /**
     * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
     * Summary: 创建普通用户DID账户（支付宝UID）
     */
    public CreateMypocketDidaccountbyalipayResponse createMypocketDidaccountbyalipay(CreateMypocketDidaccountbyalipayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMypocketDidaccountbyalipayEx(request, headers, runtime);
    }

    /**
     * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
     * Summary: 创建普通用户DID账户（支付宝UID）
     */
    public CreateMypocketDidaccountbyalipayResponse createMypocketDidaccountbyalipayEx(CreateMypocketDidaccountbyalipayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMypocketDidaccountbyalipayResponse());
    }

    /**
     * Description: 外部DApp应用通过支付宝UID查询普通用户did
     * Summary: 查询普通用户did（支付宝UID）
     */
    public QueryMypocketDidaccountbyalipayResponse queryMypocketDidaccountbyalipay(QueryMypocketDidaccountbyalipayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypocketDidaccountbyalipayEx(request, headers, runtime);
    }

    /**
     * Description: 外部DApp应用通过支付宝UID查询普通用户did
     * Summary: 查询普通用户did（支付宝UID）
     */
    public QueryMypocketDidaccountbyalipayResponse queryMypocketDidaccountbyalipayEx(QueryMypocketDidaccountbyalipayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypocketDidaccountbyalipayResponse());
    }

    /**
     * Description: 外部DApp应用创建用户链上账户
     * Summary: 外部DApp应用创建用户链上账户
     */
    public CreateMypocketEscrowchainaccountResponse createMypocketEscrowchainaccount(CreateMypocketEscrowchainaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMypocketEscrowchainaccountEx(request, headers, runtime);
    }

    /**
     * Description: 外部DApp应用创建用户链上账户
     * Summary: 外部DApp应用创建用户链上账户
     */
    public CreateMypocketEscrowchainaccountResponse createMypocketEscrowchainaccountEx(CreateMypocketEscrowchainaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMypocketEscrowchainaccountResponse());
    }

    /**
     * Description: 外部DApp应用查询did在指定链上关联的账户
     * Summary: 外部查询did在指定链上关联的账户
     */
    public QueryMypocketEscrowchainaccountResponse queryMypocketEscrowchainaccount(QueryMypocketEscrowchainaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypocketEscrowchainaccountEx(request, headers, runtime);
    }

    /**
     * Description: 外部DApp应用查询did在指定链上关联的账户
     * Summary: 外部查询did在指定链上关联的账户
     */
    public QueryMypocketEscrowchainaccountResponse queryMypocketEscrowchainaccountEx(QueryMypocketEscrowchainaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypocketEscrowchainaccountResponse());
    }

    /**
     * Description: 区块链身份创建
     * Summary: 区块链身份创建
     */
    public CreateUserDidResponse createUserDid(CreateUserDidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserDidEx(request, headers, runtime);
    }

    /**
     * Description: 区块链身份创建
     * Summary: 区块链身份创建
     */
    public CreateUserDidResponse createUserDidEx(CreateUserDidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.user.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserDidResponse());
    }

    /**
     * Description: 协作联盟创建申请
     * Summary: 协作联盟创建申请
     */
    public CreateUnionApplyResponse createUnionApply(CreateUnionApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnionApplyEx(request, headers, runtime);
    }

    /**
     * Description: 协作联盟创建申请
     * Summary: 协作联盟创建申请
     */
    public CreateUnionApplyResponse createUnionApplyEx(CreateUnionApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.apply.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnionApplyResponse());
    }

    /**
     * Description: 联盟创建申请审核，仅内部租户可调用
     * Summary: 联盟创建申请审核
     */
    public ConfirmUnionApplyResponse confirmUnionApply(ConfirmUnionApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmUnionApplyEx(request, headers, runtime);
    }

    /**
     * Description: 联盟创建申请审核，仅内部租户可调用
     * Summary: 联盟创建申请审核
     */
    public ConfirmUnionApplyResponse confirmUnionApplyEx(ConfirmUnionApplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.apply.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmUnionApplyResponse());
    }

    /**
     * Description: 在联盟中创建信息通道Channel
     * Summary: 在联盟中创建信息通道Channel
     */
    public CreateUnionChannelResponse createUnionChannel(CreateUnionChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnionChannelEx(request, headers, runtime);
    }

    /**
     * Description: 在联盟中创建信息通道Channel
     * Summary: 在联盟中创建信息通道Channel
     */
    public CreateUnionChannelResponse createUnionChannelEx(CreateUnionChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.channel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnionChannelResponse());
    }

    /**
     * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
     * Summary: 成员查询自己拥有访问权限的channel
     */
    public ListUserChannelResponse listUserChannel(ListUserChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserChannelEx(request, headers, runtime);
    }

    /**
     * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
     * Summary: 成员查询自己拥有访问权限的channel
     */
    public ListUserChannelResponse listUserChannelEx(ListUserChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.user.channel.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUserChannelResponse());
    }

    /**
     * Description: 联盟公开Channel查询
     * Summary: 联盟公开Channel查询
     */
    public ListUnionPubchannelResponse listUnionPubchannel(ListUnionPubchannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnionPubchannelEx(request, headers, runtime);
    }

    /**
     * Description: 联盟公开Channel查询
     * Summary: 联盟公开Channel查询
     */
    public ListUnionPubchannelResponse listUnionPubchannelEx(ListUnionPubchannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.pubchannel.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnionPubchannelResponse());
    }

    /**
     * Description: Channel授权给用户
     * Summary: Channel授权给用户
     */
    public AuthChannelUserResponse authChannelUser(AuthChannelUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authChannelUserEx(request, headers, runtime);
    }

    /**
     * Description: Channel授权给用户
     * Summary: Channel授权给用户
     */
    public AuthChannelUserResponse authChannelUserEx(AuthChannelUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.channel.user.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthChannelUserResponse());
    }

    /**
     * Description: 取消用户访问Channel的权限
     * Summary: 取消用户访问Channel的权限
     */
    public CancelChannelUserResponse cancelChannelUser(CancelChannelUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelChannelUserEx(request, headers, runtime);
    }

    /**
     * Description: 取消用户访问Channel的权限
     * Summary: 取消用户访问Channel的权限
     */
    public CancelChannelUserResponse cancelChannelUserEx(CancelChannelUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.channel.user.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelChannelUserResponse());
    }

    /**
     * Description: 单据加密上链
     * Summary: 单据加密上链
     */
    public CreateUnionFormResponse createUnionForm(CreateUnionFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnionFormEx(request, headers, runtime);
    }

    /**
     * Description: 单据加密上链
     * Summary: 单据加密上链
     */
    public CreateUnionFormResponse createUnionFormEx(CreateUnionFormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.form.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnionFormResponse());
    }

    /**
     * Description: 查询单个表单
     * Summary: 查询单个表单
     */
    public QueryUnionFormResponse queryUnionForm(QueryUnionFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnionFormEx(request, headers, runtime);
    }

    /**
     * Description: 查询单个表单
     * Summary: 查询单个表单
     */
    public QueryUnionFormResponse queryUnionFormEx(QueryUnionFormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.form.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnionFormResponse());
    }

    /**
     * Description: 通道中用户可以访问的表单列表
     * Summary: 通道中用户可以访问的表单列表
     */
    public ListChannelUserformResponse listChannelUserform(ListChannelUserformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChannelUserformEx(request, headers, runtime);
    }

    /**
     * Description: 通道中用户可以访问的表单列表
     * Summary: 通道中用户可以访问的表单列表
     */
    public ListChannelUserformResponse listChannelUserformEx(ListChannelUserformRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.channel.userform.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChannelUserformResponse());
    }

    /**
     * Description: 物上链，链上数字物体创建
     * Summary: 物权上链
     */
    public CreateObjectResponse createObject(CreateObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createObjectEx(request, headers, runtime);
    }

    /**
     * Description: 物上链，链上数字物体创建
     * Summary: 物权上链
     */
    public CreateObjectResponse createObjectEx(CreateObjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.object.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateObjectResponse());
    }

    /**
     * Description: 数据归属权流转
     * Summary: 数据归属权流转
     */
    public CreateObjectTransferResponse createObjectTransfer(CreateObjectTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createObjectTransferEx(request, headers, runtime);
    }

    /**
     * Description: 数据归属权流转
     * Summary: 数据归属权流转
     */
    public CreateObjectTransferResponse createObjectTransferEx(CreateObjectTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.object.transfer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateObjectTransferResponse());
    }

    /**
     * Description: 数据归属权流转记录查询
     * Summary: 数据归属权流转记录查询
     */
    public ListObjectTransferResponse listObjectTransfer(ListObjectTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectTransferEx(request, headers, runtime);
    }

    /**
     * Description: 数据归属权流转记录查询
     * Summary: 数据归属权流转记录查询
     */
    public ListObjectTransferResponse listObjectTransferEx(ListObjectTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.object.transfer.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListObjectTransferResponse());
    }

    /**
     * Description: 状态流驱动模版新增
     * Summary: 状态流驱动模版新增
     */
    public CreateStatusflowTemplateResponse createStatusflowTemplate(CreateStatusflowTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStatusflowTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 状态流驱动模版新增
     * Summary: 状态流驱动模版新增
     */
    public CreateStatusflowTemplateResponse createStatusflowTemplateEx(CreateStatusflowTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.statusflow.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStatusflowTemplateResponse());
    }

    /**
     * Description: 状态流驱动模版删除
     * Summary: 状态流驱动模版删除
     */
    public DeleteStatusflowTemplateResponse deleteStatusflowTemplate(DeleteStatusflowTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStatusflowTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 状态流驱动模版删除
     * Summary: 状态流驱动模版删除
     */
    public DeleteStatusflowTemplateResponse deleteStatusflowTemplateEx(DeleteStatusflowTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.statusflow.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteStatusflowTemplateResponse());
    }

    /**
     * Description: 状态流驱动模版查询
     * Summary: 状态流驱动模版查询
     */
    public QueryStatusflowTemplateResponse queryStatusflowTemplate(QueryStatusflowTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStatusflowTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 状态流驱动模版查询
     * Summary: 状态流驱动模版查询
     */
    public QueryStatusflowTemplateResponse queryStatusflowTemplateEx(QueryStatusflowTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.statusflow.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStatusflowTemplateResponse());
    }

    /**
     * Description: 数据状态驱动
     * Summary: 数据状态驱动
     */
    public StartDatastatusDriveResponse startDatastatusDrive(StartDatastatusDriveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDatastatusDriveEx(request, headers, runtime);
    }

    /**
     * Description: 数据状态驱动
     * Summary: 数据状态驱动
     */
    public StartDatastatusDriveResponse startDatastatusDriveEx(StartDatastatusDriveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.datastatus.drive.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDatastatusDriveResponse());
    }

    /**
     * Description: 查询数据状态流转记录
     * Summary: 查询数据状态流转记录
     */
    public ListDatastatusDriveResponse listDatastatusDrive(ListDatastatusDriveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatastatusDriveEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据状态流转记录
     * Summary: 查询数据状态流转记录
     */
    public ListDatastatusDriveResponse listDatastatusDriveEx(ListDatastatusDriveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.datastatus.drive.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDatastatusDriveResponse());
    }

    /**
     * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
     * Summary: 单据加密异步上链
     */
    public CreateAsynformFormResponse createAsynformForm(CreateAsynformFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAsynformFormEx(request, headers, runtime);
    }

    /**
     * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
     * Summary: 单据加密异步上链
     */
    public CreateAsynformFormResponse createAsynformFormEx(CreateAsynformFormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.asynform.form.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAsynformFormResponse());
    }

    /**
     * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
     * Summary: 单据分页查询
     */
    public PagequeryUnionFormResponse pagequeryUnionForm(PagequeryUnionFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryUnionFormEx(request, headers, runtime);
    }

    /**
     * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
     * Summary: 单据分页查询
     */
    public PagequeryUnionFormResponse pagequeryUnionFormEx(PagequeryUnionFormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.union.form.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryUnionFormResponse());
    }

    /**
     * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
     * Summary: 单据上链状态查询
     */
    public QueryAsynformStatusResponse queryAsynformStatus(QueryAsynformStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAsynformStatusEx(request, headers, runtime);
    }

    /**
     * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
     * Summary: 单据上链状态查询
     */
    public QueryAsynformStatusResponse queryAsynformStatusEx(QueryAsynformStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.asynform.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAsynformStatusResponse());
    }

    /**
     * Description: 结构化存证查询
     * Summary: 结构化存证查询
     */
    public QuerySolutionFastnotaryResponse querySolutionFastnotary(QuerySolutionFastnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySolutionFastnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 结构化存证查询
     * Summary: 结构化存证查询
     */
    public QuerySolutionFastnotaryResponse querySolutionFastnotaryEx(QuerySolutionFastnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.fastnotary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySolutionFastnotaryResponse());
    }

    /**
     * Description: 发起结构化存证
     * Summary: 发起结构化存证
     */
    public SaveSolutionFastnotaryResponse saveSolutionFastnotary(SaveSolutionFastnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSolutionFastnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 发起结构化存证
     * Summary: 发起结构化存证
     */
    public SaveSolutionFastnotaryResponse saveSolutionFastnotaryEx(SaveSolutionFastnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.fastnotary.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveSolutionFastnotaryResponse());
    }

    /**
     * Description: 初始化文件存证
     * Summary: 初始化文件存证
     */
    public InitSolutionFilenotaryResponse initSolutionFilenotary(InitSolutionFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSolutionFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 初始化文件存证
     * Summary: 初始化文件存证
     */
    public InitSolutionFilenotaryResponse initSolutionFilenotaryEx(InitSolutionFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.filenotary.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitSolutionFilenotaryResponse());
    }

    /**
     * Description: 通知文件上传完成
     * Summary: 通知文件上传完成
     */
    public SyncSolutionFilenotaryResponse syncSolutionFilenotary(SyncSolutionFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncSolutionFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 通知文件上传完成
     * Summary: 通知文件上传完成
     */
    public SyncSolutionFilenotaryResponse syncSolutionFilenotaryEx(SyncSolutionFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.filenotary.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncSolutionFilenotaryResponse());
    }

    /**
     * Description: 获取文件存证的状态
     * Summary: 获取文件存证的状态
     */
    public GetSolutionFilenotarystatusResponse getSolutionFilenotarystatus(GetSolutionFilenotarystatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSolutionFilenotarystatusEx(request, headers, runtime);
    }

    /**
     * Description: 获取文件存证的状态
     * Summary: 获取文件存证的状态
     */
    public GetSolutionFilenotarystatusResponse getSolutionFilenotarystatusEx(GetSolutionFilenotarystatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.filenotarystatus.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSolutionFilenotarystatusResponse());
    }

    /**
     * Description: 查询文件存证
     * Summary: 查询文件存证
     */
    public QuerySolutionFilenotaryResponse querySolutionFilenotary(QuerySolutionFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySolutionFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 查询文件存证
     * Summary: 查询文件存证
     */
    public QuerySolutionFilenotaryResponse querySolutionFilenotaryEx(QuerySolutionFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.filenotary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySolutionFilenotaryResponse());
    }

    /**
     * Description: 合约服务调用
     * Summary: 合约服务调用
     */
    public ExecContractServiceResponse execContractService(ExecContractServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 合约服务调用
     * Summary: 合约服务调用
     */
    public ExecContractServiceResponse execContractServiceEx(ExecContractServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.contract.service.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractServiceResponse());
    }

    /**
     * Description: 速搭平台支持openapi创建应用
     * Summary: 创建合约应用
     */
    public InitSolutionBmsResponse initSolutionBms(InitSolutionBmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSolutionBmsEx(request, headers, runtime);
    }

    /**
     * Description: 速搭平台支持openapi创建应用
     * Summary: 创建合约应用
     */
    public InitSolutionBmsResponse initSolutionBmsEx(InitSolutionBmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.bms.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitSolutionBmsResponse());
    }

    /**
     * Description: 获取合约临时oss url
     * Summary: 获取合约临时oss url
     */
    public QuerySolutionBmsResponse querySolutionBms(QuerySolutionBmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySolutionBmsEx(request, headers, runtime);
    }

    /**
     * Description: 获取合约临时oss url
     * Summary: 获取合约临时oss url
     */
    public QuerySolutionBmsResponse querySolutionBmsEx(QuerySolutionBmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.bms.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySolutionBmsResponse());
    }

    /**
     * Description: 应用速搭平台部署合约接口
     * Summary: 应用速搭平台部署合约接口
     */
    public DeploySolutionContractResponse deploySolutionContract(DeploySolutionContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deploySolutionContractEx(request, headers, runtime);
    }

    /**
     * Description: 应用速搭平台部署合约接口
     * Summary: 应用速搭平台部署合约接口
     */
    public DeploySolutionContractResponse deploySolutionContractEx(DeploySolutionContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.appex.solution.contract.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeploySolutionContractResponse());
    }
}
