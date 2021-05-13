// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateUnionApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 协作联盟名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联盟描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static CreateUnionApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnionApplyRequest self = new CreateUnionApplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnionApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUnionApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUnionApplyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUnionApplyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
