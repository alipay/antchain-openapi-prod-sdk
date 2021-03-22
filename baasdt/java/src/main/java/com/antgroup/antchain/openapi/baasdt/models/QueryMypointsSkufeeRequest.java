// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsSkufeeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 预下单数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 环境标识(sandbox/prod)
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    // 业务幂等号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 商品ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static QueryMypointsSkufeeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsSkufeeRequest self = new QueryMypointsSkufeeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypointsSkufeeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypointsSkufeeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypointsSkufeeRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsSkufeeRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryMypointsSkufeeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryMypointsSkufeeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public QueryMypointsSkufeeRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryMypointsSkufeeRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
