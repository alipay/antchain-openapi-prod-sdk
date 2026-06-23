// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PriceDetailDTO extends TeaModel {
    // 定价约束id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("constraint_id")
    @Validation(required = true)
    public Long constraintId;

    // 计费项code
    /**
     * <strong>example:</strong>
     * <p>IN_NO_CACHE</p>
     */
    @NameInMap("charge_item")
    @Validation(required = true)
    public String chargeItem;

    // 定价阶梯
    /**
     * <strong>example:</strong>
     * <p>L0</p>
     */
    @NameInMap("stage_level")
    @Validation(required = true)
    public String stageLevel;

    // 供应商
    /**
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // 刊例价
    /**
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("base_price")
    @Validation(required = true)
    public String basePrice;

    // BD权限价
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("bd_price")
    @Validation(required = true)
    public String bdPrice;

    // 底价
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("cost_price")
    @Validation(required = true)
    public String costPrice;

    // 定价单位
    /**
     * <strong>example:</strong>
     * <p>元</p>
     */
    @NameInMap("price_unit")
    @Validation(required = true)
    public String priceUnit;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("currency_value")
    @Validation(required = true)
    public String currencyValue;

    // 阶梯起始值
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ladder_start")
    @Validation(required = true)
    public String ladderStart;

    // 阶梯结束值
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ladder_end")
    @Validation(required = true)
    public String ladderEnd;

    // 定价id
    /**
     * <strong>example:</strong>
     * <p>12344</p>
     */
    @NameInMap("price_plan_id")
    @Validation(required = true)
    public Long pricePlanId;

    // 定价计划名称
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("price_plan_name")
    @Validation(required = true)
    public String pricePlanName;

    // 定价开始时间
    /**
     * <strong>example:</strong>
     * <p>2026-06-01</p>
     */
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 定价结束时间
    /**
     * <strong>example:</strong>
     * <p>2026-06-30</p>
     */
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static PriceDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        PriceDetailDTO self = new PriceDetailDTO();
        return TeaModel.build(map, self);
    }

    public PriceDetailDTO setConstraintId(Long constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public Long getConstraintId() {
        return this.constraintId;
    }

    public PriceDetailDTO setChargeItem(String chargeItem) {
        this.chargeItem = chargeItem;
        return this;
    }
    public String getChargeItem() {
        return this.chargeItem;
    }

    public PriceDetailDTO setStageLevel(String stageLevel) {
        this.stageLevel = stageLevel;
        return this;
    }
    public String getStageLevel() {
        return this.stageLevel;
    }

    public PriceDetailDTO setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public PriceDetailDTO setBasePrice(String basePrice) {
        this.basePrice = basePrice;
        return this;
    }
    public String getBasePrice() {
        return this.basePrice;
    }

    public PriceDetailDTO setBdPrice(String bdPrice) {
        this.bdPrice = bdPrice;
        return this;
    }
    public String getBdPrice() {
        return this.bdPrice;
    }

    public PriceDetailDTO setCostPrice(String costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public String getCostPrice() {
        return this.costPrice;
    }

    public PriceDetailDTO setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public PriceDetailDTO setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public PriceDetailDTO setLadderStart(String ladderStart) {
        this.ladderStart = ladderStart;
        return this;
    }
    public String getLadderStart() {
        return this.ladderStart;
    }

    public PriceDetailDTO setLadderEnd(String ladderEnd) {
        this.ladderEnd = ladderEnd;
        return this;
    }
    public String getLadderEnd() {
        return this.ladderEnd;
    }

    public PriceDetailDTO setPricePlanId(Long pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }
    public Long getPricePlanId() {
        return this.pricePlanId;
    }

    public PriceDetailDTO setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }
    public String getPricePlanName() {
        return this.pricePlanName;
    }

    public PriceDetailDTO setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PriceDetailDTO setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
