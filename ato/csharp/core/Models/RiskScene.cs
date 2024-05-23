// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 风险场景的决策结果
    public class RiskScene : TeaModel {
        // 风险场景编码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 该场景的风险决策结果
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

    }

}
