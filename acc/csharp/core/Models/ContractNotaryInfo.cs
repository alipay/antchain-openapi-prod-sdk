// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 存证信息
    public class ContractNotaryInfo : TeaModel {
        // 存证的内容哈希值
        // 
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 存证相关联的文档ID
        // 
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

        // 存证事务ID
        // 
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 存证地址
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
