// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryQmpRobotcallStatisticinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 客户透传字段
        [NameInMap("out_info")]
        [Validation(Required=true)]
        public string OutInfo { get; set; }

        // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
        [NameInMap("industry_tag")]
        [Validation(Required=false)]
        public string IndustryTag { get; set; }

    }

}
