// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class CreateZolozidRaasSharetokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CreateZolozidRaasSharetokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateZolozidRaasSharetokenRequest self = new CreateZolozidRaasSharetokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateZolozidRaasSharetokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateZolozidRaasSharetokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
