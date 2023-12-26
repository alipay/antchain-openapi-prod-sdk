// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 人群匹配结果
    public class MatchResult : TeaModel {
        // 是否匹配
        [NameInMap("match")]
        [Validation(Required=true)]
        public bool? Match { get; set; }

    }

}
