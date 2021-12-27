// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OverdueInfoResponse extends TeaModel {
    // 逾期标识
    // true：逾期
    // false：未逾期
    @NameInMap("over_due_flag")
    @Validation(required = true)
    public Boolean overDueFlag;

    // 逾期天数
    @NameInMap("dpd")
    @Validation(required = true)
    public Long dpd;

    // 价值逾期天枢
    @NameInMap("cpd")
    @Validation(required = true)
    public Long cpd;

    // 应还总额
    @NameInMap("need_amount")
    @Validation(required = true)
    public Long needAmount;

    // 总剩余应还
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    public static OverdueInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        OverdueInfoResponse self = new OverdueInfoResponse();
        return TeaModel.build(map, self);
    }

    public OverdueInfoResponse setOverDueFlag(Boolean overDueFlag) {
        this.overDueFlag = overDueFlag;
        return this;
    }
    public Boolean getOverDueFlag() {
        return this.overDueFlag;
    }

    public OverdueInfoResponse setDpd(Long dpd) {
        this.dpd = dpd;
        return this;
    }
    public Long getDpd() {
        return this.dpd;
    }

    public OverdueInfoResponse setCpd(Long cpd) {
        this.cpd = cpd;
        return this;
    }
    public Long getCpd() {
        return this.cpd;
    }

    public OverdueInfoResponse setNeedAmount(Long needAmount) {
        this.needAmount = needAmount;
        return this;
    }
    public Long getNeedAmount() {
        return this.needAmount;
    }

    public OverdueInfoResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

}
