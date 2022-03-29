// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ImportMeshQueuerouteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 队列版本
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<QueueRouteEditionDTO> List { get; set; }

        // 方法
        [NameInMap("meth")]
        [Validation(Required=true)]
        public string Meth { get; set; }

        // 路由规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 队列id
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

        // 路由类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
