// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateWithholdRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String orderId;

    // 第几期
    // 针对用户履约的第几期进行退款申请
    @NameInMap("period_num")
    public Long periodNum;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String refundRequestNo;

    // 本次请求的退款金额，单位为分
    // 1234=12.34元
    @NameInMap("refund_money")
    @Validation(required = true, minimum = 1)
    public Long refundMoney;

    // 退款原因
    @NameInMap("refund_reason")
    @Validation(maxLength = 200)
    public String refundReason;

    // 支付类型
    // ORDER_BUYOUT:买断金
    // ORDER_PENALTY:违约金
    // PERFORMANCE:正常履约（默认）
    @NameInMap("pay_type")
    @Validation(maxLength = 64)
    public String payType;

    public static CreateWithholdRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdRefundRequest self = new CreateWithholdRefundRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWithholdRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWithholdRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateWithholdRefundRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public CreateWithholdRefundRequest setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public CreateWithholdRefundRequest setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
        return this;
    }
    public Long getRefundMoney() {
        return this.refundMoney;
    }

    public CreateWithholdRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public CreateWithholdRefundRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

}
