// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAccountSignatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 加密算法
        [NameInMap("algorithm")]
        [Validation(Required=true)]
        public string Algorithm { get; set; }

        // 区块链唯一标示
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 用户需要签名的原始数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 签名账户在原系统中的唯一标示
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

    }

}
