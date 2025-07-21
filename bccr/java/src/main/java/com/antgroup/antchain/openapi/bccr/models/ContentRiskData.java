// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ContentRiskData extends TeaModel {
    // 风险名称
    /**
     * <strong>example:</strong>
     * <p>风险名称</p>
     */
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

    // 风险是否通过审查
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("risk_result")
    @Validation(required = true)
    public Boolean riskResult;

    public static ContentRiskData build(java.util.Map<String, ?> map) throws Exception {
        ContentRiskData self = new ContentRiskData();
        return TeaModel.build(map, self);
    }

    public ContentRiskData setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public ContentRiskData setRiskResult(Boolean riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public Boolean getRiskResult() {
        return this.riskResult;
    }

}
