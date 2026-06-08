// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
    public class StockUseRule : TeaModel {
        // 【发放总上限】 最大发券数
        [NameInMap("max_coupons")]
        [Validation(Required=true)]
        public long? MaxCoupons { get; set; }

        // 【总预算】 总消耗金额，单位：分。
        [NameInMap("max_amount")]
        [Validation(Required=true)]
        public long? MaxAmount { get; set; }

        // 【单天发放上限金额】 单天最高消耗金额，单位：分。
        [NameInMap("max_amount_by_day")]
        [Validation(Required=true)]
        public long? MaxAmountByDay { get; set; }

        // 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
        [NameInMap("fixed_normal_coupon")]
        [Validation(Required=true)]
        public FixedNormalCoupon FixedNormalCoupon { get; set; }

        // 【单个用户可领个数】 单个用户可领个数
        [NameInMap("max_coupons_per_user")]
        [Validation(Required=true)]
        public long? MaxCouponsPerUser { get; set; }

        // 【券或消费金类型】 券或消费金类型
        // 枚举值：
        // NORMAL：满减券
        // CUT_TO：减至券
        [NameInMap("coupon_type")]
        [Validation(Required=false)]
        public string CouponType { get; set; }

        // 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
        // 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
        [NameInMap("goods_tag")]
        [Validation(Required=false)]
        public List<string> GoodsTag { get; set; }

        // 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
        // 可选取值
        // MICROAPP:  小程序支付
        // APPPAY:  APP支付
        // PPAY:  免密支付
        // CARD:  刷卡支付
        // FACE:  人脸支付
        // OTHER:  其他支付，公众号、扫码等
        [NameInMap("trade_type")]
        [Validation(Required=false)]
        public List<string> TradeType { get; set; }

        // 【是否可叠加其他优惠】 枚举值：
        // true：是
        // false：否
        [NameInMap("combine_use")]
        [Validation(Required=false)]
        public bool? CombineUse { get; set; }

        // 【固定折扣特定信息】
        [NameInMap("fixed_discount_coupon")]
        [Validation(Required=false)]
        public FixedDiscountCoupon FixedDiscountCoupon { get; set; }

    }

}
