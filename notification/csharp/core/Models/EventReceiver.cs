// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    // 事件接收人
    public class EventReceiver : TeaModel {
        // 接收人的有效联系方式
        [NameInMap("receiver")]
        [Validation(Required=true)]
        public string Receiver { get; set; }

        // 接收人联系方式的类型
        [NameInMap("receiver_type")]
        [Validation(Required=true)]
        public string ReceiverType { get; set; }

        // 消息发送类型
        [NameInMap("msg_type")]
        [Validation(Required=true)]
        public string MsgType { get; set; }

    }

}
