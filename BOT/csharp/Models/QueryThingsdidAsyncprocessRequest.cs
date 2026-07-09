// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryThingsdidAsyncprocessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要查询的实体Did，可为空
        [NameInMap("thing_did")]
        [Validation(Required=false)]
        public string ThingDid { get; set; }

        // 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

    }

}
