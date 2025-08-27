// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FundMngLoanApplyResult extends TeaModel {
    // 放款状态
    /**
     * <strong>example:</strong>
     * <p>REJECTED_LOAN</p>
     */
    @NameInMap("loan_apply_status")
    public String loanApplyStatus;

    // 融资申请失败原因
    /**
     * <strong>example:</strong>
     * <p>xxx原因</p>
     */
    @NameInMap("loan_fail_reason")
    public String loanFailReason;

    public static FundMngLoanApplyResult build(java.util.Map<String, ?> map) throws Exception {
        FundMngLoanApplyResult self = new FundMngLoanApplyResult();
        return TeaModel.build(map, self);
    }

    public FundMngLoanApplyResult setLoanApplyStatus(String loanApplyStatus) {
        this.loanApplyStatus = loanApplyStatus;
        return this;
    }
    public String getLoanApplyStatus() {
        return this.loanApplyStatus;
    }

    public FundMngLoanApplyResult setLoanFailReason(String loanFailReason) {
        this.loanFailReason = loanFailReason;
        return this;
    }
    public String getLoanFailReason() {
        return this.loanFailReason;
    }

}
