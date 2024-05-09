// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDevicecorpThingmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 新增的功能定义详情
    @NameInMap("thing_model_json")
    @Validation(required = true)
    public String thingModelJson;

    public static CreateDevicecorpThingmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicecorpThingmodelRequest self = new CreateDevicecorpThingmodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicecorpThingmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDevicecorpThingmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDevicecorpThingmodelRequest setThingModelJson(String thingModelJson) {
        this.thingModelJson = thingModelJson;
        return this;
    }
    public String getThingModelJson() {
        return this.thingModelJson;
    }

}
