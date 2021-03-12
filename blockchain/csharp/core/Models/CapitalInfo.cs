// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 营销分销推广人账户流水信息
    public class CapitalInfo : TeaModel {
        // 记录流水额度
        [NameInMap("balance_log")]
        [Validation(Required=true)]
        public string BalanceLog { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 记录时间
        [NameInMap("time_log")]
        [Validation(Required=true)]
        public long? TimeLog { get; set; }

        // 链上地址
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
