// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用服务下相关对象的元信息
    public class ContainerServiceObjectMeta : TeaModel {
        // UID
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部署单元名称
        [NameInMap("cell_display_name")]
        [Validation(Required=true)]
        public string CellDisplayName { get; set; }

        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=true)]
        public string CreatedTime { get; set; }

    }

}
