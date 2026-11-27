// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FacequeryAntchainDasKyaRealpersonv2Response extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 刷脸认证单编号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 认证状态，PENDING、PASSED、FAILED 或 EXPIRED
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 通过或失败终态的认证结论
    @NameInMap("passed")
    public Boolean passed;

    // 可选的失败原因
    @NameInMap("reason")
    public String reason;

    public static FacequeryAntchainDasKyaRealpersonv2Response build(java.util.Map<String, ?> map) throws Exception {
        FacequeryAntchainDasKyaRealpersonv2Response self = new FacequeryAntchainDasKyaRealpersonv2Response();
        return TeaModel.build(map, self);
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public FacequeryAntchainDasKyaRealpersonv2Response setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
