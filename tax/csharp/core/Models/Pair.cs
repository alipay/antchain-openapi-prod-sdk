// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 配对
    public class Pair : TeaModel {
        // left
        [NameInMap("left")]
        [Validation(Required=true)]
        public string Left { get; set; }

        // right
        [NameInMap("right")]
        [Validation(Required=true)]
        public Key Right { get; set; }

    }

}
