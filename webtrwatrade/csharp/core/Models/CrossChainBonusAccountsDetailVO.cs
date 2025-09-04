// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 跨链账号红利明细
    public class CrossChainBonusAccountsDetailVO : TeaModel {
        // 明细ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 交易链上Hash
        [NameInMap("transaction_hash")]
        [Validation(Required=false)]
        public string TransactionHash { get; set; }

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

        // 交易类型
        [NameInMap("transaction_type")]
        [Validation(Required=false)]
        public string TransactionType { get; set; }

        // 对手地址
        [NameInMap("counter_address")]
        [Validation(Required=false)]
        public string CounterAddress { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=false)]
        public long? GmtCreated { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

    }

}
