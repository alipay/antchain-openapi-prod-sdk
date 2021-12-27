// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyDubbridgeCustomerBankcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyDubbridgeCustomerBankcardRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDubbridgeCustomerBankcardRequest self = new VerifyDubbridgeCustomerBankcardRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDubbridgeCustomerBankcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDubbridgeCustomerBankcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
