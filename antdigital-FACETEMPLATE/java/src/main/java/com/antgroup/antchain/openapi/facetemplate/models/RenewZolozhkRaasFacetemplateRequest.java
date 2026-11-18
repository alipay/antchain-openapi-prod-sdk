// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.facetemplate.models;

import com.aliyun.tea.*;

public class RenewZolozhkRaasFacetemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static RenewZolozhkRaasFacetemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewZolozhkRaasFacetemplateRequest self = new RenewZolozhkRaasFacetemplateRequest();
        return TeaModel.build(map, self);
    }

    public RenewZolozhkRaasFacetemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RenewZolozhkRaasFacetemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
