// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AllCommercialcoreCatalogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllCommercialcoreCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        AllCommercialcoreCatalogRequest self = new AllCommercialcoreCatalogRequest();
        return TeaModel.build(map, self);
    }

    public AllCommercialcoreCatalogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
