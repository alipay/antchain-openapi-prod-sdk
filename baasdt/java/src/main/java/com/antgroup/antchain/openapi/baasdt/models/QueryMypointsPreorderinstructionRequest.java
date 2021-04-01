// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsPreorderinstructionRequest extends TeaModel {
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

    // 业务幂等ID
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 商品ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static QueryMypointsPreorderinstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsPreorderinstructionRequest self = new QueryMypointsPreorderinstructionRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypointsPreorderinstructionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypointsPreorderinstructionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypointsPreorderinstructionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsPreorderinstructionRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryMypointsPreorderinstructionRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryMypointsPreorderinstructionRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
