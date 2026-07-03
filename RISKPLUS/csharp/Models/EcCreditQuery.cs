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
        /// <summary>
        /// <b>Example:</b>
        /// <para>SQ202301291615023</para>
        /// </summary>
        [NameInMap("third_apply_no")]
        [Validation(Required=false)]
        public string ThirdApplyNo { get; set; }

        // 银行审批流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>APPL20200826000000250721</para>
        /// </summary>
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 业务审批状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>APPROVING</para>
        /// </summary>
        [NameInMap("apply_status")]
        [Validation(Required=true)]
        public string ApplyStatus { get; set; }

        // 合同编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>CONT20230314000000143225</para>
        /// </summary>
        [NameInMap("contract_no")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        // 授信开始时间 格式yyyyMMdd
        /// <summary>
        /// <b>Example:</b>
        /// <para>20221010</para>
        /// </summary>
        [NameInMap("amount_start_date")]
        [Validation(Required=false)]
        public string AmountStartDate { get; set; }

        // 授信结束时间 yyyyMMdd
        /// <summary>
        /// <b>Example:</b>
        /// <para>20231010</para>
        /// </summary>
        [NameInMap("amount_end_date")]
        [Validation(Required=false)]
        public string AmountEndDate { get; set; }

        // 审批金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>5000000.00</para>
        /// </summary>
        [NameInMap("approve_amount")]
        [Validation(Required=false)]
        public string ApproveAmount { get; set; }

        // 否决原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>审批否决</para>
        /// </summary>
        [NameInMap("deny_reason")]
        [Validation(Required=false)]
        public string DenyReason { get; set; }

        // 提还款账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6230580199590683459</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 提还款账号联行号
        /// <summary>
        /// <b>Example:</b>
        /// <para>307331002509</para>
        /// </summary>
        [NameInMap("bank_card_branch_code")]
        [Validation(Required=false)]
        public string BankCardBranchCode { get; set; }

        // 账号开户行行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>平安银行杭州分行</para>
        /// </summary>
        [NameInMap("public_account_bankname")]
        [Validation(Required=false)]
        public string PublicAccountBankname { get; set; }

        // 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-05-01 01:01:01</para>
        /// </summary>
        [NameInMap("approve_time")]
        [Validation(Required=false)]
        public string ApproveTime { get; set; }

    }

}
