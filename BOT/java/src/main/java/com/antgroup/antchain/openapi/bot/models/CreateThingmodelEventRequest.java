// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateThingmodelEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物模型事件json
    @NameInMap("thing_model_event_json")
    @Validation(required = true)
    public String thingModelEventJson;

    // 数据样例
    @NameInMap("data_demo")
    public String dataDemo;

    public static CreateThingmodelEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThingmodelEventRequest self = new CreateThingmodelEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateThingmodelEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateThingmodelEventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateThingmodelEventRequest setThingModelEventJson(String thingModelEventJson) {
        this.thingModelEventJson = thingModelEventJson;
        return this;
    }
    public String getThingModelEventJson() {
        return this.thingModelEventJson;
    }

    public CreateThingmodelEventRequest setDataDemo(String dataDemo) {
        this.dataDemo = dataDemo;
        return this;
    }
    public String getDataDemo() {
        return this.dataDemo;
    }

}
