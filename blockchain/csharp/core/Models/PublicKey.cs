// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据授权服务用户公钥结构体
    public class PublicKey : TeaModel {
        // 公钥颁发者ID
        [NameInMap("issuer_id")]
        [Validation(Required=true, MaxLength=100)]
        public string IssuerId { get; set; }

        // 公钥内容
        [NameInMap("public_key_content")]
        [Validation(Required=true)]
        public string PublicKeyContent { get; set; }

        // 公钥接受者ID
        [NameInMap("recipient_id")]
        [Validation(Required=true, MaxLength=100)]
        public string RecipientId { get; set; }

    }

}
