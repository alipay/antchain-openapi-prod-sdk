// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LbCluster
    public class LbCluster : TeaModel {
        // container_cpu
        [NameInMap("container_cpu")]
        [Validation(Required=false)]
        public long? ContainerCpu { get; set; }

        // container_cpu_exclusive
        [NameInMap("container_cpu_exclusive")]
        [Validation(Required=false)]
        public bool? ContainerCpuExclusive { get; set; }

        // container_device_type
        [NameInMap("container_device_type")]
        [Validation(Required=false)]
        public string ContainerDeviceType { get; set; }

        // container_disk
        [NameInMap("container_disk")]
        [Validation(Required=false)]
        public long? ContainerDisk { get; set; }

        // container_mem
        [NameInMap("container_mem")]
        [Validation(Required=false)]
        public long? ContainerMem { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // image
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // unit_infos
        [NameInMap("unit_infos")]
        [Validation(Required=false)]
        public List<AcsClusterUnit> UnitInfos { get; set; }

        // unit_type
        [NameInMap("unit_type")]
        [Validation(Required=false)]
        public long? UnitType { get; set; }

        // used_ports
        [NameInMap("used_ports")]
        [Validation(Required=false)]
        public List<long?> UsedPorts { get; set; }

    }

}
