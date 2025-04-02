// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 策略流信息
    public class DfSceneInfos : TeaModel {
        // scene_code
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 拒绝
        [NameInMap("scene_decision")]
        [Validation(Required=true)]
        public string SceneDecision { get; set; }

        // decision_flow
        [NameInMap("decision_flow")]
        [Validation(Required=true)]
        public DecisionFlow DecisionFlow { get; set; }

    }

}
