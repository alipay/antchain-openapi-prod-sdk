// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // InitPack
    public class InitPack : TeaModel {
        // 2022-11-07 14:48
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // wanyi
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 1
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

    }

}
