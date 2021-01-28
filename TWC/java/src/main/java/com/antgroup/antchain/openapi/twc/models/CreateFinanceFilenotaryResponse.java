// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFinanceFilenotaryResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 反欺诈查询返回的信用值
    @NameInMap("credit_risk_score")
    public String creditRiskScore;

    // 可信时间戳
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateFinanceFilenotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFinanceFilenotaryResponse self = new CreateFinanceFilenotaryResponse();
        return TeaModel.build(map, self);
    }

    public CreateFinanceFilenotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFinanceFilenotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFinanceFilenotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFinanceFilenotaryResponse setCreditRiskScore(String creditRiskScore) {
        this.creditRiskScore = creditRiskScore;
        return this;
    }
    public String getCreditRiskScore() {
        return this.creditRiskScore;
    }

    public CreateFinanceFilenotaryResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public CreateFinanceFilenotaryResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
