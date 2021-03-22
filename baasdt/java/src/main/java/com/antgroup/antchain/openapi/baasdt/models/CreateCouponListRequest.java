// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateCouponListRequest extends TeaModel {
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

    // 电子券创建参数列表
    @NameInMap("coupons")
    @Validation(required = true)
    public java.util.List<CouponCreate> coupons;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static CreateCouponListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponListRequest self = new CreateCouponListRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCouponListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCouponListRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateCouponListRequest setCoupons(java.util.List<CouponCreate> coupons) {
        this.coupons = coupons;
        return this;
    }
    public java.util.List<CouponCreate> getCoupons() {
        return this.coupons;
    }

    public CreateCouponListRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
