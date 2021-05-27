// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 数字字典内容
    public class TemplateData : TeaModel {
        // 字典类型ID
        [NameInMap("template_uid")]
        [Validation(Required=false)]
        public string TemplateUid { get; set; }

        // 数字字典内容
        [NameInMap("form_data")]
        [Validation(Required=false)]
        public TemplateDataConverter FormData { get; set; }

    }

}
