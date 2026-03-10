// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 还款账单明细Object
    public class BillDetail : TeaModel {
        // 对账流水号，在扣款回盘文件中返回，用于对账
        [NameInMap("serial_number")]
        [Validation(Required=false)]
        public string SerialNumber { get; set; }

        // 还款期数
        [NameInMap("rpy_term")]
        [Validation(Required=true)]
        public long? RpyTerm { get; set; }

        // 账单维度的还款总额（单位：分），单笔账单本利罚之和
        [NameInMap("rpy_amt")]
        [Validation(Required=true)]
        public long? RpyAmt { get; set; }

        // 实还本金（单位：分）
        [NameInMap("rpy_principal")]
        [Validation(Required=true)]
        public long? RpyPrincipal { get; set; }

        // 实还利息（单位：分）
        [NameInMap("rpy_fee_amt")]
        [Validation(Required=true)]
        public long? RpyFeeAmt { get; set; }

        // 实还罚息（单位：分）
        [NameInMap("rpy_muclt")]
        [Validation(Required=true)]
        public long? RpyMuclt { get; set; }

        // 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
        // 
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
        [NameInMap("rpy_date")]
        [Validation(Required=false)]
        public string RpyDate { get; set; }

    }

}
