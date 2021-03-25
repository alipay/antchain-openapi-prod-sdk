// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class GetConsumecardOrderwithdrawresultResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 提现任务期望提现的金额(单位:元,精确到分)
        [NameInMap("expected_withdraw_amount")]
        [Validation(Required=false)]
        public string ExpectedWithdrawAmount { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 需要审批后才能提现的交易订单数量
        [NameInMap("withdraw_approval_order_count")]
        [Validation(Required=false)]
        public long? WithdrawApprovalOrderCount { get; set; }

        // 提现单编号
        [NameInMap("withdraw_biz_id")]
        [Validation(Required=false)]
        public string WithdrawBizId { get; set; }

        // 提现成功的总金额(单位:元,精确到分)
        [NameInMap("withdraw_total_amount")]
        [Validation(Required=false)]
        public string WithdrawTotalAmount { get; set; }

        // 提现成功的总笔数
        [NameInMap("withdraw_total_count")]
        [Validation(Required=false)]
        public long? WithdrawTotalCount { get; set; }

    }

}
