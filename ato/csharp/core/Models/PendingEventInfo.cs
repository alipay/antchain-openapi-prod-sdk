// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 待办信息
    public class PendingEventInfo : TeaModel {
        // 事件id
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 通知:NOTIFICATION
        // 确认函:CONFIRMATION
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // ("PENDING","待办中"),  ("CONFIRMED","确认"),  
        // ("REJECTED","已拒绝")
        // ("FAILED","失败"),("EXPIRED","已过期");
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 待办内容主题
        [NameInMap("content_subject")]
        [Validation(Required=false)]
        public string ContentSubject { get; set; }

        // 事件有效期开始
        [NameInMap("effective_start_time")]
        [Validation(Required=false)]
        public string EffectiveStartTime { get; set; }

        // 事件有效期结束
        [NameInMap("effective_end_time")]
        [Validation(Required=false)]
        public string EffectiveEndTime { get; set; }

    }

}
