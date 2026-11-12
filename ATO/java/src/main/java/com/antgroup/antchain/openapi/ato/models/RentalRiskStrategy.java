// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RentalRiskStrategy extends TeaModel {
    // 最小分数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min_score")
    @Validation(required = true)
    public Long minScore;

    // 最大分数
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("max_score")
    @Validation(required = true)
    public Long maxScore;

    // RATIO（按比例）
    // FIXED（固定金额）
    // action==PASS 必填
    /**
     * <strong>example:</strong>
     * <p>RATIO</p>
     */
    @NameInMap("free_deposit_type")
    public String freeDepositType;

    // RATIO 时传 (0,100]，100表示100%，85表示85%；
    // FIXED 时传金额（分）；
    // action==PASS 必填
    /**
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("free_deposit_value")
    public Long freeDepositValue;

    // PASS 
    // REJECT
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 风控区间
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("risk_rank")
    @Validation(required = true)
    public Long riskRank;

    public static RentalRiskStrategy build(java.util.Map<String, ?> map) throws Exception {
        RentalRiskStrategy self = new RentalRiskStrategy();
        return TeaModel.build(map, self);
    }

    public RentalRiskStrategy setMinScore(Long minScore) {
        this.minScore = minScore;
        return this;
    }
    public Long getMinScore() {
        return this.minScore;
    }

    public RentalRiskStrategy setMaxScore(Long maxScore) {
        this.maxScore = maxScore;
        return this;
    }
    public Long getMaxScore() {
        return this.maxScore;
    }

    public RentalRiskStrategy setFreeDepositType(String freeDepositType) {
        this.freeDepositType = freeDepositType;
        return this;
    }
    public String getFreeDepositType() {
        return this.freeDepositType;
    }

    public RentalRiskStrategy setFreeDepositValue(Long freeDepositValue) {
        this.freeDepositValue = freeDepositValue;
        return this;
    }
    public Long getFreeDepositValue() {
        return this.freeDepositValue;
    }

    public RentalRiskStrategy setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public RentalRiskStrategy setRiskRank(Long riskRank) {
        this.riskRank = riskRank;
        return this;
    }
    public Long getRiskRank() {
        return this.riskRank;
    }

}
