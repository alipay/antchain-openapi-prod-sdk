// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydevicemulRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，由蚂蚁侧定义
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备注册信息集合, 数组长度不超过50
    @NameInMap("device_param_list")
    @Validation(required = true)
    public java.util.List<RegByDeviceParm> deviceParamList;

    public static CreateDistributedeviceBydevicemulRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydevicemulRequest self = new CreateDistributedeviceBydevicemulRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydevicemulRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceBydevicemulRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceBydevicemulRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDistributedeviceBydevicemulRequest setDeviceParamList(java.util.List<RegByDeviceParm> deviceParamList) {
        this.deviceParamList = deviceParamList;
        return this;
    }
    public java.util.List<RegByDeviceParm> getDeviceParamList() {
        return this.deviceParamList;
    }

}
