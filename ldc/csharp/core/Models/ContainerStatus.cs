// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container status
    public class ContainerStatus : TeaModel {
        // container id
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // image
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 上一次启动时间
        [NameInMap("last_start_time")]
        [Validation(Required=true)]
        public string LastStartTime { get; set; }

        // container name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 是否ready
        [NameInMap("ready")]
        [Validation(Required=true)]
        public bool? Ready { get; set; }

        // 重启次数
        [NameInMap("restart_count")]
        [Validation(Required=true)]
        public long? RestartCount { get; set; }

        // container state
        [NameInMap("state")]
        [Validation(Required=true)]
        public ContainerState State { get; set; }

    }

}
