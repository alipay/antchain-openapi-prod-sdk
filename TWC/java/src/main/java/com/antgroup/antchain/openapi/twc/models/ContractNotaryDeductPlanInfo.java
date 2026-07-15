// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductPlanInfo extends TeaModel {
    // PAYERIDNUMBER
    /**
     * <strong>example:</strong>
     * <p>付款方ID</p>
     */
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // “总金额：”+总金额“+”“总期数：”+总期数，“+”每期金额时间（X期金额，时间）
    /**
     * <strong>example:</strong>
     * <p>代扣计划说明</p>
     */
    @NameInMap("deduct_plan_info")
    @Validation(required = true)
    public String deductPlanInfo;

    // AGREEMEND_ID_NUMBER
    /**
     * <strong>example:</strong>
     * <p>代扣协议ID</p>
     */
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 代扣计划发起时间
    /**
     * <strong>example:</strong>
     * <p>1589198173000</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    public static ContractNotaryDeductPlanInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryDeductPlanInfo self = new ContractNotaryDeductPlanInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryDeductPlanInfo setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public ContractNotaryDeductPlanInfo setDeductPlanInfo(String deductPlanInfo) {
        this.deductPlanInfo = deductPlanInfo;
        return this;
    }
    public String getDeductPlanInfo() {
        return this.deductPlanInfo;
    }

    public ContractNotaryDeductPlanInfo setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public ContractNotaryDeductPlanInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
