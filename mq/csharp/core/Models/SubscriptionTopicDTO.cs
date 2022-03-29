// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 订阅者topic信息
    public class SubscriptionTopicDTO : TeaModel {
        // 是否在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 订阅匹配字符串
        [NameInMap("sub_string")]
        [Validation(Required=true)]
        public string SubString { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
