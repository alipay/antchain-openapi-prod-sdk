// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryApiDwhTransactionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链bizid
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // end_timestamp
        [NameInMap("end_timestamp")]
        [Validation(Required=false)]
        public long? EndTimestamp { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // pageNo
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // pageSize
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // startTimestamp
        [NameInMap("start_timestamp")]
        [Validation(Required=false)]
        public long? StartTimestamp { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // transactionHash
        [NameInMap("transaction_hash")]
        [Validation(Required=false)]
        public string TransactionHash { get; set; }

        // transactionType
        [NameInMap("transaction_type")]
        [Validation(Required=false)]
        public long? TransactionType { get; set; }

    }

}
