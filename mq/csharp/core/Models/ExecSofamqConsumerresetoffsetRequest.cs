// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ExecSofamqConsumerresetoffsetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要查询的单元
        // 
        // 
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 需查询的消费端 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 重置位点到指定的时间戳，仅在 Type 为 1 时生效。
        [NameInMap("reset_timestamp")]
        [Validation(Required=false)]
        public long? ResetTimestamp { get; set; }

        // 需重置位点的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 消息清理类型。取值说明如下：
        // 
        // 0：清除所有消息
        // 1：清理到指定时间
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

    }

}
