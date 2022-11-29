// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据值条目
    public class AnyAmountItem : TeaModel {
        // 数据项编码
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 数据值，按字符串输出，最多保留6位小数
        [NameInMap("item_amount")]
        [Validation(Required=true)]
        public string ItemAmount { get; set; }

    }

}
