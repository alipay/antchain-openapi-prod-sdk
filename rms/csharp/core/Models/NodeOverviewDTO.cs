// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // NodeOverviewDTO
    public class NodeOverviewDTO : TeaModel {
        // 磁盘 top排序应用
        [NameInMap("disk_top_nodes")]
        [Validation(Required=true)]
        public List<NodeTopItem> DiskTopNodes { get; set; }

        // 	
        // cpu top排序应用
        [NameInMap("cpu_top_nodes")]
        [Validation(Required=true)]
        public List<NodeTopItem> CpuTopNodes { get; set; }

        // mem top排序应用
        [NameInMap("mem_top_nodes")]
        [Validation(Required=true)]
        public List<NodeTopItem> MemTopNodes { get; set; }

    }

}
