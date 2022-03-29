// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqRouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前状态
    @NameInMap("current_status")
    @Validation(required = true)
    public Long currentStatus;

    // 路由任务描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 路由任务 ID
    @NameInMap("router_id")
    @Validation(required = true)
    public Long routerId;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 目标状态
    @NameInMap("target_status")
    @Validation(required = true)
    public Long targetStatus;

    public static UpdateSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqRouterRequest self = new UpdateSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqRouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqRouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqRouterRequest setCurrentStatus(Long currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }
    public Long getCurrentStatus() {
        return this.currentStatus;
    }

    public UpdateSofamqRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSofamqRouterRequest setRouterId(Long routerId) {
        this.routerId = routerId;
        return this;
    }
    public Long getRouterId() {
        return this.routerId;
    }

    public UpdateSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqRouterRequest setTargetStatus(Long targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }
    public Long getTargetStatus() {
        return this.targetStatus;
    }

}
