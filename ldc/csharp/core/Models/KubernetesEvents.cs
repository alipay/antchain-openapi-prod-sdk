// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 集群事件
    public class KubernetesEvents : TeaModel {
        // 事件发生时间
        [NameInMap("creation_timestamp")]
        [Validation(Required=true)]
        public string CreationTimestamp { get; set; }

        // 事件数目
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 事件内容
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
