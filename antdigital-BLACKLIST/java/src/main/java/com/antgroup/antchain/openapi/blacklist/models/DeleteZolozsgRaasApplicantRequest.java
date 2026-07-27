// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class DeleteZolozsgRaasApplicantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static DeleteZolozsgRaasApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteZolozsgRaasApplicantRequest self = new DeleteZolozsgRaasApplicantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteZolozsgRaasApplicantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteZolozsgRaasApplicantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
