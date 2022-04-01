// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PriceConstraintConditionVO extends TeaModel {
    // 约束ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 价格约束ID
    @NameInMap("price_constraint_id")
    @Validation(required = true)
    public Long priceConstraintId;

    // 规格条件CODE
    @NameInMap("spec_condition_code")
    public String specConditionCode;

    // 条件关系比较符
    @NameInMap("operator")
    public String operator;

    // 待比较对象的值
    @NameInMap("target_value")
    public String targetValue;

    // 特定场景下set才会有值
    @NameInMap("spec_condition_name")
    public String specConditionName;

    // 特定场景下set才会有值
    @NameInMap("target_value_name")
    public String targetValueName;

    // 描述
    @NameInMap("description")
    public String description;

    public static PriceConstraintConditionVO build(java.util.Map<String, ?> map) throws Exception {
        PriceConstraintConditionVO self = new PriceConstraintConditionVO();
        return TeaModel.build(map, self);
    }

    public PriceConstraintConditionVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PriceConstraintConditionVO setPriceConstraintId(Long priceConstraintId) {
        this.priceConstraintId = priceConstraintId;
        return this;
    }
    public Long getPriceConstraintId() {
        return this.priceConstraintId;
    }

    public PriceConstraintConditionVO setSpecConditionCode(String specConditionCode) {
        this.specConditionCode = specConditionCode;
        return this;
    }
    public String getSpecConditionCode() {
        return this.specConditionCode;
    }

    public PriceConstraintConditionVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PriceConstraintConditionVO setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PriceConstraintConditionVO setSpecConditionName(String specConditionName) {
        this.specConditionName = specConditionName;
        return this;
    }
    public String getSpecConditionName() {
        return this.specConditionName;
    }

    public PriceConstraintConditionVO setTargetValueName(String targetValueName) {
        this.targetValueName = targetValueName;
        return this;
    }
    public String getTargetValueName() {
        return this.targetValueName;
    }

    public PriceConstraintConditionVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
