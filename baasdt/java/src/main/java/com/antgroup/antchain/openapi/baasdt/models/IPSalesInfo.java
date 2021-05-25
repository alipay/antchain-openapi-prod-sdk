// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPSalesInfo extends TeaModel {
    // 终端商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 终端商品图片
    @NameInMap("goods_image")
    @Validation(required = true)
    public String goodsImage;

    // 终端销售渠道
    @NameInMap("sales_channel")
    @Validation(required = true)
    public String salesChannel;

    // 终端商品链接
    @NameInMap("goods_url")
    @Validation(required = true)
    public String goodsUrl;

    // 零售价
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 商品销售数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 销售金额
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 实付金额（授权交易）
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 统计周期开始时间（毫秒时间戳）
    @NameInMap("settlement_begin_time")
    @Validation(required = true)
    public Long settlementBeginTime;

    // 统计周期结束时间（毫秒时间戳）
    @NameInMap("settlement_end_time")
    @Validation(required = true)
    public Long settlementEndTime;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 数据上传操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 销售数据上传操作时间（毫秒时间戳）
    @NameInMap("operate_time")
    @Validation(required = true)
    public Long operateTime;

    // 商品信息
    @NameInMap("goods_info")
    public String goodsInfo;

    public static IPSalesInfo build(java.util.Map<String, ?> map) throws Exception {
        IPSalesInfo self = new IPSalesInfo();
        return TeaModel.build(map, self);
    }

    public IPSalesInfo setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public IPSalesInfo setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
        return this;
    }
    public String getGoodsImage() {
        return this.goodsImage;
    }

    public IPSalesInfo setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public IPSalesInfo setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
        return this;
    }
    public String getGoodsUrl() {
        return this.goodsUrl;
    }

    public IPSalesInfo setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public IPSalesInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public IPSalesInfo setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public IPSalesInfo setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public IPSalesInfo setSettlementBeginTime(Long settlementBeginTime) {
        this.settlementBeginTime = settlementBeginTime;
        return this;
    }
    public Long getSettlementBeginTime() {
        return this.settlementBeginTime;
    }

    public IPSalesInfo setSettlementEndTime(Long settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
        return this;
    }
    public Long getSettlementEndTime() {
        return this.settlementEndTime;
    }

    public IPSalesInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public IPSalesInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public IPSalesInfo setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IPSalesInfo setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public String getGoodsInfo() {
        return this.goodsInfo;
    }

}
