// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCouponActivateRequest extends TeaModel {
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

    // 电子券批次ID
    @NameInMap("collection_id")
    @Validation(required = true)
    public String collectionId;

    // 电子券激活码
    @NameInMap("coupon_code")
    @Validation(required = true)
    public String couponCode;

    // 激活码附加信息
    @NameInMap("coupon_ext_code")
    public String couponExtCode;

    // 电子券ID
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static ExecCouponActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCouponActivateRequest self = new ExecCouponActivateRequest();
        return TeaModel.build(map, self);
    }

    public ExecCouponActivateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCouponActivateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCouponActivateRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCouponActivateRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public ExecCouponActivateRequest setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }
    public String getCouponCode() {
        return this.couponCode;
    }

    public ExecCouponActivateRequest setCouponExtCode(String couponExtCode) {
        this.couponExtCode = couponExtCode;
        return this;
    }
    public String getCouponExtCode() {
        return this.couponExtCode;
    }

    public ExecCouponActivateRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ExecCouponActivateRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
