// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclPromiseDetailInfo extends TeaModel {
    // 承诺期数
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 承诺金额 单位分
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 本期还款状态
    // 已还款，PAID
    // 部分还款，PART_PAID
    // 未还款，UN_PAID
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 每期约定还款时间
    @NameInMap("promise_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String promiseTime;

    // 履约日期
    @NameInMap("pay_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payTime;

    public static BclPromiseDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        BclPromiseDetailInfo self = new BclPromiseDetailInfo();
        return TeaModel.build(map, self);
    }

    public BclPromiseDetailInfo setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public BclPromiseDetailInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public BclPromiseDetailInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BclPromiseDetailInfo setPromiseTime(String promiseTime) {
        this.promiseTime = promiseTime;
        return this;
    }
    public String getPromiseTime() {
        return this.promiseTime;
    }

    public BclPromiseDetailInfo setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

}
