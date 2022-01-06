// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 安全通信标签model
    public class CommunicationLabelModel : TeaModel {
        // 关键字
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 类型(0-应用,1-标签)
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

    }

}
