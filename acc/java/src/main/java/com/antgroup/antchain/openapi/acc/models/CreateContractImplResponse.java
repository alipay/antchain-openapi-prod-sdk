// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateContractImplResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 信息上链的哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateContractImplResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractImplResponse self = new CreateContractImplResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractImplResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractImplResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractImplResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractImplResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
