// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeasePerformanceInfo extends TeaModel {
    // 支付租金总额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("rent_pay_total")
    @Validation(required = true)
    public String rentPayTotal;

    // 买断金额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("buyout_amount")
    public String buyoutAmount;

    // 租赁分期履约信息
    @NameInMap("rental_installment_performance")
    public java.util.List<RentalInstallmentPerformance> rentalInstallmentPerformance;

    public static LeasePerformanceInfo build(java.util.Map<String, ?> map) throws Exception {
        LeasePerformanceInfo self = new LeasePerformanceInfo();
        return TeaModel.build(map, self);
    }

    public LeasePerformanceInfo setRentPayTotal(String rentPayTotal) {
        this.rentPayTotal = rentPayTotal;
        return this;
    }
    public String getRentPayTotal() {
        return this.rentPayTotal;
    }

    public LeasePerformanceInfo setBuyoutAmount(String buyoutAmount) {
        this.buyoutAmount = buyoutAmount;
        return this;
    }
    public String getBuyoutAmount() {
        return this.buyoutAmount;
    }

    public LeasePerformanceInfo setRentalInstallmentPerformance(java.util.List<RentalInstallmentPerformance> rentalInstallmentPerformance) {
        this.rentalInstallmentPerformance = rentalInstallmentPerformance;
        return this;
    }
    public java.util.List<RentalInstallmentPerformance> getRentalInstallmentPerformance() {
        return this.rentalInstallmentPerformance;
    }

}
