// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDataauthorizationDataEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static DeleteDataauthorizationDataEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataauthorizationDataEntityRequest self = new DeleteDataauthorizationDataEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataauthorizationDataEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDataauthorizationDataEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDataauthorizationDataEntityRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
