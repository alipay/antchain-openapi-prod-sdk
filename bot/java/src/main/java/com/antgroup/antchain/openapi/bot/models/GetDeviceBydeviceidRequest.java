// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDeviceBydeviceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备id列表（推荐使用该参数，deviceIdList不为空时，componentIdList不用填）
    @NameInMap("device_id_list")
    public java.util.List<String> deviceIdList;

    // 模组ID(IMEI/SN/MAC)列表，当没有设备id时，可以用该字段查询设备
    @NameInMap("component_id_list")
    public java.util.List<String> componentIdList;

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

    public GetDeviceBydeviceidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GetDeviceBydeviceidRequest setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public GetDeviceBydeviceidRequest setComponentIdList(java.util.List<String> componentIdList) {
        this.componentIdList = componentIdList;
        return this;
    }
    public java.util.List<String> getComponentIdList() {
        return this.componentIdList;
    }

}
