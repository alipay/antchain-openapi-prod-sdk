// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PlatformRepayTypeInfo extends TeaModel {
    // 1：等额本息
    // 2：等额本金
    // 3：按期付息到期还本（先息后本）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // {”1“，”2“}
    @NameInMap("periods")
    @Validation(required = true)
    public java.util.List<String> periods;

    public static PlatformRepayTypeInfo build(java.util.Map<String, ?> map) throws Exception {
        PlatformRepayTypeInfo self = new PlatformRepayTypeInfo();
        return TeaModel.build(map, self);
    }

    public PlatformRepayTypeInfo setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public PlatformRepayTypeInfo setPeriods(java.util.List<String> periods) {
        this.periods = periods;
        return this;
    }
    public java.util.List<String> getPeriods() {
        return this.periods;
    }

}
