// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgePetFundRequest : TeaModel {
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
        [Validation(Required=true)]
        public string TrafficPlatform { get; set; }

        // 买家用户id
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 关联交易单号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 订单归属主体入驻ID
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

    }

}
