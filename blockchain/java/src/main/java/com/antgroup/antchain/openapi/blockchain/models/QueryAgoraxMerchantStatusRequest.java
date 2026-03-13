// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxMerchantStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户编号
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    public static QueryAgoraxMerchantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxMerchantStatusRequest self = new QueryAgoraxMerchantStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxMerchantStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgoraxMerchantStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgoraxMerchantStatusRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
