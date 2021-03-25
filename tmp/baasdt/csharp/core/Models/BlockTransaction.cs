// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 交易
    public class BlockTransaction : TeaModel {
        // 交易信息
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 交易扩展信息
        [NameInMap("extension")]
        [Validation(Required=true)]
        public List<Extension> Extension { get; set; }

        // 交易发起方
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 交易gas消耗
        [NameInMap("gas")]
        [Validation(Required=true)]
        public long? Gas { get; set; }

        // 分组id，暂时没用
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 交易哈希
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 交易随机数
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 交易时间
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 交易签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public List<string> Signature { get; set; }

        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 交易接收方
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 2
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 交易转账金额
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 2
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

    }

}
