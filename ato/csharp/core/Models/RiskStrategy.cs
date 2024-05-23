// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 策略结果详情
    public class RiskStrategy : TeaModel {
        // 策略ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 策略名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 策略决策结果
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // 风险场景编码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
