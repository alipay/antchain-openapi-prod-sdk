// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class CreateZolozsgRaasSharetokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CreateZolozsgRaasSharetokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateZolozsgRaasSharetokenRequest self = new CreateZolozsgRaasSharetokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateZolozsgRaasSharetokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateZolozsgRaasSharetokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
