// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceAmountAllocation extends TeaModel {
    // 额度汇总信息，标准可开票单据下，KEY为需要占用的单据号，VALUE为需要占用的额度
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("amount_summary_config")
    public java.util.List<AmountSummaryConfig> amountSummaryConfig;

    // 额度来源，默认INVOICE_RCPT
    /**
     * <strong>example:</strong>
     * <p>INVOICE_RCPT</p>
     */
    @NameInMap("amount_source")
    public String amountSource;

    // 币种，默认156
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    public static ApplyInvoiceAmountAllocation build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceAmountAllocation self = new ApplyInvoiceAmountAllocation();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceAmountAllocation setAmountSummaryConfig(java.util.List<AmountSummaryConfig> amountSummaryConfig) {
        this.amountSummaryConfig = amountSummaryConfig;
        return this;
    }
    public java.util.List<AmountSummaryConfig> getAmountSummaryConfig() {
        return this.amountSummaryConfig;
    }

    public ApplyInvoiceAmountAllocation setAmountSource(String amountSource) {
        this.amountSource = amountSource;
        return this;
    }
    public String getAmountSource() {
        return this.amountSource;
    }

    public ApplyInvoiceAmountAllocation setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

}
