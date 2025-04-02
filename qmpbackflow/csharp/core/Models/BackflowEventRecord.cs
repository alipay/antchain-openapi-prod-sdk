// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回流事件记录
    public class BackflowEventRecord : TeaModel {
        // 回流事件部分分组后的记录list
        [NameInMap("properties")]
        [Validation(Required=true)]
        public List<BackflowEventRecordProperty> Properties { get; set; }

    }

}
