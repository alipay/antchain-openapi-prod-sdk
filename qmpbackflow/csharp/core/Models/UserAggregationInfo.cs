// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢用户聚合状态信息
    public class UserAggregationInfo : TeaModel {
        // 状态
        // 0: 未授信
        // 1: 授信中
        // 2: 已授信未支用
        // 3: 支用中
        // 4: 已支用
        // 5: 借据逾期
        // 6: 授信过期
        // 7: 授信冻结
        // 8: 可重新授信
        // 9: 授信拒绝
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 总额度
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public long? CreditAmount { get; set; }

        // 可用额度
        [NameInMap("available_amount")]
        [Validation(Required=false)]
        public long? AvailableAmount { get; set; }

        // 待还总金额
        [NameInMap("should_pay_amount")]
        [Validation(Required=false)]
        public long? ShouldPayAmount { get; set; }

        // 逾期总金额
        [NameInMap("overdue_amount")]
        [Validation(Required=false)]
        public long? OverdueAmount { get; set; }

        // 下一期应还金额
        [NameInMap("next_period_amount")]
        [Validation(Required=false)]
        public long? NextPeriodAmount { get; set; }

        // 下一期还款时间yyyy-MM-dd
        [NameInMap("next_period_repay_time")]
        [Validation(Required=false)]
        public string NextPeriodRepayTime { get; set; }

        // 下次可授信时间yyyy-MM-dd
        [NameInMap("next_apply_time")]
        [Validation(Required=false)]
        public string NextApplyTime { get; set; }

        // 优惠券列表
        [NameInMap("coupon_list")]
        [Validation(Required=false)]
        public List<CouponInfo> CouponList { get; set; }

    }

}
