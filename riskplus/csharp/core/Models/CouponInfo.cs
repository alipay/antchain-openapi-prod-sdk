// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 优惠券信息
    public class CouponInfo : TeaModel {
        // 优惠券Id
        [NameInMap("coupon_id")]
        [Validation(Required=true)]
        public string CouponId { get; set; }

        // 优惠券名称
        [NameInMap("coupon_name")]
        [Validation(Required=true)]
        public string CouponName { get; set; }

        // 优惠券状态
        // unUsed-未使用
        // Used-已使用
        // Expired-过期
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 使用场景
        // 01-提款使用
        // 02-还款使用
        [NameInMap("use_condition")]
        [Validation(Required=true)]
        public string UseCondition { get; set; }

        // 优惠码
        [NameInMap("coupon_code")]
        [Validation(Required=false)]
        public string CouponCode { get; set; }

        // 优惠券类型
        // 01-金额优惠
        // 02-天数优惠
        // 03-折扣优惠
        // 04-期数优惠
        // 05-固定利率
        [NameInMap("coupon_type")]
        [Validation(Required=false)]
        public string CouponType { get; set; }

        // 优惠券面额
        // coupon_type=01 时为优惠金额
        // coupon_type=02 时为减免天数
        // coupon_type=03 时为折扣值（如6 折）
        // coupon_type=04 时为减免期数
        // coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
        [NameInMap("coupon_value")]
        [Validation(Required=false)]
        public string CouponValue { get; set; }

        // 当 coupon_type=01 时，才会有优惠金额
        [NameInMap("coupon_amount")]
        [Validation(Required=false)]
        public string CouponAmount { get; set; }

        // 过期时间yyyy-MM-dd HH:mm:ss
        [NameInMap("expired_time")]
        [Validation(Required=false)]
        public string ExpiredTime { get; set; }

        // 生效时间yyyy-MM-dd HH:mm:ss
        [NameInMap("effective_time")]
        [Validation(Required=false)]
        public string EffectiveTime { get; set; }

        // 使用规则
        [NameInMap("use_detail")]
        [Validation(Required=false)]
        public string UseDetail { get; set; }

        // 贷款最低金额
        [NameInMap("min_amount")]
        [Validation(Required=false)]
        public string MinAmount { get; set; }

        // 贷款最高金额
        [NameInMap("max_amount")]
        [Validation(Required=false)]
        public string MaxAmount { get; set; }

        // 最低贷款期数
        [NameInMap("min_period")]
        [Validation(Required=false)]
        public string MinPeriod { get; set; }

        // 最高贷款期数
        [NameInMap("max_period")]
        [Validation(Required=false)]
        public string MaxPeriod { get; set; }

        // 贷款最低期限天数
        [NameInMap("min_day")]
        [Validation(Required=false)]
        public string MinDay { get; set; }

        // 还款方式
        // 1-等额本息
        // 2-等额本金
        // 3-等本等费
        // 4-按期付息到期还本
        // 5-到期一次性还本付息
        // 6-等本等费-总费率
        // 7-等额本息(长期)
        [NameInMap("repayment_method")]
        [Validation(Required=false)]
        public string RepaymentMethod { get; set; }

        // 是否有贷款期数要求
        // 0：否
        // 1：是
        [NameInMap("is_period_limit")]
        [Validation(Required=false)]
        public string IsPeriodLimit { get; set; }

        // 贷款期限要求还款条件
        // 01：可提前还款
        // 02：不可提前还款
        // isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
        // isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
        [NameInMap("repay_condition")]
        [Validation(Required=false)]
        public string RepayCondition { get; set; }

        // 还款场景
        // 01-到期还款
        // 02-即期还款
        [NameInMap("repay_ways")]
        [Validation(Required=false)]
        public string RepayWays { get; set; }

        // 优惠模板Id
        [NameInMap("coupon_model_no")]
        [Validation(Required=false)]
        public string CouponModelNo { get; set; }

        // 至到期:X年X月X日
        // 0：不是至到期券 
        // 1：是至到期券
        [NameInMap("to_maturity")]
        [Validation(Required=false)]
        public string ToMaturity { get; set; }

    }

}
