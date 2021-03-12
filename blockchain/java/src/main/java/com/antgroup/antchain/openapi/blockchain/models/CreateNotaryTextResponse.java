// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateNotaryTextResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可信时间信息
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 存证凭据
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateNotaryTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNotaryTextResponse self = new CreateNotaryTextResponse();
        return TeaModel.build(map, self);
    }

    public CreateNotaryTextResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateNotaryTextResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateNotaryTextResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateNotaryTextResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public CreateNotaryTextResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
