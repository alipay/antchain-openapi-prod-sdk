// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantindirectzftRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户入驻查询订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryContractMerchantindirectzftRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantindirectzftRequest self = new QueryContractMerchantindirectzftRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantindirectzftRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractMerchantindirectzftRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractMerchantindirectzftRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
