// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCertClaimurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证唯一id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static CreateAuthCertClaimurlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCertClaimurlRequest self = new CreateAuthCertClaimurlRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthCertClaimurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthCertClaimurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthCertClaimurlRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
