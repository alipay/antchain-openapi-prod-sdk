// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    public class RegisterAbcdLimitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public string Timeout { get; set; }

        // 操作者
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
