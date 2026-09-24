// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaEvidenceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验是否通过；查询异常或交易未确认返回接口错误，不返回false
    @NameInMap("verified")
    public Boolean verified;

    public static VerifyAntchainDasKyaEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaEvidenceResponse self = new VerifyAntchainDasKyaEvidenceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaEvidenceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainDasKyaEvidenceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainDasKyaEvidenceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainDasKyaEvidenceResponse setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }
    public Boolean getVerified() {
        return this.verified;
    }

}
