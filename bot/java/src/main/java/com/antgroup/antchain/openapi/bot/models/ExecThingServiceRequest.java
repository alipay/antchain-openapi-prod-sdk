// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecThingServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 服务标识
    @NameInMap("identifier")
    @Validation(required = true)
    public String identifier;

    // 可信设备唯一ID
    @NameInMap("trustiot_entity_id")
    public Long trustiotEntityId;

    // 设备编号/资产ID
    @NameInMap("device_id")
    public String deviceId;

    // 物模型服务入参
    @NameInMap("input_data")
    @Validation(required = true)
    public String inputData;

    public static ExecThingServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecThingServiceRequest self = new ExecThingServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecThingServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecThingServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecThingServiceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecThingServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ExecThingServiceRequest setTrustiotEntityId(Long trustiotEntityId) {
        this.trustiotEntityId = trustiotEntityId;
        return this;
    }
    public Long getTrustiotEntityId() {
        return this.trustiotEntityId;
    }

    public ExecThingServiceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ExecThingServiceRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

}
