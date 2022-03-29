// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 队列路由域值
    public class QueueRouteEditionDTO : TeaModel {
        // 版本
        [NameInMap("edition")]
        [Validation(Required=true)]
        public string Edition { get; set; }

        // 路由版本（插入时可不填）
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 路由规则id（插入时可不填）
        [NameInMap("route_id")]
        [Validation(Required=true)]
        public long? RouteId { get; set; }

        // 权重
        [NameInMap("scale")]
        [Validation(Required=true)]
        public long? Scale { get; set; }

    }

}
