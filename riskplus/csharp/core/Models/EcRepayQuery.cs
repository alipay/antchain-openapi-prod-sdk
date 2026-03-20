// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-还款明细查询
    public class EcRepayQuery : TeaModel {
        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 借据号
        [NameInMap("loan_no")]
        [Validation(Required=true)]
        public string LoanNo { get; set; }

        // 贷款金额
        [NameInMap("loanamt")]
        [Validation(Required=true)]
        public string Loanamt { get; set; }

        // 实时借据状态
        [NameInMap("loan_status")]
        [Validation(Required=true)]
        public string LoanStatus { get; set; }

        // 总期次
        [NameInMap("total_num")]
        [Validation(Required=true)]
        public string TotalNum { get; set; }

        // 还款方式
        [NameInMap("repay_type")]
        [Validation(Required=false)]
        public string RepayType { get; set; }

        // 应还总金额
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public string RepayAmount { get; set; }

        // 实还总金额
        [NameInMap("actual_sum")]
        [Validation(Required=false)]
        public string ActualSum { get; set; }

        // 这笔借据所在期次的还款日。格式:yyyy/MM/dd
        [NameInMap("duedate")]
        [Validation(Required=false)]
        public string Duedate { get; set; }

        // 实还日期 格式:yyyy/MM/dd
        [NameInMap("actualpay_date")]
        [Validation(Required=false)]
        public string ActualpayDate { get; set; }

        // 应还本金 单位:元,格式:数字,小数点后两位
        [NameInMap("corpus")]
        [Validation(Required=false)]
        public string Corpus { get; set; }

        // 实还本金 单位:元,格式:数字,小数点后两位
        [NameInMap("actual_payprincipal_amt")]
        [Validation(Required=false)]
        public string ActualPayprincipalAmt { get; set; }

        // 应还利息 单位:元,格式:数字,小数点后两位
        [NameInMap("interest")]
        [Validation(Required=false)]
        public string Interest { get; set; }

        // 实还利息 单位:元,格式:数字,小数点后两位
        [NameInMap("actual_payinterest_amt")]
        [Validation(Required=false)]
        public string ActualPayinterestAmt { get; set; }

        // 应还罚息 单位:元,格式:数字,小数点后两位
        [NameInMap("pay_principal_penalty_amt")]
        [Validation(Required=false)]
        public string PayPrincipalPenaltyAmt { get; set; }

        // 实还罚息 单位:元,格式:数字,小数点后两位
        [NameInMap("actual_payprincipal_penalty_amt")]
        [Validation(Required=false)]
        public string ActualPayprincipalPenaltyAmt { get; set; }

        // 应还复利 单位:元,格式:数字,小数点后两位
        [NameInMap("pay_interest_penalty_amt")]
        [Validation(Required=false)]
        public string PayInterestPenaltyAmt { get; set; }

        // 实还复利 单位:元,格式:数字,小数点后两位
        [NameInMap("actual_payinterest_penalty_amt")]
        [Validation(Required=false)]
        public string ActualPayinterestPenaltyAmt { get; set; }

        // 应还贴息利息 单位:元,格式:数字,小数点后两位
        [NameInMap("pay_splitinterest_amt")]
        [Validation(Required=false)]
        public string PaySplitinterestAmt { get; set; }

        // 实还贴息利息 单位:元,格式:数字,小数点后两位
        [NameInMap("actual_paysplitinterest_amt")]
        [Validation(Required=false)]
        public string ActualPaysplitinterestAmt { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 还款期次 这笔还款对应期次。单位:整数
        [NameInMap("repayment_num")]
        [Validation(Required=false)]
        public string RepaymentNum { get; set; }

        // 优惠金额 单位:元,格式:数字,小数点后两位
        [NameInMap("reduce_amt")]
        [Validation(Required=false)]
        public string ReduceAmt { get; set; }

        // 还款类型
        [NameInMap("bill_type")]
        [Validation(Required=false)]
        public string BillType { get; set; }

        // 流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 还款交易流水号 若为还款，则与还款通知流水保持一致
        [NameInMap("transaction_serialno")]
        [Validation(Required=true)]
        public string TransactionSerialno { get; set; }

        // 是否附言还款
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
