// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgePetcashierRequest : TeaModel {
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

        // 商家社信码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 收银台模板渠道社信码
        [NameInMap("template_scene_cert_no")]
        [Validation(Required=false)]
        public string TemplateSceneCertNo { get; set; }

        // 交易金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 订单标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 商品SKU
        [NameInMap("sku")]
        [Validation(Required=false)]
        public string Sku { get; set; }

        // 买家Id
        [NameInMap("buyer_id")]
        [Validation(Required=false)]
        public string BuyerId { get; set; }

        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 2026-07-20 00:16:35
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public string ExpireTime { get; set; }

        // 支付机构编码
        [NameInMap("pay_institution_code")]
        [Validation(Required=false)]
        public string PayInstitutionCode { get; set; }

        // 交易场景
        [NameInMap("pay_scene")]
        [Validation(Required=true)]
        public string PayScene { get; set; }

        // 支付后返回地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 是否开启分账
        [NameInMap("enable_transfer")]
        [Validation(Required=false)]
        public string EnableTransfer { get; set; }

        // 渠道扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public PetCashierApplyExtInfo ExtInfo { get; set; }

    }

}
