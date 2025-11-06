// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权服务产品
    public class AuthProduct : TeaModel {
        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品简称
        [NameInMap("product_abbr")]
        [Validation(Required=true)]
        public string ProductAbbr { get; set; }

    }

}
