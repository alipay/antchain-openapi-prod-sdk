// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CreateDubbridgePetmallorderRequest : TeaModel {
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

        // 商户入驻id
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商城订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 关联交易单号，储值卡来源 trade_no，储值卡金额只能消耗该 trade_no 下的余额
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品标价，单位：元
        [NameInMap("settle_amount")]
        [Validation(Required=true)]
        public string SettleAmount { get; set; }

        // 储值卡支付结算金额，用于冻结/出账/分账的基数，单位元，两位小数
        [NameInMap("point_amount")]
        [Validation(Required=true)]
        public string PointAmount { get; set; }

    }

}
