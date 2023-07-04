// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 探针配置Exec
    public class Exec : TeaModel {
        // args
        [NameInMap("args")]
        [Validation(Required=true)]
        public List<string> Args { get; set; }

        // cmd
        [NameInMap("cmd")]
        [Validation(Required=true)]
        public string Cmd { get; set; }

    }

}
