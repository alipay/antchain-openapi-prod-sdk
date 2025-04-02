// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 触达策略信息
    public class ActionPlanDetailInfo : TeaModel {
        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 场景策略名称
        [NameInMap("scene_strategy_name")]
        [Validation(Required=true)]
        public string SceneStrategyName { get; set; }

        // 场景策略状态
        [NameInMap("scene_strategy_status")]
        [Validation(Required=true)]
        public string SceneStrategyStatus { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 触达媒介参数信息
        [NameInMap("action_param_info")]
        [Validation(Required=true)]
        public List<ActionParamInfo> ActionParamInfo { get; set; }

    }

}
