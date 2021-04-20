// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryEventInfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 事件唯一标识
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 事件状态
        [NameInMap("event_status")]
        [Validation(Required=false)]
        public string EventStatus { get; set; }

        // token发放状态
        [NameInMap("token_status")]
        [Validation(Required=false)]
        public string TokenStatus { get; set; }

        // token数量
        [NameInMap("token_amount")]
        [Validation(Required=false)]
        public long? TokenAmount { get; set; }

        // 事件上报时间
        [NameInMap("event_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EventTime { get; set; }

        // 事件处理结果提示信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
