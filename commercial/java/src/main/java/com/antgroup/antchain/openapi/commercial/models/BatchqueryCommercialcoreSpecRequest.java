// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    public static BatchqueryCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCommercialcoreSpecRequest self = new BatchqueryCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryCommercialcoreSpecRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
