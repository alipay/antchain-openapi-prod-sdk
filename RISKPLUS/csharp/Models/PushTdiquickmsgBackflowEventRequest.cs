// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushTdiquickmsgBackflowEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 回流事件id，对应租户回流事件id
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public long? EventId { get; set; }

        // 回流事件记录列表
        [NameInMap("event_records")]
        [Validation(Required=true)]
        public List<BackflowEventRecord> EventRecords { get; set; }

    }

}
