// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditIssueamountResponse : TeaModel {
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

        // 剩余金额
        [NameInMap("balance_amt")]
        [Validation(Required=false)]
        public string BalanceAmt { get; set; }

        // 已清分金额
        [NameInMap("cash_amt")]
        [Validation(Required=false)]
        public string CashAmt { get; set; }

        // 欠的滞纳金金额
        [NameInMap("debt_int_amt")]
        [Validation(Required=false)]
        public string DebtIntAmt { get; set; }

        // 欠款本金金额
        [NameInMap("debt_prin_amt")]
        [Validation(Required=false)]
        public string DebtPrinAmt { get; set; }

        // 该凭证下的总欠款金额
        [NameInMap("debt_total_amt")]
        [Validation(Required=false)]
        public string DebtTotalAmt { get; set; }

        // 信用凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 冻结的金额
        [NameInMap("freeze_amt")]
        [Validation(Required=false)]
        public string FreezeAmt { get; set; }

        // 信用凭证id
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 累计已还滞纳金金额
        [NameInMap("paid_int_amt")]
        [Validation(Required=false)]
        public string PaidIntAmt { get; set; }

        // 凭证总金额
        [NameInMap("ticket_amt")]
        [Validation(Required=false)]
        public string TicketAmt { get; set; }

    }

}
