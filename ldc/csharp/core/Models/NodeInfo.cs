// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // node info
    public class NodeInfo : TeaModel {
        // cell name
        [NameInMap("cell_name")]
        [Validation(Required=false)]
        public string CellName { get; set; }

        // node ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // true
        [NameInMap("is_schedulable")]
        [Validation(Required=false)]
        public bool? IsSchedulable { get; set; }

        // number of capacity cpu core
        [NameInMap("limited_cpu")]
        [Validation(Required=false)]
        public long? LimitedCpu { get; set; }

        // quantity of capacity memory
        [NameInMap("limited_memory")]
        [Validation(Required=false)]
        public long? LimitedMemory { get; set; }

        // node name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // pod number of one node
        [NameInMap("pod_number")]
        [Validation(Required=false)]
        public string PodNumber { get; set; }

        // node state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // quantity of used cpu core
        [NameInMap("used_cpu")]
        [Validation(Required=false)]
        public long? UsedCpu { get; set; }

        // quantity of used memory
        [NameInMap("used_memory")]
        [Validation(Required=false)]
        public long? UsedMemory { get; set; }

        // zone name
        [NameInMap("zone_name")]
        [Validation(Required=false)]
        public string ZoneName { get; set; }

        // node labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // node annotations
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

        // node created time
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // node system infos
        [NameInMap("system_infos")]
        [Validation(Required=false)]
        public List<Annotation> SystemInfos { get; set; }

        // max pod amount of node
        [NameInMap("max_pod_amount")]
        [Validation(Required=false)]
        public long? MaxPodAmount { get; set; }

        // running pod amount of node
        [NameInMap("running_pod_amount")]
        [Validation(Required=false)]
        public long? RunningPodAmount { get; set; }

    }

}
