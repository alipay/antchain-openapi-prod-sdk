// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // fixpath
    public class FixPath : TeaModel {
        // 路径
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
