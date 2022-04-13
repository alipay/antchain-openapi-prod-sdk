// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeploymentCondition extends TeaModel {
    // Last time the condition transitioned from one status to another.
    @NameInMap("last_transition_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastTransitionTime;

    // The last time this condition was updated.
    // 
    @NameInMap("last_update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastUpdateTime;

    // A human readable message indicating details about the transition.
    // 
    @NameInMap("message")
    public String message;

    // The reason for the condition_s last transition.
    // 
    @NameInMap("reason")
    public String reason;

    // Status of the condition, one of True, False, Unknown.
    // 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // Type of deployment condition.
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DeploymentCondition build(java.util.Map<String, ?> map) throws Exception {
        DeploymentCondition self = new DeploymentCondition();
        return TeaModel.build(map, self);
    }

    public DeploymentCondition setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    public DeploymentCondition setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public DeploymentCondition setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeploymentCondition setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DeploymentCondition setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeploymentCondition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
