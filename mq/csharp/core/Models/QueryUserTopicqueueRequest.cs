// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryUserTopicqueueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需查询的 Topic 所在的 Cell
        // 
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 需要查询的Topic对应的实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // Topic名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
