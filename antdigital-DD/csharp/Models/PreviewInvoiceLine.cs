// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票行信息
    public class PreviewInvoiceLine : TeaModel {
        // 货物名称(商品名称)
        /// <summary>
        /// <b>Example:</b>
        /// <para>技术服务费</para>
        /// </summary>
        [NameInMap("line_product_name")]
        [Validation(Required=true)]
        public string LineProductName { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.13</para>
        /// </summary>
        [NameInMap("tax_rate")]
        [Validation(Required=true)]
        public string TaxRate { get; set; }

        // 发票行含税金额，单位:元
        /// <summary>
        /// <b>Example:</b>
        /// <para>102.98</para>
        /// </summary>
        [NameInMap("line_amt")]
        [Validation(Required=true)]
        public string LineAmt { get; set; }

        // 币种，默认156
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=false)]
        public string Ccy { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>个</para>
        /// </summary>
        [NameInMap("measurement_unit")]
        [Validation(Required=false)]
        public string MeasurementUnit { get; set; }

        // 关联的L5商品
        /// <summary>
        /// <b>Example:</b>
        /// <para>SQBRFSZL601262688</para>
        /// </summary>
        [NameInMap("relate_commodity_code")]
        [Validation(Required=true)]
        public string RelateCommodityCode { get; set; }

        // 服务类型 如：AFTECH_SERVICE
        /// <summary>
        /// <b>Example:</b>
        /// <para>AFTECH_SERVICE</para>
        /// </summary>
        [NameInMap("service_mode")]
        [Validation(Required=false)]
        public string ServiceMode { get; set; }

        // 规格型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>规格型号</para>
        /// </summary>
        [NameInMap("product_specification")]
        [Validation(Required=false)]
        public string ProductSpecification { get; set; }

    }

}
