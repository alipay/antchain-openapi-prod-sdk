// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 云游环境信息。
    public class Env : TeaModel {
        // cellGroup的列表
        [NameInMap("cell_groups")]
        [Validation(Required=true)]
        public List<CellGroup> CellGroups { get; set; }

        // 云信息
        [NameInMap("cloud")]
        [Validation(Required=true)]
        public Cloud Cloud { get; set; }

        // 关联的ake集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 环境名
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 环境的id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // （已废弃）环境唯一标识。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否ldc环境
        [NameInMap("ldc")]
        [Validation(Required=true)]
        public bool? Ldc { get; set; }

        // 环境名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // （已废弃）环境底座iaas技术栈。
        [NameInMap("stack")]
        [Validation(Required=false)]
        public string Stack { get; set; }

        // 租户信息
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public Tenant Tenant { get; set; }

        // 工作空间列表
        [NameInMap("workspaces")]
        [Validation(Required=true)]
        public List<Workspace> Workspaces { get; set; }

        // （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 环境类型
        [NameInMap("env_type")]
        [Validation(Required=true)]
        public string EnvType { get; set; }

    }

}
