// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCouponTimeoutRequest extends TeaModel {
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

    // 批次ID
    @NameInMap("collection_id")
    @Validation(required = true)
    public String collectionId;

    // 电子券ID
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static ExecCouponTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCouponTimeoutRequest self = new ExecCouponTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public ExecCouponTimeoutRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCouponTimeoutRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCouponTimeoutRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCouponTimeoutRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public ExecCouponTimeoutRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ExecCouponTimeoutRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
