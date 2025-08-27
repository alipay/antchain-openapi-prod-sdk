// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantOrderFulfillmentInfo extends TeaModel {
    // 还款期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term_index")
    public Long termIndex;

    // 订单用户租期编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lease_term_index")
    public Long leaseTermIndex;

    // 租期归还状态
    /**
     * <strong>example:</strong>
     * <p>RETURN_FULL</p>
     */
    @NameInMap("rental_return_state")
    public String rentalReturnState;

    // 还款方式
    /**
     * <strong>example:</strong>
     * <p>DIVIDE</p>
     */
    @NameInMap("return_way")
    public String returnWay;

    // 支付类型
    /**
     * <strong>example:</strong>
     * <p>PERFORMANCE</p>
     */
    @NameInMap("pay_type")
    public String payType;

    // 实际到账金额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("total_money")
    public Long totalMoney;

    // 实际还款时间(yyyy-MM-dd HH:mm:ss)
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("return_time")
    public String returnTime;

    // 交易流水号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("return_voucher_serial")
    public String returnVoucherSerial;

    // 资方公司名称
    /**
     * <strong>example:</strong>
     * <p>xxx有限公司</p>
     */
    @NameInMap("fund_company_name")
    public String fundCompanyName;

    public static MerchantOrderFulfillmentInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantOrderFulfillmentInfo self = new MerchantOrderFulfillmentInfo();
        return TeaModel.build(map, self);
    }

    public MerchantOrderFulfillmentInfo setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public MerchantOrderFulfillmentInfo setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public MerchantOrderFulfillmentInfo setRentalReturnState(String rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public String getRentalReturnState() {
        return this.rentalReturnState;
    }

    public MerchantOrderFulfillmentInfo setReturnWay(String returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public String getReturnWay() {
        return this.returnWay;
    }

    public MerchantOrderFulfillmentInfo setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public MerchantOrderFulfillmentInfo setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }
    public Long getTotalMoney() {
        return this.totalMoney;
    }

    public MerchantOrderFulfillmentInfo setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public MerchantOrderFulfillmentInfo setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public MerchantOrderFulfillmentInfo setFundCompanyName(String fundCompanyName) {
        this.fundCompanyName = fundCompanyName;
        return this;
    }
    public String getFundCompanyName() {
        return this.fundCompanyName;
    }

}
