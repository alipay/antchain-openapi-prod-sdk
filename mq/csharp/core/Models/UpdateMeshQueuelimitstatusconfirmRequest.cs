// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateMeshQueuelimitstatusconfirmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 限流规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 限流规则状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 队列id
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

        // 方法
        [NameInMap("meth")]
        [Validation(Required=true)]
        public string Meth { get; set; }

    }

}
