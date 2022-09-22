// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦命名空间
    public class FedNamespace : TeaModel {
        // 命名空间的注解
        [NameInMap("annotations")]
        [Validation(Required=true)]
        public List<Annotation> Annotations { get; set; }

        // 分发的集群列表
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // 分发状态
        [NameInMap("cluster_state_map")]
        [Validation(Required=true)]
        public List<ClusterState> ClusterStateMap { get; set; }

        // 命名空间的标签
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<Label> Labels { get; set; }

        // 命名空间名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联邦命名空间所在命名空间，和命名空间自身名称保持一致
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // 分发状态，成功 True，失败 False，删除中 Deleting
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 导致该分发状态的原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
