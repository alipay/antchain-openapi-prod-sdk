// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class CreateapiExistingProductsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 计算值输入
    @NameInMap("exec_num")
    @Validation(required = true)
    public Long execNum;

    public static CreateapiExistingProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateapiExistingProductsRequest self = new CreateapiExistingProductsRequest();
        return TeaModel.build(map, self);
    }

    public CreateapiExistingProductsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateapiExistingProductsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateapiExistingProductsRequest setExecNum(Long execNum) {
        this.execNum = execNum;
        return this;
    }
    public Long getExecNum() {
        return this.execNum;
    }

}
