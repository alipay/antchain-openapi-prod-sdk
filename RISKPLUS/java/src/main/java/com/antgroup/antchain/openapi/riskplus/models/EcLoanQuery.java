// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcLoanQuery extends TeaModel {
    // 总条数
    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public String totalCount;

    // 订单数组
    @NameInMap("loan_appls")
    @Validation(required = true)
    public java.util.List<EcLoanAppls> loanAppls;

    public static EcLoanQuery build(java.util.Map<String, ?> map) throws Exception {
        EcLoanQuery self = new EcLoanQuery();
        return TeaModel.build(map, self);
    }

    public EcLoanQuery setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public EcLoanQuery setLoanAppls(java.util.List<EcLoanAppls> loanAppls) {
        this.loanAppls = loanAppls;
        return this;
    }
    public java.util.List<EcLoanAppls> getLoanAppls() {
        return this.loanAppls;
    }

}
