// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomReceiptStatus extends TeaModel {
    // 是否结清
    @NameInMap("receipt_flag")
    public Boolean receiptFlag;

    public static CustomReceiptStatus build(java.util.Map<String, ?> map) throws Exception {
        CustomReceiptStatus self = new CustomReceiptStatus();
        return TeaModel.build(map, self);
    }

    public CustomReceiptStatus setReceiptFlag(Boolean receiptFlag) {
        this.receiptFlag = receiptFlag;
        return this;
    }
    public Boolean getReceiptFlag() {
        return this.receiptFlag;
    }

}
