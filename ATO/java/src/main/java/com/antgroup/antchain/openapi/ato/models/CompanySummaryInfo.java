// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CompanySummaryInfo extends TeaModel {
    // 社会统一信用代码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>xxx公司</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    public static CompanySummaryInfo build(java.util.Map<String, ?> map) throws Exception {
        CompanySummaryInfo self = new CompanySummaryInfo();
        return TeaModel.build(map, self);
    }

    public CompanySummaryInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CompanySummaryInfo setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

}
