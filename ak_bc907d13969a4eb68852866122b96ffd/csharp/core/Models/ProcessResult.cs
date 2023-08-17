// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // ProcessResult
    public class ProcessResult : TeaModel {
        // Node
        [NameInMap("node")]
        [Validation(Required=false)]
        public string Node { get; set; }

        // totalitem
        [NameInMap("totalitem")]
        [Validation(Required=false)]
        public long? Totalitem { get; set; }

        // finisheditem
        [NameInMap("finisheditem")]
        [Validation(Required=false)]
        public long? Finisheditem { get; set; }

        // TotalSubTask
        [NameInMap("totalsubtask")]
        [Validation(Required=false)]
        public long? Totalsubtask { get; set; }

        // FinishedSubTask
        [NameInMap("finishedsubtask")]
        [Validation(Required=false)]
        public long? Finishedsubtask { get; set; }

    }

}
