// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class LcaCalcResult extends TeaModel {
    // 速算记录编号
    /**
     * <strong>example:</strong>
     * <p>0340340000000704</p>
     */
    @NameInMap("record_no")
    @Validation(required = true)
    public String recordNo;

    // 碳足迹排放量
    /**
     * <strong>example:</strong>
     * <p>123.12</p>
     */
    @NameInMap("carbon_amount")
    @Validation(required = true)
    public String carbonAmount;

    // 各阶段评估数据明细
    @NameInMap("lca_stage_assessment_datum")
    @Validation(required = true)
    public java.util.List<EnterpriseLcaStageAssessmentItem> lcaStageAssessmentDatum;

    // 速算发起时间
    /**
     * <strong>example:</strong>
     * <p>2024-05-01</p>
     */
    @NameInMap("record_date")
    @Validation(required = true)
    public String recordDate;

    // 自定义业务标识
    /**
     * <strong>example:</strong>
     * <p>bizNo001</p>
     */
    @NameInMap("custom_context")
    public String customContext;

    public static LcaCalcResult build(java.util.Map<String, ?> map) throws Exception {
        LcaCalcResult self = new LcaCalcResult();
        return TeaModel.build(map, self);
    }

    public LcaCalcResult setRecordNo(String recordNo) {
        this.recordNo = recordNo;
        return this;
    }
    public String getRecordNo() {
        return this.recordNo;
    }

    public LcaCalcResult setCarbonAmount(String carbonAmount) {
        this.carbonAmount = carbonAmount;
        return this;
    }
    public String getCarbonAmount() {
        return this.carbonAmount;
    }

    public LcaCalcResult setLcaStageAssessmentDatum(java.util.List<EnterpriseLcaStageAssessmentItem> lcaStageAssessmentDatum) {
        this.lcaStageAssessmentDatum = lcaStageAssessmentDatum;
        return this;
    }
    public java.util.List<EnterpriseLcaStageAssessmentItem> getLcaStageAssessmentDatum() {
        return this.lcaStageAssessmentDatum;
    }

    public LcaCalcResult setRecordDate(String recordDate) {
        this.recordDate = recordDate;
        return this;
    }
    public String getRecordDate() {
        return this.recordDate;
    }

    public LcaCalcResult setCustomContext(String customContext) {
        this.customContext = customContext;
        return this;
    }
    public String getCustomContext() {
        return this.customContext;
    }

}
