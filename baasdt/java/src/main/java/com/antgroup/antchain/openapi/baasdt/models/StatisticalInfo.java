// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class StatisticalInfo extends TeaModel {
    // 可用于消费的信用Token等值金额(单位:元, 精确到小数点后12位)	
    @NameInMap("credit_token_balance")
    @Validation(required = true)
    public String creditTokenBalance;

    // 可用于消费的Token等值金额(单位:元, 精确到小数点后12位)
    @NameInMap("debit_token_balance")
    @Validation(required = true)
    public String debitTokenBalance;

    // 目前持有的他人Token的金额(单位:元, 精确到小数点后12位)
    @NameInMap("other_token_balance")
    @Validation(required = true)
    public String otherTokenBalance;

    // 已消费的累积金额(单位:元, 精确到小数点后12位)
    @NameInMap("used_token_balance")
    @Validation(required = true)
    public String usedTokenBalance;

    public static StatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
        StatisticalInfo self = new StatisticalInfo();
        return TeaModel.build(map, self);
    }

    public StatisticalInfo setCreditTokenBalance(String creditTokenBalance) {
        this.creditTokenBalance = creditTokenBalance;
        return this;
    }
    public String getCreditTokenBalance() {
        return this.creditTokenBalance;
    }

    public StatisticalInfo setDebitTokenBalance(String debitTokenBalance) {
        this.debitTokenBalance = debitTokenBalance;
        return this;
    }
    public String getDebitTokenBalance() {
        return this.debitTokenBalance;
    }

    public StatisticalInfo setOtherTokenBalance(String otherTokenBalance) {
        this.otherTokenBalance = otherTokenBalance;
        return this;
    }
    public String getOtherTokenBalance() {
        return this.otherTokenBalance;
    }

    public StatisticalInfo setUsedTokenBalance(String usedTokenBalance) {
        this.usedTokenBalance = usedTokenBalance;
        return this;
    }
    public String getUsedTokenBalance() {
        return this.usedTokenBalance;
    }

}
