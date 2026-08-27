// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class OpenEnterpriseProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业id
        [NameInMap("enterprise_id")]
        [Validation(Required=true)]
        public string EnterpriseId { get; set; }

        // 租户ID（账户开通时返回）
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务侧订单ID（全局唯一，幂等键，≤32位）
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 订购时长类型 Y 单位：年
        [NameInMap("duration_type")]
        [Validation(Required=true)]
        public string DurationType { get; set; }

        // 订购时长
        [NameInMap("duration_value")]
        [Validation(Required=true)]
        public string DurationValue { get; set; }

        // 开通金额（元）
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public string PayAmount { get; set; }

        // 付款方支付宝UID
        [NameInMap("payer_alipay_uid")]
        [Validation(Required=true)]
        public string PayerAlipayUid { get; set; }

        // 回调地址，业务方期望将支付结果&产品开通结果回调到自身业务系统的地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

    }

}
