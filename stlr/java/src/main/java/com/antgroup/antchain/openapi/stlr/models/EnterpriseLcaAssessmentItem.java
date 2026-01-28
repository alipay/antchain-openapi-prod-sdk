// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseLcaAssessmentItem extends TeaModel {
    // 物料编码
    /**
     * <strong>example:</strong>
     * <p>0601020000</p>
     */
    @NameInMap("material_code")
    @Validation(required = true)
    public String materialCode;

    // 数据明细名称
    /**
     * <strong>example:</strong>
     * <p>煤炭</p>
     */
    @NameInMap("assessment_item_name")
    @Validation(required = true)
    public String assessmentItemName;

    // 物料直接碳排放评估量
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("emission_amount")
    @Validation(required = true)
    public String emissionAmount;

    // 物料运输碳排放评估量
    /**
     * <strong>example:</strong>
     * <p>123.1</p>
     */
    @NameInMap("transport_emission_amount")
    @Validation(required = true)
    public String transportEmissionAmount;

    public static EnterpriseLcaAssessmentItem build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseLcaAssessmentItem self = new EnterpriseLcaAssessmentItem();
        return TeaModel.build(map, self);
    }

    public EnterpriseLcaAssessmentItem setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }
    public String getMaterialCode() {
        return this.materialCode;
    }

    public EnterpriseLcaAssessmentItem setAssessmentItemName(String assessmentItemName) {
        this.assessmentItemName = assessmentItemName;
        return this;
    }
    public String getAssessmentItemName() {
        return this.assessmentItemName;
    }

    public EnterpriseLcaAssessmentItem setEmissionAmount(String emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public String getEmissionAmount() {
        return this.emissionAmount;
    }

    public EnterpriseLcaAssessmentItem setTransportEmissionAmount(String transportEmissionAmount) {
        this.transportEmissionAmount = transportEmissionAmount;
        return this;
    }
    public String getTransportEmissionAmount() {
        return this.transportEmissionAmount;
    }

}
