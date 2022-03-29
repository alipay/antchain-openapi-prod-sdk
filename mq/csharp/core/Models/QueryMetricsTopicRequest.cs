// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMetricsTopicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 结束时间
        // 
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 需要查询的 Topic 名称。如果 Topic 为 "ALL"，则查询当前租户下所有的 Topic 的数据。
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
