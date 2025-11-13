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
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // FUND_BATCH_LOAN: 批量放款
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 任务创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        //  同意放款数据
        [NameInMap("agree_loan_count")]
        [Validation(Required=false)]
        public long? AgreeLoanCount { get; set; }

        // 拒绝放款数量
        [NameInMap("reject_loan_count")]
        [Validation(Required=false)]
        public long? RejectLoanCount { get; set; }

        // 放款失败数量
        [NameInMap("loan_fail_count")]
        [Validation(Required=false)]
        public long? LoanFailCount { get; set; }

        // 放款失败结果文件
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
