// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaIdentityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // verification_id
    @NameInMap("verification_id")
    public String verificationId;

    // collaboration_id
    @NameInMap("collaboration_id")
    public String collaborationId;

    // verifier_did
    @NameInMap("verifier_did")
    public String verifierDid;

    // subject_did
    @NameInMap("subject_did")
    public String subjectDid;

    // requirement_version
    @NameInMap("requirement_version")
    public String requirementVersion;

    // result
    @NameInMap("result")
    public String result;

    // reason_code
    @NameInMap("reason_code")
    public String reasonCode;

    // reason
    @NameInMap("reason")
    public String reason;

    // checked_at
    @NameInMap("checked_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String checkedAt;

    // valid_until
    @NameInMap("valid_until")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validUntil;

    // 实际核验层级
    @NameInMap("required_layers")
    public java.util.List<String> requiredLayers;

    // 逐层核验结果
    @NameInMap("layer_results")
    public java.util.List<VerificationLayerResult> layerResults;

    public static VerifyAntchainDasKyaIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaIdentityResponse self = new VerifyAntchainDasKyaIdentityResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaIdentityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainDasKyaIdentityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainDasKyaIdentityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainDasKyaIdentityResponse setVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }
    public String getVerificationId() {
        return this.verificationId;
    }

    public VerifyAntchainDasKyaIdentityResponse setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
        return this;
    }
    public String getCollaborationId() {
        return this.collaborationId;
    }

    public VerifyAntchainDasKyaIdentityResponse setVerifierDid(String verifierDid) {
        this.verifierDid = verifierDid;
        return this;
    }
    public String getVerifierDid() {
        return this.verifierDid;
    }

    public VerifyAntchainDasKyaIdentityResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public VerifyAntchainDasKyaIdentityResponse setRequirementVersion(String requirementVersion) {
        this.requirementVersion = requirementVersion;
        return this;
    }
    public String getRequirementVersion() {
        return this.requirementVersion;
    }

    public VerifyAntchainDasKyaIdentityResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public VerifyAntchainDasKyaIdentityResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public VerifyAntchainDasKyaIdentityResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public VerifyAntchainDasKyaIdentityResponse setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }
    public String getCheckedAt() {
        return this.checkedAt;
    }

    public VerifyAntchainDasKyaIdentityResponse setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public VerifyAntchainDasKyaIdentityResponse setRequiredLayers(java.util.List<String> requiredLayers) {
        this.requiredLayers = requiredLayers;
        return this;
    }
    public java.util.List<String> getRequiredLayers() {
        return this.requiredLayers;
    }

    public VerifyAntchainDasKyaIdentityResponse setLayerResults(java.util.List<VerificationLayerResult> layerResults) {
        this.layerResults = layerResults;
        return this;
    }
    public java.util.List<VerificationLayerResult> getLayerResults() {
        return this.layerResults;
    }

}
