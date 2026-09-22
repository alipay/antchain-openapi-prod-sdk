// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.idproofing.models;

import com.aliyun.tea.*;

public class SyncZolozidRaasIdproofingVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static SyncZolozidRaasIdproofingVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncZolozidRaasIdproofingVerifyRequest self = new SyncZolozidRaasIdproofingVerifyRequest();
        return TeaModel.build(map, self);
    }

    public SyncZolozidRaasIdproofingVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncZolozidRaasIdproofingVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
