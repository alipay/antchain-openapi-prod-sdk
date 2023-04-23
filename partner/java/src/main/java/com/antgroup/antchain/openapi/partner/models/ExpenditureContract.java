// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureContract extends TeaModel {
    // 支出合同id
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 支出合同名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同状态：
    //     INIT("INIT","草稿", ""),
    //     VALID("VALID","正式", ""),
    //     INVALID("INVALID","作废", ""),
    //     AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
    //     AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
    //     AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 有效期开始时间
    @NameInMap("gmt_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtStart;

    // 有效期结束时间
    @NameInMap("gmt_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtEnd;

    // 签约记录
    @NameInMap("signing_record")
    public SignRecord signingRecord;

    // 支出结算规则
    @NameInMap("settlement_rule")
    public ExpenditureSettlementRule settlementRule;

    // 扩展信息
    @NameInMap("extend_info")
    public String extendInfo;

    public static ExpenditureContract build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureContract self = new ExpenditureContract();
        return TeaModel.build(map, self);
    }

    public ExpenditureContract setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public ExpenditureContract setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ExpenditureContract setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExpenditureContract setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public String getGmtStart() {
        return this.gmtStart;
    }

    public ExpenditureContract setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public ExpenditureContract setSigningRecord(SignRecord signingRecord) {
        this.signingRecord = signingRecord;
        return this;
    }
    public SignRecord getSigningRecord() {
        return this.signingRecord;
    }

    public ExpenditureContract setSettlementRule(ExpenditureSettlementRule settlementRule) {
        this.settlementRule = settlementRule;
        return this;
    }
    public ExpenditureSettlementRule getSettlementRule() {
        return this.settlementRule;
    }

    public ExpenditureContract setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
