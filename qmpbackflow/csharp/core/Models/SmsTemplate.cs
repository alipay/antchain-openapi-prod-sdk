// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 短信模板
    public class SmsTemplate : TeaModel {
        // 场景策略ID
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public string SceneStrategyId { get; set; }

        // 计划名称
        [NameInMap("scene_strategy_name")]
        [Validation(Required=true)]
        public string SceneStrategyName { get; set; }

        // 模板内容
        [NameInMap("template_content")]
        [Validation(Required=true)]
        public string TemplateContent { get; set; }

    }

}
