// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SubmitAntchainDasKyaEvidenceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 链上存证状态
    @NameInMap("status")
    public String status;

    public static SubmitAntchainDasKyaEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainDasKyaEvidenceResponse self = new SubmitAntchainDasKyaEvidenceResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainDasKyaEvidenceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAntchainDasKyaEvidenceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAntchainDasKyaEvidenceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAntchainDasKyaEvidenceResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public SubmitAntchainDasKyaEvidenceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
