// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PriceConstraintVO extends TeaModel {
    // 定价计划ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 定价计划ID
    @NameInMap("price_plan_id")
    @Validation(required = true)
    public Long pricePlanId;

    // 定价计划名称
    @NameInMap("name")
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    // 约束条件列表
    @NameInMap("price_constraint_condition_vo_list")
    public java.util.List<PriceConstraintConditionVO> priceConstraintConditionVoList;

    // 约束结果列表
    @NameInMap("price_constraint_result_vo_list")
    public java.util.List<PriceConstraintResultVO> priceConstraintResultVoList;

    public static PriceConstraintVO build(java.util.Map<String, ?> map) throws Exception {
        PriceConstraintVO self = new PriceConstraintVO();
        return TeaModel.build(map, self);
    }

    public PriceConstraintVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PriceConstraintVO setPricePlanId(Long pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }
    public Long getPricePlanId() {
        return this.pricePlanId;
    }

    public PriceConstraintVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PriceConstraintVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PriceConstraintVO setPriceConstraintConditionVoList(java.util.List<PriceConstraintConditionVO> priceConstraintConditionVoList) {
        this.priceConstraintConditionVoList = priceConstraintConditionVoList;
        return this;
    }
    public java.util.List<PriceConstraintConditionVO> getPriceConstraintConditionVoList() {
        return this.priceConstraintConditionVoList;
    }

    public PriceConstraintVO setPriceConstraintResultVoList(java.util.List<PriceConstraintResultVO> priceConstraintResultVoList) {
        this.priceConstraintResultVoList = priceConstraintResultVoList;
        return this;
    }
    public java.util.List<PriceConstraintResultVO> getPriceConstraintResultVoList() {
        return this.priceConstraintResultVoList;
    }

}
