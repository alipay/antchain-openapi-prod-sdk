// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 交易详情
    public class TransactionInfo : TeaModel {
        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 交易hash
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 交易块高
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 交易所在块高
        [NameInMap("blockhash")]
        [Validation(Required=true)]
        public string Blockhash { get; set; }

        // 交易来源
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 交易地址
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 交易类型
        [NameInMap("txtype")]
        [Validation(Required=true)]
        public long? Txtype { get; set; }

        // 转账额度
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // logs
        [NameInMap("logs")]
        [Validation(Required=true)]
        public string Logs { get; set; }

        // 燃料消耗
        [NameInMap("gasused")]
        [Validation(Required=true)]
        public long? Gasused { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 拓展json字段
        [NameInMap("json")]
        [Validation(Required=true)]
        public string Json { get; set; }

    }

}
