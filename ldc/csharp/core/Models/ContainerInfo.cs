// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器信息
    public class ContainerInfo : TeaModel {
        // 容器id
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // 容器镜像
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 最后启动时间
        [NameInMap("last_start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastStartTime { get; set; }

        // 容器镜像
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 重启次数
        [NameInMap("restart_count")]
        [Validation(Required=true)]
        public long? RestartCount { get; set; }

        // 容器运行状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 容器spec配置。
        [NameInMap("spec")]
        [Validation(Required=true)]
        public ContainerSpec Spec { get; set; }

    }

}
