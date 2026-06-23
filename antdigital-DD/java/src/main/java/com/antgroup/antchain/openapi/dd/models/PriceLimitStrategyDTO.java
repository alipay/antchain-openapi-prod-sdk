// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PriceLimitStrategyDTO extends TeaModel {
    // 创建人
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("creator")
    public String creator;

    // 修改人
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("modifier")
    public String modifier;

    // 是否删除
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("deleted")
    public Boolean deleted;

    // 定价计划ID
    /**
     * <strong>example:</strong>
     * <p>0,1</p>
     */
    @NameInMap("price_plan_id")
    @Validation(required = true)
    public Long pricePlanId;

    // 保底周期,year年、month月
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("duration_type")
    public String durationType;

    // 保底价格
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("guarantee_price")
    public String guaranteePrice;

    // 产品成本
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("guarantee_cost_price")
    public String guaranteeCostPrice;

    public static PriceLimitStrategyDTO build(java.util.Map<String, ?> map) throws Exception {
        PriceLimitStrategyDTO self = new PriceLimitStrategyDTO();
        return TeaModel.build(map, self);
    }

    public PriceLimitStrategyDTO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public PriceLimitStrategyDTO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public PriceLimitStrategyDTO setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public PriceLimitStrategyDTO setPricePlanId(Long pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }
    public Long getPricePlanId() {
        return this.pricePlanId;
    }

    public PriceLimitStrategyDTO setDurationType(String durationType) {
        this.durationType = durationType;
        return this;
    }
    public String getDurationType() {
        return this.durationType;
    }

    public PriceLimitStrategyDTO setGuaranteePrice(String guaranteePrice) {
        this.guaranteePrice = guaranteePrice;
        return this;
    }
    public String getGuaranteePrice() {
        return this.guaranteePrice;
    }

    public PriceLimitStrategyDTO setGuaranteeCostPrice(String guaranteeCostPrice) {
        this.guaranteeCostPrice = guaranteeCostPrice;
        return this;
    }
    public String getGuaranteeCostPrice() {
        return this.guaranteeCostPrice;
    }

}
