// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 任意KV结构对象
    public class AnyKeywordItem : TeaModel {
        // 项目编码
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 项目值
        [NameInMap("item_value")]
        [Validation(Required=true)]
        public string ItemValue { get; set; }

    }

}
