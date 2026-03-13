// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAgoraxTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户编号
        [NameInMap("external_id")]
        [Validation(Required=true)]
        public string ExternalId { get; set; }

        // 支付类型
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 订单总金额（元）
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 订单标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 描述结算信息
        [NameInMap("settle_info")]
        [Validation(Required=true)]
        public SettleInfo SettleInfo { get; set; }

        // 买家支付宝 openid
        [NameInMap("buyer_open_id")]
        [Validation(Required=false)]
        public string BuyerOpenId { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 支付授权码
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 支付场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 商户实际经营主体的小程序应用的 appid
        [NameInMap("op_app_id")]
        [Validation(Required=false)]
        public string OpAppId { get; set; }

        // 分账明细信息
        [NameInMap("royalty_parameters")]
        [Validation(Required=false)]
        public List<OpenApiRoyaltyDetailInfoPojo> RoyaltyParameters { get; set; }

        // 卖家支付宝用户 ID
        [NameInMap("seller_id")]
        [Validation(Required=false)]
        public string SellerId { get; set; }

        // 订单包含的商品列表信息
        [NameInMap("goods_details")]
        [Validation(Required=false)]
        public List<GoodsDetail> GoodsDetails { get; set; }

        // 订单绝对超时时间
        [NameInMap("time_expire")]
        [Validation(Required=false)]
        public string TimeExpire { get; set; }

    }

}
