// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositEncryptmetadataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证id，由bizId+accountId+keyId组成
    @NameInMap("deposit_id")
    public String depositId;

    // 是否存证成功
    @NameInMap("status")
    public String status;

    // 链上交易的id
    @NameInMap("tx_hash")
    public String txHash;

    public static SaveBusinessDepositEncryptmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositEncryptmetadataResponse self = new SaveBusinessDepositEncryptmetadataResponse();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositEncryptmetadataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveBusinessDepositEncryptmetadataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveBusinessDepositEncryptmetadataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveBusinessDepositEncryptmetadataResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public SaveBusinessDepositEncryptmetadataResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SaveBusinessDepositEncryptmetadataResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
