// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AppletRiskModel extends TeaModel {
    // 风险咨询事件ID
    @NameInMap("record_id")
    @Validation(required = true)
    public String recordId;

    // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
    @NameInMap("risk_rank")
    @Validation(required = true)
    public String riskRank;

    // 风险名称
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

    // 风险等级中文描述
    @NameInMap("risk_desc")
    @Validation(required = true)
    public String riskDesc;

    // 子风险结果列表
    @NameInMap("sub_risk_result_list")
    @Validation(required = true)
    public java.util.List<SubRentRiskItem> subRiskResultList;

    public static AppletRiskModel build(java.util.Map<String, ?> map) throws Exception {
        AppletRiskModel self = new AppletRiskModel();
        return TeaModel.build(map, self);
    }

    public AppletRiskModel setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public AppletRiskModel setRiskRank(String riskRank) {
        this.riskRank = riskRank;
        return this;
    }
    public String getRiskRank() {
        return this.riskRank;
    }

    public AppletRiskModel setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public AppletRiskModel setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

    public AppletRiskModel setSubRiskResultList(java.util.List<SubRentRiskItem> subRiskResultList) {
        this.subRiskResultList = subRiskResultList;
        return this;
    }
    public java.util.List<SubRentRiskItem> getSubRiskResultList() {
        return this.subRiskResultList;
    }

}
