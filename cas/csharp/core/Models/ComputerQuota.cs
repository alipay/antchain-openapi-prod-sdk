// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // computer quota
    public class ComputerQuota : TeaModel {
        // cpu shared
        [NameInMap("cpu_shared")]
        [Validation(Required=false)]
        public long? CpuShared { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // disk
        [NameInMap("disk")]
        [Validation(Required=false)]
        public long? Disk { get; set; }

    }

}
