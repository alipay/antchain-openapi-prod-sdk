// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PersonalIncomeEvaluationFacade extends TeaModel {
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
    @NameInMap("income_score")
    public String incomeScore;

    public static PersonalIncomeEvaluationFacade build(java.util.Map<String, ?> map) throws Exception {
        PersonalIncomeEvaluationFacade self = new PersonalIncomeEvaluationFacade();
        return TeaModel.build(map, self);
    }

    public PersonalIncomeEvaluationFacade setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
        return this;
    }
    public String getScoreResult() {
        return this.scoreResult;
    }

    public PersonalIncomeEvaluationFacade setIncomeScore(String incomeScore) {
        this.incomeScore = incomeScore;
        return this;
    }
    public String getIncomeScore() {
        return this.incomeScore;
    }

}
