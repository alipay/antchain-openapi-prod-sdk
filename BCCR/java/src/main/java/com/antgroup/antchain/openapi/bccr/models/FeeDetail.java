// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class FeeDetail extends TeaModel {
    // 费用描述
    /**
     * <strong>example:</strong>
     * <p>网页取证起步费用</p>
     */
    @NameInMap("fee_desc")
    @Validation(required = true)
    public String feeDesc;

    // 费用
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static FeeDetail build(java.util.Map<String, ?> map) throws Exception {
        FeeDetail self = new FeeDetail();
        return TeaModel.build(map, self);
    }

    public FeeDetail setFeeDesc(String feeDesc) {
        this.feeDesc = feeDesc;
        return this;
    }
    public String getFeeDesc() {
        return this.feeDesc;
    }

    public FeeDetail setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}
