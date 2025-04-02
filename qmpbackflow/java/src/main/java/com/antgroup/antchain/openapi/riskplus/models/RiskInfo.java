// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskInfo extends TeaModel {
    // 反欺诈风险数据服务风险组描述
    @NameInMap("risk_group_desc")
    @Validation(required = true)
    public String riskGroupDesc;

    // 反欺诈风险数据服务风险组名
    @NameInMap("risk_group")
    @Validation(required = true)
    public String riskGroup;

    // 反欺诈风险数据服务风险组类别
    @NameInMap("risk_group_category")
    @Validation(required = true)
    public String riskGroupCategory;

    // 反欺诈风险数据服务风险组信息
    @NameInMap("risk_details")
    @Validation(required = true)
    public java.util.List<RiskDetail> riskDetails;

    public static RiskInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskInfo self = new RiskInfo();
        return TeaModel.build(map, self);
    }

    public RiskInfo setRiskGroupDesc(String riskGroupDesc) {
        this.riskGroupDesc = riskGroupDesc;
        return this;
    }
    public String getRiskGroupDesc() {
        return this.riskGroupDesc;
    }

    public RiskInfo setRiskGroup(String riskGroup) {
        this.riskGroup = riskGroup;
        return this;
    }
    public String getRiskGroup() {
        return this.riskGroup;
    }

    public RiskInfo setRiskGroupCategory(String riskGroupCategory) {
        this.riskGroupCategory = riskGroupCategory;
        return this;
    }
    public String getRiskGroupCategory() {
        return this.riskGroupCategory;
    }

    public RiskInfo setRiskDetails(java.util.List<RiskDetail> riskDetails) {
        this.riskDetails = riskDetails;
        return this;
    }
    public java.util.List<RiskDetail> getRiskDetails() {
        return this.riskDetails;
    }

}
