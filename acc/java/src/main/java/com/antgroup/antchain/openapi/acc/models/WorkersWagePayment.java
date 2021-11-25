// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class WorkersWagePayment extends TeaModel {
    // 薪资年月
    @NameInMap("pay_y_m")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payYM;

    // 工资是否发放[已发放 未发放]
    @NameInMap("pay_wages")
    @Validation(required = true)
    public String payWages;

    public static WorkersWagePayment build(java.util.Map<String, ?> map) throws Exception {
        WorkersWagePayment self = new WorkersWagePayment();
        return TeaModel.build(map, self);
    }

    public WorkersWagePayment setPayYM(String payYM) {
        this.payYM = payYM;
        return this;
    }
    public String getPayYM() {
        return this.payYM;
    }

    public WorkersWagePayment setPayWages(String payWages) {
        this.payWages = payWages;
        return this;
    }
    public String getPayWages() {
        return this.payWages;
    }

}
