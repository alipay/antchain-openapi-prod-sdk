// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class FundItem extends TeaModel {
    // fund_type
    /**
     * <strong>example:</strong>
     * <p>PET</p>
     */
    @NameInMap("fund_type")
    @Validation(required = true)
    public String fundType;

    // available_amount
    /**
     * <strong>example:</strong>
     * <p>300.00</p>
     */
    @NameInMap("available_amount")
    @Validation(required = true)
    public String availableAmount;

    // frozen_amount
    /**
     * <strong>example:</strong>
     * <p>300.00</p>
     */
    @NameInMap("can_refund_amount")
    public String canRefundAmount;

    // frozen_amount
    /**
     * <strong>example:</strong>
     * <p>300.00</p>
     */
    @NameInMap("frozen_amount")
    @Validation(required = true)
    public String frozenAmount;

    public static FundItem build(java.util.Map<String, ?> map) throws Exception {
        FundItem self = new FundItem();
        return TeaModel.build(map, self);
    }

    public FundItem setFundType(String fundType) {
        this.fundType = fundType;
        return this;
    }
    public String getFundType() {
        return this.fundType;
    }

    public FundItem setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public FundItem setCanRefundAmount(String canRefundAmount) {
        this.canRefundAmount = canRefundAmount;
        return this;
    }
    public String getCanRefundAmount() {
        return this.canRefundAmount;
    }

    public FundItem setFrozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }
    public String getFrozenAmount() {
        return this.frozenAmount;
    }

}
