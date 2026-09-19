// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgePetcashierGeneralRequest : TeaModel {
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

        // 买家Id
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 业务订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 订单金额，单位元，两位小数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 产品模式：PET_PACKAGE-领宠模式（活体+商城套餐）、PET-单活体、GOODS-单商品、MEMBER-会员订阅
        [NameInMap("product_mode")]
        [Validation(Required=true)]
        public string ProductMode { get; set; }

        // 订单标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public string ExpireTime { get; set; }

        // 支付场景
        [NameInMap("pay_scene")]
        [Validation(Required=true)]
        public string PayScene { get; set; }

        // 订单归属主体，入驻到平台的id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 支付机构编码
        [NameInMap("pay_institution_code")]
        [Validation(Required=true)]
        public string PayInstitutionCode { get; set; }

        // 支付后返回地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 商品明细数组
        [NameInMap("product_list")]
        [Validation(Required=true)]
        public List<ProductItem> ProductList { get; set; }

        // 扩展信息，JSON串
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
