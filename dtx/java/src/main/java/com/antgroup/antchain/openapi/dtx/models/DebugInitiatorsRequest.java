// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugInitiatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主事务记录表
    @NameInMap("activity_table_name")
    @Validation(required = true)
    public String activityTableName;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 数据源名称
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 记录id
    @NameInMap("recovery_id")
    @Validation(required = true)
    public Long recoveryId;

    public static DebugInitiatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugInitiatorsRequest self = new DebugInitiatorsRequest();
        return TeaModel.build(map, self);
    }

    public DebugInitiatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DebugInitiatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DebugInitiatorsRequest setActivityTableName(String activityTableName) {
        this.activityTableName = activityTableName;
        return this;
    }
    public String getActivityTableName() {
        return this.activityTableName;
    }

    public DebugInitiatorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DebugInitiatorsRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public DebugInitiatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugInitiatorsRequest setRecoveryId(Long recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public Long getRecoveryId() {
        return this.recoveryId;
    }

}
