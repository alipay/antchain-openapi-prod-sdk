// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.botsg.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydeviceidmulRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备注册信息集合
    @NameInMap("device_param_list")
    @Validation(required = true)
    public java.util.List<RegByDeviceIdParm> deviceParamList;

    public static CreateDistributedeviceBydeviceidmulRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydeviceidmulRequest self = new CreateDistributedeviceBydeviceidmulRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydeviceidmulRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceBydeviceidmulRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceBydeviceidmulRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDistributedeviceBydeviceidmulRequest setDeviceParamList(java.util.List<RegByDeviceIdParm> deviceParamList) {
        this.deviceParamList = deviceParamList;
        return this;
    }
    public java.util.List<RegByDeviceIdParm> getDeviceParamList() {
        return this.deviceParamList;
    }

}
