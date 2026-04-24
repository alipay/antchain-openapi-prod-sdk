// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 决策场景信息
    public class AirDfSceneInfos : TeaModel {
        // 决策场景结果
        [NameInMap("scene_decision")]
        [Validation(Required=false)]
        public string SceneDecision { get; set; }

        // 决策场景
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 决策域信息
        [NameInMap("domain_infos")]
        [Validation(Required=false)]
        public List<AirDomainInfos> DomainInfos { get; set; }

    }

}
