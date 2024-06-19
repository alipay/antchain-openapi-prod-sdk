// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendThingDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 上报数据模型ID
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 物模型数据集合
    @NameInMap("thing_data_list")
    @Validation(required = true)
    public java.util.List<String> thingDataList;

    public static SendThingDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendThingDataRequest self = new SendThingDataRequest();
        return TeaModel.build(map, self);
    }

    public SendThingDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendThingDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendThingDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendThingDataRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public SendThingDataRequest setThingDataList(java.util.List<String> thingDataList) {
        this.thingDataList = thingDataList;
        return this;
    }
    public java.util.List<String> getThingDataList() {
        return this.thingDataList;
    }

}
