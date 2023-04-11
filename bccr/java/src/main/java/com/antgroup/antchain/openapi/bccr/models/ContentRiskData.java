// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ContentRiskData extends TeaModel {
    // 风险名称
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

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

}
