// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInternalTransResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回事务ID，全局唯一
    @NameInMap("transaction_id")
    public String transactionId;

    // 可信时间信息
    @NameInMap("tsr")
    public TsrResponse tsr;

    public static CreateInternalTransResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInternalTransResponse self = new CreateInternalTransResponse();
        return TeaModel.build(map, self);
    }

    public CreateInternalTransResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInternalTransResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInternalTransResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInternalTransResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateInternalTransResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

}
