// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class RegisterNormalNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("info")
    @Validation(required = true)
    public NormalNodeIdentityInfo info;

    //  
    @NameInMap("extra")
    public String extra;

    public static RegisterNormalNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterNormalNodeRequest self = new RegisterNormalNodeRequest();
        return TeaModel.build(map, self);
    }

    public RegisterNormalNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterNormalNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterNormalNodeRequest setInfo(NormalNodeIdentityInfo info) {
        this.info = info;
        return this;
    }
    public NormalNodeIdentityInfo getInfo() {
        return this.info;
    }

    public RegisterNormalNodeRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
