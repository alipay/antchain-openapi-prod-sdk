// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models.*;
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
                    new TeaPair("_prod_code", "ak_630ce8157b69499bbf96c1910a852241"),
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
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）
     */
    public CreateBaasBlockchainInstanceInnerResponse createBaasBlockchainInstanceInner(CreateBaasBlockchainInstanceInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasBlockchainInstanceInnerEx(request, headers, runtime);
    }

    /**
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）
     */
    public CreateBaasBlockchainInstanceInnerResponse createBaasBlockchainInstanceInnerEx(CreateBaasBlockchainInstanceInnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.instance.inner.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasBlockchainInstanceInnerResponse());
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户
     */
    public ApplyBaasChainAccountAntResponse applyBaasChainAccountAnt(ApplyBaasChainAccountAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyBaasChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户
     */
    public ApplyBaasChainAccountAntResponse applyBaasChainAccountAntEx(ApplyBaasChainAccountAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyBaasChainAccountAntResponse());
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户
     */
    public CreateBaasChainAccountAntResponse createBaasChainAccountAnt(CreateBaasChainAccountAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户
     */
    public CreateBaasChainAccountAntResponse createBaasChainAccountAntEx(CreateBaasChainAccountAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasChainAccountAntResponse());
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结
     */
    public FreezeBaasChainAccountAntResponse freezeBaasChainAccountAnt(FreezeBaasChainAccountAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeBaasChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结
     */
    public FreezeBaasChainAccountAntResponse freezeBaasChainAccountAntEx(FreezeBaasChainAccountAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeBaasChainAccountAntResponse());
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表
     */
    public QueryBaasChainAccountAntResponse queryBaasChainAccountAnt(QueryBaasChainAccountAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表
     */
    public QueryBaasChainAccountAntResponse queryBaasChainAccountAntEx(QueryBaasChainAccountAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasChainAccountAntResponse());
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻
     */
    public UnfreezeBaasChainAccountAntResponse unfreezeBaasChainAccountAnt(UnfreezeBaasChainAccountAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeBaasChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻
     */
    public UnfreezeBaasChainAccountAntResponse unfreezeBaasChainAccountAntEx(UnfreezeBaasChainAccountAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeBaasChainAccountAntResponse());
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称
     */
    public UpdateBaasChainNameAntResponse updateBaasChainNameAnt(UpdateBaasChainNameAntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasChainNameAntEx(request, headers, runtime);
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称
     */
    public UpdateBaasChainNameAntResponse updateBaasChainNameAntEx(UpdateBaasChainNameAntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.name.ant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasChainNameAntResponse());
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建
     */
    public CreateBaasChainSubnetResponse createBaasChainSubnet(CreateBaasChainSubnetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建
     */
    public CreateBaasChainSubnetResponse createBaasChainSubnetEx(CreateBaasChainSubnetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查
     */
    public CheckBaasChainSubnetCreateResponse checkBaasChainSubnetCreate(CheckBaasChainSubnetCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBaasChainSubnetCreateEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查
     */
    public CheckBaasChainSubnetCreateResponse checkBaasChainSubnetCreateEx(CheckBaasChainSubnetCreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.create.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBaasChainSubnetCreateResponse());
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动
     */
    public ExecBaasChainSubnetResponse execBaasChainSubnet(ExecBaasChainSubnetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execBaasChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动
     */
    public ExecBaasChainSubnetResponse execBaasChainSubnetEx(ExecBaasChainSubnetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecBaasChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加
     */
    public AddBaasChainSubnetMemberResponse addBaasChainSubnetMember(AddBaasChainSubnetMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBaasChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加
     */
    public AddBaasChainSubnetMemberResponse addBaasChainSubnetMemberEx(AddBaasChainSubnetMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBaasChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验
     */
    public CheckBaasChainSubnetMemberResponse checkBaasChainSubnetMember(CheckBaasChainSubnetMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBaasChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验
     */
    public CheckBaasChainSubnetMemberResponse checkBaasChainSubnetMemberEx(CheckBaasChainSubnetMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBaasChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除
     */
    public DeleteBaasChainSubnetMemberResponse deleteBaasChainSubnetMember(DeleteBaasChainSubnetMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBaasChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除
     */
    public DeleteBaasChainSubnetMemberResponse deleteBaasChainSubnetMemberEx(DeleteBaasChainSubnetMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBaasChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询
     */
    public QueryBaasChainSubnetMemberResponse queryBaasChainSubnetMember(QueryBaasChainSubnetMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询
     */
    public QueryBaasChainSubnetMemberResponse queryBaasChainSubnetMemberEx(QueryBaasChainSubnetMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改
     */
    public UpdateBaasChainSubnetNameResponse updateBaasChainSubnetName(UpdateBaasChainSubnetNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasChainSubnetNameEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改
     */
    public UpdateBaasChainSubnetNameResponse updateBaasChainSubnetNameEx(UpdateBaasChainSubnetNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.name.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasChainSubnetNameResponse());
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询
     */
    public QueryBaasChainSubnetResponse queryBaasChainSubnet(QueryBaasChainSubnetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询
     */
    public QueryBaasChainSubnetResponse queryBaasChainSubnetEx(QueryBaasChainSubnetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通
     */
    public ApplyBaasChainSubnetRestResponse applyBaasChainSubnetRest(ApplyBaasChainSubnetRestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyBaasChainSubnetRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通
     */
    public ApplyBaasChainSubnetRestResponse applyBaasChainSubnetRestEx(ApplyBaasChainSubnetRestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.rest.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyBaasChainSubnetRestResponse());
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表
     */
    public QueryBaasUnionChainResponse queryBaasUnionChain(QueryBaasUnionChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasUnionChainEx(request, headers, runtime);
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表
     */
    public QueryBaasUnionChainResponse queryBaasUnionChainEx(QueryBaasUnionChainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.chain.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasUnionChainResponse());
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateBaasUnionUnionResponse createBaasUnionUnion(CreateBaasUnionUnionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateBaasUnionUnionResponse createBaasUnionUnionEx(CreateBaasUnionUnionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasUnionUnionResponse());
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     */
    public DeleteBaasUnionUnionResponse deleteBaasUnionUnion(DeleteBaasUnionUnionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBaasUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     */
    public DeleteBaasUnionUnionResponse deleteBaasUnionUnionEx(DeleteBaasUnionUnionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBaasUnionUnionResponse());
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询
     */
    public QueryBaasUnionUnionResponse queryBaasUnionUnion(QueryBaasUnionUnionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询
     */
    public QueryBaasUnionUnionResponse queryBaasUnionUnionEx(QueryBaasUnionUnionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasUnionUnionResponse());
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新
     */
    public UpdateBaasUnionUnionResponse updateBaasUnionUnion(UpdateBaasUnionUnionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新
     */
    public UpdateBaasUnionUnionResponse updateBaasUnionUnionEx(UpdateBaasUnionUnionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasUnionUnionResponse());
    }
}
