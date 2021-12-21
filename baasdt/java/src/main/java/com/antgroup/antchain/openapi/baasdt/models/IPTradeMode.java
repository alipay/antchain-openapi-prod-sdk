// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPTradeMode extends TeaModel {
    // 交易类型，0：销售抽拥；1:按件付费
    @NameInMap("trade_type")
    public java.util.List<Long> tradeType;

    // 佣金比例
    @NameInMap("commission_weight")
    public String commissionWeight;

    // 保底商品销售金额
    @NameInMap("guarantee_sale_number")
    public String guaranteeSaleNumber;

    // 单件单价
    @NameInMap("unit_price")
    public String unitPrice;

    // 保底商品数量
    @NameInMap("guarantee_goods_number")
    public String guaranteeGoodsNumber;

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

}
