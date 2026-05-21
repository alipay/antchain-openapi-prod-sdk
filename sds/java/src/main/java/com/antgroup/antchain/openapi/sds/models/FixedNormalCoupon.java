// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class FixedNormalCoupon extends TeaModel {
    // 【面额】 面额，单位：分。
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("coupon_amount")
    @Validation(required = true)
    public Long couponAmount;

    // 【门槛】 使用券金额门槛，单位：分。
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("transaction_minimum")
    @Validation(required = true)
    public Long transactionMinimum;

    public static FixedNormalCoupon build(java.util.Map<String, ?> map) throws Exception {
        FixedNormalCoupon self = new FixedNormalCoupon();
        return TeaModel.build(map, self);
    }

    public FixedNormalCoupon setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public Long getCouponAmount() {
        return this.couponAmount;
    }

    public FixedNormalCoupon setTransactionMinimum(Long transactionMinimum) {
        this.transactionMinimum = transactionMinimum;
        return this;
    }
    public Long getTransactionMinimum() {
        return this.transactionMinimum;
    }

}
