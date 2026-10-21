// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.idproofing.models;

import com.aliyun.tea.*;

public class VerifyZolozhkRaasIdentityAadhaarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozhkRaasIdentityAadhaarRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozhkRaasIdentityAadhaarRequest self = new VerifyZolozhkRaasIdentityAadhaarRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozhkRaasIdentityAadhaarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozhkRaasIdentityAadhaarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
