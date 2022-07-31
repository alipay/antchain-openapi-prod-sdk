// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RCSMART.Models
{
    // 文本详情信息
    public class MessageDataVO : TeaModel {
        // 检测文本
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // xxxx
        [NameInMap("extends_map")]
        [Validation(Required=false)]
        public Pair ExtendsMap { get; set; }

    }

}
