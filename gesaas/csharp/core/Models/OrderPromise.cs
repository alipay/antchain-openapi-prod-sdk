// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 订单还款计划
    public class OrderPromise : TeaModel {
        // 宽限期/天
        // 不传默认为0
        [NameInMap("grace_period_days")]
        [Validation(Required=false)]
        public long? GracePeriodDays { get; set; }

        // 罚息类型
        //  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
        [NameInMap("punishment_type")]
        [Validation(Required=true)]
        public string PunishmentType { get; set; }

        // 租期
        // 租期最小值为1
        [NameInMap("pay_period")]
        [Validation(Required=true)]
        public long? PayPeriod { get; set; }

        // 租赁公司支付宝UID
        [NameInMap("lease_alipay_uid")]
        [Validation(Required=true)]
        public string LeaseAlipayUid { get; set; }

        // 还款策略 
        // repayStrategyList长度 == payPeriod
        [NameInMap("repay_strategy_list")]
        [Validation(Required=true)]
        public List<RepayStrategy> RepayStrategyList { get; set; }

    }

}
