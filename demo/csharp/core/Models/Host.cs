// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // host
    public class Host : TeaModel {
        // test_2e1ae924805f
        [NameInMap("system_name")]
        [Validation(Required=true)]
        public string SystemName { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
