// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgePetorderRequest : TeaModel {
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

        // 门店id
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 原始订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 交易单号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 商家社信码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

    }

}
