// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACNCONTRACTREVIEW.Models
{
    // 审核记录
    public class AuditRecordItem : TeaModel {
        // 审核id
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public string AuditId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 合同名称
        [NameInMap("contract_file_name")]
        [Validation(Required=true)]
        public string ContractFileName { get; set; }

        // 创建人id
        [NameInMap("creator_work_no")]
        [Validation(Required=true)]
        public string CreatorWorkNo { get; set; }

        // 创建人名称
        [NameInMap("creator_name")]
        [Validation(Required=true)]
        public string CreatorName { get; set; }

        // 基准线库名称
        [NameInMap("baseline_library_name")]
        [Validation(Required=true)]
        public string BaselineLibraryName { get; set; }

        // 基准线id
        [NameInMap("bu_id")]
        [Validation(Required=true)]
        public string BuId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 原始文件
        [NameInMap("original_file")]
        [Validation(Required=false)]
        public ContractFile OriginalFile { get; set; }

        // 当前编辑文件（定稿文件）
        [NameInMap("final_file")]
        [Validation(Required=false)]
        public ContractFile FinalFile { get; set; }

    }

}
