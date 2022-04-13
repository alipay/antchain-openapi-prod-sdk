// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 命令行方式的健康检查配置。
    public class ExecAction : TeaModel {
        // 执行健康检查的命令。
        [NameInMap("command")]
        [Validation(Required=true)]
        public string Command { get; set; }

    }

}
