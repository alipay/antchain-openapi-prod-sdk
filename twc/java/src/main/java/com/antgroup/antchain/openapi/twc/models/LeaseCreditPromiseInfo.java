// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseCreditPromiseInfo extends TeaModel {
    // 租期index
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term")
    @Validation(required = true)
    public Long term;

    // 应还金额
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("pay_money")
    @Validation(required = true)
    public Long payMoney;

    // 应还款时间
    /**
     * <strong>example:</strong>
     * <p>2019-07-31 12:00:00</p>
     */
    @NameInMap("pay_date")
    @Validation(required = true)
    public String payDate;

    // 垫付日
    /**
     * <strong>example:</strong>
     * <p>2019-07-31 12:00:00</p>
     */
    @NameInMap("pay_in_advance_time")
    @Validation(required = true)
    public String payInAdvanceTime;

    // 垫付金额
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("pay_in_advance_money")
    @Validation(required = true)
    public Long payInAdvanceMoney;

    public static LeaseCreditPromiseInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseCreditPromiseInfo self = new LeaseCreditPromiseInfo();
        return TeaModel.build(map, self);
    }

    public LeaseCreditPromiseInfo setTerm(Long term) {
        this.term = term;
        return this;
    }
    public Long getTerm() {
        return this.term;
    }

    public LeaseCreditPromiseInfo setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public LeaseCreditPromiseInfo setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public LeaseCreditPromiseInfo setPayInAdvanceTime(String payInAdvanceTime) {
        this.payInAdvanceTime = payInAdvanceTime;
        return this;
    }
    public String getPayInAdvanceTime() {
        return this.payInAdvanceTime;
    }

    public LeaseCreditPromiseInfo setPayInAdvanceMoney(Long payInAdvanceMoney) {
        this.payInAdvanceMoney = payInAdvanceMoney;
        return this;
    }
    public Long getPayInAdvanceMoney() {
        return this.payInAdvanceMoney;
    }

}
