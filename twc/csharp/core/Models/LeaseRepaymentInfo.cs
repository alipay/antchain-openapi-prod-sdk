// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁资金方还款条目信息
    public class LeaseRepaymentInfo : TeaModel {
        // 融资租赁还款流水
        [NameInMap("repayment_unique_id")]
        [Validation(Required=true)]
        public string RepaymentUniqueId { get; set; }

        // 还款批次
        [NameInMap("return_index")]
        [Validation(Required=true)]
        public string ReturnIndex { get; set; }

        // 还款日期
        [NameInMap("return_time")]
        [Validation(Required=true)]
        public string ReturnTime { get; set; }

        // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
        [NameInMap("return_money")]
        [Validation(Required=true)]
        public long? ReturnMoney { get; set; }

        // 还款结果状态,1.成功 2.失败
        [NameInMap("return_status")]
        [Validation(Required=true)]
        public long? ReturnStatus { get; set; }

        // 还款结果简要描述,长度不超过256
        [NameInMap("return_description")]
        [Validation(Required=true)]
        public string ReturnDescription { get; set; }

        // 还款来源,1.共管账号，2.网商清分
        [NameInMap("source")]
        [Validation(Required=true)]
        public long? Source { get; set; }

        // 剩余应还期数
        [NameInMap("remain_return_term")]
        [Validation(Required=true)]
        public long? RemainReturnTerm { get; set; }

        // 本期剩余应还金额，精确到毫厘，即123400表示12.34元
        [NameInMap("remain_return_money")]
        [Validation(Required=true)]
        public long? RemainReturnMoney { get; set; }

        // 逾期状态,0为未逾期，1表示逾期
        [NameInMap("overdue_status")]
        [Validation(Required=true)]
        public long? OverdueStatus { get; set; }

        // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
        [NameInMap("overdue_rate")]
        [Validation(Required=true)]
        public long? OverdueRate { get; set; }

        // 逾期天数,支用到期日开始计算
        [NameInMap("overdue_day")]
        [Validation(Required=true)]
        public long? OverdueDay { get; set; }

        // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
        [NameInMap("overdue_money")]
        [Validation(Required=true)]
        public long? OverdueMoney { get; set; }

    }

}
