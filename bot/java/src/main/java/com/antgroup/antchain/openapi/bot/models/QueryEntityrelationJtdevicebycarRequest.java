// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryEntityrelationJtdevicebycarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车辆ID： 车辆车牌颜色+车牌号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 标识设别来源：分为SERVER(服务端)、JT808(部标机设备等)
    @NameInMap("from_type")
    public String fromType;

    public static QueryEntityrelationJtdevicebycarRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEntityrelationJtdevicebycarRequest self = new QueryEntityrelationJtdevicebycarRequest();
        return TeaModel.build(map, self);
    }

    public QueryEntityrelationJtdevicebycarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEntityrelationJtdevicebycarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEntityrelationJtdevicebycarRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryEntityrelationJtdevicebycarRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryEntityrelationJtdevicebycarRequest setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }
    public String getFromType() {
        return this.fromType;
    }

}
