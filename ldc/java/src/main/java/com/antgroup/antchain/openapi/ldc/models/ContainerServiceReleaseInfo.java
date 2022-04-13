// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceReleaseInfo extends TeaModel {
    // 发布单id
    @NameInMap("created_plan_id")
    public String createdPlanId;

    // 发布开始时间
    @NameInMap("latest_deployment_start_time")
    public String latestDeploymentStartTime;

    // 发布完成时间
    @NameInMap("latest_deployment_end_time")
    public String latestDeploymentEndTime;

    public static ContainerServiceReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceReleaseInfo self = new ContainerServiceReleaseInfo();
        return TeaModel.build(map, self);
    }

    public ContainerServiceReleaseInfo setCreatedPlanId(String createdPlanId) {
        this.createdPlanId = createdPlanId;
        return this;
    }
    public String getCreatedPlanId() {
        return this.createdPlanId;
    }

    public ContainerServiceReleaseInfo setLatestDeploymentStartTime(String latestDeploymentStartTime) {
        this.latestDeploymentStartTime = latestDeploymentStartTime;
        return this;
    }
    public String getLatestDeploymentStartTime() {
        return this.latestDeploymentStartTime;
    }

    public ContainerServiceReleaseInfo setLatestDeploymentEndTime(String latestDeploymentEndTime) {
        this.latestDeploymentEndTime = latestDeploymentEndTime;
        return this;
    }
    public String getLatestDeploymentEndTime() {
        return this.latestDeploymentEndTime;
    }

}
