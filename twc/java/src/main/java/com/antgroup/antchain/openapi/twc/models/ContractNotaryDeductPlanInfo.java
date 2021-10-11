// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductPlanInfo extends TeaModel {
    // PAYERIDNUMBER
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // “总金额：”+总金额“+”“总期数：”+总期数，“+”每期金额时间（X期金额，时间）
    @NameInMap("deduct_plan_info")
    @Validation(required = true)
    public String deductPlanInfo;

    // AGREEMEND_ID_NUMBER
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 代扣计划发起时间
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
