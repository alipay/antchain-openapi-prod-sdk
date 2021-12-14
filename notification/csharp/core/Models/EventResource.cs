// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    // 事件资源
    public class EventResource : TeaModel {
        // 资源类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 实例ID
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
