// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 商品来源
    public class CommoditySourceType : TeaModel {
        // 商品来源code
        [NameInMap("type_code")]
        [Validation(Required=true)]
        public string TypeCode { get; set; }

        // 商品来源描述
        [NameInMap("type_desc")]
        [Validation(Required=true)]
        public string TypeDesc { get; set; }

    }

}
