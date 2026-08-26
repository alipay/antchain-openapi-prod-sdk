// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票申请
    public class ApplyInvoiceRequest : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // OU
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZL6</para>
        /// </summary>
        [NameInMap("ou")]
        [Validation(Required=true)]
        public string Ou { get; set; }

        // 合同号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149-ZNHYFM01222234</para>
        /// </summary>
        [NameInMap("ar_no")]
        [Validation(Required=true)]
        public string ArNo { get; set; }

        // 开票业务场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>LTC_RCPT_BILL</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 业务操作
        /// <summary>
        /// <b>Example:</b>
        /// <para>PREVIEW_INVOICING</para>
        /// </summary>
        [NameInMap("biz_action")]
        [Validation(Required=true)]
        public string BizAction { get; set; }

        // 系统来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>IOT</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 操作人员工号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2334</para>
        /// </summary>
        [NameInMap("operator_no")]
        [Validation(Required=true)]
        public string OperatorNo { get; set; }

        // 操作人员名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试</para>
        /// </summary>
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 外部业务号
        /// <summary>
        /// <b>Example:</b>
        /// <para>34445</para>
        /// </summary>
        [NameInMap("invoice_apply_biz_no")]
        [Validation(Required=true)]
        public string InvoiceApplyBizNo { get; set; }

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
        /// <para>原因</para>
        /// </summary>
        [NameInMap("apply_reason")]
        [Validation(Required=false)]
        public string ApplyReason { get; set; }

        // 寄送信息
        [NameInMap("apply_invoice_delivery")]
        [Validation(Required=true)]
        public ApplyInvoiceDelivery ApplyInvoiceDelivery { get; set; }

        // 发票需要占用的额度信息
        [NameInMap("apply_invoice_quota")]
        [Validation(Required=true)]
        public ApplyInvoiceAmountAllocation ApplyInvoiceQuota { get; set; }

        // 发票信息列表，一次申请可能会拆分出多张票
        [NameInMap("apply_invoices")]
        [Validation(Required=true)]
        public List<ApplyInvoiceLine> ApplyInvoices { get; set; }

        // 预览记录号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20234566767</para>
        /// </summary>
        [NameInMap("preview_log_no")]
        [Validation(Required=true)]
        public string PreviewLogNo { get; set; }

    }

}
