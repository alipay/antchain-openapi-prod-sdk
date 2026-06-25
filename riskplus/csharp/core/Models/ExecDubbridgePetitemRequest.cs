// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecDubbridgePetitemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 小程序客户号
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 子渠道号(唯一标识)
        [NameInMap("traffic_platform")]
        [Validation(Required=true)]
        public string TrafficPlatform { get; set; }

        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 分期订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 商城余额
        [NameInMap("goods_balance")]
        [Validation(Required=true)]
        public string GoodsBalance { get; set; }

        // 渠道号
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

    }

}
