// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢专用RepayTrail结构体
    public class RepayTrail : TeaModel {
        // 期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 每期应还金额
        [NameInMap("need_amt")]
        [Validation(Required=true)]
        public long? NeedAmt { get; set; }

        // 每期已还金额
        [NameInMap("already_amt")]
        [Validation(Required=true)]
        public long? AlreadyAmt { get; set; }

        // 每期应还本金
        [NameInMap("trans_principal")]
        [Validation(Required=true)]
        public long? TransPrincipal { get; set; }

        // 每期应还利息
        [NameInMap("trans_interest")]
        [Validation(Required=true)]
        public long? TransInterest { get; set; }

        // 每期还款费用
        [NameInMap("trans_fee")]
        [Validation(Required=true)]
        public long? TransFee { get; set; }

        // 剩余本金
        [NameInMap("remain_principal")]
        [Validation(Required=true)]
        public long? RemainPrincipal { get; set; }

        // 还款时间
        [NameInMap("repay_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RepayTime { get; set; }

        // 计息开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 计息结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 试算编号
        [NameInMap("trial_no")]
        [Validation(Required=true)]
        public string TrialNo { get; set; }

        // 优惠后应还金额
        [NameInMap("discount_after_need_amt")]
        [Validation(Required=false)]
        public long? DiscountAfterNeedAmt { get; set; }

        // 优惠后应还利息
        [NameInMap("discount_after_interest")]
        [Validation(Required=false)]
        public long? DiscountAfterInterest { get; set; }

        // 优惠利息
        [NameInMap("discount_interest")]
        [Validation(Required=false)]
        public long? DiscountInterest { get; set; }

    }

}
