// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateAppsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1：同库模式，事务记录表在业务侧；
    // 2：异库模式。
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 分库分表规则
    @NameInMap("split_rule")
    public SplitRule splitRule;

    public static CreateAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppsRequest self = new CreateAppsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAppsRequest setSplitRule(SplitRule splitRule) {
        this.splitRule = splitRule;
        return this;
    }
    public SplitRule getSplitRule() {
        return this.splitRule;
    }

}
