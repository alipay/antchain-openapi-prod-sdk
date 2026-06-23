// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreatewithoptionsAntcloudTradeComboResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐订单ID
    @NameInMap("combo_order_id")
    public String comboOrderId;

    // 订单状态，创建成功为 WAIT_CONFIRM（待确认）
    @NameInMap("status")
    public String status;

    public static CreatewithoptionsAntcloudTradeComboResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatewithoptionsAntcloudTradeComboResponse self = new CreatewithoptionsAntcloudTradeComboResponse();
        return TeaModel.build(map, self);
    }

    public CreatewithoptionsAntcloudTradeComboResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatewithoptionsAntcloudTradeComboResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatewithoptionsAntcloudTradeComboResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatewithoptionsAntcloudTradeComboResponse setComboOrderId(String comboOrderId) {
        this.comboOrderId = comboOrderId;
        return this;
    }
    public String getComboOrderId() {
        return this.comboOrderId;
    }

    public CreatewithoptionsAntcloudTradeComboResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
