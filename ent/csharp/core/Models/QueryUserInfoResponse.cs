// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryUserInfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 已获得粉丝粒总数，单位分个
        [NameInMap("gained_token_amount")]
        [Validation(Required=false)]
        public long? GainedTokenAmount { get; set; }

        // 当前粉丝粒持有数量，单位分个
        [NameInMap("current_token_amount")]
        [Validation(Required=false)]
        public long? CurrentTokenAmount { get; set; }

        // 已兑现粉丝粒数量，单位分个
        [NameInMap("redeemed_token_amount")]
        [Validation(Required=false)]
        public long? RedeemedTokenAmount { get; set; }

        // 累计获得奖金
        [NameInMap("accumulative_revenue")]
        [Validation(Required=false)]
        public Revenue AccumulativeRevenue { get; set; }

        // 当前可兑奖金
        [NameInMap("current_revenue")]
        [Validation(Required=false)]
        public Revenue CurrentRevenue { get; set; }

        // 已兑现奖金
        [NameInMap("redeemed_revenue")]
        [Validation(Required=false)]
        public Revenue RedeemedRevenue { get; set; }

        // 自购商品数量
        [NameInMap("buy_amount_from_self")]
        [Validation(Required=false)]
        public long? BuyAmountFromSelf { get; set; }

        // 分享购买商品数量
        [NameInMap("buy_amount_from_share")]
        [Validation(Required=false)]
        public long? BuyAmountFromShare { get; set; }

    }

}
