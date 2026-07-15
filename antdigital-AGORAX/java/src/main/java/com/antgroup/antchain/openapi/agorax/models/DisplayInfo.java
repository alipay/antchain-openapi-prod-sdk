// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class DisplayInfo extends TeaModel {
    // 权益名称
    /**
     * <strong>example:</strong>
     * <p>满100 减10元</p>
     */
    @NameInMap("benefit_name")
    public String benefitName;

    // 展示金额文案
    /**
     * <strong>example:</strong>
     * <p>10元</p>
     */
    @NameInMap("show_amount_text")
    public String showAmountText;

    // 门槛金额文案
    /**
     * <strong>example:</strong>
     * <p>满100元可用</p>
     */
    @NameInMap("threshold_amount_text")
    public String thresholdAmountText;

    // 使用说明
    /**
     * <strong>example:</strong>
     * <p>满100 减10元</p>
     */
    @NameInMap("benefit_usage_desc")
    public String benefitUsageDesc;

    // 规则描述
    /**
     * <strong>example:</strong>
     * <p>满100元可用</p>
     */
    @NameInMap("benefit_rule_desc")
    public String benefitRuleDesc;

    public static DisplayInfo build(java.util.Map<String, ?> map) throws Exception {
        DisplayInfo self = new DisplayInfo();
        return TeaModel.build(map, self);
    }

    public DisplayInfo setBenefitName(String benefitName) {
        this.benefitName = benefitName;
        return this;
    }
    public String getBenefitName() {
        return this.benefitName;
    }

    public DisplayInfo setShowAmountText(String showAmountText) {
        this.showAmountText = showAmountText;
        return this;
    }
    public String getShowAmountText() {
        return this.showAmountText;
    }

    public DisplayInfo setThresholdAmountText(String thresholdAmountText) {
        this.thresholdAmountText = thresholdAmountText;
        return this;
    }
    public String getThresholdAmountText() {
        return this.thresholdAmountText;
    }

    public DisplayInfo setBenefitUsageDesc(String benefitUsageDesc) {
        this.benefitUsageDesc = benefitUsageDesc;
        return this;
    }
    public String getBenefitUsageDesc() {
        return this.benefitUsageDesc;
    }

    public DisplayInfo setBenefitRuleDesc(String benefitRuleDesc) {
        this.benefitRuleDesc = benefitRuleDesc;
        return this;
    }
    public String getBenefitRuleDesc() {
        return this.benefitRuleDesc;
    }

}
