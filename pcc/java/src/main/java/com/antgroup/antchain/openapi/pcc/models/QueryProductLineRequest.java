// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class QueryProductLineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 是否查询l3级产品
    @NameInMap("need_product")
    @Validation(required = true)
    public Boolean needProduct;

    // 是否查询l5
    @NameInMap("need_sku")
    @Validation(required = true)
    public Boolean needSku;

    public static QueryProductLineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductLineRequest self = new QueryProductLineRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductLineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProductLineRequest setNeedProduct(Boolean needProduct) {
        this.needProduct = needProduct;
        return this;
    }
    public Boolean getNeedProduct() {
        return this.needProduct;
    }

    public QueryProductLineRequest setNeedSku(Boolean needSku) {
        this.needSku = needSku;
        return this;
    }
    public Boolean getNeedSku() {
        return this.needSku;
    }

}
