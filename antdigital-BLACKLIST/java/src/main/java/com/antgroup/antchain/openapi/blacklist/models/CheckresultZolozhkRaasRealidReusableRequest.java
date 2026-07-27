// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class CheckresultZolozhkRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CheckresultZolozhkRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckresultZolozhkRaasRealidReusableRequest self = new CheckresultZolozhkRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public CheckresultZolozhkRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckresultZolozhkRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
