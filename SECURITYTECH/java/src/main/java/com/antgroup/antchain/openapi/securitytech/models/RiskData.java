// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RiskData extends TeaModel {
    // 模型/标签编号
    /**
     * <strong>example:</strong>
     * <p>·</p>
     */
    @NameInMap("result_key")
    @Validation(required = true)
    public String resultKey;

    // 模型分/标签值
    /**
     * <strong>example:</strong>
     * <p>·</p>
     */
    @NameInMap("result_value")
    @Validation(required = true)
    public String resultValue;

    public static RiskData build(java.util.Map<String, ?> map) throws Exception {
        RiskData self = new RiskData();
        return TeaModel.build(map, self);
    }

    public RiskData setResultKey(String resultKey) {
        this.resultKey = resultKey;
        return this;
    }
    public String getResultKey() {
        return this.resultKey;
    }

    public RiskData setResultValue(String resultValue) {
        this.resultValue = resultValue;
        return this;
    }
    public String getResultValue() {
        return this.resultValue;
    }

}
