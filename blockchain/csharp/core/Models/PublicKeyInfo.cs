// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // waas公钥信息
    public class PublicKeyInfo : TeaModel {
        // 公钥id
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 公钥内容
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 算法类型
        [NameInMap("sign_type")]
        [Validation(Required=true)]
        public string SignType { get; set; }

        // 过期时间戳（毫秒）
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 公钥状态，0:不可用 1:可用
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 创建者的did
        [NameInMap("controller")]
        [Validation(Required=false)]
        public string Controller { get; set; }

    }

}
