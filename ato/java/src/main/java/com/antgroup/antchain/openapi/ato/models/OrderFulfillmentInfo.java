// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderFulfillmentInfo extends TeaModel {
    // 租期编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lease_term_index")
    public Long leaseTermIndex;

    // 租期归还状态
    /**
     * <strong>example:</strong>
     * <p>CANCEL</p>
     */
    @NameInMap("rental_return_state")
    public String rentalReturnState;

    // 实际还款金额(分)
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("real_repay_money")
    public Long realRepayMoney;

    // 租金(分)
    /**
     * <strong>example:</strong>
     * <p>273800</p>
     */
    @NameInMap("rental_money")
    public Long rentalMoney;

    // 每期实付时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-21 15:11:23.000 </p>
     */
    @NameInMap("return_time")
    public String returnTime;

    // 周期性代扣
    /**
     * <strong>example:</strong>
     * <p>ANTDIGITAL</p>
     */
    @NameInMap("return_way")
    public String returnWay;

    // 还款流水号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("return_voucher_serial")
    public String returnVoucherSerial;

    public static OrderFulfillmentInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderFulfillmentInfo self = new OrderFulfillmentInfo();
        return TeaModel.build(map, self);
    }

    public OrderFulfillmentInfo setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public OrderFulfillmentInfo setRentalReturnState(String rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public String getRentalReturnState() {
        return this.rentalReturnState;
    }

    public OrderFulfillmentInfo setRealRepayMoney(Long realRepayMoney) {
        this.realRepayMoney = realRepayMoney;
        return this;
    }
    public Long getRealRepayMoney() {
        return this.realRepayMoney;
    }

    public OrderFulfillmentInfo setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public OrderFulfillmentInfo setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public OrderFulfillmentInfo setReturnWay(String returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public String getReturnWay() {
        return this.returnWay;
    }

    public OrderFulfillmentInfo setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

}
