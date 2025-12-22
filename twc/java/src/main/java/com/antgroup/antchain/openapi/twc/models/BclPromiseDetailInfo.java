// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclPromiseDetailInfo extends TeaModel {
    // 承诺期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 承诺金额 单位分
    /**
     * <strong>example:</strong>
     * <p>12322</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 本期还款状态
    // 1.已还款：PAID 
    // 2.部分还款：PART_PAID 
    // 3.未还款：UN_PAID
    /**
     * <strong>example:</strong>
     * <p>UN_PAID</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 每期约定还款时间
    // 示例：2023-06-7T10:50:23+08:00
    /**
     * <strong>example:</strong>
     * <p>2023-06-7T10:50:23+08:00</p>
     */
    @NameInMap("promise_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String promiseTime;

    // 每期应还日期
    // 示例：2023-06-27T10:50:23+08:00
    /**
     * <strong>example:</strong>
     * <p>2023-06-27T10:50:23+08:00</p>
     */
    @NameInMap("pay_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payTime;

    // 归还方式
    // 1.租赁代扣： PROXY_WITHHOLDING
    // 2.主动还款：ACTIVE_REPAYMENT  
    // 3.网商委托代扣：MY_BANK_DIRECT_PAYMENT
    // 4.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
    /**
     * <strong>example:</strong>
     * <p>ACTIVE_REPAYMENT</p>
     */
    @NameInMap("way")
    @Validation(required = true, maxLength = 32)
    public String way;

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

    public BclPromiseDetailInfo setWay(String way) {
        this.way = way;
        return this;
    }
    public String getWay() {
        return this.way;
    }

}
