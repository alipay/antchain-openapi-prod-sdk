// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 数据字典信息
    public class TemplateInfo : TeaModel {
        // 数据字id
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 数据字典名称
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 数据字典内容
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

    }

}
