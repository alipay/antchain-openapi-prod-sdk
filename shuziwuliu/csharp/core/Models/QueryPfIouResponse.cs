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

        // 发放金额
        [NameInMap("issued_amount")]
        [Validation(Required=false)]
        public string IssuedAmount { get; set; }

        // 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
        [NameInMap("loan_nature")]
        [Validation(Required=false)]
        public string LoanNature { get; set; }

        // 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
        [NameInMap("loan_status")]
        [Validation(Required=false)]
        public string LoanStatus { get; set; }

        // 下次结息日期
        [NameInMap("next_parsing_date")]
        [Validation(Required=false)]
        public string NextParsingDate { get; set; }

        // 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
        [NameInMap("odi_cal_type")]
        [Validation(Required=false)]
        public string OdiCalType { get; set; }

        // 逾期罚息浮动比率
        [NameInMap("opi_floating_ratio")]
        [Validation(Required=false)]
        public string OpiFloatingRatio { get; set; }

        // 贷款入账账号
        [NameInMap("pay_account")]
        [Validation(Required=false)]
        public string PayAccount { get; set; }

        // 本金余额
        [NameInMap("principal_balance")]
        [Validation(Required=false)]
        public string PrincipalBalance { get; set; }

        // 还款账号
        [NameInMap("repay_account")]
        [Validation(Required=false)]
        public string RepayAccount { get; set; }

    }

}
