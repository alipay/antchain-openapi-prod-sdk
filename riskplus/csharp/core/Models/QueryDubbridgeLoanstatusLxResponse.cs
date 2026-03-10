// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeLoanstatusLxResponse : TeaModel {
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

        // 放款结果，
        // 0:放款成功
        // 1:放款失败
        // 2.查无此单(重新发起支用申请接口,需要保证支用申请接口幂等)
        // 99:处理中
        [NameInMap("loan_result")]
        [Validation(Required=false)]
        public long? LoanResult { get; set; }

        // 描述信息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 成功必填，资方返回的阶梯结算利率，供生成对资还款计划时使用
        [NameInMap("settle_rate")]
        [Validation(Required=false)]
        public long? SettleRate { get; set; }

        // 成功必填，YYYY-MM-DD HH:MM:SS
        [NameInMap("payment_time")]
        [Validation(Required=false)]
        public string PaymentTime { get; set; }

        // 放款成功金额，成功必填，单位:元
        [NameInMap("loan_amt")]
        [Validation(Required=false)]
        public long? LoanAmt { get; set; }

        // 放款流水号，成功必填
        [NameInMap("capital_loan_no")]
        [Validation(Required=false)]
        public string CapitalLoanNo { get; set; }

        // 收款人银行卡卡号，放款成功提供实际的放款目标账户
        [NameInMap("debit_account_no")]
        [Validation(Required=false)]
        public string DebitAccountNo { get; set; }

    }

}
