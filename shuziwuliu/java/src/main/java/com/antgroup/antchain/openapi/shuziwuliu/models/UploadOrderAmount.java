// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadOrderAmount extends TeaModel {
    // 币种
    /**
     * <strong>example:</strong>
     * <p>人民币</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 总金额
    /**
     * <strong>example:</strong>
     * <p>123.23</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static UploadOrderAmount build(java.util.Map<String, ?> map) throws Exception {
        UploadOrderAmount self = new UploadOrderAmount();
        return TeaModel.build(map, self);
    }

    public UploadOrderAmount setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UploadOrderAmount setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
