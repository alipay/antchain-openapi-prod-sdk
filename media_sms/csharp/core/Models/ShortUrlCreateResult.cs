// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 短链创建结果
    public class ShortUrlCreateResult : TeaModel {
        // 卡片模板id
        [NameInMap("smart_template_id")]
        [Validation(Required=true)]
        public string SmartTemplateId { get; set; }

        // 短链详细信息列表
        [NameInMap("param_list")]
        [Validation(Required=true)]
        public List<ShortUrlResult> ParamList { get; set; }

    }

}
