// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 优惠券模型
    public class Coupon : TeaModel {
        // 优惠券ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231313</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 优惠券名称,前端展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX优惠券</para>
        /// </summary>
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 优惠券模板名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXX</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
        /// <summary>
        /// <b>Example:</b>
        /// <para>VOUCHER</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 已使用金额，单位（分）。
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("used_amount")]
        [Validation(Required=false)]
        public string UsedAmount { get; set; }

        // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
        /// <summary>
        /// <b>Example:</b>
        /// <para>AVAILABLE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 有效期结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 模板id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("youhui_template_id")]
        [Validation(Required=true)]
        public long? YouhuiTemplateId { get; set; }

        // 优惠券=折扣券时使用，如0.75
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.75</para>
        /// </summary>
        [NameInMap("discount_rate")]
        [Validation(Required=false)]
        public string DiscountRate { get; set; }

        // 优惠券类型=满减券时使用，如满2000元
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000.00</para>
        /// </summary>
        [NameInMap("full_amount")]
        [Validation(Required=false)]
        public string FullAmount { get; set; }

        // 可以使用的总次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("usage_count")]
        [Validation(Required=true)]
        public long? UsageCount { get; set; }

        // 已使用次数（冻结次数）
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("used_count")]
        [Validation(Required=true)]
        public long? UsedCount { get; set; }

        // 适用产品：通用/ECS/RDS
        /// <summary>
        /// <b>Example:</b>
        /// <para>通用</para>
        /// </summary>
        [NameInMap("product_list")]
        [Validation(Required=true)]
        public string ProductList { get; set; }

        // 适用订单类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>BUY</para>
        /// </summary>
        [NameInMap("order_type_list")]
        [Validation(Required=true)]
        public string OrderTypeList { get; set; }

        //  币种CurrencyCode CNY 代表人民币 USD代表美元
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.00</para>
        /// </summary>
        [NameInMap("high_precision_amount")]
        [Validation(Required=true)]
        public string HighPrecisionAmount { get; set; }

        // 单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.001</para>
        /// </summary>
        [NameInMap("high_precision_used_amount")]
        [Validation(Required=true)]
        public string HighPrecisionUsedAmount { get; set; }

        // 单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.001</para>
        /// </summary>
        [NameInMap("high_precision_available_amount")]
        [Validation(Required=true)]
        public string HighPrecisionAvailableAmount { get; set; }

    }

}
