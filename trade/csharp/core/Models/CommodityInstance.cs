// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 商品实例
    public class CommodityInstance : TeaModel {
        // 订单号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 销售主体，不传默认ZL6
        [NameInMap("ou")]
        [Validation(Required=false)]
        public string Ou { get; set; }

        // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 订购时长
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

        // 	
        // 商品订购属性，开通型商品部需要填写
        [NameInMap("commodity_attrs")]
        [Validation(Required=false)]
        public List<CommodityOrderAttribute> CommodityAttrs { get; set; }

        // 履约选项
        [NameInMap("fulfillment_options")]
        [Validation(Required=false)]
        public FulfillmentOptions FulfillmentOptions { get; set; }

        // 实例ID，续费/变配场景必传
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
        [NameInMap("prepay_amount")]
        [Validation(Required=false)]
        public PrepayAmount PrepayAmount { get; set; }

        // 后付商品签约价，用于在履约阶段生成一客一价
        [NameInMap("post_pay_price")]
        [Validation(Required=false)]
        public PostPayPrice PostPayPrice { get; set; }

    }

}
