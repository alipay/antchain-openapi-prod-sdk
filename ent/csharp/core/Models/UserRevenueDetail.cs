// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 用户收益明细
    public class UserRevenueDetail : TeaModel {
        // 累计收益
        [NameInMap("accumulative_revenue")]
        [Validation(Required=true)]
        public Revenue AccumulativeRevenue { get; set; }

        // 待发放粉丝粒数量，单位分个。
        [NameInMap("pending_token_amount")]
        [Validation(Required=true)]
        public long? PendingTokenAmount { get; set; }

        // 作品名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 可兑现粉丝粒数量，单位分个。
        [NameInMap("redeemable_token_amount")]
        [Validation(Required=true)]
        public long? RedeemableTokenAmount { get; set; }

        // 已兑现粉丝粒数量，单位分个
        [NameInMap("redeemed_token_amount")]
        [Validation(Required=true)]
        public long? RedeemedTokenAmount { get; set; }

        // 已发放粉丝粒数量，单位分个。
        [NameInMap("released_token_amount")]
        [Validation(Required=true)]
        public long? ReleasedTokenAmount { get; set; }

        // 粉丝粒单价，单位分
        [NameInMap("token_price")]
        [Validation(Required=true)]
        public long? TokenPrice { get; set; }

        // 可零收益
        [NameInMap("withdraw_revenue")]
        [Validation(Required=true)]
        public Revenue WithdrawRevenue { get; set; }

    }

}
