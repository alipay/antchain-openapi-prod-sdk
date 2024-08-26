// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskModel extends TeaModel {
    // 风险场景编码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 该风险场景的风险分值
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 逾期率
    @NameInMap("delinquency_rate")
    public String delinquencyRate;

    // 风险建议
    @NameInMap("risk_advice")
    public String riskAdvice;

    // 风险等级
    @NameInMap("risk_rank")
    public String riskRank;

    public static RiskModel build(java.util.Map<String, ?> map) throws Exception {
        RiskModel self = new RiskModel();
        return TeaModel.build(map, self);
    }

    public RiskModel setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public RiskModel setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public RiskModel setDelinquencyRate(String delinquencyRate) {
        this.delinquencyRate = delinquencyRate;
        return this;
    }
    public String getDelinquencyRate() {
        return this.delinquencyRate;
    }

    public RiskModel setRiskAdvice(String riskAdvice) {
        this.riskAdvice = riskAdvice;
        return this;
    }
    public String getRiskAdvice() {
        return this.riskAdvice;
    }

    public RiskModel setRiskRank(String riskRank) {
        this.riskRank = riskRank;
        return this;
    }
    public String getRiskRank() {
        return this.riskRank;
    }

}
