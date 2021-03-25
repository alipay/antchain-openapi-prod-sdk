// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 执行指令的一个参数。
    public class OpsCmdArg : TeaModel {
        // 指令参数名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 指令参数值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
