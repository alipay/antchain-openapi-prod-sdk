// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDevicecorpCustomerregisterresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDevicecorpCustomerregisterresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicecorpCustomerregisterresultRequest self = new QueryDevicecorpCustomerregisterresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicecorpCustomerregisterresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDevicecorpCustomerregisterresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
