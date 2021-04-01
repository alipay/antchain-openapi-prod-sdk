// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDataauthorizationDataModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据模型ID
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    public static DeleteDataauthorizationDataModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataauthorizationDataModelRequest self = new DeleteDataauthorizationDataModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataauthorizationDataModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDataauthorizationDataModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDataauthorizationDataModelRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
