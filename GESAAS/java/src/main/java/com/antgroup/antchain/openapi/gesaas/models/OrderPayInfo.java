// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderPayInfo extends TeaModel {
    // 支付状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("order_pay_status")
    @Validation(required = true)
    public String orderPayStatus;

    // 支付时间，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * <strong>example:</strong>
     * <p>2021-07-30 12:00:00</p>
     */
    @NameInMap("order_pay_time")
    public String orderPayTime;

    // 失败原因，条件返回：orderPayStatus=FAILED 返回
    /**
     * <strong>example:</strong>
     * <p>账户余额不足</p>
     */
    @NameInMap("order_pay_failed_reason")
    public String orderPayFailedReason;

    // 支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("pay_amount")
    public Long payAmount;

    // 实际支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("real_pay_amount")
    public Long realPayAmount;

    // 收款金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("real_receipt_amount")
    public Long realReceiptAmount;

    public static OrderPayInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderPayInfo self = new OrderPayInfo();
        return TeaModel.build(map, self);
    }

    public OrderPayInfo setOrderPayStatus(String orderPayStatus) {
        this.orderPayStatus = orderPayStatus;
        return this;
    }
    public String getOrderPayStatus() {
        return this.orderPayStatus;
    }

    public OrderPayInfo setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }
    public String getOrderPayTime() {
        return this.orderPayTime;
    }

    public OrderPayInfo setOrderPayFailedReason(String orderPayFailedReason) {
        this.orderPayFailedReason = orderPayFailedReason;
        return this;
    }
    public String getOrderPayFailedReason() {
        return this.orderPayFailedReason;
    }

    public OrderPayInfo setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

    public OrderPayInfo setRealPayAmount(Long realPayAmount) {
        this.realPayAmount = realPayAmount;
        return this;
    }
    public Long getRealPayAmount() {
        return this.realPayAmount;
    }

    public OrderPayInfo setRealReceiptAmount(Long realReceiptAmount) {
        this.realReceiptAmount = realReceiptAmount;
        return this;
    }
    public Long getRealReceiptAmount() {
        return this.realReceiptAmount;
    }

}
