// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class TransferZolozsgRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static TransferZolozsgRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferZolozsgRaasRealidReusableRequest self = new TransferZolozsgRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public TransferZolozsgRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferZolozsgRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
