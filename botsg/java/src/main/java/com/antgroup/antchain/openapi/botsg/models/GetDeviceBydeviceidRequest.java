// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.botsg.models;

import com.aliyun.tea.*;

public class GetDeviceBydeviceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备id集合
    @NameInMap("device_id_list")
    @Validation(required = true)
    public java.util.List<String> deviceIdList;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static GetDeviceBydeviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBydeviceidRequest self = new GetDeviceBydeviceidRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBydeviceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDeviceBydeviceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDeviceBydeviceidRequest setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public GetDeviceBydeviceidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
