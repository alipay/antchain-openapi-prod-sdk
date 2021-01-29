// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DisasterInfo extends TeaModel {
    // 正常容灾状态
    @NameInMap("disaster_recovery_state")
    @Validation(required = true)
    public String disasterRecoveryState;

    // 同城灾备单元(组)
    @NameInMap("local_failover_target")
    @Validation(required = true)
    public String localFailoverTarget;

    // 压测容灾状态
    @NameInMap("press_disaster_recovery_state")
    @Validation(required = true)
    public String pressDisasterRecoveryState;

    // 异地灾备单元(组)
    @NameInMap("remote_failover_target")
    @Validation(required = true)
    public String remoteFailoverTarget;

    // 逻辑单元&部署单元名称
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 容灾类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DisasterInfo build(java.util.Map<String, ?> map) throws Exception {
        DisasterInfo self = new DisasterInfo();
        return TeaModel.build(map, self);
    }

    public DisasterInfo setDisasterRecoveryState(String disasterRecoveryState) {
        this.disasterRecoveryState = disasterRecoveryState;
        return this;
    }
    public String getDisasterRecoveryState() {
        return this.disasterRecoveryState;
    }

    public DisasterInfo setLocalFailoverTarget(String localFailoverTarget) {
        this.localFailoverTarget = localFailoverTarget;
        return this;
    }
    public String getLocalFailoverTarget() {
        return this.localFailoverTarget;
    }

    public DisasterInfo setPressDisasterRecoveryState(String pressDisasterRecoveryState) {
        this.pressDisasterRecoveryState = pressDisasterRecoveryState;
        return this;
    }
    public String getPressDisasterRecoveryState() {
        return this.pressDisasterRecoveryState;
    }

    public DisasterInfo setRemoteFailoverTarget(String remoteFailoverTarget) {
        this.remoteFailoverTarget = remoteFailoverTarget;
        return this;
    }
    public String getRemoteFailoverTarget() {
        return this.remoteFailoverTarget;
    }

    public DisasterInfo setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DisasterInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
