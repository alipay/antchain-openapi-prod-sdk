// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateAppsRecoveryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 000001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 发起方信息
    @NameInMap("recovery")
    @Validation(required = true)
    public RecoveryDTO recovery;

    // 数据源信息
    @NameInMap("recovery_ds_array")
    @Validation(required = true)
    public java.util.List<RecoveryDsDTO> recoveryDsArray;

    public static CreateAppsRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppsRecoveryRequest self = new CreateAppsRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppsRecoveryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppsRecoveryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppsRecoveryRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppsRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAppsRecoveryRequest setRecovery(RecoveryDTO recovery) {
        this.recovery = recovery;
        return this;
    }
    public RecoveryDTO getRecovery() {
        return this.recovery;
    }

    public CreateAppsRecoveryRequest setRecoveryDsArray(java.util.List<RecoveryDsDTO> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<RecoveryDsDTO> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

}
