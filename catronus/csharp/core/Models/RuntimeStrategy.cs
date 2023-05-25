// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 运行时相关策略
    public class RuntimeStrategy : TeaModel {
        // 安全webshell配置
        [NameInMap("webshell")]
        [Validation(Required=false)]
        public bool? Webshell { get; set; }

        // 提权保护配置
        [NameInMap("privilege")]
        [Validation(Required=false)]
        public bool? Privilege { get; set; }

        // 是否打开
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

    }

}
