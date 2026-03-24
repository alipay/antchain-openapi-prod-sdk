// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YDINDUSTRY.Models
{
    // 评分对象
    public class RetailScore : TeaModel {
        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 评分
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 拓展数据
        [NameInMap("ext_param")]
        [Validation(Required=true)]
        public string ExtParam { get; set; }

    }

}
