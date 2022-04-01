// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PriceObjectFee extends TeaModel {
    // 收费项CODE
    @NameInMap("price_object_code")
    public String priceObjectCode;

    // 收费项名称
    @NameInMap("price_object_name")
    public String priceObjectName;

    // 高精度价格12位
    @NameInMap("price")
    public String price;

    // 价格类型，标准价格，一客一价
    @NameInMap("price_type")
    public String priceType;

    // 结算信息
    @NameInMap("settle_type")
    public String settleType;

    // 币种
    @NameInMap("currency")
    public String currency;

    // 命中的定价计划
    @NameInMap("price_plan_vo")
    public PricePlanVO pricePlanVo;

    // 命中的定价计划约束
    @NameInMap("price_constraint_vo")
    public PriceConstraintVO priceConstraintVo;

    // 扩展信息
    @NameInMap("extends_map")
    public String extendsMap;

    // BD销售价格区间
    @NameInMap("bd_price")
    public String bdPrice;

    // 最低成本价
    @NameInMap("cost_price")
    public String costPrice;

    public static PriceObjectFee build(java.util.Map<String, ?> map) throws Exception {
        PriceObjectFee self = new PriceObjectFee();
        return TeaModel.build(map, self);
    }

    public PriceObjectFee setPriceObjectCode(String priceObjectCode) {
        this.priceObjectCode = priceObjectCode;
        return this;
    }
    public String getPriceObjectCode() {
        return this.priceObjectCode;
    }

    public PriceObjectFee setPriceObjectName(String priceObjectName) {
        this.priceObjectName = priceObjectName;
        return this;
    }
    public String getPriceObjectName() {
        return this.priceObjectName;
    }

    public PriceObjectFee setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public PriceObjectFee setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public PriceObjectFee setSettleType(String settleType) {
        this.settleType = settleType;
        return this;
    }
    public String getSettleType() {
        return this.settleType;
    }

    public PriceObjectFee setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PriceObjectFee setPricePlanVo(PricePlanVO pricePlanVo) {
        this.pricePlanVo = pricePlanVo;
        return this;
    }
    public PricePlanVO getPricePlanVo() {
        return this.pricePlanVo;
    }

    public PriceObjectFee setPriceConstraintVo(PriceConstraintVO priceConstraintVo) {
        this.priceConstraintVo = priceConstraintVo;
        return this;
    }
    public PriceConstraintVO getPriceConstraintVo() {
        return this.priceConstraintVo;
    }

    public PriceObjectFee setExtendsMap(String extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }
    public String getExtendsMap() {
        return this.extendsMap;
    }

    public PriceObjectFee setBdPrice(String bdPrice) {
        this.bdPrice = bdPrice;
        return this;
    }
    public String getBdPrice() {
        return this.bdPrice;
    }

    public PriceObjectFee setCostPrice(String costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public String getCostPrice() {
        return this.costPrice;
    }

}
