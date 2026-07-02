// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListDistributedeviceByperipheralsceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static ListDistributedeviceByperipheralsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedeviceByperipheralsceneRequest self = new ListDistributedeviceByperipheralsceneRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributedeviceByperipheralsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDistributedeviceByperipheralsceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDistributedeviceByperipheralsceneRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
