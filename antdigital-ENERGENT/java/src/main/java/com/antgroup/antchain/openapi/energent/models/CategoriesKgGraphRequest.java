// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class CategoriesKgGraphRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    public static CategoriesKgGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        CategoriesKgGraphRequest self = new CategoriesKgGraphRequest();
        return TeaModel.build(map, self);
    }

    public CategoriesKgGraphRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CategoriesKgGraphRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CategoriesKgGraphRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

}
