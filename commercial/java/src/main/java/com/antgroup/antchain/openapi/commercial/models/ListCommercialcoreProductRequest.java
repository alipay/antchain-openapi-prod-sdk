// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 类目id
    @NameInMap("catalog_id")
    @Validation(required = true)
    public Long catalogId;

    public static ListCommercialcoreProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreProductRequest self = new ListCommercialcoreProductRequest();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCommercialcoreProductRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

}
