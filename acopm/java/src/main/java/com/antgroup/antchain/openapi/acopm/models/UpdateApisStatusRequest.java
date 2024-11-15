// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateApisStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待更新的api数组
    @NameInMap("apis")
    @Validation(required = true)
    public java.util.List<String> apis;

    // 产品码，原字段废弃
    @NameInMap("new_product_code")
    @Validation(required = true)
    public String newProductCode;

    public static UpdateApisStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApisStatusRequest self = new UpdateApisStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApisStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApisStatusRequest setApis(java.util.List<String> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<String> getApis() {
        return this.apis;
    }

    public UpdateApisStatusRequest setNewProductCode(String newProductCode) {
        this.newProductCode = newProductCode;
        return this;
    }
    public String getNewProductCode() {
        return this.newProductCode;
    }

}
