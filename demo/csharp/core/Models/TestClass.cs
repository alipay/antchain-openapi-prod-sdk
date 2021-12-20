// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 阿松大
    public class TestClass : TeaModel {
        // 1
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

        // 2
        [NameInMap("demo")]
        [Validation(Required=true)]
        public string Demo { get; set; }

        // 3
        [NameInMap("demo1")]
        [Validation(Required=true)]
        public string Demo1 { get; set; }

    }

}
