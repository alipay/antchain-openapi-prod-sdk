// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialMediationBaseParamInfo extends TeaModel {
    // 委托调解时长(天), 仅支持:30,60,90
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("mediation_day_limit")
    @Validation(required = true)
    public Long mediationDayLimit;

    // 调解总标的金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("mediation_total_amount")
    @Validation(required = true)
    public String mediationTotalAmount;

    // 可接受最低调解回款金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("min_amount")
    @Validation(required = true)
    public String minAmount;

    public static JudicialMediationBaseParamInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialMediationBaseParamInfo self = new JudicialMediationBaseParamInfo();
        return TeaModel.build(map, self);
    }

    public JudicialMediationBaseParamInfo setMediationDayLimit(Long mediationDayLimit) {
        this.mediationDayLimit = mediationDayLimit;
        return this;
    }
    public Long getMediationDayLimit() {
        return this.mediationDayLimit;
    }

    public JudicialMediationBaseParamInfo setMediationTotalAmount(String mediationTotalAmount) {
        this.mediationTotalAmount = mediationTotalAmount;
        return this;
    }
    public String getMediationTotalAmount() {
        return this.mediationTotalAmount;
    }

    public JudicialMediationBaseParamInfo setMinAmount(String minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public String getMinAmount() {
        return this.minAmount;
    }

}
