// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    public class SendEventDirectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 事件码
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 事件参数
        [NameInMap("event_params")]
        [Validation(Required=false)]
        public List<KeyValuePair> EventParams { get; set; }

        // 接收者
        [NameInMap("event_receiver")]
        [Validation(Required=true)]
        public EventReceiver EventReceiver { get; set; }

        // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
        [NameInMap("sender")]
        [Validation(Required=true)]
        public string Sender { get; set; }

        // 用于描述sender
        [NameInMap("sender_name")]
        [Validation(Required=false)]
        public string SenderName { get; set; }

    }

}
