// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Spanner集群信息
    public class SpannerClusterInfo : TeaModel {
        // 容器的CPU个数
        [NameInMap("container_cpu")]
        [Validation(Required=true)]
        public long? ContainerCpu { get; set; }

        // 容器是否独占CPU
        [NameInMap("container_cpu_exclusive")]
        [Validation(Required=true)]
        public bool? ContainerCpuExclusive { get; set; }

        // 容器所在物理机节点的标签
        [NameInMap("container_device_type")]
        [Validation(Required=true)]
        public string ContainerDeviceType { get; set; }

        // 容器的磁盘大小
        [NameInMap("container_disk")]
        [Validation(Required=true)]
        public long? ContainerDisk { get; set; }

        // 容器的内存大小(G)
        [NameInMap("container_mem")]
        [Validation(Required=true)]
        public long? ContainerMem { get; set; }

        // 容器网络
        [NameInMap("container_network")]
        [Validation(Required=true)]
        public string ContainerNetwork { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 扩展属性，json字符串
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

        // ID 
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // 集群名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 集群的状态： 1 运行状态  2 维护状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 集群单元信息
        [NameInMap("unit_infos")]
        [Validation(Required=true)]
        public List<SpannerClusterUnitInfo> UnitInfos { get; set; }

        // 0 表示集群单元类型为容器
        [NameInMap("unit_type")]
        [Validation(Required=true)]
        public long? UnitType { get; set; }

        // 已使用的端口
        [NameInMap("used_ports")]
        [Validation(Required=false)]
        public List<long?> UsedPorts { get; set; }

        // internet/intranet/multidomain/office
        [NameInMap("address_type")]
        [Validation(Required=true)]
        public string AddressType { get; set; }

    }

}
