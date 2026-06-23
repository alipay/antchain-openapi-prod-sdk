// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // L2
    public class ProductLine : TeaModel {
        // 溯源产品
        /// <summary>
        /// <b>Example:</b>
        /// <para>10051</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品线名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>溯源产品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 业务产品线code
        /// <summary>
        /// <b>Example:</b>
        /// <para>10010</para>
        /// </summary>
        [NameInMap("business_line_code")]
        [Validation(Required=true)]
        public string BusinessLineCode { get; set; }

        // l3
        [NameInMap("business_product")]
        [Validation(Required=true)]
        public List<BusinessProduct> BusinessProduct { get; set; }

    }

}
