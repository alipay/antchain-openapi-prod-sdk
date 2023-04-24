// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateJusticeRightsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件维权记录编号
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public long? RecordId { get; set; }

        // 案件状态(枚举)
        [NameInMap("case_status")]
        [Validation(Required=true)]
        public string CaseStatus { get; set; }

        // 状态扩展信息示例查看对接文档
        [NameInMap("status_ext")]
        [Validation(Required=false)]
        public string StatusExt { get; set; }

        // 文件信息,示例查看对接文档
        [NameInMap("status_file_infos")]
        [Validation(Required=false)]
        public List<FileInfo> StatusFileInfos { get; set; }

        // 案件状态对应的实际时间 
        [NameInMap("case_status_date")]
        [Validation(Required=true)]
        public string CaseStatusDate { get; set; }

    }

}
