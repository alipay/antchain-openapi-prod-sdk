// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfIouResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 执行年利率
        [NameInMap("annual_interest_rate")]
        [Validation(Required=false)]
        public string AnnualInterestRate { get; set; }

        // 借据Id
        [NameInMap("credit_id")]
        [Validation(Required=false)]
        public string CreditId { get; set; }

        // 借据到期日
        [NameInMap("interest_bearing_end")]
        [Validation(Required=false)]
        public string InterestBearingEnd { get; set; }

        // 借据起息日
        [NameInMap("interest_bearing_start")]
        [Validation(Required=false)]
        public string InterestBearingStart { get; set; }

        // 应还本金，即放款金额
        [NameInMap("issued_amount")]
        [Validation(Required=false)]
        public string IssuedAmount { get; set; }

        // 还款银行名称
        [NameInMap("repay_bank_name")]
        [Validation(Required=false)]
        public string RepayBankName { get; set; }

        // 还款账号名称
        [NameInMap("repay_acct_name")]
        [Validation(Required=false)]
        public string RepayAcctName { get; set; }

        // 还款账号
        [NameInMap("repay_account")]
        [Validation(Required=false)]
        public string RepayAccount { get; set; }

        // 实际已还本金
        [NameInMap("repay_amt")]
        [Validation(Required=false)]
        public string RepayAmt { get; set; }

        // 实际已还利息
        [NameInMap("repay_interest")]
        [Validation(Required=false)]
        public string RepayInterest { get; set; }

        // 实际已还总额
        [NameInMap("repay_total_amt")]
        [Validation(Required=false)]
        public string RepayTotalAmt { get; set; }

        // 借据状态
        [NameInMap("credit_status")]
        [Validation(Required=false)]
        public string CreditStatus { get; set; }

        // 是否逾期,0是,1否
        [NameInMap("is_overdue")]
        [Validation(Required=false)]
        public string IsOverdue { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 支用id
        [NameInMap("financing_id")]
        [Validation(Required=false)]
        public string FinancingId { get; set; }

        // 融资主体DID
        [NameInMap("financing_subject_did")]
        [Validation(Required=false)]
        public string FinancingSubjectDid { get; set; }

    }

}
