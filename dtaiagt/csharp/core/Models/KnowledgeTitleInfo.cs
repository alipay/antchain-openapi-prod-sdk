// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识类型：知识点列表
    public class KnowledgeTitleInfo : TeaModel {
        // title
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // score 浮点类型
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

    }

}
