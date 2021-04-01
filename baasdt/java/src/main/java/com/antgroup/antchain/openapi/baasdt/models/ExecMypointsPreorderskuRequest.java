// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecMypointsPreorderskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 环境标识
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 备注
    @NameInMap("memo")
    public String memo;

    // 业务幂等号，商户需要保证每笔订单号唯一
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 商品ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // 总花费花费(询价接口结果) 
    @NameInMap("total_cost")
    @Validation(required = true)
    public String totalCost;

    public static ExecMypointsPreorderskuRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMypointsPreorderskuRequest self = new ExecMypointsPreorderskuRequest();
        return TeaModel.build(map, self);
    }

    public ExecMypointsPreorderskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecMypointsPreorderskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecMypointsPreorderskuRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecMypointsPreorderskuRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ExecMypointsPreorderskuRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecMypointsPreorderskuRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ExecMypointsPreorderskuRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecMypointsPreorderskuRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public ExecMypointsPreorderskuRequest setTotalCost(String totalCost) {
        this.totalCost = totalCost;
        return this;
    }
    public String getTotalCost() {
        return this.totalCost;
    }

}
