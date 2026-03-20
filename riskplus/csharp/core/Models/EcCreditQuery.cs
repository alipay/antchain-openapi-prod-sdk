// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-授信查询
    public class EcCreditQuery : TeaModel {
        // 外部申请编号
        [NameInMap("third_apply_no")]
        [Validation(Required=false)]
        public string ThirdApplyNo { get; set; }

        // 银行审批流水号
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 业务审批状态
        [NameInMap("apply_status")]
        [Validation(Required=true)]
        public string ApplyStatus { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        // 授信开始时间 格式yyyyMMdd
        [NameInMap("amount_start_date")]
        [Validation(Required=false)]
        public string AmountStartDate { get; set; }

        // 授信结束时间 yyyyMMdd
        [NameInMap("amount_end_date")]
        [Validation(Required=false)]
        public string AmountEndDate { get; set; }

        // 审批金额
        [NameInMap("approve_amount")]
        [Validation(Required=false)]
        public string ApproveAmount { get; set; }

        // 否决原因
        [NameInMap("deny_reason")]
        [Validation(Required=false)]
        public string DenyReason { get; set; }

        // 提还款账号
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 提还款账号联行号
        [NameInMap("bank_card_branch_code")]
        [Validation(Required=false)]
        public string BankCardBranchCode { get; set; }

        // 账号开户行行名称
        [NameInMap("public_account_bankname")]
        [Validation(Required=false)]
        public string PublicAccountBankname { get; set; }

        // 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
        [NameInMap("approve_time")]
        [Validation(Required=false)]
        public string ApproveTime { get; set; }

    }

}
