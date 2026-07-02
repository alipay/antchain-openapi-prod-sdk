// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundOrderfulfillmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String merchantTenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String orderId;

    // 租期编号
    @NameInMap("lease_term_index")
    @Validation(required = true)
    public Long leaseTermIndex;

    // 剩余归还期数
    @NameInMap("remain_term")
    @Validation(required = true)
    public Long remainTerm;

    // 总期数
    @NameInMap("total_term")
    @Validation(required = true)
    public Long totalTerm;

    // 租金归还状态，
    // RETURN_FULL : 足额归还 【终态】
    // NOT_RETURN : 未归还
    // CANCEL : 取消 【终态】
    @NameInMap("rental_return_state")
    @Validation(required = true)
    public String rentalReturnState;

    // 租金归还金额,精确到分，即1234表示12.34元
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 罚息金额，分，1234表示12.34元
    @NameInMap("penalty_fee_money")
    @Validation(required = true)
    public Long penaltyFeeMoney;

    // 总金额，单位分
    @NameInMap("total_money")
    @Validation(required = true)
    public Long totalMoney;

    // 归还时间，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time")
    public String returnTime;

    // 归还方式，
    // ANTDIGITAL： 数科代扣
    // FUND : 资方代扣
    // BANK : 银行转账
    // WECHAT : 微信支付
    @NameInMap("return_way")
    public String returnWay;

    // 还款凭证编号
    @NameInMap("return_voucher_serial")
    @Validation(maxLength = 127, minLength = 1)
    public String returnVoucherSerial;

    // 银行名字
    @NameInMap("bank_name")
    @Validation(maxLength = 127)
    public String bankName;

    public static SyncFundOrderfulfillmentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundOrderfulfillmentRequest self = new SyncFundOrderfulfillmentRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundOrderfulfillmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundOrderfulfillmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundOrderfulfillmentRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncFundOrderfulfillmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundOrderfulfillmentRequest setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public SyncFundOrderfulfillmentRequest setRemainTerm(Long remainTerm) {
        this.remainTerm = remainTerm;
        return this;
    }
    public Long getRemainTerm() {
        return this.remainTerm;
    }

    public SyncFundOrderfulfillmentRequest setTotalTerm(Long totalTerm) {
        this.totalTerm = totalTerm;
        return this;
    }
    public Long getTotalTerm() {
        return this.totalTerm;
    }

    public SyncFundOrderfulfillmentRequest setRentalReturnState(String rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public String getRentalReturnState() {
        return this.rentalReturnState;
    }

    public SyncFundOrderfulfillmentRequest setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public SyncFundOrderfulfillmentRequest setPenaltyFeeMoney(Long penaltyFeeMoney) {
        this.penaltyFeeMoney = penaltyFeeMoney;
        return this;
    }
    public Long getPenaltyFeeMoney() {
        return this.penaltyFeeMoney;
    }

    public SyncFundOrderfulfillmentRequest setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }
    public Long getTotalMoney() {
        return this.totalMoney;
    }

    public SyncFundOrderfulfillmentRequest setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public SyncFundOrderfulfillmentRequest setReturnWay(String returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public String getReturnWay() {
        return this.returnWay;
    }

    public SyncFundOrderfulfillmentRequest setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public SyncFundOrderfulfillmentRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

}
