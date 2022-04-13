// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeploymentStrategy extends TeaModel {
    // Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    @NameInMap("rolling_update")
    public RollingUpdateDeployment rollingUpdate;

    // Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DeploymentStrategy build(java.util.Map<String, ?> map) throws Exception {
        DeploymentStrategy self = new DeploymentStrategy();
        return TeaModel.build(map, self);
    }

    public DeploymentStrategy setRollingUpdate(RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }
    public RollingUpdateDeployment getRollingUpdate() {
        return this.rollingUpdate;
    }

    public DeploymentStrategy setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
