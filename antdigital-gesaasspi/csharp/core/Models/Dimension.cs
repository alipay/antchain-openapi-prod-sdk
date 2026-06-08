// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 维度
    public class Dimension : TeaModel {
        // 维度
        [NameInMap("dimension")]
        [Validation(Required=true)]
        public string Dimension_ { get; set; }

        // 维度值
        [NameInMap("dimension_value")]
        [Validation(Required=true)]
        public string DimensionValue { get; set; }

    }

}
