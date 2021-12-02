// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDeviceDatamodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据模型
    @NameInMap("data_model")
    @Validation(required = true)
    public String dataModel;

    // 数据模型名称
    @NameInMap("data_model_name")
    public String dataModelName;

    // 数据模型类别
    @NameInMap("biz_type")
    public String bizType;

    public static CreateDeviceDatamodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDatamodelRequest self = new CreateDeviceDatamodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDatamodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDeviceDatamodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDeviceDatamodelRequest setDataModel(String dataModel) {
        this.dataModel = dataModel;
        return this;
    }
    public String getDataModel() {
        return this.dataModel;
    }

    public CreateDeviceDatamodelRequest setDataModelName(String dataModelName) {
        this.dataModelName = dataModelName;
        return this;
    }
    public String getDataModelName() {
        return this.dataModelName;
    }

    public CreateDeviceDatamodelRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
