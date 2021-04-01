// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionShopRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户在ISV中的标识
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 其他说明
    @NameInMap("info")
    public String info;

    // 商户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateDistributionShopRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionShopRequest self = new CreateDistributionShopRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionShopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionShopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionShopRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateDistributionShopRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public CreateDistributionShopRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
