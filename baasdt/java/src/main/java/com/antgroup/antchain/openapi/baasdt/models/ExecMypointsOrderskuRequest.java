// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecMypointsOrderskuRequest extends TeaModel {
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

    // 环境标识
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 业务幂等号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 预下单号
    @NameInMap("pre_order_id")
    @Validation(required = true)
    public String preOrderId;

    // 商品ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static ExecMypointsOrderskuRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMypointsOrderskuRequest self = new ExecMypointsOrderskuRequest();
        return TeaModel.build(map, self);
    }

    public ExecMypointsOrderskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecMypointsOrderskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecMypointsOrderskuRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecMypointsOrderskuRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecMypointsOrderskuRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecMypointsOrderskuRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ExecMypointsOrderskuRequest setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }
    public String getPreOrderId() {
        return this.preOrderId;
    }

    public ExecMypointsOrderskuRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
