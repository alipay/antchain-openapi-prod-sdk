// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgePetrefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 渠道编码
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 流量平台
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 退款单号，渠道/商城侧唯一
        [NameInMap("refund_no")]
        [Validation(Required=true)]
        public string RefundNo { get; set; }

        // 业务订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 关联交易单号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 活体部分退款金额，单位元，两位小数
        [NameInMap("pet_refund_amount")]
        [Validation(Required=false)]
        public string PetRefundAmount { get; set; }

        // 商城部分退款金额，单位元，两位小数
        [NameInMap("mall_refund_amount")]
        [Validation(Required=false)]
        public string MallRefundAmount { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=false)]
        public string RefundReason { get; set; }

    }

}
