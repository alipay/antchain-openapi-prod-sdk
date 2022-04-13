// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // pod信息
    public class PodInfo : TeaModel {
        // 部署单元名称
        [NameInMap("cell_display_name")]
        [Validation(Required=true)]
        public string CellDisplayName { get; set; }

        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // pod containers info
        [NameInMap("containers")]
        [Validation(Required=true)]
        public List<ContainerInfo> Containers { get; set; }

        // create time
        [NameInMap("created_time")]
        [Validation(Required=true)]
        public string CreatedTime { get; set; }

        // pod 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间名称
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // pod状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public PodStatus Status { get; set; }

        // pod uid
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // Pod volume信息。
        [NameInMap("volumes")]
        [Validation(Required=false)]
        public List<Volume> Volumes { get; set; }

    }

}
