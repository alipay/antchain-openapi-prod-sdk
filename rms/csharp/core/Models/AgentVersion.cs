// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // agent版本
    public class AgentVersion : TeaModel {
        // 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 存储url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

    }

}
