// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateThingmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物模型内容（多个物模型功能拼合的json）
    @NameInMap("thing_model")
    @Validation(required = true)
    public String thingModel;

    public static CreateThingmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThingmodelRequest self = new CreateThingmodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateThingmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateThingmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateThingmodelRequest setThingModel(String thingModel) {
        this.thingModel = thingModel;
        return this;
    }
    public String getThingModel() {
        return this.thingModel;
    }

}
