// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 短信模版创建返回体
    public class SmsTempCreateData : TeaModel {
        // 模版id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

    }

}
