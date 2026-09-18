// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OrderFundItem extends TeaModel {
    // order_id
    /**
     * <strong>example:</strong>
     * <p>METL202004041220123456</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // trade_no
    /**
     * <strong>example:</strong>
     * <p>METL202004041220123456</p>
     */
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // amount
    /**
     * <strong>example:</strong>
     * <p>300.00</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 详细
    @NameInMap("details")
    @Validation(required = true)
    public java.util.List<FundItem> details;

    public static OrderFundItem build(java.util.Map<String, ?> map) throws Exception {
        OrderFundItem self = new OrderFundItem();
        return TeaModel.build(map, self);
    }

    public OrderFundItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderFundItem setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public OrderFundItem setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public OrderFundItem setDetails(java.util.List<FundItem> details) {
        this.details = details;
        return this;
    }
    public java.util.List<FundItem> getDetails() {
        return this.details;
    }

}
