// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPSalesEvery extends TeaModel {
    // 电商系统订单编号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 数据渠道类型：0 手动录入，1 淘宝开放平台
    @NameInMap("data_type")
    @Validation(required = true)
    public Long dataType;

    // 实际销售渠道
    @NameInMap("sales_channel")
    public String salesChannel;

    // 订单创建时间
    @NameInMap("order_create_time")
    @Validation(required = true)
    public Long orderCreateTime;

    // 订单完成时间
    @NameInMap("order_finish_time")
    @Validation(required = true)
    public Long orderFinishTime;

    // 本订单销售金额，单位元
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 本订单退款金额，单位元
    @NameInMap("refund_sales")
    public String refundSales;

    // 店铺名称
    @NameInMap("shop_name")
    @Validation(required = true)
    public String shopName;

    // 商品ID/SKUID/商品编码
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品规格
    @NameInMap("goods_specification")
    @Validation(required = true)
    public String goodsSpecification;

    // 本订单卖出的商品数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static IPSalesEvery build(java.util.Map<String, ?> map) throws Exception {
        IPSalesEvery self = new IPSalesEvery();
        return TeaModel.build(map, self);
    }

    public IPSalesEvery setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IPSalesEvery setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public IPSalesEvery setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public IPSalesEvery setOrderCreateTime(Long orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public Long getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public IPSalesEvery setOrderFinishTime(Long orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
        return this;
    }
    public Long getOrderFinishTime() {
        return this.orderFinishTime;
    }

    public IPSalesEvery setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public IPSalesEvery setRefundSales(String refundSales) {
        this.refundSales = refundSales;
        return this;
    }
    public String getRefundSales() {
        return this.refundSales;
    }

    public IPSalesEvery setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public IPSalesEvery setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public IPSalesEvery setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public IPSalesEvery setGoodsSpecification(String goodsSpecification) {
        this.goodsSpecification = goodsSpecification;
        return this;
    }
    public String getGoodsSpecification() {
        return this.goodsSpecification;
    }

    public IPSalesEvery setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public IPSalesEvery setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
