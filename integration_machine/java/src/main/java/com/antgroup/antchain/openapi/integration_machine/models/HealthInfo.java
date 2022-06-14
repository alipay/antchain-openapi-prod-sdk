// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class HealthInfo extends TeaModel {
    // 健康码编码：
    // 1:绿色 ，
    // 2:黄色 ，
    // 3:红色 ，
    // 4.灰码 。
    @NameInMap("health_code")
    public String healthCode;

    // 健康码红色原因
    @NameInMap("health_factor")
    public String healthFactor;

    public static HealthInfo build(java.util.Map<String, ?> map) throws Exception {
        HealthInfo self = new HealthInfo();
        return TeaModel.build(map, self);
    }

    public HealthInfo setHealthCode(String healthCode) {
        this.healthCode = healthCode;
        return this;
    }
    public String getHealthCode() {
        return this.healthCode;
    }

    public HealthInfo setHealthFactor(String healthFactor) {
        this.healthFactor = healthFactor;
        return this;
    }
    public String getHealthFactor() {
        return this.healthFactor;
    }

}
