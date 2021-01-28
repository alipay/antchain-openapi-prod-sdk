// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendWithholdDeductResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 该笔转账在支付宝系统内部的单据ID
    @NameInMap("entrust_order_id")
    public String entrustOrderId;

    // INIT：受理成功，扣款中
    // FINISHED：扣款成功
    // CLOSED：商户已关单
    @NameInMap("status")
    public String status;

    public static SendWithholdDeductResponse build(java.util.Map<String, ?> map) throws Exception {
        SendWithholdDeductResponse self = new SendWithholdDeductResponse();
        return TeaModel.build(map, self);
    }

    public SendWithholdDeductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendWithholdDeductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendWithholdDeductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendWithholdDeductResponse setEntrustOrderId(String entrustOrderId) {
        this.entrustOrderId = entrustOrderId;
        return this;
    }
    public String getEntrustOrderId() {
        return this.entrustOrderId;
    }

    public SendWithholdDeductResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
