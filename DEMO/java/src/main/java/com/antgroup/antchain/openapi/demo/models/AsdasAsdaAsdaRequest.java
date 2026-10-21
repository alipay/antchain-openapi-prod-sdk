// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class AsdasAsdaAsdaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 11
    @NameInMap("aa")
    public String aa;

    public static AsdasAsdaAsdaRequest build(java.util.Map<String, ?> map) throws Exception {
        AsdasAsdaAsdaRequest self = new AsdasAsdaAsdaRequest();
        return TeaModel.build(map, self);
    }

    public AsdasAsdaAsdaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsdasAsdaAsdaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AsdasAsdaAsdaRequest setAa(String aa) {
        this.aa = aa;
        return this;
    }
    public String getAa() {
        return this.aa;
    }

}
