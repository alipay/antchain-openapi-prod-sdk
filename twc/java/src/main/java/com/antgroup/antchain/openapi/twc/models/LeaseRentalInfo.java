// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseRentalInfo extends TeaModel {
    // 租期编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term")
    @Validation(required = true)
    public Long term;

    // 租金归还状态，1.足额归还2.部分归还3.未归还
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rental_return_state")
    @Validation(required = true)
    public Long rentalReturnState;

    // 租金归还金额,精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 归还时间
    /**
     * <strong>example:</strong>
     * <p>2019-07-31 12:00:00</p>
     */
    @NameInMap("return_time")
    @Validation(required = true)
    public String returnTime;

    // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他，5网商直付通代扣
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("return_way")
    @Validation(required = true)
    public Long returnWay;

    // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("return_voucher_type")
    @Validation(required = true)
    public Long returnVoucherType;

    // 还款凭证编号，不超过128字符，支付宝流水号
    /**
     * <strong>example:</strong>
     * <p>20212312312313</p>
     */
    @NameInMap("return_voucher_serial")
    @Validation(required = true)
    public String returnVoucherSerial;

    // 剩余归还期数
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("remain_term")
    @Validation(required = true)
    public Long remainTerm;

    public static LeaseRentalInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseRentalInfo self = new LeaseRentalInfo();
        return TeaModel.build(map, self);
    }

    public LeaseRentalInfo setTerm(Long term) {
        this.term = term;
        return this;
    }
    public Long getTerm() {
        return this.term;
    }

    public LeaseRentalInfo setRentalReturnState(Long rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public Long getRentalReturnState() {
        return this.rentalReturnState;
    }

    public LeaseRentalInfo setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public LeaseRentalInfo setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public LeaseRentalInfo setReturnWay(Long returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public Long getReturnWay() {
        return this.returnWay;
    }

    public LeaseRentalInfo setReturnVoucherType(Long returnVoucherType) {
        this.returnVoucherType = returnVoucherType;
        return this;
    }
    public Long getReturnVoucherType() {
        return this.returnVoucherType;
    }

    public LeaseRentalInfo setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public LeaseRentalInfo setRemainTerm(Long remainTerm) {
        this.remainTerm = remainTerm;
        return this;
    }
    public Long getRemainTerm() {
        return this.remainTerm;
    }

}
