// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权服务产品
    public class AuthProduct : TeaModel {
        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>SOCIAL_INSURANCE</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品简称
        /// <summary>
        /// <b>Example:</b>
        /// <para>社保</para>
        /// </summary>
        [NameInMap("product_abbr")]
        [Validation(Required=true)]
        public string ProductAbbr { get; set; }

    }

}
