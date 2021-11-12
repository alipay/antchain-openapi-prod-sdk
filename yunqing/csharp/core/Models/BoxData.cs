// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 装箱数据
    public class BoxData : TeaModel {
        // 装箱数据类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 装箱的json数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 装箱数据版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
