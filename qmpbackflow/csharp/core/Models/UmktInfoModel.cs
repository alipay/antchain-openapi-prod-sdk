// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户的混合策略圈客结果
    public class UmktInfoModel : TeaModel {
        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 实时营销结果
        [NameInMap("umkt_result")]
        [Validation(Required=true)]
        public long? UmktResult { get; set; }

        // json 结构的营销额外输出信息
        [NameInMap("umkt_out_put_info")]
        [Validation(Required=true)]
        public string UmktOutPutInfo { get; set; }

    }

}
