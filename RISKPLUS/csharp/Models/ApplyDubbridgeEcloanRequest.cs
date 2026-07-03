// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeEcloanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 提款申请单
        [NameInMap("loan_apply_no")]
        [Validation(Required=true)]
        public string LoanApplyNo { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 提款金额
        [NameInMap("apply_loan_amt")]
        [Validation(Required=true)]
        public string ApplyLoanAmt { get; set; }

        // 币种
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

        // 支付方式
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public string PayMode { get; set; }

        // 还款方式
        [NameInMap("loan_repay_type")]
        [Validation(Required=true)]
        public string LoanRepayType { get; set; }

        // 还款周期
        [NameInMap("repay_period")]
        [Validation(Required=true)]
        public string RepayPeriod { get; set; }

        // 借据期限
        [NameInMap("loan_term")]
        [Validation(Required=true)]
        public string LoanTerm { get; set; }

        // 期限单位
        [NameInMap("loan_term_unit")]
        [Validation(Required=true)]
        public string LoanTermUnit { get; set; }

    }

}
