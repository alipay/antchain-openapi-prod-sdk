// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewReceiptbillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应收账单号
    // 
    // 
    @NameInMap("receipt_bill_order_code")
    @Validation(required = true)
    public String receiptBillOrderCode;

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

    // 收款金额 [业务必填]
    // 
    // 
    @NameInMap("receipt_amount")
    public String receiptAmount;

    // 申请时间 (秒时间戳) [业务必填]
    @NameInMap("apply_date")
    public Long applyDate;

    // 账单到期日 (秒时间戳) [业务必填]
    // 
    // 
    @NameInMap("expire_date")
    public Long expireDate;

    // 账单状态  SETTLED 已结算 UNSETTLE 未结算  [业务必填]
    @NameInMap("settle_status")
    public String settleStatus;

    // 应收资费项 [业务必填]
    // 
    // 
    @NameInMap("receipt_tariff_list")
    public java.util.List<ReceiptTariffInfo> receiptTariffList;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    public static SaveBiznewReceiptbillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewReceiptbillorderRequest self = new SaveBiznewReceiptbillorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewReceiptbillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewReceiptbillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewReceiptbillorderRequest setReceiptBillOrderCode(String receiptBillOrderCode) {
        this.receiptBillOrderCode = receiptBillOrderCode;
        return this;
    }
    public String getReceiptBillOrderCode() {
        return this.receiptBillOrderCode;
    }

    public SaveBiznewReceiptbillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewReceiptbillorderRequest setSettleCompanyDid(String settleCompanyDid) {
        this.settleCompanyDid = settleCompanyDid;
        return this;
    }
    public String getSettleCompanyDid() {
        return this.settleCompanyDid;
    }

    public SaveBiznewReceiptbillorderRequest setReceiptClientDid(String receiptClientDid) {
        this.receiptClientDid = receiptClientDid;
        return this;
    }
    public String getReceiptClientDid() {
        return this.receiptClientDid;
    }

    public SaveBiznewReceiptbillorderRequest setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public SaveBiznewReceiptbillorderRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public SaveBiznewReceiptbillorderRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public SaveBiznewReceiptbillorderRequest setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

    public SaveBiznewReceiptbillorderRequest setReceiptTariffList(java.util.List<ReceiptTariffInfo> receiptTariffList) {
        this.receiptTariffList = receiptTariffList;
        return this;
    }
    public java.util.List<ReceiptTariffInfo> getReceiptTariffList() {
        return this.receiptTariffList;
    }

    public SaveBiznewReceiptbillorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
