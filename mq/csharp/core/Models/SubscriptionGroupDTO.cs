// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 订阅者分组信息
    public class SubscriptionGroupDTO : TeaModel {
        // 消费者所属消费组
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 部署模型
        [NameInMap("message_model")]
        [Validation(Required=true)]
        public string MessageModel { get; set; }

        // 订阅字符串
        [NameInMap("sub_string")]
        [Validation(Required=true)]
        public string SubString { get; set; }

        // group协议类型
        [NameInMap("group_type")]
        [Validation(Required=true)]
        public string GroupType { get; set; }

    }

}
