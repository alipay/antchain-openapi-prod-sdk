// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true, MaxLength=2000)]
        public string UserName { get; set; }

        // 用户证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 用户手机号码
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 支付宝账户 UserId，智租版可选
        [NameInMap("alipay_user_id")]
        [Validation(Required=false, MaxLength=20)]
        public string AlipayUserId { get; set; }

        // 下单渠道，智租版必选。枚举值：ALIPAY-支付宝；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
        [NameInMap("source")]
        [Validation(Required=false, MaxLength=10)]
        public string Source { get; set; }

        // 商品详情，智租版可选
        [NameInMap("item_detail")]
        [Validation(Required=false)]
        public ItemDetail ItemDetail { get; set; }

        // 价格详情，智租版可选
        [NameInMap("price_detail")]
        [Validation(Required=false)]
        public PriceDetail PriceDetail { get; set; }

        // 物流信息，智租版可选
        [NameInMap("delivery_detail")]
        [Validation(Required=false)]
        public DeliveryDetail DeliveryDetail { get; set; }

    }

}
