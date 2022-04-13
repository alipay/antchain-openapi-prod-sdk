// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Kubernetes Event
    public class KubeEvent : TeaModel {
        // 事件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 发布次数
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 事件原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 事件内容
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 更新时间
        [NameInMap("modified_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

    }

}
