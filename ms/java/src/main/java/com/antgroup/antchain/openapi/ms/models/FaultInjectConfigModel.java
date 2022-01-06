// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultInjectConfigModel extends TeaModel {
    // 故障百分比
    @NameInMap("fault_percent")
    public String faultPercent;

    // 故障错误码
    @NameInMap("code")
    public String code;

    // 故障延迟时间（ms）
    @NameInMap("fixed_delay")
    public String fixedDelay;

    public static FaultInjectConfigModel build(java.util.Map<String, ?> map) throws Exception {
        FaultInjectConfigModel self = new FaultInjectConfigModel();
        return TeaModel.build(map, self);
    }

    public FaultInjectConfigModel setFaultPercent(String faultPercent) {
        this.faultPercent = faultPercent;
        return this;
    }
    public String getFaultPercent() {
        return this.faultPercent;
    }

    public FaultInjectConfigModel setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaultInjectConfigModel setFixedDelay(String fixedDelay) {
        this.fixedDelay = fixedDelay;
        return this;
    }
    public String getFixedDelay() {
        return this.fixedDelay;
    }

}
