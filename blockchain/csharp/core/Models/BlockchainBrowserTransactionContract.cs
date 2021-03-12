// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链浏览器合约链交易内容
    public class BlockchainBrowserTransactionContract : TeaModel {
        // data
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // gas
        [NameInMap("gas")]
        [Validation(Required=true)]
        public long? Gas { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // nonce
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // period
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // signature_list
        [NameInMap("signature_list")]
        [Validation(Required=true)]
        public List<string> SignatureList { get; set; }

        // timestamp
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // transaction_type
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
