// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceBydeviceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备Id
    @NameInMap("device_id_list")
    @Validation(required = true)
    public java.util.List<String> deviceIdList;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static GetDistributedeviceBydeviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceBydeviceidRequest self = new GetDistributedeviceBydeviceidRequest();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceBydeviceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDistributedeviceBydeviceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDistributedeviceBydeviceidRequest setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public GetDistributedeviceBydeviceidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
