// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // L3
    public class BusinessProduct : TeaModel {
        // 业务产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>BAASPLUS</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品线名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>BaaS增值服务</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 归属业务线
        /// <summary>
        /// <b>Example:</b>
        /// <para>10010</para>
        /// </summary>
        [NameInMap("business_line")]
        [Validation(Required=true)]
        public string BusinessLine { get; set; }

        // 归属产品线
        /// <summary>
        /// <b>Example:</b>
        /// <para>10010</para>
        /// </summary>
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // spu列表
        [NameInMap("product_spu")]
        [Validation(Required=true)]
        public List<ProductSpu> ProductSpu { get; set; }

        // 短码
        /// <summary>
        /// <b>Example:</b>
        /// <para>CDXA</para>
        /// </summary>
        [NameInMap("short_code")]
        [Validation(Required=true)]
        public string ShortCode { get; set; }

    }

}
