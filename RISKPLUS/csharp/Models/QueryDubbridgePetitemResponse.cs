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

        // 子渠道号(唯一标识)
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

        // 渠道code
        [NameInMap("channel_code")]
        [Validation(Required=false)]
        public string ChannelCode { get; set; }

        // 用户已支出金额
        [NameInMap("consumed_amount")]
        [Validation(Required=false)]
        public string ConsumedAmount { get; set; }

        // 商城消费结算金额
        [NameInMap("mall_consume_settle_amount")]
        [Validation(Required=false)]
        public string MallConsumeSettleAmount { get; set; }

        // 商城消费在途未结算金额
        [NameInMap("mall_consume_unsettle_amount")]
        [Validation(Required=false)]
        public string MallConsumeUnsettleAmount { get; set; }

        // 已还金额
        [NameInMap("repaid_amount")]
        [Validation(Required=false)]
        public string RepaidAmount { get; set; }

        // 解约后剩余应还金额
        [NameInMap("remaining_amount")]
        [Validation(Required=false)]
        public string RemainingAmount { get; set; }

        // 解约后退还给用户的金额
        [NameInMap("refund_user_amount")]
        [Validation(Required=false)]
        public string RefundUserAmount { get; set; }

        // 是否逾期(默认false)
        [NameInMap("overdue")]
        [Validation(Required=false)]
        public bool? Overdue { get; set; }

    }

}
