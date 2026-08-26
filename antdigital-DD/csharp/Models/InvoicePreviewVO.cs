// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票预览信息
    public class InvoicePreviewVO : TeaModel {
        // 发票号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>3344</para>
        /// </summary>
        [NameInMap("invoice_no")]
        [Validation(Required=false)]
        public string InvoiceNo { get; set; }

        // 发票代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>323422244555</para>
        /// </summary>
        [NameInMap("invoice_code")]
        [Validation(Required=false)]
        public string InvoiceCode { get; set; }

        // 开票时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-09-08</para>
        /// </summary>
        [NameInMap("invoice_date")]
        [Validation(Required=false)]
        public string InvoiceDate { get; set; }

        // 发票类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 开票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>34.98</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 税额
        /// <summary>
        /// <b>Example:</b>
        /// <para>34</para>
        /// </summary>
        [NameInMap("tax_amt")]
        [Validation(Required=true)]
        public string TaxAmt { get; set; }

        // 销方信息
        [NameInMap("invoice_seller")]
        [Validation(Required=true)]
        public ApplyInvoiceSeller InvoiceSeller { get; set; }

        // 购方信息
        [NameInMap("invoice_buyer")]
        [Validation(Required=true)]
        public ApplyInvoiceBuyer InvoiceBuyer { get; set; }

        // 发票票面备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("invoice_note")]
        [Validation(Required=false)]
        public string InvoiceNote { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 发票ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>355566677676</para>
        /// </summary>
        [NameInMap("invoice_id")]
        [Validation(Required=false)]
        public string InvoiceId { get; set; }

        // 发票介质
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_material")]
        [Validation(Required=true)]
        public string InvoiceMaterial { get; set; }

        // 申请原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>申请原因</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 发票行信息
        [NameInMap("invoice_lines")]
        [Validation(Required=true)]
        public List<InvoiceLineVO> InvoiceLines { get; set; }

        // 发票预览记录号
        /// <summary>
        /// <b>Example:</b>
        /// <para>3344</para>
        /// </summary>
        [NameInMap("invoice_preview_log_no")]
        [Validation(Required=true)]
        public string InvoicePreviewLogNo { get; set; }

    }

}
