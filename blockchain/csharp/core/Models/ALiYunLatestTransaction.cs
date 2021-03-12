// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云最新交易信息
    public class ALiYunLatestTransaction : TeaModel {
        // hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // transaction_v10_type
        [NameInMap("transaction_v10_type")]
        [Validation(Required=false)]
        public string TransactionV10Type { get; set; }

        // trans_type_v6
        [NameInMap("trans_type_v6")]
        [Validation(Required=false)]
        public string TransTypeV6 { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

    }

}
