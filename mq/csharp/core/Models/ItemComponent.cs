// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 列表元素
    public class ItemComponent : TeaModel {
        // 内容
        [NameInMap("contents")]
        [Validation(Required=true)]
        public List<ComponentContent> Contents { get; set; }

    }

}
