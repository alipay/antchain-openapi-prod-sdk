// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class FixedDiscountCoupon extends TeaModel {
    // 【最高折扣金额】 最高折扣金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("discount_amount_max")
    @Validation(required = true)
    public Long discountAmountMax;

    // 【折扣百分比】 折扣百分比，例如88-八八折
    /**
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("discount_percent")
    @Validation(required = true)
    public Long discountPercent;

    // 【门槛】 使用券金额门槛，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("transaction_minimum")
    public Long transactionMinimum;

    public static FixedDiscountCoupon build(java.util.Map<String, ?> map) throws Exception {
        FixedDiscountCoupon self = new FixedDiscountCoupon();
        return TeaModel.build(map, self);
    }

    public FixedDiscountCoupon setDiscountAmountMax(Long discountAmountMax) {
        this.discountAmountMax = discountAmountMax;
        return this;
    }
    public Long getDiscountAmountMax() {
        return this.discountAmountMax;
    }

    public FixedDiscountCoupon setDiscountPercent(Long discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }
    public Long getDiscountPercent() {
        return this.discountPercent;
    }

    public FixedDiscountCoupon setTransactionMinimum(Long transactionMinimum) {
        this.transactionMinimum = transactionMinimum;
        return this;
    }
    public Long getTransactionMinimum() {
        return this.transactionMinimum;
    }

}
