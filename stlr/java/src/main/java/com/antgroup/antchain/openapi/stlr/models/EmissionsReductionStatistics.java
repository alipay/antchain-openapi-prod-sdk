// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsReductionStatistics extends TeaModel {
    // 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
    @NameInMap("reduction_type")
    @Validation(required = true)
    public String reductionType;

    // 减排措施名称
    @NameInMap("reduction_measure_name")
    @Validation(required = true)
    public String reductionMeasureName;

    // 减排方案编码
    @NameInMap("reduction_proposal_no")
    @Validation(required = true)
    public String reductionProposalNo;

    // 减排量
    @NameInMap("reduction_emissions")
    @Validation(required = true)
    public Long reductionEmissions;

    // 减排量单位
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static EmissionsReductionStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsReductionStatistics self = new EmissionsReductionStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsReductionStatistics setReductionType(String reductionType) {
        this.reductionType = reductionType;
        return this;
    }
    public String getReductionType() {
        return this.reductionType;
    }

    public EmissionsReductionStatistics setReductionMeasureName(String reductionMeasureName) {
        this.reductionMeasureName = reductionMeasureName;
        return this;
    }
    public String getReductionMeasureName() {
        return this.reductionMeasureName;
    }

    public EmissionsReductionStatistics setReductionProposalNo(String reductionProposalNo) {
        this.reductionProposalNo = reductionProposalNo;
        return this;
    }
    public String getReductionProposalNo() {
        return this.reductionProposalNo;
    }

    public EmissionsReductionStatistics setReductionEmissions(Long reductionEmissions) {
        this.reductionEmissions = reductionEmissions;
        return this;
    }
    public Long getReductionEmissions() {
        return this.reductionEmissions;
    }

    public EmissionsReductionStatistics setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
