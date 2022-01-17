// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApplyApimodelMgsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // modelDataSource指mgs平台  get模型返回的json字符串
    @NameInMap("model_list")
    @Validation(required = true)
    public java.util.List<String> modelList;

    public static ApplyApimodelMgsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyApimodelMgsRequest self = new ApplyApimodelMgsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyApimodelMgsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyApimodelMgsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyApimodelMgsRequest setModelList(java.util.List<String> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<String> getModelList() {
        return this.modelList;
    }

}
