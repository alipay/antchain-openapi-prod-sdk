// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 商品规格
    public class CommoditySpec : TeaModel {
        // 规格项枚举值
        [NameInMap("spec_key")]
        [Validation(Required=false)]
        public string SpecKey { get; set; }

        // 规格项默认值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
