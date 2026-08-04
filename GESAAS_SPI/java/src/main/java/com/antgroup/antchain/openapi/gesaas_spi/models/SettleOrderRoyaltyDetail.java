// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class SettleOrderRoyaltyDetail extends TeaModel {
    // 分账金额，单位：分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 分账执行时间
    /**
     * <strong>example:</strong>
     * <p>2021-07-30 12:00:00</p>
     */
    @NameInMap("execute_time")
    @Validation(required = true)
    public String executeTime;

    // 分账转出账号
    /**
     * <strong>example:</strong>
     * <p>2088111111111111</p>
     */
    @NameInMap("trans_out_account")
    @Validation(required = true)
    public String transOutAccount;

    // 分账转入账号
    /**
     * <strong>example:</strong>
     * <p>2088111111111111</p>
     */
    @NameInMap("trans_in_account")
    @Validation(required = true)
    public String transInAccount;

    public static SettleOrderRoyaltyDetail build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderRoyaltyDetail self = new SettleOrderRoyaltyDetail();
        return TeaModel.build(map, self);
    }

    public SettleOrderRoyaltyDetail setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public SettleOrderRoyaltyDetail setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public String getExecuteTime() {
        return this.executeTime;
    }

    public SettleOrderRoyaltyDetail setTransOutAccount(String transOutAccount) {
        this.transOutAccount = transOutAccount;
        return this;
    }
    public String getTransOutAccount() {
        return this.transOutAccount;
    }

    public SettleOrderRoyaltyDetail setTransInAccount(String transInAccount) {
        this.transInAccount = transInAccount;
        return this;
    }
    public String getTransInAccount() {
        return this.transInAccount;
    }

}
