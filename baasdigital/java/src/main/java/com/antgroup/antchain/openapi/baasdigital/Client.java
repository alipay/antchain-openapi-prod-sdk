// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.baasdigital.models.*;
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
                    new TeaPair("sdk_version", "1.0.34")
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
     * Description: 检测账户名称是否已经在区块链注册
     * Summary: 检测账户名称是否已经在区块链注册
     */
    public CheckAccountResponse checkAccount(CheckAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAccountEx(request, headers, runtime);
    }

    /**
     * Description: 检测账户名称是否已经在区块链注册
     * Summary: 检测账户名称是否已经在区块链注册
     */
    public CheckAccountResponse checkAccountEx(CheckAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.account.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAccountResponse());
    }

    /**
     * Description: 创建MyChain托管账户
     * Summary: 创建MyChain托管账户
     */
    public CreateAccountKmsResponse createAccountKms(CreateAccountKmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAccountKmsEx(request, headers, runtime);
    }

    /**
     * Description: 创建MyChain托管账户
     * Summary: 创建MyChain托管账户
     */
    public CreateAccountKmsResponse createAccountKmsEx(CreateAccountKmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.account.kms.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAccountKmsResponse());
    }

    /**
     * Description: 创建oss上传policy，客户端使用http方式自主上传文件
     * Summary: 创建资源上传规则url
     */
    public CreateResourcePolicyResponse createResourcePolicy(CreateResourcePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourcePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 创建oss上传policy，客户端使用http方式自主上传文件
     * Summary: 创建资源上传规则url
     */
    public CreateResourcePolicyResponse createResourcePolicyEx(CreateResourcePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.resource.policy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourcePolicyResponse());
    }

    /**
     * Description: 上传文件状态检测
     * Summary: 上传文件状态检测
     */
    public CheckResourceResponse checkResource(CheckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkResourceEx(request, headers, runtime);
    }

    /**
     * Description: 上传文件状态检测
     * Summary: 上传文件状态检测
     */
    public CheckResourceResponse checkResourceEx(CheckResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.resource.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckResourceResponse());
    }

    /**
     * Description: 定义数字权证AssetUri，包括权证所需各种属性
     * Summary: 定义数字权证AssetUri
     */
    public CreateAsseturiResponse createAsseturi(CreateAsseturiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAsseturiEx(request, headers, runtime);
    }

    /**
     * Description: 定义数字权证AssetUri，包括权证所需各种属性
     * Summary: 定义数字权证AssetUri
     */
    public CreateAsseturiResponse createAsseturiEx(CreateAsseturiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.asseturi.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAsseturiResponse());
    }

    /**
     * Description: 查询项目信息
     * Summary: 查询项目初始信息
     */
    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectEx(request, headers, runtime);
    }

    /**
     * Description: 查询项目信息
     * Summary: 查询项目初始信息
     */
    public QueryProjectResponse queryProjectEx(QueryProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProjectResponse());
    }

    /**
     * Description: 创建数字权证项目
     * Summary: 创建数字权证项目
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectEx(request, headers, runtime);
    }

    /**
     * Description: 创建数字权证项目
     * Summary: 创建数字权证项目
     */
    public CreateProjectResponse createProjectEx(CreateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProjectResponse());
    }

    /**
     * Description: 更新数字权证项目信息
     * Summary: 更新数字权证项目信息
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectEx(request, headers, runtime);
    }

    /**
     * Description: 更新数字权证项目信息
     * Summary: 更新数字权证项目信息
     */
    public UpdateProjectResponse updateProjectEx(UpdateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.project.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateProjectResponse());
    }

    /**
     * Description: 数字权证签发(异步)
     * Summary: 数字权证签发(异步)
     */
    public ExecContractIssueResponse execContractIssue(ExecContractIssueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractIssueEx(request, headers, runtime);
    }

    /**
     * Description: 数字权证签发(异步)
     * Summary: 数字权证签发(异步)
     */
    public ExecContractIssueResponse execContractIssueEx(ExecContractIssueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.issue.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractIssueResponse());
    }

    /**
     * Description: 查询所有项目ID列表
     * Summary: 查询所有项目ID列表
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectEx(request, headers, runtime);
    }

    /**
     * Description: 查询所有项目ID列表
     * Summary: 查询所有项目ID列表
     */
    public ListProjectResponse listProjectEx(ListProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.project.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListProjectResponse());
    }

    /**
     * Description: 查询发送到链上的交易内容
     * Summary: 查询交易
     */
    public QueryContractTransactionResponse queryContractTransaction(QueryContractTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 查询发送到链上的交易内容
     * Summary: 查询交易
     */
    public QueryContractTransactionResponse queryContractTransactionEx(QueryContractTransactionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTransactionResponse());
    }

    /**
     * Description: 查询发送到链上的交易执行的结果
     * Summary: 查询交易执行回执
     */
    public QueryContractReceiptResponse queryContractReceipt(QueryContractReceiptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractReceiptEx(request, headers, runtime);
    }

    /**
     * Description: 查询发送到链上的交易执行的结果
     * Summary: 查询交易执行回执
     */
    public QueryContractReceiptResponse queryContractReceiptEx(QueryContractReceiptRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.receipt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractReceiptResponse());
    }

    /**
     * Description: 数字权证增发(异步)
     * Summary: 数字权证增发(异步)
     */
    public ExecContractAddsupplyResponse execContractAddsupply(ExecContractAddsupplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractAddsupplyEx(request, headers, runtime);
    }

    /**
     * Description: 数字权证增发(异步)
     * Summary: 数字权证增发(异步)
     */
    public ExecContractAddsupplyResponse execContractAddsupplyEx(ExecContractAddsupplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.addsupply.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractAddsupplyResponse());
    }

    /**
     * Description: 数字权证转移(异步)
     * Summary: 数字权证转移(异步)
     */
    public ExecContractTransferResponse execContractTransfer(ExecContractTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractTransferEx(request, headers, runtime);
    }

    /**
     * Description: 数字权证转移(异步)
     * Summary: 数字权证转移(异步)
     */
    public ExecContractTransferResponse execContractTransferEx(ExecContractTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.transfer.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractTransferResponse());
    }

    /**
     * Description: 数字权证核销(异步)
     * Summary: 数字权证核销(异步)
     */
    public ExecContractWriteoffResponse execContractWriteoff(ExecContractWriteoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractWriteoffEx(request, headers, runtime);
    }

    /**
     * Description: 数字权证核销(异步)
     * Summary: 数字权证核销(异步)
     */
    public ExecContractWriteoffResponse execContractWriteoffEx(ExecContractWriteoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.writeoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractWriteoffResponse());
    }

    /**
     * Description: 数字权证销毁(异步)
     * Summary: 数字权证销毁(异步)
     */
    public ExecContractBurnoffResponse execContractBurnoff(ExecContractBurnoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractBurnoffEx(request, headers, runtime);
    }

    /**
     * Description: 数字权证销毁(异步)
     * Summary: 数字权证销毁(异步)
     */
    public ExecContractBurnoffResponse execContractBurnoffEx(ExecContractBurnoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.burnoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractBurnoffResponse());
    }

    /**
     * Description: 查询特定账户下的权证信息
     * Summary: 查询特定账户下的权证信息
     */
    public QueryContractAssetResponse queryContractAsset(QueryContractAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAssetEx(request, headers, runtime);
    }

    /**
     * Description: 查询特定账户下的权证信息
     * Summary: 查询特定账户下的权证信息
     */
    public QueryContractAssetResponse queryContractAssetEx(QueryContractAssetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.asset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAssetResponse());
    }

    /**
     * Description: 查询特定权证的uri meta信息
     * Summary: 查询特定权证的uri meta信息
     */
    public QueryContractAsseturiResponse queryContractAsseturi(QueryContractAsseturiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAsseturiEx(request, headers, runtime);
    }

    /**
     * Description: 查询特定权证的uri meta信息
     * Summary: 查询特定权证的uri meta信息
     */
    public QueryContractAsseturiResponse queryContractAsseturiEx(QueryContractAsseturiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.asseturi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAsseturiResponse());
    }

    /**
     * Description: 授权权证给某个账户
     * Summary: 数字权证授权(异步)
     */
    public ExecContractApproveResponse execContractApprove(ExecContractApproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractApproveEx(request, headers, runtime);
    }

    /**
     * Description: 授权权证给某个账户
     * Summary: 数字权证授权(异步)
     */
    public ExecContractApproveResponse execContractApproveEx(ExecContractApproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.approve.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractApproveResponse());
    }

    /**
     * Description: 取消数字权证授权
     * Summary: 取消数字权证授权(异步)
     */
    public CancelContractApproveResponse cancelContractApprove(CancelContractApproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractApproveEx(request, headers, runtime);
    }

    /**
     * Description: 取消数字权证授权
     * Summary: 取消数字权证授权(异步)
     */
    public CancelContractApproveResponse cancelContractApproveEx(CancelContractApproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.approve.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractApproveResponse());
    }

    /**
     * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
    同一个账户可具备多个角色，同一个角色可有多个账户。
     * Summary: 授权项目权证管理角色(异步)
     */
    public SetContractRoleResponse setContractRole(SetContractRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setContractRoleEx(request, headers, runtime);
    }

    /**
     * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
    同一个账户可具备多个角色，同一个角色可有多个账户。
     * Summary: 授权项目权证管理角色(异步)
     */
    public SetContractRoleResponse setContractRoleEx(SetContractRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.role.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetContractRoleResponse());
    }

    /**
     * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
     * Summary: 取消项目管理角色(异步)
     */
    public CancelContractRoleResponse cancelContractRole(CancelContractRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractRoleEx(request, headers, runtime);
    }

    /**
     * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
     * Summary: 取消项目管理角色(异步)
     */
    public CancelContractRoleResponse cancelContractRoleEx(CancelContractRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.role.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractRoleResponse());
    }

    /**
     * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
     * Summary: 批量发行权证到指定账户(异步)
     */
    public ExecContractBatchissueResponse execContractBatchissue(ExecContractBatchissueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractBatchissueEx(request, headers, runtime);
    }

    /**
     * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
     * Summary: 批量发行权证到指定账户(异步)
     */
    public ExecContractBatchissueResponse execContractBatchissueEx(ExecContractBatchissueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdigital.contract.batchissue.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractBatchissueResponse());
    }
}
