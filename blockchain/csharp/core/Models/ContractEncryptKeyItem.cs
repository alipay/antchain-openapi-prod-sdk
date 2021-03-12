// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约加密字段
    public class ContractEncryptKeyItem : TeaModel {
        // 字段对应的id
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 0:encrypt_text,
        // 1:encrypt_array_text,
        // 2:encrypt_int
        // 3:encrypt_array_int
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 字段对应的数据
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
