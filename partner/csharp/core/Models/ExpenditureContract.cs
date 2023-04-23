// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出合同
    public class ExpenditureContract : TeaModel {
        // 支出合同id
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 支出合同名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同状态：
        //     INIT("INIT","草稿", ""),
        //     VALID("VALID","正式", ""),
        //     INVALID("INVALID","作废", ""),
        //     AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
        //     AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
        //     AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期开始时间
        [NameInMap("gmt_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtStart { get; set; }

        // 有效期结束时间
        [NameInMap("gmt_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtEnd { get; set; }

        // 签约记录
        [NameInMap("signing_record")]
        [Validation(Required=false)]
        public SignRecord SigningRecord { get; set; }

        // 支出结算规则
        [NameInMap("settlement_rule")]
        [Validation(Required=false)]
        public ExpenditureSettlementRule SettlementRule { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

    }

}
