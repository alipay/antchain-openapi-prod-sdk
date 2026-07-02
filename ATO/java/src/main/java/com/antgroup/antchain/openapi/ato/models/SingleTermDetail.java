// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SingleTermDetail extends TeaModel {
    // 期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period_num")
    @Validation(required = true, minimum = 1)
    public Long periodNum;

    // 支付金额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pay_amount")
    @Validation(required = true, minimum = 1)
    public Long payAmount;

    public static SingleTermDetail build(java.util.Map<String, ?> map) throws Exception {
        SingleTermDetail self = new SingleTermDetail();
        return TeaModel.build(map, self);
    }

    public SingleTermDetail setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public SingleTermDetail setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

}
