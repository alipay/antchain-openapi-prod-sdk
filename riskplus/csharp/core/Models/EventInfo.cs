// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 风控事件咨询查询入参
    public class EventInfo : TeaModel {
        // 事件编码
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 事件产生时间
        [NameInMap("gmt_occur")]
        [Validation(Required=true)]
        public string GmtOccur { get; set; }

    }

}
