// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 代扣订单信息
    public class DeductOrderInfo : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户支付宝uid
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 订单创建时间
        [NameInMap("order_create_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderCreateDate { get; set; }

        // 订单状态
        [NameInMap("order_status_code")]
        [Validation(Required=false)]
        public string OrderStatusCode { get; set; }

        // 订单子状态,ORDER_FULFILLMENT: 履约中;ORDER_FULFILLMENT_COMPLETED:履约完成;
        [NameInMap("order_sub_status_code")]
        [Validation(Required=true)]
        public string OrderSubStatusCode { get; set; }

        // 总金额，单位为分
        [NameInMap("total_rent_money")]
        [Validation(Required=true)]
        public long? TotalRentMoney { get; set; }

    }

}
