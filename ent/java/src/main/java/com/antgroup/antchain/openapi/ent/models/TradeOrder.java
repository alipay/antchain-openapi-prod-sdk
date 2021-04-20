// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class TradeOrder extends TeaModel {
    // 订单唯一编号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 订单原始金额，单位分
    @NameInMap("original_total_amount")
    @Validation(required = true)
    public Long originalTotalAmount;

    // 订单实付金额，单位分
    @NameInMap("actual_total_amount")
    @Validation(required = true)
    public Long actualTotalAmount;

    // 数量
    @NameInMap("item_count")
    @Validation(required = true)
    public Long itemCount;

    // 币种，暂时只支持人民币 CNY
    @NameInMap("currency")
    public String currency;

    public static TradeOrder build(java.util.Map<String, ?> map) throws Exception {
        TradeOrder self = new TradeOrder();
        return TeaModel.build(map, self);
    }

    public TradeOrder setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public TradeOrder setOriginalTotalAmount(Long originalTotalAmount) {
        this.originalTotalAmount = originalTotalAmount;
        return this;
    }
    public Long getOriginalTotalAmount() {
        return this.originalTotalAmount;
    }

    public TradeOrder setActualTotalAmount(Long actualTotalAmount) {
        this.actualTotalAmount = actualTotalAmount;
        return this;
    }
    public Long getActualTotalAmount() {
        return this.actualTotalAmount;
    }

    public TradeOrder setItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }
    public Long getItemCount() {
        return this.itemCount;
    }

    public TradeOrder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
