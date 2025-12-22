// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RentalStagingInformation extends TeaModel {
    // 分期期数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("installments_number")
    @Validation(required = true)
    public Long installmentsNumber;

    // 租金每期应还款时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-31</p>
     */
    @NameInMap("payment_time_each_cycle")
    @Validation(required = true)
    public String paymentTimeEachCycle;

    // 租金每期应还款额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("payment_each_cycle")
    @Validation(required = true)
    public String paymentEachCycle;

    public static RentalStagingInformation build(java.util.Map<String, ?> map) throws Exception {
        RentalStagingInformation self = new RentalStagingInformation();
        return TeaModel.build(map, self);
    }

    public RentalStagingInformation setInstallmentsNumber(Long installmentsNumber) {
        this.installmentsNumber = installmentsNumber;
        return this;
    }
    public Long getInstallmentsNumber() {
        return this.installmentsNumber;
    }

    public RentalStagingInformation setPaymentTimeEachCycle(String paymentTimeEachCycle) {
        this.paymentTimeEachCycle = paymentTimeEachCycle;
        return this;
    }
    public String getPaymentTimeEachCycle() {
        return this.paymentTimeEachCycle;
    }

    public RentalStagingInformation setPaymentEachCycle(String paymentEachCycle) {
        this.paymentEachCycle = paymentEachCycle;
        return this;
    }
    public String getPaymentEachCycle() {
        return this.paymentEachCycle;
    }

}
