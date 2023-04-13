// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.fairopennet.models.*;
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
                    new TeaPair("sdk_version", "1.0.5"),
                    new TeaPair("_prod_code", "FAIROPENNET"),
                    new TeaPair("_prod_channel", "undefined")
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
     * Description: 测试用
     * Summary: 测试用
     */
    public StartTestResponse startTest(StartTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用
     */
    public StartTestResponse startTestEx(StartTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.test.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartTestResponse());
    }

    /**
     * Description:  
     * Summary: 初始化客户端配置
     */
    public InitClientConfigResponse initClientConfig(InitClientConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initClientConfigEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: 初始化客户端配置
     */
    public InitClientConfigResponse initClientConfigEx(InitClientConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.client.config.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitClientConfigResponse());
    }

    /**
     * Description: 启动客户端，测试连接到FAIR节点
     * Summary: 启动客户端
     */
    public StartClientResponse startClient(StartClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startClientEx(request, headers, runtime);
    }

    /**
     * Description: 启动客户端，测试连接到FAIR节点
     * Summary: 启动客户端
     */
    public StartClientResponse startClientEx(StartClientRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.client.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartClientResponse());
    }

    /**
     * Description: 获取治理模块静态配置自启动协作网络的ID
     * Summary: 获取治理模块静态配置自启动协作网络的ID
     */
    public GetGovernancemoduleNetworkidResponse getGovernancemoduleNetworkid(GetGovernancemoduleNetworkidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGovernancemoduleNetworkidEx(request, headers, runtime);
    }

    /**
     * Description: 获取治理模块静态配置自启动协作网络的ID
     * Summary: 获取治理模块静态配置自启动协作网络的ID
     */
    public GetGovernancemoduleNetworkidResponse getGovernancemoduleNetworkidEx(GetGovernancemoduleNetworkidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.governancemodule.networkid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGovernancemoduleNetworkidResponse());
    }

    /**
     * Description: 获取协作网络状态
     * Summary: 获取协作网络状态
     */
    public GetNetworkStatusResponse getNetworkStatus(GetNetworkStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNetworkStatusEx(request, headers, runtime);
    }

    /**
     * Description: 获取协作网络状态
     * Summary: 获取协作网络状态
     */
    public GetNetworkStatusResponse getNetworkStatusEx(GetNetworkStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.network.status.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNetworkStatusResponse());
    }

    /**
     * Description: 获取cube节点信息
     * Summary: 获取cube节点信息
     */
    public GetMycubenodeInfoResponse getMycubenodeInfo(GetMycubenodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMycubenodeInfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取cube节点信息
     * Summary: 获取cube节点信息
     */
    public GetMycubenodeInfoResponse getMycubenodeInfoEx(GetMycubenodeInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.mycubenode.info.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMycubenodeInfoResponse());
    }

    /**
     * Description: 手动添加cube节点
     * Summary: 手动添加cube节点
     */
    public AddTrustedcubenodeInfoResponse addTrustedcubenodeInfo(AddTrustedcubenodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTrustedcubenodeInfoEx(request, headers, runtime);
    }

    /**
     * Description: 手动添加cube节点
     * Summary: 手动添加cube节点
     */
    public AddTrustedcubenodeInfoResponse addTrustedcubenodeInfoEx(AddTrustedcubenodeInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.trustedcubenode.info.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTrustedcubenodeInfoResponse());
    }

    /**
     * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
     * Summary: 普通节点加入协作网络
     */
    public RegisterNormalNodeResponse registerNormalNode(RegisterNormalNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerNormalNodeEx(request, headers, runtime);
    }

    /**
     * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
     * Summary: 普通节点加入协作网络
     */
    public RegisterNormalNodeResponse registerNormalNodeEx(RegisterNormalNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.normal.node.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterNormalNodeResponse());
    }

    /**
     * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
     * Summary: 新建协作空间
     */
    public CreateSpaceResponse createSpace(CreateSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpaceEx(request, headers, runtime);
    }

    /**
     * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
     * Summary: 新建协作空间
     */
    public CreateSpaceResponse createSpaceEx(CreateSpaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.space.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpaceResponse());
    }

    /**
     * Description: 添加协作参与方到协作空间
     * Summary: 添加协作参与方到协作空间
     */
    public AddPartySpaceResponse addPartySpace(AddPartySpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPartySpaceEx(request, headers, runtime);
    }

    /**
     * Description: 添加协作参与方到协作空间
     * Summary: 添加协作参与方到协作空间
     */
    public AddPartySpaceResponse addPartySpaceEx(AddPartySpaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.party.space.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddPartySpaceResponse());
    }

    /**
     * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
     * Summary: 获取协作网络快照
     */
    public GetNetworkSnapshotResponse getNetworkSnapshot(GetNetworkSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNetworkSnapshotEx(request, headers, runtime);
    }

    /**
     * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
     * Summary: 获取协作网络快照
     */
    public GetNetworkSnapshotResponse getNetworkSnapshotEx(GetNetworkSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.network.snapshot.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNetworkSnapshotResponse());
    }

    /**
     * Description: shutdown client
     * Summary: shutdown client
     */
    public StopClientResponse stopClient(StopClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopClientEx(request, headers, runtime);
    }

    /**
     * Description: shutdown client
     * Summary: shutdown client
     */
    public StopClientResponse stopClientEx(StopClientRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.client.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopClientResponse());
    }

    /**
     * Description: 获取普通节点自身的节点ID
     * Summary: 获取普通节点自身的节点ID
     */
    public GetNormalmoduleNodeidResponse getNormalmoduleNodeid(GetNormalmoduleNodeidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNormalmoduleNodeidEx(request, headers, runtime);
    }

    /**
     * Description: 获取普通节点自身的节点ID
     * Summary: 获取普通节点自身的节点ID
     */
    public GetNormalmoduleNodeidResponse getNormalmoduleNodeidEx(GetNormalmoduleNodeidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.normalmodule.nodeid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNormalmoduleNodeidResponse());
    }

    /**
     * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
     * Summary: 添加协作参与方信息
     */
    public AddPartyResponse addParty(AddPartyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPartyEx(request, headers, runtime);
    }

    /**
     * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
     * Summary: 添加协作参与方信息
     */
    public AddPartyResponse addPartyEx(AddPartyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.party.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddPartyResponse());
    }

    /**
     * Description: 获取普通节点身份信息
     * Summary: 获取普通节点身份信息
     */
    public GetNormalnodeIdentityinfoResponse getNormalnodeIdentityinfo(GetNormalnodeIdentityinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNormalnodeIdentityinfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取普通节点身份信息
     * Summary: 获取普通节点身份信息
     */
    public GetNormalnodeIdentityinfoResponse getNormalnodeIdentityinfoEx(GetNormalnodeIdentityinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.normalnode.identityinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNormalnodeIdentityinfoResponse());
    }

    /**
     * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
     * Summary: 普通节点加入网络
     */
    public AddNetworkNormalnodeResponse addNetworkNormalnode(AddNetworkNormalnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addNetworkNormalnodeEx(request, headers, runtime);
    }

    /**
     * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
     * Summary: 普通节点加入网络
     */
    public AddNetworkNormalnodeResponse addNetworkNormalnodeEx(AddNetworkNormalnodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.network.normalnode.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddNetworkNormalnodeResponse());
    }

    /**
     * Description: 获取所有cube节点信息
     * Summary: 获取所有cube节点信息
     */
    public GetAllcubenodeInfoResponse getAllcubenodeInfo(GetAllcubenodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAllcubenodeInfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有cube节点信息
     * Summary: 获取所有cube节点信息
     */
    public GetAllcubenodeInfoResponse getAllcubenodeInfoEx(GetAllcubenodeInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.allcubenode.info.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAllcubenodeInfoResponse());
    }

    /**
     * Description: 添加协作参与方到一个区块链协作网络
     * Summary: 添加协作参与方到一个区块链协作网络
     */
    public ApplyPartyNetworkResponse applyPartyNetwork(ApplyPartyNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPartyNetworkEx(request, headers, runtime);
    }

    /**
     * Description: 添加协作参与方到一个区块链协作网络
     * Summary: 添加协作参与方到一个区块链协作网络
     */
    public ApplyPartyNetworkResponse applyPartyNetworkEx(ApplyPartyNetworkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.party.network.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPartyNetworkResponse());
    }

    /**
     * Description: 创建一个工作流，传入partyId，和静态flow配置
     * Summary: 创建一个工作流
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个工作流，传入partyId，和静态flow配置
     * Summary: 创建一个工作流
     */
    public CreateFlowResponse createFlowEx(CreateFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.flow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowResponse());
    }

    /**
     * Description: 运行工作流实例，提供动态配置
     * Summary: 运行工作流实例，提供动态配置
     */
    public RunFlowInstanceResponse runFlowInstance(RunFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runFlowInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 运行工作流实例，提供动态配置
     * Summary: 运行工作流实例，提供动态配置
     */
    public RunFlowInstanceResponse runFlowInstanceEx(RunFlowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.flow.instance.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunFlowInstanceResponse());
    }

    /**
     * Description: 停止运行中的工作流实例
     * Summary: 停止运行中的工作流实例
     */
    public StopFlowinstanceResponse stopFlowinstance(StopFlowinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopFlowinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 停止运行中的工作流实例
     * Summary: 停止运行中的工作流实例
     */
    public StopFlowinstanceResponse stopFlowinstanceEx(StopFlowinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.flowinstance.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopFlowinstanceResponse());
    }

    /**
     * Description: 查询工作流实例状态
     * Summary: 查询工作流实例状态
     */
    public QueryInstanceStatusResponse queryInstanceStatus(QueryInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstanceStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询工作流实例状态
     * Summary: 查询工作流实例状态
     */
    public QueryInstanceStatusResponse queryInstanceStatusEx(QueryInstanceStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.instance.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstanceStatusResponse());
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFileEx(request, headers, runtime);
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件
     */
    public UploadFileResponse uploadFileEx(UploadFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.fairopennet.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadFileResponse uploadFileResponse = UploadFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadFileResponse());
    }

    /**
     * Description: 下载文件
     * Summary: 下载文件
     */
    public DownloadFileResponse downloadFile(DownloadFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadFileEx(request, headers, runtime);
    }

    /**
     * Description: 下载文件
     * Summary: 下载文件
     */
    public DownloadFileResponse downloadFileEx(DownloadFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.fairopennet.file.download"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                DownloadFileResponse downloadFileResponse = DownloadFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return downloadFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.file.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadFileResponse());
    }

    /**
     * Description: 查询可用的fair节点nodeId
     * Summary: 查询fair node列表
     */
    public GetNodeListResponse getNodeList(GetNodeListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeListEx(request, headers, runtime);
    }

    /**
     * Description: 查询可用的fair节点nodeId
     * Summary: 查询fair node列表
     */
    public GetNodeListResponse getNodeListEx(GetNodeListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.node.list.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNodeListResponse());
    }

    /**
     * Description: 注册新用户
     * Summary: 注册新用户
     */
    public RegisterPartyResponse registerParty(RegisterPartyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerPartyEx(request, headers, runtime);
    }

    /**
     * Description: 注册新用户
     * Summary: 注册新用户
     */
    public RegisterPartyResponse registerPartyEx(RegisterPartyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.party.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterPartyResponse());
    }

    /**
     * Description: 查询用户是否注册成功
     * Summary: 查询用户注册进度
     */
    public QueryPartyRegisterstatusResponse queryPartyRegisterstatus(QueryPartyRegisterstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPartyRegisterstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户是否注册成功
     * Summary: 查询用户注册进度
     */
    public QueryPartyRegisterstatusResponse queryPartyRegisterstatusEx(QueryPartyRegisterstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.fairopennet.party.registerstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPartyRegisterstatusResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
