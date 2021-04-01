// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitNotaryTransactionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户的身份信息
        [NameInMap("customer")]
        [Validation(Required=true)]
        public IdentityParam Customer { get; set; }

        // 扩展字段
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 托管用户信息
        [NameInMap("trustee")]
        [Validation(Required=false)]
        public IdentityParam Trustee { get; set; }

        // 是否使⽤用可信时间戳，默认为false
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
