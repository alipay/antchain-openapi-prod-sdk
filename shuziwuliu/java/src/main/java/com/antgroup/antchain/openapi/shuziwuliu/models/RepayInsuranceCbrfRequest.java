// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class RepayInsuranceCbrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物流公司业务线的简称
    @NameInMap("business_id")
    @Validation(maxLength = 50)
    public String businessId;

    // 保司编码
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 16)
    public String insuranceCode;

    //  险种
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 2)
    public String productCode;

    // 客户的订单编号
    @NameInMap("related_order_no")
    @Validation(required = true, maxLength = 256)
    public String relatedOrderNo;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 50)
    public String policyNo;

    // 投保响应编码
    @NameInMap("insured_receipt_no")
    @Validation(required = true, maxLength = 40)
    public String insuredReceiptNo;

    // 2位ISO国家编码
    @NameInMap("dest_country")
    @Validation(required = true, maxLength = 256)
    public String destCountry;

    // 理赔时间
    @NameInMap("claim_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String claimTime;

    // 理赔金额，单位为元，依据实际情况计算的理赔金额，最多小数点后2位
    @NameInMap("claim_amount")
    @Validation(required = true, maxLength = 20)
    public String claimAmount;

    // 达到国内仓库时间
    @NameInMap("dwa_time")
    public String dwaTime;

    public static RepayInsuranceCbrfRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayInsuranceCbrfRequest self = new RepayInsuranceCbrfRequest();
        return TeaModel.build(map, self);
    }

    public RepayInsuranceCbrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayInsuranceCbrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayInsuranceCbrfRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public RepayInsuranceCbrfRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public RepayInsuranceCbrfRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RepayInsuranceCbrfRequest setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public RepayInsuranceCbrfRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public RepayInsuranceCbrfRequest setInsuredReceiptNo(String insuredReceiptNo) {
        this.insuredReceiptNo = insuredReceiptNo;
        return this;
    }
    public String getInsuredReceiptNo() {
        return this.insuredReceiptNo;
    }

    public RepayInsuranceCbrfRequest setDestCountry(String destCountry) {
        this.destCountry = destCountry;
        return this;
    }
    public String getDestCountry() {
        return this.destCountry;
    }

    public RepayInsuranceCbrfRequest setClaimTime(String claimTime) {
        this.claimTime = claimTime;
        return this;
    }
    public String getClaimTime() {
        return this.claimTime;
    }

    public RepayInsuranceCbrfRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public RepayInsuranceCbrfRequest setDwaTime(String dwaTime) {
        this.dwaTime = dwaTime;
        return this;
    }
    public String getDwaTime() {
        return this.dwaTime;
    }

}
