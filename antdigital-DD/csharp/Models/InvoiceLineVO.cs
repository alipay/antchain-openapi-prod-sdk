// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票行信息
    public class InvoiceLineVO : TeaModel {
        // 发票行金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.09</para>
        /// </summary>
        [NameInMap("line_amt")]
        [Validation(Required=true)]
        public string LineAmt { get; set; }

        // 发票行ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("line_id")]
        [Validation(Required=true)]
        public string LineId { get; set; }

        // 税额
        /// <summary>
        /// <b>Example:</b>
        /// <para>20.09</para>
        /// </summary>
        [NameInMap("tax_amt")]
        [Validation(Required=true)]
        public string TaxAmt { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.06</para>
        /// </summary>
        [NameInMap("tax_rate")]
        [Validation(Required=true)]
        public string TaxRate { get; set; }

        // 货物或劳务名称，如 软件服务费201612
        /// <summary>
        /// <b>Example:</b>
        /// <para>软件服务费201612</para>
        /// </summary>
        [NameInMap("line_product_name")]
        [Validation(Required=true)]
        public string LineProductName { get; set; }

        // 不含税金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>93.24</para>
        /// </summary>
        [NameInMap("tax_exclusive_amt")]
        [Validation(Required=false)]
        public string TaxExclusiveAmt { get; set; }

        // 数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>13</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public long? Quantity { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>个</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.34</para>
        /// </summary>
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 规格型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>规格型号</para>
        /// </summary>
        [NameInMap("specification_model")]
        [Validation(Required=false)]
        public string SpecificationModel { get; set; }

        // 服务大类
        /// <summary>
        /// <b>Example:</b>
        /// <para>技术服务费</para>
        /// </summary>
        [NameInMap("tax_classification_name")]
        [Validation(Required=false)]
        public string TaxClassificationName { get; set; }

        // 税收分类编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>344555</para>
        /// </summary>
        [NameInMap("tax_classification_code")]
        [Validation(Required=false)]
        public string TaxClassificationCode { get; set; }

        // 货物或劳务名称后缀
        /// <summary>
        /// <b>Example:</b>
        /// <para>202306</para>
        /// </summary>
        [NameInMap("product_name_suffix")]
        [Validation(Required=false)]
        public string ProductNameSuffix { get; set; }

    }

}
