// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AuthItagAntitagAcmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("userid")
    @Validation(required = true)
    public String userid;

    public static AuthItagAntitagAcmRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthItagAntitagAcmRequest self = new AuthItagAntitagAcmRequest();
        return TeaModel.build(map, self);
    }

    public AuthItagAntitagAcmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthItagAntitagAcmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthItagAntitagAcmRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

}
