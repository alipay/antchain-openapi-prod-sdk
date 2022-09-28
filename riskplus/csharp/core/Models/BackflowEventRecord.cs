// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回流事件记录
    public class BackflowEventRecord : TeaModel {
        // 回流事件记录分组，ACTION-触达属性组/SERVICE-业务属性组/CONVERSION-转化属性组
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 回流事件部分分组后的记录list
        [NameInMap("properties")]
        [Validation(Required=true)]
        public List<BackflowEventRecordProperty> Properties { get; set; }

    }

}
