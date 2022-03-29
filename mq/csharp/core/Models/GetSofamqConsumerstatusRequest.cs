// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class GetSofamqConsumerstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要查询的单元
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 是否查询详细信息。取值说明如下：true：要查询详细信息；false：不查询详细信息。
        [NameInMap("detail")]
        [Validation(Required=false)]
        public bool? Detail { get; set; }

        // 需要查询的消费端 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 是否打印 Jstack 信息
        [NameInMap("need_jstack")]
        [Validation(Required=false)]
        public bool? NeedJstack { get; set; }

    }

}
