// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsOrderinstructionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 环境标识
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 业务幂等号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // SKU ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static QueryMypointsOrderinstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsOrderinstructionRequest self = new QueryMypointsOrderinstructionRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypointsOrderinstructionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypointsOrderinstructionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypointsOrderinstructionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsOrderinstructionRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryMypointsOrderinstructionRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryMypointsOrderinstructionRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
