// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class SocialIncomeEvaluationFacade extends TeaModel {
    // 查询结果
    /**
     * <strong>example:</strong>
     * <p>00,01</p>
     */
    @NameInMap("score_result")
    @Validation(required = true)
    public String scoreResult;

    // 收入评分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("range_score")
    public String rangeScore;

    // 历史稳定性评估
    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("history_score")
    public String historyScore;

    // 近期稳定性评估
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("stability_score")
    public String stabilityScore;

    public static SocialIncomeEvaluationFacade build(java.util.Map<String, ?> map) throws Exception {
        SocialIncomeEvaluationFacade self = new SocialIncomeEvaluationFacade();
        return TeaModel.build(map, self);
    }

    public SocialIncomeEvaluationFacade setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
        return this;
    }
    public String getScoreResult() {
        return this.scoreResult;
    }

    public SocialIncomeEvaluationFacade setRangeScore(String rangeScore) {
        this.rangeScore = rangeScore;
        return this;
    }
    public String getRangeScore() {
        return this.rangeScore;
    }

    public SocialIncomeEvaluationFacade setHistoryScore(String historyScore) {
        this.historyScore = historyScore;
        return this;
    }
    public String getHistoryScore() {
        return this.historyScore;
    }

    public SocialIncomeEvaluationFacade setStabilityScore(String stabilityScore) {
        this.stabilityScore = stabilityScore;
        return this;
    }
    public String getStabilityScore() {
        return this.stabilityScore;
    }

}
