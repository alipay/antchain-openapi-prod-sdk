// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmTarget extends TeaModel {
    // 告警对象标识:
    @NameInMap("target_identity")
    public String targetIdentity;

    // 告警对象类型
    @NameInMap("target_type")
    public String targetType;

    public static AlarmTarget build(java.util.Map<String, ?> map) throws Exception {
        AlarmTarget self = new AlarmTarget();
        return TeaModel.build(map, self);
    }

    public AlarmTarget setTargetIdentity(String targetIdentity) {
        this.targetIdentity = targetIdentity;
        return this;
    }
    public String getTargetIdentity() {
        return this.targetIdentity;
    }

    public AlarmTarget setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
