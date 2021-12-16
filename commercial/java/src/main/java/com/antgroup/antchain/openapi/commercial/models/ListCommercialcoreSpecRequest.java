// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    public static ListCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreSpecRequest self = new ListCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCommercialcoreSpecRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
