// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthBusinessDepositdataCorpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 被授权的逻辑主字段(biz_id与key_id的拼接）
    @NameInMap("deposit_id")
    public String depositId;

    // 是否授权成功
    @NameInMap("status")
    public String status;

    // deposit_id对应的当前最新的交易
    @NameInMap("tx_hash")
    public String txHash;

    public static AuthBusinessDepositdataCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthBusinessDepositdataCorpResponse self = new AuthBusinessDepositdataCorpResponse();
        return TeaModel.build(map, self);
    }

    public AuthBusinessDepositdataCorpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthBusinessDepositdataCorpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthBusinessDepositdataCorpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthBusinessDepositdataCorpResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public AuthBusinessDepositdataCorpResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AuthBusinessDepositdataCorpResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
