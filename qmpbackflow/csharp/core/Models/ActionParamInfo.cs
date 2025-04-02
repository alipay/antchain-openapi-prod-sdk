// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾触达媒介参数信息
    public class ActionParamInfo : TeaModel {
        // 触达媒介类型
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 触达媒介参数列表
        [NameInMap("action_param")]
        [Validation(Required=true)]
        public List<string> ActionParam { get; set; }

    }

}
