// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 编码
    public class Cmd : TeaModel {
        // cmd编码
        [NameInMap("cmd_code")]
        [Validation(Required=true)]
        public string CmdCode { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
