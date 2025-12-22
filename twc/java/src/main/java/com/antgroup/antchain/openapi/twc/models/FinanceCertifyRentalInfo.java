// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinanceCertifyRentalInfo extends TeaModel {
    // 租期
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rent_term")
    @Validation(required = true)
    public Long rentTerm;

    // 本期扣款金额，123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 还款日期，格式为"2019-07-31 12:00:00"
    /**
     * <strong>example:</strong>
     * <p>2019-07-31 12:00:00</p>
     */
    @NameInMap("rental_return_time")
    @Validation(required = true)
    public String rentalReturnTime;

    public static FinanceCertifyRentalInfo build(java.util.Map<String, ?> map) throws Exception {
        FinanceCertifyRentalInfo self = new FinanceCertifyRentalInfo();
        return TeaModel.build(map, self);
    }

    public FinanceCertifyRentalInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public FinanceCertifyRentalInfo setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public FinanceCertifyRentalInfo setRentalReturnTime(String rentalReturnTime) {
        this.rentalReturnTime = rentalReturnTime;
        return this;
    }
    public String getRentalReturnTime() {
        return this.rentalReturnTime;
    }

}
