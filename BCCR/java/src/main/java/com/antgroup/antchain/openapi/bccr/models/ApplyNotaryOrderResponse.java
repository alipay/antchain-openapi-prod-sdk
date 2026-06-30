// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ApplyNotaryOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 出证申请订单ID
    @NameInMap("notary_order_id")
    public String notaryOrderId;

    // 订单状态
    @NameInMap("order_status")
    public String orderStatus;

    // 支付二维码链接
    @NameInMap("pay_url")
    public String payUrl;

    // 支付二维码过期时间
    @NameInMap("pay_url_expire_time")
    public Long payUrlExpireTime;

    public static ApplyNotaryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyNotaryOrderResponse self = new ApplyNotaryOrderResponse();
        return TeaModel.build(map, self);
    }

    public ApplyNotaryOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyNotaryOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyNotaryOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyNotaryOrderResponse setNotaryOrderId(String notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public String getNotaryOrderId() {
        return this.notaryOrderId;
    }

    public ApplyNotaryOrderResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ApplyNotaryOrderResponse setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public ApplyNotaryOrderResponse setPayUrlExpireTime(Long payUrlExpireTime) {
        this.payUrlExpireTime = payUrlExpireTime;
        return this;
    }
    public Long getPayUrlExpireTime() {
        return this.payUrlExpireTime;
    }

}
