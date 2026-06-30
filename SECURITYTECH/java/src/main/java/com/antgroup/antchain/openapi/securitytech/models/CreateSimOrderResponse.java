// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreateSimOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("order_id")
    public String orderId;

    // 支付宝小程序链接
    @NameInMap("miniapp_link")
    public String miniappLink;

    public static CreateSimOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimOrderResponse self = new CreateSimOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSimOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSimOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSimOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSimOrderResponse setMiniappLink(String miniappLink) {
        this.miniappLink = miniappLink;
        return this;
    }
    public String getMiniappLink() {
        return this.miniappLink;
    }

}
