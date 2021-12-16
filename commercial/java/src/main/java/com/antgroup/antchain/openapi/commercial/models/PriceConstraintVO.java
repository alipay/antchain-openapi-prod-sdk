// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PriceConstraintVO extends TeaModel {
    // 规格条件Code
    @NameInMap("spec_condition_code")
    @Validation(required = true)
    public String specConditionCode;

    // 当前规格条件下可选值
    @NameInMap("target_value")
    @Validation(required = true)
    public String targetValue;

    // 基础价格
    @NameInMap("base_price")
    @Validation(required = true)
    public String basePrice;

    // bd价格
    @NameInMap("bd_price")
    @Validation(required = true)
    public String bdPrice;

    // 成本价格
    @NameInMap("cost_price")
    @Validation(required = true)
    public String costPrice;

    public static PriceConstraintVO build(java.util.Map<String, ?> map) throws Exception {
        PriceConstraintVO self = new PriceConstraintVO();
        return TeaModel.build(map, self);
    }

    public PriceConstraintVO setSpecConditionCode(String specConditionCode) {
        this.specConditionCode = specConditionCode;
        return this;
    }
    public String getSpecConditionCode() {
        return this.specConditionCode;
    }

    public PriceConstraintVO setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PriceConstraintVO setBasePrice(String basePrice) {
        this.basePrice = basePrice;
        return this;
    }
    public String getBasePrice() {
        return this.basePrice;
    }

    public PriceConstraintVO setBdPrice(String bdPrice) {
        this.bdPrice = bdPrice;
        return this;
    }
    public String getBdPrice() {
        return this.bdPrice;
    }

    public PriceConstraintVO setCostPrice(String costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public String getCostPrice() {
        return this.costPrice;
    }

}
