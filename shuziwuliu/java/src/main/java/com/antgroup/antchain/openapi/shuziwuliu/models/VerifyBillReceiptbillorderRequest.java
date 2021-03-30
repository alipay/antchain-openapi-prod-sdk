// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VerifyBillReceiptbillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应收资费项编号
    @NameInMap("receipt_tariff_code")
    @Validation(required = true)
    public String receiptTariffCode;

    // 核销金额 业务必填
    @NameInMap("verify_amount")
    public String verifyAmount;

    // 核销应收资费项编号
    @NameInMap("verify_receipt_tariff_code")
    @Validation(required = true)
    public String verifyReceiptTariffCode;

    // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
    @NameInMap("verify_status")
    public String verifyStatus;

    public static VerifyBillReceiptbillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBillReceiptbillorderRequest self = new VerifyBillReceiptbillorderRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBillReceiptbillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyBillReceiptbillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyBillReceiptbillorderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public VerifyBillReceiptbillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public VerifyBillReceiptbillorderRequest setReceiptTariffCode(String receiptTariffCode) {
        this.receiptTariffCode = receiptTariffCode;
        return this;
    }
    public String getReceiptTariffCode() {
        return this.receiptTariffCode;
    }

    public VerifyBillReceiptbillorderRequest setVerifyAmount(String verifyAmount) {
        this.verifyAmount = verifyAmount;
        return this;
    }
    public String getVerifyAmount() {
        return this.verifyAmount;
    }

    public VerifyBillReceiptbillorderRequest setVerifyReceiptTariffCode(String verifyReceiptTariffCode) {
        this.verifyReceiptTariffCode = verifyReceiptTariffCode;
        return this;
    }
    public String getVerifyReceiptTariffCode() {
        return this.verifyReceiptTariffCode;
    }

    public VerifyBillReceiptbillorderRequest setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

}
