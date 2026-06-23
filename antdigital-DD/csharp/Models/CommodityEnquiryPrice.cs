// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品询价结构
    public class CommodityEnquiryPrice : TeaModel {
        // 商品主数据编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KXSFFM00264687</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试商品</para>
        /// </summary>
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // 预付-支付金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.00</para>
        /// </summary>
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public string PayAmount { get; set; }

        // 预付费-原始金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>200.00</para>
        /// </summary>
        [NameInMap("original_amount")]
        [Validation(Required=true)]
        public string OriginalAmount { get; set; }

        // 预付费-折扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.00</para>
        /// </summary>
        [NameInMap("discount_amount")]
        [Validation(Required=true)]
        public string DiscountAmount { get; set; }

        // 预付费-优惠券抵扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.00</para>
        /// </summary>
        [NameInMap("coupon_amount")]
        [Validation(Required=true)]
        public string CouponAmount { get; set; }

        // 原订购剩余价值，用于变配场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>50.00</para>
        /// </summary>
        [NameInMap("subscription_unused_amount")]
        [Validation(Required=true)]
        public string SubscriptionUnusedAmount { get; set; }

        // 命中的活动编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>a05d8efc-b1c8-42a0-9666-98f419d4e2eb</para>
        /// </summary>
        [NameInMap("activity_code")]
        [Validation(Required=true)]
        public string ActivityCode { get; set; }

        // 命中的活动名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试折扣活动</para>
        /// </summary>
        [NameInMap("activity_name")]
        [Validation(Required=true)]
        public string ActivityName { get; set; }

        // 命中的定价计划ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("price_plan_id")]
        [Validation(Required=true)]
        public long? PricePlanId { get; set; }

        // 命中的定价约束ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000</para>
        /// </summary>
        [NameInMap("price_constraint_id")]
        [Validation(Required=true)]
        public long? PriceConstraintId { get; set; }

        // 币种，元：CNY
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
        [NameInMap("min_duration_of_valid_pay_amount")]
        [Validation(Required=false)]
        public OrderDuration MinDurationOfValidPayAmount { get; set; }

        // 预付费-折扣率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.75</para>
        /// </summary>
        [NameInMap("discount_rate")]
        [Validation(Required=true)]
        public string DiscountRate { get; set; }

        // 原始BD权限价金额，白名单商品会返回此价格
        /// <summary>
        /// <b>Example:</b>
        /// <para>160.00</para>
        /// </summary>
        [NameInMap("original_bd_amount")]
        [Validation(Required=false)]
        public string OriginalBdAmount { get; set; }

        // 原始成本价金额，白名单商品会返回此价格
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.00</para>
        /// </summary>
        [NameInMap("original_cost_amount")]
        [Validation(Required=false)]
        public string OriginalCostAmount { get; set; }

    }

}
