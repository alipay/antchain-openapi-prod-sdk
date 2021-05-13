// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateUserDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟标识（联盟ID）
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 参与方的业务类型，如仓库WMS, 电商平台PSP，银行BANK
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CreateUserDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDidRequest self = new CreateUserDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUserDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUserDidRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CreateUserDidRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
