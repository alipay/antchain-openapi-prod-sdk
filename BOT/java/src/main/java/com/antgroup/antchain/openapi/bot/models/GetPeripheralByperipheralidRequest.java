// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetPeripheralByperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外围设备ID
    @NameInMap("peripheral_id")
    @Validation(required = true)
    public String peripheralId;

    // 场景码
    // 
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static GetPeripheralByperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPeripheralByperipheralidRequest self = new GetPeripheralByperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public GetPeripheralByperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetPeripheralByperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetPeripheralByperipheralidRequest setPeripheralId(String peripheralId) {
        this.peripheralId = peripheralId;
        return this;
    }
    public String getPeripheralId() {
        return this.peripheralId;
    }

    public GetPeripheralByperipheralidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
