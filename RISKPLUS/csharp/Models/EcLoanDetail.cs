// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-借据详情
    public class EcLoanDetail : TeaModel {
        // 借据号
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACCAL202301120798255316102054428</para>
        /// </summary>
        [NameInMap("loan_acct_no")]
        [Validation(Required=true)]
        public string LoanAcctNo { get; set; }

        // 贷款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("loan_amt")]
        [Validation(Required=true)]
        public long? LoanAmt { get; set; }

        // 贷款发放日
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023/05/01</para>
        /// </summary>
        [NameInMap("loan_start_date")]
        [Validation(Required=true)]
        public string LoanStartDate { get; set; }

        // 贷款到期日
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023/05/01</para>
        /// </summary>
        [NameInMap("loan_end_date")]
        [Validation(Required=true)]
        public string LoanEndDate { get; set; }

        // 利率类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rate_type")]
        [Validation(Required=true)]
        public string RateType { get; set; }

        // 利率单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rate_unit")]
        [Validation(Required=true)]
        public string RateUnit { get; set; }

        // 贷款利率 年化利率(%)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("loan_int_rate")]
        [Validation(Required=true)]
        public string LoanIntRate { get; set; }

        // 当前剩余本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("curr_remain_corpus")]
        [Validation(Required=true)]
        public string CurrRemainCorpus { get; set; }

        // 还款方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("loan_repay_type")]
        [Validation(Required=true)]
        public string LoanRepayType { get; set; }

        // 最后一次计息日
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023/05/01</para>
        /// </summary>
        [NameInMap("last_count_int_date")]
        [Validation(Required=true)]
        public string LastCountIntDate { get; set; }

        // 当前期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>25</para>
        /// </summary>
        [NameInMap("current_term")]
        [Validation(Required=true)]
        public string CurrentTerm { get; set; }

        // 当期应还日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023/05/01</para>
        /// </summary>
        [NameInMap("cur_repay_day")]
        [Validation(Required=true)]
        public string CurRepayDay { get; set; }

        // 对应期次应还金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_remain_amt")]
        [Validation(Required=true)]
        public long? CurRemainAmt { get; set; }

        // 当期已还总额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("current_paid_amt")]
        [Validation(Required=true)]
        public long? CurrentPaidAmt { get; set; }

        // 对应期次应还本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_principal_amount")]
        [Validation(Required=true)]
        public long? CurPrincipalAmount { get; set; }

        // 对应期次已还本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("act_principal_amount")]
        [Validation(Required=true)]
        public long? ActPrincipalAmount { get; set; }

        // 对应期次应还利息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_interest_amount")]
        [Validation(Required=true)]
        public long? CurInterestAmount { get; set; }

        // 对应期次已还利息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("act_interest_amount")]
        [Validation(Required=true)]
        public long? ActInterestAmount { get; set; }

        // 对应期次应还正常利息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_normal_interest_amt")]
        [Validation(Required=true)]
        public long? CurNormalInterestAmt { get; set; }

        // 对应期次已还正常利息 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("act_cur_normal_interest_amt")]
        [Validation(Required=true)]
        public long? ActCurNormalInterestAmt { get; set; }

        // 对应期次应还罚息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_principal_penalty_amt")]
        [Validation(Required=true)]
        public long? CurPrincipalPenaltyAmt { get; set; }

        // 对应期次已还罚息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("act_cur_principal_penalty_amt")]
        [Validation(Required=true)]
        public long? ActCurPrincipalPenaltyAmt { get; set; }

        // 对应期次应还复利
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("cur_interest_penalty_amt")]
        [Validation(Required=true)]
        public long? CurInterestPenaltyAmt { get; set; }

        // 对应期次已还复利
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("act_cur_interest_penalty_amt")]
        [Validation(Required=true)]
        public long? ActCurInterestPenaltyAmt { get; set; }

        // 总期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_num")]
        [Validation(Required=true)]
        public string TotalNum { get; set; }

        // 借据状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("loan_status")]
        [Validation(Required=true)]
        public string LoanStatus { get; set; }

        // 总欠款本息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.23</para>
        /// </summary>
        [NameInMap("total_owe_corpus_interest")]
        [Validation(Required=true)]
        public string TotalOweCorpusInterest { get; set; }

    }

}
