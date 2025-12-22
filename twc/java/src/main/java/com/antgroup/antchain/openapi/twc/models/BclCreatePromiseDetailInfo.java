// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclCreatePromiseDetailInfo extends TeaModel {
    // 承诺期数，最小值：1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Validation(required = true, minimum = 1)
    public Long period;

    // 承诺金额，单位：分
    // 最小值：1，正整数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amount")
    @Validation(required = true, minimum = 1)
    public Long amount;

    // 每期应还的日期
    // 示例：格式 2023-06-27T10:50:23+08:00
    /**
     * <strong>example:</strong>
     * <p>2023-06-27T10:50:23+08:00</p>
     */
    @NameInMap("promise_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String promiseTime;

    public static BclCreatePromiseDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        BclCreatePromiseDetailInfo self = new BclCreatePromiseDetailInfo();
        return TeaModel.build(map, self);
    }

    public BclCreatePromiseDetailInfo setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public BclCreatePromiseDetailInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public BclCreatePromiseDetailInfo setPromiseTime(String promiseTime) {
        this.promiseTime = promiseTime;
        return this;
    }
    public String getPromiseTime() {
        return this.promiseTime;
    }

}
