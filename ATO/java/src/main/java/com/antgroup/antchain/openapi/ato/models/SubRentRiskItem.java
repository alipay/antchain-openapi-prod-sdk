// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubRentRiskItem extends TeaModel {
    // 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
    /**
     * <strong>example:</strong>
     * <p>BASE_PERFORMANCE</p>
     */
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

    // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。 
    /**
     * <strong>example:</strong>
     * <p>RANK0</p>
     */
    @NameInMap("risk_rank")
    @Validation(required = true)
    public String riskRank;

    // 风险描述
    /**
     * <strong>example:</strong>
     * <p>低风险</p>
     */
    @NameInMap("risk_desc")
    @Validation(required = true)
    public String riskDesc;

    public static SubRentRiskItem build(java.util.Map<String, ?> map) throws Exception {
        SubRentRiskItem self = new SubRentRiskItem();
        return TeaModel.build(map, self);
    }

    public SubRentRiskItem setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public SubRentRiskItem setRiskRank(String riskRank) {
        this.riskRank = riskRank;
        return this;
    }
    public String getRiskRank() {
        return this.riskRank;
    }

    public SubRentRiskItem setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

}
