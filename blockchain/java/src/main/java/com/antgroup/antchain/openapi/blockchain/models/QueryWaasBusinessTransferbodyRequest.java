// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryWaasBusinessTransferbodyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务合作方id
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 转账用户的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务转账id
    @NameInMap("business_order_id")
    @Validation(required = true)
    public String businessOrderId;

    public static QueryWaasBusinessTransferbodyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWaasBusinessTransferbodyRequest self = new QueryWaasBusinessTransferbodyRequest();
        return TeaModel.build(map, self);
    }

    public QueryWaasBusinessTransferbodyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWaasBusinessTransferbodyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWaasBusinessTransferbodyRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QueryWaasBusinessTransferbodyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryWaasBusinessTransferbodyRequest setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId;
        return this;
    }
    public String getBusinessOrderId() {
        return this.businessOrderId;
    }

}
