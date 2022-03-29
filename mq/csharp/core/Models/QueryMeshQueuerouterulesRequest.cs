// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMeshQueuerouterulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 队列id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 路由规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页码值
        [NameInMap("pagecurrent")]
        [Validation(Required=true)]
        public long? Pagecurrent { get; set; }

        // 页面大小
        [NameInMap("pagesize")]
        [Validation(Required=true)]
        public long? Pagesize { get; set; }

    }

}
