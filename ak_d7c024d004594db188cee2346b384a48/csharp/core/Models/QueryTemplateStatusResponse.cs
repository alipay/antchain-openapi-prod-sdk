// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d7c024d004594db188cee2346b384a48.Models
{
    // 查询模版状态响应
    public class QueryTemplateStatusResponse : TeaModel {
        // 彩信模版id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模版名称
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 模板状态
        [NameInMap("template_status")]
        [Validation(Required=true)]
        public string TemplateStatus { get; set; }

        // 审核信息
        [NameInMap("censor_result")]
        [Validation(Required=true)]
        public string CensorResult { get; set; }

    }

}
