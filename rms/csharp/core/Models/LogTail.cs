// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 拉取日志的返回对象
    public class LogTail : TeaModel {
        // 代理IP
        [NameInMap("agent")]
        [Validation(Required=true)]
        public string Agent { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 日志行数据
        [NameInMap("lines")]
        [Validation(Required=true)]
        public List<string> Lines { get; set; }

        // collectId
        [NameInMap("nc")]
        [Validation(Required=true)]
        public string Nc { get; set; }

    }

}
