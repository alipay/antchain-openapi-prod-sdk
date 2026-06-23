// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // l5数据
    public class OfferMaster : TeaModel {
        // 内部商品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>baas_pre</para>
        /// </summary>
        [NameInMap("inner_code")]
        [Validation(Required=true)]
        public string InnerCode { get; set; }

        // 用于展示的格式化商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>PBC0000C013P-R</para>
        /// </summary>
        [NameInMap("format_code")]
        [Validation(Required=true)]
        public string FormatCode { get; set; }

        // 外部商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>baas_pre</para>
        /// </summary>
        [NameInMap("outer_code")]
        [Validation(Required=true)]
        public string OuterCode { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁链BaaS平台（包年包月）</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>商品描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>productCode</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 渠道产品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>TWCBAG</para>
        /// </summary>
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // l4编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>MSRJSPU00000028</para>
        /// </summary>
        [NameInMap("spu_code")]
        [Validation(Required=true)]
        public string SpuCode { get; set; }

    }

}
