// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACNCONTRACTREVIEW.Models
{
    public class QueryAntcloudContractaiAuditRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 当前页
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 合同名称
        [NameInMap("contract_file_name")]
        [Validation(Required=false)]
        public string ContractFileName { get; set; }

        // 开始时间
        [NameInMap("create_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateStartTime { get; set; }

        // 结束时间
        [NameInMap("create_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateEndTime { get; set; }

        // PROCESSING：合同审核任务已提交，正在异步处理中
        // SUCCESS：合同审核已完成，结果可查询
        // FAIL：合同审核过程中发生错误，审核失败
        // FINALIZED：合同已完成定稿操作，生成最终版本
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 创建人id
        [NameInMap("creator_work_no")]
        [Validation(Required=false)]
        public string CreatorWorkNo { get; set; }

        // 创建人名称
        [NameInMap("creator_name")]
        [Validation(Required=false)]
        public string CreatorName { get; set; }

        // 基准线库名称
        [NameInMap("baseline_library_name")]
        [Validation(Required=false)]
        public string BaselineLibraryName { get; set; }

        // 终端客户id
        [NameInMap("end_customer_id")]
        [Validation(Required=false)]
        public string EndCustomerId { get; set; }

    }

}
