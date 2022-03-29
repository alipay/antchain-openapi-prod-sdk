// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConsumptionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户实例ID
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // ldc模式下的cell
        // 
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 消费者groupID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 订阅的topic
        // 
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 是否带上客户端信息
        // 
        [NameInMap("need_client_detail")]
        [Validation(Required=true)]
        public bool? NeedClientDetail { get; set; }

    }

}
