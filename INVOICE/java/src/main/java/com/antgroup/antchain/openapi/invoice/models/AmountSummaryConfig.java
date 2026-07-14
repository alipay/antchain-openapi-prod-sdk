// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class AmountSummaryConfig extends TeaModel {
    // 汇总KEY
    /**
     * <strong>example:</strong>
     * <p>2334445</p>
     */
    @NameInMap("summary_key")
    @Validation(required = true)
    public String summaryKey;

    // 汇总金额，单位为元
    /**
     * <strong>example:</strong>
     * <p>230</p>
     */
    @NameInMap("summary_value")
    @Validation(required = true)
    public String summaryValue;

    public static AmountSummaryConfig build(java.util.Map<String, ?> map) throws Exception {
        AmountSummaryConfig self = new AmountSummaryConfig();
        return TeaModel.build(map, self);
    }

    public AmountSummaryConfig setSummaryKey(String summaryKey) {
        this.summaryKey = summaryKey;
        return this;
    }
    public String getSummaryKey() {
        return this.summaryKey;
    }

    public AmountSummaryConfig setSummaryValue(String summaryValue) {
        this.summaryValue = summaryValue;
        return this;
    }
    public String getSummaryValue() {
        return this.summaryValue;
    }

}
