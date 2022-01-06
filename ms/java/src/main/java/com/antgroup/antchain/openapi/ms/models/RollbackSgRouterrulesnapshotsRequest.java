// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RollbackSgRouterrulesnapshotsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ConfigSnapshotModel
    @NameInMap("config_snapshot")
    @Validation(required = true)
    public String configSnapshot;

    // RouterRuleGroupModel
    @NameInMap("router_rule_group")
    @Validation(required = true)
    public String routerRuleGroup;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static RollbackSgRouterrulesnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSgRouterrulesnapshotsRequest self = new RollbackSgRouterrulesnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSgRouterrulesnapshotsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackSgRouterrulesnapshotsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RollbackSgRouterrulesnapshotsRequest setConfigSnapshot(String configSnapshot) {
        this.configSnapshot = configSnapshot;
        return this;
    }
    public String getConfigSnapshot() {
        return this.configSnapshot;
    }

    public RollbackSgRouterrulesnapshotsRequest setRouterRuleGroup(String routerRuleGroup) {
        this.routerRuleGroup = routerRuleGroup;
        return this;
    }
    public String getRouterRuleGroup() {
        return this.routerRuleGroup;
    }

    public RollbackSgRouterrulesnapshotsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
