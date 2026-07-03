// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统专用ReceiptInfo结构体
    public class ReceiptInfo : TeaModel {
        // 客户名
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("custom_name")]
        [Validation(Required=true)]
        public string CustomName { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>166****1234</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 贷款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("apply_amount")]
        [Validation(Required=true)]
        public long? ApplyAmount { get; set; }

        // 发放金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("loan_amount")]
        [Validation(Required=true)]
        public long? LoanAmount { get; set; }

        // 期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 当前期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("cur_period")]
        [Validation(Required=true)]
        public long? CurPeriod { get; set; }

        // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // 还款日
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXX.XX.XX</para>
        /// </summary>
        [NameInMap("repay_date")]
        [Validation(Required=true)]
        public string RepayDate { get; set; }

        // 放款时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("loan_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LoanTime { get; set; }

        // 借据状态0：未还清，1：已还清，2：已提前还清
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 已还本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("already_corpus")]
        [Validation(Required=true)]
        public long? AlreadyCorpus { get; set; }

        // 已还利息
        /// <summary>
        /// <b>Example:</b>
        /// <para>50</para>
        /// </summary>
        [NameInMap("already_accrual")]
        [Validation(Required=true)]
        public long? AlreadyAccrual { get; set; }

        // 结清日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("already_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AlreadyDate { get; set; }

        // 审批状态0：通过 1：拒绝 2：审批中 3：失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("workflow_status")]
        [Validation(Required=true)]
        public string WorkflowStatus { get; set; }

        // 借据编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>145785</para>
        /// </summary>
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 放款状态(0：放款成功 1：放款失败 2：放款异常 3：放款中）
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("loan_status")]
        [Validation(Required=false)]
        public string LoanStatus { get; set; }

        // 业务类型 1：现金贷（默认）、2：分期付
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

    }

}
