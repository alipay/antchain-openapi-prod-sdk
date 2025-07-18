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
        [Validation(Required=false)]
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

        // 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
        [NameInMap("source")]
        [Validation(Required=false, MaxLength=10)]
        public string Source { get; set; }

        // 风险业务场景，智租版选填。默认值：PRE_RENT。
        // PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
        [NameInMap("risk_biz_scene")]
        [Validation(Required=false, MaxLength=100)]
        public string RiskBizScene { get; set; }

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

        // 枚举值：3C_RENTAL、NE_RENTAL、OTHER_RENTAL、PETS、BEAUTY、EDUCATION、FITNESS、GENERAL_INDUSTRY_OTHER
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 枚举值：ZOLOZ_V2、ZOLOZ_V3、GENERAL_INDUSTRY、APPLET_RISK
        [NameInMap("model_version")]
        [Validation(Required=false)]
        public string ModelVersion { get; set; }

    }

}
