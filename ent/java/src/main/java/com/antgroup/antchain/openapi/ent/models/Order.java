// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class Order extends TeaModel {
    // 实付金额，单位分
    @NameInMap("actual_total_amount")
    @Validation(required = true)
    public Long actualTotalAmount;

    // 币种，目前仅支持 CNY
    @NameInMap("currency")
    public String currency;

    // 数量
    @NameInMap("item_count")
    @Validation(required = true)
    public Long itemCount;

    // 唯一订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 原始金额，单位分
    @NameInMap("original_total_amount")
    @Validation(required = true)
    public Long originalTotalAmount;

    // 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
    @NameInMap("confirm_type")
    public String confirmType;

    public static Order build(java.util.Map<String, ?> map) throws Exception {
        Order self = new Order();
        return TeaModel.build(map, self);
    }

    public Order setActualTotalAmount(Long actualTotalAmount) {
        this.actualTotalAmount = actualTotalAmount;
        return this;
    }
    public Long getActualTotalAmount() {
        return this.actualTotalAmount;
    }

    public Order setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Order setItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }
    public Long getItemCount() {
        return this.itemCount;
    }

    public Order setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public Order setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Order setOriginalTotalAmount(Long originalTotalAmount) {
        this.originalTotalAmount = originalTotalAmount;
        return this;
    }
    public Long getOriginalTotalAmount() {
        return this.originalTotalAmount;
    }

    public Order setConfirmType(String confirmType) {
        this.confirmType = confirmType;
        return this;
    }
    public String getConfirmType() {
        return this.confirmType;
    }

}
