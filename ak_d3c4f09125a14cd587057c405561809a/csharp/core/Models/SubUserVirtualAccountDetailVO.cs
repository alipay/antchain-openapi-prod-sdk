// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 虚拟子账户明细
    public class SubUserVirtualAccountDetailVO : TeaModel {
        // 明细ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 交易前余额
        [NameInMap("pre_balance")]
        [Validation(Required=false)]
        public string PreBalance { get; set; }

        // 交易数量
        [NameInMap("transaction_amount")]
        [Validation(Required=false)]
        public string TransactionAmount { get; set; }

        // 交易后余额
        [NameInMap("post_balance")]
        [Validation(Required=false)]
        public string PostBalance { get; set; }

        // 交易类型(TRANSFER_IN、TRANSFER_OUT)
        [NameInMap("transaction_type")]
        [Validation(Required=false)]
        public string TransactionType { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=false)]
        public long? GmtCreated { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 交易状态（PENDING/CONFIRMED/INVALID）
        [NameInMap("transaction_status")]
        [Validation(Required=false)]
        public string TransactionStatus { get; set; }

    }

}
