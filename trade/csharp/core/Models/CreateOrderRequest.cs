// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class CreateOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务流水号，调用方指定，幂等号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 租户ID，和租户名称二选一必填
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户名称，和租户ID二选一必填
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 操作人ID，不填则默认和租户ID一致
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 订单类型，NEW：新购；RENEW：续费
        // 不填默认新购
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 订购周期对象，当商品是周期订阅类型时，必填
        [NameInMap("duration")]
        [Validation(Required=false)]
        public OrderDuration Duration { get; set; }

        // 优惠券ID
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // 数量，不填默认1
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public long? Quantity { get; set; }

        // 商品订购属性，开通型商品部需要填写
        [NameInMap("commodity_attrs")]
        [Validation(Required=false)]
        public List<CommodityOrderAttribute> CommodityAttrs { get; set; }

        // 履约选项
        [NameInMap("fulfillment_options")]
        [Validation(Required=false)]
        public FulfillmentOptions FulfillmentOptions { get; set; }

        // 支付选项
        [NameInMap("pay_options")]
        [Validation(Required=false)]
        public PayOptions PayOptions { get; set; }

    }

}
