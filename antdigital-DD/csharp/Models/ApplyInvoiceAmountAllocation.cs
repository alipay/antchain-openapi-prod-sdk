// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票申请金额信息
    public class ApplyInvoiceAmountAllocation : TeaModel {
        // 额度汇总信息，标准可开票单据下，KEY为需要占用的单据号，VALUE为需要占用的额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("amount_summary_config")]
        [Validation(Required=false)]
        public List<AmountSummaryConfig> AmountSummaryConfig { get; set; }

        // 额度来源，默认INVOICE_RCPT
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVOICE_RCPT</para>
        /// </summary>
        [NameInMap("amount_source")]
        [Validation(Required=false)]
        public string AmountSource { get; set; }

        // 币种，默认156
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

    }

}
