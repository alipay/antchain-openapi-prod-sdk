// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SecurityData extends TeaModel {
    // 内容安全检查结果
    /**
     * <strong>example:</strong>
     * <p>safe,risky</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 有风险的内容
    @NameInMap("risk_data")
    public java.util.List<String> riskData;

    public static SecurityData build(java.util.Map<String, ?> map) throws Exception {
        SecurityData self = new SecurityData();
        return TeaModel.build(map, self);
    }

    public SecurityData setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SecurityData setRiskData(java.util.List<String> riskData) {
        this.riskData = riskData;
        return this;
    }
    public java.util.List<String> getRiskData() {
        return this.riskData;
    }

}
