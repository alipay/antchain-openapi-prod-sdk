// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryProjectInfoResponse : TeaModel {
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

        // 总粉丝粒数，单位分个
        [NameInMap("total_token_amount")]
        [Validation(Required=false)]
        public long? TotalTokenAmount { get; set; }

        // 未发放粉丝粒数，单位分个
        [NameInMap("remaining_token_amount")]
        [Validation(Required=false)]
        public long? RemainingTokenAmount { get; set; }

        // 已发放粉丝粒数，单位分个
        [NameInMap("released_token_amount")]
        [Validation(Required=false)]
        public long? ReleasedTokenAmount { get; set; }

        // 已提现粉丝粒数，单位分个
        [NameInMap("redeemed_token_amount")]
        [Validation(Required=false)]
        public long? RedeemedTokenAmount { get; set; }

        // 总资金金额，单位分
        [NameInMap("total_prize_amount")]
        [Validation(Required=false)]
        public Money TotalPrizeAmount { get; set; }

        // 未消耗资金金额，单位分
        [NameInMap("unused_prize_amount")]
        [Validation(Required=false)]
        public Money UnusedPrizeAmount { get; set; }

        // 已消耗资金金额，单位分
        [NameInMap("used_prize_amount")]
        [Validation(Required=false)]
        public Money UsedPrizeAmount { get; set; }

        // 开始发放时间
        [NameInMap("allocation_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AllocationStartTime { get; set; }

        // 停止发放时间
        [NameInMap("allocation_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AllocationEndTime { get; set; }

        // 开始兑现时间
        [NameInMap("redeem_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RedeemStartTime { get; set; }

        // 停止兑现时间
        [NameInMap("redeem_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RedeemEndTime { get; set; }

        // 发放该项目粉丝粒的订单内票数总和
        [NameInMap("ticket_number")]
        [Validation(Required=false)]
        public long? TicketNumber { get; set; }

        // 当前粉丝粒单价，单位分
        [NameInMap("current_token_price")]
        [Validation(Required=false)]
        public Money CurrentTokenPrice { get; set; }

        // 粉丝粒保底价格，单位分
        [NameInMap("min_token_price")]
        [Validation(Required=false)]
        public Money MinTokenPrice { get; set; }

        // 发放区间信息
        [NameInMap("current_stage")]
        [Validation(Required=false)]
        public Stage CurrentStage { get; set; }

        // 所有发放区间信息
        [NameInMap("all_stages")]
        [Validation(Required=false)]
        public List<Stage> AllStages { get; set; }

        // 项目参与用户数
        [NameInMap("project_user_num")]
        [Validation(Required=false)]
        public long? ProjectUserNum { get; set; }

        // 项目订单总数
        [NameInMap("project_order_num")]
        [Validation(Required=false)]
        public long? ProjectOrderNum { get; set; }

        // 项目已售商品总数
        [NameInMap("project_item_num")]
        [Validation(Required=false)]
        public long? ProjectItemNum { get; set; }

    }

}
