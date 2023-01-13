// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 二维点
    public class ChainInsightPoint : TeaModel {
        // x坐标，4位定点小数， 10000 表示 1
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // y坐标，4位定点小数， 10000 表示 1
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

    }

}
