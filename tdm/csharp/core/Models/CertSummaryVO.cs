// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 证明列表查询返回
    public class CertSummaryVO : TeaModel {
        // 证明文件ID
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 证明文件类型
        [NameInMap("issue_cert_type")]
        [Validation(Required=true)]
        public string IssueCertType { get; set; }

        // 证明文件描述
        [NameInMap("issue_cert_type_desc")]
        [Validation(Required=true)]
        public string IssueCertTypeDesc { get; set; }

        // 证明开具时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public string IssueTime { get; set; }

        // 证明图标（未使用）
        [NameInMap("issue_icon")]
        [Validation(Required=false)]
        public string IssueIcon { get; set; }

    }

}
