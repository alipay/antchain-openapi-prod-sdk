// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SavePlatformDepositDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // bizid+accountid+keyId/txHash 组成的唯一id，用户可以根据该id到服务中查询链上内容
    @NameInMap("deposit_id")
    public String depositId;

    // 是否存证成果
    @NameInMap("status")
    public String status;

    // 链上返回的txHash值
    @NameInMap("tx_hash")
    public String txHash;

    public static SavePlatformDepositDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        SavePlatformDepositDepositResponse self = new SavePlatformDepositDepositResponse();
        return TeaModel.build(map, self);
    }

    public SavePlatformDepositDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SavePlatformDepositDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SavePlatformDepositDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SavePlatformDepositDepositResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public SavePlatformDepositDepositResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SavePlatformDepositDepositResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
