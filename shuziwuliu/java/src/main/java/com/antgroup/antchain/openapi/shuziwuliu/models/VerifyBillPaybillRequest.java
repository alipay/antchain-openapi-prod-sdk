// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VerifyBillPaybillRequest extends TeaModel {
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

    // 应付资费项编号
    @NameInMap("pay_tariff_code")
    @Validation(required = true)
    public String payTariffCode;

    // 核销金额 业务必填
    @NameInMap("verify_amount")
    public String verifyAmount;

    // 核销应付资费项编号
    @NameInMap("verify_pay_tariff_code")
    @Validation(required = true, maxLength = 65555)
    public String verifyPayTariffCode;

    // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 
    // 业务必填
    @NameInMap("verify_status")
    public String verifyStatus;

    public static VerifyBillPaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBillPaybillRequest self = new VerifyBillPaybillRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBillPaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyBillPaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyBillPaybillRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public VerifyBillPaybillRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public VerifyBillPaybillRequest setPayTariffCode(String payTariffCode) {
        this.payTariffCode = payTariffCode;
        return this;
    }
    public String getPayTariffCode() {
        return this.payTariffCode;
    }

    public VerifyBillPaybillRequest setVerifyAmount(String verifyAmount) {
        this.verifyAmount = verifyAmount;
        return this;
    }
    public String getVerifyAmount() {
        return this.verifyAmount;
    }

    public VerifyBillPaybillRequest setVerifyPayTariffCode(String verifyPayTariffCode) {
        this.verifyPayTariffCode = verifyPayTariffCode;
        return this;
    }
    public String getVerifyPayTariffCode() {
        return this.verifyPayTariffCode;
    }

    public VerifyBillPaybillRequest setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

}
