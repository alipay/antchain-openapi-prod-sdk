// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDeviceDatamodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据模型Id
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    public static GetDeviceDatamodelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceDatamodelRequest self = new GetDeviceDatamodelRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceDatamodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDeviceDatamodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDeviceDatamodelRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
