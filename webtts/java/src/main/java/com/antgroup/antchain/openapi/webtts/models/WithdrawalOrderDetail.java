// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class WithdrawalOrderDetail extends TeaModel {
    // withdrawalAmount
    /**
     * <strong>example:</strong>
     * <p>1.00</p>
     */
    @NameInMap("withdrawal_amount")
    @Validation(required = true)
    public String withdrawalAmount;

    public static WithdrawalOrderDetail build(java.util.Map<String, ?> map) throws Exception {
        WithdrawalOrderDetail self = new WithdrawalOrderDetail();
        return TeaModel.build(map, self);
    }

    public WithdrawalOrderDetail setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        return this;
    }
    public String getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

}
