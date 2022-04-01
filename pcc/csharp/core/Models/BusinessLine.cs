// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // L1
    public class BusinessLine : TeaModel {
        // 产品线code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 1级产品线name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // L2
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public List<ProductLine> ProductLine { get; set; }

    }

}
