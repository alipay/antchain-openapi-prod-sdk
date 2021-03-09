// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // ComputerType
    public class ComputerType : TeaModel {
        // cpu core count
        [NameInMap("cpu_core_count")]
        [Validation(Required=false)]
        public long? CpuCoreCount { get; set; }

        // instance type id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 实例规格族
        [NameInMap("instance_type_family")]
        [Validation(Required=false)]
        public string InstanceTypeFamily { get; set; }

        // memory size
        [NameInMap("memory_size")]
        [Validation(Required=false)]
        public long? MemorySize { get; set; }

        // 实例状态，可能值： Available：资源充足 Sold...
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
