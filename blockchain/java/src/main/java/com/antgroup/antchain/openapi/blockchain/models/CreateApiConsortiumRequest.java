// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateApiConsortiumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 某某联盟的使用场景描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 联盟名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateApiConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiConsortiumRequest self = new CreateApiConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiConsortiumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApiConsortiumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateApiConsortiumRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiConsortiumRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
