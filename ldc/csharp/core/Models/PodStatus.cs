// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // pod状态
    public class PodStatus : TeaModel {
        // 节点ip
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // pod状态
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // podip
        [NameInMap("pod_ip")]
        [Validation(Required=false)]
        public string PodIp { get; set; }

        // pod container status
        [NameInMap("container_statuses")]
        [Validation(Required=true)]
        public List<ContainerStatus> ContainerStatuses { get; set; }

    }

}
