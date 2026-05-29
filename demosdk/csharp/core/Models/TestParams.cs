// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 测试11-22
    public class TestParams : TeaModel {
        // a
        [NameInMap("parameter")]
        [Validation(Required=false)]
        public TestParamA Parameter { get; set; }

        // string
        [NameInMap("string")]
        [Validation(Required=false)]
        public string String { get; set; }

    }

}
