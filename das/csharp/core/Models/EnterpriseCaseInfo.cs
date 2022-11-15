// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 企业案件信息
    public class EnterpriseCaseInfo : TeaModel {
        // 立案信息
        [NameInMap("case_info")]
        [Validation(Required=false)]
        public string CaseInfo { get; set; }

        // 案件号
        [NameInMap("case_code")]
        [Validation(Required=false)]
        public string CaseCode { get; set; }

        // 立案时间
        [NameInMap("case_create_time")]
        [Validation(Required=false)]
        public string CaseCreateTime { get; set; }

        // 案件状态
        [NameInMap("case_status")]
        [Validation(Required=false)]
        public string CaseStatus { get; set; }

        // 公示状态
        [NameInMap("publish_status")]
        [Validation(Required=false)]
        public string PublishStatus { get; set; }

        // 被执行人姓名
        [NameInMap("exec_name")]
        [Validation(Required=false)]
        public string ExecName { get; set; }

        // 执行法院
        [NameInMap("exec_court_name")]
        [Validation(Required=false)]
        public string ExecCourtName { get; set; }

        // 执行标的(元)
        [NameInMap("exec_money")]
        [Validation(Required=false)]
        public string ExecMoney { get; set; }

        // 关联裁判文书
        [NameInMap("gist_id")]
        [Validation(Required=false)]
        public string GistId { get; set; }

        // 案由
        [NameInMap("case_type")]
        [Validation(Required=false)]
        public string CaseType { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

    }

}
