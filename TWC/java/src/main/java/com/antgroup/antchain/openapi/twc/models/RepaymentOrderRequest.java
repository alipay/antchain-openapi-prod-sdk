// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RepaymentOrderRequest extends TeaModel {
    // 代扣触发时间，精确到毫秒
    // java.lang.System#currentTimeMillis()
    /**
     * <strong>example:</strong>
     * <p>12345600000</p>
     */
    @NameInMap("pay_date")
    @Validation(required = true)
    public Long payDate;

    // 代扣金额，整数 精确到分
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("pay_money")
    @Validation(required = true)
    public Long payMoney;

    // 是否用户签署成功后立即触发第一期代扣
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("trigger_immediately")
    public Long triggerImmediately;

    public static RepaymentOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RepaymentOrderRequest self = new RepaymentOrderRequest();
        return TeaModel.build(map, self);
    }

    public RepaymentOrderRequest setPayDate(Long payDate) {
        this.payDate = payDate;
        return this;
    }
    public Long getPayDate() {
        return this.payDate;
    }

    public RepaymentOrderRequest setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public RepaymentOrderRequest setTriggerImmediately(Long triggerImmediately) {
        this.triggerImmediately = triggerImmediately;
        return this;
    }
    public Long getTriggerImmediately() {
        return this.triggerImmediately;
    }

}
