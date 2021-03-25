// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchcreateCouponRequest extends TeaModel {
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

    // 电子券创建参数
    @NameInMap("coupon_info")
    @Validation(required = true)
    public CouponCreate couponInfo;

    // 一次性创建数量。最大每次创建100张
    @NameInMap("create_number")
    @Validation(required = true)
    public Long createNumber;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static BatchcreateCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateCouponRequest self = new BatchcreateCouponRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateCouponRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateCouponRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public BatchcreateCouponRequest setCouponInfo(CouponCreate couponInfo) {
        this.couponInfo = couponInfo;
        return this;
    }
    public CouponCreate getCouponInfo() {
        return this.couponInfo;
    }

    public BatchcreateCouponRequest setCreateNumber(Long createNumber) {
        this.createNumber = createNumber;
        return this;
    }
    public Long getCreateNumber() {
        return this.createNumber;
    }

    public BatchcreateCouponRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
