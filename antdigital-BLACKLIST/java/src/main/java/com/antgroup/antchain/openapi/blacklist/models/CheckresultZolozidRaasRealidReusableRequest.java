// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class CheckresultZolozidRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CheckresultZolozidRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckresultZolozidRaasRealidReusableRequest self = new CheckresultZolozidRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public CheckresultZolozidRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckresultZolozidRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
