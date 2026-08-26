// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票申请场景下发票行信息
    public class ApplyInvoiceLine : TeaModel {
        // 含税金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>133880</para>
        /// </summary>
        [NameInMap("amt")]
        [Validation(Required=true)]
        public string Amt { get; set; }

        // 税额
        /// <summary>
        /// <b>Example:</b>
        /// <para>45</para>
        /// </summary>
        [NameInMap("tax_amt")]
        [Validation(Required=true)]
        public string TaxAmt { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.13</para>
        /// </summary>
        [NameInMap("tax_rate")]
        [Validation(Required=true)]
        public string TaxRate { get; set; }

        // 不含税金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>24556</para>
        /// </summary>
        [NameInMap("tax_exclusive_amt")]
        [Validation(Required=true)]
        public string TaxExclusiveAmt { get; set; }

        // 含税单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>234</para>
        /// </summary>
        [NameInMap("unit_amt")]
        [Validation(Required=true)]
        public string UnitAmt { get; set; }

        // 服务大类编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2345455</para>
        /// </summary>
        [NameInMap("tax_classification_code")]
        [Validation(Required=true)]
        public string TaxClassificationCode { get; set; }

        // 货物或劳务名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>技术服务费</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>SPU33445</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 规格型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>333</para>
        /// </summary>
        [NameInMap("product_specification")]
        [Validation(Required=false)]
        public string ProductSpecification { get; set; }

        // 计量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>个</para>
        /// </summary>
        [NameInMap("measurement_nnit")]
        [Validation(Required=false)]
        public string MeasurementNnit { get; set; }

        // 数量，默认为1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public string Quantity { get; set; }

        // 发票行ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>33455666</para>
        /// </summary>
        [NameInMap("invoice_line_id")]
        [Validation(Required=true)]
        public string InvoiceLineId { get; set; }

        // 劳务与货物名称的后缀，主要有账期（202309）、PID（2088XXXX）等
        /// <summary>
        /// <b>Example:</b>
        /// <para>202309</para>
        /// </summary>
        [NameInMap("product_name_suffix")]
        [Validation(Required=false)]
        public string ProductNameSuffix { get; set; }

    }

}
