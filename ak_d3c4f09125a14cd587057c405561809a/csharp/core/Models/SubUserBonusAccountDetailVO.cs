// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 红利账户明细
    public class SubUserBonusAccountDetailVO : TeaModel {
        // 明细ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 交易链上Hash
        [NameInMap("transaction_hash")]
        [Validation(Required=true)]
        public string TransactionHash { get; set; }

        // 交易前余额
        [NameInMap("pre_balance")]
        [Validation(Required=true)]
        public string PreBalance { get; set; }

        // 交易数量
        [NameInMap("transaction_amount")]
        [Validation(Required=true)]
        public string TransactionAmount { get; set; }

        // 交易后余额
        [NameInMap("post_balance")]
        [Validation(Required=true)]
        public string PostBalance { get; set; }

        // 交易类别（REPAY/TRANSFER/LOCK/UNLOCK/WITHDRAW/OTC_TRANSFER/TRANSFER_TO_VIRTUAL/WITHDRAW_FROM_VIRTUAL）
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

        // 对手地址
        [NameInMap("counter_address")]
        [Validation(Required=true)]
        public string CounterAddress { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public long? GmtCreated { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 交易状态（PENDING/CONFIRMED/INVALID）
        [NameInMap("transaction_status")]
        [Validation(Required=true)]
        public string TransactionStatus { get; set; }

    }

}
