// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateSpannerClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 容器的CPU个数(Core)
        [NameInMap("container_cpu")]
        [Validation(Required=true)]
        public long? ContainerCpu { get; set; }

        // 容器是否独占CPU
        [NameInMap("container_cpu_exclusive")]
        [Validation(Required=true)]
        public bool? ContainerCpuExclusive { get; set; }

        // 容器所在的物理机节点标签
        [NameInMap("container_device_type")]
        [Validation(Required=true)]
        public string ContainerDeviceType { get; set; }

        // 容器的磁盘大小(G)
        [NameInMap("container_disk")]
        [Validation(Required=true)]
        public long? ContainerDisk { get; set; }

        // 容器的内存大小（G）
        [NameInMap("container_mem")]
        [Validation(Required=true)]
        public long? ContainerMem { get; set; }

        // 容器网络
        [NameInMap("container_network")]
        [Validation(Required=true)]
        public string ContainerNetwork { get; set; }

        // 集群名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 集群单元类型，默认为 0 : 
        // 0 - 容器
        [NameInMap("unit_type")]
        [Validation(Required=false)]
        public long? UnitType { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 集群网络类型，internet/intranet/multidomain/office
        [NameInMap("address_type")]
        [Validation(Required=true)]
        public string AddressType { get; set; }

    }

}
