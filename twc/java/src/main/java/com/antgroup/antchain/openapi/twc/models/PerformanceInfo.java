// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PerformanceInfo extends TeaModel {
    // 支付租金总额
    @NameInMap("rent_pay_total")
    @Validation(required = true)
    public String rentPayTotal;

    // 买断金额
    @NameInMap("buyout_amount")
    @Validation(required = true)
    public String buyoutAmount;

    // 租赁分期履约信息
    @NameInMap("rental_installment_performance")
    @Validation(required = true)
    public java.util.List<RentalInstallmentPerformance> rentalInstallmentPerformance;

    public static PerformanceInfo build(java.util.Map<String, ?> map) throws Exception {
        PerformanceInfo self = new PerformanceInfo();
        return TeaModel.build(map, self);
    }

    public PerformanceInfo setRentPayTotal(String rentPayTotal) {
        this.rentPayTotal = rentPayTotal;
        return this;
    }
    public String getRentPayTotal() {
        return this.rentPayTotal;
    }

    public PerformanceInfo setBuyoutAmount(String buyoutAmount) {
        this.buyoutAmount = buyoutAmount;
        return this;
    }
    public String getBuyoutAmount() {
        return this.buyoutAmount;
    }

    public PerformanceInfo setRentalInstallmentPerformance(java.util.List<RentalInstallmentPerformance> rentalInstallmentPerformance) {
        this.rentalInstallmentPerformance = rentalInstallmentPerformance;
        return this;
    }
    public java.util.List<RentalInstallmentPerformance> getRentalInstallmentPerformance() {
        return this.rentalInstallmentPerformance;
    }

}
