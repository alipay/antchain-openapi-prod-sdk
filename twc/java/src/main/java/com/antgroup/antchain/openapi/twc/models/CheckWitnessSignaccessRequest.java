// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckWitnessSignaccessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批流程id
    @NameInMap("approval_flow_id")
    public String approvalFlowId;

    // 审批结果通知
    @NameInMap("approval_notify_url")
    public String approvalNotifyUrl;

    // 签署文档信息
    @NameInMap("docs")
    @Validation(required = true)
    public java.util.List<WitnessDocs> docs;

    // 签署端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // 是否发起审批，默认TRUE
    @NameInMap("launch_approval")
    public Boolean launchApproval;

    // 手机盾任务id，用于手机盾审批场景
    @NameInMap("mobile_shield_task_id")
    public String mobileShieldTaskId;

    // 实名认证凭证
    @NameInMap("realname_auth_code")
    public String realnameAuthCode;

    // 印章id列表
    @NameInMap("seal_ids")
    public java.util.List<String> sealIds;

    // 签署人账号id
    @NameInMap("signer_account_id")
    @Validation(required = true)
    public String signerAccountId;

    // 签署人ip
    @NameInMap("signer_ip")
    @Validation(required = true)
    public String signerIp;

    // 签署人类型，1-私有云用户，2-公有云用户，3-手机盾用户
    @NameInMap("signer_type")
    @Validation(required = true)
    public Long signerType;

    // 签署预览地址
    @NameInMap("sign_preview_url")
    public String signPreviewUrl;

    // 意愿认证凭证
    @NameInMap("will_auth_code")
    public String willAuthCode;

    // 见证流程id
    @NameInMap("witness_flow_id")
    @Validation(required = true)
    public String witnessFlowId;

    // 发起请求的实例应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发起请求的鉴权token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static CheckWitnessSignaccessRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckWitnessSignaccessRequest self = new CheckWitnessSignaccessRequest();
        return TeaModel.build(map, self);
    }

    public CheckWitnessSignaccessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckWitnessSignaccessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckWitnessSignaccessRequest setApprovalFlowId(String approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
        return this;
    }
    public String getApprovalFlowId() {
        return this.approvalFlowId;
    }

    public CheckWitnessSignaccessRequest setApprovalNotifyUrl(String approvalNotifyUrl) {
        this.approvalNotifyUrl = approvalNotifyUrl;
        return this;
    }
    public String getApprovalNotifyUrl() {
        return this.approvalNotifyUrl;
    }

    public CheckWitnessSignaccessRequest setDocs(java.util.List<WitnessDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<WitnessDocs> getDocs() {
        return this.docs;
    }

    public CheckWitnessSignaccessRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CheckWitnessSignaccessRequest setLaunchApproval(Boolean launchApproval) {
        this.launchApproval = launchApproval;
        return this;
    }
    public Boolean getLaunchApproval() {
        return this.launchApproval;
    }

    public CheckWitnessSignaccessRequest setMobileShieldTaskId(String mobileShieldTaskId) {
        this.mobileShieldTaskId = mobileShieldTaskId;
        return this;
    }
    public String getMobileShieldTaskId() {
        return this.mobileShieldTaskId;
    }

    public CheckWitnessSignaccessRequest setRealnameAuthCode(String realnameAuthCode) {
        this.realnameAuthCode = realnameAuthCode;
        return this;
    }
    public String getRealnameAuthCode() {
        return this.realnameAuthCode;
    }

    public CheckWitnessSignaccessRequest setSealIds(java.util.List<String> sealIds) {
        this.sealIds = sealIds;
        return this;
    }
    public java.util.List<String> getSealIds() {
        return this.sealIds;
    }

    public CheckWitnessSignaccessRequest setSignerAccountId(String signerAccountId) {
        this.signerAccountId = signerAccountId;
        return this;
    }
    public String getSignerAccountId() {
        return this.signerAccountId;
    }

    public CheckWitnessSignaccessRequest setSignerIp(String signerIp) {
        this.signerIp = signerIp;
        return this;
    }
    public String getSignerIp() {
        return this.signerIp;
    }

    public CheckWitnessSignaccessRequest setSignerType(Long signerType) {
        this.signerType = signerType;
        return this;
    }
    public Long getSignerType() {
        return this.signerType;
    }

    public CheckWitnessSignaccessRequest setSignPreviewUrl(String signPreviewUrl) {
        this.signPreviewUrl = signPreviewUrl;
        return this;
    }
    public String getSignPreviewUrl() {
        return this.signPreviewUrl;
    }

    public CheckWitnessSignaccessRequest setWillAuthCode(String willAuthCode) {
        this.willAuthCode = willAuthCode;
        return this;
    }
    public String getWillAuthCode() {
        return this.willAuthCode;
    }

    public CheckWitnessSignaccessRequest setWitnessFlowId(String witnessFlowId) {
        this.witnessFlowId = witnessFlowId;
        return this;
    }
    public String getWitnessFlowId() {
        return this.witnessFlowId;
    }

    public CheckWitnessSignaccessRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CheckWitnessSignaccessRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
