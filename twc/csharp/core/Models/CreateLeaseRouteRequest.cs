// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseRouteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 方法名
        [NameInMap("route")]
        [Validation(Required=true)]
        public string Route { get; set; }

        // 具体业务字段，json形式
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

    }

}
