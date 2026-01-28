// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseLcaStageAssessmentItem extends TeaModel {
    // LCA阶段
    /**
     * <strong>example:</strong>
     * <p>ProductManufacture</p>
     */
    @NameInMap("lca_stage")
    @Validation(required = true)
    public String lcaStage;

    // 阶段排放占比
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lca_stage_carbon_rate")
    @Validation(required = true)
    public String lcaStageCarbonRate;

    // 阶段排放量
    /**
     * <strong>example:</strong>
     * <p>123.12</p>
     */
    @NameInMap("lca_stage_carbon_emissions")
    @Validation(required = true)
    public String lcaStageCarbonEmissions;

    // 阶段评估明细数据
    @NameInMap("lca_assessment_datum")
    @Validation(required = true)
    public java.util.List<EnterpriseLcaAssessmentItem> lcaAssessmentDatum;

    public static EnterpriseLcaStageAssessmentItem build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseLcaStageAssessmentItem self = new EnterpriseLcaStageAssessmentItem();
        return TeaModel.build(map, self);
    }

    public EnterpriseLcaStageAssessmentItem setLcaStage(String lcaStage) {
        this.lcaStage = lcaStage;
        return this;
    }
    public String getLcaStage() {
        return this.lcaStage;
    }

    public EnterpriseLcaStageAssessmentItem setLcaStageCarbonRate(String lcaStageCarbonRate) {
        this.lcaStageCarbonRate = lcaStageCarbonRate;
        return this;
    }
    public String getLcaStageCarbonRate() {
        return this.lcaStageCarbonRate;
    }

    public EnterpriseLcaStageAssessmentItem setLcaStageCarbonEmissions(String lcaStageCarbonEmissions) {
        this.lcaStageCarbonEmissions = lcaStageCarbonEmissions;
        return this;
    }
    public String getLcaStageCarbonEmissions() {
        return this.lcaStageCarbonEmissions;
    }

    public EnterpriseLcaStageAssessmentItem setLcaAssessmentDatum(java.util.List<EnterpriseLcaAssessmentItem> lcaAssessmentDatum) {
        this.lcaAssessmentDatum = lcaAssessmentDatum;
        return this;
    }
    public java.util.List<EnterpriseLcaAssessmentItem> getLcaAssessmentDatum() {
        return this.lcaAssessmentDatum;
    }

}
