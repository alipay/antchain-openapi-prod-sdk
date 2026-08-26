// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 申请记录
    public class IntlInvoiceApplyInfoItem : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20882838383</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 发票申请ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>29394</para>
        /// </summary>
        [NameInMap("invoice_apply_id")]
        [Validation(Required=true)]
        public string InvoiceApplyId { get; set; }

        // 发票申请金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>13.44</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 发票币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>840</para>
        /// </summary>
        [NameInMap("invoice_ccy")]
        [Validation(Required=true)]
        public string InvoiceCcy { get; set; }

        // 发票申请时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-04-93 12:03:33</para>
        /// </summary>
        [NameInMap("invoice_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvoiceDate { get; set; }

        // 申请人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>客户名称</para>
        /// </summary>
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 申请人ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20882838383</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 申请状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>03</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 申请业务号
        /// <summary>
        /// <b>Example:</b>
        /// <para>335455</para>
        /// </summary>
        [NameInMap("bsn_no")]
        [Validation(Required=true)]
        public string BsnNo { get; set; }

        // 发票列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("relate_invoices")]
        [Validation(Required=false)]
        public List<IntlInvoiceInfoItem> RelateInvoices { get; set; }

        // 发票类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>42</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 申请类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>new</para>
        /// </summary>
        [NameInMap("apply_type")]
        [Validation(Required=true)]
        public string ApplyType { get; set; }

        // 形式发票文件映射
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx</para>
        /// </summary>
        [NameInMap("elc_file_map")]
        [Validation(Required=true)]
        public string ElcFileMap { get; set; }

    }

}
