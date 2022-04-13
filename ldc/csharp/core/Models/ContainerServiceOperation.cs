// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器应用服务运维
    public class ContainerServiceOperation : TeaModel {
        // 容器服务名称。
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 依赖的容器应用服务名称。
        [NameInMap("depend_container_service_names")]
        [Validation(Required=false)]
        public List<string> DependContainerServiceNames { get; set; }

        // 待操作目标pods列表
        [NameInMap("selected_pods")]
        [Validation(Required=false)]
        public List<CellPods> SelectedPods { get; set; }

        // 自定义发布批次
        [NameInMap("batches")]
        [Validation(Required=false)]
        public List<ReleaseBatchObj> Batches { get; set; }

        // 缩放副本数量，扩缩容时使用
        [NameInMap("scale_replicas")]
        [Validation(Required=false)]
        public List<ReplicaCount> ScaleReplicas { get; set; }

        // 应用服务当前版本
        [NameInMap("container_service_revision")]
        [Validation(Required=false)]
        public string ContainerServiceRevision { get; set; }

        // [huanyu场景使用]，灰度平台pods分批序列化为json的结果
        [NameInMap("graycore_batches")]
        [Validation(Required=false)]
        public string GraycoreBatches { get; set; }

    }

}
