// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Spm
    public class Spm : TeaModel {
        // resultDim
        [NameInMap("result_dim")]
        [Validation(Required=false)]
        public UniqueDim ResultDim { get; set; }

        // costDim
        [NameInMap("cost_dim")]
        [Validation(Required=false)]
        public UniqueDim CostDim { get; set; }

        // countDim
        [NameInMap("count_dim")]
        [Validation(Required=false)]
        public UniqueDim CountDim { get; set; }

    }

}
