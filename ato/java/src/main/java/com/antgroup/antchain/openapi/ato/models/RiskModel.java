// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskModel extends TeaModel {
    // 风险场景编码
    /**
     * <strong>example:</strong>
     * <p>风险场景编码</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 该风险场景的风险分值
    /**
     * <strong>example:</strong>
     * <p>该风险场景的风险分值</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 逾期率
    /**
     * <strong>example:</strong>
     * <p>2%</p>
     */
    @NameInMap("delinquency_rate")
    public String delinquencyRate;

    // 风险建议
    /**
     * <strong>example:</strong>
     * <p>风险等级低，建议快速通过</p>
     */
    @NameInMap("risk_advice")
    public String riskAdvice;

    // 风险等级
    /**
     * <strong>example:</strong>
     * <p>rank1</p>
     */
    @NameInMap("risk_rank")
    public String riskRank;

    // 流程id
    /**
     * <strong>example:</strong>
     * <p>10000009000001804441658067824640</p>
     */
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 拒量模型捞回分
    /**
     * <strong>example:</strong>
     * <p>0.00570491</p>
     */
    @NameInMap("mob_three_score")
    public String mobThreeScore;

    // 拒量模型首逾分
    /**
     * <strong>example:</strong>
     * <p>0.00570491</p>
     */
    @NameInMap("fpd_thirty_score")
    public String fpdThirtyScore;

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

    public RiskModel setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public RiskModel setMobThreeScore(String mobThreeScore) {
        this.mobThreeScore = mobThreeScore;
        return this;
    }
    public String getMobThreeScore() {
        return this.mobThreeScore;
    }

    public RiskModel setFpdThirtyScore(String fpdThirtyScore) {
        this.fpdThirtyScore = fpdThirtyScore;
        return this;
    }
    public String getFpdThirtyScore() {
        return this.fpdThirtyScore;
    }

}
