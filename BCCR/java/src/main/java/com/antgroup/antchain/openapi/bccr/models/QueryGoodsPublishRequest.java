// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryGoodsPublishRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布id
    @NameInMap("pubilsh_id")
    @Validation(required = true)
    public String pubilshId;

    public static QueryGoodsPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodsPublishRequest self = new QueryGoodsPublishRequest();
        return TeaModel.build(map, self);
    }

    public QueryGoodsPublishRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGoodsPublishRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGoodsPublishRequest setPubilshId(String pubilshId) {
        this.pubilshId = pubilshId;
        return this;
    }
    public String getPubilshId() {
        return this.pubilshId;
    }

}
