// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class DisableBaasOdatsAclRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权关系id
    @NameInMap("acl_id")
    @Validation(required = true)
    public String aclId;

    public static DisableBaasOdatsAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableBaasOdatsAclRequest self = new DisableBaasOdatsAclRequest();
        return TeaModel.build(map, self);
    }

    public DisableBaasOdatsAclRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableBaasOdatsAclRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DisableBaasOdatsAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
