// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // 产品信息
    public class ProductInfo : TeaModel {
        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // sdk版本号
        [NameInMap("sdk_version")]
        [Validation(Required=true)]
        public string SdkVersion { get; set; }

    }

}
