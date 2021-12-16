// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryCommercialcoreProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static BatchqueryCommercialcoreProductRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCommercialcoreProductRequest self = new BatchqueryCommercialcoreProductRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryCommercialcoreProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
