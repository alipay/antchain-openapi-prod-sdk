// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 数字类型
    public class NumberTest : TeaModel {
        // 1
        [NameInMap("parameter_1")]
        [Validation(Required=true)]
        public long? Parameter1 { get; set; }

        // 2
        [NameInMap("parameter_2")]
        [Validation(Required=true)]
        public long? Parameter2 { get; set; }

        // 3
        [NameInMap("parameter_3")]
        [Validation(Required=true)]
        public long? Parameter3 { get; set; }

        // 4
        [NameInMap("parameter_4")]
        [Validation(Required=true)]
        public long? Parameter4 { get; set; }

        // 5
        [NameInMap("parameter_5")]
        [Validation(Required=true)]
        public DemoClass Parameter5 { get; set; }

    }

}
