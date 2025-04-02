// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 短信模板内容
    public class CpaasSmsTemplate : TeaModel {
        // 模板类型
        [NameInMap("template_type")]
        [Validation(Required=false)]
        public string TemplateType { get; set; }

        // 模板名称
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 模板内容
        [NameInMap("template_content")]
        [Validation(Required=false)]
        public string TemplateContent { get; set; }

        // 审批状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 模版code
        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        // 审核未通过原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 短信创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

    }

}
