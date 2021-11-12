// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class QueryAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 条件前缀, 一般传入环境ID
        [NameInMap("condition_prefix")]
        [Validation(Required=false)]
        public string ConditionPrefix { get; set; }

        // 授权状态
        [NameInMap("statuses")]
        [Validation(Required=true)]
        public List<string> Statuses { get; set; }

    }

}
