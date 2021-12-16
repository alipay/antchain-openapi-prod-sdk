// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PricePlanVO extends TeaModel {
    // 规格Code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 定价类型
    @NameInMap("price_type")
    @Validation(required = true)
    public String priceType;

    // 定价计划描述
    @NameInMap("price_plan_desc")
    @Validation(required = true)
    public String pricePlanDesc;

    // 定价约束列表
    @NameInMap("price_constraint")
    @Validation(required = true)
    public java.util.List<PriceConstraintVO> priceConstraint;

    public static PricePlanVO build(java.util.Map<String, ?> map) throws Exception {
        PricePlanVO self = new PricePlanVO();
        return TeaModel.build(map, self);
    }

    public PricePlanVO setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public PricePlanVO setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public PricePlanVO setPricePlanDesc(String pricePlanDesc) {
        this.pricePlanDesc = pricePlanDesc;
        return this;
    }
    public String getPricePlanDesc() {
        return this.pricePlanDesc;
    }

    public PricePlanVO setPriceConstraint(java.util.List<PriceConstraintVO> priceConstraint) {
        this.priceConstraint = priceConstraint;
        return this;
    }
    public java.util.List<PriceConstraintVO> getPriceConstraint() {
        return this.priceConstraint;
    }

}
