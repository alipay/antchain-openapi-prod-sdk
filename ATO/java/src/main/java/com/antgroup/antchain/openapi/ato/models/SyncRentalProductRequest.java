// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncRentalProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品信息
    @NameInMap("product_info")
    @Validation(required = true)
    public String productInfo;

    public static SyncRentalProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRentalProductRequest self = new SyncRentalProductRequest();
        return TeaModel.build(map, self);
    }

    public SyncRentalProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRentalProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRentalProductRequest setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

}
