// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceByperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外围设备Id数组
    @NameInMap("peripheral_id_list")
    @Validation(required = true)
    public java.util.List<String> peripheralIdList;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static GetDistributedeviceByperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceByperipheralidRequest self = new GetDistributedeviceByperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceByperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDistributedeviceByperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDistributedeviceByperipheralidRequest setPeripheralIdList(java.util.List<String> peripheralIdList) {
        this.peripheralIdList = peripheralIdList;
        return this;
    }
    public java.util.List<String> getPeripheralIdList() {
        return this.peripheralIdList;
    }

    public GetDistributedeviceByperipheralidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
