// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class CheckresultZolozsgRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CheckresultZolozsgRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckresultZolozsgRaasRealidReusableRequest self = new CheckresultZolozsgRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public CheckresultZolozsgRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckresultZolozsgRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
