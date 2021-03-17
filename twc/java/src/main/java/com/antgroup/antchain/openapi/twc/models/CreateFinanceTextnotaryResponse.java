// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFinanceTextnotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 反欺诈对应的信用值
    @NameInMap("credit_risk_score")
    public String creditRiskScore;

    // 可信时间戳
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateFinanceTextnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFinanceTextnotaryResponse self = new CreateFinanceTextnotaryResponse();
        return TeaModel.build(map, self);
    }

    public CreateFinanceTextnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFinanceTextnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFinanceTextnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFinanceTextnotaryResponse setCreditRiskScore(String creditRiskScore) {
        this.creditRiskScore = creditRiskScore;
        return this;
    }
    public String getCreditRiskScore() {
        return this.creditRiskScore;
    }

    public CreateFinanceTextnotaryResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public CreateFinanceTextnotaryResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
