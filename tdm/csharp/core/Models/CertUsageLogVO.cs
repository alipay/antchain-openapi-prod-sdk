// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 证明使用记录返回结果
    public class CertUsageLogVO : TeaModel {
        // 使用方名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 使用时间
        [NameInMap("usage_time")]
        [Validation(Required=true)]
        public string UsageTime { get; set; }

        // 证明类型
        [NameInMap("issue_cert_type")]
        [Validation(Required=true)]
        public string IssueCertType { get; set; }

        // 证明类型描述
        [NameInMap("issue_cert_type_desc")]
        [Validation(Required=true)]
        public string IssueCertTypeDesc { get; set; }

        // 证明开具时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public string IssueTime { get; set; }

        // 用途
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

    }

}
