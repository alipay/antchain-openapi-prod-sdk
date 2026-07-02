// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskGoModel extends TeaModel {
    // 风险类型。
    // 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
    /**
     * <strong>example:</strong>
     * <p>MARKETING_PURCHASE_COMMON</p>
     */
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    // 风险等级。
    // 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
    /**
     * <strong>example:</strong>
     * <p>rank1</p>
     */
    @NameInMap("risk_value")
    @Validation(required = true)
    public String riskValue;

    // 风险描述
    /**
     * <strong>example:</strong>
     * <p>风险等级1</p>
     */
    @NameInMap("risk_desc")
    @Validation(required = true)
    public String riskDesc;

    // 风险标签
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("info_code")
    public String infoCode;

    public static RiskGoModel build(java.util.Map<String, ?> map) throws Exception {
        RiskGoModel self = new RiskGoModel();
        return TeaModel.build(map, self);
    }

    public RiskGoModel setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public RiskGoModel setRiskValue(String riskValue) {
        this.riskValue = riskValue;
        return this;
    }
    public String getRiskValue() {
        return this.riskValue;
    }

    public RiskGoModel setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

    public RiskGoModel setInfoCode(String infoCode) {
        this.infoCode = infoCode;
        return this;
    }
    public String getInfoCode() {
        return this.infoCode;
    }

}
