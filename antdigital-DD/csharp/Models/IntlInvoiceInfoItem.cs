// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票行信息
    public class IntlInvoiceInfoItem : TeaModel {
        // 发票号
        /// <summary>
        /// <b>Example:</b>
        /// <para>34555</para>
        /// </summary>
        [NameInMap("invoice_no")]
        [Validation(Required=true)]
        public string InvoiceNo { get; set; }

        // 发票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>34.23</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 不含税金
        /// <summary>
        /// <b>Example:</b>
        /// <para>23.12</para>
        /// </summary>
        [NameInMap("excluding_tax_invoice_amt")]
        [Validation(Required=true)]
        public string ExcludingTaxInvoiceAmt { get; set; }

        // 税额
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.23</para>
        /// </summary>
        [NameInMap("tax_amt")]
        [Validation(Required=true)]
        public string TaxAmt { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.09</para>
        /// </summary>
        [NameInMap("tax")]
        [Validation(Required=true)]
        public string Tax { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发票ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20260716107315002131450000476631</para>
        /// </summary>
        [NameInMap("invoice_id")]
        [Validation(Required=true)]
        public string InvoiceId { get; set; }

    }

}
