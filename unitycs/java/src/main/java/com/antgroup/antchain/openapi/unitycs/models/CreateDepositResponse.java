// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class CreateDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链结果
    @NameInMap("result")
    public Boolean result;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 数据标识
    @NameInMap("identify")
    public String identify;

    public static CreateDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDepositResponse self = new CreateDepositResponse();
        return TeaModel.build(map, self);
    }

    public CreateDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDepositResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CreateDepositResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CreateDepositResponse setIdentify(String identify) {
        this.identify = identify;
        return this;
    }
    public String getIdentify() {
        return this.identify;
    }

}
