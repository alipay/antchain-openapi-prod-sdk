// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 商品询价结构
    public class CommodityEnquiryPrice : TeaModel {
        // 商品主数据编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 商品名称
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // 预付-支付金额
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public string PayAmount { get; set; }

        // 预付费-原始金额
        [NameInMap("original_amount")]
        [Validation(Required=true)]
        public string OriginalAmount { get; set; }

        // 预付费-折扣金额
        [NameInMap("discount_amount")]
        [Validation(Required=true)]
        public string DiscountAmount { get; set; }

        // 预付费-优惠券抵扣金额
        [NameInMap("coupon_amount")]
        [Validation(Required=true)]
        public string CouponAmount { get; set; }

        // 原订购剩余价值，用于变配场景
        [NameInMap("subscription_unused_amount")]
        [Validation(Required=true)]
        public string SubscriptionUnusedAmount { get; set; }

        // 命中的活动编码
        [NameInMap("activity_code")]
        [Validation(Required=true)]
        public string ActivityCode { get; set; }

        // 命中的活动名称
        [NameInMap("activity_name")]
        [Validation(Required=true)]
        public string ActivityName { get; set; }

        // 命中的定价计划ID
        [NameInMap("price_plan_id")]
        [Validation(Required=true)]
        public long? PricePlanId { get; set; }

        // 命中的定价约束ID
        [NameInMap("price_constraint_id")]
        [Validation(Required=true)]
        public long? PriceConstraintId { get; set; }

        // 币种，元：CNY
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
        [NameInMap("min_duration_of_valid_pay_amount")]
        [Validation(Required=false)]
        public OrderDuration MinDurationOfValidPayAmount { get; set; }

    }

}
