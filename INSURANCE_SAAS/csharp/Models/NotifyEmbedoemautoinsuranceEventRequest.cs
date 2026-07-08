// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyEmbedoemautoinsuranceEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求唯一标识
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 事件类型
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public string EventType { get; set; }

        // 事件发生时间，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 事件业务数据，JSON格式字符串
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
