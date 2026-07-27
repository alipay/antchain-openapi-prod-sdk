// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarModuleversiontreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信物联唯一产品标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    public static QueryElectrocarModuleversiontreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarModuleversiontreeRequest self = new QueryElectrocarModuleversiontreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarModuleversiontreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarModuleversiontreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarModuleversiontreeRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

}
