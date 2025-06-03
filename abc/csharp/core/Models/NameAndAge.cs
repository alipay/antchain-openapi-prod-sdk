// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    // 姓名和年龄
    public class NameAndAge : TeaModel {
        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 年龄
        [NameInMap("age")]
        [Validation(Required=false)]
        public long? Age { get; set; }

    }

}
