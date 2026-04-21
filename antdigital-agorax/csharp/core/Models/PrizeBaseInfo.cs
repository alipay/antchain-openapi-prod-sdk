// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 奖品基本信息
    public class PrizeBaseInfo : TeaModel {
        // 奖品ID
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

        // 奖品名称
        [NameInMap("prize_name")]
        [Validation(Required=false)]
        public string PrizeName { get; set; }

        // 奖品类型
        [NameInMap("prize_type")]
        [Validation(Required=false)]
        public string PrizeType { get; set; }

        // 奖品状态
        [NameInMap("prize_status")]
        [Validation(Required=false)]
        public string PrizeStatus { get; set; }

        // 预算金额
        [NameInMap("budget_amount")]
        [Validation(Required=false)]
        public long? BudgetAmount { get; set; }

    }

}
