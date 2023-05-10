// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d9fd09cd1986473d9a4b8dde727aa361.Models
{
    public class CheckInternationalDemoZolozHealthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1123
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
