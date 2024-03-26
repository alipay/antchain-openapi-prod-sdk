// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ApplyResourceFiletokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // Token类型
    @NameInMap("token_type")
    @Validation(required = true)
    public String tokenType;

    public static ApplyResourceFiletokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceFiletokenRequest self = new ApplyResourceFiletokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyResourceFiletokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyResourceFiletokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyResourceFiletokenRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
