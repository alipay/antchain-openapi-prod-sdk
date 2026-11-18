// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.facetemplate.models;

import com.aliyun.tea.*;

public class RenewZolozsgRaasFacetemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static RenewZolozsgRaasFacetemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewZolozsgRaasFacetemplateRequest self = new RenewZolozsgRaasFacetemplateRequest();
        return TeaModel.build(map, self);
    }

    public RenewZolozsgRaasFacetemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RenewZolozsgRaasFacetemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
