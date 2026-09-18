// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class CreatePoiMallorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝小程序用户唯一ID
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 商户入驻主体ID（商城主体）
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商城积分消费订单号，由商城生成保证唯一（幂等键）
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 预充值来源订单号（某笔支付订单的order_id，内部反查trade_no）
        [NameInMap("source_order_id")]
        [Validation(Required=true)]
        public string SourceOrderId { get; set; }

        // 订单类型：PET_PACKAGE/PET/GOODS/MEMBER
        [NameInMap("product_mode")]
        [Validation(Required=true)]
        public string ProductMode { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 结算金额（元，两位小数，≤point_amount）
        [NameInMap("product_amount")]
        [Validation(Required=true)]
        public string ProductAmount { get; set; }

        // 冻结金额（元，两位小数，冻结/出账/分账基数）
        [NameInMap("point_amount")]
        [Validation(Required=true)]
        public string PointAmount { get; set; }

    }

}
