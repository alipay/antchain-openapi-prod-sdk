// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 订阅关系集合
    public class SubscriptionDTO : TeaModel {
        // 订阅该 Topic 的子类别 Tag 表达式
        [NameInMap("sub_string")]
        [Validation(Required=true)]
        public string SubString { get; set; }

        //  订阅关系版本号，为自增 Long 型
        [NameInMap("sub_version")]
        [Validation(Required=true)]
        public long? SubVersion { get; set; }

        // 订阅的 Tag 集合
        [NameInMap("tags_set")]
        [Validation(Required=true)]
        public List<string> TagsSet { get; set; }

        // 订阅的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
