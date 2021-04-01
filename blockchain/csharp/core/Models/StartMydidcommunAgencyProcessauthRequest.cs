// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyProcessauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 处理人did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 处理授权的原始请求流
        [NameInMap("request_raw")]
        [Validation(Required=true)]
        public string RequestRaw { get; set; }

    }

}
