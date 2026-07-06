// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class GrantBlockchainBotDeviceEmpowerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备ID 列表
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 授权操作: ACCEPTED(接受)/REVOKED(撤销)
    @NameInMap("auth_status")
    @Validation(required = true)
    public String authStatus;

    // 授权时间戳（毫秒）
    @NameInMap("auth_time")
    @Validation(required = true)
    public Long authTime;

    // 场景码   与科技所属人-统一社会信用代码 （technology_owner_id ）不能同时为空
    @NameInMap("scene")
    public String scene;

    // 科技所属人-统一社会信用代码  与场景码（scene ）不能同时为空
    @NameInMap("technology_owner_id")
    public String technologyOwnerId;

    // 科技所属人-公司名称
    @NameInMap("technology_owner_name")
    public String technologyOwnerName;

    public static GrantBlockchainBotDeviceEmpowerRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantBlockchainBotDeviceEmpowerRequest self = new GrantBlockchainBotDeviceEmpowerRequest();
        return TeaModel.build(map, self);
    }

    public GrantBlockchainBotDeviceEmpowerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setAuthTime(Long authTime) {
        this.authTime = authTime;
        return this;
    }
    public Long getAuthTime() {
        return this.authTime;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setTechnologyOwnerId(String technologyOwnerId) {
        this.technologyOwnerId = technologyOwnerId;
        return this;
    }
    public String getTechnologyOwnerId() {
        return this.technologyOwnerId;
    }

    public GrantBlockchainBotDeviceEmpowerRequest setTechnologyOwnerName(String technologyOwnerName) {
        this.technologyOwnerName = technologyOwnerName;
        return this;
    }
    public String getTechnologyOwnerName() {
        return this.technologyOwnerName;
    }

}
