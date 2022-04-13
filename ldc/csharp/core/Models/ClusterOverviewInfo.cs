// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // cluster overview info
    public class ClusterOverviewInfo : TeaModel {
        // available cpu core
        [NameInMap("available_c_p_u")]
        [Validation(Required=false)]
        public long? AvailableCPU { get; set; }

        // available disk
        [NameInMap("available_disk")]
        [Validation(Required=false)]
        public long? AvailableDisk { get; set; }

        // available memory
        [NameInMap("available_memory")]
        [Validation(Required=false)]
        public long? AvailableMemory { get; set; }

        // available Node Number
        [NameInMap("available_node_number")]
        [Validation(Required=false)]
        public long? AvailableNodeNumber { get; set; }

        // total cpu core number
        [NameInMap("total_c_p_u")]
        [Validation(Required=false)]
        public long? TotalCPU { get; set; }

        // total disk
        [NameInMap("total_disk")]
        [Validation(Required=false)]
        public long? TotalDisk { get; set; }

        // total memory
        [NameInMap("total_memory")]
        [Validation(Required=false)]
        public long? TotalMemory { get; set; }

        // total node number
        [NameInMap("total_node_number")]
        [Validation(Required=false)]
        public long? TotalNodeNumber { get; set; }

    }

}
