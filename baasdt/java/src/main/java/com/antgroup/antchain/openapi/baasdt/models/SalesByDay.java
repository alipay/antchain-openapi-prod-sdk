// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SalesByDay extends TeaModel {
    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 版权方ID
    @NameInMap("seller_id")
    @Validation(required = true)
    public String sellerId;

    // 商家ID
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 版权方名称
    @NameInMap("seller_name")
    @Validation(required = true)
    public String sellerName;

    // 商家名称
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 统计周期-开始时间
    @NameInMap("statistic_begin_period")
    @Validation(required = true)
    public Long statisticBeginPeriod;

    // 统计周期-结束时间
    @NameInMap("statistic_end_period")
    @Validation(required = true)
    public Long statisticEndPeriod;

    // 商品销售数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 商品总销售额
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 总回退销售额
    @NameInMap("refund_sales")
    @Validation(required = true)
    public String refundSales;

    // 需支付给版权方的总费用
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    public static SalesByDay build(java.util.Map<String, ?> map) throws Exception {
        SalesByDay self = new SalesByDay();
        return TeaModel.build(map, self);
    }

    public SalesByDay setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SalesByDay setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public SalesByDay setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public SalesByDay setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public SalesByDay setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public SalesByDay setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public SalesByDay setStatisticBeginPeriod(Long statisticBeginPeriod) {
        this.statisticBeginPeriod = statisticBeginPeriod;
        return this;
    }
    public Long getStatisticBeginPeriod() {
        return this.statisticBeginPeriod;
    }

    public SalesByDay setStatisticEndPeriod(Long statisticEndPeriod) {
        this.statisticEndPeriod = statisticEndPeriod;
        return this;
    }
    public Long getStatisticEndPeriod() {
        return this.statisticEndPeriod;
    }

    public SalesByDay setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public SalesByDay setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public SalesByDay setRefundSales(String refundSales) {
        this.refundSales = refundSales;
        return this;
    }
    public String getRefundSales() {
        return this.refundSales;
    }

    public SalesByDay setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

}
