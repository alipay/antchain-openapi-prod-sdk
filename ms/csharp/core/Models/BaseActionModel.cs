// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 规则行为类型
    public class BaseActionModel : TeaModel {
        // 行为类型REJECT/PASS
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 开启状态
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

    }

}
