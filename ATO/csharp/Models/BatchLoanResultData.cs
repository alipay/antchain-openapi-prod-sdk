// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 批量放款结果数据
    public class BatchLoanResultData : TeaModel {
        // 流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>TODO</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // FUND_BATCH_LOAN: 批量放款
        /// <summary>
        /// <b>Example:</b>
        /// <para>FUND_BATCH_LOAN</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 任务创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17 18:41:59</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        //  同意放款数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("agree_loan_count")]
        [Validation(Required=false)]
        public long? AgreeLoanCount { get; set; }

        // 拒绝放款数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("reject_loan_count")]
        [Validation(Required=false)]
        public long? RejectLoanCount { get; set; }

        // 放款失败数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("loan_fail_count")]
        [Validation(Required=false)]
        public long? LoanFailCount { get; set; }

        // 放款失败结果文件
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://123456.com">http://123456.com</a></para>
        /// </summary>
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
