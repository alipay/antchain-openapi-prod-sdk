// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // rule
    public class Rule : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // path
        [NameInMap("paths")]
        [Validation(Required=false)]
        public List<Path> Paths { get; set; }

    }

}
