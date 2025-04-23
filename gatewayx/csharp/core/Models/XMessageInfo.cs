// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    // 消息详情
    public class XMessageInfo : TeaModel {
        // 消息事件编码
        [NameInMap("msg_key")]
        [Validation(Required=true)]
        public string MsgKey { get; set; }

        // 消费方id，例如appId，tenantId
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 消费者类型，例如TENANT, APP
        [NameInMap("consumer_type")]
        [Validation(Required=true)]
        public string ConsumerType { get; set; }

        // 业务消息内容，json格式
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 消息发送过程中的唯一ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

    }

}
