// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class QueryPriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商品主数据编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 租户ID，和租户名称二选一必填
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 8位租户名，和租户ID二选一必选
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 商品数量，不传则默认1
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public long? Quantity { get; set; }

        // 业务发生时间，不传则默认当前时间
        [NameInMap("biz_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BizTime { get; set; }

        // 订购周期，基于周期定价的商品必填
        [NameInMap("order_duration")]
        [Validation(Required=false)]
        public OrderDuration OrderDuration { get; set; }

        // 商品规格列表，按实际商品定义的和价格相关的属性传入
        // 1.续费询价不需要传
        // 2.变配询价需要传入变化的规格属性
        [NameInMap("commodity_order_attrs")]
        [Validation(Required=false)]
        public List<CommodityOrderAttribute> CommodityOrderAttrs { get; set; }

        // 币种，元：CNY，不传默认CNY
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 优惠券ID
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // 不填默认为NEW；NEW：新购；RENEW：续费；MODIFY：变配
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 实例ID，续费/变配场景必传
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

    }

}
