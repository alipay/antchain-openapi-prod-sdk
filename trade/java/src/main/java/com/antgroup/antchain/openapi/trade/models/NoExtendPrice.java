// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class NoExtendPrice extends TeaModel {
    // 定价条件
    @NameInMap("condition_attrs")
    public java.util.List<PriceConditionAttr> conditionAttrs;

    // 阶梯开始
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ladder_start")
    @Validation(required = true)
    public String ladderStart;

    // 阶梯结束
    /**
     * <strong>example:</strong>
     * <p>infinity</p>
     */
    @NameInMap("ladder_end")
    @Validation(required = true)
    public String ladderEnd;

    // 签约价
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 计价方法：具体公式、阶梯方法、自定义
    /**
     * <strong>example:</strong>
     * <p>nonAccDiffFullCalculation</p>
     */
    @NameInMap("pricing_method")
    @Validation(required = true)
    public String pricingMethod;

    // 阶梯区间类型，左开右闭/左闭右开
    /**
     * <strong>example:</strong>
     * <p>LCRO</p>
     */
    @NameInMap("ladder_interval_type")
    @Validation(required = true)
    public String ladderIntervalType;

    // 定价对象code
    /**
     * <strong>example:</strong>
     * <p>SYS_USAGE_AMOUNT</p>
     */
    @NameInMap("price_object_code")
    @Validation(required = true)
    public String priceObjectCode;

    // 计价模式：公式、阶梯、自定义
    /**
     * <strong>example:</strong>
     * <p>ladder</p>
     */
    @NameInMap("pricing_mode")
    @Validation(required = true)
    public String pricingMode;

    // 价格单位
    /**
     * <strong>example:</strong>
     * <p>元/次</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    // 是否阶梯总价
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("ladder_price_fixed")
    public Boolean ladderPriceFixed;

    public static NoExtendPrice build(java.util.Map<String, ?> map) throws Exception {
        NoExtendPrice self = new NoExtendPrice();
        return TeaModel.build(map, self);
    }

    public NoExtendPrice setConditionAttrs(java.util.List<PriceConditionAttr> conditionAttrs) {
        this.conditionAttrs = conditionAttrs;
        return this;
    }
    public java.util.List<PriceConditionAttr> getConditionAttrs() {
        return this.conditionAttrs;
    }

    public NoExtendPrice setLadderStart(String ladderStart) {
        this.ladderStart = ladderStart;
        return this;
    }
    public String getLadderStart() {
        return this.ladderStart;
    }

    public NoExtendPrice setLadderEnd(String ladderEnd) {
        this.ladderEnd = ladderEnd;
        return this;
    }
    public String getLadderEnd() {
        return this.ladderEnd;
    }

    public NoExtendPrice setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public NoExtendPrice setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
        return this;
    }
    public String getPricingMethod() {
        return this.pricingMethod;
    }

    public NoExtendPrice setLadderIntervalType(String ladderIntervalType) {
        this.ladderIntervalType = ladderIntervalType;
        return this;
    }
    public String getLadderIntervalType() {
        return this.ladderIntervalType;
    }

    public NoExtendPrice setPriceObjectCode(String priceObjectCode) {
        this.priceObjectCode = priceObjectCode;
        return this;
    }
    public String getPriceObjectCode() {
        return this.priceObjectCode;
    }

    public NoExtendPrice setPricingMode(String pricingMode) {
        this.pricingMode = pricingMode;
        return this;
    }
    public String getPricingMode() {
        return this.pricingMode;
    }

    public NoExtendPrice setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public NoExtendPrice setLadderPriceFixed(Boolean ladderPriceFixed) {
        this.ladderPriceFixed = ladderPriceFixed;
        return this;
    }
    public Boolean getLadderPriceFixed() {
        return this.ladderPriceFixed;
    }

}
