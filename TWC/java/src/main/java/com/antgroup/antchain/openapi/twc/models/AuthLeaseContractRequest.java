// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AuthLeaseContractRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资服务平台ID 长度不可超过50
    @NameInMap("credit_id")
    @Validation(required = true)
    public String creditId;

    public static AuthLeaseContractRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLeaseContractRequest self = new AuthLeaseContractRequest();
        return TeaModel.build(map, self);
    }

    public AuthLeaseContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthLeaseContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthLeaseContractRequest setCreditId(String creditId) {
        this.creditId = creditId;
        return this;
    }
    public String getCreditId() {
        return this.creditId;
    }

}
