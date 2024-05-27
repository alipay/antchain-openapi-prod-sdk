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

        // 销售主体，不传默认ZL6
        [NameInMap("ou")]
        [Validation(Required=false)]
        public string Ou { get; set; }

        // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配
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

        // 价格策略
        [NameInMap("price_strategy")]
        [Validation(Required=false)]
        public PriceStrategy PriceStrategy { get; set; }

        // 实例ID，续费/变配场景必传
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 售卖市场。10100000：鹊凿市场；12000002：国际ZAN市场；其他市场编码请联系中台获取
        [NameInMap("sale_market")]
        [Validation(Required=true)]
        public string SaleMarket { get; set; }

        // 扩展属性，JSON字符串
        [NameInMap("extended_properties")]
        [Validation(Required=false)]
        public string ExtendedProperties { get; set; }

        // 批次流水号，外部合同下单场景，传入向中台申请的合同ID
        [NameInMap("batch_biz_no")]
        [Validation(Required=false)]
        public string BatchBizNo { get; set; }

        // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
        [NameInMap("prepay_amount")]
        [Validation(Required=false)]
        public PrepayAmount PrepayAmount { get; set; }

    }

}
