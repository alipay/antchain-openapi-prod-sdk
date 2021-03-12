// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云交易查询信息
    public class ALiYunTransaction : TeaModel {
        // tx_type
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public string TxType { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // timestamp
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // period
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        // nonce
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // gas
        [NameInMap("gas")]
        [Validation(Required=false)]
        public string Gas { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // signatures
        [NameInMap("signatures")]
        [Validation(Required=false)]
        public List<string> Signatures { get; set; }

        // extentions
        [NameInMap("extentions")]
        [Validation(Required=false)]
        public List<string> Extentions { get; set; }

    }

}
