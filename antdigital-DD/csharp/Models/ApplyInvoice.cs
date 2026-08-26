// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 申请的发票信息
    public class ApplyInvoice : TeaModel {
        // 发票类型，01,增值税专用发票; * 02,增值税普通发票; * 04,国际形式发票; * 05,其它发票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>3244.98</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 发票行信息
        [NameInMap("apply_invoice_lines")]
        [Validation(Required=true)]
        public List<ApplyInvoiceLine> ApplyInvoiceLines { get; set; }

        // 销方信息
        [NameInMap("apply_invoice_seller")]
        [Validation(Required=true)]
        public ApplyInvoiceSeller ApplyInvoiceSeller { get; set; }

        // 购方信息
        [NameInMap("apply_invoice_buyer")]
        [Validation(Required=true)]
        public ApplyInvoiceBuyer ApplyInvoiceBuyer { get; set; }

        // 发票备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("invoice_note")]
        [Validation(Required=false)]
        public string InvoiceNote { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=false)]
        public string Ccy { get; set; }

        // 发票ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>334556666</para>
        /// </summary>
        [NameInMap("apply_invoice_id")]
        [Validation(Required=true)]
        public string ApplyInvoiceId { get; set; }

    }

}
