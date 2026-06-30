// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class EntrustGuaranteeProduct extends TeaModel {
    // 保障失效时间
    /**
     * <strong>example:</strong>
     * <p>1733711492119</p>
     */
    @NameInMap("guarantee_expiry_date")
    @Validation(required = true)
    public Long guaranteeExpiryDate;

    // 保障生效时间
    /**
     * <strong>example:</strong>
     * <p>1733711492119</p>
     */
    @NameInMap("guarantee_effective_date")
    @Validation(required = true)
    public Long guaranteeEffectiveDate;

    // 保险等待期结束时间
    /**
     * <strong>example:</strong>
     * <p>1733711492119</p>
     */
    @NameInMap("waiting_period_dead_line")
    public Long waitingPeriodDeadLine;

    // 保单号
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("policy_no")
    public String policyNo;

    // 平台定义产品码值
    /**
     * <strong>example:</strong>
     * <p>平台定义产品码值</p>
     */
    @NameInMap("guarantee_product_code")
    public String guaranteeProductCode;

    // 保险公司的产品code
    /**
     * <strong>example:</strong>
     * <p>保险公司的产品code</p>
     */
    @NameInMap("insurance_product_code")
    public String insuranceProductCode;

    // 保险公司的产品描述
    /**
     * <strong>example:</strong>
     * <p>保险公司的产品描述</p>
     */
    @NameInMap("insurance_product_name")
    public String insuranceProductName;

    public static EntrustGuaranteeProduct build(java.util.Map<String, ?> map) throws Exception {
        EntrustGuaranteeProduct self = new EntrustGuaranteeProduct();
        return TeaModel.build(map, self);
    }

    public EntrustGuaranteeProduct setGuaranteeExpiryDate(Long guaranteeExpiryDate) {
        this.guaranteeExpiryDate = guaranteeExpiryDate;
        return this;
    }
    public Long getGuaranteeExpiryDate() {
        return this.guaranteeExpiryDate;
    }

    public EntrustGuaranteeProduct setGuaranteeEffectiveDate(Long guaranteeEffectiveDate) {
        this.guaranteeEffectiveDate = guaranteeEffectiveDate;
        return this;
    }
    public Long getGuaranteeEffectiveDate() {
        return this.guaranteeEffectiveDate;
    }

    public EntrustGuaranteeProduct setWaitingPeriodDeadLine(Long waitingPeriodDeadLine) {
        this.waitingPeriodDeadLine = waitingPeriodDeadLine;
        return this;
    }
    public Long getWaitingPeriodDeadLine() {
        return this.waitingPeriodDeadLine;
    }

    public EntrustGuaranteeProduct setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public EntrustGuaranteeProduct setGuaranteeProductCode(String guaranteeProductCode) {
        this.guaranteeProductCode = guaranteeProductCode;
        return this;
    }
    public String getGuaranteeProductCode() {
        return this.guaranteeProductCode;
    }

    public EntrustGuaranteeProduct setInsuranceProductCode(String insuranceProductCode) {
        this.insuranceProductCode = insuranceProductCode;
        return this;
    }
    public String getInsuranceProductCode() {
        return this.insuranceProductCode;
    }

    public EntrustGuaranteeProduct setInsuranceProductName(String insuranceProductName) {
        this.insuranceProductName = insuranceProductName;
        return this;
    }
    public String getInsuranceProductName() {
        return this.insuranceProductName;
    }

}
