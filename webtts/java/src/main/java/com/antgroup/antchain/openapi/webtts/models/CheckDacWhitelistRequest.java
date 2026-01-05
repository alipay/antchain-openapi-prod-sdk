// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class CheckDacWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公钥地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static CheckDacWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDacWhitelistRequest self = new CheckDacWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CheckDacWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckDacWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckDacWhitelistRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
