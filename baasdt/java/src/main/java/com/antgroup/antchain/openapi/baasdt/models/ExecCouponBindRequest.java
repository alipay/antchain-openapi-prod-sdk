// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCouponBindRequest extends TeaModel {
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

    // 用户脱敏ID
    @NameInMap("desensitized_uid")
    public String desensitizedUid;

    // 绑定的持有者信息
    @NameInMap("holder_user_account")
    public String holderUserAccount;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 电子券公钥对应的私钥，对 couponId||outTxId 的签名
    @NameInMap("public_key_sign")
    @Validation(required = true)
    public String publicKeySign;

    // 用户公钥对应的私钥，对 outTxId 的签名
    @NameInMap("uid_public_key_sign")
    public String uidPublicKeySign;

    public static ExecCouponBindRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCouponBindRequest self = new ExecCouponBindRequest();
        return TeaModel.build(map, self);
    }

    public ExecCouponBindRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCouponBindRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCouponBindRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCouponBindRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public ExecCouponBindRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ExecCouponBindRequest setDesensitizedUid(String desensitizedUid) {
        this.desensitizedUid = desensitizedUid;
        return this;
    }
    public String getDesensitizedUid() {
        return this.desensitizedUid;
    }

    public ExecCouponBindRequest setHolderUserAccount(String holderUserAccount) {
        this.holderUserAccount = holderUserAccount;
        return this;
    }
    public String getHolderUserAccount() {
        return this.holderUserAccount;
    }

    public ExecCouponBindRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecCouponBindRequest setPublicKeySign(String publicKeySign) {
        this.publicKeySign = publicKeySign;
        return this;
    }
    public String getPublicKeySign() {
        return this.publicKeySign;
    }

    public ExecCouponBindRequest setUidPublicKeySign(String uidPublicKeySign) {
        this.uidPublicKeySign = uidPublicKeySign;
        return this;
    }
    public String getUidPublicKeySign() {
        return this.uidPublicKeySign;
    }

}
