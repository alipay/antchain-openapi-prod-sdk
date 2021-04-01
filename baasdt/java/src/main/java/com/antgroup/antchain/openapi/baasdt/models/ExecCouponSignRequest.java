// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCouponSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 电子券ID
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 脱敏用户ID
    @NameInMap("desensitized_uid")
    @Validation(required = true)
    public String desensitizedUid;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 用户公钥
    @NameInMap("uid_public_key")
    @Validation(required = true)
    public String uidPublicKey;

    public static ExecCouponSignRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCouponSignRequest self = new ExecCouponSignRequest();
        return TeaModel.build(map, self);
    }

    public ExecCouponSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCouponSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCouponSignRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCouponSignRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public ExecCouponSignRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ExecCouponSignRequest setDesensitizedUid(String desensitizedUid) {
        this.desensitizedUid = desensitizedUid;
        return this;
    }
    public String getDesensitizedUid() {
        return this.desensitizedUid;
    }

    public ExecCouponSignRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecCouponSignRequest setUidPublicKey(String uidPublicKey) {
        this.uidPublicKey = uidPublicKey;
        return this;
    }
    public String getUidPublicKey() {
        return this.uidPublicKey;
    }

}
