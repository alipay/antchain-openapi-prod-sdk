// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateAppsConfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起方配置
    @NameInMap("initiator")
    public Initiator initiator;

    // 参与者列表
    @NameInMap("participators")
    public java.util.List<Participator> participators;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用的描述
    @NameInMap("desc")
    public String desc;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 1：同库模式，事务记录表在业务侧； 2：异库模式。
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // 分表分表规则
    @NameInMap("sharding_rule")
    public SplitRule shardingRule;

    public static CreateAppsConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppsConfigsRequest self = new CreateAppsConfigsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppsConfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppsConfigsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppsConfigsRequest setInitiator(Initiator initiator) {
        this.initiator = initiator;
        return this;
    }
    public Initiator getInitiator() {
        return this.initiator;
    }

    public CreateAppsConfigsRequest setParticipators(java.util.List<Participator> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<Participator> getParticipators() {
        return this.participators;
    }

    public CreateAppsConfigsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppsConfigsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateAppsConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAppsConfigsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateAppsConfigsRequest setShardingRule(SplitRule shardingRule) {
        this.shardingRule = shardingRule;
        return this;
    }
    public SplitRule getShardingRule() {
        return this.shardingRule;
    }

}
