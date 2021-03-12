// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractnormalcallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 调用合约接口返回值
    @NameInMap("data")
    public String data;

    // 是否调用成功
    @NameInMap("status")
    public Long status;

    // 调用合约的交易地址
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateBusinessContractnormalcallResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractnormalcallResponse self = new CreateBusinessContractnormalcallResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractnormalcallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessContractnormalcallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessContractnormalcallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessContractnormalcallResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateBusinessContractnormalcallResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CreateBusinessContractnormalcallResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
