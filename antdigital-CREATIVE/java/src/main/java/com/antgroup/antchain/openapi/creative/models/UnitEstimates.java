// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class UnitEstimates extends TeaModel {
    // 从 0 开始，与请求的 units[] 顺序一致
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("unit_index")
    public Long unitIndex;

    // 当前单元是否命中
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("matched")
    public Boolean matched;

    // 当前单元是否命中兜底规则
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("fallback")
    public Boolean fallback;

    // 规则编码
    /**
     * <strong>example:</strong>
     * <p>规则编码</p>
     */
    @NameInMap("price_rule_code")
    public String priceRuleCode;

    // 规则版本
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("matched_rule_version")
    public Long matchedRuleVersion;

    // 规则名称
    /**
     * <strong>example:</strong>
     * <p>规则名称</p>
     */
    @NameInMap("rule_name")
    public String ruleName;

    // 规则优先级
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("priority")
    public Long priority;

    // 费用明细
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("items")
    public java.util.List<RequestItems> items;

    // 当前单元金额
    /**
     * <strong>example:</strong>
     * <p>当前单元金额</p>
     */
    @NameInMap("amount")
    public String amount;

    // 未命中或部分命中时的提示
    /**
     * <strong>example:</strong>
     * <p>未命中或部分命中时的提示</p>
     */
    @NameInMap("message")
    public String message;

    public static UnitEstimates build(java.util.Map<String, ?> map) throws Exception {
        UnitEstimates self = new UnitEstimates();
        return TeaModel.build(map, self);
    }

    public UnitEstimates setUnitIndex(Long unitIndex) {
        this.unitIndex = unitIndex;
        return this;
    }
    public Long getUnitIndex() {
        return this.unitIndex;
    }

    public UnitEstimates setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

    public UnitEstimates setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public UnitEstimates setPriceRuleCode(String priceRuleCode) {
        this.priceRuleCode = priceRuleCode;
        return this;
    }
    public String getPriceRuleCode() {
        return this.priceRuleCode;
    }

    public UnitEstimates setMatchedRuleVersion(Long matchedRuleVersion) {
        this.matchedRuleVersion = matchedRuleVersion;
        return this;
    }
    public Long getMatchedRuleVersion() {
        return this.matchedRuleVersion;
    }

    public UnitEstimates setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UnitEstimates setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UnitEstimates setItems(java.util.List<RequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RequestItems> getItems() {
        return this.items;
    }

    public UnitEstimates setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public UnitEstimates setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
