// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundOrderfulfillmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String merchantTenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 租期编号
    @NameInMap("lease_term_index")
    @Validation(required = true)
    public Long leaseTermIndex;

    // 租金归还状态，
    // 1.足额归还
    // 2.部分归还
    // 3.未归还，
    // 4退租,
    // 5该订单整个生命周期已完结
    @NameInMap("rental_return_state")
    @Validation(required = true)
    public Long rentalReturnState;

    // 租金归还金额,精确到分，即1234表示12.34元
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 归还时间，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time")
    @Validation(required = true)
    public String returnTime;

    // 归还方式，
    // 1.预授权代扣
    // 2.支付宝代扣
    // 3.主动还款
    // 4.其他
    // 5.网商直付通
    // 6.网商委托代扣
    @NameInMap("return_way")
    @Validation(required = true)
    public Long returnWay;

    // 还款凭证类型，
    // 1.支付宝
    // 2.平台代收（客户主动还款）
    // 3.其他
    // 6.网商银行
    @NameInMap("return_voucher_type")
    @Validation(required = true)
    public Long returnVoucherType;

    // 还款凭证编号，不超过128字符，1.支付宝流水号
    @NameInMap("return_voucher_serial")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String returnVoucherSerial;

    // 手续费，如通过预授权、代扣的方式规划，必填，单位为分
    // 1234代表12.34元
    @NameInMap("charge")
    @Validation(required = true)
    public Long charge;

    // 剩余归还期数
    @NameInMap("remain_term")
    @Validation(required = true)
    public Long remainTerm;

    public static SyncAntchainAtoFundOrderfulfillmentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundOrderfulfillmentRequest self = new SyncAntchainAtoFundOrderfulfillmentRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setRentalReturnState(Long rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public Long getRentalReturnState() {
        return this.rentalReturnState;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setReturnWay(Long returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public Long getReturnWay() {
        return this.returnWay;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setReturnVoucherType(Long returnVoucherType) {
        this.returnVoucherType = returnVoucherType;
        return this;
    }
    public Long getReturnVoucherType() {
        return this.returnVoucherType;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setCharge(Long charge) {
        this.charge = charge;
        return this;
    }
    public Long getCharge() {
        return this.charge;
    }

    public SyncAntchainAtoFundOrderfulfillmentRequest setRemainTerm(Long remainTerm) {
        this.remainTerm = remainTerm;
        return this;
    }
    public Long getRemainTerm() {
        return this.remainTerm;
    }

}
