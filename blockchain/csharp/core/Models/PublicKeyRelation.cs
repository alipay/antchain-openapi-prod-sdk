// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据授权服务公钥矩阵关系结构体
    public class PublicKeyRelation : TeaModel {
        // 公钥颁发者ID
        [NameInMap("issuer_id")]
        [Validation(Required=true)]
        public string IssuerId { get; set; }

        // 公钥接受者ID
        [NameInMap("recipient_id")]
        [Validation(Required=true)]
        public string RecipientId { get; set; }

    }

}
