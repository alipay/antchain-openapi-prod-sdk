// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链最新交易信息
    public class BlockchainBrowserLatestTransaction : TeaModel {
        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // transactionV10Type
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

    }

}
