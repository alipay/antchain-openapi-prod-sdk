// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    public class SendEventAsyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 事件码
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 事件上下文，用于填充消息模板里的参数
        [NameInMap("event_params")]
        [Validation(Required=false)]
        public List<KeyValuePair> EventParams { get; set; }

        // 消息接收人，对应自定义人群
        [NameInMap("event_receivers")]
        [Validation(Required=false)]
        public List<EventReceiver> EventReceivers { get; set; }

        // 租户信息，对应智科用户群组
        [NameInMap("event_tenant")]
        [Validation(Required=false)]
        public EventTenant EventTenant { get; set; }

        // 事件资源，据此查询相关的内部小二群组
        [NameInMap("event_resources")]
        [Validation(Required=false)]
        public List<EventResource> EventResources { get; set; }

        // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
        [NameInMap("sender")]
        [Validation(Required=true)]
        public string Sender { get; set; }

        // 描述sender
        [NameInMap("sender_name")]
        [Validation(Required=false)]
        public string SenderName { get; set; }

    }

}
