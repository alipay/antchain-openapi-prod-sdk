// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthCertInstancedataurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static GetAuthCertInstancedataurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCertInstancedataurlRequest self = new GetAuthCertInstancedataurlRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthCertInstancedataurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAuthCertInstancedataurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
