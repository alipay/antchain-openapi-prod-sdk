// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票预览请求
    public class PreviewInvoiceRequest : TeaModel {
        // 开票场景，默认基于订单开票
        /// <summary>
        /// <b>Example:</b>
        /// <para>LTC_RCPT_BILL</para>
        /// </summary>
        [NameInMap("invoice_biz_scene")]
        [Validation(Required=false)]
        public string InvoiceBizScene { get; set; }

        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 开票操作，默认预览开票PREVIEW_INVOICING
        /// <summary>
        /// <b>Example:</b>
        /// <para>PREVIEW_INVOICING</para>
        /// </summary>
        [NameInMap("invoice_biz_action")]
        [Validation(Required=false)]
        public string InvoiceBizAction { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

        // ou
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

        // 调用来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>IOT</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 开票人ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("operator_no")]
        [Validation(Required=true)]
        public string OperatorNo { get; set; }

        // 操作人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXD</para>
        /// </summary>
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 外部申请单据号，长度不超过32位
        /// <summary>
        /// <b>Example:</b>
        /// <para>3455444</para>
        /// </summary>
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 发票类型， 01 专票 02 普票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票介质 01 电子发票 02 纸质发票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_material")]
        [Validation(Required=true)]
        public string InvoiceMaterial { get; set; }

        // 票面备注 该内容会原样展示到发票上
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("invoice_note")]
        [Validation(Required=false)]
        public string InvoiceNote { get; set; }

        // 申请说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>申请说明</para>
        /// </summary>
        [NameInMap("apply_reason")]
        [Validation(Required=false)]
        public string ApplyReason { get; set; }

        // 购方信息
        [NameInMap("invoice_buyer")]
        [Validation(Required=true)]
        public ApplyInvoiceBuyer InvoiceBuyer { get; set; }

        // 寄送信息
        [NameInMap("apply_invoice_delivery")]
        [Validation(Required=true)]
        public ApplyInvoiceDelivery ApplyInvoiceDelivery { get; set; }

        // 发票需要占用的额度信息
        [NameInMap("apply_invoice_quota")]
        [Validation(Required=true)]
        public ApplyInvoiceAmountAllocation ApplyInvoiceQuota { get; set; }

        // 发票行列表
        [NameInMap("preview_invoice_lines")]
        [Validation(Required=false)]
        public List<PreviewInvoiceLine> PreviewInvoiceLines { get; set; }

    }

}
