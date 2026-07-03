// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ReceiveBenefithubRiskPayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务分配的平台code，8位纯大写字母code
        [NameInMap("platform_code")]
        [Validation(Required=true)]
        public string PlatformCode { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 平台code、用户唯一ID 组合出全局唯一id
        [NameInMap("user_unique_id")]
        [Validation(Required=true)]
        public string UserUniqueId { get; set; }

        // 类型：订单支付结果类、订单退款类、续费扣款类、签约成功、解约成功、订单超时类型
        // 具体如下：
        // ODRDER_PAYMENT-订单支付结果类通知、ORDER_REFUND-订单退款、RENEWAL_DEDUCTION-续费扣款、CONTRACT_SIGNED-签约成功、CONTRACT_TERMINATED-解约成功、
        // ORDER_TIMEOUT-订单超时类型
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

        // 回调结果，json数据
        // 各个平台返回的支付结果、支付退款、续费结果通知、签约、解约、订单、超时关单
        [NameInMap("callback_result")]
        [Validation(Required=true)]
        public string CallbackResult { get; set; }

    }

}
