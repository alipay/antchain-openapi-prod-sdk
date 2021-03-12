// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 可信时间信息结构
    public class TsrResponse : TeaModel {
        // hash后的信息
        [NameInMap("hashed_message")]
        [Validation(Required=true)]
        public string HashedMessage { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=true)]
        public string HashAlgorithm { get; set; }

        // 时间
        [NameInMap("ts")]
        [Validation(Required=true)]
        public string Ts { get; set; }

    }

}
