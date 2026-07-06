// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotDeviceEmpowerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码 场景码与科技所属人-统一社会信用代码（technology_owner_id）不能同时为空
    @NameInMap("scene")
    public String scene;

    // 科技所属人-统一社会信用代码  与场景码（scene）不能同时为空
    @NameInMap("technology_owner_id")
    public String technologyOwnerId;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    // 授权日期 yyyy-MM-dd 格式
    @NameInMap("query_date")
    @Validation(required = true)
    public String queryDate;

    public static QueryBlockchainBotDeviceEmpowerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotDeviceEmpowerRequest self = new QueryBlockchainBotDeviceEmpowerRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotDeviceEmpowerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotDeviceEmpowerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotDeviceEmpowerRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryBlockchainBotDeviceEmpowerRequest setTechnologyOwnerId(String technologyOwnerId) {
        this.technologyOwnerId = technologyOwnerId;
        return this;
    }
    public String getTechnologyOwnerId() {
        return this.technologyOwnerId;
    }

    public QueryBlockchainBotDeviceEmpowerRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryBlockchainBotDeviceEmpowerRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

}
