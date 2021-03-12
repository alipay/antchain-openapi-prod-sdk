// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositEncryptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可以用该id到服务上查询链的信息
    @NameInMap("deposit_id")
    public String depositId;

    // 是否存证成功
    @NameInMap("status")
    public String status;

    // 交易的txHash
    @NameInMap("tx_hash")
    public String txHash;

    public static SaveBusinessDepositEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositEncryptResponse self = new SaveBusinessDepositEncryptResponse();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositEncryptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveBusinessDepositEncryptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveBusinessDepositEncryptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveBusinessDepositEncryptResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public SaveBusinessDepositEncryptResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SaveBusinessDepositEncryptResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
