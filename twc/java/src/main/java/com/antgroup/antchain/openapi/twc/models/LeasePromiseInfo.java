// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeasePromiseInfo extends TeaModel {
    // 租期index
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term")
    @Validation(required = true)
    public Long term;

    // 应还款金额
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

    public static LeasePromiseInfo build(java.util.Map<String, ?> map) throws Exception {
        LeasePromiseInfo self = new LeasePromiseInfo();
        return TeaModel.build(map, self);
    }

    public LeasePromiseInfo setTerm(Long term) {
        this.term = term;
        return this;
    }
    public Long getTerm() {
        return this.term;
    }

    public LeasePromiseInfo setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public LeasePromiseInfo setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

}
