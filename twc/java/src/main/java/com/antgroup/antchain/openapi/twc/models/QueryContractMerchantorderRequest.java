// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请单id，通过twc.notary.contract.merchant.apply或者twc.notary.contract.merchantindirectzft.create接口返回的order_id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryContractMerchantorderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantorderRequest self = new QueryContractMerchantorderRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractMerchantorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractMerchantorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
