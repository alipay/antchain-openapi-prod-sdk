// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消息属性列表
    public class MessagePropertyDTO : TeaModel {
        // Key 名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
