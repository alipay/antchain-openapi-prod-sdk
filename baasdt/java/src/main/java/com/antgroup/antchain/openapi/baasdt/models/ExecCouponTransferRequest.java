// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCouponTransferRequest extends TeaModel {
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

    // 原始持有用户公钥对应的私钥，对outBizId的签名
    @NameInMap("origin_uid_public_key_sign")
    @Validation(required = true)
    public String originUidPublicKeySign;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 要转让的目标用户脱敏ID
    @NameInMap("transfer_desensitized_uid")
    @Validation(required = true)
    public String transferDesensitizedUid;

    // 要转让的目标用户公钥
    @NameInMap("transfer_uid_public_key")
    @Validation(required = true)
    public String transferUidPublicKey;

    public static ExecCouponTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCouponTransferRequest self = new ExecCouponTransferRequest();
        return TeaModel.build(map, self);
    }

    public ExecCouponTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCouponTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCouponTransferRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCouponTransferRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public ExecCouponTransferRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ExecCouponTransferRequest setOriginUidPublicKeySign(String originUidPublicKeySign) {
        this.originUidPublicKeySign = originUidPublicKeySign;
        return this;
    }
    public String getOriginUidPublicKeySign() {
        return this.originUidPublicKeySign;
    }

    public ExecCouponTransferRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecCouponTransferRequest setTransferDesensitizedUid(String transferDesensitizedUid) {
        this.transferDesensitizedUid = transferDesensitizedUid;
        return this;
    }
    public String getTransferDesensitizedUid() {
        return this.transferDesensitizedUid;
    }

    public ExecCouponTransferRequest setTransferUidPublicKey(String transferUidPublicKey) {
        this.transferUidPublicKey = transferUidPublicKey;
        return this;
    }
    public String getTransferUidPublicKey() {
        return this.transferUidPublicKey;
    }

}
