// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 链上交易结构
    public class Transaction : TeaModel {
        // 交易数据，转换位十六进制
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 卡密管理员链上ID，64位十六进制。
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 交易hash，十六进制编码
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 交易随机数
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public long? Nonce { get; set; }

        // 交易时间
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // from账户对应的公钥，128位十六进制。
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 交易签名，十六进制编码
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 交易目标地址，64位十六进制。
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

    }

}
