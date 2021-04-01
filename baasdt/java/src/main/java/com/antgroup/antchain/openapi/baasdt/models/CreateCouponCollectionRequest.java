// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateCouponCollectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 电子券前缀
    @NameInMap("coupon_number_prefix")
    @Validation(required = true)
    public String couponNumberPrefix;

    // 批次创建者
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 批次名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 是否创建时就记名
    @NameInMap("need_pre_registered")
    @Validation(required = true)
    public Boolean needPreRegistered;

    // 是否记名电子券
    @NameInMap("need_registered")
    @Validation(required = true)
    public Boolean needRegistered;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static CreateCouponCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponCollectionRequest self = new CreateCouponCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponCollectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCouponCollectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCouponCollectionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateCouponCollectionRequest setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public CreateCouponCollectionRequest setCouponNumberPrefix(String couponNumberPrefix) {
        this.couponNumberPrefix = couponNumberPrefix;
        return this;
    }
    public String getCouponNumberPrefix() {
        return this.couponNumberPrefix;
    }

    public CreateCouponCollectionRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public CreateCouponCollectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCouponCollectionRequest setNeedPreRegistered(Boolean needPreRegistered) {
        this.needPreRegistered = needPreRegistered;
        return this;
    }
    public Boolean getNeedPreRegistered() {
        return this.needPreRegistered;
    }

    public CreateCouponCollectionRequest setNeedRegistered(Boolean needRegistered) {
        this.needRegistered = needRegistered;
        return this;
    }
    public Boolean getNeedRegistered() {
        return this.needRegistered;
    }

    public CreateCouponCollectionRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
