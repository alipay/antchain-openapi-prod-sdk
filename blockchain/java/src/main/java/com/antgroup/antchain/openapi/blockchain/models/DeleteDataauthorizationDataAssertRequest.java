// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDataauthorizationDataAssertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据资产ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static DeleteDataauthorizationDataAssertRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataauthorizationDataAssertRequest self = new DeleteDataauthorizationDataAssertRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataauthorizationDataAssertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDataauthorizationDataAssertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDataauthorizationDataAssertRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
