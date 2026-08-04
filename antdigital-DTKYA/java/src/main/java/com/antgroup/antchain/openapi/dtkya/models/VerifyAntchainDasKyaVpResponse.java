// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaVpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总核验状态码
    @NameInMap("status")
    public String status;

    // VP签名主体did
    @NameInMap("subject_did")
    public String subjectDid;

    // 核验完成时间 ISO8601
    @NameInMap("verified_at")
    public String verifiedAt;

    // vc核验结果
    @NameInMap("vc_results")
    public java.util.List<VcVerifyResult> vcResults;

    public static VerifyAntchainDasKyaVpResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaVpResponse self = new VerifyAntchainDasKyaVpResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaVpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainDasKyaVpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainDasKyaVpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainDasKyaVpResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerifyAntchainDasKyaVpResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public VerifyAntchainDasKyaVpResponse setVerifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }
    public String getVerifiedAt() {
        return this.verifiedAt;
    }

    public VerifyAntchainDasKyaVpResponse setVcResults(java.util.List<VcVerifyResult> vcResults) {
        this.vcResults = vcResults;
        return this;
    }
    public java.util.List<VcVerifyResult> getVcResults() {
        return this.vcResults;
    }

}
