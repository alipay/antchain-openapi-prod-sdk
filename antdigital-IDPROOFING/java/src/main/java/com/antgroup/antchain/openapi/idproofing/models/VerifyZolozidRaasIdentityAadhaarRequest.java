// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.idproofing.models;

import com.aliyun.tea.*;

public class VerifyZolozidRaasIdentityAadhaarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozidRaasIdentityAadhaarRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozidRaasIdentityAadhaarRequest self = new VerifyZolozidRaasIdentityAadhaarRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozidRaasIdentityAadhaarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozidRaasIdentityAadhaarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
