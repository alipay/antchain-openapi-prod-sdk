// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 模型结果详情
    // 
    public class ModelDetails : TeaModel {
        // 风险场景编码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 该风险场景的风险分值
        // 
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

    }

}
