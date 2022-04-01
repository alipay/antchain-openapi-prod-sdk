// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PriceConstraintResultVO extends TeaModel {
    // 价格id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 价格约束ID
    @NameInMap("price_constraint_id")
    @Validation(required = true)
    public Long priceConstraintId;

    // 基础价格费率
    @NameInMap("base_price")
    public String basePrice;

    // 基础保底价
    @NameInMap("adjust_price")
    public String adjustPrice;

    // BD销售最低价费率
    @NameInMap("bd_price")
    public String bdPrice;

    // 成本价费率
    @NameInMap("cost_price")
    public String costPrice;

    // 阶梯区间最小值
    @NameInMap("ladder_start")
    public String ladderStart;

    // 阶梯区间结束值
    @NameInMap("ladder_end")
    public String ladderEnd;

    // 价格单位，例如：元/每次
    @NameInMap("price_unit")
    public String priceUnit;

    // 是否阶梯固定价
    @NameInMap("ladder_price_fixed")
    public Boolean ladderPriceFixed;

    public static PriceConstraintResultVO build(java.util.Map<String, ?> map) throws Exception {
        PriceConstraintResultVO self = new PriceConstraintResultVO();
        return TeaModel.build(map, self);
    }

    public PriceConstraintResultVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PriceConstraintResultVO setPriceConstraintId(Long priceConstraintId) {
        this.priceConstraintId = priceConstraintId;
        return this;
    }
    public Long getPriceConstraintId() {
        return this.priceConstraintId;
    }

    public PriceConstraintResultVO setBasePrice(String basePrice) {
        this.basePrice = basePrice;
        return this;
    }
    public String getBasePrice() {
        return this.basePrice;
    }

    public PriceConstraintResultVO setAdjustPrice(String adjustPrice) {
        this.adjustPrice = adjustPrice;
        return this;
    }
    public String getAdjustPrice() {
        return this.adjustPrice;
    }

    public PriceConstraintResultVO setBdPrice(String bdPrice) {
        this.bdPrice = bdPrice;
        return this;
    }
    public String getBdPrice() {
        return this.bdPrice;
    }

    public PriceConstraintResultVO setCostPrice(String costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public String getCostPrice() {
        return this.costPrice;
    }

    public PriceConstraintResultVO setLadderStart(String ladderStart) {
        this.ladderStart = ladderStart;
        return this;
    }
    public String getLadderStart() {
        return this.ladderStart;
    }

    public PriceConstraintResultVO setLadderEnd(String ladderEnd) {
        this.ladderEnd = ladderEnd;
        return this;
    }
    public String getLadderEnd() {
        return this.ladderEnd;
    }

    public PriceConstraintResultVO setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public PriceConstraintResultVO setLadderPriceFixed(Boolean ladderPriceFixed) {
        this.ladderPriceFixed = ladderPriceFixed;
        return this;
    }
    public Boolean getLadderPriceFixed() {
        return this.ladderPriceFixed;
    }

}
