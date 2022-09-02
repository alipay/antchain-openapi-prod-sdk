// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.twc.models.*;
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
                    new TeaPair("sdk_version", "1.7.75"),
                    new TeaPair("_prod_code", "TWC"),
                    new TeaPair("_prod_channel", "undefined")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "twc-openapi.antchain.antgroup.com")),
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
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口
     */
    public CallbackArbitrationStatusResponse callbackArbitrationStatus(CallbackArbitrationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackArbitrationStatusEx(request, headers, runtime);
    }

    /**
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口
     */
    public CallbackArbitrationStatusResponse callbackArbitrationStatusEx(CallbackArbitrationStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackArbitrationStatusResponse());
    }

    /**
     * Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口
     */
    public CallbackArbitrationSignstatusResponse callbackArbitrationSignstatus(CallbackArbitrationSignstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackArbitrationSignstatusEx(request, headers, runtime);
    }

    /**
     * Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口
     */
    public CallbackArbitrationSignstatusResponse callbackArbitrationSignstatusEx(CallbackArbitrationSignstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.arbitration.signstatus.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackArbitrationSignstatusResponse());
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户
     */
    public CreateContractAccountResponse createContractAccount(CreateContractAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountEx(request, headers, runtime);
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户
     */
    public CreateContractAccountResponse createContractAccountEx(CreateContractAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountResponse());
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章
     */
    public CreateContractAccountsealResponse createContractAccountseal(CreateContractAccountsealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountsealEx(request, headers, runtime);
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章
     */
    public CreateContractAccountsealResponse createContractAccountsealEx(CreateContractAccountsealRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountsealResponse());
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
    创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户
     */
    public CreateContractOrganizationResponse createContractOrganization(CreateContractOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOrganizationEx(request, headers, runtime);
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
    创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户
     */
    public CreateContractOrganizationResponse createContractOrganizationEx(CreateContractOrganizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOrganizationResponse());
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章
     */
    public CreateContractOrgsealResponse createContractOrgseal(CreateContractOrgsealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOrgsealEx(request, headers, runtime);
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章
     */
    public CreateContractOrgsealResponse createContractOrgsealEx(CreateContractOrgsealRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOrgsealResponse());
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     */
    public AuthContractSignResponse authContractSign(AuthContractSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authContractSignEx(request, headers, runtime);
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     */
    public AuthContractSignResponse authContractSignEx(AuthContractSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthContractSignResponse());
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     */
    public CreateContractTemplateResponse createContractTemplate(CreateContractTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     */
    public CreateContractTemplateResponse createContractTemplateEx(CreateContractTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTemplateResponse());
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程
     */
    public CreateContractFlowResponse createContractFlow(CreateContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程
     */
    public CreateContractFlowResponse createContractFlowEx(CreateContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractFlowResponse());
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     */
    public AddContractDocumentResponse addContractDocument(AddContractDocumentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractDocumentEx(request, headers, runtime);
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     */
    public AddContractDocumentResponse addContractDocumentEx(AddContractDocumentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractDocumentResponse());
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     */
    public AddContractSignfieldResponse addContractSignfield(AddContractSignfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractSignfieldEx(request, headers, runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     */
    public AddContractSignfieldResponse addContractSignfieldEx(AddContractSignfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractSignfieldResponse());
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     */
    public StartContractFlowResponse startContractFlow(StartContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     */
    public StartContractFlowResponse startContractFlowEx(StartContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartContractFlowResponse());
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     */
    public SaveContractFlowResponse saveContractFlow(SaveContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     */
    public SaveContractFlowResponse saveContractFlowEx(SaveContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveContractFlowResponse());
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     */
    public DownloadContractDocumentResponse downloadContractDocument(DownloadContractDocumentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadContractDocumentEx(request, headers, runtime);
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     */
    public DownloadContractDocumentResponse downloadContractDocumentEx(DownloadContractDocumentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadContractDocumentResponse());
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     */
    public AddContractFileResponse addContractFile(AddContractFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractFileEx(request, headers, runtime);
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     */
    public AddContractFileResponse addContractFileEx(AddContractFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractFileResponse());
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     */
    public CreateContractPlatformResponse createContractPlatform(CreateContractPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractPlatformEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     */
    public CreateContractPlatformResponse createContractPlatformEx(CreateContractPlatformRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractPlatformResponse());
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册
     */
    public CreateContractUserResponse createContractUser(CreateContractUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractUserEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册
     */
    public CreateContractUserResponse createContractUserEx(CreateContractUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractUserResponse());
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程
     */
    public StartContractHandsignResponse startContractHandsign(StartContractHandsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startContractHandsignEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程
     */
    public StartContractHandsignResponse startContractHandsignEx(StartContractHandsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartContractHandsignResponse());
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     */
    public QueryContractFlowResponse queryContractFlow(QueryContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     */
    public QueryContractFlowResponse queryContractFlowEx(QueryContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowResponse());
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimage(CreateContractAccountsealimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountsealimageEx(request, headers, runtime);
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimageEx(CreateContractAccountsealimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountsealimageResponse());
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     */
    public GetContractFileuploadurlResponse getContractFileuploadurl(GetContractFileuploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileuploadurlEx(request, headers, runtime);
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     */
    public GetContractFileuploadurlResponse getContractFileuploadurlEx(GetContractFileuploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileuploadurlResponse());
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
    签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区
     */
    public AddContractPlatformsignfieldsResponse addContractPlatformsignfields(AddContractPlatformsignfieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractPlatformsignfieldsEx(request, headers, runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
    签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区
     */
    public AddContractPlatformsignfieldsResponse addContractPlatformsignfieldsEx(AddContractPlatformsignfieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractPlatformsignfieldsResponse());
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     */
    public GetContractFileResponse getContractFile(GetContractFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileEx(request, headers, runtime);
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     */
    public GetContractFileResponse getContractFileEx(GetContractFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileResponse());
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章
     */
    public QueryContractAccountsealsResponse queryContractAccountseals(QueryContractAccountsealsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAccountsealsEx(request, headers, runtime);
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章
     */
    public QueryContractAccountsealsResponse queryContractAccountsealsEx(QueryContractAccountsealsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAccountsealsResponse());
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章
     */
    public QueryContractOrganizationsealsResponse queryContractOrganizationseals(QueryContractOrganizationsealsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractOrganizationsealsEx(request, headers, runtime);
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章
     */
    public QueryContractOrganizationsealsResponse queryContractOrganizationsealsEx(QueryContractOrganizationsealsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractOrganizationsealsResponse());
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     */
    public QueryContractFlowsignerResponse queryContractFlowsigner(QueryContractFlowsignerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowsignerEx(request, headers, runtime);
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     */
    public QueryContractFlowsignerResponse queryContractFlowsignerEx(QueryContractFlowsignerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowsignerResponse());
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     */
    public QueryContractSignfieldsResponse queryContractSignfields(QueryContractSignfieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractSignfieldsEx(request, headers, runtime);
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     */
    public QueryContractSignfieldsResponse queryContractSignfieldsEx(QueryContractSignfieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractSignfieldsResponse());
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号
     */
    public QueryContractAccountResponse queryContractAccount(QueryContractAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAccountEx(request, headers, runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号
     */
    public QueryContractAccountResponse queryContractAccountEx(QueryContractAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAccountResponse());
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号
     */
    public QueryContractOrganizationResponse queryContractOrganization(QueryContractOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractOrganizationEx(request, headers, runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号
     */
    public QueryContractOrganizationResponse queryContractOrganizationEx(QueryContractOrganizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractOrganizationResponse());
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情
     */
    public QueryContractTemplateResponse queryContractTemplate(QueryContractTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情
     */
    public QueryContractTemplateResponse queryContractTemplateEx(QueryContractTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTemplateResponse());
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     */
    public CreateContractSignflowResponse createContractSignflow(CreateContractSignflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractSignflowEx(request, headers, runtime);
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     */
    public CreateContractSignflowResponse createContractSignflowEx(CreateContractSignflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractSignflowResponse());
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议
     */
    public CreateContractRegisterzftResponse createContractRegisterzft(CreateContractRegisterzftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractRegisterzftEx(request, headers, runtime);
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议
     */
    public CreateContractRegisterzftResponse createContractRegisterzftEx(CreateContractRegisterzftRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractRegisterzftResponse());
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     */
    public CreateContractPlatformtemplateResponse createContractPlatformtemplate(CreateContractPlatformtemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractPlatformtemplateEx(request, headers, runtime);
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     */
    public CreateContractPlatformtemplateResponse createContractPlatformtemplateEx(CreateContractPlatformtemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractPlatformtemplateResponse());
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息
     */
    public QueryContractMerchantzftResponse queryContractMerchantzft(QueryContractMerchantzftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantzftEx(request, headers, runtime);
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息
     */
    public QueryContractMerchantzftResponse queryContractMerchantzftEx(QueryContractMerchantzftRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantzftResponse());
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易
     */
    public ListContractOuttradeidResponse listContractOuttradeid(ListContractOuttradeidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractOuttradeidEx(request, headers, runtime);
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易
     */
    public ListContractOuttradeidResponse listContractOuttradeidEx(ListContractOuttradeidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractOuttradeidResponse());
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情
     */
    public QueryContractTradedetailResponse queryContractTradedetail(QueryContractTradedetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTradedetailEx(request, headers, runtime);
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情
     */
    public QueryContractTradedetailResponse queryContractTradedetailEx(QueryContractTradedetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTradedetailResponse());
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款
     */
    public CreateContractMerchantrefundResponse createContractMerchantrefund(CreateContractMerchantrefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantrefundEx(request, headers, runtime);
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款
     */
    public CreateContractMerchantrefundResponse createContractMerchantrefundEx(CreateContractMerchantrefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantrefundResponse());
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户
     */
    public CreateContractAdminaccountResponse createContractAdminaccount(CreateContractAdminaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAdminaccountEx(request, headers, runtime);
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户
     */
    public CreateContractAdminaccountResponse createContractAdminaccountEx(CreateContractAdminaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAdminaccountResponse());
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId
     */
    public ListContractTradeidsResponse listContractTradeids(ListContractTradeidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractTradeidsEx(request, headers, runtime);
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId
     */
    public ListContractTradeidsResponse listContractTradeidsEx(ListContractTradeidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractTradeidsResponse());
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则
     */
    public CreateContractCommontriggerResponse createContractCommontrigger(CreateContractCommontriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractCommontriggerEx(request, headers, runtime);
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则
     */
    public CreateContractCommontriggerResponse createContractCommontriggerEx(CreateContractCommontriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractCommontriggerResponse());
    }

    /**
     * Description: 商户入驻直付通
     * Summary: 商户入驻直付通
     */
    public CreateContractMerchantindirectzftResponse createContractMerchantindirectzft(CreateContractMerchantindirectzftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantindirectzftEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻直付通
     * Summary: 商户入驻直付通
     */
    public CreateContractMerchantindirectzftResponse createContractMerchantindirectzftEx(CreateContractMerchantindirectzftRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantindirectzftResponse());
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息
     */
    public QueryContractMerchantindirectzftResponse queryContractMerchantindirectzft(QueryContractMerchantindirectzftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantindirectzftEx(request, headers, runtime);
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息
     */
    public QueryContractMerchantindirectzftResponse queryContractMerchantindirectzftEx(QueryContractMerchantindirectzftRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantindirectzftResponse());
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url
     */
    public QueryPayresultfileurlResponse queryPayresultfileurl(QueryPayresultfileurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPayresultfileurlEx(request, headers, runtime);
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url
     */
    public QueryPayresultfileurlResponse queryPayresultfileurlEx(QueryPayresultfileurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPayresultfileurlResponse());
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传
     */
    public CreateContractMerchantimageResponse createContractMerchantimage(CreateContractMerchantimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantimageEx(request, headers, runtime);
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传
     */
    public CreateContractMerchantimageResponse createContractMerchantimageEx(CreateContractMerchantimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantimageResponse());
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目
     */
    public CancelContractPaytradeResponse cancelContractPaytrade(CancelContractPaytradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractPaytradeEx(request, headers, runtime);
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目
     */
    public CancelContractPaytradeResponse cancelContractPaytradeEx(CancelContractPaytradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractPaytradeResponse());
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程
     */
    public CreateContractHandsignflowResponse createContractHandsignflow(CreateContractHandsignflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractHandsignflowEx(request, headers, runtime);
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程
     */
    public CreateContractHandsignflowResponse createContractHandsignflowEx(CreateContractHandsignflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractHandsignflowResponse());
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     */
    public CreateContractHandsignfieldResponse createContractHandsignfield(CreateContractHandsignfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractHandsignfieldEx(request, headers, runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     */
    public CreateContractHandsignfieldResponse createContractHandsignfieldEx(CreateContractHandsignfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractHandsignfieldResponse());
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     */
    public GetContractSignurlResponse getContractSignurl(GetContractSignurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractSignurlEx(request, headers, runtime);
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     */
    public GetContractSignurlResponse getContractSignurlEx(GetContractSignurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractSignurlResponse());
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建
     */
    public CreateWithholdAgreementResponse createWithholdAgreement(CreateWithholdAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建
     */
    public CreateWithholdAgreementResponse createWithholdAgreementEx(CreateWithholdAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdAgreementResponse());
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容
     */
    public QueryWithholdAgreementResponse queryWithholdAgreement(QueryWithholdAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容
     */
    public QueryWithholdAgreementResponse queryWithholdAgreementEx(QueryWithholdAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdAgreementResponse());
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口
     */
    public QueryWithholdAgreementurlResponse queryWithholdAgreementurl(QueryWithholdAgreementurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdAgreementurlEx(request, headers, runtime);
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口
     */
    public QueryWithholdAgreementurlResponse queryWithholdAgreementurlEx(QueryWithholdAgreementurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdAgreementurlResponse());
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日
     */
    public CreateWithholdOverduetimeResponse createWithholdOverduetime(CreateWithholdOverduetimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdOverduetimeEx(request, headers, runtime);
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日
     */
    public CreateWithholdOverduetimeResponse createWithholdOverduetimeEx(CreateWithholdOverduetimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdOverduetimeResponse());
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     */
    public SendWithholdDeductResponse sendWithholdDeduct(SendWithholdDeductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendWithholdDeductEx(request, headers, runtime);
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     */
    public SendWithholdDeductResponse sendWithholdDeductEx(SendWithholdDeductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendWithholdDeductResponse());
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询
     */
    public QueryWithholdPayresultResponse queryWithholdPayresult(QueryWithholdPayresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdPayresultEx(request, headers, runtime);
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询
     */
    public QueryWithholdPayresultResponse queryWithholdPayresultEx(QueryWithholdPayresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdPayresultResponse());
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     */
    public SendWithholdRefundResponse sendWithholdRefund(SendWithholdRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendWithholdRefundEx(request, headers, runtime);
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     */
    public SendWithholdRefundResponse sendWithholdRefundEx(SendWithholdRefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendWithholdRefundResponse());
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     */
    public SendContractInvitationResponse sendContractInvitation(SendContractInvitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendContractInvitationEx(request, headers, runtime);
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     */
    public SendContractInvitationResponse sendContractInvitationEx(SendContractInvitationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendContractInvitationResponse());
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则
     */
    public ListContractPayruleResponse listContractPayrule(ListContractPayruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractPayruleEx(request, headers, runtime);
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则
     */
    public ListContractPayruleResponse listContractPayruleEx(ListContractPayruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractPayruleResponse());
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     */
    public CreateWithholdQrcodeResponse createWithholdQrcode(CreateWithholdQrcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdQrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     */
    public CreateWithholdQrcodeResponse createWithholdQrcodeEx(CreateWithholdQrcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdQrcodeResponse());
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则
     */
    public CancelContractPaysingletradeResponse cancelContractPaysingletrade(CancelContractPaysingletradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractPaysingletradeEx(request, headers, runtime);
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则
     */
    public CancelContractPaysingletradeResponse cancelContractPaysingletradeEx(CancelContractPaysingletradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractPaysingletradeResponse());
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkey(ApplyContractCallbackkeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractCallbackkeyEx(request, headers, runtime);
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkeyEx(ApplyContractCallbackkeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractCallbackkeyResponse());
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口
     */
    public CreateContractOnestepflowResponse createContractOnestepflow(CreateContractOnestepflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOnestepflowEx(request, headers, runtime);
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口
     */
    public CreateContractOnestepflowResponse createContractOnestepflowEx(CreateContractOnestepflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOnestepflowResponse());
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息
     */
    public QueryContractNotaryResponse queryContractNotary(QueryContractNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息
     */
    public QueryContractNotaryResponse queryContractNotaryEx(QueryContractNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.notary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractNotaryResponse());
    }

    /**
     * Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID
     */
    public CreateEcocontractTransResponse createEcocontractTrans(CreateEcocontractTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEcocontractTransEx(request, headers, runtime);
    }

    /**
     * Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID
     */
    public CreateEcocontractTransResponse createEcocontractTransEx(CreateEcocontractTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ecocontract.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEcocontractTransResponse());
    }

    /**
     * Description: 合同文本存证
     * Summary: 合同文本存证
     */
    public CreateEcocontractTextResponse createEcocontractText(CreateEcocontractTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEcocontractTextEx(request, headers, runtime);
    }

    /**
     * Description: 合同文本存证
     * Summary: 合同文本存证
     */
    public CreateEcocontractTextResponse createEcocontractTextEx(CreateEcocontractTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ecocontract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEcocontractTextResponse());
    }

    /**
     * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标
     */
    public QueryContractWordspositionResponse queryContractWordsposition(QueryContractWordspositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractWordspositionEx(request, headers, runtime);
    }

    /**
     * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标
     */
    public QueryContractWordspositionResponse queryContractWordspositionEx(QueryContractWordspositionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.wordsposition.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractWordspositionResponse());
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人
     */
    public DeleteContractSignerResponse deleteContractSigner(DeleteContractSignerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractSignerEx(request, headers, runtime);
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人
     */
    public DeleteContractSignerResponse deleteContractSignerEx(DeleteContractSignerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractSignerResponse());
    }

    /**
     * Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明
     */
    public GetContractCertificateResponse getContractCertificate(GetContractCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明
     */
    public GetContractCertificateResponse getContractCertificateEx(GetContractCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractCertificateResponse());
    }

    /**
     * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id
     */
    public QueryContractSignfieldsealidResponse queryContractSignfieldsealid(QueryContractSignfieldsealidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractSignfieldsealidEx(request, headers, runtime);
    }

    /**
     * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id
     */
    public QueryContractSignfieldsealidResponse queryContractSignfieldsealidEx(QueryContractSignfieldsealidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfieldsealid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractSignfieldsealidResponse());
    }

    /**
     * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署
     */
    public NotifyContractSignerResponse notifyContractSigner(NotifyContractSignerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyContractSignerEx(request, headers, runtime);
    }

    /**
     * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署
     */
    public NotifyContractSignerResponse notifyContractSignerEx(NotifyContractSignerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signer.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyContractSignerResponse());
    }

    /**
     * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息
     */
    public UpdateContractPlatformResponse updateContractPlatform(UpdateContractPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractPlatformEx(request, headers, runtime);
    }

    /**
     * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息
     */
    public UpdateContractPlatformResponse updateContractPlatformEx(UpdateContractPlatformRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platform.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractPlatformResponse());
    }

    /**
     * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息
     */
    public UpdateContractUserResponse updateContractUser(UpdateContractUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractUserEx(request, headers, runtime);
    }

    /**
     * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息
     */
    public UpdateContractUserResponse updateContractUserEx(UpdateContractUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractUserResponse());
    }

    /**
     * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
     * Summary: 修改机构用户注册信息
     */
    public UpdateContractOrganizationResponse updateContractOrganization(UpdateContractOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractOrganizationEx(request, headers, runtime);
    }

    /**
     * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
     * Summary: 修改机构用户注册信息
     */
    public UpdateContractOrganizationResponse updateContractOrganizationEx(UpdateContractOrganizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractOrganizationResponse());
    }

    /**
     * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口
     */
    public ApplyContractMerchantResponse applyContractMerchant(ApplyContractMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口
     */
    public ApplyContractMerchantResponse applyContractMerchantEx(ApplyContractMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractMerchantResponse());
    }

    /**
     * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认
     */
    public ConfirmContractMerchantResponse confirmContractMerchant(ConfirmContractMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmContractMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认
     */
    public ConfirmContractMerchantResponse confirmContractMerchantEx(ConfirmContractMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmContractMerchantResponse());
    }

    /**
     * Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。
     */
    public CreatePrivatecontractTransResponse createPrivatecontractTrans(CreatePrivatecontractTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivatecontractTransEx(request, headers, runtime);
    }

    /**
     * Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。
     */
    public CreatePrivatecontractTransResponse createPrivatecontractTransEx(CreatePrivatecontractTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePrivatecontractTransResponse());
    }

    /**
     * Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。
     */
    public CreatePrivatecontractTextResponse createPrivatecontractText(CreatePrivatecontractTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivatecontractTextEx(request, headers, runtime);
    }

    /**
     * Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。
     */
    public CreatePrivatecontractTextResponse createPrivatecontractTextEx(CreatePrivatecontractTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePrivatecontractTextResponse());
    }

    /**
     * Description: 个人二要素校验
     * Summary: 个人二要素校验
     */
    public VerifyPrivatepersonTwometaResponse verifyPrivatepersonTwometa(VerifyPrivatepersonTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatepersonTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人二要素校验
     * Summary: 个人二要素校验
     */
    public VerifyPrivatepersonTwometaResponse verifyPrivatepersonTwometaEx(VerifyPrivatepersonTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privateperson.twometa.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatepersonTwometaResponse());
    }

    /**
     * Description: 企业二要素校验
     * Summary: 企业二要素校验
     */
    public VerifyPrivatecompanyTwometaResponse verifyPrivatecompanyTwometa(VerifyPrivatecompanyTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatecompanyTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 企业二要素校验
     * Summary: 企业二要素校验
     */
    public VerifyPrivatecompanyTwometaResponse verifyPrivatecompanyTwometaEx(VerifyPrivatecompanyTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecompany.twometa.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatecompanyTwometaResponse());
    }

    /**
     * Description: 企业四要素校验
     * Summary: 企业四要素校验
     */
    public VerifyPrivatecompanyFourmetaResponse verifyPrivatecompanyFourmeta(VerifyPrivatecompanyFourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatecompanyFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业四要素校验
     * Summary: 企业四要素校验
     */
    public VerifyPrivatecompanyFourmetaResponse verifyPrivatecompanyFourmetaEx(VerifyPrivatecompanyFourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecompany.fourmeta.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatecompanyFourmetaResponse());
    }

    /**
     * Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.
     */
    public ApplyPrivatecontractCertResponse applyPrivatecontractCert(ApplyPrivatecontractCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPrivatecontractCertEx(request, headers, runtime);
    }

    /**
     * Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.
     */
    public ApplyPrivatecontractCertResponse applyPrivatecontractCertEx(ApplyPrivatecontractCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.cert.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPrivatecontractCertResponse());
    }

    /**
     * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询
     */
    public QueryContractTradestatusResponse queryContractTradestatus(QueryContractTradestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTradestatusEx(request, headers, runtime);
    }

    /**
     * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询
     */
    public QueryContractTradestatusResponse queryContractTradestatusEx(QueryContractTradestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTradestatusResponse());
    }

    /**
     * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询
     */
    public QueryContractRefundResponse queryContractRefund(QueryContractRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractRefundEx(request, headers, runtime);
    }

    /**
     * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询
     */
    public QueryContractRefundResponse queryContractRefundEx(QueryContractRefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractRefundResponse());
    }

    /**
     * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址
     */
    public GetPrivatecontractSignurlResponse getPrivatecontractSignurl(GetPrivatecontractSignurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPrivatecontractSignurlEx(request, headers, runtime);
    }

    /**
     * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址
     */
    public GetPrivatecontractSignurlResponse getPrivatecontractSignurlEx(GetPrivatecontractSignurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.signurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPrivatecontractSignurlResponse());
    }

    /**
     * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询
     */
    public QueryContractMerchantorderResponse queryContractMerchantorder(QueryContractMerchantorderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantorderEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询
     */
    public QueryContractMerchantorderResponse queryContractMerchantorderEx(QueryContractMerchantorderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantorderResponse());
    }

    /**
     * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改
     */
    public UpdateContractMerchantResponse updateContractMerchant(UpdateContractMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改
     */
    public UpdateContractMerchantResponse updateContractMerchantEx(UpdateContractMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractMerchantResponse());
    }

    /**
     * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口
     */
    public BindContractMerchantResponse bindContractMerchant(BindContractMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindContractMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口
     */
    public BindContractMerchantResponse bindContractMerchantEx(BindContractMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindContractMerchantResponse());
    }

    /**
     * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例
     */
    public InitPrivatecontractIntanceResponse initPrivatecontractIntance(InitPrivatecontractIntanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initPrivatecontractIntanceEx(request, headers, runtime);
    }

    /**
     * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例
     */
    public InitPrivatecontractIntanceResponse initPrivatecontractIntanceEx(InitPrivatecontractIntanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.intance.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitPrivatecontractIntanceResponse());
    }

    /**
     * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息
     */
    public UpdatePrivatecontractIntanceResponse updatePrivatecontractIntance(UpdatePrivatecontractIntanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivatecontractIntanceEx(request, headers, runtime);
    }

    /**
     * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息
     */
    public UpdatePrivatecontractIntanceResponse updatePrivatecontractIntanceEx(UpdatePrivatecontractIntanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.intance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePrivatecontractIntanceResponse());
    }

    /**
     * Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.
     */
    public UpdatePrivatecontractCertResponse updatePrivatecontractCert(UpdatePrivatecontractCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivatecontractCertEx(request, headers, runtime);
    }

    /**
     * Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.
     */
    public UpdatePrivatecontractCertResponse updatePrivatecontractCertEx(UpdatePrivatecontractCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.cert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePrivatecontractCertResponse());
    }

    /**
     * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置
     */
    public ResetContractMerchantapplyResponse resetContractMerchantapply(ResetContractMerchantapplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetContractMerchantapplyEx(request, headers, runtime);
    }

    /**
     * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置
     */
    public ResetContractMerchantapplyResponse resetContractMerchantapplyEx(ResetContractMerchantapplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantapply.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetContractMerchantapplyResponse());
    }

    /**
     * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况
     */
    public CheckPrivatecontractProvisionResponse checkPrivatecontractProvision(CheckPrivatecontractProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPrivatecontractProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况
     */
    public CheckPrivatecontractProvisionResponse checkPrivatecontractProvisionEx(CheckPrivatecontractProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.provision.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPrivatecontractProvisionResponse());
    }

    /**
     * Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送
     */
    public PushPrivatecontractGaugeResponse pushPrivatecontractGauge(PushPrivatecontractGaugeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPrivatecontractGaugeEx(request, headers, runtime);
    }

    /**
     * Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送
     */
    public PushPrivatecontractGaugeResponse pushPrivatecontractGaugeEx(PushPrivatecontractGaugeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.gauge.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushPrivatecontractGaugeResponse());
    }

    /**
     * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验
     */
    public CheckContractCourtdeductResponse checkContractCourtdeduct(CheckContractCourtdeductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验
     */
    public CheckContractCourtdeductResponse checkContractCourtdeductEx(CheckContractCourtdeductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContractCourtdeductResponse());
    }

    /**
     * Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建
     */
    public CreateContractCourtdeductResponse createContractCourtdeduct(CreateContractCourtdeductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建
     */
    public CreateContractCourtdeductResponse createContractCourtdeductEx(CreateContractCourtdeductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractCourtdeductResponse());
    }

    /**
     * Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款
     */
    public ExecContractCourtdeductResponse execContractCourtdeduct(ExecContractCourtdeductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款
     */
    public ExecContractCourtdeductResponse execContractCourtdeductEx(ExecContractCourtdeductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractCourtdeductResponse());
    }

    /**
     * Description: 文本签名
     * Summary: 文本签接口
     */
    public GetContractTextsignResponse getContractTextsign(GetContractTextsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractTextsignEx(request, headers, runtime);
    }

    /**
     * Description: 文本签名
     * Summary: 文本签接口
     */
    public GetContractTextsignResponse getContractTextsignEx(GetContractTextsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.textsign.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractTextsignResponse());
    }

    /**
     * Description: 文本验签
     * Summary: 文本验签接口
     */
    public VerifyContractTextsignResponse verifyContractTextsign(VerifyContractTextsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyContractTextsignEx(request, headers, runtime);
    }

    /**
     * Description: 文本验签
     * Summary: 文本验签接口
     */
    public VerifyContractTextsignResponse verifyContractTextsignEx(VerifyContractTextsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.textsign.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyContractTextsignResponse());
    }

    /**
     * Description: 文件签验签
     * Summary: 文件签验签
     */
    public VerifyContractDocsignResponse verifyContractDocsign(VerifyContractDocsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyContractDocsignEx(request, headers, runtime);
    }

    /**
     * Description: 文件签验签
     * Summary: 文件签验签
     */
    public VerifyContractDocsignResponse verifyContractDocsignEx(VerifyContractDocsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.docsign.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyContractDocsignResponse());
    }

    /**
     * Description: 删除签署区
     * Summary: 删除签署区
     */
    public DeleteContractSignfieldResponse deleteContractSignfield(DeleteContractSignfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractSignfieldEx(request, headers, runtime);
    }

    /**
     * Description: 删除签署区
     * Summary: 删除签署区
     */
    public DeleteContractSignfieldResponse deleteContractSignfieldEx(DeleteContractSignfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfield.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractSignfieldResponse());
    }

    /**
     * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据
     */
    public SyncInnerTransResponse syncInnerTrans(SyncInnerTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTransEx(request, headers, runtime);
    }

    /**
     * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据
     */
    public SyncInnerTransResponse syncInnerTransEx(SyncInnerTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.trans.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTransResponse());
    }

    /**
     * Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据
     */
    public SyncInnerNotaryResponse syncInnerNotary(SyncInnerNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据
     */
    public SyncInnerNotaryResponse syncInnerNotaryEx(SyncInnerNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.notary.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerNotaryResponse());
    }

    /**
     * Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据
     */
    public SyncInnerTwcopenResponse syncInnerTwcopen(SyncInnerTwcopenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTwcopenEx(request, headers, runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据
     */
    public SyncInnerTwcopenResponse syncInnerTwcopenEx(SyncInnerTwcopenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.twcopen.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTwcopenResponse());
    }

    /**
     * Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据
     */
    public SyncInnerProvisionResponse syncInnerProvision(SyncInnerProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据
     */
    public SyncInnerProvisionResponse syncInnerProvisionEx(SyncInnerProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.provision.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerProvisionResponse());
    }

    /**
     * Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据
     */
    public SyncInnerTsrResponse syncInnerTsr(SyncInnerTsrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTsrEx(request, headers, runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据
     */
    public SyncInnerTsrResponse syncInnerTsrEx(SyncInnerTsrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.tsr.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTsrResponse());
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     */
    public CheckEpidentityTwometaResponse checkEpidentityTwometa(CheckEpidentityTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     */
    public CheckEpidentityTwometaResponse checkEpidentityTwometaEx(CheckEpidentityTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityTwometaResponse());
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     */
    public CheckEpidentityThreemetaResponse checkEpidentityThreemeta(CheckEpidentityThreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     */
    public CheckEpidentityThreemetaResponse checkEpidentityThreemetaEx(CheckEpidentityThreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityThreemetaResponse());
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     */
    public CheckEpidentityFourmetaResponse checkEpidentityFourmeta(CheckEpidentityFourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     */
    public CheckEpidentityFourmetaResponse checkEpidentityFourmetaEx(CheckEpidentityFourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityFourmetaResponse());
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性
     */
    public CheckNotarizationOrderResponse checkNotarizationOrder(CheckNotarizationOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性
     */
    public CheckNotarizationOrderResponse checkNotarizationOrderEx(CheckNotarizationOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckNotarizationOrderResponse());
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     */
    public UpdateNotarizationOrderResponse updateNotarizationOrder(UpdateNotarizationOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     */
    public UpdateNotarizationOrderResponse updateNotarizationOrderEx(UpdateNotarizationOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateNotarizationOrderResponse());
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性
     */
    public SetNotarizationOrderResponse setNotarizationOrder(SetNotarizationOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性
     */
    public SetNotarizationOrderResponse setNotarizationOrderEx(SetNotarizationOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetNotarizationOrderResponse());
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauth(InitIdentificationFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauthEx(InitIdentificationFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIdentificationFaceauthResponse());
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     */
    public CertifyIdentificationFaceauthResponse certifyIdentificationFaceauth(CertifyIdentificationFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     */
    public CertifyIdentificationFaceauthResponse certifyIdentificationFaceauthEx(CertifyIdentificationFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIdentificationFaceauthResponse());
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauth(QueryIdentificationFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauthEx(QueryIdentificationFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationFaceauthResponse());
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询
     */
    public QueryEnterpriseFaceauthResponse queryEnterpriseFaceauth(QueryEnterpriseFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询
     */
    public QueryEnterpriseFaceauthResponse queryEnterpriseFaceauthEx(QueryEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseFaceauthResponse());
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化
     */
    public InitEnterpriseFaceauthResponse initEnterpriseFaceauth(InitEnterpriseFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化
     */
    public InitEnterpriseFaceauthResponse initEnterpriseFaceauthEx(InitEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEnterpriseFaceauthResponse());
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始
     */
    public CertifyEnterpriseFaceauthResponse certifyEnterpriseFaceauth(CertifyEnterpriseFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始
     */
    public CertifyEnterpriseFaceauthResponse certifyEnterpriseFaceauthEx(CertifyEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyEnterpriseFaceauthResponse());
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建
     */
    public CreateLeaseOrderResponse createLeaseOrder(CreateLeaseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseOrderEx(request, headers, runtime);
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建
     */
    public CreateLeaseOrderResponse createLeaseOrderEx(CreateLeaseOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseOrderResponse());
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单
     */
    public CreateNotarizationBillResponse createNotarizationBill(CreateNotarizationBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotarizationBillEx(request, headers, runtime);
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单
     */
    public CreateNotarizationBillResponse createNotarizationBillEx(CreateNotarizationBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotarizationBillResponse());
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单
     */
    public InitCertificationResponse initCertification(InitCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCertificationEx(request, headers, runtime);
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单
     */
    public InitCertificationResponse initCertificationEx(InitCertificationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCertificationResponse());
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     */
    public QueryCertificationResponse queryCertification(QueryCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertificationEx(request, headers, runtime);
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     */
    public QueryCertificationResponse queryCertificationEx(QueryCertificationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertificationResponse());
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书
     */
    public GetTsrCertificateResponse getTsrCertificate(GetTsrCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTsrCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书
     */
    public GetTsrCertificateResponse getTsrCertificateEx(GetTsrCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTsrCertificateResponse());
    }

    /**
     * Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建
     */
    public CreateIdentificationRealpersonResponse createIdentificationRealperson(CreateIdentificationRealpersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentificationRealpersonEx(request, headers, runtime);
    }

    /**
     * Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建
     */
    public CreateIdentificationRealpersonResponse createIdentificationRealpersonEx(CreateIdentificationRealpersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.realperson.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIdentificationRealpersonResponse());
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryIdentificationRealpersonResponse queryIdentificationRealperson(QueryIdentificationRealpersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRealpersonEx(request, headers, runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryIdentificationRealpersonResponse queryIdentificationRealpersonEx(QueryIdentificationRealpersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.realperson.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRealpersonResponse());
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口
     */
    public SaveJointconstraintRecordResponse saveJointconstraintRecord(SaveJointconstraintRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveJointconstraintRecordEx(request, headers, runtime);
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口
     */
    public SaveJointconstraintRecordResponse saveJointconstraintRecordEx(SaveJointconstraintRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveJointconstraintRecordResponse());
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口
     */
    public DeleteJointconstraintRecordResponse deleteJointconstraintRecord(DeleteJointconstraintRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJointconstraintRecordEx(request, headers, runtime);
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口
     */
    public DeleteJointconstraintRecordResponse deleteJointconstraintRecordEx(DeleteJointconstraintRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteJointconstraintRecordResponse());
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口
     */
    public QueryJointconstraintBreachrecordResponse queryJointconstraintBreachrecord(QueryJointconstraintBreachrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJointconstraintBreachrecordEx(request, headers, runtime);
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口
     */
    public QueryJointconstraintBreachrecordResponse queryJointconstraintBreachrecordEx(QueryJointconstraintBreachrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJointconstraintBreachrecordResponse());
    }

    /**
     * Description: 提供给第三方调解申请提交
     * Summary: 调解申请
     */
    public ApplyJusticeMediationResponse applyJusticeMediation(ApplyJusticeMediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyJusticeMediationEx(request, headers, runtime);
    }

    /**
     * Description: 提供给第三方调解申请提交
     * Summary: 调解申请
     */
    public ApplyJusticeMediationResponse applyJusticeMediationEx(ApplyJusticeMediationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.mediation.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyJusticeMediationResponse());
    }

    /**
     * Description: 调解申请进度查询
     * Summary: 调解申请进度查询
     */
    public QueryJusticeMediationResponse queryJusticeMediation(QueryJusticeMediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeMediationEx(request, headers, runtime);
    }

    /**
     * Description: 调解申请进度查询
     * Summary: 调解申请进度查询
     */
    public QueryJusticeMediationResponse queryJusticeMediationEx(QueryJusticeMediationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.mediation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeMediationResponse());
    }

    /**
     * Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口
     */
    public QueryJusticeCaseinfoResponse queryJusticeCaseinfo(QueryJusticeCaseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeCaseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口
     */
    public QueryJusticeCaseinfoResponse queryJusticeCaseinfoEx(QueryJusticeCaseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.caseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeCaseinfoResponse());
    }

    /**
     * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径
     */
    public GetJusticeUploadfilepathResponse getJusticeUploadfilepath(GetJusticeUploadfilepathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJusticeUploadfilepathEx(request, headers, runtime);
    }

    /**
     * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径
     */
    public GetJusticeUploadfilepathResponse getJusticeUploadfilepathEx(GetJusticeUploadfilepathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.uploadfilepath.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetJusticeUploadfilepathResponse());
    }

    /**
     * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写
     */
    public CreateJusticeCasewritebackResponse createJusticeCasewriteback(CreateJusticeCasewritebackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeCasewritebackEx(request, headers, runtime);
    }

    /**
     * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写
     */
    public CreateJusticeCasewritebackResponse createJusticeCasewritebackEx(CreateJusticeCasewritebackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casewriteback.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeCasewritebackResponse());
    }

    /**
     * Description: 案件基础信息查询
     * Summary: 案件基础信息查询
     */
    public QueryJusticeBasecaseResponse queryJusticeBasecase(QueryJusticeBasecaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeBasecaseEx(request, headers, runtime);
    }

    /**
     * Description: 案件基础信息查询
     * Summary: 案件基础信息查询
     */
    public QueryJusticeBasecaseResponse queryJusticeBasecaseEx(QueryJusticeBasecaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.basecase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeBasecaseResponse());
    }

    /**
     * Description: 案件材料下载
     * Summary: 案件材料下载
     */
    public DownloadJusticeCasefileResponse downloadJusticeCasefile(DownloadJusticeCasefileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadJusticeCasefileEx(request, headers, runtime);
    }

    /**
     * Description: 案件材料下载
     * Summary: 案件材料下载
     */
    public DownloadJusticeCasefileResponse downloadJusticeCasefileEx(DownloadJusticeCasefileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casefile.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadJusticeCasefileResponse());
    }

    /**
     * Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限
     */
    public OpenInternalJudicialResponse openInternalJudicial(OpenInternalJudicialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openInternalJudicialEx(request, headers, runtime);
    }

    /**
     * Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限
     */
    public OpenInternalJudicialResponse openInternalJudicialEx(OpenInternalJudicialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.judicial.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenInternalJudicialResponse());
    }

    /**
     * Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存
     */
    public SaveJusticePartyResponse saveJusticeParty(SaveJusticePartyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveJusticePartyEx(request, headers, runtime);
    }

    /**
     * Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存
     */
    public SaveJusticePartyResponse saveJusticePartyEx(SaveJusticePartyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.party.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveJusticePartyResponse());
    }

    /**
     * Description: 普通案件创建
     * Summary: 普通案件创建
     */
    public CreateJusticeNormalcaseResponse createJusticeNormalcase(CreateJusticeNormalcaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeNormalcaseEx(request, headers, runtime);
    }

    /**
     * Description: 普通案件创建
     * Summary: 普通案件创建
     */
    public CreateJusticeNormalcaseResponse createJusticeNormalcaseEx(CreateJusticeNormalcaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.normalcase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeNormalcaseResponse());
    }

    /**
     * Description: 链上案件创建
     * Summary: 链上案件创建
     */
    public CreateJusticeChaincaseResponse createJusticeChaincase(CreateJusticeChaincaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeChaincaseEx(request, headers, runtime);
    }

    /**
     * Description: 链上案件创建
     * Summary: 链上案件创建
     */
    public CreateJusticeChaincaseResponse createJusticeChaincaseEx(CreateJusticeChaincaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.chaincase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeChaincaseResponse());
    }

    /**
     * Description: 案件维权发起
     * Summary: 案件维权发起
     */
    public StartJusticeCaseResponse startJusticeCase(StartJusticeCaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startJusticeCaseEx(request, headers, runtime);
    }

    /**
     * Description: 案件维权发起
     * Summary: 案件维权发起
     */
    public StartJusticeCaseResponse startJusticeCaseEx(StartJusticeCaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.case.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartJusticeCaseResponse());
    }

    /**
     * Description: 案件查询
     * Summary: 案件查询
     */
    public QueryJusticeCaseResponse queryJusticeCase(QueryJusticeCaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeCaseEx(request, headers, runtime);
    }

    /**
     * Description: 案件查询
     * Summary: 案件查询
     */
    public QueryJusticeCaseResponse queryJusticeCaseEx(QueryJusticeCaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.case.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeCaseResponse());
    }

    /**
     * Description: 案件事件响应
     * Summary: 案件事件响应
     */
    public OperateJusticeEventResponse operateJusticeEvent(OperateJusticeEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateJusticeEventEx(request, headers, runtime);
    }

    /**
     * Description: 案件事件响应
     * Summary: 案件事件响应
     */
    public OperateJusticeEventResponse operateJusticeEventEx(OperateJusticeEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.event.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateJusticeEventResponse());
    }

    /**
     * Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板
     */
    public CreateJusticeCasetemplateResponse createJusticeCasetemplate(CreateJusticeCasetemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeCasetemplateEx(request, headers, runtime);
    }

    /**
     * Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板
     */
    public CreateJusticeCasetemplateResponse createJusticeCasetemplateEx(CreateJusticeCasetemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casetemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeCasetemplateResponse());
    }

    /**
     * Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板
     */
    public CreateJusticeRightprotecttemplateResponse createJusticeRightprotecttemplate(CreateJusticeRightprotecttemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeRightprotecttemplateEx(request, headers, runtime);
    }

    /**
     * Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板
     */
    public CreateJusticeRightprotecttemplateResponse createJusticeRightprotecttemplateEx(CreateJusticeRightprotecttemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.rightprotecttemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeRightprotecttemplateResponse());
    }

    /**
     * Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接
     */
    public GetJusticeFileuploadurlResponse getJusticeFileuploadurl(GetJusticeFileuploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJusticeFileuploadurlEx(request, headers, runtime);
    }

    /**
     * Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接
     */
    public GetJusticeFileuploadurlResponse getJusticeFileuploadurlEx(GetJusticeFileuploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetJusticeFileuploadurlResponse());
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息
     */
    public CreateLeaseProductinfoResponse createLeaseProductinfo(CreateLeaseProductinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseProductinfoEx(request, headers, runtime);
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息
     */
    public CreateLeaseProductinfoResponse createLeaseProductinfoEx(CreateLeaseProductinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseProductinfoResponse());
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约
     */
    public UpdateLeaseContractResponse updateLeaseContract(UpdateLeaseContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLeaseContractEx(request, headers, runtime);
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约
     */
    public UpdateLeaseContractResponse updateLeaseContractEx(UpdateLeaseContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLeaseContractResponse());
    }

    /**
     * Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻
     */
    public CreateLeaseAssetagentregisterResponse createLeaseAssetagentregister(CreateLeaseAssetagentregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAssetagentregisterEx(request, headers, runtime);
    }

    /**
     * Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻
     */
    public CreateLeaseAssetagentregisterResponse createLeaseAssetagentregisterEx(CreateLeaseAssetagentregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.assetagentregister.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAssetagentregisterResponse());
    }

    /**
     * Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口
     */
    public QueryLeaseProductinfoResponse queryLeaseProductinfo(QueryLeaseProductinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseProductinfoEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口
     */
    public QueryLeaseProductinfoResponse queryLeaseProductinfoEx(QueryLeaseProductinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.productinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseProductinfoResponse());
    }

    /**
     * Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态
     */
    public SyncLeaseSupplierorderstatusResponse syncLeaseSupplierorderstatus(SyncLeaseSupplierorderstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLeaseSupplierorderstatusEx(request, headers, runtime);
    }

    /**
     * Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态
     */
    public SyncLeaseSupplierorderstatusResponse syncLeaseSupplierorderstatusEx(SyncLeaseSupplierorderstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierorderstatus.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLeaseSupplierorderstatusResponse());
    }

    /**
     * Description: 采购供应商初始化 
     * Summary: 采购供应商初始化 
     */
    public InitLeaseSupplierResponse initLeaseSupplier(InitLeaseSupplierRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initLeaseSupplierEx(request, headers, runtime);
    }

    /**
     * Description: 采购供应商初始化 
     * Summary: 采购供应商初始化 
     */
    public InitLeaseSupplierResponse initLeaseSupplierEx(InitLeaseSupplierRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplier.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitLeaseSupplierResponse());
    }

    /**
     * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程
     */
    public FinishLeaseSupplierstatusResponse finishLeaseSupplierstatus(FinishLeaseSupplierstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishLeaseSupplierstatusEx(request, headers, runtime);
    }

    /**
     * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程
     */
    public FinishLeaseSupplierstatusResponse finishLeaseSupplierstatusEx(FinishLeaseSupplierstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierstatus.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishLeaseSupplierstatusResponse());
    }

    /**
     * Description: 采购商品初始化 
     * Summary: 采购商品初始化 
     */
    public CreateLeaseSupplierproductResponse createLeaseSupplierproduct(CreateLeaseSupplierproductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierproductEx(request, headers, runtime);
    }

    /**
     * Description: 采购商品初始化 
     * Summary: 采购商品初始化 
     */
    public CreateLeaseSupplierproductResponse createLeaseSupplierproductEx(CreateLeaseSupplierproductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierproduct.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierproductResponse());
    }

    /**
     * Description: 链上采购申请
     * Summary: 链上采购申请
     */
    public ApplyLeaseSupplierorderResponse applyLeaseSupplierorder(ApplyLeaseSupplierorderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyLeaseSupplierorderEx(request, headers, runtime);
    }

    /**
     * Description: 链上采购申请
     * Summary: 链上采购申请
     */
    public ApplyLeaseSupplierorderResponse applyLeaseSupplierorderEx(ApplyLeaseSupplierorderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierorder.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyLeaseSupplierorderResponse());
    }

    /**
     * Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息
     */
    public CreateLeaseFinancecertifyResponse createLeaseFinancecertify(CreateLeaseFinancecertifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseFinancecertifyEx(request, headers, runtime);
    }

    /**
     * Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息
     */
    public CreateLeaseFinancecertifyResponse createLeaseFinancecertifyEx(CreateLeaseFinancecertifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertify.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseFinancecertifyResponse());
    }

    /**
     * Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验
     */
    public QueryLeaseFinancecertifyResponse queryLeaseFinancecertify(QueryLeaseFinancecertifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecertifyEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验
     */
    public QueryLeaseFinancecertifyResponse queryLeaseFinancecertifyEx(QueryLeaseFinancecertifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecertifyResponse());
    }

    /**
     * Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果
     */
    public QueryLeaseFinancecertifyincontractResponse queryLeaseFinancecertifyincontract(QueryLeaseFinancecertifyincontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecertifyincontractEx(request, headers, runtime);
    }

    /**
     * Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果
     */
    public QueryLeaseFinancecertifyincontractResponse queryLeaseFinancecertifyincontractEx(QueryLeaseFinancecertifyincontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertifyincontract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecertifyincontractResponse());
    }

    /**
     * Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询
     */
    public QueryLeaseUserResponse queryLeaseUser(QueryLeaseUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseUserEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询
     */
    public QueryLeaseUserResponse queryLeaseUserEx(QueryLeaseUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseUserResponse());
    }

    /**
     * Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询
     */
    public QueryLeaseOrderdetailinfoResponse queryLeaseOrderdetailinfo(QueryLeaseOrderdetailinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderdetailinfoEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询
     */
    public QueryLeaseOrderdetailinfoResponse queryLeaseOrderdetailinfoEx(QueryLeaseOrderdetailinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderdetailinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderdetailinfoResponse());
    }

    /**
     * Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询
     */
    public QueryLeaseLeasepromiseResponse queryLeaseLeasepromise(QueryLeaseLeasepromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseLeasepromiseEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询
     */
    public QueryLeaseLeasepromiseResponse queryLeaseLeasepromiseEx(QueryLeaseLeasepromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.leasepromise.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseLeasepromiseResponse());
    }

    /**
     * Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询
     */
    public QueryLeaseCreditpromiseResponse queryLeaseCreditpromise(QueryLeaseCreditpromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseCreditpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询
     */
    public QueryLeaseCreditpromiseResponse queryLeaseCreditpromiseEx(QueryLeaseCreditpromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.creditpromise.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseCreditpromiseResponse());
    }

    /**
     * Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询
     */
    public QueryLeaseClearingResponse queryLeaseClearing(QueryLeaseClearingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseClearingEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询
     */
    public QueryLeaseClearingResponse queryLeaseClearingEx(QueryLeaseClearingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.clearing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseClearingResponse());
    }

    /**
     * Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息
     */
    public QueryLeaseRentalinfoResponse queryLeaseRentalinfo(QueryLeaseRentalinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRentalinfoEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息
     */
    public QueryLeaseRentalinfoResponse queryLeaseRentalinfoEx(QueryLeaseRentalinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rentalinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRentalinfoResponse());
    }

    /**
     * Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询
     */
    public QueryLeaseRepaymentResponse queryLeaseRepayment(QueryLeaseRepaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRepaymentEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询
     */
    public QueryLeaseRepaymentResponse queryLeaseRepaymentEx(QueryLeaseRepaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repayment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRepaymentResponse());
    }

    /**
     * Description: 查询订单商品信息
     * Summary: 查询订单商品信息
     */
    public QueryLeaseOrderproductResponse queryLeaseOrderproduct(QueryLeaseOrderproductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderproductEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单商品信息
     * Summary: 查询订单商品信息
     */
    public QueryLeaseOrderproductResponse queryLeaseOrderproductEx(QueryLeaseOrderproductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderproduct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderproductResponse());
    }

    /**
     * Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息
     */
    public QueryLeaseFinancecreditResponse queryLeaseFinancecredit(QueryLeaseFinancecreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecreditEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息
     */
    public QueryLeaseFinancecreditResponse queryLeaseFinancecreditEx(QueryLeaseFinancecreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecredit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecreditResponse());
    }

    /**
     * Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id
     */
    public QueryRefinanceOrderidResponse queryRefinanceOrderid(QueryRefinanceOrderidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceOrderidEx(request, headers, runtime);
    }

    /**
     * Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id
     */
    public QueryRefinanceOrderidResponse queryRefinanceOrderidEx(QueryRefinanceOrderidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.orderid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceOrderidResponse());
    }

    /**
     * Description: 资产明细查询
     * Summary: 资产明细
     */
    public QueryRefinanceOrderResponse queryRefinanceOrder(QueryRefinanceOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceOrderEx(request, headers, runtime);
    }

    /**
     * Description: 资产明细查询
     * Summary: 资产明细
     */
    public QueryRefinanceOrderResponse queryRefinanceOrderEx(QueryRefinanceOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceOrderResponse());
    }

    /**
     * Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询
     */
    public QueryRefinanceProductResponse queryRefinanceProduct(QueryRefinanceProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceProductEx(request, headers, runtime);
    }

    /**
     * Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询
     */
    public QueryRefinanceProductResponse queryRefinanceProductEx(QueryRefinanceProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceProductResponse());
    }

    /**
     * Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包
     */
    public VerifyRefinancePackageResponse verifyRefinancePackage(VerifyRefinancePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRefinancePackageEx(request, headers, runtime);
    }

    /**
     * Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包
     */
    public VerifyRefinancePackageResponse verifyRefinancePackageEx(VerifyRefinancePackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.package.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyRefinancePackageResponse());
    }

    /**
     * Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息
     */
    public QueryLeaseOrderclearingResponse queryLeaseOrderclearing(QueryLeaseOrderclearingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderclearingEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息
     */
    public QueryLeaseOrderclearingResponse queryLeaseOrderclearingEx(QueryLeaseOrderclearingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderclearing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderclearingResponse());
    }

    /**
     * Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询
     */
    public QueryLeaseRepaymentstatusResponse queryLeaseRepaymentstatus(QueryLeaseRepaymentstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRepaymentstatusEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询
     */
    public QueryLeaseRepaymentstatusResponse queryLeaseRepaymentstatusEx(QueryLeaseRepaymentstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repaymentstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRepaymentstatusResponse());
    }

    /**
     * Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况
     */
    public QueryLeaseUserperformanceResponse queryLeaseUserperformance(QueryLeaseUserperformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况
     */
    public QueryLeaseUserperformanceResponse queryLeaseUserperformanceEx(QueryLeaseUserperformanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.userperformance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseUserperformanceResponse());
    }

    /**
     * Description: 履约流水核验查询
     * Summary: 履约流水核验查询
     */
    public QueryLeaseRentalverifyResponse queryLeaseRentalverify(QueryLeaseRentalverifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRentalverifyEx(request, headers, runtime);
    }

    /**
     * Description: 履约流水核验查询
     * Summary: 履约流水核验查询
     */
    public QueryLeaseRentalverifyResponse queryLeaseRentalverifyEx(QueryLeaseRentalverifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rentalverify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRentalverifyResponse());
    }

    /**
     * Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息
     */
    public QueryLeaseInstallmentResponse queryLeaseInstallment(QueryLeaseInstallmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseInstallmentEx(request, headers, runtime);
    }

    /**
     * Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息
     */
    public QueryLeaseInstallmentResponse queryLeaseInstallmentEx(QueryLeaseInstallmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.installment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseInstallmentResponse());
    }

    /**
     * Description: 创建签署见证流程
     * Summary: 创建见证流程
     */
    public CreateWitnessFlowResponse createWitnessFlow(CreateWitnessFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWitnessFlowEx(request, headers, runtime);
    }

    /**
     * Description: 创建签署见证流程
     * Summary: 创建见证流程
     */
    public CreateWitnessFlowResponse createWitnessFlowEx(CreateWitnessFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWitnessFlowResponse());
    }

    /**
     * Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据
     */
    public SaveWitnessSnapshotResponse saveWitnessSnapshot(SaveWitnessSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveWitnessSnapshotEx(request, headers, runtime);
    }

    /**
     * Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据
     */
    public SaveWitnessSnapshotResponse saveWitnessSnapshotEx(SaveWitnessSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.snapshot.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveWitnessSnapshotResponse());
    }

    /**
     * Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验
     */
    public CheckWitnessSignaccessResponse checkWitnessSignaccess(CheckWitnessSignaccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkWitnessSignaccessEx(request, headers, runtime);
    }

    /**
     * Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验
     */
    public CheckWitnessSignaccessResponse checkWitnessSignaccessEx(CheckWitnessSignaccessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.signaccess.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckWitnessSignaccessResponse());
    }

    /**
     * Description: 见证流程签署
     * Summary: 见证流程签署
     */
    public AuthWitnessFlowResponse authWitnessFlow(AuthWitnessFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authWitnessFlowEx(request, headers, runtime);
    }

    /**
     * Description: 见证流程签署
     * Summary: 见证流程签署
     */
    public AuthWitnessFlowResponse authWitnessFlowEx(AuthWitnessFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthWitnessFlowResponse());
    }

    /**
     * Description: 见证流程签署确认
     * Summary: 见证流程签署确认
     */
    public ConfirmWitnessFlowResponse confirmWitnessFlow(ConfirmWitnessFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWitnessFlowEx(request, headers, runtime);
    }

    /**
     * Description: 见证流程签署确认
     * Summary: 见证流程签署确认
     */
    public ConfirmWitnessFlowResponse confirmWitnessFlowEx(ConfirmWitnessFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmWitnessFlowResponse());
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     */
    public CreateTransResponse createTrans(CreateTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTransEx(request, headers, runtime);
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     */
    public CreateTransResponse createTransEx(CreateTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTransResponse());
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetTransResponse getTrans(GetTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransEx(request, headers, runtime);
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetTransResponse getTransEx(GetTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransResponse());
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     */
    public CreateTextResponse createText(CreateTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextEx(request, headers, runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     */
    public CreateTextResponse createTextEx(CreateTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTextResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetTextResponse getText(GetTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetTextResponse getTextEx(GetTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTextResponse());
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileEx(request, headers, runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     */
    public CreateFileResponse createFileEx(CreateFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFileResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     */
    public GetFileResponse getFileEx(GetFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFileResponse());
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     */
    public CreateSourceResponse createSource(CreateSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSourceEx(request, headers, runtime);
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     */
    public CreateSourceResponse createSourceEx(CreateSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSourceResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     */
    public GetSourceResponse getSource(GetSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSourceEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     */
    public GetSourceResponse getSourceEx(GetSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSourceResponse());
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验
     */
    public CheckStatusResponse checkStatus(CheckStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkStatusEx(request, headers, runtime);
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验
     */
    public CheckStatusResponse checkStatusEx(CheckStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckStatusResponse());
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约
     */
    public DeployLeaseContractResponse deployLeaseContract(DeployLeaseContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployLeaseContractEx(request, headers, runtime);
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约
     */
    public DeployLeaseContractResponse deployLeaseContractEx(DeployLeaseContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployLeaseContractResponse());
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台
     */
    public AuthLeaseContractResponse authLeaseContract(AuthLeaseContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authLeaseContractEx(request, headers, runtime);
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台
     */
    public AuthLeaseContractResponse authLeaseContractEx(AuthLeaseContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthLeaseContractResponse());
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息
     */
    public CreateLeaseUserinfoResponse createLeaseUserinfo(CreateLeaseUserinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseUserinfoEx(request, headers, runtime);
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息
     */
    public CreateLeaseUserinfoResponse createLeaseUserinfoEx(CreateLeaseUserinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseUserinfoResponse());
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息
     */
    public CreateLeaseOrderinfoResponse createLeaseOrderinfo(CreateLeaseOrderinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseOrderinfoEx(request, headers, runtime);
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息
     */
    public CreateLeaseOrderinfoResponse createLeaseOrderinfoEx(CreateLeaseOrderinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseOrderinfoResponse());
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息
     */
    public CreateLeasePromiseResponse createLeasePromise(CreateLeasePromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeasePromiseEx(request, headers, runtime);
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息
     */
    public CreateLeasePromiseResponse createLeasePromiseEx(CreateLeasePromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeasePromiseResponse());
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息
     */
    public CreateLeaseVerifyinfoResponse createLeaseVerifyinfo(CreateLeaseVerifyinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseVerifyinfoEx(request, headers, runtime);
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息
     */
    public CreateLeaseVerifyinfoResponse createLeaseVerifyinfoEx(CreateLeaseVerifyinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseVerifyinfoResponse());
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息
     */
    public CreateLeaseCreditpromiseResponse createLeaseCreditpromise(CreateLeaseCreditpromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseCreditpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息
     */
    public CreateLeaseCreditpromiseResponse createLeaseCreditpromiseEx(CreateLeaseCreditpromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseCreditpromiseResponse());
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息
     */
    public CreateLeaseDisburseinfoResponse createLeaseDisburseinfo(CreateLeaseDisburseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseDisburseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息
     */
    public CreateLeaseDisburseinfoResponse createLeaseDisburseinfoEx(CreateLeaseDisburseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseDisburseinfoResponse());
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息
     */
    public QueryLeaseOrderinfoResponse queryLeaseOrderinfo(QueryLeaseOrderinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderinfoEx(request, headers, runtime);
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息
     */
    public QueryLeaseOrderinfoResponse queryLeaseOrderinfoEx(QueryLeaseOrderinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderinfoResponse());
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     */
    public CreateFinanceTextnotaryResponse createFinanceTextnotary(CreateFinanceTextnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinanceTextnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     */
    public CreateFinanceTextnotaryResponse createFinanceTextnotaryEx(CreateFinanceTextnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFinanceTextnotaryResponse());
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     */
    public GetFinanceTextnotaryResponse getFinanceTextnotary(GetFinanceTextnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFinanceTextnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     */
    public GetFinanceTextnotaryResponse getFinanceTextnotaryEx(GetFinanceTextnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFinanceTextnotaryResponse());
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     */
    public CreateFinanceFilenotaryResponse createFinanceFilenotary(CreateFinanceFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinanceFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     */
    public CreateFinanceFilenotaryResponse createFinanceFilenotaryEx(CreateFinanceFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFinanceFilenotaryResponse());
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     */
    public GetFinanceFilenotaryResponse getFinanceFilenotary(GetFinanceFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFinanceFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     */
    public GetFinanceFilenotaryResponse getFinanceFilenotaryEx(GetFinanceFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFinanceFilenotaryResponse());
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）
     */
    public CheckIndustryNotaryResponse checkIndustryNotary(CheckIndustryNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndustryNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）
     */
    public CheckIndustryNotaryResponse checkIndustryNotaryEx(CheckIndustryNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndustryNotaryResponse());
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     */
    public CreateSueBreakpromiseinfoResponse createSueBreakpromiseinfo(CreateSueBreakpromiseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     */
    public CreateSueBreakpromiseinfoResponse createSueBreakpromiseinfoEx(CreateSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSueBreakpromiseinfoResponse());
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     */
    public UpdateSueBreakpromiseinfoResponse updateSueBreakpromiseinfo(UpdateSueBreakpromiseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     */
    public UpdateSueBreakpromiseinfoResponse updateSueBreakpromiseinfoEx(UpdateSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueBreakpromiseinfoResponse());
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     */
    public DeleteSueBreakpromiseinfoResponse deleteSueBreakpromiseinfo(DeleteSueBreakpromiseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     */
    public DeleteSueBreakpromiseinfoResponse deleteSueBreakpromiseinfoEx(DeleteSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSueBreakpromiseinfoResponse());
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息
     */
    public QuerySueUserinfoResponse querySueUserinfo(QuerySueUserinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySueUserinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息
     */
    public QuerySueUserinfoResponse querySueUserinfoEx(QuerySueUserinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySueUserinfoResponse());
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约
     */
    public UpdateSueExeplarycontractResponse updateSueExeplarycontract(UpdateSueExeplarycontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueExeplarycontractEx(request, headers, runtime);
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约
     */
    public UpdateSueExeplarycontractResponse updateSueExeplarycontractEx(UpdateSueExeplarycontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueExeplarycontractResponse());
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约
     */
    public UpdateSueExemplaryrevertResponse updateSueExemplaryrevert(UpdateSueExemplaryrevertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueExemplaryrevertEx(request, headers, runtime);
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约
     */
    public UpdateSueExemplaryrevertResponse updateSueExemplaryrevertEx(UpdateSueExemplaryrevertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueExemplaryrevertResponse());
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息
     */
    public CreateLeaseAuditResponse createLeaseAudit(CreateLeaseAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAuditEx(request, headers, runtime);
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息
     */
    public CreateLeaseAuditResponse createLeaseAuditEx(CreateLeaseAuditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAuditResponse());
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息
     */
    public CreateLeasePaymentfileResponse createLeasePaymentfile(CreateLeasePaymentfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeasePaymentfileEx(request, headers, runtime);
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息
     */
    public CreateLeasePaymentfileResponse createLeasePaymentfileEx(CreateLeasePaymentfileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeasePaymentfileResponse());
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用
     */
    public CreateLeaseRentalResponse createLeaseRental(CreateLeaseRentalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRentalEx(request, headers, runtime);
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用
     */
    public CreateLeaseRentalResponse createLeaseRentalEx(CreateLeaseRentalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRentalResponse());
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     */
    public CreateLeaseClearingResponse createLeaseClearing(CreateLeaseClearingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseClearingEx(request, headers, runtime);
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     */
    public CreateLeaseClearingResponse createLeaseClearingEx(CreateLeaseClearingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseClearingResponse());
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     */
    public CreateLeaseRepaymentResponse createLeaseRepayment(CreateLeaseRepaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRepaymentEx(request, headers, runtime);
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     */
    public CreateLeaseRepaymentResponse createLeaseRepaymentEx(CreateLeaseRepaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRepaymentResponse());
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册
     */
    public CreateLeaseNotifyregisterResponse createLeaseNotifyregister(CreateLeaseNotifyregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseNotifyregisterEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册
     */
    public CreateLeaseNotifyregisterResponse createLeaseNotifyregisterEx(CreateLeaseNotifyregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseNotifyregisterResponse());
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情
     */
    public QueryLeaseIotinfoResponse queryLeaseIotinfo(QueryLeaseIotinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseIotinfoEx(request, headers, runtime);
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情
     */
    public QueryLeaseIotinfoResponse queryLeaseIotinfoEx(QueryLeaseIotinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseIotinfoResponse());
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口
     */
    public CreateCourtTextnotaryResponse createCourtTextnotary(CreateCourtTextnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCourtTextnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口
     */
    public CreateCourtTextnotaryResponse createCourtTextnotaryEx(CreateCourtTextnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCourtTextnotaryResponse());
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口
     */
    public GetCourtTextnotaryResponse getCourtTextnotary(GetCourtTextnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCourtTextnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口
     */
    public GetCourtTextnotaryResponse getCourtTextnotaryEx(GetCourtTextnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCourtTextnotaryResponse());
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口
     */
    public CreateCourtFilenotaryResponse createCourtFilenotary(CreateCourtFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCourtFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口
     */
    public CreateCourtFilenotaryResponse createCourtFilenotaryEx(CreateCourtFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCourtFilenotaryResponse());
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口
     */
    public GetCourtFilenotaryResponse getCourtFilenotary(GetCourtFilenotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCourtFilenotaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口
     */
    public GetCourtFilenotaryResponse getCourtFilenotaryEx(GetCourtFilenotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCourtFilenotaryResponse());
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口
     */
    public CreateLeaseRouteResponse createLeaseRoute(CreateLeaseRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRouteEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口
     */
    public CreateLeaseRouteResponse createLeaseRouteEx(CreateLeaseRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRouteResponse());
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息
     */
    public QueryLeaseEncryptedinfoResponse queryLeaseEncryptedinfo(QueryLeaseEncryptedinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseEncryptedinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息
     */
    public QueryLeaseEncryptedinfoResponse queryLeaseEncryptedinfoEx(QueryLeaseEncryptedinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseEncryptedinfoResponse());
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     */
    public CreateContractTextResponse createContractText(CreateContractTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTextEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     */
    public CreateContractTextResponse createContractTextEx(CreateContractTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTextResponse());
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告
     */
    public ApplyContractReportResponse applyContractReport(ApplyContractReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractReportEx(request, headers, runtime);
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告
     */
    public ApplyContractReportResponse applyContractReportEx(ApplyContractReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractReportResponse());
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     */
    public GetContractTextResponse getContractText(GetContractTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractTextEx(request, headers, runtime);
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     */
    public GetContractTextResponse getContractTextEx(GetContractTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractTextResponse());
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口
     */
    public CreateInternalTransResponse createInternalTrans(CreateInternalTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalTransEx(request, headers, runtime);
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口
     */
    public CreateInternalTransResponse createInternalTransEx(CreateInternalTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalTransResponse());
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链
     */
    public CreateInternalTextResponse createInternalText(CreateInternalTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalTextEx(request, headers, runtime);
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链
     */
    public CreateInternalTextResponse createInternalTextEx(CreateInternalTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalTextResponse());
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链
     */
    public CreateLeaseTextResponse createLeaseText(CreateLeaseTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseTextEx(request, headers, runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链
     */
    public CreateLeaseTextResponse createLeaseTextEx(CreateLeaseTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseTextResponse());
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链
     */
    public CreateLeaseFileResponse createLeaseFile(CreateLeaseFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseFileEx(request, headers, runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链
     */
    public CreateLeaseFileResponse createLeaseFileEx(CreateLeaseFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseFileResponse());
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表
     */
    public ListLeaseNotaryResponse listLeaseNotary(ListLeaseNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeaseNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表
     */
    public ListLeaseNotaryResponse listLeaseNotaryEx(ListLeaseNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLeaseNotaryResponse());
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application
     */
    public QueryLeaseApplicationResponse queryLeaseApplication(QueryLeaseApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application
     */
    public QueryLeaseApplicationResponse queryLeaseApplicationEx(QueryLeaseApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseApplicationResponse());
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情
     */
    public QueryLeaseApplicationdetailinfoResponse queryLeaseApplicationdetailinfo(QueryLeaseApplicationdetailinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseApplicationdetailinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情
     */
    public QueryLeaseApplicationdetailinfoResponse queryLeaseApplicationdetailinfoEx(QueryLeaseApplicationdetailinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseApplicationdetailinfoResponse());
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     */
    public SetLeaseRepaymentstatusResponse setLeaseRepaymentstatus(SetLeaseRepaymentstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setLeaseRepaymentstatusEx(request, headers, runtime);
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     */
    public SetLeaseRepaymentstatusResponse setLeaseRepaymentstatusEx(SetLeaseRepaymentstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetLeaseRepaymentstatusResponse());
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息
     */
    public CreateLeaseSupplierinfoResponse createLeaseSupplierinfo(CreateLeaseSupplierinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierinfoEx(request, headers, runtime);
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息
     */
    public CreateLeaseSupplierinfoResponse createLeaseSupplierinfoEx(CreateLeaseSupplierinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierinfoResponse());
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署
     */
    public DeployMytfTappResponse deployMytfTapp(DeployMytfTappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployMytfTappEx(request, headers, runtime);
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署
     */
    public DeployMytfTappResponse deployMytfTappEx(DeployMytfTappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployMytfTappResponse());
    }

    /**
     * Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息
     */
    public CreateLeaseSupplierdynamicinfoResponse createLeaseSupplierdynamicinfo(CreateLeaseSupplierdynamicinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierdynamicinfoEx(request, headers, runtime);
    }

    /**
     * Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息
     */
    public CreateLeaseSupplierdynamicinfoResponse createLeaseSupplierdynamicinfoEx(CreateLeaseSupplierdynamicinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierdynamicinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierdynamicinfoResponse());
    }

    /**
     * Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件
     */
    public CreateLeaseBizResponse createLeaseBiz(CreateLeaseBizRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseBizEx(request, headers, runtime);
    }

    /**
     * Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件
     */
    public CreateLeaseBizResponse createLeaseBizEx(CreateLeaseBizRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseBizResponse());
    }

    /**
     * Description: 查询核验结果
     * Summary: 查询核验结果
     */
    public QueryLeaseProofResponse queryLeaseProof(QueryLeaseProofRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseProofEx(request, headers, runtime);
    }

    /**
     * Description: 查询核验结果
     * Summary: 查询核验结果
     */
    public QueryLeaseProofResponse queryLeaseProofEx(QueryLeaseProofRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.proof.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseProofResponse());
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口
     */
    public CreateLargefileResponse createLargefile(CreateLargefileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLargefileEx(request, headers, runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口
     */
    public CreateLargefileResponse createLargefileEx(CreateLargefileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.largefile.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLargefileResponse());
    }

    /**
     * Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口
     */
    public QueryLeaseBizResponse queryLeaseBiz(QueryLeaseBizRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseBizEx(request, headers, runtime);
    }

    /**
     * Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口
     */
    public QueryLeaseBizResponse queryLeaseBizEx(QueryLeaseBizRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseBizResponse());
    }

    /**
     * Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证
     */
    public CreateLeaseBiznotaryResponse createLeaseBiznotary(CreateLeaseBiznotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseBiznotaryEx(request, headers, runtime);
    }

    /**
     * Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证
     */
    public CreateLeaseBiznotaryResponse createLeaseBiznotaryEx(CreateLeaseBiznotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biznotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseBiznotaryResponse());
    }

    /**
     * Description: 合同内部文本存证
     * Summary: 合同内部文本存证
     */
    public CreateInternalContractResponse createInternalContract(CreateInternalContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalContractEx(request, headers, runtime);
    }

    /**
     * Description: 合同内部文本存证
     * Summary: 合同内部文本存证
     */
    public CreateInternalContractResponse createInternalContractEx(CreateInternalContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.contract.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalContractResponse());
    }

    /**
     * Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果
     */
    public CreateLeaseZftagreementsignResponse createLeaseZftagreementsign(CreateLeaseZftagreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseZftagreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果
     */
    public CreateLeaseZftagreementsignResponse createLeaseZftagreementsignEx(CreateLeaseZftagreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.zftagreementsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseZftagreementsignResponse());
    }

    /**
     * Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息
     */
    public CreateLeaseZftagreementunsignResponse createLeaseZftagreementunsign(CreateLeaseZftagreementunsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseZftagreementunsignEx(request, headers, runtime);
    }

    /**
     * Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息
     */
    public CreateLeaseZftagreementunsignResponse createLeaseZftagreementunsignEx(CreateLeaseZftagreementunsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.zftagreementunsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseZftagreementunsignResponse());
    }

    /**
     * Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明
     */
    public GetCertificateDetailResponse getCertificateDetail(GetCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCertificateDetailEx(request, headers, runtime);
    }

    /**
     * Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明
     */
    public GetCertificateDetailResponse getCertificateDetailEx(GetCertificateDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certificate.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCertificateDetailResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetInternalTextResponse getInternalText(GetInternalTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInternalTextEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetInternalTextResponse getInternalTextEx(GetInternalTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInternalTextResponse());
    }

    /**
     * Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。
     */
    public OpenInternalTwcResponse openInternalTwc(OpenInternalTwcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openInternalTwcEx(request, headers, runtime);
    }

    /**
     * Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。
     */
    public OpenInternalTwcResponse openInternalTwcEx(OpenInternalTwcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.twc.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenInternalTwcResponse());
    }

    /**
     * Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id
     */
    public CreateSpecifyTransResponse createSpecifyTrans(CreateSpecifyTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpecifyTransEx(request, headers, runtime);
    }

    /**
     * Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id
     */
    public CreateSpecifyTransResponse createSpecifyTransEx(CreateSpecifyTransRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.specify.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpecifyTransResponse());
    }

    /**
     * Description: 指定节点文本存证
     * Summary: 指定节点文本存证
     */
    public CreateSpecifyTextResponse createSpecifyText(CreateSpecifyTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpecifyTextEx(request, headers, runtime);
    }

    /**
     * Description: 指定节点文本存证
     * Summary: 指定节点文本存证
     */
    public CreateSpecifyTextResponse createSpecifyTextEx(CreateSpecifyTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.specify.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpecifyTextResponse());
    }

    /**
     * Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口
     */
    public CreateInternalFileResponse createInternalFile(CreateInternalFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口
     */
    public CreateInternalFileResponse createInternalFileEx(CreateInternalFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalFileResponse());
    }

    /**
     * Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口
     */
    public GetInternalFileResponse getInternalFile(GetInternalFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInternalFileEx(request, headers, runtime);
    }

    /**
     * Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口
     */
    public GetInternalFileResponse getInternalFileEx(GetInternalFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInternalFileResponse());
    }

    /**
     * Description: 创建存证流程实例
     * Summary: 创建存证流程实例
     */
    public CreateFlowInstanceResponse createFlowInstance(CreateFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 创建存证流程实例
     * Summary: 创建存证流程实例
     */
    public CreateFlowInstanceResponse createFlowInstanceEx(CreateFlowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowInstanceResponse());
    }

    /**
     * Description: 存证流程实例完结
     * Summary: 存证流程实例完结
     */
    public FinishFlowInstanceResponse finishFlowInstance(FinishFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishFlowInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 存证流程实例完结
     * Summary: 存证流程实例完结
     */
    public FinishFlowInstanceResponse finishFlowInstanceEx(FinishFlowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishFlowInstanceResponse());
    }

    /**
     * Description: 创建阶段存证
     * Summary: 创建阶段存证
     */
    public InitFlowPhaseResponse initFlowPhase(InitFlowPhaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFlowPhaseEx(request, headers, runtime);
    }

    /**
     * Description: 创建阶段存证
     * Summary: 创建阶段存证
     */
    public InitFlowPhaseResponse initFlowPhaseEx(InitFlowPhaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFlowPhaseResponse());
    }

    /**
     * Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果
     */
    public QueryFlowPhaseResponse queryFlowPhase(QueryFlowPhaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowPhaseEx(request, headers, runtime);
    }

    /**
     * Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果
     */
    public QueryFlowPhaseResponse queryFlowPhaseEx(QueryFlowPhaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowPhaseResponse());
    }

    /**
     * Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情
     */
    public DetailFlowPhaseResponse detailFlowPhase(DetailFlowPhaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFlowPhaseEx(request, headers, runtime);
    }

    /**
     * Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情
     */
    public DetailFlowPhaseResponse detailFlowPhaseEx(DetailFlowPhaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFlowPhaseResponse());
    }

    /**
     * Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证
     */
    public CreateFlowOnestepnotaryResponse createFlowOnestepnotary(CreateFlowOnestepnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowOnestepnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证
     */
    public CreateFlowOnestepnotaryResponse createFlowOnestepnotaryEx(CreateFlowOnestepnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.onestepnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowOnestepnotaryResponse());
    }

    /**
     * Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态
     */
    public QueryFlowOnestepnotaryResponse queryFlowOnestepnotary(QueryFlowOnestepnotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowOnestepnotaryEx(request, headers, runtime);
    }

    /**
     * Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态
     */
    public QueryFlowOnestepnotaryResponse queryFlowOnestepnotaryEx(QueryFlowOnestepnotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.onestepnotary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowOnestepnotaryResponse());
    }

    /**
     * Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请
     */
    public ApplyFlowCertificateResponse applyFlowCertificate(ApplyFlowCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请
     */
    public ApplyFlowCertificateResponse applyFlowCertificateEx(ApplyFlowCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.certificate.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowCertificateResponse());
    }

    /**
     * Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询
     */
    public QueryFlowCertificateResponse queryFlowCertificate(QueryFlowCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询
     */
    public QueryFlowCertificateResponse queryFlowCertificateEx(QueryFlowCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowCertificateResponse());
    }

    /**
     * Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请
     */
    public ApplyStubCertificateResponse applyStubCertificate(ApplyStubCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyStubCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请
     */
    public ApplyStubCertificateResponse applyStubCertificateEx(ApplyStubCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.certificate.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyStubCertificateResponse());
    }

    /**
     * Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询
     */
    public QueryStubCertificateResponse queryStubCertificate(QueryStubCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStubCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询
     */
    public QueryStubCertificateResponse queryStubCertificateEx(QueryStubCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStubCertificateResponse());
    }

    /**
     * Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询
     */
    public QueryStubResponse queryStub(QueryStubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStubEx(request, headers, runtime);
    }

    /**
     * Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询
     */
    public QueryStubResponse queryStubEx(QueryStubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStubResponse());
    }

    /**
     * Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建
     */
    public CreateStubResponse createStub(CreateStubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStubEx(request, headers, runtime);
    }

    /**
     * Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建
     */
    public CreateStubResponse createStubEx(CreateStubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStubResponse());
    }

    /**
     * Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在
     */
    public ExistStubResponse existStub(ExistStubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existStubEx(request, headers, runtime);
    }

    /**
     * Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在
     */
    public ExistStubResponse existStubEx(ExistStubRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistStubResponse());
    }

    /**
     * Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口
     */
    public CreateStubClearingResponse createStubClearing(CreateStubClearingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStubClearingEx(request, headers, runtime);
    }

    /**
     * Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口
     */
    public CreateStubClearingResponse createStubClearingEx(CreateStubClearingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.clearing.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStubClearingResponse());
    }

    /**
     * Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包
     */
    public ApplyFlowEvidenceResponse applyFlowEvidence(ApplyFlowEvidenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowEvidenceEx(request, headers, runtime);
    }

    /**
     * Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包
     */
    public ApplyFlowEvidenceResponse applyFlowEvidenceEx(ApplyFlowEvidenceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.evidence.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowEvidenceResponse());
    }

    /**
     * Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询
     */
    public QueryFlowEvidenceResponse queryFlowEvidence(QueryFlowEvidenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowEvidenceEx(request, headers, runtime);
    }

    /**
     * Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询
     */
    public QueryFlowEvidenceResponse queryFlowEvidenceEx(QueryFlowEvidenceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.evidence.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowEvidenceResponse());
    }

    /**
     * Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请
     */
    public ApplyFlowAuthResponse applyFlowAuth(ApplyFlowAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowAuthEx(request, headers, runtime);
    }

    /**
     * Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请
     */
    public ApplyFlowAuthResponse applyFlowAuthEx(ApplyFlowAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.auth.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowAuthResponse());
    }

    /**
     * Description: 全流程详情查询
     * Summary: 全流程详情查询
     */
    public DetailFlowInstanceResponse detailFlowInstance(DetailFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFlowInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 全流程详情查询
     * Summary: 全流程详情查询
     */
    public DetailFlowInstanceResponse detailFlowInstanceEx(DetailFlowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFlowInstanceResponse());
    }

    /**
     * Description: 合约校验接口
     * Summary: 合约校验接口
     */
    public CheckContractResponse checkContract(CheckContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContractEx(request, headers, runtime);
    }

    /**
     * Description: 合约校验接口
     * Summary: 合约校验接口
     */
    public CheckContractResponse checkContractEx(CheckContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContractResponse());
    }

    /**
     * Description: 查询合约核验结果
     * Summary: 查询合约核验结果
     */
    public QueryContractStatusResponse queryContractStatus(QueryContractStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约核验结果
     * Summary: 查询合约核验结果
     */
    public QueryContractStatusResponse queryContractStatusEx(QueryContractStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractStatusResponse());
    }
}
