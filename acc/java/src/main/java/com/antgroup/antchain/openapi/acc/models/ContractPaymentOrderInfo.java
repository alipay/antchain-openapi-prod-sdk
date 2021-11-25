// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractPaymentOrderInfo extends TeaModel {
    // 代扣触发时间，精确到毫秒 java.lang.System#currentTimeMillis()
    // 
    @NameInMap("pay_date")
    @Validation(required = true)
    public Long payDate;

    // 代扣金额，整数 精确到分
    // 
    @NameInMap("pay_money")
    @Validation(required = true)
    public Long payMoney;

    // 是否用户签署成功后立即触发第一期代扣
    // 
    @NameInMap("trigger_immediately")
    public Long triggerImmediately;

    public static ContractPaymentOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractPaymentOrderInfo self = new ContractPaymentOrderInfo();
        return TeaModel.build(map, self);
    }

    public ContractPaymentOrderInfo setPayDate(Long payDate) {
        this.payDate = payDate;
        return this;
    }
    public Long getPayDate() {
        return this.payDate;
    }

    public ContractPaymentOrderInfo setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public ContractPaymentOrderInfo setTriggerImmediately(Long triggerImmediately) {
        this.triggerImmediately = triggerImmediately;
        return this;
    }
    public Long getTriggerImmediately() {
        return this.triggerImmediately;
    }

}
