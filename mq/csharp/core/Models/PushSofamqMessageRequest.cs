// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class PushSofamqMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 单元名称
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 需要接收消息的 Client ID
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 需要 push 的消费组 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 需要 push 的消息 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 需要发送的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
