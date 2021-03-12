// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 更新did auth paylod结构体
    public class UpdateDidAuthPayload : TeaModel {
        // 新公钥的实际控制者
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // 旧Auth Key的过期时间
        [NameInMap("previous_auth_key_expire")]
        [Validation(Required=true)]
        public string PreviousAuthKeyExpire { get; set; }

        // 更新Did doc的版本
        [NameInMap("previous_version")]
        [Validation(Required=true)]
        public long? PreviousVersion { get; set; }

        // 新DID Auth key的public key id
        [NameInMap("public_key_id")]
        [Validation(Required=true)]
        public string PublicKeyId { get; set; }

        // 密钥对生成算法
        [NameInMap("public_key_type")]
        [Validation(Required=true)]
        public string PublicKeyType { get; set; }

        // 公钥的实际值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
