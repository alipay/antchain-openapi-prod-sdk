// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateComboOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐下单订单号
    @NameInMap("combo_order_id")
    public String comboOrderId;

    public static CreateComboOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComboOrderResponse self = new CreateComboOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateComboOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateComboOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateComboOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateComboOrderResponse setComboOrderId(String comboOrderId) {
        this.comboOrderId = comboOrderId;
        return this;
    }
    public String getComboOrderId() {
        return this.comboOrderId;
    }

}
