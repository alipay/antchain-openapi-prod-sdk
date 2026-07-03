// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyBenefithubRiskPayunilateralRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务操作类型,目前只支持下单
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 外部支付的订单号
        [NameInMap("payment_no")]
        [Validation(Required=true)]
        public string PaymentNo { get; set; }

        // 订单状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 订单金额
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public string OrderAmount { get; set; }

        // 订单实际支付金额
        [NameInMap("payment_amount")]
        [Validation(Required=true)]
        public string PaymentAmount { get; set; }

        // 支付时间
        [NameInMap("payment_time")]
        [Validation(Required=true)]
        public string PaymentTime { get; set; }

        // 支付使用的方式
        [NameInMap("payment_method_type")]
        [Validation(Required=true)]
        public string PaymentMethodType { get; set; }

        // 三方支付流水号
        [NameInMap("cap_num")]
        [Validation(Required=true)]
        public string CapNum { get; set; }

        // 支付通道商户号
        [NameInMap("merchant_no")]
        [Validation(Required=false)]
        public string MerchantNo { get; set; }

        // 订单类型，订阅、单次购买等
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 订单来源
        [NameInMap("order_source")]
        [Validation(Required=true)]
        public string OrderSource { get; set; }

        // 平台code，由蚂蚁数科颁发的特定平台code，用于报告产品授权使用
        [NameInMap("platform_code")]
        [Validation(Required=true)]
        public string PlatformCode { get; set; }

        // 用户唯一id，流量平台提供，内部结合platformCode 组成唯一code
        [NameInMap("user_unique_id")]
        [Validation(Required=true)]
        public string UserUniqueId { get; set; }

        // 产品code，具体的报告产品；不同产品价格、展示内容可能均不一样，可通过产品code区分不同场景
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
