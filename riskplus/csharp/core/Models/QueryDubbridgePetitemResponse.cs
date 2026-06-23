// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgePetitemResponse : TeaModel {
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

        // 小程序客户号
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 唯一标识的渠道号
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=false)]
        public string StoreId { get; set; }

        // 分期订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

        // 活体已打款金额
        [NameInMap("pet_amount")]
        [Validation(Required=false)]
        public string PetAmount { get; set; }

        // 分期服务费(贴息金额)
        [NameInMap("service_amount")]
        [Validation(Required=false)]
        public string ServiceAmount { get; set; }

        // 用户已还本金
        [NameInMap("repaid_amount")]
        [Validation(Required=false)]
        public string RepaidAmount { get; set; }

        // 应还本金
        [NameInMap("due_amount")]
        [Validation(Required=false)]
        public string DueAmount { get; set; }

        // 应还罚息
        [NameInMap("due_penalty_amount")]
        [Validation(Required=false)]
        public string DuePenaltyAmount { get; set; }

        // 可退还资方金额
        [NameInMap("refund_fund_amount")]
        [Validation(Required=false)]
        public string RefundFundAmount { get; set; }

    }

}
