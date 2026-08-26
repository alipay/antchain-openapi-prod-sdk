// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票申请信息
    public class InvoiceApplyInfoVO : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 发票申请ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2234345667</para>
        /// </summary>
        [NameInMap("invoice_apply_id")]
        [Validation(Required=false)]
        public string InvoiceApplyId { get; set; }

        // 申请金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>34.98</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 发票申请日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("invoice_apply_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvoiceApplyDate { get; set; }

        // 发票类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
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
        [Validation(Required=false)]
        public string ApplyType { get; set; }

        // 申请人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试</para>
        /// </summary>
        [NameInMap("operator_name")]
        [Validation(Required=false)]
        public string OperatorName { get; set; }

        // 申请人ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 申请状态，01：处理中，03：已完成，04：审批中，05：已驳回，06：已撤回，10：申请终止
        /// <summary>
        /// <b>Example:</b>
        /// <para>03</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 关联的发票列表
        [NameInMap("relate_invoices")]
        [Validation(Required=false)]
        public List<InvoiceInfoVO> RelateInvoices { get; set; }

        // 业务号
        /// <summary>
        /// <b>Example:</b>
        /// <para>323422244555</para>
        /// </summary>
        [NameInMap("bsn_no")]
        [Validation(Required=true)]
        public string BsnNo { get; set; }

    }

}
