// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class QuerySystemParameterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境ids
        [NameInMap("env_ids")]
        [Validation(Required=true)]
        public string EnvIds { get; set; }

        // 参数名s
        [NameInMap("types")]
        [Validation(Required=false)]
        public string Types { get; set; }

    }

}
