// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CallbackAntchainAtoFundNotifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ASYNC_UNSIGN_APPLY
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
