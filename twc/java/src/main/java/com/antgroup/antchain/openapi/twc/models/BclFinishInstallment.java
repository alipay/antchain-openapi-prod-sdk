// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclFinishInstallment extends TeaModel {
    // 期次号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term_no")
    @Validation(required = true)
    public Long termNo;

    public static BclFinishInstallment build(java.util.Map<String, ?> map) throws Exception {
        BclFinishInstallment self = new BclFinishInstallment();
        return TeaModel.build(map, self);
    }

    public BclFinishInstallment setTermNo(Long termNo) {
        this.termNo = termNo;
        return this;
    }
    public Long getTermNo() {
        return this.termNo;
    }

}
