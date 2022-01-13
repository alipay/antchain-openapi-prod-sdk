// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPTradeMode extends TeaModel {
    // 交易类型，0：销售抽拥；1:按件付费
    @NameInMap("trade_type")
    public java.util.List<Long> tradeType;

    // 销售抽拥设置类型，0批量设置，1，单独设置
    @NameInMap("commission_set_type")
    public String commissionSetType;

    // 佣金比例
    @NameInMap("commission_weight")
    public String commissionWeight;

    // 保底商品销售金额
    @NameInMap("guarantee_sale_number")
    public String guaranteeSaleNumber;

    // 销售抽佣单独设置信息
    @NameInMap("commission_separate_set_info")
    public java.util.List<IPCommissionSeparateSetInfo> commissionSeparateSetInfo;

    // 按件付费设置类型，0批量设置，1，单独设置
    @NameInMap("payt_set_type")
    public String paytSetType;

    // 单件单价
    @NameInMap("unit_price")
    public String unitPrice;

    // 保底商品数量
    @NameInMap("guarantee_goods_number")
    public String guaranteeGoodsNumber;

    // 按件付费单独设置信息
    @NameInMap("payt_separate_set_info")
    public java.util.List<IPPaytSeparateSetInfo> paytSeparateSetInfo;

    public static IPTradeMode build(java.util.Map<String, ?> map) throws Exception {
        IPTradeMode self = new IPTradeMode();
        return TeaModel.build(map, self);
    }

    public IPTradeMode setTradeType(java.util.List<Long> tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public java.util.List<Long> getTradeType() {
        return this.tradeType;
    }

    public IPTradeMode setCommissionSetType(String commissionSetType) {
        this.commissionSetType = commissionSetType;
        return this;
    }
    public String getCommissionSetType() {
        return this.commissionSetType;
    }

    public IPTradeMode setCommissionWeight(String commissionWeight) {
        this.commissionWeight = commissionWeight;
        return this;
    }
    public String getCommissionWeight() {
        return this.commissionWeight;
    }

    public IPTradeMode setGuaranteeSaleNumber(String guaranteeSaleNumber) {
        this.guaranteeSaleNumber = guaranteeSaleNumber;
        return this;
    }
    public String getGuaranteeSaleNumber() {
        return this.guaranteeSaleNumber;
    }

    public IPTradeMode setCommissionSeparateSetInfo(java.util.List<IPCommissionSeparateSetInfo> commissionSeparateSetInfo) {
        this.commissionSeparateSetInfo = commissionSeparateSetInfo;
        return this;
    }
    public java.util.List<IPCommissionSeparateSetInfo> getCommissionSeparateSetInfo() {
        return this.commissionSeparateSetInfo;
    }

    public IPTradeMode setPaytSetType(String paytSetType) {
        this.paytSetType = paytSetType;
        return this;
    }
    public String getPaytSetType() {
        return this.paytSetType;
    }

    public IPTradeMode setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

    public IPTradeMode setGuaranteeGoodsNumber(String guaranteeGoodsNumber) {
        this.guaranteeGoodsNumber = guaranteeGoodsNumber;
        return this;
    }
    public String getGuaranteeGoodsNumber() {
        return this.guaranteeGoodsNumber;
    }

    public IPTradeMode setPaytSeparateSetInfo(java.util.List<IPPaytSeparateSetInfo> paytSeparateSetInfo) {
        this.paytSeparateSetInfo = paytSeparateSetInfo;
        return this;
    }
    public java.util.List<IPPaytSeparateSetInfo> getPaytSeparateSetInfo() {
        return this.paytSeparateSetInfo;
    }

}
