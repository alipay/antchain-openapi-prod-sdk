// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewPaybillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应付账单号
    // 
    // 
    @NameInMap("pay_bill_order_code")
    @Validation(required = true)
    public String payBillOrderCode;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应付方did [业务必填]
    // 
    // 
    @NameInMap("settle_company_did")
    public String settleCompanyDid;

    // 收款方did [业务必填]
    // 
    // 
    @NameInMap("receipt_client_did")
    public String receiptClientDid;

    // 付款金额 [业务必填]
    // 
    // 
    @NameInMap("pay_amount")
    public String payAmount;

    // 申请时间 （秒时间戳） [业务必填]
    // 
    // 
    @NameInMap("apply_date")
    public Long applyDate;

    // 账单到期时间（秒时间戳） [业务必填]
    @NameInMap("expire_date")
    public Long expireDate;

    // 账单状态  SETTLED 已结算 UNSETTLE 未结算 (业务必填)
    @NameInMap("settle_status")
    public String settleStatus;

    // 应付资费项 (业务必填)
    @NameInMap("pay_tariff_list")
    public java.util.List<PayTariffInfo> payTariffList;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    public static SaveBiznewPaybillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewPaybillorderRequest self = new SaveBiznewPaybillorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewPaybillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewPaybillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewPaybillorderRequest setPayBillOrderCode(String payBillOrderCode) {
        this.payBillOrderCode = payBillOrderCode;
        return this;
    }
    public String getPayBillOrderCode() {
        return this.payBillOrderCode;
    }

    public SaveBiznewPaybillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewPaybillorderRequest setSettleCompanyDid(String settleCompanyDid) {
        this.settleCompanyDid = settleCompanyDid;
        return this;
    }
    public String getSettleCompanyDid() {
        return this.settleCompanyDid;
    }

    public SaveBiznewPaybillorderRequest setReceiptClientDid(String receiptClientDid) {
        this.receiptClientDid = receiptClientDid;
        return this;
    }
    public String getReceiptClientDid() {
        return this.receiptClientDid;
    }

    public SaveBiznewPaybillorderRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public SaveBiznewPaybillorderRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public SaveBiznewPaybillorderRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public SaveBiznewPaybillorderRequest setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

    public SaveBiznewPaybillorderRequest setPayTariffList(java.util.List<PayTariffInfo> payTariffList) {
        this.payTariffList = payTariffList;
        return this;
    }
    public java.util.List<PayTariffInfo> getPayTariffList() {
        return this.payTariffList;
    }

    public SaveBiznewPaybillorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
